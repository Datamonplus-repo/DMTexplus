package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thislre_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod, A719PrdNum) ;
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
            A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            A4550HreLinPro = (byte)(GXutil.lval( httpContext.GetPar( "HreLinPro"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4550HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4550HreLinPro), 2, 0));
            AV16TotKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotKgs"), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TotKgs", GXutil.ltrimstr( AV16TotKgs, 10, 2));
            AV17Volumen = (short)(GXutil.lval( httpContext.GetPar( "Volumen"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Volumen), 4, 0));
            AV18Modif = httpContext.GetPar( "Modif") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Modif", AV18Modif);
            AV37FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37FecPan", localUtil.format(AV37FecPan, "99/99/99"));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO RECETAS (LINEAS)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtHreRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public thislre_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thislre_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thislre_impl.class ));
   }

   public thislre_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISLRE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Linea Maquina. Hist.Receta", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinMaq_Jsonclick, 0, "", "", "", "", "", 1, edtHreLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Linea proceso Receta. Hist.Rec", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4550HreLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4550HreLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinPro_Jsonclick, 0, "", "", "", "", "", 1, edtHreLinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Linea Receta Hist.Receta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4557HreRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreRecLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4557HreRecLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4557HreRecLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreRecLin_Jsonclick, 0, "", "", "", "", "", 1, edtHreRecLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Codigo Producto. Hist.Receta", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdNum_Internalname, GXutil.rtrim( A4558HrePrdNum), GXutil.rtrim( localUtil.format( A4558HrePrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descrip.Producto.Hist.Receta", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdDsc_Internalname, GXutil.rtrim( A4559HrePrdDsc), GXutil.rtrim( localUtil.format( A4559HrePrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Unidad Medida. Hist.receta", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A4560HrePrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrePrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4560HrePrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A4560HrePrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdUMe_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdUMe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Unid.Medida Desc.HistReceta", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdUDs_Internalname, GXutil.rtrim( A4561HrePrdUDs), GXutil.rtrim( localUtil.format( A4561HrePrdUDs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdUDs_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdUDs_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Factor Conversion. Hist.Receta", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A4562HreFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreFacCon_Enabled!=0) ? localUtil.format( A4562HreFacCon, "ZZZZ9.99999") : localUtil.format( A4562HreFacCon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFacCon_Jsonclick, 0, "", "", "", "", "", 1, edtHreFacCon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Cantidad. Hist.Receeta", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrePrdCant_Enabled!=0) ? localUtil.format( A4563HrePrdCant, "ZZZZZZ9.999") : localUtil.format( A4563HrePrdCant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdCant_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdCant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cant.Final (Añad.) Hist.Receta", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCanFin_Internalname, GXutil.ltrim( localUtil.ntoc( A4564HreCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCanFin_Enabled!=0) ? localUtil.format( A4564HreCanFin, "ZZZZZZ9.999") : localUtil.format( A4564HreCanFin, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCanFin_Jsonclick, 0, "", "", "", "", "", 1, edtHreCanFin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Añadidas. Hist.receta", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCanAny_Internalname, GXutil.ltrim( localUtil.ntoc( A4565HreCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCanAny_Enabled!=0) ? localUtil.format( A4565HreCanAny, "ZZZZZZ9.999") : localUtil.format( A4565HreCanAny, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCanAny_Jsonclick, 0, "", "", "", "", "", 1, edtHreCanAny_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Num.Introduc. Hist.Receta", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A4566HreForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4566HreForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4566HreForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreForNro_Jsonclick, 0, "", "", "", "", "", 1, edtHreForNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Tanque. Hist.Receta", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A4567HrePrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrePrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4567HrePrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4567HrePrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdTnq_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Fecha Ult.Mov. Hist.Receta", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecMov_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecMov_Internalname, localUtil.format(A4568HreFecMov, "99/99/99"), localUtil.format( A4568HreFecMov, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecMov_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecMov_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecMov_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecMov_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISLRE.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Tiempo Prev.Añadida.Hist.Recet", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAnyTie_Internalname, GXutil.ltrim( localUtil.ntoc( A4569HreAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAnyTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4569HreAnyTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4569HreAnyTie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAnyTie_Jsonclick, 0, "", "", "", "", "", 1, edtHreAnyTie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Ultima Añadida. Hist.Receta", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreUltAny_Internalname, GXutil.ltrim( localUtil.ntoc( A4570HreUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreUltAny_Enabled!=0) ? localUtil.format( A4570HreUltAny, "ZZZZZZ9.999") : localUtil.format( A4570HreUltAny, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreUltAny_Jsonclick, 0, "", "", "", "", "", 1, edtHreUltAny_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Porcentaje Ult.Añad. Hist.Rece", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePorAny_Internalname, GXutil.ltrim( localUtil.ntoc( A4571HrePorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrePorAny_Enabled!=0) ? localUtil.format( A4571HrePorAny, "ZZ9.99") : localUtil.format( A4571HrePorAny, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePorAny_Jsonclick, 0, "", "", "", "", "", 1, edtHrePorAny_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Cantidad Ensayo.Hist.receta", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCanEns_Internalname, GXutil.ltrim( localUtil.ntoc( A4572HreCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCanEns_Enabled!=0) ? localUtil.format( A4572HreCanEns, "ZZZ9.99999") : localUtil.format( A4572HreCanEns, "ZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCanEns_Jsonclick, 0, "", "", "", "", "", 1, edtHreCanEns_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "HreRecMar", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4573HreRecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreRecMar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4573HreRecMar), "9") : localUtil.format( DecimalUtil.doubleToDec(A4573HreRecMar), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreRecMar_Jsonclick, 0, "", "", "", "", "", 1, edtHreRecMar_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Usuario Pesaje", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinUsr_Internalname, GXutil.rtrim( A4582HreLinUsr), GXutil.rtrim( localUtil.format( A4582HreLinUsr, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinUsr_Jsonclick, 0, "", "", "", "", "", 1, edtHreLinUsr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Fecha Hora Pesaje", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHrePesFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePesFec_Internalname, localUtil.ttoc( A4583HrePesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4583HrePesFec, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePesFec_Jsonclick, 0, "", "", "", "", "", 1, edtHrePesFec_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHrePesFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHrePesFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISLRE.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Precio del Producto", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrePrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4967HrePrePrd, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrePrePrd_Enabled!=0) ? localUtil.format( A4967HrePrePrd, "ZZZZZZZ9.999") : localUtil.format( A4967HrePrePrd, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrePrd_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrePrd_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Lote Producto", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLote_Internalname, GXutil.rtrim( A5726HreLote), GXutil.rtrim( localUtil.format( A5726HreLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLote_Jsonclick, 0, "", "", "", "", "", 1, edtHreLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Porcetaje Sal Muera Hist.Rec", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreSalMP_Internalname, GXutil.ltrim( localUtil.ntoc( A5945HreSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreSalMP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5945HreSalMP), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5945HreSalMP), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreSalMP_Jsonclick, 0, "", "", "", "", "", 1, edtHreSalMP_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Volumen descontar Sal Comun", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreSalVol_Internalname, GXutil.ltrim( localUtil.ntoc( A5946HreSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreSalVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5946HreSalVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5946HreSalVol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreSalVol_Jsonclick, 0, "", "", "", "", "", 1, edtHreSalVol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Factor 1", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFacCon1_Internalname, GXutil.ltrim( localUtil.ntoc( A9827HreFacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreFacCon1_Enabled!=0) ? localUtil.format( A9827HreFacCon1, "ZZZZ9.99999") : localUtil.format( A9827HreFacCon1, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFacCon1_Jsonclick, 0, "", "", "", "", "", 1, edtHreFacCon1_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Proveedor", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreProv_Internalname, GXutil.ltrim( localUtil.ntoc( A11707HreProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreProv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11707HreProv), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11707HreProv), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreProv_Jsonclick, 0, "", "", "", "", "", 1, edtHreProv_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Fecha Cierre en lineas tambien", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecAct_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecAct_Internalname, localUtil.format(A12453HreFecAct, "99/99/99"), localUtil.format( A12453HreFecAct, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecAct_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecAct_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecAct_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecAct_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISLRE.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Descripcion mas larga", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdDc2_Internalname, GXutil.rtrim( A12642HrePrdDc2), GXutil.rtrim( localUtil.format( A12642HrePrdDc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdDc2_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdDc2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Fabricante", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFabId_Internalname, GXutil.ltrim( localUtil.ntoc( A12718HreFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreFabId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12718HreFabId), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12718HreFabId), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFabId_Jsonclick, 0, "", "", "", "", "", 1, edtHreFabId_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISLRE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 200,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 202,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISLRE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISLRE.htm");
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
      e11L82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4492HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4493HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4494HreBarPar = httpContext.cgiGet( "Z4494HreBarPar") ;
            Z4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4495HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z4545HreLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4550HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4550HreLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4557HreRecLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z4557HreRecLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4558HrePrdNum = httpContext.cgiGet( "Z4558HrePrdNum") ;
            Z4559HrePrdDsc = httpContext.cgiGet( "Z4559HrePrdDsc") ;
            Z4560HrePrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4560HrePrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4561HrePrdUDs = httpContext.cgiGet( "Z4561HrePrdUDs") ;
            Z4562HreFacCon = localUtil.ctond( httpContext.cgiGet( "Z4562HreFacCon")) ;
            Z4563HrePrdCant = localUtil.ctond( httpContext.cgiGet( "Z4563HrePrdCant")) ;
            Z4564HreCanFin = localUtil.ctond( httpContext.cgiGet( "Z4564HreCanFin")) ;
            Z4565HreCanAny = localUtil.ctond( httpContext.cgiGet( "Z4565HreCanAny")) ;
            Z4566HreForNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4566HreForNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4567HrePrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4567HrePrdTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4568HreFecMov = localUtil.ctod( httpContext.cgiGet( "Z4568HreFecMov"), 0) ;
            Z4569HreAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z4569HreAnyTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4570HreUltAny = localUtil.ctond( httpContext.cgiGet( "Z4570HreUltAny")) ;
            Z4571HrePorAny = localUtil.ctond( httpContext.cgiGet( "Z4571HrePorAny")) ;
            Z4572HreCanEns = localUtil.ctond( httpContext.cgiGet( "Z4572HreCanEns")) ;
            Z4573HreRecMar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4573HreRecMar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4582HreLinUsr = httpContext.cgiGet( "Z4582HreLinUsr") ;
            Z4583HrePesFec = localUtil.ctot( httpContext.cgiGet( "Z4583HrePesFec"), 0) ;
            Z4967HrePrePrd = localUtil.ctond( httpContext.cgiGet( "Z4967HrePrePrd")) ;
            Z5726HreLote = httpContext.cgiGet( "Z5726HreLote") ;
            Z5945HreSalMP = (short)(localUtil.ctol( httpContext.cgiGet( "Z5945HreSalMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5946HreSalVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z5946HreSalVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9827HreFacCon1 = localUtil.ctond( httpContext.cgiGet( "Z9827HreFacCon1")) ;
            Z11707HreProv = (int)(localUtil.ctol( httpContext.cgiGet( "Z11707HreProv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12453HreFecAct = localUtil.ctod( httpContext.cgiGet( "Z12453HreFecAct"), 0) ;
            Z12642HrePrdDc2 = httpContext.cgiGet( "Z12642HrePrdDc2") ;
            Z12718HreFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12718HreFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13943HreLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "Z13943HreLotAlm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13942HreLoteFch = localUtil.ctod( httpContext.cgiGet( "Z13942HreLoteFch"), 0) ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            A13943HreLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "Z13943HreLotAlm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13942HreLoteFch = localUtil.ctod( httpContext.cgiGet( "Z13942HreLoteFch"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13943HreLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "HRELOTALM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13942HreLoteFch = localUtil.ctod( httpContext.cgiGet( "HRELOTEFCH"), 0) ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
            A4550HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4550HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4550HreLinPro), 2, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRERECLIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4557HreRecLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
            }
            else
            {
               A4557HreRecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHreRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
            }
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A4558HrePrdNum = httpContext.cgiGet( edtHrePrdNum_Internalname) ;
            n4558HrePrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4558HrePrdNum", A4558HrePrdNum);
            A4559HrePrdDsc = httpContext.cgiGet( edtHrePrdDsc_Internalname) ;
            n4559HrePrdDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4559HrePrdDsc", A4559HrePrdDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHrePrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHrePrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPRDUME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHrePrdUMe_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4560HrePrdUMe = (byte)(0) ;
               n4560HrePrdUMe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4560HrePrdUMe", GXutil.str( A4560HrePrdUMe, 1, 0));
            }
            else
            {
               A4560HrePrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtHrePrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4560HrePrdUMe = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4560HrePrdUMe", GXutil.str( A4560HrePrdUMe, 1, 0));
            }
            A4561HrePrdUDs = httpContext.cgiGet( edtHrePrdUDs_Internalname) ;
            n4561HrePrdUDs = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4561HrePrdUDs", A4561HrePrdUDs);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreFacCon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFACCON");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFacCon_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4562HreFacCon = DecimalUtil.ZERO ;
               n4562HreFacCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4562HreFacCon", GXutil.ltrimstr( A4562HreFacCon, 11, 5));
            }
            else
            {
               A4562HreFacCon = localUtil.ctond( httpContext.cgiGet( edtHreFacCon_Internalname)) ;
               n4562HreFacCon = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4562HreFacCon", GXutil.ltrimstr( A4562HreFacCon, 11, 5));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHrePrdCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHrePrdCant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPRDCANT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHrePrdCant_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4563HrePrdCant = DecimalUtil.ZERO ;
               n4563HrePrdCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4563HrePrdCant", GXutil.ltrimstr( A4563HrePrdCant, 11, 3));
            }
            else
            {
               A4563HrePrdCant = localUtil.ctond( httpContext.cgiGet( edtHrePrdCant_Internalname)) ;
               n4563HrePrdCant = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4563HrePrdCant", GXutil.ltrimstr( A4563HrePrdCant, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCanFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCanFin_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECANFIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreCanFin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4564HreCanFin = DecimalUtil.ZERO ;
               n4564HreCanFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4564HreCanFin", GXutil.ltrimstr( A4564HreCanFin, 11, 3));
            }
            else
            {
               A4564HreCanFin = localUtil.ctond( httpContext.cgiGet( edtHreCanFin_Internalname)) ;
               n4564HreCanFin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4564HreCanFin", GXutil.ltrimstr( A4564HreCanFin, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCanAny_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCanAny_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECANANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreCanAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4565HreCanAny = DecimalUtil.ZERO ;
               n4565HreCanAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4565HreCanAny", GXutil.ltrimstr( A4565HreCanAny, 11, 3));
            }
            else
            {
               A4565HreCanAny = localUtil.ctond( httpContext.cgiGet( edtHreCanAny_Internalname)) ;
               n4565HreCanAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4565HreCanAny", GXutil.ltrimstr( A4565HreCanAny, 11, 3));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFORNRO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreForNro_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4566HreForNro = (byte)(0) ;
               n4566HreForNro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4566HreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4566HreForNro), 2, 0));
            }
            else
            {
               A4566HreForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4566HreForNro = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4566HreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4566HreForNro), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHrePrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHrePrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPRDTNQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHrePrdTnq_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4567HrePrdTnq = (byte)(0) ;
               n4567HrePrdTnq = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4567HrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4567HrePrdTnq), 2, 0));
            }
            else
            {
               A4567HrePrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtHrePrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4567HrePrdTnq = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4567HrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4567HrePrdTnq), 2, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtHreFecMov_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HREFECMOV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecMov_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4568HreFecMov = GXutil.nullDate() ;
               n4568HreFecMov = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4568HreFecMov", localUtil.format(A4568HreFecMov, "99/99/99"));
            }
            else
            {
               A4568HreFecMov = localUtil.ctod( httpContext.cgiGet( edtHreFecMov_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4568HreFecMov = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4568HreFecMov", localUtil.format(A4568HreFecMov, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREANYTIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreAnyTie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4569HreAnyTie = (short)(0) ;
               n4569HreAnyTie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4569HreAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4569HreAnyTie), 4, 0));
            }
            else
            {
               A4569HreAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAnyTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4569HreAnyTie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4569HreAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4569HreAnyTie), 4, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreUltAny_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreUltAny_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREULTANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreUltAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4570HreUltAny = DecimalUtil.ZERO ;
               n4570HreUltAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4570HreUltAny", GXutil.ltrimstr( A4570HreUltAny, 11, 3));
            }
            else
            {
               A4570HreUltAny = localUtil.ctond( httpContext.cgiGet( edtHreUltAny_Internalname)) ;
               n4570HreUltAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4570HreUltAny", GXutil.ltrimstr( A4570HreUltAny, 11, 3));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHrePorAny_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHrePorAny_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPORANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHrePorAny_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4571HrePorAny = DecimalUtil.ZERO ;
               n4571HrePorAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4571HrePorAny", GXutil.ltrimstr( A4571HrePorAny, 6, 2));
            }
            else
            {
               A4571HrePorAny = localUtil.ctond( httpContext.cgiGet( edtHrePorAny_Internalname)) ;
               n4571HrePorAny = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4571HrePorAny", GXutil.ltrimstr( A4571HrePorAny, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCanEns_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCanEns_Internalname)), DecimalUtil.stringToDec("9999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECANENS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreCanEns_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4572HreCanEns = DecimalUtil.ZERO ;
               n4572HreCanEns = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4572HreCanEns", GXutil.ltrimstr( A4572HreCanEns, 10, 5));
            }
            else
            {
               A4572HreCanEns = localUtil.ctond( httpContext.cgiGet( edtHreCanEns_Internalname)) ;
               n4572HreCanEns = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4572HreCanEns", GXutil.ltrimstr( A4572HreCanEns, 10, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRERECMAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreRecMar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4573HreRecMar = (byte)(0) ;
               n4573HreRecMar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4573HreRecMar", GXutil.str( A4573HreRecMar, 1, 0));
            }
            else
            {
               A4573HreRecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4573HreRecMar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4573HreRecMar", GXutil.str( A4573HreRecMar, 1, 0));
            }
            A4582HreLinUsr = GXutil.upper( httpContext.cgiGet( edtHreLinUsr_Internalname)) ;
            n4582HreLinUsr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4582HreLinUsr", A4582HreLinUsr);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtHrePesFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "HREPESFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHrePesFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
               n4583HrePesFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4583HrePesFec", localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A4583HrePesFec = localUtil.ctot( httpContext.cgiGet( edtHrePesFec_Internalname)) ;
               n4583HrePesFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4583HrePesFec", localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHrePrePrd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHrePrePrd_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPREPRD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHrePrePrd_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4967HrePrePrd = DecimalUtil.ZERO ;
               n4967HrePrePrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4967HrePrePrd", GXutil.ltrimstr( A4967HrePrePrd, 14, 5));
            }
            else
            {
               A4967HrePrePrd = localUtil.ctond( httpContext.cgiGet( edtHrePrePrd_Internalname)) ;
               n4967HrePrePrd = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4967HrePrePrd", GXutil.ltrimstr( A4967HrePrePrd, 14, 5));
            }
            A5726HreLote = httpContext.cgiGet( edtHreLote_Internalname) ;
            n5726HreLote = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5726HreLote", A5726HreLote);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRESALMP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreSalMP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5945HreSalMP = (short)(0) ;
               n5945HreSalMP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5945HreSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5945HreSalMP), 3, 0));
            }
            else
            {
               A5945HreSalMP = (short)(localUtil.ctol( httpContext.cgiGet( edtHreSalMP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5945HreSalMP = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5945HreSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5945HreSalMP), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRESALVOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreSalVol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5946HreSalVol = 0 ;
               n5946HreSalVol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5946HreSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5946HreSalVol), 5, 0));
            }
            else
            {
               A5946HreSalVol = (int)(localUtil.ctol( httpContext.cgiGet( edtHreSalVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n5946HreSalVol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5946HreSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5946HreSalVol), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreFacCon1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreFacCon1_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFACCON1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFacCon1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9827HreFacCon1 = DecimalUtil.ZERO ;
               n9827HreFacCon1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9827HreFacCon1", GXutil.ltrimstr( A9827HreFacCon1, 11, 5));
            }
            else
            {
               A9827HreFacCon1 = localUtil.ctond( httpContext.cgiGet( edtHreFacCon1_Internalname)) ;
               n9827HreFacCon1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9827HreFacCon1", GXutil.ltrimstr( A9827HreFacCon1, 11, 5));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPROV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreProv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11707HreProv = 0 ;
               n11707HreProv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11707HreProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11707HreProv), 6, 0));
            }
            else
            {
               A11707HreProv = (int)(localUtil.ctol( httpContext.cgiGet( edtHreProv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n11707HreProv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A11707HreProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11707HreProv), 6, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtHreFecAct_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HREFECACT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecAct_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12453HreFecAct = GXutil.nullDate() ;
               n12453HreFecAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12453HreFecAct", localUtil.format(A12453HreFecAct, "99/99/99"));
            }
            else
            {
               A12453HreFecAct = localUtil.ctod( httpContext.cgiGet( edtHreFecAct_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n12453HreFecAct = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12453HreFecAct", localUtil.format(A12453HreFecAct, "99/99/99"));
            }
            A12642HrePrdDc2 = httpContext.cgiGet( edtHrePrdDc2_Internalname) ;
            n12642HrePrdDc2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12642HrePrdDc2", A12642HrePrdDc2);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFABID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFabId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12718HreFabId = 0 ;
               n12718HreFabId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12718HreFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12718HreFabId), 6, 0));
            }
            else
            {
               A12718HreFabId = (int)(localUtil.ctol( httpContext.cgiGet( edtHreFabId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12718HreFabId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12718HreFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12718HreFabId), 6, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"THISLRE");
            forbiddenHiddens.add("HreLotAlm", localUtil.format( DecimalUtil.doubleToDec(A13943HreLotAlm), "ZZZ9"));
            forbiddenHiddens.add("HreLoteFch", localUtil.format(A13942HreLoteFch, "99/99/99"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A4557HreRecLin != Z4557HreRecLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("thislre:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
               A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4545HreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4545HreLinMaq), 4, 0));
               A4550HreLinPro = (byte)(GXutil.lval( httpContext.GetPar( "HreLinPro"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4550HreLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4550HreLinPro), 2, 0));
               A4557HreRecLin = (short)(GXutil.lval( httpContext.GetPar( "HreRecLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
                        e11L82 ();
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
            initAllL8680( ) ;
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
      disableAttributesL8680( ) ;
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

   public void confirm_L80( )
   {
      beforeValidateL8680( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsL8680( ) ;
         }
         else
         {
            checkExtendedTableL8680( ) ;
            if ( AnyError == 0 )
            {
               zmL8680( 2) ;
               zmL8680( 3) ;
            }
            closeExtendedTableCursorsL8680( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesL80( ) ;
      }
   }

   public void resetCaptionL80( )
   {
   }

   public void e11L82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit15", AV21Lit15);
      GXt_char1 = AV22Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN502_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit16", AV22Lit16);
      GXt_char1 = AV23Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN466_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit17", AV23Lit17);
      GXt_char1 = AV24Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN371_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit18", AV24Lit18);
      GXt_char1 = AV25Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN188_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit19", AV25Lit19);
      GXt_char1 = AV26Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1148_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit20 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit20", AV26Lit20);
      GXt_char1 = AV27Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1155_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit21 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit21", AV27Lit21);
      GXt_char1 = AV28Lit22 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1163_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit22 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit22", AV28Lit22);
      GXt_char1 = AV31Lit23 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1276_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit23 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit23", AV31Lit23);
      GXt_char1 = AV35Lit24 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT201_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit24 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit24", AV35Lit24);
      GXt_char1 = AV34LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV34LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34LitFe", AV34LitFe);
      GXt_char1 = AV32Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit0", AV32Lit0);
      GXt_char1 = AV19msg4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG248_", ""), (byte)(99), GXv_char2) ;
      thislre_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19msg4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19msg4", AV19msg4);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int4[0] = AV29ValCos ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
      thislre_impl.this.A396EmprCod = GXv_char2[0] ;
      thislre_impl.this.AV29ValCos = GXv_int4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV29ValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ValCos), 8, 0));
      AV20Flag = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      GXv_int5[0] = AV20Flag ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, "038001", GXv_int5) ;
      thislre_impl.this.AV20Flag = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Flag", GXutil.str( AV20Flag, 1, 0));
      AV36Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Station", AV36Station);
      GXv_char3[0] = A396EmprCod ;
      GXv_char2[0] = AV38EmprNom ;
      GXv_char6[0] = AV33UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char3, GXv_char2, GXv_char6) ;
      thislre_impl.this.A396EmprCod = GXv_char3[0] ;
      thislre_impl.this.AV38EmprNom = GXv_char2[0] ;
      thislre_impl.this.AV33UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV38EmprNom", AV38EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV33UsurCod", AV33UsurCod);
      AV39Dosifi = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Dosifi", GXutil.str( AV39Dosifi, 1, 0));
      GXv_int5[0] = AV39Dosifi ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DOSIFI", ""), GXv_int5) ;
      thislre_impl.this.AV39Dosifi = GXv_int5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Dosifi", GXutil.str( AV39Dosifi, 1, 0));
   }

   public void zmL8680( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4558HrePrdNum = T00L83_A4558HrePrdNum[0] ;
            Z4559HrePrdDsc = T00L83_A4559HrePrdDsc[0] ;
            Z4560HrePrdUMe = T00L83_A4560HrePrdUMe[0] ;
            Z4561HrePrdUDs = T00L83_A4561HrePrdUDs[0] ;
            Z4562HreFacCon = T00L83_A4562HreFacCon[0] ;
            Z4563HrePrdCant = T00L83_A4563HrePrdCant[0] ;
            Z4564HreCanFin = T00L83_A4564HreCanFin[0] ;
            Z4565HreCanAny = T00L83_A4565HreCanAny[0] ;
            Z4566HreForNro = T00L83_A4566HreForNro[0] ;
            Z4567HrePrdTnq = T00L83_A4567HrePrdTnq[0] ;
            Z4568HreFecMov = T00L83_A4568HreFecMov[0] ;
            Z4569HreAnyTie = T00L83_A4569HreAnyTie[0] ;
            Z4570HreUltAny = T00L83_A4570HreUltAny[0] ;
            Z4571HrePorAny = T00L83_A4571HrePorAny[0] ;
            Z4572HreCanEns = T00L83_A4572HreCanEns[0] ;
            Z4573HreRecMar = T00L83_A4573HreRecMar[0] ;
            Z4582HreLinUsr = T00L83_A4582HreLinUsr[0] ;
            Z4583HrePesFec = T00L83_A4583HrePesFec[0] ;
            Z4967HrePrePrd = T00L83_A4967HrePrePrd[0] ;
            Z5726HreLote = T00L83_A5726HreLote[0] ;
            Z5945HreSalMP = T00L83_A5945HreSalMP[0] ;
            Z5946HreSalVol = T00L83_A5946HreSalVol[0] ;
            Z9827HreFacCon1 = T00L83_A9827HreFacCon1[0] ;
            Z11707HreProv = T00L83_A11707HreProv[0] ;
            Z12453HreFecAct = T00L83_A12453HreFecAct[0] ;
            Z12642HrePrdDc2 = T00L83_A12642HrePrdDc2[0] ;
            Z12718HreFabId = T00L83_A12718HreFabId[0] ;
            Z13943HreLotAlm = T00L83_A13943HreLotAlm[0] ;
            Z13942HreLoteFch = T00L83_A13942HreLoteFch[0] ;
            Z719PrdNum = T00L83_A719PrdNum[0] ;
         }
         else
         {
            Z4558HrePrdNum = A4558HrePrdNum ;
            Z4559HrePrdDsc = A4559HrePrdDsc ;
            Z4560HrePrdUMe = A4560HrePrdUMe ;
            Z4561HrePrdUDs = A4561HrePrdUDs ;
            Z4562HreFacCon = A4562HreFacCon ;
            Z4563HrePrdCant = A4563HrePrdCant ;
            Z4564HreCanFin = A4564HreCanFin ;
            Z4565HreCanAny = A4565HreCanAny ;
            Z4566HreForNro = A4566HreForNro ;
            Z4567HrePrdTnq = A4567HrePrdTnq ;
            Z4568HreFecMov = A4568HreFecMov ;
            Z4569HreAnyTie = A4569HreAnyTie ;
            Z4570HreUltAny = A4570HreUltAny ;
            Z4571HrePorAny = A4571HrePorAny ;
            Z4572HreCanEns = A4572HreCanEns ;
            Z4573HreRecMar = A4573HreRecMar ;
            Z4582HreLinUsr = A4582HreLinUsr ;
            Z4583HrePesFec = A4583HrePesFec ;
            Z4967HrePrePrd = A4967HrePrePrd ;
            Z5726HreLote = A5726HreLote ;
            Z5945HreSalMP = A5945HreSalMP ;
            Z5946HreSalVol = A5946HreSalVol ;
            Z9827HreFacCon1 = A9827HreFacCon1 ;
            Z11707HreProv = A11707HreProv ;
            Z12453HreFecAct = A12453HreFecAct ;
            Z12642HrePrdDc2 = A12642HrePrdDc2 ;
            Z12718HreFabId = A12718HreFabId ;
            Z13943HreLotAlm = A13943HreLotAlm ;
            Z13942HreLoteFch = A13942HreLoteFch ;
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z4557HreRecLin = A4557HreRecLin ;
         Z4558HrePrdNum = A4558HrePrdNum ;
         Z4559HrePrdDsc = A4559HrePrdDsc ;
         Z4560HrePrdUMe = A4560HrePrdUMe ;
         Z4561HrePrdUDs = A4561HrePrdUDs ;
         Z4562HreFacCon = A4562HreFacCon ;
         Z4563HrePrdCant = A4563HrePrdCant ;
         Z4564HreCanFin = A4564HreCanFin ;
         Z4565HreCanAny = A4565HreCanAny ;
         Z4566HreForNro = A4566HreForNro ;
         Z4567HrePrdTnq = A4567HrePrdTnq ;
         Z4568HreFecMov = A4568HreFecMov ;
         Z4569HreAnyTie = A4569HreAnyTie ;
         Z4570HreUltAny = A4570HreUltAny ;
         Z4571HrePorAny = A4571HrePorAny ;
         Z4572HreCanEns = A4572HreCanEns ;
         Z4573HreRecMar = A4573HreRecMar ;
         Z4582HreLinUsr = A4582HreLinUsr ;
         Z4583HrePesFec = A4583HrePesFec ;
         Z4967HrePrePrd = A4967HrePrePrd ;
         Z5726HreLote = A5726HreLote ;
         Z5945HreSalMP = A5945HreSalMP ;
         Z5946HreSalVol = A5946HreSalVol ;
         Z9827HreFacCon1 = A9827HreFacCon1 ;
         Z11707HreProv = A11707HreProv ;
         Z12453HreFecAct = A12453HreFecAct ;
         Z12642HrePrdDc2 = A12642HrePrdDc2 ;
         Z12718HreFabId = A12718HreFabId ;
         Z13943HreLotAlm = A13943HreLotAlm ;
         Z13942HreLoteFch = A13942HreLoteFch ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z4550HreLinPro = A4550HreLinPro ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00L85 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Level2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRELINPRO");
         AnyError = (short)(1) ;
      }
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

   public void loadL8680( )
   {
      /* Using cursor T00L86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound680 = (short)(1) ;
         A4558HrePrdNum = T00L86_A4558HrePrdNum[0] ;
         n4558HrePrdNum = T00L86_n4558HrePrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4558HrePrdNum", A4558HrePrdNum);
         A4559HrePrdDsc = T00L86_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = T00L86_n4559HrePrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4559HrePrdDsc", A4559HrePrdDsc);
         A4560HrePrdUMe = T00L86_A4560HrePrdUMe[0] ;
         n4560HrePrdUMe = T00L86_n4560HrePrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4560HrePrdUMe", GXutil.str( A4560HrePrdUMe, 1, 0));
         A4561HrePrdUDs = T00L86_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = T00L86_n4561HrePrdUDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4561HrePrdUDs", A4561HrePrdUDs);
         A4562HreFacCon = T00L86_A4562HreFacCon[0] ;
         n4562HreFacCon = T00L86_n4562HreFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4562HreFacCon", GXutil.ltrimstr( A4562HreFacCon, 11, 5));
         A4563HrePrdCant = T00L86_A4563HrePrdCant[0] ;
         n4563HrePrdCant = T00L86_n4563HrePrdCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4563HrePrdCant", GXutil.ltrimstr( A4563HrePrdCant, 11, 3));
         A4564HreCanFin = T00L86_A4564HreCanFin[0] ;
         n4564HreCanFin = T00L86_n4564HreCanFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4564HreCanFin", GXutil.ltrimstr( A4564HreCanFin, 11, 3));
         A4565HreCanAny = T00L86_A4565HreCanAny[0] ;
         n4565HreCanAny = T00L86_n4565HreCanAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4565HreCanAny", GXutil.ltrimstr( A4565HreCanAny, 11, 3));
         A4566HreForNro = T00L86_A4566HreForNro[0] ;
         n4566HreForNro = T00L86_n4566HreForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4566HreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4566HreForNro), 2, 0));
         A4567HrePrdTnq = T00L86_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = T00L86_n4567HrePrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4567HrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4567HrePrdTnq), 2, 0));
         A4568HreFecMov = T00L86_A4568HreFecMov[0] ;
         n4568HreFecMov = T00L86_n4568HreFecMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4568HreFecMov", localUtil.format(A4568HreFecMov, "99/99/99"));
         A4569HreAnyTie = T00L86_A4569HreAnyTie[0] ;
         n4569HreAnyTie = T00L86_n4569HreAnyTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4569HreAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4569HreAnyTie), 4, 0));
         A4570HreUltAny = T00L86_A4570HreUltAny[0] ;
         n4570HreUltAny = T00L86_n4570HreUltAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4570HreUltAny", GXutil.ltrimstr( A4570HreUltAny, 11, 3));
         A4571HrePorAny = T00L86_A4571HrePorAny[0] ;
         n4571HrePorAny = T00L86_n4571HrePorAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4571HrePorAny", GXutil.ltrimstr( A4571HrePorAny, 6, 2));
         A4572HreCanEns = T00L86_A4572HreCanEns[0] ;
         n4572HreCanEns = T00L86_n4572HreCanEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4572HreCanEns", GXutil.ltrimstr( A4572HreCanEns, 10, 5));
         A4573HreRecMar = T00L86_A4573HreRecMar[0] ;
         n4573HreRecMar = T00L86_n4573HreRecMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4573HreRecMar", GXutil.str( A4573HreRecMar, 1, 0));
         A4582HreLinUsr = T00L86_A4582HreLinUsr[0] ;
         n4582HreLinUsr = T00L86_n4582HreLinUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4582HreLinUsr", A4582HreLinUsr);
         A4583HrePesFec = T00L86_A4583HrePesFec[0] ;
         n4583HrePesFec = T00L86_n4583HrePesFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4583HrePesFec", localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4967HrePrePrd = T00L86_A4967HrePrePrd[0] ;
         n4967HrePrePrd = T00L86_n4967HrePrePrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4967HrePrePrd", GXutil.ltrimstr( A4967HrePrePrd, 14, 5));
         A5726HreLote = T00L86_A5726HreLote[0] ;
         n5726HreLote = T00L86_n5726HreLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5726HreLote", A5726HreLote);
         A5945HreSalMP = T00L86_A5945HreSalMP[0] ;
         n5945HreSalMP = T00L86_n5945HreSalMP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5945HreSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5945HreSalMP), 3, 0));
         A5946HreSalVol = T00L86_A5946HreSalVol[0] ;
         n5946HreSalVol = T00L86_n5946HreSalVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5946HreSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5946HreSalVol), 5, 0));
         A9827HreFacCon1 = T00L86_A9827HreFacCon1[0] ;
         n9827HreFacCon1 = T00L86_n9827HreFacCon1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9827HreFacCon1", GXutil.ltrimstr( A9827HreFacCon1, 11, 5));
         A11707HreProv = T00L86_A11707HreProv[0] ;
         n11707HreProv = T00L86_n11707HreProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11707HreProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11707HreProv), 6, 0));
         A12453HreFecAct = T00L86_A12453HreFecAct[0] ;
         n12453HreFecAct = T00L86_n12453HreFecAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12453HreFecAct", localUtil.format(A12453HreFecAct, "99/99/99"));
         A12642HrePrdDc2 = T00L86_A12642HrePrdDc2[0] ;
         n12642HrePrdDc2 = T00L86_n12642HrePrdDc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12642HrePrdDc2", A12642HrePrdDc2);
         A12718HreFabId = T00L86_A12718HreFabId[0] ;
         n12718HreFabId = T00L86_n12718HreFabId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12718HreFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12718HreFabId), 6, 0));
         A13943HreLotAlm = T00L86_A13943HreLotAlm[0] ;
         A13942HreLoteFch = T00L86_A13942HreLoteFch[0] ;
         A719PrdNum = T00L86_A719PrdNum[0] ;
         n719PrdNum = T00L86_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         zmL8680( -1) ;
      }
      pr_default.close(4);
      onLoadActionsL8680( ) ;
   }

   public void onLoadActionsL8680( )
   {
   }

   public void checkExtendedTableL8680( )
   {
      nIsDirty_680 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00L84 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsL8680( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T00L87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKeyL8680( )
   {
      /* Using cursor T00L88 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound680 = (short)(1) ;
      }
      else
      {
         RcdFound680 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00L83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00L83_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L83_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00L83_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T00L83_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L83_A4495HreNumCie[0] == A4495HreNumCie ) && ( T00L83_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( T00L83_A4550HreLinPro[0] == A4550HreLinPro ) )
      {
         zmL8680( 1) ;
         RcdFound680 = (short)(1) ;
         A4557HreRecLin = T00L83_A4557HreRecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
         A4558HrePrdNum = T00L83_A4558HrePrdNum[0] ;
         n4558HrePrdNum = T00L83_n4558HrePrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4558HrePrdNum", A4558HrePrdNum);
         A4559HrePrdDsc = T00L83_A4559HrePrdDsc[0] ;
         n4559HrePrdDsc = T00L83_n4559HrePrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4559HrePrdDsc", A4559HrePrdDsc);
         A4560HrePrdUMe = T00L83_A4560HrePrdUMe[0] ;
         n4560HrePrdUMe = T00L83_n4560HrePrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4560HrePrdUMe", GXutil.str( A4560HrePrdUMe, 1, 0));
         A4561HrePrdUDs = T00L83_A4561HrePrdUDs[0] ;
         n4561HrePrdUDs = T00L83_n4561HrePrdUDs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4561HrePrdUDs", A4561HrePrdUDs);
         A4562HreFacCon = T00L83_A4562HreFacCon[0] ;
         n4562HreFacCon = T00L83_n4562HreFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4562HreFacCon", GXutil.ltrimstr( A4562HreFacCon, 11, 5));
         A4563HrePrdCant = T00L83_A4563HrePrdCant[0] ;
         n4563HrePrdCant = T00L83_n4563HrePrdCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4563HrePrdCant", GXutil.ltrimstr( A4563HrePrdCant, 11, 3));
         A4564HreCanFin = T00L83_A4564HreCanFin[0] ;
         n4564HreCanFin = T00L83_n4564HreCanFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4564HreCanFin", GXutil.ltrimstr( A4564HreCanFin, 11, 3));
         A4565HreCanAny = T00L83_A4565HreCanAny[0] ;
         n4565HreCanAny = T00L83_n4565HreCanAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4565HreCanAny", GXutil.ltrimstr( A4565HreCanAny, 11, 3));
         A4566HreForNro = T00L83_A4566HreForNro[0] ;
         n4566HreForNro = T00L83_n4566HreForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4566HreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4566HreForNro), 2, 0));
         A4567HrePrdTnq = T00L83_A4567HrePrdTnq[0] ;
         n4567HrePrdTnq = T00L83_n4567HrePrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4567HrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4567HrePrdTnq), 2, 0));
         A4568HreFecMov = T00L83_A4568HreFecMov[0] ;
         n4568HreFecMov = T00L83_n4568HreFecMov[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4568HreFecMov", localUtil.format(A4568HreFecMov, "99/99/99"));
         A4569HreAnyTie = T00L83_A4569HreAnyTie[0] ;
         n4569HreAnyTie = T00L83_n4569HreAnyTie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4569HreAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4569HreAnyTie), 4, 0));
         A4570HreUltAny = T00L83_A4570HreUltAny[0] ;
         n4570HreUltAny = T00L83_n4570HreUltAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4570HreUltAny", GXutil.ltrimstr( A4570HreUltAny, 11, 3));
         A4571HrePorAny = T00L83_A4571HrePorAny[0] ;
         n4571HrePorAny = T00L83_n4571HrePorAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4571HrePorAny", GXutil.ltrimstr( A4571HrePorAny, 6, 2));
         A4572HreCanEns = T00L83_A4572HreCanEns[0] ;
         n4572HreCanEns = T00L83_n4572HreCanEns[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4572HreCanEns", GXutil.ltrimstr( A4572HreCanEns, 10, 5));
         A4573HreRecMar = T00L83_A4573HreRecMar[0] ;
         n4573HreRecMar = T00L83_n4573HreRecMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4573HreRecMar", GXutil.str( A4573HreRecMar, 1, 0));
         A4582HreLinUsr = T00L83_A4582HreLinUsr[0] ;
         n4582HreLinUsr = T00L83_n4582HreLinUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4582HreLinUsr", A4582HreLinUsr);
         A4583HrePesFec = T00L83_A4583HrePesFec[0] ;
         n4583HrePesFec = T00L83_n4583HrePesFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4583HrePesFec", localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A4967HrePrePrd = T00L83_A4967HrePrePrd[0] ;
         n4967HrePrePrd = T00L83_n4967HrePrePrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4967HrePrePrd", GXutil.ltrimstr( A4967HrePrePrd, 14, 5));
         A5726HreLote = T00L83_A5726HreLote[0] ;
         n5726HreLote = T00L83_n5726HreLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5726HreLote", A5726HreLote);
         A5945HreSalMP = T00L83_A5945HreSalMP[0] ;
         n5945HreSalMP = T00L83_n5945HreSalMP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5945HreSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5945HreSalMP), 3, 0));
         A5946HreSalVol = T00L83_A5946HreSalVol[0] ;
         n5946HreSalVol = T00L83_n5946HreSalVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5946HreSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5946HreSalVol), 5, 0));
         A9827HreFacCon1 = T00L83_A9827HreFacCon1[0] ;
         n9827HreFacCon1 = T00L83_n9827HreFacCon1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9827HreFacCon1", GXutil.ltrimstr( A9827HreFacCon1, 11, 5));
         A11707HreProv = T00L83_A11707HreProv[0] ;
         n11707HreProv = T00L83_n11707HreProv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11707HreProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11707HreProv), 6, 0));
         A12453HreFecAct = T00L83_A12453HreFecAct[0] ;
         n12453HreFecAct = T00L83_n12453HreFecAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12453HreFecAct", localUtil.format(A12453HreFecAct, "99/99/99"));
         A12642HrePrdDc2 = T00L83_A12642HrePrdDc2[0] ;
         n12642HrePrdDc2 = T00L83_n12642HrePrdDc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12642HrePrdDc2", A12642HrePrdDc2);
         A12718HreFabId = T00L83_A12718HreFabId[0] ;
         n12718HreFabId = T00L83_n12718HreFabId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12718HreFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12718HreFabId), 6, 0));
         A13943HreLotAlm = T00L83_A13943HreLotAlm[0] ;
         A13942HreLoteFch = T00L83_A13942HreLoteFch[0] ;
         A719PrdNum = T00L83_A719PrdNum[0] ;
         n719PrdNum = T00L83_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z4550HreLinPro = A4550HreLinPro ;
         Z4557HreRecLin = A4557HreRecLin ;
         sMode680 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadL8680( ) ;
         if ( AnyError == 1 )
         {
            RcdFound680 = (short)(0) ;
            initializeNonKeyL8680( ) ;
         }
         Gx_mode = sMode680 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound680 = (short)(0) ;
         initializeNonKeyL8680( ) ;
         sMode680 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode680 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyL8680( ) ;
      if ( RcdFound680 == 0 )
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
      RcdFound680 = (short)(0) ;
      /* Using cursor T00L89 */
      pr_default.execute(7, new Object[] {Short.valueOf(A4557HreRecLin), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T00L89_A4557HreRecLin[0] < A4557HreRecLin ) ) && ( GXutil.strcmp(T00L89_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L89_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00L89_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T00L89_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L89_A4495HreNumCie[0] == A4495HreNumCie ) && ( T00L89_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( T00L89_A4550HreLinPro[0] == A4550HreLinPro ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T00L89_A4557HreRecLin[0] > A4557HreRecLin ) ) && ( GXutil.strcmp(T00L89_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L89_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00L89_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T00L89_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L89_A4495HreNumCie[0] == A4495HreNumCie ) && ( T00L89_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( T00L89_A4550HreLinPro[0] == A4550HreLinPro ) )
         {
            A4557HreRecLin = T00L89_A4557HreRecLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
            RcdFound680 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound680 = (short)(0) ;
      /* Using cursor T00L810 */
      pr_default.execute(8, new Object[] {Short.valueOf(A4557HreRecLin), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T00L810_A4557HreRecLin[0] > A4557HreRecLin ) ) && ( GXutil.strcmp(T00L810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L810_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00L810_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T00L810_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L810_A4495HreNumCie[0] == A4495HreNumCie ) && ( T00L810_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( T00L810_A4550HreLinPro[0] == A4550HreLinPro ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T00L810_A4557HreRecLin[0] < A4557HreRecLin ) ) && ( GXutil.strcmp(T00L810_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L810_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00L810_A4493HreBarReo[0] == A4493HreBarReo ) && ( GXutil.strcmp(T00L810_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L810_A4495HreNumCie[0] == A4495HreNumCie ) && ( T00L810_A4545HreLinMaq[0] == A4545HreLinMaq ) && ( T00L810_A4550HreLinPro[0] == A4550HreLinPro ) )
         {
            A4557HreRecLin = T00L810_A4557HreRecLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
            RcdFound680 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyL8680( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHreRecLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertL8680( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound680 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) || ( A4550HreLinPro != Z4550HreLinPro ) || ( A4557HreRecLin != Z4557HreRecLin ) )
            {
               A4557HreRecLin = Z4557HreRecLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtHreRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateL8680( ) ;
               GX_FocusControl = edtHreRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) || ( A4550HreLinPro != Z4550HreLinPro ) || ( A4557HreRecLin != Z4557HreRecLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHreRecLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertL8680( ) ;
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
                  GX_FocusControl = edtHreRecLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertL8680( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) || ( A4550HreLinPro != Z4550HreLinPro ) || ( A4557HreRecLin != Z4557HreRecLin ) )
      {
         A4557HreRecLin = Z4557HreRecLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtHreRecLin_Internalname ;
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
      getKeyL8680( ) ;
      if ( RcdFound680 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) || ( A4550HreLinPro != Z4550HreLinPro ) || ( A4557HreRecLin != Z4557HreRecLin ) )
         {
            A4557HreRecLin = Z4557HreRecLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4545HreLinMaq != Z4545HreLinMaq ) || ( A4550HreLinPro != Z4550HreLinPro ) || ( A4557HreRecLin != Z4557HreRecLin ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thislre");
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_L80( ) ;
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
      if ( RcdFound680 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartL8680( ) ;
      if ( RcdFound680 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL8680( ) ;
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
      if ( RcdFound680 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
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
      if ( RcdFound680 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
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
      scanStartL8680( ) ;
      if ( RcdFound680 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound680 != 0 )
         {
            scanNextL8680( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL8680( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyL8680( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISLRE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4558HrePrdNum, T00L82_A4558HrePrdNum[0]) != 0 ) || ( GXutil.strcmp(Z4559HrePrdDsc, T00L82_A4559HrePrdDsc[0]) != 0 ) || ( Z4560HrePrdUMe != T00L82_A4560HrePrdUMe[0] ) || ( GXutil.strcmp(Z4561HrePrdUDs, T00L82_A4561HrePrdUDs[0]) != 0 ) || ( DecimalUtil.compareTo(Z4562HreFacCon, T00L82_A4562HreFacCon[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z4563HrePrdCant, T00L82_A4563HrePrdCant[0]) != 0 ) || ( DecimalUtil.compareTo(Z4564HreCanFin, T00L82_A4564HreCanFin[0]) != 0 ) || ( DecimalUtil.compareTo(Z4565HreCanAny, T00L82_A4565HreCanAny[0]) != 0 ) || ( Z4566HreForNro != T00L82_A4566HreForNro[0] ) || ( Z4567HrePrdTnq != T00L82_A4567HrePrdTnq[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z4568HreFecMov), GXutil.resetTime(T00L82_A4568HreFecMov[0])) ) || ( Z4569HreAnyTie != T00L82_A4569HreAnyTie[0] ) || ( DecimalUtil.compareTo(Z4570HreUltAny, T00L82_A4570HreUltAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z4571HrePorAny, T00L82_A4571HrePorAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z4572HreCanEns, T00L82_A4572HreCanEns[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4573HreRecMar != T00L82_A4573HreRecMar[0] ) || ( GXutil.strcmp(Z4582HreLinUsr, T00L82_A4582HreLinUsr[0]) != 0 ) || !( GXutil.dateCompare(Z4583HrePesFec, T00L82_A4583HrePesFec[0]) ) || ( DecimalUtil.compareTo(Z4967HrePrePrd, T00L82_A4967HrePrePrd[0]) != 0 ) || ( GXutil.strcmp(Z5726HreLote, T00L82_A5726HreLote[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5945HreSalMP != T00L82_A5945HreSalMP[0] ) || ( Z5946HreSalVol != T00L82_A5946HreSalVol[0] ) || ( DecimalUtil.compareTo(Z9827HreFacCon1, T00L82_A9827HreFacCon1[0]) != 0 ) || ( Z11707HreProv != T00L82_A11707HreProv[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z12453HreFecAct), GXutil.resetTime(T00L82_A12453HreFecAct[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12642HrePrdDc2, T00L82_A12642HrePrdDc2[0]) != 0 ) || ( Z12718HreFabId != T00L82_A12718HreFabId[0] ) || ( Z13943HreLotAlm != T00L82_A13943HreLotAlm[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z13942HreLoteFch), GXutil.resetTime(T00L82_A13942HreLoteFch[0])) ) || ( GXutil.strcmp(Z719PrdNum, T00L82_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4558HrePrdNum, T00L82_A4558HrePrdNum[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdNum");
               GXutil.writeLogRaw("Old: ",Z4558HrePrdNum);
               GXutil.writeLogRaw("Current: ",T00L82_A4558HrePrdNum[0]);
            }
            if ( GXutil.strcmp(Z4559HrePrdDsc, T00L82_A4559HrePrdDsc[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdDsc");
               GXutil.writeLogRaw("Old: ",Z4559HrePrdDsc);
               GXutil.writeLogRaw("Current: ",T00L82_A4559HrePrdDsc[0]);
            }
            if ( Z4560HrePrdUMe != T00L82_A4560HrePrdUMe[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdUMe");
               GXutil.writeLogRaw("Old: ",Z4560HrePrdUMe);
               GXutil.writeLogRaw("Current: ",T00L82_A4560HrePrdUMe[0]);
            }
            if ( GXutil.strcmp(Z4561HrePrdUDs, T00L82_A4561HrePrdUDs[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdUDs");
               GXutil.writeLogRaw("Old: ",Z4561HrePrdUDs);
               GXutil.writeLogRaw("Current: ",T00L82_A4561HrePrdUDs[0]);
            }
            if ( DecimalUtil.compareTo(Z4562HreFacCon, T00L82_A4562HreFacCon[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreFacCon");
               GXutil.writeLogRaw("Old: ",Z4562HreFacCon);
               GXutil.writeLogRaw("Current: ",T00L82_A4562HreFacCon[0]);
            }
            if ( DecimalUtil.compareTo(Z4563HrePrdCant, T00L82_A4563HrePrdCant[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdCant");
               GXutil.writeLogRaw("Old: ",Z4563HrePrdCant);
               GXutil.writeLogRaw("Current: ",T00L82_A4563HrePrdCant[0]);
            }
            if ( DecimalUtil.compareTo(Z4564HreCanFin, T00L82_A4564HreCanFin[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreCanFin");
               GXutil.writeLogRaw("Old: ",Z4564HreCanFin);
               GXutil.writeLogRaw("Current: ",T00L82_A4564HreCanFin[0]);
            }
            if ( DecimalUtil.compareTo(Z4565HreCanAny, T00L82_A4565HreCanAny[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreCanAny");
               GXutil.writeLogRaw("Old: ",Z4565HreCanAny);
               GXutil.writeLogRaw("Current: ",T00L82_A4565HreCanAny[0]);
            }
            if ( Z4566HreForNro != T00L82_A4566HreForNro[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreForNro");
               GXutil.writeLogRaw("Old: ",Z4566HreForNro);
               GXutil.writeLogRaw("Current: ",T00L82_A4566HreForNro[0]);
            }
            if ( Z4567HrePrdTnq != T00L82_A4567HrePrdTnq[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdTnq");
               GXutil.writeLogRaw("Old: ",Z4567HrePrdTnq);
               GXutil.writeLogRaw("Current: ",T00L82_A4567HrePrdTnq[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4568HreFecMov), GXutil.resetTime(T00L82_A4568HreFecMov[0])) ) )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreFecMov");
               GXutil.writeLogRaw("Old: ",Z4568HreFecMov);
               GXutil.writeLogRaw("Current: ",T00L82_A4568HreFecMov[0]);
            }
            if ( Z4569HreAnyTie != T00L82_A4569HreAnyTie[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreAnyTie");
               GXutil.writeLogRaw("Old: ",Z4569HreAnyTie);
               GXutil.writeLogRaw("Current: ",T00L82_A4569HreAnyTie[0]);
            }
            if ( DecimalUtil.compareTo(Z4570HreUltAny, T00L82_A4570HreUltAny[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreUltAny");
               GXutil.writeLogRaw("Old: ",Z4570HreUltAny);
               GXutil.writeLogRaw("Current: ",T00L82_A4570HreUltAny[0]);
            }
            if ( DecimalUtil.compareTo(Z4571HrePorAny, T00L82_A4571HrePorAny[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePorAny");
               GXutil.writeLogRaw("Old: ",Z4571HrePorAny);
               GXutil.writeLogRaw("Current: ",T00L82_A4571HrePorAny[0]);
            }
            if ( DecimalUtil.compareTo(Z4572HreCanEns, T00L82_A4572HreCanEns[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreCanEns");
               GXutil.writeLogRaw("Old: ",Z4572HreCanEns);
               GXutil.writeLogRaw("Current: ",T00L82_A4572HreCanEns[0]);
            }
            if ( Z4573HreRecMar != T00L82_A4573HreRecMar[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreRecMar");
               GXutil.writeLogRaw("Old: ",Z4573HreRecMar);
               GXutil.writeLogRaw("Current: ",T00L82_A4573HreRecMar[0]);
            }
            if ( GXutil.strcmp(Z4582HreLinUsr, T00L82_A4582HreLinUsr[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreLinUsr");
               GXutil.writeLogRaw("Old: ",Z4582HreLinUsr);
               GXutil.writeLogRaw("Current: ",T00L82_A4582HreLinUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4583HrePesFec, T00L82_A4583HrePesFec[0]) ) )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePesFec");
               GXutil.writeLogRaw("Old: ",Z4583HrePesFec);
               GXutil.writeLogRaw("Current: ",T00L82_A4583HrePesFec[0]);
            }
            if ( DecimalUtil.compareTo(Z4967HrePrePrd, T00L82_A4967HrePrePrd[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrePrd");
               GXutil.writeLogRaw("Old: ",Z4967HrePrePrd);
               GXutil.writeLogRaw("Current: ",T00L82_A4967HrePrePrd[0]);
            }
            if ( GXutil.strcmp(Z5726HreLote, T00L82_A5726HreLote[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreLote");
               GXutil.writeLogRaw("Old: ",Z5726HreLote);
               GXutil.writeLogRaw("Current: ",T00L82_A5726HreLote[0]);
            }
            if ( Z5945HreSalMP != T00L82_A5945HreSalMP[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreSalMP");
               GXutil.writeLogRaw("Old: ",Z5945HreSalMP);
               GXutil.writeLogRaw("Current: ",T00L82_A5945HreSalMP[0]);
            }
            if ( Z5946HreSalVol != T00L82_A5946HreSalVol[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreSalVol");
               GXutil.writeLogRaw("Old: ",Z5946HreSalVol);
               GXutil.writeLogRaw("Current: ",T00L82_A5946HreSalVol[0]);
            }
            if ( DecimalUtil.compareTo(Z9827HreFacCon1, T00L82_A9827HreFacCon1[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreFacCon1");
               GXutil.writeLogRaw("Old: ",Z9827HreFacCon1);
               GXutil.writeLogRaw("Current: ",T00L82_A9827HreFacCon1[0]);
            }
            if ( Z11707HreProv != T00L82_A11707HreProv[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreProv");
               GXutil.writeLogRaw("Old: ",Z11707HreProv);
               GXutil.writeLogRaw("Current: ",T00L82_A11707HreProv[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z12453HreFecAct), GXutil.resetTime(T00L82_A12453HreFecAct[0])) ) )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreFecAct");
               GXutil.writeLogRaw("Old: ",Z12453HreFecAct);
               GXutil.writeLogRaw("Current: ",T00L82_A12453HreFecAct[0]);
            }
            if ( GXutil.strcmp(Z12642HrePrdDc2, T00L82_A12642HrePrdDc2[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HrePrdDc2");
               GXutil.writeLogRaw("Old: ",Z12642HrePrdDc2);
               GXutil.writeLogRaw("Current: ",T00L82_A12642HrePrdDc2[0]);
            }
            if ( Z12718HreFabId != T00L82_A12718HreFabId[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreFabId");
               GXutil.writeLogRaw("Old: ",Z12718HreFabId);
               GXutil.writeLogRaw("Current: ",T00L82_A12718HreFabId[0]);
            }
            if ( Z13943HreLotAlm != T00L82_A13943HreLotAlm[0] )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreLotAlm");
               GXutil.writeLogRaw("Old: ",Z13943HreLotAlm);
               GXutil.writeLogRaw("Current: ",T00L82_A13943HreLotAlm[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13942HreLoteFch), GXutil.resetTime(T00L82_A13942HreLoteFch[0])) ) )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"HreLoteFch");
               GXutil.writeLogRaw("Old: ",Z13942HreLoteFch);
               GXutil.writeLogRaw("Current: ",T00L82_A13942HreLoteFch[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T00L82_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("thislre:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T00L82_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISLRE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL8680( )
   {
      beforeValidateL8680( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL8680( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL8680( 0) ;
         checkOptimisticConcurrencyL8680( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL8680( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL8680( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L811 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A4557HreRecLin), Boolean.valueOf(n4558HrePrdNum), A4558HrePrdNum, Boolean.valueOf(n4559HrePrdDsc), A4559HrePrdDsc, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(A4560HrePrdUMe), Boolean.valueOf(n4561HrePrdUDs), A4561HrePrdUDs, Boolean.valueOf(n4562HreFacCon), A4562HreFacCon, Boolean.valueOf(n4563HrePrdCant), A4563HrePrdCant, Boolean.valueOf(n4564HreCanFin), A4564HreCanFin, Boolean.valueOf(n4565HreCanAny), A4565HreCanAny, Boolean.valueOf(n4566HreForNro), Byte.valueOf(A4566HreForNro), Boolean.valueOf(n4567HrePrdTnq), Byte.valueOf(A4567HrePrdTnq), Boolean.valueOf(n4568HreFecMov), A4568HreFecMov, Boolean.valueOf(n4569HreAnyTie), Short.valueOf(A4569HreAnyTie), Boolean.valueOf(n4570HreUltAny), A4570HreUltAny, Boolean.valueOf(n4571HrePorAny), A4571HrePorAny, Boolean.valueOf(n4572HreCanEns), A4572HreCanEns, Boolean.valueOf(n4573HreRecMar), Byte.valueOf(A4573HreRecMar), Boolean.valueOf(n4582HreLinUsr), A4582HreLinUsr, Boolean.valueOf(n4583HrePesFec), A4583HrePesFec, Boolean.valueOf(n4967HrePrePrd), A4967HrePrePrd, Boolean.valueOf(n5726HreLote), A5726HreLote, Boolean.valueOf(n5945HreSalMP), Short.valueOf(A5945HreSalMP), Boolean.valueOf(n5946HreSalVol), Integer.valueOf(A5946HreSalVol), Boolean.valueOf(n9827HreFacCon1), A9827HreFacCon1, Boolean.valueOf(n11707HreProv), Integer.valueOf(A11707HreProv), Boolean.valueOf(n12453HreFecAct), A12453HreFecAct, Boolean.valueOf(n12642HrePrdDc2), A12642HrePrdDc2, Boolean.valueOf(n12718HreFabId), Integer.valueOf(A12718HreFabId), Short.valueOf(A13943HreLotAlm), A13942HreLoteFch, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionL80( ) ;
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
            loadL8680( ) ;
         }
         endLevelL8680( ) ;
      }
      closeExtendedTableCursorsL8680( ) ;
   }

   public void updateL8680( )
   {
      beforeValidateL8680( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL8680( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL8680( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL8680( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateL8680( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L812 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4558HrePrdNum), A4558HrePrdNum, Boolean.valueOf(n4559HrePrdDsc), A4559HrePrdDsc, Boolean.valueOf(n4560HrePrdUMe), Byte.valueOf(A4560HrePrdUMe), Boolean.valueOf(n4561HrePrdUDs), A4561HrePrdUDs, Boolean.valueOf(n4562HreFacCon), A4562HreFacCon, Boolean.valueOf(n4563HrePrdCant), A4563HrePrdCant, Boolean.valueOf(n4564HreCanFin), A4564HreCanFin, Boolean.valueOf(n4565HreCanAny), A4565HreCanAny, Boolean.valueOf(n4566HreForNro), Byte.valueOf(A4566HreForNro), Boolean.valueOf(n4567HrePrdTnq), Byte.valueOf(A4567HrePrdTnq), Boolean.valueOf(n4568HreFecMov), A4568HreFecMov, Boolean.valueOf(n4569HreAnyTie), Short.valueOf(A4569HreAnyTie), Boolean.valueOf(n4570HreUltAny), A4570HreUltAny, Boolean.valueOf(n4571HrePorAny), A4571HrePorAny, Boolean.valueOf(n4572HreCanEns), A4572HreCanEns, Boolean.valueOf(n4573HreRecMar), Byte.valueOf(A4573HreRecMar), Boolean.valueOf(n4582HreLinUsr), A4582HreLinUsr, Boolean.valueOf(n4583HrePesFec), A4583HrePesFec, Boolean.valueOf(n4967HrePrePrd), A4967HrePrePrd, Boolean.valueOf(n5726HreLote), A5726HreLote, Boolean.valueOf(n5945HreSalMP), Short.valueOf(A5945HreSalMP), Boolean.valueOf(n5946HreSalVol), Integer.valueOf(A5946HreSalVol), Boolean.valueOf(n9827HreFacCon1), A9827HreFacCon1, Boolean.valueOf(n11707HreProv), Integer.valueOf(A11707HreProv), Boolean.valueOf(n12453HreFecAct), A12453HreFecAct, Boolean.valueOf(n12642HrePrdDc2), A12642HrePrdDc2, Boolean.valueOf(n12718HreFabId), Integer.valueOf(A12718HreFabId), Short.valueOf(A13943HreLotAlm), A13942HreLoteFch, Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISLRE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateL8680( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionL80( ) ;
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
         endLevelL8680( ) ;
      }
      closeExtendedTableCursorsL8680( ) ;
   }

   public void deferredUpdateL8680( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL8680( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL8680( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL8680( ) ;
         afterConfirmL8680( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL8680( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00L813 */
               pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), Short.valueOf(A4557HreRecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISLRE");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound680 == 0 )
                     {
                        initAllL8680( ) ;
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
                     resetCaptionL80( ) ;
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
      sMode680 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelL8680( ) ;
      Gx_mode = sMode680 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL8680( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelL8680( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteL8680( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thislre");
         if ( AnyError == 0 )
         {
            confirmValuesL80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thislre");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartL8680( )
   {
      /* Scan By routine */
      /* Using cursor T00L814 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      RcdFound680 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound680 = (short)(1) ;
         A4557HreRecLin = T00L814_A4557HreRecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL8680( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound680 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound680 = (short)(1) ;
         A4557HreRecLin = T00L814_A4557HreRecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
      }
   }

   public void scanEndL8680( )
   {
      pr_default.close(12);
   }

   public void afterConfirmL8680( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL8680( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL8680( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL8680( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL8680( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL8680( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL8680( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtHreBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarCod_Enabled), 5, 0), true);
      edtHreBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarReo_Enabled), 5, 0), true);
      edtHreBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPar_Enabled), 5, 0), true);
      edtHreNumCie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumCie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Enabled), 5, 0), true);
      edtHreLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), true);
      edtHreLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), true);
      edtHreRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreRecLin_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtHrePrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdNum_Enabled), 5, 0), true);
      edtHrePrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdDsc_Enabled), 5, 0), true);
      edtHrePrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdUMe_Enabled), 5, 0), true);
      edtHrePrdUDs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdUDs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdUDs_Enabled), 5, 0), true);
      edtHreFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacCon_Enabled), 5, 0), true);
      edtHrePrdCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdCant_Enabled), 5, 0), true);
      edtHreCanFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCanFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCanFin_Enabled), 5, 0), true);
      edtHreCanAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCanAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCanAny_Enabled), 5, 0), true);
      edtHreForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreForNro_Enabled), 5, 0), true);
      edtHrePrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdTnq_Enabled), 5, 0), true);
      edtHreFecMov_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecMov_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecMov_Enabled), 5, 0), true);
      edtHreAnyTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAnyTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAnyTie_Enabled), 5, 0), true);
      edtHreUltAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUltAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUltAny_Enabled), 5, 0), true);
      edtHrePorAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePorAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePorAny_Enabled), 5, 0), true);
      edtHreCanEns_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCanEns_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCanEns_Enabled), 5, 0), true);
      edtHreRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreRecMar_Enabled), 5, 0), true);
      edtHreLinUsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinUsr_Enabled), 5, 0), true);
      edtHrePesFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePesFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePesFec_Enabled), 5, 0), true);
      edtHrePrePrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrePrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrePrd_Enabled), 5, 0), true);
      edtHreLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLote_Enabled), 5, 0), true);
      edtHreSalMP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreSalMP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreSalMP_Enabled), 5, 0), true);
      edtHreSalVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreSalVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreSalVol_Enabled), 5, 0), true);
      edtHreFacCon1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFacCon1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacCon1_Enabled), 5, 0), true);
      edtHreProv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProv_Enabled), 5, 0), true);
      edtHreFecAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecAct_Enabled), 5, 0), true);
      edtHrePrdDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdDc2_Enabled), 5, 0), true);
      edtHreFabId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFabId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFabId_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesL8680( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesL80( )
   {
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thislre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4545HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4550HreLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV16TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV17Volumen,4,0)),GXutil.URLEncode(GXutil.rtrim(AV18Modif)),GXutil.URLEncode(GXutil.formatDateParm(AV37FecPan))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro","TotKgs","Volumen","Modif","FecPan"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THISLRE");
      forbiddenHiddens.add("HreLotAlm", localUtil.format( DecimalUtil.doubleToDec(A13943HreLotAlm), "ZZZ9"));
      forbiddenHiddens.add("HreLoteFch", localUtil.format(A13942HreLoteFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thislre:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4550HreLinPro", GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4557HreRecLin", GXutil.ltrim( localUtil.ntoc( Z4557HreRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4558HrePrdNum", GXutil.rtrim( Z4558HrePrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4559HrePrdDsc", GXutil.rtrim( Z4559HrePrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4560HrePrdUMe", GXutil.ltrim( localUtil.ntoc( Z4560HrePrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4561HrePrdUDs", GXutil.rtrim( Z4561HrePrdUDs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4562HreFacCon", GXutil.ltrim( localUtil.ntoc( Z4562HreFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4563HrePrdCant", GXutil.ltrim( localUtil.ntoc( Z4563HrePrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4564HreCanFin", GXutil.ltrim( localUtil.ntoc( Z4564HreCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4565HreCanAny", GXutil.ltrim( localUtil.ntoc( Z4565HreCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4566HreForNro", GXutil.ltrim( localUtil.ntoc( Z4566HreForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4567HrePrdTnq", GXutil.ltrim( localUtil.ntoc( Z4567HrePrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4568HreFecMov", localUtil.dtoc( Z4568HreFecMov, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4569HreAnyTie", GXutil.ltrim( localUtil.ntoc( Z4569HreAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4570HreUltAny", GXutil.ltrim( localUtil.ntoc( Z4570HreUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4571HrePorAny", GXutil.ltrim( localUtil.ntoc( Z4571HrePorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4572HreCanEns", GXutil.ltrim( localUtil.ntoc( Z4572HreCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4573HreRecMar", GXutil.ltrim( localUtil.ntoc( Z4573HreRecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4582HreLinUsr", GXutil.rtrim( Z4582HreLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4583HrePesFec", localUtil.ttoc( Z4583HrePesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4967HrePrePrd", GXutil.ltrim( localUtil.ntoc( Z4967HrePrePrd, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5726HreLote", GXutil.rtrim( Z5726HreLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5945HreSalMP", GXutil.ltrim( localUtil.ntoc( Z5945HreSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5946HreSalVol", GXutil.ltrim( localUtil.ntoc( Z5946HreSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9827HreFacCon1", GXutil.ltrim( localUtil.ntoc( Z9827HreFacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11707HreProv", GXutil.ltrim( localUtil.ntoc( Z11707HreProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12453HreFecAct", localUtil.dtoc( Z12453HreFecAct, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12642HrePrdDc2", GXutil.rtrim( Z12642HrePrdDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12718HreFabId", GXutil.ltrim( localUtil.ntoc( Z12718HreFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13943HreLotAlm", GXutil.ltrim( localUtil.ntoc( Z13943HreLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13942HreLoteFch", localUtil.dtoc( Z13942HreLoteFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKGS", GXutil.ltrim( localUtil.ntoc( AV16TotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMEN", GXutil.ltrim( localUtil.ntoc( AV17Volumen, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODIF", GXutil.rtrim( AV18Modif));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV37FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELOTALM", GXutil.ltrim( localUtil.ntoc( A13943HreLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELOTEFCH", localUtil.dtoc( A13942HreLoteFch, 0, "/"));
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
      return formatLink("app.thislre", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.ltrimstr(A4545HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4550HreLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV16TotKgs)),GXutil.URLEncode(GXutil.ltrimstr(AV17Volumen,4,0)),GXutil.URLEncode(GXutil.rtrim(AV18Modif)),GXutil.URLEncode(GXutil.formatDateParm(AV37FecPan))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","HreLinMaq","HreLinPro","TotKgs","Volumen","Modif","FecPan"})  ;
   }

   public String getPgmname( )
   {
      return "THISLRE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO RECETAS (LINEAS)", "") ;
   }

   public void initializeNonKeyL8680( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A4558HrePrdNum = "" ;
      n4558HrePrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4558HrePrdNum", A4558HrePrdNum);
      A4559HrePrdDsc = "" ;
      n4559HrePrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4559HrePrdDsc", A4559HrePrdDsc);
      A4560HrePrdUMe = (byte)(0) ;
      n4560HrePrdUMe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4560HrePrdUMe", GXutil.str( A4560HrePrdUMe, 1, 0));
      A4561HrePrdUDs = "" ;
      n4561HrePrdUDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4561HrePrdUDs", A4561HrePrdUDs);
      A4562HreFacCon = DecimalUtil.ZERO ;
      n4562HreFacCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4562HreFacCon", GXutil.ltrimstr( A4562HreFacCon, 11, 5));
      A4563HrePrdCant = DecimalUtil.ZERO ;
      n4563HrePrdCant = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4563HrePrdCant", GXutil.ltrimstr( A4563HrePrdCant, 11, 3));
      A4564HreCanFin = DecimalUtil.ZERO ;
      n4564HreCanFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4564HreCanFin", GXutil.ltrimstr( A4564HreCanFin, 11, 3));
      A4565HreCanAny = DecimalUtil.ZERO ;
      n4565HreCanAny = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4565HreCanAny", GXutil.ltrimstr( A4565HreCanAny, 11, 3));
      A4566HreForNro = (byte)(0) ;
      n4566HreForNro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4566HreForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4566HreForNro), 2, 0));
      A4567HrePrdTnq = (byte)(0) ;
      n4567HrePrdTnq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4567HrePrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4567HrePrdTnq), 2, 0));
      A4568HreFecMov = GXutil.nullDate() ;
      n4568HreFecMov = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4568HreFecMov", localUtil.format(A4568HreFecMov, "99/99/99"));
      A4569HreAnyTie = (short)(0) ;
      n4569HreAnyTie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4569HreAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4569HreAnyTie), 4, 0));
      A4570HreUltAny = DecimalUtil.ZERO ;
      n4570HreUltAny = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4570HreUltAny", GXutil.ltrimstr( A4570HreUltAny, 11, 3));
      A4571HrePorAny = DecimalUtil.ZERO ;
      n4571HrePorAny = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4571HrePorAny", GXutil.ltrimstr( A4571HrePorAny, 6, 2));
      A4572HreCanEns = DecimalUtil.ZERO ;
      n4572HreCanEns = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4572HreCanEns", GXutil.ltrimstr( A4572HreCanEns, 10, 5));
      A4573HreRecMar = (byte)(0) ;
      n4573HreRecMar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4573HreRecMar", GXutil.str( A4573HreRecMar, 1, 0));
      A4582HreLinUsr = "" ;
      n4582HreLinUsr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4582HreLinUsr", A4582HreLinUsr);
      A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      n4583HrePesFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4583HrePesFec", localUtil.ttoc( A4583HrePesFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A4967HrePrePrd = DecimalUtil.ZERO ;
      n4967HrePrePrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4967HrePrePrd", GXutil.ltrimstr( A4967HrePrePrd, 14, 5));
      A5726HreLote = "" ;
      n5726HreLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5726HreLote", A5726HreLote);
      A5945HreSalMP = (short)(0) ;
      n5945HreSalMP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5945HreSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5945HreSalMP), 3, 0));
      A5946HreSalVol = 0 ;
      n5946HreSalVol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5946HreSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5946HreSalVol), 5, 0));
      A9827HreFacCon1 = DecimalUtil.ZERO ;
      n9827HreFacCon1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9827HreFacCon1", GXutil.ltrimstr( A9827HreFacCon1, 11, 5));
      A11707HreProv = 0 ;
      n11707HreProv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11707HreProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11707HreProv), 6, 0));
      A12453HreFecAct = GXutil.nullDate() ;
      n12453HreFecAct = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12453HreFecAct", localUtil.format(A12453HreFecAct, "99/99/99"));
      A12642HrePrdDc2 = "" ;
      n12642HrePrdDc2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12642HrePrdDc2", A12642HrePrdDc2);
      A12718HreFabId = 0 ;
      n12718HreFabId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12718HreFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12718HreFabId), 6, 0));
      A13943HreLotAlm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13943HreLotAlm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13943HreLotAlm), 4, 0));
      A13942HreLoteFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13942HreLoteFch", localUtil.format(A13942HreLoteFch, "99/99/99"));
      Z4558HrePrdNum = "" ;
      Z4559HrePrdDsc = "" ;
      Z4560HrePrdUMe = (byte)(0) ;
      Z4561HrePrdUDs = "" ;
      Z4562HreFacCon = DecimalUtil.ZERO ;
      Z4563HrePrdCant = DecimalUtil.ZERO ;
      Z4564HreCanFin = DecimalUtil.ZERO ;
      Z4565HreCanAny = DecimalUtil.ZERO ;
      Z4566HreForNro = (byte)(0) ;
      Z4567HrePrdTnq = (byte)(0) ;
      Z4568HreFecMov = GXutil.nullDate() ;
      Z4569HreAnyTie = (short)(0) ;
      Z4570HreUltAny = DecimalUtil.ZERO ;
      Z4571HrePorAny = DecimalUtil.ZERO ;
      Z4572HreCanEns = DecimalUtil.ZERO ;
      Z4573HreRecMar = (byte)(0) ;
      Z4582HreLinUsr = "" ;
      Z4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      Z4967HrePrePrd = DecimalUtil.ZERO ;
      Z5726HreLote = "" ;
      Z5945HreSalMP = (short)(0) ;
      Z5946HreSalVol = 0 ;
      Z9827HreFacCon1 = DecimalUtil.ZERO ;
      Z11707HreProv = 0 ;
      Z12453HreFecAct = GXutil.nullDate() ;
      Z12642HrePrdDc2 = "" ;
      Z12718HreFabId = 0 ;
      Z13943HreLotAlm = (short)(0) ;
      Z13942HreLoteFch = GXutil.nullDate() ;
      Z719PrdNum = "" ;
   }

   public void initAllL8680( )
   {
      A4557HreRecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4557HreRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4557HreRecLin), 4, 0));
      initializeNonKeyL8680( ) ;
   }

   public void standaloneModalInsert( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016254187", true, true);
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
      httpContext.AddJavascriptSource("thislre.js", "?202661016254187", false, true);
      /* End function include_jscripts */
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
      edtHreBarCod_Internalname = "HREBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtHreLinMaq_Internalname = "HRELINMAQ" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHreLinPro_Internalname = "HRELINPRO" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtHreRecLin_Internalname = "HRERECLIN" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHrePrdNum_Internalname = "HREPRDNUM" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtHrePrdDsc_Internalname = "HREPRDDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtHrePrdUMe_Internalname = "HREPRDUME" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtHrePrdUDs_Internalname = "HREPRDUDS" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtHreFacCon_Internalname = "HREFACCON" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtHrePrdCant_Internalname = "HREPRDCANT" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtHreCanFin_Internalname = "HRECANFIN" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtHreCanAny_Internalname = "HRECANANY" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtHreForNro_Internalname = "HREFORNRO" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtHrePrdTnq_Internalname = "HREPRDTNQ" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtHreFecMov_Internalname = "HREFECMOV" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtHreAnyTie_Internalname = "HREANYTIE" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtHreUltAny_Internalname = "HREULTANY" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtHrePorAny_Internalname = "HREPORANY" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtHreCanEns_Internalname = "HRECANENS" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtHreRecMar_Internalname = "HRERECMAR" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtHreLinUsr_Internalname = "HRELINUSR" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtHrePesFec_Internalname = "HREPESFEC" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtHrePrePrd_Internalname = "HREPREPRD" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtHreLote_Internalname = "HRELOTE" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtHreSalMP_Internalname = "HRESALMP" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtHreSalVol_Internalname = "HRESALVOL" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtHreFacCon1_Internalname = "HREFACCON1" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtHreProv_Internalname = "HREPROV" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtHreFecAct_Internalname = "HREFECACT" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtHrePrdDc2_Internalname = "HREPRDDC2" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtHreFabId_Internalname = "HREFABID" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "HISTORICO RECETAS (LINEAS)", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHreFabId_Jsonclick = "" ;
      edtHreFabId_Backcolor = (int)(0xFFFFFF) ;
      edtHreFabId_Enabled = 1 ;
      edtHrePrdDc2_Jsonclick = "" ;
      edtHrePrdDc2_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdDc2_Enabled = 1 ;
      edtHreFecAct_Jsonclick = "" ;
      edtHreFecAct_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecAct_Enabled = 1 ;
      edtHreProv_Jsonclick = "" ;
      edtHreProv_Backcolor = (int)(0xFFFFFF) ;
      edtHreProv_Enabled = 1 ;
      edtHreFacCon1_Jsonclick = "" ;
      edtHreFacCon1_Backcolor = (int)(0xFFFFFF) ;
      edtHreFacCon1_Enabled = 1 ;
      edtHreSalVol_Jsonclick = "" ;
      edtHreSalVol_Backcolor = (int)(0xFFFFFF) ;
      edtHreSalVol_Enabled = 1 ;
      edtHreSalMP_Jsonclick = "" ;
      edtHreSalMP_Backcolor = (int)(0xFFFFFF) ;
      edtHreSalMP_Enabled = 1 ;
      edtHreLote_Jsonclick = "" ;
      edtHreLote_Backcolor = (int)(0xFFFFFF) ;
      edtHreLote_Enabled = 1 ;
      edtHrePrePrd_Jsonclick = "" ;
      edtHrePrePrd_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrePrd_Enabled = 1 ;
      edtHrePesFec_Jsonclick = "" ;
      edtHrePesFec_Backcolor = (int)(0xFFFFFF) ;
      edtHrePesFec_Enabled = 1 ;
      edtHreLinUsr_Jsonclick = "" ;
      edtHreLinUsr_Backcolor = (int)(0xFFFFFF) ;
      edtHreLinUsr_Enabled = 1 ;
      edtHreRecMar_Jsonclick = "" ;
      edtHreRecMar_Backcolor = (int)(0xFFFFFF) ;
      edtHreRecMar_Enabled = 1 ;
      edtHreCanEns_Jsonclick = "" ;
      edtHreCanEns_Backcolor = (int)(0xFFFFFF) ;
      edtHreCanEns_Enabled = 1 ;
      edtHrePorAny_Jsonclick = "" ;
      edtHrePorAny_Backcolor = (int)(0xFFFFFF) ;
      edtHrePorAny_Enabled = 1 ;
      edtHreUltAny_Jsonclick = "" ;
      edtHreUltAny_Backcolor = (int)(0xFFFFFF) ;
      edtHreUltAny_Enabled = 1 ;
      edtHreAnyTie_Jsonclick = "" ;
      edtHreAnyTie_Backcolor = (int)(0xFFFFFF) ;
      edtHreAnyTie_Enabled = 1 ;
      edtHreFecMov_Jsonclick = "" ;
      edtHreFecMov_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecMov_Enabled = 1 ;
      edtHrePrdTnq_Jsonclick = "" ;
      edtHrePrdTnq_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdTnq_Enabled = 1 ;
      edtHreForNro_Jsonclick = "" ;
      edtHreForNro_Backcolor = (int)(0xFFFFFF) ;
      edtHreForNro_Enabled = 1 ;
      edtHreCanAny_Jsonclick = "" ;
      edtHreCanAny_Backcolor = (int)(0xFFFFFF) ;
      edtHreCanAny_Enabled = 1 ;
      edtHreCanFin_Jsonclick = "" ;
      edtHreCanFin_Backcolor = (int)(0xFFFFFF) ;
      edtHreCanFin_Enabled = 1 ;
      edtHrePrdCant_Jsonclick = "" ;
      edtHrePrdCant_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdCant_Enabled = 1 ;
      edtHreFacCon_Jsonclick = "" ;
      edtHreFacCon_Backcolor = (int)(0xFFFFFF) ;
      edtHreFacCon_Enabled = 1 ;
      edtHrePrdUDs_Jsonclick = "" ;
      edtHrePrdUDs_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdUDs_Enabled = 1 ;
      edtHrePrdUMe_Jsonclick = "" ;
      edtHrePrdUMe_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdUMe_Enabled = 1 ;
      edtHrePrdDsc_Jsonclick = "" ;
      edtHrePrdDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdDsc_Enabled = 1 ;
      edtHrePrdNum_Jsonclick = "" ;
      edtHrePrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdNum_Enabled = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHreRecLin_Jsonclick = "" ;
      edtHreRecLin_Backcolor = (int)(0xFFFFFF) ;
      edtHreRecLin_Enabled = 1 ;
      edtHreLinPro_Jsonclick = "" ;
      edtHreLinPro_Backcolor = (int)(0xFFFFFF) ;
      edtHreLinPro_Enabled = 0 ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreLinMaq_Backcolor = (int)(0xFFFFFF) ;
      edtHreLinMaq_Enabled = 0 ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreNumCie_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumCie_Enabled = 0 ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarPar_Enabled = 0 ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarReo_Enabled = 0 ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarCod_Enabled = 0 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00L815 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Level2", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRELINPRO");
         AnyError = (short)(1) ;
      }
      pr_default.close(13);
      GX_FocusControl = edtPrdNum_Internalname ;
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

   public void valid_Hrereclin( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A4558HrePrdNum", GXutil.rtrim( A4558HrePrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A4559HrePrdDsc", GXutil.rtrim( A4559HrePrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4560HrePrdUMe", GXutil.ltrim( localUtil.ntoc( A4560HrePrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4561HrePrdUDs", GXutil.rtrim( A4561HrePrdUDs));
      httpContext.ajax_rsp_assign_attri("", false, "A4562HreFacCon", GXutil.ltrim( localUtil.ntoc( A4562HreFacCon, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4563HrePrdCant", GXutil.ltrim( localUtil.ntoc( A4563HrePrdCant, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4564HreCanFin", GXutil.ltrim( localUtil.ntoc( A4564HreCanFin, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4565HreCanAny", GXutil.ltrim( localUtil.ntoc( A4565HreCanAny, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4566HreForNro", GXutil.ltrim( localUtil.ntoc( A4566HreForNro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4567HrePrdTnq", GXutil.ltrim( localUtil.ntoc( A4567HrePrdTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4568HreFecMov", localUtil.format(A4568HreFecMov, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4569HreAnyTie", GXutil.ltrim( localUtil.ntoc( A4569HreAnyTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4570HreUltAny", GXutil.ltrim( localUtil.ntoc( A4570HreUltAny, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4571HrePorAny", GXutil.ltrim( localUtil.ntoc( A4571HrePorAny, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4572HreCanEns", GXutil.ltrim( localUtil.ntoc( A4572HreCanEns, (byte)(10), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4573HreRecMar", GXutil.ltrim( localUtil.ntoc( A4573HreRecMar, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4582HreLinUsr", GXutil.rtrim( A4582HreLinUsr));
      httpContext.ajax_rsp_assign_attri("", false, "A4583HrePesFec", localUtil.ttoc( A4583HrePesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A4967HrePrePrd", GXutil.ltrim( localUtil.ntoc( A4967HrePrePrd, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5726HreLote", GXutil.rtrim( A5726HreLote));
      httpContext.ajax_rsp_assign_attri("", false, "A5945HreSalMP", GXutil.ltrim( localUtil.ntoc( A5945HreSalMP, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5946HreSalVol", GXutil.ltrim( localUtil.ntoc( A5946HreSalVol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9827HreFacCon1", GXutil.ltrim( localUtil.ntoc( A9827HreFacCon1, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11707HreProv", GXutil.ltrim( localUtil.ntoc( A11707HreProv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12453HreFecAct", localUtil.format(A12453HreFecAct, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A12642HrePrdDc2", GXutil.rtrim( A12642HrePrdDc2));
      httpContext.ajax_rsp_assign_attri("", false, "A12718HreFabId", GXutil.ltrim( localUtil.ntoc( A12718HreFabId, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13943HreLotAlm", GXutil.ltrim( localUtil.ntoc( A13943HreLotAlm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13942HreLoteFch", localUtil.format(A13942HreLoteFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4545HreLinMaq", GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4550HreLinPro", GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4557HreRecLin", GXutil.ltrim( localUtil.ntoc( Z4557HreRecLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4558HrePrdNum", GXutil.rtrim( Z4558HrePrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4559HrePrdDsc", GXutil.rtrim( Z4559HrePrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4560HrePrdUMe", GXutil.ltrim( localUtil.ntoc( Z4560HrePrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4561HrePrdUDs", GXutil.rtrim( Z4561HrePrdUDs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4562HreFacCon", GXutil.ltrim( localUtil.ntoc( Z4562HreFacCon, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4563HrePrdCant", GXutil.ltrim( localUtil.ntoc( Z4563HrePrdCant, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4564HreCanFin", GXutil.ltrim( localUtil.ntoc( Z4564HreCanFin, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4565HreCanAny", GXutil.ltrim( localUtil.ntoc( Z4565HreCanAny, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4566HreForNro", GXutil.ltrim( localUtil.ntoc( Z4566HreForNro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4567HrePrdTnq", GXutil.ltrim( localUtil.ntoc( Z4567HrePrdTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4568HreFecMov", localUtil.format(Z4568HreFecMov, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4569HreAnyTie", GXutil.ltrim( localUtil.ntoc( Z4569HreAnyTie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4570HreUltAny", GXutil.ltrim( localUtil.ntoc( Z4570HreUltAny, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4571HrePorAny", GXutil.ltrim( localUtil.ntoc( Z4571HrePorAny, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4572HreCanEns", GXutil.ltrim( localUtil.ntoc( Z4572HreCanEns, (byte)(10), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4573HreRecMar", GXutil.ltrim( localUtil.ntoc( Z4573HreRecMar, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4582HreLinUsr", GXutil.rtrim( Z4582HreLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4583HrePesFec", localUtil.ttoc( Z4583HrePesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4967HrePrePrd", GXutil.ltrim( localUtil.ntoc( Z4967HrePrePrd, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5726HreLote", GXutil.rtrim( Z5726HreLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5945HreSalMP", GXutil.ltrim( localUtil.ntoc( Z5945HreSalMP, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5946HreSalVol", GXutil.ltrim( localUtil.ntoc( Z5946HreSalVol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9827HreFacCon1", GXutil.ltrim( localUtil.ntoc( Z9827HreFacCon1, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11707HreProv", GXutil.ltrim( localUtil.ntoc( Z11707HreProv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12453HreFecAct", localUtil.format(Z12453HreFecAct, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12642HrePrdDc2", GXutil.rtrim( Z12642HrePrdDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12718HreFabId", GXutil.ltrim( localUtil.ntoc( Z12718HreFabId, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13943HreLotAlm", GXutil.ltrim( localUtil.ntoc( Z13943HreLotAlm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13942HreLoteFch", localUtil.format(Z13942HreLoteFch, "99/99/99"));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T00L816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      pr_default.close(14);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4550HreLinPro',fld:'HRELINPRO',pic:'Z9'},{av:'AV16TotKgs',fld:'vTOTKGS',pic:'ZZZZZZ9.99'},{av:'AV17Volumen',fld:'vVOLUMEN',pic:'ZZZ9'},{av:'AV18Modif',fld:'vMODIF',pic:''},{av:'AV37FecPan',fld:'vFECPAN',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A13943HreLotAlm',fld:'HRELOTALM',pic:'ZZZ9'},{av:'A13942HreLoteFch',fld:'HRELOTEFCH',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HRELINMAQ","{handler:'valid_Hrelinmaq',iparms:[]");
      setEventMetadata("VALID_HRELINMAQ",",oparms:[]}");
      setEventMetadata("VALID_HRELINPRO","{handler:'valid_Hrelinpro',iparms:[]");
      setEventMetadata("VALID_HRELINPRO",",oparms:[]}");
      setEventMetadata("VALID_HRERECLIN","{handler:'valid_Hrereclin',iparms:[{av:'A13942HreLoteFch',fld:'HRELOTEFCH',pic:''},{av:'A13943HreLotAlm',fld:'HRELOTALM',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4550HreLinPro',fld:'HRELINPRO',pic:'Z9'},{av:'A4557HreRecLin',fld:'HRERECLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HRERECLIN",",oparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A4558HrePrdNum',fld:'HREPRDNUM',pic:''},{av:'A4559HrePrdDsc',fld:'HREPRDDSC',pic:''},{av:'A4560HrePrdUMe',fld:'HREPRDUME',pic:'9'},{av:'A4561HrePrdUDs',fld:'HREPRDUDS',pic:''},{av:'A4562HreFacCon',fld:'HREFACCON',pic:'ZZZZ9.99999'},{av:'A4563HrePrdCant',fld:'HREPRDCANT',pic:'ZZZZZZ9.999'},{av:'A4564HreCanFin',fld:'HRECANFIN',pic:'ZZZZZZ9.999'},{av:'A4565HreCanAny',fld:'HRECANANY',pic:'ZZZZZZ9.999'},{av:'A4566HreForNro',fld:'HREFORNRO',pic:'Z9'},{av:'A4567HrePrdTnq',fld:'HREPRDTNQ',pic:'Z9'},{av:'A4568HreFecMov',fld:'HREFECMOV',pic:''},{av:'A4569HreAnyTie',fld:'HREANYTIE',pic:'ZZZ9'},{av:'A4570HreUltAny',fld:'HREULTANY',pic:'ZZZZZZ9.999'},{av:'A4571HrePorAny',fld:'HREPORANY',pic:'ZZ9.99'},{av:'A4572HreCanEns',fld:'HRECANENS',pic:'ZZZ9.99999'},{av:'A4573HreRecMar',fld:'HRERECMAR',pic:'9'},{av:'A4582HreLinUsr',fld:'HRELINUSR',pic:'@!'},{av:'A4583HrePesFec',fld:'HREPESFEC',pic:'99/99/99 99:99:99'},{av:'A4967HrePrePrd',fld:'HREPREPRD',pic:'ZZZZZZZ9.999'},{av:'A5726HreLote',fld:'HRELOTE',pic:''},{av:'A5945HreSalMP',fld:'HRESALMP',pic:'ZZ9'},{av:'A5946HreSalVol',fld:'HRESALVOL',pic:'ZZZZ9'},{av:'A9827HreFacCon1',fld:'HREFACCON1',pic:'ZZZZ9.99999'},{av:'A11707HreProv',fld:'HREPROV',pic:'ZZZZZ9'},{av:'A12453HreFecAct',fld:'HREFECACT',pic:''},{av:'A12642HrePrdDc2',fld:'HREPRDDC2',pic:''},{av:'A12718HreFabId',fld:'HREFABID',pic:'ZZZZZ9'},{av:'A13943HreLotAlm',fld:'HRELOTALM',pic:'ZZZ9'},{av:'A13942HreLoteFch',fld:'HRELOTEFCH',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4545HreLinMaq'},{av:'Z4550HreLinPro'},{av:'Z4557HreRecLin'},{av:'Z719PrdNum'},{av:'Z4558HrePrdNum'},{av:'Z4559HrePrdDsc'},{av:'Z4560HrePrdUMe'},{av:'Z4561HrePrdUDs'},{av:'Z4562HreFacCon'},{av:'Z4563HrePrdCant'},{av:'Z4564HreCanFin'},{av:'Z4565HreCanAny'},{av:'Z4566HreForNro'},{av:'Z4567HrePrdTnq'},{av:'Z4568HreFecMov'},{av:'Z4569HreAnyTie'},{av:'Z4570HreUltAny'},{av:'Z4571HrePorAny'},{av:'Z4572HreCanEns'},{av:'Z4573HreRecMar'},{av:'Z4582HreLinUsr'},{av:'Z4583HrePesFec'},{av:'Z4967HrePrePrd'},{av:'Z5726HreLote'},{av:'Z5945HreSalMP'},{av:'Z5946HreSalVol'},{av:'Z9827HreFacCon1'},{av:'Z11707HreProv'},{av:'Z12453HreFecAct'},{av:'Z12642HrePrdDc2'},{av:'Z12718HreFabId'},{av:'Z13943HreLotAlm'},{av:'Z13942HreLoteFch'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
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
      pr_default.close(14);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA4494HreBarPar = "" ;
      wcpOAV16TotKgs = DecimalUtil.ZERO ;
      wcpOAV18Modif = "" ;
      wcpOAV37FecPan = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z4558HrePrdNum = "" ;
      Z4559HrePrdDsc = "" ;
      Z4561HrePrdUDs = "" ;
      Z4562HreFacCon = DecimalUtil.ZERO ;
      Z4563HrePrdCant = DecimalUtil.ZERO ;
      Z4564HreCanFin = DecimalUtil.ZERO ;
      Z4565HreCanAny = DecimalUtil.ZERO ;
      Z4568HreFecMov = GXutil.nullDate() ;
      Z4570HreUltAny = DecimalUtil.ZERO ;
      Z4571HrePorAny = DecimalUtil.ZERO ;
      Z4572HreCanEns = DecimalUtil.ZERO ;
      Z4582HreLinUsr = "" ;
      Z4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      Z4967HrePrePrd = DecimalUtil.ZERO ;
      Z5726HreLote = "" ;
      Z9827HreFacCon1 = DecimalUtil.ZERO ;
      Z12453HreFecAct = GXutil.nullDate() ;
      Z12642HrePrdDc2 = "" ;
      Z13942HreLoteFch = GXutil.nullDate() ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A4494HreBarPar = "" ;
      AV16TotKgs = DecimalUtil.ZERO ;
      AV18Modif = "" ;
      AV37FecPan = GXutil.nullDate() ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4558HrePrdNum = "" ;
      lblTextblock11_Jsonclick = "" ;
      A4559HrePrdDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A4561HrePrdUDs = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4562HreFacCon = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      lblTextblock16_Jsonclick = "" ;
      A4564HreCanFin = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A4568HreFecMov = GXutil.nullDate() ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A4570HreUltAny = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A4571HrePorAny = DecimalUtil.ZERO ;
      lblTextblock24_Jsonclick = "" ;
      A4572HreCanEns = DecimalUtil.ZERO ;
      lblTextblock25_Jsonclick = "" ;
      lblTextblock26_Jsonclick = "" ;
      A4582HreLinUsr = "" ;
      lblTextblock27_Jsonclick = "" ;
      A4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock28_Jsonclick = "" ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      lblTextblock29_Jsonclick = "" ;
      A5726HreLote = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      A9827HreFacCon1 = DecimalUtil.ZERO ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      lblTextblock35_Jsonclick = "" ;
      A12642HrePrdDc2 = "" ;
      lblTextblock36_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13942HreLoteFch = GXutil.nullDate() ;
      Gx_mode = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV21Lit15 = "" ;
      AV22Lit16 = "" ;
      AV23Lit17 = "" ;
      AV24Lit18 = "" ;
      AV25Lit19 = "" ;
      AV26Lit20 = "" ;
      AV27Lit21 = "" ;
      AV28Lit22 = "" ;
      AV31Lit23 = "" ;
      AV35Lit24 = "" ;
      AV34LitFe = "" ;
      AV32Lit0 = "" ;
      AV19msg4 = "" ;
      GXt_char1 = "" ;
      GXv_int4 = new int[1] ;
      AV36Station = "" ;
      GXv_char3 = new String[1] ;
      AV38EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV33UsurCod = "" ;
      GXv_char6 = new String[1] ;
      GXv_int5 = new byte[1] ;
      T00L85_A396EmprCod = new String[] {""} ;
      T00L86_A4557HreRecLin = new short[1] ;
      T00L86_A4558HrePrdNum = new String[] {""} ;
      T00L86_n4558HrePrdNum = new boolean[] {false} ;
      T00L86_A4559HrePrdDsc = new String[] {""} ;
      T00L86_n4559HrePrdDsc = new boolean[] {false} ;
      T00L86_A4560HrePrdUMe = new byte[1] ;
      T00L86_n4560HrePrdUMe = new boolean[] {false} ;
      T00L86_A4561HrePrdUDs = new String[] {""} ;
      T00L86_n4561HrePrdUDs = new boolean[] {false} ;
      T00L86_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4562HreFacCon = new boolean[] {false} ;
      T00L86_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4563HrePrdCant = new boolean[] {false} ;
      T00L86_A4564HreCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4564HreCanFin = new boolean[] {false} ;
      T00L86_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4565HreCanAny = new boolean[] {false} ;
      T00L86_A4566HreForNro = new byte[1] ;
      T00L86_n4566HreForNro = new boolean[] {false} ;
      T00L86_A4567HrePrdTnq = new byte[1] ;
      T00L86_n4567HrePrdTnq = new boolean[] {false} ;
      T00L86_A4568HreFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T00L86_n4568HreFecMov = new boolean[] {false} ;
      T00L86_A4569HreAnyTie = new short[1] ;
      T00L86_n4569HreAnyTie = new boolean[] {false} ;
      T00L86_A4570HreUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4570HreUltAny = new boolean[] {false} ;
      T00L86_A4571HrePorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4571HrePorAny = new boolean[] {false} ;
      T00L86_A4572HreCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4572HreCanEns = new boolean[] {false} ;
      T00L86_A4573HreRecMar = new byte[1] ;
      T00L86_n4573HreRecMar = new boolean[] {false} ;
      T00L86_A4582HreLinUsr = new String[] {""} ;
      T00L86_n4582HreLinUsr = new boolean[] {false} ;
      T00L86_A4583HrePesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00L86_n4583HrePesFec = new boolean[] {false} ;
      T00L86_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n4967HrePrePrd = new boolean[] {false} ;
      T00L86_A5726HreLote = new String[] {""} ;
      T00L86_n5726HreLote = new boolean[] {false} ;
      T00L86_A5945HreSalMP = new short[1] ;
      T00L86_n5945HreSalMP = new boolean[] {false} ;
      T00L86_A5946HreSalVol = new int[1] ;
      T00L86_n5946HreSalVol = new boolean[] {false} ;
      T00L86_A9827HreFacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L86_n9827HreFacCon1 = new boolean[] {false} ;
      T00L86_A11707HreProv = new int[1] ;
      T00L86_n11707HreProv = new boolean[] {false} ;
      T00L86_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      T00L86_n12453HreFecAct = new boolean[] {false} ;
      T00L86_A12642HrePrdDc2 = new String[] {""} ;
      T00L86_n12642HrePrdDc2 = new boolean[] {false} ;
      T00L86_A12718HreFabId = new int[1] ;
      T00L86_n12718HreFabId = new boolean[] {false} ;
      T00L86_A13943HreLotAlm = new short[1] ;
      T00L86_A13942HreLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00L86_A396EmprCod = new String[] {""} ;
      T00L86_A719PrdNum = new String[] {""} ;
      T00L86_n719PrdNum = new boolean[] {false} ;
      T00L86_A4492HreBarCod = new int[1] ;
      T00L86_A4493HreBarReo = new byte[1] ;
      T00L86_A4494HreBarPar = new String[] {""} ;
      T00L86_A4495HreNumCie = new byte[1] ;
      T00L86_A4545HreLinMaq = new short[1] ;
      T00L86_A4550HreLinPro = new byte[1] ;
      T00L84_A396EmprCod = new String[] {""} ;
      T00L87_A396EmprCod = new String[] {""} ;
      T00L88_A396EmprCod = new String[] {""} ;
      T00L88_A4492HreBarCod = new int[1] ;
      T00L88_A4493HreBarReo = new byte[1] ;
      T00L88_A4494HreBarPar = new String[] {""} ;
      T00L88_A4495HreNumCie = new byte[1] ;
      T00L88_A4545HreLinMaq = new short[1] ;
      T00L88_A4550HreLinPro = new byte[1] ;
      T00L88_A4557HreRecLin = new short[1] ;
      T00L83_A4557HreRecLin = new short[1] ;
      T00L83_A4558HrePrdNum = new String[] {""} ;
      T00L83_n4558HrePrdNum = new boolean[] {false} ;
      T00L83_A4559HrePrdDsc = new String[] {""} ;
      T00L83_n4559HrePrdDsc = new boolean[] {false} ;
      T00L83_A4560HrePrdUMe = new byte[1] ;
      T00L83_n4560HrePrdUMe = new boolean[] {false} ;
      T00L83_A4561HrePrdUDs = new String[] {""} ;
      T00L83_n4561HrePrdUDs = new boolean[] {false} ;
      T00L83_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4562HreFacCon = new boolean[] {false} ;
      T00L83_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4563HrePrdCant = new boolean[] {false} ;
      T00L83_A4564HreCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4564HreCanFin = new boolean[] {false} ;
      T00L83_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4565HreCanAny = new boolean[] {false} ;
      T00L83_A4566HreForNro = new byte[1] ;
      T00L83_n4566HreForNro = new boolean[] {false} ;
      T00L83_A4567HrePrdTnq = new byte[1] ;
      T00L83_n4567HrePrdTnq = new boolean[] {false} ;
      T00L83_A4568HreFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T00L83_n4568HreFecMov = new boolean[] {false} ;
      T00L83_A4569HreAnyTie = new short[1] ;
      T00L83_n4569HreAnyTie = new boolean[] {false} ;
      T00L83_A4570HreUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4570HreUltAny = new boolean[] {false} ;
      T00L83_A4571HrePorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4571HrePorAny = new boolean[] {false} ;
      T00L83_A4572HreCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4572HreCanEns = new boolean[] {false} ;
      T00L83_A4573HreRecMar = new byte[1] ;
      T00L83_n4573HreRecMar = new boolean[] {false} ;
      T00L83_A4582HreLinUsr = new String[] {""} ;
      T00L83_n4582HreLinUsr = new boolean[] {false} ;
      T00L83_A4583HrePesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00L83_n4583HrePesFec = new boolean[] {false} ;
      T00L83_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n4967HrePrePrd = new boolean[] {false} ;
      T00L83_A5726HreLote = new String[] {""} ;
      T00L83_n5726HreLote = new boolean[] {false} ;
      T00L83_A5945HreSalMP = new short[1] ;
      T00L83_n5945HreSalMP = new boolean[] {false} ;
      T00L83_A5946HreSalVol = new int[1] ;
      T00L83_n5946HreSalVol = new boolean[] {false} ;
      T00L83_A9827HreFacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L83_n9827HreFacCon1 = new boolean[] {false} ;
      T00L83_A11707HreProv = new int[1] ;
      T00L83_n11707HreProv = new boolean[] {false} ;
      T00L83_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      T00L83_n12453HreFecAct = new boolean[] {false} ;
      T00L83_A12642HrePrdDc2 = new String[] {""} ;
      T00L83_n12642HrePrdDc2 = new boolean[] {false} ;
      T00L83_A12718HreFabId = new int[1] ;
      T00L83_n12718HreFabId = new boolean[] {false} ;
      T00L83_A13943HreLotAlm = new short[1] ;
      T00L83_A13942HreLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00L83_A396EmprCod = new String[] {""} ;
      T00L83_A719PrdNum = new String[] {""} ;
      T00L83_n719PrdNum = new boolean[] {false} ;
      T00L83_A4492HreBarCod = new int[1] ;
      T00L83_A4493HreBarReo = new byte[1] ;
      T00L83_A4494HreBarPar = new String[] {""} ;
      T00L83_A4495HreNumCie = new byte[1] ;
      T00L83_A4545HreLinMaq = new short[1] ;
      T00L83_A4550HreLinPro = new byte[1] ;
      sMode680 = "" ;
      T00L89_A396EmprCod = new String[] {""} ;
      T00L89_A4492HreBarCod = new int[1] ;
      T00L89_A4493HreBarReo = new byte[1] ;
      T00L89_A4494HreBarPar = new String[] {""} ;
      T00L89_A4495HreNumCie = new byte[1] ;
      T00L89_A4545HreLinMaq = new short[1] ;
      T00L89_A4550HreLinPro = new byte[1] ;
      T00L89_A4557HreRecLin = new short[1] ;
      T00L810_A396EmprCod = new String[] {""} ;
      T00L810_A4492HreBarCod = new int[1] ;
      T00L810_A4493HreBarReo = new byte[1] ;
      T00L810_A4494HreBarPar = new String[] {""} ;
      T00L810_A4495HreNumCie = new byte[1] ;
      T00L810_A4545HreLinMaq = new short[1] ;
      T00L810_A4550HreLinPro = new byte[1] ;
      T00L810_A4557HreRecLin = new short[1] ;
      T00L82_A4557HreRecLin = new short[1] ;
      T00L82_A4558HrePrdNum = new String[] {""} ;
      T00L82_n4558HrePrdNum = new boolean[] {false} ;
      T00L82_A4559HrePrdDsc = new String[] {""} ;
      T00L82_n4559HrePrdDsc = new boolean[] {false} ;
      T00L82_A4560HrePrdUMe = new byte[1] ;
      T00L82_n4560HrePrdUMe = new boolean[] {false} ;
      T00L82_A4561HrePrdUDs = new String[] {""} ;
      T00L82_n4561HrePrdUDs = new boolean[] {false} ;
      T00L82_A4562HreFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4562HreFacCon = new boolean[] {false} ;
      T00L82_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4563HrePrdCant = new boolean[] {false} ;
      T00L82_A4564HreCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4564HreCanFin = new boolean[] {false} ;
      T00L82_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4565HreCanAny = new boolean[] {false} ;
      T00L82_A4566HreForNro = new byte[1] ;
      T00L82_n4566HreForNro = new boolean[] {false} ;
      T00L82_A4567HrePrdTnq = new byte[1] ;
      T00L82_n4567HrePrdTnq = new boolean[] {false} ;
      T00L82_A4568HreFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T00L82_n4568HreFecMov = new boolean[] {false} ;
      T00L82_A4569HreAnyTie = new short[1] ;
      T00L82_n4569HreAnyTie = new boolean[] {false} ;
      T00L82_A4570HreUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4570HreUltAny = new boolean[] {false} ;
      T00L82_A4571HrePorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4571HrePorAny = new boolean[] {false} ;
      T00L82_A4572HreCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4572HreCanEns = new boolean[] {false} ;
      T00L82_A4573HreRecMar = new byte[1] ;
      T00L82_n4573HreRecMar = new boolean[] {false} ;
      T00L82_A4582HreLinUsr = new String[] {""} ;
      T00L82_n4582HreLinUsr = new boolean[] {false} ;
      T00L82_A4583HrePesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00L82_n4583HrePesFec = new boolean[] {false} ;
      T00L82_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n4967HrePrePrd = new boolean[] {false} ;
      T00L82_A5726HreLote = new String[] {""} ;
      T00L82_n5726HreLote = new boolean[] {false} ;
      T00L82_A5945HreSalMP = new short[1] ;
      T00L82_n5945HreSalMP = new boolean[] {false} ;
      T00L82_A5946HreSalVol = new int[1] ;
      T00L82_n5946HreSalVol = new boolean[] {false} ;
      T00L82_A9827HreFacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L82_n9827HreFacCon1 = new boolean[] {false} ;
      T00L82_A11707HreProv = new int[1] ;
      T00L82_n11707HreProv = new boolean[] {false} ;
      T00L82_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      T00L82_n12453HreFecAct = new boolean[] {false} ;
      T00L82_A12642HrePrdDc2 = new String[] {""} ;
      T00L82_n12642HrePrdDc2 = new boolean[] {false} ;
      T00L82_A12718HreFabId = new int[1] ;
      T00L82_n12718HreFabId = new boolean[] {false} ;
      T00L82_A13943HreLotAlm = new short[1] ;
      T00L82_A13942HreLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00L82_A396EmprCod = new String[] {""} ;
      T00L82_A719PrdNum = new String[] {""} ;
      T00L82_n719PrdNum = new boolean[] {false} ;
      T00L82_A4492HreBarCod = new int[1] ;
      T00L82_A4493HreBarReo = new byte[1] ;
      T00L82_A4494HreBarPar = new String[] {""} ;
      T00L82_A4495HreNumCie = new byte[1] ;
      T00L82_A4545HreLinMaq = new short[1] ;
      T00L82_A4550HreLinPro = new byte[1] ;
      T00L814_A396EmprCod = new String[] {""} ;
      T00L814_A4492HreBarCod = new int[1] ;
      T00L814_A4493HreBarReo = new byte[1] ;
      T00L814_A4494HreBarPar = new String[] {""} ;
      T00L814_A4495HreNumCie = new byte[1] ;
      T00L814_A4545HreLinMaq = new short[1] ;
      T00L814_A4550HreLinPro = new byte[1] ;
      T00L814_A4557HreRecLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00L815_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ719PrdNum = "" ;
      ZZ4558HrePrdNum = "" ;
      ZZ4559HrePrdDsc = "" ;
      ZZ4561HrePrdUDs = "" ;
      ZZ4562HreFacCon = DecimalUtil.ZERO ;
      ZZ4563HrePrdCant = DecimalUtil.ZERO ;
      ZZ4564HreCanFin = DecimalUtil.ZERO ;
      ZZ4565HreCanAny = DecimalUtil.ZERO ;
      ZZ4568HreFecMov = GXutil.nullDate() ;
      ZZ4570HreUltAny = DecimalUtil.ZERO ;
      ZZ4571HrePorAny = DecimalUtil.ZERO ;
      ZZ4572HreCanEns = DecimalUtil.ZERO ;
      ZZ4582HreLinUsr = "" ;
      ZZ4583HrePesFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ4967HrePrePrd = DecimalUtil.ZERO ;
      ZZ5726HreLote = "" ;
      ZZ9827HreFacCon1 = DecimalUtil.ZERO ;
      ZZ12453HreFecAct = GXutil.nullDate() ;
      ZZ12642HrePrdDc2 = "" ;
      ZZ13942HreLoteFch = GXutil.nullDate() ;
      T00L816_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thislre__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thislre__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thislre__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thislre__default(),
         new Object[] {
             new Object[] {
            T00L82_A4557HreRecLin, T00L82_A4558HrePrdNum, T00L82_n4558HrePrdNum, T00L82_A4559HrePrdDsc, T00L82_n4559HrePrdDsc, T00L82_A4560HrePrdUMe, T00L82_n4560HrePrdUMe, T00L82_A4561HrePrdUDs, T00L82_n4561HrePrdUDs, T00L82_A4562HreFacCon,
            T00L82_n4562HreFacCon, T00L82_A4563HrePrdCant, T00L82_n4563HrePrdCant, T00L82_A4564HreCanFin, T00L82_n4564HreCanFin, T00L82_A4565HreCanAny, T00L82_n4565HreCanAny, T00L82_A4566HreForNro, T00L82_n4566HreForNro, T00L82_A4567HrePrdTnq,
            T00L82_n4567HrePrdTnq, T00L82_A4568HreFecMov, T00L82_n4568HreFecMov, T00L82_A4569HreAnyTie, T00L82_n4569HreAnyTie, T00L82_A4570HreUltAny, T00L82_n4570HreUltAny, T00L82_A4571HrePorAny, T00L82_n4571HrePorAny, T00L82_A4572HreCanEns,
            T00L82_n4572HreCanEns, T00L82_A4573HreRecMar, T00L82_n4573HreRecMar, T00L82_A4582HreLinUsr, T00L82_n4582HreLinUsr, T00L82_A4583HrePesFec, T00L82_n4583HrePesFec, T00L82_A4967HrePrePrd, T00L82_n4967HrePrePrd, T00L82_A5726HreLote,
            T00L82_n5726HreLote, T00L82_A5945HreSalMP, T00L82_n5945HreSalMP, T00L82_A5946HreSalVol, T00L82_n5946HreSalVol, T00L82_A9827HreFacCon1, T00L82_n9827HreFacCon1, T00L82_A11707HreProv, T00L82_n11707HreProv, T00L82_A12453HreFecAct,
            T00L82_n12453HreFecAct, T00L82_A12642HrePrdDc2, T00L82_n12642HrePrdDc2, T00L82_A12718HreFabId, T00L82_n12718HreFabId, T00L82_A13943HreLotAlm, T00L82_A13942HreLoteFch, T00L82_A396EmprCod, T00L82_A719PrdNum, T00L82_n719PrdNum,
            T00L82_A4492HreBarCod, T00L82_A4493HreBarReo, T00L82_A4494HreBarPar, T00L82_A4495HreNumCie, T00L82_A4545HreLinMaq, T00L82_A4550HreLinPro
            }
            , new Object[] {
            T00L83_A4557HreRecLin, T00L83_A4558HrePrdNum, T00L83_n4558HrePrdNum, T00L83_A4559HrePrdDsc, T00L83_n4559HrePrdDsc, T00L83_A4560HrePrdUMe, T00L83_n4560HrePrdUMe, T00L83_A4561HrePrdUDs, T00L83_n4561HrePrdUDs, T00L83_A4562HreFacCon,
            T00L83_n4562HreFacCon, T00L83_A4563HrePrdCant, T00L83_n4563HrePrdCant, T00L83_A4564HreCanFin, T00L83_n4564HreCanFin, T00L83_A4565HreCanAny, T00L83_n4565HreCanAny, T00L83_A4566HreForNro, T00L83_n4566HreForNro, T00L83_A4567HrePrdTnq,
            T00L83_n4567HrePrdTnq, T00L83_A4568HreFecMov, T00L83_n4568HreFecMov, T00L83_A4569HreAnyTie, T00L83_n4569HreAnyTie, T00L83_A4570HreUltAny, T00L83_n4570HreUltAny, T00L83_A4571HrePorAny, T00L83_n4571HrePorAny, T00L83_A4572HreCanEns,
            T00L83_n4572HreCanEns, T00L83_A4573HreRecMar, T00L83_n4573HreRecMar, T00L83_A4582HreLinUsr, T00L83_n4582HreLinUsr, T00L83_A4583HrePesFec, T00L83_n4583HrePesFec, T00L83_A4967HrePrePrd, T00L83_n4967HrePrePrd, T00L83_A5726HreLote,
            T00L83_n5726HreLote, T00L83_A5945HreSalMP, T00L83_n5945HreSalMP, T00L83_A5946HreSalVol, T00L83_n5946HreSalVol, T00L83_A9827HreFacCon1, T00L83_n9827HreFacCon1, T00L83_A11707HreProv, T00L83_n11707HreProv, T00L83_A12453HreFecAct,
            T00L83_n12453HreFecAct, T00L83_A12642HrePrdDc2, T00L83_n12642HrePrdDc2, T00L83_A12718HreFabId, T00L83_n12718HreFabId, T00L83_A13943HreLotAlm, T00L83_A13942HreLoteFch, T00L83_A396EmprCod, T00L83_A719PrdNum, T00L83_n719PrdNum,
            T00L83_A4492HreBarCod, T00L83_A4493HreBarReo, T00L83_A4494HreBarPar, T00L83_A4495HreNumCie, T00L83_A4545HreLinMaq, T00L83_A4550HreLinPro
            }
            , new Object[] {
            T00L84_A396EmprCod
            }
            , new Object[] {
            T00L85_A396EmprCod
            }
            , new Object[] {
            T00L86_A4557HreRecLin, T00L86_A4558HrePrdNum, T00L86_n4558HrePrdNum, T00L86_A4559HrePrdDsc, T00L86_n4559HrePrdDsc, T00L86_A4560HrePrdUMe, T00L86_n4560HrePrdUMe, T00L86_A4561HrePrdUDs, T00L86_n4561HrePrdUDs, T00L86_A4562HreFacCon,
            T00L86_n4562HreFacCon, T00L86_A4563HrePrdCant, T00L86_n4563HrePrdCant, T00L86_A4564HreCanFin, T00L86_n4564HreCanFin, T00L86_A4565HreCanAny, T00L86_n4565HreCanAny, T00L86_A4566HreForNro, T00L86_n4566HreForNro, T00L86_A4567HrePrdTnq,
            T00L86_n4567HrePrdTnq, T00L86_A4568HreFecMov, T00L86_n4568HreFecMov, T00L86_A4569HreAnyTie, T00L86_n4569HreAnyTie, T00L86_A4570HreUltAny, T00L86_n4570HreUltAny, T00L86_A4571HrePorAny, T00L86_n4571HrePorAny, T00L86_A4572HreCanEns,
            T00L86_n4572HreCanEns, T00L86_A4573HreRecMar, T00L86_n4573HreRecMar, T00L86_A4582HreLinUsr, T00L86_n4582HreLinUsr, T00L86_A4583HrePesFec, T00L86_n4583HrePesFec, T00L86_A4967HrePrePrd, T00L86_n4967HrePrePrd, T00L86_A5726HreLote,
            T00L86_n5726HreLote, T00L86_A5945HreSalMP, T00L86_n5945HreSalMP, T00L86_A5946HreSalVol, T00L86_n5946HreSalVol, T00L86_A9827HreFacCon1, T00L86_n9827HreFacCon1, T00L86_A11707HreProv, T00L86_n11707HreProv, T00L86_A12453HreFecAct,
            T00L86_n12453HreFecAct, T00L86_A12642HrePrdDc2, T00L86_n12642HrePrdDc2, T00L86_A12718HreFabId, T00L86_n12718HreFabId, T00L86_A13943HreLotAlm, T00L86_A13942HreLoteFch, T00L86_A396EmprCod, T00L86_A719PrdNum, T00L86_n719PrdNum,
            T00L86_A4492HreBarCod, T00L86_A4493HreBarReo, T00L86_A4494HreBarPar, T00L86_A4495HreNumCie, T00L86_A4545HreLinMaq, T00L86_A4550HreLinPro
            }
            , new Object[] {
            T00L87_A396EmprCod
            }
            , new Object[] {
            T00L88_A396EmprCod, T00L88_A4492HreBarCod, T00L88_A4493HreBarReo, T00L88_A4494HreBarPar, T00L88_A4495HreNumCie, T00L88_A4545HreLinMaq, T00L88_A4550HreLinPro, T00L88_A4557HreRecLin
            }
            , new Object[] {
            T00L89_A396EmprCod, T00L89_A4492HreBarCod, T00L89_A4493HreBarReo, T00L89_A4494HreBarPar, T00L89_A4495HreNumCie, T00L89_A4545HreLinMaq, T00L89_A4550HreLinPro, T00L89_A4557HreRecLin
            }
            , new Object[] {
            T00L810_A396EmprCod, T00L810_A4492HreBarCod, T00L810_A4493HreBarReo, T00L810_A4494HreBarPar, T00L810_A4495HreNumCie, T00L810_A4545HreLinMaq, T00L810_A4550HreLinPro, T00L810_A4557HreRecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L814_A396EmprCod, T00L814_A4492HreBarCod, T00L814_A4493HreBarReo, T00L814_A4494HreBarPar, T00L814_A4495HreNumCie, T00L814_A4545HreLinMaq, T00L814_A4550HreLinPro, T00L814_A4557HreRecLin
            }
            , new Object[] {
            T00L815_A396EmprCod
            }
            , new Object[] {
            T00L816_A396EmprCod
            }
         }
      );
      Z4550HreLinPro = (byte)(0) ;
      A4550HreLinPro = (byte)(0) ;
      Z4545HreLinMaq = (short)(0) ;
      A4545HreLinMaq = (short)(0) ;
      Z4495HreNumCie = (byte)(0) ;
      A4495HreNumCie = (byte)(0) ;
      Z4494HreBarPar = "" ;
      A4494HreBarPar = "" ;
      Z4493HreBarReo = (byte)(0) ;
      A4493HreBarReo = (byte)(0) ;
      Z4492HreBarCod = 0 ;
      A4492HreBarCod = 0 ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOA4493HreBarReo ;
   private byte wcpOA4495HreNumCie ;
   private byte wcpOA4550HreLinPro ;
   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z4550HreLinPro ;
   private byte Z4560HrePrdUMe ;
   private byte Z4566HreForNro ;
   private byte Z4567HrePrdTnq ;
   private byte Z4573HreRecMar ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private byte nKeyPressed ;
   private byte A4560HrePrdUMe ;
   private byte A4566HreForNro ;
   private byte A4567HrePrdTnq ;
   private byte A4573HreRecMar ;
   private byte AV20Flag ;
   private byte AV39Dosifi ;
   private byte GXv_int5[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private byte ZZ4550HreLinPro ;
   private byte ZZ4560HrePrdUMe ;
   private byte ZZ4566HreForNro ;
   private byte ZZ4567HrePrdTnq ;
   private byte ZZ4573HreRecMar ;
   private short wcpOA4545HreLinMaq ;
   private short wcpOAV17Volumen ;
   private short Z4545HreLinMaq ;
   private short Z4557HreRecLin ;
   private short Z4569HreAnyTie ;
   private short Z5945HreSalMP ;
   private short Z13943HreLotAlm ;
   private short A4545HreLinMaq ;
   private short AV17Volumen ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4557HreRecLin ;
   private short A4569HreAnyTie ;
   private short A5945HreSalMP ;
   private short A13943HreLotAlm ;
   private short RcdFound680 ;
   private short nIsDirty_680 ;
   private short ZZ4545HreLinMaq ;
   private short ZZ4557HreRecLin ;
   private short ZZ4569HreAnyTie ;
   private short ZZ5945HreSalMP ;
   private short ZZ13943HreLotAlm ;
   private int wcpOA4492HreBarCod ;
   private int Z4492HreBarCod ;
   private int Z5946HreSalVol ;
   private int Z11707HreProv ;
   private int Z12718HreFabId ;
   private int A4492HreBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtHreBarCod_Enabled ;
   private int edtHreBarReo_Enabled ;
   private int edtHreBarPar_Enabled ;
   private int edtHreNumCie_Enabled ;
   private int edtHreLinMaq_Enabled ;
   private int edtHreLinPro_Enabled ;
   private int edtHreRecLin_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtHrePrdNum_Enabled ;
   private int edtHrePrdDsc_Enabled ;
   private int edtHrePrdUMe_Enabled ;
   private int edtHrePrdUDs_Enabled ;
   private int edtHreFacCon_Enabled ;
   private int edtHrePrdCant_Enabled ;
   private int edtHreCanFin_Enabled ;
   private int edtHreCanAny_Enabled ;
   private int edtHreForNro_Enabled ;
   private int edtHrePrdTnq_Enabled ;
   private int edtHreFecMov_Enabled ;
   private int edtHreAnyTie_Enabled ;
   private int edtHreUltAny_Enabled ;
   private int edtHrePorAny_Enabled ;
   private int edtHreCanEns_Enabled ;
   private int edtHreRecMar_Enabled ;
   private int edtHreLinUsr_Enabled ;
   private int edtHrePesFec_Enabled ;
   private int edtHrePrePrd_Enabled ;
   private int edtHreLote_Enabled ;
   private int edtHreSalMP_Enabled ;
   private int A5946HreSalVol ;
   private int edtHreSalVol_Enabled ;
   private int edtHreFacCon1_Enabled ;
   private int A11707HreProv ;
   private int edtHreProv_Enabled ;
   private int edtHreFecAct_Enabled ;
   private int edtHrePrdDc2_Enabled ;
   private int A12718HreFabId ;
   private int edtHreFabId_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int AV29ValCos ;
   private int GXv_int4[] ;
   private int GX_JID ;
   private int idxLst ;
   private int edtHreFabId_Backcolor ;
   private int edtHrePrdDc2_Backcolor ;
   private int edtHreFecAct_Backcolor ;
   private int edtHreProv_Backcolor ;
   private int edtHreFacCon1_Backcolor ;
   private int edtHreSalVol_Backcolor ;
   private int edtHreSalMP_Backcolor ;
   private int edtHreLote_Backcolor ;
   private int edtHrePrePrd_Backcolor ;
   private int edtHrePesFec_Backcolor ;
   private int edtHreLinUsr_Backcolor ;
   private int edtHreRecMar_Backcolor ;
   private int edtHreCanEns_Backcolor ;
   private int edtHrePorAny_Backcolor ;
   private int edtHreUltAny_Backcolor ;
   private int edtHreAnyTie_Backcolor ;
   private int edtHreFecMov_Backcolor ;
   private int edtHrePrdTnq_Backcolor ;
   private int edtHreForNro_Backcolor ;
   private int edtHreCanAny_Backcolor ;
   private int edtHreCanFin_Backcolor ;
   private int edtHrePrdCant_Backcolor ;
   private int edtHreFacCon_Backcolor ;
   private int edtHrePrdUDs_Backcolor ;
   private int edtHrePrdUMe_Backcolor ;
   private int edtHrePrdDsc_Backcolor ;
   private int edtHrePrdNum_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtHreRecLin_Backcolor ;
   private int edtHreLinPro_Backcolor ;
   private int edtHreLinMaq_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4492HreBarCod ;
   private int ZZ5946HreSalVol ;
   private int ZZ11707HreProv ;
   private int ZZ12718HreFabId ;
   private java.math.BigDecimal wcpOAV16TotKgs ;
   private java.math.BigDecimal Z4562HreFacCon ;
   private java.math.BigDecimal Z4563HrePrdCant ;
   private java.math.BigDecimal Z4564HreCanFin ;
   private java.math.BigDecimal Z4565HreCanAny ;
   private java.math.BigDecimal Z4570HreUltAny ;
   private java.math.BigDecimal Z4571HrePorAny ;
   private java.math.BigDecimal Z4572HreCanEns ;
   private java.math.BigDecimal Z4967HrePrePrd ;
   private java.math.BigDecimal Z9827HreFacCon1 ;
   private java.math.BigDecimal AV16TotKgs ;
   private java.math.BigDecimal A4562HreFacCon ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4564HreCanFin ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4570HreUltAny ;
   private java.math.BigDecimal A4571HrePorAny ;
   private java.math.BigDecimal A4572HreCanEns ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A9827HreFacCon1 ;
   private java.math.BigDecimal ZZ4562HreFacCon ;
   private java.math.BigDecimal ZZ4563HrePrdCant ;
   private java.math.BigDecimal ZZ4564HreCanFin ;
   private java.math.BigDecimal ZZ4565HreCanAny ;
   private java.math.BigDecimal ZZ4570HreUltAny ;
   private java.math.BigDecimal ZZ4571HrePorAny ;
   private java.math.BigDecimal ZZ4572HreCanEns ;
   private java.math.BigDecimal ZZ4967HrePrePrd ;
   private java.math.BigDecimal ZZ9827HreFacCon1 ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA4494HreBarPar ;
   private String wcpOAV18Modif ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z4558HrePrdNum ;
   private String Z4559HrePrdDsc ;
   private String Z4561HrePrdUDs ;
   private String Z4582HreLinUsr ;
   private String Z5726HreLote ;
   private String Z12642HrePrdDc2 ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A4494HreBarPar ;
   private String AV18Modif ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHreRecLin_Internalname ;
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
   private String edtHreBarCod_Internalname ;
   private String edtHreBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHreBarReo_Internalname ;
   private String edtHreBarReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHreBarPar_Internalname ;
   private String edtHreBarPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreLinMaq_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreLinPro_Internalname ;
   private String edtHreLinPro_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtHreRecLin_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHrePrdNum_Internalname ;
   private String A4558HrePrdNum ;
   private String edtHrePrdNum_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtHrePrdDsc_Internalname ;
   private String A4559HrePrdDsc ;
   private String edtHrePrdDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtHrePrdUMe_Internalname ;
   private String edtHrePrdUMe_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtHrePrdUDs_Internalname ;
   private String A4561HrePrdUDs ;
   private String edtHrePrdUDs_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtHreFacCon_Internalname ;
   private String edtHreFacCon_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtHrePrdCant_Internalname ;
   private String edtHrePrdCant_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtHreCanFin_Internalname ;
   private String edtHreCanFin_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtHreCanAny_Internalname ;
   private String edtHreCanAny_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtHreForNro_Internalname ;
   private String edtHreForNro_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtHrePrdTnq_Internalname ;
   private String edtHrePrdTnq_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtHreFecMov_Internalname ;
   private String edtHreFecMov_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtHreAnyTie_Internalname ;
   private String edtHreAnyTie_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtHreUltAny_Internalname ;
   private String edtHreUltAny_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtHrePorAny_Internalname ;
   private String edtHrePorAny_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtHreCanEns_Internalname ;
   private String edtHreCanEns_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtHreRecMar_Internalname ;
   private String edtHreRecMar_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtHreLinUsr_Internalname ;
   private String A4582HreLinUsr ;
   private String edtHreLinUsr_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtHrePesFec_Internalname ;
   private String edtHrePesFec_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtHrePrePrd_Internalname ;
   private String edtHrePrePrd_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtHreLote_Internalname ;
   private String A5726HreLote ;
   private String edtHreLote_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtHreSalMP_Internalname ;
   private String edtHreSalMP_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtHreSalVol_Internalname ;
   private String edtHreSalVol_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtHreFacCon1_Internalname ;
   private String edtHreFacCon1_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtHreProv_Internalname ;
   private String edtHreProv_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtHreFecAct_Internalname ;
   private String edtHreFecAct_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtHrePrdDc2_Internalname ;
   private String A12642HrePrdDc2 ;
   private String edtHrePrdDc2_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtHreFabId_Internalname ;
   private String edtHreFabId_Jsonclick ;
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
   private String Gx_mode ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV21Lit15 ;
   private String AV22Lit16 ;
   private String AV23Lit17 ;
   private String AV24Lit18 ;
   private String AV25Lit19 ;
   private String AV26Lit20 ;
   private String AV27Lit21 ;
   private String AV28Lit22 ;
   private String AV31Lit23 ;
   private String AV35Lit24 ;
   private String AV34LitFe ;
   private String AV32Lit0 ;
   private String AV19msg4 ;
   private String GXt_char1 ;
   private String AV36Station ;
   private String GXv_char3[] ;
   private String AV38EmprNom ;
   private String GXv_char2[] ;
   private String AV33UsurCod ;
   private String GXv_char6[] ;
   private String sMode680 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ719PrdNum ;
   private String ZZ4558HrePrdNum ;
   private String ZZ4559HrePrdDsc ;
   private String ZZ4561HrePrdUDs ;
   private String ZZ4582HreLinUsr ;
   private String ZZ5726HreLote ;
   private String ZZ12642HrePrdDc2 ;
   private java.util.Date Z4583HrePesFec ;
   private java.util.Date A4583HrePesFec ;
   private java.util.Date ZZ4583HrePesFec ;
   private java.util.Date wcpOAV37FecPan ;
   private java.util.Date Z4568HreFecMov ;
   private java.util.Date Z12453HreFecAct ;
   private java.util.Date Z13942HreLoteFch ;
   private java.util.Date AV37FecPan ;
   private java.util.Date A4568HreFecMov ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date A13942HreLoteFch ;
   private java.util.Date ZZ4568HreFecMov ;
   private java.util.Date ZZ12453HreFecAct ;
   private java.util.Date ZZ13942HreLoteFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean n4558HrePrdNum ;
   private boolean n4559HrePrdDsc ;
   private boolean n4560HrePrdUMe ;
   private boolean n4561HrePrdUDs ;
   private boolean n4562HreFacCon ;
   private boolean n4563HrePrdCant ;
   private boolean n4564HreCanFin ;
   private boolean n4565HreCanAny ;
   private boolean n4566HreForNro ;
   private boolean n4567HrePrdTnq ;
   private boolean n4568HreFecMov ;
   private boolean n4569HreAnyTie ;
   private boolean n4570HreUltAny ;
   private boolean n4571HrePorAny ;
   private boolean n4572HreCanEns ;
   private boolean n4573HreRecMar ;
   private boolean n4582HreLinUsr ;
   private boolean n4583HrePesFec ;
   private boolean n4967HrePrePrd ;
   private boolean n5726HreLote ;
   private boolean n5945HreSalMP ;
   private boolean n5946HreSalVol ;
   private boolean n9827HreFacCon1 ;
   private boolean n11707HreProv ;
   private boolean n12453HreFecAct ;
   private boolean n12642HrePrdDc2 ;
   private boolean n12718HreFabId ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00L85_A396EmprCod ;
   private short[] T00L86_A4557HreRecLin ;
   private String[] T00L86_A4558HrePrdNum ;
   private boolean[] T00L86_n4558HrePrdNum ;
   private String[] T00L86_A4559HrePrdDsc ;
   private boolean[] T00L86_n4559HrePrdDsc ;
   private byte[] T00L86_A4560HrePrdUMe ;
   private boolean[] T00L86_n4560HrePrdUMe ;
   private String[] T00L86_A4561HrePrdUDs ;
   private boolean[] T00L86_n4561HrePrdUDs ;
   private java.math.BigDecimal[] T00L86_A4562HreFacCon ;
   private boolean[] T00L86_n4562HreFacCon ;
   private java.math.BigDecimal[] T00L86_A4563HrePrdCant ;
   private boolean[] T00L86_n4563HrePrdCant ;
   private java.math.BigDecimal[] T00L86_A4564HreCanFin ;
   private boolean[] T00L86_n4564HreCanFin ;
   private java.math.BigDecimal[] T00L86_A4565HreCanAny ;
   private boolean[] T00L86_n4565HreCanAny ;
   private byte[] T00L86_A4566HreForNro ;
   private boolean[] T00L86_n4566HreForNro ;
   private byte[] T00L86_A4567HrePrdTnq ;
   private boolean[] T00L86_n4567HrePrdTnq ;
   private java.util.Date[] T00L86_A4568HreFecMov ;
   private boolean[] T00L86_n4568HreFecMov ;
   private short[] T00L86_A4569HreAnyTie ;
   private boolean[] T00L86_n4569HreAnyTie ;
   private java.math.BigDecimal[] T00L86_A4570HreUltAny ;
   private boolean[] T00L86_n4570HreUltAny ;
   private java.math.BigDecimal[] T00L86_A4571HrePorAny ;
   private boolean[] T00L86_n4571HrePorAny ;
   private java.math.BigDecimal[] T00L86_A4572HreCanEns ;
   private boolean[] T00L86_n4572HreCanEns ;
   private byte[] T00L86_A4573HreRecMar ;
   private boolean[] T00L86_n4573HreRecMar ;
   private String[] T00L86_A4582HreLinUsr ;
   private boolean[] T00L86_n4582HreLinUsr ;
   private java.util.Date[] T00L86_A4583HrePesFec ;
   private boolean[] T00L86_n4583HrePesFec ;
   private java.math.BigDecimal[] T00L86_A4967HrePrePrd ;
   private boolean[] T00L86_n4967HrePrePrd ;
   private String[] T00L86_A5726HreLote ;
   private boolean[] T00L86_n5726HreLote ;
   private short[] T00L86_A5945HreSalMP ;
   private boolean[] T00L86_n5945HreSalMP ;
   private int[] T00L86_A5946HreSalVol ;
   private boolean[] T00L86_n5946HreSalVol ;
   private java.math.BigDecimal[] T00L86_A9827HreFacCon1 ;
   private boolean[] T00L86_n9827HreFacCon1 ;
   private int[] T00L86_A11707HreProv ;
   private boolean[] T00L86_n11707HreProv ;
   private java.util.Date[] T00L86_A12453HreFecAct ;
   private boolean[] T00L86_n12453HreFecAct ;
   private String[] T00L86_A12642HrePrdDc2 ;
   private boolean[] T00L86_n12642HrePrdDc2 ;
   private int[] T00L86_A12718HreFabId ;
   private boolean[] T00L86_n12718HreFabId ;
   private short[] T00L86_A13943HreLotAlm ;
   private java.util.Date[] T00L86_A13942HreLoteFch ;
   private String[] T00L86_A396EmprCod ;
   private String[] T00L86_A719PrdNum ;
   private boolean[] T00L86_n719PrdNum ;
   private int[] T00L86_A4492HreBarCod ;
   private byte[] T00L86_A4493HreBarReo ;
   private String[] T00L86_A4494HreBarPar ;
   private byte[] T00L86_A4495HreNumCie ;
   private short[] T00L86_A4545HreLinMaq ;
   private byte[] T00L86_A4550HreLinPro ;
   private String[] T00L84_A396EmprCod ;
   private String[] T00L87_A396EmprCod ;
   private String[] T00L88_A396EmprCod ;
   private int[] T00L88_A4492HreBarCod ;
   private byte[] T00L88_A4493HreBarReo ;
   private String[] T00L88_A4494HreBarPar ;
   private byte[] T00L88_A4495HreNumCie ;
   private short[] T00L88_A4545HreLinMaq ;
   private byte[] T00L88_A4550HreLinPro ;
   private short[] T00L88_A4557HreRecLin ;
   private short[] T00L83_A4557HreRecLin ;
   private String[] T00L83_A4558HrePrdNum ;
   private boolean[] T00L83_n4558HrePrdNum ;
   private String[] T00L83_A4559HrePrdDsc ;
   private boolean[] T00L83_n4559HrePrdDsc ;
   private byte[] T00L83_A4560HrePrdUMe ;
   private boolean[] T00L83_n4560HrePrdUMe ;
   private String[] T00L83_A4561HrePrdUDs ;
   private boolean[] T00L83_n4561HrePrdUDs ;
   private java.math.BigDecimal[] T00L83_A4562HreFacCon ;
   private boolean[] T00L83_n4562HreFacCon ;
   private java.math.BigDecimal[] T00L83_A4563HrePrdCant ;
   private boolean[] T00L83_n4563HrePrdCant ;
   private java.math.BigDecimal[] T00L83_A4564HreCanFin ;
   private boolean[] T00L83_n4564HreCanFin ;
   private java.math.BigDecimal[] T00L83_A4565HreCanAny ;
   private boolean[] T00L83_n4565HreCanAny ;
   private byte[] T00L83_A4566HreForNro ;
   private boolean[] T00L83_n4566HreForNro ;
   private byte[] T00L83_A4567HrePrdTnq ;
   private boolean[] T00L83_n4567HrePrdTnq ;
   private java.util.Date[] T00L83_A4568HreFecMov ;
   private boolean[] T00L83_n4568HreFecMov ;
   private short[] T00L83_A4569HreAnyTie ;
   private boolean[] T00L83_n4569HreAnyTie ;
   private java.math.BigDecimal[] T00L83_A4570HreUltAny ;
   private boolean[] T00L83_n4570HreUltAny ;
   private java.math.BigDecimal[] T00L83_A4571HrePorAny ;
   private boolean[] T00L83_n4571HrePorAny ;
   private java.math.BigDecimal[] T00L83_A4572HreCanEns ;
   private boolean[] T00L83_n4572HreCanEns ;
   private byte[] T00L83_A4573HreRecMar ;
   private boolean[] T00L83_n4573HreRecMar ;
   private String[] T00L83_A4582HreLinUsr ;
   private boolean[] T00L83_n4582HreLinUsr ;
   private java.util.Date[] T00L83_A4583HrePesFec ;
   private boolean[] T00L83_n4583HrePesFec ;
   private java.math.BigDecimal[] T00L83_A4967HrePrePrd ;
   private boolean[] T00L83_n4967HrePrePrd ;
   private String[] T00L83_A5726HreLote ;
   private boolean[] T00L83_n5726HreLote ;
   private short[] T00L83_A5945HreSalMP ;
   private boolean[] T00L83_n5945HreSalMP ;
   private int[] T00L83_A5946HreSalVol ;
   private boolean[] T00L83_n5946HreSalVol ;
   private java.math.BigDecimal[] T00L83_A9827HreFacCon1 ;
   private boolean[] T00L83_n9827HreFacCon1 ;
   private int[] T00L83_A11707HreProv ;
   private boolean[] T00L83_n11707HreProv ;
   private java.util.Date[] T00L83_A12453HreFecAct ;
   private boolean[] T00L83_n12453HreFecAct ;
   private String[] T00L83_A12642HrePrdDc2 ;
   private boolean[] T00L83_n12642HrePrdDc2 ;
   private int[] T00L83_A12718HreFabId ;
   private boolean[] T00L83_n12718HreFabId ;
   private short[] T00L83_A13943HreLotAlm ;
   private java.util.Date[] T00L83_A13942HreLoteFch ;
   private String[] T00L83_A396EmprCod ;
   private String[] T00L83_A719PrdNum ;
   private boolean[] T00L83_n719PrdNum ;
   private int[] T00L83_A4492HreBarCod ;
   private byte[] T00L83_A4493HreBarReo ;
   private String[] T00L83_A4494HreBarPar ;
   private byte[] T00L83_A4495HreNumCie ;
   private short[] T00L83_A4545HreLinMaq ;
   private byte[] T00L83_A4550HreLinPro ;
   private String[] T00L89_A396EmprCod ;
   private int[] T00L89_A4492HreBarCod ;
   private byte[] T00L89_A4493HreBarReo ;
   private String[] T00L89_A4494HreBarPar ;
   private byte[] T00L89_A4495HreNumCie ;
   private short[] T00L89_A4545HreLinMaq ;
   private byte[] T00L89_A4550HreLinPro ;
   private short[] T00L89_A4557HreRecLin ;
   private String[] T00L810_A396EmprCod ;
   private int[] T00L810_A4492HreBarCod ;
   private byte[] T00L810_A4493HreBarReo ;
   private String[] T00L810_A4494HreBarPar ;
   private byte[] T00L810_A4495HreNumCie ;
   private short[] T00L810_A4545HreLinMaq ;
   private byte[] T00L810_A4550HreLinPro ;
   private short[] T00L810_A4557HreRecLin ;
   private short[] T00L82_A4557HreRecLin ;
   private String[] T00L82_A4558HrePrdNum ;
   private boolean[] T00L82_n4558HrePrdNum ;
   private String[] T00L82_A4559HrePrdDsc ;
   private boolean[] T00L82_n4559HrePrdDsc ;
   private byte[] T00L82_A4560HrePrdUMe ;
   private boolean[] T00L82_n4560HrePrdUMe ;
   private String[] T00L82_A4561HrePrdUDs ;
   private boolean[] T00L82_n4561HrePrdUDs ;
   private java.math.BigDecimal[] T00L82_A4562HreFacCon ;
   private boolean[] T00L82_n4562HreFacCon ;
   private java.math.BigDecimal[] T00L82_A4563HrePrdCant ;
   private boolean[] T00L82_n4563HrePrdCant ;
   private java.math.BigDecimal[] T00L82_A4564HreCanFin ;
   private boolean[] T00L82_n4564HreCanFin ;
   private java.math.BigDecimal[] T00L82_A4565HreCanAny ;
   private boolean[] T00L82_n4565HreCanAny ;
   private byte[] T00L82_A4566HreForNro ;
   private boolean[] T00L82_n4566HreForNro ;
   private byte[] T00L82_A4567HrePrdTnq ;
   private boolean[] T00L82_n4567HrePrdTnq ;
   private java.util.Date[] T00L82_A4568HreFecMov ;
   private boolean[] T00L82_n4568HreFecMov ;
   private short[] T00L82_A4569HreAnyTie ;
   private boolean[] T00L82_n4569HreAnyTie ;
   private java.math.BigDecimal[] T00L82_A4570HreUltAny ;
   private boolean[] T00L82_n4570HreUltAny ;
   private java.math.BigDecimal[] T00L82_A4571HrePorAny ;
   private boolean[] T00L82_n4571HrePorAny ;
   private java.math.BigDecimal[] T00L82_A4572HreCanEns ;
   private boolean[] T00L82_n4572HreCanEns ;
   private byte[] T00L82_A4573HreRecMar ;
   private boolean[] T00L82_n4573HreRecMar ;
   private String[] T00L82_A4582HreLinUsr ;
   private boolean[] T00L82_n4582HreLinUsr ;
   private java.util.Date[] T00L82_A4583HrePesFec ;
   private boolean[] T00L82_n4583HrePesFec ;
   private java.math.BigDecimal[] T00L82_A4967HrePrePrd ;
   private boolean[] T00L82_n4967HrePrePrd ;
   private String[] T00L82_A5726HreLote ;
   private boolean[] T00L82_n5726HreLote ;
   private short[] T00L82_A5945HreSalMP ;
   private boolean[] T00L82_n5945HreSalMP ;
   private int[] T00L82_A5946HreSalVol ;
   private boolean[] T00L82_n5946HreSalVol ;
   private java.math.BigDecimal[] T00L82_A9827HreFacCon1 ;
   private boolean[] T00L82_n9827HreFacCon1 ;
   private int[] T00L82_A11707HreProv ;
   private boolean[] T00L82_n11707HreProv ;
   private java.util.Date[] T00L82_A12453HreFecAct ;
   private boolean[] T00L82_n12453HreFecAct ;
   private String[] T00L82_A12642HrePrdDc2 ;
   private boolean[] T00L82_n12642HrePrdDc2 ;
   private int[] T00L82_A12718HreFabId ;
   private boolean[] T00L82_n12718HreFabId ;
   private short[] T00L82_A13943HreLotAlm ;
   private java.util.Date[] T00L82_A13942HreLoteFch ;
   private String[] T00L82_A396EmprCod ;
   private String[] T00L82_A719PrdNum ;
   private boolean[] T00L82_n719PrdNum ;
   private int[] T00L82_A4492HreBarCod ;
   private byte[] T00L82_A4493HreBarReo ;
   private String[] T00L82_A4494HreBarPar ;
   private byte[] T00L82_A4495HreNumCie ;
   private short[] T00L82_A4545HreLinMaq ;
   private byte[] T00L82_A4550HreLinPro ;
   private String[] T00L814_A396EmprCod ;
   private int[] T00L814_A4492HreBarCod ;
   private byte[] T00L814_A4493HreBarReo ;
   private String[] T00L814_A4494HreBarPar ;
   private byte[] T00L814_A4495HreNumCie ;
   private short[] T00L814_A4545HreLinMaq ;
   private byte[] T00L814_A4550HreLinPro ;
   private short[] T00L814_A4557HreRecLin ;
   private String[] T00L815_A396EmprCod ;
   private String[] T00L816_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thislre__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thislre__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thislre__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thislre__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00L82", "SELECT HreRecLin, HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreSalMP, HreSalVol, HreFacCon1, HreProv, HreFecAct, HrePrdDc2, HreFabId, HreLotAlm, HreLoteFch, EmprCod, PrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ?  FOR UPDATE OF HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreSalMP, HreSalVol, HreFacCon1, HreProv, HreFecAct, HrePrdDc2, HreFabId, HreLotAlm, HreLoteFch, PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L83", "SELECT HreRecLin, HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreSalMP, HreSalVol, HreFacCon1, HreProv, HreFecAct, HrePrdDc2, HreFabId, HreLotAlm, HreLoteFch, EmprCod, PrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L84", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L85", "SELECT EmprCod FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L86", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreRecLin, TM1.HrePrdNum, TM1.HrePrdDsc, TM1.HrePrdUMe, TM1.HrePrdUDs, TM1.HreFacCon, TM1.HrePrdCant, TM1.HreCanFin, TM1.HreCanAny, TM1.HreForNro, TM1.HrePrdTnq, TM1.HreFecMov, TM1.HreAnyTie, TM1.HreUltAny, TM1.HrePorAny, TM1.HreCanEns, TM1.HreRecMar, TM1.HreLinUsr, TM1.HrePesFec, TM1.HrePrePrd, TM1.HreLote, TM1.HreSalMP, TM1.HreSalVol, TM1.HreFacCon1, TM1.HreProv, TM1.HreFecAct, TM1.HrePrdDc2, TM1.HreFabId, TM1.HreLotAlm, TM1.HreLoteFch, TM1.EmprCod, TM1.PrdNum, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreLinMaq, TM1.HreLinPro FROM TXPHISLRE TM1 WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreLinMaq = ? and TM1.HreLinPro = ? and TM1.HreRecLin = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreLinMaq, TM1.HreLinPro, TM1.HreRecLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L87", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L88", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L89", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE ( HreRecLin > ?) and EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L810", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE ( HreRecLin < ?) and EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreLinMaq DESC, HreLinPro DESC, HreRecLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00L811", "INSERT INTO TXPHISLRE(HreRecLin, HrePrdNum, HrePrdDsc, HrePrdUMe, HrePrdUDs, HreFacCon, HrePrdCant, HreCanFin, HreCanAny, HreForNro, HrePrdTnq, HreFecMov, HreAnyTie, HreUltAny, HrePorAny, HreCanEns, HreRecMar, HreLinUsr, HrePesFec, HrePrePrd, HreLote, HreSalMP, HreSalVol, HreFacCon1, HreProv, HreFecAct, HrePrdDc2, HreFabId, HreLotAlm, HreLoteFch, EmprCod, PrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISLRE")
         ,new UpdateCursor("T00L812", "UPDATE TXPHISLRE SET HrePrdNum=?, HrePrdDsc=?, HrePrdUMe=?, HrePrdUDs=?, HreFacCon=?, HrePrdCant=?, HreCanFin=?, HreCanAny=?, HreForNro=?, HrePrdTnq=?, HreFecMov=?, HreAnyTie=?, HreUltAny=?, HrePorAny=?, HreCanEns=?, HreRecMar=?, HreLinUsr=?, HrePesFec=?, HrePrePrd=?, HreLote=?, HreSalMP=?, HreSalVol=?, HreFacCon1=?, HreProv=?, HreFecAct=?, HrePrdDc2=?, HreFabId=?, HreLotAlm=?, HreLoteFch=?, PrdNum=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ?", GX_NOMASK, "TXPHISLRE")
         ,new UpdateCursor("T00L813", "DELETE FROM TXPHISLRE  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? AND HreRecLin = ?", GX_NOMASK, "TXPHISLRE")
         ,new ForEachCursor("T00L814", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L815", "SELECT EmprCod FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L816", "SELECT EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,5);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 40);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(30);
               ((String[]) buf[57])[0] = rslt.getString(31, 3);
               ((String[]) buf[58])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(33);
               ((byte[]) buf[61])[0] = rslt.getByte(34);
               ((String[]) buf[62])[0] = rslt.getString(35, 1);
               ((byte[]) buf[63])[0] = rslt.getByte(36);
               ((short[]) buf[64])[0] = rslt.getShort(37);
               ((byte[]) buf[65])[0] = rslt.getByte(38);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,5);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 40);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(30);
               ((String[]) buf[57])[0] = rslt.getString(31, 3);
               ((String[]) buf[58])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(33);
               ((byte[]) buf[61])[0] = rslt.getByte(34);
               ((String[]) buf[62])[0] = rslt.getString(35, 1);
               ((byte[]) buf[63])[0] = rslt.getByte(36);
               ((short[]) buf[64])[0] = rslt.getShort(37);
               ((byte[]) buf[65])[0] = rslt.getByte(38);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,3);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(14,3);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(16,5);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 8);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(20,5);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(22);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,5);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((int[]) buf[47])[0] = rslt.getInt(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 40);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((java.util.Date[]) buf[56])[0] = rslt.getGXDate(30);
               ((String[]) buf[57])[0] = rslt.getString(31, 3);
               ((String[]) buf[58])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((int[]) buf[60])[0] = rslt.getInt(33);
               ((byte[]) buf[61])[0] = rslt.getByte(34);
               ((String[]) buf[62])[0] = rslt.getString(35, 1);
               ((byte[]) buf[63])[0] = rslt.getByte(36);
               ((short[]) buf[64])[0] = rslt.getShort(37);
               ((byte[]) buf[65])[0] = rslt.getByte(38);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 26);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 3);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[14], 3);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[16], 3);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[22]);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 3);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 8);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[40], 26);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[42]).shortValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[48]).intValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DATE );
               }
               else
               {
                  stmt.setDate(26, (java.util.Date)parms[50]);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[52], 40);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(28, ((Number) parms[54]).intValue());
               }
               stmt.setShort(29, ((Number) parms[55]).shortValue());
               stmt.setDate(30, (java.util.Date)parms[56]);
               stmt.setString(31, (String)parms[57], 3);
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[59], 6);
               }
               stmt.setInt(33, ((Number) parms[60]).intValue());
               stmt.setByte(34, ((Number) parms[61]).byteValue());
               stmt.setString(35, (String)parms[62], 1);
               stmt.setByte(36, ((Number) parms[63]).byteValue());
               stmt.setShort(37, ((Number) parms[64]).shortValue());
               stmt.setByte(38, ((Number) parms[65]).byteValue());
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 26);
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
                  stmt.setString(4, (String)parms[7], 5);
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
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 3);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 3);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[15], 3);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DATE );
               }
               else
               {
                  stmt.setDate(11, (java.util.Date)parms[21]);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 3);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 8);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 26);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[41]).shortValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[43]).intValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 5);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DATE );
               }
               else
               {
                  stmt.setDate(25, (java.util.Date)parms[49]);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 40);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(27, ((Number) parms[53]).intValue());
               }
               stmt.setShort(28, ((Number) parms[54]).shortValue());
               stmt.setDate(29, (java.util.Date)parms[55]);
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[57], 6);
               }
               stmt.setString(31, (String)parms[58], 3);
               stmt.setInt(32, ((Number) parms[59]).intValue());
               stmt.setByte(33, ((Number) parms[60]).byteValue());
               stmt.setString(34, (String)parms[61], 1);
               stmt.setByte(35, ((Number) parms[62]).byteValue());
               stmt.setShort(36, ((Number) parms[63]).shortValue());
               stmt.setByte(37, ((Number) parms[64]).byteValue());
               stmt.setShort(38, ((Number) parms[65]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 14 :
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
      }
   }

}

