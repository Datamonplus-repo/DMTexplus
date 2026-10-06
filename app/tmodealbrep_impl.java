package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmodealbrep_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A44AlbRecCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrega por Recepcion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbHdRUl_Internalname ;
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
      nRC_GXsfl_130 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_130"))) ;
      nGXsfl_130_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_130_idx"))) ;
      sGXsfl_130_idx = httpContext.GetPar( "sGXsfl_130_idx") ;
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

   public tmodealbrep_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmodealbrep_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmodealbrep_impl.class ));
   }

   public tmodealbrep_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e111LQ2 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 0, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TModeALBREP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdRUl_Internalname, GXutil.ltrim( localUtil.ntoc( A6621AlbHdRUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdRUl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6621AlbHdRUl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6621AlbHdRUl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdRUl_Jsonclick, 0, "", "", "", "", "", 1, edtAlbHdRUl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "EmpNumDec", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpNumDec_Internalname, GXutil.ltrim( localUtil.ntoc( A3915EmpNumDec, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtEmpNumDec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9") : localUtil.format( DecimalUtil.doubleToDec(A3915EmpNumDec), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpNumDec_Jsonclick, 0, "", "", "", "", "", 1, edtEmpNumDec_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaQui_Internalname, GXutil.rtrim( A118BarAcaQui), GXutil.rtrim( localUtil.format( A118BarAcaQui, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaQui_Jsonclick, 0, "", "", "", "", "", 1, edtBarAcaQui_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Descripción Serie", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Nombre Color", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero del Color", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Codigo Tipo Colorante", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumCli_Jsonclick, 0, "", "", "", "", "", 1, edtBarNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Kilos Entregados", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbKgmE_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbKgmE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Metros Entregados H. Ruta", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbMtrE_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbMtrE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Total Piezas", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPie_Jsonclick, 0, "", "", "", "", "", 1, edtBarAlbPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Unidades Medida", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarUniMed_Internalname, GXutil.rtrim( A228BarUniMed), GXutil.rtrim( localUtil.format( A228BarUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarUniMed_Jsonclick, 0, "", "", "", "", "", 1, edtBarUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Suma Kgs", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdRSK_Internalname, GXutil.ltrim( localUtil.ntoc( A6628AlbHdRSK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdRSK_Enabled!=0) ? localUtil.format( A6628AlbHdRSK, "ZZZZZ9.99") : localUtil.format( A6628AlbHdRSK, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdRSK_Jsonclick, 0, "", "", "", "", "", 1, edtAlbHdRSK_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Suma Mts", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdRSM_Internalname, GXutil.ltrim( localUtil.ntoc( A11367AlbHdRSM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdRSM_Enabled!=0) ? localUtil.format( A11367AlbHdRSM, "ZZZZZ9.99") : localUtil.format( A11367AlbHdRSM, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdRSM_Jsonclick, 0, "", "", "", "", "", 1, edtAlbHdRSM_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Suma Pzs", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdRSP_Internalname, GXutil.ltrim( localUtil.ntoc( A6629AlbHdRSP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdRSP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6629AlbHdRSP), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6629AlbHdRSP), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdRSP_Jsonclick, 0, "", "", "", "", "", 1, edtAlbHdRSP_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TModeALBREP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol130( ) ;
      nGXsfl_130_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount946 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_946 = (short)(1) ;
            scanStart1LQ946( ) ;
            while ( RcdFound946 != 0 )
            {
               init_level_properties946( ) ;
               getByPrimaryKey1LQ946( ) ;
               addRow1LQ946( ) ;
               scanNext1LQ946( ) ;
            }
            scanEnd1LQ946( ) ;
            nBlankRcdCount946 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6629AlbHdRSP = A6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         B11367AlbHdRSM = A11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         B6628AlbHdRSK = A6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         standaloneNotModal1LQ946( ) ;
         standaloneModal1LQ946( ) ;
         sMode946 = Gx_mode ;
         while ( nGXsfl_130_idx < nRC_GXsfl_130 )
         {
            bGXsfl_130_Refreshing = true ;
            readRow1LQ946( ) ;
            edtavnRcdDeleted_946_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_946_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_946_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_946_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRLN_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRLn_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbRLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLOTE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbRTelar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRTELAR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRTelar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTelar_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbRLu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLU_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRLu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLu_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbRMdlCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRMDLCOD_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRKgi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRKGI_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRKgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRKgi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRMti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRMTI_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRMti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRMti_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRPzi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPZI_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRPzi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRPzi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRKgR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRKGR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRKgR_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRMtR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRMTR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRMtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRMtR_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            edtAlbHdRPzR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPZR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRPzR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRPzR_Enabled), 5, 0), !bGXsfl_130_Refreshing);
            if ( ( nRcdExists_946 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LQ946( ) ;
            }
            sendRow1LQ946( ) ;
            bGXsfl_130_Refreshing = false ;
         }
         Gx_mode = sMode946 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6629AlbHdRSP = B6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         A11367AlbHdRSM = B11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6628AlbHdRSK = B6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount946 = (short)(5) ;
         nRcdExists_946 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LQ946( ) ;
            while ( RcdFound946 != 0 )
            {
               sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_130946( ) ;
               init_level_properties946( ) ;
               standaloneNotModal1LQ946( ) ;
               getByPrimaryKey1LQ946( ) ;
               standaloneModal1LQ946( ) ;
               addRow1LQ946( ) ;
               scanNext1LQ946( ) ;
            }
            scanEnd1LQ946( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode946 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_130946( ) ;
         initAll1LQ946( ) ;
         init_level_properties946( ) ;
         B6629AlbHdRSP = A6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         B11367AlbHdRSM = A11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         B6628AlbHdRSK = A6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         nRcdExists_946 = (short)(0) ;
         nIsMod_946 = (short)(0) ;
         nRcdDeleted_946 = (short)(0) ;
         nBlankRcdCount946 = (short)(nBlankRcdUsr946+nBlankRcdCount946) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount946 > 0 )
         {
            standaloneNotModal1LQ946( ) ;
            standaloneModal1LQ946( ) ;
            addRow1LQ946( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbHdRLn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount946 = (short)(nBlankRcdCount946-1) ;
         }
         Gx_mode = sMode946 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6629AlbHdRSP = B6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         A11367AlbHdRSM = B11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6628AlbHdRSK = B6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TModeALBREP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TModeALBREP.htm");
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
      e121LQ2 ();
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
            Z6621AlbHdRUl = (short)(localUtil.ctol( httpContext.cgiGet( "Z6621AlbHdRUl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
            Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
            Z1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z1265BarAlbPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O6629AlbHdRSP = (int)(localUtil.ctol( httpContext.cgiGet( "O6629AlbHdRSP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O11367AlbHdRSM = localUtil.ctond( httpContext.cgiGet( "O11367AlbHdRSM")) ;
            O6628AlbHdRSK = localUtil.ctond( httpContext.cgiGet( "O6628AlbHdRSK")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_130 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_130"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV37Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdRUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdRUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRUL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbHdRUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6621AlbHdRUl = (short)(0) ;
               n6621AlbHdRUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6621AlbHdRUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6621AlbHdRUl), 4, 0));
            }
            else
            {
               A6621AlbHdRUl = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdRUl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6621AlbHdRUl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6621AlbHdRUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6621AlbHdRUl), 4, 0));
            }
            A3915EmpNumDec = (byte)(localUtil.ctol( httpContext.cgiGet( edtEmpNumDec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n3915EmpNumDec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
            A118BarAcaQui = httpContext.cgiGet( edtBarAcaQui_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
            A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
            A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarAlbPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1265BarAlbPie = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
            }
            else
            {
               A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
            }
            A228BarUniMed = GXutil.upper( httpContext.cgiGet( edtBarUniMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
            A6628AlbHdRSK = localUtil.ctond( httpContext.cgiGet( edtAlbHdRSK_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
            A11367AlbHdRSM = localUtil.ctond( httpContext.cgiGet( edtAlbHdRSM_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
            A6629AlbHdRSP = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbHdRSP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TModeALBREP");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmodealbrep:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1LQ0( ) ;
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
                        e121LQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131LQ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e111LQ2 ();
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
         /* Execute user event: After Trn */
         e131LQ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1LQ195( ) ;
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
         disableAttributes1LQ195( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_946_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_946_Enabled), 5, 0), !bGXsfl_130_Refreshing);
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

   public void confirm_1LQ0( )
   {
      beforeValidate1LQ195( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LQ195( ) ;
         }
         else
         {
            checkExtendedTable1LQ195( ) ;
            if ( AnyError == 0 )
            {
               zm1LQ195( 11) ;
               zm1LQ195( 12) ;
               zm1LQ195( 13) ;
               zm1LQ195( 14) ;
            }
            closeExtendedTableCursors1LQ195( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode195 = Gx_mode ;
         confirm_1LQ946( ) ;
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
         confirmValues1LQ0( ) ;
      }
   }

   public void confirm_1LQ946( )
   {
      s6629AlbHdRSP = O6629AlbHdRSP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      s11367AlbHdRSM = O11367AlbHdRSM ;
      httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      s6628AlbHdRSK = O6628AlbHdRSK ;
      httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRow1LQ946( ) ;
         if ( ( nRcdExists_946 != 0 ) || ( nIsMod_946 != 0 ) )
         {
            getKey1LQ946( ) ;
            if ( ( nRcdExists_946 == 0 ) && ( nRcdDeleted_946 == 0 ) )
            {
               if ( RcdFound946 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LQ946( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LQ946( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1LQ946( 16) ;
                     }
                     closeExtendedTableCursors1LQ946( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6629AlbHdRSP = A6629AlbHdRSP ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
                     O11367AlbHdRSM = A11367AlbHdRSM ;
                     httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
                     O6628AlbHdRSK = A6628AlbHdRSK ;
                     httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "ALBHDRLN_" + sGXsfl_130_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbHdRLn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound946 != 0 )
               {
                  if ( nRcdDeleted_946 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LQ946( ) ;
                     load1LQ946( ) ;
                     beforeValidate1LQ946( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LQ946( ) ;
                        O6629AlbHdRSP = A6629AlbHdRSP ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
                        O11367AlbHdRSM = A11367AlbHdRSM ;
                        httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
                        O6628AlbHdRSK = A6628AlbHdRSK ;
                        httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_946 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LQ946( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LQ946( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1LQ946( 16) ;
                           }
                           closeExtendedTableCursors1LQ946( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6629AlbHdRSP = A6629AlbHdRSP ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
                           O11367AlbHdRSM = A11367AlbHdRSM ;
                           httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
                           O6628AlbHdRSK = A6628AlbHdRSK ;
                           httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_946 == 0 )
                  {
                     GXCCtl = "ALBHDRLN_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbHdRLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_946_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRLn_Internalname, GXutil.ltrim( localUtil.ntoc( A6622AlbHdRLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote)) ;
         httpContext.changePostValue( edtAlbRTelar_Internalname, GXutil.rtrim( A6464AlbRTelar)) ;
         httpContext.changePostValue( edtAlbRLu_Internalname, GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod)) ;
         httpContext.changePostValue( edtAlbHdRKgi_Internalname, GXutil.ltrim( localUtil.ntoc( A6623AlbHdRKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRMti_Internalname, GXutil.ltrim( localUtil.ntoc( A11365AlbHdRMti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRPzi_Internalname, GXutil.ltrim( localUtil.ntoc( A6624AlbHdRPzi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRMtR_Internalname, GXutil.ltrim( localUtil.ntoc( A11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRPzR_Internalname, GXutil.ltrim( localUtil.ntoc( A6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6622AlbHdRLn_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6622AlbHdRLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6623AlbHdRKgi_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6623AlbHdRKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11365AlbHdRMti_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z11365AlbHdRMti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6624AlbHdRPzi_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6624AlbHdRPzi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6625AlbHdRKgR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11366AlbHdRMtR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6626AlbHdRPzR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6626AlbHdRPzR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( O6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11366AlbHdRMtR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( O11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6625AlbHdRKgR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( O6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_946_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_946_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_946_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_946 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_946_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_946_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRLN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRLOTE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRTELAR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRTelar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRLU_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRMDLCOD_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRMdlCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRKGI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRMTI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPZI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRKGR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRMTR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMtR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPZR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6629AlbHdRSP = s6629AlbHdRSP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      O11367AlbHdRSM = s11367AlbHdRSM ;
      httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      O6628AlbHdRSK = s6628AlbHdRSK ;
      httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LQ0( )
   {
   }

   public void e121LQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(9), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit0", AV17Lit0);
      GXt_char1 = AV19LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19LitFe", AV19LitFe);
      GXt_char1 = AV36Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV37Pgmname, (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit1", AV36Lit1);
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN435_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char1 = AV23Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT171_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit4", AV23Lit4);
      AV24Lit5 = httpContext.getMessage( "Cor", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit5", AV24Lit5);
      AV25Lit6 = httpContext.getMessage( "Acabado", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit6", AV25Lit6);
      AV26Lit7 = httpContext.getMessage( "Artigo", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit7", AV26Lit7);
      GXt_char1 = AV27Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit8", AV27Lit8);
      GXt_char1 = AV28Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1519_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit9", AV28Lit9);
      GXt_char1 = AV29Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1190_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit10", AV29Lit10);
      GXt_char1 = AV30Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1374_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV30Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit11", AV30Lit11);
      GXt_char1 = AV31Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1339_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit12", AV31Lit12);
      GXt_char1 = AV32Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN325_", ""), (byte)(99), GXv_char2) ;
      tmodealbrep_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit13", AV32Lit13);
      AV33Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char2[0] = AV20EmprCod ;
      GXv_char3[0] = AV21EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmodealbrep_impl.this.AV20EmprCod = GXv_char2[0] ;
      tmodealbrep_impl.this.AV21EmprNom = GXv_char3[0] ;
      tmodealbrep_impl.this.AV18UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20EmprCod", AV20EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21EmprNom", AV21EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV18UsurCod", AV18UsurCod);
   }

   public void e131LQ2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A30AlbProCod ;
      GXv_int6[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      new app.pkgmtcontrol(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3) ;
      tmodealbrep_impl.this.A396EmprCod = GXv_char4[0] ;
      tmodealbrep_impl.this.A30AlbProCod = GXv_int5[0] ;
      tmodealbrep_impl.this.A129BarCod = GXv_int6[0] ;
      tmodealbrep_impl.this.A132BarCodReo = GXv_int7[0] ;
      tmodealbrep_impl.this.A130BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      System.out.println( httpContext.getMessage( "Actualizo tablas Albbar,Barpie...", "") );
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A30AlbProCod ;
      GXv_int6[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      new app.pkgsnewg(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3) ;
      tmodealbrep_impl.this.A396EmprCod = GXv_char4[0] ;
      tmodealbrep_impl.this.A30AlbProCod = GXv_int5[0] ;
      tmodealbrep_impl.this.A129BarCod = GXv_int6[0] ;
      tmodealbrep_impl.this.A132BarCodReo = GXv_int7[0] ;
      tmodealbrep_impl.this.A130BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      /*  Sending Event outputs  */
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e111LQ2 ();
      if ( returnInSub )
      {
         pr_default.close(8);
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

   public void e111LQ2( )
   {
      /* Exit Routine */
      returnInSub = false ;
   }

   public void zm1LQ195( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6621AlbHdRUl = T01LQ6_A6621AlbHdRUl[0] ;
            Z1261BarAlbKgmE = T01LQ6_A1261BarAlbKgmE[0] ;
            Z1263BarAlbMtrE = T01LQ6_A1263BarAlbMtrE[0] ;
            Z1265BarAlbPie = T01LQ6_A1265BarAlbPie[0] ;
         }
         else
         {
            Z6621AlbHdRUl = A6621AlbHdRUl ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
            Z1265BarAlbPie = A1265BarAlbPie ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z6621AlbHdRUl = A6621AlbHdRUl ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z1265BarAlbPie = A1265BarAlbPie ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z30AlbProCod = A30AlbProCod ;
         Z3915EmpNumDec = A3915EmpNumDec ;
         Z118BarAcaQui = A118BarAcaQui ;
         Z212BarSer = A212BarSer ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z135BarColNom = A135BarColNom ;
         Z136BarColNum = A136BarColNum ;
         Z218BarTipCol = A218BarTipCol ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z1235BarNumCli = A1235BarNumCli ;
         Z228BarUniMed = A228BarUniMed ;
         Z6628AlbHdRSK = A6628AlbHdRSK ;
         Z11367AlbHdRSM = A11367AlbHdRSM ;
         Z6629AlbHdRSP = A6629AlbHdRSP ;
      }
   }

   public void standaloneNotModal( )
   {
      AV37Pgmname = "TModeALBREP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      bttBtn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      /* Using cursor T01LQ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A3915EmpNumDec = T01LQ7_A3915EmpNumDec[0] ;
      n3915EmpNumDec = T01LQ7_n3915EmpNumDec[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
      pr_default.close(5);
      /* Using cursor T01LQ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
      }
      pr_default.close(7);
      /* Using cursor T01LQ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
      }
      A118BarAcaQui = T01LQ8_A118BarAcaQui[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
      A212BarSer = T01LQ8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = T01LQ8_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = T01LQ8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A136BarColNum = T01LQ8_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A218BarTipCol = T01LQ8_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A1234BarNomCli = T01LQ8_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A1235BarNumCli = T01LQ8_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A228BarUniMed = T01LQ8_A228BarUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
      pr_default.close(6);
      /* Using cursor T01LQ11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A6628AlbHdRSK = T01LQ11_A6628AlbHdRSK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         A11367AlbHdRSM = T01LQ11_A11367AlbHdRSM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6629AlbHdRSP = T01LQ11_A6629AlbHdRSP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      }
      else
      {
         A6628AlbHdRSK = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         A11367AlbHdRSM = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6629AlbHdRSP = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      }
      O6628AlbHdRSK = A6628AlbHdRSK ;
      httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      O11367AlbHdRSM = A11367AlbHdRSM ;
      httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      O6629AlbHdRSP = A6629AlbHdRSP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      pr_default.close(8);
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

   public void load1LQ195( )
   {
      /* Using cursor T01LQ13 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A6621AlbHdRUl = T01LQ13_A6621AlbHdRUl[0] ;
         n6621AlbHdRUl = T01LQ13_n6621AlbHdRUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6621AlbHdRUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6621AlbHdRUl), 4, 0));
         A3915EmpNumDec = T01LQ13_A3915EmpNumDec[0] ;
         n3915EmpNumDec = T01LQ13_n3915EmpNumDec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3915EmpNumDec", GXutil.str( A3915EmpNumDec, 1, 0));
         A118BarAcaQui = T01LQ13_A118BarAcaQui[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A118BarAcaQui", A118BarAcaQui);
         A212BarSer = T01LQ13_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = T01LQ13_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = T01LQ13_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A136BarColNum = T01LQ13_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A218BarTipCol = T01LQ13_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A1234BarNomCli = T01LQ13_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A1235BarNumCli = T01LQ13_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A1261BarAlbKgmE = T01LQ13_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T01LQ13_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A1265BarAlbPie = T01LQ13_A1265BarAlbPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         A228BarUniMed = T01LQ13_A228BarUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228BarUniMed", A228BarUniMed);
         A6628AlbHdRSK = T01LQ13_A6628AlbHdRSK[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         A11367AlbHdRSM = T01LQ13_A11367AlbHdRSM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6629AlbHdRSP = T01LQ13_A6629AlbHdRSP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         zm1LQ195( -10) ;
      }
      pr_default.close(9);
      onLoadActions1LQ195( ) ;
   }

   public void onLoadActions1LQ195( )
   {
      O6629AlbHdRSP = A6629AlbHdRSP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      O11367AlbHdRSM = A11367AlbHdRSM ;
      httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      O6628AlbHdRSK = A6628AlbHdRSK ;
      httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
   }

   public void checkExtendedTable1LQ195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1LQ195( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1LQ195( )
   {
      /* Using cursor T01LQ14 */
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
      /* Using cursor T01LQ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01LQ6_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LQ6_A129BarCod[0] == A129BarCod ) && ( T01LQ6_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01LQ6_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01LQ6_A30AlbProCod[0] == A30AlbProCod ) )
      {
         zm1LQ195( 10) ;
         RcdFound195 = (short)(1) ;
         A6621AlbHdRUl = T01LQ6_A6621AlbHdRUl[0] ;
         n6621AlbHdRUl = T01LQ6_n6621AlbHdRUl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6621AlbHdRUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6621AlbHdRUl), 4, 0));
         A1261BarAlbKgmE = T01LQ6_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1263BarAlbMtrE = T01LQ6_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A1265BarAlbPie = T01LQ6_A1265BarAlbPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LQ195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1LQ195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1LQ195( ) ;
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
      getKey1LQ195( ) ;
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
      /* Using cursor T01LQ15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01LQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LQ15_A30AlbProCod[0] == A30AlbProCod ) && ( T01LQ15_A129BarCod[0] == A129BarCod ) && ( T01LQ15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01LQ15_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T01LQ15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LQ15_A30AlbProCod[0] == A30AlbProCod ) && ( T01LQ15_A129BarCod[0] == A129BarCod ) && ( T01LQ15_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01LQ15_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01LQ16 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01LQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LQ16_A30AlbProCod[0] == A30AlbProCod ) && ( T01LQ16_A129BarCod[0] == A129BarCod ) && ( T01LQ16_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01LQ16_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( GXutil.strcmp(T01LQ16_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LQ16_A30AlbProCod[0] == A30AlbProCod ) && ( T01LQ16_A129BarCod[0] == A129BarCod ) && ( T01LQ16_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01LQ16_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LQ195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A6629AlbHdRSP = O6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         A11367AlbHdRSM = O11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6628AlbHdRSK = O6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         GX_FocusControl = edtAlbHdRUl_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LQ195( ) ;
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
               A6629AlbHdRSP = O6629AlbHdRSP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
               A11367AlbHdRSM = O11367AlbHdRSM ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
               A6628AlbHdRSK = O6628AlbHdRSK ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbHdRUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A6629AlbHdRSP = O6629AlbHdRSP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
               A11367AlbHdRSM = O11367AlbHdRSM ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
               A6628AlbHdRSK = O6628AlbHdRSK ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
               update1LQ195( ) ;
               GX_FocusControl = edtAlbHdRUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               /* Insert record */
               A6629AlbHdRSP = O6629AlbHdRSP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
               A11367AlbHdRSM = O11367AlbHdRSM ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
               A6628AlbHdRSK = O6628AlbHdRSK ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
               GX_FocusControl = edtAlbHdRUl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LQ195( ) ;
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
                  A6629AlbHdRSP = O6629AlbHdRSP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
                  A11367AlbHdRSM = O11367AlbHdRSM ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
                  A6628AlbHdRSK = O6628AlbHdRSK ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
                  GX_FocusControl = edtAlbHdRUl_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LQ195( ) ;
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
         A6629AlbHdRSP = O6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         A11367AlbHdRSM = O11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         A6628AlbHdRSK = O6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbHdRUl_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      getKey1LQ195( ) ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tmodealbrep");
      GX_FocusControl = edtAlbHdRUl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LQ0( ) ;
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

   public void checkOptimisticConcurrency1LQ195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LQ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( Z6621AlbHdRUl != T01LQ5_A6621AlbHdRUl[0] ) || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01LQ5_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01LQ5_A1263BarAlbMtrE[0]) != 0 ) || ( Z1265BarAlbPie != T01LQ5_A1265BarAlbPie[0] ) )
         {
            if ( Z6621AlbHdRUl != T01LQ5_A6621AlbHdRUl[0] )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRUl");
               GXutil.writeLogRaw("Old: ",Z6621AlbHdRUl);
               GXutil.writeLogRaw("Current: ",T01LQ5_A6621AlbHdRUl[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01LQ5_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01LQ5_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01LQ5_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01LQ5_A1263BarAlbMtrE[0]);
            }
            if ( Z1265BarAlbPie != T01LQ5_A1265BarAlbPie[0] )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"BarAlbPie");
               GXutil.writeLogRaw("Old: ",Z1265BarAlbPie);
               GXutil.writeLogRaw("Current: ",T01LQ5_A1265BarAlbPie[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LQ195( )
   {
      beforeValidate1LQ195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LQ195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LQ195( 0) ;
         checkOptimisticConcurrency1LQ195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LQ195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LQ195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LQ17 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n6621AlbHdRUl), Short.valueOf(A6621AlbHdRUl), A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
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
                        processLevel1LQ195( ) ;
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
            load1LQ195( ) ;
         }
         endLevel1LQ195( ) ;
      }
      closeExtendedTableCursors1LQ195( ) ;
   }

   public void update1LQ195( )
   {
      beforeValidate1LQ195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LQ195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LQ195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LQ195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LQ195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LQ18 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n6621AlbHdRUl), Short.valueOf(A6621AlbHdRUl), A1261BarAlbKgmE, A1263BarAlbMtrE, Integer.valueOf(A1265BarAlbPie), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LQ195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LQ195( ) ;
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
         endLevel1LQ195( ) ;
      }
      closeExtendedTableCursors1LQ195( ) ;
   }

   public void deferredUpdate1LQ195( )
   {
   }

   public void delete( )
   {
      beforeValidate1LQ195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LQ195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LQ195( ) ;
         afterConfirm1LQ195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LQ195( ) ;
            if ( AnyError == 0 )
            {
               A6629AlbHdRSP = O6629AlbHdRSP ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
               A11367AlbHdRSM = O11367AlbHdRSM ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
               A6628AlbHdRSK = O6628AlbHdRSK ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
               scanStart1LQ946( ) ;
               while ( RcdFound946 != 0 )
               {
                  getByPrimaryKey1LQ946( ) ;
                  delete1LQ946( ) ;
                  scanNext1LQ946( ) ;
                  O6629AlbHdRSP = A6629AlbHdRSP ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
                  O11367AlbHdRSM = A11367AlbHdRSM ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
                  O6628AlbHdRSK = A6628AlbHdRSK ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
               }
               scanEnd1LQ946( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LQ19 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
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
      endLevel1LQ195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LQ195( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01LQ20 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01LQ21 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01LQ22 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01LQ23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01LQ24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01LQ25 */
         pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01LQ26 */
         pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01LQ27 */
         pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01LQ28 */
         pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01LQ29 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
      }
   }

   public void processNestedLevel1LQ946( )
   {
      s6629AlbHdRSP = O6629AlbHdRSP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      s11367AlbHdRSM = O11367AlbHdRSM ;
      httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      s6628AlbHdRSK = O6628AlbHdRSK ;
      httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      nGXsfl_130_idx = 0 ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         readRow1LQ946( ) ;
         if ( ( nRcdExists_946 != 0 ) || ( nIsMod_946 != 0 ) )
         {
            standaloneNotModal1LQ946( ) ;
            getKey1LQ946( ) ;
            if ( ( nRcdExists_946 == 0 ) && ( nRcdDeleted_946 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LQ946( ) ;
            }
            else
            {
               if ( RcdFound946 != 0 )
               {
                  if ( ( nRcdDeleted_946 != 0 ) && ( nRcdExists_946 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LQ946( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_946 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LQ946( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_946 == 0 )
                  {
                     GXCCtl = "ALBHDRLN_" + sGXsfl_130_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbHdRLn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6629AlbHdRSP = A6629AlbHdRSP ;
            httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
            O11367AlbHdRSM = A11367AlbHdRSM ;
            httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
            O6628AlbHdRSK = A6628AlbHdRSK ;
            httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_946_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRLn_Internalname, GXutil.ltrim( localUtil.ntoc( A6622AlbHdRLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRLote_Internalname, GXutil.rtrim( A6463AlbRLote)) ;
         httpContext.changePostValue( edtAlbRTelar_Internalname, GXutil.rtrim( A6464AlbRTelar)) ;
         httpContext.changePostValue( edtAlbRLu_Internalname, GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRMdlCod_Internalname, GXutil.rtrim( A4602AlbRMdlCod)) ;
         httpContext.changePostValue( edtAlbHdRKgi_Internalname, GXutil.ltrim( localUtil.ntoc( A6623AlbHdRKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRMti_Internalname, GXutil.ltrim( localUtil.ntoc( A11365AlbHdRMti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRPzi_Internalname, GXutil.ltrim( localUtil.ntoc( A6624AlbHdRPzi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRKgR_Internalname, GXutil.ltrim( localUtil.ntoc( A6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRMtR_Internalname, GXutil.ltrim( localUtil.ntoc( A11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbHdRPzR_Internalname, GXutil.ltrim( localUtil.ntoc( A6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6622AlbHdRLn_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6622AlbHdRLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6623AlbHdRKgi_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6623AlbHdRKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11365AlbHdRMti_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z11365AlbHdRMti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6624AlbHdRPzi_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6624AlbHdRPzi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6625AlbHdRKgR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11366AlbHdRMtR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6626AlbHdRPzR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6626AlbHdRPzR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( O6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T11366AlbHdRMtR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( O11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6625AlbHdRKgR_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( O6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_946_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_946_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_946_"+sGXsfl_130_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_946 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_946_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_946_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRLN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRLn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECCOD_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRLOTE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRTELAR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRTelar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRLU_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRMDLCOD_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRMdlCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRKGI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRMTI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPZI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRKGR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRMTR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMtR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBHDRPZR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LQ946( ) ;
      if ( AnyError != 0 )
      {
         O6629AlbHdRSP = s6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         O11367AlbHdRSM = s11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         O6628AlbHdRSK = s6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      }
      nRcdExists_946 = (short)(0) ;
      nIsMod_946 = (short)(0) ;
      nRcdDeleted_946 = (short)(0) ;
   }

   public void processLevel1LQ195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevel1LQ946( ) ;
      if ( AnyError != 0 )
      {
         O6629AlbHdRSP = s6629AlbHdRSP ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         O11367AlbHdRSM = s11367AlbHdRSM ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         O6628AlbHdRSK = s6628AlbHdRSK ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LQ195( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LQ195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmodealbrep");
         if ( AnyError == 0 )
         {
            confirmValues1LQ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmodealbrep");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LQ195( )
   {
      /* Scan By routine */
      /* Using cursor T01LQ30 */
      pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LQ195( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
   }

   public void scanEnd1LQ195( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1LQ195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LQ195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LQ195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LQ195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LQ195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LQ195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LQ195( )
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
      edtAlbHdRUl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRUl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRUl_Enabled), 5, 0), true);
      edtEmpNumDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpNumDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpNumDec_Enabled), 5, 0), true);
      edtBarAcaQui_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaQui_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaQui_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), true);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), true);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), true);
      edtBarAlbPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), true);
      edtBarUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarUniMed_Enabled), 5, 0), true);
      edtAlbHdRSK_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRSK_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRSK_Enabled), 5, 0), true);
      edtAlbHdRSM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRSM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRSM_Enabled), 5, 0), true);
      edtAlbHdRSP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRSP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRSP_Enabled), 5, 0), true);
   }

   public void zm1LQ946( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6623AlbHdRKgi = T01LQ3_A6623AlbHdRKgi[0] ;
            Z11365AlbHdRMti = T01LQ3_A11365AlbHdRMti[0] ;
            Z6624AlbHdRPzi = T01LQ3_A6624AlbHdRPzi[0] ;
            Z6625AlbHdRKgR = T01LQ3_A6625AlbHdRKgR[0] ;
            Z11366AlbHdRMtR = T01LQ3_A11366AlbHdRMtR[0] ;
            Z6626AlbHdRPzR = T01LQ3_A6626AlbHdRPzR[0] ;
            Z44AlbRecCod = T01LQ3_A44AlbRecCod[0] ;
         }
         else
         {
            Z6623AlbHdRKgi = A6623AlbHdRKgi ;
            Z11365AlbHdRMti = A11365AlbHdRMti ;
            Z6624AlbHdRPzi = A6624AlbHdRPzi ;
            Z6625AlbHdRKgR = A6625AlbHdRKgR ;
            Z11366AlbHdRMtR = A11366AlbHdRMtR ;
            Z6626AlbHdRPzR = A6626AlbHdRPzR ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z6622AlbHdRLn = A6622AlbHdRLn ;
         Z6623AlbHdRKgi = A6623AlbHdRKgi ;
         Z11365AlbHdRMti = A11365AlbHdRMti ;
         Z6624AlbHdRPzi = A6624AlbHdRPzi ;
         Z6625AlbHdRKgR = A6625AlbHdRKgR ;
         Z11366AlbHdRMtR = A11366AlbHdRMtR ;
         Z6626AlbHdRPzR = A6626AlbHdRPzR ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6463AlbRLote = A6463AlbRLote ;
         Z6464AlbRTelar = A6464AlbRTelar ;
         Z6465AlbRLu = A6465AlbRLu ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
      }
   }

   public void standaloneNotModal1LQ946( )
   {
      edtAlbHdRKgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRKgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRKgi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRMti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRMti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRMti_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRPzi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRPzi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRPzi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void standaloneModal1LQ946( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Não se permite criar LINHAS ¡¡¡", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbHdRLn_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRLn_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
      else
      {
         edtAlbHdRLn_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRLn_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      }
   }

   public void load1LQ946( )
   {
      /* Using cursor T01LQ31 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound946 = (short)(1) ;
         A6463AlbRLote = T01LQ31_A6463AlbRLote[0] ;
         A6464AlbRTelar = T01LQ31_A6464AlbRTelar[0] ;
         A6465AlbRLu = T01LQ31_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = T01LQ31_A4602AlbRMdlCod[0] ;
         A6623AlbHdRKgi = T01LQ31_A6623AlbHdRKgi[0] ;
         n6623AlbHdRKgi = T01LQ31_n6623AlbHdRKgi[0] ;
         A11365AlbHdRMti = T01LQ31_A11365AlbHdRMti[0] ;
         n11365AlbHdRMti = T01LQ31_n11365AlbHdRMti[0] ;
         A6624AlbHdRPzi = T01LQ31_A6624AlbHdRPzi[0] ;
         n6624AlbHdRPzi = T01LQ31_n6624AlbHdRPzi[0] ;
         A6625AlbHdRKgR = T01LQ31_A6625AlbHdRKgR[0] ;
         n6625AlbHdRKgR = T01LQ31_n6625AlbHdRKgR[0] ;
         A11366AlbHdRMtR = T01LQ31_A11366AlbHdRMtR[0] ;
         n11366AlbHdRMtR = T01LQ31_n11366AlbHdRMtR[0] ;
         A6626AlbHdRPzR = T01LQ31_A6626AlbHdRPzR[0] ;
         n6626AlbHdRPzR = T01LQ31_n6626AlbHdRPzR[0] ;
         A44AlbRecCod = T01LQ31_A44AlbRecCod[0] ;
         n44AlbRecCod = T01LQ31_n44AlbRecCod[0] ;
         zm1LQ946( -15) ;
      }
      pr_default.close(27);
      onLoadActions1LQ946( ) ;
   }

   public void onLoadActions1LQ946( )
   {
      if ( isIns( )  )
      {
         A6628AlbHdRSK = O6628AlbHdRSK.add(A6625AlbHdRKgR) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6628AlbHdRSK = O6628AlbHdRSK.add(A6625AlbHdRKgR).subtract(O6625AlbHdRKgR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6628AlbHdRSK = O6628AlbHdRSK.subtract(O6625AlbHdRKgR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A11367AlbHdRSM = O11367AlbHdRSM.add(A11366AlbHdRMtR) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A11367AlbHdRSM = O11367AlbHdRSM.add(A11366AlbHdRMtR).subtract(O11366AlbHdRMtR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A11367AlbHdRSM = O11367AlbHdRSM.subtract(O11366AlbHdRMtR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A6629AlbHdRSP = (int)(O6629AlbHdRSP+A6626AlbHdRPzR) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A6629AlbHdRSP = (int)(O6629AlbHdRSP+A6626AlbHdRPzR-O6626AlbHdRPzR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A6629AlbHdRSP = (int)(O6629AlbHdRSP-O6626AlbHdRPzR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
            }
         }
      }
   }

   public void checkExtendedTable1LQ946( )
   {
      nIsDirty_946 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LQ946( ) ;
      /* Using cursor T01LQ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6463AlbRLote = T01LQ4_A6463AlbRLote[0] ;
      A6464AlbRTelar = T01LQ4_A6464AlbRTelar[0] ;
      A6465AlbRLu = T01LQ4_A6465AlbRLu[0] ;
      A4602AlbRMdlCod = T01LQ4_A4602AlbRMdlCod[0] ;
      pr_default.close(2);
      if ( isIns( )  )
      {
         nIsDirty_946 = (short)(1) ;
         A6628AlbHdRSK = O6628AlbHdRSK.add(A6625AlbHdRKgR) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_946 = (short)(1) ;
            A6628AlbHdRSK = O6628AlbHdRSK.add(A6625AlbHdRKgR).subtract(O6625AlbHdRKgR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_946 = (short)(1) ;
               A6628AlbHdRSK = O6628AlbHdRSK.subtract(O6625AlbHdRKgR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_946 = (short)(1) ;
         A11367AlbHdRSM = O11367AlbHdRSM.add(A11366AlbHdRMtR) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_946 = (short)(1) ;
            A11367AlbHdRSM = O11367AlbHdRSM.add(A11366AlbHdRMtR).subtract(O11366AlbHdRMtR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_946 = (short)(1) ;
               A11367AlbHdRSM = O11367AlbHdRSM.subtract(O11366AlbHdRMtR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_946 = (short)(1) ;
         A6629AlbHdRSP = (int)(O6629AlbHdRSP+A6626AlbHdRPzR) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_946 = (short)(1) ;
            A6629AlbHdRSP = (int)(O6629AlbHdRSP+A6626AlbHdRPzR-O6626AlbHdRPzR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_946 = (short)(1) ;
               A6629AlbHdRSP = (int)(O6629AlbHdRSP-O6626AlbHdRPzR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1LQ946( )
   {
      pr_default.close(2);
   }

   public void enableDisable1LQ946( )
   {
   }

   public void gxload_16( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01LQ32 */
      pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A6463AlbRLote = T01LQ32_A6463AlbRLote[0] ;
      A6464AlbRTelar = T01LQ32_A6464AlbRTelar[0] ;
      A6465AlbRLu = T01LQ32_A6465AlbRLu[0] ;
      A4602AlbRMdlCod = T01LQ32_A4602AlbRMdlCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6463AlbRLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6464AlbRTelar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4602AlbRMdlCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(28) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(28);
   }

   public void getKey1LQ946( )
   {
      /* Using cursor T01LQ33 */
      pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound946 = (short)(1) ;
      }
      else
      {
         RcdFound946 = (short)(0) ;
      }
      pr_default.close(29);
   }

   public void getByPrimaryKey1LQ946( )
   {
      /* Using cursor T01LQ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
      if ( (pr_default.getStatus(1) != 101) && ( T01LQ3_A30AlbProCod[0] == A30AlbProCod ) && ( GXutil.strcmp(T01LQ3_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LQ3_A129BarCod[0] == A129BarCod ) && ( T01LQ3_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(T01LQ3_A130BarCodPar[0], A130BarCodPar) == 0 ) )
      {
         zm1LQ946( 15) ;
         RcdFound946 = (short)(1) ;
         initializeNonKey1LQ946( ) ;
         A6622AlbHdRLn = T01LQ3_A6622AlbHdRLn[0] ;
         A6623AlbHdRKgi = T01LQ3_A6623AlbHdRKgi[0] ;
         n6623AlbHdRKgi = T01LQ3_n6623AlbHdRKgi[0] ;
         A11365AlbHdRMti = T01LQ3_A11365AlbHdRMti[0] ;
         n11365AlbHdRMti = T01LQ3_n11365AlbHdRMti[0] ;
         A6624AlbHdRPzi = T01LQ3_A6624AlbHdRPzi[0] ;
         n6624AlbHdRPzi = T01LQ3_n6624AlbHdRPzi[0] ;
         A6625AlbHdRKgR = T01LQ3_A6625AlbHdRKgR[0] ;
         n6625AlbHdRKgR = T01LQ3_n6625AlbHdRKgR[0] ;
         A11366AlbHdRMtR = T01LQ3_A11366AlbHdRMtR[0] ;
         n11366AlbHdRMtR = T01LQ3_n11366AlbHdRMtR[0] ;
         A6626AlbHdRPzR = T01LQ3_A6626AlbHdRPzR[0] ;
         n6626AlbHdRPzR = T01LQ3_n6626AlbHdRPzR[0] ;
         A44AlbRecCod = T01LQ3_A44AlbRecCod[0] ;
         n44AlbRecCod = T01LQ3_n44AlbRecCod[0] ;
         O6626AlbHdRPzR = A6626AlbHdRPzR ;
         n6626AlbHdRPzR = false ;
         O11366AlbHdRMtR = A11366AlbHdRMtR ;
         n11366AlbHdRMtR = false ;
         O6625AlbHdRKgR = A6625AlbHdRKgR ;
         n6625AlbHdRKgR = false ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z6622AlbHdRLn = A6622AlbHdRLn ;
         sMode946 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LQ946( ) ;
         Gx_mode = sMode946 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound946 = (short)(0) ;
         initializeNonKey1LQ946( ) ;
         sMode946 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LQ946( ) ;
         Gx_mode = sMode946 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LQ946( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LQ946( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LQ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6623AlbHdRKgi, T01LQ2_A6623AlbHdRKgi[0]) != 0 ) || ( DecimalUtil.compareTo(Z11365AlbHdRMti, T01LQ2_A11365AlbHdRMti[0]) != 0 ) || ( Z6624AlbHdRPzi != T01LQ2_A6624AlbHdRPzi[0] ) || ( DecimalUtil.compareTo(Z6625AlbHdRKgR, T01LQ2_A6625AlbHdRKgR[0]) != 0 ) || ( DecimalUtil.compareTo(Z11366AlbHdRMtR, T01LQ2_A11366AlbHdRMtR[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6626AlbHdRPzR != T01LQ2_A6626AlbHdRPzR[0] ) || ( Z44AlbRecCod != T01LQ2_A44AlbRecCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z6623AlbHdRKgi, T01LQ2_A6623AlbHdRKgi[0]) != 0 )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRKgi");
               GXutil.writeLogRaw("Old: ",Z6623AlbHdRKgi);
               GXutil.writeLogRaw("Current: ",T01LQ2_A6623AlbHdRKgi[0]);
            }
            if ( DecimalUtil.compareTo(Z11365AlbHdRMti, T01LQ2_A11365AlbHdRMti[0]) != 0 )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRMti");
               GXutil.writeLogRaw("Old: ",Z11365AlbHdRMti);
               GXutil.writeLogRaw("Current: ",T01LQ2_A11365AlbHdRMti[0]);
            }
            if ( Z6624AlbHdRPzi != T01LQ2_A6624AlbHdRPzi[0] )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRPzi");
               GXutil.writeLogRaw("Old: ",Z6624AlbHdRPzi);
               GXutil.writeLogRaw("Current: ",T01LQ2_A6624AlbHdRPzi[0]);
            }
            if ( DecimalUtil.compareTo(Z6625AlbHdRKgR, T01LQ2_A6625AlbHdRKgR[0]) != 0 )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRKgR");
               GXutil.writeLogRaw("Old: ",Z6625AlbHdRKgR);
               GXutil.writeLogRaw("Current: ",T01LQ2_A6625AlbHdRKgR[0]);
            }
            if ( DecimalUtil.compareTo(Z11366AlbHdRMtR, T01LQ2_A11366AlbHdRMtR[0]) != 0 )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRMtR");
               GXutil.writeLogRaw("Old: ",Z11366AlbHdRMtR);
               GXutil.writeLogRaw("Current: ",T01LQ2_A11366AlbHdRMtR[0]);
            }
            if ( Z6626AlbHdRPzR != T01LQ2_A6626AlbHdRPzR[0] )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbHdRPzR");
               GXutil.writeLogRaw("Old: ",Z6626AlbHdRPzR);
               GXutil.writeLogRaw("Current: ",T01LQ2_A6626AlbHdRPzR[0]);
            }
            if ( Z44AlbRecCod != T01LQ2_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tmodealbrep:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01LQ2_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LQ946( )
   {
      beforeValidate1LQ946( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LQ946( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LQ946( 0) ;
         checkOptimisticConcurrency1LQ946( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LQ946( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LQ946( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LQ34 */
                  pr_default.execute(30, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A6622AlbHdRLn), Boolean.valueOf(n6623AlbHdRKgi), A6623AlbHdRKgi, Boolean.valueOf(n11365AlbHdRMti), A11365AlbHdRMti, Boolean.valueOf(n6624AlbHdRPzi), Short.valueOf(A6624AlbHdRPzi), Boolean.valueOf(n6625AlbHdRKgR), A6625AlbHdRKgR, Boolean.valueOf(n11366AlbHdRMtR), A11366AlbHdRMtR, Boolean.valueOf(n6626AlbHdRPzR), Short.valueOf(A6626AlbHdRPzR), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREP");
                  if ( (pr_default.getStatus(30) == 1) )
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
            load1LQ946( ) ;
         }
         endLevel1LQ946( ) ;
      }
      closeExtendedTableCursors1LQ946( ) ;
   }

   public void update1LQ946( )
   {
      beforeValidate1LQ946( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LQ946( ) ;
      }
      if ( ( nIsMod_946 != 0 ) || ( nIsDirty_946 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LQ946( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LQ946( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LQ946( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LQ35 */
                     pr_default.execute(31, new Object[] {Boolean.valueOf(n6623AlbHdRKgi), A6623AlbHdRKgi, Boolean.valueOf(n11365AlbHdRMti), A11365AlbHdRMti, Boolean.valueOf(n6624AlbHdRPzi), Short.valueOf(A6624AlbHdRPzi), Boolean.valueOf(n6625AlbHdRKgR), A6625AlbHdRKgR, Boolean.valueOf(n11366AlbHdRMtR), A11366AlbHdRMtR, Boolean.valueOf(n6626AlbHdRPzR), Short.valueOf(A6626AlbHdRPzR), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREP");
                     if ( (pr_default.getStatus(31) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LQ946( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LQ946( ) ;
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
            endLevel1LQ946( ) ;
         }
      }
      closeExtendedTableCursors1LQ946( ) ;
   }

   public void deferredUpdate1LQ946( )
   {
   }

   public void delete1LQ946( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LQ946( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LQ946( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LQ946( ) ;
         afterConfirm1LQ946( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LQ946( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LQ36 */
               pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A6622AlbHdRLn)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREP");
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
      sMode946 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LQ946( ) ;
      Gx_mode = sMode946 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LQ946( )
   {
      standaloneModal1LQ946( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LQ37 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         A6463AlbRLote = T01LQ37_A6463AlbRLote[0] ;
         A6464AlbRTelar = T01LQ37_A6464AlbRTelar[0] ;
         A6465AlbRLu = T01LQ37_A6465AlbRLu[0] ;
         A4602AlbRMdlCod = T01LQ37_A4602AlbRMdlCod[0] ;
         pr_default.close(33);
         if ( isIns( )  )
         {
            A6628AlbHdRSK = O6628AlbHdRSK.add(A6625AlbHdRKgR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6628AlbHdRSK = O6628AlbHdRSK.add(A6625AlbHdRKgR).subtract(O6625AlbHdRKgR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6628AlbHdRSK = O6628AlbHdRSK.subtract(O6625AlbHdRKgR) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A11367AlbHdRSM = O11367AlbHdRSM.add(A11366AlbHdRMtR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A11367AlbHdRSM = O11367AlbHdRSM.add(A11366AlbHdRMtR).subtract(O11366AlbHdRMtR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A11367AlbHdRSM = O11367AlbHdRSM.subtract(O11366AlbHdRMtR) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A6629AlbHdRSP = (int)(O6629AlbHdRSP+A6626AlbHdRPzR) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A6629AlbHdRSP = (int)(O6629AlbHdRSP+A6626AlbHdRPzR-O6626AlbHdRPzR) ;
               httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6629AlbHdRSP = (int)(O6629AlbHdRSP-O6626AlbHdRPzR) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
               }
            }
         }
      }
   }

   public void endLevel1LQ946( )
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

   public void scanStart1LQ946( )
   {
      /* Scan By routine */
      /* Using cursor T01LQ38 */
      pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound946 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound946 = (short)(1) ;
         A6622AlbHdRLn = T01LQ38_A6622AlbHdRLn[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LQ946( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound946 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound946 = (short)(1) ;
         A6622AlbHdRLn = T01LQ38_A6622AlbHdRLn[0] ;
      }
   }

   public void scanEnd1LQ946( )
   {
      pr_default.close(34);
   }

   public void afterConfirm1LQ946( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LQ946( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LQ946( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LQ946( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LQ946( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LQ946( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LQ946( )
   {
      edtAlbHdRLn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRLn_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbRLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLote_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbRTelar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRTelar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRTelar_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbRLu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLu_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbRMdlCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRMdlCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRMdlCod_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRKgi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRKgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRKgi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRMti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRMti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRMti_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRPzi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRPzi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRPzi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRKgR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRKgR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRKgR_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRMtR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRMtR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRMtR_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRPzR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRPzR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRPzR_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void send_integrity_lvl_hashes1LQ946( )
   {
   }

   public void send_integrity_lvl_hashes1LQ195( )
   {
   }

   public void subsflControlProps_130946( )
   {
      edtavnRcdDeleted_946_Internalname = "vNRCDDELETED_946_"+sGXsfl_130_idx ;
      edtAlbHdRLn_Internalname = "ALBHDRLN_"+sGXsfl_130_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_130_idx ;
      edtAlbRLote_Internalname = "ALBRLOTE_"+sGXsfl_130_idx ;
      edtAlbRTelar_Internalname = "ALBRTELAR_"+sGXsfl_130_idx ;
      edtAlbRLu_Internalname = "ALBRLU_"+sGXsfl_130_idx ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD_"+sGXsfl_130_idx ;
      edtAlbHdRKgi_Internalname = "ALBHDRKGI_"+sGXsfl_130_idx ;
      edtAlbHdRMti_Internalname = "ALBHDRMTI_"+sGXsfl_130_idx ;
      edtAlbHdRPzi_Internalname = "ALBHDRPZI_"+sGXsfl_130_idx ;
      edtAlbHdRKgR_Internalname = "ALBHDRKGR_"+sGXsfl_130_idx ;
      edtAlbHdRMtR_Internalname = "ALBHDRMTR_"+sGXsfl_130_idx ;
      edtAlbHdRPzR_Internalname = "ALBHDRPZR_"+sGXsfl_130_idx ;
   }

   public void subsflControlProps_fel_130946( )
   {
      edtavnRcdDeleted_946_Internalname = "vNRCDDELETED_946_"+sGXsfl_130_fel_idx ;
      edtAlbHdRLn_Internalname = "ALBHDRLN_"+sGXsfl_130_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_130_fel_idx ;
      edtAlbRLote_Internalname = "ALBRLOTE_"+sGXsfl_130_fel_idx ;
      edtAlbRTelar_Internalname = "ALBRTELAR_"+sGXsfl_130_fel_idx ;
      edtAlbRLu_Internalname = "ALBRLU_"+sGXsfl_130_fel_idx ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD_"+sGXsfl_130_fel_idx ;
      edtAlbHdRKgi_Internalname = "ALBHDRKGI_"+sGXsfl_130_fel_idx ;
      edtAlbHdRMti_Internalname = "ALBHDRMTI_"+sGXsfl_130_fel_idx ;
      edtAlbHdRPzi_Internalname = "ALBHDRPZI_"+sGXsfl_130_fel_idx ;
      edtAlbHdRKgR_Internalname = "ALBHDRKGR_"+sGXsfl_130_fel_idx ;
      edtAlbHdRMtR_Internalname = "ALBHDRMTR_"+sGXsfl_130_fel_idx ;
      edtAlbHdRPzR_Internalname = "ALBHDRPZR_"+sGXsfl_130_fel_idx ;
   }

   public void addRow1LQ946( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130946( ) ;
      sendRow1LQ946( ) ;
   }

   public void sendRow1LQ946( )
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
         if ( ((int)((nGXsfl_130_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_946_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_946_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_946_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_946), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_946), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_946_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_946_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_946_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 132,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRLn_Internalname,GXutil.ltrim( localUtil.ntoc( A6622AlbHdRLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6622AlbHdRLn), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,132);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRLn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRLn_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_946_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 133,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,133);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLote_Internalname,GXutil.rtrim( A6463AlbRLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRLote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTelar_Internalname,GXutil.rtrim( A6464AlbRTelar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTelar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRTelar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLu_Internalname,GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRLu_Enabled!=0) ? localUtil.format( A6465AlbRLu, "ZZ9.99") : localUtil.format( A6465AlbRLu, "ZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRLu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRMdlCod_Internalname,GXutil.rtrim( A4602AlbRMdlCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRMdlCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRMdlCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRKgi_Internalname,GXutil.ltrim( localUtil.ntoc( A6623AlbHdRKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdRKgi_Enabled!=0) ? localUtil.format( A6623AlbHdRKgi, "ZZZZZ9.99") : localUtil.format( A6623AlbHdRKgi, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRKgi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRKgi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRMti_Internalname,GXutil.ltrim( localUtil.ntoc( A11365AlbHdRMti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdRMti_Enabled!=0) ? localUtil.format( A11365AlbHdRMti, "ZZZZZ9.99") : localUtil.format( A11365AlbHdRMti, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRMti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRMti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRPzi_Internalname,GXutil.ltrim( localUtil.ntoc( A6624AlbHdRPzi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdRPzi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6624AlbHdRPzi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6624AlbHdRPzi), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRPzi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRPzi_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_946_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 141,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRKgR_Internalname,GXutil.ltrim( localUtil.ntoc( A6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdRKgR_Enabled!=0) ? localUtil.format( A6625AlbHdRKgR, "ZZZZZ9.99") : localUtil.format( A6625AlbHdRKgR, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRKgR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRKgR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_946_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 142,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRMtR_Internalname,GXutil.ltrim( localUtil.ntoc( A11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdRMtR_Enabled!=0) ? localUtil.format( A11366AlbHdRMtR, "ZZZZZ9.99") : localUtil.format( A11366AlbHdRMtR, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,142);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRMtR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRMtR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_946_" + sGXsfl_130_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_130_idx + "',130)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHdRPzR_Internalname,GXutil.ltrim( localUtil.ntoc( A6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbHdRPzR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6626AlbHdRPzR), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6626AlbHdRPzR), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHdRPzR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbHdRPzR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(130),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LQ946( ) ;
      GXCCtl = "Z6622AlbHdRLn_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6622AlbHdRLn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6623AlbHdRKgi_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6623AlbHdRKgi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11365AlbHdRMti_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11365AlbHdRMti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6624AlbHdRPzi_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6624AlbHdRPzi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6625AlbHdRKgR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11366AlbHdRMtR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6626AlbHdRPzR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6626AlbHdRPzR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6626AlbHdRPzR, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O11366AlbHdRMtR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O11366AlbHdRMtR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6625AlbHdRKgR_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6625AlbHdRKgR, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_946_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_946_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_946_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_946, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_130_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_946_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_946_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRLN_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLOTE_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRTELAR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRTelar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRLU_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRMDLCOD_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRMdlCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRKGI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRMTI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRPZI_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRKGR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRMTR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMtR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHDRPZR_"+sGXsfl_130_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzR_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LQ946( )
   {
      nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130946( ) ;
      edtavnRcdDeleted_946_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_946_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRLn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRLN_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRLote_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLOTE_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRTelar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRTELAR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRLu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRLU_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRMdlCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRMDLCOD_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRKgi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRKGI_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRMti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRMTI_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRPzi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPZI_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRKgR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRKGR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRMtR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRMTR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbHdRPzR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBHDRPZR_"+sGXsfl_130_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_946_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_946_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_946");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_946_Internalname ;
         wbErr = true ;
         nRcdDeleted_946 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_946 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_946_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdRLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdRLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBHDRLN_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdRLn_Internalname ;
         wbErr = true ;
         A6622AlbHdRLn = (short)(0) ;
      }
      else
      {
         A6622AlbHdRLn = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdRLn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "ALBRECCOD_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         wbErr = true ;
         A44AlbRecCod = 0 ;
         n44AlbRecCod = false ;
      }
      else
      {
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n44AlbRecCod = false ;
      }
      A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
      A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
      A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
      A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
      A6623AlbHdRKgi = localUtil.ctond( httpContext.cgiGet( edtAlbHdRKgi_Internalname)) ;
      n6623AlbHdRKgi = false ;
      A11365AlbHdRMti = localUtil.ctond( httpContext.cgiGet( edtAlbHdRMti_Internalname)) ;
      n11365AlbHdRMti = false ;
      A6624AlbHdRPzi = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdRPzi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n6624AlbHdRPzi = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbHdRKgR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdRKgR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRKGR_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdRKgR_Internalname ;
         wbErr = true ;
         A6625AlbHdRKgR = DecimalUtil.ZERO ;
         n6625AlbHdRKgR = false ;
      }
      else
      {
         A6625AlbHdRKgR = localUtil.ctond( httpContext.cgiGet( edtAlbHdRKgR_Internalname)) ;
         n6625AlbHdRKgR = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbHdRMtR_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbHdRMtR_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBHDRMTR_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdRMtR_Internalname ;
         wbErr = true ;
         A11366AlbHdRMtR = DecimalUtil.ZERO ;
         n11366AlbHdRMtR = false ;
      }
      else
      {
         A11366AlbHdRMtR = localUtil.ctond( httpContext.cgiGet( edtAlbHdRMtR_Internalname)) ;
         n11366AlbHdRMtR = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdRPzR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdRPzR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBHDRPZR_" + sGXsfl_130_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbHdRPzR_Internalname ;
         wbErr = true ;
         A6626AlbHdRPzR = (short)(0) ;
         n6626AlbHdRPzR = false ;
      }
      else
      {
         A6626AlbHdRPzR = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdRPzR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6626AlbHdRPzR = false ;
      }
      GXCCtl = "Z6622AlbHdRLn_" + sGXsfl_130_idx ;
      Z6622AlbHdRLn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6623AlbHdRKgi_" + sGXsfl_130_idx ;
      Z6623AlbHdRKgi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11365AlbHdRMti_" + sGXsfl_130_idx ;
      Z11365AlbHdRMti = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6624AlbHdRPzi_" + sGXsfl_130_idx ;
      Z6624AlbHdRPzi = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6625AlbHdRKgR_" + sGXsfl_130_idx ;
      Z6625AlbHdRKgR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z11366AlbHdRMtR_" + sGXsfl_130_idx ;
      Z11366AlbHdRMtR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6626AlbHdRPzR_" + sGXsfl_130_idx ;
      Z6626AlbHdRPzR = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z44AlbRecCod_" + sGXsfl_130_idx ;
      Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6626AlbHdRPzR_" + sGXsfl_130_idx ;
      O6626AlbHdRPzR = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O11366AlbHdRMtR_" + sGXsfl_130_idx ;
      O11366AlbHdRMtR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O6625AlbHdRKgR_" + sGXsfl_130_idx ;
      O6625AlbHdRKgR = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_946_" + sGXsfl_130_idx ;
      nRcdDeleted_946 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_946_" + sGXsfl_130_idx ;
      nRcdExists_946 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_946_" + sGXsfl_130_idx ;
      nIsMod_946 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbHdRPzi_Enabled = edtAlbHdRPzi_Enabled ;
      defedtAlbHdRMti_Enabled = edtAlbHdRMti_Enabled ;
      defedtAlbHdRKgi_Enabled = edtAlbHdRKgi_Enabled ;
      defedtAlbHdRLn_Enabled = edtAlbHdRLn_Enabled ;
   }

   public void confirmValues1LQ0( )
   {
      nGXsfl_130_idx = 0 ;
      sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_130946( ) ;
      while ( nGXsfl_130_idx < nRC_GXsfl_130 )
      {
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_130946( ) ;
         httpContext.changePostValue( "Z6622AlbHdRLn_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z6622AlbHdRLn_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6622AlbHdRLn_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z6623AlbHdRKgi_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z6623AlbHdRKgi_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6623AlbHdRKgi_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z11365AlbHdRMti_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z11365AlbHdRMti_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11365AlbHdRMti_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z6624AlbHdRPzi_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z6624AlbHdRPzi_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6624AlbHdRPzi_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z6625AlbHdRKgR_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z6625AlbHdRKgR_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6625AlbHdRKgR_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z11366AlbHdRMtR_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z11366AlbHdRMtR_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11366AlbHdRMtR_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z6626AlbHdRPzR_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z6626AlbHdRPzR_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6626AlbHdRPzR_"+sGXsfl_130_idx) ;
         httpContext.changePostValue( "Z44AlbRecCod_"+sGXsfl_130_idx, httpContext.cgiGet( "ZT_"+"Z44AlbRecCod_"+sGXsfl_130_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z44AlbRecCod_"+sGXsfl_130_idx) ;
      }
      httpContext.changePostValue( "O6626AlbHdRPzR", httpContext.cgiGet( "T6626AlbHdRPzR")) ;
      httpContext.deletePostValue( "T6626AlbHdRPzR") ;
      httpContext.changePostValue( "O11366AlbHdRMtR", httpContext.cgiGet( "T11366AlbHdRMtR")) ;
      httpContext.deletePostValue( "T11366AlbHdRMtR") ;
      httpContext.changePostValue( "O6625AlbHdRKgR", httpContext.cgiGet( "T6625AlbHdRKgR")) ;
      httpContext.deletePostValue( "T6625AlbHdRKgR") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tmodealbrep", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Gx_mode"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TModeALBREP");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmodealbrep:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z6621AlbHdRUl", GXutil.ltrim( localUtil.ntoc( Z6621AlbHdRUl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6629AlbHdRSP", GXutil.ltrim( localUtil.ntoc( O6629AlbHdRSP, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O11367AlbHdRSM", GXutil.ltrim( localUtil.ntoc( O11367AlbHdRSM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O6628AlbHdRSK", GXutil.ltrim( localUtil.ntoc( O6628AlbHdRSK, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_130", GXutil.ltrim( localUtil.ntoc( nGXsfl_130_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV37Pgmname));
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
      return formatLink("app.tmodealbrep", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(Gx_mode))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Gx_mode"})  ;
   }

   public String getPgmname( )
   {
      return "TModeALBREP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrega por Recepcion", "") ;
   }

   public void initializeNonKey1LQ195( )
   {
      A6621AlbHdRUl = (short)(0) ;
      n6621AlbHdRUl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6621AlbHdRUl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6621AlbHdRUl), 4, 0));
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A1265BarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
      O6629AlbHdRSP = A6629AlbHdRSP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6629AlbHdRSP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6629AlbHdRSP), 6, 0));
      O11367AlbHdRSM = A11367AlbHdRSM ;
      httpContext.ajax_rsp_assign_attri("", false, "A11367AlbHdRSM", GXutil.ltrimstr( A11367AlbHdRSM, 9, 2));
      O6628AlbHdRSK = A6628AlbHdRSK ;
      httpContext.ajax_rsp_assign_attri("", false, "A6628AlbHdRSK", GXutil.ltrimstr( A6628AlbHdRSK, 9, 2));
      Z6621AlbHdRUl = (short)(0) ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1265BarAlbPie = 0 ;
   }

   public void initAll1LQ195( )
   {
      initializeNonKey1LQ195( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LQ946( )
   {
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6623AlbHdRKgi = DecimalUtil.ZERO ;
      n6623AlbHdRKgi = false ;
      A11365AlbHdRMti = DecimalUtil.ZERO ;
      n11365AlbHdRMti = false ;
      A6624AlbHdRPzi = (short)(0) ;
      n6624AlbHdRPzi = false ;
      A6625AlbHdRKgR = DecimalUtil.ZERO ;
      n6625AlbHdRKgR = false ;
      A11366AlbHdRMtR = DecimalUtil.ZERO ;
      n11366AlbHdRMtR = false ;
      A6626AlbHdRPzR = (short)(0) ;
      n6626AlbHdRPzR = false ;
      O6626AlbHdRPzR = A6626AlbHdRPzR ;
      n6626AlbHdRPzR = false ;
      O11366AlbHdRMtR = A11366AlbHdRMtR ;
      n11366AlbHdRMtR = false ;
      O6625AlbHdRKgR = A6625AlbHdRKgR ;
      n6625AlbHdRKgR = false ;
      Z6623AlbHdRKgi = DecimalUtil.ZERO ;
      Z11365AlbHdRMti = DecimalUtil.ZERO ;
      Z6624AlbHdRPzi = (short)(0) ;
      Z6625AlbHdRKgR = DecimalUtil.ZERO ;
      Z11366AlbHdRMtR = DecimalUtil.ZERO ;
      Z6626AlbHdRPzR = (short)(0) ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1LQ946( )
   {
      A6622AlbHdRLn = (short)(0) ;
      initializeNonKey1LQ946( ) ;
   }

   public void standaloneModalInsert1LQ946( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241594191", true, true);
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
      httpContext.AddJavascriptSource("tmodealbrep.js", "?20268241594191", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties946( )
   {
      edtAlbHdRPzi_Enabled = defedtAlbHdRPzi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRPzi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRPzi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRMti_Enabled = defedtAlbHdRMti_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRMti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRMti_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRKgi_Enabled = defedtAlbHdRKgi_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRKgi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRKgi_Enabled), 5, 0), !bGXsfl_130_Refreshing);
      edtAlbHdRLn_Enabled = defedtAlbHdRLn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdRLn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdRLn_Enabled), 5, 0), !bGXsfl_130_Refreshing);
   }

   public void startgridcontrol130( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_946, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_946_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6622AlbHdRLn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRLn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6463AlbRLote));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLote_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6464AlbRTelar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRTelar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRLu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4602AlbRMdlCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRMdlCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6623AlbHdRKgi, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11365AlbHdRMti, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6624AlbHdRPzi, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6625AlbHdRKgR, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRKgR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11366AlbHdRMtR, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRMtR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6626AlbHdRPzR, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbHdRPzR_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbHdRUl_Internalname = "ALBHDRUL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtEmpNumDec_Internalname = "EMPNUMDEC" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarAcaQui_Internalname = "BARACAQUI" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtBarUniMed_Internalname = "BARUNIMED" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtAlbHdRSK_Internalname = "ALBHDRSK" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtAlbHdRSM_Internalname = "ALBHDRSM" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtAlbHdRSP_Internalname = "ALBHDRSP" ;
      edtavnRcdDeleted_946_Internalname = "vNRCDDELETED_946" ;
      edtAlbHdRLn_Internalname = "ALBHDRLN" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      edtAlbRTelar_Internalname = "ALBRTELAR" ;
      edtAlbRLu_Internalname = "ALBRLU" ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD" ;
      edtAlbHdRKgi_Internalname = "ALBHDRKGI" ;
      edtAlbHdRMti_Internalname = "ALBHDRMTI" ;
      edtAlbHdRPzi_Internalname = "ALBHDRPZI" ;
      edtAlbHdRKgR_Internalname = "ALBHDRKGR" ;
      edtAlbHdRMtR_Internalname = "ALBHDRMTR" ;
      edtAlbHdRPzR_Internalname = "ALBHDRPZR" ;
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
      Form.setCaption( httpContext.getMessage( "Entrega por Recepcion", "") );
      edtAlbHdRPzR_Jsonclick = "" ;
      edtAlbHdRMtR_Jsonclick = "" ;
      edtAlbHdRKgR_Jsonclick = "" ;
      edtAlbHdRPzi_Jsonclick = "" ;
      edtAlbHdRMti_Jsonclick = "" ;
      edtAlbHdRKgi_Jsonclick = "" ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRLote_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbHdRLn_Jsonclick = "" ;
      edtavnRcdDeleted_946_Jsonclick = "" ;
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
      edtAlbHdRPzR_Enabled = 1 ;
      edtAlbHdRMtR_Enabled = 1 ;
      edtAlbHdRKgR_Enabled = 1 ;
      edtAlbHdRPzi_Enabled = 0 ;
      edtAlbHdRMti_Enabled = 0 ;
      edtAlbHdRKgi_Enabled = 0 ;
      edtAlbRMdlCod_Enabled = 0 ;
      edtAlbRLu_Enabled = 0 ;
      edtAlbRTelar_Enabled = 0 ;
      edtAlbRLote_Enabled = 0 ;
      edtAlbRecCod_Enabled = 1 ;
      edtAlbHdRLn_Enabled = 1 ;
      edtavnRcdDeleted_946_Enabled = 1 ;
      edtAlbHdRSP_Jsonclick = "" ;
      edtAlbHdRSP_Backcolor = (int)(0xFFFFFF) ;
      edtAlbHdRSP_Enabled = 0 ;
      edtAlbHdRSM_Jsonclick = "" ;
      edtAlbHdRSM_Backcolor = (int)(0xFFFFFF) ;
      edtAlbHdRSM_Enabled = 0 ;
      edtAlbHdRSK_Jsonclick = "" ;
      edtAlbHdRSK_Backcolor = (int)(0xFFFFFF) ;
      edtAlbHdRSK_Enabled = 0 ;
      edtBarUniMed_Jsonclick = "" ;
      edtBarUniMed_Backcolor = (int)(0xFFFFFF) ;
      edtBarUniMed_Enabled = 0 ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbPie_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbPie_Enabled = 1 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbMtrE_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarAlbKgmE_Backcolor = (int)(0xFFFFFF) ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNumCli_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Backcolor = (int)(0xFFFFFF) ;
      edtBarNomCli_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtBarTipCol_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNum_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Backcolor = (int)(0xFFFFFF) ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Backcolor = (int)(0xFFFFFF) ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtBarSer_Enabled = 0 ;
      edtBarAcaQui_Jsonclick = "" ;
      edtBarAcaQui_Backcolor = (int)(0xFFFFFF) ;
      edtBarAcaQui_Enabled = 0 ;
      edtEmpNumDec_Jsonclick = "" ;
      edtEmpNumDec_Backcolor = (int)(0xFFFFFF) ;
      edtEmpNumDec_Enabled = 0 ;
      edtAlbHdRUl_Jsonclick = "" ;
      edtAlbHdRUl_Backcolor = (int)(0xFFFFFF) ;
      edtAlbHdRUl_Enabled = 1 ;
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
      subsflControlProps_130946( ) ;
      while ( nGXsfl_130_idx <= nRC_GXsfl_130 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LQ946( ) ;
         standaloneModal1LQ946( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LQ946( ) ;
         nGXsfl_130_idx = (int)(nGXsfl_130_idx+1) ;
         sGXsfl_130_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_130_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_130946( ) ;
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

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      /* Using cursor T01LQ37 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A6463AlbRLote = T01LQ37_A6463AlbRLote[0] ;
      A6464AlbRTelar = T01LQ37_A6464AlbRTelar[0] ;
      A6465AlbRLu = T01LQ37_A6465AlbRLu[0] ;
      A4602AlbRMdlCod = T01LQ37_A4602AlbRMdlCod[0] ;
      pr_default.close(33);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6463AlbRLote", GXutil.rtrim( A6463AlbRLote));
      httpContext.ajax_rsp_assign_attri("", false, "A6464AlbRTelar", GXutil.rtrim( A6464AlbRTelar));
      httpContext.ajax_rsp_assign_attri("", false, "A6465AlbRLu", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e131LQ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("EXIT","{handler:'e111LQ2',iparms:[]");
      setEventMetadata("EXIT",",oparms:[]}");
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
      setEventMetadata("VALID_BARUNIMED","{handler:'valid_Barunimed',iparms:[]");
      setEventMetadata("VALID_BARUNIMED",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRLN","{handler:'valid_Albhdrln',iparms:[]");
      setEventMetadata("VALID_ALBHDRLN",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A6463AlbRLote',fld:'ALBRLOTE',pic:''},{av:'A6464AlbRTelar',fld:'ALBRTELAR',pic:''},{av:'A6465AlbRLu',fld:'ALBRLU',pic:'ZZ9.99'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''}]}");
      setEventMetadata("VALID_ALBHDRKGR","{handler:'valid_Albhdrkgr',iparms:[]");
      setEventMetadata("VALID_ALBHDRKGR",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRMTR","{handler:'valid_Albhdrmtr',iparms:[]");
      setEventMetadata("VALID_ALBHDRMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBHDRPZR","{handler:'valid_Albhdrpzr',iparms:[]");
      setEventMetadata("VALID_ALBHDRPZR",",oparms:[]}");
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
      pr_default.close(33);
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
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      O11367AlbHdRSM = DecimalUtil.ZERO ;
      O6628AlbHdRSK = DecimalUtil.ZERO ;
      Z6623AlbHdRKgi = DecimalUtil.ZERO ;
      Z11365AlbHdRMti = DecimalUtil.ZERO ;
      Z6625AlbHdRKgR = DecimalUtil.ZERO ;
      Z11366AlbHdRMtR = DecimalUtil.ZERO ;
      O11366AlbHdRMtR = DecimalUtil.ZERO ;
      O6625AlbHdRKgR = DecimalUtil.ZERO ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A118BarAcaQui = "" ;
      lblTextblock9_Jsonclick = "" ;
      A212BarSer = "" ;
      lblTextblock10_Jsonclick = "" ;
      A1652BarSerDsc = "" ;
      lblTextblock11_Jsonclick = "" ;
      A135BarColNom = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A1234BarNomCli = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      lblTextblock17_Jsonclick = "" ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A228BarUniMed = "" ;
      lblTextblock20_Jsonclick = "" ;
      A6628AlbHdRSK = DecimalUtil.ZERO ;
      lblTextblock21_Jsonclick = "" ;
      A11367AlbHdRSM = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B11367AlbHdRSM = DecimalUtil.ZERO ;
      B6628AlbHdRSK = DecimalUtil.ZERO ;
      sMode946 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV37Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode195 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      s11367AlbHdRSM = DecimalUtil.ZERO ;
      s6628AlbHdRSK = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6623AlbHdRKgi = DecimalUtil.ZERO ;
      A11365AlbHdRMti = DecimalUtil.ZERO ;
      A6625AlbHdRKgR = DecimalUtil.ZERO ;
      A11366AlbHdRMtR = DecimalUtil.ZERO ;
      T11366AlbHdRMtR = DecimalUtil.ZERO ;
      T6625AlbHdRKgR = DecimalUtil.ZERO ;
      AV17Lit0 = "" ;
      AV19LitFe = "" ;
      AV36Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit4 = "" ;
      AV24Lit5 = "" ;
      AV25Lit6 = "" ;
      AV26Lit7 = "" ;
      AV27Lit8 = "" ;
      AV28Lit9 = "" ;
      AV29Lit10 = "" ;
      AV30Lit11 = "" ;
      AV31Lit12 = "" ;
      AV32Lit13 = "" ;
      GXt_char1 = "" ;
      AV33Station = "" ;
      AV20EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV21EmprNom = "" ;
      AV18UsurCod = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new long[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      Z118BarAcaQui = "" ;
      Z212BarSer = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z1234BarNomCli = "" ;
      Z228BarUniMed = "" ;
      Z6628AlbHdRSK = DecimalUtil.ZERO ;
      Z11367AlbHdRSM = DecimalUtil.ZERO ;
      T01LQ7_A3915EmpNumDec = new byte[1] ;
      T01LQ7_n3915EmpNumDec = new boolean[] {false} ;
      T01LQ9_A396EmprCod = new String[] {""} ;
      T01LQ8_A118BarAcaQui = new String[] {""} ;
      T01LQ8_A212BarSer = new String[] {""} ;
      T01LQ8_A1652BarSerDsc = new String[] {""} ;
      T01LQ8_A135BarColNom = new String[] {""} ;
      T01LQ8_A136BarColNum = new int[1] ;
      T01LQ8_A218BarTipCol = new byte[1] ;
      T01LQ8_A1234BarNomCli = new String[] {""} ;
      T01LQ8_A1235BarNumCli = new int[1] ;
      T01LQ8_A228BarUniMed = new String[] {""} ;
      T01LQ11_A6628AlbHdRSK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ11_A11367AlbHdRSM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ11_A6629AlbHdRSP = new int[1] ;
      T01LQ13_A6621AlbHdRUl = new short[1] ;
      T01LQ13_n6621AlbHdRUl = new boolean[] {false} ;
      T01LQ13_A3915EmpNumDec = new byte[1] ;
      T01LQ13_n3915EmpNumDec = new boolean[] {false} ;
      T01LQ13_A118BarAcaQui = new String[] {""} ;
      T01LQ13_A212BarSer = new String[] {""} ;
      T01LQ13_A1652BarSerDsc = new String[] {""} ;
      T01LQ13_A135BarColNom = new String[] {""} ;
      T01LQ13_A136BarColNum = new int[1] ;
      T01LQ13_A218BarTipCol = new byte[1] ;
      T01LQ13_A1234BarNomCli = new String[] {""} ;
      T01LQ13_A1235BarNumCli = new int[1] ;
      T01LQ13_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ13_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ13_A1265BarAlbPie = new int[1] ;
      T01LQ13_A228BarUniMed = new String[] {""} ;
      T01LQ13_A396EmprCod = new String[] {""} ;
      T01LQ13_A129BarCod = new int[1] ;
      T01LQ13_A132BarCodReo = new byte[1] ;
      T01LQ13_A130BarCodPar = new String[] {""} ;
      T01LQ13_A30AlbProCod = new long[1] ;
      T01LQ13_A6628AlbHdRSK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ13_A11367AlbHdRSM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ13_A6629AlbHdRSP = new int[1] ;
      T01LQ14_A396EmprCod = new String[] {""} ;
      T01LQ14_A30AlbProCod = new long[1] ;
      T01LQ14_A129BarCod = new int[1] ;
      T01LQ14_A132BarCodReo = new byte[1] ;
      T01LQ14_A130BarCodPar = new String[] {""} ;
      T01LQ6_A6621AlbHdRUl = new short[1] ;
      T01LQ6_n6621AlbHdRUl = new boolean[] {false} ;
      T01LQ6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ6_A1265BarAlbPie = new int[1] ;
      T01LQ6_A396EmprCod = new String[] {""} ;
      T01LQ6_A129BarCod = new int[1] ;
      T01LQ6_A132BarCodReo = new byte[1] ;
      T01LQ6_A130BarCodPar = new String[] {""} ;
      T01LQ6_A30AlbProCod = new long[1] ;
      T01LQ15_A396EmprCod = new String[] {""} ;
      T01LQ15_A30AlbProCod = new long[1] ;
      T01LQ15_A129BarCod = new int[1] ;
      T01LQ15_A132BarCodReo = new byte[1] ;
      T01LQ15_A130BarCodPar = new String[] {""} ;
      T01LQ16_A396EmprCod = new String[] {""} ;
      T01LQ16_A30AlbProCod = new long[1] ;
      T01LQ16_A129BarCod = new int[1] ;
      T01LQ16_A132BarCodReo = new byte[1] ;
      T01LQ16_A130BarCodPar = new String[] {""} ;
      T01LQ5_A6621AlbHdRUl = new short[1] ;
      T01LQ5_n6621AlbHdRUl = new boolean[] {false} ;
      T01LQ5_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ5_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ5_A1265BarAlbPie = new int[1] ;
      T01LQ5_A396EmprCod = new String[] {""} ;
      T01LQ5_A129BarCod = new int[1] ;
      T01LQ5_A132BarCodReo = new byte[1] ;
      T01LQ5_A130BarCodPar = new String[] {""} ;
      T01LQ5_A30AlbProCod = new long[1] ;
      T01LQ20_A396EmprCod = new String[] {""} ;
      T01LQ20_A30AlbProCod = new long[1] ;
      T01LQ20_A129BarCod = new int[1] ;
      T01LQ20_A132BarCodReo = new byte[1] ;
      T01LQ20_A130BarCodPar = new String[] {""} ;
      T01LQ20_A6648AlbMetLin = new short[1] ;
      T01LQ21_A396EmprCod = new String[] {""} ;
      T01LQ21_A30AlbProCod = new long[1] ;
      T01LQ21_A129BarCod = new int[1] ;
      T01LQ21_A132BarCodReo = new byte[1] ;
      T01LQ21_A130BarCodPar = new String[] {""} ;
      T01LQ21_A9639Et_Numero = new short[1] ;
      T01LQ22_A396EmprCod = new String[] {""} ;
      T01LQ22_A30AlbProCod = new long[1] ;
      T01LQ22_A129BarCod = new int[1] ;
      T01LQ22_A132BarCodReo = new byte[1] ;
      T01LQ22_A130BarCodPar = new String[] {""} ;
      T01LQ22_A5456P_ForLin = new short[1] ;
      T01LQ23_A396EmprCod = new String[] {""} ;
      T01LQ23_A30AlbProCod = new long[1] ;
      T01LQ23_A129BarCod = new int[1] ;
      T01LQ23_A132BarCodReo = new byte[1] ;
      T01LQ23_A130BarCodPar = new String[] {""} ;
      T01LQ23_A2524DisComLin = new byte[1] ;
      T01LQ23_A1056DisComCod = new String[] {""} ;
      T01LQ23_A1032FonCod = new String[] {""} ;
      T01LQ24_A396EmprCod = new String[] {""} ;
      T01LQ24_A3617AlbTrnCod = new long[1] ;
      T01LQ24_A30AlbProCod = new long[1] ;
      T01LQ24_A129BarCod = new int[1] ;
      T01LQ24_A132BarCodReo = new byte[1] ;
      T01LQ24_A130BarCodPar = new String[] {""} ;
      T01LQ25_A396EmprCod = new String[] {""} ;
      T01LQ25_A30AlbProCod = new long[1] ;
      T01LQ25_A129BarCod = new int[1] ;
      T01LQ25_A132BarCodReo = new byte[1] ;
      T01LQ25_A130BarCodPar = new String[] {""} ;
      T01LQ25_A3621AlbPckLin = new short[1] ;
      T01LQ26_A396EmprCod = new String[] {""} ;
      T01LQ26_A30AlbProCod = new long[1] ;
      T01LQ26_A129BarCod = new int[1] ;
      T01LQ26_A132BarCodReo = new byte[1] ;
      T01LQ26_A130BarCodPar = new String[] {""} ;
      T01LQ26_A2764AlbHdrLin = new short[1] ;
      T01LQ27_A396EmprCod = new String[] {""} ;
      T01LQ27_A30AlbProCod = new long[1] ;
      T01LQ27_A129BarCod = new int[1] ;
      T01LQ27_A132BarCodReo = new byte[1] ;
      T01LQ27_A130BarCodPar = new String[] {""} ;
      T01LQ27_A1468AlbPrdLin = new short[1] ;
      T01LQ28_A396EmprCod = new String[] {""} ;
      T01LQ28_A30AlbProCod = new long[1] ;
      T01LQ28_A129BarCod = new int[1] ;
      T01LQ28_A132BarCodReo = new byte[1] ;
      T01LQ28_A130BarCodPar = new String[] {""} ;
      T01LQ28_A200BarPieCod = new String[] {""} ;
      T01LQ29_A396EmprCod = new String[] {""} ;
      T01LQ29_A30AlbProCod = new long[1] ;
      T01LQ29_A129BarCod = new int[1] ;
      T01LQ29_A132BarCodReo = new byte[1] ;
      T01LQ29_A130BarCodPar = new String[] {""} ;
      T01LQ29_A1240GuiFasLin = new short[1] ;
      T01LQ30_A396EmprCod = new String[] {""} ;
      T01LQ30_A30AlbProCod = new long[1] ;
      T01LQ30_A129BarCod = new int[1] ;
      T01LQ30_A132BarCodReo = new byte[1] ;
      T01LQ30_A130BarCodPar = new String[] {""} ;
      Z6463AlbRLote = "" ;
      Z6464AlbRTelar = "" ;
      Z6465AlbRLu = DecimalUtil.ZERO ;
      Z4602AlbRMdlCod = "" ;
      T01LQ31_A30AlbProCod = new long[1] ;
      T01LQ31_A6622AlbHdRLn = new short[1] ;
      T01LQ31_A6463AlbRLote = new String[] {""} ;
      T01LQ31_A6464AlbRTelar = new String[] {""} ;
      T01LQ31_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ31_A4602AlbRMdlCod = new String[] {""} ;
      T01LQ31_A6623AlbHdRKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ31_n6623AlbHdRKgi = new boolean[] {false} ;
      T01LQ31_A11365AlbHdRMti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ31_n11365AlbHdRMti = new boolean[] {false} ;
      T01LQ31_A6624AlbHdRPzi = new short[1] ;
      T01LQ31_n6624AlbHdRPzi = new boolean[] {false} ;
      T01LQ31_A6625AlbHdRKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ31_n6625AlbHdRKgR = new boolean[] {false} ;
      T01LQ31_A11366AlbHdRMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ31_n11366AlbHdRMtR = new boolean[] {false} ;
      T01LQ31_A6626AlbHdRPzR = new short[1] ;
      T01LQ31_n6626AlbHdRPzR = new boolean[] {false} ;
      T01LQ31_A396EmprCod = new String[] {""} ;
      T01LQ31_A44AlbRecCod = new int[1] ;
      T01LQ31_n44AlbRecCod = new boolean[] {false} ;
      T01LQ31_A129BarCod = new int[1] ;
      T01LQ31_A132BarCodReo = new byte[1] ;
      T01LQ31_A130BarCodPar = new String[] {""} ;
      T01LQ4_A6463AlbRLote = new String[] {""} ;
      T01LQ4_A6464AlbRTelar = new String[] {""} ;
      T01LQ4_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ4_A4602AlbRMdlCod = new String[] {""} ;
      T01LQ32_A6463AlbRLote = new String[] {""} ;
      T01LQ32_A6464AlbRTelar = new String[] {""} ;
      T01LQ32_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ32_A4602AlbRMdlCod = new String[] {""} ;
      T01LQ33_A396EmprCod = new String[] {""} ;
      T01LQ33_A30AlbProCod = new long[1] ;
      T01LQ33_A129BarCod = new int[1] ;
      T01LQ33_A132BarCodReo = new byte[1] ;
      T01LQ33_A130BarCodPar = new String[] {""} ;
      T01LQ33_A6622AlbHdRLn = new short[1] ;
      T01LQ3_A30AlbProCod = new long[1] ;
      T01LQ3_A6622AlbHdRLn = new short[1] ;
      T01LQ3_A6623AlbHdRKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ3_n6623AlbHdRKgi = new boolean[] {false} ;
      T01LQ3_A11365AlbHdRMti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ3_n11365AlbHdRMti = new boolean[] {false} ;
      T01LQ3_A6624AlbHdRPzi = new short[1] ;
      T01LQ3_n6624AlbHdRPzi = new boolean[] {false} ;
      T01LQ3_A6625AlbHdRKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ3_n6625AlbHdRKgR = new boolean[] {false} ;
      T01LQ3_A11366AlbHdRMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ3_n11366AlbHdRMtR = new boolean[] {false} ;
      T01LQ3_A6626AlbHdRPzR = new short[1] ;
      T01LQ3_n6626AlbHdRPzR = new boolean[] {false} ;
      T01LQ3_A396EmprCod = new String[] {""} ;
      T01LQ3_A44AlbRecCod = new int[1] ;
      T01LQ3_n44AlbRecCod = new boolean[] {false} ;
      T01LQ3_A129BarCod = new int[1] ;
      T01LQ3_A132BarCodReo = new byte[1] ;
      T01LQ3_A130BarCodPar = new String[] {""} ;
      T01LQ2_A30AlbProCod = new long[1] ;
      T01LQ2_A6622AlbHdRLn = new short[1] ;
      T01LQ2_A6623AlbHdRKgi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ2_n6623AlbHdRKgi = new boolean[] {false} ;
      T01LQ2_A11365AlbHdRMti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ2_n11365AlbHdRMti = new boolean[] {false} ;
      T01LQ2_A6624AlbHdRPzi = new short[1] ;
      T01LQ2_n6624AlbHdRPzi = new boolean[] {false} ;
      T01LQ2_A6625AlbHdRKgR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ2_n6625AlbHdRKgR = new boolean[] {false} ;
      T01LQ2_A11366AlbHdRMtR = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ2_n11366AlbHdRMtR = new boolean[] {false} ;
      T01LQ2_A6626AlbHdRPzR = new short[1] ;
      T01LQ2_n6626AlbHdRPzR = new boolean[] {false} ;
      T01LQ2_A396EmprCod = new String[] {""} ;
      T01LQ2_A44AlbRecCod = new int[1] ;
      T01LQ2_n44AlbRecCod = new boolean[] {false} ;
      T01LQ2_A129BarCod = new int[1] ;
      T01LQ2_A132BarCodReo = new byte[1] ;
      T01LQ2_A130BarCodPar = new String[] {""} ;
      T01LQ37_A6463AlbRLote = new String[] {""} ;
      T01LQ37_A6464AlbRTelar = new String[] {""} ;
      T01LQ37_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LQ37_A4602AlbRMdlCod = new String[] {""} ;
      T01LQ38_A396EmprCod = new String[] {""} ;
      T01LQ38_A30AlbProCod = new long[1] ;
      T01LQ38_A129BarCod = new int[1] ;
      T01LQ38_A132BarCodReo = new byte[1] ;
      T01LQ38_A130BarCodPar = new String[] {""} ;
      T01LQ38_A6622AlbHdRLn = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmodealbrep__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmodealbrep__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmodealbrep__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmodealbrep__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmodealbrep__default(),
         new Object[] {
             new Object[] {
            T01LQ2_A30AlbProCod, T01LQ2_A6622AlbHdRLn, T01LQ2_A6623AlbHdRKgi, T01LQ2_n6623AlbHdRKgi, T01LQ2_A11365AlbHdRMti, T01LQ2_n11365AlbHdRMti, T01LQ2_A6624AlbHdRPzi, T01LQ2_n6624AlbHdRPzi, T01LQ2_A6625AlbHdRKgR, T01LQ2_n6625AlbHdRKgR,
            T01LQ2_A11366AlbHdRMtR, T01LQ2_n11366AlbHdRMtR, T01LQ2_A6626AlbHdRPzR, T01LQ2_n6626AlbHdRPzR, T01LQ2_A396EmprCod, T01LQ2_A44AlbRecCod, T01LQ2_n44AlbRecCod, T01LQ2_A129BarCod, T01LQ2_A132BarCodReo, T01LQ2_A130BarCodPar
            }
            , new Object[] {
            T01LQ3_A30AlbProCod, T01LQ3_A6622AlbHdRLn, T01LQ3_A6623AlbHdRKgi, T01LQ3_n6623AlbHdRKgi, T01LQ3_A11365AlbHdRMti, T01LQ3_n11365AlbHdRMti, T01LQ3_A6624AlbHdRPzi, T01LQ3_n6624AlbHdRPzi, T01LQ3_A6625AlbHdRKgR, T01LQ3_n6625AlbHdRKgR,
            T01LQ3_A11366AlbHdRMtR, T01LQ3_n11366AlbHdRMtR, T01LQ3_A6626AlbHdRPzR, T01LQ3_n6626AlbHdRPzR, T01LQ3_A396EmprCod, T01LQ3_A44AlbRecCod, T01LQ3_n44AlbRecCod, T01LQ3_A129BarCod, T01LQ3_A132BarCodReo, T01LQ3_A130BarCodPar
            }
            , new Object[] {
            T01LQ4_A6463AlbRLote, T01LQ4_A6464AlbRTelar, T01LQ4_A6465AlbRLu, T01LQ4_A4602AlbRMdlCod
            }
            , new Object[] {
            T01LQ5_A6621AlbHdRUl, T01LQ5_n6621AlbHdRUl, T01LQ5_A1261BarAlbKgmE, T01LQ5_A1263BarAlbMtrE, T01LQ5_A1265BarAlbPie, T01LQ5_A396EmprCod, T01LQ5_A129BarCod, T01LQ5_A132BarCodReo, T01LQ5_A130BarCodPar, T01LQ5_A30AlbProCod
            }
            , new Object[] {
            T01LQ6_A6621AlbHdRUl, T01LQ6_n6621AlbHdRUl, T01LQ6_A1261BarAlbKgmE, T01LQ6_A1263BarAlbMtrE, T01LQ6_A1265BarAlbPie, T01LQ6_A396EmprCod, T01LQ6_A129BarCod, T01LQ6_A132BarCodReo, T01LQ6_A130BarCodPar, T01LQ6_A30AlbProCod
            }
            , new Object[] {
            T01LQ7_A3915EmpNumDec, T01LQ7_n3915EmpNumDec
            }
            , new Object[] {
            T01LQ8_A118BarAcaQui, T01LQ8_A212BarSer, T01LQ8_A1652BarSerDsc, T01LQ8_A135BarColNom, T01LQ8_A136BarColNum, T01LQ8_A218BarTipCol, T01LQ8_A1234BarNomCli, T01LQ8_A1235BarNumCli, T01LQ8_A228BarUniMed
            }
            , new Object[] {
            T01LQ9_A396EmprCod
            }
            , new Object[] {
            T01LQ11_A6628AlbHdRSK, T01LQ11_A11367AlbHdRSM, T01LQ11_A6629AlbHdRSP
            }
            , new Object[] {
            T01LQ13_A6621AlbHdRUl, T01LQ13_n6621AlbHdRUl, T01LQ13_A3915EmpNumDec, T01LQ13_n3915EmpNumDec, T01LQ13_A118BarAcaQui, T01LQ13_A212BarSer, T01LQ13_A1652BarSerDsc, T01LQ13_A135BarColNom, T01LQ13_A136BarColNum, T01LQ13_A218BarTipCol,
            T01LQ13_A1234BarNomCli, T01LQ13_A1235BarNumCli, T01LQ13_A1261BarAlbKgmE, T01LQ13_A1263BarAlbMtrE, T01LQ13_A1265BarAlbPie, T01LQ13_A228BarUniMed, T01LQ13_A396EmprCod, T01LQ13_A129BarCod, T01LQ13_A132BarCodReo, T01LQ13_A130BarCodPar,
            T01LQ13_A30AlbProCod, T01LQ13_A6628AlbHdRSK, T01LQ13_A11367AlbHdRSM, T01LQ13_A6629AlbHdRSP
            }
            , new Object[] {
            T01LQ14_A396EmprCod, T01LQ14_A30AlbProCod, T01LQ14_A129BarCod, T01LQ14_A132BarCodReo, T01LQ14_A130BarCodPar
            }
            , new Object[] {
            T01LQ15_A396EmprCod, T01LQ15_A30AlbProCod, T01LQ15_A129BarCod, T01LQ15_A132BarCodReo, T01LQ15_A130BarCodPar
            }
            , new Object[] {
            T01LQ16_A396EmprCod, T01LQ16_A30AlbProCod, T01LQ16_A129BarCod, T01LQ16_A132BarCodReo, T01LQ16_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LQ20_A396EmprCod, T01LQ20_A30AlbProCod, T01LQ20_A129BarCod, T01LQ20_A132BarCodReo, T01LQ20_A130BarCodPar, T01LQ20_A6648AlbMetLin
            }
            , new Object[] {
            T01LQ21_A396EmprCod, T01LQ21_A30AlbProCod, T01LQ21_A129BarCod, T01LQ21_A132BarCodReo, T01LQ21_A130BarCodPar, T01LQ21_A9639Et_Numero
            }
            , new Object[] {
            T01LQ22_A396EmprCod, T01LQ22_A30AlbProCod, T01LQ22_A129BarCod, T01LQ22_A132BarCodReo, T01LQ22_A130BarCodPar, T01LQ22_A5456P_ForLin
            }
            , new Object[] {
            T01LQ23_A396EmprCod, T01LQ23_A30AlbProCod, T01LQ23_A129BarCod, T01LQ23_A132BarCodReo, T01LQ23_A130BarCodPar, T01LQ23_A2524DisComLin, T01LQ23_A1056DisComCod, T01LQ23_A1032FonCod
            }
            , new Object[] {
            T01LQ24_A396EmprCod, T01LQ24_A3617AlbTrnCod, T01LQ24_A30AlbProCod, T01LQ24_A129BarCod, T01LQ24_A132BarCodReo, T01LQ24_A130BarCodPar
            }
            , new Object[] {
            T01LQ25_A396EmprCod, T01LQ25_A30AlbProCod, T01LQ25_A129BarCod, T01LQ25_A132BarCodReo, T01LQ25_A130BarCodPar, T01LQ25_A3621AlbPckLin
            }
            , new Object[] {
            T01LQ26_A396EmprCod, T01LQ26_A30AlbProCod, T01LQ26_A129BarCod, T01LQ26_A132BarCodReo, T01LQ26_A130BarCodPar, T01LQ26_A2764AlbHdrLin
            }
            , new Object[] {
            T01LQ27_A396EmprCod, T01LQ27_A30AlbProCod, T01LQ27_A129BarCod, T01LQ27_A132BarCodReo, T01LQ27_A130BarCodPar, T01LQ27_A1468AlbPrdLin
            }
            , new Object[] {
            T01LQ28_A396EmprCod, T01LQ28_A30AlbProCod, T01LQ28_A129BarCod, T01LQ28_A132BarCodReo, T01LQ28_A130BarCodPar, T01LQ28_A200BarPieCod
            }
            , new Object[] {
            T01LQ29_A396EmprCod, T01LQ29_A30AlbProCod, T01LQ29_A129BarCod, T01LQ29_A132BarCodReo, T01LQ29_A130BarCodPar, T01LQ29_A1240GuiFasLin
            }
            , new Object[] {
            T01LQ30_A396EmprCod, T01LQ30_A30AlbProCod, T01LQ30_A129BarCod, T01LQ30_A132BarCodReo, T01LQ30_A130BarCodPar
            }
            , new Object[] {
            T01LQ31_A30AlbProCod, T01LQ31_A6622AlbHdRLn, T01LQ31_A6463AlbRLote, T01LQ31_A6464AlbRTelar, T01LQ31_A6465AlbRLu, T01LQ31_A4602AlbRMdlCod, T01LQ31_A6623AlbHdRKgi, T01LQ31_n6623AlbHdRKgi, T01LQ31_A11365AlbHdRMti, T01LQ31_n11365AlbHdRMti,
            T01LQ31_A6624AlbHdRPzi, T01LQ31_n6624AlbHdRPzi, T01LQ31_A6625AlbHdRKgR, T01LQ31_n6625AlbHdRKgR, T01LQ31_A11366AlbHdRMtR, T01LQ31_n11366AlbHdRMtR, T01LQ31_A6626AlbHdRPzR, T01LQ31_n6626AlbHdRPzR, T01LQ31_A396EmprCod, T01LQ31_A44AlbRecCod,
            T01LQ31_n44AlbRecCod, T01LQ31_A129BarCod, T01LQ31_A132BarCodReo, T01LQ31_A130BarCodPar
            }
            , new Object[] {
            T01LQ32_A6463AlbRLote, T01LQ32_A6464AlbRTelar, T01LQ32_A6465AlbRLu, T01LQ32_A4602AlbRMdlCod
            }
            , new Object[] {
            T01LQ33_A396EmprCod, T01LQ33_A30AlbProCod, T01LQ33_A129BarCod, T01LQ33_A132BarCodReo, T01LQ33_A130BarCodPar, T01LQ33_A6622AlbHdRLn
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LQ37_A6463AlbRLote, T01LQ37_A6464AlbRTelar, T01LQ37_A6465AlbRLu, T01LQ37_A4602AlbRMdlCod
            }
            , new Object[] {
            T01LQ38_A396EmprCod, T01LQ38_A30AlbProCod, T01LQ38_A129BarCod, T01LQ38_A132BarCodReo, T01LQ38_A130BarCodPar, T01LQ38_A6622AlbHdRLn
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
      AV37Pgmname = "TModeALBREP" ;
   }

   private byte wcpOA132BarCodReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A3915EmpNumDec ;
   private byte A218BarTipCol ;
   private byte GXv_int7[] ;
   private byte Z3915EmpNumDec ;
   private byte Z218BarTipCol ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z6621AlbHdRUl ;
   private short Z6622AlbHdRLn ;
   private short Z6624AlbHdRPzi ;
   private short Z6626AlbHdRPzR ;
   private short O6626AlbHdRPzR ;
   private short nRcdDeleted_946 ;
   private short nRcdExists_946 ;
   private short nIsMod_946 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6621AlbHdRUl ;
   private short nBlankRcdCount946 ;
   private short RcdFound946 ;
   private short nBlankRcdUsr946 ;
   private short RcdFound195 ;
   private short A6622AlbHdRLn ;
   private short A6624AlbHdRPzi ;
   private short A6626AlbHdRPzR ;
   private short T6626AlbHdRPzR ;
   private short nIsDirty_195 ;
   private short nIsDirty_946 ;
   private int wcpOA129BarCod ;
   private int Z129BarCod ;
   private int Z1265BarAlbPie ;
   private int O6629AlbHdRSP ;
   private int nRC_GXsfl_130 ;
   private int nGXsfl_130_idx=1 ;
   private int Z44AlbRecCod ;
   private int A44AlbRecCod ;
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
   private int edtAlbHdRUl_Enabled ;
   private int edtEmpNumDec_Enabled ;
   private int edtBarAcaQui_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int A1235BarNumCli ;
   private int edtBarNumCli_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int A1265BarAlbPie ;
   private int edtBarAlbPie_Enabled ;
   private int edtBarUniMed_Enabled ;
   private int edtAlbHdRSK_Enabled ;
   private int edtAlbHdRSM_Enabled ;
   private int A6629AlbHdRSP ;
   private int edtAlbHdRSP_Enabled ;
   private int B6629AlbHdRSP ;
   private int edtavnRcdDeleted_946_Enabled ;
   private int edtAlbHdRLn_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRLote_Enabled ;
   private int edtAlbRTelar_Enabled ;
   private int edtAlbRLu_Enabled ;
   private int edtAlbRMdlCod_Enabled ;
   private int edtAlbHdRKgi_Enabled ;
   private int edtAlbHdRMti_Enabled ;
   private int edtAlbHdRPzi_Enabled ;
   private int edtAlbHdRKgR_Enabled ;
   private int edtAlbHdRMtR_Enabled ;
   private int edtAlbHdRPzR_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s6629AlbHdRSP ;
   private int GXv_int6[] ;
   private int GX_JID ;
   private int Z136BarColNum ;
   private int Z1235BarNumCli ;
   private int Z6629AlbHdRSP ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlbHdRPzi_Enabled ;
   private int defedtAlbHdRMti_Enabled ;
   private int defedtAlbHdRKgi_Enabled ;
   private int defedtAlbHdRLn_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAlbHdRSP_Backcolor ;
   private int edtAlbHdRSM_Backcolor ;
   private int edtAlbHdRSK_Backcolor ;
   private int edtBarUniMed_Backcolor ;
   private int edtBarAlbPie_Backcolor ;
   private int edtBarAlbMtrE_Backcolor ;
   private int edtBarAlbKgmE_Backcolor ;
   private int edtBarNumCli_Backcolor ;
   private int edtBarNomCli_Backcolor ;
   private int edtBarTipCol_Backcolor ;
   private int edtBarColNum_Backcolor ;
   private int edtBarColNom_Backcolor ;
   private int edtBarSerDsc_Backcolor ;
   private int edtBarSer_Backcolor ;
   private int edtBarAcaQui_Backcolor ;
   private int edtEmpNumDec_Backcolor ;
   private int edtAlbHdRUl_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long wcpOA30AlbProCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GXv_int5[] ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal O11367AlbHdRSM ;
   private java.math.BigDecimal O6628AlbHdRSK ;
   private java.math.BigDecimal Z6623AlbHdRKgi ;
   private java.math.BigDecimal Z11365AlbHdRMti ;
   private java.math.BigDecimal Z6625AlbHdRKgR ;
   private java.math.BigDecimal Z11366AlbHdRMtR ;
   private java.math.BigDecimal O11366AlbHdRMtR ;
   private java.math.BigDecimal O6625AlbHdRKgR ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A6628AlbHdRSK ;
   private java.math.BigDecimal A11367AlbHdRSM ;
   private java.math.BigDecimal B11367AlbHdRSM ;
   private java.math.BigDecimal B6628AlbHdRSK ;
   private java.math.BigDecimal s11367AlbHdRSM ;
   private java.math.BigDecimal s6628AlbHdRSK ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6623AlbHdRKgi ;
   private java.math.BigDecimal A11365AlbHdRMti ;
   private java.math.BigDecimal A6625AlbHdRKgR ;
   private java.math.BigDecimal A11366AlbHdRMtR ;
   private java.math.BigDecimal T11366AlbHdRMtR ;
   private java.math.BigDecimal T6625AlbHdRKgR ;
   private java.math.BigDecimal Z6628AlbHdRSK ;
   private java.math.BigDecimal Z11367AlbHdRSM ;
   private java.math.BigDecimal Z6465AlbRLu ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOGx_mode ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbHdRUl_Internalname ;
   private String sGXsfl_130_idx="0001" ;
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
   private String edtAlbHdRUl_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmpNumDec_Internalname ;
   private String edtEmpNumDec_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarAcaQui_Internalname ;
   private String A118BarAcaQui ;
   private String edtBarAcaQui_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNumCli_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarAlbPie_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtBarUniMed_Internalname ;
   private String A228BarUniMed ;
   private String edtBarUniMed_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtAlbHdRSK_Internalname ;
   private String edtAlbHdRSK_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtAlbHdRSM_Internalname ;
   private String edtAlbHdRSM_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtAlbHdRSP_Internalname ;
   private String edtAlbHdRSP_Jsonclick ;
   private String sMode946 ;
   private String edtavnRcdDeleted_946_Internalname ;
   private String edtAlbHdRLn_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRLote_Internalname ;
   private String edtAlbRTelar_Internalname ;
   private String edtAlbRLu_Internalname ;
   private String edtAlbRMdlCod_Internalname ;
   private String edtAlbHdRKgi_Internalname ;
   private String edtAlbHdRMti_Internalname ;
   private String edtAlbHdRPzi_Internalname ;
   private String edtAlbHdRKgR_Internalname ;
   private String edtAlbHdRMtR_Internalname ;
   private String edtAlbHdRPzR_Internalname ;
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
   private String AV37Pgmname ;
   private String hsh ;
   private String sMode195 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A6463AlbRLote ;
   private String A6464AlbRTelar ;
   private String A4602AlbRMdlCod ;
   private String AV17Lit0 ;
   private String AV19LitFe ;
   private String AV36Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit4 ;
   private String AV24Lit5 ;
   private String AV25Lit6 ;
   private String AV26Lit7 ;
   private String AV27Lit8 ;
   private String AV28Lit9 ;
   private String AV29Lit10 ;
   private String AV30Lit11 ;
   private String AV31Lit12 ;
   private String AV32Lit13 ;
   private String GXt_char1 ;
   private String AV33Station ;
   private String AV20EmprCod ;
   private String GXv_char2[] ;
   private String AV21EmprNom ;
   private String AV18UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z118BarAcaQui ;
   private String Z212BarSer ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z1234BarNomCli ;
   private String Z228BarUniMed ;
   private String Z6463AlbRLote ;
   private String Z6464AlbRTelar ;
   private String Z4602AlbRMdlCod ;
   private String sGXsfl_130_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_946_Jsonclick ;
   private String edtAlbHdRLn_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRTelar_Jsonclick ;
   private String edtAlbRLu_Jsonclick ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String edtAlbHdRKgi_Jsonclick ;
   private String edtAlbHdRMti_Jsonclick ;
   private String edtAlbHdRPzi_Jsonclick ;
   private String edtAlbHdRKgR_Jsonclick ;
   private String edtAlbHdRMtR_Jsonclick ;
   private String edtAlbHdRPzR_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean wbErr ;
   private boolean bGXsfl_130_Refreshing=false ;
   private boolean n6621AlbHdRUl ;
   private boolean n3915EmpNumDec ;
   private boolean returnInSub ;
   private boolean n6623AlbHdRKgi ;
   private boolean n11365AlbHdRMti ;
   private boolean n6624AlbHdRPzi ;
   private boolean n6625AlbHdRKgR ;
   private boolean n11366AlbHdRMtR ;
   private boolean n6626AlbHdRPzR ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] T01LQ7_A3915EmpNumDec ;
   private boolean[] T01LQ7_n3915EmpNumDec ;
   private String[] T01LQ9_A396EmprCod ;
   private String[] T01LQ8_A118BarAcaQui ;
   private String[] T01LQ8_A212BarSer ;
   private String[] T01LQ8_A1652BarSerDsc ;
   private String[] T01LQ8_A135BarColNom ;
   private int[] T01LQ8_A136BarColNum ;
   private byte[] T01LQ8_A218BarTipCol ;
   private String[] T01LQ8_A1234BarNomCli ;
   private int[] T01LQ8_A1235BarNumCli ;
   private String[] T01LQ8_A228BarUniMed ;
   private java.math.BigDecimal[] T01LQ11_A6628AlbHdRSK ;
   private java.math.BigDecimal[] T01LQ11_A11367AlbHdRSM ;
   private int[] T01LQ11_A6629AlbHdRSP ;
   private short[] T01LQ13_A6621AlbHdRUl ;
   private boolean[] T01LQ13_n6621AlbHdRUl ;
   private byte[] T01LQ13_A3915EmpNumDec ;
   private boolean[] T01LQ13_n3915EmpNumDec ;
   private String[] T01LQ13_A118BarAcaQui ;
   private String[] T01LQ13_A212BarSer ;
   private String[] T01LQ13_A1652BarSerDsc ;
   private String[] T01LQ13_A135BarColNom ;
   private int[] T01LQ13_A136BarColNum ;
   private byte[] T01LQ13_A218BarTipCol ;
   private String[] T01LQ13_A1234BarNomCli ;
   private int[] T01LQ13_A1235BarNumCli ;
   private java.math.BigDecimal[] T01LQ13_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01LQ13_A1263BarAlbMtrE ;
   private int[] T01LQ13_A1265BarAlbPie ;
   private String[] T01LQ13_A228BarUniMed ;
   private String[] T01LQ13_A396EmprCod ;
   private int[] T01LQ13_A129BarCod ;
   private byte[] T01LQ13_A132BarCodReo ;
   private String[] T01LQ13_A130BarCodPar ;
   private long[] T01LQ13_A30AlbProCod ;
   private java.math.BigDecimal[] T01LQ13_A6628AlbHdRSK ;
   private java.math.BigDecimal[] T01LQ13_A11367AlbHdRSM ;
   private int[] T01LQ13_A6629AlbHdRSP ;
   private String[] T01LQ14_A396EmprCod ;
   private long[] T01LQ14_A30AlbProCod ;
   private int[] T01LQ14_A129BarCod ;
   private byte[] T01LQ14_A132BarCodReo ;
   private String[] T01LQ14_A130BarCodPar ;
   private short[] T01LQ6_A6621AlbHdRUl ;
   private boolean[] T01LQ6_n6621AlbHdRUl ;
   private java.math.BigDecimal[] T01LQ6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01LQ6_A1263BarAlbMtrE ;
   private int[] T01LQ6_A1265BarAlbPie ;
   private String[] T01LQ6_A396EmprCod ;
   private int[] T01LQ6_A129BarCod ;
   private byte[] T01LQ6_A132BarCodReo ;
   private String[] T01LQ6_A130BarCodPar ;
   private long[] T01LQ6_A30AlbProCod ;
   private String[] T01LQ15_A396EmprCod ;
   private long[] T01LQ15_A30AlbProCod ;
   private int[] T01LQ15_A129BarCod ;
   private byte[] T01LQ15_A132BarCodReo ;
   private String[] T01LQ15_A130BarCodPar ;
   private String[] T01LQ16_A396EmprCod ;
   private long[] T01LQ16_A30AlbProCod ;
   private int[] T01LQ16_A129BarCod ;
   private byte[] T01LQ16_A132BarCodReo ;
   private String[] T01LQ16_A130BarCodPar ;
   private short[] T01LQ5_A6621AlbHdRUl ;
   private boolean[] T01LQ5_n6621AlbHdRUl ;
   private java.math.BigDecimal[] T01LQ5_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01LQ5_A1263BarAlbMtrE ;
   private int[] T01LQ5_A1265BarAlbPie ;
   private String[] T01LQ5_A396EmprCod ;
   private int[] T01LQ5_A129BarCod ;
   private byte[] T01LQ5_A132BarCodReo ;
   private String[] T01LQ5_A130BarCodPar ;
   private long[] T01LQ5_A30AlbProCod ;
   private String[] T01LQ20_A396EmprCod ;
   private long[] T01LQ20_A30AlbProCod ;
   private int[] T01LQ20_A129BarCod ;
   private byte[] T01LQ20_A132BarCodReo ;
   private String[] T01LQ20_A130BarCodPar ;
   private short[] T01LQ20_A6648AlbMetLin ;
   private String[] T01LQ21_A396EmprCod ;
   private long[] T01LQ21_A30AlbProCod ;
   private int[] T01LQ21_A129BarCod ;
   private byte[] T01LQ21_A132BarCodReo ;
   private String[] T01LQ21_A130BarCodPar ;
   private short[] T01LQ21_A9639Et_Numero ;
   private String[] T01LQ22_A396EmprCod ;
   private long[] T01LQ22_A30AlbProCod ;
   private int[] T01LQ22_A129BarCod ;
   private byte[] T01LQ22_A132BarCodReo ;
   private String[] T01LQ22_A130BarCodPar ;
   private short[] T01LQ22_A5456P_ForLin ;
   private String[] T01LQ23_A396EmprCod ;
   private long[] T01LQ23_A30AlbProCod ;
   private int[] T01LQ23_A129BarCod ;
   private byte[] T01LQ23_A132BarCodReo ;
   private String[] T01LQ23_A130BarCodPar ;
   private byte[] T01LQ23_A2524DisComLin ;
   private String[] T01LQ23_A1056DisComCod ;
   private String[] T01LQ23_A1032FonCod ;
   private String[] T01LQ24_A396EmprCod ;
   private long[] T01LQ24_A3617AlbTrnCod ;
   private long[] T01LQ24_A30AlbProCod ;
   private int[] T01LQ24_A129BarCod ;
   private byte[] T01LQ24_A132BarCodReo ;
   private String[] T01LQ24_A130BarCodPar ;
   private String[] T01LQ25_A396EmprCod ;
   private long[] T01LQ25_A30AlbProCod ;
   private int[] T01LQ25_A129BarCod ;
   private byte[] T01LQ25_A132BarCodReo ;
   private String[] T01LQ25_A130BarCodPar ;
   private short[] T01LQ25_A3621AlbPckLin ;
   private String[] T01LQ26_A396EmprCod ;
   private long[] T01LQ26_A30AlbProCod ;
   private int[] T01LQ26_A129BarCod ;
   private byte[] T01LQ26_A132BarCodReo ;
   private String[] T01LQ26_A130BarCodPar ;
   private short[] T01LQ26_A2764AlbHdrLin ;
   private String[] T01LQ27_A396EmprCod ;
   private long[] T01LQ27_A30AlbProCod ;
   private int[] T01LQ27_A129BarCod ;
   private byte[] T01LQ27_A132BarCodReo ;
   private String[] T01LQ27_A130BarCodPar ;
   private short[] T01LQ27_A1468AlbPrdLin ;
   private String[] T01LQ28_A396EmprCod ;
   private long[] T01LQ28_A30AlbProCod ;
   private int[] T01LQ28_A129BarCod ;
   private byte[] T01LQ28_A132BarCodReo ;
   private String[] T01LQ28_A130BarCodPar ;
   private String[] T01LQ28_A200BarPieCod ;
   private String[] T01LQ29_A396EmprCod ;
   private long[] T01LQ29_A30AlbProCod ;
   private int[] T01LQ29_A129BarCod ;
   private byte[] T01LQ29_A132BarCodReo ;
   private String[] T01LQ29_A130BarCodPar ;
   private short[] T01LQ29_A1240GuiFasLin ;
   private String[] T01LQ30_A396EmprCod ;
   private long[] T01LQ30_A30AlbProCod ;
   private int[] T01LQ30_A129BarCod ;
   private byte[] T01LQ30_A132BarCodReo ;
   private String[] T01LQ30_A130BarCodPar ;
   private long[] T01LQ31_A30AlbProCod ;
   private short[] T01LQ31_A6622AlbHdRLn ;
   private String[] T01LQ31_A6463AlbRLote ;
   private String[] T01LQ31_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01LQ31_A6465AlbRLu ;
   private String[] T01LQ31_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] T01LQ31_A6623AlbHdRKgi ;
   private boolean[] T01LQ31_n6623AlbHdRKgi ;
   private java.math.BigDecimal[] T01LQ31_A11365AlbHdRMti ;
   private boolean[] T01LQ31_n11365AlbHdRMti ;
   private short[] T01LQ31_A6624AlbHdRPzi ;
   private boolean[] T01LQ31_n6624AlbHdRPzi ;
   private java.math.BigDecimal[] T01LQ31_A6625AlbHdRKgR ;
   private boolean[] T01LQ31_n6625AlbHdRKgR ;
   private java.math.BigDecimal[] T01LQ31_A11366AlbHdRMtR ;
   private boolean[] T01LQ31_n11366AlbHdRMtR ;
   private short[] T01LQ31_A6626AlbHdRPzR ;
   private boolean[] T01LQ31_n6626AlbHdRPzR ;
   private String[] T01LQ31_A396EmprCod ;
   private int[] T01LQ31_A44AlbRecCod ;
   private boolean[] T01LQ31_n44AlbRecCod ;
   private int[] T01LQ31_A129BarCod ;
   private byte[] T01LQ31_A132BarCodReo ;
   private String[] T01LQ31_A130BarCodPar ;
   private String[] T01LQ4_A6463AlbRLote ;
   private String[] T01LQ4_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01LQ4_A6465AlbRLu ;
   private String[] T01LQ4_A4602AlbRMdlCod ;
   private String[] T01LQ32_A6463AlbRLote ;
   private String[] T01LQ32_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01LQ32_A6465AlbRLu ;
   private String[] T01LQ32_A4602AlbRMdlCod ;
   private String[] T01LQ33_A396EmprCod ;
   private long[] T01LQ33_A30AlbProCod ;
   private int[] T01LQ33_A129BarCod ;
   private byte[] T01LQ33_A132BarCodReo ;
   private String[] T01LQ33_A130BarCodPar ;
   private short[] T01LQ33_A6622AlbHdRLn ;
   private long[] T01LQ3_A30AlbProCod ;
   private short[] T01LQ3_A6622AlbHdRLn ;
   private java.math.BigDecimal[] T01LQ3_A6623AlbHdRKgi ;
   private boolean[] T01LQ3_n6623AlbHdRKgi ;
   private java.math.BigDecimal[] T01LQ3_A11365AlbHdRMti ;
   private boolean[] T01LQ3_n11365AlbHdRMti ;
   private short[] T01LQ3_A6624AlbHdRPzi ;
   private boolean[] T01LQ3_n6624AlbHdRPzi ;
   private java.math.BigDecimal[] T01LQ3_A6625AlbHdRKgR ;
   private boolean[] T01LQ3_n6625AlbHdRKgR ;
   private java.math.BigDecimal[] T01LQ3_A11366AlbHdRMtR ;
   private boolean[] T01LQ3_n11366AlbHdRMtR ;
   private short[] T01LQ3_A6626AlbHdRPzR ;
   private boolean[] T01LQ3_n6626AlbHdRPzR ;
   private String[] T01LQ3_A396EmprCod ;
   private int[] T01LQ3_A44AlbRecCod ;
   private boolean[] T01LQ3_n44AlbRecCod ;
   private int[] T01LQ3_A129BarCod ;
   private byte[] T01LQ3_A132BarCodReo ;
   private String[] T01LQ3_A130BarCodPar ;
   private long[] T01LQ2_A30AlbProCod ;
   private short[] T01LQ2_A6622AlbHdRLn ;
   private java.math.BigDecimal[] T01LQ2_A6623AlbHdRKgi ;
   private boolean[] T01LQ2_n6623AlbHdRKgi ;
   private java.math.BigDecimal[] T01LQ2_A11365AlbHdRMti ;
   private boolean[] T01LQ2_n11365AlbHdRMti ;
   private short[] T01LQ2_A6624AlbHdRPzi ;
   private boolean[] T01LQ2_n6624AlbHdRPzi ;
   private java.math.BigDecimal[] T01LQ2_A6625AlbHdRKgR ;
   private boolean[] T01LQ2_n6625AlbHdRKgR ;
   private java.math.BigDecimal[] T01LQ2_A11366AlbHdRMtR ;
   private boolean[] T01LQ2_n11366AlbHdRMtR ;
   private short[] T01LQ2_A6626AlbHdRPzR ;
   private boolean[] T01LQ2_n6626AlbHdRPzR ;
   private String[] T01LQ2_A396EmprCod ;
   private int[] T01LQ2_A44AlbRecCod ;
   private boolean[] T01LQ2_n44AlbRecCod ;
   private int[] T01LQ2_A129BarCod ;
   private byte[] T01LQ2_A132BarCodReo ;
   private String[] T01LQ2_A130BarCodPar ;
   private String[] T01LQ37_A6463AlbRLote ;
   private String[] T01LQ37_A6464AlbRTelar ;
   private java.math.BigDecimal[] T01LQ37_A6465AlbRLu ;
   private String[] T01LQ37_A4602AlbRMdlCod ;
   private String[] T01LQ38_A396EmprCod ;
   private long[] T01LQ38_A30AlbProCod ;
   private int[] T01LQ38_A129BarCod ;
   private byte[] T01LQ38_A132BarCodReo ;
   private String[] T01LQ38_A130BarCodPar ;
   private short[] T01LQ38_A6622AlbHdRLn ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tmodealbrep__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodealbrep__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodealbrep__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodealbrep__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmodealbrep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LQ2", "SELECT AlbProCod, AlbHdRLn, AlbHdRKgi, AlbHdRMti, AlbHdRPzi, AlbHdRKgR, AlbHdRMtR, AlbHdRPzR, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdRLn = ?  FOR UPDATE OF AlbHdRKgi, AlbHdRMti, AlbHdRPzi, AlbHdRKgR, AlbHdRMtR, AlbHdRPzR, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LQ3", "SELECT AlbProCod, AlbHdRLn, AlbHdRKgi, AlbHdRMti, AlbHdRPzi, AlbHdRKgR, AlbHdRMtR, AlbHdRPzR, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdRLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LQ4", "SELECT AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ5", "SELECT AlbHdRUl, BarAlbKgmE, BarAlbMtrE, BarAlbPie, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbHdRUl, BarAlbKgmE, BarAlbMtrE, BarAlbPie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ6", "SELECT AlbHdRUl, BarAlbKgmE, BarAlbMtrE, BarAlbPie, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ7", "SELECT EmpNumDec FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ8", "SELECT BarAcaQui, BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli, BarUniMed FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ9", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ11", "SELECT COALESCE( T1.AlbHdRSK, 0) AS AlbHdRSK, COALESCE( T1.AlbHdRSM, 0) AS AlbHdRSM, COALESCE( T1.AlbHdRSP, 0) AS AlbHdRSP FROM (SELECT SUM(AlbHdRKgR) AS AlbHdRSK, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbHdRMtR) AS AlbHdRSM, SUM(AlbHdRPzR) AS AlbHdRSP FROM TXPALBREP GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ13", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbHdRUl, T2.EmpNumDec, T3.BarAcaQui, T3.BarSer, T3.BarSerDsc, T3.BarColNom, T3.BarColNum, T3.BarTipCol, T3.BarNomCli, T3.BarNumCli, TM1.BarAlbKgmE, TM1.BarAlbMtrE, TM1.BarAlbPie, T3.BarUniMed, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.AlbProCod, COALESCE( T4.AlbHdRSK, 0) AS AlbHdRSK, COALESCE( T4.AlbHdRSM, 0) AS AlbHdRSM, COALESCE( T4.AlbHdRSP, 0) AS AlbHdRSP FROM (((TXPALBBAR TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT SUM(AlbHdRKgR) AS AlbHdRSK, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbHdRMtR) AS AlbHdRSM, SUM(AlbHdRPzR) AS AlbHdRSP FROM TXPALBREP GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbProCod = TM1.AlbProCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LQ17", "INSERT INTO TXPALBBAR(AlbHdRUl, BarAlbKgmE, BarAlbMtrE, BarAlbPie, EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, AlbProEsp, AlbProRec, TubCod, BarAlbTub, GuiFasULin, BarPreKgm, BarPreMtr, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01LQ18", "UPDATE TXPALBBAR SET AlbHdRUl=?, BarAlbKgmE=?, BarAlbMtrE=?, BarAlbPie=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01LQ19", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01LQ20", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ21", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ22", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ23", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ24", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ25", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ26", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ27", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ28", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ29", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ30", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LQ31", "SELECT T1.AlbProCod, T1.AlbHdRLn, T2.AlbRLote, T2.AlbRTelar, T2.AlbRLu, T2.AlbRMdlCod, T1.AlbHdRKgi, T1.AlbHdRMti, T1.AlbHdRPzi, T1.AlbHdRKgR, T1.AlbHdRMtR, T1.AlbHdRPzR, T1.EmprCod, T1.AlbRecCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar FROM (TXPALBREP T1 LEFT JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.AlbHdRLn = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.AlbHdRLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LQ32", "SELECT AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LQ33", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdRLn = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LQ34", "INSERT INTO TXPALBREP(AlbProCod, AlbHdRLn, AlbHdRKgi, AlbHdRMti, AlbHdRPzi, AlbHdRKgR, AlbHdRMtR, AlbHdRPzR, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALBREP")
         ,new UpdateCursor("T01LQ35", "UPDATE TXPALBREP SET AlbHdRKgi=?, AlbHdRMti=?, AlbHdRPzi=?, AlbHdRKgR=?, AlbHdRMtR=?, AlbHdRPzR=?, AlbRecCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdRLn = ?", GX_NOMASK, "TXPALBREP")
         ,new UpdateCursor("T01LQ36", "DELETE FROM TXPALBREP  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND AlbHdRLn = ?", GX_NOMASK, "TXPALBREP")
         ,new ForEachCursor("T01LQ37", "SELECT AlbRLote, AlbRTelar, AlbRLu, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LQ38", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(11);
               ((byte[]) buf[18])[0] = rslt.getByte(12);
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 9 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 6);
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((String[]) buf[6])[0] = rslt.getString(5, 26);
               ((String[]) buf[7])[0] = rslt.getString(6, 13);
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 13);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((int[]) buf[14])[0] = rslt.getInt(13);
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((byte[]) buf[18])[0] = rslt.getByte(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((long[]) buf[20])[0] = rslt.getLong(19);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(21,2);
               ((int[]) buf[23])[0] = rslt.getInt(22);
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
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 3);
               ((int[]) buf[19])[0] = rslt.getInt(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((byte[]) buf[22])[0] = rslt.getByte(16);
               ((String[]) buf[23])[0] = rslt.getString(17, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               return;
            case 34 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setLong(9, ((Number) parms[9]).longValue());
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
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setString(5, (String)parms[5], 3);
               stmt.setLong(6, ((Number) parms[6]).longValue());
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[7]).shortValue());
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
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               stmt.setString(9, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[16]).intValue());
               }
               stmt.setInt(11, ((Number) parms[17]).intValue());
               stmt.setByte(12, ((Number) parms[18]).byteValue());
               stmt.setString(13, (String)parms[19], 1);
               return;
            case 31 :
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               stmt.setString(8, (String)parms[14], 3);
               stmt.setLong(9, ((Number) parms[15]).longValue());
               stmt.setInt(10, ((Number) parms[16]).intValue());
               stmt.setByte(11, ((Number) parms[17]).byteValue());
               stmt.setString(12, (String)parms[18], 1);
               stmt.setShort(13, ((Number) parms[19]).shortValue());
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
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

