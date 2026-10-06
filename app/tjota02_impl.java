package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tjota02_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A10243Jt_codigo = (short)(GXutil.lval( httpContext.GetPar( "Jt_codigo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A10243Jt_codigo) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA REBAJES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtJt_codigo_Internalname ;
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

   public tjota02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tjota02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tjota02_impl.class ));
   }

   public tjota02_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TJOTA02.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo deposito", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJt_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A10243Jt_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtJt_codigo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10243Jt_codigo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10243Jt_codigo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJt_codigo_Jsonclick, 0, "", "", "", "", "", 1, edtJt_codigo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtJt_Desc_Internalname, GXutil.rtrim( A10244Jt_Desc), GXutil.rtrim( localUtil.format( A10244Jt_Desc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJt_Desc_Jsonclick, 0, "", "", "", "", "", 1, edtJt_Desc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Dia rebaje", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TJOTA02.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtJt_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtJt_Dia_Internalname, localUtil.format(A10249Jt_Dia, "99/99/99"), localUtil.format( A10249Jt_Dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtJt_Dia_Jsonclick, 0, "", "", "", "", "", 1, edtJt_Dia_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TJOTA02.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtJt_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtJt_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TJOTA02.htm");
      httpContext.writeTextNL( "</div>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
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
         nBlankRcdCount1391 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1391 = (short)(1) ;
            scanStart17K1391( ) ;
            while ( RcdFound1391 != 0 )
            {
               init_level_properties1391( ) ;
               getByPrimaryKey17K1391( ) ;
               addRow17K1391( ) ;
               scanNext17K1391( ) ;
            }
            scanEnd17K1391( ) ;
            nBlankRcdCount1391 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal17K1391( ) ;
         standaloneModal17K1391( ) ;
         sMode1391 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow17K1391( ) ;
            edtavnRcdDeleted_1391_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1391_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1391_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1391_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_LINEA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_linea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_prd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_PRD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_prd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_prd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_PrdD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_PRDD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_PrdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_PrdD_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_MnCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_MNCANT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_MnCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_MnCant_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_CANT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Cant_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtJt_CantA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_CANTA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtJt_CantA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_CantA_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1391 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal17K1391( ) ;
            }
            sendRow17K1391( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1391 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1391 = (short)(5) ;
         nRcdExists_1391 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart17K1391( ) ;
            while ( RcdFound1391 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451391( ) ;
               init_level_properties1391( ) ;
               standaloneNotModal17K1391( ) ;
               getByPrimaryKey17K1391( ) ;
               standaloneModal17K1391( ) ;
               addRow17K1391( ) ;
               scanNext17K1391( ) ;
            }
            scanEnd17K1391( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1391 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451391( ) ;
      initAll17K1391( ) ;
      init_level_properties1391( ) ;
      nRcdExists_1391 = (short)(0) ;
      nIsMod_1391 = (short)(0) ;
      nRcdDeleted_1391 = (short)(0) ;
      nBlankRcdCount1391 = (short)(nBlankRcdUsr1391+nBlankRcdCount1391) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1391 > 0 )
      {
         standaloneNotModal17K1391( ) ;
         standaloneModal17K1391( ) ;
         addRow17K1391( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtJt_linea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1391 = (short)(nBlankRcdCount1391-1) ;
      }
      Gx_mode = sMode1391 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TJOTA02.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TJOTA02.htm");
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
      e1117K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10243Jt_codigo = (short)(localUtil.ctol( httpContext.cgiGet( "Z10243Jt_codigo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10249Jt_Dia = localUtil.ctod( httpContext.cgiGet( "Z10249Jt_Dia"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "JT_CODIGO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10243Jt_codigo = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            }
            else
            {
               A10243Jt_codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtJt_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            }
            A10244Jt_Desc = httpContext.cgiGet( edtJt_Desc_Internalname) ;
            n10244Jt_Desc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
            if ( localUtil.vcdate( httpContext.cgiGet( edtJt_Dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "JT_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtJt_Dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10249Jt_Dia = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
            }
            else
            {
               A10249Jt_Dia = localUtil.ctod( httpContext.cgiGet( edtJt_Dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
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
               A10243Jt_codigo = (short)(GXutil.lval( httpContext.GetPar( "Jt_codigo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
               A10249Jt_Dia = localUtil.parseDateParm( httpContext.GetPar( "Jt_Dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
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
                        e1117K2 ();
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
            initAll17K1390( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1391_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1391_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes17K1390( ) ;
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

   public void confirm_17K0( )
   {
      beforeValidate17K1390( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls17K1390( ) ;
         }
         else
         {
            checkExtendedTable17K1390( ) ;
            if ( AnyError == 0 )
            {
               zm17K1390( 4) ;
               zm17K1390( 5) ;
            }
            closeExtendedTableCursors17K1390( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1390 = Gx_mode ;
         confirm_17K1391( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1390 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1390 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues17K0( ) ;
      }
   }

   public void confirm_17K1391( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow17K1391( ) ;
         if ( ( nRcdExists_1391 != 0 ) || ( nIsMod_1391 != 0 ) )
         {
            getKey17K1391( ) ;
            if ( ( nRcdExists_1391 == 0 ) && ( nRcdDeleted_1391 == 0 ) )
            {
               if ( RcdFound1391 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate17K1391( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable17K1391( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors17K1391( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "JT_LINEA_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtJt_linea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1391 != 0 )
               {
                  if ( nRcdDeleted_1391 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey17K1391( ) ;
                     load17K1391( ) ;
                     beforeValidate17K1391( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls17K1391( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1391 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate17K1391( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable17K1391( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors17K1391( ) ;
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
                  if ( nRcdDeleted_1391 == 0 )
                  {
                     GXCCtl = "JT_LINEA_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtJt_linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1391_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10250Jt_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_prd_Internalname, GXutil.rtrim( A10251Jt_prd)) ;
         httpContext.changePostValue( edtJt_PrdD_Internalname, GXutil.rtrim( A10252Jt_PrdD)) ;
         httpContext.changePostValue( edtJt_MnCant_Internalname, GXutil.ltrim( localUtil.ntoc( A10253Jt_MnCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10254Jt_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_CantA_Internalname, GXutil.ltrim( localUtil.ntoc( A10255Jt_CantA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10250Jt_linea_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10250Jt_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10251Jt_prd_"+sGXsfl_45_idx, GXutil.rtrim( Z10251Jt_prd)) ;
         httpContext.changePostValue( "ZT_"+"Z10252Jt_PrdD_"+sGXsfl_45_idx, GXutil.rtrim( Z10252Jt_PrdD)) ;
         httpContext.changePostValue( "ZT_"+"Z10253Jt_MnCant_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10253Jt_MnCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10254Jt_Cant_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10254Jt_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10255Jt_CantA_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10255Jt_CantA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1391_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1391_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1391_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1391 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1391_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1391_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_LINEA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_PRD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_prd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_PRDD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_PrdD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_MNCANT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_MnCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_CANT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_CANTA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CantA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption17K0( )
   {
   }

   public void e1117K2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tjota02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tjota02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tjota02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tjota02_impl.this.A396EmprCod = GXv_char2[0] ;
      tjota02_impl.this.AV11EmprNom = GXv_char3[0] ;
      tjota02_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm17K1390( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -3 )
      {
         Z10249Jt_Dia = A10249Jt_Dia ;
         Z396EmprCod = A396EmprCod ;
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z407EmprNom = A407EmprNom ;
         Z10244Jt_Desc = A10244Jt_Desc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TJOTA02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T017K6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017K6_A407EmprNom[0] ;
      n407EmprNom = T017K6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "FUNCION NO PERMITIDA (Alta)", ""), 1, "");
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

   public void load17K1390( )
   {
      /* Using cursor T017K8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1390 = (short)(1) ;
         A407EmprNom = T017K8_A407EmprNom[0] ;
         n407EmprNom = T017K8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10244Jt_Desc = T017K8_A10244Jt_Desc[0] ;
         n10244Jt_Desc = T017K8_n10244Jt_Desc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
         zm17K1390( -3) ;
      }
      pr_default.close(6);
      onLoadActions17K1390( ) ;
   }

   public void onLoadActions17K1390( )
   {
   }

   public void checkExtendedTable17K1390( )
   {
      nIsDirty_1390 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T017K7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOTA00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10244Jt_Desc = T017K7_A10244Jt_Desc[0] ;
      n10244Jt_Desc = T017K7_n10244Jt_Desc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
      pr_default.close(5);
   }

   public void closeExtendedTableCursors17K1390( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         short A10243Jt_codigo )
   {
      /* Using cursor T017K9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOTA00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10244Jt_Desc = T017K9_A10244Jt_Desc[0] ;
      n10244Jt_Desc = T017K9_n10244Jt_Desc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10244Jt_Desc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey17K1390( )
   {
      /* Using cursor T017K10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1390 = (short)(1) ;
      }
      else
      {
         RcdFound1390 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T017K5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T017K5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17K1390( 3) ;
         RcdFound1390 = (short)(1) ;
         A10249Jt_Dia = T017K5_A10249Jt_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
         A10243Jt_codigo = T017K5_A10243Jt_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z10249Jt_Dia = A10249Jt_Dia ;
         sMode1390 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load17K1390( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1390 = (short)(0) ;
            initializeNonKey17K1390( ) ;
         }
         Gx_mode = sMode1390 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1390 = (short)(0) ;
         initializeNonKey17K1390( ) ;
         sMode1390 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1390 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey17K1390( ) ;
      if ( RcdFound1390 == 0 )
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
      RcdFound1390 = (short)(0) ;
      /* Using cursor T017K11 */
      pr_default.execute(9, new Object[] {Short.valueOf(A10243Jt_codigo), Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T017K11_A10243Jt_codigo[0] < A10243Jt_codigo ) || ( T017K11_A10243Jt_codigo[0] == A10243Jt_codigo ) && GXutil.resetTime(T017K11_A10249Jt_Dia[0]).before( GXutil.resetTime( A10249Jt_Dia )) ) && ( GXutil.strcmp(T017K11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T017K11_A10243Jt_codigo[0] > A10243Jt_codigo ) || ( T017K11_A10243Jt_codigo[0] == A10243Jt_codigo ) && GXutil.resetTime(T017K11_A10249Jt_Dia[0]).after( GXutil.resetTime( A10249Jt_Dia )) ) && ( GXutil.strcmp(T017K11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10243Jt_codigo = T017K11_A10243Jt_codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            A10249Jt_Dia = T017K11_A10249Jt_Dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
            RcdFound1390 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1390 = (short)(0) ;
      /* Using cursor T017K12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A10243Jt_codigo), Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T017K12_A10243Jt_codigo[0] > A10243Jt_codigo ) || ( T017K12_A10243Jt_codigo[0] == A10243Jt_codigo ) && GXutil.resetTime(T017K12_A10249Jt_Dia[0]).after( GXutil.resetTime( A10249Jt_Dia )) ) && ( GXutil.strcmp(T017K12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T017K12_A10243Jt_codigo[0] < A10243Jt_codigo ) || ( T017K12_A10243Jt_codigo[0] == A10243Jt_codigo ) && GXutil.resetTime(T017K12_A10249Jt_Dia[0]).before( GXutil.resetTime( A10249Jt_Dia )) ) && ( GXutil.strcmp(T017K12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10243Jt_codigo = T017K12_A10243Jt_codigo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            A10249Jt_Dia = T017K12_A10249Jt_Dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
            RcdFound1390 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey17K1390( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtJt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert17K1390( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1390 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) || !( GXutil.dateCompare(GXutil.resetTime(A10249Jt_Dia), GXutil.resetTime(Z10249Jt_Dia)) ) )
            {
               A10243Jt_codigo = Z10243Jt_codigo ;
               httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
               A10249Jt_Dia = Z10249Jt_Dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update17K1390( ) ;
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) || !( GXutil.dateCompare(GXutil.resetTime(A10249Jt_Dia), GXutil.resetTime(Z10249Jt_Dia)) ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtJt_codigo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert17K1390( ) ;
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
                  GX_FocusControl = edtJt_codigo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert17K1390( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) || !( GXutil.dateCompare(GXutil.resetTime(A10249Jt_Dia), GXutil.resetTime(Z10249Jt_Dia)) ) )
      {
         A10243Jt_codigo = Z10243Jt_codigo ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         A10249Jt_Dia = Z10249Jt_Dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtJt_codigo_Internalname ;
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
      getKey17K1390( ) ;
      if ( RcdFound1390 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) || !( GXutil.dateCompare(GXutil.resetTime(A10249Jt_Dia), GXutil.resetTime(Z10249Jt_Dia)) ) )
         {
            A10243Jt_codigo = Z10243Jt_codigo ;
            httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
            A10249Jt_Dia = Z10249Jt_Dia ;
            httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10243Jt_codigo != Z10243Jt_codigo ) || !( GXutil.dateCompare(GXutil.resetTime(A10249Jt_Dia), GXutil.resetTime(Z10249Jt_Dia)) ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tjota02");
   }

   public void insert_check( )
   {
      confirm_17K0( ) ;
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
      if ( RcdFound1390 == 0 )
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
      scanStart17K1390( ) ;
      if ( RcdFound1390 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17K1390( ) ;
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
      if ( RcdFound1390 == 0 )
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
      if ( RcdFound1390 == 0 )
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
      scanStart17K1390( ) ;
      if ( RcdFound1390 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1390 != 0 )
         {
            scanNext17K1390( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd17K1390( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency17K1390( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017K4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA02"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOTA02"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17K1390( )
   {
      beforeValidate17K1390( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17K1390( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17K1390( 0) ;
         checkOptimisticConcurrency17K1390( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17K1390( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17K1390( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017K13 */
                  pr_default.execute(11, new Object[] {A10249Jt_Dia, A396EmprCod, Short.valueOf(A10243Jt_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA02");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        processLevel17K1390( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption17K0( ) ;
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
            load17K1390( ) ;
         }
         endLevel17K1390( ) ;
      }
      closeExtendedTableCursors17K1390( ) ;
   }

   public void update17K1390( )
   {
      beforeValidate17K1390( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17K1390( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17K1390( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17K1390( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate17K1390( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPJOTA02 */
                  deferredUpdate17K1390( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel17K1390( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption17K0( ) ;
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
         endLevel17K1390( ) ;
      }
      closeExtendedTableCursors17K1390( ) ;
   }

   public void deferredUpdate17K1390( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17K1390( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17K1390( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17K1390( ) ;
         afterConfirm17K1390( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17K1390( ) ;
            if ( AnyError == 0 )
            {
               scanStart17K1391( ) ;
               while ( RcdFound1391 != 0 )
               {
                  getByPrimaryKey17K1391( ) ;
                  delete17K1391( ) ;
                  scanNext17K1391( ) ;
               }
               scanEnd17K1391( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017K14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA02");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1390 == 0 )
                        {
                           initAll17K1390( ) ;
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
                        resetCaption17K0( ) ;
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
      sMode1390 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17K1390( ) ;
      Gx_mode = sMode1390 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17K1390( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T017K15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
         A10244Jt_Desc = T017K15_A10244Jt_Desc[0] ;
         n10244Jt_Desc = T017K15_n10244Jt_Desc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
         pr_default.close(13);
      }
   }

   public void processNestedLevel17K1391( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow17K1391( ) ;
         if ( ( nRcdExists_1391 != 0 ) || ( nIsMod_1391 != 0 ) )
         {
            standaloneNotModal17K1391( ) ;
            getKey17K1391( ) ;
            if ( ( nRcdExists_1391 == 0 ) && ( nRcdDeleted_1391 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert17K1391( ) ;
            }
            else
            {
               if ( RcdFound1391 != 0 )
               {
                  if ( ( nRcdDeleted_1391 != 0 ) && ( nRcdExists_1391 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete17K1391( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1391 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update17K1391( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1391 == 0 )
                  {
                     GXCCtl = "JT_LINEA_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtJt_linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1391_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10250Jt_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_prd_Internalname, GXutil.rtrim( A10251Jt_prd)) ;
         httpContext.changePostValue( edtJt_PrdD_Internalname, GXutil.rtrim( A10252Jt_PrdD)) ;
         httpContext.changePostValue( edtJt_MnCant_Internalname, GXutil.ltrim( localUtil.ntoc( A10253Jt_MnCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10254Jt_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtJt_CantA_Internalname, GXutil.ltrim( localUtil.ntoc( A10255Jt_CantA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10250Jt_linea_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10250Jt_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10251Jt_prd_"+sGXsfl_45_idx, GXutil.rtrim( Z10251Jt_prd)) ;
         httpContext.changePostValue( "ZT_"+"Z10252Jt_PrdD_"+sGXsfl_45_idx, GXutil.rtrim( Z10252Jt_PrdD)) ;
         httpContext.changePostValue( "ZT_"+"Z10253Jt_MnCant_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10253Jt_MnCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10254Jt_Cant_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10254Jt_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10255Jt_CantA_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z10255Jt_CantA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1391_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1391_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1391_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1391 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1391_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1391_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_LINEA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_PRD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_prd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_PRDD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_PrdD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_MNCANT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_MnCant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_CANT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "JT_CANTA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CantA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll17K1391( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1391 = (short)(0) ;
      nIsMod_1391 = (short)(0) ;
      nRcdDeleted_1391 = (short)(0) ;
   }

   public void processLevel17K1390( )
   {
      /* Save parent mode. */
      sMode1390 = Gx_mode ;
      processNestedLevel17K1391( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1390 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel17K1390( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete17K1390( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tjota02");
         if ( AnyError == 0 )
         {
            confirmValues17K0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tjota02");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart17K1390( )
   {
      /* Scan By routine */
      /* Using cursor T017K16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound1390 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1390 = (short)(1) ;
         A10243Jt_codigo = T017K16_A10243Jt_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         A10249Jt_Dia = T017K16_A10249Jt_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17K1390( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound1390 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1390 = (short)(1) ;
         A10243Jt_codigo = T017K16_A10243Jt_codigo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
         A10249Jt_Dia = T017K16_A10249Jt_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
      }
   }

   public void scanEnd17K1390( )
   {
      pr_default.close(14);
   }

   public void afterConfirm17K1390( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17K1390( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17K1390( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17K1390( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17K1390( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17K1390( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17K1390( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtJt_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_codigo_Enabled), 5, 0), true);
      edtJt_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Desc_Enabled), 5, 0), true);
      edtJt_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Dia_Enabled), 5, 0), true);
   }

   public void zm17K1391( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10251Jt_prd = T017K3_A10251Jt_prd[0] ;
            Z10252Jt_PrdD = T017K3_A10252Jt_PrdD[0] ;
            Z10253Jt_MnCant = T017K3_A10253Jt_MnCant[0] ;
            Z10254Jt_Cant = T017K3_A10254Jt_Cant[0] ;
            Z10255Jt_CantA = T017K3_A10255Jt_CantA[0] ;
         }
         else
         {
            Z10251Jt_prd = A10251Jt_prd ;
            Z10252Jt_PrdD = A10252Jt_PrdD ;
            Z10253Jt_MnCant = A10253Jt_MnCant ;
            Z10254Jt_Cant = A10254Jt_Cant ;
            Z10255Jt_CantA = A10255Jt_CantA ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z10249Jt_Dia = A10249Jt_Dia ;
         Z10250Jt_linea = A10250Jt_linea ;
         Z10251Jt_prd = A10251Jt_prd ;
         Z10252Jt_PrdD = A10252Jt_PrdD ;
         Z10253Jt_MnCant = A10253Jt_MnCant ;
         Z10254Jt_Cant = A10254Jt_Cant ;
         Z10255Jt_CantA = A10255Jt_CantA ;
      }
   }

   public void standaloneNotModal17K1391( )
   {
   }

   public void standaloneModal17K1391( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "FUNCION NO PERMITIDA (Alta)", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtJt_linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtJt_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_linea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtJt_linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtJt_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_linea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load17K1391( )
   {
      /* Using cursor T017K17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1391 = (short)(1) ;
         A10251Jt_prd = T017K17_A10251Jt_prd[0] ;
         n10251Jt_prd = T017K17_n10251Jt_prd[0] ;
         A10252Jt_PrdD = T017K17_A10252Jt_PrdD[0] ;
         n10252Jt_PrdD = T017K17_n10252Jt_PrdD[0] ;
         A10253Jt_MnCant = T017K17_A10253Jt_MnCant[0] ;
         n10253Jt_MnCant = T017K17_n10253Jt_MnCant[0] ;
         A10254Jt_Cant = T017K17_A10254Jt_Cant[0] ;
         n10254Jt_Cant = T017K17_n10254Jt_Cant[0] ;
         A10255Jt_CantA = T017K17_A10255Jt_CantA[0] ;
         n10255Jt_CantA = T017K17_n10255Jt_CantA[0] ;
         zm17K1391( -6) ;
      }
      pr_default.close(15);
      onLoadActions17K1391( ) ;
   }

   public void onLoadActions17K1391( )
   {
   }

   public void checkExtendedTable17K1391( )
   {
      nIsDirty_1391 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal17K1391( ) ;
   }

   public void closeExtendedTableCursors17K1391( )
   {
   }

   public void enableDisable17K1391( )
   {
   }

   public void getKey17K1391( )
   {
      /* Using cursor T017K18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1391 = (short)(1) ;
      }
      else
      {
         RcdFound1391 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey17K1391( )
   {
      /* Using cursor T017K3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T017K3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm17K1391( 6) ;
         RcdFound1391 = (short)(1) ;
         initializeNonKey17K1391( ) ;
         A10250Jt_linea = T017K3_A10250Jt_linea[0] ;
         A10251Jt_prd = T017K3_A10251Jt_prd[0] ;
         n10251Jt_prd = T017K3_n10251Jt_prd[0] ;
         A10252Jt_PrdD = T017K3_A10252Jt_PrdD[0] ;
         n10252Jt_PrdD = T017K3_n10252Jt_PrdD[0] ;
         A10253Jt_MnCant = T017K3_A10253Jt_MnCant[0] ;
         n10253Jt_MnCant = T017K3_n10253Jt_MnCant[0] ;
         A10254Jt_Cant = T017K3_A10254Jt_Cant[0] ;
         n10254Jt_Cant = T017K3_n10254Jt_Cant[0] ;
         A10255Jt_CantA = T017K3_A10255Jt_CantA[0] ;
         n10255Jt_CantA = T017K3_n10255Jt_CantA[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10243Jt_codigo = A10243Jt_codigo ;
         Z10249Jt_Dia = A10249Jt_Dia ;
         Z10250Jt_linea = A10250Jt_linea ;
         sMode1391 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17K1391( ) ;
         load17K1391( ) ;
         Gx_mode = sMode1391 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1391 = (short)(0) ;
         initializeNonKey17K1391( ) ;
         sMode1391 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal17K1391( ) ;
         Gx_mode = sMode1391 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes17K1391( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency17K1391( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T017K2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA03"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10251Jt_prd, T017K2_A10251Jt_prd[0]) != 0 ) || ( GXutil.strcmp(Z10252Jt_PrdD, T017K2_A10252Jt_PrdD[0]) != 0 ) || ( DecimalUtil.compareTo(Z10253Jt_MnCant, T017K2_A10253Jt_MnCant[0]) != 0 ) || ( DecimalUtil.compareTo(Z10254Jt_Cant, T017K2_A10254Jt_Cant[0]) != 0 ) || ( DecimalUtil.compareTo(Z10255Jt_CantA, T017K2_A10255Jt_CantA[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10251Jt_prd, T017K2_A10251Jt_prd[0]) != 0 )
            {
               GXutil.writeLogln("tjota02:[seudo value changed for attri]"+"Jt_prd");
               GXutil.writeLogRaw("Old: ",Z10251Jt_prd);
               GXutil.writeLogRaw("Current: ",T017K2_A10251Jt_prd[0]);
            }
            if ( GXutil.strcmp(Z10252Jt_PrdD, T017K2_A10252Jt_PrdD[0]) != 0 )
            {
               GXutil.writeLogln("tjota02:[seudo value changed for attri]"+"Jt_PrdD");
               GXutil.writeLogRaw("Old: ",Z10252Jt_PrdD);
               GXutil.writeLogRaw("Current: ",T017K2_A10252Jt_PrdD[0]);
            }
            if ( DecimalUtil.compareTo(Z10253Jt_MnCant, T017K2_A10253Jt_MnCant[0]) != 0 )
            {
               GXutil.writeLogln("tjota02:[seudo value changed for attri]"+"Jt_MnCant");
               GXutil.writeLogRaw("Old: ",Z10253Jt_MnCant);
               GXutil.writeLogRaw("Current: ",T017K2_A10253Jt_MnCant[0]);
            }
            if ( DecimalUtil.compareTo(Z10254Jt_Cant, T017K2_A10254Jt_Cant[0]) != 0 )
            {
               GXutil.writeLogln("tjota02:[seudo value changed for attri]"+"Jt_Cant");
               GXutil.writeLogRaw("Old: ",Z10254Jt_Cant);
               GXutil.writeLogRaw("Current: ",T017K2_A10254Jt_Cant[0]);
            }
            if ( DecimalUtil.compareTo(Z10255Jt_CantA, T017K2_A10255Jt_CantA[0]) != 0 )
            {
               GXutil.writeLogln("tjota02:[seudo value changed for attri]"+"Jt_CantA");
               GXutil.writeLogRaw("Old: ",Z10255Jt_CantA);
               GXutil.writeLogRaw("Current: ",T017K2_A10255Jt_CantA[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPJOTA03"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert17K1391( )
   {
      beforeValidate17K1391( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17K1391( ) ;
      }
      if ( AnyError == 0 )
      {
         zm17K1391( 0) ;
         checkOptimisticConcurrency17K1391( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm17K1391( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert17K1391( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T017K19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea), Boolean.valueOf(n10251Jt_prd), A10251Jt_prd, Boolean.valueOf(n10252Jt_PrdD), A10252Jt_PrdD, Boolean.valueOf(n10253Jt_MnCant), A10253Jt_MnCant, Boolean.valueOf(n10254Jt_Cant), A10254Jt_Cant, Boolean.valueOf(n10255Jt_CantA), A10255Jt_CantA});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA03");
                  if ( (pr_default.getStatus(17) == 1) )
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
            load17K1391( ) ;
         }
         endLevel17K1391( ) ;
      }
      closeExtendedTableCursors17K1391( ) ;
   }

   public void update17K1391( )
   {
      beforeValidate17K1391( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable17K1391( ) ;
      }
      if ( ( nIsMod_1391 != 0 ) || ( nIsDirty_1391 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency17K1391( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm17K1391( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate17K1391( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T017K20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n10251Jt_prd), A10251Jt_prd, Boolean.valueOf(n10252Jt_PrdD), A10252Jt_PrdD, Boolean.valueOf(n10253Jt_MnCant), A10253Jt_MnCant, Boolean.valueOf(n10254Jt_Cant), A10254Jt_Cant, Boolean.valueOf(n10255Jt_CantA), A10255Jt_CantA, A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA03");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPJOTA03"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate17K1391( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey17K1391( ) ;
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
            endLevel17K1391( ) ;
         }
      }
      closeExtendedTableCursors17K1391( ) ;
   }

   public void deferredUpdate17K1391( )
   {
   }

   public void delete17K1391( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate17K1391( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency17K1391( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls17K1391( ) ;
         afterConfirm17K1391( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete17K1391( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T017K21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia, Short.valueOf(A10250Jt_linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPJOTA03");
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
      sMode1391 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel17K1391( ) ;
      Gx_mode = sMode1391 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls17K1391( )
   {
      standaloneModal17K1391( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel17K1391( )
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

   public void scanStart17K1391( )
   {
      /* Scan By routine */
      /* Using cursor T017K22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo), A10249Jt_Dia});
      RcdFound1391 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1391 = (short)(1) ;
         A10250Jt_linea = T017K22_A10250Jt_linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext17K1391( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound1391 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1391 = (short)(1) ;
         A10250Jt_linea = T017K22_A10250Jt_linea[0] ;
      }
   }

   public void scanEnd17K1391( )
   {
      pr_default.close(20);
   }

   public void afterConfirm17K1391( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert17K1391( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate17K1391( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete17K1391( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete17K1391( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate17K1391( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes17K1391( )
   {
      edtJt_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_linea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_prd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_prd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_prd_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_PrdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_PrdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_PrdD_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_MnCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_MnCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_MnCant_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_Cant_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtJt_CantA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_CantA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_CantA_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes17K1391( )
   {
   }

   public void send_integrity_lvl_hashes17K1390( )
   {
   }

   public void subsflControlProps_451391( )
   {
      edtavnRcdDeleted_1391_Internalname = "vNRCDDELETED_1391_"+sGXsfl_45_idx ;
      edtJt_linea_Internalname = "JT_LINEA_"+sGXsfl_45_idx ;
      edtJt_prd_Internalname = "JT_PRD_"+sGXsfl_45_idx ;
      edtJt_PrdD_Internalname = "JT_PRDD_"+sGXsfl_45_idx ;
      edtJt_MnCant_Internalname = "JT_MNCANT_"+sGXsfl_45_idx ;
      edtJt_Cant_Internalname = "JT_CANT_"+sGXsfl_45_idx ;
      edtJt_CantA_Internalname = "JT_CANTA_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451391( )
   {
      edtavnRcdDeleted_1391_Internalname = "vNRCDDELETED_1391_"+sGXsfl_45_fel_idx ;
      edtJt_linea_Internalname = "JT_LINEA_"+sGXsfl_45_fel_idx ;
      edtJt_prd_Internalname = "JT_PRD_"+sGXsfl_45_fel_idx ;
      edtJt_PrdD_Internalname = "JT_PRDD_"+sGXsfl_45_fel_idx ;
      edtJt_MnCant_Internalname = "JT_MNCANT_"+sGXsfl_45_fel_idx ;
      edtJt_Cant_Internalname = "JT_CANT_"+sGXsfl_45_fel_idx ;
      edtJt_CantA_Internalname = "JT_CANTA_"+sGXsfl_45_fel_idx ;
   }

   public void addRow17K1391( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451391( ) ;
      sendRow17K1391( ) ;
   }

   public void sendRow17K1391( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1391_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1391_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1391), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1391), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1391_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1391_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_linea_Internalname,GXutil.ltrim( localUtil.ntoc( A10250Jt_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10250Jt_linea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_linea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_prd_Internalname,GXutil.rtrim( A10251Jt_prd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_prd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_prd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_PrdD_Internalname,GXutil.rtrim( A10252Jt_PrdD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_PrdD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_PrdD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_MnCant_Internalname,GXutil.ltrim( localUtil.ntoc( A10253Jt_MnCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtJt_MnCant_Enabled!=0) ? localUtil.format( A10253Jt_MnCant, "ZZZZZZ9.9999") : localUtil.format( A10253Jt_MnCant, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_MnCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_MnCant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A10254Jt_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtJt_Cant_Enabled!=0) ? localUtil.format( A10254Jt_Cant, "ZZZZZZ9.9999") : localUtil.format( A10254Jt_Cant, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_Cant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_Cant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1391_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJt_CantA_Internalname,GXutil.ltrim( localUtil.ntoc( A10255Jt_CantA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtJt_CantA_Enabled!=0) ? localUtil.format( A10255Jt_CantA, "ZZZZZZ9.9999") : localUtil.format( A10255Jt_CantA, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJt_CantA_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtJt_CantA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes17K1391( ) ;
      GXCCtl = "Z10250Jt_linea_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10250Jt_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10251Jt_prd_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10251Jt_prd));
      GXCCtl = "Z10252Jt_PrdD_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10252Jt_PrdD));
      GXCCtl = "Z10253Jt_MnCant_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10253Jt_MnCant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10254Jt_Cant_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10254Jt_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10255Jt_CantA_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10255Jt_CantA, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1391_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1391_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1391_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1391, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1391_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1391_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_LINEA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_PRD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_prd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_PRDD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_PrdD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_MNCANT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_MnCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_CANT_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "JT_CANTA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CantA_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow17K1391( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451391( ) ;
      edtavnRcdDeleted_1391_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1391_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_LINEA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_prd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_PRD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_PrdD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_PRDD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_MnCant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_MNCANT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_CANT_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtJt_CantA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "JT_CANTA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1391_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1391_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1391");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1391_Internalname ;
         wbErr = true ;
         nRcdDeleted_1391 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1391 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1391_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtJt_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtJt_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "JT_LINEA_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_linea_Internalname ;
         wbErr = true ;
         A10250Jt_linea = (short)(0) ;
      }
      else
      {
         A10250Jt_linea = (short)(localUtil.ctol( httpContext.cgiGet( edtJt_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10251Jt_prd = httpContext.cgiGet( edtJt_prd_Internalname) ;
      n10251Jt_prd = false ;
      A10252Jt_PrdD = httpContext.cgiGet( edtJt_PrdD_Internalname) ;
      n10252Jt_PrdD = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_MnCant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_MnCant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "JT_MNCANT_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_MnCant_Internalname ;
         wbErr = true ;
         A10253Jt_MnCant = DecimalUtil.ZERO ;
         n10253Jt_MnCant = false ;
      }
      else
      {
         A10253Jt_MnCant = localUtil.ctond( httpContext.cgiGet( edtJt_MnCant_Internalname)) ;
         n10253Jt_MnCant = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_Cant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_Cant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "JT_CANT_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_Cant_Internalname ;
         wbErr = true ;
         A10254Jt_Cant = DecimalUtil.ZERO ;
         n10254Jt_Cant = false ;
      }
      else
      {
         A10254Jt_Cant = localUtil.ctond( httpContext.cgiGet( edtJt_Cant_Internalname)) ;
         n10254Jt_Cant = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_CantA_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtJt_CantA_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "JT_CANTA_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_CantA_Internalname ;
         wbErr = true ;
         A10255Jt_CantA = DecimalUtil.ZERO ;
         n10255Jt_CantA = false ;
      }
      else
      {
         A10255Jt_CantA = localUtil.ctond( httpContext.cgiGet( edtJt_CantA_Internalname)) ;
         n10255Jt_CantA = false ;
      }
      GXCCtl = "Z10250Jt_linea_" + sGXsfl_45_idx ;
      Z10250Jt_linea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10251Jt_prd_" + sGXsfl_45_idx ;
      Z10251Jt_prd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10252Jt_PrdD_" + sGXsfl_45_idx ;
      Z10252Jt_PrdD = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10253Jt_MnCant_" + sGXsfl_45_idx ;
      Z10253Jt_MnCant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10254Jt_Cant_" + sGXsfl_45_idx ;
      Z10254Jt_Cant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10255Jt_CantA_" + sGXsfl_45_idx ;
      Z10255Jt_CantA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1391_" + sGXsfl_45_idx ;
      nRcdDeleted_1391 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1391_" + sGXsfl_45_idx ;
      nRcdExists_1391 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1391_" + sGXsfl_45_idx ;
      nIsMod_1391 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtJt_linea_Enabled = edtJt_linea_Enabled ;
   }

   public void confirmValues17K0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451391( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451391( ) ;
         httpContext.changePostValue( "Z10250Jt_linea_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10250Jt_linea_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10250Jt_linea_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10251Jt_prd_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10251Jt_prd_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10251Jt_prd_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10252Jt_PrdD_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10252Jt_PrdD_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10252Jt_PrdD_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10253Jt_MnCant_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10253Jt_MnCant_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10253Jt_MnCant_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10254Jt_Cant_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10254Jt_Cant_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10254Jt_Cant_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z10255Jt_CantA_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z10255Jt_CantA_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10255Jt_CantA_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tjota02", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10243Jt_codigo", GXutil.ltrim( localUtil.ntoc( Z10243Jt_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10249Jt_Dia", localUtil.dtoc( Z10249Jt_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tjota02", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TJOTA02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA REBAJES", "") ;
   }

   public void initializeNonKey17K1390( )
   {
      A10244Jt_Desc = "" ;
      n10244Jt_Desc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
   }

   public void initAll17K1390( )
   {
      A10243Jt_codigo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10243Jt_codigo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10243Jt_codigo), 4, 0));
      A10249Jt_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10249Jt_Dia", localUtil.format(A10249Jt_Dia, "99/99/99"));
      initializeNonKey17K1390( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey17K1391( )
   {
      A10251Jt_prd = "" ;
      n10251Jt_prd = false ;
      A10252Jt_PrdD = "" ;
      n10252Jt_PrdD = false ;
      A10253Jt_MnCant = DecimalUtil.ZERO ;
      n10253Jt_MnCant = false ;
      A10254Jt_Cant = DecimalUtil.ZERO ;
      n10254Jt_Cant = false ;
      A10255Jt_CantA = DecimalUtil.ZERO ;
      n10255Jt_CantA = false ;
      Z10251Jt_prd = "" ;
      Z10252Jt_PrdD = "" ;
      Z10253Jt_MnCant = DecimalUtil.ZERO ;
      Z10254Jt_Cant = DecimalUtil.ZERO ;
      Z10255Jt_CantA = DecimalUtil.ZERO ;
   }

   public void initAll17K1391( )
   {
      A10250Jt_linea = (short)(0) ;
      initializeNonKey17K1391( ) ;
   }

   public void standaloneModalInsert17K1391( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241551457", true, true);
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
      httpContext.AddJavascriptSource("tjota02.js", "?20268241551457", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1391( )
   {
      edtJt_linea_Enabled = defedtJt_linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtJt_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtJt_linea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1391, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1391_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10250Jt_linea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10251Jt_prd));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_prd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10252Jt_PrdD));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_PrdD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10253Jt_MnCant, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_MnCant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10254Jt_Cant, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10255Jt_CantA, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtJt_CantA_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtJt_codigo_Internalname = "JT_CODIGO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtJt_Desc_Internalname = "JT_DESC" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtJt_Dia_Internalname = "JT_DIA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1391_Internalname = "vNRCDDELETED_1391" ;
      edtJt_linea_Internalname = "JT_LINEA" ;
      edtJt_prd_Internalname = "JT_PRD" ;
      edtJt_PrdD_Internalname = "JT_PRDD" ;
      edtJt_MnCant_Internalname = "JT_MNCANT" ;
      edtJt_Cant_Internalname = "JT_CANT" ;
      edtJt_CantA_Internalname = "JT_CANTA" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA REBAJES", "") );
      edtJt_CantA_Jsonclick = "" ;
      edtJt_Cant_Jsonclick = "" ;
      edtJt_MnCant_Jsonclick = "" ;
      edtJt_PrdD_Jsonclick = "" ;
      edtJt_prd_Jsonclick = "" ;
      edtJt_linea_Jsonclick = "" ;
      edtavnRcdDeleted_1391_Jsonclick = "" ;
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
      edtJt_CantA_Enabled = 1 ;
      edtJt_Cant_Enabled = 1 ;
      edtJt_MnCant_Enabled = 1 ;
      edtJt_PrdD_Enabled = 1 ;
      edtJt_prd_Enabled = 1 ;
      edtJt_linea_Enabled = 1 ;
      edtavnRcdDeleted_1391_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtJt_Dia_Jsonclick = "" ;
      edtJt_Dia_Backcolor = (int)(0xFFFFFF) ;
      edtJt_Dia_Enabled = 1 ;
      edtJt_Desc_Jsonclick = "" ;
      edtJt_Desc_Backcolor = (int)(0xFFFFFF) ;
      edtJt_Desc_Enabled = 0 ;
      edtJt_codigo_Jsonclick = "" ;
      edtJt_codigo_Backcolor = (int)(0xFFFFFF) ;
      edtJt_codigo_Enabled = 1 ;
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
      subsflControlProps_451391( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal17K1391( ) ;
         standaloneModal17K1391( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow17K1391( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451391( ) ;
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
      /* Using cursor T017K23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T017K23_A407EmprNom[0] ;
      n407EmprNom = T017K23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T017K15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOTA00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A10244Jt_Desc = T017K15_A10244Jt_Desc[0] ;
      n10244Jt_Desc = T017K15_n10244Jt_Desc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", A10244Jt_Desc);
      pr_default.close(13);
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

   public void valid_Jt_codigo( )
   {
      n10244Jt_Desc = false ;
      /* Using cursor T017K15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A10243Jt_codigo)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "JOTA00", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "JT_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtJt_codigo_Internalname ;
      }
      A10244Jt_Desc = T017K15_A10244Jt_Desc[0] ;
      n10244Jt_Desc = T017K15_n10244Jt_Desc[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", GXutil.rtrim( A10244Jt_Desc));
   }

   public void valid_Jt_dia( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10244Jt_Desc", GXutil.rtrim( A10244Jt_Desc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10243Jt_codigo", GXutil.ltrim( localUtil.ntoc( Z10243Jt_codigo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10249Jt_Dia", localUtil.format(Z10249Jt_Dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10244Jt_Desc", GXutil.rtrim( Z10244Jt_Desc));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_JT_CODIGO","{handler:'valid_Jt_codigo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10243Jt_codigo',fld:'JT_CODIGO',pic:'ZZZ9'},{av:'A10244Jt_Desc',fld:'JT_DESC',pic:''}]");
      setEventMetadata("VALID_JT_CODIGO",",oparms:[{av:'A10244Jt_Desc',fld:'JT_DESC',pic:''}]}");
      setEventMetadata("VALID_JT_DIA","{handler:'valid_Jt_dia',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10243Jt_codigo',fld:'JT_CODIGO',pic:'ZZZ9'},{av:'A10249Jt_Dia',fld:'JT_DIA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_JT_DIA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10244Jt_Desc',fld:'JT_DESC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10243Jt_codigo'},{av:'Z10249Jt_Dia'},{av:'Z407EmprNom'},{av:'Z10244Jt_Desc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_JT_LINEA","{handler:'valid_Jt_linea',iparms:[]");
      setEventMetadata("VALID_JT_LINEA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Jt_canta',iparms:[]");
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
      pr_default.close(21);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10249Jt_Dia = GXutil.nullDate() ;
      Z10251Jt_prd = "" ;
      Z10252Jt_PrdD = "" ;
      Z10253Jt_MnCant = DecimalUtil.ZERO ;
      Z10254Jt_Cant = DecimalUtil.ZERO ;
      Z10255Jt_CantA = DecimalUtil.ZERO ;
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
      A10244Jt_Desc = "" ;
      lblTextblock5_Jsonclick = "" ;
      A10249Jt_Dia = GXutil.nullDate() ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1391 = "" ;
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
      sMode1390 = "" ;
      GXCCtl = "" ;
      A10251Jt_prd = "" ;
      A10252Jt_PrdD = "" ;
      A10253Jt_MnCant = DecimalUtil.ZERO ;
      A10254Jt_Cant = DecimalUtil.ZERO ;
      A10255Jt_CantA = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      Z10244Jt_Desc = "" ;
      T017K6_A407EmprNom = new String[] {""} ;
      T017K6_n407EmprNom = new boolean[] {false} ;
      T017K8_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K8_A407EmprNom = new String[] {""} ;
      T017K8_n407EmprNom = new boolean[] {false} ;
      T017K8_A10244Jt_Desc = new String[] {""} ;
      T017K8_n10244Jt_Desc = new boolean[] {false} ;
      T017K8_A396EmprCod = new String[] {""} ;
      T017K8_A10243Jt_codigo = new short[1] ;
      T017K7_A10244Jt_Desc = new String[] {""} ;
      T017K7_n10244Jt_Desc = new boolean[] {false} ;
      T017K9_A10244Jt_Desc = new String[] {""} ;
      T017K9_n10244Jt_Desc = new boolean[] {false} ;
      T017K10_A396EmprCod = new String[] {""} ;
      T017K10_A10243Jt_codigo = new short[1] ;
      T017K10_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K5_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K5_A396EmprCod = new String[] {""} ;
      T017K5_A10243Jt_codigo = new short[1] ;
      T017K11_A396EmprCod = new String[] {""} ;
      T017K11_A10243Jt_codigo = new short[1] ;
      T017K11_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K12_A396EmprCod = new String[] {""} ;
      T017K12_A10243Jt_codigo = new short[1] ;
      T017K12_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K4_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K4_A396EmprCod = new String[] {""} ;
      T017K4_A10243Jt_codigo = new short[1] ;
      T017K15_A10244Jt_Desc = new String[] {""} ;
      T017K15_n10244Jt_Desc = new boolean[] {false} ;
      T017K16_A396EmprCod = new String[] {""} ;
      T017K16_A10243Jt_codigo = new short[1] ;
      T017K16_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K17_A396EmprCod = new String[] {""} ;
      T017K17_A10243Jt_codigo = new short[1] ;
      T017K17_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K17_A10250Jt_linea = new short[1] ;
      T017K17_A10251Jt_prd = new String[] {""} ;
      T017K17_n10251Jt_prd = new boolean[] {false} ;
      T017K17_A10252Jt_PrdD = new String[] {""} ;
      T017K17_n10252Jt_PrdD = new boolean[] {false} ;
      T017K17_A10253Jt_MnCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K17_n10253Jt_MnCant = new boolean[] {false} ;
      T017K17_A10254Jt_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K17_n10254Jt_Cant = new boolean[] {false} ;
      T017K17_A10255Jt_CantA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K17_n10255Jt_CantA = new boolean[] {false} ;
      T017K18_A396EmprCod = new String[] {""} ;
      T017K18_A10243Jt_codigo = new short[1] ;
      T017K18_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K18_A10250Jt_linea = new short[1] ;
      T017K3_A396EmprCod = new String[] {""} ;
      T017K3_A10243Jt_codigo = new short[1] ;
      T017K3_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K3_A10250Jt_linea = new short[1] ;
      T017K3_A10251Jt_prd = new String[] {""} ;
      T017K3_n10251Jt_prd = new boolean[] {false} ;
      T017K3_A10252Jt_PrdD = new String[] {""} ;
      T017K3_n10252Jt_PrdD = new boolean[] {false} ;
      T017K3_A10253Jt_MnCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K3_n10253Jt_MnCant = new boolean[] {false} ;
      T017K3_A10254Jt_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K3_n10254Jt_Cant = new boolean[] {false} ;
      T017K3_A10255Jt_CantA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K3_n10255Jt_CantA = new boolean[] {false} ;
      T017K2_A396EmprCod = new String[] {""} ;
      T017K2_A10243Jt_codigo = new short[1] ;
      T017K2_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K2_A10250Jt_linea = new short[1] ;
      T017K2_A10251Jt_prd = new String[] {""} ;
      T017K2_n10251Jt_prd = new boolean[] {false} ;
      T017K2_A10252Jt_PrdD = new String[] {""} ;
      T017K2_n10252Jt_PrdD = new boolean[] {false} ;
      T017K2_A10253Jt_MnCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K2_n10253Jt_MnCant = new boolean[] {false} ;
      T017K2_A10254Jt_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K2_n10254Jt_Cant = new boolean[] {false} ;
      T017K2_A10255Jt_CantA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T017K2_n10255Jt_CantA = new boolean[] {false} ;
      T017K22_A396EmprCod = new String[] {""} ;
      T017K22_A10243Jt_codigo = new short[1] ;
      T017K22_A10249Jt_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T017K22_A10250Jt_linea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T017K23_A407EmprNom = new String[] {""} ;
      T017K23_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10249Jt_Dia = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      ZZ10244Jt_Desc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tjota02__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tjota02__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tjota02__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tjota02__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tjota02__default(),
         new Object[] {
             new Object[] {
            T017K2_A396EmprCod, T017K2_A10243Jt_codigo, T017K2_A10249Jt_Dia, T017K2_A10250Jt_linea, T017K2_A10251Jt_prd, T017K2_n10251Jt_prd, T017K2_A10252Jt_PrdD, T017K2_n10252Jt_PrdD, T017K2_A10253Jt_MnCant, T017K2_n10253Jt_MnCant,
            T017K2_A10254Jt_Cant, T017K2_n10254Jt_Cant, T017K2_A10255Jt_CantA, T017K2_n10255Jt_CantA
            }
            , new Object[] {
            T017K3_A396EmprCod, T017K3_A10243Jt_codigo, T017K3_A10249Jt_Dia, T017K3_A10250Jt_linea, T017K3_A10251Jt_prd, T017K3_n10251Jt_prd, T017K3_A10252Jt_PrdD, T017K3_n10252Jt_PrdD, T017K3_A10253Jt_MnCant, T017K3_n10253Jt_MnCant,
            T017K3_A10254Jt_Cant, T017K3_n10254Jt_Cant, T017K3_A10255Jt_CantA, T017K3_n10255Jt_CantA
            }
            , new Object[] {
            T017K4_A10249Jt_Dia, T017K4_A396EmprCod, T017K4_A10243Jt_codigo
            }
            , new Object[] {
            T017K5_A10249Jt_Dia, T017K5_A396EmprCod, T017K5_A10243Jt_codigo
            }
            , new Object[] {
            T017K6_A407EmprNom, T017K6_n407EmprNom
            }
            , new Object[] {
            T017K7_A10244Jt_Desc, T017K7_n10244Jt_Desc
            }
            , new Object[] {
            T017K8_A10249Jt_Dia, T017K8_A407EmprNom, T017K8_n407EmprNom, T017K8_A10244Jt_Desc, T017K8_n10244Jt_Desc, T017K8_A396EmprCod, T017K8_A10243Jt_codigo
            }
            , new Object[] {
            T017K9_A10244Jt_Desc, T017K9_n10244Jt_Desc
            }
            , new Object[] {
            T017K10_A396EmprCod, T017K10_A10243Jt_codigo, T017K10_A10249Jt_Dia
            }
            , new Object[] {
            T017K11_A396EmprCod, T017K11_A10243Jt_codigo, T017K11_A10249Jt_Dia
            }
            , new Object[] {
            T017K12_A396EmprCod, T017K12_A10243Jt_codigo, T017K12_A10249Jt_Dia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017K15_A10244Jt_Desc, T017K15_n10244Jt_Desc
            }
            , new Object[] {
            T017K16_A396EmprCod, T017K16_A10243Jt_codigo, T017K16_A10249Jt_Dia
            }
            , new Object[] {
            T017K17_A396EmprCod, T017K17_A10243Jt_codigo, T017K17_A10249Jt_Dia, T017K17_A10250Jt_linea, T017K17_A10251Jt_prd, T017K17_n10251Jt_prd, T017K17_A10252Jt_PrdD, T017K17_n10252Jt_PrdD, T017K17_A10253Jt_MnCant, T017K17_n10253Jt_MnCant,
            T017K17_A10254Jt_Cant, T017K17_n10254Jt_Cant, T017K17_A10255Jt_CantA, T017K17_n10255Jt_CantA
            }
            , new Object[] {
            T017K18_A396EmprCod, T017K18_A10243Jt_codigo, T017K18_A10249Jt_Dia, T017K18_A10250Jt_linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T017K22_A396EmprCod, T017K22_A10243Jt_codigo, T017K22_A10249Jt_Dia, T017K22_A10250Jt_linea
            }
            , new Object[] {
            T017K23_A407EmprNom, T017K23_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TJOTA02" ;
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
   private short Z10243Jt_codigo ;
   private short Z10250Jt_linea ;
   private short nRcdDeleted_1391 ;
   private short nRcdExists_1391 ;
   private short nIsMod_1391 ;
   private short A10243Jt_codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1391 ;
   private short RcdFound1391 ;
   private short nBlankRcdUsr1391 ;
   private short A10250Jt_linea ;
   private short RcdFound1390 ;
   private short nIsDirty_1390 ;
   private short nIsDirty_1391 ;
   private short ZZ10243Jt_codigo ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtJt_codigo_Enabled ;
   private int edtJt_Desc_Enabled ;
   private int edtJt_Dia_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1391_Enabled ;
   private int edtJt_linea_Enabled ;
   private int edtJt_prd_Enabled ;
   private int edtJt_PrdD_Enabled ;
   private int edtJt_MnCant_Enabled ;
   private int edtJt_Cant_Enabled ;
   private int edtJt_CantA_Enabled ;
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
   private int defedtJt_linea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtJt_Dia_Backcolor ;
   private int edtJt_Desc_Backcolor ;
   private int edtJt_codigo_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10253Jt_MnCant ;
   private java.math.BigDecimal Z10254Jt_Cant ;
   private java.math.BigDecimal Z10255Jt_CantA ;
   private java.math.BigDecimal A10253Jt_MnCant ;
   private java.math.BigDecimal A10254Jt_Cant ;
   private java.math.BigDecimal A10255Jt_CantA ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10251Jt_prd ;
   private String Z10252Jt_PrdD ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtJt_codigo_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtJt_codigo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtJt_Desc_Internalname ;
   private String A10244Jt_Desc ;
   private String edtJt_Desc_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtJt_Dia_Internalname ;
   private String edtJt_Dia_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1391 ;
   private String edtavnRcdDeleted_1391_Internalname ;
   private String edtJt_linea_Internalname ;
   private String edtJt_prd_Internalname ;
   private String edtJt_PrdD_Internalname ;
   private String edtJt_MnCant_Internalname ;
   private String edtJt_Cant_Internalname ;
   private String edtJt_CantA_Internalname ;
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
   private String sMode1390 ;
   private String GXCCtl ;
   private String A10251Jt_prd ;
   private String A10252Jt_PrdD ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z10244Jt_Desc ;
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1391_Jsonclick ;
   private String edtJt_linea_Jsonclick ;
   private String edtJt_prd_Jsonclick ;
   private String edtJt_PrdD_Jsonclick ;
   private String edtJt_MnCant_Jsonclick ;
   private String edtJt_Cant_Jsonclick ;
   private String edtJt_CantA_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ10244Jt_Desc ;
   private java.util.Date Z10249Jt_Dia ;
   private java.util.Date A10249Jt_Dia ;
   private java.util.Date ZZ10249Jt_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10244Jt_Desc ;
   private boolean returnInSub ;
   private boolean n10251Jt_prd ;
   private boolean n10252Jt_PrdD ;
   private boolean n10253Jt_MnCant ;
   private boolean n10254Jt_Cant ;
   private boolean n10255Jt_CantA ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T017K6_A407EmprNom ;
   private boolean[] T017K6_n407EmprNom ;
   private java.util.Date[] T017K8_A10249Jt_Dia ;
   private String[] T017K8_A407EmprNom ;
   private boolean[] T017K8_n407EmprNom ;
   private String[] T017K8_A10244Jt_Desc ;
   private boolean[] T017K8_n10244Jt_Desc ;
   private String[] T017K8_A396EmprCod ;
   private short[] T017K8_A10243Jt_codigo ;
   private String[] T017K7_A10244Jt_Desc ;
   private boolean[] T017K7_n10244Jt_Desc ;
   private String[] T017K9_A10244Jt_Desc ;
   private boolean[] T017K9_n10244Jt_Desc ;
   private String[] T017K10_A396EmprCod ;
   private short[] T017K10_A10243Jt_codigo ;
   private java.util.Date[] T017K10_A10249Jt_Dia ;
   private java.util.Date[] T017K5_A10249Jt_Dia ;
   private String[] T017K5_A396EmprCod ;
   private short[] T017K5_A10243Jt_codigo ;
   private String[] T017K11_A396EmprCod ;
   private short[] T017K11_A10243Jt_codigo ;
   private java.util.Date[] T017K11_A10249Jt_Dia ;
   private String[] T017K12_A396EmprCod ;
   private short[] T017K12_A10243Jt_codigo ;
   private java.util.Date[] T017K12_A10249Jt_Dia ;
   private java.util.Date[] T017K4_A10249Jt_Dia ;
   private String[] T017K4_A396EmprCod ;
   private short[] T017K4_A10243Jt_codigo ;
   private String[] T017K15_A10244Jt_Desc ;
   private boolean[] T017K15_n10244Jt_Desc ;
   private String[] T017K16_A396EmprCod ;
   private short[] T017K16_A10243Jt_codigo ;
   private java.util.Date[] T017K16_A10249Jt_Dia ;
   private String[] T017K17_A396EmprCod ;
   private short[] T017K17_A10243Jt_codigo ;
   private java.util.Date[] T017K17_A10249Jt_Dia ;
   private short[] T017K17_A10250Jt_linea ;
   private String[] T017K17_A10251Jt_prd ;
   private boolean[] T017K17_n10251Jt_prd ;
   private String[] T017K17_A10252Jt_PrdD ;
   private boolean[] T017K17_n10252Jt_PrdD ;
   private java.math.BigDecimal[] T017K17_A10253Jt_MnCant ;
   private boolean[] T017K17_n10253Jt_MnCant ;
   private java.math.BigDecimal[] T017K17_A10254Jt_Cant ;
   private boolean[] T017K17_n10254Jt_Cant ;
   private java.math.BigDecimal[] T017K17_A10255Jt_CantA ;
   private boolean[] T017K17_n10255Jt_CantA ;
   private String[] T017K18_A396EmprCod ;
   private short[] T017K18_A10243Jt_codigo ;
   private java.util.Date[] T017K18_A10249Jt_Dia ;
   private short[] T017K18_A10250Jt_linea ;
   private String[] T017K3_A396EmprCod ;
   private short[] T017K3_A10243Jt_codigo ;
   private java.util.Date[] T017K3_A10249Jt_Dia ;
   private short[] T017K3_A10250Jt_linea ;
   private String[] T017K3_A10251Jt_prd ;
   private boolean[] T017K3_n10251Jt_prd ;
   private String[] T017K3_A10252Jt_PrdD ;
   private boolean[] T017K3_n10252Jt_PrdD ;
   private java.math.BigDecimal[] T017K3_A10253Jt_MnCant ;
   private boolean[] T017K3_n10253Jt_MnCant ;
   private java.math.BigDecimal[] T017K3_A10254Jt_Cant ;
   private boolean[] T017K3_n10254Jt_Cant ;
   private java.math.BigDecimal[] T017K3_A10255Jt_CantA ;
   private boolean[] T017K3_n10255Jt_CantA ;
   private String[] T017K2_A396EmprCod ;
   private short[] T017K2_A10243Jt_codigo ;
   private java.util.Date[] T017K2_A10249Jt_Dia ;
   private short[] T017K2_A10250Jt_linea ;
   private String[] T017K2_A10251Jt_prd ;
   private boolean[] T017K2_n10251Jt_prd ;
   private String[] T017K2_A10252Jt_PrdD ;
   private boolean[] T017K2_n10252Jt_PrdD ;
   private java.math.BigDecimal[] T017K2_A10253Jt_MnCant ;
   private boolean[] T017K2_n10253Jt_MnCant ;
   private java.math.BigDecimal[] T017K2_A10254Jt_Cant ;
   private boolean[] T017K2_n10254Jt_Cant ;
   private java.math.BigDecimal[] T017K2_A10255Jt_CantA ;
   private boolean[] T017K2_n10255Jt_CantA ;
   private String[] T017K22_A396EmprCod ;
   private short[] T017K22_A10243Jt_codigo ;
   private java.util.Date[] T017K22_A10249Jt_Dia ;
   private short[] T017K22_A10250Jt_linea ;
   private String[] T017K23_A407EmprNom ;
   private boolean[] T017K23_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tjota02__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota02__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota02__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota02__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tjota02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T017K2", "SELECT EmprCod, Jt_codigo, Jt_Dia, Jt_linea, Jt_prd, Jt_PrdD, Jt_MnCant, Jt_Cant, Jt_CantA FROM TXPJOTA03 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? AND Jt_linea = ?  FOR UPDATE OF Jt_prd, Jt_PrdD, Jt_MnCant, Jt_Cant, Jt_CantA NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K3", "SELECT EmprCod, Jt_codigo, Jt_Dia, Jt_linea, Jt_prd, Jt_PrdD, Jt_MnCant, Jt_Cant, Jt_CantA FROM TXPJOTA03 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? AND Jt_linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K4", "SELECT Jt_Dia, EmprCod, Jt_codigo FROM TXPJOTA02 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ?  FOR UPDATE OF Jt_Dia NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K5", "SELECT Jt_Dia, EmprCod, Jt_codigo FROM TXPJOTA02 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K7", "SELECT Jt_Desc FROM TXPJOTA00 WHERE EmprCod = ? AND Jt_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Jt_Dia, T2.EmprNom, T3.Jt_Desc, TM1.EmprCod, TM1.Jt_codigo FROM ((TXPJOTA02 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPJOTA00 T3 ON T3.EmprCod = TM1.EmprCod AND T3.Jt_codigo = TM1.Jt_codigo) WHERE TM1.EmprCod = ? and TM1.Jt_codigo = ? and TM1.Jt_Dia = ? ORDER BY TM1.EmprCod, TM1.Jt_codigo, TM1.Jt_Dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K9", "SELECT Jt_Desc FROM TXPJOTA00 WHERE EmprCod = ? AND Jt_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Jt_codigo, Jt_Dia FROM TXPJOTA02 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Jt_codigo, Jt_Dia FROM TXPJOTA02 WHERE ( Jt_codigo > ? or Jt_codigo = ? and Jt_Dia > ?) and EmprCod = ? ORDER BY EmprCod, Jt_codigo, Jt_Dia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T017K12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Jt_codigo, Jt_Dia FROM TXPJOTA02 WHERE ( Jt_codigo < ? or Jt_codigo = ? and Jt_Dia < ?) and EmprCod = ? ORDER BY EmprCod DESC, Jt_codigo DESC, Jt_Dia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T017K13", "INSERT INTO TXPJOTA02(Jt_Dia, EmprCod, Jt_codigo) VALUES(?, ?, ?)", GX_NOMASK, "TXPJOTA02")
         ,new UpdateCursor("T017K14", "DELETE FROM TXPJOTA02  WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ?", GX_NOMASK, "TXPJOTA02")
         ,new ForEachCursor("T017K15", "SELECT Jt_Desc FROM TXPJOTA00 WHERE EmprCod = ? AND Jt_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Jt_codigo, Jt_Dia FROM TXPJOTA02 WHERE EmprCod = ? ORDER BY EmprCod, Jt_codigo, Jt_Dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K17", "SELECT EmprCod, Jt_codigo, Jt_Dia, Jt_linea, Jt_prd, Jt_PrdD, Jt_MnCant, Jt_Cant, Jt_CantA FROM TXPJOTA03 WHERE EmprCod = ? and Jt_codigo = ? and Jt_Dia = ? and Jt_linea = ? ORDER BY EmprCod, Jt_codigo, Jt_Dia, Jt_linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K18", "SELECT EmprCod, Jt_codigo, Jt_Dia, Jt_linea FROM TXPJOTA03 WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? AND Jt_linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T017K19", "INSERT INTO TXPJOTA03(EmprCod, Jt_codigo, Jt_Dia, Jt_linea, Jt_prd, Jt_PrdD, Jt_MnCant, Jt_Cant, Jt_CantA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPJOTA03")
         ,new UpdateCursor("T017K20", "UPDATE TXPJOTA03 SET Jt_prd=?, Jt_PrdD=?, Jt_MnCant=?, Jt_Cant=?, Jt_CantA=?  WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? AND Jt_linea = ?", GX_NOMASK, "TXPJOTA03")
         ,new UpdateCursor("T017K21", "DELETE FROM TXPJOTA03  WHERE EmprCod = ? AND Jt_codigo = ? AND Jt_Dia = ? AND Jt_linea = ?", GX_NOMASK, "TXPJOTA03")
         ,new ForEachCursor("T017K22", "SELECT EmprCod, Jt_codigo, Jt_Dia, Jt_linea FROM TXPJOTA03 WHERE EmprCod = ? and Jt_codigo = ? and Jt_Dia = ? ORDER BY EmprCod, Jt_codigo, Jt_Dia, Jt_linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T017K23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(9,4);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 26);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 4);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 4);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[13], 4);
               }
               return;
            case 18 :
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 4);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 4);
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               stmt.setDate(8, (java.util.Date)parms[12]);
               stmt.setShort(9, ((Number) parms[13]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

