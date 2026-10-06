package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talmpz3_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_2( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10588H_RecCod = (int)(GXutil.lval( httpContext.GetPar( "H_RecCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A10588H_RecCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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

   public talmpz3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talmpz3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talmpz3_impl.class ));
   }

   public talmpz3_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALMPZ3.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Albaran Recepcion", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_RecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A10588H_RecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtH_RecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10588H_RecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10588H_RecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_RecCod_Jsonclick, 0, "", "", "", "", "", 1, edtH_RecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtH_RecPie_Internalname, GXutil.rtrim( A10604H_RecPie), GXutil.rtrim( localUtil.format( A10604H_RecPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtH_RecPie_Jsonclick, 0, "", "", "", "", "", 1, edtH_RecPie_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol40( ) ;
      nGXsfl_40_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1426 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1426 = (short)(1) ;
            scanStart18W1426( ) ;
            while ( RcdFound1426 != 0 )
            {
               init_level_properties1426( ) ;
               getByPrimaryKey18W1426( ) ;
               addRow18W1426( ) ;
               scanNext18W1426( ) ;
            }
            scanEnd18W1426( ) ;
            nBlankRcdCount1426 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal18W1426( ) ;
         standaloneModal18W1426( ) ;
         sMode1426 = Gx_mode ;
         while ( nGXsfl_40_idx < nRC_GXsfl_40 )
         {
            bGXsfl_40_Refreshing = true ;
            readRow18W1426( ) ;
            edtavnRcdDeleted_1426_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1426_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1426_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1426_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_CodHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_CODHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_CodHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_CodHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_LoteHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LOTEHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_LoteHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LoteHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_ProvHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PROVHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_ProvHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ProvHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_NomPHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_NOMPHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_NomPHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_NomPHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_PorcHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PORCHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_PorcHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PorcHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_FibrHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_FIBRHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_FibrHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_FibrHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            edtH_ColoHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_COLOHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtH_ColoHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ColoHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
            if ( ( nRcdExists_1426 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18W1426( ) ;
            }
            sendRow18W1426( ) ;
            bGXsfl_40_Refreshing = false ;
         }
         Gx_mode = sMode1426 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1426 = (short)(5) ;
         nRcdExists_1426 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18W1426( ) ;
            while ( RcdFound1426 != 0 )
            {
               sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_401426( ) ;
               init_level_properties1426( ) ;
               standaloneNotModal18W1426( ) ;
               getByPrimaryKey18W1426( ) ;
               standaloneModal18W1426( ) ;
               addRow18W1426( ) ;
               scanNext18W1426( ) ;
            }
            scanEnd18W1426( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1426 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_401426( ) ;
      initAll18W1426( ) ;
      init_level_properties1426( ) ;
      nRcdExists_1426 = (short)(0) ;
      nIsMod_1426 = (short)(0) ;
      nRcdDeleted_1426 = (short)(0) ;
      nBlankRcdCount1426 = (short)(nBlankRcdUsr1426+nBlankRcdCount1426) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1426 > 0 )
      {
         standaloneNotModal18W1426( ) ;
         standaloneModal18W1426( ) ;
         addRow18W1426( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtH_CodHilz_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1426 = (short)(nBlankRcdCount1426-1) ;
      }
      Gx_mode = sMode1426 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALMPZ3.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALMPZ3.htm");
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
         Z10588H_RecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10588H_RecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z10604H_RecPie = httpContext.cgiGet( "Z10604H_RecPie") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_RecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_RecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "H_RECCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtH_RecCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10588H_RecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         }
         else
         {
            A10588H_RecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtH_RecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         }
         A10604H_RecPie = httpContext.cgiGet( edtH_RecPie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
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
            A10588H_RecCod = (int)(GXutil.lval( httpContext.GetPar( "H_RecCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
            A10604H_RecPie = httpContext.GetPar( "H_RecPie") ;
            httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
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
            initAll18W1425( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1426_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1426_Enabled), 5, 0), !bGXsfl_40_Refreshing);
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
      disableAttributes18W1425( ) ;
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

   public void confirm_18W0( )
   {
      beforeValidate18W1425( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18W1425( ) ;
         }
         else
         {
            checkExtendedTable18W1425( ) ;
            if ( AnyError == 0 )
            {
               zm18W1425( 2) ;
               zm18W1425( 3) ;
            }
            closeExtendedTableCursors18W1425( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1425 = Gx_mode ;
         confirm_18W1426( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1425 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1425 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues18W0( ) ;
      }
   }

   public void confirm_18W1426( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow18W1426( ) ;
         if ( ( nRcdExists_1426 != 0 ) || ( nIsMod_1426 != 0 ) )
         {
            getKey18W1426( ) ;
            if ( ( nRcdExists_1426 == 0 ) && ( nRcdDeleted_1426 == 0 ) )
            {
               if ( RcdFound1426 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18W1426( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18W1426( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors18W1426( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "H_CODHILZ_" + sGXsfl_40_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtH_CodHilz_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1426 != 0 )
               {
                  if ( nRcdDeleted_1426 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18W1426( ) ;
                     load18W1426( ) ;
                     beforeValidate18W1426( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18W1426( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1426 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18W1426( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18W1426( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors18W1426( ) ;
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
                  if ( nRcdDeleted_1426 == 0 )
                  {
                     GXCCtl = "H_CODHILZ_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_CodHilz_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1426_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_CodHilz_Internalname, GXutil.rtrim( A10703H_CodHilz)) ;
         httpContext.changePostValue( edtH_LoteHilz_Internalname, GXutil.rtrim( A10704H_LoteHilz)) ;
         httpContext.changePostValue( edtH_ProvHilz_Internalname, GXutil.rtrim( A10705H_ProvHilz)) ;
         httpContext.changePostValue( edtH_NomPHilz_Internalname, GXutil.rtrim( A10706H_NomPHilz)) ;
         httpContext.changePostValue( edtH_PorcHilz_Internalname, GXutil.ltrim( localUtil.ntoc( A10707H_PorcHilz, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_FibrHilz_Internalname, GXutil.rtrim( A10708H_FibrHilz)) ;
         httpContext.changePostValue( edtH_ColoHilz_Internalname, GXutil.rtrim( A10709H_ColoHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10703H_CodHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10703H_CodHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10704H_LoteHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10704H_LoteHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10705H_ProvHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10705H_ProvHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10706H_NomPHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10706H_NomPHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10707H_PorcHilz_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10707H_PorcHilz, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10708H_FibrHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10708H_FibrHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10709H_ColoHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10709H_ColoHilz)) ;
         httpContext.changePostValue( "nRcdDeleted_1426_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1426_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1426_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1426 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1426_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1426_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_CODHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_CodHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LOTEHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LoteHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PROVHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ProvHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_NOMPHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_NomPHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PORCHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PorcHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_FIBRHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_FibrHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_COLOHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ColoHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18W0( )
   {
   }

   public void zm18W1425( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -1 )
      {
         Z10604H_RecPie = A10604H_RecPie ;
         Z396EmprCod = A396EmprCod ;
         Z10588H_RecCod = A10588H_RecCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
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

   public void load18W1425( )
   {
      /* Using cursor T018W8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1425 = (short)(1) ;
         A407EmprNom = T018W8_A407EmprNom[0] ;
         n407EmprNom = T018W8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm18W1425( -1) ;
      }
      pr_default.close(6);
      onLoadActions18W1425( ) ;
   }

   public void onLoadActions18W1425( )
   {
   }

   public void checkExtendedTable18W1425( )
   {
      nIsDirty_1425 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T018W6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T018W6_A407EmprNom[0] ;
      n407EmprNom = T018W6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T018W7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "H_RECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors18W1425( )
   {
      pr_default.close(4);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T018W9 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T018W9_A407EmprNom[0] ;
      n407EmprNom = T018W9_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void gxload_3( String A396EmprCod ,
                         int A10588H_RecCod )
   {
      /* Using cursor T018W10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "H_RECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void getKey18W1425( )
   {
      /* Using cursor T018W11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1425 = (short)(1) ;
      }
      else
      {
         RcdFound1425 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018W5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm18W1425( 1) ;
         RcdFound1425 = (short)(1) ;
         A10604H_RecPie = T018W5_A10604H_RecPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
         A396EmprCod = T018W5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10588H_RecCod = T018W5_A10588H_RecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z10588H_RecCod = A10588H_RecCod ;
         Z10604H_RecPie = A10604H_RecPie ;
         sMode1425 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18W1425( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1425 = (short)(0) ;
            initializeNonKey18W1425( ) ;
         }
         Gx_mode = sMode1425 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1425 = (short)(0) ;
         initializeNonKey18W1425( ) ;
         sMode1425 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1425 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey18W1425( ) ;
      if ( RcdFound1425 == 0 )
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
      RcdFound1425 = (short)(0) ;
      /* Using cursor T018W12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10588H_RecCod), Integer.valueOf(A10588H_RecCod), A396EmprCod, A10604H_RecPie});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T018W12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T018W12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018W12_A10588H_RecCod[0] < A10588H_RecCod ) || ( T018W12_A10588H_RecCod[0] == A10588H_RecCod ) && ( GXutil.strcmp(T018W12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018W12_A10604H_RecPie[0], A10604H_RecPie) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T018W12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T018W12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018W12_A10588H_RecCod[0] > A10588H_RecCod ) || ( T018W12_A10588H_RecCod[0] == A10588H_RecCod ) && ( GXutil.strcmp(T018W12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018W12_A10604H_RecPie[0], A10604H_RecPie) > 0 ) ) )
         {
            A396EmprCod = T018W12_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10588H_RecCod = T018W12_A10588H_RecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
            A10604H_RecPie = T018W12_A10604H_RecPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
            RcdFound1425 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1425 = (short)(0) ;
      /* Using cursor T018W13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A10588H_RecCod), Integer.valueOf(A10588H_RecCod), A396EmprCod, A10604H_RecPie});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T018W13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T018W13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018W13_A10588H_RecCod[0] > A10588H_RecCod ) || ( T018W13_A10588H_RecCod[0] == A10588H_RecCod ) && ( GXutil.strcmp(T018W13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018W13_A10604H_RecPie[0], A10604H_RecPie) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T018W13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T018W13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T018W13_A10588H_RecCod[0] < A10588H_RecCod ) || ( T018W13_A10588H_RecCod[0] == A10588H_RecCod ) && ( GXutil.strcmp(T018W13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T018W13_A10604H_RecPie[0], A10604H_RecPie) < 0 ) ) )
         {
            A396EmprCod = T018W13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10588H_RecCod = T018W13_A10588H_RecCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
            A10604H_RecPie = T018W13_A10604H_RecPie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
            RcdFound1425 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18W1425( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18W1425( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1425 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10588H_RecCod != Z10588H_RecCod ) || ( GXutil.strcmp(A10604H_RecPie, Z10604H_RecPie) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A10588H_RecCod = Z10588H_RecCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
               A10604H_RecPie = Z10604H_RecPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update18W1425( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10588H_RecCod != Z10588H_RecCod ) || ( GXutil.strcmp(A10604H_RecPie, Z10604H_RecPie) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18W1425( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18W1425( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10588H_RecCod != Z10588H_RecCod ) || ( GXutil.strcmp(A10604H_RecPie, Z10604H_RecPie) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10588H_RecCod = Z10588H_RecCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         A10604H_RecPie = Z10604H_RecPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKey18W1425( ) ;
      if ( RcdFound1425 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10588H_RecCod != Z10588H_RecCod ) || ( GXutil.strcmp(A10604H_RecPie, Z10604H_RecPie) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A10588H_RecCod = Z10588H_RecCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
            A10604H_RecPie = Z10604H_RecPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10588H_RecCod != Z10588H_RecCod ) || ( GXutil.strcmp(A10604H_RecPie, Z10604H_RecPie) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talmpz3");
   }

   public void insert_check( )
   {
      confirm_18W0( ) ;
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
      if ( RcdFound1425 == 0 )
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
      scanStart18W1425( ) ;
      if ( RcdFound1425 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18W1425( ) ;
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
      if ( RcdFound1425 == 0 )
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
      if ( RcdFound1425 == 0 )
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
      scanStart18W1425( ) ;
      if ( RcdFound1425 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1425 != 0 )
         {
            scanNext18W1425( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd18W1425( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18W1425( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018W4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALMPZ1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALMPZ1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18W1425( )
   {
      beforeValidate18W1425( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18W1425( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18W1425( 0) ;
         checkOptimisticConcurrency18W1425( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18W1425( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18W1425( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018W14 */
                  pr_default.execute(12, new Object[] {A10604H_RecPie, A396EmprCod, Integer.valueOf(A10588H_RecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMPZ1");
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
                        processLevel18W1425( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18W0( ) ;
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
            load18W1425( ) ;
         }
         endLevel18W1425( ) ;
      }
      closeExtendedTableCursors18W1425( ) ;
   }

   public void update18W1425( )
   {
      beforeValidate18W1425( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18W1425( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18W1425( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18W1425( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18W1425( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPALMPZ1 */
                  deferredUpdate18W1425( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18W1425( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18W0( ) ;
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
         endLevel18W1425( ) ;
      }
      closeExtendedTableCursors18W1425( ) ;
   }

   public void deferredUpdate18W1425( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18W1425( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18W1425( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18W1425( ) ;
         afterConfirm18W1425( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18W1425( ) ;
            if ( AnyError == 0 )
            {
               scanStart18W1426( ) ;
               while ( RcdFound1426 != 0 )
               {
                  getByPrimaryKey18W1426( ) ;
                  delete18W1426( ) ;
                  scanNext18W1426( ) ;
               }
               scanEnd18W1426( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018W15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMPZ1");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1425 == 0 )
                        {
                           initAll18W1425( ) ;
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
                        resetCaption18W0( ) ;
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
      sMode1425 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18W1425( ) ;
      Gx_mode = sMode1425 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18W1425( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T018W16 */
         pr_default.execute(14, new Object[] {A396EmprCod});
         A407EmprNom = T018W16_A407EmprNom[0] ;
         n407EmprNom = T018W16_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel18W1426( )
   {
      nGXsfl_40_idx = 0 ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         readRow18W1426( ) ;
         if ( ( nRcdExists_1426 != 0 ) || ( nIsMod_1426 != 0 ) )
         {
            standaloneNotModal18W1426( ) ;
            getKey18W1426( ) ;
            if ( ( nRcdExists_1426 == 0 ) && ( nRcdDeleted_1426 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18W1426( ) ;
            }
            else
            {
               if ( RcdFound1426 != 0 )
               {
                  if ( ( nRcdDeleted_1426 != 0 ) && ( nRcdExists_1426 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18W1426( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1426 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18W1426( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1426 == 0 )
                  {
                     GXCCtl = "H_CODHILZ_" + sGXsfl_40_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtH_CodHilz_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1426_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_CodHilz_Internalname, GXutil.rtrim( A10703H_CodHilz)) ;
         httpContext.changePostValue( edtH_LoteHilz_Internalname, GXutil.rtrim( A10704H_LoteHilz)) ;
         httpContext.changePostValue( edtH_ProvHilz_Internalname, GXutil.rtrim( A10705H_ProvHilz)) ;
         httpContext.changePostValue( edtH_NomPHilz_Internalname, GXutil.rtrim( A10706H_NomPHilz)) ;
         httpContext.changePostValue( edtH_PorcHilz_Internalname, GXutil.ltrim( localUtil.ntoc( A10707H_PorcHilz, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtH_FibrHilz_Internalname, GXutil.rtrim( A10708H_FibrHilz)) ;
         httpContext.changePostValue( edtH_ColoHilz_Internalname, GXutil.rtrim( A10709H_ColoHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10703H_CodHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10703H_CodHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10704H_LoteHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10704H_LoteHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10705H_ProvHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10705H_ProvHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10706H_NomPHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10706H_NomPHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10707H_PorcHilz_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( Z10707H_PorcHilz, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10708H_FibrHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10708H_FibrHilz)) ;
         httpContext.changePostValue( "ZT_"+"Z10709H_ColoHilz_"+sGXsfl_40_idx, GXutil.rtrim( Z10709H_ColoHilz)) ;
         httpContext.changePostValue( "nRcdDeleted_1426_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1426_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1426_"+sGXsfl_40_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1426 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1426_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1426_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_CODHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_CodHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_LOTEHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LoteHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PROVHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ProvHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_NOMPHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_NomPHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_PORCHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PorcHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_FIBRHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_FibrHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "H_COLOHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ColoHilz_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18W1426( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1426 = (short)(0) ;
      nIsMod_1426 = (short)(0) ;
      nRcdDeleted_1426 = (short)(0) ;
   }

   public void processLevel18W1425( )
   {
      /* Save parent mode. */
      sMode1425 = Gx_mode ;
      processNestedLevel18W1426( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1425 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel18W1425( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18W1425( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talmpz3");
         if ( AnyError == 0 )
         {
            confirmValues18W0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talmpz3");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18W1425( )
   {
      /* Using cursor T018W17 */
      pr_default.execute(15);
      RcdFound1425 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1425 = (short)(1) ;
         A396EmprCod = T018W17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10588H_RecCod = T018W17_A10588H_RecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         A10604H_RecPie = T018W17_A10604H_RecPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18W1425( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1425 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1425 = (short)(1) ;
         A396EmprCod = T018W17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10588H_RecCod = T018W17_A10588H_RecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
         A10604H_RecPie = T018W17_A10604H_RecPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
      }
   }

   public void scanEnd18W1425( )
   {
      pr_default.close(15);
   }

   public void afterConfirm18W1425( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18W1425( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18W1425( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18W1425( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18W1425( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18W1425( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18W1425( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtH_RecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_RecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_RecCod_Enabled), 5, 0), true);
      edtH_RecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_RecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_RecPie_Enabled), 5, 0), true);
   }

   public void zm18W1426( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10704H_LoteHilz = T018W3_A10704H_LoteHilz[0] ;
            Z10705H_ProvHilz = T018W3_A10705H_ProvHilz[0] ;
            Z10706H_NomPHilz = T018W3_A10706H_NomPHilz[0] ;
            Z10707H_PorcHilz = T018W3_A10707H_PorcHilz[0] ;
            Z10708H_FibrHilz = T018W3_A10708H_FibrHilz[0] ;
            Z10709H_ColoHilz = T018W3_A10709H_ColoHilz[0] ;
         }
         else
         {
            Z10704H_LoteHilz = A10704H_LoteHilz ;
            Z10705H_ProvHilz = A10705H_ProvHilz ;
            Z10706H_NomPHilz = A10706H_NomPHilz ;
            Z10707H_PorcHilz = A10707H_PorcHilz ;
            Z10708H_FibrHilz = A10708H_FibrHilz ;
            Z10709H_ColoHilz = A10709H_ColoHilz ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z10588H_RecCod = A10588H_RecCod ;
         Z10604H_RecPie = A10604H_RecPie ;
         Z10703H_CodHilz = A10703H_CodHilz ;
         Z10704H_LoteHilz = A10704H_LoteHilz ;
         Z10705H_ProvHilz = A10705H_ProvHilz ;
         Z10706H_NomPHilz = A10706H_NomPHilz ;
         Z10707H_PorcHilz = A10707H_PorcHilz ;
         Z10708H_FibrHilz = A10708H_FibrHilz ;
         Z10709H_ColoHilz = A10709H_ColoHilz ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal18W1426( )
   {
   }

   public void standaloneModal18W1426( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtH_CodHilz_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_CodHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_CodHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
      else
      {
         edtH_CodHilz_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtH_CodHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_CodHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      }
   }

   public void load18W1426( )
   {
      /* Using cursor T018W18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1426 = (short)(1) ;
         A10704H_LoteHilz = T018W18_A10704H_LoteHilz[0] ;
         n10704H_LoteHilz = T018W18_n10704H_LoteHilz[0] ;
         A10705H_ProvHilz = T018W18_A10705H_ProvHilz[0] ;
         n10705H_ProvHilz = T018W18_n10705H_ProvHilz[0] ;
         A10706H_NomPHilz = T018W18_A10706H_NomPHilz[0] ;
         n10706H_NomPHilz = T018W18_n10706H_NomPHilz[0] ;
         A10707H_PorcHilz = T018W18_A10707H_PorcHilz[0] ;
         n10707H_PorcHilz = T018W18_n10707H_PorcHilz[0] ;
         A10708H_FibrHilz = T018W18_A10708H_FibrHilz[0] ;
         n10708H_FibrHilz = T018W18_n10708H_FibrHilz[0] ;
         A10709H_ColoHilz = T018W18_A10709H_ColoHilz[0] ;
         n10709H_ColoHilz = T018W18_n10709H_ColoHilz[0] ;
         zm18W1426( -4) ;
      }
      pr_default.close(16);
      onLoadActions18W1426( ) ;
   }

   public void onLoadActions18W1426( )
   {
   }

   public void checkExtendedTable18W1426( )
   {
      nIsDirty_1426 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal18W1426( ) ;
   }

   public void closeExtendedTableCursors18W1426( )
   {
   }

   public void enableDisable18W1426( )
   {
   }

   public void getKey18W1426( )
   {
      /* Using cursor T018W19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1426 = (short)(1) ;
      }
      else
      {
         RcdFound1426 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey18W1426( )
   {
      /* Using cursor T018W3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm18W1426( 4) ;
         RcdFound1426 = (short)(1) ;
         initializeNonKey18W1426( ) ;
         A10703H_CodHilz = T018W3_A10703H_CodHilz[0] ;
         A10704H_LoteHilz = T018W3_A10704H_LoteHilz[0] ;
         n10704H_LoteHilz = T018W3_n10704H_LoteHilz[0] ;
         A10705H_ProvHilz = T018W3_A10705H_ProvHilz[0] ;
         n10705H_ProvHilz = T018W3_n10705H_ProvHilz[0] ;
         A10706H_NomPHilz = T018W3_A10706H_NomPHilz[0] ;
         n10706H_NomPHilz = T018W3_n10706H_NomPHilz[0] ;
         A10707H_PorcHilz = T018W3_A10707H_PorcHilz[0] ;
         n10707H_PorcHilz = T018W3_n10707H_PorcHilz[0] ;
         A10708H_FibrHilz = T018W3_A10708H_FibrHilz[0] ;
         n10708H_FibrHilz = T018W3_n10708H_FibrHilz[0] ;
         A10709H_ColoHilz = T018W3_A10709H_ColoHilz[0] ;
         n10709H_ColoHilz = T018W3_n10709H_ColoHilz[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10588H_RecCod = A10588H_RecCod ;
         Z10604H_RecPie = A10604H_RecPie ;
         Z10703H_CodHilz = A10703H_CodHilz ;
         sMode1426 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18W1426( ) ;
         load18W1426( ) ;
         Gx_mode = sMode1426 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1426 = (short)(0) ;
         initializeNonKey18W1426( ) ;
         sMode1426 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18W1426( ) ;
         Gx_mode = sMode1426 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18W1426( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18W1426( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018W2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALMPZ3"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10704H_LoteHilz, T018W2_A10704H_LoteHilz[0]) != 0 ) || ( GXutil.strcmp(Z10705H_ProvHilz, T018W2_A10705H_ProvHilz[0]) != 0 ) || ( GXutil.strcmp(Z10706H_NomPHilz, T018W2_A10706H_NomPHilz[0]) != 0 ) || ( Z10707H_PorcHilz != T018W2_A10707H_PorcHilz[0] ) || ( GXutil.strcmp(Z10708H_FibrHilz, T018W2_A10708H_FibrHilz[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10709H_ColoHilz, T018W2_A10709H_ColoHilz[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10704H_LoteHilz, T018W2_A10704H_LoteHilz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz3:[seudo value changed for attri]"+"H_LoteHilz");
               GXutil.writeLogRaw("Old: ",Z10704H_LoteHilz);
               GXutil.writeLogRaw("Current: ",T018W2_A10704H_LoteHilz[0]);
            }
            if ( GXutil.strcmp(Z10705H_ProvHilz, T018W2_A10705H_ProvHilz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz3:[seudo value changed for attri]"+"H_ProvHilz");
               GXutil.writeLogRaw("Old: ",Z10705H_ProvHilz);
               GXutil.writeLogRaw("Current: ",T018W2_A10705H_ProvHilz[0]);
            }
            if ( GXutil.strcmp(Z10706H_NomPHilz, T018W2_A10706H_NomPHilz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz3:[seudo value changed for attri]"+"H_NomPHilz");
               GXutil.writeLogRaw("Old: ",Z10706H_NomPHilz);
               GXutil.writeLogRaw("Current: ",T018W2_A10706H_NomPHilz[0]);
            }
            if ( Z10707H_PorcHilz != T018W2_A10707H_PorcHilz[0] )
            {
               GXutil.writeLogln("talmpz3:[seudo value changed for attri]"+"H_PorcHilz");
               GXutil.writeLogRaw("Old: ",Z10707H_PorcHilz);
               GXutil.writeLogRaw("Current: ",T018W2_A10707H_PorcHilz[0]);
            }
            if ( GXutil.strcmp(Z10708H_FibrHilz, T018W2_A10708H_FibrHilz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz3:[seudo value changed for attri]"+"H_FibrHilz");
               GXutil.writeLogRaw("Old: ",Z10708H_FibrHilz);
               GXutil.writeLogRaw("Current: ",T018W2_A10708H_FibrHilz[0]);
            }
            if ( GXutil.strcmp(Z10709H_ColoHilz, T018W2_A10709H_ColoHilz[0]) != 0 )
            {
               GXutil.writeLogln("talmpz3:[seudo value changed for attri]"+"H_ColoHilz");
               GXutil.writeLogRaw("Old: ",Z10709H_ColoHilz);
               GXutil.writeLogRaw("Current: ",T018W2_A10709H_ColoHilz[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALMPZ3"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18W1426( )
   {
      beforeValidate18W1426( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18W1426( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18W1426( 0) ;
         checkOptimisticConcurrency18W1426( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18W1426( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18W1426( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018W20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz, Boolean.valueOf(n10704H_LoteHilz), A10704H_LoteHilz, Boolean.valueOf(n10705H_ProvHilz), A10705H_ProvHilz, Boolean.valueOf(n10706H_NomPHilz), A10706H_NomPHilz, Boolean.valueOf(n10707H_PorcHilz), Short.valueOf(A10707H_PorcHilz), Boolean.valueOf(n10708H_FibrHilz), A10708H_FibrHilz, Boolean.valueOf(n10709H_ColoHilz), A10709H_ColoHilz, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMPZ3");
                  if ( (pr_default.getStatus(18) == 1) )
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
            load18W1426( ) ;
         }
         endLevel18W1426( ) ;
      }
      closeExtendedTableCursors18W1426( ) ;
   }

   public void update18W1426( )
   {
      beforeValidate18W1426( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18W1426( ) ;
      }
      if ( ( nIsMod_1426 != 0 ) || ( nIsDirty_1426 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18W1426( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18W1426( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18W1426( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018W21 */
                     pr_default.execute(19, new Object[] {Boolean.valueOf(n10704H_LoteHilz), A10704H_LoteHilz, Boolean.valueOf(n10705H_ProvHilz), A10705H_ProvHilz, Boolean.valueOf(n10706H_NomPHilz), A10706H_NomPHilz, Boolean.valueOf(n10707H_PorcHilz), Short.valueOf(A10707H_PorcHilz), Boolean.valueOf(n10708H_FibrHilz), A10708H_FibrHilz, Boolean.valueOf(n10709H_ColoHilz), A10709H_ColoHilz, A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMPZ3");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALMPZ3"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18W1426( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18W1426( ) ;
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
            endLevel18W1426( ) ;
         }
      }
      closeExtendedTableCursors18W1426( ) ;
   }

   public void deferredUpdate18W1426( )
   {
   }

   public void delete18W1426( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18W1426( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18W1426( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18W1426( ) ;
         afterConfirm18W1426( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18W1426( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018W22 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie, A10703H_CodHilz});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALMPZ3");
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
      sMode1426 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18W1426( ) ;
      Gx_mode = sMode1426 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18W1426( )
   {
      standaloneModal18W1426( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel18W1426( )
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

   public void scanStart18W1426( )
   {
      /* Scan By routine */
      /* Using cursor T018W23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod), A10604H_RecPie});
      RcdFound1426 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1426 = (short)(1) ;
         A10703H_CodHilz = T018W23_A10703H_CodHilz[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18W1426( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1426 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1426 = (short)(1) ;
         A10703H_CodHilz = T018W23_A10703H_CodHilz[0] ;
      }
   }

   public void scanEnd18W1426( )
   {
      pr_default.close(21);
   }

   public void afterConfirm18W1426( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18W1426( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18W1426( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18W1426( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18W1426( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18W1426( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18W1426( )
   {
      edtH_CodHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_CodHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_CodHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtH_LoteHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_LoteHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_LoteHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtH_ProvHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_ProvHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ProvHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtH_NomPHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_NomPHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_NomPHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtH_PorcHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_PorcHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_PorcHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtH_FibrHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_FibrHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_FibrHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtH_ColoHilz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_ColoHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_ColoHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void send_integrity_lvl_hashes18W1426( )
   {
   }

   public void send_integrity_lvl_hashes18W1425( )
   {
   }

   public void subsflControlProps_401426( )
   {
      edtavnRcdDeleted_1426_Internalname = "vNRCDDELETED_1426_"+sGXsfl_40_idx ;
      edtH_CodHilz_Internalname = "H_CODHILZ_"+sGXsfl_40_idx ;
      edtH_LoteHilz_Internalname = "H_LOTEHILZ_"+sGXsfl_40_idx ;
      edtH_ProvHilz_Internalname = "H_PROVHILZ_"+sGXsfl_40_idx ;
      edtH_NomPHilz_Internalname = "H_NOMPHILZ_"+sGXsfl_40_idx ;
      edtH_PorcHilz_Internalname = "H_PORCHILZ_"+sGXsfl_40_idx ;
      edtH_FibrHilz_Internalname = "H_FIBRHILZ_"+sGXsfl_40_idx ;
      edtH_ColoHilz_Internalname = "H_COLOHILZ_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_401426( )
   {
      edtavnRcdDeleted_1426_Internalname = "vNRCDDELETED_1426_"+sGXsfl_40_fel_idx ;
      edtH_CodHilz_Internalname = "H_CODHILZ_"+sGXsfl_40_fel_idx ;
      edtH_LoteHilz_Internalname = "H_LOTEHILZ_"+sGXsfl_40_fel_idx ;
      edtH_ProvHilz_Internalname = "H_PROVHILZ_"+sGXsfl_40_fel_idx ;
      edtH_NomPHilz_Internalname = "H_NOMPHILZ_"+sGXsfl_40_fel_idx ;
      edtH_PorcHilz_Internalname = "H_PORCHILZ_"+sGXsfl_40_fel_idx ;
      edtH_FibrHilz_Internalname = "H_FIBRHILZ_"+sGXsfl_40_fel_idx ;
      edtH_ColoHilz_Internalname = "H_COLOHILZ_"+sGXsfl_40_fel_idx ;
   }

   public void addRow18W1426( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401426( ) ;
      sendRow18W1426( ) ;
   }

   public void sendRow18W1426( )
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
         if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1426_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1426_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1426), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1426), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1426_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1426_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_CodHilz_Internalname,GXutil.rtrim( A10703H_CodHilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_CodHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_CodHilz_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_LoteHilz_Internalname,GXutil.rtrim( A10704H_LoteHilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_LoteHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_LoteHilz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_ProvHilz_Internalname,GXutil.rtrim( A10705H_ProvHilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_ProvHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_ProvHilz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_NomPHilz_Internalname,GXutil.rtrim( A10706H_NomPHilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_NomPHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_NomPHilz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_PorcHilz_Internalname,GXutil.ltrim( localUtil.ntoc( A10707H_PorcHilz, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtH_PorcHilz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10707H_PorcHilz), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10707H_PorcHilz), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_PorcHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_PorcHilz_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_FibrHilz_Internalname,GXutil.rtrim( A10708H_FibrHilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_FibrHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_FibrHilz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1426_" + sGXsfl_40_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_40_idx + "',40)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtH_ColoHilz_Internalname,GXutil.rtrim( A10709H_ColoHilz),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtH_ColoHilz_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtH_ColoHilz_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18W1426( ) ;
      GXCCtl = "Z10703H_CodHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10703H_CodHilz));
      GXCCtl = "Z10704H_LoteHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10704H_LoteHilz));
      GXCCtl = "Z10705H_ProvHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10705H_ProvHilz));
      GXCCtl = "Z10706H_NomPHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10706H_NomPHilz));
      GXCCtl = "Z10707H_PorcHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10707H_PorcHilz, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10708H_FibrHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10708H_FibrHilz));
      GXCCtl = "Z10709H_ColoHilz_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10709H_ColoHilz));
      GXCCtl = "nRcdDeleted_1426_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1426_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1426_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1426, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1426_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1426_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_CODHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_CodHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_LOTEHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LoteHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PROVHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ProvHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_NOMPHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_NomPHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_PORCHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PorcHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_FIBRHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_FibrHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "H_COLOHILZ_"+sGXsfl_40_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ColoHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18W1426( )
   {
      nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401426( ) ;
      edtavnRcdDeleted_1426_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1426_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_CodHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_CODHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_LoteHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_LOTEHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_ProvHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PROVHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_NomPHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_NOMPHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_PorcHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_PORCHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_FibrHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_FIBRHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtH_ColoHilz_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "H_COLOHILZ_"+sGXsfl_40_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1426_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1426_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1426");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1426_Internalname ;
         wbErr = true ;
         nRcdDeleted_1426 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1426 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1426_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10703H_CodHilz = httpContext.cgiGet( edtH_CodHilz_Internalname) ;
      A10704H_LoteHilz = httpContext.cgiGet( edtH_LoteHilz_Internalname) ;
      n10704H_LoteHilz = false ;
      A10705H_ProvHilz = httpContext.cgiGet( edtH_ProvHilz_Internalname) ;
      n10705H_ProvHilz = false ;
      A10706H_NomPHilz = httpContext.cgiGet( edtH_NomPHilz_Internalname) ;
      n10706H_NomPHilz = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtH_PorcHilz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtH_PorcHilz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "H_PORCHILZ_" + sGXsfl_40_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtH_PorcHilz_Internalname ;
         wbErr = true ;
         A10707H_PorcHilz = (short)(0) ;
         n10707H_PorcHilz = false ;
      }
      else
      {
         A10707H_PorcHilz = (short)(localUtil.ctol( httpContext.cgiGet( edtH_PorcHilz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10707H_PorcHilz = false ;
      }
      A10708H_FibrHilz = httpContext.cgiGet( edtH_FibrHilz_Internalname) ;
      n10708H_FibrHilz = false ;
      A10709H_ColoHilz = httpContext.cgiGet( edtH_ColoHilz_Internalname) ;
      n10709H_ColoHilz = false ;
      GXCCtl = "Z10703H_CodHilz_" + sGXsfl_40_idx ;
      Z10703H_CodHilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10704H_LoteHilz_" + sGXsfl_40_idx ;
      Z10704H_LoteHilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10705H_ProvHilz_" + sGXsfl_40_idx ;
      Z10705H_ProvHilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10706H_NomPHilz_" + sGXsfl_40_idx ;
      Z10706H_NomPHilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10707H_PorcHilz_" + sGXsfl_40_idx ;
      Z10707H_PorcHilz = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10708H_FibrHilz_" + sGXsfl_40_idx ;
      Z10708H_FibrHilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10709H_ColoHilz_" + sGXsfl_40_idx ;
      Z10709H_ColoHilz = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1426_" + sGXsfl_40_idx ;
      nRcdDeleted_1426 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1426_" + sGXsfl_40_idx ;
      nRcdExists_1426 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1426_" + sGXsfl_40_idx ;
      nIsMod_1426 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtH_CodHilz_Enabled = edtH_CodHilz_Enabled ;
   }

   public void confirmValues18W0( )
   {
      nGXsfl_40_idx = 0 ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_401426( ) ;
      while ( nGXsfl_40_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401426( ) ;
         httpContext.changePostValue( "Z10703H_CodHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10703H_CodHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10703H_CodHilz_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10704H_LoteHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10704H_LoteHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10704H_LoteHilz_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10705H_ProvHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10705H_ProvHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10705H_ProvHilz_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10706H_NomPHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10706H_NomPHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10706H_NomPHilz_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10707H_PorcHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10707H_PorcHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10707H_PorcHilz_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10708H_FibrHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10708H_FibrHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10708H_FibrHilz_"+sGXsfl_40_idx) ;
         httpContext.changePostValue( "Z10709H_ColoHilz_"+sGXsfl_40_idx, httpContext.cgiGet( "ZT_"+"Z10709H_ColoHilz_"+sGXsfl_40_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10709H_ColoHilz_"+sGXsfl_40_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talmpz3", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10588H_RecCod", GXutil.ltrim( localUtil.ntoc( Z10588H_RecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10604H_RecPie", GXutil.rtrim( Z10604H_RecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nGXsfl_40_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.talmpz3", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TALMPZ3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", "") ;
   }

   public void initializeNonKey18W1425( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
   }

   public void initAll18W1425( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A10588H_RecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A10588H_RecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10588H_RecCod), 8, 0));
      A10604H_RecPie = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10604H_RecPie", A10604H_RecPie);
      initializeNonKey18W1425( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18W1426( )
   {
      A10704H_LoteHilz = "" ;
      n10704H_LoteHilz = false ;
      A10705H_ProvHilz = "" ;
      n10705H_ProvHilz = false ;
      A10706H_NomPHilz = "" ;
      n10706H_NomPHilz = false ;
      A10707H_PorcHilz = (short)(0) ;
      n10707H_PorcHilz = false ;
      A10708H_FibrHilz = "" ;
      n10708H_FibrHilz = false ;
      A10709H_ColoHilz = "" ;
      n10709H_ColoHilz = false ;
      Z10704H_LoteHilz = "" ;
      Z10705H_ProvHilz = "" ;
      Z10706H_NomPHilz = "" ;
      Z10707H_PorcHilz = (short)(0) ;
      Z10708H_FibrHilz = "" ;
      Z10709H_ColoHilz = "" ;
   }

   public void initAll18W1426( )
   {
      A10703H_CodHilz = "" ;
      initializeNonKey18W1426( ) ;
   }

   public void standaloneModalInsert18W1426( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555755", true, true);
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
      httpContext.AddJavascriptSource("talmpz3.js", "?20268241555755", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1426( )
   {
      edtH_CodHilz_Enabled = defedtH_CodHilz_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtH_CodHilz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtH_CodHilz_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public void startgridcontrol40( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1426, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1426_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10703H_CodHilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_CodHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10704H_LoteHilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_LoteHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10705H_ProvHilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ProvHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10706H_NomPHilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_NomPHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10707H_PorcHilz, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_PorcHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10708H_FibrHilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_FibrHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10709H_ColoHilz));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtH_ColoHilz_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtH_RecCod_Internalname = "H_RECCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtH_RecPie_Internalname = "H_RECPIE" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1426_Internalname = "vNRCDDELETED_1426" ;
      edtH_CodHilz_Internalname = "H_CODHILZ" ;
      edtH_LoteHilz_Internalname = "H_LOTEHILZ" ;
      edtH_ProvHilz_Internalname = "H_PROVHILZ" ;
      edtH_NomPHilz_Internalname = "H_NOMPHILZ" ;
      edtH_PorcHilz_Internalname = "H_PORCHILZ" ;
      edtH_FibrHilz_Internalname = "H_FIBRHILZ" ;
      edtH_ColoHilz_Internalname = "H_COLOHILZ" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", "") );
      edtH_ColoHilz_Jsonclick = "" ;
      edtH_FibrHilz_Jsonclick = "" ;
      edtH_PorcHilz_Jsonclick = "" ;
      edtH_NomPHilz_Jsonclick = "" ;
      edtH_ProvHilz_Jsonclick = "" ;
      edtH_LoteHilz_Jsonclick = "" ;
      edtH_CodHilz_Jsonclick = "" ;
      edtavnRcdDeleted_1426_Jsonclick = "" ;
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
      edtH_ColoHilz_Enabled = 1 ;
      edtH_FibrHilz_Enabled = 1 ;
      edtH_PorcHilz_Enabled = 1 ;
      edtH_NomPHilz_Enabled = 1 ;
      edtH_ProvHilz_Enabled = 1 ;
      edtH_LoteHilz_Enabled = 1 ;
      edtH_CodHilz_Enabled = 1 ;
      edtavnRcdDeleted_1426_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtH_RecPie_Jsonclick = "" ;
      edtH_RecPie_Backcolor = (int)(0xFFFFFF) ;
      edtH_RecPie_Enabled = 1 ;
      edtH_RecCod_Jsonclick = "" ;
      edtH_RecCod_Backcolor = (int)(0xFFFFFF) ;
      edtH_RecCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Backcolor = (int)(0xFFFFFF) ;
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_401426( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18W1426( ) ;
         standaloneModal18W1426( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18W1426( ) ;
         nGXsfl_40_idx = (int)(nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_401426( ) ;
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
      /* Using cursor T018W16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T018W16_A407EmprNom[0] ;
      n407EmprNom = T018W16_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(14);
      /* Using cursor T018W24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "H_RECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(22);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T018W16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T018W16_A407EmprNom[0] ;
      n407EmprNom = T018W16_n407EmprNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_H_reccod( )
   {
      /* Using cursor T018W24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A10588H_RecCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO ALMACEN PIEZAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "H_RECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_H_recpie( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10588H_RecCod", GXutil.ltrim( localUtil.ntoc( Z10588H_RecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10604H_RecPie", GXutil.rtrim( Z10604H_RecPie));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_H_RECCOD","{handler:'valid_H_reccod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10588H_RecCod',fld:'H_RECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_H_RECCOD",",oparms:[]}");
      setEventMetadata("VALID_H_RECPIE","{handler:'valid_H_recpie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10588H_RecCod',fld:'H_RECCOD',pic:'ZZZZZZZ9'},{av:'A10604H_RecPie',fld:'H_RECPIE',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_H_RECPIE",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10588H_RecCod'},{av:'Z10604H_RecPie'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_H_CODHILZ","{handler:'valid_H_codhilz',iparms:[]");
      setEventMetadata("VALID_H_CODHILZ",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_H_colohilz',iparms:[]");
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
      pr_default.close(14);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10604H_RecPie = "" ;
      Z10703H_CodHilz = "" ;
      Z10704H_LoteHilz = "" ;
      Z10705H_ProvHilz = "" ;
      Z10706H_NomPHilz = "" ;
      Z10708H_FibrHilz = "" ;
      Z10709H_ColoHilz = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A10604H_RecPie = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1426 = "" ;
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
      sMode1425 = "" ;
      GXCCtl = "" ;
      A10703H_CodHilz = "" ;
      A10704H_LoteHilz = "" ;
      A10705H_ProvHilz = "" ;
      A10706H_NomPHilz = "" ;
      A10708H_FibrHilz = "" ;
      A10709H_ColoHilz = "" ;
      Z407EmprNom = "" ;
      T018W8_A10604H_RecPie = new String[] {""} ;
      T018W8_A407EmprNom = new String[] {""} ;
      T018W8_n407EmprNom = new boolean[] {false} ;
      T018W8_A396EmprCod = new String[] {""} ;
      T018W8_A10588H_RecCod = new int[1] ;
      T018W6_A407EmprNom = new String[] {""} ;
      T018W6_n407EmprNom = new boolean[] {false} ;
      T018W7_A396EmprCod = new String[] {""} ;
      T018W9_A407EmprNom = new String[] {""} ;
      T018W9_n407EmprNom = new boolean[] {false} ;
      T018W10_A396EmprCod = new String[] {""} ;
      T018W11_A396EmprCod = new String[] {""} ;
      T018W11_A10588H_RecCod = new int[1] ;
      T018W11_A10604H_RecPie = new String[] {""} ;
      T018W5_A10604H_RecPie = new String[] {""} ;
      T018W5_A396EmprCod = new String[] {""} ;
      T018W5_A10588H_RecCod = new int[1] ;
      T018W12_A396EmprCod = new String[] {""} ;
      T018W12_A10588H_RecCod = new int[1] ;
      T018W12_A10604H_RecPie = new String[] {""} ;
      T018W13_A396EmprCod = new String[] {""} ;
      T018W13_A10588H_RecCod = new int[1] ;
      T018W13_A10604H_RecPie = new String[] {""} ;
      T018W4_A10604H_RecPie = new String[] {""} ;
      T018W4_A396EmprCod = new String[] {""} ;
      T018W4_A10588H_RecCod = new int[1] ;
      T018W16_A407EmprNom = new String[] {""} ;
      T018W16_n407EmprNom = new boolean[] {false} ;
      T018W17_A396EmprCod = new String[] {""} ;
      T018W17_A10588H_RecCod = new int[1] ;
      T018W17_A10604H_RecPie = new String[] {""} ;
      T018W18_A10588H_RecCod = new int[1] ;
      T018W18_A10604H_RecPie = new String[] {""} ;
      T018W18_A10703H_CodHilz = new String[] {""} ;
      T018W18_A10704H_LoteHilz = new String[] {""} ;
      T018W18_n10704H_LoteHilz = new boolean[] {false} ;
      T018W18_A10705H_ProvHilz = new String[] {""} ;
      T018W18_n10705H_ProvHilz = new boolean[] {false} ;
      T018W18_A10706H_NomPHilz = new String[] {""} ;
      T018W18_n10706H_NomPHilz = new boolean[] {false} ;
      T018W18_A10707H_PorcHilz = new short[1] ;
      T018W18_n10707H_PorcHilz = new boolean[] {false} ;
      T018W18_A10708H_FibrHilz = new String[] {""} ;
      T018W18_n10708H_FibrHilz = new boolean[] {false} ;
      T018W18_A10709H_ColoHilz = new String[] {""} ;
      T018W18_n10709H_ColoHilz = new boolean[] {false} ;
      T018W18_A396EmprCod = new String[] {""} ;
      T018W19_A396EmprCod = new String[] {""} ;
      T018W19_A10588H_RecCod = new int[1] ;
      T018W19_A10604H_RecPie = new String[] {""} ;
      T018W19_A10703H_CodHilz = new String[] {""} ;
      T018W3_A10588H_RecCod = new int[1] ;
      T018W3_A10604H_RecPie = new String[] {""} ;
      T018W3_A10703H_CodHilz = new String[] {""} ;
      T018W3_A10704H_LoteHilz = new String[] {""} ;
      T018W3_n10704H_LoteHilz = new boolean[] {false} ;
      T018W3_A10705H_ProvHilz = new String[] {""} ;
      T018W3_n10705H_ProvHilz = new boolean[] {false} ;
      T018W3_A10706H_NomPHilz = new String[] {""} ;
      T018W3_n10706H_NomPHilz = new boolean[] {false} ;
      T018W3_A10707H_PorcHilz = new short[1] ;
      T018W3_n10707H_PorcHilz = new boolean[] {false} ;
      T018W3_A10708H_FibrHilz = new String[] {""} ;
      T018W3_n10708H_FibrHilz = new boolean[] {false} ;
      T018W3_A10709H_ColoHilz = new String[] {""} ;
      T018W3_n10709H_ColoHilz = new boolean[] {false} ;
      T018W3_A396EmprCod = new String[] {""} ;
      T018W2_A10588H_RecCod = new int[1] ;
      T018W2_A10604H_RecPie = new String[] {""} ;
      T018W2_A10703H_CodHilz = new String[] {""} ;
      T018W2_A10704H_LoteHilz = new String[] {""} ;
      T018W2_n10704H_LoteHilz = new boolean[] {false} ;
      T018W2_A10705H_ProvHilz = new String[] {""} ;
      T018W2_n10705H_ProvHilz = new boolean[] {false} ;
      T018W2_A10706H_NomPHilz = new String[] {""} ;
      T018W2_n10706H_NomPHilz = new boolean[] {false} ;
      T018W2_A10707H_PorcHilz = new short[1] ;
      T018W2_n10707H_PorcHilz = new boolean[] {false} ;
      T018W2_A10708H_FibrHilz = new String[] {""} ;
      T018W2_n10708H_FibrHilz = new boolean[] {false} ;
      T018W2_A10709H_ColoHilz = new String[] {""} ;
      T018W2_n10709H_ColoHilz = new boolean[] {false} ;
      T018W2_A396EmprCod = new String[] {""} ;
      T018W23_A396EmprCod = new String[] {""} ;
      T018W23_A10588H_RecCod = new int[1] ;
      T018W23_A10604H_RecPie = new String[] {""} ;
      T018W23_A10703H_CodHilz = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018W24_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ10604H_RecPie = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talmpz3__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talmpz3__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talmpz3__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talmpz3__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talmpz3__default(),
         new Object[] {
             new Object[] {
            T018W2_A10588H_RecCod, T018W2_A10604H_RecPie, T018W2_A10703H_CodHilz, T018W2_A10704H_LoteHilz, T018W2_n10704H_LoteHilz, T018W2_A10705H_ProvHilz, T018W2_n10705H_ProvHilz, T018W2_A10706H_NomPHilz, T018W2_n10706H_NomPHilz, T018W2_A10707H_PorcHilz,
            T018W2_n10707H_PorcHilz, T018W2_A10708H_FibrHilz, T018W2_n10708H_FibrHilz, T018W2_A10709H_ColoHilz, T018W2_n10709H_ColoHilz, T018W2_A396EmprCod
            }
            , new Object[] {
            T018W3_A10588H_RecCod, T018W3_A10604H_RecPie, T018W3_A10703H_CodHilz, T018W3_A10704H_LoteHilz, T018W3_n10704H_LoteHilz, T018W3_A10705H_ProvHilz, T018W3_n10705H_ProvHilz, T018W3_A10706H_NomPHilz, T018W3_n10706H_NomPHilz, T018W3_A10707H_PorcHilz,
            T018W3_n10707H_PorcHilz, T018W3_A10708H_FibrHilz, T018W3_n10708H_FibrHilz, T018W3_A10709H_ColoHilz, T018W3_n10709H_ColoHilz, T018W3_A396EmprCod
            }
            , new Object[] {
            T018W4_A10604H_RecPie, T018W4_A396EmprCod, T018W4_A10588H_RecCod
            }
            , new Object[] {
            T018W5_A10604H_RecPie, T018W5_A396EmprCod, T018W5_A10588H_RecCod
            }
            , new Object[] {
            T018W6_A407EmprNom, T018W6_n407EmprNom
            }
            , new Object[] {
            T018W7_A396EmprCod
            }
            , new Object[] {
            T018W8_A10604H_RecPie, T018W8_A407EmprNom, T018W8_n407EmprNom, T018W8_A396EmprCod, T018W8_A10588H_RecCod
            }
            , new Object[] {
            T018W9_A407EmprNom, T018W9_n407EmprNom
            }
            , new Object[] {
            T018W10_A396EmprCod
            }
            , new Object[] {
            T018W11_A396EmprCod, T018W11_A10588H_RecCod, T018W11_A10604H_RecPie
            }
            , new Object[] {
            T018W12_A396EmprCod, T018W12_A10588H_RecCod, T018W12_A10604H_RecPie
            }
            , new Object[] {
            T018W13_A396EmprCod, T018W13_A10588H_RecCod, T018W13_A10604H_RecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018W16_A407EmprNom, T018W16_n407EmprNom
            }
            , new Object[] {
            T018W17_A396EmprCod, T018W17_A10588H_RecCod, T018W17_A10604H_RecPie
            }
            , new Object[] {
            T018W18_A10588H_RecCod, T018W18_A10604H_RecPie, T018W18_A10703H_CodHilz, T018W18_A10704H_LoteHilz, T018W18_n10704H_LoteHilz, T018W18_A10705H_ProvHilz, T018W18_n10705H_ProvHilz, T018W18_A10706H_NomPHilz, T018W18_n10706H_NomPHilz, T018W18_A10707H_PorcHilz,
            T018W18_n10707H_PorcHilz, T018W18_A10708H_FibrHilz, T018W18_n10708H_FibrHilz, T018W18_A10709H_ColoHilz, T018W18_n10709H_ColoHilz, T018W18_A396EmprCod
            }
            , new Object[] {
            T018W19_A396EmprCod, T018W19_A10588H_RecCod, T018W19_A10604H_RecPie, T018W19_A10703H_CodHilz
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018W23_A396EmprCod, T018W23_A10588H_RecCod, T018W23_A10604H_RecPie, T018W23_A10703H_CodHilz
            }
            , new Object[] {
            T018W24_A396EmprCod
            }
         }
      );
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
   private short Z10707H_PorcHilz ;
   private short nRcdDeleted_1426 ;
   private short nRcdExists_1426 ;
   private short nIsMod_1426 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1426 ;
   private short RcdFound1426 ;
   private short nBlankRcdUsr1426 ;
   private short A10707H_PorcHilz ;
   private short RcdFound1425 ;
   private short nIsDirty_1425 ;
   private short nIsDirty_1426 ;
   private int Z10588H_RecCod ;
   private int nRC_GXsfl_40 ;
   private int nGXsfl_40_idx=1 ;
   private int A10588H_RecCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtH_RecCod_Enabled ;
   private int edtH_RecPie_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1426_Enabled ;
   private int edtH_CodHilz_Enabled ;
   private int edtH_LoteHilz_Enabled ;
   private int edtH_ProvHilz_Enabled ;
   private int edtH_NomPHilz_Enabled ;
   private int edtH_PorcHilz_Enabled ;
   private int edtH_FibrHilz_Enabled ;
   private int edtH_ColoHilz_Enabled ;
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
   private int defedtH_CodHilz_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtH_RecPie_Backcolor ;
   private int edtH_RecCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10588H_RecCod ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10604H_RecPie ;
   private String Z10703H_CodHilz ;
   private String Z10704H_LoteHilz ;
   private String Z10705H_ProvHilz ;
   private String Z10706H_NomPHilz ;
   private String Z10708H_FibrHilz ;
   private String Z10709H_ColoHilz ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_40_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtH_RecCod_Internalname ;
   private String edtH_RecCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtH_RecPie_Internalname ;
   private String A10604H_RecPie ;
   private String edtH_RecPie_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1426 ;
   private String edtavnRcdDeleted_1426_Internalname ;
   private String edtH_CodHilz_Internalname ;
   private String edtH_LoteHilz_Internalname ;
   private String edtH_ProvHilz_Internalname ;
   private String edtH_NomPHilz_Internalname ;
   private String edtH_PorcHilz_Internalname ;
   private String edtH_FibrHilz_Internalname ;
   private String edtH_ColoHilz_Internalname ;
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
   private String sMode1425 ;
   private String GXCCtl ;
   private String A10703H_CodHilz ;
   private String A10704H_LoteHilz ;
   private String A10705H_ProvHilz ;
   private String A10706H_NomPHilz ;
   private String A10708H_FibrHilz ;
   private String A10709H_ColoHilz ;
   private String Z407EmprNom ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1426_Jsonclick ;
   private String edtH_CodHilz_Jsonclick ;
   private String edtH_LoteHilz_Jsonclick ;
   private String edtH_ProvHilz_Jsonclick ;
   private String edtH_NomPHilz_Jsonclick ;
   private String edtH_PorcHilz_Jsonclick ;
   private String edtH_FibrHilz_Jsonclick ;
   private String edtH_ColoHilz_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ10604H_RecPie ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10704H_LoteHilz ;
   private boolean n10705H_ProvHilz ;
   private boolean n10706H_NomPHilz ;
   private boolean n10707H_PorcHilz ;
   private boolean n10708H_FibrHilz ;
   private boolean n10709H_ColoHilz ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018W8_A10604H_RecPie ;
   private String[] T018W8_A407EmprNom ;
   private boolean[] T018W8_n407EmprNom ;
   private String[] T018W8_A396EmprCod ;
   private int[] T018W8_A10588H_RecCod ;
   private String[] T018W6_A407EmprNom ;
   private boolean[] T018W6_n407EmprNom ;
   private String[] T018W7_A396EmprCod ;
   private String[] T018W9_A407EmprNom ;
   private boolean[] T018W9_n407EmprNom ;
   private String[] T018W10_A396EmprCod ;
   private String[] T018W11_A396EmprCod ;
   private int[] T018W11_A10588H_RecCod ;
   private String[] T018W11_A10604H_RecPie ;
   private String[] T018W5_A10604H_RecPie ;
   private String[] T018W5_A396EmprCod ;
   private int[] T018W5_A10588H_RecCod ;
   private String[] T018W12_A396EmprCod ;
   private int[] T018W12_A10588H_RecCod ;
   private String[] T018W12_A10604H_RecPie ;
   private String[] T018W13_A396EmprCod ;
   private int[] T018W13_A10588H_RecCod ;
   private String[] T018W13_A10604H_RecPie ;
   private String[] T018W4_A10604H_RecPie ;
   private String[] T018W4_A396EmprCod ;
   private int[] T018W4_A10588H_RecCod ;
   private String[] T018W16_A407EmprNom ;
   private boolean[] T018W16_n407EmprNom ;
   private String[] T018W17_A396EmprCod ;
   private int[] T018W17_A10588H_RecCod ;
   private String[] T018W17_A10604H_RecPie ;
   private int[] T018W18_A10588H_RecCod ;
   private String[] T018W18_A10604H_RecPie ;
   private String[] T018W18_A10703H_CodHilz ;
   private String[] T018W18_A10704H_LoteHilz ;
   private boolean[] T018W18_n10704H_LoteHilz ;
   private String[] T018W18_A10705H_ProvHilz ;
   private boolean[] T018W18_n10705H_ProvHilz ;
   private String[] T018W18_A10706H_NomPHilz ;
   private boolean[] T018W18_n10706H_NomPHilz ;
   private short[] T018W18_A10707H_PorcHilz ;
   private boolean[] T018W18_n10707H_PorcHilz ;
   private String[] T018W18_A10708H_FibrHilz ;
   private boolean[] T018W18_n10708H_FibrHilz ;
   private String[] T018W18_A10709H_ColoHilz ;
   private boolean[] T018W18_n10709H_ColoHilz ;
   private String[] T018W18_A396EmprCod ;
   private String[] T018W19_A396EmprCod ;
   private int[] T018W19_A10588H_RecCod ;
   private String[] T018W19_A10604H_RecPie ;
   private String[] T018W19_A10703H_CodHilz ;
   private int[] T018W3_A10588H_RecCod ;
   private String[] T018W3_A10604H_RecPie ;
   private String[] T018W3_A10703H_CodHilz ;
   private String[] T018W3_A10704H_LoteHilz ;
   private boolean[] T018W3_n10704H_LoteHilz ;
   private String[] T018W3_A10705H_ProvHilz ;
   private boolean[] T018W3_n10705H_ProvHilz ;
   private String[] T018W3_A10706H_NomPHilz ;
   private boolean[] T018W3_n10706H_NomPHilz ;
   private short[] T018W3_A10707H_PorcHilz ;
   private boolean[] T018W3_n10707H_PorcHilz ;
   private String[] T018W3_A10708H_FibrHilz ;
   private boolean[] T018W3_n10708H_FibrHilz ;
   private String[] T018W3_A10709H_ColoHilz ;
   private boolean[] T018W3_n10709H_ColoHilz ;
   private String[] T018W3_A396EmprCod ;
   private int[] T018W2_A10588H_RecCod ;
   private String[] T018W2_A10604H_RecPie ;
   private String[] T018W2_A10703H_CodHilz ;
   private String[] T018W2_A10704H_LoteHilz ;
   private boolean[] T018W2_n10704H_LoteHilz ;
   private String[] T018W2_A10705H_ProvHilz ;
   private boolean[] T018W2_n10705H_ProvHilz ;
   private String[] T018W2_A10706H_NomPHilz ;
   private boolean[] T018W2_n10706H_NomPHilz ;
   private short[] T018W2_A10707H_PorcHilz ;
   private boolean[] T018W2_n10707H_PorcHilz ;
   private String[] T018W2_A10708H_FibrHilz ;
   private boolean[] T018W2_n10708H_FibrHilz ;
   private String[] T018W2_A10709H_ColoHilz ;
   private boolean[] T018W2_n10709H_ColoHilz ;
   private String[] T018W2_A396EmprCod ;
   private String[] T018W23_A396EmprCod ;
   private int[] T018W23_A10588H_RecCod ;
   private String[] T018W23_A10604H_RecPie ;
   private String[] T018W23_A10703H_CodHilz ;
   private String[] T018W24_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talmpz3__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz3__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz3__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz3__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talmpz3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018W2", "SELECT H_RecCod, H_RecPie, H_CodHilz, H_LoteHilz, H_ProvHilz, H_NomPHilz, H_PorcHilz, H_FibrHilz, H_ColoHilz, EmprCod FROM TXPALMPZ3 WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? AND H_CodHilz = ?  FOR UPDATE OF H_LoteHilz, H_ProvHilz, H_NomPHilz, H_PorcHilz, H_FibrHilz, H_ColoHilz NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W3", "SELECT H_RecCod, H_RecPie, H_CodHilz, H_LoteHilz, H_ProvHilz, H_NomPHilz, H_PorcHilz, H_FibrHilz, H_ColoHilz, EmprCod FROM TXPALMPZ3 WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? AND H_CodHilz = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W4", "SELECT H_RecPie, EmprCod, H_RecCod FROM TXPALMPZ1 WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ?  FOR UPDATE OF H_RecPie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W5", "SELECT H_RecPie, EmprCod, H_RecCod FROM TXPALMPZ1 WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W7", "SELECT EmprCod FROM TXPALMPZ0 WHERE EmprCod = ? AND H_RecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W8", "SELECT /*+ FIRST_ROWS(100) */ TM1.H_RecPie, T2.EmprNom, TM1.EmprCod, TM1.H_RecCod FROM (TXPALMPZ1 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.H_RecCod = ? and TM1.H_RecPie = ? ORDER BY TM1.EmprCod, TM1.H_RecCod, TM1.H_RecPie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W9", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W10", "SELECT EmprCod FROM TXPALMPZ0 WHERE EmprCod = ? AND H_RecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, H_RecCod, H_RecPie FROM TXPALMPZ1 WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, H_RecCod, H_RecPie FROM TXPALMPZ1 WHERE ( EmprCod > ? or EmprCod = ? and H_RecCod > ? or H_RecCod = ? and EmprCod = ? and H_RecPie > ?) ORDER BY EmprCod, H_RecCod, H_RecPie) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018W13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, H_RecCod, H_RecPie FROM TXPALMPZ1 WHERE ( EmprCod < ? or EmprCod = ? and H_RecCod < ? or H_RecCod = ? and EmprCod = ? and H_RecPie < ?) ORDER BY EmprCod DESC, H_RecCod DESC, H_RecPie DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018W14", "INSERT INTO TXPALMPZ1(H_RecPie, EmprCod, H_RecCod, H_RecAnh, H_RecMtr, H_RecKgm, H_RecMtrU, H_RecKgmU, H_RecCol, H_RecIdPz, H_RecIdRc, H_RecPal, H_RPIELOC, H_RPIETEL, H_RPIEOPE, H_RPIEST, H_RecFec, H_RecPnt, H_RecCo1, H_RecCo2, H_Hdr, H_Hdrr, H_Hdrp, H_SerT, H_ColNm, H_ColNn, H_KgsPf, H_MtsPf, H_Afin, H_NPed, H_Obsp, H_Dib, H_Tua, H_Tub, H_Tuc, H_Hilz, H_FecE, H_PedOr, H_Rack, H_PoS, H_Ok, H_Talla, H_Und, H_Medt, H_ColNNn, H_Por, H_codb, H_Pes, H_DibO, H_item3, H_ToE, H_DescP, H_CVar, H_NVar) VALUES(?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPALMPZ1")
         ,new UpdateCursor("T018W15", "DELETE FROM TXPALMPZ1  WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ?", GX_NOMASK, "TXPALMPZ1")
         ,new ForEachCursor("T018W16", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, H_RecCod, H_RecPie FROM TXPALMPZ1 ORDER BY EmprCod, H_RecCod, H_RecPie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W18", "SELECT H_RecCod, H_RecPie, H_CodHilz, H_LoteHilz, H_ProvHilz, H_NomPHilz, H_PorcHilz, H_FibrHilz, H_ColoHilz, EmprCod FROM TXPALMPZ3 WHERE EmprCod = ? and H_RecCod = ? and H_RecPie = ? and H_CodHilz = ? ORDER BY EmprCod, H_RecCod, H_RecPie, H_CodHilz ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W19", "SELECT EmprCod, H_RecCod, H_RecPie, H_CodHilz FROM TXPALMPZ3 WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? AND H_CodHilz = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018W20", "INSERT INTO TXPALMPZ3(H_RecCod, H_RecPie, H_CodHilz, H_LoteHilz, H_ProvHilz, H_NomPHilz, H_PorcHilz, H_FibrHilz, H_ColoHilz, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPALMPZ3")
         ,new UpdateCursor("T018W21", "UPDATE TXPALMPZ3 SET H_LoteHilz=?, H_ProvHilz=?, H_NomPHilz=?, H_PorcHilz=?, H_FibrHilz=?, H_ColoHilz=?  WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? AND H_CodHilz = ?", GX_NOMASK, "TXPALMPZ3")
         ,new UpdateCursor("T018W22", "DELETE FROM TXPALMPZ3  WHERE EmprCod = ? AND H_RecCod = ? AND H_RecPie = ? AND H_CodHilz = ?", GX_NOMASK, "TXPALMPZ3")
         ,new ForEachCursor("T018W23", "SELECT EmprCod, H_RecCod, H_RecPie, H_CodHilz FROM TXPALMPZ3 WHERE EmprCod = ? and H_RecCod = ? and H_RecPie = ? ORDER BY EmprCod, H_RecCod, H_RecPie, H_CodHilz ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018W24", "SELECT EmprCod FROM TXPALMPZ0 WHERE EmprCod = ? AND H_RecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 9);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               return;
            case 22 :
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
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 9);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 9);
               stmt.setString(3, (String)parms[2], 20);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 20);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 20);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[8], 60);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 6);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 13);
               }
               stmt.setString(10, (String)parms[15], 3);
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 20);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 60);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 13);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setInt(8, ((Number) parms[13]).intValue());
               stmt.setString(9, (String)parms[14], 9);
               stmt.setString(10, (String)parms[15], 20);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               stmt.setString(4, (String)parms[3], 20);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

