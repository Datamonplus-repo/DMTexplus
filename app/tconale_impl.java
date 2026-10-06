package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tconale_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         A2524DisComLin = (byte)(GXutil.lval( httpContext.GetPar( "DisComLin"))) ;
         A1056DisComCod = httpContext.GetPar( "DisComCod") ;
         A1032FonCod = httpContext.GetPar( "FonCod") ;
         A1536AlbEComPre = CommonUtil.decimalVal( httpContext.GetPar( "AlbEComPre"), ".") ;
         n1536AlbEComPre = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_14_FO533( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2524DisComLin, A1056DisComCod, A1032FonCod, A1536AlbEComPre) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action15") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_15_FO533( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CONFIRMACION DE PRECIOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProCod_Internalname ;
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_102 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_102"))) ;
      nGXsfl_102_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_102_idx"))) ;
      sGXsfl_102_idx = httpContext.GetPar( "sGXsfl_102_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public tconale_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tconale_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tconale_impl.class ));
   }

   public tconale_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCONALE.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONALE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONALE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONALE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCONALE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCONALE.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol35( ) ;
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      nGXsfl_35_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount195 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_195 = (short)(1) ;
            scanStartFO195( ) ;
            while ( RcdFound195 != 0 )
            {
               init_level_properties195( ) ;
               getByPrimaryKeyFO195( ) ;
               addRowFO195( ) ;
               scanNextFO195( ) ;
            }
            scanEndFO195( ) ;
            nBlankRcdCount195 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalFO195( ) ;
         standaloneModalFO195( ) ;
         sMode195 = Gx_mode ;
         while ( nGXsfl_35_idx < nRC_GXsfl_35 )
         {
            bGXsfl_35_Refreshing = true ;
            readRowFO195( ) ;
            edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarOpeEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAROPEESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarOpeEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOpeEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREMTR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbProEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtAlbProRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarDibCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDIBCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtBarDibInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDIBINT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibInt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtConMtsBar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONMTSBAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtConMtsBar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtConMtsBar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            edtConPieBar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONPIEBAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtConPieBar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtConPieBar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
            if ( ( nRcdExists_195 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalFO195( ) ;
            }
            sendRowFO195( ) ;
            bGXsfl_35_Refreshing = false ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount195 = (short)(5) ;
         nRcdExists_195 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartFO195( ) ;
            while ( RcdFound195 != 0 )
            {
               sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_35195( ) ;
               init_level_properties195( ) ;
               standaloneNotModalFO195( ) ;
               getByPrimaryKeyFO195( ) ;
               standaloneModalFO195( ) ;
               addRowFO195( ) ;
               scanNextFO195( ) ;
            }
            scanEndFO195( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode195 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      initAllFO195( ) ;
      init_level_properties195( ) ;
      nRcdExists_195 = (short)(0) ;
      nIsMod_195 = (short)(0) ;
      nRcdDeleted_195 = (short)(0) ;
      nBlankRcdCount195 = (short)(nBlankRcdUsr195+nBlankRcdCount195) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount195 > 0 )
      {
         standaloneNotModalFO195( ) ;
         standaloneModalFO195( ) ;
         addRowFO195( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount195 = (short)(nBlankRcdCount195-1) ;
      }
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCONALE.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCONALE.htm");
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
      e11FO2 ();
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
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Lit10 = httpContext.cgiGet( "vLIT10") ;
            AV31Lit11 = httpContext.cgiGet( "vLIT11") ;
            AV32Lit12 = httpContext.cgiGet( "vLIT12") ;
            AV33Lit13 = httpContext.cgiGet( "vLIT13") ;
            AV34Lit14 = httpContext.cgiGet( "vLIT14") ;
            AV35Lit15 = httpContext.cgiGet( "vLIT15") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A30AlbProCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            else
            {
               A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
                     if ( GXutil.strcmp(sEvt, "'CONFIRMAR PRECIO'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Confirmar Precio' */
                        e12FO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e11FO2 ();
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
            initAllFO3( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_533_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_533_Enabled), 5, 0), !bGXsfl_102_Refreshing);
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
      disableAttributesFO3( ) ;
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

   public void confirm_FO0( )
   {
      beforeValidateFO3( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsFO3( ) ;
         }
         else
         {
            checkExtendedTableFO3( ) ;
            if ( AnyError == 0 )
            {
               zmFO3( 17) ;
            }
            closeExtendedTableCursorsFO3( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode3 = Gx_mode ;
         confirm_FO195( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode3 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesFO0( ) ;
      }
   }

   public void confirm_FO533( )
   {
      s1755ConPieBar = O1755ConPieBar ;
      s1754ConMtsBar = O1754ConMtsBar ;
      nGXsfl_102_idx = 0 ;
      while ( nGXsfl_102_idx < nRC_GXsfl_102 )
      {
         readRowFO533( ) ;
         if ( ( nRcdExists_533 != 0 ) || ( nIsMod_533 != 0 ) )
         {
            getKeyFO533( ) ;
            if ( ( nRcdExists_533 == 0 ) && ( nRcdDeleted_533 == 0 ) )
            {
               if ( RcdFound533 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateFO533( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableFO533( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsFO533( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1755ConPieBar = A1755ConPieBar ;
                     O1754ConMtsBar = A1754ConMtsBar ;
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound533 != 0 )
               {
                  if ( nRcdDeleted_533 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyFO533( ) ;
                     loadFO533( ) ;
                     beforeValidateFO533( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsFO533( ) ;
                        O1755ConPieBar = A1755ConPieBar ;
                        O1754ConMtsBar = A1754ConMtsBar ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateFO533( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableFO533( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsFO533( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1755ConPieBar = A1755ConPieBar ;
                           O1754ConMtsBar = A1754ConMtsBar ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_533 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_533_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtAlbEComM_Internalname, GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComP_Internalname, GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_102_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_102_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1533AlbEComM_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1534AlbEComP_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1534AlbEComP_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( O1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1533AlbEComM_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( O1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_533_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_533_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_533_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_533 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_533_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtDisComLin_Title)) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtDisComCod_Title)) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtFonCod_Title)) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMM_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComM_Title)) ;
            httpContext.changePostValue( "ALBECOMM_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMP_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComP_Title)) ;
            httpContext.changePostValue( "ALBECOMP_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMPRE_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComPre_Title)) ;
            httpContext.changePostValue( "ALBECOMPRE_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1755ConPieBar = s1755ConPieBar ;
      O1754ConMtsBar = s1754ConMtsBar ;
      /* Start of After( level) rules */
      if ( true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.talbfae", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
      }
      /* End of After( level) rules */
   }

   public void confirm_FO195( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRowFO195( ) ;
         if ( ( nRcdExists_195 != 0 ) || ( nIsMod_195 != 0 ) )
         {
            getKeyFO195( ) ;
            if ( ( nRcdExists_195 == 0 ) && ( nRcdDeleted_195 == 0 ) )
            {
               if ( RcdFound195 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateFO195( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableFO195( ) ;
                     if ( AnyError == 0 )
                     {
                        zmFO195( 19) ;
                        zmFO195( 20) ;
                     }
                     closeExtendedTableCursorsFO195( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode195 = Gx_mode ;
                        confirm_FO533( ) ;
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
                  }
               }
               else
               {
                  GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound195 != 0 )
               {
                  if ( nRcdDeleted_195 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyFO195( ) ;
                     loadFO195( ) ;
                     beforeValidateFO195( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsFO195( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateFO195( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableFO195( ) ;
                           if ( AnyError == 0 )
                           {
                              zmFO195( 19) ;
                              zmFO195( 20) ;
                           }
                           closeExtendedTableCursorsFO195( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode195 = Gx_mode ;
                              confirm_FO533( ) ;
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
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_195 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarOpeEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A193BarOpeEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDibCli_Internalname, GXutil.rtrim( A1798BarDibCli)) ;
         httpContext.changePostValue( edtBarDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtConMtsBar_Internalname, GXutil.ltrim( localUtil.ntoc( A1754ConMtsBar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtConPieBar_Internalname, GXutil.ltrim( localUtil.ntoc( A1755ConPieBar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1755ConPieBar_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1755ConPieBar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1754ConMtsBar_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1754ConMtsBar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_102_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_102, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_195 != 0 )
         {
            httpContext.changePostValue( "BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAROPEESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOpeEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREMTR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDIBCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDIBINT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONMTSBAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtConMtsBar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONPIEBAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtConPieBar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionFO0( )
   {
   }

   public void e11FO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(8), GXv_char2) ;
      tconale_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit0", AV19Lit0);
      GXt_char1 = AV20LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      tconale_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20LitFe", AV20LitFe);
      AV18Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tconale_impl.this.A396EmprCod = GXv_char2[0] ;
      tconale_impl.this.AV16EmprNom = GXv_char3[0] ;
      tconale_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV21Lit1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT218_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char1 = AV22Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1017_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit2", AV22Lit2);
      GXt_char1 = AV23Lit3 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN275_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV23Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit3", AV23Lit3);
      GXt_char1 = AV24Lit4 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit4", AV24Lit4);
      GXt_char1 = AV25Lit5 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1096_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit5", AV25Lit5);
      GXt_char1 = AV26Lit6 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1195_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit6", AV26Lit6);
      GXt_char1 = AV27Lit7 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV27Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit7", AV27Lit7);
      GXt_char1 = AV28Lit8 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV28Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit8", AV28Lit8);
      GXt_char1 = AV29Lit9 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1518_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit9", AV29Lit9);
      GXt_char1 = AV30Lit10 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN184_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit10", AV30Lit10);
      GXt_char1 = AV31Lit11 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT689_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV31Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit11", AV31Lit11);
      GXt_char1 = AV32Lit12 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1180_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV32Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit12", AV32Lit12);
      GXt_char1 = AV33Lit13 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV33Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit13", AV33Lit13);
      GXt_char1 = AV34Lit14 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1498_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV34Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit14", AV34Lit14);
      GXt_char1 = AV35Lit15 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1518_", ""), (byte)(99), GXv_char4) ;
      tconale_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit15", AV35Lit15);
      AV36Lit16 = httpContext.getMessage( "Confirmar Precio", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit16", AV36Lit16);
   }

   public void e12FO2( )
   {
      /* 'Confirmar Precio' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int5[0] = A30AlbProCod ;
      GXv_int6[0] = A129BarCod ;
      GXv_int7[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      new app.palbproe(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3) ;
      tconale_impl.this.A396EmprCod = GXv_char4[0] ;
      tconale_impl.this.A30AlbProCod = GXv_int5[0] ;
      tconale_impl.this.A129BarCod = GXv_int6[0] ;
      tconale_impl.this.A132BarCodReo = GXv_int7[0] ;
      tconale_impl.this.A130BarCodPar = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      httpContext.doAjaxRefreshForm();
      /*  Sending Event outputs  */
   }

   public void zmFO3( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -16 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00FO11 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00FO11_A407EmprNom[0] ;
      n407EmprNom = T00FO11_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(8);
      edtDisComLin_Title = AV30Lit10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Title", edtDisComLin_Title, !bGXsfl_102_Refreshing);
      edtDisComCod_Title = AV31Lit11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Title", edtDisComCod_Title, !bGXsfl_102_Refreshing);
      edtFonCod_Title = AV32Lit12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Title", edtFonCod_Title, !bGXsfl_102_Refreshing);
      edtAlbEComM_Title = AV33Lit13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComM_Internalname, "Title", edtAlbEComM_Title, !bGXsfl_102_Refreshing);
      edtAlbEComP_Title = AV34Lit14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComP_Internalname, "Title", edtAlbEComP_Title, !bGXsfl_102_Refreshing);
      edtAlbEComPre_Title = AV35Lit15 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComPre_Internalname, "Title", edtAlbEComPre_Title, !bGXsfl_102_Refreshing);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede dar de alta", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
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

   public void loadFO3( )
   {
      /* Using cursor T00FO12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A407EmprNom = T00FO12_A407EmprNom[0] ;
         n407EmprNom = T00FO12_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmFO3( -16) ;
      }
      pr_default.close(9);
      onLoadActionsFO3( ) ;
   }

   public void onLoadActionsFO3( )
   {
   }

   public void checkExtendedTableFO3( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsFO3( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyFO3( )
   {
      /* Using cursor T00FO13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00FO10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T00FO10_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmFO3( 16) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T00FO10_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadFO3( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKeyFO3( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKeyFO3( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKeyFO3( ) ;
      if ( RcdFound3 == 0 )
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
      RcdFound3 = (short)(0) ;
      /* Using cursor T00FO14 */
      pr_default.execute(11, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T00FO14_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T00FO14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T00FO14_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T00FO14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T00FO14_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T00FO15 */
      pr_default.execute(12, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T00FO15_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T00FO15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T00FO15_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T00FO15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A30AlbProCod = T00FO15_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyFO3( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertFO3( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateFO3( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertFO3( ) ;
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
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertFO3( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
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
      getKeyFO3( ) ;
      if ( RcdFound3 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
         {
            A30AlbProCod = Z30AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tconale");
   }

   public void insert_check( )
   {
      confirm_FO0( ) ;
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
      if ( RcdFound3 == 0 )
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
      scanStartFO3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndFO3( ) ;
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
      if ( RcdFound3 == 0 )
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
      if ( RcdFound3 == 0 )
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
      scanStartFO3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNextFO3( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndFO3( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyFO3( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FO9 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(6) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFO3( )
   {
      beforeValidateFO3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFO3( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFO3( 0) ;
         checkOptimisticConcurrencyFO3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFO3( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFO3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FO16 */
                  pr_default.execute(13, new Object[] {Long.valueOf(A30AlbProCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
                        processLevelFO3( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionFO0( ) ;
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
            loadFO3( ) ;
         }
         endLevelFO3( ) ;
      }
      closeExtendedTableCursorsFO3( ) ;
   }

   public void updateFO3( )
   {
      beforeValidateFO3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFO3( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFO3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFO3( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateFO3( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCALPRD */
                  deferredUpdateFO3( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelFO3( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionFO0( ) ;
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
         endLevelFO3( ) ;
      }
      closeExtendedTableCursorsFO3( ) ;
   }

   public void deferredUpdateFO3( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFO3( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFO3( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFO3( ) ;
         afterConfirmFO3( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFO3( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00FO17 */
               pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound3 == 0 )
                     {
                        initAllFO3( ) ;
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
                     resetCaptionFO0( ) ;
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFO3( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFO3( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00FO18 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00FO19 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00FO20 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00FO21 */
         pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00FO22 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OBSALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
      }
   }

   public void processNestedLevelFO195( )
   {
      nGXsfl_35_idx = 0 ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         readRowFO195( ) ;
         if ( ( nRcdExists_195 != 0 ) || ( nIsMod_195 != 0 ) )
         {
            standaloneNotModalFO195( ) ;
            getKeyFO195( ) ;
            if ( ( nRcdExists_195 == 0 ) && ( nRcdDeleted_195 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertFO195( ) ;
            }
            else
            {
               if ( RcdFound195 != 0 )
               {
                  if ( ( nRcdDeleted_195 != 0 ) && ( nRcdExists_195 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteFO195( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_195 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateFO195( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_195 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar)) ;
         httpContext.changePostValue( edtBarSer_Internalname, GXutil.rtrim( A212BarSer)) ;
         httpContext.changePostValue( edtBarOpeEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A193BarOpeEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarDibCli_Internalname, GXutil.rtrim( A1798BarDibCli)) ;
         httpContext.changePostValue( edtBarDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtConMtsBar_Internalname, GXutil.ltrim( localUtil.ntoc( A1754ConMtsBar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtConPieBar_Internalname, GXutil.ltrim( localUtil.ntoc( A1755ConPieBar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx, GXutil.rtrim( Z130BarCodPar)) ;
         httpContext.changePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1755ConPieBar_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1755ConPieBar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1754ConMtsBar_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( O1754ConMtsBar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_102_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_102, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_195_"+sGXsfl_35_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_195 != 0 )
         {
            httpContext.changePostValue( "BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARCODPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BAROPEESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOpeEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPREMTR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPROREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDIBCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibCli_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARDIBINT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONMTSBAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtConMtsBar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CONPIEBAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtConPieBar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllFO195( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_195 = (short)(0) ;
      nIsMod_195 = (short)(0) ;
      nRcdDeleted_195 = (short)(0) ;
   }

   public void processLevelFO3( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevelFO195( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelFO3( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(6);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteFO3( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tconale");
         if ( AnyError == 0 )
         {
            confirmValuesFO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tconale");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartFO3( )
   {
      /* Scan By routine */
      /* Using cursor T00FO23 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T00FO23_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFO3( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T00FO23_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEndFO3( )
   {
      pr_default.close(20);
   }

   public void afterConfirmFO3( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertFO3( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFO3( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFO3( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFO3( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFO3( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFO3( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmFO195( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1264BarPreMtr = T00FO5_A1264BarPreMtr[0] ;
            Z32AlbProEsp = T00FO5_A32AlbProEsp[0] ;
            Z40AlbProRec = T00FO5_A40AlbProRec[0] ;
         }
         else
         {
            Z1264BarPreMtr = A1264BarPreMtr ;
            Z32AlbProEsp = A32AlbProEsp ;
            Z40AlbProRec = A40AlbProRec ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z1264BarPreMtr = A1264BarPreMtr ;
         Z32AlbProEsp = A32AlbProEsp ;
         Z40AlbProRec = A40AlbProRec ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z212BarSer = A212BarSer ;
         Z193BarOpeEsp = A193BarOpeEsp ;
         Z1798BarDibCli = A1798BarDibCli ;
         Z1799BarDibInt = A1799BarDibInt ;
         Z1754ConMtsBar = A1754ConMtsBar ;
         Z1755ConPieBar = A1755ConPieBar ;
      }
   }

   public void standaloneNotModalFO195( )
   {
   }

   public void standaloneModalFO195( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede dar de alta", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( isDlt( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede eliminar", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtBarCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtBarCodReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarCodPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
      else
      {
         edtBarCodPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      }
   }

   public void loadFO195( )
   {
      /* Using cursor T00FO25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A212BarSer = T00FO25_A212BarSer[0] ;
         A193BarOpeEsp = T00FO25_A193BarOpeEsp[0] ;
         A1264BarPreMtr = T00FO25_A1264BarPreMtr[0] ;
         A32AlbProEsp = T00FO25_A32AlbProEsp[0] ;
         A40AlbProRec = T00FO25_A40AlbProRec[0] ;
         A1798BarDibCli = T00FO25_A1798BarDibCli[0] ;
         A1799BarDibInt = T00FO25_A1799BarDibInt[0] ;
         A1754ConMtsBar = T00FO25_A1754ConMtsBar[0] ;
         A1755ConPieBar = T00FO25_A1755ConPieBar[0] ;
         zmFO195( -18) ;
      }
      pr_default.close(21);
      onLoadActionsFO195( ) ;
   }

   public void onLoadActionsFO195( )
   {
   }

   public void checkExtendedTableFO195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalFO195( ) ;
      /* Using cursor T00FO6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T00FO6_A212BarSer[0] ;
      A193BarOpeEsp = T00FO6_A193BarOpeEsp[0] ;
      A1798BarDibCli = T00FO6_A1798BarDibCli[0] ;
      A1799BarDibInt = T00FO6_A1799BarDibInt[0] ;
      pr_default.close(4);
      /* Using cursor T00FO8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A1754ConMtsBar = T00FO8_A1754ConMtsBar[0] ;
         A1755ConPieBar = T00FO8_A1755ConPieBar[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A1754ConMtsBar = DecimalUtil.doubleToDec(0) ;
         nIsDirty_195 = (short)(1) ;
         A1755ConPieBar = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsFO195( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisableFO195( )
   {
   }

   public void gxload_19( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T00FO26 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(22) == 101) )
      {
         GXCCtl = "BARCODPAR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A212BarSer = T00FO26_A212BarSer[0] ;
      A193BarOpeEsp = T00FO26_A193BarOpeEsp[0] ;
      A1798BarDibCli = T00FO26_A1798BarDibCli[0] ;
      A1799BarDibInt = T00FO26_A1799BarDibInt[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A193BarOpeEsp, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1798BarDibCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void gxload_20( String A396EmprCod ,
                          long A30AlbProCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T00FO28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) != 101) )
      {
         A1754ConMtsBar = T00FO28_A1754ConMtsBar[0] ;
         A1755ConPieBar = T00FO28_A1755ConPieBar[0] ;
      }
      else
      {
         A1754ConMtsBar = DecimalUtil.doubleToDec(0) ;
         A1755ConPieBar = (short)(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1754ConMtsBar, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1755ConPieBar, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(23) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(23);
   }

   public void getKeyFO195( )
   {
      /* Using cursor T00FO29 */
      pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKeyFO195( )
   {
      /* Using cursor T00FO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00FO5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmFO195( 18) ;
         RcdFound195 = (short)(1) ;
         initializeNonKeyFO195( ) ;
         A1264BarPreMtr = T00FO5_A1264BarPreMtr[0] ;
         A32AlbProEsp = T00FO5_A32AlbProEsp[0] ;
         A40AlbProRec = T00FO5_A40AlbProRec[0] ;
         A129BarCod = T00FO5_A129BarCod[0] ;
         A132BarCodReo = T00FO5_A132BarCodReo[0] ;
         A130BarCodPar = T00FO5_A130BarCodPar[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFO195( ) ;
         loadFO195( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKeyFO195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFO195( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesFO195( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrencyFO195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z1264BarPreMtr, T00FO4_A1264BarPreMtr[0]) != 0 ) || ( Z32AlbProEsp != T00FO4_A32AlbProEsp[0] ) || ( DecimalUtil.compareTo(Z40AlbProRec, T00FO4_A40AlbProRec[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1264BarPreMtr, T00FO4_A1264BarPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tconale:[seudo value changed for attri]"+"BarPreMtr");
               GXutil.writeLogRaw("Old: ",Z1264BarPreMtr);
               GXutil.writeLogRaw("Current: ",T00FO4_A1264BarPreMtr[0]);
            }
            if ( Z32AlbProEsp != T00FO4_A32AlbProEsp[0] )
            {
               GXutil.writeLogln("tconale:[seudo value changed for attri]"+"AlbProEsp");
               GXutil.writeLogRaw("Old: ",Z32AlbProEsp);
               GXutil.writeLogRaw("Current: ",T00FO4_A32AlbProEsp[0]);
            }
            if ( DecimalUtil.compareTo(Z40AlbProRec, T00FO4_A40AlbProRec[0]) != 0 )
            {
               GXutil.writeLogln("tconale:[seudo value changed for attri]"+"AlbProRec");
               GXutil.writeLogRaw("Old: ",Z40AlbProRec);
               GXutil.writeLogRaw("Current: ",T00FO4_A40AlbProRec[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFO195( )
   {
      beforeValidateFO195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFO195( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFO195( 0) ;
         checkOptimisticConcurrencyFO195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFO195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFO195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FO30 */
                  pr_default.execute(25, new Object[] {Long.valueOf(A30AlbProCod), A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        processLevelFO195( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            loadFO195( ) ;
         }
         endLevelFO195( ) ;
      }
      closeExtendedTableCursorsFO195( ) ;
   }

   public void updateFO195( )
   {
      beforeValidateFO195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFO195( ) ;
      }
      if ( ( nIsMod_195 != 0 ) || ( nIsDirty_195 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyFO195( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmFO195( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateFO195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00FO31 */
                     pr_default.execute(26, new Object[] {A1264BarPreMtr, Byte.valueOf(A32AlbProEsp), A40AlbProRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateFO195( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelFO195( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyFO195( ) ;
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
            endLevelFO195( ) ;
         }
      }
      closeExtendedTableCursorsFO195( ) ;
   }

   public void deferredUpdateFO195( )
   {
   }

   public void deleteFO195( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFO195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFO195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFO195( ) ;
         afterConfirmFO195( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFO195( ) ;
            if ( AnyError == 0 )
            {
               A1755ConPieBar = O1755ConPieBar ;
               A1754ConMtsBar = O1754ConMtsBar ;
               scanStartFO533( ) ;
               while ( RcdFound533 != 0 )
               {
                  getByPrimaryKeyFO533( ) ;
                  deleteFO533( ) ;
                  scanNextFO533( ) ;
                  O1755ConPieBar = A1755ConPieBar ;
                  O1754ConMtsBar = A1754ConMtsBar ;
               }
               scanEndFO533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FO32 */
                  pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
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
      }
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFO195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFO195( )
   {
      standaloneModalFO195( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00FO33 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = T00FO33_A212BarSer[0] ;
         A193BarOpeEsp = T00FO33_A193BarOpeEsp[0] ;
         A1798BarDibCli = T00FO33_A1798BarDibCli[0] ;
         A1799BarDibInt = T00FO33_A1799BarDibInt[0] ;
         pr_default.close(28);
         /* Using cursor T00FO35 */
         pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A1754ConMtsBar = T00FO35_A1754ConMtsBar[0] ;
            A1755ConPieBar = T00FO35_A1755ConPieBar[0] ;
         }
         else
         {
            A1754ConMtsBar = DecimalUtil.doubleToDec(0) ;
            A1755ConPieBar = (short)(0) ;
         }
         pr_default.close(29);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00FO36 */
         pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00FO37 */
         pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00FO38 */
         pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00FO39 */
         pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00FO40 */
         pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00FO41 */
         pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00FO42 */
         pr_default.execute(36, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00FO43 */
         pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00FO44 */
         pr_default.execute(38, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00FO45 */
         pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00FO46 */
         pr_default.execute(40, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
      }
   }

   public void processNestedLevelFO533( )
   {
      s1755ConPieBar = O1755ConPieBar ;
      s1754ConMtsBar = O1754ConMtsBar ;
      nGXsfl_102_idx = 0 ;
      while ( nGXsfl_102_idx < nRC_GXsfl_102 )
      {
         readRowFO533( ) ;
         if ( ( nRcdExists_533 != 0 ) || ( nIsMod_533 != 0 ) )
         {
            standaloneNotModalFO533( ) ;
            getKeyFO533( ) ;
            if ( ( nRcdExists_533 == 0 ) && ( nRcdDeleted_533 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertFO533( ) ;
            }
            else
            {
               if ( RcdFound533 != 0 )
               {
                  if ( ( nRcdDeleted_533 != 0 ) && ( nRcdExists_533 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteFO533( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_533 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateFO533( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_533 == 0 )
                  {
                     GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1755ConPieBar = A1755ConPieBar ;
            O1754ConMtsBar = A1754ConMtsBar ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_533_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisComCod_Internalname, GXutil.rtrim( A1056DisComCod)) ;
         httpContext.changePostValue( edtFonCod_Internalname, GXutil.rtrim( A1032FonCod)) ;
         httpContext.changePostValue( edtAlbEComM_Internalname, GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComP_Internalname, GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbEComPre_Internalname, GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_102_idx, GXutil.rtrim( Z1056DisComCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_102_idx, GXutil.rtrim( Z1032FonCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1533AlbEComM_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1534AlbEComP_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( Z1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1534AlbEComP_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( O1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T1533AlbEComM_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( O1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_533_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_533_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_533_"+sGXsfl_102_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_533 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_533_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtDisComLin_Title)) ;
            httpContext.changePostValue( "DISCOMLIN_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtDisComCod_Title)) ;
            httpContext.changePostValue( "DISCOMCOD_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtFonCod_Title)) ;
            httpContext.changePostValue( "FONCOD_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMM_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComM_Title)) ;
            httpContext.changePostValue( "ALBECOMM_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMP_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComP_Title)) ;
            httpContext.changePostValue( "ALBECOMP_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBECOMPRE_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComPre_Title)) ;
            httpContext.changePostValue( "ALBECOMPRE_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      if ( true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.talbfae", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
      }
      /* End of After( level) rules */
      initAllFO533( ) ;
      if ( AnyError != 0 )
      {
         O1755ConPieBar = s1755ConPieBar ;
         O1754ConMtsBar = s1754ConMtsBar ;
      }
      nRcdExists_533 = (short)(0) ;
      nIsMod_533 = (short)(0) ;
      nRcdDeleted_533 = (short)(0) ;
   }

   public void processLevelFO195( )
   {
      /* Save parent mode. */
      sMode195 = Gx_mode ;
      processNestedLevelFO533( ) ;
      if ( AnyError != 0 )
      {
         O1755ConPieBar = s1755ConPieBar ;
         O1754ConMtsBar = s1754ConMtsBar ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelFO195( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartFO195( )
   {
      /* Scan By routine */
      /* Using cursor T00FO47 */
      pr_default.execute(41, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A129BarCod = T00FO47_A129BarCod[0] ;
         A132BarCodReo = T00FO47_A132BarCodReo[0] ;
         A130BarCodPar = T00FO47_A130BarCodPar[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFO195( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A129BarCod = T00FO47_A129BarCod[0] ;
         A132BarCodReo = T00FO47_A132BarCodReo[0] ;
         A130BarCodPar = T00FO47_A130BarCodPar[0] ;
      }
   }

   public void scanEndFO195( )
   {
      pr_default.close(41);
   }

   public void afterConfirmFO195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertFO195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFO195( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFO195( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFO195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFO195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFO195( )
   {
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarOpeEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOpeEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOpeEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtAlbProRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibCli_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDibInt_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtConMtsBar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtConMtsBar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtConMtsBar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtConPieBar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtConPieBar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtConPieBar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void zmFO533( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1533AlbEComM = T00FO3_A1533AlbEComM[0] ;
            Z1534AlbEComP = T00FO3_A1534AlbEComP[0] ;
            Z1536AlbEComPre = T00FO3_A1536AlbEComPre[0] ;
         }
         else
         {
            Z1533AlbEComM = A1533AlbEComM ;
            Z1534AlbEComP = A1534AlbEComP ;
            Z1536AlbEComPre = A1536AlbEComPre ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         Z1533AlbEComM = A1533AlbEComM ;
         Z1534AlbEComP = A1534AlbEComP ;
         Z1536AlbEComPre = A1536AlbEComPre ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
      }
   }

   public void standaloneNotModalFO533( )
   {
   }

   public void standaloneModalFO533( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      }
      else
      {
         edtDisComLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      }
      else
      {
         edtDisComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFonCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      }
      else
      {
         edtFonCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      }
   }

   public void loadFO533( )
   {
      /* Using cursor T00FO48 */
      pr_default.execute(42, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A1533AlbEComM = T00FO48_A1533AlbEComM[0] ;
         n1533AlbEComM = T00FO48_n1533AlbEComM[0] ;
         A1534AlbEComP = T00FO48_A1534AlbEComP[0] ;
         n1534AlbEComP = T00FO48_n1534AlbEComP[0] ;
         A1536AlbEComPre = T00FO48_A1536AlbEComPre[0] ;
         n1536AlbEComPre = T00FO48_n1536AlbEComPre[0] ;
         zmFO533( -21) ;
      }
      pr_default.close(42);
      onLoadActionsFO533( ) ;
   }

   public void onLoadActionsFO533( )
   {
      if ( isIns( )  )
      {
         A1754ConMtsBar = O1754ConMtsBar.add(A1533AlbEComM) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A1754ConMtsBar = O1754ConMtsBar.add(A1533AlbEComM).subtract(O1533AlbEComM) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A1754ConMtsBar = O1754ConMtsBar.subtract(O1533AlbEComM) ;
            }
         }
      }
      if ( isIns( )  )
      {
         A1755ConPieBar = (short)(O1755ConPieBar+A1534AlbEComP) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A1755ConPieBar = (short)(O1755ConPieBar+A1534AlbEComP-O1534AlbEComP) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A1755ConPieBar = (short)(O1755ConPieBar-O1534AlbEComP) ;
            }
         }
      }
   }

   public void checkExtendedTableFO533( )
   {
      nIsDirty_533 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalFO533( ) ;
      if ( isIns( )  )
      {
         nIsDirty_533 = (short)(1) ;
         A1754ConMtsBar = O1754ConMtsBar.add(A1533AlbEComM) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_533 = (short)(1) ;
            A1754ConMtsBar = O1754ConMtsBar.add(A1533AlbEComM).subtract(O1533AlbEComM) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_533 = (short)(1) ;
               A1754ConMtsBar = O1754ConMtsBar.subtract(O1533AlbEComM) ;
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_533 = (short)(1) ;
         A1755ConPieBar = (short)(O1755ConPieBar+A1534AlbEComP) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_533 = (short)(1) ;
            A1755ConPieBar = (short)(O1755ConPieBar+A1534AlbEComP-O1534AlbEComP) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_533 = (short)(1) ;
               A1755ConPieBar = (short)(O1755ConPieBar-O1534AlbEComP) ;
            }
         }
      }
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, A1536AlbEComPre)==0) )
      {
         GXCCtl = "ALBECOMPRE_" + sGXsfl_102_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La combinacion no tiene precio Metro", ""), 0, GXCCtl);
      }
   }

   public void closeExtendedTableCursorsFO533( )
   {
   }

   public void enableDisableFO533( )
   {
   }

   public void getKeyFO533( )
   {
      /* Using cursor T00FO49 */
      pr_default.execute(43, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound533 = (short)(1) ;
      }
      else
      {
         RcdFound533 = (short)(0) ;
      }
      pr_default.close(43);
   }

   public void getByPrimaryKeyFO533( )
   {
      /* Using cursor T00FO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00FO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmFO533( 21) ;
         RcdFound533 = (short)(1) ;
         initializeNonKeyFO533( ) ;
         A2524DisComLin = T00FO3_A2524DisComLin[0] ;
         A1056DisComCod = T00FO3_A1056DisComCod[0] ;
         A1032FonCod = T00FO3_A1032FonCod[0] ;
         A1533AlbEComM = T00FO3_A1533AlbEComM[0] ;
         n1533AlbEComM = T00FO3_n1533AlbEComM[0] ;
         A1534AlbEComP = T00FO3_A1534AlbEComP[0] ;
         n1534AlbEComP = T00FO3_n1534AlbEComP[0] ;
         A1536AlbEComPre = T00FO3_A1536AlbEComPre[0] ;
         n1536AlbEComPre = T00FO3_n1536AlbEComPre[0] ;
         O1534AlbEComP = A1534AlbEComP ;
         n1534AlbEComP = false ;
         O1533AlbEComM = A1533AlbEComM ;
         n1533AlbEComM = false ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2524DisComLin = A2524DisComLin ;
         Z1056DisComCod = A1056DisComCod ;
         Z1032FonCod = A1032FonCod ;
         sMode533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFO533( ) ;
         loadFO533( ) ;
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound533 = (short)(0) ;
         initializeNonKeyFO533( ) ;
         sMode533 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalFO533( ) ;
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesFO533( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyFO533( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00FO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z1533AlbEComM, T00FO2_A1533AlbEComM[0]) != 0 ) || ( Z1534AlbEComP != T00FO2_A1534AlbEComP[0] ) || ( DecimalUtil.compareTo(Z1536AlbEComPre, T00FO2_A1536AlbEComPre[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z1533AlbEComM, T00FO2_A1533AlbEComM[0]) != 0 )
            {
               GXutil.writeLogln("tconale:[seudo value changed for attri]"+"AlbEComM");
               GXutil.writeLogRaw("Old: ",Z1533AlbEComM);
               GXutil.writeLogRaw("Current: ",T00FO2_A1533AlbEComM[0]);
            }
            if ( Z1534AlbEComP != T00FO2_A1534AlbEComP[0] )
            {
               GXutil.writeLogln("tconale:[seudo value changed for attri]"+"AlbEComP");
               GXutil.writeLogRaw("Old: ",Z1534AlbEComP);
               GXutil.writeLogRaw("Current: ",T00FO2_A1534AlbEComP[0]);
            }
            if ( DecimalUtil.compareTo(Z1536AlbEComPre, T00FO2_A1536AlbEComPre[0]) != 0 )
            {
               GXutil.writeLogln("tconale:[seudo value changed for attri]"+"AlbEComPre");
               GXutil.writeLogRaw("Old: ",Z1536AlbEComPre);
               GXutil.writeLogRaw("Current: ",T00FO2_A1536AlbEComPre[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBEST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertFO533( )
   {
      beforeValidateFO533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFO533( ) ;
      }
      if ( AnyError == 0 )
      {
         zmFO533( 0) ;
         checkOptimisticConcurrencyFO533( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmFO533( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertFO533( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00FO50 */
                  pr_default.execute(44, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), Boolean.valueOf(n1536AlbEComPre), A1536AlbEComPre, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                  if ( (pr_default.getStatus(44) == 1) )
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
            loadFO533( ) ;
         }
         endLevelFO533( ) ;
      }
      closeExtendedTableCursorsFO533( ) ;
   }

   public void updateFO533( )
   {
      beforeValidateFO533( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableFO533( ) ;
      }
      if ( ( nIsMod_533 != 0 ) || ( nIsDirty_533 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyFO533( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmFO533( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateFO533( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00FO51 */
                     pr_default.execute(45, new Object[] {Boolean.valueOf(n1533AlbEComM), A1533AlbEComM, Boolean.valueOf(n1534AlbEComP), Short.valueOf(A1534AlbEComP), Boolean.valueOf(n1536AlbEComPre), A1536AlbEComPre, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
                     if ( (pr_default.getStatus(45) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBEST"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateFO533( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        if ( true /* Level */ && true /* After */ )
                        {
                           GXv_char4[0] = A396EmprCod ;
                           GXv_int5[0] = A30AlbProCod ;
                           GXv_int6[0] = A129BarCod ;
                           GXv_int7[0] = A132BarCodReo ;
                           GXv_char3[0] = A130BarCodPar ;
                           GXv_int8[0] = A2524DisComLin ;
                           GXv_char2[0] = A1056DisComCod ;
                           GXv_char9[0] = A1032FonCod ;
                           GXv_decimal10[0] = A1536AlbEComPre ;
                           new app.pactpco(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_int7, GXv_char3, GXv_int8, GXv_char2, GXv_char9, GXv_decimal10) ;
                           tconale_impl.this.A396EmprCod = GXv_char4[0] ;
                           tconale_impl.this.A30AlbProCod = GXv_int5[0] ;
                           tconale_impl.this.A129BarCod = GXv_int6[0] ;
                           tconale_impl.this.A132BarCodReo = GXv_int7[0] ;
                           tconale_impl.this.A130BarCodPar = GXv_char3[0] ;
                           tconale_impl.this.A2524DisComLin = GXv_int8[0] ;
                           tconale_impl.this.A1056DisComCod = GXv_char2[0] ;
                           tconale_impl.this.A1032FonCod = GXv_char9[0] ;
                           tconale_impl.this.A1536AlbEComPre = GXv_decimal10[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyFO533( ) ;
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
            endLevelFO533( ) ;
         }
      }
      closeExtendedTableCursorsFO533( ) ;
   }

   public void deferredUpdateFO533( )
   {
   }

   public void deleteFO533( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateFO533( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyFO533( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsFO533( ) ;
         afterConfirmFO533( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteFO533( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00FO52 */
               pr_default.execute(46, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
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
      sMode533 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelFO533( ) ;
      Gx_mode = sMode533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsFO533( )
   {
      standaloneModalFO533( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A1754ConMtsBar = O1754ConMtsBar.add(A1533AlbEComM) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A1754ConMtsBar = O1754ConMtsBar.add(A1533AlbEComM).subtract(O1533AlbEComM) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1754ConMtsBar = O1754ConMtsBar.subtract(O1533AlbEComM) ;
               }
            }
         }
         if ( isIns( )  )
         {
            A1755ConPieBar = (short)(O1755ConPieBar+A1534AlbEComP) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A1755ConPieBar = (short)(O1755ConPieBar+A1534AlbEComP-O1534AlbEComP) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A1755ConPieBar = (short)(O1755ConPieBar-O1534AlbEComP) ;
               }
            }
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00FO53 */
         pr_default.execute(47, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00FO54 */
         pr_default.execute(48, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00FO55 */
         pr_default.execute(49, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METROS PIEZA (ALB.ESTAMPACION)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00FO56 */
         pr_default.execute(50, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBETE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00FO57 */
         pr_default.execute(51, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
      }
   }

   public void endLevelFO533( )
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

   public void scanStartFO533( )
   {
      /* Scan By routine */
      /* Using cursor T00FO58 */
      pr_default.execute(52, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      RcdFound533 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A2524DisComLin = T00FO58_A2524DisComLin[0] ;
         A1056DisComCod = T00FO58_A1056DisComCod[0] ;
         A1032FonCod = T00FO58_A1032FonCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextFO533( )
   {
      /* Scan next routine */
      pr_default.readNext(52);
      RcdFound533 = (short)(0) ;
      if ( (pr_default.getStatus(52) != 101) )
      {
         RcdFound533 = (short)(1) ;
         A2524DisComLin = T00FO58_A2524DisComLin[0] ;
         A1056DisComCod = T00FO58_A1056DisComCod[0] ;
         A1032FonCod = T00FO58_A1032FonCod[0] ;
      }
   }

   public void scanEndFO533( )
   {
      pr_default.close(52);
   }

   public void afterConfirmFO533( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertFO533( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateFO533( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteFO533( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteFO533( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateFO533( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesFO533( )
   {
      edtDisComLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtDisComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtFonCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtAlbEComM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComM_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtAlbEComP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComP_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtAlbEComPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComPre_Enabled), 5, 0), !bGXsfl_102_Refreshing);
   }

   public void send_integrity_lvl_hashesFO533( )
   {
   }

   public void send_integrity_lvl_hashesFO195( )
   {
   }

   public void send_integrity_lvl_hashesFO3( )
   {
   }

   public void subsflControlProps_35195( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_35_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_35_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_35_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_35_idx ;
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_35_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_35_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_35_idx ;
      edtBarOpeEsp_Internalname = "BAROPEESP_"+sGXsfl_35_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_35_idx ;
      edtBarPreMtr_Internalname = "BARPREMTR_"+sGXsfl_35_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_35_idx ;
      edtAlbProEsp_Internalname = "ALBPROESP_"+sGXsfl_35_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_35_idx ;
      edtAlbProRec_Internalname = "ALBPROREC_"+sGXsfl_35_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_35_idx ;
      edtBarDibCli_Internalname = "BARDIBCLI_"+sGXsfl_35_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_35_idx ;
      edtBarDibInt_Internalname = "BARDIBINT_"+sGXsfl_35_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_35_idx ;
      edtConMtsBar_Internalname = "CONMTSBAR_"+sGXsfl_35_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_35_idx ;
      edtConPieBar_Internalname = "CONPIEBAR_"+sGXsfl_35_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_35195( )
   {
      lblTextblock4_Internalname = "TEXTBLOCK4_"+sGXsfl_35_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_35_fel_idx ;
      lblTextblock5_Internalname = "TEXTBLOCK5_"+sGXsfl_35_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_35_fel_idx ;
      lblTextblock6_Internalname = "TEXTBLOCK6_"+sGXsfl_35_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_35_fel_idx ;
      lblTextblock7_Internalname = "TEXTBLOCK7_"+sGXsfl_35_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_35_fel_idx ;
      lblTextblock8_Internalname = "TEXTBLOCK8_"+sGXsfl_35_fel_idx ;
      edtBarOpeEsp_Internalname = "BAROPEESP_"+sGXsfl_35_fel_idx ;
      lblTextblock9_Internalname = "TEXTBLOCK9_"+sGXsfl_35_fel_idx ;
      edtBarPreMtr_Internalname = "BARPREMTR_"+sGXsfl_35_fel_idx ;
      lblTextblock10_Internalname = "TEXTBLOCK10_"+sGXsfl_35_fel_idx ;
      edtAlbProEsp_Internalname = "ALBPROESP_"+sGXsfl_35_fel_idx ;
      lblTextblock11_Internalname = "TEXTBLOCK11_"+sGXsfl_35_fel_idx ;
      edtAlbProRec_Internalname = "ALBPROREC_"+sGXsfl_35_fel_idx ;
      lblTextblock12_Internalname = "TEXTBLOCK12_"+sGXsfl_35_fel_idx ;
      edtBarDibCli_Internalname = "BARDIBCLI_"+sGXsfl_35_fel_idx ;
      lblTextblock13_Internalname = "TEXTBLOCK13_"+sGXsfl_35_fel_idx ;
      edtBarDibInt_Internalname = "BARDIBINT_"+sGXsfl_35_fel_idx ;
      lblTextblock14_Internalname = "TEXTBLOCK14_"+sGXsfl_35_fel_idx ;
      edtConMtsBar_Internalname = "CONMTSBAR_"+sGXsfl_35_fel_idx ;
      lblTextblock15_Internalname = "TEXTBLOCK15_"+sGXsfl_35_fel_idx ;
      edtConPieBar_Internalname = "CONPIEBAR_"+sGXsfl_35_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_35_fel_idx ;
   }

   public void addRowFO195( )
   {
      nRC_GXsfl_102 = 0 ;
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      sendRowFO195( ) ;
   }

   public void sendRowFO195( )
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
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_35_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_35_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_35_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock4_Internalname,httpContext.getMessage( "Codigo Barcada", ""),"","",lblTextblock4_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock5_Internalname,httpContext.getMessage( "Codigo Reoperado Barcada", ""),"","",lblTextblock5_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarCodReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock6_Internalname,httpContext.getMessage( "Codigo Particion Barcada", ""),"","",lblTextblock6_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarCodPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock7_Internalname,httpContext.getMessage( "Serie", ""),"","",lblTextblock7_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarSer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock8_Internalname,httpContext.getMessage( "Operacion Especial", ""),"","",lblTextblock8_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOpeEsp_Internalname,GXutil.ltrim( localUtil.ntoc( A193BarOpeEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarOpeEsp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A193BarOpeEsp), "99") : localUtil.format( DecimalUtil.doubleToDec(A193BarOpeEsp), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOpeEsp_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarOpeEsp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock9_Internalname,httpContext.getMessage( "Precio Metro", ""),"","",lblTextblock9_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPreMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPreMtr_Enabled!=0) ? localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999") : localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPreMtr_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarPreMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock10_Internalname,httpContext.getMessage( "Albaran Pendiente Confirmacion", ""),"","",lblTextblock10_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEsp_Internalname,GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProEsp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99") : localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEsp_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlbProEsp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock11_Internalname,httpContext.getMessage( "Recargo Albaran", ""),"","",lblTextblock11_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_35_idx + "',35)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProRec_Internalname,GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbProRec_Enabled!=0) ? localUtil.format( A40AlbProRec, "ZZZZZZ9.99") : localUtil.format( A40AlbProRec, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,78);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProRec_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtAlbProRec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(13),"chr",Integer.valueOf(1),"row",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock12_Internalname,httpContext.getMessage( "Dibujo Cliente en Hoja Ruta", ""),"","",lblTextblock12_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDibCli_Internalname,GXutil.rtrim( A1798BarDibCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDibCli_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarDibCli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock13_Internalname,httpContext.getMessage( "Dibujo Interno en Hoja Ruta", ""),"","",lblTextblock13_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDibInt_Internalname,GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1799BarDibInt), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDibInt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtBarDibInt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock14_Internalname,httpContext.getMessage( "ConMtsBar", ""),"","",lblTextblock14_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtConMtsBar_Internalname,GXutil.ltrim( localUtil.ntoc( A1754ConMtsBar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtConMtsBar_Enabled!=0) ? localUtil.format( A1754ConMtsBar, "ZZZZZ9.99") : localUtil.format( A1754ConMtsBar, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtConMtsBar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtConMtsBar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock15_Internalname,httpContext.getMessage( "ConPieBar", ""),"","",lblTextblock15_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtConPieBar_Internalname,GXutil.ltrim( localUtil.ntoc( A1755ConPieBar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtConPieBar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1755ConPieBar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1755ConPieBar), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtConPieBar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtConPieBar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol102( ) ;
      nGXsfl_102_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount533 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_533 = (short)(1) ;
            scanStartFO533( ) ;
            while ( RcdFound533 != 0 )
            {
               init_level_properties533( ) ;
               getByPrimaryKeyFO533( ) ;
               addRowFO533( ) ;
               scanNextFO533( ) ;
            }
            scanEndFO533( ) ;
            nBlankRcdCount533 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1755ConPieBar = A1755ConPieBar ;
         B1754ConMtsBar = A1754ConMtsBar ;
         standaloneNotModalFO533( ) ;
         standaloneModalFO533( ) ;
         sMode533 = Gx_mode ;
         while ( nGXsfl_102_idx < nRC_GXsfl_102 )
         {
            bGXsfl_102_Refreshing = true ;
            readRowFO533( ) ;
            edtavnRcdDeleted_533_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_533_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_533_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_533_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            edtDisComLin_Title = httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_102_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Title", edtDisComLin_Title, !bGXsfl_102_Refreshing);
            edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            edtDisComCod_Title = httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_102_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Title", edtDisComCod_Title, !bGXsfl_102_Refreshing);
            edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            edtFonCod_Title = httpContext.cgiGet( "FONCOD_"+sGXsfl_102_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Title", edtFonCod_Title, !bGXsfl_102_Refreshing);
            edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            edtAlbEComM_Title = httpContext.cgiGet( "ALBECOMM_"+sGXsfl_102_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComM_Internalname, "Title", edtAlbEComM_Title, !bGXsfl_102_Refreshing);
            edtAlbEComM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMM_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComM_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            edtAlbEComP_Title = httpContext.cgiGet( "ALBECOMP_"+sGXsfl_102_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComP_Internalname, "Title", edtAlbEComP_Title, !bGXsfl_102_Refreshing);
            edtAlbEComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMP_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComP_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            edtAlbEComPre_Title = httpContext.cgiGet( "ALBECOMPRE_"+sGXsfl_102_idx+"Title") ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComPre_Internalname, "Title", edtAlbEComPre_Title, !bGXsfl_102_Refreshing);
            edtAlbEComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMPRE_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbEComPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEComPre_Enabled), 5, 0), !bGXsfl_102_Refreshing);
            if ( ( nRcdExists_533 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalFO533( ) ;
            }
            sendRowFO533( ) ;
            bGXsfl_102_Refreshing = false ;
         }
         Gx_mode = sMode533 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1755ConPieBar = B1755ConPieBar ;
         A1754ConMtsBar = B1754ConMtsBar ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount533 = (short)(5) ;
         nRcdExists_533 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartFO533( ) ;
            while ( RcdFound533 != 0 )
            {
               sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
               subsflControlProps_102533( ) ;
               init_level_properties533( ) ;
               standaloneNotModalFO533( ) ;
               getByPrimaryKeyFO533( ) ;
               standaloneModalFO533( ) ;
               addRowFO533( ) ;
               scanNextFO533( ) ;
            }
            scanEndFO533( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode533 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx+1), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_102533( ) ;
      initAllFO533( ) ;
      init_level_properties533( ) ;
      B1755ConPieBar = A1755ConPieBar ;
      B1754ConMtsBar = A1754ConMtsBar ;
      nRcdExists_533 = (short)(0) ;
      nIsMod_533 = (short)(0) ;
      nRcdDeleted_533 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 35 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_35_idx, ".")) == 0 ) )
      {
         nBlankRcdCount533 = (short)(nBlankRcdUsr533+nBlankRcdCount533) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount533 > 0 )
      {
         standaloneNotModalFO533( ) ;
         standaloneModalFO533( ) ;
         addRowFO533( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDisComLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount533 = (short)(nBlankRcdCount533-1) ;
      }
      Gx_mode = sMode533 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1755ConPieBar = B1755ConPieBar ;
      A1754ConMtsBar = B1754ConMtsBar ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_35_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_35_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_35_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesFO195( ) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z132BarCodReo_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z130BarCodPar_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z130BarCodPar));
      GXCCtl = "Z1264BarPreMtr_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z32AlbProEsp_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z40AlbProRec_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1755ConPieBar_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1755ConPieBar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1754ConMtsBar_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1754ConMtsBar, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_102_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_102_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_195_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_195_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_195_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_195, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BAROPEESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOpeEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPREMTR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROESP_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROREC_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDIBCLI_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDIBINT_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONMTSBAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtConMtsBar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CONPIEBAR_"+sGXsfl_35_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtConPieBar_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_35_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowFO195( )
   {
      nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      edtBarCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODREO_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarCodPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODPAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarSer_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARSER_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarOpeEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BAROPEESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPreMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPREMTR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProEsp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROESP_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbProRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPROREC_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDibCli_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDIBCLI_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarDibInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARDIBINT_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtConMtsBar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONMTSBAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtConPieBar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CONPIEBAR_"+sGXsfl_35_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BARCOD_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         wbErr = true ;
         A129BarCod = 0 ;
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "BARCODREO_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCodReo_Internalname ;
         wbErr = true ;
         A132BarCodReo = (byte)(0) ;
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
      A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
      A193BarOpeEsp = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarOpeEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BARPREMTR_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPreMtr_Internalname ;
         wbErr = true ;
         A1264BarPreMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBPROESP_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProEsp_Internalname ;
         wbErr = true ;
         A32AlbProEsp = (byte)(0) ;
      }
      else
      {
         A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBPROREC_" + sGXsfl_35_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProRec_Internalname ;
         wbErr = true ;
         A40AlbProRec = DecimalUtil.ZERO ;
      }
      else
      {
         A40AlbProRec = localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)) ;
      }
      A1798BarDibCli = httpContext.cgiGet( edtBarDibCli_Internalname) ;
      A1799BarDibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtBarDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A1754ConMtsBar = localUtil.ctond( httpContext.cgiGet( edtConMtsBar_Internalname)) ;
      A1755ConPieBar = (short)(localUtil.ctol( httpContext.cgiGet( edtConPieBar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z129BarCod_" + sGXsfl_35_idx ;
      Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z132BarCodReo_" + sGXsfl_35_idx ;
      Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z130BarCodPar_" + sGXsfl_35_idx ;
      Z130BarCodPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1264BarPreMtr_" + sGXsfl_35_idx ;
      Z1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z32AlbProEsp_" + sGXsfl_35_idx ;
      Z32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z40AlbProRec_" + sGXsfl_35_idx ;
      Z40AlbProRec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1755ConPieBar_" + sGXsfl_35_idx ;
      O1755ConPieBar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1754ConMtsBar_" + sGXsfl_35_idx ;
      O1754ConMtsBar = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_102_" + sGXsfl_35_idx ;
      nRC_GXsfl_102 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_195_" + sGXsfl_35_idx ;
      nRcdDeleted_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_195_" + sGXsfl_35_idx ;
      nRcdExists_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_195_" + sGXsfl_35_idx ;
      nIsMod_195 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_102_" + sGXsfl_35_idx ;
      nRC_GXsfl_102 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_102533( )
   {
      edtavnRcdDeleted_533_Internalname = "vNRCDDELETED_533_"+sGXsfl_102_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_102_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_102_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_102_idx ;
      edtAlbEComM_Internalname = "ALBECOMM_"+sGXsfl_102_idx ;
      edtAlbEComP_Internalname = "ALBECOMP_"+sGXsfl_102_idx ;
      edtAlbEComPre_Internalname = "ALBECOMPRE_"+sGXsfl_102_idx ;
   }

   public void subsflControlProps_fel_102533( )
   {
      edtavnRcdDeleted_533_Internalname = "vNRCDDELETED_533_"+sGXsfl_102_fel_idx ;
      edtDisComLin_Internalname = "DISCOMLIN_"+sGXsfl_102_fel_idx ;
      edtDisComCod_Internalname = "DISCOMCOD_"+sGXsfl_102_fel_idx ;
      edtFonCod_Internalname = "FONCOD_"+sGXsfl_102_fel_idx ;
      edtAlbEComM_Internalname = "ALBECOMM_"+sGXsfl_102_fel_idx ;
      edtAlbEComP_Internalname = "ALBECOMP_"+sGXsfl_102_fel_idx ;
      edtAlbEComPre_Internalname = "ALBECOMPRE_"+sGXsfl_102_fel_idx ;
   }

   public void addRowFO533( )
   {
      nGXsfl_102_idx = (int)(nGXsfl_102_idx+1) ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_102533( ) ;
      sendRowFO533( ) ;
   }

   public void sendRowFO533( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_102_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_533_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_533_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_533), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_533), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_533_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_533_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2524DisComLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisComCod_Internalname,GXutil.rtrim( A1056DisComCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDisComCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFonCod_Internalname,GXutil.rtrim( A1032FonCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFonCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtFonCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEComM_Internalname,GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEComM_Enabled!=0) ? localUtil.format( A1533AlbEComM, "ZZZZZ9.99") : localUtil.format( A1533AlbEComM, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEComM_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEComM_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEComP_Internalname,GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEComP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1534AlbEComP), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1534AlbEComP), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEComP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEComP_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_533_" + sGXsfl_102_idx + "',1);gx.fn.setControlValue('nIsMod_195_" + sGXsfl_35_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_102_idx + "',102)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEComPre_Internalname,GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbEComPre_Enabled!=0) ? localUtil.format( A1536AlbEComPre, "ZZZZZZ9.999") : localUtil.format( A1536AlbEComPre, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEComPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbEComPre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(102),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesFO533( ) ;
      GXCCtl = "Z2524DisComLin_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2524DisComLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1056DisComCod_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1056DisComCod));
      GXCCtl = "Z1032FonCod_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1032FonCod));
      GXCCtl = "Z1533AlbEComM_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1534AlbEComP_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1536AlbEComPre_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1536AlbEComPre, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1534AlbEComP_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1534AlbEComP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O1533AlbEComM_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O1533AlbEComM, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_533_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_533_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_533_" + sGXsfl_102_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_533, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_533_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtDisComLin_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMLIN_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtDisComCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOMCOD_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtFonCod_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "FONCOD_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMM_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComM_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMM_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMP_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComP_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMP_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMPRE_"+sGXsfl_102_idx+"Title", GXutil.rtrim( edtAlbEComPre_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBECOMPRE_"+sGXsfl_102_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowFO533( )
   {
      nGXsfl_102_idx = (int)(nGXsfl_102_idx+1) ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_102533( ) ;
      edtavnRcdDeleted_533_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_533_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComLin_Title = httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_102_idx+"Title") ;
      edtDisComLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMLIN_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisComCod_Title = httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_102_idx+"Title") ;
      edtDisComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOMCOD_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFonCod_Title = httpContext.cgiGet( "FONCOD_"+sGXsfl_102_idx+"Title") ;
      edtFonCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FONCOD_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEComM_Title = httpContext.cgiGet( "ALBECOMM_"+sGXsfl_102_idx+"Title") ;
      edtAlbEComM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMM_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEComP_Title = httpContext.cgiGet( "ALBECOMP_"+sGXsfl_102_idx+"Title") ;
      edtAlbEComP_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMP_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbEComPre_Title = httpContext.cgiGet( "ALBECOMPRE_"+sGXsfl_102_idx+"Title") ;
      edtAlbEComPre_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBECOMPRE_"+sGXsfl_102_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_533_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_533_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_533");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_533_Internalname ;
         wbErr = true ;
         nRcdDeleted_533 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_533 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_533_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DISCOMLIN_" + sGXsfl_102_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisComLin_Internalname ;
         wbErr = true ;
         A2524DisComLin = (byte)(0) ;
      }
      else
      {
         A2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1056DisComCod = httpContext.cgiGet( edtDisComCod_Internalname) ;
      A1032FonCod = httpContext.cgiGet( edtFonCod_Internalname) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbEComM_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEComM_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBECOMM_" + sGXsfl_102_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbEComM_Internalname ;
         wbErr = true ;
         A1533AlbEComM = DecimalUtil.ZERO ;
         n1533AlbEComM = false ;
      }
      else
      {
         A1533AlbEComM = localUtil.ctond( httpContext.cgiGet( edtAlbEComM_Internalname)) ;
         n1533AlbEComM = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbEComP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbEComP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBECOMP_" + sGXsfl_102_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbEComP_Internalname ;
         wbErr = true ;
         A1534AlbEComP = (short)(0) ;
         n1534AlbEComP = false ;
      }
      else
      {
         A1534AlbEComP = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbEComP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1534AlbEComP = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbEComPre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEComPre_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "ALBECOMPRE_" + sGXsfl_102_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbEComPre_Internalname ;
         wbErr = true ;
         A1536AlbEComPre = DecimalUtil.ZERO ;
         n1536AlbEComPre = false ;
      }
      else
      {
         A1536AlbEComPre = localUtil.ctond( httpContext.cgiGet( edtAlbEComPre_Internalname)) ;
         n1536AlbEComPre = false ;
      }
      GXCCtl = "Z2524DisComLin_" + sGXsfl_102_idx ;
      Z2524DisComLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1056DisComCod_" + sGXsfl_102_idx ;
      Z1056DisComCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1032FonCod_" + sGXsfl_102_idx ;
      Z1032FonCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1533AlbEComM_" + sGXsfl_102_idx ;
      Z1533AlbEComM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z1534AlbEComP_" + sGXsfl_102_idx ;
      Z1534AlbEComP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1536AlbEComPre_" + sGXsfl_102_idx ;
      Z1536AlbEComPre = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O1534AlbEComP_" + sGXsfl_102_idx ;
      O1534AlbEComP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O1533AlbEComM_" + sGXsfl_102_idx ;
      O1533AlbEComM = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_533_" + sGXsfl_102_idx ;
      nRcdDeleted_533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_533_" + sGXsfl_102_idx ;
      nRcdExists_533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_533_" + sGXsfl_102_idx ;
      nIsMod_533 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFonCod_Enabled = edtFonCod_Enabled ;
      defedtDisComCod_Enabled = edtDisComCod_Enabled ;
      defedtDisComLin_Enabled = edtDisComLin_Enabled ;
      defedtBarCodPar_Enabled = edtBarCodPar_Enabled ;
      defedtBarCodReo_Enabled = edtBarCodReo_Enabled ;
      defedtBarCod_Enabled = edtBarCod_Enabled ;
   }

   public void confirmValuesFO0( )
   {
      nGXsfl_35_idx = 0 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_35195( ) ;
      while ( nGXsfl_35_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_35195( ) ;
         httpContext.changePostValue( "Z129BarCod_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z129BarCod_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z132BarCodReo_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z132BarCodReo_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z130BarCodPar_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z130BarCodPar_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z1264BarPreMtr_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1264BarPreMtr_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z32AlbProEsp_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z32AlbProEsp_"+sGXsfl_35_idx) ;
         httpContext.changePostValue( "Z40AlbProRec_"+sGXsfl_35_idx, httpContext.cgiGet( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z40AlbProRec_"+sGXsfl_35_idx) ;
      }
      nGXsfl_102_idx = 0 ;
      sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
      subsflControlProps_102533( ) ;
      while ( nGXsfl_102_idx < nRC_GXsfl_102 )
      {
         nGXsfl_102_idx = (int)(nGXsfl_102_idx+1) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_102533( ) ;
         httpContext.changePostValue( "Z2524DisComLin_"+sGXsfl_102_idx, httpContext.cgiGet( "ZT_"+"Z2524DisComLin_"+sGXsfl_102_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2524DisComLin_"+sGXsfl_102_idx) ;
         httpContext.changePostValue( "Z1056DisComCod_"+sGXsfl_102_idx, httpContext.cgiGet( "ZT_"+"Z1056DisComCod_"+sGXsfl_102_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1056DisComCod_"+sGXsfl_102_idx) ;
         httpContext.changePostValue( "Z1032FonCod_"+sGXsfl_102_idx, httpContext.cgiGet( "ZT_"+"Z1032FonCod_"+sGXsfl_102_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1032FonCod_"+sGXsfl_102_idx) ;
         httpContext.changePostValue( "Z1533AlbEComM_"+sGXsfl_102_idx, httpContext.cgiGet( "ZT_"+"Z1533AlbEComM_"+sGXsfl_102_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1533AlbEComM_"+sGXsfl_102_idx) ;
         httpContext.changePostValue( "Z1534AlbEComP_"+sGXsfl_102_idx, httpContext.cgiGet( "ZT_"+"Z1534AlbEComP_"+sGXsfl_102_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1534AlbEComP_"+sGXsfl_102_idx) ;
         httpContext.changePostValue( "Z1536AlbEComPre_"+sGXsfl_102_idx, httpContext.cgiGet( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_102_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1536AlbEComPre_"+sGXsfl_102_idx) ;
      }
      httpContext.changePostValue( "O1755ConPieBar", httpContext.cgiGet( "T1755ConPieBar")) ;
      httpContext.deletePostValue( "T1755ConPieBar") ;
      httpContext.changePostValue( "O1754ConMtsBar", httpContext.cgiGet( "T1754ConMtsBar")) ;
      httpContext.deletePostValue( "T1754ConMtsBar") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tconale", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nGXsfl_35_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT10", GXutil.rtrim( AV30Lit10));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT11", GXutil.rtrim( AV31Lit11));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT12", GXutil.rtrim( AV32Lit12));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT13", GXutil.rtrim( AV33Lit13));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT14", GXutil.rtrim( AV34Lit14));
      app.GxWebStd.gx_hidden_field( httpContext, "vLIT15", GXutil.rtrim( AV35Lit15));
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
      return formatLink("app.tconale", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCONALE" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CONFIRMACION DE PRECIOS", "") ;
   }

   public void initializeNonKeyFO3( )
   {
   }

   public void initAllFO3( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKeyFO3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyFO195( )
   {
      A212BarSer = "" ;
      A193BarOpeEsp = (byte)(0) ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A32AlbProEsp = (byte)(0) ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      A1799BarDibInt = 0 ;
      A1754ConMtsBar = DecimalUtil.ZERO ;
      A1755ConPieBar = (short)(0) ;
      O1755ConPieBar = A1755ConPieBar ;
      O1754ConMtsBar = A1754ConMtsBar ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z32AlbProEsp = (byte)(0) ;
      Z40AlbProRec = DecimalUtil.ZERO ;
   }

   public void initAllFO195( )
   {
      A129BarCod = 0 ;
      A132BarCodReo = (byte)(0) ;
      A130BarCodPar = "" ;
      initializeNonKeyFO195( ) ;
   }

   public void standaloneModalInsertFO195( )
   {
   }

   public void initializeNonKeyFO533( )
   {
      A1533AlbEComM = DecimalUtil.ZERO ;
      n1533AlbEComM = false ;
      A1534AlbEComP = (short)(0) ;
      n1534AlbEComP = false ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
      n1536AlbEComPre = false ;
      O1534AlbEComP = A1534AlbEComP ;
      n1534AlbEComP = false ;
      O1533AlbEComM = A1533AlbEComM ;
      n1533AlbEComM = false ;
      Z1533AlbEComM = DecimalUtil.ZERO ;
      Z1534AlbEComP = (short)(0) ;
      Z1536AlbEComPre = DecimalUtil.ZERO ;
   }

   public void initAllFO533( )
   {
      A2524DisComLin = (byte)(0) ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      initializeNonKeyFO533( ) ;
   }

   public void standaloneModalInsertFO533( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241521353", true, true);
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
      httpContext.AddJavascriptSource("tconale.js", "?20268241521353", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties195( )
   {
      edtBarCodPar_Enabled = defedtBarCodPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCodReo_Enabled = defedtBarCodReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtBarCod_Enabled = defedtBarCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void init_level_properties533( )
   {
      edtFonCod_Enabled = defedtFonCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFonCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFonCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtDisComCod_Enabled = defedtDisComCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComCod_Enabled), 5, 0), !bGXsfl_102_Refreshing);
      edtDisComLin_Enabled = defedtDisComLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisComLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisComLin_Enabled), 5, 0), !bGXsfl_102_Refreshing);
   }

   public void startgridcontrol35( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("DeleteMethod", "none");
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock4_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock5_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock6_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock7_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarSer_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock8_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A193BarOpeEsp, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarOpeEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock9_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPreMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock10_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProEsp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock11_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbProRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock12_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1798BarDibCli));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibCli_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock13_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarDibInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock14_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1754ConMtsBar, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtConMtsBar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock15_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1755ConPieBar, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtConPieBar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol102( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_533, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_533_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtDisComLin_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1056DisComCod));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtDisComCod_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A1032FonCod));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtFonCod_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFonCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1533AlbEComM, (byte)(9), (byte)(2), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtAlbEComM_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComM_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1534AlbEComP, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtAlbEComP_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComP_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), ".", "")));
      Grid2Column.AddObjectProperty("Title", GXutil.rtrim( edtAlbEComPre_Title));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbEComPre_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtBarSer_Internalname = "BARSER" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtBarOpeEsp_Internalname = "BAROPEESP" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtBarPreMtr_Internalname = "BARPREMTR" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlbProEsp_Internalname = "ALBPROESP" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlbProRec_Internalname = "ALBPROREC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtBarDibCli_Internalname = "BARDIBCLI" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarDibInt_Internalname = "BARDIBINT" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtConMtsBar_Internalname = "CONMTSBAR" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtConPieBar_Internalname = "CONPIEBAR" ;
      edtavnRcdDeleted_533_Internalname = "vNRCDDELETED_533" ;
      edtDisComLin_Internalname = "DISCOMLIN" ;
      edtDisComCod_Internalname = "DISCOMCOD" ;
      edtFonCod_Internalname = "FONCOD" ;
      edtAlbEComM_Internalname = "ALBECOMM" ;
      edtAlbEComP_Internalname = "ALBECOMP" ;
      edtAlbEComPre_Internalname = "ALBECOMPRE" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock15_Caption = httpContext.getMessage( "ConPieBar", "") ;
      lblTextblock14_Caption = httpContext.getMessage( "ConMtsBar", "") ;
      lblTextblock13_Caption = httpContext.getMessage( "Dibujo Interno en Hoja Ruta", "") ;
      lblTextblock12_Caption = httpContext.getMessage( "Dibujo Cliente en Hoja Ruta", "") ;
      lblTextblock11_Caption = httpContext.getMessage( "Recargo Albaran", "") ;
      lblTextblock10_Caption = httpContext.getMessage( "Albaran Pendiente Confirmacion", "") ;
      lblTextblock9_Caption = httpContext.getMessage( "Precio Metro", "") ;
      lblTextblock8_Caption = httpContext.getMessage( "Operacion Especial", "") ;
      lblTextblock7_Caption = httpContext.getMessage( "Serie", "") ;
      lblTextblock6_Caption = httpContext.getMessage( "Codigo Particion Barcada", "") ;
      lblTextblock5_Caption = httpContext.getMessage( "Codigo Reoperado Barcada", "") ;
      lblTextblock4_Caption = httpContext.getMessage( "Codigo Barcada", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "CONFIRMACION DE PRECIOS", "") );
      edtAlbEComPre_Jsonclick = "" ;
      edtAlbEComP_Jsonclick = "" ;
      edtAlbEComM_Jsonclick = "" ;
      edtFonCod_Jsonclick = "" ;
      edtDisComCod_Jsonclick = "" ;
      edtDisComLin_Jsonclick = "" ;
      edtavnRcdDeleted_533_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtConPieBar_Jsonclick = "" ;
      edtConMtsBar_Jsonclick = "" ;
      edtBarDibInt_Jsonclick = "" ;
      edtBarDibCli_Jsonclick = "" ;
      edtAlbProRec_Jsonclick = "" ;
      edtAlbProEsp_Jsonclick = "" ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarOpeEsp_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtAlbEComPre_Enabled = 1 ;
      edtAlbEComPre_Title = httpContext.getMessage( "Precio por Combinacion", "") ;
      edtAlbEComP_Enabled = 1 ;
      edtAlbEComP_Title = httpContext.getMessage( "Piezas Lanzadas", "") ;
      edtAlbEComM_Enabled = 1 ;
      edtAlbEComM_Title = httpContext.getMessage( "Metros Lanzados", "") ;
      edtFonCod_Enabled = 1 ;
      edtFonCod_Title = httpContext.getMessage( "Código de Fondo", "") ;
      edtDisComCod_Enabled = 1 ;
      edtDisComCod_Title = httpContext.getMessage( "Código Combinación", "") ;
      edtDisComLin_Enabled = 1 ;
      edtDisComLin_Title = httpContext.getMessage( "Linea Combinacion", "") ;
      edtavnRcdDeleted_533_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtConPieBar_Enabled = 0 ;
      edtConMtsBar_Enabled = 0 ;
      edtBarDibInt_Enabled = 0 ;
      edtBarDibCli_Enabled = 0 ;
      edtAlbProRec_Enabled = 1 ;
      edtAlbProEsp_Enabled = 1 ;
      edtBarPreMtr_Enabled = 1 ;
      edtBarOpeEsp_Enabled = 0 ;
      edtBarSer_Enabled = 0 ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbProCod_Enabled = 1 ;
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

   public void xc_14_FO533( String A396EmprCod ,
                            long A30AlbProCod ,
                            int A129BarCod ,
                            byte A132BarCodReo ,
                            String A130BarCodPar ,
                            byte A2524DisComLin ,
                            String A1056DisComCod ,
                            String A1032FonCod ,
                            java.math.BigDecimal A1536AlbEComPre )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char9[0] = A396EmprCod ;
         GXv_int5[0] = A30AlbProCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int8[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_int7[0] = A2524DisComLin ;
         GXv_char3[0] = A1056DisComCod ;
         GXv_char2[0] = A1032FonCod ;
         GXv_decimal10[0] = A1536AlbEComPre ;
         new app.pactpco(remoteHandle, context).execute( GXv_char9, GXv_int5, GXv_int6, GXv_int8, GXv_char4, GXv_int7, GXv_char3, GXv_char2, GXv_decimal10) ;
         A396EmprCod = GXv_char9[0] ;
         A30AlbProCod = GXv_int5[0] ;
         A129BarCod = GXv_int6[0] ;
         A132BarCodReo = GXv_int8[0] ;
         A130BarCodPar = GXv_char4[0] ;
         A2524DisComLin = GXv_int7[0] ;
         A1056DisComCod = GXv_char3[0] ;
         A1032FonCod = GXv_char2[0] ;
         A1536AlbEComPre = GXv_decimal10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A130BarCodPar))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2524DisComLin, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1056DisComCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1032FonCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1536AlbEComPre, (byte)(13), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_15_FO533( )
   {
      if ( true /* After */ )
      {
         httpContext.wjLoc = formatLink("app.talbfae", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar"})  ;
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
      subsflControlProps_35195( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalFO195( ) ;
         standaloneModalFO195( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowFO195( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_35_idx = (int)(nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_35195( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_102533( ) ;
      while ( nGXsfl_102_idx <= nRC_GXsfl_102 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalFO195( ) ;
         standaloneModalFO195( ) ;
         standaloneNotModalFO533( ) ;
         standaloneModalFO533( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowFO533( ) ;
         nGXsfl_102_idx = (int)(nGXsfl_102_idx+1) ;
         sGXsfl_102_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_102_idx), 4, 0), (short)(4), "0") + sGXsfl_35_idx ;
         subsflControlProps_102533( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T00FO59 */
      pr_default.execute(53, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00FO59_A407EmprNom[0] ;
      n407EmprNom = T00FO59_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(53);
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

   public void valid_Albprocod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      /* Using cursor T00FO33 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A212BarSer = T00FO33_A212BarSer[0] ;
      A193BarOpeEsp = T00FO33_A193BarOpeEsp[0] ;
      A1798BarDibCli = T00FO33_A1798BarDibCli[0] ;
      A1799BarDibInt = T00FO33_A1799BarDibInt[0] ;
      pr_default.close(28);
      /* Using cursor T00FO35 */
      pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A1754ConMtsBar = T00FO35_A1754ConMtsBar[0] ;
         A1755ConPieBar = T00FO35_A1755ConPieBar[0] ;
      }
      else
      {
         A1754ConMtsBar = DecimalUtil.doubleToDec(0) ;
         A1755ConPieBar = (short)(0) ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A193BarOpeEsp", GXutil.ltrim( localUtil.ntoc( A193BarOpeEsp, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1798BarDibCli", GXutil.rtrim( A1798BarDibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1799BarDibInt", GXutil.ltrim( localUtil.ntoc( A1799BarDibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1754ConMtsBar", GXutil.ltrim( localUtil.ntoc( A1754ConMtsBar, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1755ConPieBar", GXutil.ltrim( localUtil.ntoc( A1755ConPieBar, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'CONFIRMAR PRECIO'","{handler:'e12FO2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("'CONFIRMAR PRECIO'",",oparms:[{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV30Lit10',fld:'vLIT10',pic:''},{av:'AV31Lit11',fld:'vLIT11',pic:''},{av:'AV32Lit12',fld:'vLIT12',pic:''},{av:'AV33Lit13',fld:'vLIT13',pic:''},{av:'AV34Lit14',fld:'vLIT14',pic:''},{av:'AV35Lit15',fld:'vLIT15',pic:''}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A193BarOpeEsp',fld:'BAROPEESP',pic:'99'},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'A1754ConMtsBar',fld:'CONMTSBAR',pic:'ZZZZZ9.99'},{av:'A1755ConPieBar',fld:'CONPIEBAR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A193BarOpeEsp',fld:'BAROPEESP',pic:'99'},{av:'A1798BarDibCli',fld:'BARDIBCLI',pic:''},{av:'A1799BarDibInt',fld:'BARDIBINT',pic:'ZZZZZZZ9'},{av:'A1754ConMtsBar',fld:'CONMTSBAR',pic:'ZZZZZ9.99'},{av:'A1755ConPieBar',fld:'CONPIEBAR',pic:'ZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Conpiebar',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_DISCOMLIN","{handler:'valid_Discomlin',iparms:[]");
      setEventMetadata("VALID_DISCOMLIN",",oparms:[]}");
      setEventMetadata("VALID_DISCOMCOD","{handler:'valid_Discomcod',iparms:[]");
      setEventMetadata("VALID_DISCOMCOD",",oparms:[]}");
      setEventMetadata("VALID_FONCOD","{handler:'valid_Foncod',iparms:[]");
      setEventMetadata("VALID_FONCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBECOMM","{handler:'valid_Albecomm',iparms:[]");
      setEventMetadata("VALID_ALBECOMM",",oparms:[]}");
      setEventMetadata("VALID_ALBECOMP","{handler:'valid_Albecomp',iparms:[]");
      setEventMetadata("VALID_ALBECOMP",",oparms:[]}");
      setEventMetadata("VALID_ALBECOMPRE","{handler:'valid_Albecompre',iparms:[]");
      setEventMetadata("VALID_ALBECOMPRE",",oparms:[]}");
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
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(53);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      O1754ConMtsBar = DecimalUtil.ZERO ;
      Z1056DisComCod = "" ;
      Z1032FonCod = "" ;
      Z1533AlbEComM = DecimalUtil.ZERO ;
      Z1536AlbEComPre = DecimalUtil.ZERO ;
      O1533AlbEComM = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1056DisComCod = "" ;
      A1032FonCod = "" ;
      A1536AlbEComPre = DecimalUtil.ZERO ;
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
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode195 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV30Lit10 = "" ;
      AV31Lit11 = "" ;
      AV32Lit12 = "" ;
      AV33Lit13 = "" ;
      AV34Lit14 = "" ;
      AV35Lit15 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode3 = "" ;
      s1754ConMtsBar = DecimalUtil.ZERO ;
      A1754ConMtsBar = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      T1533AlbEComM = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1798BarDibCli = "" ;
      T1754ConMtsBar = DecimalUtil.ZERO ;
      AV19Lit0 = "" ;
      AV20LitFe = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV21Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      GXt_char1 = "" ;
      AV36Lit16 = "" ;
      Z407EmprNom = "" ;
      T00FO11_A407EmprNom = new String[] {""} ;
      T00FO11_n407EmprNom = new boolean[] {false} ;
      T00FO12_A30AlbProCod = new long[1] ;
      T00FO12_A407EmprNom = new String[] {""} ;
      T00FO12_n407EmprNom = new boolean[] {false} ;
      T00FO12_A396EmprCod = new String[] {""} ;
      T00FO13_A396EmprCod = new String[] {""} ;
      T00FO13_A30AlbProCod = new long[1] ;
      T00FO10_A30AlbProCod = new long[1] ;
      T00FO10_A396EmprCod = new String[] {""} ;
      T00FO14_A396EmprCod = new String[] {""} ;
      T00FO14_A30AlbProCod = new long[1] ;
      T00FO15_A396EmprCod = new String[] {""} ;
      T00FO15_A30AlbProCod = new long[1] ;
      T00FO9_A30AlbProCod = new long[1] ;
      T00FO9_A396EmprCod = new String[] {""} ;
      T00FO18_A396EmprCod = new String[] {""} ;
      T00FO18_A30AlbProCod = new long[1] ;
      T00FO18_A12185DltLinObs = new byte[1] ;
      T00FO19_A396EmprCod = new String[] {""} ;
      T00FO19_A30AlbProCod = new long[1] ;
      T00FO19_A12176DltHdr = new int[1] ;
      T00FO19_A12177DltR = new byte[1] ;
      T00FO19_A12178DltP = new String[] {""} ;
      T00FO20_A396EmprCod = new String[] {""} ;
      T00FO20_A30AlbProCod = new long[1] ;
      T00FO20_A7540Alb_NFisca = new String[] {""} ;
      T00FO21_A396EmprCod = new String[] {""} ;
      T00FO21_A30AlbProCod = new long[1] ;
      T00FO21_A129BarCod = new int[1] ;
      T00FO21_A132BarCodReo = new byte[1] ;
      T00FO21_A130BarCodPar = new String[] {""} ;
      T00FO22_A396EmprCod = new String[] {""} ;
      T00FO22_A30AlbProCod = new long[1] ;
      T00FO22_A915AlbPObsLin = new byte[1] ;
      T00FO23_A396EmprCod = new String[] {""} ;
      T00FO23_A30AlbProCod = new long[1] ;
      Z212BarSer = "" ;
      Z1798BarDibCli = "" ;
      Z1754ConMtsBar = DecimalUtil.ZERO ;
      T00FO25_A30AlbProCod = new long[1] ;
      T00FO25_A212BarSer = new String[] {""} ;
      T00FO25_A193BarOpeEsp = new byte[1] ;
      T00FO25_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO25_A32AlbProEsp = new byte[1] ;
      T00FO25_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO25_A1798BarDibCli = new String[] {""} ;
      T00FO25_A1799BarDibInt = new int[1] ;
      T00FO25_A396EmprCod = new String[] {""} ;
      T00FO25_A129BarCod = new int[1] ;
      T00FO25_A132BarCodReo = new byte[1] ;
      T00FO25_A130BarCodPar = new String[] {""} ;
      T00FO25_A1754ConMtsBar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO25_A1755ConPieBar = new short[1] ;
      T00FO6_A212BarSer = new String[] {""} ;
      T00FO6_A193BarOpeEsp = new byte[1] ;
      T00FO6_A1798BarDibCli = new String[] {""} ;
      T00FO6_A1799BarDibInt = new int[1] ;
      T00FO8_A1754ConMtsBar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO8_A1755ConPieBar = new short[1] ;
      T00FO26_A212BarSer = new String[] {""} ;
      T00FO26_A193BarOpeEsp = new byte[1] ;
      T00FO26_A1798BarDibCli = new String[] {""} ;
      T00FO26_A1799BarDibInt = new int[1] ;
      T00FO28_A1754ConMtsBar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO28_A1755ConPieBar = new short[1] ;
      T00FO29_A396EmprCod = new String[] {""} ;
      T00FO29_A30AlbProCod = new long[1] ;
      T00FO29_A129BarCod = new int[1] ;
      T00FO29_A132BarCodReo = new byte[1] ;
      T00FO29_A130BarCodPar = new String[] {""} ;
      T00FO5_A30AlbProCod = new long[1] ;
      T00FO5_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO5_A32AlbProEsp = new byte[1] ;
      T00FO5_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO5_A396EmprCod = new String[] {""} ;
      T00FO5_A129BarCod = new int[1] ;
      T00FO5_A132BarCodReo = new byte[1] ;
      T00FO5_A130BarCodPar = new String[] {""} ;
      T00FO4_A30AlbProCod = new long[1] ;
      T00FO4_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO4_A32AlbProEsp = new byte[1] ;
      T00FO4_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO4_A396EmprCod = new String[] {""} ;
      T00FO4_A129BarCod = new int[1] ;
      T00FO4_A132BarCodReo = new byte[1] ;
      T00FO4_A130BarCodPar = new String[] {""} ;
      T00FO33_A212BarSer = new String[] {""} ;
      T00FO33_A193BarOpeEsp = new byte[1] ;
      T00FO33_A1798BarDibCli = new String[] {""} ;
      T00FO33_A1799BarDibInt = new int[1] ;
      T00FO35_A1754ConMtsBar = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO35_A1755ConPieBar = new short[1] ;
      T00FO36_A396EmprCod = new String[] {""} ;
      T00FO36_A30AlbProCod = new long[1] ;
      T00FO36_A129BarCod = new int[1] ;
      T00FO36_A132BarCodReo = new byte[1] ;
      T00FO36_A130BarCodPar = new String[] {""} ;
      T00FO36_A6648AlbMetLin = new short[1] ;
      T00FO37_A396EmprCod = new String[] {""} ;
      T00FO37_A30AlbProCod = new long[1] ;
      T00FO37_A129BarCod = new int[1] ;
      T00FO37_A132BarCodReo = new byte[1] ;
      T00FO37_A130BarCodPar = new String[] {""} ;
      T00FO37_A9639Et_Numero = new short[1] ;
      T00FO38_A396EmprCod = new String[] {""} ;
      T00FO38_A30AlbProCod = new long[1] ;
      T00FO38_A129BarCod = new int[1] ;
      T00FO38_A132BarCodReo = new byte[1] ;
      T00FO38_A130BarCodPar = new String[] {""} ;
      T00FO38_A6622AlbHdRLn = new short[1] ;
      T00FO39_A396EmprCod = new String[] {""} ;
      T00FO39_A30AlbProCod = new long[1] ;
      T00FO39_A129BarCod = new int[1] ;
      T00FO39_A132BarCodReo = new byte[1] ;
      T00FO39_A130BarCodPar = new String[] {""} ;
      T00FO39_A5456P_ForLin = new short[1] ;
      T00FO40_A396EmprCod = new String[] {""} ;
      T00FO40_A30AlbProCod = new long[1] ;
      T00FO40_A129BarCod = new int[1] ;
      T00FO40_A132BarCodReo = new byte[1] ;
      T00FO40_A130BarCodPar = new String[] {""} ;
      T00FO40_A2524DisComLin = new byte[1] ;
      T00FO40_A1056DisComCod = new String[] {""} ;
      T00FO40_A1032FonCod = new String[] {""} ;
      T00FO40_A2666ProceCodA = new short[1] ;
      T00FO41_A396EmprCod = new String[] {""} ;
      T00FO41_A3617AlbTrnCod = new long[1] ;
      T00FO41_A30AlbProCod = new long[1] ;
      T00FO41_A129BarCod = new int[1] ;
      T00FO41_A132BarCodReo = new byte[1] ;
      T00FO41_A130BarCodPar = new String[] {""} ;
      T00FO42_A396EmprCod = new String[] {""} ;
      T00FO42_A30AlbProCod = new long[1] ;
      T00FO42_A129BarCod = new int[1] ;
      T00FO42_A132BarCodReo = new byte[1] ;
      T00FO42_A130BarCodPar = new String[] {""} ;
      T00FO42_A3621AlbPckLin = new short[1] ;
      T00FO43_A396EmprCod = new String[] {""} ;
      T00FO43_A30AlbProCod = new long[1] ;
      T00FO43_A129BarCod = new int[1] ;
      T00FO43_A132BarCodReo = new byte[1] ;
      T00FO43_A130BarCodPar = new String[] {""} ;
      T00FO43_A2764AlbHdrLin = new short[1] ;
      T00FO44_A396EmprCod = new String[] {""} ;
      T00FO44_A30AlbProCod = new long[1] ;
      T00FO44_A129BarCod = new int[1] ;
      T00FO44_A132BarCodReo = new byte[1] ;
      T00FO44_A130BarCodPar = new String[] {""} ;
      T00FO44_A1468AlbPrdLin = new short[1] ;
      T00FO45_A396EmprCod = new String[] {""} ;
      T00FO45_A30AlbProCod = new long[1] ;
      T00FO45_A129BarCod = new int[1] ;
      T00FO45_A132BarCodReo = new byte[1] ;
      T00FO45_A130BarCodPar = new String[] {""} ;
      T00FO45_A200BarPieCod = new String[] {""} ;
      T00FO46_A396EmprCod = new String[] {""} ;
      T00FO46_A30AlbProCod = new long[1] ;
      T00FO46_A129BarCod = new int[1] ;
      T00FO46_A132BarCodReo = new byte[1] ;
      T00FO46_A130BarCodPar = new String[] {""} ;
      T00FO46_A1240GuiFasLin = new short[1] ;
      T00FO47_A396EmprCod = new String[] {""} ;
      T00FO47_A30AlbProCod = new long[1] ;
      T00FO47_A129BarCod = new int[1] ;
      T00FO47_A132BarCodReo = new byte[1] ;
      T00FO47_A130BarCodPar = new String[] {""} ;
      T00FO48_A30AlbProCod = new long[1] ;
      T00FO48_A2524DisComLin = new byte[1] ;
      T00FO48_A1056DisComCod = new String[] {""} ;
      T00FO48_A1032FonCod = new String[] {""} ;
      T00FO48_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO48_n1533AlbEComM = new boolean[] {false} ;
      T00FO48_A1534AlbEComP = new short[1] ;
      T00FO48_n1534AlbEComP = new boolean[] {false} ;
      T00FO48_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO48_n1536AlbEComPre = new boolean[] {false} ;
      T00FO48_A396EmprCod = new String[] {""} ;
      T00FO48_A129BarCod = new int[1] ;
      T00FO48_A132BarCodReo = new byte[1] ;
      T00FO48_A130BarCodPar = new String[] {""} ;
      T00FO49_A396EmprCod = new String[] {""} ;
      T00FO49_A30AlbProCod = new long[1] ;
      T00FO49_A129BarCod = new int[1] ;
      T00FO49_A132BarCodReo = new byte[1] ;
      T00FO49_A130BarCodPar = new String[] {""} ;
      T00FO49_A2524DisComLin = new byte[1] ;
      T00FO49_A1056DisComCod = new String[] {""} ;
      T00FO49_A1032FonCod = new String[] {""} ;
      T00FO3_A30AlbProCod = new long[1] ;
      T00FO3_A2524DisComLin = new byte[1] ;
      T00FO3_A1056DisComCod = new String[] {""} ;
      T00FO3_A1032FonCod = new String[] {""} ;
      T00FO3_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO3_n1533AlbEComM = new boolean[] {false} ;
      T00FO3_A1534AlbEComP = new short[1] ;
      T00FO3_n1534AlbEComP = new boolean[] {false} ;
      T00FO3_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO3_n1536AlbEComPre = new boolean[] {false} ;
      T00FO3_A396EmprCod = new String[] {""} ;
      T00FO3_A129BarCod = new int[1] ;
      T00FO3_A132BarCodReo = new byte[1] ;
      T00FO3_A130BarCodPar = new String[] {""} ;
      sMode533 = "" ;
      T00FO2_A30AlbProCod = new long[1] ;
      T00FO2_A2524DisComLin = new byte[1] ;
      T00FO2_A1056DisComCod = new String[] {""} ;
      T00FO2_A1032FonCod = new String[] {""} ;
      T00FO2_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO2_n1533AlbEComM = new boolean[] {false} ;
      T00FO2_A1534AlbEComP = new short[1] ;
      T00FO2_n1534AlbEComP = new boolean[] {false} ;
      T00FO2_A1536AlbEComPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00FO2_n1536AlbEComPre = new boolean[] {false} ;
      T00FO2_A396EmprCod = new String[] {""} ;
      T00FO2_A129BarCod = new int[1] ;
      T00FO2_A132BarCodReo = new byte[1] ;
      T00FO2_A130BarCodPar = new String[] {""} ;
      T00FO53_A396EmprCod = new String[] {""} ;
      T00FO53_A30AlbProCod = new long[1] ;
      T00FO53_A129BarCod = new int[1] ;
      T00FO53_A132BarCodReo = new byte[1] ;
      T00FO53_A130BarCodPar = new String[] {""} ;
      T00FO53_A2524DisComLin = new byte[1] ;
      T00FO53_A1056DisComCod = new String[] {""} ;
      T00FO53_A1032FonCod = new String[] {""} ;
      T00FO53_A200BarPieCod = new String[] {""} ;
      T00FO54_A396EmprCod = new String[] {""} ;
      T00FO54_A30AlbProCod = new long[1] ;
      T00FO54_A129BarCod = new int[1] ;
      T00FO54_A132BarCodReo = new byte[1] ;
      T00FO54_A130BarCodPar = new String[] {""} ;
      T00FO54_A2524DisComLin = new byte[1] ;
      T00FO54_A1056DisComCod = new String[] {""} ;
      T00FO54_A1032FonCod = new String[] {""} ;
      T00FO54_A4433DisComTro = new short[1] ;
      T00FO55_A396EmprCod = new String[] {""} ;
      T00FO55_A30AlbProCod = new long[1] ;
      T00FO55_A129BarCod = new int[1] ;
      T00FO55_A132BarCodReo = new byte[1] ;
      T00FO55_A130BarCodPar = new String[] {""} ;
      T00FO55_A2524DisComLin = new byte[1] ;
      T00FO55_A1056DisComCod = new String[] {""} ;
      T00FO55_A1032FonCod = new String[] {""} ;
      T00FO55_A4336AlbEstPLin = new short[1] ;
      T00FO56_A396EmprCod = new String[] {""} ;
      T00FO56_A30AlbProCod = new long[1] ;
      T00FO56_A129BarCod = new int[1] ;
      T00FO56_A132BarCodReo = new byte[1] ;
      T00FO56_A130BarCodPar = new String[] {""} ;
      T00FO56_A2524DisComLin = new byte[1] ;
      T00FO56_A1056DisComCod = new String[] {""} ;
      T00FO56_A1032FonCod = new String[] {""} ;
      T00FO56_A1761ExtCod = new short[1] ;
      T00FO57_A396EmprCod = new String[] {""} ;
      T00FO57_A30AlbProCod = new long[1] ;
      T00FO57_A129BarCod = new int[1] ;
      T00FO57_A132BarCodReo = new byte[1] ;
      T00FO57_A130BarCodPar = new String[] {""} ;
      T00FO57_A2524DisComLin = new byte[1] ;
      T00FO57_A1056DisComCod = new String[] {""} ;
      T00FO57_A1032FonCod = new String[] {""} ;
      T00FO57_A2666ProceCodA = new short[1] ;
      T00FO58_A396EmprCod = new String[] {""} ;
      T00FO58_A30AlbProCod = new long[1] ;
      T00FO58_A129BarCod = new int[1] ;
      T00FO58_A132BarCodReo = new byte[1] ;
      T00FO58_A130BarCodPar = new String[] {""} ;
      T00FO58_A2524DisComLin = new byte[1] ;
      T00FO58_A1056DisComCod = new String[] {""} ;
      T00FO58_A1032FonCod = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock4_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      B1754ConMtsBar = DecimalUtil.ZERO ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char9 = new String[1] ;
      GXv_int5 = new long[1] ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      T00FO59_A407EmprNom = new String[] {""} ;
      T00FO59_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tconale__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tconale__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tconale__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tconale__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tconale__default(),
         new Object[] {
             new Object[] {
            T00FO2_A30AlbProCod, T00FO2_A2524DisComLin, T00FO2_A1056DisComCod, T00FO2_A1032FonCod, T00FO2_A1533AlbEComM, T00FO2_n1533AlbEComM, T00FO2_A1534AlbEComP, T00FO2_n1534AlbEComP, T00FO2_A1536AlbEComPre, T00FO2_n1536AlbEComPre,
            T00FO2_A396EmprCod, T00FO2_A129BarCod, T00FO2_A132BarCodReo, T00FO2_A130BarCodPar
            }
            , new Object[] {
            T00FO3_A30AlbProCod, T00FO3_A2524DisComLin, T00FO3_A1056DisComCod, T00FO3_A1032FonCod, T00FO3_A1533AlbEComM, T00FO3_n1533AlbEComM, T00FO3_A1534AlbEComP, T00FO3_n1534AlbEComP, T00FO3_A1536AlbEComPre, T00FO3_n1536AlbEComPre,
            T00FO3_A396EmprCod, T00FO3_A129BarCod, T00FO3_A132BarCodReo, T00FO3_A130BarCodPar
            }
            , new Object[] {
            T00FO4_A30AlbProCod, T00FO4_A1264BarPreMtr, T00FO4_A32AlbProEsp, T00FO4_A40AlbProRec, T00FO4_A396EmprCod, T00FO4_A129BarCod, T00FO4_A132BarCodReo, T00FO4_A130BarCodPar
            }
            , new Object[] {
            T00FO5_A30AlbProCod, T00FO5_A1264BarPreMtr, T00FO5_A32AlbProEsp, T00FO5_A40AlbProRec, T00FO5_A396EmprCod, T00FO5_A129BarCod, T00FO5_A132BarCodReo, T00FO5_A130BarCodPar
            }
            , new Object[] {
            T00FO6_A212BarSer, T00FO6_A193BarOpeEsp, T00FO6_A1798BarDibCli, T00FO6_A1799BarDibInt
            }
            , new Object[] {
            T00FO8_A1754ConMtsBar, T00FO8_A1755ConPieBar
            }
            , new Object[] {
            T00FO9_A30AlbProCod, T00FO9_A396EmprCod
            }
            , new Object[] {
            T00FO10_A30AlbProCod, T00FO10_A396EmprCod
            }
            , new Object[] {
            T00FO11_A407EmprNom, T00FO11_n407EmprNom
            }
            , new Object[] {
            T00FO12_A30AlbProCod, T00FO12_A407EmprNom, T00FO12_n407EmprNom, T00FO12_A396EmprCod
            }
            , new Object[] {
            T00FO13_A396EmprCod, T00FO13_A30AlbProCod
            }
            , new Object[] {
            T00FO14_A396EmprCod, T00FO14_A30AlbProCod
            }
            , new Object[] {
            T00FO15_A396EmprCod, T00FO15_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FO18_A396EmprCod, T00FO18_A30AlbProCod, T00FO18_A12185DltLinObs
            }
            , new Object[] {
            T00FO19_A396EmprCod, T00FO19_A30AlbProCod, T00FO19_A12176DltHdr, T00FO19_A12177DltR, T00FO19_A12178DltP
            }
            , new Object[] {
            T00FO20_A396EmprCod, T00FO20_A30AlbProCod, T00FO20_A7540Alb_NFisca
            }
            , new Object[] {
            T00FO21_A396EmprCod, T00FO21_A30AlbProCod, T00FO21_A129BarCod, T00FO21_A132BarCodReo, T00FO21_A130BarCodPar
            }
            , new Object[] {
            T00FO22_A396EmprCod, T00FO22_A30AlbProCod, T00FO22_A915AlbPObsLin
            }
            , new Object[] {
            T00FO23_A396EmprCod, T00FO23_A30AlbProCod
            }
            , new Object[] {
            T00FO25_A30AlbProCod, T00FO25_A212BarSer, T00FO25_A193BarOpeEsp, T00FO25_A1264BarPreMtr, T00FO25_A32AlbProEsp, T00FO25_A40AlbProRec, T00FO25_A1798BarDibCli, T00FO25_A1799BarDibInt, T00FO25_A396EmprCod, T00FO25_A129BarCod,
            T00FO25_A132BarCodReo, T00FO25_A130BarCodPar, T00FO25_A1754ConMtsBar, T00FO25_A1755ConPieBar
            }
            , new Object[] {
            T00FO26_A212BarSer, T00FO26_A193BarOpeEsp, T00FO26_A1798BarDibCli, T00FO26_A1799BarDibInt
            }
            , new Object[] {
            T00FO28_A1754ConMtsBar, T00FO28_A1755ConPieBar
            }
            , new Object[] {
            T00FO29_A396EmprCod, T00FO29_A30AlbProCod, T00FO29_A129BarCod, T00FO29_A132BarCodReo, T00FO29_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FO33_A212BarSer, T00FO33_A193BarOpeEsp, T00FO33_A1798BarDibCli, T00FO33_A1799BarDibInt
            }
            , new Object[] {
            T00FO35_A1754ConMtsBar, T00FO35_A1755ConPieBar
            }
            , new Object[] {
            T00FO36_A396EmprCod, T00FO36_A30AlbProCod, T00FO36_A129BarCod, T00FO36_A132BarCodReo, T00FO36_A130BarCodPar, T00FO36_A6648AlbMetLin
            }
            , new Object[] {
            T00FO37_A396EmprCod, T00FO37_A30AlbProCod, T00FO37_A129BarCod, T00FO37_A132BarCodReo, T00FO37_A130BarCodPar, T00FO37_A9639Et_Numero
            }
            , new Object[] {
            T00FO38_A396EmprCod, T00FO38_A30AlbProCod, T00FO38_A129BarCod, T00FO38_A132BarCodReo, T00FO38_A130BarCodPar, T00FO38_A6622AlbHdRLn
            }
            , new Object[] {
            T00FO39_A396EmprCod, T00FO39_A30AlbProCod, T00FO39_A129BarCod, T00FO39_A132BarCodReo, T00FO39_A130BarCodPar, T00FO39_A5456P_ForLin
            }
            , new Object[] {
            T00FO40_A396EmprCod, T00FO40_A30AlbProCod, T00FO40_A129BarCod, T00FO40_A132BarCodReo, T00FO40_A130BarCodPar, T00FO40_A2524DisComLin, T00FO40_A1056DisComCod, T00FO40_A1032FonCod, T00FO40_A2666ProceCodA
            }
            , new Object[] {
            T00FO41_A396EmprCod, T00FO41_A3617AlbTrnCod, T00FO41_A30AlbProCod, T00FO41_A129BarCod, T00FO41_A132BarCodReo, T00FO41_A130BarCodPar
            }
            , new Object[] {
            T00FO42_A396EmprCod, T00FO42_A30AlbProCod, T00FO42_A129BarCod, T00FO42_A132BarCodReo, T00FO42_A130BarCodPar, T00FO42_A3621AlbPckLin
            }
            , new Object[] {
            T00FO43_A396EmprCod, T00FO43_A30AlbProCod, T00FO43_A129BarCod, T00FO43_A132BarCodReo, T00FO43_A130BarCodPar, T00FO43_A2764AlbHdrLin
            }
            , new Object[] {
            T00FO44_A396EmprCod, T00FO44_A30AlbProCod, T00FO44_A129BarCod, T00FO44_A132BarCodReo, T00FO44_A130BarCodPar, T00FO44_A1468AlbPrdLin
            }
            , new Object[] {
            T00FO45_A396EmprCod, T00FO45_A30AlbProCod, T00FO45_A129BarCod, T00FO45_A132BarCodReo, T00FO45_A130BarCodPar, T00FO45_A200BarPieCod
            }
            , new Object[] {
            T00FO46_A396EmprCod, T00FO46_A30AlbProCod, T00FO46_A129BarCod, T00FO46_A132BarCodReo, T00FO46_A130BarCodPar, T00FO46_A1240GuiFasLin
            }
            , new Object[] {
            T00FO47_A396EmprCod, T00FO47_A30AlbProCod, T00FO47_A129BarCod, T00FO47_A132BarCodReo, T00FO47_A130BarCodPar
            }
            , new Object[] {
            T00FO48_A30AlbProCod, T00FO48_A2524DisComLin, T00FO48_A1056DisComCod, T00FO48_A1032FonCod, T00FO48_A1533AlbEComM, T00FO48_n1533AlbEComM, T00FO48_A1534AlbEComP, T00FO48_n1534AlbEComP, T00FO48_A1536AlbEComPre, T00FO48_n1536AlbEComPre,
            T00FO48_A396EmprCod, T00FO48_A129BarCod, T00FO48_A132BarCodReo, T00FO48_A130BarCodPar
            }
            , new Object[] {
            T00FO49_A396EmprCod, T00FO49_A30AlbProCod, T00FO49_A129BarCod, T00FO49_A132BarCodReo, T00FO49_A130BarCodPar, T00FO49_A2524DisComLin, T00FO49_A1056DisComCod, T00FO49_A1032FonCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00FO53_A396EmprCod, T00FO53_A30AlbProCod, T00FO53_A129BarCod, T00FO53_A132BarCodReo, T00FO53_A130BarCodPar, T00FO53_A2524DisComLin, T00FO53_A1056DisComCod, T00FO53_A1032FonCod, T00FO53_A200BarPieCod
            }
            , new Object[] {
            T00FO54_A396EmprCod, T00FO54_A30AlbProCod, T00FO54_A129BarCod, T00FO54_A132BarCodReo, T00FO54_A130BarCodPar, T00FO54_A2524DisComLin, T00FO54_A1056DisComCod, T00FO54_A1032FonCod, T00FO54_A4433DisComTro
            }
            , new Object[] {
            T00FO55_A396EmprCod, T00FO55_A30AlbProCod, T00FO55_A129BarCod, T00FO55_A132BarCodReo, T00FO55_A130BarCodPar, T00FO55_A2524DisComLin, T00FO55_A1056DisComCod, T00FO55_A1032FonCod, T00FO55_A4336AlbEstPLin
            }
            , new Object[] {
            T00FO56_A396EmprCod, T00FO56_A30AlbProCod, T00FO56_A129BarCod, T00FO56_A132BarCodReo, T00FO56_A130BarCodPar, T00FO56_A2524DisComLin, T00FO56_A1056DisComCod, T00FO56_A1032FonCod, T00FO56_A1761ExtCod
            }
            , new Object[] {
            T00FO57_A396EmprCod, T00FO57_A30AlbProCod, T00FO57_A129BarCod, T00FO57_A132BarCodReo, T00FO57_A130BarCodPar, T00FO57_A2524DisComLin, T00FO57_A1056DisComCod, T00FO57_A1032FonCod, T00FO57_A2666ProceCodA
            }
            , new Object[] {
            T00FO58_A396EmprCod, T00FO58_A30AlbProCod, T00FO58_A129BarCod, T00FO58_A132BarCodReo, T00FO58_A130BarCodPar, T00FO58_A2524DisComLin, T00FO58_A1056DisComCod, T00FO58_A1032FonCod
            }
            , new Object[] {
            T00FO59_A407EmprNom, T00FO59_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z132BarCodReo ;
   private byte Z32AlbProEsp ;
   private byte Z2524DisComLin ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A2524DisComLin ;
   private byte nKeyPressed ;
   private byte A193BarOpeEsp ;
   private byte A32AlbProEsp ;
   private byte Gx_BScreen ;
   private byte Z193BarOpeEsp ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte GXv_int8[] ;
   private byte GXv_int7[] ;
   private short O1755ConPieBar ;
   private short nRcdDeleted_195 ;
   private short nRcdExists_195 ;
   private short nIsMod_195 ;
   private short Z1534AlbEComP ;
   private short O1534AlbEComP ;
   private short nRcdDeleted_533 ;
   private short nRcdExists_533 ;
   private short nIsMod_533 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount195 ;
   private short RcdFound195 ;
   private short nBlankRcdUsr195 ;
   private short s1755ConPieBar ;
   private short A1755ConPieBar ;
   private short RcdFound533 ;
   private short A1534AlbEComP ;
   private short T1534AlbEComP ;
   private short T1755ConPieBar ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private short Z1755ConPieBar ;
   private short nIsDirty_195 ;
   private short nIsDirty_533 ;
   private short nBlankRcdCount533 ;
   private short B1755ConPieBar ;
   private short nBlankRcdUsr533 ;
   private short subGrid1_Borderwidth ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int Z129BarCod ;
   private int nRC_GXsfl_102 ;
   private int nGXsfl_102_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarOpeEsp_Enabled ;
   private int edtBarPreMtr_Enabled ;
   private int edtAlbProEsp_Enabled ;
   private int edtAlbProRec_Enabled ;
   private int edtBarDibCli_Enabled ;
   private int edtBarDibInt_Enabled ;
   private int edtConMtsBar_Enabled ;
   private int edtConPieBar_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_533_Enabled ;
   private int edtDisComLin_Enabled ;
   private int edtDisComCod_Enabled ;
   private int edtFonCod_Enabled ;
   private int edtAlbEComM_Enabled ;
   private int edtAlbEComP_Enabled ;
   private int edtAlbEComPre_Enabled ;
   private int A1799BarDibInt ;
   private int GX_JID ;
   private int Z1799BarDibInt ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtFonCod_Enabled ;
   private int defedtDisComCod_Enabled ;
   private int defedtDisComLin_Enabled ;
   private int defedtBarCodPar_Enabled ;
   private int defedtBarCodReo_Enabled ;
   private int defedtBarCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int6[] ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private long GXv_int5[] ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z1264BarPreMtr ;
   private java.math.BigDecimal Z40AlbProRec ;
   private java.math.BigDecimal O1754ConMtsBar ;
   private java.math.BigDecimal Z1533AlbEComM ;
   private java.math.BigDecimal Z1536AlbEComPre ;
   private java.math.BigDecimal O1533AlbEComM ;
   private java.math.BigDecimal A1536AlbEComPre ;
   private java.math.BigDecimal s1754ConMtsBar ;
   private java.math.BigDecimal A1754ConMtsBar ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal T1533AlbEComM ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal T1754ConMtsBar ;
   private java.math.BigDecimal Z1754ConMtsBar ;
   private java.math.BigDecimal B1754ConMtsBar ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z1056DisComCod ;
   private String Z1032FonCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1056DisComCod ;
   private String A1032FonCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String sGXsfl_35_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_102_idx="0001" ;
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
   private String edtAlbProCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode195 ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodPar_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarOpeEsp_Internalname ;
   private String edtBarPreMtr_Internalname ;
   private String edtAlbProEsp_Internalname ;
   private String edtAlbProRec_Internalname ;
   private String edtBarDibCli_Internalname ;
   private String edtBarDibInt_Internalname ;
   private String edtConMtsBar_Internalname ;
   private String edtConPieBar_Internalname ;
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
   private String AV30Lit10 ;
   private String AV31Lit11 ;
   private String AV32Lit12 ;
   private String AV33Lit13 ;
   private String AV34Lit14 ;
   private String AV35Lit15 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_533_Internalname ;
   private String sMode3 ;
   private String GXCCtl ;
   private String edtDisComLin_Internalname ;
   private String edtDisComCod_Internalname ;
   private String edtFonCod_Internalname ;
   private String edtAlbEComM_Internalname ;
   private String edtAlbEComP_Internalname ;
   private String edtAlbEComPre_Internalname ;
   private String edtDisComLin_Title ;
   private String edtDisComCod_Title ;
   private String edtFonCod_Title ;
   private String edtAlbEComM_Title ;
   private String edtAlbEComP_Title ;
   private String edtAlbEComPre_Title ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String AV19Lit0 ;
   private String AV20LitFe ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String AV21Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String GXt_char1 ;
   private String AV36Lit16 ;
   private String Z407EmprNom ;
   private String Z212BarSer ;
   private String Z1798BarDibCli ;
   private String sMode533 ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock15_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String lblTextblock8_Jsonclick ;
   private String edtBarOpeEsp_Jsonclick ;
   private String lblTextblock9_Jsonclick ;
   private String edtBarPreMtr_Jsonclick ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlbProEsp_Jsonclick ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlbProRec_Jsonclick ;
   private String lblTextblock12_Jsonclick ;
   private String edtBarDibCli_Jsonclick ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarDibInt_Jsonclick ;
   private String lblTextblock14_Jsonclick ;
   private String edtConMtsBar_Jsonclick ;
   private String lblTextblock15_Jsonclick ;
   private String edtConPieBar_Jsonclick ;
   private String sGXsfl_102_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_533_Jsonclick ;
   private String edtDisComLin_Jsonclick ;
   private String edtDisComCod_Jsonclick ;
   private String edtFonCod_Jsonclick ;
   private String edtAlbEComM_Jsonclick ;
   private String edtAlbEComP_Jsonclick ;
   private String edtAlbEComPre_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock4_Caption ;
   private String lblTextblock5_Caption ;
   private String lblTextblock6_Caption ;
   private String lblTextblock7_Caption ;
   private String lblTextblock8_Caption ;
   private String lblTextblock9_Caption ;
   private String lblTextblock10_Caption ;
   private String lblTextblock11_Caption ;
   private String lblTextblock12_Caption ;
   private String lblTextblock13_Caption ;
   private String lblTextblock14_Caption ;
   private String lblTextblock15_Caption ;
   private String subGrid2_Header ;
   private String GXv_char9[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1536AlbEComPre ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean bGXsfl_102_Refreshing=false ;
   private boolean returnInSub ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00FO11_A407EmprNom ;
   private boolean[] T00FO11_n407EmprNom ;
   private long[] T00FO12_A30AlbProCod ;
   private String[] T00FO12_A407EmprNom ;
   private boolean[] T00FO12_n407EmprNom ;
   private String[] T00FO12_A396EmprCod ;
   private String[] T00FO13_A396EmprCod ;
   private long[] T00FO13_A30AlbProCod ;
   private long[] T00FO10_A30AlbProCod ;
   private String[] T00FO10_A396EmprCod ;
   private String[] T00FO14_A396EmprCod ;
   private long[] T00FO14_A30AlbProCod ;
   private String[] T00FO15_A396EmprCod ;
   private long[] T00FO15_A30AlbProCod ;
   private long[] T00FO9_A30AlbProCod ;
   private String[] T00FO9_A396EmprCod ;
   private String[] T00FO18_A396EmprCod ;
   private long[] T00FO18_A30AlbProCod ;
   private byte[] T00FO18_A12185DltLinObs ;
   private String[] T00FO19_A396EmprCod ;
   private long[] T00FO19_A30AlbProCod ;
   private int[] T00FO19_A12176DltHdr ;
   private byte[] T00FO19_A12177DltR ;
   private String[] T00FO19_A12178DltP ;
   private String[] T00FO20_A396EmprCod ;
   private long[] T00FO20_A30AlbProCod ;
   private String[] T00FO20_A7540Alb_NFisca ;
   private String[] T00FO21_A396EmprCod ;
   private long[] T00FO21_A30AlbProCod ;
   private int[] T00FO21_A129BarCod ;
   private byte[] T00FO21_A132BarCodReo ;
   private String[] T00FO21_A130BarCodPar ;
   private String[] T00FO22_A396EmprCod ;
   private long[] T00FO22_A30AlbProCod ;
   private byte[] T00FO22_A915AlbPObsLin ;
   private String[] T00FO23_A396EmprCod ;
   private long[] T00FO23_A30AlbProCod ;
   private long[] T00FO25_A30AlbProCod ;
   private String[] T00FO25_A212BarSer ;
   private byte[] T00FO25_A193BarOpeEsp ;
   private java.math.BigDecimal[] T00FO25_A1264BarPreMtr ;
   private byte[] T00FO25_A32AlbProEsp ;
   private java.math.BigDecimal[] T00FO25_A40AlbProRec ;
   private String[] T00FO25_A1798BarDibCli ;
   private int[] T00FO25_A1799BarDibInt ;
   private String[] T00FO25_A396EmprCod ;
   private int[] T00FO25_A129BarCod ;
   private byte[] T00FO25_A132BarCodReo ;
   private String[] T00FO25_A130BarCodPar ;
   private java.math.BigDecimal[] T00FO25_A1754ConMtsBar ;
   private short[] T00FO25_A1755ConPieBar ;
   private String[] T00FO6_A212BarSer ;
   private byte[] T00FO6_A193BarOpeEsp ;
   private String[] T00FO6_A1798BarDibCli ;
   private int[] T00FO6_A1799BarDibInt ;
   private java.math.BigDecimal[] T00FO8_A1754ConMtsBar ;
   private short[] T00FO8_A1755ConPieBar ;
   private String[] T00FO26_A212BarSer ;
   private byte[] T00FO26_A193BarOpeEsp ;
   private String[] T00FO26_A1798BarDibCli ;
   private int[] T00FO26_A1799BarDibInt ;
   private java.math.BigDecimal[] T00FO28_A1754ConMtsBar ;
   private short[] T00FO28_A1755ConPieBar ;
   private String[] T00FO29_A396EmprCod ;
   private long[] T00FO29_A30AlbProCod ;
   private int[] T00FO29_A129BarCod ;
   private byte[] T00FO29_A132BarCodReo ;
   private String[] T00FO29_A130BarCodPar ;
   private long[] T00FO5_A30AlbProCod ;
   private java.math.BigDecimal[] T00FO5_A1264BarPreMtr ;
   private byte[] T00FO5_A32AlbProEsp ;
   private java.math.BigDecimal[] T00FO5_A40AlbProRec ;
   private String[] T00FO5_A396EmprCod ;
   private int[] T00FO5_A129BarCod ;
   private byte[] T00FO5_A132BarCodReo ;
   private String[] T00FO5_A130BarCodPar ;
   private long[] T00FO4_A30AlbProCod ;
   private java.math.BigDecimal[] T00FO4_A1264BarPreMtr ;
   private byte[] T00FO4_A32AlbProEsp ;
   private java.math.BigDecimal[] T00FO4_A40AlbProRec ;
   private String[] T00FO4_A396EmprCod ;
   private int[] T00FO4_A129BarCod ;
   private byte[] T00FO4_A132BarCodReo ;
   private String[] T00FO4_A130BarCodPar ;
   private String[] T00FO33_A212BarSer ;
   private byte[] T00FO33_A193BarOpeEsp ;
   private String[] T00FO33_A1798BarDibCli ;
   private int[] T00FO33_A1799BarDibInt ;
   private java.math.BigDecimal[] T00FO35_A1754ConMtsBar ;
   private short[] T00FO35_A1755ConPieBar ;
   private String[] T00FO36_A396EmprCod ;
   private long[] T00FO36_A30AlbProCod ;
   private int[] T00FO36_A129BarCod ;
   private byte[] T00FO36_A132BarCodReo ;
   private String[] T00FO36_A130BarCodPar ;
   private short[] T00FO36_A6648AlbMetLin ;
   private String[] T00FO37_A396EmprCod ;
   private long[] T00FO37_A30AlbProCod ;
   private int[] T00FO37_A129BarCod ;
   private byte[] T00FO37_A132BarCodReo ;
   private String[] T00FO37_A130BarCodPar ;
   private short[] T00FO37_A9639Et_Numero ;
   private String[] T00FO38_A396EmprCod ;
   private long[] T00FO38_A30AlbProCod ;
   private int[] T00FO38_A129BarCod ;
   private byte[] T00FO38_A132BarCodReo ;
   private String[] T00FO38_A130BarCodPar ;
   private short[] T00FO38_A6622AlbHdRLn ;
   private String[] T00FO39_A396EmprCod ;
   private long[] T00FO39_A30AlbProCod ;
   private int[] T00FO39_A129BarCod ;
   private byte[] T00FO39_A132BarCodReo ;
   private String[] T00FO39_A130BarCodPar ;
   private short[] T00FO39_A5456P_ForLin ;
   private String[] T00FO40_A396EmprCod ;
   private long[] T00FO40_A30AlbProCod ;
   private int[] T00FO40_A129BarCod ;
   private byte[] T00FO40_A132BarCodReo ;
   private String[] T00FO40_A130BarCodPar ;
   private byte[] T00FO40_A2524DisComLin ;
   private String[] T00FO40_A1056DisComCod ;
   private String[] T00FO40_A1032FonCod ;
   private short[] T00FO40_A2666ProceCodA ;
   private String[] T00FO41_A396EmprCod ;
   private long[] T00FO41_A3617AlbTrnCod ;
   private long[] T00FO41_A30AlbProCod ;
   private int[] T00FO41_A129BarCod ;
   private byte[] T00FO41_A132BarCodReo ;
   private String[] T00FO41_A130BarCodPar ;
   private String[] T00FO42_A396EmprCod ;
   private long[] T00FO42_A30AlbProCod ;
   private int[] T00FO42_A129BarCod ;
   private byte[] T00FO42_A132BarCodReo ;
   private String[] T00FO42_A130BarCodPar ;
   private short[] T00FO42_A3621AlbPckLin ;
   private String[] T00FO43_A396EmprCod ;
   private long[] T00FO43_A30AlbProCod ;
   private int[] T00FO43_A129BarCod ;
   private byte[] T00FO43_A132BarCodReo ;
   private String[] T00FO43_A130BarCodPar ;
   private short[] T00FO43_A2764AlbHdrLin ;
   private String[] T00FO44_A396EmprCod ;
   private long[] T00FO44_A30AlbProCod ;
   private int[] T00FO44_A129BarCod ;
   private byte[] T00FO44_A132BarCodReo ;
   private String[] T00FO44_A130BarCodPar ;
   private short[] T00FO44_A1468AlbPrdLin ;
   private String[] T00FO45_A396EmprCod ;
   private long[] T00FO45_A30AlbProCod ;
   private int[] T00FO45_A129BarCod ;
   private byte[] T00FO45_A132BarCodReo ;
   private String[] T00FO45_A130BarCodPar ;
   private String[] T00FO45_A200BarPieCod ;
   private String[] T00FO46_A396EmprCod ;
   private long[] T00FO46_A30AlbProCod ;
   private int[] T00FO46_A129BarCod ;
   private byte[] T00FO46_A132BarCodReo ;
   private String[] T00FO46_A130BarCodPar ;
   private short[] T00FO46_A1240GuiFasLin ;
   private String[] T00FO47_A396EmprCod ;
   private long[] T00FO47_A30AlbProCod ;
   private int[] T00FO47_A129BarCod ;
   private byte[] T00FO47_A132BarCodReo ;
   private String[] T00FO47_A130BarCodPar ;
   private long[] T00FO48_A30AlbProCod ;
   private byte[] T00FO48_A2524DisComLin ;
   private String[] T00FO48_A1056DisComCod ;
   private String[] T00FO48_A1032FonCod ;
   private java.math.BigDecimal[] T00FO48_A1533AlbEComM ;
   private boolean[] T00FO48_n1533AlbEComM ;
   private short[] T00FO48_A1534AlbEComP ;
   private boolean[] T00FO48_n1534AlbEComP ;
   private java.math.BigDecimal[] T00FO48_A1536AlbEComPre ;
   private boolean[] T00FO48_n1536AlbEComPre ;
   private String[] T00FO48_A396EmprCod ;
   private int[] T00FO48_A129BarCod ;
   private byte[] T00FO48_A132BarCodReo ;
   private String[] T00FO48_A130BarCodPar ;
   private String[] T00FO49_A396EmprCod ;
   private long[] T00FO49_A30AlbProCod ;
   private int[] T00FO49_A129BarCod ;
   private byte[] T00FO49_A132BarCodReo ;
   private String[] T00FO49_A130BarCodPar ;
   private byte[] T00FO49_A2524DisComLin ;
   private String[] T00FO49_A1056DisComCod ;
   private String[] T00FO49_A1032FonCod ;
   private long[] T00FO3_A30AlbProCod ;
   private byte[] T00FO3_A2524DisComLin ;
   private String[] T00FO3_A1056DisComCod ;
   private String[] T00FO3_A1032FonCod ;
   private java.math.BigDecimal[] T00FO3_A1533AlbEComM ;
   private boolean[] T00FO3_n1533AlbEComM ;
   private short[] T00FO3_A1534AlbEComP ;
   private boolean[] T00FO3_n1534AlbEComP ;
   private java.math.BigDecimal[] T00FO3_A1536AlbEComPre ;
   private boolean[] T00FO3_n1536AlbEComPre ;
   private String[] T00FO3_A396EmprCod ;
   private int[] T00FO3_A129BarCod ;
   private byte[] T00FO3_A132BarCodReo ;
   private String[] T00FO3_A130BarCodPar ;
   private long[] T00FO2_A30AlbProCod ;
   private byte[] T00FO2_A2524DisComLin ;
   private String[] T00FO2_A1056DisComCod ;
   private String[] T00FO2_A1032FonCod ;
   private java.math.BigDecimal[] T00FO2_A1533AlbEComM ;
   private boolean[] T00FO2_n1533AlbEComM ;
   private short[] T00FO2_A1534AlbEComP ;
   private boolean[] T00FO2_n1534AlbEComP ;
   private java.math.BigDecimal[] T00FO2_A1536AlbEComPre ;
   private boolean[] T00FO2_n1536AlbEComPre ;
   private String[] T00FO2_A396EmprCod ;
   private int[] T00FO2_A129BarCod ;
   private byte[] T00FO2_A132BarCodReo ;
   private String[] T00FO2_A130BarCodPar ;
   private String[] T00FO53_A396EmprCod ;
   private long[] T00FO53_A30AlbProCod ;
   private int[] T00FO53_A129BarCod ;
   private byte[] T00FO53_A132BarCodReo ;
   private String[] T00FO53_A130BarCodPar ;
   private byte[] T00FO53_A2524DisComLin ;
   private String[] T00FO53_A1056DisComCod ;
   private String[] T00FO53_A1032FonCod ;
   private String[] T00FO53_A200BarPieCod ;
   private String[] T00FO54_A396EmprCod ;
   private long[] T00FO54_A30AlbProCod ;
   private int[] T00FO54_A129BarCod ;
   private byte[] T00FO54_A132BarCodReo ;
   private String[] T00FO54_A130BarCodPar ;
   private byte[] T00FO54_A2524DisComLin ;
   private String[] T00FO54_A1056DisComCod ;
   private String[] T00FO54_A1032FonCod ;
   private short[] T00FO54_A4433DisComTro ;
   private String[] T00FO55_A396EmprCod ;
   private long[] T00FO55_A30AlbProCod ;
   private int[] T00FO55_A129BarCod ;
   private byte[] T00FO55_A132BarCodReo ;
   private String[] T00FO55_A130BarCodPar ;
   private byte[] T00FO55_A2524DisComLin ;
   private String[] T00FO55_A1056DisComCod ;
   private String[] T00FO55_A1032FonCod ;
   private short[] T00FO55_A4336AlbEstPLin ;
   private String[] T00FO56_A396EmprCod ;
   private long[] T00FO56_A30AlbProCod ;
   private int[] T00FO56_A129BarCod ;
   private byte[] T00FO56_A132BarCodReo ;
   private String[] T00FO56_A130BarCodPar ;
   private byte[] T00FO56_A2524DisComLin ;
   private String[] T00FO56_A1056DisComCod ;
   private String[] T00FO56_A1032FonCod ;
   private short[] T00FO56_A1761ExtCod ;
   private String[] T00FO57_A396EmprCod ;
   private long[] T00FO57_A30AlbProCod ;
   private int[] T00FO57_A129BarCod ;
   private byte[] T00FO57_A132BarCodReo ;
   private String[] T00FO57_A130BarCodPar ;
   private byte[] T00FO57_A2524DisComLin ;
   private String[] T00FO57_A1056DisComCod ;
   private String[] T00FO57_A1032FonCod ;
   private short[] T00FO57_A2666ProceCodA ;
   private String[] T00FO58_A396EmprCod ;
   private long[] T00FO58_A30AlbProCod ;
   private int[] T00FO58_A129BarCod ;
   private byte[] T00FO58_A132BarCodReo ;
   private String[] T00FO58_A130BarCodPar ;
   private byte[] T00FO58_A2524DisComLin ;
   private String[] T00FO58_A1056DisComCod ;
   private String[] T00FO58_A1032FonCod ;
   private String[] T00FO59_A407EmprNom ;
   private boolean[] T00FO59_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tconale__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconale__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconale__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconale__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tconale__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00FO2", "SELECT AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?  FOR UPDATE OF AlbEComM, AlbEComP, AlbEComPre NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO3", "SELECT AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO4", "SELECT AlbProCod, BarPreMtr, AlbProEsp, AlbProRec, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF BarPreMtr, AlbProEsp, AlbProRec NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO5", "SELECT AlbProCod, BarPreMtr, AlbProEsp, AlbProRec, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO6", "SELECT BarSer, BarOpeEsp, BarDibCli, BarDibInt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO8", "SELECT COALESCE( T1.ConMtsBar, 0) AS ConMtsBar, COALESCE( T1.ConPieBar, 0) AS ConPieBar FROM (SELECT SUM(AlbEComM) AS ConMtsBar, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbEComP) AS ConPieBar FROM TXPALBEST GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO9", "SELECT AlbProCod, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbProCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO10", "SELECT AlbProCod, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO11", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO12", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbProCod, T2.EmprNom, TM1.EmprCod FROM (TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00FO16", "INSERT INTO TXPCALPRD(AlbProCod, EmprCod, AlbProPri, AlbProfch, AlbProEst, AlbPObsCon, GuiRemCli, GuiRemDom, EmprGuiRem, AlbDomEnv, TrnCod, AlbProEso, AlbProEnt, AlbSec, AlbDivTCod, AlbDivCod, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbCliDes, AlbFecSal, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbEnvFtp, AlbUsu, AlbOComp, AlbMarCo, AlbLic, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbColCa, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbTrnNc, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T00FO17", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T00FO18", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO19", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO20", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO21", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO22", "SELECT * FROM (SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO25", "SELECT T1.AlbProCod, T2.BarSer, T2.BarOpeEsp, T1.BarPreMtr, T1.AlbProEsp, T1.AlbProRec, T2.BarDibCli, T2.BarDibInt, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.ConMtsBar, 0) AS ConMtsBar, COALESCE( T3.ConPieBar, 0) AS ConPieBar FROM ((TXPALBBAR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(AlbEComM) AS ConMtsBar, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbEComP) AS ConPieBar FROM TXPALBEST GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbProCod = T1.AlbProCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.AlbProCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO26", "SELECT BarSer, BarOpeEsp, BarDibCli, BarDibInt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO28", "SELECT COALESCE( T1.ConMtsBar, 0) AS ConMtsBar, COALESCE( T1.ConPieBar, 0) AS ConPieBar FROM (SELECT SUM(AlbEComM) AS ConMtsBar, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbEComP) AS ConPieBar FROM TXPALBEST GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO29", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00FO30", "INSERT INTO TXPALBBAR(AlbProCod, BarPreMtr, AlbProEsp, AlbProRec, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbTub, GuiFasULin, BarPreKgm, AlbPConPie, BarAlbBul, BarAlbTar, BarAlbFor, BarAlbTip, BarAlbPN, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExt, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbHdrObs, AlbBarRec, AlbBarDto, AlbHdrUlin, AlbProVal, AlbTipCon, AlbHdrAnc, CodCod, AlbSer, AlbColNom, AlbColNum, AlbTipCol, AlbPckUlin, AlbEncCli, AlbHdrgm2, TipAcaCod, AlbTipEnt, AlbImpMan, P_ForULin, PlasCod, BarAlbPlas, AlbHdRUl, AlbObsM, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, AlbEncL, AlbEncA, AlbCald, AlbDf1, AlbDf2, AlbDf3, AlbMqTj, AlbDto, AlbSerD, Et_UltNum, BarKgsCli, AlbMetULi, AlbCliCod, BarPreUnd, BarAlbUnd, AlbNomCli, AlbNumcli, AlbTipArt, AlbCadEnc, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00FO31", "UPDATE TXPALBBAR SET BarPreMtr=?, AlbProEsp=?, AlbProRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T00FO32", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T00FO33", "SELECT BarSer, BarOpeEsp, BarDibCli, BarDibInt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO35", "SELECT COALESCE( T1.ConMtsBar, 0) AS ConMtsBar, COALESCE( T1.ConPieBar, 0) AS ConPieBar FROM (SELECT SUM(AlbEComM) AS ConMtsBar, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, SUM(AlbEComP) AS ConPieBar FROM TXPALBEST GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO36", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO37", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO38", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO39", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO40", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA FROM TXPALBEPR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO41", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO42", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO43", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO44", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO45", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO46", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO47", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO48", "SELECT AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO49", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00FO50", "INSERT INTO TXPALBEST(AlbProCod, DisComLin, DisComCod, FonCod, AlbEComM, AlbEComP, AlbEComPre, EmprCod, BarCod, BarCodReo, BarCodPar, AlbEstObs, AlbEComUPz, DisComUtr) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0)", GX_NOMASK, "TXPALBEST")
         ,new UpdateCursor("T00FO51", "UPDATE TXPALBEST SET AlbEComM=?, AlbEComP=?, AlbEComPre=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new UpdateCursor("T00FO52", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK, "TXPALBEST")
         ,new ForEachCursor("T00FO53", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod FROM TXPALBTEP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO54", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, DisComTro FROM TXPALBTET WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO55", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, AlbEstPLin FROM TXPALESTP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO56", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod FROM TXPALBETE WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO57", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA FROM TXPALBEPR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00FO58", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00FO59", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 21 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 23 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 29 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
            case 31 :
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 42 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 3);
               ((int[]) buf[11])[0] = rslt.getInt(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 53 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 5);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 26 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 5);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 44 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 12);
               stmt.setString(4, (String)parms[3], 12);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 5);
               }
               stmt.setString(8, (String)parms[10], 3);
               stmt.setInt(9, ((Number) parms[11]).intValue());
               stmt.setByte(10, ((Number) parms[12]).byteValue());
               stmt.setString(11, (String)parms[13], 1);
               return;
            case 45 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setLong(5, ((Number) parms[7]).longValue());
               stmt.setInt(6, ((Number) parms[8]).intValue());
               stmt.setByte(7, ((Number) parms[9]).byteValue());
               stmt.setString(8, (String)parms[10], 1);
               stmt.setByte(9, ((Number) parms[11]).byteValue());
               stmt.setString(10, (String)parms[12], 12);
               stmt.setString(11, (String)parms[13], 12);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

