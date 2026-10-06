package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tplamaq_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Maquinas", ""), (short)(0)) ;
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
      nRC_GXsfl_45 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_45"))) ;
      nGXsfl_45_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_45_idx"))) ;
      sGXsfl_45_idx = httpContext.GetPar( "sGXsfl_45_idx") ;
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

   public tplamaq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tplamaq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tplamaq_impl.class ));
   }

   public tplamaq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPlaMaq.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Código Máquina", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Kilos Minimos", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMin_Internalname, GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMin_Enabled!=0) ? localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99") : localUtil.format( A4283MaqKgsMin, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMin_Jsonclick, 0, "", "", "", "", "", 1, edtMaqKgsMin_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Kilos Maximos", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqKgsMax_Internalname, GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMaqKgsMax_Enabled!=0) ? localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99") : localUtil.format( A4285MaqKgsMax, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqKgsMax_Jsonclick, 0, "", "", "", "", "", 1, edtMaqKgsMax_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPlaMaq.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol45( ) ;
      nGXsfl_45_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount862 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_862 = (short)(1) ;
            scanStartSK862( ) ;
            while ( RcdFound862 != 0 )
            {
               init_level_properties862( ) ;
               getByPrimaryKeySK862( ) ;
               addRowSK862( ) ;
               scanNextSK862( ) ;
            }
            scanEndSK862( ) ;
            nBlankRcdCount862 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalSK862( ) ;
         standaloneModalSK862( ) ;
         sMode862 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRowSK862( ) ;
            edtavnRcdDeleted_862_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_862_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_862_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_862_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaMTAOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAORD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAOrd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaMTADsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTADSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaMTADsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTADsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaMTACnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTACND_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaMTACnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTACnd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaMTAMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAMIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAMin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaMTAMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAMAX_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAMax_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtPlaMTAAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAACA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAAca_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_862 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalSK862( ) ;
            }
            sendRowSK862( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode862 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount862 = (short)(5) ;
         nRcdExists_862 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartSK862( ) ;
            while ( RcdFound862 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_45862( ) ;
               init_level_properties862( ) ;
               standaloneNotModalSK862( ) ;
               getByPrimaryKeySK862( ) ;
               standaloneModalSK862( ) ;
               addRowSK862( ) ;
               scanNextSK862( ) ;
            }
            scanEndSK862( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode862 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_45862( ) ;
      initAllSK862( ) ;
      init_level_properties862( ) ;
      nRcdExists_862 = (short)(0) ;
      nIsMod_862 = (short)(0) ;
      nRcdDeleted_862 = (short)(0) ;
      nBlankRcdCount862 = (short)(nBlankRcdUsr862+nBlankRcdCount862) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount862 > 0 )
      {
         standaloneNotModalSK862( ) ;
         standaloneModalSK862( ) ;
         addRowSK862( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPlaMTAOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount862 = (short)(nBlankRcdCount862-1) ;
      }
      Gx_mode = sMode862 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPlaMaq.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPlaMaq.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z606MaqDsc = httpContext.cgiGet( "Z606MaqDsc") ;
         Z4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( "Z4283MaqKgsMin")) ;
         Z4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( "Z4285MaqKgsMax")) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQKGSMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqKgsMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4283MaqKgsMin = DecimalUtil.ZERO ;
            n4283MaqKgsMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         }
         else
         {
            A4283MaqKgsMin = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMin_Internalname)) ;
            n4283MaqKgsMin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MAQKGSMAX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMaqKgsMax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4285MaqKgsMax = DecimalUtil.ZERO ;
            n4285MaqKgsMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
         }
         else
         {
            A4285MaqKgsMax = localUtil.ctond( httpContext.cgiGet( edtMaqKgsMax_Internalname)) ;
            n4285MaqKgsMax = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
            initAllSK65( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_862_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_862_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributesSK65( ) ;
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

   public void confirm_SK0( )
   {
      beforeValidateSK65( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsSK65( ) ;
         }
         else
         {
            checkExtendedTableSK65( ) ;
            if ( AnyError == 0 )
            {
               zmSK65( 2) ;
            }
            closeExtendedTableCursorsSK65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_SK862( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesSK0( ) ;
      }
   }

   public void confirm_SK862( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowSK862( ) ;
         if ( ( nRcdExists_862 != 0 ) || ( nIsMod_862 != 0 ) )
         {
            getKeySK862( ) ;
            if ( ( nRcdExists_862 == 0 ) && ( nRcdDeleted_862 == 0 ) )
            {
               if ( RcdFound862 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateSK862( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableSK862( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsSK862( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PLAMTAORD_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPlaMTAOrd_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound862 != 0 )
               {
                  if ( nRcdDeleted_862 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeySK862( ) ;
                     loadSK862( ) ;
                     beforeValidateSK862( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsSK862( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_862 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateSK862( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableSK862( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsSK862( ) ;
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
                  if ( nRcdDeleted_862 == 0 )
                  {
                     GXCCtl = "PLAMTAORD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaMTAOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_862_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTAOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A5879PlaMTAOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTADsc_Internalname, A11699PlaMTADsc) ;
         httpContext.changePostValue( edtPlaMTACnd_Internalname, A5880PlaMTACnd) ;
         httpContext.changePostValue( edtPlaMTAMin_Internalname, GXutil.ltrim( localUtil.ntoc( A5881PlaMTAMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTAMax_Internalname, GXutil.ltrim( localUtil.ntoc( A5882PlaMTAMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTAAca_Internalname, GXutil.rtrim( A6457PlaMTAAca)) ;
         httpContext.changePostValue( "ZT_"+"Z5879PlaMTAOrd_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5879PlaMTAOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11699PlaMTADsc_"+sGXsfl_45_idx, Z11699PlaMTADsc) ;
         httpContext.changePostValue( "ZT_"+"Z5880PlaMTACnd_"+sGXsfl_45_idx, Z5880PlaMTACnd) ;
         httpContext.changePostValue( "ZT_"+"Z5881PlaMTAMin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5881PlaMTAMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5882PlaMTAMax_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5882PlaMTAMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6457PlaMTAAca_"+sGXsfl_45_idx, GXutil.rtrim( Z6457PlaMTAAca)) ;
         httpContext.changePostValue( "nRcdDeleted_862_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_862_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_862_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_862 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_862_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_862_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAORD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTADSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTADsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTACND_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTACnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAMIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAMAX_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAACA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionSK0( )
   {
   }

   public void zmSK65( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z606MaqDsc = T00SK5_A606MaqDsc[0] ;
            Z4283MaqKgsMin = T00SK5_A4283MaqKgsMin[0] ;
            Z4285MaqKgsMax = T00SK5_A4285MaqKgsMax[0] ;
         }
         else
         {
            Z606MaqDsc = A606MaqDsc ;
            Z4283MaqKgsMin = A4283MaqKgsMin ;
            Z4285MaqKgsMax = A4285MaqKgsMax ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z602MaqCod = A602MaqCod ;
         Z606MaqDsc = A606MaqDsc ;
         Z4283MaqKgsMin = A4283MaqKgsMin ;
         Z4285MaqKgsMax = A4285MaqKgsMax ;
         Z396EmprCod = A396EmprCod ;
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

   public void loadSK65( )
   {
      /* Using cursor T00SK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A606MaqDsc = T00SK7_A606MaqDsc[0] ;
         n606MaqDsc = T00SK7_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A4283MaqKgsMin = T00SK7_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = T00SK7_n4283MaqKgsMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         A4285MaqKgsMax = T00SK7_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = T00SK7_n4285MaqKgsMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
         zmSK65( -1) ;
      }
      pr_default.close(5);
      onLoadActionsSK65( ) ;
   }

   public void onLoadActionsSK65( )
   {
   }

   public void checkExtendedTableSK65( )
   {
      nIsDirty_65 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00SK6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursorsSK65( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_2( String A396EmprCod )
   {
      /* Using cursor T00SK8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKeySK65( )
   {
      /* Using cursor T00SK9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00SK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmSK65( 1) ;
         RcdFound65 = (short)(1) ;
         A602MaqCod = T00SK5_A602MaqCod[0] ;
         n602MaqCod = T00SK5_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = T00SK5_A606MaqDsc[0] ;
         n606MaqDsc = T00SK5_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A4283MaqKgsMin = T00SK5_A4283MaqKgsMin[0] ;
         n4283MaqKgsMin = T00SK5_n4283MaqKgsMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
         A4285MaqKgsMax = T00SK5_A4285MaqKgsMax[0] ;
         n4285MaqKgsMax = T00SK5_n4285MaqKgsMax[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
         A396EmprCod = T00SK5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadSK65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKeySK65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKeySK65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeySK65( ) ;
      if ( RcdFound65 == 0 )
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
      RcdFound65 = (short)(0) ;
      /* Using cursor T00SK10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00SK10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00SK10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00SK10_A602MaqCod[0], A602MaqCod) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00SK10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00SK10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00SK10_A602MaqCod[0], A602MaqCod) > 0 ) ) )
         {
            A396EmprCod = T00SK10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T00SK10_A602MaqCod[0] ;
            n602MaqCod = T00SK10_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T00SK11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00SK11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00SK11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00SK11_A602MaqCod[0], A602MaqCod) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00SK11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00SK11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00SK11_A602MaqCod[0], A602MaqCod) < 0 ) ) )
         {
            A396EmprCod = T00SK11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T00SK11_A602MaqCod[0] ;
            n602MaqCod = T00SK11_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeySK65( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertSK65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
               updateSK65( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertSK65( ) ;
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
                  insertSK65( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
      getKeySK65( ) ;
      if ( RcdFound65 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
         {
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = Z602MaqCod ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tplamaq");
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_SK0( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartSK65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndSK65( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
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
      scanStartSK65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound65 != 0 )
         {
            scanNextSK65( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtMaqDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndSK65( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencySK65( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z606MaqDsc, T00SK4_A606MaqDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4283MaqKgsMin, T00SK4_A4283MaqKgsMin[0]) != 0 ) || ( DecimalUtil.compareTo(Z4285MaqKgsMax, T00SK4_A4285MaqKgsMax[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z606MaqDsc, T00SK4_A606MaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"MaqDsc");
               GXutil.writeLogRaw("Old: ",Z606MaqDsc);
               GXutil.writeLogRaw("Current: ",T00SK4_A606MaqDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z4283MaqKgsMin, T00SK4_A4283MaqKgsMin[0]) != 0 )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"MaqKgsMin");
               GXutil.writeLogRaw("Old: ",Z4283MaqKgsMin);
               GXutil.writeLogRaw("Current: ",T00SK4_A4283MaqKgsMin[0]);
            }
            if ( DecimalUtil.compareTo(Z4285MaqKgsMax, T00SK4_A4285MaqKgsMax[0]) != 0 )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"MaqKgsMax");
               GXutil.writeLogRaw("Old: ",Z4285MaqKgsMax);
               GXutil.writeLogRaw("Current: ",T00SK4_A4285MaqKgsMax[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQUIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSK65( )
   {
      beforeValidateSK65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSK65( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSK65( 0) ;
         checkOptimisticConcurrencySK65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSK65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSK65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SK12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n606MaqDsc), A606MaqDsc, Boolean.valueOf(n4283MaqKgsMin), A4283MaqKgsMin, Boolean.valueOf(n4285MaqKgsMax), A4285MaqKgsMax, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevelSK65( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionSK0( ) ;
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
            loadSK65( ) ;
         }
         endLevelSK65( ) ;
      }
      closeExtendedTableCursorsSK65( ) ;
   }

   public void updateSK65( )
   {
      beforeValidateSK65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSK65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySK65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSK65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateSK65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SK13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n606MaqDsc), A606MaqDsc, Boolean.valueOf(n4283MaqKgsMin), A4283MaqKgsMin, Boolean.valueOf(n4285MaqKgsMax), A4285MaqKgsMax, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateSK65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelSK65( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionSK0( ) ;
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
         endLevelSK65( ) ;
      }
      closeExtendedTableCursorsSK65( ) ;
   }

   public void deferredUpdateSK65( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSK65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySK65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSK65( ) ;
         afterConfirmSK65( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSK65( ) ;
            if ( AnyError == 0 )
            {
               scanStartSK862( ) ;
               while ( RcdFound862 != 0 )
               {
                  getByPrimaryKeySK862( ) ;
                  deleteSK862( ) ;
                  scanNextSK862( ) ;
               }
               scanEndSK862( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SK14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound65 == 0 )
                        {
                           initAllSK65( ) ;
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
                        resetCaptionSK0( ) ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSK65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSK65( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00SK15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Costes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00SK16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00SK17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00SK18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLNMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00SK19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00SK20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Recetas Lavados Maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00SK21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00SK22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00SK23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00SK24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00SK25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Uso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00SK26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00SK27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Documentos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00SK28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MQDDOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00SK29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATF1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00SK30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00SK31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFABS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00SK32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MSolicitudes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00SK33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MPreventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00SK34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00SK35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00SK36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONVPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00SK37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00SK38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTNQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00SK39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARTM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00SK40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00SK41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQGR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00SK42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Líneas Costes Retroalimentados", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00SK43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00SK44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00SK45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00SK46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00SK47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00SK48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00SK49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00SK50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPLATI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00SK51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQMAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00SK52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00SK53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00SK54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00SK55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMHPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00SK56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00SK57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00SK58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00SK59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00SK60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00SK61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00SK62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00SK63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
      }
   }

   public void processNestedLevelSK862( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRowSK862( ) ;
         if ( ( nRcdExists_862 != 0 ) || ( nIsMod_862 != 0 ) )
         {
            standaloneNotModalSK862( ) ;
            getKeySK862( ) ;
            if ( ( nRcdExists_862 == 0 ) && ( nRcdDeleted_862 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertSK862( ) ;
            }
            else
            {
               if ( RcdFound862 != 0 )
               {
                  if ( ( nRcdDeleted_862 != 0 ) && ( nRcdExists_862 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteSK862( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_862 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateSK862( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_862 == 0 )
                  {
                     GXCCtl = "PLAMTAORD_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPlaMTAOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_862_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTAOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A5879PlaMTAOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTADsc_Internalname, A11699PlaMTADsc) ;
         httpContext.changePostValue( edtPlaMTACnd_Internalname, A5880PlaMTACnd) ;
         httpContext.changePostValue( edtPlaMTAMin_Internalname, GXutil.ltrim( localUtil.ntoc( A5881PlaMTAMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTAMax_Internalname, GXutil.ltrim( localUtil.ntoc( A5882PlaMTAMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPlaMTAAca_Internalname, GXutil.rtrim( A6457PlaMTAAca)) ;
         httpContext.changePostValue( "ZT_"+"Z5879PlaMTAOrd_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5879PlaMTAOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11699PlaMTADsc_"+sGXsfl_45_idx, Z11699PlaMTADsc) ;
         httpContext.changePostValue( "ZT_"+"Z5880PlaMTACnd_"+sGXsfl_45_idx, Z5880PlaMTACnd) ;
         httpContext.changePostValue( "ZT_"+"Z5881PlaMTAMin_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5881PlaMTAMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5882PlaMTAMax_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z5882PlaMTAMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6457PlaMTAAca_"+sGXsfl_45_idx, GXutil.rtrim( Z6457PlaMTAAca)) ;
         httpContext.changePostValue( "nRcdDeleted_862_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_862_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_862_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_862 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_862_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_862_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAORD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTADSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTADsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTACND_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTACnd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAMIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAMAX_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PLAMTAACA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAAca_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllSK862( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_862 = (short)(0) ;
      nIsMod_862 = (short)(0) ;
      nRcdDeleted_862 = (short)(0) ;
   }

   public void processLevelSK65( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevelSK862( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelSK65( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteSK65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tplamaq");
         if ( AnyError == 0 )
         {
            confirmValuesSK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tplamaq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartSK65( )
   {
      /* Using cursor T00SK64 */
      pr_default.execute(62);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A396EmprCod = T00SK64_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T00SK64_A602MaqCod[0] ;
         n602MaqCod = T00SK64_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSK65( )
   {
      /* Scan next routine */
      pr_default.readNext(62);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(62) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A396EmprCod = T00SK64_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T00SK64_A602MaqCod[0] ;
         n602MaqCod = T00SK64_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
   }

   public void scanEndSK65( )
   {
      pr_default.close(62);
   }

   public void afterConfirmSK65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSK65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSK65( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSK65( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSK65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSK65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSK65( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtMaqKgsMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMin_Enabled), 5, 0), true);
      edtMaqKgsMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqKgsMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqKgsMax_Enabled), 5, 0), true);
   }

   public void zmSK862( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11699PlaMTADsc = T00SK3_A11699PlaMTADsc[0] ;
            Z5880PlaMTACnd = T00SK3_A5880PlaMTACnd[0] ;
            Z5881PlaMTAMin = T00SK3_A5881PlaMTAMin[0] ;
            Z5882PlaMTAMax = T00SK3_A5882PlaMTAMax[0] ;
            Z6457PlaMTAAca = T00SK3_A6457PlaMTAAca[0] ;
         }
         else
         {
            Z11699PlaMTADsc = A11699PlaMTADsc ;
            Z5880PlaMTACnd = A5880PlaMTACnd ;
            Z5881PlaMTAMin = A5881PlaMTAMin ;
            Z5882PlaMTAMax = A5882PlaMTAMax ;
            Z6457PlaMTAAca = A6457PlaMTAAca ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z602MaqCod = A602MaqCod ;
         Z5879PlaMTAOrd = A5879PlaMTAOrd ;
         Z11699PlaMTADsc = A11699PlaMTADsc ;
         Z5880PlaMTACnd = A5880PlaMTACnd ;
         Z5881PlaMTAMin = A5881PlaMTAMin ;
         Z5882PlaMTAMax = A5882PlaMTAMax ;
         Z6457PlaMTAAca = A6457PlaMTAAca ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalSK862( )
   {
   }

   public void standaloneModalSK862( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPlaMTAOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAOrd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtPlaMTAOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAOrd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void loadSK862( )
   {
      /* Using cursor T00SK65 */
      pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound862 = (short)(1) ;
         A11699PlaMTADsc = T00SK65_A11699PlaMTADsc[0] ;
         A5880PlaMTACnd = T00SK65_A5880PlaMTACnd[0] ;
         n5880PlaMTACnd = T00SK65_n5880PlaMTACnd[0] ;
         A5881PlaMTAMin = T00SK65_A5881PlaMTAMin[0] ;
         n5881PlaMTAMin = T00SK65_n5881PlaMTAMin[0] ;
         A5882PlaMTAMax = T00SK65_A5882PlaMTAMax[0] ;
         n5882PlaMTAMax = T00SK65_n5882PlaMTAMax[0] ;
         A6457PlaMTAAca = T00SK65_A6457PlaMTAAca[0] ;
         n6457PlaMTAAca = T00SK65_n6457PlaMTAAca[0] ;
         zmSK862( -3) ;
      }
      pr_default.close(63);
      onLoadActionsSK862( ) ;
   }

   public void onLoadActionsSK862( )
   {
   }

   public void checkExtendedTableSK862( )
   {
      nIsDirty_862 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalSK862( ) ;
   }

   public void closeExtendedTableCursorsSK862( )
   {
   }

   public void enableDisableSK862( )
   {
   }

   public void getKeySK862( )
   {
      /* Using cursor T00SK66 */
      pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound862 = (short)(1) ;
      }
      else
      {
         RcdFound862 = (short)(0) ;
      }
      pr_default.close(64);
   }

   public void getByPrimaryKeySK862( )
   {
      /* Using cursor T00SK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmSK862( 3) ;
         RcdFound862 = (short)(1) ;
         initializeNonKeySK862( ) ;
         A5879PlaMTAOrd = T00SK3_A5879PlaMTAOrd[0] ;
         A11699PlaMTADsc = T00SK3_A11699PlaMTADsc[0] ;
         A5880PlaMTACnd = T00SK3_A5880PlaMTACnd[0] ;
         n5880PlaMTACnd = T00SK3_n5880PlaMTACnd[0] ;
         A5881PlaMTAMin = T00SK3_A5881PlaMTAMin[0] ;
         n5881PlaMTAMin = T00SK3_n5881PlaMTAMin[0] ;
         A5882PlaMTAMax = T00SK3_A5882PlaMTAMax[0] ;
         n5882PlaMTAMax = T00SK3_n5882PlaMTAMax[0] ;
         A6457PlaMTAAca = T00SK3_A6457PlaMTAAca[0] ;
         n6457PlaMTAAca = T00SK3_n6457PlaMTAAca[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z5879PlaMTAOrd = A5879PlaMTAOrd ;
         sMode862 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSK862( ) ;
         loadSK862( ) ;
         Gx_mode = sMode862 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound862 = (short)(0) ;
         initializeNonKeySK862( ) ;
         sMode862 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSK862( ) ;
         Gx_mode = sMode862 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesSK862( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencySK862( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaMaq"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11699PlaMTADsc, T00SK2_A11699PlaMTADsc[0]) != 0 ) || ( GXutil.strcmp(Z5880PlaMTACnd, T00SK2_A5880PlaMTACnd[0]) != 0 ) || ( Z5881PlaMTAMin != T00SK2_A5881PlaMTAMin[0] ) || ( Z5882PlaMTAMax != T00SK2_A5882PlaMTAMax[0] ) || ( GXutil.strcmp(Z6457PlaMTAAca, T00SK2_A6457PlaMTAAca[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11699PlaMTADsc, T00SK2_A11699PlaMTADsc[0]) != 0 )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"PlaMTADsc");
               GXutil.writeLogRaw("Old: ",Z11699PlaMTADsc);
               GXutil.writeLogRaw("Current: ",T00SK2_A11699PlaMTADsc[0]);
            }
            if ( GXutil.strcmp(Z5880PlaMTACnd, T00SK2_A5880PlaMTACnd[0]) != 0 )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"PlaMTACnd");
               GXutil.writeLogRaw("Old: ",Z5880PlaMTACnd);
               GXutil.writeLogRaw("Current: ",T00SK2_A5880PlaMTACnd[0]);
            }
            if ( Z5881PlaMTAMin != T00SK2_A5881PlaMTAMin[0] )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"PlaMTAMin");
               GXutil.writeLogRaw("Old: ",Z5881PlaMTAMin);
               GXutil.writeLogRaw("Current: ",T00SK2_A5881PlaMTAMin[0]);
            }
            if ( Z5882PlaMTAMax != T00SK2_A5882PlaMTAMax[0] )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"PlaMTAMax");
               GXutil.writeLogRaw("Old: ",Z5882PlaMTAMax);
               GXutil.writeLogRaw("Current: ",T00SK2_A5882PlaMTAMax[0]);
            }
            if ( GXutil.strcmp(Z6457PlaMTAAca, T00SK2_A6457PlaMTAAca[0]) != 0 )
            {
               GXutil.writeLogln("tplamaq:[seudo value changed for attri]"+"PlaMTAAca");
               GXutil.writeLogRaw("Old: ",Z6457PlaMTAAca);
               GXutil.writeLogRaw("Current: ",T00SK2_A6457PlaMTAAca[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPlaMaq"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSK862( )
   {
      beforeValidateSK862( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSK862( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSK862( 0) ;
         checkOptimisticConcurrencySK862( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSK862( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSK862( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SK67 */
                  pr_default.execute(65, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd), A11699PlaMTADsc, Boolean.valueOf(n5880PlaMTACnd), A5880PlaMTACnd, Boolean.valueOf(n5881PlaMTAMin), Integer.valueOf(A5881PlaMTAMin), Boolean.valueOf(n5882PlaMTAMax), Integer.valueOf(A5882PlaMTAMax), Boolean.valueOf(n6457PlaMTAAca), A6457PlaMTAAca, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaMaq");
                  if ( (pr_default.getStatus(65) == 1) )
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
            loadSK862( ) ;
         }
         endLevelSK862( ) ;
      }
      closeExtendedTableCursorsSK862( ) ;
   }

   public void updateSK862( )
   {
      beforeValidateSK862( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSK862( ) ;
      }
      if ( ( nIsMod_862 != 0 ) || ( nIsDirty_862 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencySK862( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmSK862( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateSK862( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00SK68 */
                     pr_default.execute(66, new Object[] {A11699PlaMTADsc, Boolean.valueOf(n5880PlaMTACnd), A5880PlaMTACnd, Boolean.valueOf(n5881PlaMTAMin), Integer.valueOf(A5881PlaMTAMin), Boolean.valueOf(n5882PlaMTAMax), Integer.valueOf(A5882PlaMTAMax), Boolean.valueOf(n6457PlaMTAAca), A6457PlaMTAAca, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaMaq");
                     if ( (pr_default.getStatus(66) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPlaMaq"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateSK862( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeySK862( ) ;
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
            endLevelSK862( ) ;
         }
      }
      closeExtendedTableCursorsSK862( ) ;
   }

   public void deferredUpdateSK862( )
   {
   }

   public void deleteSK862( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSK862( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySK862( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSK862( ) ;
         afterConfirmSK862( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSK862( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SK69 */
               pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, Short.valueOf(A5879PlaMTAOrd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPlaMaq");
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
      sMode862 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSK862( ) ;
      Gx_mode = sMode862 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSK862( )
   {
      standaloneModalSK862( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelSK862( )
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

   public void scanStartSK862( )
   {
      /* Scan By routine */
      /* Using cursor T00SK70 */
      pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      RcdFound862 = (short)(0) ;
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound862 = (short)(1) ;
         A5879PlaMTAOrd = T00SK70_A5879PlaMTAOrd[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSK862( )
   {
      /* Scan next routine */
      pr_default.readNext(68);
      RcdFound862 = (short)(0) ;
      if ( (pr_default.getStatus(68) != 101) )
      {
         RcdFound862 = (short)(1) ;
         A5879PlaMTAOrd = T00SK70_A5879PlaMTAOrd[0] ;
      }
   }

   public void scanEndSK862( )
   {
      pr_default.close(68);
   }

   public void afterConfirmSK862( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSK862( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSK862( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSK862( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSK862( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSK862( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSK862( )
   {
      edtPlaMTAOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAOrd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaMTADsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTADsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTADsc_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaMTACnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTACnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTACnd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaMTAMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAMin_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaMTAMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAMax_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtPlaMTAAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAAca_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashesSK862( )
   {
   }

   public void send_integrity_lvl_hashesSK65( )
   {
   }

   public void subsflControlProps_45862( )
   {
      edtavnRcdDeleted_862_Internalname = "vNRCDDELETED_862_"+sGXsfl_45_idx ;
      edtPlaMTAOrd_Internalname = "PLAMTAORD_"+sGXsfl_45_idx ;
      edtPlaMTADsc_Internalname = "PLAMTADSC_"+sGXsfl_45_idx ;
      edtPlaMTACnd_Internalname = "PLAMTACND_"+sGXsfl_45_idx ;
      edtPlaMTAMin_Internalname = "PLAMTAMIN_"+sGXsfl_45_idx ;
      edtPlaMTAMax_Internalname = "PLAMTAMAX_"+sGXsfl_45_idx ;
      edtPlaMTAAca_Internalname = "PLAMTAACA_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_45862( )
   {
      edtavnRcdDeleted_862_Internalname = "vNRCDDELETED_862_"+sGXsfl_45_fel_idx ;
      edtPlaMTAOrd_Internalname = "PLAMTAORD_"+sGXsfl_45_fel_idx ;
      edtPlaMTADsc_Internalname = "PLAMTADSC_"+sGXsfl_45_fel_idx ;
      edtPlaMTACnd_Internalname = "PLAMTACND_"+sGXsfl_45_fel_idx ;
      edtPlaMTAMin_Internalname = "PLAMTAMIN_"+sGXsfl_45_fel_idx ;
      edtPlaMTAMax_Internalname = "PLAMTAMAX_"+sGXsfl_45_fel_idx ;
      edtPlaMTAAca_Internalname = "PLAMTAACA_"+sGXsfl_45_fel_idx ;
   }

   public void addRowSK862( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45862( ) ;
      sendRowSK862( ) ;
   }

   public void sendRowSK862( )
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
         if ( ((int)((nGXsfl_45_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_862_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_862_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_862), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_862), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_862_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_862_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaMTAOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A5879PlaMTAOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5879PlaMTAOrd), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaMTAOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaMTAOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaMTADsc_Internalname,A11699PlaMTADsc,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaMTADsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaMTADsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaMTACnd_Internalname,A5880PlaMTACnd,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaMTACnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaMTACnd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2000),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaMTAMin_Internalname,GXutil.ltrim( localUtil.ntoc( A5881PlaMTAMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaMTAMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5881PlaMTAMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5881PlaMTAMin), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaMTAMin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaMTAMin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaMTAMax_Internalname,GXutil.ltrim( localUtil.ntoc( A5882PlaMTAMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPlaMTAMax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5882PlaMTAMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5882PlaMTAMax), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaMTAMax_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaMTAMax_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_862_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPlaMTAAca_Internalname,GXutil.rtrim( A6457PlaMTAAca),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPlaMTAAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPlaMTAAca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesSK862( ) ;
      GXCCtl = "Z5879PlaMTAOrd_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5879PlaMTAOrd, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11699PlaMTADsc_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z11699PlaMTADsc);
      GXCCtl = "Z5880PlaMTACnd_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z5880PlaMTACnd);
      GXCCtl = "Z5881PlaMTAMin_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5881PlaMTAMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5882PlaMTAMax_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5882PlaMTAMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6457PlaMTAAca_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6457PlaMTAAca));
      GXCCtl = "nRcdDeleted_862_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_862_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_862_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_862, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_862_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_862_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTAORD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTADSC_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTADsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTACND_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTACnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTAMIN_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTAMAX_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PLAMTAACA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAAca_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowSK862( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45862( ) ;
      edtavnRcdDeleted_862_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_862_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaMTAOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAORD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaMTADsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTADSC_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaMTACnd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTACND_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaMTAMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAMIN_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaMTAMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAMAX_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPlaMTAAca_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PLAMTAACA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_862_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_862_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_862");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_862_Internalname ;
         wbErr = true ;
         nRcdDeleted_862 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_862 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_862_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaMTAOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaMTAOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PLAMTAORD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaMTAOrd_Internalname ;
         wbErr = true ;
         A5879PlaMTAOrd = (short)(0) ;
      }
      else
      {
         A5879PlaMTAOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtPlaMTAOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A11699PlaMTADsc = httpContext.cgiGet( edtPlaMTADsc_Internalname) ;
      A5880PlaMTACnd = httpContext.cgiGet( edtPlaMTACnd_Internalname) ;
      n5880PlaMTACnd = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaMTAMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaMTAMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "PLAMTAMIN_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaMTAMin_Internalname ;
         wbErr = true ;
         A5881PlaMTAMin = 0 ;
         n5881PlaMTAMin = false ;
      }
      else
      {
         A5881PlaMTAMin = (int)(localUtil.ctol( httpContext.cgiGet( edtPlaMTAMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5881PlaMTAMin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlaMTAMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlaMTAMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "PLAMTAMAX_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPlaMTAMax_Internalname ;
         wbErr = true ;
         A5882PlaMTAMax = 0 ;
         n5882PlaMTAMax = false ;
      }
      else
      {
         A5882PlaMTAMax = (int)(localUtil.ctol( httpContext.cgiGet( edtPlaMTAMax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5882PlaMTAMax = false ;
      }
      A6457PlaMTAAca = httpContext.cgiGet( edtPlaMTAAca_Internalname) ;
      n6457PlaMTAAca = false ;
      GXCCtl = "Z5879PlaMTAOrd_" + sGXsfl_45_idx ;
      Z5879PlaMTAOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11699PlaMTADsc_" + sGXsfl_45_idx ;
      Z11699PlaMTADsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5880PlaMTACnd_" + sGXsfl_45_idx ;
      Z5880PlaMTACnd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5881PlaMTAMin_" + sGXsfl_45_idx ;
      Z5881PlaMTAMin = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5882PlaMTAMax_" + sGXsfl_45_idx ;
      Z5882PlaMTAMax = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6457PlaMTAAca_" + sGXsfl_45_idx ;
      Z6457PlaMTAAca = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_862_" + sGXsfl_45_idx ;
      nRcdDeleted_862 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_862_" + sGXsfl_45_idx ;
      nRcdExists_862 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_862_" + sGXsfl_45_idx ;
      nIsMod_862 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPlaMTAOrd_Enabled = edtPlaMTAOrd_Enabled ;
   }

   public void confirmValuesSK0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_45862( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45862( ) ;
         httpContext.changePostValue( "Z5879PlaMTAOrd_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5879PlaMTAOrd_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5879PlaMTAOrd_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z11699PlaMTADsc_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z11699PlaMTADsc_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11699PlaMTADsc_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z5880PlaMTACnd_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5880PlaMTACnd_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5880PlaMTACnd_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z5881PlaMTAMin_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5881PlaMTAMin_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5881PlaMTAMin_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z5882PlaMTAMax_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z5882PlaMTAMax_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5882PlaMTAMax_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z6457PlaMTAAca_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z6457PlaMTAAca_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6457PlaMTAAca_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tplamaq", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4283MaqKgsMin", GXutil.ltrim( localUtil.ntoc( Z4283MaqKgsMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4285MaqKgsMax", GXutil.ltrim( localUtil.ntoc( Z4285MaqKgsMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tplamaq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPlaMaq" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Maquinas", "") ;
   }

   public void initializeNonKeySK65( )
   {
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      n4283MaqKgsMin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrimstr( A4283MaqKgsMin, 9, 2));
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      n4285MaqKgsMax = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrimstr( A4285MaqKgsMax, 9, 2));
      Z606MaqDsc = "" ;
      Z4283MaqKgsMin = DecimalUtil.ZERO ;
      Z4285MaqKgsMax = DecimalUtil.ZERO ;
   }

   public void initAllSK65( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      initializeNonKeySK65( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeySK862( )
   {
      A11699PlaMTADsc = "" ;
      A5880PlaMTACnd = "" ;
      n5880PlaMTACnd = false ;
      A5881PlaMTAMin = 0 ;
      n5881PlaMTAMin = false ;
      A5882PlaMTAMax = 0 ;
      n5882PlaMTAMax = false ;
      A6457PlaMTAAca = "" ;
      n6457PlaMTAAca = false ;
      Z11699PlaMTADsc = "" ;
      Z5880PlaMTACnd = "" ;
      Z5881PlaMTAMin = 0 ;
      Z5882PlaMTAMax = 0 ;
      Z6457PlaMTAAca = "" ;
   }

   public void initAllSK862( )
   {
      A5879PlaMTAOrd = (short)(0) ;
      initializeNonKeySK862( ) ;
   }

   public void standaloneModalInsertSK862( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525426", true, true);
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
      httpContext.AddJavascriptSource("tplamaq.js", "?20268241525426", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties862( )
   {
      edtPlaMTAOrd_Enabled = defedtPlaMTAOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlaMTAOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlaMTAOrd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void startgridcontrol45( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_862, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_862_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5879PlaMTAOrd, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A11699PlaMTADsc);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTADsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A5880PlaMTACnd);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTACnd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5881PlaMTAMin, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5882PlaMTAMax, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A6457PlaMTAAca));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPlaMTAAca_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtMaqKgsMin_Internalname = "MAQKGSMIN" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtMaqKgsMax_Internalname = "MAQKGSMAX" ;
      edtavnRcdDeleted_862_Internalname = "vNRCDDELETED_862" ;
      edtPlaMTAOrd_Internalname = "PLAMTAORD" ;
      edtPlaMTADsc_Internalname = "PLAMTADSC" ;
      edtPlaMTACnd_Internalname = "PLAMTACND" ;
      edtPlaMTAMin_Internalname = "PLAMTAMIN" ;
      edtPlaMTAMax_Internalname = "PLAMTAMAX" ;
      edtPlaMTAAca_Internalname = "PLAMTAACA" ;
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
      Form.setCaption( httpContext.getMessage( "Maquinas", "") );
      edtPlaMTAAca_Jsonclick = "" ;
      edtPlaMTAMax_Jsonclick = "" ;
      edtPlaMTAMin_Jsonclick = "" ;
      edtPlaMTACnd_Jsonclick = "" ;
      edtPlaMTADsc_Jsonclick = "" ;
      edtPlaMTAOrd_Jsonclick = "" ;
      edtavnRcdDeleted_862_Jsonclick = "" ;
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
      edtPlaMTAAca_Enabled = 1 ;
      edtPlaMTAMax_Enabled = 1 ;
      edtPlaMTAMin_Enabled = 1 ;
      edtPlaMTACnd_Enabled = 1 ;
      edtPlaMTADsc_Enabled = 1 ;
      edtPlaMTAOrd_Enabled = 1 ;
      edtavnRcdDeleted_862_Enabled = 1 ;
      edtMaqKgsMax_Jsonclick = "" ;
      edtMaqKgsMax_Backcolor = (int)(0xFFFFFF) ;
      edtMaqKgsMax_Enabled = 1 ;
      edtMaqKgsMin_Jsonclick = "" ;
      edtMaqKgsMin_Backcolor = (int)(0xFFFFFF) ;
      edtMaqKgsMin_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Backcolor = (int)(0xFFFFFF) ;
      edtMaqDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Backcolor = (int)(0xFFFFFF) ;
      edtMaqCod_Enabled = 1 ;
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
      subsflControlProps_45862( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalSK862( ) ;
         standaloneModalSK862( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowSK862( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_45862( ) ;
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
      /* Using cursor T00SK71 */
      pr_default.execute(69, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(69);
      GX_FocusControl = edtMaqDsc_Internalname ;
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
      /* Using cursor T00SK71 */
      pr_default.execute(69, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(69) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(69);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4283MaqKgsMin", GXutil.ltrim( localUtil.ntoc( A4283MaqKgsMin, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4285MaqKgsMax", GXutil.ltrim( localUtil.ntoc( A4285MaqKgsMax, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4283MaqKgsMin", GXutil.ltrim( localUtil.ntoc( Z4283MaqKgsMin, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4285MaqKgsMax", GXutil.ltrim( localUtil.ntoc( Z4285MaqKgsMax, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A4283MaqKgsMin',fld:'MAQKGSMIN',pic:'ZZZZZ9.99'},{av:'A4285MaqKgsMax',fld:'MAQKGSMAX',pic:'ZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z606MaqDsc'},{av:'Z4283MaqKgsMin'},{av:'Z4285MaqKgsMax'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PLAMTAORD","{handler:'valid_Plamtaord',iparms:[]");
      setEventMetadata("VALID_PLAMTAORD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Plamtaaca',iparms:[]");
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
      pr_default.close(69);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z606MaqDsc = "" ;
      Z4283MaqKgsMin = DecimalUtil.ZERO ;
      Z4285MaqKgsMax = DecimalUtil.ZERO ;
      Z11699PlaMTADsc = "" ;
      Z5880PlaMTACnd = "" ;
      Z6457PlaMTAAca = "" ;
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
      A602MaqCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A606MaqDsc = "" ;
      lblTextblock4_Jsonclick = "" ;
      A4283MaqKgsMin = DecimalUtil.ZERO ;
      lblTextblock5_Jsonclick = "" ;
      A4285MaqKgsMax = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode862 = "" ;
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
      sMode65 = "" ;
      GXCCtl = "" ;
      A11699PlaMTADsc = "" ;
      A5880PlaMTACnd = "" ;
      A6457PlaMTAAca = "" ;
      T00SK7_A602MaqCod = new String[] {""} ;
      T00SK7_n602MaqCod = new boolean[] {false} ;
      T00SK7_A606MaqDsc = new String[] {""} ;
      T00SK7_n606MaqDsc = new boolean[] {false} ;
      T00SK7_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SK7_n4283MaqKgsMin = new boolean[] {false} ;
      T00SK7_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SK7_n4285MaqKgsMax = new boolean[] {false} ;
      T00SK7_A396EmprCod = new String[] {""} ;
      T00SK6_A396EmprCod = new String[] {""} ;
      T00SK8_A396EmprCod = new String[] {""} ;
      T00SK9_A396EmprCod = new String[] {""} ;
      T00SK9_A602MaqCod = new String[] {""} ;
      T00SK9_n602MaqCod = new boolean[] {false} ;
      T00SK5_A602MaqCod = new String[] {""} ;
      T00SK5_n602MaqCod = new boolean[] {false} ;
      T00SK5_A606MaqDsc = new String[] {""} ;
      T00SK5_n606MaqDsc = new boolean[] {false} ;
      T00SK5_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SK5_n4283MaqKgsMin = new boolean[] {false} ;
      T00SK5_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SK5_n4285MaqKgsMax = new boolean[] {false} ;
      T00SK5_A396EmprCod = new String[] {""} ;
      T00SK10_A396EmprCod = new String[] {""} ;
      T00SK10_A602MaqCod = new String[] {""} ;
      T00SK10_n602MaqCod = new boolean[] {false} ;
      T00SK11_A396EmprCod = new String[] {""} ;
      T00SK11_A602MaqCod = new String[] {""} ;
      T00SK11_n602MaqCod = new boolean[] {false} ;
      T00SK4_A602MaqCod = new String[] {""} ;
      T00SK4_n602MaqCod = new boolean[] {false} ;
      T00SK4_A606MaqDsc = new String[] {""} ;
      T00SK4_n606MaqDsc = new boolean[] {false} ;
      T00SK4_A4283MaqKgsMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SK4_n4283MaqKgsMin = new boolean[] {false} ;
      T00SK4_A4285MaqKgsMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SK4_n4285MaqKgsMax = new boolean[] {false} ;
      T00SK4_A396EmprCod = new String[] {""} ;
      T00SK15_A396EmprCod = new String[] {""} ;
      T00SK15_A602MaqCod = new String[] {""} ;
      T00SK15_n602MaqCod = new boolean[] {false} ;
      T00SK15_A14529MqCAnyo = new short[1] ;
      T00SK15_A14530MqCMes = new byte[1] ;
      T00SK16_A396EmprCod = new String[] {""} ;
      T00SK16_A129BarCod = new int[1] ;
      T00SK16_A132BarCodReo = new byte[1] ;
      T00SK16_A130BarCodPar = new String[] {""} ;
      T00SK16_A14152MEnvOrd = new short[1] ;
      T00SK17_A396EmprCod = new String[] {""} ;
      T00SK17_A13604RARID = new int[1] ;
      T00SK17_A602MaqCod = new String[] {""} ;
      T00SK17_n602MaqCod = new boolean[] {false} ;
      T00SK18_A396EmprCod = new String[] {""} ;
      T00SK18_A602MaqCod = new String[] {""} ;
      T00SK18_n602MaqCod = new boolean[] {false} ;
      T00SK18_A13193MaqHdr = new int[1] ;
      T00SK18_A13194MaqHdrR = new byte[1] ;
      T00SK18_A13195MaqHdrP = new String[] {""} ;
      T00SK18_A13196MaqRecLinM = new short[1] ;
      T00SK19_A396EmprCod = new String[] {""} ;
      T00SK19_A13137NCHdr = new int[1] ;
      T00SK19_A13138NCHdrr = new byte[1] ;
      T00SK19_A13139NCHdrp = new String[] {""} ;
      T00SK20_A396EmprCod = new String[] {""} ;
      T00SK20_A12673LavMqId = new int[1] ;
      T00SK21_A396EmprCod = new String[] {""} ;
      T00SK21_A602MaqCod = new String[] {""} ;
      T00SK21_n602MaqCod = new boolean[] {false} ;
      T00SK21_A12444MaqAnyNP = new short[1] ;
      T00SK21_A12445MaqMesNP = new byte[1] ;
      T00SK22_A396EmprCod = new String[] {""} ;
      T00SK22_A602MaqCod = new String[] {""} ;
      T00SK22_n602MaqCod = new boolean[] {false} ;
      T00SK22_A12434MaqAnyM = new short[1] ;
      T00SK22_A12435MaqMesM = new byte[1] ;
      T00SK23_A396EmprCod = new String[] {""} ;
      T00SK23_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00SK23_A5728JBCLLin = new short[1] ;
      T00SK24_A396EmprCod = new String[] {""} ;
      T00SK24_A11604PArtId = new int[1] ;
      T00SK25_A396EmprCod = new String[] {""} ;
      T00SK25_A602MaqCod = new String[] {""} ;
      T00SK25_n602MaqCod = new boolean[] {false} ;
      T00SK25_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00SK26_A396EmprCod = new String[] {""} ;
      T00SK26_A602MaqCod = new String[] {""} ;
      T00SK26_n602MaqCod = new boolean[] {false} ;
      T00SK26_A11438MaqEquCod = new String[] {""} ;
      T00SK26_A11439MaqSEqCod = new String[] {""} ;
      T00SK26_A11440MaqPieCod = new String[] {""} ;
      T00SK27_A396EmprCod = new String[] {""} ;
      T00SK27_A602MaqCod = new String[] {""} ;
      T00SK27_n602MaqCod = new boolean[] {false} ;
      T00SK27_A11432MaqDocId = new short[1] ;
      T00SK28_A396EmprCod = new String[] {""} ;
      T00SK28_A602MaqCod = new String[] {""} ;
      T00SK28_n602MaqCod = new boolean[] {false} ;
      T00SK28_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00SK28_A10112Mq_Op = new int[1] ;
      T00SK29_A396EmprCod = new String[] {""} ;
      T00SK29_A252CliCod = new int[1] ;
      T00SK29_A65ArtCod = new String[] {""} ;
      T00SK29_A10041ArtSH = new String[] {""} ;
      T00SK29_A10042ArtMqFa = new String[] {""} ;
      T00SK30_A396EmprCod = new String[] {""} ;
      T00SK30_A602MaqCod = new String[] {""} ;
      T00SK30_n602MaqCod = new boolean[] {false} ;
      T00SK30_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T00SK31_A396EmprCod = new String[] {""} ;
      T00SK31_A602MaqCod = new String[] {""} ;
      T00SK31_n602MaqCod = new boolean[] {false} ;
      T00SK31_A9725MaqFabC = new String[] {""} ;
      T00SK32_A396EmprCod = new String[] {""} ;
      T00SK32_A9428SMCod = new int[1] ;
      T00SK33_A396EmprCod = new String[] {""} ;
      T00SK33_A9429PMCod = new int[1] ;
      T00SK34_A396EmprCod = new String[] {""} ;
      T00SK34_A9425OMCod = new int[1] ;
      T00SK35_A396EmprCod = new String[] {""} ;
      T00SK35_A602MaqCod = new String[] {""} ;
      T00SK35_n602MaqCod = new boolean[] {false} ;
      T00SK35_A8008Maq_Prg = new String[] {""} ;
      T00SK36_A396EmprCod = new String[] {""} ;
      T00SK36_A602MaqCod = new String[] {""} ;
      T00SK36_n602MaqCod = new boolean[] {false} ;
      T00SK36_A6874CPROCORIG = new String[] {""} ;
      T00SK37_A396EmprCod = new String[] {""} ;
      T00SK37_A6319C_Barcod = new int[1] ;
      T00SK37_A6320C_Barcodre = new byte[1] ;
      T00SK37_A6321C_Barcodpa = new String[] {""} ;
      T00SK37_A6322C_Reclinma = new short[1] ;
      T00SK38_A396EmprCod = new String[] {""} ;
      T00SK38_A602MaqCod = new String[] {""} ;
      T00SK38_n602MaqCod = new boolean[] {false} ;
      T00SK38_A6260MaqTqn = new byte[1] ;
      T00SK39_A396EmprCod = new String[] {""} ;
      T00SK39_A6188MaqTArt = new short[1] ;
      T00SK39_A602MaqCod = new String[] {""} ;
      T00SK39_n602MaqCod = new boolean[] {false} ;
      T00SK40_A396EmprCod = new String[] {""} ;
      T00SK40_A602MaqCod = new String[] {""} ;
      T00SK40_n602MaqCod = new boolean[] {false} ;
      T00SK40_A6078MaqCliCod = new int[1] ;
      T00SK40_A6079MaqArtCod = new String[] {""} ;
      T00SK41_A396EmprCod = new String[] {""} ;
      T00SK41_A6037Mq_Grupo = new byte[1] ;
      T00SK41_A602MaqCod = new String[] {""} ;
      T00SK41_n602MaqCod = new boolean[] {false} ;
      T00SK42_A396EmprCod = new String[] {""} ;
      T00SK42_A6000CRCod = new String[] {""} ;
      T00SK42_A6005CRLin = new short[1] ;
      T00SK43_A396EmprCod = new String[] {""} ;
      T00SK43_A5603PrdNumM = new String[] {""} ;
      T00SK43_A602MaqCod = new String[] {""} ;
      T00SK43_n602MaqCod = new boolean[] {false} ;
      T00SK44_A396EmprCod = new String[] {""} ;
      T00SK44_A602MaqCod = new String[] {""} ;
      T00SK44_n602MaqCod = new boolean[] {false} ;
      T00SK44_A5525MaqPrdNum = new String[] {""} ;
      T00SK45_A396EmprCod = new String[] {""} ;
      T00SK45_A764ProForCod = new String[] {""} ;
      T00SK45_A5191ProForLC = new short[1] ;
      T00SK46_A396EmprCod = new String[] {""} ;
      T00SK46_A4686MaqTipArt = new short[1] ;
      T00SK46_A602MaqCod = new String[] {""} ;
      T00SK46_n602MaqCod = new boolean[] {false} ;
      T00SK47_A396EmprCod = new String[] {""} ;
      T00SK47_A3331LanBroCod = new byte[1] ;
      T00SK47_A3333LanBroLin = new short[1] ;
      T00SK48_A396EmprCod = new String[] {""} ;
      T00SK48_A602MaqCod = new String[] {""} ;
      T00SK48_n602MaqCod = new boolean[] {false} ;
      T00SK48_A3047LOParId = new String[] {""} ;
      T00SK49_A396EmprCod = new String[] {""} ;
      T00SK49_A129BarCod = new int[1] ;
      T00SK49_A132BarCodReo = new byte[1] ;
      T00SK49_A130BarCodPar = new String[] {""} ;
      T00SK49_A2804RecLinMaq = new short[1] ;
      T00SK50_A396EmprCod = new String[] {""} ;
      T00SK50_A602MaqCod = new String[] {""} ;
      T00SK50_n602MaqCod = new boolean[] {false} ;
      T00SK50_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00SK51_A396EmprCod = new String[] {""} ;
      T00SK51_A602MaqCod = new String[] {""} ;
      T00SK51_n602MaqCod = new boolean[] {false} ;
      T00SK51_A2019MaqMadLin = new short[1] ;
      T00SK52_A396EmprCod = new String[] {""} ;
      T00SK52_A602MaqCod = new String[] {""} ;
      T00SK52_n602MaqCod = new boolean[] {false} ;
      T00SK52_A2014MaqConLin = new short[1] ;
      T00SK53_A396EmprCod = new String[] {""} ;
      T00SK53_A1621CosTermCod = new String[] {""} ;
      T00SK53_A1615CosLin = new int[1] ;
      T00SK54_A396EmprCod = new String[] {""} ;
      T00SK54_A602MaqCod = new String[] {""} ;
      T00SK54_n602MaqCod = new boolean[] {false} ;
      T00SK54_A1142MaqFCod = new String[] {""} ;
      T00SK55_A396EmprCod = new String[] {""} ;
      T00SK55_A602MaqCod = new String[] {""} ;
      T00SK55_n602MaqCod = new boolean[] {false} ;
      T00SK55_A634MhiMes = new byte[1] ;
      T00SK55_A632MhiAny = new short[1] ;
      T00SK56_A396EmprCod = new String[] {""} ;
      T00SK56_A602MaqCod = new String[] {""} ;
      T00SK56_n602MaqCod = new boolean[] {false} ;
      T00SK56_A320DesTecLin = new byte[1] ;
      T00SK57_A396EmprCod = new String[] {""} ;
      T00SK57_A602MaqCod = new String[] {""} ;
      T00SK57_n602MaqCod = new boolean[] {false} ;
      T00SK57_A599MaqAny = new short[1] ;
      T00SK57_A614MaqMes = new byte[1] ;
      T00SK58_A396EmprCod = new String[] {""} ;
      T00SK58_A539HisBarCod = new int[1] ;
      T00SK58_A545HisCodReo = new byte[1] ;
      T00SK58_A544HisCodPar = new String[] {""} ;
      T00SK58_A833TipDefCod = new short[1] ;
      T00SK59_A396EmprCod = new String[] {""} ;
      T00SK59_A602MaqCod = new String[] {""} ;
      T00SK59_n602MaqCod = new boolean[] {false} ;
      T00SK59_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00SK60_A396EmprCod = new String[] {""} ;
      T00SK60_A501GruMaqCod = new String[] {""} ;
      T00SK60_A602MaqCod = new String[] {""} ;
      T00SK60_n602MaqCod = new boolean[] {false} ;
      T00SK61_A396EmprCod = new String[] {""} ;
      T00SK61_A457FasCod = new String[] {""} ;
      T00SK62_A396EmprCod = new String[] {""} ;
      T00SK62_A361DisCod = new int[1] ;
      T00SK63_A396EmprCod = new String[] {""} ;
      T00SK63_A129BarCod = new int[1] ;
      T00SK63_A132BarCodReo = new byte[1] ;
      T00SK63_A130BarCodPar = new String[] {""} ;
      T00SK63_A758ProCod = new String[] {""} ;
      T00SK63_A194BarOrdLin = new short[1] ;
      T00SK64_A396EmprCod = new String[] {""} ;
      T00SK64_A602MaqCod = new String[] {""} ;
      T00SK64_n602MaqCod = new boolean[] {false} ;
      T00SK65_A602MaqCod = new String[] {""} ;
      T00SK65_n602MaqCod = new boolean[] {false} ;
      T00SK65_A5879PlaMTAOrd = new short[1] ;
      T00SK65_A11699PlaMTADsc = new String[] {""} ;
      T00SK65_A5880PlaMTACnd = new String[] {""} ;
      T00SK65_n5880PlaMTACnd = new boolean[] {false} ;
      T00SK65_A5881PlaMTAMin = new int[1] ;
      T00SK65_n5881PlaMTAMin = new boolean[] {false} ;
      T00SK65_A5882PlaMTAMax = new int[1] ;
      T00SK65_n5882PlaMTAMax = new boolean[] {false} ;
      T00SK65_A6457PlaMTAAca = new String[] {""} ;
      T00SK65_n6457PlaMTAAca = new boolean[] {false} ;
      T00SK65_A396EmprCod = new String[] {""} ;
      T00SK66_A396EmprCod = new String[] {""} ;
      T00SK66_A602MaqCod = new String[] {""} ;
      T00SK66_n602MaqCod = new boolean[] {false} ;
      T00SK66_A5879PlaMTAOrd = new short[1] ;
      T00SK3_A602MaqCod = new String[] {""} ;
      T00SK3_n602MaqCod = new boolean[] {false} ;
      T00SK3_A5879PlaMTAOrd = new short[1] ;
      T00SK3_A11699PlaMTADsc = new String[] {""} ;
      T00SK3_A5880PlaMTACnd = new String[] {""} ;
      T00SK3_n5880PlaMTACnd = new boolean[] {false} ;
      T00SK3_A5881PlaMTAMin = new int[1] ;
      T00SK3_n5881PlaMTAMin = new boolean[] {false} ;
      T00SK3_A5882PlaMTAMax = new int[1] ;
      T00SK3_n5882PlaMTAMax = new boolean[] {false} ;
      T00SK3_A6457PlaMTAAca = new String[] {""} ;
      T00SK3_n6457PlaMTAAca = new boolean[] {false} ;
      T00SK3_A396EmprCod = new String[] {""} ;
      T00SK2_A602MaqCod = new String[] {""} ;
      T00SK2_n602MaqCod = new boolean[] {false} ;
      T00SK2_A5879PlaMTAOrd = new short[1] ;
      T00SK2_A11699PlaMTADsc = new String[] {""} ;
      T00SK2_A5880PlaMTACnd = new String[] {""} ;
      T00SK2_n5880PlaMTACnd = new boolean[] {false} ;
      T00SK2_A5881PlaMTAMin = new int[1] ;
      T00SK2_n5881PlaMTAMin = new boolean[] {false} ;
      T00SK2_A5882PlaMTAMax = new int[1] ;
      T00SK2_n5882PlaMTAMax = new boolean[] {false} ;
      T00SK2_A6457PlaMTAAca = new String[] {""} ;
      T00SK2_n6457PlaMTAAca = new boolean[] {false} ;
      T00SK2_A396EmprCod = new String[] {""} ;
      T00SK70_A396EmprCod = new String[] {""} ;
      T00SK70_A602MaqCod = new String[] {""} ;
      T00SK70_n602MaqCod = new boolean[] {false} ;
      T00SK70_A5879PlaMTAOrd = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00SK71_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ606MaqDsc = "" ;
      ZZ4283MaqKgsMin = DecimalUtil.ZERO ;
      ZZ4285MaqKgsMax = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tplamaq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tplamaq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tplamaq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tplamaq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tplamaq__default(),
         new Object[] {
             new Object[] {
            T00SK2_A602MaqCod, T00SK2_A5879PlaMTAOrd, T00SK2_A11699PlaMTADsc, T00SK2_A5880PlaMTACnd, T00SK2_n5880PlaMTACnd, T00SK2_A5881PlaMTAMin, T00SK2_n5881PlaMTAMin, T00SK2_A5882PlaMTAMax, T00SK2_n5882PlaMTAMax, T00SK2_A6457PlaMTAAca,
            T00SK2_n6457PlaMTAAca, T00SK2_A396EmprCod
            }
            , new Object[] {
            T00SK3_A602MaqCod, T00SK3_A5879PlaMTAOrd, T00SK3_A11699PlaMTADsc, T00SK3_A5880PlaMTACnd, T00SK3_n5880PlaMTACnd, T00SK3_A5881PlaMTAMin, T00SK3_n5881PlaMTAMin, T00SK3_A5882PlaMTAMax, T00SK3_n5882PlaMTAMax, T00SK3_A6457PlaMTAAca,
            T00SK3_n6457PlaMTAAca, T00SK3_A396EmprCod
            }
            , new Object[] {
            T00SK4_A602MaqCod, T00SK4_A606MaqDsc, T00SK4_n606MaqDsc, T00SK4_A4283MaqKgsMin, T00SK4_n4283MaqKgsMin, T00SK4_A4285MaqKgsMax, T00SK4_n4285MaqKgsMax, T00SK4_A396EmprCod
            }
            , new Object[] {
            T00SK5_A602MaqCod, T00SK5_A606MaqDsc, T00SK5_n606MaqDsc, T00SK5_A4283MaqKgsMin, T00SK5_n4283MaqKgsMin, T00SK5_A4285MaqKgsMax, T00SK5_n4285MaqKgsMax, T00SK5_A396EmprCod
            }
            , new Object[] {
            T00SK6_A396EmprCod
            }
            , new Object[] {
            T00SK7_A602MaqCod, T00SK7_A606MaqDsc, T00SK7_n606MaqDsc, T00SK7_A4283MaqKgsMin, T00SK7_n4283MaqKgsMin, T00SK7_A4285MaqKgsMax, T00SK7_n4285MaqKgsMax, T00SK7_A396EmprCod
            }
            , new Object[] {
            T00SK8_A396EmprCod
            }
            , new Object[] {
            T00SK9_A396EmprCod, T00SK9_A602MaqCod
            }
            , new Object[] {
            T00SK10_A396EmprCod, T00SK10_A602MaqCod
            }
            , new Object[] {
            T00SK11_A396EmprCod, T00SK11_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SK15_A396EmprCod, T00SK15_A602MaqCod, T00SK15_A14529MqCAnyo, T00SK15_A14530MqCMes
            }
            , new Object[] {
            T00SK16_A396EmprCod, T00SK16_A129BarCod, T00SK16_A132BarCodReo, T00SK16_A130BarCodPar, T00SK16_A14152MEnvOrd
            }
            , new Object[] {
            T00SK17_A396EmprCod, T00SK17_A13604RARID, T00SK17_A602MaqCod
            }
            , new Object[] {
            T00SK18_A396EmprCod, T00SK18_A602MaqCod, T00SK18_A13193MaqHdr, T00SK18_A13194MaqHdrR, T00SK18_A13195MaqHdrP, T00SK18_A13196MaqRecLinM
            }
            , new Object[] {
            T00SK19_A396EmprCod, T00SK19_A13137NCHdr, T00SK19_A13138NCHdrr, T00SK19_A13139NCHdrp
            }
            , new Object[] {
            T00SK20_A396EmprCod, T00SK20_A12673LavMqId
            }
            , new Object[] {
            T00SK21_A396EmprCod, T00SK21_A602MaqCod, T00SK21_A12444MaqAnyNP, T00SK21_A12445MaqMesNP
            }
            , new Object[] {
            T00SK22_A396EmprCod, T00SK22_A602MaqCod, T00SK22_A12434MaqAnyM, T00SK22_A12435MaqMesM
            }
            , new Object[] {
            T00SK23_A396EmprCod, T00SK23_A4929Inc_Dia, T00SK23_A5728JBCLLin
            }
            , new Object[] {
            T00SK24_A396EmprCod, T00SK24_A11604PArtId
            }
            , new Object[] {
            T00SK25_A396EmprCod, T00SK25_A602MaqCod, T00SK25_A11445MaqFch
            }
            , new Object[] {
            T00SK26_A396EmprCod, T00SK26_A602MaqCod, T00SK26_A11438MaqEquCod, T00SK26_A11439MaqSEqCod, T00SK26_A11440MaqPieCod
            }
            , new Object[] {
            T00SK27_A396EmprCod, T00SK27_A602MaqCod, T00SK27_A11432MaqDocId
            }
            , new Object[] {
            T00SK28_A396EmprCod, T00SK28_A602MaqCod, T00SK28_A10111Mq_Dia, T00SK28_A10112Mq_Op
            }
            , new Object[] {
            T00SK29_A396EmprCod, T00SK29_A252CliCod, T00SK29_A65ArtCod, T00SK29_A10041ArtSH, T00SK29_A10042ArtMqFa
            }
            , new Object[] {
            T00SK30_A396EmprCod, T00SK30_A602MaqCod, T00SK30_A74MaqTMuIni
            }
            , new Object[] {
            T00SK31_A396EmprCod, T00SK31_A602MaqCod, T00SK31_A9725MaqFabC
            }
            , new Object[] {
            T00SK32_A396EmprCod, T00SK32_A9428SMCod
            }
            , new Object[] {
            T00SK33_A396EmprCod, T00SK33_A9429PMCod
            }
            , new Object[] {
            T00SK34_A396EmprCod, T00SK34_A9425OMCod
            }
            , new Object[] {
            T00SK35_A396EmprCod, T00SK35_A602MaqCod, T00SK35_A8008Maq_Prg
            }
            , new Object[] {
            T00SK36_A396EmprCod, T00SK36_A602MaqCod, T00SK36_A6874CPROCORIG
            }
            , new Object[] {
            T00SK37_A396EmprCod, T00SK37_A6319C_Barcod, T00SK37_A6320C_Barcodre, T00SK37_A6321C_Barcodpa, T00SK37_A6322C_Reclinma
            }
            , new Object[] {
            T00SK38_A396EmprCod, T00SK38_A602MaqCod, T00SK38_A6260MaqTqn
            }
            , new Object[] {
            T00SK39_A396EmprCod, T00SK39_A6188MaqTArt, T00SK39_A602MaqCod
            }
            , new Object[] {
            T00SK40_A396EmprCod, T00SK40_A602MaqCod, T00SK40_A6078MaqCliCod, T00SK40_A6079MaqArtCod
            }
            , new Object[] {
            T00SK41_A396EmprCod, T00SK41_A6037Mq_Grupo, T00SK41_A602MaqCod
            }
            , new Object[] {
            T00SK42_A396EmprCod, T00SK42_A6000CRCod, T00SK42_A6005CRLin
            }
            , new Object[] {
            T00SK43_A396EmprCod, T00SK43_A5603PrdNumM, T00SK43_A602MaqCod
            }
            , new Object[] {
            T00SK44_A396EmprCod, T00SK44_A602MaqCod, T00SK44_A5525MaqPrdNum
            }
            , new Object[] {
            T00SK45_A396EmprCod, T00SK45_A764ProForCod, T00SK45_A5191ProForLC
            }
            , new Object[] {
            T00SK46_A396EmprCod, T00SK46_A4686MaqTipArt, T00SK46_A602MaqCod
            }
            , new Object[] {
            T00SK47_A396EmprCod, T00SK47_A3331LanBroCod, T00SK47_A3333LanBroLin
            }
            , new Object[] {
            T00SK48_A396EmprCod, T00SK48_A602MaqCod, T00SK48_A3047LOParId
            }
            , new Object[] {
            T00SK49_A396EmprCod, T00SK49_A129BarCod, T00SK49_A132BarCodReo, T00SK49_A130BarCodPar, T00SK49_A2804RecLinMaq
            }
            , new Object[] {
            T00SK50_A396EmprCod, T00SK50_A602MaqCod, T00SK50_A2461PlaFecTin
            }
            , new Object[] {
            T00SK51_A396EmprCod, T00SK51_A602MaqCod, T00SK51_A2019MaqMadLin
            }
            , new Object[] {
            T00SK52_A396EmprCod, T00SK52_A602MaqCod, T00SK52_A2014MaqConLin
            }
            , new Object[] {
            T00SK53_A396EmprCod, T00SK53_A1621CosTermCod, T00SK53_A1615CosLin
            }
            , new Object[] {
            T00SK54_A396EmprCod, T00SK54_A602MaqCod, T00SK54_A1142MaqFCod
            }
            , new Object[] {
            T00SK55_A396EmprCod, T00SK55_A602MaqCod, T00SK55_A634MhiMes, T00SK55_A632MhiAny
            }
            , new Object[] {
            T00SK56_A396EmprCod, T00SK56_A602MaqCod, T00SK56_A320DesTecLin
            }
            , new Object[] {
            T00SK57_A396EmprCod, T00SK57_A602MaqCod, T00SK57_A599MaqAny, T00SK57_A614MaqMes
            }
            , new Object[] {
            T00SK58_A396EmprCod, T00SK58_A539HisBarCod, T00SK58_A545HisCodReo, T00SK58_A544HisCodPar, T00SK58_A833TipDefCod
            }
            , new Object[] {
            T00SK59_A396EmprCod, T00SK59_A602MaqCod, T00SK59_A558HisProFec
            }
            , new Object[] {
            T00SK60_A396EmprCod, T00SK60_A501GruMaqCod, T00SK60_A602MaqCod
            }
            , new Object[] {
            T00SK61_A396EmprCod, T00SK61_A457FasCod
            }
            , new Object[] {
            T00SK62_A396EmprCod, T00SK62_A361DisCod
            }
            , new Object[] {
            T00SK63_A396EmprCod, T00SK63_A129BarCod, T00SK63_A132BarCodReo, T00SK63_A130BarCodPar, T00SK63_A758ProCod, T00SK63_A194BarOrdLin
            }
            , new Object[] {
            T00SK64_A396EmprCod, T00SK64_A602MaqCod
            }
            , new Object[] {
            T00SK65_A602MaqCod, T00SK65_A5879PlaMTAOrd, T00SK65_A11699PlaMTADsc, T00SK65_A5880PlaMTACnd, T00SK65_n5880PlaMTACnd, T00SK65_A5881PlaMTAMin, T00SK65_n5881PlaMTAMin, T00SK65_A5882PlaMTAMax, T00SK65_n5882PlaMTAMax, T00SK65_A6457PlaMTAAca,
            T00SK65_n6457PlaMTAAca, T00SK65_A396EmprCod
            }
            , new Object[] {
            T00SK66_A396EmprCod, T00SK66_A602MaqCod, T00SK66_A5879PlaMTAOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SK70_A396EmprCod, T00SK70_A602MaqCod, T00SK70_A5879PlaMTAOrd
            }
            , new Object[] {
            T00SK71_A396EmprCod
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
   private short Z5879PlaMTAOrd ;
   private short nRcdDeleted_862 ;
   private short nRcdExists_862 ;
   private short nIsMod_862 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount862 ;
   private short RcdFound862 ;
   private short nBlankRcdUsr862 ;
   private short A5879PlaMTAOrd ;
   private short RcdFound65 ;
   private short nIsDirty_65 ;
   private short nIsDirty_862 ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z5881PlaMTAMin ;
   private int Z5882PlaMTAMax ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int edtMaqKgsMin_Enabled ;
   private int edtMaqKgsMax_Enabled ;
   private int edtavnRcdDeleted_862_Enabled ;
   private int edtPlaMTAOrd_Enabled ;
   private int edtPlaMTADsc_Enabled ;
   private int edtPlaMTACnd_Enabled ;
   private int edtPlaMTAMin_Enabled ;
   private int edtPlaMTAMax_Enabled ;
   private int edtPlaMTAAca_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A5881PlaMTAMin ;
   private int A5882PlaMTAMax ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtPlaMTAOrd_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtMaqKgsMax_Backcolor ;
   private int edtMaqKgsMin_Backcolor ;
   private int edtMaqDsc_Backcolor ;
   private int edtMaqCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z4283MaqKgsMin ;
   private java.math.BigDecimal Z4285MaqKgsMax ;
   private java.math.BigDecimal A4283MaqKgsMin ;
   private java.math.BigDecimal A4285MaqKgsMax ;
   private java.math.BigDecimal ZZ4283MaqKgsMin ;
   private java.math.BigDecimal ZZ4285MaqKgsMax ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z606MaqDsc ;
   private String Z6457PlaMTAAca ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_45_idx="0001" ;
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
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtMaqKgsMin_Internalname ;
   private String edtMaqKgsMin_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtMaqKgsMax_Internalname ;
   private String edtMaqKgsMax_Jsonclick ;
   private String sMode862 ;
   private String edtavnRcdDeleted_862_Internalname ;
   private String edtPlaMTAOrd_Internalname ;
   private String edtPlaMTADsc_Internalname ;
   private String edtPlaMTACnd_Internalname ;
   private String edtPlaMTAMin_Internalname ;
   private String edtPlaMTAMax_Internalname ;
   private String edtPlaMTAAca_Internalname ;
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
   private String sMode65 ;
   private String GXCCtl ;
   private String A6457PlaMTAAca ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_862_Jsonclick ;
   private String edtPlaMTAOrd_Jsonclick ;
   private String edtPlaMTADsc_Jsonclick ;
   private String edtPlaMTACnd_Jsonclick ;
   private String edtPlaMTAMin_Jsonclick ;
   private String edtPlaMTAMax_Jsonclick ;
   private String edtPlaMTAAca_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ606MaqDsc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean n4283MaqKgsMin ;
   private boolean n4285MaqKgsMax ;
   private boolean n5880PlaMTACnd ;
   private boolean n5881PlaMTAMin ;
   private boolean n5882PlaMTAMax ;
   private boolean n6457PlaMTAAca ;
   private String Z11699PlaMTADsc ;
   private String Z5880PlaMTACnd ;
   private String A11699PlaMTADsc ;
   private String A5880PlaMTACnd ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00SK7_A602MaqCod ;
   private boolean[] T00SK7_n602MaqCod ;
   private String[] T00SK7_A606MaqDsc ;
   private boolean[] T00SK7_n606MaqDsc ;
   private java.math.BigDecimal[] T00SK7_A4283MaqKgsMin ;
   private boolean[] T00SK7_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T00SK7_A4285MaqKgsMax ;
   private boolean[] T00SK7_n4285MaqKgsMax ;
   private String[] T00SK7_A396EmprCod ;
   private String[] T00SK6_A396EmprCod ;
   private String[] T00SK8_A396EmprCod ;
   private String[] T00SK9_A396EmprCod ;
   private String[] T00SK9_A602MaqCod ;
   private boolean[] T00SK9_n602MaqCod ;
   private String[] T00SK5_A602MaqCod ;
   private boolean[] T00SK5_n602MaqCod ;
   private String[] T00SK5_A606MaqDsc ;
   private boolean[] T00SK5_n606MaqDsc ;
   private java.math.BigDecimal[] T00SK5_A4283MaqKgsMin ;
   private boolean[] T00SK5_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T00SK5_A4285MaqKgsMax ;
   private boolean[] T00SK5_n4285MaqKgsMax ;
   private String[] T00SK5_A396EmprCod ;
   private String[] T00SK10_A396EmprCod ;
   private String[] T00SK10_A602MaqCod ;
   private boolean[] T00SK10_n602MaqCod ;
   private String[] T00SK11_A396EmprCod ;
   private String[] T00SK11_A602MaqCod ;
   private boolean[] T00SK11_n602MaqCod ;
   private String[] T00SK4_A602MaqCod ;
   private boolean[] T00SK4_n602MaqCod ;
   private String[] T00SK4_A606MaqDsc ;
   private boolean[] T00SK4_n606MaqDsc ;
   private java.math.BigDecimal[] T00SK4_A4283MaqKgsMin ;
   private boolean[] T00SK4_n4283MaqKgsMin ;
   private java.math.BigDecimal[] T00SK4_A4285MaqKgsMax ;
   private boolean[] T00SK4_n4285MaqKgsMax ;
   private String[] T00SK4_A396EmprCod ;
   private String[] T00SK15_A396EmprCod ;
   private String[] T00SK15_A602MaqCod ;
   private boolean[] T00SK15_n602MaqCod ;
   private short[] T00SK15_A14529MqCAnyo ;
   private byte[] T00SK15_A14530MqCMes ;
   private String[] T00SK16_A396EmprCod ;
   private int[] T00SK16_A129BarCod ;
   private byte[] T00SK16_A132BarCodReo ;
   private String[] T00SK16_A130BarCodPar ;
   private short[] T00SK16_A14152MEnvOrd ;
   private String[] T00SK17_A396EmprCod ;
   private int[] T00SK17_A13604RARID ;
   private String[] T00SK17_A602MaqCod ;
   private boolean[] T00SK17_n602MaqCod ;
   private String[] T00SK18_A396EmprCod ;
   private String[] T00SK18_A602MaqCod ;
   private boolean[] T00SK18_n602MaqCod ;
   private int[] T00SK18_A13193MaqHdr ;
   private byte[] T00SK18_A13194MaqHdrR ;
   private String[] T00SK18_A13195MaqHdrP ;
   private short[] T00SK18_A13196MaqRecLinM ;
   private String[] T00SK19_A396EmprCod ;
   private int[] T00SK19_A13137NCHdr ;
   private byte[] T00SK19_A13138NCHdrr ;
   private String[] T00SK19_A13139NCHdrp ;
   private String[] T00SK20_A396EmprCod ;
   private int[] T00SK20_A12673LavMqId ;
   private String[] T00SK21_A396EmprCod ;
   private String[] T00SK21_A602MaqCod ;
   private boolean[] T00SK21_n602MaqCod ;
   private short[] T00SK21_A12444MaqAnyNP ;
   private byte[] T00SK21_A12445MaqMesNP ;
   private String[] T00SK22_A396EmprCod ;
   private String[] T00SK22_A602MaqCod ;
   private boolean[] T00SK22_n602MaqCod ;
   private short[] T00SK22_A12434MaqAnyM ;
   private byte[] T00SK22_A12435MaqMesM ;
   private String[] T00SK23_A396EmprCod ;
   private java.util.Date[] T00SK23_A4929Inc_Dia ;
   private short[] T00SK23_A5728JBCLLin ;
   private String[] T00SK24_A396EmprCod ;
   private int[] T00SK24_A11604PArtId ;
   private String[] T00SK25_A396EmprCod ;
   private String[] T00SK25_A602MaqCod ;
   private boolean[] T00SK25_n602MaqCod ;
   private java.util.Date[] T00SK25_A11445MaqFch ;
   private String[] T00SK26_A396EmprCod ;
   private String[] T00SK26_A602MaqCod ;
   private boolean[] T00SK26_n602MaqCod ;
   private String[] T00SK26_A11438MaqEquCod ;
   private String[] T00SK26_A11439MaqSEqCod ;
   private String[] T00SK26_A11440MaqPieCod ;
   private String[] T00SK27_A396EmprCod ;
   private String[] T00SK27_A602MaqCod ;
   private boolean[] T00SK27_n602MaqCod ;
   private short[] T00SK27_A11432MaqDocId ;
   private String[] T00SK28_A396EmprCod ;
   private String[] T00SK28_A602MaqCod ;
   private boolean[] T00SK28_n602MaqCod ;
   private java.util.Date[] T00SK28_A10111Mq_Dia ;
   private int[] T00SK28_A10112Mq_Op ;
   private String[] T00SK29_A396EmprCod ;
   private int[] T00SK29_A252CliCod ;
   private String[] T00SK29_A65ArtCod ;
   private String[] T00SK29_A10041ArtSH ;
   private String[] T00SK29_A10042ArtMqFa ;
   private String[] T00SK30_A396EmprCod ;
   private String[] T00SK30_A602MaqCod ;
   private boolean[] T00SK30_n602MaqCod ;
   private java.util.Date[] T00SK30_A74MaqTMuIni ;
   private String[] T00SK31_A396EmprCod ;
   private String[] T00SK31_A602MaqCod ;
   private boolean[] T00SK31_n602MaqCod ;
   private String[] T00SK31_A9725MaqFabC ;
   private String[] T00SK32_A396EmprCod ;
   private int[] T00SK32_A9428SMCod ;
   private String[] T00SK33_A396EmprCod ;
   private int[] T00SK33_A9429PMCod ;
   private String[] T00SK34_A396EmprCod ;
   private int[] T00SK34_A9425OMCod ;
   private String[] T00SK35_A396EmprCod ;
   private String[] T00SK35_A602MaqCod ;
   private boolean[] T00SK35_n602MaqCod ;
   private String[] T00SK35_A8008Maq_Prg ;
   private String[] T00SK36_A396EmprCod ;
   private String[] T00SK36_A602MaqCod ;
   private boolean[] T00SK36_n602MaqCod ;
   private String[] T00SK36_A6874CPROCORIG ;
   private String[] T00SK37_A396EmprCod ;
   private int[] T00SK37_A6319C_Barcod ;
   private byte[] T00SK37_A6320C_Barcodre ;
   private String[] T00SK37_A6321C_Barcodpa ;
   private short[] T00SK37_A6322C_Reclinma ;
   private String[] T00SK38_A396EmprCod ;
   private String[] T00SK38_A602MaqCod ;
   private boolean[] T00SK38_n602MaqCod ;
   private byte[] T00SK38_A6260MaqTqn ;
   private String[] T00SK39_A396EmprCod ;
   private short[] T00SK39_A6188MaqTArt ;
   private String[] T00SK39_A602MaqCod ;
   private boolean[] T00SK39_n602MaqCod ;
   private String[] T00SK40_A396EmprCod ;
   private String[] T00SK40_A602MaqCod ;
   private boolean[] T00SK40_n602MaqCod ;
   private int[] T00SK40_A6078MaqCliCod ;
   private String[] T00SK40_A6079MaqArtCod ;
   private String[] T00SK41_A396EmprCod ;
   private byte[] T00SK41_A6037Mq_Grupo ;
   private String[] T00SK41_A602MaqCod ;
   private boolean[] T00SK41_n602MaqCod ;
   private String[] T00SK42_A396EmprCod ;
   private String[] T00SK42_A6000CRCod ;
   private short[] T00SK42_A6005CRLin ;
   private String[] T00SK43_A396EmprCod ;
   private String[] T00SK43_A5603PrdNumM ;
   private String[] T00SK43_A602MaqCod ;
   private boolean[] T00SK43_n602MaqCod ;
   private String[] T00SK44_A396EmprCod ;
   private String[] T00SK44_A602MaqCod ;
   private boolean[] T00SK44_n602MaqCod ;
   private String[] T00SK44_A5525MaqPrdNum ;
   private String[] T00SK45_A396EmprCod ;
   private String[] T00SK45_A764ProForCod ;
   private short[] T00SK45_A5191ProForLC ;
   private String[] T00SK46_A396EmprCod ;
   private short[] T00SK46_A4686MaqTipArt ;
   private String[] T00SK46_A602MaqCod ;
   private boolean[] T00SK46_n602MaqCod ;
   private String[] T00SK47_A396EmprCod ;
   private byte[] T00SK47_A3331LanBroCod ;
   private short[] T00SK47_A3333LanBroLin ;
   private String[] T00SK48_A396EmprCod ;
   private String[] T00SK48_A602MaqCod ;
   private boolean[] T00SK48_n602MaqCod ;
   private String[] T00SK48_A3047LOParId ;
   private String[] T00SK49_A396EmprCod ;
   private int[] T00SK49_A129BarCod ;
   private byte[] T00SK49_A132BarCodReo ;
   private String[] T00SK49_A130BarCodPar ;
   private short[] T00SK49_A2804RecLinMaq ;
   private String[] T00SK50_A396EmprCod ;
   private String[] T00SK50_A602MaqCod ;
   private boolean[] T00SK50_n602MaqCod ;
   private java.util.Date[] T00SK50_A2461PlaFecTin ;
   private String[] T00SK51_A396EmprCod ;
   private String[] T00SK51_A602MaqCod ;
   private boolean[] T00SK51_n602MaqCod ;
   private short[] T00SK51_A2019MaqMadLin ;
   private String[] T00SK52_A396EmprCod ;
   private String[] T00SK52_A602MaqCod ;
   private boolean[] T00SK52_n602MaqCod ;
   private short[] T00SK52_A2014MaqConLin ;
   private String[] T00SK53_A396EmprCod ;
   private String[] T00SK53_A1621CosTermCod ;
   private int[] T00SK53_A1615CosLin ;
   private String[] T00SK54_A396EmprCod ;
   private String[] T00SK54_A602MaqCod ;
   private boolean[] T00SK54_n602MaqCod ;
   private String[] T00SK54_A1142MaqFCod ;
   private String[] T00SK55_A396EmprCod ;
   private String[] T00SK55_A602MaqCod ;
   private boolean[] T00SK55_n602MaqCod ;
   private byte[] T00SK55_A634MhiMes ;
   private short[] T00SK55_A632MhiAny ;
   private String[] T00SK56_A396EmprCod ;
   private String[] T00SK56_A602MaqCod ;
   private boolean[] T00SK56_n602MaqCod ;
   private byte[] T00SK56_A320DesTecLin ;
   private String[] T00SK57_A396EmprCod ;
   private String[] T00SK57_A602MaqCod ;
   private boolean[] T00SK57_n602MaqCod ;
   private short[] T00SK57_A599MaqAny ;
   private byte[] T00SK57_A614MaqMes ;
   private String[] T00SK58_A396EmprCod ;
   private int[] T00SK58_A539HisBarCod ;
   private byte[] T00SK58_A545HisCodReo ;
   private String[] T00SK58_A544HisCodPar ;
   private short[] T00SK58_A833TipDefCod ;
   private String[] T00SK59_A396EmprCod ;
   private String[] T00SK59_A602MaqCod ;
   private boolean[] T00SK59_n602MaqCod ;
   private java.util.Date[] T00SK59_A558HisProFec ;
   private String[] T00SK60_A396EmprCod ;
   private String[] T00SK60_A501GruMaqCod ;
   private String[] T00SK60_A602MaqCod ;
   private boolean[] T00SK60_n602MaqCod ;
   private String[] T00SK61_A396EmprCod ;
   private String[] T00SK61_A457FasCod ;
   private String[] T00SK62_A396EmprCod ;
   private int[] T00SK62_A361DisCod ;
   private String[] T00SK63_A396EmprCod ;
   private int[] T00SK63_A129BarCod ;
   private byte[] T00SK63_A132BarCodReo ;
   private String[] T00SK63_A130BarCodPar ;
   private String[] T00SK63_A758ProCod ;
   private short[] T00SK63_A194BarOrdLin ;
   private String[] T00SK64_A396EmprCod ;
   private String[] T00SK64_A602MaqCod ;
   private boolean[] T00SK64_n602MaqCod ;
   private String[] T00SK65_A602MaqCod ;
   private boolean[] T00SK65_n602MaqCod ;
   private short[] T00SK65_A5879PlaMTAOrd ;
   private String[] T00SK65_A11699PlaMTADsc ;
   private String[] T00SK65_A5880PlaMTACnd ;
   private boolean[] T00SK65_n5880PlaMTACnd ;
   private int[] T00SK65_A5881PlaMTAMin ;
   private boolean[] T00SK65_n5881PlaMTAMin ;
   private int[] T00SK65_A5882PlaMTAMax ;
   private boolean[] T00SK65_n5882PlaMTAMax ;
   private String[] T00SK65_A6457PlaMTAAca ;
   private boolean[] T00SK65_n6457PlaMTAAca ;
   private String[] T00SK65_A396EmprCod ;
   private String[] T00SK66_A396EmprCod ;
   private String[] T00SK66_A602MaqCod ;
   private boolean[] T00SK66_n602MaqCod ;
   private short[] T00SK66_A5879PlaMTAOrd ;
   private String[] T00SK3_A602MaqCod ;
   private boolean[] T00SK3_n602MaqCod ;
   private short[] T00SK3_A5879PlaMTAOrd ;
   private String[] T00SK3_A11699PlaMTADsc ;
   private String[] T00SK3_A5880PlaMTACnd ;
   private boolean[] T00SK3_n5880PlaMTACnd ;
   private int[] T00SK3_A5881PlaMTAMin ;
   private boolean[] T00SK3_n5881PlaMTAMin ;
   private int[] T00SK3_A5882PlaMTAMax ;
   private boolean[] T00SK3_n5882PlaMTAMax ;
   private String[] T00SK3_A6457PlaMTAAca ;
   private boolean[] T00SK3_n6457PlaMTAAca ;
   private String[] T00SK3_A396EmprCod ;
   private String[] T00SK2_A602MaqCod ;
   private boolean[] T00SK2_n602MaqCod ;
   private short[] T00SK2_A5879PlaMTAOrd ;
   private String[] T00SK2_A11699PlaMTADsc ;
   private String[] T00SK2_A5880PlaMTACnd ;
   private boolean[] T00SK2_n5880PlaMTACnd ;
   private int[] T00SK2_A5881PlaMTAMin ;
   private boolean[] T00SK2_n5881PlaMTAMin ;
   private int[] T00SK2_A5882PlaMTAMax ;
   private boolean[] T00SK2_n5882PlaMTAMax ;
   private String[] T00SK2_A6457PlaMTAAca ;
   private boolean[] T00SK2_n6457PlaMTAAca ;
   private String[] T00SK2_A396EmprCod ;
   private String[] T00SK70_A396EmprCod ;
   private String[] T00SK70_A602MaqCod ;
   private boolean[] T00SK70_n602MaqCod ;
   private short[] T00SK70_A5879PlaMTAOrd ;
   private String[] T00SK71_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tplamaq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplamaq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplamaq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplamaq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tplamaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00SK2", "SELECT MaqCod, PlaMTAOrd, PlaMTADsc, PlaMTACnd, PlaMTAMin, PlaMTAMax, PlaMTAAca, EmprCod FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ? AND PlaMTAOrd = ?  FOR UPDATE OF PlaMTADsc, PlaMTACnd, PlaMTAMin, PlaMTAMax, PlaMTAAca NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK3", "SELECT MaqCod, PlaMTAOrd, PlaMTADsc, PlaMTACnd, PlaMTAMin, PlaMTAMax, PlaMTAAca, EmprCod FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ? AND PlaMTAOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK4", "SELECT MaqCod, MaqDsc, MaqKgsMin, MaqKgsMax, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ?  FOR UPDATE OF MaqDsc, MaqKgsMin, MaqKgsMax NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK5", "SELECT MaqCod, MaqDsc, MaqKgsMin, MaqKgsMax, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK6", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK7", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqCod, TM1.MaqDsc, TM1.MaqKgsMin, TM1.MaqKgsMax, TM1.EmprCod FROM TXPMAQUIN TM1 WHERE TM1.EmprCod = ? and TM1.MaqCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK8", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( EmprCod > ? or EmprCod = ? and MaqCod > ?) ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( EmprCod < ? or EmprCod = ? and MaqCod < ?) ORDER BY EmprCod DESC, MaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00SK12", "INSERT INTO TXPMAQUIN(MaqCod, MaqDsc, MaqKgsMin, MaqKgsMax, EmprCod, MaqCodFor, MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax, MaqChp, MaqTinTip, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqFasUni, MaqConUlt, MaqMadUlt, MaqMicro, MaqVolRes, MaqVolTop, MaqCapac, MaqPri, MaqNhd, MaqNroTub, MaqRelBan, MaqTipMaq, TipMaqCod, MaqFormul, MaqKgsMed, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqCCoCod, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqPasw, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqUltDoc, MaqDTTipo, MaqDTMar, MaqDTMod, MaqDTRef, MaqDTSer, MaqDTFab, MaqDTOri, MaqDTAdqFc, MaqDTAdqFo, MaqDTPrv, MaqDTPrvDi, MaqDTAdqCo, MaqDTRepCo, MaqDTCar, MaqDTVolt, MaqDTReq, MaqDTMnt, MaqDTCal, MaqDTServ, MaqDTInv, MaqDTGarIn, MaqDTGarFi, MaqVolBal, MaqCosGen, MaqOgtId, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqDscLarg, MaqCuerdas, MaqGI, MaqAdCent, MaqAmort) VALUES(?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T00SK13", "UPDATE TXPMAQUIN SET MaqDsc=?, MaqKgsMin=?, MaqKgsMax=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T00SK14", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T00SK15", "SELECT * FROM (SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND MEnvMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK17", "SELECT * FROM (SELECT EmprCod, RARID, MaqCod FROM TXPDSPRA3 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK18", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK19", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK20", "SELECT * FROM (SELECT EmprCod, LavMqId FROM TXPLAVMQ0 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK21", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK22", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK23", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK24", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK25", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK26", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK27", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK28", "SELECT * FROM (SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND ArtMqFa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK30", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK31", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFabC FROM TXPMAQFAB WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK32", "SELECT * FROM (SELECT EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK33", "SELECT * FROM (SELECT EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK34", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK35", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK36", "SELECT * FROM (SELECT EmprCod, MaqCod, CPROCORIG FROM TXPCONVPR WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK37", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK38", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK39", "SELECT * FROM (SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK40", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK41", "SELECT * FROM (SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK42", "SELECT * FROM (SELECT EmprCod, CRCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK43", "SELECT * FROM (SELECT EmprCod, PrdNumM, MaqCod FROM TXPPRDMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK44", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqPrdNum FROM TXPMAQPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK45", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK46", "SELECT * FROM (SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK47", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK48", "SELECT * FROM (SELECT EmprCod, MaqCod, LOParId FROM TXPLOMaqP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK49", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK50", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK51", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK52", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK53", "SELECT * FROM (SELECT EmprCod, CosTermCod, CosLin FROM TXPCOSTES WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK54", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK55", "SELECT * FROM (SELECT EmprCod, MaqCod, MhiMes, MhiAny FROM TXPCMHPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK56", "SELECT * FROM (SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK57", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK58", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK59", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK60", "SELECT * FROM (SELECT EmprCod, GruMaqCod, MaqCod FROM TXPGRULIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK61", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK62", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND MaqCodDis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK63", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND MaqCodBis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SK64", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod FROM TXPMAQUIN ORDER BY EmprCod, MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK65", "SELECT MaqCod, PlaMTAOrd, PlaMTADsc, PlaMTACnd, PlaMTAMin, PlaMTAMax, PlaMTAAca, EmprCod FROM TXPPlaMaq WHERE EmprCod = ? and MaqCod = ? and PlaMTAOrd = ? ORDER BY EmprCod, MaqCod, PlaMTAOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK66", "SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ? AND PlaMTAOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00SK67", "INSERT INTO TXPPlaMaq(MaqCod, PlaMTAOrd, PlaMTADsc, PlaMTACnd, PlaMTAMin, PlaMTAMax, PlaMTAAca, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPlaMaq")
         ,new UpdateCursor("T00SK68", "UPDATE TXPPlaMaq SET PlaMTADsc=?, PlaMTACnd=?, PlaMTAMin=?, PlaMTAMax=?, PlaMTAAca=?  WHERE EmprCod = ? AND MaqCod = ? AND PlaMTAOrd = ?", GX_NOMASK, "TXPPlaMaq")
         ,new UpdateCursor("T00SK69", "DELETE FROM TXPPlaMaq  WHERE EmprCod = ? AND MaqCod = ? AND PlaMTAOrd = ?", GX_NOMASK, "TXPPlaMaq")
         ,new ForEachCursor("T00SK70", "SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, PlaMTAOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SK71", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 3);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 69 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
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
                  stmt.setString(2, (String)parms[3], 16);
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
               stmt.setString(5, (String)parms[8], 3);
               return;
            case 11 :
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
               stmt.setString(4, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 6);
               }
               return;
            case 12 :
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
            case 13 :
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
            case 15 :
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
            case 16 :
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
            case 17 :
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
            case 20 :
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
            case 21 :
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
            case 22 :
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
            case 23 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 26 :
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
            case 27 :
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
            case 28 :
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
            case 29 :
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
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
            case 34 :
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
            case 35 :
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
            case 36 :
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
            case 37 :
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
            case 38 :
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
            case 39 :
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
            case 40 :
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
            case 41 :
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
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
            case 61 :
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
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 65 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setVarchar(3, (String)parms[3], 60, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 2000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[9]).intValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 1);
               }
               stmt.setString(8, (String)parms[12], 3);
               return;
            case 66 :
               stmt.setVarchar(1, (String)parms[0], 60, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 2000);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 1);
               }
               stmt.setString(6, (String)parms[9], 3);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[11], 6);
               }
               stmt.setShort(8, ((Number) parms[12]).shortValue());
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 68 :
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
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

