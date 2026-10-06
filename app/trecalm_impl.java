package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trecalm_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8908CC_AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A8908CC_AlmCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8908CC_AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A719PrdNum, A8908CC_AlmCod) ;
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A810RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "RECUENTOS POR ALMACEN", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRecExiTcc_Internalname ;
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
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public trecalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trecalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trecalm_impl.class ));
   }

   public trecalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TRECALM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Fecha Recuento", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtRecFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecFec_Internalname, localUtil.format(A810RecFec, "99/99/99"), localUtil.format( A810RecFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecFec_Jsonclick, 0, "", "", "", "", "", 1, edtRecFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECALM.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtRecFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtRecFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TRECALM.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Existencia Teorica Cuarto Col.", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiTcc_Internalname, GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiTcc_Enabled!=0) ? localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999") : localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiTcc_Jsonclick, 0, "", "", "", "", "", 1, edtRecExiTcc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Existencia Real Cuarto Col.", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecExiRcc_Internalname, GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecExiRcc_Enabled!=0) ? localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999") : localUtil.format( A806RecExiRcc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecExiRcc_Jsonclick, 0, "", "", "", "", "", 1, edtRecExiRcc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TRECALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol55( ) ;
      nGXsfl_55_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1213 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1213 = (short)(1) ;
            scanStart1381213( ) ;
            while ( RcdFound1213 != 0 )
            {
               init_level_properties1213( ) ;
               getByPrimaryKey1381213( ) ;
               addRow1381213( ) ;
               scanNext1381213( ) ;
            }
            scanEnd1381213( ) ;
            nBlankRcdCount1213 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1381213( ) ;
         standaloneModal1381213( ) ;
         sMode1213 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1381213( ) ;
            edtavnRcdDeleted_1213_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1213_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1213_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1213_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCC_AlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCC_AlmDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCC_ExiTeoC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_EXITEOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_ExiTeoC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExiTeoC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCC_ExiReaC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_EXIREAC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_ExiReaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExiReaC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCC_Estado_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ESTADO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Estado_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtCC_MemCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_MEMCANT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_MemCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_MemCant_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1213 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1381213( ) ;
            }
            sendRow1381213( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1213 = (short)(5) ;
         nRcdExists_1213 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1381213( ) ;
            while ( RcdFound1213 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551213( ) ;
               init_level_properties1213( ) ;
               standaloneNotModal1381213( ) ;
               getByPrimaryKey1381213( ) ;
               standaloneModal1381213( ) ;
               addRow1381213( ) ;
               scanNext1381213( ) ;
            }
            scanEnd1381213( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1213 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551213( ) ;
      initAll1381213( ) ;
      init_level_properties1213( ) ;
      nRcdExists_1213 = (short)(0) ;
      nIsMod_1213 = (short)(0) ;
      nRcdDeleted_1213 = (short)(0) ;
      nBlankRcdCount1213 = (short)(nBlankRcdUsr1213+nBlankRcdCount1213) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1213 > 0 )
      {
         standaloneNotModal1381213( ) ;
         standaloneModal1381213( ) ;
         addRow1381213( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCC_ExiReaC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1213 = (short)(nBlankRcdCount1213-1) ;
      }
      Gx_mode = sMode1213 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TRECALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TRECALM.htm");
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
      e111382 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            Z810RecFec = localUtil.ctod( httpContext.cgiGet( "Z810RecFec"), 0) ;
            Z808RecExiTcc = localUtil.ctond( httpContext.cgiGet( "Z808RecExiTcc")) ;
            Z806RecExiRcc = localUtil.ctond( httpContext.cgiGet( "Z806RecExiRcc")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            A810RecFec = localUtil.ctod( httpContext.cgiGet( edtRecFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXITCC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecExiTcc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A808RecExiTcc = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
            }
            else
            {
               A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECEXIRCC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRecExiRcc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A806RecExiRcc = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
            }
            else
            {
               A806RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtRecExiRcc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A810RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A810RecFec", localUtil.format(A810RecFec, "99/99/99"));
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
                        e111382 ();
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
            initAll13898( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1213_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1213_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes13898( ) ;
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

   public void confirm_1380( )
   {
      beforeValidate13898( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13898( ) ;
         }
         else
         {
            checkExtendedTable13898( ) ;
            if ( AnyError == 0 )
            {
               zm13898( 6) ;
               zm13898( 7) ;
            }
            closeExtendedTableCursors13898( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode98 = Gx_mode ;
         confirm_1381213( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode98 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1380( ) ;
      }
   }

   public void confirm_1381213( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1381213( ) ;
         if ( ( nRcdExists_1213 != 0 ) || ( nIsMod_1213 != 0 ) )
         {
            getKey1381213( ) ;
            if ( ( nRcdExists_1213 == 0 ) && ( nRcdDeleted_1213 == 0 ) )
            {
               if ( RcdFound1213 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1381213( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1381213( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1381213( 9) ;
                        zm1381213( 10) ;
                     }
                     closeExtendedTableCursors1381213( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound1213 != 0 )
               {
                  if ( nRcdDeleted_1213 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1381213( ) ;
                     load1381213( ) ;
                     beforeValidate1381213( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1381213( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1213 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1381213( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1381213( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1381213( 9) ;
                              zm1381213( 10) ;
                           }
                           closeExtendedTableCursors1381213( ) ;
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
                  if ( nRcdDeleted_1213 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1213_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmDsc_Internalname, GXutil.rtrim( A8909CC_AlmDsc)) ;
         httpContext.changePostValue( edtCC_ExiTeoC_Internalname, GXutil.ltrim( localUtil.ntoc( A8919CC_ExiTeoC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_ExiReaC_Internalname, GXutil.ltrim( localUtil.ntoc( A8920CC_ExiReaC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Estado_Internalname, GXutil.ltrim( localUtil.ntoc( A8923CC_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_MemCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11625CC_MemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8919CC_ExiTeoC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8919CC_ExiTeoC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8920CC_ExiReaC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8920CC_ExiReaC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8923CC_Estado_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8923CC_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11625CC_MemCant_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11625CC_MemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1213_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1213_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1213_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1213 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1213_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1213_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_EXITEOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiTeoC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_EXIREAC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiReaC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ESTADO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Estado_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_MEMCANT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_MemCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1380( )
   {
   }

   public void e111382( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      trecalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      trecalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      trecalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV15Lit3 = httpContext.getMessage( "Producto", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Fecha", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      trecalm_impl.this.A396EmprCod = GXv_char2[0] ;
      trecalm_impl.this.AV11EmprNom = GXv_char3[0] ;
      trecalm_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm13898( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z808RecExiTcc = T01387_A808RecExiTcc[0] ;
            Z806RecExiRcc = T01387_A806RecExiRcc[0] ;
         }
         else
         {
            Z808RecExiTcc = A808RecExiTcc ;
            Z806RecExiRcc = A806RecExiRcc ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z810RecFec = A810RecFec ;
         Z808RecExiTcc = A808RecExiTcc ;
         Z806RecExiRcc = A806RecExiRcc ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z407EmprNom = A407EmprNom ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TRECALM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01388 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01388_A407EmprNom[0] ;
      n407EmprNom = T01388_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T01389 */
      pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
      }
      A718PrdNom = T01389_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
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

   public void load13898( )
   {
      /* Using cursor T013810 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound98 = (short)(1) ;
         A407EmprNom = T013810_A407EmprNom[0] ;
         n407EmprNom = T013810_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T013810_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A808RecExiTcc = T013810_A808RecExiTcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
         A806RecExiRcc = T013810_A806RecExiRcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
         zm13898( -5) ;
      }
      pr_default.close(8);
      onLoadActions13898( ) ;
   }

   public void onLoadActions13898( )
   {
   }

   public void checkExtendedTable13898( )
   {
      nIsDirty_98 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors13898( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey13898( )
   {
      /* Using cursor T013811 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound98 = (short)(1) ;
      }
      else
      {
         RcdFound98 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01387 */
      pr_default.execute(5, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(5) != 101) && GXutil.dateCompare(GXutil.resetTime(T01387_A810RecFec[0]), GXutil.resetTime(A810RecFec)) && ( GXutil.strcmp(T01387_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01387_A719PrdNum[0], A719PrdNum) == 0 ) )
      {
         zm13898( 5) ;
         RcdFound98 = (short)(1) ;
         A808RecExiTcc = T01387_A808RecExiTcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
         A806RecExiRcc = T01387_A806RecExiRcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z810RecFec = A810RecFec ;
         sMode98 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load13898( ) ;
         if ( AnyError == 1 )
         {
            RcdFound98 = (short)(0) ;
            initializeNonKey13898( ) ;
         }
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound98 = (short)(0) ;
         initializeNonKey13898( ) ;
         sMode98 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode98 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey13898( ) ;
      if ( RcdFound98 == 0 )
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
      RcdFound98 = (short)(0) ;
      /* Using cursor T013812 */
      pr_default.execute(10, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T013812_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013812_A719PrdNum[0], A719PrdNum) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T013812_A810RecFec[0]), GXutil.resetTime(A810RecFec)) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( GXutil.strcmp(T013812_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013812_A719PrdNum[0], A719PrdNum) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T013812_A810RecFec[0]), GXutil.resetTime(A810RecFec)) )
         {
            RcdFound98 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound98 = (short)(0) ;
      /* Using cursor T013813 */
      pr_default.execute(11, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T013813_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013813_A719PrdNum[0], A719PrdNum) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T013813_A810RecFec[0]), GXutil.resetTime(A810RecFec)) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( GXutil.strcmp(T013813_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T013813_A719PrdNum[0], A719PrdNum) == 0 ) && GXutil.dateCompare(GXutil.resetTime(T013813_A810RecFec[0]), GXutil.resetTime(A810RecFec)) )
         {
            RcdFound98 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13898( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRecExiTcc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13898( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound98 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRecExiTcc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update13898( ) ;
               GX_FocusControl = edtRecExiTcc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtRecExiTcc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13898( ) ;
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
                  GX_FocusControl = edtRecExiTcc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13898( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRecExiTcc_Internalname ;
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
      getKey13898( ) ;
      if ( RcdFound98 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A810RecFec), GXutil.resetTime(Z810RecFec)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "trecalm");
      GX_FocusControl = edtRecExiTcc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1380( ) ;
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
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRecExiTcc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart13898( ) ;
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTcc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13898( ) ;
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
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTcc_Internalname ;
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
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTcc_Internalname ;
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
      scanStart13898( ) ;
      if ( RcdFound98 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound98 != 0 )
         {
            scanNext13898( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecExiTcc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13898( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency13898( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01386 */
         pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECUEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z808RecExiTcc, T01386_A808RecExiTcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z806RecExiRcc, T01386_A806RecExiRcc[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z808RecExiTcc, T01386_A808RecExiTcc[0]) != 0 )
            {
               GXutil.writeLogln("trecalm:[seudo value changed for attri]"+"RecExiTcc");
               GXutil.writeLogRaw("Old: ",Z808RecExiTcc);
               GXutil.writeLogRaw("Current: ",T01386_A808RecExiTcc[0]);
            }
            if ( DecimalUtil.compareTo(Z806RecExiRcc, T01386_A806RecExiRcc[0]) != 0 )
            {
               GXutil.writeLogln("trecalm:[seudo value changed for attri]"+"RecExiRcc");
               GXutil.writeLogRaw("Old: ",Z806RecExiRcc);
               GXutil.writeLogRaw("Current: ",T01386_A806RecExiRcc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECUEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13898( )
   {
      beforeValidate13898( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13898( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13898( 0) ;
         checkOptimisticConcurrency13898( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13898( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13898( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013814 */
                  pr_default.execute(12, new Object[] {A810RecFec, A808RecExiTcc, A806RecExiRcc, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
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
                        processLevel13898( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1380( ) ;
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
            load13898( ) ;
         }
         endLevel13898( ) ;
      }
      closeExtendedTableCursors13898( ) ;
   }

   public void update13898( )
   {
      beforeValidate13898( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13898( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13898( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13898( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13898( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013815 */
                  pr_default.execute(13, new Object[] {A808RecExiTcc, A806RecExiRcc, A396EmprCod, A719PrdNum, A810RecFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECUEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13898( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13898( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1380( ) ;
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
         endLevel13898( ) ;
      }
      closeExtendedTableCursors13898( ) ;
   }

   public void deferredUpdate13898( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13898( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13898( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13898( ) ;
         afterConfirm13898( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13898( ) ;
            if ( AnyError == 0 )
            {
               scanStart1381213( ) ;
               while ( RcdFound1213 != 0 )
               {
                  getByPrimaryKey1381213( ) ;
                  delete1381213( ) ;
                  scanNext1381213( ) ;
               }
               scanEnd1381213( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013816 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECUEN");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound98 == 0 )
                        {
                           initAll13898( ) ;
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
                        resetCaption1380( ) ;
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
      sMode98 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13898( ) ;
      Gx_mode = sMode98 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13898( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1381213( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1381213( ) ;
         if ( ( nRcdExists_1213 != 0 ) || ( nIsMod_1213 != 0 ) )
         {
            standaloneNotModal1381213( ) ;
            getKey1381213( ) ;
            if ( ( nRcdExists_1213 == 0 ) && ( nRcdDeleted_1213 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1381213( ) ;
            }
            else
            {
               if ( RcdFound1213 != 0 )
               {
                  if ( ( nRcdDeleted_1213 != 0 ) && ( nRcdExists_1213 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1381213( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1213 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1381213( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1213 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1213_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmDsc_Internalname, GXutil.rtrim( A8909CC_AlmDsc)) ;
         httpContext.changePostValue( edtCC_ExiTeoC_Internalname, GXutil.ltrim( localUtil.ntoc( A8919CC_ExiTeoC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_ExiReaC_Internalname, GXutil.ltrim( localUtil.ntoc( A8920CC_ExiReaC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Estado_Internalname, GXutil.ltrim( localUtil.ntoc( A8923CC_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_MemCant_Internalname, GXutil.ltrim( localUtil.ntoc( A11625CC_MemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8919CC_ExiTeoC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8919CC_ExiTeoC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8920CC_ExiReaC_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8920CC_ExiReaC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8923CC_Estado_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z8923CC_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11625CC_MemCant_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z11625CC_MemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1213_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1213_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1213_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1213 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1213_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1213_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_EXITEOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiTeoC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_EXIREAC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiReaC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ESTADO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Estado_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_MEMCANT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_MemCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1381213( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1213 = (short)(0) ;
      nIsMod_1213 = (short)(0) ;
      nRcdDeleted_1213 = (short)(0) ;
   }

   public void processLevel13898( )
   {
      /* Save parent mode. */
      sMode98 = Gx_mode ;
      processNestedLevel1381213( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode98 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13898( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13898( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trecalm");
         if ( AnyError == 0 )
         {
            confirmValues1380( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trecalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13898( )
   {
      /* Scan By routine */
      /* Using cursor T013817 */
      pr_default.execute(15, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      RcdFound98 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound98 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13898( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound98 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound98 = (short)(1) ;
      }
   }

   public void scanEnd13898( )
   {
      pr_default.close(15);
   }

   public void afterConfirm13898( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13898( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13898( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13898( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13898( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13898( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13898( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecFec_Enabled), 5, 0), true);
      edtRecExiTcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Enabled), 5, 0), true);
      edtRecExiRcc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiRcc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiRcc_Enabled), 5, 0), true);
   }

   public void zm1381213( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8919CC_ExiTeoC = T01383_A8919CC_ExiTeoC[0] ;
            Z8920CC_ExiReaC = T01383_A8920CC_ExiReaC[0] ;
            Z8923CC_Estado = T01383_A8923CC_Estado[0] ;
            Z11625CC_MemCant = T01383_A11625CC_MemCant[0] ;
         }
         else
         {
            Z8919CC_ExiTeoC = A8919CC_ExiTeoC ;
            Z8920CC_ExiReaC = A8920CC_ExiReaC ;
            Z8923CC_Estado = A8923CC_Estado ;
            Z11625CC_MemCant = A11625CC_MemCant ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z810RecFec = A810RecFec ;
         Z8919CC_ExiTeoC = A8919CC_ExiTeoC ;
         Z8920CC_ExiReaC = A8920CC_ExiReaC ;
         Z8923CC_Estado = A8923CC_Estado ;
         Z11625CC_MemCant = A11625CC_MemCant ;
         Z396EmprCod = A396EmprCod ;
         Z8908CC_AlmCod = A8908CC_AlmCod ;
         Z719PrdNum = A719PrdNum ;
         Z8909CC_AlmDsc = A8909CC_AlmDsc ;
      }
   }

   public void standaloneNotModal1381213( )
   {
      edtCC_AlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_ExiTeoC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExiTeoC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExiTeoC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void standaloneModal1381213( )
   {
      if ( true /* Level */ && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( true /* Level */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void load1381213( )
   {
      /* Using cursor T013818 */
      pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1213 = (short)(1) ;
         A8909CC_AlmDsc = T013818_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = T013818_n8909CC_AlmDsc[0] ;
         A8919CC_ExiTeoC = T013818_A8919CC_ExiTeoC[0] ;
         n8919CC_ExiTeoC = T013818_n8919CC_ExiTeoC[0] ;
         A8920CC_ExiReaC = T013818_A8920CC_ExiReaC[0] ;
         n8920CC_ExiReaC = T013818_n8920CC_ExiReaC[0] ;
         A8923CC_Estado = T013818_A8923CC_Estado[0] ;
         n8923CC_Estado = T013818_n8923CC_Estado[0] ;
         A11625CC_MemCant = T013818_A11625CC_MemCant[0] ;
         n11625CC_MemCant = T013818_n11625CC_MemCant[0] ;
         zm1381213( -8) ;
      }
      pr_default.close(16);
      onLoadActions1381213( ) ;
   }

   public void onLoadActions1381213( )
   {
   }

   public void checkExtendedTable1381213( )
   {
      nIsDirty_1213 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1381213( ) ;
      /* Using cursor T01384 */
      pr_default.execute(2, new Object[] {A396EmprCod, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8909CC_AlmDsc = T01384_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T01384_n8909CC_AlmDsc[0] ;
      pr_default.close(2);
      /* Using cursor T01385 */
      pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRDALMC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1381213( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1381213( )
   {
   }

   public void gxload_9( String A396EmprCod ,
                         byte A8908CC_AlmCod )
   {
      /* Using cursor T013819 */
      pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8909CC_AlmDsc = T013819_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T013819_n8909CC_AlmDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8909CC_AlmDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_10( String A396EmprCod ,
                          String A719PrdNum ,
                          byte A8908CC_AlmCod )
   {
      /* Using cursor T013820 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRDALMC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1381213( )
   {
      /* Using cursor T013821 */
      pr_default.execute(19, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1213 = (short)(1) ;
      }
      else
      {
         RcdFound1213 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1381213( )
   {
      /* Using cursor T01383 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(1) != 101) && GXutil.dateCompare(GXutil.resetTime(T01383_A810RecFec[0]), GXutil.resetTime(A810RecFec)) && ( GXutil.strcmp(T01383_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01383_A719PrdNum[0], A719PrdNum) == 0 ) )
      {
         zm1381213( 8) ;
         RcdFound1213 = (short)(1) ;
         initializeNonKey1381213( ) ;
         A8919CC_ExiTeoC = T01383_A8919CC_ExiTeoC[0] ;
         n8919CC_ExiTeoC = T01383_n8919CC_ExiTeoC[0] ;
         A8920CC_ExiReaC = T01383_A8920CC_ExiReaC[0] ;
         n8920CC_ExiReaC = T01383_n8920CC_ExiReaC[0] ;
         A8923CC_Estado = T01383_A8923CC_Estado[0] ;
         n8923CC_Estado = T01383_n8923CC_Estado[0] ;
         A11625CC_MemCant = T01383_A11625CC_MemCant[0] ;
         n11625CC_MemCant = T01383_n11625CC_MemCant[0] ;
         A8908CC_AlmCod = T01383_A8908CC_AlmCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z810RecFec = A810RecFec ;
         Z8908CC_AlmCod = A8908CC_AlmCod ;
         sMode1213 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1381213( ) ;
         load1381213( ) ;
         Gx_mode = sMode1213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1213 = (short)(0) ;
         initializeNonKey1381213( ) ;
         sMode1213 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1381213( ) ;
         Gx_mode = sMode1213 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1381213( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1381213( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01382 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z8919CC_ExiTeoC, T01382_A8919CC_ExiTeoC[0]) != 0 ) || ( DecimalUtil.compareTo(Z8920CC_ExiReaC, T01382_A8920CC_ExiReaC[0]) != 0 ) || ( Z8923CC_Estado != T01382_A8923CC_Estado[0] ) || ( Z11625CC_MemCant != T01382_A11625CC_MemCant[0] ) )
         {
            if ( DecimalUtil.compareTo(Z8919CC_ExiTeoC, T01382_A8919CC_ExiTeoC[0]) != 0 )
            {
               GXutil.writeLogln("trecalm:[seudo value changed for attri]"+"CC_ExiTeoC");
               GXutil.writeLogRaw("Old: ",Z8919CC_ExiTeoC);
               GXutil.writeLogRaw("Current: ",T01382_A8919CC_ExiTeoC[0]);
            }
            if ( DecimalUtil.compareTo(Z8920CC_ExiReaC, T01382_A8920CC_ExiReaC[0]) != 0 )
            {
               GXutil.writeLogln("trecalm:[seudo value changed for attri]"+"CC_ExiReaC");
               GXutil.writeLogRaw("Old: ",Z8920CC_ExiReaC);
               GXutil.writeLogRaw("Current: ",T01382_A8920CC_ExiReaC[0]);
            }
            if ( Z8923CC_Estado != T01382_A8923CC_Estado[0] )
            {
               GXutil.writeLogln("trecalm:[seudo value changed for attri]"+"CC_Estado");
               GXutil.writeLogRaw("Old: ",Z8923CC_Estado);
               GXutil.writeLogRaw("Current: ",T01382_A8923CC_Estado[0]);
            }
            if ( Z11625CC_MemCant != T01382_A11625CC_MemCant[0] )
            {
               GXutil.writeLogln("trecalm:[seudo value changed for attri]"+"CC_MemCant");
               GXutil.writeLogRaw("Old: ",Z11625CC_MemCant);
               GXutil.writeLogRaw("Current: ",T01382_A11625CC_MemCant[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1381213( )
   {
      beforeValidate1381213( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1381213( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1381213( 0) ;
         checkOptimisticConcurrency1381213( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1381213( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1381213( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013822 */
                  pr_default.execute(20, new Object[] {A810RecFec, Boolean.valueOf(n8919CC_ExiTeoC), A8919CC_ExiTeoC, Boolean.valueOf(n8920CC_ExiReaC), A8920CC_ExiReaC, Boolean.valueOf(n8923CC_Estado), Byte.valueOf(A8923CC_Estado), Boolean.valueOf(n11625CC_MemCant), Byte.valueOf(A11625CC_MemCant), A396EmprCod, Byte.valueOf(A8908CC_AlmCod), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
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
            load1381213( ) ;
         }
         endLevel1381213( ) ;
      }
      closeExtendedTableCursors1381213( ) ;
   }

   public void update1381213( )
   {
      beforeValidate1381213( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1381213( ) ;
      }
      if ( ( nIsMod_1213 != 0 ) || ( nIsDirty_1213 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1381213( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1381213( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1381213( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013823 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n8919CC_ExiTeoC), A8919CC_ExiTeoC, Boolean.valueOf(n8920CC_ExiReaC), A8920CC_ExiReaC, Boolean.valueOf(n8923CC_Estado), Byte.valueOf(A8923CC_Estado), Boolean.valueOf(n11625CC_MemCant), Byte.valueOf(A11625CC_MemCant), A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECALM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1381213( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1381213( ) ;
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
            endLevel1381213( ) ;
         }
      }
      closeExtendedTableCursors1381213( ) ;
   }

   public void deferredUpdate1381213( )
   {
   }

   public void delete1381213( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1381213( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1381213( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1381213( ) ;
         afterConfirm1381213( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1381213( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013824 */
               pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum, A810RecFec, Byte.valueOf(A8908CC_AlmCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECALM");
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
      sMode1213 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1381213( ) ;
      Gx_mode = sMode1213 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1381213( )
   {
      standaloneModal1381213( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013825 */
         pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A8908CC_AlmCod)});
         A8909CC_AlmDsc = T013825_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = T013825_n8909CC_AlmDsc[0] ;
         pr_default.close(23);
      }
   }

   public void endLevel1381213( )
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

   public void scanStart1381213( )
   {
      /* Scan By routine */
      /* Using cursor T013826 */
      pr_default.execute(24, new Object[] {A396EmprCod, A719PrdNum, A810RecFec});
      RcdFound1213 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1213 = (short)(1) ;
         A8908CC_AlmCod = T013826_A8908CC_AlmCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1381213( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1213 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1213 = (short)(1) ;
         A8908CC_AlmCod = T013826_A8908CC_AlmCod[0] ;
      }
   }

   public void scanEnd1381213( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1381213( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1381213( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1381213( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1381213( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1381213( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1381213( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1381213( )
   {
      edtCC_AlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_AlmDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_ExiTeoC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExiTeoC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExiTeoC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_ExiReaC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExiReaC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExiReaC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_Estado_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Estado_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Estado_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_MemCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_MemCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_MemCant_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1381213( )
   {
   }

   public void send_integrity_lvl_hashes13898( )
   {
   }

   public void subsflControlProps_551213( )
   {
      edtavnRcdDeleted_1213_Internalname = "vNRCDDELETED_1213_"+sGXsfl_55_idx ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD_"+sGXsfl_55_idx ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC_"+sGXsfl_55_idx ;
      edtCC_ExiTeoC_Internalname = "CC_EXITEOC_"+sGXsfl_55_idx ;
      edtCC_ExiReaC_Internalname = "CC_EXIREAC_"+sGXsfl_55_idx ;
      edtCC_Estado_Internalname = "CC_ESTADO_"+sGXsfl_55_idx ;
      edtCC_MemCant_Internalname = "CC_MEMCANT_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551213( )
   {
      edtavnRcdDeleted_1213_Internalname = "vNRCDDELETED_1213_"+sGXsfl_55_fel_idx ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD_"+sGXsfl_55_fel_idx ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC_"+sGXsfl_55_fel_idx ;
      edtCC_ExiTeoC_Internalname = "CC_EXITEOC_"+sGXsfl_55_fel_idx ;
      edtCC_ExiReaC_Internalname = "CC_EXIREAC_"+sGXsfl_55_fel_idx ;
      edtCC_Estado_Internalname = "CC_ESTADO_"+sGXsfl_55_fel_idx ;
      edtCC_MemCant_Internalname = "CC_MEMCANT_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1381213( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551213( ) ;
      sendRow1381213( ) ;
   }

   public void sendRow1381213( )
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
         if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1213_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1213_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1213_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1213), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1213), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1213_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1213_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_AlmCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_AlmCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_AlmCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_AlmCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_AlmDsc_Internalname,GXutil.rtrim( A8909CC_AlmDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_AlmDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_AlmDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_ExiTeoC_Internalname,GXutil.ltrim( localUtil.ntoc( A8919CC_ExiTeoC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_ExiTeoC_Enabled!=0) ? localUtil.format( A8919CC_ExiTeoC, "ZZZZZZ9.9999") : localUtil.format( A8919CC_ExiTeoC, "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_ExiTeoC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_ExiTeoC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1213_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_ExiReaC_Internalname,GXutil.ltrim( localUtil.ntoc( A8920CC_ExiReaC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_ExiReaC_Enabled!=0) ? localUtil.format( A8920CC_ExiReaC, "ZZZZZZ9.9999") : localUtil.format( A8920CC_ExiReaC, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_ExiReaC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_ExiReaC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1213_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Estado_Internalname,GXutil.ltrim( localUtil.ntoc( A8923CC_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_Estado_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8923CC_Estado), "9") : localUtil.format( DecimalUtil.doubleToDec(A8923CC_Estado), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Estado_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Estado_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1213_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_MemCant_Internalname,GXutil.ltrim( localUtil.ntoc( A11625CC_MemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_MemCant_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11625CC_MemCant), "9") : localUtil.format( DecimalUtil.doubleToDec(A11625CC_MemCant), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_MemCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_MemCant_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1381213( ) ;
      GXCCtl = "Z8908CC_AlmCod_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8919CC_ExiTeoC_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8919CC_ExiTeoC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8920CC_ExiReaC_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8920CC_ExiReaC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8923CC_Estado_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8923CC_Estado, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11625CC_MemCant_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11625CC_MemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1213_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1213_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1213_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1213, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1213_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1213_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMCOD_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMDSC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_EXITEOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiTeoC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_EXIREAC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiReaC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ESTADO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Estado_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_MEMCANT_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_MemCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1381213( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551213( ) ;
      edtavnRcdDeleted_1213_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1213_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_AlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCOD_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_AlmDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMDSC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_ExiTeoC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_EXITEOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_ExiReaC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_EXIREAC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Estado_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ESTADO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_MemCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_MEMCANT_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1213_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1213_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1213");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1213_Internalname ;
         wbErr = true ;
         nRcdDeleted_1213 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1213 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1213_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A8908CC_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A8909CC_AlmDsc = httpContext.cgiGet( edtCC_AlmDsc_Internalname) ;
      n8909CC_AlmDsc = false ;
      A8919CC_ExiTeoC = localUtil.ctond( httpContext.cgiGet( edtCC_ExiTeoC_Internalname)) ;
      n8919CC_ExiTeoC = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCC_ExiReaC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCC_ExiReaC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "CC_EXIREAC_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_ExiReaC_Internalname ;
         wbErr = true ;
         A8920CC_ExiReaC = DecimalUtil.ZERO ;
         n8920CC_ExiReaC = false ;
      }
      else
      {
         A8920CC_ExiReaC = localUtil.ctond( httpContext.cgiGet( edtCC_ExiReaC_Internalname)) ;
         n8920CC_ExiReaC = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Estado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Estado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "CC_ESTADO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Estado_Internalname ;
         wbErr = true ;
         A8923CC_Estado = (byte)(0) ;
         n8923CC_Estado = false ;
      }
      else
      {
         A8923CC_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_Estado_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8923CC_Estado = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_MemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_MemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "CC_MEMCANT_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_MemCant_Internalname ;
         wbErr = true ;
         A11625CC_MemCant = (byte)(0) ;
         n11625CC_MemCant = false ;
      }
      else
      {
         A11625CC_MemCant = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_MemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n11625CC_MemCant = false ;
      }
      GXCCtl = "Z8908CC_AlmCod_" + sGXsfl_55_idx ;
      Z8908CC_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8919CC_ExiTeoC_" + sGXsfl_55_idx ;
      Z8919CC_ExiTeoC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8920CC_ExiReaC_" + sGXsfl_55_idx ;
      Z8920CC_ExiReaC = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8923CC_Estado_" + sGXsfl_55_idx ;
      Z8923CC_Estado = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11625CC_MemCant_" + sGXsfl_55_idx ;
      Z11625CC_MemCant = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1213_" + sGXsfl_55_idx ;
      nRcdDeleted_1213 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1213_" + sGXsfl_55_idx ;
      nRcdExists_1213 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1213_" + sGXsfl_55_idx ;
      nIsMod_1213 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCC_ExiTeoC_Enabled = edtCC_ExiTeoC_Enabled ;
      defedtCC_AlmCod_Enabled = edtCC_AlmCod_Enabled ;
   }

   public void confirmValues1380( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551213( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551213( ) ;
         httpContext.changePostValue( "Z8908CC_AlmCod_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8919CC_ExiTeoC_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8919CC_ExiTeoC_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8919CC_ExiTeoC_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8920CC_ExiReaC_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8920CC_ExiReaC_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8920CC_ExiReaC_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z8923CC_Estado_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z8923CC_Estado_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8923CC_Estado_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z11625CC_MemCant_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z11625CC_MemCant_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11625CC_MemCant_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.trecalm", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.formatDateParm(A810RecFec))}, new String[] {"EmprCod","PrdNum","RecFec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z810RecFec", localUtil.dtoc( Z810RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z808RecExiTcc", GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z806RecExiRcc", GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV32Pgmname));
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
      return formatLink("app.trecalm", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.formatDateParm(A810RecFec))}, new String[] {"EmprCod","PrdNum","RecFec"})  ;
   }

   public String getPgmname( )
   {
      return "TRECALM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "RECUENTOS POR ALMACEN", "") ;
   }

   public void initializeNonKey13898( )
   {
      A808RecExiTcc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrimstr( A808RecExiTcc, 12, 4));
      A806RecExiRcc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrimstr( A806RecExiRcc, 12, 4));
      Z808RecExiTcc = DecimalUtil.ZERO ;
      Z806RecExiRcc = DecimalUtil.ZERO ;
   }

   public void initAll13898( )
   {
      initializeNonKey13898( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1381213( )
   {
      A8909CC_AlmDsc = "" ;
      n8909CC_AlmDsc = false ;
      A8919CC_ExiTeoC = DecimalUtil.ZERO ;
      n8919CC_ExiTeoC = false ;
      A8920CC_ExiReaC = DecimalUtil.ZERO ;
      n8920CC_ExiReaC = false ;
      A8923CC_Estado = (byte)(0) ;
      n8923CC_Estado = false ;
      A11625CC_MemCant = (byte)(0) ;
      n11625CC_MemCant = false ;
      Z8919CC_ExiTeoC = DecimalUtil.ZERO ;
      Z8920CC_ExiReaC = DecimalUtil.ZERO ;
      Z8923CC_Estado = (byte)(0) ;
      Z11625CC_MemCant = (byte)(0) ;
   }

   public void initAll1381213( )
   {
      A8908CC_AlmCod = (byte)(0) ;
      initializeNonKey1381213( ) ;
   }

   public void standaloneModalInsert1381213( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026824154586", true, true);
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
      httpContext.AddJavascriptSource("trecalm.js", "?2026824154586", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1213( )
   {
      edtCC_ExiTeoC_Enabled = defedtCC_ExiTeoC_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_ExiTeoC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_ExiTeoC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtCC_AlmCod_Enabled = defedtCC_AlmCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1213, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1213_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8909CC_AlmDsc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8919CC_ExiTeoC, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiTeoC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8920CC_ExiReaC, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_ExiReaC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8923CC_Estado, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Estado_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11625CC_MemCant, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_MemCant_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdNum_Internalname = "PRDNUM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtRecFec_Internalname = "RECFEC" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtRecExiTcc_Internalname = "RECEXITCC" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtRecExiRcc_Internalname = "RECEXIRCC" ;
      edtavnRcdDeleted_1213_Internalname = "vNRCDDELETED_1213" ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD" ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC" ;
      edtCC_ExiTeoC_Internalname = "CC_EXITEOC" ;
      edtCC_ExiReaC_Internalname = "CC_EXIREAC" ;
      edtCC_Estado_Internalname = "CC_ESTADO" ;
      edtCC_MemCant_Internalname = "CC_MEMCANT" ;
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
      Form.setCaption( httpContext.getMessage( "RECUENTOS POR ALMACEN", "") );
      edtCC_MemCant_Jsonclick = "" ;
      edtCC_Estado_Jsonclick = "" ;
      edtCC_ExiReaC_Jsonclick = "" ;
      edtCC_ExiTeoC_Jsonclick = "" ;
      edtCC_AlmDsc_Jsonclick = "" ;
      edtCC_AlmCod_Jsonclick = "" ;
      edtavnRcdDeleted_1213_Jsonclick = "" ;
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
      edtCC_MemCant_Enabled = 1 ;
      edtCC_Estado_Enabled = 1 ;
      edtCC_ExiReaC_Enabled = 1 ;
      edtCC_ExiTeoC_Enabled = 0 ;
      edtCC_AlmDsc_Enabled = 0 ;
      edtCC_AlmCod_Enabled = 0 ;
      edtavnRcdDeleted_1213_Enabled = 1 ;
      edtRecExiRcc_Jsonclick = "" ;
      edtRecExiRcc_Backcolor = (int)(0xFFFFFF) ;
      edtRecExiRcc_Enabled = 1 ;
      edtRecExiTcc_Jsonclick = "" ;
      edtRecExiTcc_Backcolor = (int)(0xFFFFFF) ;
      edtRecExiTcc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtRecFec_Jsonclick = "" ;
      edtRecFec_Backcolor = (int)(0xFFFFFF) ;
      edtRecFec_Enabled = 0 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 0 ;
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
      subsflControlProps_551213( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1381213( ) ;
         standaloneModal1381213( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1381213( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551213( ) ;
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
      /* Using cursor T013827 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T013827_A407EmprNom[0] ;
      n407EmprNom = T013827_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T013828 */
      pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
      }
      A718PrdNom = T013828_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(26);
      GX_FocusControl = edtRecExiTcc_Internalname ;
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

   public void valid_Recfec( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A808RecExiTcc", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A806RecExiRcc", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z810RecFec", localUtil.format(Z810RecFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z808RecExiTcc", GXutil.ltrim( localUtil.ntoc( Z808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z806RecExiRcc", GXutil.ltrim( localUtil.ntoc( Z806RecExiRcc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cc_almcod( )
   {
      n8909CC_AlmDsc = false ;
      /* Using cursor T013825 */
      pr_default.execute(23, new Object[] {A396EmprCod, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CC_ALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
      }
      A8909CC_AlmDsc = T013825_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T013825_n8909CC_AlmDsc[0] ;
      pr_default.close(23);
      /* Using cursor T013829 */
      pr_default.execute(27, new Object[] {A396EmprCod, A719PrdNum, Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRDALMC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CC_ALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8909CC_AlmDsc", GXutil.rtrim( A8909CC_AlmDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_RECFEC","{handler:'valid_Recfec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A810RecFec',fld:'RECFEC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECFEC",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999'},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z810RecFec'},{av:'Z407EmprNom'},{av:'Z718PrdNom'},{av:'Z808RecExiTcc'},{av:'Z806RecExiRcc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CC_ALMCOD","{handler:'valid_Cc_almcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8908CC_AlmCod',fld:'CC_ALMCOD',pic:'Z9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A8909CC_AlmDsc',fld:'CC_ALMDSC',pic:''}]");
      setEventMetadata("VALID_CC_ALMCOD",",oparms:[{av:'A8909CC_AlmDsc',fld:'CC_ALMDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cc_memcant',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(27);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOA719PrdNum = "" ;
      wcpOA810RecFec = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z810RecFec = GXutil.nullDate() ;
      Z808RecExiTcc = DecimalUtil.ZERO ;
      Z806RecExiRcc = DecimalUtil.ZERO ;
      Z8919CC_ExiTeoC = DecimalUtil.ZERO ;
      Z8920CC_ExiReaC = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A810RecFec = GXutil.nullDate() ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A718PrdNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      lblTextblock7_Jsonclick = "" ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1213 = "" ;
      Gx_mode = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV32Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode98 = "" ;
      A8909CC_AlmDsc = "" ;
      A8919CC_ExiTeoC = DecimalUtil.ZERO ;
      A8920CC_ExiReaC = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      T01388_A407EmprNom = new String[] {""} ;
      T01388_n407EmprNom = new boolean[] {false} ;
      T01389_A718PrdNom = new String[] {""} ;
      T013810_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013810_A407EmprNom = new String[] {""} ;
      T013810_n407EmprNom = new boolean[] {false} ;
      T013810_A718PrdNom = new String[] {""} ;
      T013810_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013810_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013810_A396EmprCod = new String[] {""} ;
      T013810_A719PrdNum = new String[] {""} ;
      T013811_A396EmprCod = new String[] {""} ;
      T013811_A719PrdNum = new String[] {""} ;
      T013811_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01387_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01387_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01387_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01387_A396EmprCod = new String[] {""} ;
      T01387_A719PrdNum = new String[] {""} ;
      T013812_A396EmprCod = new String[] {""} ;
      T013812_A719PrdNum = new String[] {""} ;
      T013812_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013813_A396EmprCod = new String[] {""} ;
      T013813_A719PrdNum = new String[] {""} ;
      T013813_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01386_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01386_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01386_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01386_A396EmprCod = new String[] {""} ;
      T01386_A719PrdNum = new String[] {""} ;
      T013817_A396EmprCod = new String[] {""} ;
      T013817_A719PrdNum = new String[] {""} ;
      T013817_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      Z8909CC_AlmDsc = "" ;
      T013818_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013818_A8909CC_AlmDsc = new String[] {""} ;
      T013818_n8909CC_AlmDsc = new boolean[] {false} ;
      T013818_A8919CC_ExiTeoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013818_n8919CC_ExiTeoC = new boolean[] {false} ;
      T013818_A8920CC_ExiReaC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013818_n8920CC_ExiReaC = new boolean[] {false} ;
      T013818_A8923CC_Estado = new byte[1] ;
      T013818_n8923CC_Estado = new boolean[] {false} ;
      T013818_A11625CC_MemCant = new byte[1] ;
      T013818_n11625CC_MemCant = new boolean[] {false} ;
      T013818_A396EmprCod = new String[] {""} ;
      T013818_A8908CC_AlmCod = new byte[1] ;
      T013818_A719PrdNum = new String[] {""} ;
      T01384_A8909CC_AlmDsc = new String[] {""} ;
      T01384_n8909CC_AlmDsc = new boolean[] {false} ;
      GXCCtl = "" ;
      T01385_A396EmprCod = new String[] {""} ;
      T013819_A8909CC_AlmDsc = new String[] {""} ;
      T013819_n8909CC_AlmDsc = new boolean[] {false} ;
      T013820_A396EmprCod = new String[] {""} ;
      T013821_A396EmprCod = new String[] {""} ;
      T013821_A719PrdNum = new String[] {""} ;
      T013821_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013821_A8908CC_AlmCod = new byte[1] ;
      T01383_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01383_A8919CC_ExiTeoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01383_n8919CC_ExiTeoC = new boolean[] {false} ;
      T01383_A8920CC_ExiReaC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01383_n8920CC_ExiReaC = new boolean[] {false} ;
      T01383_A8923CC_Estado = new byte[1] ;
      T01383_n8923CC_Estado = new boolean[] {false} ;
      T01383_A11625CC_MemCant = new byte[1] ;
      T01383_n11625CC_MemCant = new boolean[] {false} ;
      T01383_A396EmprCod = new String[] {""} ;
      T01383_A8908CC_AlmCod = new byte[1] ;
      T01383_A719PrdNum = new String[] {""} ;
      T01382_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01382_A8919CC_ExiTeoC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01382_n8919CC_ExiTeoC = new boolean[] {false} ;
      T01382_A8920CC_ExiReaC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01382_n8920CC_ExiReaC = new boolean[] {false} ;
      T01382_A8923CC_Estado = new byte[1] ;
      T01382_n8923CC_Estado = new boolean[] {false} ;
      T01382_A11625CC_MemCant = new byte[1] ;
      T01382_n11625CC_MemCant = new boolean[] {false} ;
      T01382_A396EmprCod = new String[] {""} ;
      T01382_A8908CC_AlmCod = new byte[1] ;
      T01382_A719PrdNum = new String[] {""} ;
      T013825_A8909CC_AlmDsc = new String[] {""} ;
      T013825_n8909CC_AlmDsc = new boolean[] {false} ;
      T013826_A396EmprCod = new String[] {""} ;
      T013826_A719PrdNum = new String[] {""} ;
      T013826_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013826_A8908CC_AlmCod = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T013827_A407EmprNom = new String[] {""} ;
      T013827_n407EmprNom = new boolean[] {false} ;
      T013828_A718PrdNom = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ810RecFec = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ718PrdNom = "" ;
      ZZ808RecExiTcc = DecimalUtil.ZERO ;
      ZZ806RecExiRcc = DecimalUtil.ZERO ;
      T013829_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trecalm__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trecalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trecalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trecalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trecalm__default(),
         new Object[] {
             new Object[] {
            T01382_A810RecFec, T01382_A8919CC_ExiTeoC, T01382_n8919CC_ExiTeoC, T01382_A8920CC_ExiReaC, T01382_n8920CC_ExiReaC, T01382_A8923CC_Estado, T01382_n8923CC_Estado, T01382_A11625CC_MemCant, T01382_n11625CC_MemCant, T01382_A396EmprCod,
            T01382_A8908CC_AlmCod, T01382_A719PrdNum
            }
            , new Object[] {
            T01383_A810RecFec, T01383_A8919CC_ExiTeoC, T01383_n8919CC_ExiTeoC, T01383_A8920CC_ExiReaC, T01383_n8920CC_ExiReaC, T01383_A8923CC_Estado, T01383_n8923CC_Estado, T01383_A11625CC_MemCant, T01383_n11625CC_MemCant, T01383_A396EmprCod,
            T01383_A8908CC_AlmCod, T01383_A719PrdNum
            }
            , new Object[] {
            T01384_A8909CC_AlmDsc, T01384_n8909CC_AlmDsc
            }
            , new Object[] {
            T01385_A396EmprCod
            }
            , new Object[] {
            T01386_A810RecFec, T01386_A808RecExiTcc, T01386_A806RecExiRcc, T01386_A396EmprCod, T01386_A719PrdNum
            }
            , new Object[] {
            T01387_A810RecFec, T01387_A808RecExiTcc, T01387_A806RecExiRcc, T01387_A396EmprCod, T01387_A719PrdNum
            }
            , new Object[] {
            T01388_A407EmprNom, T01388_n407EmprNom
            }
            , new Object[] {
            T01389_A718PrdNom
            }
            , new Object[] {
            T013810_A810RecFec, T013810_A407EmprNom, T013810_n407EmprNom, T013810_A718PrdNom, T013810_A808RecExiTcc, T013810_A806RecExiRcc, T013810_A396EmprCod, T013810_A719PrdNum
            }
            , new Object[] {
            T013811_A396EmprCod, T013811_A719PrdNum, T013811_A810RecFec
            }
            , new Object[] {
            T013812_A396EmprCod, T013812_A719PrdNum, T013812_A810RecFec
            }
            , new Object[] {
            T013813_A396EmprCod, T013813_A719PrdNum, T013813_A810RecFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013817_A396EmprCod, T013817_A719PrdNum, T013817_A810RecFec
            }
            , new Object[] {
            T013818_A810RecFec, T013818_A8909CC_AlmDsc, T013818_n8909CC_AlmDsc, T013818_A8919CC_ExiTeoC, T013818_n8919CC_ExiTeoC, T013818_A8920CC_ExiReaC, T013818_n8920CC_ExiReaC, T013818_A8923CC_Estado, T013818_n8923CC_Estado, T013818_A11625CC_MemCant,
            T013818_n11625CC_MemCant, T013818_A396EmprCod, T013818_A8908CC_AlmCod, T013818_A719PrdNum
            }
            , new Object[] {
            T013819_A8909CC_AlmDsc, T013819_n8909CC_AlmDsc
            }
            , new Object[] {
            T013820_A396EmprCod
            }
            , new Object[] {
            T013821_A396EmprCod, T013821_A719PrdNum, T013821_A810RecFec, T013821_A8908CC_AlmCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013825_A8909CC_AlmDsc, T013825_n8909CC_AlmDsc
            }
            , new Object[] {
            T013826_A396EmprCod, T013826_A719PrdNum, T013826_A810RecFec, T013826_A8908CC_AlmCod
            }
            , new Object[] {
            T013827_A407EmprNom, T013827_n407EmprNom
            }
            , new Object[] {
            T013828_A718PrdNom
            }
            , new Object[] {
            T013829_A396EmprCod
            }
         }
      );
      Z810RecFec = GXutil.nullDate() ;
      A810RecFec = GXutil.nullDate() ;
      Z719PrdNum = "" ;
      A719PrdNum = "" ;
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TRECALM" ;
   }

   private byte Z8908CC_AlmCod ;
   private byte Z8923CC_Estado ;
   private byte Z11625CC_MemCant ;
   private byte GxWebError ;
   private byte A8908CC_AlmCod ;
   private byte nKeyPressed ;
   private byte A8923CC_Estado ;
   private byte A11625CC_MemCant ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1213 ;
   private short nRcdExists_1213 ;
   private short nIsMod_1213 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1213 ;
   private short RcdFound1213 ;
   private short nBlankRcdUsr1213 ;
   private short RcdFound98 ;
   private short nIsDirty_98 ;
   private short nIsDirty_1213 ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtRecFec_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtRecExiTcc_Enabled ;
   private int edtRecExiRcc_Enabled ;
   private int edtavnRcdDeleted_1213_Enabled ;
   private int edtCC_AlmCod_Enabled ;
   private int edtCC_AlmDsc_Enabled ;
   private int edtCC_ExiTeoC_Enabled ;
   private int edtCC_ExiReaC_Enabled ;
   private int edtCC_Estado_Enabled ;
   private int edtCC_MemCant_Enabled ;
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
   private int defedtCC_ExiTeoC_Enabled ;
   private int defedtCC_AlmCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtRecExiRcc_Backcolor ;
   private int edtRecExiTcc_Backcolor ;
   private int edtRecFec_Backcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z808RecExiTcc ;
   private java.math.BigDecimal Z806RecExiRcc ;
   private java.math.BigDecimal Z8919CC_ExiTeoC ;
   private java.math.BigDecimal Z8920CC_ExiReaC ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A8919CC_ExiTeoC ;
   private java.math.BigDecimal A8920CC_ExiReaC ;
   private java.math.BigDecimal ZZ808RecExiTcc ;
   private java.math.BigDecimal ZZ806RecExiRcc ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOA719PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRecExiTcc_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtRecFec_Internalname ;
   private String edtRecFec_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtRecExiTcc_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtRecExiRcc_Internalname ;
   private String edtRecExiRcc_Jsonclick ;
   private String sMode1213 ;
   private String Gx_mode ;
   private String edtavnRcdDeleted_1213_Internalname ;
   private String edtCC_AlmCod_Internalname ;
   private String edtCC_AlmDsc_Internalname ;
   private String edtCC_ExiTeoC_Internalname ;
   private String edtCC_ExiReaC_Internalname ;
   private String edtCC_Estado_Internalname ;
   private String edtCC_MemCant_Internalname ;
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
   private String AV32Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode98 ;
   private String A8909CC_AlmDsc ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z8909CC_AlmDsc ;
   private String GXCCtl ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1213_Jsonclick ;
   private String edtCC_AlmCod_Jsonclick ;
   private String edtCC_AlmDsc_Jsonclick ;
   private String edtCC_ExiTeoC_Jsonclick ;
   private String edtCC_ExiReaC_Jsonclick ;
   private String edtCC_Estado_Jsonclick ;
   private String edtCC_MemCant_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ407EmprNom ;
   private String ZZ718PrdNom ;
   private java.util.Date wcpOA810RecFec ;
   private java.util.Date Z810RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date ZZ810RecFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n8909CC_AlmDsc ;
   private boolean n8919CC_ExiTeoC ;
   private boolean n8920CC_ExiReaC ;
   private boolean n8923CC_Estado ;
   private boolean n11625CC_MemCant ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01388_A407EmprNom ;
   private boolean[] T01388_n407EmprNom ;
   private String[] T01389_A718PrdNom ;
   private java.util.Date[] T013810_A810RecFec ;
   private String[] T013810_A407EmprNom ;
   private boolean[] T013810_n407EmprNom ;
   private String[] T013810_A718PrdNom ;
   private java.math.BigDecimal[] T013810_A808RecExiTcc ;
   private java.math.BigDecimal[] T013810_A806RecExiRcc ;
   private String[] T013810_A396EmprCod ;
   private String[] T013810_A719PrdNum ;
   private String[] T013811_A396EmprCod ;
   private String[] T013811_A719PrdNum ;
   private java.util.Date[] T013811_A810RecFec ;
   private java.util.Date[] T01387_A810RecFec ;
   private java.math.BigDecimal[] T01387_A808RecExiTcc ;
   private java.math.BigDecimal[] T01387_A806RecExiRcc ;
   private String[] T01387_A396EmprCod ;
   private String[] T01387_A719PrdNum ;
   private String[] T013812_A396EmprCod ;
   private String[] T013812_A719PrdNum ;
   private java.util.Date[] T013812_A810RecFec ;
   private String[] T013813_A396EmprCod ;
   private String[] T013813_A719PrdNum ;
   private java.util.Date[] T013813_A810RecFec ;
   private java.util.Date[] T01386_A810RecFec ;
   private java.math.BigDecimal[] T01386_A808RecExiTcc ;
   private java.math.BigDecimal[] T01386_A806RecExiRcc ;
   private String[] T01386_A396EmprCod ;
   private String[] T01386_A719PrdNum ;
   private String[] T013817_A396EmprCod ;
   private String[] T013817_A719PrdNum ;
   private java.util.Date[] T013817_A810RecFec ;
   private java.util.Date[] T013818_A810RecFec ;
   private String[] T013818_A8909CC_AlmDsc ;
   private boolean[] T013818_n8909CC_AlmDsc ;
   private java.math.BigDecimal[] T013818_A8919CC_ExiTeoC ;
   private boolean[] T013818_n8919CC_ExiTeoC ;
   private java.math.BigDecimal[] T013818_A8920CC_ExiReaC ;
   private boolean[] T013818_n8920CC_ExiReaC ;
   private byte[] T013818_A8923CC_Estado ;
   private boolean[] T013818_n8923CC_Estado ;
   private byte[] T013818_A11625CC_MemCant ;
   private boolean[] T013818_n11625CC_MemCant ;
   private String[] T013818_A396EmprCod ;
   private byte[] T013818_A8908CC_AlmCod ;
   private String[] T013818_A719PrdNum ;
   private String[] T01384_A8909CC_AlmDsc ;
   private boolean[] T01384_n8909CC_AlmDsc ;
   private String[] T01385_A396EmprCod ;
   private String[] T013819_A8909CC_AlmDsc ;
   private boolean[] T013819_n8909CC_AlmDsc ;
   private String[] T013820_A396EmprCod ;
   private String[] T013821_A396EmprCod ;
   private String[] T013821_A719PrdNum ;
   private java.util.Date[] T013821_A810RecFec ;
   private byte[] T013821_A8908CC_AlmCod ;
   private java.util.Date[] T01383_A810RecFec ;
   private java.math.BigDecimal[] T01383_A8919CC_ExiTeoC ;
   private boolean[] T01383_n8919CC_ExiTeoC ;
   private java.math.BigDecimal[] T01383_A8920CC_ExiReaC ;
   private boolean[] T01383_n8920CC_ExiReaC ;
   private byte[] T01383_A8923CC_Estado ;
   private boolean[] T01383_n8923CC_Estado ;
   private byte[] T01383_A11625CC_MemCant ;
   private boolean[] T01383_n11625CC_MemCant ;
   private String[] T01383_A396EmprCod ;
   private byte[] T01383_A8908CC_AlmCod ;
   private String[] T01383_A719PrdNum ;
   private java.util.Date[] T01382_A810RecFec ;
   private java.math.BigDecimal[] T01382_A8919CC_ExiTeoC ;
   private boolean[] T01382_n8919CC_ExiTeoC ;
   private java.math.BigDecimal[] T01382_A8920CC_ExiReaC ;
   private boolean[] T01382_n8920CC_ExiReaC ;
   private byte[] T01382_A8923CC_Estado ;
   private boolean[] T01382_n8923CC_Estado ;
   private byte[] T01382_A11625CC_MemCant ;
   private boolean[] T01382_n11625CC_MemCant ;
   private String[] T01382_A396EmprCod ;
   private byte[] T01382_A8908CC_AlmCod ;
   private String[] T01382_A719PrdNum ;
   private String[] T013825_A8909CC_AlmDsc ;
   private boolean[] T013825_n8909CC_AlmDsc ;
   private String[] T013826_A396EmprCod ;
   private String[] T013826_A719PrdNum ;
   private java.util.Date[] T013826_A810RecFec ;
   private byte[] T013826_A8908CC_AlmCod ;
   private String[] T013827_A407EmprNom ;
   private boolean[] T013827_n407EmprNom ;
   private String[] T013828_A718PrdNom ;
   private String[] T013829_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class trecalm__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trecalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01382", "SELECT RecFec, CC_ExiTeoC, CC_ExiReaC, CC_Estado, CC_MemCant, EmprCod, CC_AlmCod, PrdNum FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ?  FOR UPDATE OF CC_ExiTeoC, CC_ExiReaC, CC_Estado, CC_MemCant NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01383", "SELECT RecFec, CC_ExiTeoC, CC_ExiReaC, CC_Estado, CC_MemCant, EmprCod, CC_AlmCod, PrdNum FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01384", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01385", "SELECT EmprCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01386", "SELECT RecFec, RecExiTcc, RecExiRcc, EmprCod, PrdNum FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?  FOR UPDATE OF RecExiTcc, RecExiRcc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01387", "SELECT RecFec, RecExiTcc, RecExiRcc, EmprCod, PrdNum FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01388", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01389", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013810", "SELECT /*+ FIRST_ROWS(1) */ TM1.RecFec, T2.EmprNom, T3.PrdNom, TM1.RecExiTcc, TM1.RecExiRcc, TM1.EmprCod, TM1.PrdNum FROM ((TXPRECUEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.RecFec = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.RecFec ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013811", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013812", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013813", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod DESC, PrdNum DESC, RecFec DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013814", "INSERT INTO TXPRECUEN(RecFec, RecExiTcc, RecExiRcc, EmprCod, PrdNum, RecExiTeo, RecExiRea, RecPreRec, RecExiTAc, RecExiRAc, RecUbic, RecMemCant, RecLot, RecEstInv, Rechora) VALUES(?, ?, ?, ?, ?, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPRECUEN")
         ,new UpdateCursor("T013815", "UPDATE TXPRECUEN SET RecExiTcc=?, RecExiRcc=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK, "TXPRECUEN")
         ,new UpdateCursor("T013816", "DELETE FROM TXPRECUEN  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ?", GX_NOMASK, "TXPRECUEN")
         ,new ForEachCursor("T013817", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013818", "SELECT T1.RecFec, T2.CC_AlmDsc, T1.CC_ExiTeoC, T1.CC_ExiReaC, T1.CC_Estado, T1.CC_MemCant, T1.EmprCod, T1.CC_AlmCod, T1.PrdNum FROM (TXPRECALM T1 INNER JOIN TXPALMCCS T2 ON T2.EmprCod = T1.EmprCod AND T2.CC_AlmCod = T1.CC_AlmCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.RecFec = ? and T1.CC_AlmCod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec, T1.CC_AlmCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013819", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013820", "SELECT EmprCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013821", "SELECT EmprCod, PrdNum, RecFec, CC_AlmCod FROM TXPRECALM WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013822", "INSERT INTO TXPRECALM(RecFec, CC_ExiTeoC, CC_ExiReaC, CC_Estado, CC_MemCant, EmprCod, CC_AlmCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECALM")
         ,new UpdateCursor("T013823", "UPDATE TXPRECALM SET CC_ExiTeoC=?, CC_ExiReaC=?, CC_Estado=?, CC_MemCant=?  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ?", GX_NOMASK, "TXPRECALM")
         ,new UpdateCursor("T013824", "DELETE FROM TXPRECALM  WHERE EmprCod = ? AND PrdNum = ? AND RecFec = ? AND CC_AlmCod = ?", GX_NOMASK, "TXPRECALM")
         ,new ForEachCursor("T013825", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013826", "SELECT EmprCod, PrdNum, RecFec, CC_AlmCod FROM TXPRECALM WHERE EmprCod = ? and PrdNum = ? and RecFec = ? ORDER BY EmprCod, PrdNum, RecFec, CC_AlmCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013827", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013828", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013829", "SELECT EmprCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((String[]) buf[11])[0] = rslt.getString(8, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 8 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[6])[0] = rslt.getString(6, 3);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 16 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 3);
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((String[]) buf[13])[0] = rslt.getString(9, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 27 :
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 13 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 4);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 4);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 20 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 4);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 4);
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
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[8]).byteValue());
               }
               stmt.setString(6, (String)parms[9], 3);
               stmt.setByte(7, ((Number) parms[10]).byteValue());
               stmt.setString(8, (String)parms[11], 6);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 4);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 4);
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
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(4, ((Number) parms[7]).byteValue());
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setString(6, (String)parms[9], 6);
               stmt.setDate(7, (java.util.Date)parms[10]);
               stmt.setByte(8, ((Number) parms[11]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

