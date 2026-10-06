package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpdimest_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A652OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
         n652OpeCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A652OpeCod) ;
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
            AV68BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68BarCod), 8, 0));
            AV69BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69BarCodReo", GXutil.str( AV69BarCodReo, 1, 0));
            AV70BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarCodPar", AV70BarCodPar);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Llamada con parametro", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEstDimCod_Internalname ;
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
      nRC_GXsfl_345 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_345"))) ;
      nGXsfl_345_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_345_idx"))) ;
      sGXsfl_345_idx = httpContext.GetPar( "sGXsfl_345_idx") ;
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

   public tpdimest_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpdimest_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpdimest_impl.class ));
   }

   public tpdimest_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TpDIMEST.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Codigo Test", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1333EstDimCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1333EstDimCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1333EstDimCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimCod_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Materia Serie", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimMat_Internalname, GXutil.rtrim( A1340EstDimMat), GXutil.rtrim( localUtil.format( A1340EstDimMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimMat_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Serie Hoja de Ruta", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimSer_Internalname, GXutil.rtrim( A1342EstDimSer), GXutil.rtrim( localUtil.format( A1342EstDimSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimSer_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Tipo de Articulo Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimTip_Internalname, GXutil.ltrim( localUtil.ntoc( A1343EstDimTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1343EstDimTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1343EstDimTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimTip_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimDisN_Internalname, GXutil.rtrim( A1334EstDimDisN), GXutil.rtrim( localUtil.format( A1334EstDimDisN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimDisN_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimDisN_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Ancho Inicial Hdr", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimAni_Internalname, GXutil.ltrim( localUtil.ntoc( A3155EstDimAni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimAni_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3155EstDimAni), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3155EstDimAni), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimAni_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimAni_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Grm2 Hdr", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimGmi_Internalname, GXutil.ltrim( localUtil.ntoc( A3156EstDimGmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimGmi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3156EstDimGmi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3156EstDimGmi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimGmi_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimGmi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Color Nombre", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstColNom_Internalname, GXutil.rtrim( A1330EstColNom), GXutil.rtrim( localUtil.format( A1330EstColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstColNom_Jsonclick, 0, "", "", "", "", "", 1, edtEstColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Numero de Color", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A1331EstColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1331EstColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1331EstColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstColNum_Jsonclick, 0, "", "", "", "", "", 1, edtEstColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Fecha del Test", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtEstDimFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimFec_Internalname, localUtil.format(A1337EstDimFec, "99/99/99"), localUtil.format( A1337EstDimFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimFec_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtEstDimFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtEstDimFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TpDIMEST.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Ancho de la Empesa", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A1332EstDimAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1332EstDimAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1332EstDimAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimAnc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Norma Iso", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimNor_Internalname, GXutil.rtrim( A3157EstDimNor), GXutil.rtrim( localUtil.format( A3157EstDimNor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimNor_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimNor_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "EstDimMaq", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimMaq_Internalname, GXutil.rtrim( A3158EstDimMaq), GXutil.rtrim( localUtil.format( A3158EstDimMaq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimMaq_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimMaq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimTAc_Internalname, GXutil.rtrim( A3159EstDimTAc), GXutil.rtrim( localUtil.format( A3159EstDimTAc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimTAc_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimTAc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Manchao", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimMan_Internalname, GXutil.ltrim( localUtil.ntoc( A3160EstDimMan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimMan_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3160EstDimMan), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3160EstDimMan), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimMan_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimMan_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Palmer", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimPal_Internalname, GXutil.ltrim( localUtil.ntoc( A3161EstDimPal, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimPal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3161EstDimPal), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3161EstDimPal), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimPal_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimPal_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Esperilidade", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A3162EstDimEsp, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimEsp_Enabled!=0) ? localUtil.format( A3162EstDimEsp, "Z9.99") : localUtil.format( A3162EstDimEsp, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimEsp_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimEsp_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Tumbler o Natural (secado)", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimTN_Internalname, GXutil.rtrim( A3163EstDimTN), GXutil.rtrim( localUtil.format( A3163EstDimTN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimTN_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimTN_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Codigo Operario", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeCod_Internalname, GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOpeCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A652OpeCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeCod_Jsonclick, 0, "", "", "", "", "", 1, edtOpeCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Operario", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtOpeNom_Internalname, GXutil.rtrim( A653OpeNom), GXutil.rtrim( localUtil.format( A653OpeNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOpeNom_Jsonclick, 0, "", "", "", "", "", 1, edtOpeNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Codigo Cliente", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1328EstCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1328EstCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1328EstCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtEstCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCliNom_Internalname, GXutil.rtrim( A1329EstCliNom), GXutil.rtrim( localUtil.format( A1329EstCliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtEstCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Encogimiento al Ancho/Trama", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimEncA_Internalname, GXutil.ltrim( localUtil.ntoc( A1335EstDimEncA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimEncA_Enabled!=0) ? localUtil.format( A1335EstDimEncA, "ZZ9.99") : localUtil.format( A1335EstDimEncA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimEncA_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimEncA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Encogimiento a lo Largo/Urdido", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimEncL_Internalname, GXutil.ltrim( localUtil.ntoc( A1336EstDimEncL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimEncL_Enabled!=0) ? localUtil.format( A1336EstDimEncL, "ZZ9.99") : localUtil.format( A1336EstDimEncL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimEncL_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimEncL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Grm2 1", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A1338EstDimGrm2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimGrm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1338EstDimGrm2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1338EstDimGrm2), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimGrm2_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimGrm2_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Ultima Linea de Observaciones", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A1344EstDimUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1344EstDimUlin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1344EstDimUlin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimUlin_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimUlin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "EstDimRef", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimRef_Internalname, GXutil.rtrim( A3164EstDimRef), GXutil.rtrim( localUtil.format( A3164EstDimRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimRef_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimRef_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "EstSanfAnc", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3737EstSanfAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3737EstSanfAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3737EstSanfAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "EstSanfGrm", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A3738EstSanfGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3738EstSanfGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3738EstSanfGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfGrm_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "EstCalAnc", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3739EstCalAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3739EstCalAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3739EstCalAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "EstCalGrm", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A3740EstCalGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3740EstCalGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3740EstCalGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalGrm_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "EstRamAnc", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3741EstRamAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3741EstRamAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3741EstRamAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamAnc_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "EstRamGrm", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A3742EstRamGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3742EstRamGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3742EstRamGrm), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamGrm_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamGrm_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "EstNorEsp", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstNorEsp_Internalname, GXutil.rtrim( A3743EstNorEsp), GXutil.rtrim( localUtil.format( A3743EstNorEsp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstNorEsp_Jsonclick, 0, "", "", "", "", "", 1, edtEstNorEsp_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "EstSanfEA", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfEA_Internalname, GXutil.ltrim( localUtil.ntoc( A3872EstSanfEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfEA_Enabled!=0) ? localUtil.format( A3872EstSanfEA, "ZZ9.99") : localUtil.format( A3872EstSanfEA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfEA_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfEA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "EstSanfEL", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstSanfEL_Internalname, GXutil.ltrim( localUtil.ntoc( A3873EstSanfEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstSanfEL_Enabled!=0) ? localUtil.format( A3873EstSanfEL, "ZZ9.99") : localUtil.format( A3873EstSanfEL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstSanfEL_Jsonclick, 0, "", "", "", "", "", 1, edtEstSanfEL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "EstCalEA", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalEA_Internalname, GXutil.ltrim( localUtil.ntoc( A3874EstCalEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalEA_Enabled!=0) ? localUtil.format( A3874EstCalEA, "ZZ9.99") : localUtil.format( A3874EstCalEA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalEA_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalEA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "EstCalEL", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstCalEL_Internalname, GXutil.ltrim( localUtil.ntoc( A3875EstCalEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstCalEL_Enabled!=0) ? localUtil.format( A3875EstCalEL, "ZZ9.99") : localUtil.format( A3875EstCalEL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstCalEL_Jsonclick, 0, "", "", "", "", "", 1, edtEstCalEL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "EstRamEA", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamEA_Internalname, GXutil.ltrim( localUtil.ntoc( A3876EstRamEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamEA_Enabled!=0) ? localUtil.format( A3876EstRamEA, "ZZ9.99") : localUtil.format( A3876EstRamEA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamEA_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamEA_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "EstRamEL", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRamEL_Internalname, GXutil.ltrim( localUtil.ntoc( A3877EstRamEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstRamEL_Enabled!=0) ? localUtil.format( A3877EstRamEL, "ZZ9.99") : localUtil.format( A3877EstRamEL, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRamEL_Jsonclick, 0, "", "", "", "", "", 1, edtEstRamEL_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Valor Inclinacion", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstInclin_Internalname, GXutil.rtrim( A10977EstInclin), GXutil.rtrim( localUtil.format( A10977EstInclin, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstInclin_Jsonclick, 0, "", "", "", "", "", 1, edtEstInclin_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Req Min Larg", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRqMnL_Internalname, GXutil.rtrim( A11806EstRqMnL), GXutil.rtrim( localUtil.format( A11806EstRqMnL, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRqMnL_Jsonclick, 0, "", "", "", "", "", 1, edtEstRqMnL_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Req Min Comp", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRqMnC_Internalname, GXutil.rtrim( A11807EstRqMnC), GXutil.rtrim( localUtil.format( A11807EstRqMnC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRqMnC_Jsonclick, 0, "", "", "", "", "", 1, edtEstRqMnC_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Estado 0 Fallo 1 Ok", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEncASt_Internalname, GXutil.ltrim( localUtil.ntoc( A11808EstEncASt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEncASt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11808EstEncASt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11808EstEncASt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEncASt_Jsonclick, 0, "", "", "", "", "", 1, edtEstEncASt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Estado 0 Fallo 1 Ok", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEncLSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11809EstEncLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEncLSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11809EstEncLSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11809EstEncLSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEncLSt_Jsonclick, 0, "", "", "", "", "", 1, edtEstEncLSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Req Min Gramagem", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRqMnG_Internalname, GXutil.rtrim( A11810EstRqMnG), GXutil.rtrim( localUtil.format( A11810EstRqMnG, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRqMnG_Jsonclick, 0, "", "", "", "", "", 1, edtEstRqMnG_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock52_Internalname, httpContext.getMessage( "Evaulacion Grm 0 fallo 1 ok", ""), "", "", lblTextblock52_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstAvGr_Internalname, GXutil.ltrim( localUtil.ntoc( A11811EstAvGr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstAvGr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11811EstAvGr), "9") : localUtil.format( DecimalUtil.doubleToDec(A11811EstAvGr), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstAvGr_Jsonclick, 0, "", "", "", "", "", 1, edtEstAvGr_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock53_Internalname, httpContext.getMessage( "Req Min Espiralidade", ""), "", "", lblTextblock53_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 281,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstRqMnE_Internalname, GXutil.rtrim( A11812EstRqMnE), GXutil.rtrim( localUtil.format( A11812EstRqMnE, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,281);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstRqMnE_Jsonclick, 0, "", "", "", "", "", 1, edtEstRqMnE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock54_Internalname, httpContext.getMessage( "Espiralidade Antes", ""), "", "", lblTextblock54_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 286,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEspBef_Internalname, GXutil.ltrim( localUtil.ntoc( A11813EstEspBef, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEspBef_Enabled!=0) ? localUtil.format( A11813EstEspBef, "Z9.99") : localUtil.format( A11813EstEspBef, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,286);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEspBef_Jsonclick, 0, "", "", "", "", "", 1, edtEstEspBef_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock55_Internalname, httpContext.getMessage( "Estado 0 fallo 1 ok", ""), "", "", lblTextblock55_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 291,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEspBSt_Internalname, GXutil.ltrim( localUtil.ntoc( A11814EstEspBSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEspBSt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11814EstEspBSt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11814EstEspBSt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEspBSt_Jsonclick, 0, "", "", "", "", "", 1, edtEstEspBSt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock56_Internalname, httpContext.getMessage( "Espiralidade Despues", ""), "", "", lblTextblock56_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 296,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEspAft_Internalname, GXutil.ltrim( localUtil.ntoc( A11815EstEspAft, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEspAft_Enabled!=0) ? localUtil.format( A11815EstEspAft, "Z9.99") : localUtil.format( A11815EstEspAft, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,296);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEspAft_Jsonclick, 0, "", "", "", "", "", 1, edtEstEspAft_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock57_Internalname, httpContext.getMessage( "Estado 0 fallo 1 Ok", ""), "", "", lblTextblock57_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 301,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstEspASt_Internalname, GXutil.ltrim( localUtil.ntoc( A11816EstEspASt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstEspASt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11816EstEspASt), "9") : localUtil.format( DecimalUtil.doubleToDec(A11816EstEspASt), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,301);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstEspASt_Jsonclick, 0, "", "", "", "", "", 1, edtEstEspASt_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock58_Internalname, httpContext.getMessage( "Media", ""), "", "", lblTextblock58_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstMedia_Internalname, GXutil.ltrim( localUtil.ntoc( A11817EstMedia, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstMedia_Enabled!=0) ? localUtil.format( A11817EstMedia, "ZZ9.99") : localUtil.format( A11817EstMedia, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstMedia_Jsonclick, 0, "", "", "", "", "", 1, edtEstMedia_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock59_Internalname, httpContext.getMessage( "Temp Lavado", ""), "", "", lblTextblock59_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstTpLv_Internalname, GXutil.ltrim( localUtil.ntoc( A11818EstTpLv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstTpLv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11818EstTpLv), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11818EstTpLv), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstTpLv_Jsonclick, 0, "", "", "", "", "", 1, edtEstTpLv_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock60_Internalname, httpContext.getMessage( "Metodo", ""), "", "", lblTextblock60_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 316,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstMet_Internalname, GXutil.rtrim( A11819EstMet), GXutil.rtrim( localUtil.format( A11819EstMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,316);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstMet_Jsonclick, 0, "", "", "", "", "", 1, edtEstMet_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock61_Internalname, httpContext.getMessage( "Grm2 2", ""), "", "", lblTextblock61_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimGrm3_Internalname, GXutil.ltrim( localUtil.ntoc( A11820EstDimGrm3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimGrm3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11820EstDimGrm3), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11820EstDimGrm3), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimGrm3_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimGrm3_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock62_Internalname, httpContext.getMessage( "Metodo 3", ""), "", "", lblTextblock62_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 326,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstMetod3_Internalname, GXutil.rtrim( A11919EstMetod3), GXutil.rtrim( localUtil.format( A11919EstMetod3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,326);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstMetod3_Jsonclick, 0, "", "", "", "", "", 1, edtEstMetod3_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock63_Internalname, httpContext.getMessage( "Metodo 2", ""), "", "", lblTextblock63_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 331,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstMetod2_Internalname, GXutil.rtrim( A11920EstMetod2), GXutil.rtrim( localUtil.format( A11920EstMetod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,331);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstMetod2_Jsonclick, 0, "", "", "", "", "", 1, edtEstMetod2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock64_Internalname, httpContext.getMessage( "Metodo 1", ""), "", "", lblTextblock64_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 336,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstMetod1_Internalname, GXutil.rtrim( A11921EstMetod1), GXutil.rtrim( localUtil.format( A11921EstMetod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,336);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstMetod1_Jsonclick, 0, "", "", "", "", "", 1, edtEstMetod1_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock65_Internalname, httpContext.getMessage( "Grm2 3", ""), "", "", lblTextblock65_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstDimGrm1_Internalname, GXutil.ltrim( localUtil.ntoc( A11927EstDimGrm1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEstDimGrm1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11927EstDimGrm1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11927EstDimGrm1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstDimGrm1_Jsonclick, 0, "", "", "", "", "", 1, edtEstDimGrm1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TpDIMEST.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol345( ) ;
      nGXsfl_345_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount187 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_187 = (short)(1) ;
            scanStart1I8187( ) ;
            while ( RcdFound187 != 0 )
            {
               init_level_properties187( ) ;
               getByPrimaryKey1I8187( ) ;
               addRow1I8187( ) ;
               scanNext1I8187( ) ;
            }
            scanEnd1I8187( ) ;
            nBlankRcdCount187 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1I8187( ) ;
         standaloneModal1I8187( ) ;
         sMode187 = Gx_mode ;
         while ( nGXsfl_345_idx < nRC_GXsfl_345 )
         {
            bGXsfl_345_Refreshing = true ;
            readRow1I8187( ) ;
            edtavnRcdDeleted_187_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_187_"+sGXsfl_345_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_187_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_187_Enabled), 5, 0), !bGXsfl_345_Refreshing);
            edtEstDimLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTDIMLIN_"+sGXsfl_345_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstDimLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimLin_Enabled), 5, 0), !bGXsfl_345_Refreshing);
            edtEstDimObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTDIMOBS_"+sGXsfl_345_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtEstDimObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimObs_Enabled), 5, 0), !bGXsfl_345_Refreshing);
            if ( ( nRcdExists_187 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1I8187( ) ;
            }
            sendRow1I8187( ) ;
            bGXsfl_345_Refreshing = false ;
         }
         Gx_mode = sMode187 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount187 = (short)(5) ;
         nRcdExists_187 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1I8187( ) ;
            while ( RcdFound187 != 0 )
            {
               sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_345187( ) ;
               init_level_properties187( ) ;
               standaloneNotModal1I8187( ) ;
               getByPrimaryKey1I8187( ) ;
               standaloneModal1I8187( ) ;
               addRow1I8187( ) ;
               scanNext1I8187( ) ;
            }
            scanEnd1I8187( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode187 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_345187( ) ;
      initAll1I8187( ) ;
      init_level_properties187( ) ;
      nRcdExists_187 = (short)(0) ;
      nIsMod_187 = (short)(0) ;
      nRcdDeleted_187 = (short)(0) ;
      nBlankRcdCount187 = (short)(nBlankRcdUsr187+nBlankRcdCount187) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount187 > 0 )
      {
         standaloneNotModal1I8187( ) ;
         standaloneModal1I8187( ) ;
         addRow1I8187( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtEstDimLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount187 = (short)(nBlankRcdCount187-1) ;
      }
      Gx_mode = sMode187 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 351,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 352,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 353,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TpDIMEST.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 355,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TpDIMEST.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z1333EstDimCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1333EstDimCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1340EstDimMat = httpContext.cgiGet( "Z1340EstDimMat") ;
         Z1342EstDimSer = httpContext.cgiGet( "Z1342EstDimSer") ;
         Z1343EstDimTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z1343EstDimTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1334EstDimDisN = httpContext.cgiGet( "Z1334EstDimDisN") ;
         Z3155EstDimAni = (short)(localUtil.ctol( httpContext.cgiGet( "Z3155EstDimAni"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3156EstDimGmi = (short)(localUtil.ctol( httpContext.cgiGet( "Z3156EstDimGmi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1330EstColNom = httpContext.cgiGet( "Z1330EstColNom") ;
         Z1331EstColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z1331EstColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1337EstDimFec = localUtil.ctod( httpContext.cgiGet( "Z1337EstDimFec"), 0) ;
         Z1332EstDimAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z1332EstDimAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3157EstDimNor = httpContext.cgiGet( "Z3157EstDimNor") ;
         Z3158EstDimMaq = httpContext.cgiGet( "Z3158EstDimMaq") ;
         Z3159EstDimTAc = httpContext.cgiGet( "Z3159EstDimTAc") ;
         Z3160EstDimMan = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3160EstDimMan"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3161EstDimPal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3161EstDimPal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3162EstDimEsp = localUtil.ctond( httpContext.cgiGet( "Z3162EstDimEsp")) ;
         Z3163EstDimTN = httpContext.cgiGet( "Z3163EstDimTN") ;
         Z1328EstCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1328EstCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1329EstCliNom = httpContext.cgiGet( "Z1329EstCliNom") ;
         Z1335EstDimEncA = localUtil.ctond( httpContext.cgiGet( "Z1335EstDimEncA")) ;
         Z1336EstDimEncL = localUtil.ctond( httpContext.cgiGet( "Z1336EstDimEncL")) ;
         Z1338EstDimGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z1338EstDimGrm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1344EstDimUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1344EstDimUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3164EstDimRef = httpContext.cgiGet( "Z3164EstDimRef") ;
         Z3737EstSanfAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3737EstSanfAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3738EstSanfGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z3738EstSanfGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3739EstCalAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3739EstCalAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3740EstCalGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z3740EstCalGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3741EstRamAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3741EstRamAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3742EstRamGrm = (short)(localUtil.ctol( httpContext.cgiGet( "Z3742EstRamGrm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3743EstNorEsp = httpContext.cgiGet( "Z3743EstNorEsp") ;
         Z3872EstSanfEA = localUtil.ctond( httpContext.cgiGet( "Z3872EstSanfEA")) ;
         Z3873EstSanfEL = localUtil.ctond( httpContext.cgiGet( "Z3873EstSanfEL")) ;
         Z3874EstCalEA = localUtil.ctond( httpContext.cgiGet( "Z3874EstCalEA")) ;
         Z3875EstCalEL = localUtil.ctond( httpContext.cgiGet( "Z3875EstCalEL")) ;
         Z3876EstRamEA = localUtil.ctond( httpContext.cgiGet( "Z3876EstRamEA")) ;
         Z3877EstRamEL = localUtil.ctond( httpContext.cgiGet( "Z3877EstRamEL")) ;
         Z10977EstInclin = httpContext.cgiGet( "Z10977EstInclin") ;
         Z11806EstRqMnL = httpContext.cgiGet( "Z11806EstRqMnL") ;
         Z11807EstRqMnC = httpContext.cgiGet( "Z11807EstRqMnC") ;
         Z11808EstEncASt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11808EstEncASt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11809EstEncLSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11809EstEncLSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11810EstRqMnG = httpContext.cgiGet( "Z11810EstRqMnG") ;
         Z11811EstAvGr = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11811EstAvGr"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11812EstRqMnE = httpContext.cgiGet( "Z11812EstRqMnE") ;
         Z11813EstEspBef = localUtil.ctond( httpContext.cgiGet( "Z11813EstEspBef")) ;
         Z11814EstEspBSt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11814EstEspBSt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11815EstEspAft = localUtil.ctond( httpContext.cgiGet( "Z11815EstEspAft")) ;
         Z11816EstEspASt = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11816EstEspASt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11818EstTpLv = (short)(localUtil.ctol( httpContext.cgiGet( "Z11818EstTpLv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11819EstMet = httpContext.cgiGet( "Z11819EstMet") ;
         Z11820EstDimGrm3 = (short)(localUtil.ctol( httpContext.cgiGet( "Z11820EstDimGrm3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11919EstMetod3 = httpContext.cgiGet( "Z11919EstMetod3") ;
         Z11920EstMetod2 = httpContext.cgiGet( "Z11920EstMetod2") ;
         Z11921EstMetod1 = httpContext.cgiGet( "Z11921EstMetod1") ;
         Z11927EstDimGrm1 = (short)(localUtil.ctol( httpContext.cgiGet( "Z11927EstDimGrm1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z652OpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_345 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_345"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1333EstDimCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
         }
         else
         {
            A1333EstDimCod = (int)(localUtil.ctol( httpContext.cgiGet( edtEstDimCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
         }
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCodReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A132BarCodReo = (byte)(0) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1340EstDimMat = httpContext.cgiGet( edtEstDimMat_Internalname) ;
         n1340EstDimMat = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1340EstDimMat", A1340EstDimMat);
         A1342EstDimSer = httpContext.cgiGet( edtEstDimSer_Internalname) ;
         n1342EstDimSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1342EstDimSer", A1342EstDimSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1343EstDimTip = (short)(0) ;
            n1343EstDimTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1343EstDimTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1343EstDimTip), 4, 0));
         }
         else
         {
            A1343EstDimTip = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1343EstDimTip = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1343EstDimTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1343EstDimTip), 4, 0));
         }
         A1334EstDimDisN = httpContext.cgiGet( edtEstDimDisN_Internalname) ;
         n1334EstDimDisN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1334EstDimDisN", A1334EstDimDisN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimAni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimAni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMANI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimAni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3155EstDimAni = (short)(0) ;
            n3155EstDimAni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3155EstDimAni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3155EstDimAni), 4, 0));
         }
         else
         {
            A3155EstDimAni = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimAni_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3155EstDimAni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3155EstDimAni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3155EstDimAni), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGmi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGmi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMGMI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimGmi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3156EstDimGmi = (short)(0) ;
            n3156EstDimGmi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3156EstDimGmi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3156EstDimGmi), 4, 0));
         }
         else
         {
            A3156EstDimGmi = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimGmi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3156EstDimGmi = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3156EstDimGmi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3156EstDimGmi), 4, 0));
         }
         A1330EstColNom = httpContext.cgiGet( edtEstColNom_Internalname) ;
         n1330EstColNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1330EstColNom", A1330EstColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1331EstColNum = 0 ;
            n1331EstColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1331EstColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1331EstColNum), 6, 0));
         }
         else
         {
            A1331EstColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtEstColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1331EstColNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1331EstColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1331EstColNum), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtEstDimFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ESTDIMFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1337EstDimFec = GXutil.nullDate() ;
            n1337EstDimFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1337EstDimFec", localUtil.format(A1337EstDimFec, "99/99/99"));
         }
         else
         {
            A1337EstDimFec = localUtil.ctod( httpContext.cgiGet( edtEstDimFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            n1337EstDimFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1337EstDimFec", localUtil.format(A1337EstDimFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1332EstDimAnc = (short)(0) ;
            n1332EstDimAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1332EstDimAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1332EstDimAnc), 3, 0));
         }
         else
         {
            A1332EstDimAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1332EstDimAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1332EstDimAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1332EstDimAnc), 3, 0));
         }
         A3157EstDimNor = httpContext.cgiGet( edtEstDimNor_Internalname) ;
         n3157EstDimNor = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3157EstDimNor", A3157EstDimNor);
         A3158EstDimMaq = httpContext.cgiGet( edtEstDimMaq_Internalname) ;
         n3158EstDimMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3158EstDimMaq", A3158EstDimMaq);
         A3159EstDimTAc = httpContext.cgiGet( edtEstDimTAc_Internalname) ;
         n3159EstDimTAc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3159EstDimTAc", A3159EstDimTAc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMMAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimMan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3160EstDimMan = (byte)(0) ;
            n3160EstDimMan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3160EstDimMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3160EstDimMan), 2, 0));
         }
         else
         {
            A3160EstDimMan = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstDimMan_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3160EstDimMan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3160EstDimMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3160EstDimMan), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimPal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimPal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMPAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimPal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3161EstDimPal = (byte)(0) ;
            n3161EstDimPal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3161EstDimPal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3161EstDimPal), 2, 0));
         }
         else
         {
            A3161EstDimPal = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstDimPal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3161EstDimPal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3161EstDimPal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3161EstDimPal), 2, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEstDimEsp_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstDimEsp_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMESP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimEsp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3162EstDimEsp = DecimalUtil.ZERO ;
            n3162EstDimEsp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3162EstDimEsp", GXutil.ltrimstr( A3162EstDimEsp, 5, 2));
         }
         else
         {
            A3162EstDimEsp = localUtil.ctond( httpContext.cgiGet( edtEstDimEsp_Internalname)) ;
            n3162EstDimEsp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3162EstDimEsp", GXutil.ltrimstr( A3162EstDimEsp, 5, 2));
         }
         A3163EstDimTN = httpContext.cgiGet( edtEstDimTN_Internalname) ;
         n3163EstDimTN = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3163EstDimTN", A3163EstDimTN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OPECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOpeCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A652OpeCod = 0 ;
            n652OpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         }
         else
         {
            A652OpeCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOpeCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n652OpeCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         }
         A653OpeNom = httpContext.cgiGet( edtOpeNom_Internalname) ;
         n653OpeNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1328EstCliCod = 0 ;
            n1328EstCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1328EstCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1328EstCliCod), 6, 0));
         }
         else
         {
            A1328EstCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtEstCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1328EstCliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1328EstCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1328EstCliCod), 6, 0));
         }
         A1329EstCliNom = httpContext.cgiGet( edtEstCliNom_Internalname) ;
         n1329EstCliNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1329EstCliNom", A1329EstCliNom);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstDimEncA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstDimEncA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMENCA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimEncA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1335EstDimEncA = DecimalUtil.ZERO ;
            n1335EstDimEncA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1335EstDimEncA", GXutil.ltrimstr( A1335EstDimEncA, 6, 2));
         }
         else
         {
            A1335EstDimEncA = localUtil.ctond( httpContext.cgiGet( edtEstDimEncA_Internalname)) ;
            n1335EstDimEncA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1335EstDimEncA", GXutil.ltrimstr( A1335EstDimEncA, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstDimEncL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstDimEncL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMENCL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimEncL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1336EstDimEncL = DecimalUtil.ZERO ;
            n1336EstDimEncL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1336EstDimEncL", GXutil.ltrimstr( A1336EstDimEncL, 6, 2));
         }
         else
         {
            A1336EstDimEncL = localUtil.ctond( httpContext.cgiGet( edtEstDimEncL_Internalname)) ;
            n1336EstDimEncL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1336EstDimEncL", GXutil.ltrimstr( A1336EstDimEncL, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMGRM2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimGrm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1338EstDimGrm2 = (short)(0) ;
            n1338EstDimGrm2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1338EstDimGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1338EstDimGrm2), 3, 0));
         }
         else
         {
            A1338EstDimGrm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimGrm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1338EstDimGrm2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1338EstDimGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1338EstDimGrm2), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1344EstDimUlin = (byte)(0) ;
            n1344EstDimUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1344EstDimUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1344EstDimUlin), 2, 0));
         }
         else
         {
            A1344EstDimUlin = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstDimUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1344EstDimUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1344EstDimUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1344EstDimUlin), 2, 0));
         }
         A3164EstDimRef = httpContext.cgiGet( edtEstDimRef_Internalname) ;
         n3164EstDimRef = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3164EstDimRef", A3164EstDimRef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstSanfAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3737EstSanfAnc = (short)(0) ;
            n3737EstSanfAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
         }
         else
         {
            A3737EstSanfAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstSanfAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3737EstSanfAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstSanfGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFGRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstSanfGrm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3738EstSanfGrm = (short)(0) ;
            n3738EstSanfGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
         }
         else
         {
            A3738EstSanfGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtEstSanfGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3738EstSanfGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstCalAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3739EstCalAnc = (short)(0) ;
            n3739EstCalAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
         }
         else
         {
            A3739EstCalAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCalAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3739EstCalAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstCalGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALGRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstCalGrm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3740EstCalGrm = (short)(0) ;
            n3740EstCalGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
         }
         else
         {
            A3740EstCalGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtEstCalGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3740EstCalGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstRamAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3741EstRamAnc = (short)(0) ;
            n3741EstRamAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
         }
         else
         {
            A3741EstRamAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtEstRamAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3741EstRamAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstRamGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMGRM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstRamGrm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3742EstRamGrm = (short)(0) ;
            n3742EstRamGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
         }
         else
         {
            A3742EstRamGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtEstRamGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3742EstRamGrm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
         }
         A3743EstNorEsp = httpContext.cgiGet( edtEstNorEsp_Internalname) ;
         n3743EstNorEsp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3743EstNorEsp", A3743EstNorEsp);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFEA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstSanfEA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3872EstSanfEA = DecimalUtil.ZERO ;
            n3872EstSanfEA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
         }
         else
         {
            A3872EstSanfEA = localUtil.ctond( httpContext.cgiGet( edtEstSanfEA_Internalname)) ;
            n3872EstSanfEA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstSanfEL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTSANFEL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstSanfEL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3873EstSanfEL = DecimalUtil.ZERO ;
            n3873EstSanfEL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
         }
         else
         {
            A3873EstSanfEL = localUtil.ctond( httpContext.cgiGet( edtEstSanfEL_Internalname)) ;
            n3873EstSanfEL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALEA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstCalEA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3874EstCalEA = DecimalUtil.ZERO ;
            n3874EstCalEA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
         }
         else
         {
            A3874EstCalEA = localUtil.ctond( httpContext.cgiGet( edtEstCalEA_Internalname)) ;
            n3874EstCalEA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstCalEL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTCALEL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstCalEL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3875EstCalEL = DecimalUtil.ZERO ;
            n3875EstCalEL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
         }
         else
         {
            A3875EstCalEL = localUtil.ctond( httpContext.cgiGet( edtEstCalEL_Internalname)) ;
            n3875EstCalEL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEA_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEA_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMEA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstRamEA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3876EstRamEA = DecimalUtil.ZERO ;
            n3876EstRamEA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
         }
         else
         {
            A3876EstRamEA = localUtil.ctond( httpContext.cgiGet( edtEstRamEA_Internalname)) ;
            n3876EstRamEA = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEL_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstRamEL_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTRAMEL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstRamEL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3877EstRamEL = DecimalUtil.ZERO ;
            n3877EstRamEL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
         }
         else
         {
            A3877EstRamEL = localUtil.ctond( httpContext.cgiGet( edtEstRamEL_Internalname)) ;
            n3877EstRamEL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
         }
         A10977EstInclin = httpContext.cgiGet( edtEstInclin_Internalname) ;
         n10977EstInclin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10977EstInclin", A10977EstInclin);
         A11806EstRqMnL = httpContext.cgiGet( edtEstRqMnL_Internalname) ;
         n11806EstRqMnL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11806EstRqMnL", A11806EstRqMnL);
         A11807EstRqMnC = httpContext.cgiGet( edtEstRqMnC_Internalname) ;
         n11807EstRqMnC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11807EstRqMnC", A11807EstRqMnC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstEncASt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstEncASt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTENCAST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstEncASt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11808EstEncASt = (byte)(0) ;
            n11808EstEncASt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11808EstEncASt", GXutil.str( A11808EstEncASt, 1, 0));
         }
         else
         {
            A11808EstEncASt = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstEncASt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11808EstEncASt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11808EstEncASt", GXutil.str( A11808EstEncASt, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstEncLSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstEncLSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTENCLST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstEncLSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11809EstEncLSt = (byte)(0) ;
            n11809EstEncLSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11809EstEncLSt", GXutil.str( A11809EstEncLSt, 1, 0));
         }
         else
         {
            A11809EstEncLSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstEncLSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11809EstEncLSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11809EstEncLSt", GXutil.str( A11809EstEncLSt, 1, 0));
         }
         A11810EstRqMnG = httpContext.cgiGet( edtEstRqMnG_Internalname) ;
         n11810EstRqMnG = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11810EstRqMnG", A11810EstRqMnG);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstAvGr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstAvGr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTAVGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstAvGr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11811EstAvGr = (byte)(0) ;
            n11811EstAvGr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11811EstAvGr", GXutil.str( A11811EstAvGr, 1, 0));
         }
         else
         {
            A11811EstAvGr = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstAvGr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11811EstAvGr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11811EstAvGr", GXutil.str( A11811EstAvGr, 1, 0));
         }
         A11812EstRqMnE = httpContext.cgiGet( edtEstRqMnE_Internalname) ;
         n11812EstRqMnE = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11812EstRqMnE", A11812EstRqMnE);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEstEspBef_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstEspBef_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTESPBEF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstEspBef_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11813EstEspBef = DecimalUtil.ZERO ;
            n11813EstEspBef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11813EstEspBef", GXutil.ltrimstr( A11813EstEspBef, 5, 2));
         }
         else
         {
            A11813EstEspBef = localUtil.ctond( httpContext.cgiGet( edtEstEspBef_Internalname)) ;
            n11813EstEspBef = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11813EstEspBef", GXutil.ltrimstr( A11813EstEspBef, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstEspBSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstEspBSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTESPBST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstEspBSt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11814EstEspBSt = (byte)(0) ;
            n11814EstEspBSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11814EstEspBSt", GXutil.str( A11814EstEspBSt, 1, 0));
         }
         else
         {
            A11814EstEspBSt = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstEspBSt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11814EstEspBSt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11814EstEspBSt", GXutil.str( A11814EstEspBSt, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtEstEspAft_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtEstEspAft_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTESPAFT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstEspAft_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11815EstEspAft = DecimalUtil.ZERO ;
            n11815EstEspAft = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11815EstEspAft", GXutil.ltrimstr( A11815EstEspAft, 5, 2));
         }
         else
         {
            A11815EstEspAft = localUtil.ctond( httpContext.cgiGet( edtEstEspAft_Internalname)) ;
            n11815EstEspAft = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11815EstEspAft", GXutil.ltrimstr( A11815EstEspAft, 5, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstEspASt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstEspASt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTESPAST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstEspASt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11816EstEspASt = (byte)(0) ;
            n11816EstEspASt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11816EstEspASt", GXutil.str( A11816EstEspASt, 1, 0));
         }
         else
         {
            A11816EstEspASt = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstEspASt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11816EstEspASt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11816EstEspASt", GXutil.str( A11816EstEspASt, 1, 0));
         }
         A11817EstMedia = localUtil.ctond( httpContext.cgiGet( edtEstMedia_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstTpLv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstTpLv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTTPLV");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstTpLv_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11818EstTpLv = (short)(0) ;
            n11818EstTpLv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11818EstTpLv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11818EstTpLv), 4, 0));
         }
         else
         {
            A11818EstTpLv = (short)(localUtil.ctol( httpContext.cgiGet( edtEstTpLv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11818EstTpLv = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11818EstTpLv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11818EstTpLv), 4, 0));
         }
         A11819EstMet = httpContext.cgiGet( edtEstMet_Internalname) ;
         n11819EstMet = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11819EstMet", A11819EstMet);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGrm3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGrm3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMGRM3");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimGrm3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11820EstDimGrm3 = (short)(0) ;
            n11820EstDimGrm3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11820EstDimGrm3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11820EstDimGrm3), 3, 0));
         }
         else
         {
            A11820EstDimGrm3 = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimGrm3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11820EstDimGrm3 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11820EstDimGrm3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11820EstDimGrm3), 3, 0));
         }
         A11919EstMetod3 = httpContext.cgiGet( edtEstMetod3_Internalname) ;
         n11919EstMetod3 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11919EstMetod3", A11919EstMetod3);
         A11920EstMetod2 = httpContext.cgiGet( edtEstMetod2_Internalname) ;
         n11920EstMetod2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11920EstMetod2", A11920EstMetod2);
         A11921EstMetod1 = httpContext.cgiGet( edtEstMetod1_Internalname) ;
         n11921EstMetod1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11921EstMetod1", A11921EstMetod1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGrm1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimGrm1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ESTDIMGRM1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEstDimGrm1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11927EstDimGrm1 = (short)(0) ;
            n11927EstDimGrm1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11927EstDimGrm1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11927EstDimGrm1), 3, 0));
         }
         else
         {
            A11927EstDimGrm1 = (short)(localUtil.ctol( httpContext.cgiGet( edtEstDimGrm1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11927EstDimGrm1 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11927EstDimGrm1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11927EstDimGrm1), 3, 0));
         }
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
            A1333EstDimCod = (int)(GXutil.lval( httpContext.GetPar( "EstDimCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
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
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1I8186( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_187_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_187_Enabled), 5, 0), !bGXsfl_345_Refreshing);
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
      disableAttributes1I8186( ) ;
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

   public void confirm_1I80( )
   {
      beforeValidate1I8186( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1I8186( ) ;
         }
         else
         {
            checkExtendedTable1I8186( ) ;
            if ( AnyError == 0 )
            {
               zm1I8186( 3) ;
               zm1I8186( 4) ;
               zm1I8186( 5) ;
            }
            closeExtendedTableCursors1I8186( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode186 = Gx_mode ;
         confirm_1I8187( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode186 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1I80( ) ;
      }
   }

   public void confirm_1I8187( )
   {
      nGXsfl_345_idx = 0 ;
      while ( nGXsfl_345_idx < nRC_GXsfl_345 )
      {
         readRow1I8187( ) ;
         if ( ( nRcdExists_187 != 0 ) || ( nIsMod_187 != 0 ) )
         {
            getKey1I8187( ) ;
            if ( ( nRcdExists_187 == 0 ) && ( nRcdDeleted_187 == 0 ) )
            {
               if ( RcdFound187 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1I8187( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1I8187( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1I8187( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "ESTDIMLIN_" + sGXsfl_345_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEstDimLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound187 != 0 )
               {
                  if ( nRcdDeleted_187 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1I8187( ) ;
                     load1I8187( ) ;
                     beforeValidate1I8187( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1I8187( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_187 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1I8187( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1I8187( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1I8187( ) ;
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
                  if ( nRcdDeleted_187 == 0 )
                  {
                     GXCCtl = "ESTDIMLIN_" + sGXsfl_345_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstDimLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_187_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstDimLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1339EstDimLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstDimObs_Internalname, GXutil.rtrim( A1341EstDimObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1339EstDimLin_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( Z1339EstDimLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1341EstDimObs_"+sGXsfl_345_idx, GXutil.rtrim( Z1341EstDimObs)) ;
         httpContext.changePostValue( "nRcdDeleted_187_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_187_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_187_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_187 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_187_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_187_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTDIMLIN_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTDIMOBS_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1I80( )
   {
   }

   public void zm1I8186( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1340EstDimMat = T01I85_A1340EstDimMat[0] ;
            Z1342EstDimSer = T01I85_A1342EstDimSer[0] ;
            Z1343EstDimTip = T01I85_A1343EstDimTip[0] ;
            Z1334EstDimDisN = T01I85_A1334EstDimDisN[0] ;
            Z3155EstDimAni = T01I85_A3155EstDimAni[0] ;
            Z3156EstDimGmi = T01I85_A3156EstDimGmi[0] ;
            Z1330EstColNom = T01I85_A1330EstColNom[0] ;
            Z1331EstColNum = T01I85_A1331EstColNum[0] ;
            Z1337EstDimFec = T01I85_A1337EstDimFec[0] ;
            Z1332EstDimAnc = T01I85_A1332EstDimAnc[0] ;
            Z3157EstDimNor = T01I85_A3157EstDimNor[0] ;
            Z3158EstDimMaq = T01I85_A3158EstDimMaq[0] ;
            Z3159EstDimTAc = T01I85_A3159EstDimTAc[0] ;
            Z3160EstDimMan = T01I85_A3160EstDimMan[0] ;
            Z3161EstDimPal = T01I85_A3161EstDimPal[0] ;
            Z3162EstDimEsp = T01I85_A3162EstDimEsp[0] ;
            Z3163EstDimTN = T01I85_A3163EstDimTN[0] ;
            Z1328EstCliCod = T01I85_A1328EstCliCod[0] ;
            Z1329EstCliNom = T01I85_A1329EstCliNom[0] ;
            Z1335EstDimEncA = T01I85_A1335EstDimEncA[0] ;
            Z1336EstDimEncL = T01I85_A1336EstDimEncL[0] ;
            Z1338EstDimGrm2 = T01I85_A1338EstDimGrm2[0] ;
            Z1344EstDimUlin = T01I85_A1344EstDimUlin[0] ;
            Z3164EstDimRef = T01I85_A3164EstDimRef[0] ;
            Z3737EstSanfAnc = T01I85_A3737EstSanfAnc[0] ;
            Z3738EstSanfGrm = T01I85_A3738EstSanfGrm[0] ;
            Z3739EstCalAnc = T01I85_A3739EstCalAnc[0] ;
            Z3740EstCalGrm = T01I85_A3740EstCalGrm[0] ;
            Z3741EstRamAnc = T01I85_A3741EstRamAnc[0] ;
            Z3742EstRamGrm = T01I85_A3742EstRamGrm[0] ;
            Z3743EstNorEsp = T01I85_A3743EstNorEsp[0] ;
            Z3872EstSanfEA = T01I85_A3872EstSanfEA[0] ;
            Z3873EstSanfEL = T01I85_A3873EstSanfEL[0] ;
            Z3874EstCalEA = T01I85_A3874EstCalEA[0] ;
            Z3875EstCalEL = T01I85_A3875EstCalEL[0] ;
            Z3876EstRamEA = T01I85_A3876EstRamEA[0] ;
            Z3877EstRamEL = T01I85_A3877EstRamEL[0] ;
            Z10977EstInclin = T01I85_A10977EstInclin[0] ;
            Z11806EstRqMnL = T01I85_A11806EstRqMnL[0] ;
            Z11807EstRqMnC = T01I85_A11807EstRqMnC[0] ;
            Z11808EstEncASt = T01I85_A11808EstEncASt[0] ;
            Z11809EstEncLSt = T01I85_A11809EstEncLSt[0] ;
            Z11810EstRqMnG = T01I85_A11810EstRqMnG[0] ;
            Z11811EstAvGr = T01I85_A11811EstAvGr[0] ;
            Z11812EstRqMnE = T01I85_A11812EstRqMnE[0] ;
            Z11813EstEspBef = T01I85_A11813EstEspBef[0] ;
            Z11814EstEspBSt = T01I85_A11814EstEspBSt[0] ;
            Z11815EstEspAft = T01I85_A11815EstEspAft[0] ;
            Z11816EstEspASt = T01I85_A11816EstEspASt[0] ;
            Z11818EstTpLv = T01I85_A11818EstTpLv[0] ;
            Z11819EstMet = T01I85_A11819EstMet[0] ;
            Z11820EstDimGrm3 = T01I85_A11820EstDimGrm3[0] ;
            Z11919EstMetod3 = T01I85_A11919EstMetod3[0] ;
            Z11920EstMetod2 = T01I85_A11920EstMetod2[0] ;
            Z11921EstMetod1 = T01I85_A11921EstMetod1[0] ;
            Z11927EstDimGrm1 = T01I85_A11927EstDimGrm1[0] ;
            Z129BarCod = T01I85_A129BarCod[0] ;
            Z132BarCodReo = T01I85_A132BarCodReo[0] ;
            Z130BarCodPar = T01I85_A130BarCodPar[0] ;
            Z652OpeCod = T01I85_A652OpeCod[0] ;
         }
         else
         {
            Z1340EstDimMat = A1340EstDimMat ;
            Z1342EstDimSer = A1342EstDimSer ;
            Z1343EstDimTip = A1343EstDimTip ;
            Z1334EstDimDisN = A1334EstDimDisN ;
            Z3155EstDimAni = A3155EstDimAni ;
            Z3156EstDimGmi = A3156EstDimGmi ;
            Z1330EstColNom = A1330EstColNom ;
            Z1331EstColNum = A1331EstColNum ;
            Z1337EstDimFec = A1337EstDimFec ;
            Z1332EstDimAnc = A1332EstDimAnc ;
            Z3157EstDimNor = A3157EstDimNor ;
            Z3158EstDimMaq = A3158EstDimMaq ;
            Z3159EstDimTAc = A3159EstDimTAc ;
            Z3160EstDimMan = A3160EstDimMan ;
            Z3161EstDimPal = A3161EstDimPal ;
            Z3162EstDimEsp = A3162EstDimEsp ;
            Z3163EstDimTN = A3163EstDimTN ;
            Z1328EstCliCod = A1328EstCliCod ;
            Z1329EstCliNom = A1329EstCliNom ;
            Z1335EstDimEncA = A1335EstDimEncA ;
            Z1336EstDimEncL = A1336EstDimEncL ;
            Z1338EstDimGrm2 = A1338EstDimGrm2 ;
            Z1344EstDimUlin = A1344EstDimUlin ;
            Z3164EstDimRef = A3164EstDimRef ;
            Z3737EstSanfAnc = A3737EstSanfAnc ;
            Z3738EstSanfGrm = A3738EstSanfGrm ;
            Z3739EstCalAnc = A3739EstCalAnc ;
            Z3740EstCalGrm = A3740EstCalGrm ;
            Z3741EstRamAnc = A3741EstRamAnc ;
            Z3742EstRamGrm = A3742EstRamGrm ;
            Z3743EstNorEsp = A3743EstNorEsp ;
            Z3872EstSanfEA = A3872EstSanfEA ;
            Z3873EstSanfEL = A3873EstSanfEL ;
            Z3874EstCalEA = A3874EstCalEA ;
            Z3875EstCalEL = A3875EstCalEL ;
            Z3876EstRamEA = A3876EstRamEA ;
            Z3877EstRamEL = A3877EstRamEL ;
            Z10977EstInclin = A10977EstInclin ;
            Z11806EstRqMnL = A11806EstRqMnL ;
            Z11807EstRqMnC = A11807EstRqMnC ;
            Z11808EstEncASt = A11808EstEncASt ;
            Z11809EstEncLSt = A11809EstEncLSt ;
            Z11810EstRqMnG = A11810EstRqMnG ;
            Z11811EstAvGr = A11811EstAvGr ;
            Z11812EstRqMnE = A11812EstRqMnE ;
            Z11813EstEspBef = A11813EstEspBef ;
            Z11814EstEspBSt = A11814EstEspBSt ;
            Z11815EstEspAft = A11815EstEspAft ;
            Z11816EstEspASt = A11816EstEspASt ;
            Z11818EstTpLv = A11818EstTpLv ;
            Z11819EstMet = A11819EstMet ;
            Z11820EstDimGrm3 = A11820EstDimGrm3 ;
            Z11919EstMetod3 = A11919EstMetod3 ;
            Z11920EstMetod2 = A11920EstMetod2 ;
            Z11921EstMetod1 = A11921EstMetod1 ;
            Z11927EstDimGrm1 = A11927EstDimGrm1 ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z652OpeCod = A652OpeCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z1333EstDimCod = A1333EstDimCod ;
         Z1340EstDimMat = A1340EstDimMat ;
         Z1342EstDimSer = A1342EstDimSer ;
         Z1343EstDimTip = A1343EstDimTip ;
         Z1334EstDimDisN = A1334EstDimDisN ;
         Z3155EstDimAni = A3155EstDimAni ;
         Z3156EstDimGmi = A3156EstDimGmi ;
         Z1330EstColNom = A1330EstColNom ;
         Z1331EstColNum = A1331EstColNum ;
         Z1337EstDimFec = A1337EstDimFec ;
         Z1332EstDimAnc = A1332EstDimAnc ;
         Z3157EstDimNor = A3157EstDimNor ;
         Z3158EstDimMaq = A3158EstDimMaq ;
         Z3159EstDimTAc = A3159EstDimTAc ;
         Z3160EstDimMan = A3160EstDimMan ;
         Z3161EstDimPal = A3161EstDimPal ;
         Z3162EstDimEsp = A3162EstDimEsp ;
         Z3163EstDimTN = A3163EstDimTN ;
         Z1328EstCliCod = A1328EstCliCod ;
         Z1329EstCliNom = A1329EstCliNom ;
         Z1335EstDimEncA = A1335EstDimEncA ;
         Z1336EstDimEncL = A1336EstDimEncL ;
         Z1338EstDimGrm2 = A1338EstDimGrm2 ;
         Z1344EstDimUlin = A1344EstDimUlin ;
         Z3164EstDimRef = A3164EstDimRef ;
         Z3737EstSanfAnc = A3737EstSanfAnc ;
         Z3738EstSanfGrm = A3738EstSanfGrm ;
         Z3739EstCalAnc = A3739EstCalAnc ;
         Z3740EstCalGrm = A3740EstCalGrm ;
         Z3741EstRamAnc = A3741EstRamAnc ;
         Z3742EstRamGrm = A3742EstRamGrm ;
         Z3743EstNorEsp = A3743EstNorEsp ;
         Z3872EstSanfEA = A3872EstSanfEA ;
         Z3873EstSanfEL = A3873EstSanfEL ;
         Z3874EstCalEA = A3874EstCalEA ;
         Z3875EstCalEL = A3875EstCalEL ;
         Z3876EstRamEA = A3876EstRamEA ;
         Z3877EstRamEL = A3877EstRamEL ;
         Z10977EstInclin = A10977EstInclin ;
         Z11806EstRqMnL = A11806EstRqMnL ;
         Z11807EstRqMnC = A11807EstRqMnC ;
         Z11808EstEncASt = A11808EstEncASt ;
         Z11809EstEncLSt = A11809EstEncLSt ;
         Z11810EstRqMnG = A11810EstRqMnG ;
         Z11811EstAvGr = A11811EstAvGr ;
         Z11812EstRqMnE = A11812EstRqMnE ;
         Z11813EstEspBef = A11813EstEspBef ;
         Z11814EstEspBSt = A11814EstEspBSt ;
         Z11815EstEspAft = A11815EstEspAft ;
         Z11816EstEspASt = A11816EstEspASt ;
         Z11818EstTpLv = A11818EstTpLv ;
         Z11819EstMet = A11819EstMet ;
         Z11820EstDimGrm3 = A11820EstDimGrm3 ;
         Z11919EstMetod3 = A11919EstMetod3 ;
         Z11920EstMetod2 = A11920EstMetod2 ;
         Z11921EstMetod1 = A11921EstMetod1 ;
         Z11927EstDimGrm1 = A11927EstDimGrm1 ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z652OpeCod = A652OpeCod ;
         Z407EmprNom = A407EmprNom ;
         Z653OpeNom = A653OpeNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T01I86 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01I86_A407EmprNom[0] ;
      n407EmprNom = T01I86_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
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

   public void load1I8186( )
   {
      /* Using cursor T01I89 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound186 = (short)(1) ;
         A407EmprNom = T01I89_A407EmprNom[0] ;
         n407EmprNom = T01I89_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1340EstDimMat = T01I89_A1340EstDimMat[0] ;
         n1340EstDimMat = T01I89_n1340EstDimMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1340EstDimMat", A1340EstDimMat);
         A1342EstDimSer = T01I89_A1342EstDimSer[0] ;
         n1342EstDimSer = T01I89_n1342EstDimSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1342EstDimSer", A1342EstDimSer);
         A1343EstDimTip = T01I89_A1343EstDimTip[0] ;
         n1343EstDimTip = T01I89_n1343EstDimTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1343EstDimTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1343EstDimTip), 4, 0));
         A1334EstDimDisN = T01I89_A1334EstDimDisN[0] ;
         n1334EstDimDisN = T01I89_n1334EstDimDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1334EstDimDisN", A1334EstDimDisN);
         A3155EstDimAni = T01I89_A3155EstDimAni[0] ;
         n3155EstDimAni = T01I89_n3155EstDimAni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3155EstDimAni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3155EstDimAni), 4, 0));
         A3156EstDimGmi = T01I89_A3156EstDimGmi[0] ;
         n3156EstDimGmi = T01I89_n3156EstDimGmi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3156EstDimGmi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3156EstDimGmi), 4, 0));
         A1330EstColNom = T01I89_A1330EstColNom[0] ;
         n1330EstColNom = T01I89_n1330EstColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1330EstColNom", A1330EstColNom);
         A1331EstColNum = T01I89_A1331EstColNum[0] ;
         n1331EstColNum = T01I89_n1331EstColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1331EstColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1331EstColNum), 6, 0));
         A1337EstDimFec = T01I89_A1337EstDimFec[0] ;
         n1337EstDimFec = T01I89_n1337EstDimFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1337EstDimFec", localUtil.format(A1337EstDimFec, "99/99/99"));
         A1332EstDimAnc = T01I89_A1332EstDimAnc[0] ;
         n1332EstDimAnc = T01I89_n1332EstDimAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1332EstDimAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1332EstDimAnc), 3, 0));
         A3157EstDimNor = T01I89_A3157EstDimNor[0] ;
         n3157EstDimNor = T01I89_n3157EstDimNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3157EstDimNor", A3157EstDimNor);
         A3158EstDimMaq = T01I89_A3158EstDimMaq[0] ;
         n3158EstDimMaq = T01I89_n3158EstDimMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3158EstDimMaq", A3158EstDimMaq);
         A3159EstDimTAc = T01I89_A3159EstDimTAc[0] ;
         n3159EstDimTAc = T01I89_n3159EstDimTAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3159EstDimTAc", A3159EstDimTAc);
         A3160EstDimMan = T01I89_A3160EstDimMan[0] ;
         n3160EstDimMan = T01I89_n3160EstDimMan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3160EstDimMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3160EstDimMan), 2, 0));
         A3161EstDimPal = T01I89_A3161EstDimPal[0] ;
         n3161EstDimPal = T01I89_n3161EstDimPal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3161EstDimPal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3161EstDimPal), 2, 0));
         A3162EstDimEsp = T01I89_A3162EstDimEsp[0] ;
         n3162EstDimEsp = T01I89_n3162EstDimEsp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3162EstDimEsp", GXutil.ltrimstr( A3162EstDimEsp, 5, 2));
         A3163EstDimTN = T01I89_A3163EstDimTN[0] ;
         n3163EstDimTN = T01I89_n3163EstDimTN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3163EstDimTN", A3163EstDimTN);
         A653OpeNom = T01I89_A653OpeNom[0] ;
         n653OpeNom = T01I89_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         A1328EstCliCod = T01I89_A1328EstCliCod[0] ;
         n1328EstCliCod = T01I89_n1328EstCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1328EstCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1328EstCliCod), 6, 0));
         A1329EstCliNom = T01I89_A1329EstCliNom[0] ;
         n1329EstCliNom = T01I89_n1329EstCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1329EstCliNom", A1329EstCliNom);
         A1335EstDimEncA = T01I89_A1335EstDimEncA[0] ;
         n1335EstDimEncA = T01I89_n1335EstDimEncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1335EstDimEncA", GXutil.ltrimstr( A1335EstDimEncA, 6, 2));
         A1336EstDimEncL = T01I89_A1336EstDimEncL[0] ;
         n1336EstDimEncL = T01I89_n1336EstDimEncL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1336EstDimEncL", GXutil.ltrimstr( A1336EstDimEncL, 6, 2));
         A1338EstDimGrm2 = T01I89_A1338EstDimGrm2[0] ;
         n1338EstDimGrm2 = T01I89_n1338EstDimGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1338EstDimGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1338EstDimGrm2), 3, 0));
         A1344EstDimUlin = T01I89_A1344EstDimUlin[0] ;
         n1344EstDimUlin = T01I89_n1344EstDimUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1344EstDimUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1344EstDimUlin), 2, 0));
         A3164EstDimRef = T01I89_A3164EstDimRef[0] ;
         n3164EstDimRef = T01I89_n3164EstDimRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3164EstDimRef", A3164EstDimRef);
         A3737EstSanfAnc = T01I89_A3737EstSanfAnc[0] ;
         n3737EstSanfAnc = T01I89_n3737EstSanfAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
         A3738EstSanfGrm = T01I89_A3738EstSanfGrm[0] ;
         n3738EstSanfGrm = T01I89_n3738EstSanfGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
         A3739EstCalAnc = T01I89_A3739EstCalAnc[0] ;
         n3739EstCalAnc = T01I89_n3739EstCalAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
         A3740EstCalGrm = T01I89_A3740EstCalGrm[0] ;
         n3740EstCalGrm = T01I89_n3740EstCalGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
         A3741EstRamAnc = T01I89_A3741EstRamAnc[0] ;
         n3741EstRamAnc = T01I89_n3741EstRamAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
         A3742EstRamGrm = T01I89_A3742EstRamGrm[0] ;
         n3742EstRamGrm = T01I89_n3742EstRamGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
         A3743EstNorEsp = T01I89_A3743EstNorEsp[0] ;
         n3743EstNorEsp = T01I89_n3743EstNorEsp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3743EstNorEsp", A3743EstNorEsp);
         A3872EstSanfEA = T01I89_A3872EstSanfEA[0] ;
         n3872EstSanfEA = T01I89_n3872EstSanfEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
         A3873EstSanfEL = T01I89_A3873EstSanfEL[0] ;
         n3873EstSanfEL = T01I89_n3873EstSanfEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
         A3874EstCalEA = T01I89_A3874EstCalEA[0] ;
         n3874EstCalEA = T01I89_n3874EstCalEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
         A3875EstCalEL = T01I89_A3875EstCalEL[0] ;
         n3875EstCalEL = T01I89_n3875EstCalEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
         A3876EstRamEA = T01I89_A3876EstRamEA[0] ;
         n3876EstRamEA = T01I89_n3876EstRamEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
         A3877EstRamEL = T01I89_A3877EstRamEL[0] ;
         n3877EstRamEL = T01I89_n3877EstRamEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
         A10977EstInclin = T01I89_A10977EstInclin[0] ;
         n10977EstInclin = T01I89_n10977EstInclin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10977EstInclin", A10977EstInclin);
         A11806EstRqMnL = T01I89_A11806EstRqMnL[0] ;
         n11806EstRqMnL = T01I89_n11806EstRqMnL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11806EstRqMnL", A11806EstRqMnL);
         A11807EstRqMnC = T01I89_A11807EstRqMnC[0] ;
         n11807EstRqMnC = T01I89_n11807EstRqMnC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11807EstRqMnC", A11807EstRqMnC);
         A11808EstEncASt = T01I89_A11808EstEncASt[0] ;
         n11808EstEncASt = T01I89_n11808EstEncASt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11808EstEncASt", GXutil.str( A11808EstEncASt, 1, 0));
         A11809EstEncLSt = T01I89_A11809EstEncLSt[0] ;
         n11809EstEncLSt = T01I89_n11809EstEncLSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11809EstEncLSt", GXutil.str( A11809EstEncLSt, 1, 0));
         A11810EstRqMnG = T01I89_A11810EstRqMnG[0] ;
         n11810EstRqMnG = T01I89_n11810EstRqMnG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11810EstRqMnG", A11810EstRqMnG);
         A11811EstAvGr = T01I89_A11811EstAvGr[0] ;
         n11811EstAvGr = T01I89_n11811EstAvGr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11811EstAvGr", GXutil.str( A11811EstAvGr, 1, 0));
         A11812EstRqMnE = T01I89_A11812EstRqMnE[0] ;
         n11812EstRqMnE = T01I89_n11812EstRqMnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11812EstRqMnE", A11812EstRqMnE);
         A11813EstEspBef = T01I89_A11813EstEspBef[0] ;
         n11813EstEspBef = T01I89_n11813EstEspBef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11813EstEspBef", GXutil.ltrimstr( A11813EstEspBef, 5, 2));
         A11814EstEspBSt = T01I89_A11814EstEspBSt[0] ;
         n11814EstEspBSt = T01I89_n11814EstEspBSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11814EstEspBSt", GXutil.str( A11814EstEspBSt, 1, 0));
         A11815EstEspAft = T01I89_A11815EstEspAft[0] ;
         n11815EstEspAft = T01I89_n11815EstEspAft[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11815EstEspAft", GXutil.ltrimstr( A11815EstEspAft, 5, 2));
         A11816EstEspASt = T01I89_A11816EstEspASt[0] ;
         n11816EstEspASt = T01I89_n11816EstEspASt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11816EstEspASt", GXutil.str( A11816EstEspASt, 1, 0));
         A11818EstTpLv = T01I89_A11818EstTpLv[0] ;
         n11818EstTpLv = T01I89_n11818EstTpLv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11818EstTpLv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11818EstTpLv), 4, 0));
         A11819EstMet = T01I89_A11819EstMet[0] ;
         n11819EstMet = T01I89_n11819EstMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11819EstMet", A11819EstMet);
         A11820EstDimGrm3 = T01I89_A11820EstDimGrm3[0] ;
         n11820EstDimGrm3 = T01I89_n11820EstDimGrm3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11820EstDimGrm3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11820EstDimGrm3), 3, 0));
         A11919EstMetod3 = T01I89_A11919EstMetod3[0] ;
         n11919EstMetod3 = T01I89_n11919EstMetod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11919EstMetod3", A11919EstMetod3);
         A11920EstMetod2 = T01I89_A11920EstMetod2[0] ;
         n11920EstMetod2 = T01I89_n11920EstMetod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11920EstMetod2", A11920EstMetod2);
         A11921EstMetod1 = T01I89_A11921EstMetod1[0] ;
         n11921EstMetod1 = T01I89_n11921EstMetod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11921EstMetod1", A11921EstMetod1);
         A11927EstDimGrm1 = T01I89_A11927EstDimGrm1[0] ;
         n11927EstDimGrm1 = T01I89_n11927EstDimGrm1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11927EstDimGrm1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11927EstDimGrm1), 3, 0));
         A129BarCod = T01I89_A129BarCod[0] ;
         n129BarCod = T01I89_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01I89_A132BarCodReo[0] ;
         n132BarCodReo = T01I89_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01I89_A130BarCodPar[0] ;
         n130BarCodPar = T01I89_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01I89_A652OpeCod[0] ;
         n652OpeCod = T01I89_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         zm1I8186( -2) ;
      }
      pr_default.close(7);
      onLoadActions1I8186( ) ;
   }

   public void onLoadActions1I8186( )
   {
      if ( ( A1338EstDimGrm2 == 0 ) && ( A11820EstDimGrm3 == 0 ) )
      {
         A11817EstMedia = DecimalUtil.doubleToDec(A11927EstDimGrm1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
      }
      else
      {
         if ( ( A11927EstDimGrm1 == 0 ) && ( A11820EstDimGrm3 == 0 ) )
         {
            A11817EstMedia = DecimalUtil.doubleToDec(A1338EstDimGrm2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
         }
         else
         {
            if ( ( A11927EstDimGrm1 == 0 ) && ( A1338EstDimGrm2 == 0 ) )
            {
               A11817EstMedia = DecimalUtil.doubleToDec(A11820EstDimGrm3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
            }
            else
            {
               if ( ( A11927EstDimGrm1 > 0 ) && ( A1338EstDimGrm2 > 0 ) && ( A11820EstDimGrm3 == 0 ) )
               {
                  A11817EstMedia = DecimalUtil.doubleToDec((A11927EstDimGrm1+A1338EstDimGrm2)/ (double) (2)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
               }
               else
               {
                  if ( ( A11927EstDimGrm1 > 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 == 0 ) )
                  {
                     A11817EstMedia = DecimalUtil.doubleToDec((A11927EstDimGrm1+A11820EstDimGrm3)/ (double) (2)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                  }
                  else
                  {
                     if ( ( A11927EstDimGrm1 == 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 > 0 ) )
                     {
                        A11817EstMedia = DecimalUtil.doubleToDec((A1338EstDimGrm2+A11820EstDimGrm3)/ (double) (2)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                     }
                     else
                     {
                        if ( ( A11927EstDimGrm1 > 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 > 0 ) )
                        {
                           A11817EstMedia = DecimalUtil.doubleToDec((A1338EstDimGrm2+A11820EstDimGrm3+A11927EstDimGrm1)/ (double) (3)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                        }
                        else
                        {
                           A11817EstMedia = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void checkExtendedTable1I8186( )
   {
      nIsDirty_186 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01I87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      /* Using cursor T01I88 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01I88_A653OpeNom[0] ;
      n653OpeNom = T01I88_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      pr_default.close(6);
      if ( ( A1338EstDimGrm2 == 0 ) && ( A11820EstDimGrm3 == 0 ) )
      {
         nIsDirty_186 = (short)(1) ;
         A11817EstMedia = DecimalUtil.doubleToDec(A11927EstDimGrm1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
      }
      else
      {
         if ( ( A11927EstDimGrm1 == 0 ) && ( A11820EstDimGrm3 == 0 ) )
         {
            nIsDirty_186 = (short)(1) ;
            A11817EstMedia = DecimalUtil.doubleToDec(A1338EstDimGrm2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
         }
         else
         {
            if ( ( A11927EstDimGrm1 == 0 ) && ( A1338EstDimGrm2 == 0 ) )
            {
               nIsDirty_186 = (short)(1) ;
               A11817EstMedia = DecimalUtil.doubleToDec(A11820EstDimGrm3) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
            }
            else
            {
               if ( ( A11927EstDimGrm1 > 0 ) && ( A1338EstDimGrm2 > 0 ) && ( A11820EstDimGrm3 == 0 ) )
               {
                  nIsDirty_186 = (short)(1) ;
                  A11817EstMedia = DecimalUtil.doubleToDec((A11927EstDimGrm1+A1338EstDimGrm2)/ (double) (2)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
               }
               else
               {
                  if ( ( A11927EstDimGrm1 > 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 == 0 ) )
                  {
                     nIsDirty_186 = (short)(1) ;
                     A11817EstMedia = DecimalUtil.doubleToDec((A11927EstDimGrm1+A11820EstDimGrm3)/ (double) (2)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                  }
                  else
                  {
                     if ( ( A11927EstDimGrm1 == 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 > 0 ) )
                     {
                        nIsDirty_186 = (short)(1) ;
                        A11817EstMedia = DecimalUtil.doubleToDec((A1338EstDimGrm2+A11820EstDimGrm3)/ (double) (2)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                     }
                     else
                     {
                        if ( ( A11927EstDimGrm1 > 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 > 0 ) )
                        {
                           nIsDirty_186 = (short)(1) ;
                           A11817EstMedia = DecimalUtil.doubleToDec((A1338EstDimGrm2+A11820EstDimGrm3+A11927EstDimGrm1)/ (double) (3)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                        }
                        else
                        {
                           nIsDirty_186 = (short)(1) ;
                           A11817EstMedia = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void closeExtendedTableCursors1I8186( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01I810 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_5( String A396EmprCod ,
                         int A652OpeCod )
   {
      /* Using cursor T01I811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A653OpeNom = T01I811_A653OpeNom[0] ;
      n653OpeNom = T01I811_n653OpeNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A653OpeNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey1I8186( )
   {
      /* Using cursor T01I812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound186 = (short)(1) ;
      }
      else
      {
         RcdFound186 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01I85 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01I85_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1I8186( 2) ;
         RcdFound186 = (short)(1) ;
         A1333EstDimCod = T01I85_A1333EstDimCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
         A1340EstDimMat = T01I85_A1340EstDimMat[0] ;
         n1340EstDimMat = T01I85_n1340EstDimMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1340EstDimMat", A1340EstDimMat);
         A1342EstDimSer = T01I85_A1342EstDimSer[0] ;
         n1342EstDimSer = T01I85_n1342EstDimSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1342EstDimSer", A1342EstDimSer);
         A1343EstDimTip = T01I85_A1343EstDimTip[0] ;
         n1343EstDimTip = T01I85_n1343EstDimTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1343EstDimTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1343EstDimTip), 4, 0));
         A1334EstDimDisN = T01I85_A1334EstDimDisN[0] ;
         n1334EstDimDisN = T01I85_n1334EstDimDisN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1334EstDimDisN", A1334EstDimDisN);
         A3155EstDimAni = T01I85_A3155EstDimAni[0] ;
         n3155EstDimAni = T01I85_n3155EstDimAni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3155EstDimAni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3155EstDimAni), 4, 0));
         A3156EstDimGmi = T01I85_A3156EstDimGmi[0] ;
         n3156EstDimGmi = T01I85_n3156EstDimGmi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3156EstDimGmi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3156EstDimGmi), 4, 0));
         A1330EstColNom = T01I85_A1330EstColNom[0] ;
         n1330EstColNom = T01I85_n1330EstColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1330EstColNom", A1330EstColNom);
         A1331EstColNum = T01I85_A1331EstColNum[0] ;
         n1331EstColNum = T01I85_n1331EstColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1331EstColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1331EstColNum), 6, 0));
         A1337EstDimFec = T01I85_A1337EstDimFec[0] ;
         n1337EstDimFec = T01I85_n1337EstDimFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1337EstDimFec", localUtil.format(A1337EstDimFec, "99/99/99"));
         A1332EstDimAnc = T01I85_A1332EstDimAnc[0] ;
         n1332EstDimAnc = T01I85_n1332EstDimAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1332EstDimAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1332EstDimAnc), 3, 0));
         A3157EstDimNor = T01I85_A3157EstDimNor[0] ;
         n3157EstDimNor = T01I85_n3157EstDimNor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3157EstDimNor", A3157EstDimNor);
         A3158EstDimMaq = T01I85_A3158EstDimMaq[0] ;
         n3158EstDimMaq = T01I85_n3158EstDimMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3158EstDimMaq", A3158EstDimMaq);
         A3159EstDimTAc = T01I85_A3159EstDimTAc[0] ;
         n3159EstDimTAc = T01I85_n3159EstDimTAc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3159EstDimTAc", A3159EstDimTAc);
         A3160EstDimMan = T01I85_A3160EstDimMan[0] ;
         n3160EstDimMan = T01I85_n3160EstDimMan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3160EstDimMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3160EstDimMan), 2, 0));
         A3161EstDimPal = T01I85_A3161EstDimPal[0] ;
         n3161EstDimPal = T01I85_n3161EstDimPal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3161EstDimPal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3161EstDimPal), 2, 0));
         A3162EstDimEsp = T01I85_A3162EstDimEsp[0] ;
         n3162EstDimEsp = T01I85_n3162EstDimEsp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3162EstDimEsp", GXutil.ltrimstr( A3162EstDimEsp, 5, 2));
         A3163EstDimTN = T01I85_A3163EstDimTN[0] ;
         n3163EstDimTN = T01I85_n3163EstDimTN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3163EstDimTN", A3163EstDimTN);
         A1328EstCliCod = T01I85_A1328EstCliCod[0] ;
         n1328EstCliCod = T01I85_n1328EstCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1328EstCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1328EstCliCod), 6, 0));
         A1329EstCliNom = T01I85_A1329EstCliNom[0] ;
         n1329EstCliNom = T01I85_n1329EstCliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1329EstCliNom", A1329EstCliNom);
         A1335EstDimEncA = T01I85_A1335EstDimEncA[0] ;
         n1335EstDimEncA = T01I85_n1335EstDimEncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1335EstDimEncA", GXutil.ltrimstr( A1335EstDimEncA, 6, 2));
         A1336EstDimEncL = T01I85_A1336EstDimEncL[0] ;
         n1336EstDimEncL = T01I85_n1336EstDimEncL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1336EstDimEncL", GXutil.ltrimstr( A1336EstDimEncL, 6, 2));
         A1338EstDimGrm2 = T01I85_A1338EstDimGrm2[0] ;
         n1338EstDimGrm2 = T01I85_n1338EstDimGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1338EstDimGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1338EstDimGrm2), 3, 0));
         A1344EstDimUlin = T01I85_A1344EstDimUlin[0] ;
         n1344EstDimUlin = T01I85_n1344EstDimUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1344EstDimUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1344EstDimUlin), 2, 0));
         A3164EstDimRef = T01I85_A3164EstDimRef[0] ;
         n3164EstDimRef = T01I85_n3164EstDimRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3164EstDimRef", A3164EstDimRef);
         A3737EstSanfAnc = T01I85_A3737EstSanfAnc[0] ;
         n3737EstSanfAnc = T01I85_n3737EstSanfAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
         A3738EstSanfGrm = T01I85_A3738EstSanfGrm[0] ;
         n3738EstSanfGrm = T01I85_n3738EstSanfGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
         A3739EstCalAnc = T01I85_A3739EstCalAnc[0] ;
         n3739EstCalAnc = T01I85_n3739EstCalAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
         A3740EstCalGrm = T01I85_A3740EstCalGrm[0] ;
         n3740EstCalGrm = T01I85_n3740EstCalGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
         A3741EstRamAnc = T01I85_A3741EstRamAnc[0] ;
         n3741EstRamAnc = T01I85_n3741EstRamAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
         A3742EstRamGrm = T01I85_A3742EstRamGrm[0] ;
         n3742EstRamGrm = T01I85_n3742EstRamGrm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
         A3743EstNorEsp = T01I85_A3743EstNorEsp[0] ;
         n3743EstNorEsp = T01I85_n3743EstNorEsp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3743EstNorEsp", A3743EstNorEsp);
         A3872EstSanfEA = T01I85_A3872EstSanfEA[0] ;
         n3872EstSanfEA = T01I85_n3872EstSanfEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
         A3873EstSanfEL = T01I85_A3873EstSanfEL[0] ;
         n3873EstSanfEL = T01I85_n3873EstSanfEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
         A3874EstCalEA = T01I85_A3874EstCalEA[0] ;
         n3874EstCalEA = T01I85_n3874EstCalEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
         A3875EstCalEL = T01I85_A3875EstCalEL[0] ;
         n3875EstCalEL = T01I85_n3875EstCalEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
         A3876EstRamEA = T01I85_A3876EstRamEA[0] ;
         n3876EstRamEA = T01I85_n3876EstRamEA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
         A3877EstRamEL = T01I85_A3877EstRamEL[0] ;
         n3877EstRamEL = T01I85_n3877EstRamEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
         A10977EstInclin = T01I85_A10977EstInclin[0] ;
         n10977EstInclin = T01I85_n10977EstInclin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10977EstInclin", A10977EstInclin);
         A11806EstRqMnL = T01I85_A11806EstRqMnL[0] ;
         n11806EstRqMnL = T01I85_n11806EstRqMnL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11806EstRqMnL", A11806EstRqMnL);
         A11807EstRqMnC = T01I85_A11807EstRqMnC[0] ;
         n11807EstRqMnC = T01I85_n11807EstRqMnC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11807EstRqMnC", A11807EstRqMnC);
         A11808EstEncASt = T01I85_A11808EstEncASt[0] ;
         n11808EstEncASt = T01I85_n11808EstEncASt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11808EstEncASt", GXutil.str( A11808EstEncASt, 1, 0));
         A11809EstEncLSt = T01I85_A11809EstEncLSt[0] ;
         n11809EstEncLSt = T01I85_n11809EstEncLSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11809EstEncLSt", GXutil.str( A11809EstEncLSt, 1, 0));
         A11810EstRqMnG = T01I85_A11810EstRqMnG[0] ;
         n11810EstRqMnG = T01I85_n11810EstRqMnG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11810EstRqMnG", A11810EstRqMnG);
         A11811EstAvGr = T01I85_A11811EstAvGr[0] ;
         n11811EstAvGr = T01I85_n11811EstAvGr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11811EstAvGr", GXutil.str( A11811EstAvGr, 1, 0));
         A11812EstRqMnE = T01I85_A11812EstRqMnE[0] ;
         n11812EstRqMnE = T01I85_n11812EstRqMnE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11812EstRqMnE", A11812EstRqMnE);
         A11813EstEspBef = T01I85_A11813EstEspBef[0] ;
         n11813EstEspBef = T01I85_n11813EstEspBef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11813EstEspBef", GXutil.ltrimstr( A11813EstEspBef, 5, 2));
         A11814EstEspBSt = T01I85_A11814EstEspBSt[0] ;
         n11814EstEspBSt = T01I85_n11814EstEspBSt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11814EstEspBSt", GXutil.str( A11814EstEspBSt, 1, 0));
         A11815EstEspAft = T01I85_A11815EstEspAft[0] ;
         n11815EstEspAft = T01I85_n11815EstEspAft[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11815EstEspAft", GXutil.ltrimstr( A11815EstEspAft, 5, 2));
         A11816EstEspASt = T01I85_A11816EstEspASt[0] ;
         n11816EstEspASt = T01I85_n11816EstEspASt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11816EstEspASt", GXutil.str( A11816EstEspASt, 1, 0));
         A11818EstTpLv = T01I85_A11818EstTpLv[0] ;
         n11818EstTpLv = T01I85_n11818EstTpLv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11818EstTpLv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11818EstTpLv), 4, 0));
         A11819EstMet = T01I85_A11819EstMet[0] ;
         n11819EstMet = T01I85_n11819EstMet[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11819EstMet", A11819EstMet);
         A11820EstDimGrm3 = T01I85_A11820EstDimGrm3[0] ;
         n11820EstDimGrm3 = T01I85_n11820EstDimGrm3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11820EstDimGrm3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11820EstDimGrm3), 3, 0));
         A11919EstMetod3 = T01I85_A11919EstMetod3[0] ;
         n11919EstMetod3 = T01I85_n11919EstMetod3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11919EstMetod3", A11919EstMetod3);
         A11920EstMetod2 = T01I85_A11920EstMetod2[0] ;
         n11920EstMetod2 = T01I85_n11920EstMetod2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11920EstMetod2", A11920EstMetod2);
         A11921EstMetod1 = T01I85_A11921EstMetod1[0] ;
         n11921EstMetod1 = T01I85_n11921EstMetod1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11921EstMetod1", A11921EstMetod1);
         A11927EstDimGrm1 = T01I85_A11927EstDimGrm1[0] ;
         n11927EstDimGrm1 = T01I85_n11927EstDimGrm1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11927EstDimGrm1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11927EstDimGrm1), 3, 0));
         A129BarCod = T01I85_A129BarCod[0] ;
         n129BarCod = T01I85_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01I85_A132BarCodReo[0] ;
         n132BarCodReo = T01I85_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01I85_A130BarCodPar[0] ;
         n130BarCodPar = T01I85_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A652OpeCod = T01I85_A652OpeCod[0] ;
         n652OpeCod = T01I85_n652OpeCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z1333EstDimCod = A1333EstDimCod ;
         sMode186 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1I8186( ) ;
         if ( AnyError == 1 )
         {
            RcdFound186 = (short)(0) ;
            initializeNonKey1I8186( ) ;
         }
         Gx_mode = sMode186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound186 = (short)(0) ;
         initializeNonKey1I8186( ) ;
         sMode186 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode186 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1I8186( ) ;
      if ( RcdFound186 == 0 )
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
      RcdFound186 = (short)(0) ;
      /* Using cursor T01I813 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A1333EstDimCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T01I813_A1333EstDimCod[0] < A1333EstDimCod ) ) && ( GXutil.strcmp(T01I813_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T01I813_A1333EstDimCod[0] > A1333EstDimCod ) ) && ( GXutil.strcmp(T01I813_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1333EstDimCod = T01I813_A1333EstDimCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
            RcdFound186 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound186 = (short)(0) ;
      /* Using cursor T01I814 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A1333EstDimCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T01I814_A1333EstDimCod[0] > A1333EstDimCod ) ) && ( GXutil.strcmp(T01I814_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T01I814_A1333EstDimCod[0] < A1333EstDimCod ) ) && ( GXutil.strcmp(T01I814_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1333EstDimCod = T01I814_A1333EstDimCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
            RcdFound186 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1I8186( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEstDimCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1I8186( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound186 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
            {
               A1333EstDimCod = Z1333EstDimCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEstDimCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1I8186( ) ;
               GX_FocusControl = edtEstDimCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEstDimCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1I8186( ) ;
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
                  GX_FocusControl = edtEstDimCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1I8186( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
      {
         A1333EstDimCod = Z1333EstDimCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEstDimCod_Internalname ;
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
      getKey1I8186( ) ;
      if ( RcdFound186 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
         {
            A1333EstDimCod = Z1333EstDimCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1333EstDimCod != Z1333EstDimCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tpdimest");
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1I80( ) ;
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
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1I8186( ) ;
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1I8186( ) ;
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
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStart1I8186( ) ;
      if ( RcdFound186 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound186 != 0 )
         {
            scanNext1I8186( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1I8186( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1I8186( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01I84 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESDIM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z1340EstDimMat, T01I84_A1340EstDimMat[0]) != 0 ) || ( GXutil.strcmp(Z1342EstDimSer, T01I84_A1342EstDimSer[0]) != 0 ) || ( Z1343EstDimTip != T01I84_A1343EstDimTip[0] ) || ( GXutil.strcmp(Z1334EstDimDisN, T01I84_A1334EstDimDisN[0]) != 0 ) || ( Z3155EstDimAni != T01I84_A3155EstDimAni[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3156EstDimGmi != T01I84_A3156EstDimGmi[0] ) || ( GXutil.strcmp(Z1330EstColNom, T01I84_A1330EstColNom[0]) != 0 ) || ( Z1331EstColNum != T01I84_A1331EstColNum[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z1337EstDimFec), GXutil.resetTime(T01I84_A1337EstDimFec[0])) ) || ( Z1332EstDimAnc != T01I84_A1332EstDimAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3157EstDimNor, T01I84_A3157EstDimNor[0]) != 0 ) || ( GXutil.strcmp(Z3158EstDimMaq, T01I84_A3158EstDimMaq[0]) != 0 ) || ( GXutil.strcmp(Z3159EstDimTAc, T01I84_A3159EstDimTAc[0]) != 0 ) || ( Z3160EstDimMan != T01I84_A3160EstDimMan[0] ) || ( Z3161EstDimPal != T01I84_A3161EstDimPal[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3162EstDimEsp, T01I84_A3162EstDimEsp[0]) != 0 ) || ( GXutil.strcmp(Z3163EstDimTN, T01I84_A3163EstDimTN[0]) != 0 ) || ( Z1328EstCliCod != T01I84_A1328EstCliCod[0] ) || ( GXutil.strcmp(Z1329EstCliNom, T01I84_A1329EstCliNom[0]) != 0 ) || ( DecimalUtil.compareTo(Z1335EstDimEncA, T01I84_A1335EstDimEncA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1336EstDimEncL, T01I84_A1336EstDimEncL[0]) != 0 ) || ( Z1338EstDimGrm2 != T01I84_A1338EstDimGrm2[0] ) || ( Z1344EstDimUlin != T01I84_A1344EstDimUlin[0] ) || ( GXutil.strcmp(Z3164EstDimRef, T01I84_A3164EstDimRef[0]) != 0 ) || ( Z3737EstSanfAnc != T01I84_A3737EstSanfAnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z3738EstSanfGrm != T01I84_A3738EstSanfGrm[0] ) || ( Z3739EstCalAnc != T01I84_A3739EstCalAnc[0] ) || ( Z3740EstCalGrm != T01I84_A3740EstCalGrm[0] ) || ( Z3741EstRamAnc != T01I84_A3741EstRamAnc[0] ) || ( Z3742EstRamGrm != T01I84_A3742EstRamGrm[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z3743EstNorEsp, T01I84_A3743EstNorEsp[0]) != 0 ) || ( DecimalUtil.compareTo(Z3872EstSanfEA, T01I84_A3872EstSanfEA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3873EstSanfEL, T01I84_A3873EstSanfEL[0]) != 0 ) || ( DecimalUtil.compareTo(Z3874EstCalEA, T01I84_A3874EstCalEA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3875EstCalEL, T01I84_A3875EstCalEL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3876EstRamEA, T01I84_A3876EstRamEA[0]) != 0 ) || ( DecimalUtil.compareTo(Z3877EstRamEL, T01I84_A3877EstRamEL[0]) != 0 ) || ( GXutil.strcmp(Z10977EstInclin, T01I84_A10977EstInclin[0]) != 0 ) || ( GXutil.strcmp(Z11806EstRqMnL, T01I84_A11806EstRqMnL[0]) != 0 ) || ( GXutil.strcmp(Z11807EstRqMnC, T01I84_A11807EstRqMnC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11808EstEncASt != T01I84_A11808EstEncASt[0] ) || ( Z11809EstEncLSt != T01I84_A11809EstEncLSt[0] ) || ( GXutil.strcmp(Z11810EstRqMnG, T01I84_A11810EstRqMnG[0]) != 0 ) || ( Z11811EstAvGr != T01I84_A11811EstAvGr[0] ) || ( GXutil.strcmp(Z11812EstRqMnE, T01I84_A11812EstRqMnE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z11813EstEspBef, T01I84_A11813EstEspBef[0]) != 0 ) || ( Z11814EstEspBSt != T01I84_A11814EstEspBSt[0] ) || ( DecimalUtil.compareTo(Z11815EstEspAft, T01I84_A11815EstEspAft[0]) != 0 ) || ( Z11816EstEspASt != T01I84_A11816EstEspASt[0] ) || ( Z11818EstTpLv != T01I84_A11818EstTpLv[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11819EstMet, T01I84_A11819EstMet[0]) != 0 ) || ( Z11820EstDimGrm3 != T01I84_A11820EstDimGrm3[0] ) || ( GXutil.strcmp(Z11919EstMetod3, T01I84_A11919EstMetod3[0]) != 0 ) || ( GXutil.strcmp(Z11920EstMetod2, T01I84_A11920EstMetod2[0]) != 0 ) || ( GXutil.strcmp(Z11921EstMetod1, T01I84_A11921EstMetod1[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11927EstDimGrm1 != T01I84_A11927EstDimGrm1[0] ) || ( Z129BarCod != T01I84_A129BarCod[0] ) || ( Z132BarCodReo != T01I84_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01I84_A130BarCodPar[0]) != 0 ) || ( Z652OpeCod != T01I84_A652OpeCod[0] ) )
         {
            if ( GXutil.strcmp(Z1340EstDimMat, T01I84_A1340EstDimMat[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimMat");
               GXutil.writeLogRaw("Old: ",Z1340EstDimMat);
               GXutil.writeLogRaw("Current: ",T01I84_A1340EstDimMat[0]);
            }
            if ( GXutil.strcmp(Z1342EstDimSer, T01I84_A1342EstDimSer[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimSer");
               GXutil.writeLogRaw("Old: ",Z1342EstDimSer);
               GXutil.writeLogRaw("Current: ",T01I84_A1342EstDimSer[0]);
            }
            if ( Z1343EstDimTip != T01I84_A1343EstDimTip[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimTip");
               GXutil.writeLogRaw("Old: ",Z1343EstDimTip);
               GXutil.writeLogRaw("Current: ",T01I84_A1343EstDimTip[0]);
            }
            if ( GXutil.strcmp(Z1334EstDimDisN, T01I84_A1334EstDimDisN[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimDisN");
               GXutil.writeLogRaw("Old: ",Z1334EstDimDisN);
               GXutil.writeLogRaw("Current: ",T01I84_A1334EstDimDisN[0]);
            }
            if ( Z3155EstDimAni != T01I84_A3155EstDimAni[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimAni");
               GXutil.writeLogRaw("Old: ",Z3155EstDimAni);
               GXutil.writeLogRaw("Current: ",T01I84_A3155EstDimAni[0]);
            }
            if ( Z3156EstDimGmi != T01I84_A3156EstDimGmi[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimGmi");
               GXutil.writeLogRaw("Old: ",Z3156EstDimGmi);
               GXutil.writeLogRaw("Current: ",T01I84_A3156EstDimGmi[0]);
            }
            if ( GXutil.strcmp(Z1330EstColNom, T01I84_A1330EstColNom[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstColNom");
               GXutil.writeLogRaw("Old: ",Z1330EstColNom);
               GXutil.writeLogRaw("Current: ",T01I84_A1330EstColNom[0]);
            }
            if ( Z1331EstColNum != T01I84_A1331EstColNum[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstColNum");
               GXutil.writeLogRaw("Old: ",Z1331EstColNum);
               GXutil.writeLogRaw("Current: ",T01I84_A1331EstColNum[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z1337EstDimFec), GXutil.resetTime(T01I84_A1337EstDimFec[0])) ) )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimFec");
               GXutil.writeLogRaw("Old: ",Z1337EstDimFec);
               GXutil.writeLogRaw("Current: ",T01I84_A1337EstDimFec[0]);
            }
            if ( Z1332EstDimAnc != T01I84_A1332EstDimAnc[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimAnc");
               GXutil.writeLogRaw("Old: ",Z1332EstDimAnc);
               GXutil.writeLogRaw("Current: ",T01I84_A1332EstDimAnc[0]);
            }
            if ( GXutil.strcmp(Z3157EstDimNor, T01I84_A3157EstDimNor[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimNor");
               GXutil.writeLogRaw("Old: ",Z3157EstDimNor);
               GXutil.writeLogRaw("Current: ",T01I84_A3157EstDimNor[0]);
            }
            if ( GXutil.strcmp(Z3158EstDimMaq, T01I84_A3158EstDimMaq[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimMaq");
               GXutil.writeLogRaw("Old: ",Z3158EstDimMaq);
               GXutil.writeLogRaw("Current: ",T01I84_A3158EstDimMaq[0]);
            }
            if ( GXutil.strcmp(Z3159EstDimTAc, T01I84_A3159EstDimTAc[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimTAc");
               GXutil.writeLogRaw("Old: ",Z3159EstDimTAc);
               GXutil.writeLogRaw("Current: ",T01I84_A3159EstDimTAc[0]);
            }
            if ( Z3160EstDimMan != T01I84_A3160EstDimMan[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimMan");
               GXutil.writeLogRaw("Old: ",Z3160EstDimMan);
               GXutil.writeLogRaw("Current: ",T01I84_A3160EstDimMan[0]);
            }
            if ( Z3161EstDimPal != T01I84_A3161EstDimPal[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimPal");
               GXutil.writeLogRaw("Old: ",Z3161EstDimPal);
               GXutil.writeLogRaw("Current: ",T01I84_A3161EstDimPal[0]);
            }
            if ( DecimalUtil.compareTo(Z3162EstDimEsp, T01I84_A3162EstDimEsp[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimEsp");
               GXutil.writeLogRaw("Old: ",Z3162EstDimEsp);
               GXutil.writeLogRaw("Current: ",T01I84_A3162EstDimEsp[0]);
            }
            if ( GXutil.strcmp(Z3163EstDimTN, T01I84_A3163EstDimTN[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimTN");
               GXutil.writeLogRaw("Old: ",Z3163EstDimTN);
               GXutil.writeLogRaw("Current: ",T01I84_A3163EstDimTN[0]);
            }
            if ( Z1328EstCliCod != T01I84_A1328EstCliCod[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstCliCod");
               GXutil.writeLogRaw("Old: ",Z1328EstCliCod);
               GXutil.writeLogRaw("Current: ",T01I84_A1328EstCliCod[0]);
            }
            if ( GXutil.strcmp(Z1329EstCliNom, T01I84_A1329EstCliNom[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstCliNom");
               GXutil.writeLogRaw("Old: ",Z1329EstCliNom);
               GXutil.writeLogRaw("Current: ",T01I84_A1329EstCliNom[0]);
            }
            if ( DecimalUtil.compareTo(Z1335EstDimEncA, T01I84_A1335EstDimEncA[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimEncA");
               GXutil.writeLogRaw("Old: ",Z1335EstDimEncA);
               GXutil.writeLogRaw("Current: ",T01I84_A1335EstDimEncA[0]);
            }
            if ( DecimalUtil.compareTo(Z1336EstDimEncL, T01I84_A1336EstDimEncL[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimEncL");
               GXutil.writeLogRaw("Old: ",Z1336EstDimEncL);
               GXutil.writeLogRaw("Current: ",T01I84_A1336EstDimEncL[0]);
            }
            if ( Z1338EstDimGrm2 != T01I84_A1338EstDimGrm2[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimGrm2");
               GXutil.writeLogRaw("Old: ",Z1338EstDimGrm2);
               GXutil.writeLogRaw("Current: ",T01I84_A1338EstDimGrm2[0]);
            }
            if ( Z1344EstDimUlin != T01I84_A1344EstDimUlin[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimUlin");
               GXutil.writeLogRaw("Old: ",Z1344EstDimUlin);
               GXutil.writeLogRaw("Current: ",T01I84_A1344EstDimUlin[0]);
            }
            if ( GXutil.strcmp(Z3164EstDimRef, T01I84_A3164EstDimRef[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimRef");
               GXutil.writeLogRaw("Old: ",Z3164EstDimRef);
               GXutil.writeLogRaw("Current: ",T01I84_A3164EstDimRef[0]);
            }
            if ( Z3737EstSanfAnc != T01I84_A3737EstSanfAnc[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstSanfAnc");
               GXutil.writeLogRaw("Old: ",Z3737EstSanfAnc);
               GXutil.writeLogRaw("Current: ",T01I84_A3737EstSanfAnc[0]);
            }
            if ( Z3738EstSanfGrm != T01I84_A3738EstSanfGrm[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstSanfGrm");
               GXutil.writeLogRaw("Old: ",Z3738EstSanfGrm);
               GXutil.writeLogRaw("Current: ",T01I84_A3738EstSanfGrm[0]);
            }
            if ( Z3739EstCalAnc != T01I84_A3739EstCalAnc[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstCalAnc");
               GXutil.writeLogRaw("Old: ",Z3739EstCalAnc);
               GXutil.writeLogRaw("Current: ",T01I84_A3739EstCalAnc[0]);
            }
            if ( Z3740EstCalGrm != T01I84_A3740EstCalGrm[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstCalGrm");
               GXutil.writeLogRaw("Old: ",Z3740EstCalGrm);
               GXutil.writeLogRaw("Current: ",T01I84_A3740EstCalGrm[0]);
            }
            if ( Z3741EstRamAnc != T01I84_A3741EstRamAnc[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRamAnc");
               GXutil.writeLogRaw("Old: ",Z3741EstRamAnc);
               GXutil.writeLogRaw("Current: ",T01I84_A3741EstRamAnc[0]);
            }
            if ( Z3742EstRamGrm != T01I84_A3742EstRamGrm[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRamGrm");
               GXutil.writeLogRaw("Old: ",Z3742EstRamGrm);
               GXutil.writeLogRaw("Current: ",T01I84_A3742EstRamGrm[0]);
            }
            if ( GXutil.strcmp(Z3743EstNorEsp, T01I84_A3743EstNorEsp[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstNorEsp");
               GXutil.writeLogRaw("Old: ",Z3743EstNorEsp);
               GXutil.writeLogRaw("Current: ",T01I84_A3743EstNorEsp[0]);
            }
            if ( DecimalUtil.compareTo(Z3872EstSanfEA, T01I84_A3872EstSanfEA[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstSanfEA");
               GXutil.writeLogRaw("Old: ",Z3872EstSanfEA);
               GXutil.writeLogRaw("Current: ",T01I84_A3872EstSanfEA[0]);
            }
            if ( DecimalUtil.compareTo(Z3873EstSanfEL, T01I84_A3873EstSanfEL[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstSanfEL");
               GXutil.writeLogRaw("Old: ",Z3873EstSanfEL);
               GXutil.writeLogRaw("Current: ",T01I84_A3873EstSanfEL[0]);
            }
            if ( DecimalUtil.compareTo(Z3874EstCalEA, T01I84_A3874EstCalEA[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstCalEA");
               GXutil.writeLogRaw("Old: ",Z3874EstCalEA);
               GXutil.writeLogRaw("Current: ",T01I84_A3874EstCalEA[0]);
            }
            if ( DecimalUtil.compareTo(Z3875EstCalEL, T01I84_A3875EstCalEL[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstCalEL");
               GXutil.writeLogRaw("Old: ",Z3875EstCalEL);
               GXutil.writeLogRaw("Current: ",T01I84_A3875EstCalEL[0]);
            }
            if ( DecimalUtil.compareTo(Z3876EstRamEA, T01I84_A3876EstRamEA[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRamEA");
               GXutil.writeLogRaw("Old: ",Z3876EstRamEA);
               GXutil.writeLogRaw("Current: ",T01I84_A3876EstRamEA[0]);
            }
            if ( DecimalUtil.compareTo(Z3877EstRamEL, T01I84_A3877EstRamEL[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRamEL");
               GXutil.writeLogRaw("Old: ",Z3877EstRamEL);
               GXutil.writeLogRaw("Current: ",T01I84_A3877EstRamEL[0]);
            }
            if ( GXutil.strcmp(Z10977EstInclin, T01I84_A10977EstInclin[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstInclin");
               GXutil.writeLogRaw("Old: ",Z10977EstInclin);
               GXutil.writeLogRaw("Current: ",T01I84_A10977EstInclin[0]);
            }
            if ( GXutil.strcmp(Z11806EstRqMnL, T01I84_A11806EstRqMnL[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRqMnL");
               GXutil.writeLogRaw("Old: ",Z11806EstRqMnL);
               GXutil.writeLogRaw("Current: ",T01I84_A11806EstRqMnL[0]);
            }
            if ( GXutil.strcmp(Z11807EstRqMnC, T01I84_A11807EstRqMnC[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRqMnC");
               GXutil.writeLogRaw("Old: ",Z11807EstRqMnC);
               GXutil.writeLogRaw("Current: ",T01I84_A11807EstRqMnC[0]);
            }
            if ( Z11808EstEncASt != T01I84_A11808EstEncASt[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstEncASt");
               GXutil.writeLogRaw("Old: ",Z11808EstEncASt);
               GXutil.writeLogRaw("Current: ",T01I84_A11808EstEncASt[0]);
            }
            if ( Z11809EstEncLSt != T01I84_A11809EstEncLSt[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstEncLSt");
               GXutil.writeLogRaw("Old: ",Z11809EstEncLSt);
               GXutil.writeLogRaw("Current: ",T01I84_A11809EstEncLSt[0]);
            }
            if ( GXutil.strcmp(Z11810EstRqMnG, T01I84_A11810EstRqMnG[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRqMnG");
               GXutil.writeLogRaw("Old: ",Z11810EstRqMnG);
               GXutil.writeLogRaw("Current: ",T01I84_A11810EstRqMnG[0]);
            }
            if ( Z11811EstAvGr != T01I84_A11811EstAvGr[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstAvGr");
               GXutil.writeLogRaw("Old: ",Z11811EstAvGr);
               GXutil.writeLogRaw("Current: ",T01I84_A11811EstAvGr[0]);
            }
            if ( GXutil.strcmp(Z11812EstRqMnE, T01I84_A11812EstRqMnE[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstRqMnE");
               GXutil.writeLogRaw("Old: ",Z11812EstRqMnE);
               GXutil.writeLogRaw("Current: ",T01I84_A11812EstRqMnE[0]);
            }
            if ( DecimalUtil.compareTo(Z11813EstEspBef, T01I84_A11813EstEspBef[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstEspBef");
               GXutil.writeLogRaw("Old: ",Z11813EstEspBef);
               GXutil.writeLogRaw("Current: ",T01I84_A11813EstEspBef[0]);
            }
            if ( Z11814EstEspBSt != T01I84_A11814EstEspBSt[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstEspBSt");
               GXutil.writeLogRaw("Old: ",Z11814EstEspBSt);
               GXutil.writeLogRaw("Current: ",T01I84_A11814EstEspBSt[0]);
            }
            if ( DecimalUtil.compareTo(Z11815EstEspAft, T01I84_A11815EstEspAft[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstEspAft");
               GXutil.writeLogRaw("Old: ",Z11815EstEspAft);
               GXutil.writeLogRaw("Current: ",T01I84_A11815EstEspAft[0]);
            }
            if ( Z11816EstEspASt != T01I84_A11816EstEspASt[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstEspASt");
               GXutil.writeLogRaw("Old: ",Z11816EstEspASt);
               GXutil.writeLogRaw("Current: ",T01I84_A11816EstEspASt[0]);
            }
            if ( Z11818EstTpLv != T01I84_A11818EstTpLv[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstTpLv");
               GXutil.writeLogRaw("Old: ",Z11818EstTpLv);
               GXutil.writeLogRaw("Current: ",T01I84_A11818EstTpLv[0]);
            }
            if ( GXutil.strcmp(Z11819EstMet, T01I84_A11819EstMet[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstMet");
               GXutil.writeLogRaw("Old: ",Z11819EstMet);
               GXutil.writeLogRaw("Current: ",T01I84_A11819EstMet[0]);
            }
            if ( Z11820EstDimGrm3 != T01I84_A11820EstDimGrm3[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimGrm3");
               GXutil.writeLogRaw("Old: ",Z11820EstDimGrm3);
               GXutil.writeLogRaw("Current: ",T01I84_A11820EstDimGrm3[0]);
            }
            if ( GXutil.strcmp(Z11919EstMetod3, T01I84_A11919EstMetod3[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstMetod3");
               GXutil.writeLogRaw("Old: ",Z11919EstMetod3);
               GXutil.writeLogRaw("Current: ",T01I84_A11919EstMetod3[0]);
            }
            if ( GXutil.strcmp(Z11920EstMetod2, T01I84_A11920EstMetod2[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstMetod2");
               GXutil.writeLogRaw("Old: ",Z11920EstMetod2);
               GXutil.writeLogRaw("Current: ",T01I84_A11920EstMetod2[0]);
            }
            if ( GXutil.strcmp(Z11921EstMetod1, T01I84_A11921EstMetod1[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstMetod1");
               GXutil.writeLogRaw("Old: ",Z11921EstMetod1);
               GXutil.writeLogRaw("Current: ",T01I84_A11921EstMetod1[0]);
            }
            if ( Z11927EstDimGrm1 != T01I84_A11927EstDimGrm1[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimGrm1");
               GXutil.writeLogRaw("Old: ",Z11927EstDimGrm1);
               GXutil.writeLogRaw("Current: ",T01I84_A11927EstDimGrm1[0]);
            }
            if ( Z129BarCod != T01I84_A129BarCod[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01I84_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01I84_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01I84_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01I84_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01I84_A130BarCodPar[0]);
            }
            if ( Z652OpeCod != T01I84_A652OpeCod[0] )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"OpeCod");
               GXutil.writeLogRaw("Old: ",Z652OpeCod);
               GXutil.writeLogRaw("Current: ",T01I84_A652OpeCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCESDIM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1I8186( )
   {
      beforeValidate1I8186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I8186( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1I8186( 0) ;
         checkOptimisticConcurrency1I8186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I8186( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1I8186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01I815 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A1333EstDimCod), Boolean.valueOf(n1340EstDimMat), A1340EstDimMat, Boolean.valueOf(n1342EstDimSer), A1342EstDimSer, Boolean.valueOf(n1343EstDimTip), Short.valueOf(A1343EstDimTip), Boolean.valueOf(n1334EstDimDisN), A1334EstDimDisN, Boolean.valueOf(n3155EstDimAni), Short.valueOf(A3155EstDimAni), Boolean.valueOf(n3156EstDimGmi), Short.valueOf(A3156EstDimGmi), Boolean.valueOf(n1330EstColNom), A1330EstColNom, Boolean.valueOf(n1331EstColNum), Integer.valueOf(A1331EstColNum), Boolean.valueOf(n1337EstDimFec), A1337EstDimFec, Boolean.valueOf(n1332EstDimAnc), Short.valueOf(A1332EstDimAnc), Boolean.valueOf(n3157EstDimNor), A3157EstDimNor, Boolean.valueOf(n3158EstDimMaq), A3158EstDimMaq, Boolean.valueOf(n3159EstDimTAc), A3159EstDimTAc, Boolean.valueOf(n3160EstDimMan), Byte.valueOf(A3160EstDimMan), Boolean.valueOf(n3161EstDimPal), Byte.valueOf(A3161EstDimPal), Boolean.valueOf(n3162EstDimEsp), A3162EstDimEsp, Boolean.valueOf(n3163EstDimTN), A3163EstDimTN, Boolean.valueOf(n1328EstCliCod), Integer.valueOf(A1328EstCliCod), Boolean.valueOf(n1329EstCliNom), A1329EstCliNom, Boolean.valueOf(n1335EstDimEncA), A1335EstDimEncA, Boolean.valueOf(n1336EstDimEncL), A1336EstDimEncL, Boolean.valueOf(n1338EstDimGrm2), Short.valueOf(A1338EstDimGrm2), Boolean.valueOf(n1344EstDimUlin), Byte.valueOf(A1344EstDimUlin), Boolean.valueOf(n3164EstDimRef), A3164EstDimRef, Boolean.valueOf(n3737EstSanfAnc), Short.valueOf(A3737EstSanfAnc), Boolean.valueOf(n3738EstSanfGrm), Short.valueOf(A3738EstSanfGrm), Boolean.valueOf(n3739EstCalAnc), Short.valueOf(A3739EstCalAnc), Boolean.valueOf(n3740EstCalGrm), Short.valueOf(A3740EstCalGrm), Boolean.valueOf(n3741EstRamAnc), Short.valueOf(A3741EstRamAnc), Boolean.valueOf(n3742EstRamGrm), Short.valueOf(A3742EstRamGrm), Boolean.valueOf(n3743EstNorEsp), A3743EstNorEsp, Boolean.valueOf(n3872EstSanfEA), A3872EstSanfEA, Boolean.valueOf(n3873EstSanfEL), A3873EstSanfEL, Boolean.valueOf(n3874EstCalEA), A3874EstCalEA, Boolean.valueOf(n3875EstCalEL), A3875EstCalEL, Boolean.valueOf(n3876EstRamEA), A3876EstRamEA, Boolean.valueOf(n3877EstRamEL), A3877EstRamEL, Boolean.valueOf(n10977EstInclin), A10977EstInclin, Boolean.valueOf(n11806EstRqMnL), A11806EstRqMnL, Boolean.valueOf(n11807EstRqMnC), A11807EstRqMnC, Boolean.valueOf(n11808EstEncASt), Byte.valueOf(A11808EstEncASt), Boolean.valueOf(n11809EstEncLSt), Byte.valueOf(A11809EstEncLSt), Boolean.valueOf(n11810EstRqMnG), A11810EstRqMnG, Boolean.valueOf(n11811EstAvGr), Byte.valueOf(A11811EstAvGr), Boolean.valueOf(n11812EstRqMnE), A11812EstRqMnE, Boolean.valueOf(n11813EstEspBef), A11813EstEspBef, Boolean.valueOf(n11814EstEspBSt), Byte.valueOf(A11814EstEspBSt), Boolean.valueOf(n11815EstEspAft), A11815EstEspAft, Boolean.valueOf(n11816EstEspASt), Byte.valueOf(A11816EstEspASt), Boolean.valueOf(n11818EstTpLv), Short.valueOf(A11818EstTpLv), Boolean.valueOf(n11819EstMet), A11819EstMet, Boolean.valueOf(n11820EstDimGrm3), Short.valueOf(A11820EstDimGrm3), Boolean.valueOf(n11919EstMetod3), A11919EstMetod3, Boolean.valueOf(n11920EstMetod2), A11920EstMetod2, Boolean.valueOf(n11921EstMetod1), A11921EstMetod1, Boolean.valueOf(n11927EstDimGrm1), Short.valueOf(A11927EstDimGrm1), A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)})
                  ;
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESDIM");
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
                        processLevel1I8186( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1I80( ) ;
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
            load1I8186( ) ;
         }
         endLevel1I8186( ) ;
      }
      closeExtendedTableCursors1I8186( ) ;
   }

   public void update1I8186( )
   {
      beforeValidate1I8186( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I8186( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I8186( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I8186( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1I8186( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01I816 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n1340EstDimMat), A1340EstDimMat, Boolean.valueOf(n1342EstDimSer), A1342EstDimSer, Boolean.valueOf(n1343EstDimTip), Short.valueOf(A1343EstDimTip), Boolean.valueOf(n1334EstDimDisN), A1334EstDimDisN, Boolean.valueOf(n3155EstDimAni), Short.valueOf(A3155EstDimAni), Boolean.valueOf(n3156EstDimGmi), Short.valueOf(A3156EstDimGmi), Boolean.valueOf(n1330EstColNom), A1330EstColNom, Boolean.valueOf(n1331EstColNum), Integer.valueOf(A1331EstColNum), Boolean.valueOf(n1337EstDimFec), A1337EstDimFec, Boolean.valueOf(n1332EstDimAnc), Short.valueOf(A1332EstDimAnc), Boolean.valueOf(n3157EstDimNor), A3157EstDimNor, Boolean.valueOf(n3158EstDimMaq), A3158EstDimMaq, Boolean.valueOf(n3159EstDimTAc), A3159EstDimTAc, Boolean.valueOf(n3160EstDimMan), Byte.valueOf(A3160EstDimMan), Boolean.valueOf(n3161EstDimPal), Byte.valueOf(A3161EstDimPal), Boolean.valueOf(n3162EstDimEsp), A3162EstDimEsp, Boolean.valueOf(n3163EstDimTN), A3163EstDimTN, Boolean.valueOf(n1328EstCliCod), Integer.valueOf(A1328EstCliCod), Boolean.valueOf(n1329EstCliNom), A1329EstCliNom, Boolean.valueOf(n1335EstDimEncA), A1335EstDimEncA, Boolean.valueOf(n1336EstDimEncL), A1336EstDimEncL, Boolean.valueOf(n1338EstDimGrm2), Short.valueOf(A1338EstDimGrm2), Boolean.valueOf(n1344EstDimUlin), Byte.valueOf(A1344EstDimUlin), Boolean.valueOf(n3164EstDimRef), A3164EstDimRef, Boolean.valueOf(n3737EstSanfAnc), Short.valueOf(A3737EstSanfAnc), Boolean.valueOf(n3738EstSanfGrm), Short.valueOf(A3738EstSanfGrm), Boolean.valueOf(n3739EstCalAnc), Short.valueOf(A3739EstCalAnc), Boolean.valueOf(n3740EstCalGrm), Short.valueOf(A3740EstCalGrm), Boolean.valueOf(n3741EstRamAnc), Short.valueOf(A3741EstRamAnc), Boolean.valueOf(n3742EstRamGrm), Short.valueOf(A3742EstRamGrm), Boolean.valueOf(n3743EstNorEsp), A3743EstNorEsp, Boolean.valueOf(n3872EstSanfEA), A3872EstSanfEA, Boolean.valueOf(n3873EstSanfEL), A3873EstSanfEL, Boolean.valueOf(n3874EstCalEA), A3874EstCalEA, Boolean.valueOf(n3875EstCalEL), A3875EstCalEL, Boolean.valueOf(n3876EstRamEA), A3876EstRamEA, Boolean.valueOf(n3877EstRamEL), A3877EstRamEL, Boolean.valueOf(n10977EstInclin), A10977EstInclin, Boolean.valueOf(n11806EstRqMnL), A11806EstRqMnL, Boolean.valueOf(n11807EstRqMnC), A11807EstRqMnC, Boolean.valueOf(n11808EstEncASt), Byte.valueOf(A11808EstEncASt), Boolean.valueOf(n11809EstEncLSt), Byte.valueOf(A11809EstEncLSt), Boolean.valueOf(n11810EstRqMnG), A11810EstRqMnG, Boolean.valueOf(n11811EstAvGr), Byte.valueOf(A11811EstAvGr), Boolean.valueOf(n11812EstRqMnE), A11812EstRqMnE, Boolean.valueOf(n11813EstEspBef), A11813EstEspBef, Boolean.valueOf(n11814EstEspBSt), Byte.valueOf(A11814EstEspBSt), Boolean.valueOf(n11815EstEspAft), A11815EstEspAft, Boolean.valueOf(n11816EstEspASt), Byte.valueOf(A11816EstEspASt), Boolean.valueOf(n11818EstTpLv), Short.valueOf(A11818EstTpLv), Boolean.valueOf(n11819EstMet), A11819EstMet, Boolean.valueOf(n11820EstDimGrm3), Short.valueOf(A11820EstDimGrm3), Boolean.valueOf(n11919EstMetod3), A11919EstMetod3, Boolean.valueOf(n11920EstMetod2), A11920EstMetod2, Boolean.valueOf(n11921EstMetod1), A11921EstMetod1, Boolean.valueOf(n11927EstDimGrm1), Short.valueOf(A11927EstDimGrm1), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(A1333EstDimCod)})
                  ;
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESDIM");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCESDIM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1I8186( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1I8186( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1I80( ) ;
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
         endLevel1I8186( ) ;
      }
      closeExtendedTableCursors1I8186( ) ;
   }

   public void deferredUpdate1I8186( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1I8186( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I8186( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1I8186( ) ;
         afterConfirm1I8186( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1I8186( ) ;
            if ( AnyError == 0 )
            {
               scanStart1I8187( ) ;
               while ( RcdFound187 != 0 )
               {
                  getByPrimaryKey1I8187( ) ;
                  delete1I8187( ) ;
                  scanNext1I8187( ) ;
               }
               scanEnd1I8187( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01I817 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCESDIM");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound186 == 0 )
                        {
                           initAll1I8186( ) ;
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
                        resetCaption1I80( ) ;
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
      sMode186 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1I8186( ) ;
      Gx_mode = sMode186 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1I8186( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01I818 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
         A653OpeNom = T01I818_A653OpeNom[0] ;
         n653OpeNom = T01I818_n653OpeNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
         pr_default.close(16);
         if ( ( A1338EstDimGrm2 == 0 ) && ( A11820EstDimGrm3 == 0 ) )
         {
            A11817EstMedia = DecimalUtil.doubleToDec(A11927EstDimGrm1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
         }
         else
         {
            if ( ( A11927EstDimGrm1 == 0 ) && ( A11820EstDimGrm3 == 0 ) )
            {
               A11817EstMedia = DecimalUtil.doubleToDec(A1338EstDimGrm2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
            }
            else
            {
               if ( ( A11927EstDimGrm1 == 0 ) && ( A1338EstDimGrm2 == 0 ) )
               {
                  A11817EstMedia = DecimalUtil.doubleToDec(A11820EstDimGrm3) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
               }
               else
               {
                  if ( ( A11927EstDimGrm1 > 0 ) && ( A1338EstDimGrm2 > 0 ) && ( A11820EstDimGrm3 == 0 ) )
                  {
                     A11817EstMedia = DecimalUtil.doubleToDec((A11927EstDimGrm1+A1338EstDimGrm2)/ (double) (2)) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                  }
                  else
                  {
                     if ( ( A11927EstDimGrm1 > 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 == 0 ) )
                     {
                        A11817EstMedia = DecimalUtil.doubleToDec((A11927EstDimGrm1+A11820EstDimGrm3)/ (double) (2)) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                     }
                     else
                     {
                        if ( ( A11927EstDimGrm1 == 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 > 0 ) )
                        {
                           A11817EstMedia = DecimalUtil.doubleToDec((A1338EstDimGrm2+A11820EstDimGrm3)/ (double) (2)) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                        }
                        else
                        {
                           if ( ( A11927EstDimGrm1 > 0 ) && ( A11820EstDimGrm3 > 0 ) && ( A1338EstDimGrm2 > 0 ) )
                           {
                              A11817EstMedia = DecimalUtil.doubleToDec((A1338EstDimGrm2+A11820EstDimGrm3+A11927EstDimGrm1)/ (double) (3)) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                           }
                           else
                           {
                              A11817EstMedia = DecimalUtil.doubleToDec(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public void processNestedLevel1I8187( )
   {
      nGXsfl_345_idx = 0 ;
      while ( nGXsfl_345_idx < nRC_GXsfl_345 )
      {
         readRow1I8187( ) ;
         if ( ( nRcdExists_187 != 0 ) || ( nIsMod_187 != 0 ) )
         {
            standaloneNotModal1I8187( ) ;
            getKey1I8187( ) ;
            if ( ( nRcdExists_187 == 0 ) && ( nRcdDeleted_187 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1I8187( ) ;
            }
            else
            {
               if ( RcdFound187 != 0 )
               {
                  if ( ( nRcdDeleted_187 != 0 ) && ( nRcdExists_187 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1I8187( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_187 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1I8187( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_187 == 0 )
                  {
                     GXCCtl = "ESTDIMLIN_" + sGXsfl_345_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEstDimLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_187_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstDimLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1339EstDimLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtEstDimObs_Internalname, GXutil.rtrim( A1341EstDimObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1339EstDimLin_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( Z1339EstDimLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1341EstDimObs_"+sGXsfl_345_idx, GXutil.rtrim( Z1341EstDimObs)) ;
         httpContext.changePostValue( "nRcdDeleted_187_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_187_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_187_"+sGXsfl_345_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_187 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_187_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_187_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTDIMLIN_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ESTDIMOBS_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1I8187( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_187 = (short)(0) ;
      nIsMod_187 = (short)(0) ;
      nRcdDeleted_187 = (short)(0) ;
   }

   public void processLevel1I8186( )
   {
      /* Save parent mode. */
      sMode186 = Gx_mode ;
      processNestedLevel1I8187( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode186 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1I8186( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1I8186( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tpdimest");
         if ( AnyError == 0 )
         {
            confirmValues1I80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tpdimest");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1I8186( )
   {
      this.A396EmprCod = A396EmprCod ;
      /* Scan By routine */
      /* Using cursor T01I819 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound186 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound186 = (short)(1) ;
         A1333EstDimCod = T01I819_A1333EstDimCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1I8186( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound186 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound186 = (short)(1) ;
         A1333EstDimCod = T01I819_A1333EstDimCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
      }
   }

   public void scanEnd1I8186( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1I8186( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1I8186( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1I8186( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1I8186( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1I8186( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1I8186( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1I8186( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEstDimCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtEstDimMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimMat_Enabled), 5, 0), true);
      edtEstDimSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimSer_Enabled), 5, 0), true);
      edtEstDimTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimTip_Enabled), 5, 0), true);
      edtEstDimDisN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimDisN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimDisN_Enabled), 5, 0), true);
      edtEstDimAni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimAni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimAni_Enabled), 5, 0), true);
      edtEstDimGmi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimGmi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimGmi_Enabled), 5, 0), true);
      edtEstColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstColNom_Enabled), 5, 0), true);
      edtEstColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstColNum_Enabled), 5, 0), true);
      edtEstDimFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimFec_Enabled), 5, 0), true);
      edtEstDimAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimAnc_Enabled), 5, 0), true);
      edtEstDimNor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimNor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimNor_Enabled), 5, 0), true);
      edtEstDimMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimMaq_Enabled), 5, 0), true);
      edtEstDimTAc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimTAc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimTAc_Enabled), 5, 0), true);
      edtEstDimMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimMan_Enabled), 5, 0), true);
      edtEstDimPal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimPal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimPal_Enabled), 5, 0), true);
      edtEstDimEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimEsp_Enabled), 5, 0), true);
      edtEstDimTN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimTN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimTN_Enabled), 5, 0), true);
      edtOpeCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeCod_Enabled), 5, 0), true);
      edtOpeNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOpeNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOpeNom_Enabled), 5, 0), true);
      edtEstCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCliCod_Enabled), 5, 0), true);
      edtEstCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCliNom_Enabled), 5, 0), true);
      edtEstDimEncA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimEncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimEncA_Enabled), 5, 0), true);
      edtEstDimEncL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimEncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimEncL_Enabled), 5, 0), true);
      edtEstDimGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimGrm2_Enabled), 5, 0), true);
      edtEstDimUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimUlin_Enabled), 5, 0), true);
      edtEstDimRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimRef_Enabled), 5, 0), true);
      edtEstSanfAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfAnc_Enabled), 5, 0), true);
      edtEstSanfGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfGrm_Enabled), 5, 0), true);
      edtEstCalAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalAnc_Enabled), 5, 0), true);
      edtEstCalGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalGrm_Enabled), 5, 0), true);
      edtEstRamAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamAnc_Enabled), 5, 0), true);
      edtEstRamGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamGrm_Enabled), 5, 0), true);
      edtEstNorEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstNorEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstNorEsp_Enabled), 5, 0), true);
      edtEstSanfEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfEA_Enabled), 5, 0), true);
      edtEstSanfEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstSanfEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstSanfEL_Enabled), 5, 0), true);
      edtEstCalEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalEA_Enabled), 5, 0), true);
      edtEstCalEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstCalEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstCalEL_Enabled), 5, 0), true);
      edtEstRamEA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamEA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamEA_Enabled), 5, 0), true);
      edtEstRamEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRamEL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRamEL_Enabled), 5, 0), true);
      edtEstInclin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstInclin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstInclin_Enabled), 5, 0), true);
      edtEstRqMnL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRqMnL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRqMnL_Enabled), 5, 0), true);
      edtEstRqMnC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRqMnC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRqMnC_Enabled), 5, 0), true);
      edtEstEncASt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEncASt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEncASt_Enabled), 5, 0), true);
      edtEstEncLSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEncLSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEncLSt_Enabled), 5, 0), true);
      edtEstRqMnG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRqMnG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRqMnG_Enabled), 5, 0), true);
      edtEstAvGr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstAvGr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstAvGr_Enabled), 5, 0), true);
      edtEstRqMnE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstRqMnE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstRqMnE_Enabled), 5, 0), true);
      edtEstEspBef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspBef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspBef_Enabled), 5, 0), true);
      edtEstEspBSt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspBSt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspBSt_Enabled), 5, 0), true);
      edtEstEspAft_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspAft_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspAft_Enabled), 5, 0), true);
      edtEstEspASt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstEspASt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstEspASt_Enabled), 5, 0), true);
      edtEstMedia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMedia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMedia_Enabled), 5, 0), true);
      edtEstTpLv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstTpLv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstTpLv_Enabled), 5, 0), true);
      edtEstMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMet_Enabled), 5, 0), true);
      edtEstDimGrm3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimGrm3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimGrm3_Enabled), 5, 0), true);
      edtEstMetod3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMetod3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMetod3_Enabled), 5, 0), true);
      edtEstMetod2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMetod2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMetod2_Enabled), 5, 0), true);
      edtEstMetod1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstMetod1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstMetod1_Enabled), 5, 0), true);
      edtEstDimGrm1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimGrm1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimGrm1_Enabled), 5, 0), true);
   }

   public void zm1I8187( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1341EstDimObs = T01I83_A1341EstDimObs[0] ;
         }
         else
         {
            Z1341EstDimObs = A1341EstDimObs ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z1333EstDimCod = A1333EstDimCod ;
         Z1339EstDimLin = A1339EstDimLin ;
         Z1341EstDimObs = A1341EstDimObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1I8187( )
   {
   }

   public void standaloneModal1I8187( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtEstDimLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstDimLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimLin_Enabled), 5, 0), !bGXsfl_345_Refreshing);
      }
      else
      {
         edtEstDimLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEstDimLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimLin_Enabled), 5, 0), !bGXsfl_345_Refreshing);
      }
   }

   public void load1I8187( )
   {
      /* Using cursor T01I820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound187 = (short)(1) ;
         A1341EstDimObs = T01I820_A1341EstDimObs[0] ;
         n1341EstDimObs = T01I820_n1341EstDimObs[0] ;
         zm1I8187( -6) ;
      }
      pr_default.close(18);
      onLoadActions1I8187( ) ;
   }

   public void onLoadActions1I8187( )
   {
   }

   public void checkExtendedTable1I8187( )
   {
      nIsDirty_187 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1I8187( ) ;
   }

   public void closeExtendedTableCursors1I8187( )
   {
   }

   public void enableDisable1I8187( )
   {
   }

   public void getKey1I8187( )
   {
      /* Using cursor T01I821 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound187 = (short)(1) ;
      }
      else
      {
         RcdFound187 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1I8187( )
   {
      /* Using cursor T01I83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01I83_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1I8187( 6) ;
         RcdFound187 = (short)(1) ;
         initializeNonKey1I8187( ) ;
         A1339EstDimLin = T01I83_A1339EstDimLin[0] ;
         A1341EstDimObs = T01I83_A1341EstDimObs[0] ;
         n1341EstDimObs = T01I83_n1341EstDimObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1333EstDimCod = A1333EstDimCod ;
         Z1339EstDimLin = A1339EstDimLin ;
         sMode187 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1I8187( ) ;
         load1I8187( ) ;
         Gx_mode = sMode187 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound187 = (short)(0) ;
         initializeNonKey1I8187( ) ;
         sMode187 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1I8187( ) ;
         Gx_mode = sMode187 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1I8187( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1I8187( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01I82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLESDIM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1341EstDimObs, T01I82_A1341EstDimObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1341EstDimObs, T01I82_A1341EstDimObs[0]) != 0 )
            {
               GXutil.writeLogln("tpdimest:[seudo value changed for attri]"+"EstDimObs");
               GXutil.writeLogRaw("Old: ",Z1341EstDimObs);
               GXutil.writeLogRaw("Current: ",T01I82_A1341EstDimObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLESDIM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1I8187( )
   {
      beforeValidate1I8187( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I8187( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1I8187( 0) ;
         checkOptimisticConcurrency1I8187( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I8187( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1I8187( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01I822 */
                  pr_default.execute(20, new Object[] {Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin), Boolean.valueOf(n1341EstDimObs), A1341EstDimObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESDIM");
                  if ( (pr_default.getStatus(20) == 1) )
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
            load1I8187( ) ;
         }
         endLevel1I8187( ) ;
      }
      closeExtendedTableCursors1I8187( ) ;
   }

   public void update1I8187( )
   {
      beforeValidate1I8187( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I8187( ) ;
      }
      if ( ( nIsMod_187 != 0 ) || ( nIsDirty_187 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1I8187( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1I8187( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1I8187( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01I823 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n1341EstDimObs), A1341EstDimObs, A396EmprCod, Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESDIM");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLESDIM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1I8187( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1I8187( ) ;
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
            endLevel1I8187( ) ;
         }
      }
      closeExtendedTableCursors1I8187( ) ;
   }

   public void deferredUpdate1I8187( )
   {
   }

   public void delete1I8187( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1I8187( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I8187( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1I8187( ) ;
         afterConfirm1I8187( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1I8187( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01I824 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod), Byte.valueOf(A1339EstDimLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLESDIM");
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
      sMode187 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1I8187( ) ;
      Gx_mode = sMode187 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1I8187( )
   {
      standaloneModal1I8187( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1I8187( )
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

   public void scanStart1I8187( )
   {
      /* Scan By routine */
      /* Using cursor T01I825 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A1333EstDimCod)});
      RcdFound187 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound187 = (short)(1) ;
         A1339EstDimLin = T01I825_A1339EstDimLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1I8187( )
   {
      /* Scan next routine */
      pr_default.readNext(23);
      RcdFound187 = (short)(0) ;
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound187 = (short)(1) ;
         A1339EstDimLin = T01I825_A1339EstDimLin[0] ;
      }
   }

   public void scanEnd1I8187( )
   {
      pr_default.close(23);
   }

   public void afterConfirm1I8187( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1I8187( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1I8187( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1I8187( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1I8187( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1I8187( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1I8187( )
   {
      edtEstDimLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimLin_Enabled), 5, 0), !bGXsfl_345_Refreshing);
      edtEstDimObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimObs_Enabled), 5, 0), !bGXsfl_345_Refreshing);
   }

   public void send_integrity_lvl_hashes1I8187( )
   {
   }

   public void send_integrity_lvl_hashes1I8186( )
   {
   }

   public void subsflControlProps_345187( )
   {
      edtavnRcdDeleted_187_Internalname = "vNRCDDELETED_187_"+sGXsfl_345_idx ;
      edtEstDimLin_Internalname = "ESTDIMLIN_"+sGXsfl_345_idx ;
      edtEstDimObs_Internalname = "ESTDIMOBS_"+sGXsfl_345_idx ;
   }

   public void subsflControlProps_fel_345187( )
   {
      edtavnRcdDeleted_187_Internalname = "vNRCDDELETED_187_"+sGXsfl_345_fel_idx ;
      edtEstDimLin_Internalname = "ESTDIMLIN_"+sGXsfl_345_fel_idx ;
      edtEstDimObs_Internalname = "ESTDIMOBS_"+sGXsfl_345_fel_idx ;
   }

   public void addRow1I8187( )
   {
      nGXsfl_345_idx = (int)(nGXsfl_345_idx+1) ;
      sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_345187( ) ;
      sendRow1I8187( ) ;
   }

   public void sendRow1I8187( )
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
         if ( ((int)((nGXsfl_345_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_187_" + sGXsfl_345_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 346,'',false,'" + sGXsfl_345_idx + "',345)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_187_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_187_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_187), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_187), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,346);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_187_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_187_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(345),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_187_" + sGXsfl_345_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 347,'',false,'" + sGXsfl_345_idx + "',345)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstDimLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1339EstDimLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1339EstDimLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,347);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstDimLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstDimLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(345),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_187_" + sGXsfl_345_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 348,'',false,'" + sGXsfl_345_idx + "',345)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEstDimObs_Internalname,GXutil.rtrim( A1341EstDimObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,348);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEstDimObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtEstDimObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(345),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1I8187( ) ;
      GXCCtl = "Z1339EstDimLin_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1339EstDimLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1341EstDimObs_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1341EstDimObs));
      GXCCtl = "nRcdDeleted_187_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_187_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_187_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_187, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCOD_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV68BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODREO_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV69BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vBARCODPAR_" + sGXsfl_345_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV70BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_187_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_187_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTDIMLIN_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ESTDIMOBS_"+sGXsfl_345_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1I8187( )
   {
      nGXsfl_345_idx = (int)(nGXsfl_345_idx+1) ;
      sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_345187( ) ;
      edtavnRcdDeleted_187_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_187_"+sGXsfl_345_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstDimLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTDIMLIN_"+sGXsfl_345_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtEstDimObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ESTDIMOBS_"+sGXsfl_345_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_187_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_187_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_187");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_187_Internalname ;
         wbErr = true ;
         nRcdDeleted_187 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_187 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_187_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtEstDimLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ESTDIMLIN_" + sGXsfl_345_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtEstDimLin_Internalname ;
         wbErr = true ;
         A1339EstDimLin = (byte)(0) ;
      }
      else
      {
         A1339EstDimLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtEstDimLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1341EstDimObs = httpContext.cgiGet( edtEstDimObs_Internalname) ;
      n1341EstDimObs = false ;
      GXCCtl = "Z1339EstDimLin_" + sGXsfl_345_idx ;
      Z1339EstDimLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1341EstDimObs_" + sGXsfl_345_idx ;
      Z1341EstDimObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_187_" + sGXsfl_345_idx ;
      nRcdDeleted_187 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_187_" + sGXsfl_345_idx ;
      nRcdExists_187 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_187_" + sGXsfl_345_idx ;
      nIsMod_187 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtEstDimLin_Enabled = edtEstDimLin_Enabled ;
   }

   public void confirmValues1I80( )
   {
      nGXsfl_345_idx = 0 ;
      sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_345187( ) ;
      while ( nGXsfl_345_idx < nRC_GXsfl_345 )
      {
         nGXsfl_345_idx = (int)(nGXsfl_345_idx+1) ;
         sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_345187( ) ;
         httpContext.changePostValue( "Z1339EstDimLin_"+sGXsfl_345_idx, httpContext.cgiGet( "ZT_"+"Z1339EstDimLin_"+sGXsfl_345_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1339EstDimLin_"+sGXsfl_345_idx) ;
         httpContext.changePostValue( "Z1341EstDimObs_"+sGXsfl_345_idx, httpContext.cgiGet( "ZT_"+"Z1341EstDimObs_"+sGXsfl_345_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1341EstDimObs_"+sGXsfl_345_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tpdimest", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV68BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV69BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV70BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1333EstDimCod", GXutil.ltrim( localUtil.ntoc( Z1333EstDimCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1340EstDimMat", GXutil.rtrim( Z1340EstDimMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1342EstDimSer", GXutil.rtrim( Z1342EstDimSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1343EstDimTip", GXutil.ltrim( localUtil.ntoc( Z1343EstDimTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1334EstDimDisN", GXutil.rtrim( Z1334EstDimDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3155EstDimAni", GXutil.ltrim( localUtil.ntoc( Z3155EstDimAni, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3156EstDimGmi", GXutil.ltrim( localUtil.ntoc( Z3156EstDimGmi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1330EstColNom", GXutil.rtrim( Z1330EstColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1331EstColNum", GXutil.ltrim( localUtil.ntoc( Z1331EstColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1337EstDimFec", localUtil.dtoc( Z1337EstDimFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1332EstDimAnc", GXutil.ltrim( localUtil.ntoc( Z1332EstDimAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3157EstDimNor", GXutil.rtrim( Z3157EstDimNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3158EstDimMaq", GXutil.rtrim( Z3158EstDimMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3159EstDimTAc", GXutil.rtrim( Z3159EstDimTAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3160EstDimMan", GXutil.ltrim( localUtil.ntoc( Z3160EstDimMan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3161EstDimPal", GXutil.ltrim( localUtil.ntoc( Z3161EstDimPal, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3162EstDimEsp", GXutil.ltrim( localUtil.ntoc( Z3162EstDimEsp, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3163EstDimTN", GXutil.rtrim( Z3163EstDimTN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1328EstCliCod", GXutil.ltrim( localUtil.ntoc( Z1328EstCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1329EstCliNom", GXutil.rtrim( Z1329EstCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1335EstDimEncA", GXutil.ltrim( localUtil.ntoc( Z1335EstDimEncA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1336EstDimEncL", GXutil.ltrim( localUtil.ntoc( Z1336EstDimEncL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1338EstDimGrm2", GXutil.ltrim( localUtil.ntoc( Z1338EstDimGrm2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1344EstDimUlin", GXutil.ltrim( localUtil.ntoc( Z1344EstDimUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3164EstDimRef", GXutil.rtrim( Z3164EstDimRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3737EstSanfAnc", GXutil.ltrim( localUtil.ntoc( Z3737EstSanfAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3738EstSanfGrm", GXutil.ltrim( localUtil.ntoc( Z3738EstSanfGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3739EstCalAnc", GXutil.ltrim( localUtil.ntoc( Z3739EstCalAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3740EstCalGrm", GXutil.ltrim( localUtil.ntoc( Z3740EstCalGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3741EstRamAnc", GXutil.ltrim( localUtil.ntoc( Z3741EstRamAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3742EstRamGrm", GXutil.ltrim( localUtil.ntoc( Z3742EstRamGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3743EstNorEsp", GXutil.rtrim( Z3743EstNorEsp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3872EstSanfEA", GXutil.ltrim( localUtil.ntoc( Z3872EstSanfEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3873EstSanfEL", GXutil.ltrim( localUtil.ntoc( Z3873EstSanfEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3874EstCalEA", GXutil.ltrim( localUtil.ntoc( Z3874EstCalEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3875EstCalEL", GXutil.ltrim( localUtil.ntoc( Z3875EstCalEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3876EstRamEA", GXutil.ltrim( localUtil.ntoc( Z3876EstRamEA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3877EstRamEL", GXutil.ltrim( localUtil.ntoc( Z3877EstRamEL, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10977EstInclin", GXutil.rtrim( Z10977EstInclin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11806EstRqMnL", GXutil.rtrim( Z11806EstRqMnL));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11807EstRqMnC", GXutil.rtrim( Z11807EstRqMnC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11808EstEncASt", GXutil.ltrim( localUtil.ntoc( Z11808EstEncASt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11809EstEncLSt", GXutil.ltrim( localUtil.ntoc( Z11809EstEncLSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11810EstRqMnG", GXutil.rtrim( Z11810EstRqMnG));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11811EstAvGr", GXutil.ltrim( localUtil.ntoc( Z11811EstAvGr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11812EstRqMnE", GXutil.rtrim( Z11812EstRqMnE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11813EstEspBef", GXutil.ltrim( localUtil.ntoc( Z11813EstEspBef, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11814EstEspBSt", GXutil.ltrim( localUtil.ntoc( Z11814EstEspBSt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11815EstEspAft", GXutil.ltrim( localUtil.ntoc( Z11815EstEspAft, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11816EstEspASt", GXutil.ltrim( localUtil.ntoc( Z11816EstEspASt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11818EstTpLv", GXutil.ltrim( localUtil.ntoc( Z11818EstTpLv, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11819EstMet", GXutil.rtrim( Z11819EstMet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11820EstDimGrm3", GXutil.ltrim( localUtil.ntoc( Z11820EstDimGrm3, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11919EstMetod3", GXutil.rtrim( Z11919EstMetod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11920EstMetod2", GXutil.rtrim( Z11920EstMetod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11921EstMetod1", GXutil.rtrim( Z11921EstMetod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11927EstDimGrm1", GXutil.ltrim( localUtil.ntoc( Z11927EstDimGrm1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_345", GXutil.ltrim( localUtil.ntoc( nGXsfl_345_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV68BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV69BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV70BarCodPar));
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
      return formatLink("app.tpdimest", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV68BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV69BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV70BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "TpDIMEST" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Llamada con parametro", "") ;
   }

   public void initializeNonKey1I8186( )
   {
      A11817EstMedia = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrimstr( A11817EstMedia, 6, 2));
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A1340EstDimMat = "" ;
      n1340EstDimMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1340EstDimMat", A1340EstDimMat);
      A1342EstDimSer = "" ;
      n1342EstDimSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1342EstDimSer", A1342EstDimSer);
      A1343EstDimTip = (short)(0) ;
      n1343EstDimTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1343EstDimTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1343EstDimTip), 4, 0));
      A1334EstDimDisN = "" ;
      n1334EstDimDisN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1334EstDimDisN", A1334EstDimDisN);
      A3155EstDimAni = (short)(0) ;
      n3155EstDimAni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3155EstDimAni", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3155EstDimAni), 4, 0));
      A3156EstDimGmi = (short)(0) ;
      n3156EstDimGmi = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3156EstDimGmi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3156EstDimGmi), 4, 0));
      A1330EstColNom = "" ;
      n1330EstColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1330EstColNom", A1330EstColNom);
      A1331EstColNum = 0 ;
      n1331EstColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1331EstColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1331EstColNum), 6, 0));
      A1337EstDimFec = GXutil.nullDate() ;
      n1337EstDimFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1337EstDimFec", localUtil.format(A1337EstDimFec, "99/99/99"));
      A1332EstDimAnc = (short)(0) ;
      n1332EstDimAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1332EstDimAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1332EstDimAnc), 3, 0));
      A3157EstDimNor = "" ;
      n3157EstDimNor = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3157EstDimNor", A3157EstDimNor);
      A3158EstDimMaq = "" ;
      n3158EstDimMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3158EstDimMaq", A3158EstDimMaq);
      A3159EstDimTAc = "" ;
      n3159EstDimTAc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3159EstDimTAc", A3159EstDimTAc);
      A3160EstDimMan = (byte)(0) ;
      n3160EstDimMan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3160EstDimMan", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3160EstDimMan), 2, 0));
      A3161EstDimPal = (byte)(0) ;
      n3161EstDimPal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3161EstDimPal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3161EstDimPal), 2, 0));
      A3162EstDimEsp = DecimalUtil.ZERO ;
      n3162EstDimEsp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3162EstDimEsp", GXutil.ltrimstr( A3162EstDimEsp, 5, 2));
      A3163EstDimTN = "" ;
      n3163EstDimTN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3163EstDimTN", A3163EstDimTN);
      A652OpeCod = 0 ;
      n652OpeCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A652OpeCod), 6, 0));
      A653OpeNom = "" ;
      n653OpeNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", A653OpeNom);
      A1328EstCliCod = 0 ;
      n1328EstCliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1328EstCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1328EstCliCod), 6, 0));
      A1329EstCliNom = "" ;
      n1329EstCliNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1329EstCliNom", A1329EstCliNom);
      A1335EstDimEncA = DecimalUtil.ZERO ;
      n1335EstDimEncA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1335EstDimEncA", GXutil.ltrimstr( A1335EstDimEncA, 6, 2));
      A1336EstDimEncL = DecimalUtil.ZERO ;
      n1336EstDimEncL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1336EstDimEncL", GXutil.ltrimstr( A1336EstDimEncL, 6, 2));
      A1338EstDimGrm2 = (short)(0) ;
      n1338EstDimGrm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1338EstDimGrm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1338EstDimGrm2), 3, 0));
      A1344EstDimUlin = (byte)(0) ;
      n1344EstDimUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1344EstDimUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1344EstDimUlin), 2, 0));
      A3164EstDimRef = "" ;
      n3164EstDimRef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3164EstDimRef", A3164EstDimRef);
      A3737EstSanfAnc = (short)(0) ;
      n3737EstSanfAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3737EstSanfAnc), 4, 0));
      A3738EstSanfGrm = (short)(0) ;
      n3738EstSanfGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3738EstSanfGrm), 4, 0));
      A3739EstCalAnc = (short)(0) ;
      n3739EstCalAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3739EstCalAnc), 4, 0));
      A3740EstCalGrm = (short)(0) ;
      n3740EstCalGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3740EstCalGrm), 4, 0));
      A3741EstRamAnc = (short)(0) ;
      n3741EstRamAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3741EstRamAnc), 4, 0));
      A3742EstRamGrm = (short)(0) ;
      n3742EstRamGrm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3742EstRamGrm), 4, 0));
      A3743EstNorEsp = "" ;
      n3743EstNorEsp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3743EstNorEsp", A3743EstNorEsp);
      A3872EstSanfEA = DecimalUtil.ZERO ;
      n3872EstSanfEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrimstr( A3872EstSanfEA, 6, 2));
      A3873EstSanfEL = DecimalUtil.ZERO ;
      n3873EstSanfEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrimstr( A3873EstSanfEL, 6, 2));
      A3874EstCalEA = DecimalUtil.ZERO ;
      n3874EstCalEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrimstr( A3874EstCalEA, 6, 2));
      A3875EstCalEL = DecimalUtil.ZERO ;
      n3875EstCalEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrimstr( A3875EstCalEL, 6, 2));
      A3876EstRamEA = DecimalUtil.ZERO ;
      n3876EstRamEA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrimstr( A3876EstRamEA, 6, 2));
      A3877EstRamEL = DecimalUtil.ZERO ;
      n3877EstRamEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrimstr( A3877EstRamEL, 6, 2));
      A10977EstInclin = "" ;
      n10977EstInclin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10977EstInclin", A10977EstInclin);
      A11806EstRqMnL = "" ;
      n11806EstRqMnL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11806EstRqMnL", A11806EstRqMnL);
      A11807EstRqMnC = "" ;
      n11807EstRqMnC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11807EstRqMnC", A11807EstRqMnC);
      A11808EstEncASt = (byte)(0) ;
      n11808EstEncASt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11808EstEncASt", GXutil.str( A11808EstEncASt, 1, 0));
      A11809EstEncLSt = (byte)(0) ;
      n11809EstEncLSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11809EstEncLSt", GXutil.str( A11809EstEncLSt, 1, 0));
      A11810EstRqMnG = "" ;
      n11810EstRqMnG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11810EstRqMnG", A11810EstRqMnG);
      A11811EstAvGr = (byte)(0) ;
      n11811EstAvGr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11811EstAvGr", GXutil.str( A11811EstAvGr, 1, 0));
      A11812EstRqMnE = "" ;
      n11812EstRqMnE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11812EstRqMnE", A11812EstRqMnE);
      A11813EstEspBef = DecimalUtil.ZERO ;
      n11813EstEspBef = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11813EstEspBef", GXutil.ltrimstr( A11813EstEspBef, 5, 2));
      A11814EstEspBSt = (byte)(0) ;
      n11814EstEspBSt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11814EstEspBSt", GXutil.str( A11814EstEspBSt, 1, 0));
      A11815EstEspAft = DecimalUtil.ZERO ;
      n11815EstEspAft = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11815EstEspAft", GXutil.ltrimstr( A11815EstEspAft, 5, 2));
      A11816EstEspASt = (byte)(0) ;
      n11816EstEspASt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11816EstEspASt", GXutil.str( A11816EstEspASt, 1, 0));
      A11818EstTpLv = (short)(0) ;
      n11818EstTpLv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11818EstTpLv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11818EstTpLv), 4, 0));
      A11819EstMet = "" ;
      n11819EstMet = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11819EstMet", A11819EstMet);
      A11820EstDimGrm3 = (short)(0) ;
      n11820EstDimGrm3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11820EstDimGrm3", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11820EstDimGrm3), 3, 0));
      A11919EstMetod3 = "" ;
      n11919EstMetod3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11919EstMetod3", A11919EstMetod3);
      A11920EstMetod2 = "" ;
      n11920EstMetod2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11920EstMetod2", A11920EstMetod2);
      A11921EstMetod1 = "" ;
      n11921EstMetod1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11921EstMetod1", A11921EstMetod1);
      A11927EstDimGrm1 = (short)(0) ;
      n11927EstDimGrm1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11927EstDimGrm1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11927EstDimGrm1), 3, 0));
      Z1340EstDimMat = "" ;
      Z1342EstDimSer = "" ;
      Z1343EstDimTip = (short)(0) ;
      Z1334EstDimDisN = "" ;
      Z3155EstDimAni = (short)(0) ;
      Z3156EstDimGmi = (short)(0) ;
      Z1330EstColNom = "" ;
      Z1331EstColNum = 0 ;
      Z1337EstDimFec = GXutil.nullDate() ;
      Z1332EstDimAnc = (short)(0) ;
      Z3157EstDimNor = "" ;
      Z3158EstDimMaq = "" ;
      Z3159EstDimTAc = "" ;
      Z3160EstDimMan = (byte)(0) ;
      Z3161EstDimPal = (byte)(0) ;
      Z3162EstDimEsp = DecimalUtil.ZERO ;
      Z3163EstDimTN = "" ;
      Z1328EstCliCod = 0 ;
      Z1329EstCliNom = "" ;
      Z1335EstDimEncA = DecimalUtil.ZERO ;
      Z1336EstDimEncL = DecimalUtil.ZERO ;
      Z1338EstDimGrm2 = (short)(0) ;
      Z1344EstDimUlin = (byte)(0) ;
      Z3164EstDimRef = "" ;
      Z3737EstSanfAnc = (short)(0) ;
      Z3738EstSanfGrm = (short)(0) ;
      Z3739EstCalAnc = (short)(0) ;
      Z3740EstCalGrm = (short)(0) ;
      Z3741EstRamAnc = (short)(0) ;
      Z3742EstRamGrm = (short)(0) ;
      Z3743EstNorEsp = "" ;
      Z3872EstSanfEA = DecimalUtil.ZERO ;
      Z3873EstSanfEL = DecimalUtil.ZERO ;
      Z3874EstCalEA = DecimalUtil.ZERO ;
      Z3875EstCalEL = DecimalUtil.ZERO ;
      Z3876EstRamEA = DecimalUtil.ZERO ;
      Z3877EstRamEL = DecimalUtil.ZERO ;
      Z10977EstInclin = "" ;
      Z11806EstRqMnL = "" ;
      Z11807EstRqMnC = "" ;
      Z11808EstEncASt = (byte)(0) ;
      Z11809EstEncLSt = (byte)(0) ;
      Z11810EstRqMnG = "" ;
      Z11811EstAvGr = (byte)(0) ;
      Z11812EstRqMnE = "" ;
      Z11813EstEspBef = DecimalUtil.ZERO ;
      Z11814EstEspBSt = (byte)(0) ;
      Z11815EstEspAft = DecimalUtil.ZERO ;
      Z11816EstEspASt = (byte)(0) ;
      Z11818EstTpLv = (short)(0) ;
      Z11819EstMet = "" ;
      Z11820EstDimGrm3 = (short)(0) ;
      Z11919EstMetod3 = "" ;
      Z11920EstMetod2 = "" ;
      Z11921EstMetod1 = "" ;
      Z11927EstDimGrm1 = (short)(0) ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z652OpeCod = 0 ;
   }

   public void initAll1I8186( )
   {
      A1333EstDimCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1333EstDimCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1333EstDimCod), 8, 0));
      initializeNonKey1I8186( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1I8187( )
   {
      A1341EstDimObs = "" ;
      n1341EstDimObs = false ;
      Z1341EstDimObs = "" ;
   }

   public void initAll1I8187( )
   {
      A1339EstDimLin = (byte)(0) ;
      initializeNonKey1I8187( ) ;
   }

   public void standaloneModalInsert1I8187( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241581959", true, true);
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
      httpContext.AddJavascriptSource("tpdimest.js", "?20268241581960", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties187( )
   {
      edtEstDimLin_Enabled = defedtEstDimLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstDimLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstDimLin_Enabled), 5, 0), !bGXsfl_345_Refreshing);
   }

   public void startgridcontrol345( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_187, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_187_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1339EstDimLin, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1341EstDimObs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtEstDimObs_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtEstDimCod_Internalname = "ESTDIMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEstDimMat_Internalname = "ESTDIMMAT" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEstDimSer_Internalname = "ESTDIMSER" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEstDimTip_Internalname = "ESTDIMTIP" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtEstDimDisN_Internalname = "ESTDIMDISN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtEstDimAni_Internalname = "ESTDIMANI" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtEstDimGmi_Internalname = "ESTDIMGMI" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtEstColNom_Internalname = "ESTCOLNOM" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtEstColNum_Internalname = "ESTCOLNUM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtEstDimFec_Internalname = "ESTDIMFEC" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtEstDimAnc_Internalname = "ESTDIMANC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtEstDimNor_Internalname = "ESTDIMNOR" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtEstDimMaq_Internalname = "ESTDIMMAQ" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtEstDimTAc_Internalname = "ESTDIMTAC" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtEstDimMan_Internalname = "ESTDIMMAN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtEstDimPal_Internalname = "ESTDIMPAL" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtEstDimEsp_Internalname = "ESTDIMESP" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtEstDimTN_Internalname = "ESTDIMTN" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtOpeCod_Internalname = "OPECOD" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtOpeNom_Internalname = "OPENOM" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtEstCliCod_Internalname = "ESTCLICOD" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtEstCliNom_Internalname = "ESTCLINOM" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtEstDimEncA_Internalname = "ESTDIMENCA" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtEstDimEncL_Internalname = "ESTDIMENCL" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtEstDimGrm2_Internalname = "ESTDIMGRM2" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtEstDimUlin_Internalname = "ESTDIMULIN" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtEstDimRef_Internalname = "ESTDIMREF" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtEstSanfAnc_Internalname = "ESTSANFANC" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtEstSanfGrm_Internalname = "ESTSANFGRM" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtEstCalAnc_Internalname = "ESTCALANC" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtEstCalGrm_Internalname = "ESTCALGRM" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtEstRamAnc_Internalname = "ESTRAMANC" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtEstRamGrm_Internalname = "ESTRAMGRM" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtEstNorEsp_Internalname = "ESTNORESP" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtEstSanfEA_Internalname = "ESTSANFEA" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtEstSanfEL_Internalname = "ESTSANFEL" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtEstCalEA_Internalname = "ESTCALEA" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtEstCalEL_Internalname = "ESTCALEL" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtEstRamEA_Internalname = "ESTRAMEA" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtEstRamEL_Internalname = "ESTRAMEL" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtEstInclin_Internalname = "ESTINCLIN" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtEstRqMnL_Internalname = "ESTRQMNL" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtEstRqMnC_Internalname = "ESTRQMNC" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtEstEncASt_Internalname = "ESTENCAST" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtEstEncLSt_Internalname = "ESTENCLST" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtEstRqMnG_Internalname = "ESTRQMNG" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtEstAvGr_Internalname = "ESTAVGR" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtEstRqMnE_Internalname = "ESTRQMNE" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtEstEspBef_Internalname = "ESTESPBEF" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtEstEspBSt_Internalname = "ESTESPBST" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtEstEspAft_Internalname = "ESTESPAFT" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtEstEspASt_Internalname = "ESTESPAST" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtEstMedia_Internalname = "ESTMEDIA" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtEstTpLv_Internalname = "ESTTPLV" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtEstMet_Internalname = "ESTMET" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtEstDimGrm3_Internalname = "ESTDIMGRM3" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtEstMetod3_Internalname = "ESTMETOD3" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtEstMetod2_Internalname = "ESTMETOD2" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtEstMetod1_Internalname = "ESTMETOD1" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtEstDimGrm1_Internalname = "ESTDIMGRM1" ;
      edtavnRcdDeleted_187_Internalname = "vNRCDDELETED_187" ;
      edtEstDimLin_Internalname = "ESTDIMLIN" ;
      edtEstDimObs_Internalname = "ESTDIMOBS" ;
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
      Form.setCaption( httpContext.getMessage( "Llamada con parametro", "") );
      edtEstDimObs_Jsonclick = "" ;
      edtEstDimLin_Jsonclick = "" ;
      edtavnRcdDeleted_187_Jsonclick = "" ;
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
      edtEstDimObs_Enabled = 1 ;
      edtEstDimLin_Enabled = 1 ;
      edtavnRcdDeleted_187_Enabled = 1 ;
      edtEstDimGrm1_Jsonclick = "" ;
      edtEstDimGrm1_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimGrm1_Enabled = 1 ;
      edtEstMetod1_Jsonclick = "" ;
      edtEstMetod1_Backcolor = (int)(0xFFFFFF) ;
      edtEstMetod1_Enabled = 1 ;
      edtEstMetod2_Jsonclick = "" ;
      edtEstMetod2_Backcolor = (int)(0xFFFFFF) ;
      edtEstMetod2_Enabled = 1 ;
      edtEstMetod3_Jsonclick = "" ;
      edtEstMetod3_Backcolor = (int)(0xFFFFFF) ;
      edtEstMetod3_Enabled = 1 ;
      edtEstDimGrm3_Jsonclick = "" ;
      edtEstDimGrm3_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimGrm3_Enabled = 1 ;
      edtEstMet_Jsonclick = "" ;
      edtEstMet_Backcolor = (int)(0xFFFFFF) ;
      edtEstMet_Enabled = 1 ;
      edtEstTpLv_Jsonclick = "" ;
      edtEstTpLv_Backcolor = (int)(0xFFFFFF) ;
      edtEstTpLv_Enabled = 1 ;
      edtEstMedia_Jsonclick = "" ;
      edtEstMedia_Backcolor = (int)(0xFFFFFF) ;
      edtEstMedia_Enabled = 0 ;
      edtEstEspASt_Jsonclick = "" ;
      edtEstEspASt_Backcolor = (int)(0xFFFFFF) ;
      edtEstEspASt_Enabled = 1 ;
      edtEstEspAft_Jsonclick = "" ;
      edtEstEspAft_Backcolor = (int)(0xFFFFFF) ;
      edtEstEspAft_Enabled = 1 ;
      edtEstEspBSt_Jsonclick = "" ;
      edtEstEspBSt_Backcolor = (int)(0xFFFFFF) ;
      edtEstEspBSt_Enabled = 1 ;
      edtEstEspBef_Jsonclick = "" ;
      edtEstEspBef_Backcolor = (int)(0xFFFFFF) ;
      edtEstEspBef_Enabled = 1 ;
      edtEstRqMnE_Jsonclick = "" ;
      edtEstRqMnE_Backcolor = (int)(0xFFFFFF) ;
      edtEstRqMnE_Enabled = 1 ;
      edtEstAvGr_Jsonclick = "" ;
      edtEstAvGr_Backcolor = (int)(0xFFFFFF) ;
      edtEstAvGr_Enabled = 1 ;
      edtEstRqMnG_Jsonclick = "" ;
      edtEstRqMnG_Backcolor = (int)(0xFFFFFF) ;
      edtEstRqMnG_Enabled = 1 ;
      edtEstEncLSt_Jsonclick = "" ;
      edtEstEncLSt_Backcolor = (int)(0xFFFFFF) ;
      edtEstEncLSt_Enabled = 1 ;
      edtEstEncASt_Jsonclick = "" ;
      edtEstEncASt_Backcolor = (int)(0xFFFFFF) ;
      edtEstEncASt_Enabled = 1 ;
      edtEstRqMnC_Jsonclick = "" ;
      edtEstRqMnC_Backcolor = (int)(0xFFFFFF) ;
      edtEstRqMnC_Enabled = 1 ;
      edtEstRqMnL_Jsonclick = "" ;
      edtEstRqMnL_Backcolor = (int)(0xFFFFFF) ;
      edtEstRqMnL_Enabled = 1 ;
      edtEstInclin_Jsonclick = "" ;
      edtEstInclin_Backcolor = (int)(0xFFFFFF) ;
      edtEstInclin_Enabled = 1 ;
      edtEstRamEL_Jsonclick = "" ;
      edtEstRamEL_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamEL_Enabled = 1 ;
      edtEstRamEA_Jsonclick = "" ;
      edtEstRamEA_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamEA_Enabled = 1 ;
      edtEstCalEL_Jsonclick = "" ;
      edtEstCalEL_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalEL_Enabled = 1 ;
      edtEstCalEA_Jsonclick = "" ;
      edtEstCalEA_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalEA_Enabled = 1 ;
      edtEstSanfEL_Jsonclick = "" ;
      edtEstSanfEL_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfEL_Enabled = 1 ;
      edtEstSanfEA_Jsonclick = "" ;
      edtEstSanfEA_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfEA_Enabled = 1 ;
      edtEstNorEsp_Jsonclick = "" ;
      edtEstNorEsp_Backcolor = (int)(0xFFFFFF) ;
      edtEstNorEsp_Enabled = 1 ;
      edtEstRamGrm_Jsonclick = "" ;
      edtEstRamGrm_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamGrm_Enabled = 1 ;
      edtEstRamAnc_Jsonclick = "" ;
      edtEstRamAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstRamAnc_Enabled = 1 ;
      edtEstCalGrm_Jsonclick = "" ;
      edtEstCalGrm_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalGrm_Enabled = 1 ;
      edtEstCalAnc_Jsonclick = "" ;
      edtEstCalAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstCalAnc_Enabled = 1 ;
      edtEstSanfGrm_Jsonclick = "" ;
      edtEstSanfGrm_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfGrm_Enabled = 1 ;
      edtEstSanfAnc_Jsonclick = "" ;
      edtEstSanfAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstSanfAnc_Enabled = 1 ;
      edtEstDimRef_Jsonclick = "" ;
      edtEstDimRef_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimRef_Enabled = 1 ;
      edtEstDimUlin_Jsonclick = "" ;
      edtEstDimUlin_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimUlin_Enabled = 1 ;
      edtEstDimGrm2_Jsonclick = "" ;
      edtEstDimGrm2_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimGrm2_Enabled = 1 ;
      edtEstDimEncL_Jsonclick = "" ;
      edtEstDimEncL_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimEncL_Enabled = 1 ;
      edtEstDimEncA_Jsonclick = "" ;
      edtEstDimEncA_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimEncA_Enabled = 1 ;
      edtEstCliNom_Jsonclick = "" ;
      edtEstCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtEstCliNom_Enabled = 1 ;
      edtEstCliCod_Jsonclick = "" ;
      edtEstCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtEstCliCod_Enabled = 1 ;
      edtOpeNom_Jsonclick = "" ;
      edtOpeNom_Backcolor = (int)(0xFFFFFF) ;
      edtOpeNom_Enabled = 0 ;
      edtOpeCod_Jsonclick = "" ;
      edtOpeCod_Backcolor = (int)(0xFFFFFF) ;
      edtOpeCod_Enabled = 1 ;
      edtEstDimTN_Jsonclick = "" ;
      edtEstDimTN_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimTN_Enabled = 1 ;
      edtEstDimEsp_Jsonclick = "" ;
      edtEstDimEsp_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimEsp_Enabled = 1 ;
      edtEstDimPal_Jsonclick = "" ;
      edtEstDimPal_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimPal_Enabled = 1 ;
      edtEstDimMan_Jsonclick = "" ;
      edtEstDimMan_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimMan_Enabled = 1 ;
      edtEstDimTAc_Jsonclick = "" ;
      edtEstDimTAc_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimTAc_Enabled = 1 ;
      edtEstDimMaq_Jsonclick = "" ;
      edtEstDimMaq_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimMaq_Enabled = 1 ;
      edtEstDimNor_Jsonclick = "" ;
      edtEstDimNor_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimNor_Enabled = 1 ;
      edtEstDimAnc_Jsonclick = "" ;
      edtEstDimAnc_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimAnc_Enabled = 1 ;
      edtEstDimFec_Jsonclick = "" ;
      edtEstDimFec_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimFec_Enabled = 1 ;
      edtEstColNum_Jsonclick = "" ;
      edtEstColNum_Backcolor = (int)(0xFFFFFF) ;
      edtEstColNum_Enabled = 1 ;
      edtEstColNom_Jsonclick = "" ;
      edtEstColNom_Backcolor = (int)(0xFFFFFF) ;
      edtEstColNom_Enabled = 1 ;
      edtEstDimGmi_Jsonclick = "" ;
      edtEstDimGmi_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimGmi_Enabled = 1 ;
      edtEstDimAni_Jsonclick = "" ;
      edtEstDimAni_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimAni_Enabled = 1 ;
      edtEstDimDisN_Jsonclick = "" ;
      edtEstDimDisN_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimDisN_Enabled = 1 ;
      edtEstDimTip_Jsonclick = "" ;
      edtEstDimTip_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimTip_Enabled = 1 ;
      edtEstDimSer_Jsonclick = "" ;
      edtEstDimSer_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimSer_Enabled = 1 ;
      edtEstDimMat_Jsonclick = "" ;
      edtEstDimMat_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimMat_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtEstDimCod_Jsonclick = "" ;
      edtEstDimCod_Backcolor = (int)(0xFFFFFF) ;
      edtEstDimCod_Enabled = 1 ;
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
      subsflControlProps_345187( ) ;
      while ( nGXsfl_345_idx <= nRC_GXsfl_345 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1I8187( ) ;
         standaloneModal1I8187( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1I8187( ) ;
         nGXsfl_345_idx = (int)(nGXsfl_345_idx+1) ;
         sGXsfl_345_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_345_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_345187( ) ;
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
      /* Using cursor T01I826 */
      pr_default.execute(24, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01I826_A407EmprNom[0] ;
      n407EmprNom = T01I826_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(24);
      GX_FocusControl = edtBarCod_Internalname ;
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

   public void valid_Estdimcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A1340EstDimMat", GXutil.rtrim( A1340EstDimMat));
      httpContext.ajax_rsp_assign_attri("", false, "A1342EstDimSer", GXutil.rtrim( A1342EstDimSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1343EstDimTip", GXutil.ltrim( localUtil.ntoc( A1343EstDimTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1334EstDimDisN", GXutil.rtrim( A1334EstDimDisN));
      httpContext.ajax_rsp_assign_attri("", false, "A3155EstDimAni", GXutil.ltrim( localUtil.ntoc( A3155EstDimAni, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3156EstDimGmi", GXutil.ltrim( localUtil.ntoc( A3156EstDimGmi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1330EstColNom", GXutil.rtrim( A1330EstColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1331EstColNum", GXutil.ltrim( localUtil.ntoc( A1331EstColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1337EstDimFec", localUtil.format(A1337EstDimFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A1332EstDimAnc", GXutil.ltrim( localUtil.ntoc( A1332EstDimAnc, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3157EstDimNor", GXutil.rtrim( A3157EstDimNor));
      httpContext.ajax_rsp_assign_attri("", false, "A3158EstDimMaq", GXutil.rtrim( A3158EstDimMaq));
      httpContext.ajax_rsp_assign_attri("", false, "A3159EstDimTAc", GXutil.rtrim( A3159EstDimTAc));
      httpContext.ajax_rsp_assign_attri("", false, "A3160EstDimMan", GXutil.ltrim( localUtil.ntoc( A3160EstDimMan, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3161EstDimPal", GXutil.ltrim( localUtil.ntoc( A3161EstDimPal, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3162EstDimEsp", GXutil.ltrim( localUtil.ntoc( A3162EstDimEsp, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3163EstDimTN", GXutil.rtrim( A3163EstDimTN));
      httpContext.ajax_rsp_assign_attri("", false, "A652OpeCod", GXutil.ltrim( localUtil.ntoc( A652OpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1328EstCliCod", GXutil.ltrim( localUtil.ntoc( A1328EstCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1329EstCliNom", GXutil.rtrim( A1329EstCliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1335EstDimEncA", GXutil.ltrim( localUtil.ntoc( A1335EstDimEncA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1336EstDimEncL", GXutil.ltrim( localUtil.ntoc( A1336EstDimEncL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1338EstDimGrm2", GXutil.ltrim( localUtil.ntoc( A1338EstDimGrm2, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1344EstDimUlin", GXutil.ltrim( localUtil.ntoc( A1344EstDimUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3164EstDimRef", GXutil.rtrim( A3164EstDimRef));
      httpContext.ajax_rsp_assign_attri("", false, "A3737EstSanfAnc", GXutil.ltrim( localUtil.ntoc( A3737EstSanfAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3738EstSanfGrm", GXutil.ltrim( localUtil.ntoc( A3738EstSanfGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3739EstCalAnc", GXutil.ltrim( localUtil.ntoc( A3739EstCalAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3740EstCalGrm", GXutil.ltrim( localUtil.ntoc( A3740EstCalGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3741EstRamAnc", GXutil.ltrim( localUtil.ntoc( A3741EstRamAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3742EstRamGrm", GXutil.ltrim( localUtil.ntoc( A3742EstRamGrm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3743EstNorEsp", GXutil.rtrim( A3743EstNorEsp));
      httpContext.ajax_rsp_assign_attri("", false, "A3872EstSanfEA", GXutil.ltrim( localUtil.ntoc( A3872EstSanfEA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3873EstSanfEL", GXutil.ltrim( localUtil.ntoc( A3873EstSanfEL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3874EstCalEA", GXutil.ltrim( localUtil.ntoc( A3874EstCalEA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3875EstCalEL", GXutil.ltrim( localUtil.ntoc( A3875EstCalEL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3876EstRamEA", GXutil.ltrim( localUtil.ntoc( A3876EstRamEA, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3877EstRamEL", GXutil.ltrim( localUtil.ntoc( A3877EstRamEL, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10977EstInclin", GXutil.rtrim( A10977EstInclin));
      httpContext.ajax_rsp_assign_attri("", false, "A11806EstRqMnL", GXutil.rtrim( A11806EstRqMnL));
      httpContext.ajax_rsp_assign_attri("", false, "A11807EstRqMnC", GXutil.rtrim( A11807EstRqMnC));
      httpContext.ajax_rsp_assign_attri("", false, "A11808EstEncASt", GXutil.ltrim( localUtil.ntoc( A11808EstEncASt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11809EstEncLSt", GXutil.ltrim( localUtil.ntoc( A11809EstEncLSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11810EstRqMnG", GXutil.rtrim( A11810EstRqMnG));
      httpContext.ajax_rsp_assign_attri("", false, "A11811EstAvGr", GXutil.ltrim( localUtil.ntoc( A11811EstAvGr, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11812EstRqMnE", GXutil.rtrim( A11812EstRqMnE));
      httpContext.ajax_rsp_assign_attri("", false, "A11813EstEspBef", GXutil.ltrim( localUtil.ntoc( A11813EstEspBef, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11814EstEspBSt", GXutil.ltrim( localUtil.ntoc( A11814EstEspBSt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11815EstEspAft", GXutil.ltrim( localUtil.ntoc( A11815EstEspAft, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11816EstEspASt", GXutil.ltrim( localUtil.ntoc( A11816EstEspASt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11818EstTpLv", GXutil.ltrim( localUtil.ntoc( A11818EstTpLv, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11819EstMet", GXutil.rtrim( A11819EstMet));
      httpContext.ajax_rsp_assign_attri("", false, "A11820EstDimGrm3", GXutil.ltrim( localUtil.ntoc( A11820EstDimGrm3, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11919EstMetod3", GXutil.rtrim( A11919EstMetod3));
      httpContext.ajax_rsp_assign_attri("", false, "A11920EstMetod2", GXutil.rtrim( A11920EstMetod2));
      httpContext.ajax_rsp_assign_attri("", false, "A11921EstMetod1", GXutil.rtrim( A11921EstMetod1));
      httpContext.ajax_rsp_assign_attri("", false, "A11927EstDimGrm1", GXutil.ltrim( localUtil.ntoc( A11927EstDimGrm1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
      httpContext.ajax_rsp_assign_attri("", false, "A11817EstMedia", GXutil.ltrim( localUtil.ntoc( A11817EstMedia, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1333EstDimCod", GXutil.ltrim( localUtil.ntoc( Z1333EstDimCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1340EstDimMat", GXutil.rtrim( Z1340EstDimMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1342EstDimSer", GXutil.rtrim( Z1342EstDimSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1343EstDimTip", GXutil.ltrim( localUtil.ntoc( Z1343EstDimTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1334EstDimDisN", GXutil.rtrim( Z1334EstDimDisN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3155EstDimAni", GXutil.ltrim( localUtil.ntoc( Z3155EstDimAni, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3156EstDimGmi", GXutil.ltrim( localUtil.ntoc( Z3156EstDimGmi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1330EstColNom", GXutil.rtrim( Z1330EstColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1331EstColNum", GXutil.ltrim( localUtil.ntoc( Z1331EstColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1337EstDimFec", localUtil.format(Z1337EstDimFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1332EstDimAnc", GXutil.ltrim( localUtil.ntoc( Z1332EstDimAnc, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3157EstDimNor", GXutil.rtrim( Z3157EstDimNor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3158EstDimMaq", GXutil.rtrim( Z3158EstDimMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3159EstDimTAc", GXutil.rtrim( Z3159EstDimTAc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3160EstDimMan", GXutil.ltrim( localUtil.ntoc( Z3160EstDimMan, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3161EstDimPal", GXutil.ltrim( localUtil.ntoc( Z3161EstDimPal, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3162EstDimEsp", GXutil.ltrim( localUtil.ntoc( Z3162EstDimEsp, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3163EstDimTN", GXutil.rtrim( Z3163EstDimTN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z652OpeCod", GXutil.ltrim( localUtil.ntoc( Z652OpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1328EstCliCod", GXutil.ltrim( localUtil.ntoc( Z1328EstCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1329EstCliNom", GXutil.rtrim( Z1329EstCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1335EstDimEncA", GXutil.ltrim( localUtil.ntoc( Z1335EstDimEncA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1336EstDimEncL", GXutil.ltrim( localUtil.ntoc( Z1336EstDimEncL, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1338EstDimGrm2", GXutil.ltrim( localUtil.ntoc( Z1338EstDimGrm2, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1344EstDimUlin", GXutil.ltrim( localUtil.ntoc( Z1344EstDimUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3164EstDimRef", GXutil.rtrim( Z3164EstDimRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3737EstSanfAnc", GXutil.ltrim( localUtil.ntoc( Z3737EstSanfAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3738EstSanfGrm", GXutil.ltrim( localUtil.ntoc( Z3738EstSanfGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3739EstCalAnc", GXutil.ltrim( localUtil.ntoc( Z3739EstCalAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3740EstCalGrm", GXutil.ltrim( localUtil.ntoc( Z3740EstCalGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3741EstRamAnc", GXutil.ltrim( localUtil.ntoc( Z3741EstRamAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3742EstRamGrm", GXutil.ltrim( localUtil.ntoc( Z3742EstRamGrm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3743EstNorEsp", GXutil.rtrim( Z3743EstNorEsp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3872EstSanfEA", GXutil.ltrim( localUtil.ntoc( Z3872EstSanfEA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3873EstSanfEL", GXutil.ltrim( localUtil.ntoc( Z3873EstSanfEL, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3874EstCalEA", GXutil.ltrim( localUtil.ntoc( Z3874EstCalEA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3875EstCalEL", GXutil.ltrim( localUtil.ntoc( Z3875EstCalEL, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3876EstRamEA", GXutil.ltrim( localUtil.ntoc( Z3876EstRamEA, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3877EstRamEL", GXutil.ltrim( localUtil.ntoc( Z3877EstRamEL, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10977EstInclin", GXutil.rtrim( Z10977EstInclin));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11806EstRqMnL", GXutil.rtrim( Z11806EstRqMnL));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11807EstRqMnC", GXutil.rtrim( Z11807EstRqMnC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11808EstEncASt", GXutil.ltrim( localUtil.ntoc( Z11808EstEncASt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11809EstEncLSt", GXutil.ltrim( localUtil.ntoc( Z11809EstEncLSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11810EstRqMnG", GXutil.rtrim( Z11810EstRqMnG));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11811EstAvGr", GXutil.ltrim( localUtil.ntoc( Z11811EstAvGr, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11812EstRqMnE", GXutil.rtrim( Z11812EstRqMnE));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11813EstEspBef", GXutil.ltrim( localUtil.ntoc( Z11813EstEspBef, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11814EstEspBSt", GXutil.ltrim( localUtil.ntoc( Z11814EstEspBSt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11815EstEspAft", GXutil.ltrim( localUtil.ntoc( Z11815EstEspAft, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11816EstEspASt", GXutil.ltrim( localUtil.ntoc( Z11816EstEspASt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11818EstTpLv", GXutil.ltrim( localUtil.ntoc( Z11818EstTpLv, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11819EstMet", GXutil.rtrim( Z11819EstMet));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11820EstDimGrm3", GXutil.ltrim( localUtil.ntoc( Z11820EstDimGrm3, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11919EstMetod3", GXutil.rtrim( Z11919EstMetod3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11920EstMetod2", GXutil.rtrim( Z11920EstMetod2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11921EstMetod1", GXutil.rtrim( Z11921EstMetod1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11927EstDimGrm1", GXutil.ltrim( localUtil.ntoc( Z11927EstDimGrm1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z653OpeNom", GXutil.rtrim( Z653OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11817EstMedia", GXutil.ltrim( localUtil.ntoc( Z11817EstMedia, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01I827 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Opecod( )
   {
      n652OpeCod = false ;
      n653OpeNom = false ;
      /* Using cursor T01I818 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n652OpeCod), Integer.valueOf(A652OpeCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OPERAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "OPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtOpeCod_Internalname ;
      }
      A653OpeNom = T01I818_A653OpeNom[0] ;
      n653OpeNom = T01I818_n653OpeNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A653OpeNom", GXutil.rtrim( A653OpeNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV68BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV69BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV70BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ESTDIMCOD","{handler:'valid_Estdimcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1333EstDimCod',fld:'ESTDIMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_ESTDIMCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A1340EstDimMat',fld:'ESTDIMMAT',pic:''},{av:'A1342EstDimSer',fld:'ESTDIMSER',pic:''},{av:'A1343EstDimTip',fld:'ESTDIMTIP',pic:'ZZZ9'},{av:'A1334EstDimDisN',fld:'ESTDIMDISN',pic:''},{av:'A3155EstDimAni',fld:'ESTDIMANI',pic:'ZZZ9'},{av:'A3156EstDimGmi',fld:'ESTDIMGMI',pic:'ZZZ9'},{av:'A1330EstColNom',fld:'ESTCOLNOM',pic:''},{av:'A1331EstColNum',fld:'ESTCOLNUM',pic:'ZZZZZ9'},{av:'A1337EstDimFec',fld:'ESTDIMFEC',pic:''},{av:'A1332EstDimAnc',fld:'ESTDIMANC',pic:'ZZ9'},{av:'A3157EstDimNor',fld:'ESTDIMNOR',pic:''},{av:'A3158EstDimMaq',fld:'ESTDIMMAQ',pic:''},{av:'A3159EstDimTAc',fld:'ESTDIMTAC',pic:''},{av:'A3160EstDimMan',fld:'ESTDIMMAN',pic:'Z9'},{av:'A3161EstDimPal',fld:'ESTDIMPAL',pic:'Z9'},{av:'A3162EstDimEsp',fld:'ESTDIMESP',pic:'Z9.99'},{av:'A3163EstDimTN',fld:'ESTDIMTN',pic:''},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A1328EstCliCod',fld:'ESTCLICOD',pic:'ZZZZZ9'},{av:'A1329EstCliNom',fld:'ESTCLINOM',pic:''},{av:'A1335EstDimEncA',fld:'ESTDIMENCA',pic:'ZZ9.99'},{av:'A1336EstDimEncL',fld:'ESTDIMENCL',pic:'ZZ9.99'},{av:'A1338EstDimGrm2',fld:'ESTDIMGRM2',pic:'ZZ9'},{av:'A1344EstDimUlin',fld:'ESTDIMULIN',pic:'Z9'},{av:'A3164EstDimRef',fld:'ESTDIMREF',pic:''},{av:'A3737EstSanfAnc',fld:'ESTSANFANC',pic:'ZZZ9'},{av:'A3738EstSanfGrm',fld:'ESTSANFGRM',pic:'ZZZ9'},{av:'A3739EstCalAnc',fld:'ESTCALANC',pic:'ZZZ9'},{av:'A3740EstCalGrm',fld:'ESTCALGRM',pic:'ZZZ9'},{av:'A3741EstRamAnc',fld:'ESTRAMANC',pic:'ZZZ9'},{av:'A3742EstRamGrm',fld:'ESTRAMGRM',pic:'ZZZ9'},{av:'A3743EstNorEsp',fld:'ESTNORESP',pic:''},{av:'A3872EstSanfEA',fld:'ESTSANFEA',pic:'ZZ9.99'},{av:'A3873EstSanfEL',fld:'ESTSANFEL',pic:'ZZ9.99'},{av:'A3874EstCalEA',fld:'ESTCALEA',pic:'ZZ9.99'},{av:'A3875EstCalEL',fld:'ESTCALEL',pic:'ZZ9.99'},{av:'A3876EstRamEA',fld:'ESTRAMEA',pic:'ZZ9.99'},{av:'A3877EstRamEL',fld:'ESTRAMEL',pic:'ZZ9.99'},{av:'A10977EstInclin',fld:'ESTINCLIN',pic:''},{av:'A11806EstRqMnL',fld:'ESTRQMNL',pic:''},{av:'A11807EstRqMnC',fld:'ESTRQMNC',pic:''},{av:'A11808EstEncASt',fld:'ESTENCAST',pic:'9'},{av:'A11809EstEncLSt',fld:'ESTENCLST',pic:'9'},{av:'A11810EstRqMnG',fld:'ESTRQMNG',pic:''},{av:'A11811EstAvGr',fld:'ESTAVGR',pic:'9'},{av:'A11812EstRqMnE',fld:'ESTRQMNE',pic:''},{av:'A11813EstEspBef',fld:'ESTESPBEF',pic:'Z9.99'},{av:'A11814EstEspBSt',fld:'ESTESPBST',pic:'9'},{av:'A11815EstEspAft',fld:'ESTESPAFT',pic:'Z9.99'},{av:'A11816EstEspASt',fld:'ESTESPAST',pic:'9'},{av:'A11818EstTpLv',fld:'ESTTPLV',pic:'ZZZ9'},{av:'A11819EstMet',fld:'ESTMET',pic:''},{av:'A11820EstDimGrm3',fld:'ESTDIMGRM3',pic:'ZZ9'},{av:'A11919EstMetod3',fld:'ESTMETOD3',pic:''},{av:'A11920EstMetod2',fld:'ESTMETOD2',pic:''},{av:'A11921EstMetod1',fld:'ESTMETOD1',pic:''},{av:'A11927EstDimGrm1',fld:'ESTDIMGRM1',pic:'ZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''},{av:'A11817EstMedia',fld:'ESTMEDIA',pic:'ZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z1333EstDimCod'},{av:'Z407EmprNom'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z1340EstDimMat'},{av:'Z1342EstDimSer'},{av:'Z1343EstDimTip'},{av:'Z1334EstDimDisN'},{av:'Z3155EstDimAni'},{av:'Z3156EstDimGmi'},{av:'Z1330EstColNom'},{av:'Z1331EstColNum'},{av:'Z1337EstDimFec'},{av:'Z1332EstDimAnc'},{av:'Z3157EstDimNor'},{av:'Z3158EstDimMaq'},{av:'Z3159EstDimTAc'},{av:'Z3160EstDimMan'},{av:'Z3161EstDimPal'},{av:'Z3162EstDimEsp'},{av:'Z3163EstDimTN'},{av:'Z652OpeCod'},{av:'Z1328EstCliCod'},{av:'Z1329EstCliNom'},{av:'Z1335EstDimEncA'},{av:'Z1336EstDimEncL'},{av:'Z1338EstDimGrm2'},{av:'Z1344EstDimUlin'},{av:'Z3164EstDimRef'},{av:'Z3737EstSanfAnc'},{av:'Z3738EstSanfGrm'},{av:'Z3739EstCalAnc'},{av:'Z3740EstCalGrm'},{av:'Z3741EstRamAnc'},{av:'Z3742EstRamGrm'},{av:'Z3743EstNorEsp'},{av:'Z3872EstSanfEA'},{av:'Z3873EstSanfEL'},{av:'Z3874EstCalEA'},{av:'Z3875EstCalEL'},{av:'Z3876EstRamEA'},{av:'Z3877EstRamEL'},{av:'Z10977EstInclin'},{av:'Z11806EstRqMnL'},{av:'Z11807EstRqMnC'},{av:'Z11808EstEncASt'},{av:'Z11809EstEncLSt'},{av:'Z11810EstRqMnG'},{av:'Z11811EstAvGr'},{av:'Z11812EstRqMnE'},{av:'Z11813EstEspBef'},{av:'Z11814EstEspBSt'},{av:'Z11815EstEspAft'},{av:'Z11816EstEspASt'},{av:'Z11818EstTpLv'},{av:'Z11819EstMet'},{av:'Z11820EstDimGrm3'},{av:'Z11919EstMetod3'},{av:'Z11920EstMetod2'},{av:'Z11921EstMetod1'},{av:'Z11927EstDimGrm1'},{av:'Z653OpeNom'},{av:'Z11817EstMedia'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_OPECOD","{handler:'valid_Opecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A652OpeCod',fld:'OPECOD',pic:'ZZZZZ9'},{av:'A653OpeNom',fld:'OPENOM',pic:''}]");
      setEventMetadata("VALID_OPECOD",",oparms:[{av:'A653OpeNom',fld:'OPENOM',pic:''}]}");
      setEventMetadata("VALID_ESTDIMGRM2","{handler:'valid_Estdimgrm2',iparms:[]");
      setEventMetadata("VALID_ESTDIMGRM2",",oparms:[]}");
      setEventMetadata("VALID_ESTDIMGRM3","{handler:'valid_Estdimgrm3',iparms:[]");
      setEventMetadata("VALID_ESTDIMGRM3",",oparms:[]}");
      setEventMetadata("VALID_ESTDIMGRM1","{handler:'valid_Estdimgrm1',iparms:[]");
      setEventMetadata("VALID_ESTDIMGRM1",",oparms:[]}");
      setEventMetadata("VALID_ESTDIMLIN","{handler:'valid_Estdimlin',iparms:[]");
      setEventMetadata("VALID_ESTDIMLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Estdimobs',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(24);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV70BarCodPar = "" ;
      Z396EmprCod = "" ;
      Z1340EstDimMat = "" ;
      Z1342EstDimSer = "" ;
      Z1334EstDimDisN = "" ;
      Z1330EstColNom = "" ;
      Z1337EstDimFec = GXutil.nullDate() ;
      Z3157EstDimNor = "" ;
      Z3158EstDimMaq = "" ;
      Z3159EstDimTAc = "" ;
      Z3162EstDimEsp = DecimalUtil.ZERO ;
      Z3163EstDimTN = "" ;
      Z1329EstCliNom = "" ;
      Z1335EstDimEncA = DecimalUtil.ZERO ;
      Z1336EstDimEncL = DecimalUtil.ZERO ;
      Z3164EstDimRef = "" ;
      Z3743EstNorEsp = "" ;
      Z3872EstSanfEA = DecimalUtil.ZERO ;
      Z3873EstSanfEL = DecimalUtil.ZERO ;
      Z3874EstCalEA = DecimalUtil.ZERO ;
      Z3875EstCalEL = DecimalUtil.ZERO ;
      Z3876EstRamEA = DecimalUtil.ZERO ;
      Z3877EstRamEL = DecimalUtil.ZERO ;
      Z10977EstInclin = "" ;
      Z11806EstRqMnL = "" ;
      Z11807EstRqMnC = "" ;
      Z11810EstRqMnG = "" ;
      Z11812EstRqMnE = "" ;
      Z11813EstEspBef = DecimalUtil.ZERO ;
      Z11815EstEspAft = DecimalUtil.ZERO ;
      Z11819EstMet = "" ;
      Z11919EstMetod3 = "" ;
      Z11920EstMetod2 = "" ;
      Z11921EstMetod1 = "" ;
      Z130BarCodPar = "" ;
      Z1341EstDimObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV70BarCodPar = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A1340EstDimMat = "" ;
      lblTextblock8_Jsonclick = "" ;
      A1342EstDimSer = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1334EstDimDisN = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A1330EstColNom = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A1337EstDimFec = GXutil.nullDate() ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A3157EstDimNor = "" ;
      lblTextblock18_Jsonclick = "" ;
      A3158EstDimMaq = "" ;
      lblTextblock19_Jsonclick = "" ;
      A3159EstDimTAc = "" ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      lblTextblock22_Jsonclick = "" ;
      A3162EstDimEsp = DecimalUtil.ZERO ;
      lblTextblock23_Jsonclick = "" ;
      A3163EstDimTN = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A653OpeNom = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A1329EstCliNom = "" ;
      lblTextblock28_Jsonclick = "" ;
      A1335EstDimEncA = DecimalUtil.ZERO ;
      lblTextblock29_Jsonclick = "" ;
      A1336EstDimEncL = DecimalUtil.ZERO ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      A3164EstDimRef = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      A3743EstNorEsp = "" ;
      lblTextblock40_Jsonclick = "" ;
      A3872EstSanfEA = DecimalUtil.ZERO ;
      lblTextblock41_Jsonclick = "" ;
      A3873EstSanfEL = DecimalUtil.ZERO ;
      lblTextblock42_Jsonclick = "" ;
      A3874EstCalEA = DecimalUtil.ZERO ;
      lblTextblock43_Jsonclick = "" ;
      A3875EstCalEL = DecimalUtil.ZERO ;
      lblTextblock44_Jsonclick = "" ;
      A3876EstRamEA = DecimalUtil.ZERO ;
      lblTextblock45_Jsonclick = "" ;
      A3877EstRamEL = DecimalUtil.ZERO ;
      lblTextblock46_Jsonclick = "" ;
      A10977EstInclin = "" ;
      lblTextblock47_Jsonclick = "" ;
      A11806EstRqMnL = "" ;
      lblTextblock48_Jsonclick = "" ;
      A11807EstRqMnC = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      A11810EstRqMnG = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      A11812EstRqMnE = "" ;
      lblTextblock54_Jsonclick = "" ;
      A11813EstEspBef = DecimalUtil.ZERO ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      A11815EstEspAft = DecimalUtil.ZERO ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      A11817EstMedia = DecimalUtil.ZERO ;
      lblTextblock59_Jsonclick = "" ;
      lblTextblock60_Jsonclick = "" ;
      A11819EstMet = "" ;
      lblTextblock61_Jsonclick = "" ;
      lblTextblock62_Jsonclick = "" ;
      A11919EstMetod3 = "" ;
      lblTextblock63_Jsonclick = "" ;
      A11920EstMetod2 = "" ;
      lblTextblock64_Jsonclick = "" ;
      A11921EstMetod1 = "" ;
      lblTextblock65_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode187 = "" ;
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
      sMode186 = "" ;
      GXCCtl = "" ;
      A1341EstDimObs = "" ;
      Z407EmprNom = "" ;
      Z653OpeNom = "" ;
      T01I86_A407EmprNom = new String[] {""} ;
      T01I86_n407EmprNom = new boolean[] {false} ;
      T01I89_A1333EstDimCod = new int[1] ;
      T01I89_A407EmprNom = new String[] {""} ;
      T01I89_n407EmprNom = new boolean[] {false} ;
      T01I89_A1340EstDimMat = new String[] {""} ;
      T01I89_n1340EstDimMat = new boolean[] {false} ;
      T01I89_A1342EstDimSer = new String[] {""} ;
      T01I89_n1342EstDimSer = new boolean[] {false} ;
      T01I89_A1343EstDimTip = new short[1] ;
      T01I89_n1343EstDimTip = new boolean[] {false} ;
      T01I89_A1334EstDimDisN = new String[] {""} ;
      T01I89_n1334EstDimDisN = new boolean[] {false} ;
      T01I89_A3155EstDimAni = new short[1] ;
      T01I89_n3155EstDimAni = new boolean[] {false} ;
      T01I89_A3156EstDimGmi = new short[1] ;
      T01I89_n3156EstDimGmi = new boolean[] {false} ;
      T01I89_A1330EstColNom = new String[] {""} ;
      T01I89_n1330EstColNom = new boolean[] {false} ;
      T01I89_A1331EstColNum = new int[1] ;
      T01I89_n1331EstColNum = new boolean[] {false} ;
      T01I89_A1337EstDimFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01I89_n1337EstDimFec = new boolean[] {false} ;
      T01I89_A1332EstDimAnc = new short[1] ;
      T01I89_n1332EstDimAnc = new boolean[] {false} ;
      T01I89_A3157EstDimNor = new String[] {""} ;
      T01I89_n3157EstDimNor = new boolean[] {false} ;
      T01I89_A3158EstDimMaq = new String[] {""} ;
      T01I89_n3158EstDimMaq = new boolean[] {false} ;
      T01I89_A3159EstDimTAc = new String[] {""} ;
      T01I89_n3159EstDimTAc = new boolean[] {false} ;
      T01I89_A3160EstDimMan = new byte[1] ;
      T01I89_n3160EstDimMan = new boolean[] {false} ;
      T01I89_A3161EstDimPal = new byte[1] ;
      T01I89_n3161EstDimPal = new boolean[] {false} ;
      T01I89_A3162EstDimEsp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3162EstDimEsp = new boolean[] {false} ;
      T01I89_A3163EstDimTN = new String[] {""} ;
      T01I89_n3163EstDimTN = new boolean[] {false} ;
      T01I89_A653OpeNom = new String[] {""} ;
      T01I89_n653OpeNom = new boolean[] {false} ;
      T01I89_A1328EstCliCod = new int[1] ;
      T01I89_n1328EstCliCod = new boolean[] {false} ;
      T01I89_A1329EstCliNom = new String[] {""} ;
      T01I89_n1329EstCliNom = new boolean[] {false} ;
      T01I89_A1335EstDimEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n1335EstDimEncA = new boolean[] {false} ;
      T01I89_A1336EstDimEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n1336EstDimEncL = new boolean[] {false} ;
      T01I89_A1338EstDimGrm2 = new short[1] ;
      T01I89_n1338EstDimGrm2 = new boolean[] {false} ;
      T01I89_A1344EstDimUlin = new byte[1] ;
      T01I89_n1344EstDimUlin = new boolean[] {false} ;
      T01I89_A3164EstDimRef = new String[] {""} ;
      T01I89_n3164EstDimRef = new boolean[] {false} ;
      T01I89_A3737EstSanfAnc = new short[1] ;
      T01I89_n3737EstSanfAnc = new boolean[] {false} ;
      T01I89_A3738EstSanfGrm = new short[1] ;
      T01I89_n3738EstSanfGrm = new boolean[] {false} ;
      T01I89_A3739EstCalAnc = new short[1] ;
      T01I89_n3739EstCalAnc = new boolean[] {false} ;
      T01I89_A3740EstCalGrm = new short[1] ;
      T01I89_n3740EstCalGrm = new boolean[] {false} ;
      T01I89_A3741EstRamAnc = new short[1] ;
      T01I89_n3741EstRamAnc = new boolean[] {false} ;
      T01I89_A3742EstRamGrm = new short[1] ;
      T01I89_n3742EstRamGrm = new boolean[] {false} ;
      T01I89_A3743EstNorEsp = new String[] {""} ;
      T01I89_n3743EstNorEsp = new boolean[] {false} ;
      T01I89_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3872EstSanfEA = new boolean[] {false} ;
      T01I89_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3873EstSanfEL = new boolean[] {false} ;
      T01I89_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3874EstCalEA = new boolean[] {false} ;
      T01I89_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3875EstCalEL = new boolean[] {false} ;
      T01I89_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3876EstRamEA = new boolean[] {false} ;
      T01I89_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n3877EstRamEL = new boolean[] {false} ;
      T01I89_A10977EstInclin = new String[] {""} ;
      T01I89_n10977EstInclin = new boolean[] {false} ;
      T01I89_A11806EstRqMnL = new String[] {""} ;
      T01I89_n11806EstRqMnL = new boolean[] {false} ;
      T01I89_A11807EstRqMnC = new String[] {""} ;
      T01I89_n11807EstRqMnC = new boolean[] {false} ;
      T01I89_A11808EstEncASt = new byte[1] ;
      T01I89_n11808EstEncASt = new boolean[] {false} ;
      T01I89_A11809EstEncLSt = new byte[1] ;
      T01I89_n11809EstEncLSt = new boolean[] {false} ;
      T01I89_A11810EstRqMnG = new String[] {""} ;
      T01I89_n11810EstRqMnG = new boolean[] {false} ;
      T01I89_A11811EstAvGr = new byte[1] ;
      T01I89_n11811EstAvGr = new boolean[] {false} ;
      T01I89_A11812EstRqMnE = new String[] {""} ;
      T01I89_n11812EstRqMnE = new boolean[] {false} ;
      T01I89_A11813EstEspBef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n11813EstEspBef = new boolean[] {false} ;
      T01I89_A11814EstEspBSt = new byte[1] ;
      T01I89_n11814EstEspBSt = new boolean[] {false} ;
      T01I89_A11815EstEspAft = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I89_n11815EstEspAft = new boolean[] {false} ;
      T01I89_A11816EstEspASt = new byte[1] ;
      T01I89_n11816EstEspASt = new boolean[] {false} ;
      T01I89_A11818EstTpLv = new short[1] ;
      T01I89_n11818EstTpLv = new boolean[] {false} ;
      T01I89_A11819EstMet = new String[] {""} ;
      T01I89_n11819EstMet = new boolean[] {false} ;
      T01I89_A11820EstDimGrm3 = new short[1] ;
      T01I89_n11820EstDimGrm3 = new boolean[] {false} ;
      T01I89_A11919EstMetod3 = new String[] {""} ;
      T01I89_n11919EstMetod3 = new boolean[] {false} ;
      T01I89_A11920EstMetod2 = new String[] {""} ;
      T01I89_n11920EstMetod2 = new boolean[] {false} ;
      T01I89_A11921EstMetod1 = new String[] {""} ;
      T01I89_n11921EstMetod1 = new boolean[] {false} ;
      T01I89_A11927EstDimGrm1 = new short[1] ;
      T01I89_n11927EstDimGrm1 = new boolean[] {false} ;
      T01I89_A396EmprCod = new String[] {""} ;
      T01I89_A129BarCod = new int[1] ;
      T01I89_n129BarCod = new boolean[] {false} ;
      T01I89_A132BarCodReo = new byte[1] ;
      T01I89_n132BarCodReo = new boolean[] {false} ;
      T01I89_A130BarCodPar = new String[] {""} ;
      T01I89_n130BarCodPar = new boolean[] {false} ;
      T01I89_A652OpeCod = new int[1] ;
      T01I89_n652OpeCod = new boolean[] {false} ;
      T01I87_A396EmprCod = new String[] {""} ;
      T01I88_A653OpeNom = new String[] {""} ;
      T01I88_n653OpeNom = new boolean[] {false} ;
      T01I810_A396EmprCod = new String[] {""} ;
      T01I811_A653OpeNom = new String[] {""} ;
      T01I811_n653OpeNom = new boolean[] {false} ;
      T01I812_A396EmprCod = new String[] {""} ;
      T01I812_A1333EstDimCod = new int[1] ;
      T01I85_A1333EstDimCod = new int[1] ;
      T01I85_A1340EstDimMat = new String[] {""} ;
      T01I85_n1340EstDimMat = new boolean[] {false} ;
      T01I85_A1342EstDimSer = new String[] {""} ;
      T01I85_n1342EstDimSer = new boolean[] {false} ;
      T01I85_A1343EstDimTip = new short[1] ;
      T01I85_n1343EstDimTip = new boolean[] {false} ;
      T01I85_A1334EstDimDisN = new String[] {""} ;
      T01I85_n1334EstDimDisN = new boolean[] {false} ;
      T01I85_A3155EstDimAni = new short[1] ;
      T01I85_n3155EstDimAni = new boolean[] {false} ;
      T01I85_A3156EstDimGmi = new short[1] ;
      T01I85_n3156EstDimGmi = new boolean[] {false} ;
      T01I85_A1330EstColNom = new String[] {""} ;
      T01I85_n1330EstColNom = new boolean[] {false} ;
      T01I85_A1331EstColNum = new int[1] ;
      T01I85_n1331EstColNum = new boolean[] {false} ;
      T01I85_A1337EstDimFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01I85_n1337EstDimFec = new boolean[] {false} ;
      T01I85_A1332EstDimAnc = new short[1] ;
      T01I85_n1332EstDimAnc = new boolean[] {false} ;
      T01I85_A3157EstDimNor = new String[] {""} ;
      T01I85_n3157EstDimNor = new boolean[] {false} ;
      T01I85_A3158EstDimMaq = new String[] {""} ;
      T01I85_n3158EstDimMaq = new boolean[] {false} ;
      T01I85_A3159EstDimTAc = new String[] {""} ;
      T01I85_n3159EstDimTAc = new boolean[] {false} ;
      T01I85_A3160EstDimMan = new byte[1] ;
      T01I85_n3160EstDimMan = new boolean[] {false} ;
      T01I85_A3161EstDimPal = new byte[1] ;
      T01I85_n3161EstDimPal = new boolean[] {false} ;
      T01I85_A3162EstDimEsp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3162EstDimEsp = new boolean[] {false} ;
      T01I85_A3163EstDimTN = new String[] {""} ;
      T01I85_n3163EstDimTN = new boolean[] {false} ;
      T01I85_A1328EstCliCod = new int[1] ;
      T01I85_n1328EstCliCod = new boolean[] {false} ;
      T01I85_A1329EstCliNom = new String[] {""} ;
      T01I85_n1329EstCliNom = new boolean[] {false} ;
      T01I85_A1335EstDimEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n1335EstDimEncA = new boolean[] {false} ;
      T01I85_A1336EstDimEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n1336EstDimEncL = new boolean[] {false} ;
      T01I85_A1338EstDimGrm2 = new short[1] ;
      T01I85_n1338EstDimGrm2 = new boolean[] {false} ;
      T01I85_A1344EstDimUlin = new byte[1] ;
      T01I85_n1344EstDimUlin = new boolean[] {false} ;
      T01I85_A3164EstDimRef = new String[] {""} ;
      T01I85_n3164EstDimRef = new boolean[] {false} ;
      T01I85_A3737EstSanfAnc = new short[1] ;
      T01I85_n3737EstSanfAnc = new boolean[] {false} ;
      T01I85_A3738EstSanfGrm = new short[1] ;
      T01I85_n3738EstSanfGrm = new boolean[] {false} ;
      T01I85_A3739EstCalAnc = new short[1] ;
      T01I85_n3739EstCalAnc = new boolean[] {false} ;
      T01I85_A3740EstCalGrm = new short[1] ;
      T01I85_n3740EstCalGrm = new boolean[] {false} ;
      T01I85_A3741EstRamAnc = new short[1] ;
      T01I85_n3741EstRamAnc = new boolean[] {false} ;
      T01I85_A3742EstRamGrm = new short[1] ;
      T01I85_n3742EstRamGrm = new boolean[] {false} ;
      T01I85_A3743EstNorEsp = new String[] {""} ;
      T01I85_n3743EstNorEsp = new boolean[] {false} ;
      T01I85_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3872EstSanfEA = new boolean[] {false} ;
      T01I85_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3873EstSanfEL = new boolean[] {false} ;
      T01I85_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3874EstCalEA = new boolean[] {false} ;
      T01I85_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3875EstCalEL = new boolean[] {false} ;
      T01I85_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3876EstRamEA = new boolean[] {false} ;
      T01I85_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n3877EstRamEL = new boolean[] {false} ;
      T01I85_A10977EstInclin = new String[] {""} ;
      T01I85_n10977EstInclin = new boolean[] {false} ;
      T01I85_A11806EstRqMnL = new String[] {""} ;
      T01I85_n11806EstRqMnL = new boolean[] {false} ;
      T01I85_A11807EstRqMnC = new String[] {""} ;
      T01I85_n11807EstRqMnC = new boolean[] {false} ;
      T01I85_A11808EstEncASt = new byte[1] ;
      T01I85_n11808EstEncASt = new boolean[] {false} ;
      T01I85_A11809EstEncLSt = new byte[1] ;
      T01I85_n11809EstEncLSt = new boolean[] {false} ;
      T01I85_A11810EstRqMnG = new String[] {""} ;
      T01I85_n11810EstRqMnG = new boolean[] {false} ;
      T01I85_A11811EstAvGr = new byte[1] ;
      T01I85_n11811EstAvGr = new boolean[] {false} ;
      T01I85_A11812EstRqMnE = new String[] {""} ;
      T01I85_n11812EstRqMnE = new boolean[] {false} ;
      T01I85_A11813EstEspBef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n11813EstEspBef = new boolean[] {false} ;
      T01I85_A11814EstEspBSt = new byte[1] ;
      T01I85_n11814EstEspBSt = new boolean[] {false} ;
      T01I85_A11815EstEspAft = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I85_n11815EstEspAft = new boolean[] {false} ;
      T01I85_A11816EstEspASt = new byte[1] ;
      T01I85_n11816EstEspASt = new boolean[] {false} ;
      T01I85_A11818EstTpLv = new short[1] ;
      T01I85_n11818EstTpLv = new boolean[] {false} ;
      T01I85_A11819EstMet = new String[] {""} ;
      T01I85_n11819EstMet = new boolean[] {false} ;
      T01I85_A11820EstDimGrm3 = new short[1] ;
      T01I85_n11820EstDimGrm3 = new boolean[] {false} ;
      T01I85_A11919EstMetod3 = new String[] {""} ;
      T01I85_n11919EstMetod3 = new boolean[] {false} ;
      T01I85_A11920EstMetod2 = new String[] {""} ;
      T01I85_n11920EstMetod2 = new boolean[] {false} ;
      T01I85_A11921EstMetod1 = new String[] {""} ;
      T01I85_n11921EstMetod1 = new boolean[] {false} ;
      T01I85_A11927EstDimGrm1 = new short[1] ;
      T01I85_n11927EstDimGrm1 = new boolean[] {false} ;
      T01I85_A396EmprCod = new String[] {""} ;
      T01I85_A129BarCod = new int[1] ;
      T01I85_n129BarCod = new boolean[] {false} ;
      T01I85_A132BarCodReo = new byte[1] ;
      T01I85_n132BarCodReo = new boolean[] {false} ;
      T01I85_A130BarCodPar = new String[] {""} ;
      T01I85_n130BarCodPar = new boolean[] {false} ;
      T01I85_A652OpeCod = new int[1] ;
      T01I85_n652OpeCod = new boolean[] {false} ;
      T01I813_A396EmprCod = new String[] {""} ;
      T01I813_A1333EstDimCod = new int[1] ;
      T01I814_A396EmprCod = new String[] {""} ;
      T01I814_A1333EstDimCod = new int[1] ;
      T01I84_A1333EstDimCod = new int[1] ;
      T01I84_A1340EstDimMat = new String[] {""} ;
      T01I84_n1340EstDimMat = new boolean[] {false} ;
      T01I84_A1342EstDimSer = new String[] {""} ;
      T01I84_n1342EstDimSer = new boolean[] {false} ;
      T01I84_A1343EstDimTip = new short[1] ;
      T01I84_n1343EstDimTip = new boolean[] {false} ;
      T01I84_A1334EstDimDisN = new String[] {""} ;
      T01I84_n1334EstDimDisN = new boolean[] {false} ;
      T01I84_A3155EstDimAni = new short[1] ;
      T01I84_n3155EstDimAni = new boolean[] {false} ;
      T01I84_A3156EstDimGmi = new short[1] ;
      T01I84_n3156EstDimGmi = new boolean[] {false} ;
      T01I84_A1330EstColNom = new String[] {""} ;
      T01I84_n1330EstColNom = new boolean[] {false} ;
      T01I84_A1331EstColNum = new int[1] ;
      T01I84_n1331EstColNum = new boolean[] {false} ;
      T01I84_A1337EstDimFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01I84_n1337EstDimFec = new boolean[] {false} ;
      T01I84_A1332EstDimAnc = new short[1] ;
      T01I84_n1332EstDimAnc = new boolean[] {false} ;
      T01I84_A3157EstDimNor = new String[] {""} ;
      T01I84_n3157EstDimNor = new boolean[] {false} ;
      T01I84_A3158EstDimMaq = new String[] {""} ;
      T01I84_n3158EstDimMaq = new boolean[] {false} ;
      T01I84_A3159EstDimTAc = new String[] {""} ;
      T01I84_n3159EstDimTAc = new boolean[] {false} ;
      T01I84_A3160EstDimMan = new byte[1] ;
      T01I84_n3160EstDimMan = new boolean[] {false} ;
      T01I84_A3161EstDimPal = new byte[1] ;
      T01I84_n3161EstDimPal = new boolean[] {false} ;
      T01I84_A3162EstDimEsp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3162EstDimEsp = new boolean[] {false} ;
      T01I84_A3163EstDimTN = new String[] {""} ;
      T01I84_n3163EstDimTN = new boolean[] {false} ;
      T01I84_A1328EstCliCod = new int[1] ;
      T01I84_n1328EstCliCod = new boolean[] {false} ;
      T01I84_A1329EstCliNom = new String[] {""} ;
      T01I84_n1329EstCliNom = new boolean[] {false} ;
      T01I84_A1335EstDimEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n1335EstDimEncA = new boolean[] {false} ;
      T01I84_A1336EstDimEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n1336EstDimEncL = new boolean[] {false} ;
      T01I84_A1338EstDimGrm2 = new short[1] ;
      T01I84_n1338EstDimGrm2 = new boolean[] {false} ;
      T01I84_A1344EstDimUlin = new byte[1] ;
      T01I84_n1344EstDimUlin = new boolean[] {false} ;
      T01I84_A3164EstDimRef = new String[] {""} ;
      T01I84_n3164EstDimRef = new boolean[] {false} ;
      T01I84_A3737EstSanfAnc = new short[1] ;
      T01I84_n3737EstSanfAnc = new boolean[] {false} ;
      T01I84_A3738EstSanfGrm = new short[1] ;
      T01I84_n3738EstSanfGrm = new boolean[] {false} ;
      T01I84_A3739EstCalAnc = new short[1] ;
      T01I84_n3739EstCalAnc = new boolean[] {false} ;
      T01I84_A3740EstCalGrm = new short[1] ;
      T01I84_n3740EstCalGrm = new boolean[] {false} ;
      T01I84_A3741EstRamAnc = new short[1] ;
      T01I84_n3741EstRamAnc = new boolean[] {false} ;
      T01I84_A3742EstRamGrm = new short[1] ;
      T01I84_n3742EstRamGrm = new boolean[] {false} ;
      T01I84_A3743EstNorEsp = new String[] {""} ;
      T01I84_n3743EstNorEsp = new boolean[] {false} ;
      T01I84_A3872EstSanfEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3872EstSanfEA = new boolean[] {false} ;
      T01I84_A3873EstSanfEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3873EstSanfEL = new boolean[] {false} ;
      T01I84_A3874EstCalEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3874EstCalEA = new boolean[] {false} ;
      T01I84_A3875EstCalEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3875EstCalEL = new boolean[] {false} ;
      T01I84_A3876EstRamEA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3876EstRamEA = new boolean[] {false} ;
      T01I84_A3877EstRamEL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n3877EstRamEL = new boolean[] {false} ;
      T01I84_A10977EstInclin = new String[] {""} ;
      T01I84_n10977EstInclin = new boolean[] {false} ;
      T01I84_A11806EstRqMnL = new String[] {""} ;
      T01I84_n11806EstRqMnL = new boolean[] {false} ;
      T01I84_A11807EstRqMnC = new String[] {""} ;
      T01I84_n11807EstRqMnC = new boolean[] {false} ;
      T01I84_A11808EstEncASt = new byte[1] ;
      T01I84_n11808EstEncASt = new boolean[] {false} ;
      T01I84_A11809EstEncLSt = new byte[1] ;
      T01I84_n11809EstEncLSt = new boolean[] {false} ;
      T01I84_A11810EstRqMnG = new String[] {""} ;
      T01I84_n11810EstRqMnG = new boolean[] {false} ;
      T01I84_A11811EstAvGr = new byte[1] ;
      T01I84_n11811EstAvGr = new boolean[] {false} ;
      T01I84_A11812EstRqMnE = new String[] {""} ;
      T01I84_n11812EstRqMnE = new boolean[] {false} ;
      T01I84_A11813EstEspBef = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n11813EstEspBef = new boolean[] {false} ;
      T01I84_A11814EstEspBSt = new byte[1] ;
      T01I84_n11814EstEspBSt = new boolean[] {false} ;
      T01I84_A11815EstEspAft = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01I84_n11815EstEspAft = new boolean[] {false} ;
      T01I84_A11816EstEspASt = new byte[1] ;
      T01I84_n11816EstEspASt = new boolean[] {false} ;
      T01I84_A11818EstTpLv = new short[1] ;
      T01I84_n11818EstTpLv = new boolean[] {false} ;
      T01I84_A11819EstMet = new String[] {""} ;
      T01I84_n11819EstMet = new boolean[] {false} ;
      T01I84_A11820EstDimGrm3 = new short[1] ;
      T01I84_n11820EstDimGrm3 = new boolean[] {false} ;
      T01I84_A11919EstMetod3 = new String[] {""} ;
      T01I84_n11919EstMetod3 = new boolean[] {false} ;
      T01I84_A11920EstMetod2 = new String[] {""} ;
      T01I84_n11920EstMetod2 = new boolean[] {false} ;
      T01I84_A11921EstMetod1 = new String[] {""} ;
      T01I84_n11921EstMetod1 = new boolean[] {false} ;
      T01I84_A11927EstDimGrm1 = new short[1] ;
      T01I84_n11927EstDimGrm1 = new boolean[] {false} ;
      T01I84_A396EmprCod = new String[] {""} ;
      T01I84_A129BarCod = new int[1] ;
      T01I84_n129BarCod = new boolean[] {false} ;
      T01I84_A132BarCodReo = new byte[1] ;
      T01I84_n132BarCodReo = new boolean[] {false} ;
      T01I84_A130BarCodPar = new String[] {""} ;
      T01I84_n130BarCodPar = new boolean[] {false} ;
      T01I84_A652OpeCod = new int[1] ;
      T01I84_n652OpeCod = new boolean[] {false} ;
      T01I818_A653OpeNom = new String[] {""} ;
      T01I818_n653OpeNom = new boolean[] {false} ;
      T01I819_A396EmprCod = new String[] {""} ;
      T01I819_A1333EstDimCod = new int[1] ;
      T01I820_A1333EstDimCod = new int[1] ;
      T01I820_A1339EstDimLin = new byte[1] ;
      T01I820_A1341EstDimObs = new String[] {""} ;
      T01I820_n1341EstDimObs = new boolean[] {false} ;
      T01I820_A396EmprCod = new String[] {""} ;
      T01I821_A396EmprCod = new String[] {""} ;
      T01I821_A1333EstDimCod = new int[1] ;
      T01I821_A1339EstDimLin = new byte[1] ;
      T01I83_A1333EstDimCod = new int[1] ;
      T01I83_A1339EstDimLin = new byte[1] ;
      T01I83_A1341EstDimObs = new String[] {""} ;
      T01I83_n1341EstDimObs = new boolean[] {false} ;
      T01I83_A396EmprCod = new String[] {""} ;
      T01I82_A1333EstDimCod = new int[1] ;
      T01I82_A1339EstDimLin = new byte[1] ;
      T01I82_A1341EstDimObs = new String[] {""} ;
      T01I82_n1341EstDimObs = new boolean[] {false} ;
      T01I82_A396EmprCod = new String[] {""} ;
      T01I825_A396EmprCod = new String[] {""} ;
      T01I825_A1333EstDimCod = new int[1] ;
      T01I825_A1339EstDimLin = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01I826_A407EmprNom = new String[] {""} ;
      T01I826_n407EmprNom = new boolean[] {false} ;
      Z11817EstMedia = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ130BarCodPar = "" ;
      ZZ1340EstDimMat = "" ;
      ZZ1342EstDimSer = "" ;
      ZZ1334EstDimDisN = "" ;
      ZZ1330EstColNom = "" ;
      ZZ1337EstDimFec = GXutil.nullDate() ;
      ZZ3157EstDimNor = "" ;
      ZZ3158EstDimMaq = "" ;
      ZZ3159EstDimTAc = "" ;
      ZZ3162EstDimEsp = DecimalUtil.ZERO ;
      ZZ3163EstDimTN = "" ;
      ZZ1329EstCliNom = "" ;
      ZZ1335EstDimEncA = DecimalUtil.ZERO ;
      ZZ1336EstDimEncL = DecimalUtil.ZERO ;
      ZZ3164EstDimRef = "" ;
      ZZ3743EstNorEsp = "" ;
      ZZ3872EstSanfEA = DecimalUtil.ZERO ;
      ZZ3873EstSanfEL = DecimalUtil.ZERO ;
      ZZ3874EstCalEA = DecimalUtil.ZERO ;
      ZZ3875EstCalEL = DecimalUtil.ZERO ;
      ZZ3876EstRamEA = DecimalUtil.ZERO ;
      ZZ3877EstRamEL = DecimalUtil.ZERO ;
      ZZ10977EstInclin = "" ;
      ZZ11806EstRqMnL = "" ;
      ZZ11807EstRqMnC = "" ;
      ZZ11810EstRqMnG = "" ;
      ZZ11812EstRqMnE = "" ;
      ZZ11813EstEspBef = DecimalUtil.ZERO ;
      ZZ11815EstEspAft = DecimalUtil.ZERO ;
      ZZ11819EstMet = "" ;
      ZZ11919EstMetod3 = "" ;
      ZZ11920EstMetod2 = "" ;
      ZZ11921EstMetod1 = "" ;
      ZZ653OpeNom = "" ;
      ZZ11817EstMedia = DecimalUtil.ZERO ;
      T01I827_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tpdimest__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tpdimest__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tpdimest__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tpdimest__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tpdimest__default(),
         new Object[] {
             new Object[] {
            T01I82_A1333EstDimCod, T01I82_A1339EstDimLin, T01I82_A1341EstDimObs, T01I82_n1341EstDimObs, T01I82_A396EmprCod
            }
            , new Object[] {
            T01I83_A1333EstDimCod, T01I83_A1339EstDimLin, T01I83_A1341EstDimObs, T01I83_n1341EstDimObs, T01I83_A396EmprCod
            }
            , new Object[] {
            T01I84_A1333EstDimCod, T01I84_A1340EstDimMat, T01I84_n1340EstDimMat, T01I84_A1342EstDimSer, T01I84_n1342EstDimSer, T01I84_A1343EstDimTip, T01I84_n1343EstDimTip, T01I84_A1334EstDimDisN, T01I84_n1334EstDimDisN, T01I84_A3155EstDimAni,
            T01I84_n3155EstDimAni, T01I84_A3156EstDimGmi, T01I84_n3156EstDimGmi, T01I84_A1330EstColNom, T01I84_n1330EstColNom, T01I84_A1331EstColNum, T01I84_n1331EstColNum, T01I84_A1337EstDimFec, T01I84_n1337EstDimFec, T01I84_A1332EstDimAnc,
            T01I84_n1332EstDimAnc, T01I84_A3157EstDimNor, T01I84_n3157EstDimNor, T01I84_A3158EstDimMaq, T01I84_n3158EstDimMaq, T01I84_A3159EstDimTAc, T01I84_n3159EstDimTAc, T01I84_A3160EstDimMan, T01I84_n3160EstDimMan, T01I84_A3161EstDimPal,
            T01I84_n3161EstDimPal, T01I84_A3162EstDimEsp, T01I84_n3162EstDimEsp, T01I84_A3163EstDimTN, T01I84_n3163EstDimTN, T01I84_A1328EstCliCod, T01I84_n1328EstCliCod, T01I84_A1329EstCliNom, T01I84_n1329EstCliNom, T01I84_A1335EstDimEncA,
            T01I84_n1335EstDimEncA, T01I84_A1336EstDimEncL, T01I84_n1336EstDimEncL, T01I84_A1338EstDimGrm2, T01I84_n1338EstDimGrm2, T01I84_A1344EstDimUlin, T01I84_n1344EstDimUlin, T01I84_A3164EstDimRef, T01I84_n3164EstDimRef, T01I84_A3737EstSanfAnc,
            T01I84_n3737EstSanfAnc, T01I84_A3738EstSanfGrm, T01I84_n3738EstSanfGrm, T01I84_A3739EstCalAnc, T01I84_n3739EstCalAnc, T01I84_A3740EstCalGrm, T01I84_n3740EstCalGrm, T01I84_A3741EstRamAnc, T01I84_n3741EstRamAnc, T01I84_A3742EstRamGrm,
            T01I84_n3742EstRamGrm, T01I84_A3743EstNorEsp, T01I84_n3743EstNorEsp, T01I84_A3872EstSanfEA, T01I84_n3872EstSanfEA, T01I84_A3873EstSanfEL, T01I84_n3873EstSanfEL, T01I84_A3874EstCalEA, T01I84_n3874EstCalEA, T01I84_A3875EstCalEL,
            T01I84_n3875EstCalEL, T01I84_A3876EstRamEA, T01I84_n3876EstRamEA, T01I84_A3877EstRamEL, T01I84_n3877EstRamEL, T01I84_A10977EstInclin, T01I84_n10977EstInclin, T01I84_A11806EstRqMnL, T01I84_n11806EstRqMnL, T01I84_A11807EstRqMnC,
            T01I84_n11807EstRqMnC, T01I84_A11808EstEncASt, T01I84_n11808EstEncASt, T01I84_A11809EstEncLSt, T01I84_n11809EstEncLSt, T01I84_A11810EstRqMnG, T01I84_n11810EstRqMnG, T01I84_A11811EstAvGr, T01I84_n11811EstAvGr, T01I84_A11812EstRqMnE,
            T01I84_n11812EstRqMnE, T01I84_A11813EstEspBef, T01I84_n11813EstEspBef, T01I84_A11814EstEspBSt, T01I84_n11814EstEspBSt, T01I84_A11815EstEspAft, T01I84_n11815EstEspAft, T01I84_A11816EstEspASt, T01I84_n11816EstEspASt, T01I84_A11818EstTpLv,
            T01I84_n11818EstTpLv, T01I84_A11819EstMet, T01I84_n11819EstMet, T01I84_A11820EstDimGrm3, T01I84_n11820EstDimGrm3, T01I84_A11919EstMetod3, T01I84_n11919EstMetod3, T01I84_A11920EstMetod2, T01I84_n11920EstMetod2, T01I84_A11921EstMetod1,
            T01I84_n11921EstMetod1, T01I84_A11927EstDimGrm1, T01I84_n11927EstDimGrm1, T01I84_A396EmprCod, T01I84_A129BarCod, T01I84_n129BarCod, T01I84_A132BarCodReo, T01I84_n132BarCodReo, T01I84_A130BarCodPar, T01I84_n130BarCodPar,
            T01I84_A652OpeCod, T01I84_n652OpeCod
            }
            , new Object[] {
            T01I85_A1333EstDimCod, T01I85_A1340EstDimMat, T01I85_n1340EstDimMat, T01I85_A1342EstDimSer, T01I85_n1342EstDimSer, T01I85_A1343EstDimTip, T01I85_n1343EstDimTip, T01I85_A1334EstDimDisN, T01I85_n1334EstDimDisN, T01I85_A3155EstDimAni,
            T01I85_n3155EstDimAni, T01I85_A3156EstDimGmi, T01I85_n3156EstDimGmi, T01I85_A1330EstColNom, T01I85_n1330EstColNom, T01I85_A1331EstColNum, T01I85_n1331EstColNum, T01I85_A1337EstDimFec, T01I85_n1337EstDimFec, T01I85_A1332EstDimAnc,
            T01I85_n1332EstDimAnc, T01I85_A3157EstDimNor, T01I85_n3157EstDimNor, T01I85_A3158EstDimMaq, T01I85_n3158EstDimMaq, T01I85_A3159EstDimTAc, T01I85_n3159EstDimTAc, T01I85_A3160EstDimMan, T01I85_n3160EstDimMan, T01I85_A3161EstDimPal,
            T01I85_n3161EstDimPal, T01I85_A3162EstDimEsp, T01I85_n3162EstDimEsp, T01I85_A3163EstDimTN, T01I85_n3163EstDimTN, T01I85_A1328EstCliCod, T01I85_n1328EstCliCod, T01I85_A1329EstCliNom, T01I85_n1329EstCliNom, T01I85_A1335EstDimEncA,
            T01I85_n1335EstDimEncA, T01I85_A1336EstDimEncL, T01I85_n1336EstDimEncL, T01I85_A1338EstDimGrm2, T01I85_n1338EstDimGrm2, T01I85_A1344EstDimUlin, T01I85_n1344EstDimUlin, T01I85_A3164EstDimRef, T01I85_n3164EstDimRef, T01I85_A3737EstSanfAnc,
            T01I85_n3737EstSanfAnc, T01I85_A3738EstSanfGrm, T01I85_n3738EstSanfGrm, T01I85_A3739EstCalAnc, T01I85_n3739EstCalAnc, T01I85_A3740EstCalGrm, T01I85_n3740EstCalGrm, T01I85_A3741EstRamAnc, T01I85_n3741EstRamAnc, T01I85_A3742EstRamGrm,
            T01I85_n3742EstRamGrm, T01I85_A3743EstNorEsp, T01I85_n3743EstNorEsp, T01I85_A3872EstSanfEA, T01I85_n3872EstSanfEA, T01I85_A3873EstSanfEL, T01I85_n3873EstSanfEL, T01I85_A3874EstCalEA, T01I85_n3874EstCalEA, T01I85_A3875EstCalEL,
            T01I85_n3875EstCalEL, T01I85_A3876EstRamEA, T01I85_n3876EstRamEA, T01I85_A3877EstRamEL, T01I85_n3877EstRamEL, T01I85_A10977EstInclin, T01I85_n10977EstInclin, T01I85_A11806EstRqMnL, T01I85_n11806EstRqMnL, T01I85_A11807EstRqMnC,
            T01I85_n11807EstRqMnC, T01I85_A11808EstEncASt, T01I85_n11808EstEncASt, T01I85_A11809EstEncLSt, T01I85_n11809EstEncLSt, T01I85_A11810EstRqMnG, T01I85_n11810EstRqMnG, T01I85_A11811EstAvGr, T01I85_n11811EstAvGr, T01I85_A11812EstRqMnE,
            T01I85_n11812EstRqMnE, T01I85_A11813EstEspBef, T01I85_n11813EstEspBef, T01I85_A11814EstEspBSt, T01I85_n11814EstEspBSt, T01I85_A11815EstEspAft, T01I85_n11815EstEspAft, T01I85_A11816EstEspASt, T01I85_n11816EstEspASt, T01I85_A11818EstTpLv,
            T01I85_n11818EstTpLv, T01I85_A11819EstMet, T01I85_n11819EstMet, T01I85_A11820EstDimGrm3, T01I85_n11820EstDimGrm3, T01I85_A11919EstMetod3, T01I85_n11919EstMetod3, T01I85_A11920EstMetod2, T01I85_n11920EstMetod2, T01I85_A11921EstMetod1,
            T01I85_n11921EstMetod1, T01I85_A11927EstDimGrm1, T01I85_n11927EstDimGrm1, T01I85_A396EmprCod, T01I85_A129BarCod, T01I85_n129BarCod, T01I85_A132BarCodReo, T01I85_n132BarCodReo, T01I85_A130BarCodPar, T01I85_n130BarCodPar,
            T01I85_A652OpeCod, T01I85_n652OpeCod
            }
            , new Object[] {
            T01I86_A407EmprNom, T01I86_n407EmprNom
            }
            , new Object[] {
            T01I87_A396EmprCod
            }
            , new Object[] {
            T01I88_A653OpeNom, T01I88_n653OpeNom
            }
            , new Object[] {
            T01I89_A1333EstDimCod, T01I89_A407EmprNom, T01I89_n407EmprNom, T01I89_A1340EstDimMat, T01I89_n1340EstDimMat, T01I89_A1342EstDimSer, T01I89_n1342EstDimSer, T01I89_A1343EstDimTip, T01I89_n1343EstDimTip, T01I89_A1334EstDimDisN,
            T01I89_n1334EstDimDisN, T01I89_A3155EstDimAni, T01I89_n3155EstDimAni, T01I89_A3156EstDimGmi, T01I89_n3156EstDimGmi, T01I89_A1330EstColNom, T01I89_n1330EstColNom, T01I89_A1331EstColNum, T01I89_n1331EstColNum, T01I89_A1337EstDimFec,
            T01I89_n1337EstDimFec, T01I89_A1332EstDimAnc, T01I89_n1332EstDimAnc, T01I89_A3157EstDimNor, T01I89_n3157EstDimNor, T01I89_A3158EstDimMaq, T01I89_n3158EstDimMaq, T01I89_A3159EstDimTAc, T01I89_n3159EstDimTAc, T01I89_A3160EstDimMan,
            T01I89_n3160EstDimMan, T01I89_A3161EstDimPal, T01I89_n3161EstDimPal, T01I89_A3162EstDimEsp, T01I89_n3162EstDimEsp, T01I89_A3163EstDimTN, T01I89_n3163EstDimTN, T01I89_A653OpeNom, T01I89_n653OpeNom, T01I89_A1328EstCliCod,
            T01I89_n1328EstCliCod, T01I89_A1329EstCliNom, T01I89_n1329EstCliNom, T01I89_A1335EstDimEncA, T01I89_n1335EstDimEncA, T01I89_A1336EstDimEncL, T01I89_n1336EstDimEncL, T01I89_A1338EstDimGrm2, T01I89_n1338EstDimGrm2, T01I89_A1344EstDimUlin,
            T01I89_n1344EstDimUlin, T01I89_A3164EstDimRef, T01I89_n3164EstDimRef, T01I89_A3737EstSanfAnc, T01I89_n3737EstSanfAnc, T01I89_A3738EstSanfGrm, T01I89_n3738EstSanfGrm, T01I89_A3739EstCalAnc, T01I89_n3739EstCalAnc, T01I89_A3740EstCalGrm,
            T01I89_n3740EstCalGrm, T01I89_A3741EstRamAnc, T01I89_n3741EstRamAnc, T01I89_A3742EstRamGrm, T01I89_n3742EstRamGrm, T01I89_A3743EstNorEsp, T01I89_n3743EstNorEsp, T01I89_A3872EstSanfEA, T01I89_n3872EstSanfEA, T01I89_A3873EstSanfEL,
            T01I89_n3873EstSanfEL, T01I89_A3874EstCalEA, T01I89_n3874EstCalEA, T01I89_A3875EstCalEL, T01I89_n3875EstCalEL, T01I89_A3876EstRamEA, T01I89_n3876EstRamEA, T01I89_A3877EstRamEL, T01I89_n3877EstRamEL, T01I89_A10977EstInclin,
            T01I89_n10977EstInclin, T01I89_A11806EstRqMnL, T01I89_n11806EstRqMnL, T01I89_A11807EstRqMnC, T01I89_n11807EstRqMnC, T01I89_A11808EstEncASt, T01I89_n11808EstEncASt, T01I89_A11809EstEncLSt, T01I89_n11809EstEncLSt, T01I89_A11810EstRqMnG,
            T01I89_n11810EstRqMnG, T01I89_A11811EstAvGr, T01I89_n11811EstAvGr, T01I89_A11812EstRqMnE, T01I89_n11812EstRqMnE, T01I89_A11813EstEspBef, T01I89_n11813EstEspBef, T01I89_A11814EstEspBSt, T01I89_n11814EstEspBSt, T01I89_A11815EstEspAft,
            T01I89_n11815EstEspAft, T01I89_A11816EstEspASt, T01I89_n11816EstEspASt, T01I89_A11818EstTpLv, T01I89_n11818EstTpLv, T01I89_A11819EstMet, T01I89_n11819EstMet, T01I89_A11820EstDimGrm3, T01I89_n11820EstDimGrm3, T01I89_A11919EstMetod3,
            T01I89_n11919EstMetod3, T01I89_A11920EstMetod2, T01I89_n11920EstMetod2, T01I89_A11921EstMetod1, T01I89_n11921EstMetod1, T01I89_A11927EstDimGrm1, T01I89_n11927EstDimGrm1, T01I89_A396EmprCod, T01I89_A129BarCod, T01I89_n129BarCod,
            T01I89_A132BarCodReo, T01I89_n132BarCodReo, T01I89_A130BarCodPar, T01I89_n130BarCodPar, T01I89_A652OpeCod, T01I89_n652OpeCod
            }
            , new Object[] {
            T01I810_A396EmprCod
            }
            , new Object[] {
            T01I811_A653OpeNom, T01I811_n653OpeNom
            }
            , new Object[] {
            T01I812_A396EmprCod, T01I812_A1333EstDimCod
            }
            , new Object[] {
            T01I813_A396EmprCod, T01I813_A1333EstDimCod
            }
            , new Object[] {
            T01I814_A396EmprCod, T01I814_A1333EstDimCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01I818_A653OpeNom, T01I818_n653OpeNom
            }
            , new Object[] {
            T01I819_A396EmprCod, T01I819_A1333EstDimCod
            }
            , new Object[] {
            T01I820_A1333EstDimCod, T01I820_A1339EstDimLin, T01I820_A1341EstDimObs, T01I820_n1341EstDimObs, T01I820_A396EmprCod
            }
            , new Object[] {
            T01I821_A396EmprCod, T01I821_A1333EstDimCod, T01I821_A1339EstDimLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01I825_A396EmprCod, T01I825_A1333EstDimCod, T01I825_A1339EstDimLin
            }
            , new Object[] {
            T01I826_A407EmprNom, T01I826_n407EmprNom
            }
            , new Object[] {
            T01I827_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte wcpOAV69BarCodReo ;
   private byte Z3160EstDimMan ;
   private byte Z3161EstDimPal ;
   private byte Z1344EstDimUlin ;
   private byte Z11808EstEncASt ;
   private byte Z11809EstEncLSt ;
   private byte Z11811EstAvGr ;
   private byte Z11814EstEspBSt ;
   private byte Z11816EstEspASt ;
   private byte Z132BarCodReo ;
   private byte Z1339EstDimLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV69BarCodReo ;
   private byte nKeyPressed ;
   private byte A3160EstDimMan ;
   private byte A3161EstDimPal ;
   private byte A1344EstDimUlin ;
   private byte A11808EstEncASt ;
   private byte A11809EstEncLSt ;
   private byte A11811EstAvGr ;
   private byte A11814EstEspBSt ;
   private byte A11816EstEspASt ;
   private byte A1339EstDimLin ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3160EstDimMan ;
   private byte ZZ3161EstDimPal ;
   private byte ZZ1344EstDimUlin ;
   private byte ZZ11808EstEncASt ;
   private byte ZZ11809EstEncLSt ;
   private byte ZZ11811EstAvGr ;
   private byte ZZ11814EstEspBSt ;
   private byte ZZ11816EstEspASt ;
   private short Z1343EstDimTip ;
   private short Z3155EstDimAni ;
   private short Z3156EstDimGmi ;
   private short Z1332EstDimAnc ;
   private short Z1338EstDimGrm2 ;
   private short Z3737EstSanfAnc ;
   private short Z3738EstSanfGrm ;
   private short Z3739EstCalAnc ;
   private short Z3740EstCalGrm ;
   private short Z3741EstRamAnc ;
   private short Z3742EstRamGrm ;
   private short Z11818EstTpLv ;
   private short Z11820EstDimGrm3 ;
   private short Z11927EstDimGrm1 ;
   private short nRcdDeleted_187 ;
   private short nRcdExists_187 ;
   private short nIsMod_187 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1343EstDimTip ;
   private short A3155EstDimAni ;
   private short A3156EstDimGmi ;
   private short A1332EstDimAnc ;
   private short A1338EstDimGrm2 ;
   private short A3737EstSanfAnc ;
   private short A3738EstSanfGrm ;
   private short A3739EstCalAnc ;
   private short A3740EstCalGrm ;
   private short A3741EstRamAnc ;
   private short A3742EstRamGrm ;
   private short A11818EstTpLv ;
   private short A11820EstDimGrm3 ;
   private short A11927EstDimGrm1 ;
   private short nBlankRcdCount187 ;
   private short RcdFound187 ;
   private short nBlankRcdUsr187 ;
   private short RcdFound186 ;
   private short nIsDirty_186 ;
   private short nIsDirty_187 ;
   private short ZZ1343EstDimTip ;
   private short ZZ3155EstDimAni ;
   private short ZZ3156EstDimGmi ;
   private short ZZ1332EstDimAnc ;
   private short ZZ1338EstDimGrm2 ;
   private short ZZ3737EstSanfAnc ;
   private short ZZ3738EstSanfGrm ;
   private short ZZ3739EstCalAnc ;
   private short ZZ3740EstCalGrm ;
   private short ZZ3741EstRamAnc ;
   private short ZZ3742EstRamGrm ;
   private short ZZ11818EstTpLv ;
   private short ZZ11820EstDimGrm3 ;
   private short ZZ11927EstDimGrm1 ;
   private int wcpOAV68BarCod ;
   private int Z1333EstDimCod ;
   private int Z1331EstColNum ;
   private int Z1328EstCliCod ;
   private int Z129BarCod ;
   private int Z652OpeCod ;
   private int nRC_GXsfl_345 ;
   private int nGXsfl_345_idx=1 ;
   private int A129BarCod ;
   private int A652OpeCod ;
   private int AV68BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A1333EstDimCod ;
   private int edtEstDimCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtEstDimMat_Enabled ;
   private int edtEstDimSer_Enabled ;
   private int edtEstDimTip_Enabled ;
   private int edtEstDimDisN_Enabled ;
   private int edtEstDimAni_Enabled ;
   private int edtEstDimGmi_Enabled ;
   private int edtEstColNom_Enabled ;
   private int A1331EstColNum ;
   private int edtEstColNum_Enabled ;
   private int edtEstDimFec_Enabled ;
   private int edtEstDimAnc_Enabled ;
   private int edtEstDimNor_Enabled ;
   private int edtEstDimMaq_Enabled ;
   private int edtEstDimTAc_Enabled ;
   private int edtEstDimMan_Enabled ;
   private int edtEstDimPal_Enabled ;
   private int edtEstDimEsp_Enabled ;
   private int edtEstDimTN_Enabled ;
   private int edtOpeCod_Enabled ;
   private int edtOpeNom_Enabled ;
   private int A1328EstCliCod ;
   private int edtEstCliCod_Enabled ;
   private int edtEstCliNom_Enabled ;
   private int edtEstDimEncA_Enabled ;
   private int edtEstDimEncL_Enabled ;
   private int edtEstDimGrm2_Enabled ;
   private int edtEstDimUlin_Enabled ;
   private int edtEstDimRef_Enabled ;
   private int edtEstSanfAnc_Enabled ;
   private int edtEstSanfGrm_Enabled ;
   private int edtEstCalAnc_Enabled ;
   private int edtEstCalGrm_Enabled ;
   private int edtEstRamAnc_Enabled ;
   private int edtEstRamGrm_Enabled ;
   private int edtEstNorEsp_Enabled ;
   private int edtEstSanfEA_Enabled ;
   private int edtEstSanfEL_Enabled ;
   private int edtEstCalEA_Enabled ;
   private int edtEstCalEL_Enabled ;
   private int edtEstRamEA_Enabled ;
   private int edtEstRamEL_Enabled ;
   private int edtEstInclin_Enabled ;
   private int edtEstRqMnL_Enabled ;
   private int edtEstRqMnC_Enabled ;
   private int edtEstEncASt_Enabled ;
   private int edtEstEncLSt_Enabled ;
   private int edtEstRqMnG_Enabled ;
   private int edtEstAvGr_Enabled ;
   private int edtEstRqMnE_Enabled ;
   private int edtEstEspBef_Enabled ;
   private int edtEstEspBSt_Enabled ;
   private int edtEstEspAft_Enabled ;
   private int edtEstEspASt_Enabled ;
   private int edtEstMedia_Enabled ;
   private int edtEstTpLv_Enabled ;
   private int edtEstMet_Enabled ;
   private int edtEstDimGrm3_Enabled ;
   private int edtEstMetod3_Enabled ;
   private int edtEstMetod2_Enabled ;
   private int edtEstMetod1_Enabled ;
   private int edtEstDimGrm1_Enabled ;
   private int edtavnRcdDeleted_187_Enabled ;
   private int edtEstDimLin_Enabled ;
   private int edtEstDimObs_Enabled ;
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
   private int defedtEstDimLin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEstDimGrm1_Backcolor ;
   private int edtEstMetod1_Backcolor ;
   private int edtEstMetod2_Backcolor ;
   private int edtEstMetod3_Backcolor ;
   private int edtEstDimGrm3_Backcolor ;
   private int edtEstMet_Backcolor ;
   private int edtEstTpLv_Backcolor ;
   private int edtEstMedia_Backcolor ;
   private int edtEstEspASt_Backcolor ;
   private int edtEstEspAft_Backcolor ;
   private int edtEstEspBSt_Backcolor ;
   private int edtEstEspBef_Backcolor ;
   private int edtEstRqMnE_Backcolor ;
   private int edtEstAvGr_Backcolor ;
   private int edtEstRqMnG_Backcolor ;
   private int edtEstEncLSt_Backcolor ;
   private int edtEstEncASt_Backcolor ;
   private int edtEstRqMnC_Backcolor ;
   private int edtEstRqMnL_Backcolor ;
   private int edtEstInclin_Backcolor ;
   private int edtEstRamEL_Backcolor ;
   private int edtEstRamEA_Backcolor ;
   private int edtEstCalEL_Backcolor ;
   private int edtEstCalEA_Backcolor ;
   private int edtEstSanfEL_Backcolor ;
   private int edtEstSanfEA_Backcolor ;
   private int edtEstNorEsp_Backcolor ;
   private int edtEstRamGrm_Backcolor ;
   private int edtEstRamAnc_Backcolor ;
   private int edtEstCalGrm_Backcolor ;
   private int edtEstCalAnc_Backcolor ;
   private int edtEstSanfGrm_Backcolor ;
   private int edtEstSanfAnc_Backcolor ;
   private int edtEstDimRef_Backcolor ;
   private int edtEstDimUlin_Backcolor ;
   private int edtEstDimGrm2_Backcolor ;
   private int edtEstDimEncL_Backcolor ;
   private int edtEstDimEncA_Backcolor ;
   private int edtEstCliNom_Backcolor ;
   private int edtEstCliCod_Backcolor ;
   private int edtOpeNom_Backcolor ;
   private int edtOpeCod_Backcolor ;
   private int edtEstDimTN_Backcolor ;
   private int edtEstDimEsp_Backcolor ;
   private int edtEstDimPal_Backcolor ;
   private int edtEstDimMan_Backcolor ;
   private int edtEstDimTAc_Backcolor ;
   private int edtEstDimMaq_Backcolor ;
   private int edtEstDimNor_Backcolor ;
   private int edtEstDimAnc_Backcolor ;
   private int edtEstDimFec_Backcolor ;
   private int edtEstColNum_Backcolor ;
   private int edtEstColNom_Backcolor ;
   private int edtEstDimGmi_Backcolor ;
   private int edtEstDimAni_Backcolor ;
   private int edtEstDimDisN_Backcolor ;
   private int edtEstDimTip_Backcolor ;
   private int edtEstDimSer_Backcolor ;
   private int edtEstDimMat_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEstDimCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ1333EstDimCod ;
   private int ZZ129BarCod ;
   private int ZZ1331EstColNum ;
   private int ZZ652OpeCod ;
   private int ZZ1328EstCliCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z3162EstDimEsp ;
   private java.math.BigDecimal Z1335EstDimEncA ;
   private java.math.BigDecimal Z1336EstDimEncL ;
   private java.math.BigDecimal Z3872EstSanfEA ;
   private java.math.BigDecimal Z3873EstSanfEL ;
   private java.math.BigDecimal Z3874EstCalEA ;
   private java.math.BigDecimal Z3875EstCalEL ;
   private java.math.BigDecimal Z3876EstRamEA ;
   private java.math.BigDecimal Z3877EstRamEL ;
   private java.math.BigDecimal Z11813EstEspBef ;
   private java.math.BigDecimal Z11815EstEspAft ;
   private java.math.BigDecimal A3162EstDimEsp ;
   private java.math.BigDecimal A1335EstDimEncA ;
   private java.math.BigDecimal A1336EstDimEncL ;
   private java.math.BigDecimal A3872EstSanfEA ;
   private java.math.BigDecimal A3873EstSanfEL ;
   private java.math.BigDecimal A3874EstCalEA ;
   private java.math.BigDecimal A3875EstCalEL ;
   private java.math.BigDecimal A3876EstRamEA ;
   private java.math.BigDecimal A3877EstRamEL ;
   private java.math.BigDecimal A11813EstEspBef ;
   private java.math.BigDecimal A11815EstEspAft ;
   private java.math.BigDecimal A11817EstMedia ;
   private java.math.BigDecimal Z11817EstMedia ;
   private java.math.BigDecimal ZZ3162EstDimEsp ;
   private java.math.BigDecimal ZZ1335EstDimEncA ;
   private java.math.BigDecimal ZZ1336EstDimEncL ;
   private java.math.BigDecimal ZZ3872EstSanfEA ;
   private java.math.BigDecimal ZZ3873EstSanfEL ;
   private java.math.BigDecimal ZZ3874EstCalEA ;
   private java.math.BigDecimal ZZ3875EstCalEL ;
   private java.math.BigDecimal ZZ3876EstRamEA ;
   private java.math.BigDecimal ZZ3877EstRamEL ;
   private java.math.BigDecimal ZZ11813EstEspBef ;
   private java.math.BigDecimal ZZ11815EstEspAft ;
   private java.math.BigDecimal ZZ11817EstMedia ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV70BarCodPar ;
   private String Z396EmprCod ;
   private String Z1340EstDimMat ;
   private String Z1342EstDimSer ;
   private String Z1334EstDimDisN ;
   private String Z1330EstColNom ;
   private String Z3157EstDimNor ;
   private String Z3158EstDimMaq ;
   private String Z3159EstDimTAc ;
   private String Z3163EstDimTN ;
   private String Z1329EstCliNom ;
   private String Z3164EstDimRef ;
   private String Z3743EstNorEsp ;
   private String Z10977EstInclin ;
   private String Z11806EstRqMnL ;
   private String Z11807EstRqMnC ;
   private String Z11810EstRqMnG ;
   private String Z11812EstRqMnE ;
   private String Z11819EstMet ;
   private String Z11919EstMetod3 ;
   private String Z11920EstMetod2 ;
   private String Z11921EstMetod1 ;
   private String Z130BarCodPar ;
   private String Z1341EstDimObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV70BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEstDimCod_Internalname ;
   private String sGXsfl_345_idx="0001" ;
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
   private String edtEstDimCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
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
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEstDimMat_Internalname ;
   private String A1340EstDimMat ;
   private String edtEstDimMat_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEstDimSer_Internalname ;
   private String A1342EstDimSer ;
   private String edtEstDimSer_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEstDimTip_Internalname ;
   private String edtEstDimTip_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtEstDimDisN_Internalname ;
   private String A1334EstDimDisN ;
   private String edtEstDimDisN_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtEstDimAni_Internalname ;
   private String edtEstDimAni_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtEstDimGmi_Internalname ;
   private String edtEstDimGmi_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtEstColNom_Internalname ;
   private String A1330EstColNom ;
   private String edtEstColNom_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtEstColNum_Internalname ;
   private String edtEstColNum_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtEstDimFec_Internalname ;
   private String edtEstDimFec_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtEstDimAnc_Internalname ;
   private String edtEstDimAnc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtEstDimNor_Internalname ;
   private String A3157EstDimNor ;
   private String edtEstDimNor_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtEstDimMaq_Internalname ;
   private String A3158EstDimMaq ;
   private String edtEstDimMaq_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtEstDimTAc_Internalname ;
   private String A3159EstDimTAc ;
   private String edtEstDimTAc_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtEstDimMan_Internalname ;
   private String edtEstDimMan_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtEstDimPal_Internalname ;
   private String edtEstDimPal_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtEstDimEsp_Internalname ;
   private String edtEstDimEsp_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtEstDimTN_Internalname ;
   private String A3163EstDimTN ;
   private String edtEstDimTN_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtOpeCod_Internalname ;
   private String edtOpeCod_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtOpeNom_Internalname ;
   private String A653OpeNom ;
   private String edtOpeNom_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtEstCliCod_Internalname ;
   private String edtEstCliCod_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtEstCliNom_Internalname ;
   private String A1329EstCliNom ;
   private String edtEstCliNom_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtEstDimEncA_Internalname ;
   private String edtEstDimEncA_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtEstDimEncL_Internalname ;
   private String edtEstDimEncL_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtEstDimGrm2_Internalname ;
   private String edtEstDimGrm2_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtEstDimUlin_Internalname ;
   private String edtEstDimUlin_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtEstDimRef_Internalname ;
   private String A3164EstDimRef ;
   private String edtEstDimRef_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtEstSanfAnc_Internalname ;
   private String edtEstSanfAnc_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtEstSanfGrm_Internalname ;
   private String edtEstSanfGrm_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtEstCalAnc_Internalname ;
   private String edtEstCalAnc_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtEstCalGrm_Internalname ;
   private String edtEstCalGrm_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtEstRamAnc_Internalname ;
   private String edtEstRamAnc_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtEstRamGrm_Internalname ;
   private String edtEstRamGrm_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtEstNorEsp_Internalname ;
   private String A3743EstNorEsp ;
   private String edtEstNorEsp_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtEstSanfEA_Internalname ;
   private String edtEstSanfEA_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtEstSanfEL_Internalname ;
   private String edtEstSanfEL_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtEstCalEA_Internalname ;
   private String edtEstCalEA_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtEstCalEL_Internalname ;
   private String edtEstCalEL_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtEstRamEA_Internalname ;
   private String edtEstRamEA_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtEstRamEL_Internalname ;
   private String edtEstRamEL_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtEstInclin_Internalname ;
   private String A10977EstInclin ;
   private String edtEstInclin_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtEstRqMnL_Internalname ;
   private String A11806EstRqMnL ;
   private String edtEstRqMnL_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtEstRqMnC_Internalname ;
   private String A11807EstRqMnC ;
   private String edtEstRqMnC_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtEstEncASt_Internalname ;
   private String edtEstEncASt_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtEstEncLSt_Internalname ;
   private String edtEstEncLSt_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtEstRqMnG_Internalname ;
   private String A11810EstRqMnG ;
   private String edtEstRqMnG_Jsonclick ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String edtEstAvGr_Internalname ;
   private String edtEstAvGr_Jsonclick ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock53_Jsonclick ;
   private String edtEstRqMnE_Internalname ;
   private String A11812EstRqMnE ;
   private String edtEstRqMnE_Jsonclick ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock54_Jsonclick ;
   private String edtEstEspBef_Internalname ;
   private String edtEstEspBef_Jsonclick ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock55_Jsonclick ;
   private String edtEstEspBSt_Internalname ;
   private String edtEstEspBSt_Jsonclick ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock56_Jsonclick ;
   private String edtEstEspAft_Internalname ;
   private String edtEstEspAft_Jsonclick ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock57_Jsonclick ;
   private String edtEstEspASt_Internalname ;
   private String edtEstEspASt_Jsonclick ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock58_Jsonclick ;
   private String edtEstMedia_Internalname ;
   private String edtEstMedia_Jsonclick ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock59_Jsonclick ;
   private String edtEstTpLv_Internalname ;
   private String edtEstTpLv_Jsonclick ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock60_Jsonclick ;
   private String edtEstMet_Internalname ;
   private String A11819EstMet ;
   private String edtEstMet_Jsonclick ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock61_Jsonclick ;
   private String edtEstDimGrm3_Internalname ;
   private String edtEstDimGrm3_Jsonclick ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock62_Jsonclick ;
   private String edtEstMetod3_Internalname ;
   private String A11919EstMetod3 ;
   private String edtEstMetod3_Jsonclick ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock63_Jsonclick ;
   private String edtEstMetod2_Internalname ;
   private String A11920EstMetod2 ;
   private String edtEstMetod2_Jsonclick ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock64_Jsonclick ;
   private String edtEstMetod1_Internalname ;
   private String A11921EstMetod1 ;
   private String edtEstMetod1_Jsonclick ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock65_Jsonclick ;
   private String edtEstDimGrm1_Internalname ;
   private String edtEstDimGrm1_Jsonclick ;
   private String sMode187 ;
   private String edtavnRcdDeleted_187_Internalname ;
   private String edtEstDimLin_Internalname ;
   private String edtEstDimObs_Internalname ;
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
   private String sMode186 ;
   private String GXCCtl ;
   private String A1341EstDimObs ;
   private String Z407EmprNom ;
   private String Z653OpeNom ;
   private String sGXsfl_345_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_187_Jsonclick ;
   private String edtEstDimLin_Jsonclick ;
   private String edtEstDimObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ130BarCodPar ;
   private String ZZ1340EstDimMat ;
   private String ZZ1342EstDimSer ;
   private String ZZ1334EstDimDisN ;
   private String ZZ1330EstColNom ;
   private String ZZ3157EstDimNor ;
   private String ZZ3158EstDimMaq ;
   private String ZZ3159EstDimTAc ;
   private String ZZ3163EstDimTN ;
   private String ZZ1329EstCliNom ;
   private String ZZ3164EstDimRef ;
   private String ZZ3743EstNorEsp ;
   private String ZZ10977EstInclin ;
   private String ZZ11806EstRqMnL ;
   private String ZZ11807EstRqMnC ;
   private String ZZ11810EstRqMnG ;
   private String ZZ11812EstRqMnE ;
   private String ZZ11819EstMet ;
   private String ZZ11919EstMetod3 ;
   private String ZZ11920EstMetod2 ;
   private String ZZ11921EstMetod1 ;
   private String ZZ653OpeNom ;
   private java.util.Date Z1337EstDimFec ;
   private java.util.Date A1337EstDimFec ;
   private java.util.Date ZZ1337EstDimFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n652OpeCod ;
   private boolean wbErr ;
   private boolean bGXsfl_345_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1340EstDimMat ;
   private boolean n1342EstDimSer ;
   private boolean n1343EstDimTip ;
   private boolean n1334EstDimDisN ;
   private boolean n3155EstDimAni ;
   private boolean n3156EstDimGmi ;
   private boolean n1330EstColNom ;
   private boolean n1331EstColNum ;
   private boolean n1337EstDimFec ;
   private boolean n1332EstDimAnc ;
   private boolean n3157EstDimNor ;
   private boolean n3158EstDimMaq ;
   private boolean n3159EstDimTAc ;
   private boolean n3160EstDimMan ;
   private boolean n3161EstDimPal ;
   private boolean n3162EstDimEsp ;
   private boolean n3163EstDimTN ;
   private boolean n653OpeNom ;
   private boolean n1328EstCliCod ;
   private boolean n1329EstCliNom ;
   private boolean n1335EstDimEncA ;
   private boolean n1336EstDimEncL ;
   private boolean n1338EstDimGrm2 ;
   private boolean n1344EstDimUlin ;
   private boolean n3164EstDimRef ;
   private boolean n3737EstSanfAnc ;
   private boolean n3738EstSanfGrm ;
   private boolean n3739EstCalAnc ;
   private boolean n3740EstCalGrm ;
   private boolean n3741EstRamAnc ;
   private boolean n3742EstRamGrm ;
   private boolean n3743EstNorEsp ;
   private boolean n3872EstSanfEA ;
   private boolean n3873EstSanfEL ;
   private boolean n3874EstCalEA ;
   private boolean n3875EstCalEL ;
   private boolean n3876EstRamEA ;
   private boolean n3877EstRamEL ;
   private boolean n10977EstInclin ;
   private boolean n11806EstRqMnL ;
   private boolean n11807EstRqMnC ;
   private boolean n11808EstEncASt ;
   private boolean n11809EstEncLSt ;
   private boolean n11810EstRqMnG ;
   private boolean n11811EstAvGr ;
   private boolean n11812EstRqMnE ;
   private boolean n11813EstEspBef ;
   private boolean n11814EstEspBSt ;
   private boolean n11815EstEspAft ;
   private boolean n11816EstEspASt ;
   private boolean n11818EstTpLv ;
   private boolean n11819EstMet ;
   private boolean n11820EstDimGrm3 ;
   private boolean n11919EstMetod3 ;
   private boolean n11920EstMetod2 ;
   private boolean n11921EstMetod1 ;
   private boolean n11927EstDimGrm1 ;
   private boolean Gx_longc ;
   private boolean n1341EstDimObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01I86_A407EmprNom ;
   private boolean[] T01I86_n407EmprNom ;
   private int[] T01I89_A1333EstDimCod ;
   private String[] T01I89_A407EmprNom ;
   private boolean[] T01I89_n407EmprNom ;
   private String[] T01I89_A1340EstDimMat ;
   private boolean[] T01I89_n1340EstDimMat ;
   private String[] T01I89_A1342EstDimSer ;
   private boolean[] T01I89_n1342EstDimSer ;
   private short[] T01I89_A1343EstDimTip ;
   private boolean[] T01I89_n1343EstDimTip ;
   private String[] T01I89_A1334EstDimDisN ;
   private boolean[] T01I89_n1334EstDimDisN ;
   private short[] T01I89_A3155EstDimAni ;
   private boolean[] T01I89_n3155EstDimAni ;
   private short[] T01I89_A3156EstDimGmi ;
   private boolean[] T01I89_n3156EstDimGmi ;
   private String[] T01I89_A1330EstColNom ;
   private boolean[] T01I89_n1330EstColNom ;
   private int[] T01I89_A1331EstColNum ;
   private boolean[] T01I89_n1331EstColNum ;
   private java.util.Date[] T01I89_A1337EstDimFec ;
   private boolean[] T01I89_n1337EstDimFec ;
   private short[] T01I89_A1332EstDimAnc ;
   private boolean[] T01I89_n1332EstDimAnc ;
   private String[] T01I89_A3157EstDimNor ;
   private boolean[] T01I89_n3157EstDimNor ;
   private String[] T01I89_A3158EstDimMaq ;
   private boolean[] T01I89_n3158EstDimMaq ;
   private String[] T01I89_A3159EstDimTAc ;
   private boolean[] T01I89_n3159EstDimTAc ;
   private byte[] T01I89_A3160EstDimMan ;
   private boolean[] T01I89_n3160EstDimMan ;
   private byte[] T01I89_A3161EstDimPal ;
   private boolean[] T01I89_n3161EstDimPal ;
   private java.math.BigDecimal[] T01I89_A3162EstDimEsp ;
   private boolean[] T01I89_n3162EstDimEsp ;
   private String[] T01I89_A3163EstDimTN ;
   private boolean[] T01I89_n3163EstDimTN ;
   private String[] T01I89_A653OpeNom ;
   private boolean[] T01I89_n653OpeNom ;
   private int[] T01I89_A1328EstCliCod ;
   private boolean[] T01I89_n1328EstCliCod ;
   private String[] T01I89_A1329EstCliNom ;
   private boolean[] T01I89_n1329EstCliNom ;
   private java.math.BigDecimal[] T01I89_A1335EstDimEncA ;
   private boolean[] T01I89_n1335EstDimEncA ;
   private java.math.BigDecimal[] T01I89_A1336EstDimEncL ;
   private boolean[] T01I89_n1336EstDimEncL ;
   private short[] T01I89_A1338EstDimGrm2 ;
   private boolean[] T01I89_n1338EstDimGrm2 ;
   private byte[] T01I89_A1344EstDimUlin ;
   private boolean[] T01I89_n1344EstDimUlin ;
   private String[] T01I89_A3164EstDimRef ;
   private boolean[] T01I89_n3164EstDimRef ;
   private short[] T01I89_A3737EstSanfAnc ;
   private boolean[] T01I89_n3737EstSanfAnc ;
   private short[] T01I89_A3738EstSanfGrm ;
   private boolean[] T01I89_n3738EstSanfGrm ;
   private short[] T01I89_A3739EstCalAnc ;
   private boolean[] T01I89_n3739EstCalAnc ;
   private short[] T01I89_A3740EstCalGrm ;
   private boolean[] T01I89_n3740EstCalGrm ;
   private short[] T01I89_A3741EstRamAnc ;
   private boolean[] T01I89_n3741EstRamAnc ;
   private short[] T01I89_A3742EstRamGrm ;
   private boolean[] T01I89_n3742EstRamGrm ;
   private String[] T01I89_A3743EstNorEsp ;
   private boolean[] T01I89_n3743EstNorEsp ;
   private java.math.BigDecimal[] T01I89_A3872EstSanfEA ;
   private boolean[] T01I89_n3872EstSanfEA ;
   private java.math.BigDecimal[] T01I89_A3873EstSanfEL ;
   private boolean[] T01I89_n3873EstSanfEL ;
   private java.math.BigDecimal[] T01I89_A3874EstCalEA ;
   private boolean[] T01I89_n3874EstCalEA ;
   private java.math.BigDecimal[] T01I89_A3875EstCalEL ;
   private boolean[] T01I89_n3875EstCalEL ;
   private java.math.BigDecimal[] T01I89_A3876EstRamEA ;
   private boolean[] T01I89_n3876EstRamEA ;
   private java.math.BigDecimal[] T01I89_A3877EstRamEL ;
   private boolean[] T01I89_n3877EstRamEL ;
   private String[] T01I89_A10977EstInclin ;
   private boolean[] T01I89_n10977EstInclin ;
   private String[] T01I89_A11806EstRqMnL ;
   private boolean[] T01I89_n11806EstRqMnL ;
   private String[] T01I89_A11807EstRqMnC ;
   private boolean[] T01I89_n11807EstRqMnC ;
   private byte[] T01I89_A11808EstEncASt ;
   private boolean[] T01I89_n11808EstEncASt ;
   private byte[] T01I89_A11809EstEncLSt ;
   private boolean[] T01I89_n11809EstEncLSt ;
   private String[] T01I89_A11810EstRqMnG ;
   private boolean[] T01I89_n11810EstRqMnG ;
   private byte[] T01I89_A11811EstAvGr ;
   private boolean[] T01I89_n11811EstAvGr ;
   private String[] T01I89_A11812EstRqMnE ;
   private boolean[] T01I89_n11812EstRqMnE ;
   private java.math.BigDecimal[] T01I89_A11813EstEspBef ;
   private boolean[] T01I89_n11813EstEspBef ;
   private byte[] T01I89_A11814EstEspBSt ;
   private boolean[] T01I89_n11814EstEspBSt ;
   private java.math.BigDecimal[] T01I89_A11815EstEspAft ;
   private boolean[] T01I89_n11815EstEspAft ;
   private byte[] T01I89_A11816EstEspASt ;
   private boolean[] T01I89_n11816EstEspASt ;
   private short[] T01I89_A11818EstTpLv ;
   private boolean[] T01I89_n11818EstTpLv ;
   private String[] T01I89_A11819EstMet ;
   private boolean[] T01I89_n11819EstMet ;
   private short[] T01I89_A11820EstDimGrm3 ;
   private boolean[] T01I89_n11820EstDimGrm3 ;
   private String[] T01I89_A11919EstMetod3 ;
   private boolean[] T01I89_n11919EstMetod3 ;
   private String[] T01I89_A11920EstMetod2 ;
   private boolean[] T01I89_n11920EstMetod2 ;
   private String[] T01I89_A11921EstMetod1 ;
   private boolean[] T01I89_n11921EstMetod1 ;
   private short[] T01I89_A11927EstDimGrm1 ;
   private boolean[] T01I89_n11927EstDimGrm1 ;
   private String[] T01I89_A396EmprCod ;
   private int[] T01I89_A129BarCod ;
   private boolean[] T01I89_n129BarCod ;
   private byte[] T01I89_A132BarCodReo ;
   private boolean[] T01I89_n132BarCodReo ;
   private String[] T01I89_A130BarCodPar ;
   private boolean[] T01I89_n130BarCodPar ;
   private int[] T01I89_A652OpeCod ;
   private boolean[] T01I89_n652OpeCod ;
   private String[] T01I87_A396EmprCod ;
   private String[] T01I88_A653OpeNom ;
   private boolean[] T01I88_n653OpeNom ;
   private String[] T01I810_A396EmprCod ;
   private String[] T01I811_A653OpeNom ;
   private boolean[] T01I811_n653OpeNom ;
   private String[] T01I812_A396EmprCod ;
   private int[] T01I812_A1333EstDimCod ;
   private int[] T01I85_A1333EstDimCod ;
   private String[] T01I85_A1340EstDimMat ;
   private boolean[] T01I85_n1340EstDimMat ;
   private String[] T01I85_A1342EstDimSer ;
   private boolean[] T01I85_n1342EstDimSer ;
   private short[] T01I85_A1343EstDimTip ;
   private boolean[] T01I85_n1343EstDimTip ;
   private String[] T01I85_A1334EstDimDisN ;
   private boolean[] T01I85_n1334EstDimDisN ;
   private short[] T01I85_A3155EstDimAni ;
   private boolean[] T01I85_n3155EstDimAni ;
   private short[] T01I85_A3156EstDimGmi ;
   private boolean[] T01I85_n3156EstDimGmi ;
   private String[] T01I85_A1330EstColNom ;
   private boolean[] T01I85_n1330EstColNom ;
   private int[] T01I85_A1331EstColNum ;
   private boolean[] T01I85_n1331EstColNum ;
   private java.util.Date[] T01I85_A1337EstDimFec ;
   private boolean[] T01I85_n1337EstDimFec ;
   private short[] T01I85_A1332EstDimAnc ;
   private boolean[] T01I85_n1332EstDimAnc ;
   private String[] T01I85_A3157EstDimNor ;
   private boolean[] T01I85_n3157EstDimNor ;
   private String[] T01I85_A3158EstDimMaq ;
   private boolean[] T01I85_n3158EstDimMaq ;
   private String[] T01I85_A3159EstDimTAc ;
   private boolean[] T01I85_n3159EstDimTAc ;
   private byte[] T01I85_A3160EstDimMan ;
   private boolean[] T01I85_n3160EstDimMan ;
   private byte[] T01I85_A3161EstDimPal ;
   private boolean[] T01I85_n3161EstDimPal ;
   private java.math.BigDecimal[] T01I85_A3162EstDimEsp ;
   private boolean[] T01I85_n3162EstDimEsp ;
   private String[] T01I85_A3163EstDimTN ;
   private boolean[] T01I85_n3163EstDimTN ;
   private int[] T01I85_A1328EstCliCod ;
   private boolean[] T01I85_n1328EstCliCod ;
   private String[] T01I85_A1329EstCliNom ;
   private boolean[] T01I85_n1329EstCliNom ;
   private java.math.BigDecimal[] T01I85_A1335EstDimEncA ;
   private boolean[] T01I85_n1335EstDimEncA ;
   private java.math.BigDecimal[] T01I85_A1336EstDimEncL ;
   private boolean[] T01I85_n1336EstDimEncL ;
   private short[] T01I85_A1338EstDimGrm2 ;
   private boolean[] T01I85_n1338EstDimGrm2 ;
   private byte[] T01I85_A1344EstDimUlin ;
   private boolean[] T01I85_n1344EstDimUlin ;
   private String[] T01I85_A3164EstDimRef ;
   private boolean[] T01I85_n3164EstDimRef ;
   private short[] T01I85_A3737EstSanfAnc ;
   private boolean[] T01I85_n3737EstSanfAnc ;
   private short[] T01I85_A3738EstSanfGrm ;
   private boolean[] T01I85_n3738EstSanfGrm ;
   private short[] T01I85_A3739EstCalAnc ;
   private boolean[] T01I85_n3739EstCalAnc ;
   private short[] T01I85_A3740EstCalGrm ;
   private boolean[] T01I85_n3740EstCalGrm ;
   private short[] T01I85_A3741EstRamAnc ;
   private boolean[] T01I85_n3741EstRamAnc ;
   private short[] T01I85_A3742EstRamGrm ;
   private boolean[] T01I85_n3742EstRamGrm ;
   private String[] T01I85_A3743EstNorEsp ;
   private boolean[] T01I85_n3743EstNorEsp ;
   private java.math.BigDecimal[] T01I85_A3872EstSanfEA ;
   private boolean[] T01I85_n3872EstSanfEA ;
   private java.math.BigDecimal[] T01I85_A3873EstSanfEL ;
   private boolean[] T01I85_n3873EstSanfEL ;
   private java.math.BigDecimal[] T01I85_A3874EstCalEA ;
   private boolean[] T01I85_n3874EstCalEA ;
   private java.math.BigDecimal[] T01I85_A3875EstCalEL ;
   private boolean[] T01I85_n3875EstCalEL ;
   private java.math.BigDecimal[] T01I85_A3876EstRamEA ;
   private boolean[] T01I85_n3876EstRamEA ;
   private java.math.BigDecimal[] T01I85_A3877EstRamEL ;
   private boolean[] T01I85_n3877EstRamEL ;
   private String[] T01I85_A10977EstInclin ;
   private boolean[] T01I85_n10977EstInclin ;
   private String[] T01I85_A11806EstRqMnL ;
   private boolean[] T01I85_n11806EstRqMnL ;
   private String[] T01I85_A11807EstRqMnC ;
   private boolean[] T01I85_n11807EstRqMnC ;
   private byte[] T01I85_A11808EstEncASt ;
   private boolean[] T01I85_n11808EstEncASt ;
   private byte[] T01I85_A11809EstEncLSt ;
   private boolean[] T01I85_n11809EstEncLSt ;
   private String[] T01I85_A11810EstRqMnG ;
   private boolean[] T01I85_n11810EstRqMnG ;
   private byte[] T01I85_A11811EstAvGr ;
   private boolean[] T01I85_n11811EstAvGr ;
   private String[] T01I85_A11812EstRqMnE ;
   private boolean[] T01I85_n11812EstRqMnE ;
   private java.math.BigDecimal[] T01I85_A11813EstEspBef ;
   private boolean[] T01I85_n11813EstEspBef ;
   private byte[] T01I85_A11814EstEspBSt ;
   private boolean[] T01I85_n11814EstEspBSt ;
   private java.math.BigDecimal[] T01I85_A11815EstEspAft ;
   private boolean[] T01I85_n11815EstEspAft ;
   private byte[] T01I85_A11816EstEspASt ;
   private boolean[] T01I85_n11816EstEspASt ;
   private short[] T01I85_A11818EstTpLv ;
   private boolean[] T01I85_n11818EstTpLv ;
   private String[] T01I85_A11819EstMet ;
   private boolean[] T01I85_n11819EstMet ;
   private short[] T01I85_A11820EstDimGrm3 ;
   private boolean[] T01I85_n11820EstDimGrm3 ;
   private String[] T01I85_A11919EstMetod3 ;
   private boolean[] T01I85_n11919EstMetod3 ;
   private String[] T01I85_A11920EstMetod2 ;
   private boolean[] T01I85_n11920EstMetod2 ;
   private String[] T01I85_A11921EstMetod1 ;
   private boolean[] T01I85_n11921EstMetod1 ;
   private short[] T01I85_A11927EstDimGrm1 ;
   private boolean[] T01I85_n11927EstDimGrm1 ;
   private String[] T01I85_A396EmprCod ;
   private int[] T01I85_A129BarCod ;
   private boolean[] T01I85_n129BarCod ;
   private byte[] T01I85_A132BarCodReo ;
   private boolean[] T01I85_n132BarCodReo ;
   private String[] T01I85_A130BarCodPar ;
   private boolean[] T01I85_n130BarCodPar ;
   private int[] T01I85_A652OpeCod ;
   private boolean[] T01I85_n652OpeCod ;
   private String[] T01I813_A396EmprCod ;
   private int[] T01I813_A1333EstDimCod ;
   private String[] T01I814_A396EmprCod ;
   private int[] T01I814_A1333EstDimCod ;
   private int[] T01I84_A1333EstDimCod ;
   private String[] T01I84_A1340EstDimMat ;
   private boolean[] T01I84_n1340EstDimMat ;
   private String[] T01I84_A1342EstDimSer ;
   private boolean[] T01I84_n1342EstDimSer ;
   private short[] T01I84_A1343EstDimTip ;
   private boolean[] T01I84_n1343EstDimTip ;
   private String[] T01I84_A1334EstDimDisN ;
   private boolean[] T01I84_n1334EstDimDisN ;
   private short[] T01I84_A3155EstDimAni ;
   private boolean[] T01I84_n3155EstDimAni ;
   private short[] T01I84_A3156EstDimGmi ;
   private boolean[] T01I84_n3156EstDimGmi ;
   private String[] T01I84_A1330EstColNom ;
   private boolean[] T01I84_n1330EstColNom ;
   private int[] T01I84_A1331EstColNum ;
   private boolean[] T01I84_n1331EstColNum ;
   private java.util.Date[] T01I84_A1337EstDimFec ;
   private boolean[] T01I84_n1337EstDimFec ;
   private short[] T01I84_A1332EstDimAnc ;
   private boolean[] T01I84_n1332EstDimAnc ;
   private String[] T01I84_A3157EstDimNor ;
   private boolean[] T01I84_n3157EstDimNor ;
   private String[] T01I84_A3158EstDimMaq ;
   private boolean[] T01I84_n3158EstDimMaq ;
   private String[] T01I84_A3159EstDimTAc ;
   private boolean[] T01I84_n3159EstDimTAc ;
   private byte[] T01I84_A3160EstDimMan ;
   private boolean[] T01I84_n3160EstDimMan ;
   private byte[] T01I84_A3161EstDimPal ;
   private boolean[] T01I84_n3161EstDimPal ;
   private java.math.BigDecimal[] T01I84_A3162EstDimEsp ;
   private boolean[] T01I84_n3162EstDimEsp ;
   private String[] T01I84_A3163EstDimTN ;
   private boolean[] T01I84_n3163EstDimTN ;
   private int[] T01I84_A1328EstCliCod ;
   private boolean[] T01I84_n1328EstCliCod ;
   private String[] T01I84_A1329EstCliNom ;
   private boolean[] T01I84_n1329EstCliNom ;
   private java.math.BigDecimal[] T01I84_A1335EstDimEncA ;
   private boolean[] T01I84_n1335EstDimEncA ;
   private java.math.BigDecimal[] T01I84_A1336EstDimEncL ;
   private boolean[] T01I84_n1336EstDimEncL ;
   private short[] T01I84_A1338EstDimGrm2 ;
   private boolean[] T01I84_n1338EstDimGrm2 ;
   private byte[] T01I84_A1344EstDimUlin ;
   private boolean[] T01I84_n1344EstDimUlin ;
   private String[] T01I84_A3164EstDimRef ;
   private boolean[] T01I84_n3164EstDimRef ;
   private short[] T01I84_A3737EstSanfAnc ;
   private boolean[] T01I84_n3737EstSanfAnc ;
   private short[] T01I84_A3738EstSanfGrm ;
   private boolean[] T01I84_n3738EstSanfGrm ;
   private short[] T01I84_A3739EstCalAnc ;
   private boolean[] T01I84_n3739EstCalAnc ;
   private short[] T01I84_A3740EstCalGrm ;
   private boolean[] T01I84_n3740EstCalGrm ;
   private short[] T01I84_A3741EstRamAnc ;
   private boolean[] T01I84_n3741EstRamAnc ;
   private short[] T01I84_A3742EstRamGrm ;
   private boolean[] T01I84_n3742EstRamGrm ;
   private String[] T01I84_A3743EstNorEsp ;
   private boolean[] T01I84_n3743EstNorEsp ;
   private java.math.BigDecimal[] T01I84_A3872EstSanfEA ;
   private boolean[] T01I84_n3872EstSanfEA ;
   private java.math.BigDecimal[] T01I84_A3873EstSanfEL ;
   private boolean[] T01I84_n3873EstSanfEL ;
   private java.math.BigDecimal[] T01I84_A3874EstCalEA ;
   private boolean[] T01I84_n3874EstCalEA ;
   private java.math.BigDecimal[] T01I84_A3875EstCalEL ;
   private boolean[] T01I84_n3875EstCalEL ;
   private java.math.BigDecimal[] T01I84_A3876EstRamEA ;
   private boolean[] T01I84_n3876EstRamEA ;
   private java.math.BigDecimal[] T01I84_A3877EstRamEL ;
   private boolean[] T01I84_n3877EstRamEL ;
   private String[] T01I84_A10977EstInclin ;
   private boolean[] T01I84_n10977EstInclin ;
   private String[] T01I84_A11806EstRqMnL ;
   private boolean[] T01I84_n11806EstRqMnL ;
   private String[] T01I84_A11807EstRqMnC ;
   private boolean[] T01I84_n11807EstRqMnC ;
   private byte[] T01I84_A11808EstEncASt ;
   private boolean[] T01I84_n11808EstEncASt ;
   private byte[] T01I84_A11809EstEncLSt ;
   private boolean[] T01I84_n11809EstEncLSt ;
   private String[] T01I84_A11810EstRqMnG ;
   private boolean[] T01I84_n11810EstRqMnG ;
   private byte[] T01I84_A11811EstAvGr ;
   private boolean[] T01I84_n11811EstAvGr ;
   private String[] T01I84_A11812EstRqMnE ;
   private boolean[] T01I84_n11812EstRqMnE ;
   private java.math.BigDecimal[] T01I84_A11813EstEspBef ;
   private boolean[] T01I84_n11813EstEspBef ;
   private byte[] T01I84_A11814EstEspBSt ;
   private boolean[] T01I84_n11814EstEspBSt ;
   private java.math.BigDecimal[] T01I84_A11815EstEspAft ;
   private boolean[] T01I84_n11815EstEspAft ;
   private byte[] T01I84_A11816EstEspASt ;
   private boolean[] T01I84_n11816EstEspASt ;
   private short[] T01I84_A11818EstTpLv ;
   private boolean[] T01I84_n11818EstTpLv ;
   private String[] T01I84_A11819EstMet ;
   private boolean[] T01I84_n11819EstMet ;
   private short[] T01I84_A11820EstDimGrm3 ;
   private boolean[] T01I84_n11820EstDimGrm3 ;
   private String[] T01I84_A11919EstMetod3 ;
   private boolean[] T01I84_n11919EstMetod3 ;
   private String[] T01I84_A11920EstMetod2 ;
   private boolean[] T01I84_n11920EstMetod2 ;
   private String[] T01I84_A11921EstMetod1 ;
   private boolean[] T01I84_n11921EstMetod1 ;
   private short[] T01I84_A11927EstDimGrm1 ;
   private boolean[] T01I84_n11927EstDimGrm1 ;
   private String[] T01I84_A396EmprCod ;
   private int[] T01I84_A129BarCod ;
   private boolean[] T01I84_n129BarCod ;
   private byte[] T01I84_A132BarCodReo ;
   private boolean[] T01I84_n132BarCodReo ;
   private String[] T01I84_A130BarCodPar ;
   private boolean[] T01I84_n130BarCodPar ;
   private int[] T01I84_A652OpeCod ;
   private boolean[] T01I84_n652OpeCod ;
   private String[] T01I818_A653OpeNom ;
   private boolean[] T01I818_n653OpeNom ;
   private String[] T01I819_A396EmprCod ;
   private int[] T01I819_A1333EstDimCod ;
   private int[] T01I820_A1333EstDimCod ;
   private byte[] T01I820_A1339EstDimLin ;
   private String[] T01I820_A1341EstDimObs ;
   private boolean[] T01I820_n1341EstDimObs ;
   private String[] T01I820_A396EmprCod ;
   private String[] T01I821_A396EmprCod ;
   private int[] T01I821_A1333EstDimCod ;
   private byte[] T01I821_A1339EstDimLin ;
   private int[] T01I83_A1333EstDimCod ;
   private byte[] T01I83_A1339EstDimLin ;
   private String[] T01I83_A1341EstDimObs ;
   private boolean[] T01I83_n1341EstDimObs ;
   private String[] T01I83_A396EmprCod ;
   private int[] T01I82_A1333EstDimCod ;
   private byte[] T01I82_A1339EstDimLin ;
   private String[] T01I82_A1341EstDimObs ;
   private boolean[] T01I82_n1341EstDimObs ;
   private String[] T01I82_A396EmprCod ;
   private String[] T01I825_A396EmprCod ;
   private int[] T01I825_A1333EstDimCod ;
   private byte[] T01I825_A1339EstDimLin ;
   private String[] T01I826_A407EmprNom ;
   private boolean[] T01I826_n407EmprNom ;
   private String[] T01I827_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tpdimest__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdimest__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdimest__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdimest__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tpdimest__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01I82", "SELECT EstDimCod, EstDimLin, EstDimObs, EmprCod FROM TXPLESDIM WHERE EmprCod = ? AND EstDimCod = ? AND EstDimLin = ?  FOR UPDATE OF EstDimObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I83", "SELECT EstDimCod, EstDimLin, EstDimObs, EmprCod FROM TXPLESDIM WHERE EmprCod = ? AND EstDimCod = ? AND EstDimLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I84", "SELECT EstDimCod, EstDimMat, EstDimSer, EstDimTip, EstDimDisN, EstDimAni, EstDimGmi, EstColNom, EstColNum, EstDimFec, EstDimAnc, EstDimNor, EstDimMaq, EstDimTAc, EstDimMan, EstDimPal, EstDimEsp, EstDimTN, EstCliCod, EstCliNom, EstDimEncA, EstDimEncL, EstDimGrm2, EstDimUlin, EstDimRef, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstNorEsp, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EstInclin, EstRqMnL, EstRqMnC, EstEncASt, EstEncLSt, EstRqMnG, EstAvGr, EstRqMnE, EstEspBef, EstEspBSt, EstEspAft, EstEspASt, EstTpLv, EstMet, EstDimGrm3, EstMetod3, EstMetod2, EstMetod1, EstDimGrm1, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCESDIM WHERE EmprCod = ? AND EstDimCod = ?  FOR UPDATE OF EstDimMat, EstDimSer, EstDimTip, EstDimDisN, EstDimAni, EstDimGmi, EstColNom, EstColNum, EstDimFec, EstDimAnc, EstDimNor, EstDimMaq, EstDimTAc, EstDimMan, EstDimPal, EstDimEsp, EstDimTN, EstCliCod, EstCliNom, EstDimEncA, EstDimEncL, EstDimGrm2, EstDimUlin, EstDimRef, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstNorEsp, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EstInclin, EstRqMnL, EstRqMnC, EstEncASt, EstEncLSt, EstRqMnG, EstAvGr, EstRqMnE, EstEspBef, EstEspBSt, EstEspAft, EstEspASt, EstTpLv, EstMet, EstDimGrm3, EstMetod3, EstMetod2, EstMetod1, EstDimGrm1, BarCod, BarCodReo, BarCodPar, OpeCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I85", "SELECT EstDimCod, EstDimMat, EstDimSer, EstDimTip, EstDimDisN, EstDimAni, EstDimGmi, EstColNom, EstColNum, EstDimFec, EstDimAnc, EstDimNor, EstDimMaq, EstDimTAc, EstDimMan, EstDimPal, EstDimEsp, EstDimTN, EstCliCod, EstCliNom, EstDimEncA, EstDimEncL, EstDimGrm2, EstDimUlin, EstDimRef, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstNorEsp, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EstInclin, EstRqMnL, EstRqMnC, EstEncASt, EstEncLSt, EstRqMnG, EstAvGr, EstRqMnE, EstEspBef, EstEspBSt, EstEspAft, EstEspASt, EstTpLv, EstMet, EstDimGrm3, EstMetod3, EstMetod2, EstMetod1, EstDimGrm1, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod FROM TXPCESDIM WHERE EmprCod = ? AND EstDimCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I86", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I87", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I88", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I89", "SELECT /*+ FIRST_ROWS(100) */ TM1.EstDimCod, T2.EmprNom, TM1.EstDimMat, TM1.EstDimSer, TM1.EstDimTip, TM1.EstDimDisN, TM1.EstDimAni, TM1.EstDimGmi, TM1.EstColNom, TM1.EstColNum, TM1.EstDimFec, TM1.EstDimAnc, TM1.EstDimNor, TM1.EstDimMaq, TM1.EstDimTAc, TM1.EstDimMan, TM1.EstDimPal, TM1.EstDimEsp, TM1.EstDimTN, T3.OpeNom, TM1.EstCliCod, TM1.EstCliNom, TM1.EstDimEncA, TM1.EstDimEncL, TM1.EstDimGrm2, TM1.EstDimUlin, TM1.EstDimRef, TM1.EstSanfAnc, TM1.EstSanfGrm, TM1.EstCalAnc, TM1.EstCalGrm, TM1.EstRamAnc, TM1.EstRamGrm, TM1.EstNorEsp, TM1.EstSanfEA, TM1.EstSanfEL, TM1.EstCalEA, TM1.EstCalEL, TM1.EstRamEA, TM1.EstRamEL, TM1.EstInclin, TM1.EstRqMnL, TM1.EstRqMnC, TM1.EstEncASt, TM1.EstEncLSt, TM1.EstRqMnG, TM1.EstAvGr, TM1.EstRqMnE, TM1.EstEspBef, TM1.EstEspBSt, TM1.EstEspAft, TM1.EstEspASt, TM1.EstTpLv, TM1.EstMet, TM1.EstDimGrm3, TM1.EstMetod3, TM1.EstMetod2, TM1.EstMetod1, TM1.EstDimGrm1, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.OpeCod FROM ((TXPCESDIM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPOPERAR T3 ON T3.EmprCod = TM1.EmprCod AND T3.OpeCod = TM1.OpeCod) WHERE TM1.EmprCod = ? and TM1.EstDimCod = ? ORDER BY TM1.EmprCod, TM1.EstDimCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I810", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I811", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I812", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? AND EstDimCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I813", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE ( EstDimCod > ?) and EmprCod = ? ORDER BY EmprCod, EstDimCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01I814", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE ( EstDimCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, EstDimCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01I815", "INSERT INTO TXPCESDIM(EstDimCod, EstDimMat, EstDimSer, EstDimTip, EstDimDisN, EstDimAni, EstDimGmi, EstColNom, EstColNum, EstDimFec, EstDimAnc, EstDimNor, EstDimMaq, EstDimTAc, EstDimMan, EstDimPal, EstDimEsp, EstDimTN, EstCliCod, EstCliNom, EstDimEncA, EstDimEncL, EstDimGrm2, EstDimUlin, EstDimRef, EstSanfAnc, EstSanfGrm, EstCalAnc, EstCalGrm, EstRamAnc, EstRamGrm, EstNorEsp, EstSanfEA, EstSanfEL, EstCalEA, EstCalEL, EstRamEA, EstRamEL, EstInclin, EstRqMnL, EstRqMnC, EstEncASt, EstEncLSt, EstRqMnG, EstAvGr, EstRqMnE, EstEspBef, EstEspBSt, EstEspAft, EstEspASt, EstTpLv, EstMet, EstDimGrm3, EstMetod3, EstMetod2, EstMetod1, EstDimGrm1, EmprCod, BarCod, BarCodReo, BarCodPar, OpeCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCESDIM")
         ,new UpdateCursor("T01I816", "UPDATE TXPCESDIM SET EstDimMat=?, EstDimSer=?, EstDimTip=?, EstDimDisN=?, EstDimAni=?, EstDimGmi=?, EstColNom=?, EstColNum=?, EstDimFec=?, EstDimAnc=?, EstDimNor=?, EstDimMaq=?, EstDimTAc=?, EstDimMan=?, EstDimPal=?, EstDimEsp=?, EstDimTN=?, EstCliCod=?, EstCliNom=?, EstDimEncA=?, EstDimEncL=?, EstDimGrm2=?, EstDimUlin=?, EstDimRef=?, EstSanfAnc=?, EstSanfGrm=?, EstCalAnc=?, EstCalGrm=?, EstRamAnc=?, EstRamGrm=?, EstNorEsp=?, EstSanfEA=?, EstSanfEL=?, EstCalEA=?, EstCalEL=?, EstRamEA=?, EstRamEL=?, EstInclin=?, EstRqMnL=?, EstRqMnC=?, EstEncASt=?, EstEncLSt=?, EstRqMnG=?, EstAvGr=?, EstRqMnE=?, EstEspBef=?, EstEspBSt=?, EstEspAft=?, EstEspASt=?, EstTpLv=?, EstMet=?, EstDimGrm3=?, EstMetod3=?, EstMetod2=?, EstMetod1=?, EstDimGrm1=?, BarCod=?, BarCodReo=?, BarCodPar=?, OpeCod=?  WHERE EmprCod = ? AND EstDimCod = ?", GX_NOMASK, "TXPCESDIM")
         ,new UpdateCursor("T01I817", "DELETE FROM TXPCESDIM  WHERE EmprCod = ? AND EstDimCod = ?", GX_NOMASK, "TXPCESDIM")
         ,new ForEachCursor("T01I818", "SELECT OpeNom FROM TXPOPERAR WHERE EmprCod = ? AND OpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I819", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, EstDimCod FROM TXPCESDIM WHERE EmprCod = ? ORDER BY EmprCod, EstDimCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I820", "SELECT EstDimCod, EstDimLin, EstDimObs, EmprCod FROM TXPLESDIM WHERE EmprCod = ? and EstDimCod = ? and EstDimLin = ? ORDER BY EmprCod, EstDimCod, EstDimLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I821", "SELECT EmprCod, EstDimCod, EstDimLin FROM TXPLESDIM WHERE EmprCod = ? AND EstDimCod = ? AND EstDimLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01I822", "INSERT INTO TXPLESDIM(EstDimCod, EstDimLin, EstDimObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLESDIM")
         ,new UpdateCursor("T01I823", "UPDATE TXPLESDIM SET EstDimObs=?  WHERE EmprCod = ? AND EstDimCod = ? AND EstDimLin = ?", GX_NOMASK, "TXPLESDIM")
         ,new UpdateCursor("T01I824", "DELETE FROM TXPLESDIM  WHERE EmprCod = ? AND EstDimCod = ? AND EstDimLin = ?", GX_NOMASK, "TXPLESDIM")
         ,new ForEachCursor("T01I825", "SELECT EmprCod, EstDimCod, EstDimLin FROM TXPLESDIM WHERE EmprCod = ? and EstDimCod = ? ORDER BY EmprCod, EstDimCod, EstDimLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I826", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01I827", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 15);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 10);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((byte[]) buf[81])[0] = rslt.getByte(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((byte[]) buf[83])[0] = rslt.getByte(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 10);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[91])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((byte[]) buf[93])[0] = rslt.getByte(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((byte[]) buf[97])[0] = rslt.getByte(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((short[]) buf[99])[0] = rslt.getShort(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 10);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 20);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(55, 20);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 20);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((short[]) buf[111])[0] = rslt.getShort(57);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(58, 3);
               ((int[]) buf[114])[0] = rslt.getInt(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((int[]) buf[120])[0] = rslt.getInt(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(19);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((short[]) buf[43])[0] = rslt.getShort(23);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((byte[]) buf[45])[0] = rslt.getByte(24);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(25, 15);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((short[]) buf[49])[0] = rslt.getShort(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((short[]) buf[51])[0] = rslt.getShort(27);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(32, 20);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(39, 10);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(40, 10);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 10);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((byte[]) buf[81])[0] = rslt.getByte(42);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((byte[]) buf[83])[0] = rslt.getByte(43);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(44, 10);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 10);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[91])[0] = rslt.getBigDecimal(47,2);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((byte[]) buf[93])[0] = rslt.getByte(48);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((byte[]) buf[97])[0] = rslt.getByte(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((short[]) buf[99])[0] = rslt.getShort(51);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((String[]) buf[101])[0] = rslt.getString(52, 10);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 20);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((String[]) buf[107])[0] = rslt.getString(55, 20);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 20);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((short[]) buf[111])[0] = rslt.getShort(57);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(58, 3);
               ((int[]) buf[114])[0] = rslt.getInt(59);
               ((boolean[]) buf[115])[0] = rslt.wasNull();
               ((byte[]) buf[116])[0] = rslt.getByte(60);
               ((boolean[]) buf[117])[0] = rslt.wasNull();
               ((String[]) buf[118])[0] = rslt.getString(61, 1);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((int[]) buf[120])[0] = rslt.getInt(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(17);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 1);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(20, 30);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(21);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 30);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(25);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(26);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(27, 15);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((short[]) buf[53])[0] = rslt.getShort(28);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((short[]) buf[55])[0] = rslt.getShort(29);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((short[]) buf[57])[0] = rslt.getShort(30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(31);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(32);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(33);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(34, 20);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(36,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(37,2);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[75])[0] = rslt.getBigDecimal(39,2);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(41, 10);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(42, 10);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getString(43, 10);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((byte[]) buf[85])[0] = rslt.getByte(44);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((byte[]) buf[87])[0] = rslt.getByte(45);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(46, 10);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((byte[]) buf[91])[0] = rslt.getByte(47);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(48, 10);
               ((boolean[]) buf[94])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[95])[0] = rslt.getBigDecimal(49,2);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
               ((byte[]) buf[97])[0] = rslt.getByte(50);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[99])[0] = rslt.getBigDecimal(51,2);
               ((boolean[]) buf[100])[0] = rslt.wasNull();
               ((byte[]) buf[101])[0] = rslt.getByte(52);
               ((boolean[]) buf[102])[0] = rslt.wasNull();
               ((short[]) buf[103])[0] = rslt.getShort(53);
               ((boolean[]) buf[104])[0] = rslt.wasNull();
               ((String[]) buf[105])[0] = rslt.getString(54, 10);
               ((boolean[]) buf[106])[0] = rslt.wasNull();
               ((short[]) buf[107])[0] = rslt.getShort(55);
               ((boolean[]) buf[108])[0] = rslt.wasNull();
               ((String[]) buf[109])[0] = rslt.getString(56, 20);
               ((boolean[]) buf[110])[0] = rslt.wasNull();
               ((String[]) buf[111])[0] = rslt.getString(57, 20);
               ((boolean[]) buf[112])[0] = rslt.wasNull();
               ((String[]) buf[113])[0] = rslt.getString(58, 20);
               ((boolean[]) buf[114])[0] = rslt.wasNull();
               ((short[]) buf[115])[0] = rslt.getShort(59);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((String[]) buf[117])[0] = rslt.getString(60, 3);
               ((int[]) buf[118])[0] = rslt.getInt(61);
               ((boolean[]) buf[119])[0] = rslt.wasNull();
               ((byte[]) buf[120])[0] = rslt.getByte(62);
               ((boolean[]) buf[121])[0] = rslt.wasNull();
               ((String[]) buf[122])[0] = rslt.getString(63, 1);
               ((boolean[]) buf[123])[0] = rslt.wasNull();
               ((int[]) buf[124])[0] = rslt.getInt(64);
               ((boolean[]) buf[125])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 25 :
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 8);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 13);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[16]).intValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DATE );
               }
               else
               {
                  stmt.setDate(10, (java.util.Date)parms[18]);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 6);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[26], 6);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 30);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[44]).shortValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[46]).byteValue());
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[48], 15);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[50]).shortValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[52]).shortValue());
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[54]).shortValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[56]).shortValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[58]).shortValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[60]).shortValue());
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[62], 20);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[68], 2);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[72], 2);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[74], 2);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[76], 10);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[78], 10);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[80], 10);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(42, ((Number) parms[82]).byteValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(43, ((Number) parms[84]).byteValue());
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(44, (String)parms[86], 10);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(45, ((Number) parms[88]).byteValue());
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[90], 10);
               }
               if ( ((Boolean) parms[91]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(47, (java.math.BigDecimal)parms[92], 2);
               }
               if ( ((Boolean) parms[93]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(48, ((Number) parms[94]).byteValue());
               }
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(49, (java.math.BigDecimal)parms[96], 2);
               }
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(50, ((Number) parms[98]).byteValue());
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[100]).shortValue());
               }
               if ( ((Boolean) parms[101]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(52, (String)parms[102], 10);
               }
               if ( ((Boolean) parms[103]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(53, ((Number) parms[104]).shortValue());
               }
               if ( ((Boolean) parms[105]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[106], 20);
               }
               if ( ((Boolean) parms[107]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[108], 20);
               }
               if ( ((Boolean) parms[109]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(56, (String)parms[110], 20);
               }
               if ( ((Boolean) parms[111]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(57, ((Number) parms[112]).shortValue());
               }
               stmt.setString(58, (String)parms[113], 3);
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(59, ((Number) parms[115]).intValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(60, ((Number) parms[117]).byteValue());
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[119], 1);
               }
               if ( ((Boolean) parms[120]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(62, ((Number) parms[121]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 16);
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 13);
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
                  stmt.setNull( 9 , Types.DATE );
               }
               else
               {
                  stmt.setDate(9, (java.util.Date)parms[17]);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 6);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 6);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[31], 2);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[35]).intValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 30);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[43]).shortValue());
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(23, ((Number) parms[45]).byteValue());
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[47], 15);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(26, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[53]).shortValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[55]).shortValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[57]).shortValue());
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(30, ((Number) parms[59]).shortValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[61], 20);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(34, (java.math.BigDecimal)parms[67], 2);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(35, (java.math.BigDecimal)parms[69], 2);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(37, (java.math.BigDecimal)parms[73], 2);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 10);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[77], 10);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[79], 10);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(41, ((Number) parms[81]).byteValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(42, ((Number) parms[83]).byteValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[85], 10);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(44, ((Number) parms[87]).byteValue());
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[89], 10);
               }
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(46, (java.math.BigDecimal)parms[91], 2);
               }
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(47, ((Number) parms[93]).byteValue());
               }
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(48, (java.math.BigDecimal)parms[95], 2);
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 49 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(49, ((Number) parms[97]).byteValue());
               }
               if ( ((Boolean) parms[98]).booleanValue() )
               {
                  stmt.setNull( 50 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(50, ((Number) parms[99]).shortValue());
               }
               if ( ((Boolean) parms[100]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(51, (String)parms[101], 10);
               }
               if ( ((Boolean) parms[102]).booleanValue() )
               {
                  stmt.setNull( 52 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(52, ((Number) parms[103]).shortValue());
               }
               if ( ((Boolean) parms[104]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[105], 20);
               }
               if ( ((Boolean) parms[106]).booleanValue() )
               {
                  stmt.setNull( 54 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(54, (String)parms[107], 20);
               }
               if ( ((Boolean) parms[108]).booleanValue() )
               {
                  stmt.setNull( 55 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(55, (String)parms[109], 20);
               }
               if ( ((Boolean) parms[110]).booleanValue() )
               {
                  stmt.setNull( 56 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(56, ((Number) parms[111]).shortValue());
               }
               if ( ((Boolean) parms[112]).booleanValue() )
               {
                  stmt.setNull( 57 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(57, ((Number) parms[113]).intValue());
               }
               if ( ((Boolean) parms[114]).booleanValue() )
               {
                  stmt.setNull( 58 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(58, ((Number) parms[115]).byteValue());
               }
               if ( ((Boolean) parms[116]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(59, (String)parms[117], 1);
               }
               if ( ((Boolean) parms[118]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(60, ((Number) parms[119]).intValue());
               }
               stmt.setString(61, (String)parms[120], 3);
               stmt.setInt(62, ((Number) parms[121]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 60);
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 60);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
      }
   }

}

