package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class topbcch_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_3") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13465BCNumeroOP = (int)(GXutil.lval( httpContext.GetPar( "BCNumeroOP"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A13465BCNumeroOP) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13478BCProducto = httpContext.GetPar( "BCProducto") ;
         n13478BCProducto = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A13478BCProducto) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consumos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBCNumeroOP_Internalname ;
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

   public topbcch_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public topbcch_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( topbcch_impl.class ));
   }

   public topbcch_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TOPBCCH.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "NumeroOP", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCNumeroOP_Internalname, GXutil.ltrim( localUtil.ntoc( A13465BCNumeroOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCNumeroOP_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13465BCNumeroOP), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13465BCNumeroOP), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCNumeroOP_Jsonclick, 0, "", "", "", "", "", 1, edtBCNumeroOP_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtBCFecCierr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCFecCierr_Internalname, localUtil.format(A13500BCFecCierr, "99/99/99"), localUtil.format( A13500BCFecCierr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCFecCierr_Jsonclick, 0, "", "", "", "", "", 1, edtBCFecCierr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCH.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBCFecCierr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBCFecCierr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TOPBCCH.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Numero", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TOPBCCH.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBCNumero_Internalname, GXutil.ltrim( localUtil.ntoc( A13501BCNumero, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBCNumero_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13501BCNumero), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13501BCNumero), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBCNumero_Jsonclick, 0, "", "", "", "", "", 1, edtBCNumero_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
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
         nBlankRcdCount1850 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1850 = (short)(1) ;
            scanStart1OF1850( ) ;
            while ( RcdFound1850 != 0 )
            {
               init_level_properties1850( ) ;
               getByPrimaryKey1OF1850( ) ;
               addRow1OF1850( ) ;
               scanNext1OF1850( ) ;
            }
            scanEnd1OF1850( ) ;
            nBlankRcdCount1850 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OF1850( ) ;
         standaloneModal1OF1850( ) ;
         sMode1850 = Gx_mode ;
         while ( nGXsfl_45_idx < nRC_GXsfl_45 )
         {
            bGXsfl_45_Refreshing = true ;
            readRow1OF1850( ) ;
            edtavnRcdDeleted_1850_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1850_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1850_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1850_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCLINEA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCLinea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCProducto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPRODUCTO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCCantidad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCANTIDAD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCCantidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCantidad_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCPrecioCi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPRECIOCI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCPrecioCi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPrecioCi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCCProcesa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCPROCESA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCCProcesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCProcesa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCCError_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCERROR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCCError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCError_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCCDescErr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCDESCERR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCCDescErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCDescErr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCCFecErr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCFECERR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCCFecErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFecErr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            edtBCCPila_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCPILA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBCCPila_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPila_Enabled), 5, 0), !bGXsfl_45_Refreshing);
            if ( ( nRcdExists_1850 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OF1850( ) ;
            }
            sendRow1OF1850( ) ;
            bGXsfl_45_Refreshing = false ;
         }
         Gx_mode = sMode1850 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1850 = (short)(5) ;
         nRcdExists_1850 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OF1850( ) ;
            while ( RcdFound1850 != 0 )
            {
               sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_451850( ) ;
               init_level_properties1850( ) ;
               standaloneNotModal1OF1850( ) ;
               getByPrimaryKey1OF1850( ) ;
               standaloneModal1OF1850( ) ;
               addRow1OF1850( ) ;
               scanNext1OF1850( ) ;
            }
            scanEnd1OF1850( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1850 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_451850( ) ;
      initAll1OF1850( ) ;
      init_level_properties1850( ) ;
      nRcdExists_1850 = (short)(0) ;
      nIsMod_1850 = (short)(0) ;
      nRcdDeleted_1850 = (short)(0) ;
      nBlankRcdCount1850 = (short)(nBlankRcdUsr1850+nBlankRcdCount1850) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1850 > 0 )
      {
         standaloneNotModal1OF1850( ) ;
         standaloneModal1OF1850( ) ;
         addRow1OF1850( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBCLinea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1850 = (short)(nBlankRcdCount1850-1) ;
      }
      Gx_mode = sMode1850 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TOPBCCH.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TOPBCCH.htm");
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
      e111OF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z13465BCNumeroOP = (int)(localUtil.ctol( httpContext.cgiGet( "Z13465BCNumeroOP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13500BCFecCierr = localUtil.ctod( httpContext.cgiGet( "Z13500BCFecCierr"), 0) ;
            Z13501BCNumero = (short)(localUtil.ctol( httpContext.cgiGet( "Z13501BCNumero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_45 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_45"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCNUMEROOP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13465BCNumeroOP = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            }
            else
            {
               A13465BCNumeroOP = (int)(localUtil.ctol( httpContext.cgiGet( edtBCNumeroOP_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtBCFecCierr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "BCFECCIERR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCFecCierr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13500BCFecCierr = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
            }
            else
            {
               A13500BCFecCierr = localUtil.ctod( httpContext.cgiGet( edtBCFecCierr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCNumero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BCNUMERO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBCNumero_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13501BCNumero = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
            }
            else
            {
               A13501BCNumero = (short)(localUtil.ctol( httpContext.cgiGet( edtBCNumero_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
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
               A13465BCNumeroOP = (int)(GXutil.lval( httpContext.GetPar( "BCNumeroOP"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
               A13500BCFecCierr = localUtil.parseDateParm( httpContext.GetPar( "BCFecCierr")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
               A13501BCNumero = (short)(GXutil.lval( httpContext.GetPar( "BCNumero"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
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
                        e111OF2 ();
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
            initAll1OF1849( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1850_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1850_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      disableAttributes1OF1849( ) ;
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

   public void confirm_1OF0( )
   {
      beforeValidate1OF1849( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OF1849( ) ;
         }
         else
         {
            checkExtendedTable1OF1849( ) ;
            if ( AnyError == 0 )
            {
               zm1OF1849( 2) ;
               zm1OF1849( 3) ;
            }
            closeExtendedTableCursors1OF1849( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1849 = Gx_mode ;
         confirm_1OF1850( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1849 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1849 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1OF0( ) ;
      }
   }

   public void confirm_1OF1850( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1OF1850( ) ;
         if ( ( nRcdExists_1850 != 0 ) || ( nIsMod_1850 != 0 ) )
         {
            getKey1OF1850( ) ;
            if ( ( nRcdExists_1850 == 0 ) && ( nRcdDeleted_1850 == 0 ) )
            {
               if ( RcdFound1850 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OF1850( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OF1850( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1OF1850( 5) ;
                     }
                     closeExtendedTableCursors1OF1850( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BCLINEA_" + sGXsfl_45_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBCLinea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1850 != 0 )
               {
                  if ( nRcdDeleted_1850 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OF1850( ) ;
                     load1OF1850( ) ;
                     beforeValidate1OF1850( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OF1850( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1850 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OF1850( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OF1850( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1OF1850( 5) ;
                           }
                           closeExtendedTableCursors1OF1850( ) ;
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
                  if ( nRcdDeleted_1850 == 0 )
                  {
                     GXCCtl = "BCLINEA_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBCLinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1850_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13502BCLinea, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCProducto_Internalname, GXutil.rtrim( A13478BCProducto)) ;
         httpContext.changePostValue( edtBCCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A13503BCCantidad, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCPrecioCi_Internalname, GXutil.ltrim( localUtil.ntoc( A13504BCPrecioCi, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCCProcesa_Internalname, GXutil.ltrim( localUtil.ntoc( A13505BCCProcesa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCCError_Internalname, GXutil.ltrim( localUtil.ntoc( A13506BCCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCCDescErr_Internalname, A13507BCCDescErr) ;
         httpContext.changePostValue( edtBCCFecErr_Internalname, localUtil.ttoc( A13508BCCFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBCCPila_Internalname, A13509BCCPila) ;
         httpContext.changePostValue( "ZT_"+"Z13502BCLinea_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13502BCLinea, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13503BCCantidad_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13503BCCantidad, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13504BCPrecioCi_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13504BCPrecioCi, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13505BCCProcesa_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13505BCCProcesa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13506BCCError_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13506BCCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13507BCCDescErr_"+sGXsfl_45_idx, Z13507BCCDescErr) ;
         httpContext.changePostValue( "ZT_"+"Z13508BCCFecErr_"+sGXsfl_45_idx, localUtil.ttoc( Z13508BCCFecErr, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13509BCCPila_"+sGXsfl_45_idx, Z13509BCCPila) ;
         httpContext.changePostValue( "ZT_"+"Z13478BCProducto_"+sGXsfl_45_idx, GXutil.rtrim( Z13478BCProducto)) ;
         httpContext.changePostValue( "nRcdDeleted_1850_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1850_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1850_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1850 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1850_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1850_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCLINEA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPRODUCTO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCProducto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCANTIDAD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCantidad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPRECIOCI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPrecioCi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCPROCESA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCProcesa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCERROR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCError_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCDESCERR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCDescErr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCFECERR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCFecErr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCPILA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCPila_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1OF0( )
   {
   }

   public void e111OF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      topbcch_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      topbcch_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      topbcch_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      topbcch_impl.this.A396EmprCod = GXv_char2[0] ;
      topbcch_impl.this.AV11EmprNom = GXv_char3[0] ;
      topbcch_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1OF1849( int GX_JID )
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
         Z13500BCFecCierr = A13500BCFecCierr ;
         Z13501BCNumero = A13501BCNumero ;
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TOPBCCH" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01OF7 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OF7_A407EmprNom[0] ;
      n407EmprNom = T01OF7_n407EmprNom[0] ;
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

   public void load1OF1849( )
   {
      /* Using cursor T01OF9 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1849 = (short)(1) ;
         A407EmprNom = T01OF9_A407EmprNom[0] ;
         n407EmprNom = T01OF9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm1OF1849( -1) ;
      }
      pr_default.close(6);
      onLoadActions1OF1849( ) ;
   }

   public void onLoadActions1OF1849( )
   {
   }

   public void checkExtendedTable1OF1849( )
   {
      nIsDirty_1849 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01OF8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1OF1849( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A13465BCNumeroOP )
   {
      /* Using cursor T01OF10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1OF1849( )
   {
      /* Using cursor T01OF11 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1849 = (short)(1) ;
      }
      else
      {
         RcdFound1849 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OF6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01OF6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OF1849( 1) ;
         RcdFound1849 = (short)(1) ;
         A13500BCFecCierr = T01OF6_A13500BCFecCierr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
         A13501BCNumero = T01OF6_A13501BCNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
         A13465BCNumeroOP = T01OF6_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13500BCFecCierr = A13500BCFecCierr ;
         Z13501BCNumero = A13501BCNumero ;
         sMode1849 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OF1849( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1849 = (short)(0) ;
            initializeNonKey1OF1849( ) ;
         }
         Gx_mode = sMode1849 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1849 = (short)(0) ;
         initializeNonKey1OF1849( ) ;
         sMode1849 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1849 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1OF1849( ) ;
      if ( RcdFound1849 == 0 )
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
      RcdFound1849 = (short)(0) ;
      /* Using cursor T01OF12 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A13465BCNumeroOP), Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, A13500BCFecCierr, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13501BCNumero), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01OF12_A13465BCNumeroOP[0] < A13465BCNumeroOP ) || ( T01OF12_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && GXutil.resetTime(T01OF12_A13500BCFecCierr[0]).before( GXutil.resetTime( A13500BCFecCierr )) || GXutil.dateCompare(GXutil.resetTime(T01OF12_A13500BCFecCierr[0]), GXutil.resetTime(A13500BCFecCierr)) && ( T01OF12_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( T01OF12_A13501BCNumero[0] < A13501BCNumero ) ) && ( GXutil.strcmp(T01OF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01OF12_A13465BCNumeroOP[0] > A13465BCNumeroOP ) || ( T01OF12_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && GXutil.resetTime(T01OF12_A13500BCFecCierr[0]).after( GXutil.resetTime( A13500BCFecCierr )) || GXutil.dateCompare(GXutil.resetTime(T01OF12_A13500BCFecCierr[0]), GXutil.resetTime(A13500BCFecCierr)) && ( T01OF12_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( T01OF12_A13501BCNumero[0] > A13501BCNumero ) ) && ( GXutil.strcmp(T01OF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13465BCNumeroOP = T01OF12_A13465BCNumeroOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            A13500BCFecCierr = T01OF12_A13500BCFecCierr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
            A13501BCNumero = T01OF12_A13501BCNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
            RcdFound1849 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1849 = (short)(0) ;
      /* Using cursor T01OF13 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A13465BCNumeroOP), Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, A13500BCFecCierr, Integer.valueOf(A13465BCNumeroOP), Short.valueOf(A13501BCNumero), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01OF13_A13465BCNumeroOP[0] > A13465BCNumeroOP ) || ( T01OF13_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && GXutil.resetTime(T01OF13_A13500BCFecCierr[0]).after( GXutil.resetTime( A13500BCFecCierr )) || GXutil.dateCompare(GXutil.resetTime(T01OF13_A13500BCFecCierr[0]), GXutil.resetTime(A13500BCFecCierr)) && ( T01OF13_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( T01OF13_A13501BCNumero[0] > A13501BCNumero ) ) && ( GXutil.strcmp(T01OF13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01OF13_A13465BCNumeroOP[0] < A13465BCNumeroOP ) || ( T01OF13_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && GXutil.resetTime(T01OF13_A13500BCFecCierr[0]).before( GXutil.resetTime( A13500BCFecCierr )) || GXutil.dateCompare(GXutil.resetTime(T01OF13_A13500BCFecCierr[0]), GXutil.resetTime(A13500BCFecCierr)) && ( T01OF13_A13465BCNumeroOP[0] == A13465BCNumeroOP ) && ( T01OF13_A13501BCNumero[0] < A13501BCNumero ) ) && ( GXutil.strcmp(T01OF13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A13465BCNumeroOP = T01OF13_A13465BCNumeroOP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            A13500BCFecCierr = T01OF13_A13500BCFecCierr[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
            A13501BCNumero = T01OF13_A13501BCNumero[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
            RcdFound1849 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OF1849( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBCNumeroOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OF1849( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1849 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || !( GXutil.dateCompare(GXutil.resetTime(A13500BCFecCierr), GXutil.resetTime(Z13500BCFecCierr)) ) || ( A13501BCNumero != Z13501BCNumero ) )
            {
               A13465BCNumeroOP = Z13465BCNumeroOP ;
               httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
               A13500BCFecCierr = Z13500BCFecCierr ;
               httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
               A13501BCNumero = Z13501BCNumero ;
               httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1OF1849( ) ;
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || !( GXutil.dateCompare(GXutil.resetTime(A13500BCFecCierr), GXutil.resetTime(Z13500BCFecCierr)) ) || ( A13501BCNumero != Z13501BCNumero ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBCNumeroOP_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OF1849( ) ;
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
                  GX_FocusControl = edtBCNumeroOP_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OF1849( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || !( GXutil.dateCompare(GXutil.resetTime(A13500BCFecCierr), GXutil.resetTime(Z13500BCFecCierr)) ) || ( A13501BCNumero != Z13501BCNumero ) )
      {
         A13465BCNumeroOP = Z13465BCNumeroOP ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13500BCFecCierr = Z13500BCFecCierr ;
         httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
         A13501BCNumero = Z13501BCNumero ;
         httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
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
      getKey1OF1849( ) ;
      if ( RcdFound1849 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || !( GXutil.dateCompare(GXutil.resetTime(A13500BCFecCierr), GXutil.resetTime(Z13500BCFecCierr)) ) || ( A13501BCNumero != Z13501BCNumero ) )
         {
            A13465BCNumeroOP = Z13465BCNumeroOP ;
            httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
            A13500BCFecCierr = Z13500BCFecCierr ;
            httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
            A13501BCNumero = Z13501BCNumero ;
            httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A13465BCNumeroOP != Z13465BCNumeroOP ) || !( GXutil.dateCompare(GXutil.resetTime(A13500BCFecCierr), GXutil.resetTime(Z13500BCFecCierr)) ) || ( A13501BCNumero != Z13501BCNumero ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "topbcch");
   }

   public void insert_check( )
   {
      confirm_1OF0( ) ;
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
      if ( RcdFound1849 == 0 )
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
      scanStart1OF1849( ) ;
      if ( RcdFound1849 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1OF1849( ) ;
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
      if ( RcdFound1849 == 0 )
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
      if ( RcdFound1849 == 0 )
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
      scanStart1OF1849( ) ;
      if ( RcdFound1849 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1849 != 0 )
         {
            scanNext1OF1849( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1OF1849( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OF1849( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OF5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCCH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPBCCH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OF1849( )
   {
      beforeValidate1OF1849( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OF1849( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OF1849( 0) ;
         checkOptimisticConcurrency1OF1849( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OF1849( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OF1849( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OF14 */
                  pr_default.execute(11, new Object[] {A13500BCFecCierr, Short.valueOf(A13501BCNumero), A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCH");
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
                        processLevel1OF1849( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1OF0( ) ;
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
            load1OF1849( ) ;
         }
         endLevel1OF1849( ) ;
      }
      closeExtendedTableCursors1OF1849( ) ;
   }

   public void update1OF1849( )
   {
      beforeValidate1OF1849( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OF1849( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OF1849( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OF1849( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OF1849( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPOPBCCH */
                  deferredUpdate1OF1849( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OF1849( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1OF0( ) ;
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
         endLevel1OF1849( ) ;
      }
      closeExtendedTableCursors1OF1849( ) ;
   }

   public void deferredUpdate1OF1849( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OF1849( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OF1849( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OF1849( ) ;
         afterConfirm1OF1849( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OF1849( ) ;
            if ( AnyError == 0 )
            {
               scanStart1OF1850( ) ;
               while ( RcdFound1850 != 0 )
               {
                  getByPrimaryKey1OF1850( ) ;
                  delete1OF1850( ) ;
                  scanNext1OF1850( ) ;
               }
               scanEnd1OF1850( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OF15 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCH");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1849 == 0 )
                        {
                           initAll1OF1849( ) ;
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
                        resetCaption1OF0( ) ;
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
      sMode1849 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OF1849( ) ;
      Gx_mode = sMode1849 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OF1849( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1OF1850( )
   {
      nGXsfl_45_idx = 0 ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         readRow1OF1850( ) ;
         if ( ( nRcdExists_1850 != 0 ) || ( nIsMod_1850 != 0 ) )
         {
            standaloneNotModal1OF1850( ) ;
            getKey1OF1850( ) ;
            if ( ( nRcdExists_1850 == 0 ) && ( nRcdDeleted_1850 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OF1850( ) ;
            }
            else
            {
               if ( RcdFound1850 != 0 )
               {
                  if ( ( nRcdDeleted_1850 != 0 ) && ( nRcdExists_1850 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OF1850( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1850 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OF1850( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1850 == 0 )
                  {
                     GXCCtl = "BCLINEA_" + sGXsfl_45_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBCLinea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1850_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCLinea_Internalname, GXutil.ltrim( localUtil.ntoc( A13502BCLinea, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCProducto_Internalname, GXutil.rtrim( A13478BCProducto)) ;
         httpContext.changePostValue( edtBCCantidad_Internalname, GXutil.ltrim( localUtil.ntoc( A13503BCCantidad, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCPrecioCi_Internalname, GXutil.ltrim( localUtil.ntoc( A13504BCPrecioCi, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCCProcesa_Internalname, GXutil.ltrim( localUtil.ntoc( A13505BCCProcesa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCCError_Internalname, GXutil.ltrim( localUtil.ntoc( A13506BCCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBCCDescErr_Internalname, A13507BCCDescErr) ;
         httpContext.changePostValue( edtBCCFecErr_Internalname, localUtil.ttoc( A13508BCCFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtBCCPila_Internalname, A13509BCCPila) ;
         httpContext.changePostValue( "ZT_"+"Z13502BCLinea_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13502BCLinea, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13503BCCantidad_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13503BCCantidad, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13504BCPrecioCi_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13504BCPrecioCi, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13505BCCProcesa_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13505BCCProcesa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13506BCCError_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( Z13506BCCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13507BCCDescErr_"+sGXsfl_45_idx, Z13507BCCDescErr) ;
         httpContext.changePostValue( "ZT_"+"Z13508BCCFecErr_"+sGXsfl_45_idx, localUtil.ttoc( Z13508BCCFecErr, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z13509BCCPila_"+sGXsfl_45_idx, Z13509BCCPila) ;
         httpContext.changePostValue( "ZT_"+"Z13478BCProducto_"+sGXsfl_45_idx, GXutil.rtrim( Z13478BCProducto)) ;
         httpContext.changePostValue( "nRcdDeleted_1850_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1850_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1850_"+sGXsfl_45_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1850 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1850_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1850_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCLINEA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCLinea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPRODUCTO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCProducto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCANTIDAD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCantidad_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCPRECIOCI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPrecioCi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCPROCESA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCProcesa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCERROR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCError_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCDESCERR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCDescErr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCFECERR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCFecErr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BCCPILA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCPila_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OF1850( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1850 = (short)(0) ;
      nIsMod_1850 = (short)(0) ;
      nRcdDeleted_1850 = (short)(0) ;
   }

   public void processLevel1OF1849( )
   {
      /* Save parent mode. */
      sMode1849 = Gx_mode ;
      processNestedLevel1OF1850( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1849 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1OF1849( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OF1849( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "topbcch");
         if ( AnyError == 0 )
         {
            confirmValues1OF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "topbcch");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OF1849( )
   {
      /* Scan By routine */
      /* Using cursor T01OF16 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1849 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1849 = (short)(1) ;
         A13465BCNumeroOP = T01OF16_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13500BCFecCierr = T01OF16_A13500BCFecCierr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
         A13501BCNumero = T01OF16_A13501BCNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OF1849( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1849 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1849 = (short)(1) ;
         A13465BCNumeroOP = T01OF16_A13465BCNumeroOP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
         A13500BCFecCierr = T01OF16_A13500BCFecCierr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
         A13501BCNumero = T01OF16_A13501BCNumero[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
      }
   }

   public void scanEnd1OF1849( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1OF1849( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OF1849( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OF1849( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OF1849( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OF1849( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OF1849( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OF1849( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBCNumeroOP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCNumeroOP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCNumeroOP_Enabled), 5, 0), true);
      edtBCFecCierr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCFecCierr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCFecCierr_Enabled), 5, 0), true);
      edtBCNumero_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCNumero_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCNumero_Enabled), 5, 0), true);
   }

   public void zm1OF1850( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13503BCCantidad = T01OF3_A13503BCCantidad[0] ;
            Z13504BCPrecioCi = T01OF3_A13504BCPrecioCi[0] ;
            Z13505BCCProcesa = T01OF3_A13505BCCProcesa[0] ;
            Z13506BCCError = T01OF3_A13506BCCError[0] ;
            Z13507BCCDescErr = T01OF3_A13507BCCDescErr[0] ;
            Z13508BCCFecErr = T01OF3_A13508BCCFecErr[0] ;
            Z13509BCCPila = T01OF3_A13509BCCPila[0] ;
            Z13478BCProducto = T01OF3_A13478BCProducto[0] ;
         }
         else
         {
            Z13503BCCantidad = A13503BCCantidad ;
            Z13504BCPrecioCi = A13504BCPrecioCi ;
            Z13505BCCProcesa = A13505BCCProcesa ;
            Z13506BCCError = A13506BCCError ;
            Z13507BCCDescErr = A13507BCCDescErr ;
            Z13508BCCFecErr = A13508BCCFecErr ;
            Z13509BCCPila = A13509BCCPila ;
            Z13478BCProducto = A13478BCProducto ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13500BCFecCierr = A13500BCFecCierr ;
         Z13501BCNumero = A13501BCNumero ;
         Z13502BCLinea = A13502BCLinea ;
         Z13503BCCantidad = A13503BCCantidad ;
         Z13504BCPrecioCi = A13504BCPrecioCi ;
         Z13505BCCProcesa = A13505BCCProcesa ;
         Z13506BCCError = A13506BCCError ;
         Z13507BCCDescErr = A13507BCCDescErr ;
         Z13508BCCFecErr = A13508BCCFecErr ;
         Z13509BCCPila = A13509BCCPila ;
         Z396EmprCod = A396EmprCod ;
         Z13478BCProducto = A13478BCProducto ;
      }
   }

   public void standaloneNotModal1OF1850( )
   {
   }

   public void standaloneModal1OF1850( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBCLinea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCLinea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
      else
      {
         edtBCLinea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCLinea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      }
   }

   public void load1OF1850( )
   {
      /* Using cursor T01OF17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1850 = (short)(1) ;
         A13503BCCantidad = T01OF17_A13503BCCantidad[0] ;
         n13503BCCantidad = T01OF17_n13503BCCantidad[0] ;
         A13504BCPrecioCi = T01OF17_A13504BCPrecioCi[0] ;
         n13504BCPrecioCi = T01OF17_n13504BCPrecioCi[0] ;
         A13505BCCProcesa = T01OF17_A13505BCCProcesa[0] ;
         n13505BCCProcesa = T01OF17_n13505BCCProcesa[0] ;
         A13506BCCError = T01OF17_A13506BCCError[0] ;
         n13506BCCError = T01OF17_n13506BCCError[0] ;
         A13507BCCDescErr = T01OF17_A13507BCCDescErr[0] ;
         n13507BCCDescErr = T01OF17_n13507BCCDescErr[0] ;
         A13508BCCFecErr = T01OF17_A13508BCCFecErr[0] ;
         n13508BCCFecErr = T01OF17_n13508BCCFecErr[0] ;
         A13509BCCPila = T01OF17_A13509BCCPila[0] ;
         n13509BCCPila = T01OF17_n13509BCCPila[0] ;
         A13478BCProducto = T01OF17_A13478BCProducto[0] ;
         n13478BCProducto = T01OF17_n13478BCProducto[0] ;
         zm1OF1850( -4) ;
      }
      pr_default.close(14);
      onLoadActions1OF1850( ) ;
   }

   public void onLoadActions1OF1850( )
   {
   }

   public void checkExtendedTable1OF1850( )
   {
      nIsDirty_1850 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OF1850( ) ;
      /* Using cursor T01OF4 */
      pr_ekamat.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(0) == 101) )
      {
         GXCCtl = "BCPRODUCTO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_ekamat.close(0);
   }

   public void closeExtendedTableCursors1OF1850( )
   {
      pr_ekamat.close(0);
   }

   public void enableDisable1OF1850( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         String A13478BCProducto )
   {
      /* Using cursor T01OF18 */
      pr_ekamat.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(1) == 101) )
      {
         GXCCtl = "BCPRODUCTO_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_ekamat.getStatus(1) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_ekamat.close(1);
   }

   public void getKey1OF1850( )
   {
      /* Using cursor T01OF19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1850 = (short)(1) ;
      }
      else
      {
         RcdFound1850 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1OF1850( )
   {
      /* Using cursor T01OF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OF1850( 4) ;
         RcdFound1850 = (short)(1) ;
         initializeNonKey1OF1850( ) ;
         A13502BCLinea = T01OF3_A13502BCLinea[0] ;
         A13503BCCantidad = T01OF3_A13503BCCantidad[0] ;
         n13503BCCantidad = T01OF3_n13503BCCantidad[0] ;
         A13504BCPrecioCi = T01OF3_A13504BCPrecioCi[0] ;
         n13504BCPrecioCi = T01OF3_n13504BCPrecioCi[0] ;
         A13505BCCProcesa = T01OF3_A13505BCCProcesa[0] ;
         n13505BCCProcesa = T01OF3_n13505BCCProcesa[0] ;
         A13506BCCError = T01OF3_A13506BCCError[0] ;
         n13506BCCError = T01OF3_n13506BCCError[0] ;
         A13507BCCDescErr = T01OF3_A13507BCCDescErr[0] ;
         n13507BCCDescErr = T01OF3_n13507BCCDescErr[0] ;
         A13508BCCFecErr = T01OF3_A13508BCCFecErr[0] ;
         n13508BCCFecErr = T01OF3_n13508BCCFecErr[0] ;
         A13509BCCPila = T01OF3_A13509BCCPila[0] ;
         n13509BCCPila = T01OF3_n13509BCCPila[0] ;
         A13478BCProducto = T01OF3_A13478BCProducto[0] ;
         n13478BCProducto = T01OF3_n13478BCProducto[0] ;
         Z396EmprCod = A396EmprCod ;
         Z13465BCNumeroOP = A13465BCNumeroOP ;
         Z13500BCFecCierr = A13500BCFecCierr ;
         Z13501BCNumero = A13501BCNumero ;
         Z13502BCLinea = A13502BCLinea ;
         sMode1850 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OF1850( ) ;
         load1OF1850( ) ;
         Gx_mode = sMode1850 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1850 = (short)(0) ;
         initializeNonKey1OF1850( ) ;
         sMode1850 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OF1850( ) ;
         Gx_mode = sMode1850 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OF1850( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1OF1850( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCCD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z13503BCCantidad, T01OF2_A13503BCCantidad[0]) != 0 ) || ( DecimalUtil.compareTo(Z13504BCPrecioCi, T01OF2_A13504BCPrecioCi[0]) != 0 ) || ( Z13505BCCProcesa != T01OF2_A13505BCCProcesa[0] ) || ( Z13506BCCError != T01OF2_A13506BCCError[0] ) || ( GXutil.strcmp(Z13507BCCDescErr, T01OF2_A13507BCCDescErr[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z13508BCCFecErr, T01OF2_A13508BCCFecErr[0]) ) || ( GXutil.strcmp(Z13509BCCPila, T01OF2_A13509BCCPila[0]) != 0 ) || ( GXutil.strcmp(Z13478BCProducto, T01OF2_A13478BCProducto[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z13503BCCantidad, T01OF2_A13503BCCantidad[0]) != 0 )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCCantidad");
               GXutil.writeLogRaw("Old: ",Z13503BCCantidad);
               GXutil.writeLogRaw("Current: ",T01OF2_A13503BCCantidad[0]);
            }
            if ( DecimalUtil.compareTo(Z13504BCPrecioCi, T01OF2_A13504BCPrecioCi[0]) != 0 )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCPrecioCi");
               GXutil.writeLogRaw("Old: ",Z13504BCPrecioCi);
               GXutil.writeLogRaw("Current: ",T01OF2_A13504BCPrecioCi[0]);
            }
            if ( Z13505BCCProcesa != T01OF2_A13505BCCProcesa[0] )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCCProcesa");
               GXutil.writeLogRaw("Old: ",Z13505BCCProcesa);
               GXutil.writeLogRaw("Current: ",T01OF2_A13505BCCProcesa[0]);
            }
            if ( Z13506BCCError != T01OF2_A13506BCCError[0] )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCCError");
               GXutil.writeLogRaw("Old: ",Z13506BCCError);
               GXutil.writeLogRaw("Current: ",T01OF2_A13506BCCError[0]);
            }
            if ( GXutil.strcmp(Z13507BCCDescErr, T01OF2_A13507BCCDescErr[0]) != 0 )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCCDescErr");
               GXutil.writeLogRaw("Old: ",Z13507BCCDescErr);
               GXutil.writeLogRaw("Current: ",T01OF2_A13507BCCDescErr[0]);
            }
            if ( !( GXutil.dateCompare(Z13508BCCFecErr, T01OF2_A13508BCCFecErr[0]) ) )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCCFecErr");
               GXutil.writeLogRaw("Old: ",Z13508BCCFecErr);
               GXutil.writeLogRaw("Current: ",T01OF2_A13508BCCFecErr[0]);
            }
            if ( GXutil.strcmp(Z13509BCCPila, T01OF2_A13509BCCPila[0]) != 0 )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCCPila");
               GXutil.writeLogRaw("Old: ",Z13509BCCPila);
               GXutil.writeLogRaw("Current: ",T01OF2_A13509BCCPila[0]);
            }
            if ( GXutil.strcmp(Z13478BCProducto, T01OF2_A13478BCProducto[0]) != 0 )
            {
               GXutil.writeLogln("topbcch:[seudo value changed for attri]"+"BCProducto");
               GXutil.writeLogRaw("Old: ",Z13478BCProducto);
               GXutil.writeLogRaw("Current: ",T01OF2_A13478BCProducto[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOPBCCD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OF1850( )
   {
      beforeValidate1OF1850( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OF1850( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OF1850( 0) ;
         checkOptimisticConcurrency1OF1850( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OF1850( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OF1850( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OF20 */
                  pr_default.execute(16, new Object[] {Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea), Boolean.valueOf(n13503BCCantidad), A13503BCCantidad, Boolean.valueOf(n13504BCPrecioCi), A13504BCPrecioCi, Boolean.valueOf(n13505BCCProcesa), Short.valueOf(A13505BCCProcesa), Boolean.valueOf(n13506BCCError), Short.valueOf(A13506BCCError), Boolean.valueOf(n13507BCCDescErr), A13507BCCDescErr, Boolean.valueOf(n13508BCCFecErr), A13508BCCFecErr, Boolean.valueOf(n13509BCCPila), A13509BCCPila, A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCD");
                  if ( (pr_default.getStatus(16) == 1) )
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
            load1OF1850( ) ;
         }
         endLevel1OF1850( ) ;
      }
      closeExtendedTableCursors1OF1850( ) ;
   }

   public void update1OF1850( )
   {
      beforeValidate1OF1850( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OF1850( ) ;
      }
      if ( ( nIsMod_1850 != 0 ) || ( nIsDirty_1850 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OF1850( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OF1850( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OF1850( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OF21 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n13503BCCantidad), A13503BCCantidad, Boolean.valueOf(n13504BCPrecioCi), A13504BCPrecioCi, Boolean.valueOf(n13505BCCProcesa), Short.valueOf(A13505BCCProcesa), Boolean.valueOf(n13506BCCError), Short.valueOf(A13506BCCError), Boolean.valueOf(n13507BCCDescErr), A13507BCCDescErr, Boolean.valueOf(n13508BCCFecErr), A13508BCCFecErr, Boolean.valueOf(n13509BCCPila), A13509BCCPila, Boolean.valueOf(n13478BCProducto), A13478BCProducto, A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCD");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOPBCCD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OF1850( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OF1850( ) ;
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
            endLevel1OF1850( ) ;
         }
      }
      closeExtendedTableCursors1OF1850( ) ;
   }

   public void deferredUpdate1OF1850( )
   {
   }

   public void delete1OF1850( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OF1850( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OF1850( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OF1850( ) ;
         afterConfirm1OF1850( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OF1850( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OF22 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero), Integer.valueOf(A13502BCLinea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOPBCCD");
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
      sMode1850 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OF1850( ) ;
      Gx_mode = sMode1850 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OF1850( )
   {
      standaloneModal1OF1850( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OF1850( )
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

   public void scanStart1OF1850( )
   {
      /* Scan By routine */
      /* Using cursor T01OF23 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP), A13500BCFecCierr, Short.valueOf(A13501BCNumero)});
      RcdFound1850 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1850 = (short)(1) ;
         A13502BCLinea = T01OF23_A13502BCLinea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OF1850( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1850 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1850 = (short)(1) ;
         A13502BCLinea = T01OF23_A13502BCLinea[0] ;
      }
   }

   public void scanEnd1OF1850( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1OF1850( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OF1850( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OF1850( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OF1850( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OF1850( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OF1850( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OF1850( )
   {
      edtBCLinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCLinea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCProducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCProducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCProducto_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCCantidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCantidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCantidad_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCPrecioCi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCPrecioCi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCPrecioCi_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCCProcesa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCProcesa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCProcesa_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCCError_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCError_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCError_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCCDescErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCDescErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCDescErr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCCFecErr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCFecErr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCFecErr_Enabled), 5, 0), !bGXsfl_45_Refreshing);
      edtBCCPila_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCCPila_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCCPila_Enabled), 5, 0), !bGXsfl_45_Refreshing);
   }

   public void send_integrity_lvl_hashes1OF1850( )
   {
   }

   public void send_integrity_lvl_hashes1OF1849( )
   {
   }

   public void subsflControlProps_451850( )
   {
      edtavnRcdDeleted_1850_Internalname = "vNRCDDELETED_1850_"+sGXsfl_45_idx ;
      edtBCLinea_Internalname = "BCLINEA_"+sGXsfl_45_idx ;
      edtBCProducto_Internalname = "BCPRODUCTO_"+sGXsfl_45_idx ;
      edtBCCantidad_Internalname = "BCCANTIDAD_"+sGXsfl_45_idx ;
      edtBCPrecioCi_Internalname = "BCPRECIOCI_"+sGXsfl_45_idx ;
      edtBCCProcesa_Internalname = "BCCPROCESA_"+sGXsfl_45_idx ;
      edtBCCError_Internalname = "BCCERROR_"+sGXsfl_45_idx ;
      edtBCCDescErr_Internalname = "BCCDESCERR_"+sGXsfl_45_idx ;
      edtBCCFecErr_Internalname = "BCCFECERR_"+sGXsfl_45_idx ;
      edtBCCPila_Internalname = "BCCPILA_"+sGXsfl_45_idx ;
   }

   public void subsflControlProps_fel_451850( )
   {
      edtavnRcdDeleted_1850_Internalname = "vNRCDDELETED_1850_"+sGXsfl_45_fel_idx ;
      edtBCLinea_Internalname = "BCLINEA_"+sGXsfl_45_fel_idx ;
      edtBCProducto_Internalname = "BCPRODUCTO_"+sGXsfl_45_fel_idx ;
      edtBCCantidad_Internalname = "BCCANTIDAD_"+sGXsfl_45_fel_idx ;
      edtBCPrecioCi_Internalname = "BCPRECIOCI_"+sGXsfl_45_fel_idx ;
      edtBCCProcesa_Internalname = "BCCPROCESA_"+sGXsfl_45_fel_idx ;
      edtBCCError_Internalname = "BCCERROR_"+sGXsfl_45_fel_idx ;
      edtBCCDescErr_Internalname = "BCCDESCERR_"+sGXsfl_45_fel_idx ;
      edtBCCFecErr_Internalname = "BCCFECERR_"+sGXsfl_45_fel_idx ;
      edtBCCPila_Internalname = "BCCPILA_"+sGXsfl_45_fel_idx ;
   }

   public void addRow1OF1850( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451850( ) ;
      sendRow1OF1850( ) ;
   }

   public void sendRow1OF1850( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1850_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1850_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1850), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1850), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1850_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1850_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCLinea_Internalname,GXutil.ltrim( localUtil.ntoc( A13502BCLinea, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13502BCLinea), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCLinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCLinea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCProducto_Internalname,GXutil.rtrim( A13478BCProducto),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCProducto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCProducto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCCantidad_Internalname,GXutil.ltrim( localUtil.ntoc( A13503BCCantidad, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBCCantidad_Enabled!=0) ? localUtil.format( A13503BCCantidad, "ZZZZZZ9.99999") : localUtil.format( A13503BCCantidad, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,49);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCCantidad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCCantidad_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCPrecioCi_Internalname,GXutil.ltrim( localUtil.ntoc( A13504BCPrecioCi, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBCPrecioCi_Enabled!=0) ? localUtil.format( A13504BCPrecioCi, "ZZZZZZ9.99999") : localUtil.format( A13504BCPrecioCi, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCPrecioCi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCPrecioCi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCCProcesa_Internalname,GXutil.ltrim( localUtil.ntoc( A13505BCCProcesa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBCCProcesa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13505BCCProcesa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13505BCCProcesa), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCCProcesa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCCProcesa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCCError_Internalname,GXutil.ltrim( localUtil.ntoc( A13506BCCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBCCError_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13506BCCError), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13506BCCError), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCCError_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCCError_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCCDescErr_Internalname,A13507BCCDescErr,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCCDescErr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCCDescErr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCCFecErr_Internalname,localUtil.ttoc( A13508BCCFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A13508BCCFecErr, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCCFecErr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCCFecErr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1850_" + sGXsfl_45_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_45_idx + "',45)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBCCPila_Internalname,A13509BCCPila,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBCCPila_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBCCPila_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1OF1850( ) ;
      GXCCtl = "Z13502BCLinea_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13502BCLinea, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13503BCCantidad_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13503BCCantidad, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13504BCPrecioCi_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13504BCPrecioCi, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13505BCCProcesa_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13505BCCProcesa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13506BCCError_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13506BCCError, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13507BCCDescErr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z13507BCCDescErr);
      GXCCtl = "Z13508BCCFecErr_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z13508BCCFecErr, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z13509BCCPila_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z13509BCCPila);
      GXCCtl = "Z13478BCProducto_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13478BCProducto));
      GXCCtl = "nRcdDeleted_1850_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1850_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1850_" + sGXsfl_45_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1850, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1850_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1850_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCLINEA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCPRODUCTO_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCProducto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCCANTIDAD_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCPRECIOCI_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPrecioCi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCCPROCESA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCProcesa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCCERROR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCError_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCCDESCERR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCDescErr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCCFECERR_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCFecErr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BCCPILA_"+sGXsfl_45_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCPila_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1OF1850( )
   {
      nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451850( ) ;
      edtavnRcdDeleted_1850_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1850_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCLinea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCLINEA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCProducto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPRODUCTO_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCCantidad_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCANTIDAD_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCPrecioCi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCPRECIOCI_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCCProcesa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCPROCESA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCCError_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCERROR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCCDescErr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCDESCERR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCCFecErr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCFECERR_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBCCPila_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BCCPILA_"+sGXsfl_45_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1850_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1850_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1850");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1850_Internalname ;
         wbErr = true ;
         nRcdDeleted_1850 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1850 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1850_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "BCLINEA_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCLinea_Internalname ;
         wbErr = true ;
         A13502BCLinea = 0 ;
      }
      else
      {
         A13502BCLinea = (int)(localUtil.ctol( httpContext.cgiGet( edtBCLinea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A13478BCProducto = httpContext.cgiGet( edtBCProducto_Internalname) ;
      n13478BCProducto = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCCantidad_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCCantidad_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BCCANTIDAD_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCCantidad_Internalname ;
         wbErr = true ;
         A13503BCCantidad = DecimalUtil.ZERO ;
         n13503BCCantidad = false ;
      }
      else
      {
         A13503BCCantidad = localUtil.ctond( httpContext.cgiGet( edtBCCantidad_Internalname)) ;
         n13503BCCantidad = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBCPrecioCi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBCPrecioCi_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "BCPRECIOCI_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCPrecioCi_Internalname ;
         wbErr = true ;
         A13504BCPrecioCi = DecimalUtil.ZERO ;
         n13504BCPrecioCi = false ;
      }
      else
      {
         A13504BCPrecioCi = localUtil.ctond( httpContext.cgiGet( edtBCPrecioCi_Internalname)) ;
         n13504BCPrecioCi = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCProcesa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCProcesa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BCCPROCESA_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCCProcesa_Internalname ;
         wbErr = true ;
         A13505BCCProcesa = (short)(0) ;
         n13505BCCProcesa = false ;
      }
      else
      {
         A13505BCCProcesa = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCProcesa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13505BCCProcesa = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBCCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBCCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BCCERROR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCCError_Internalname ;
         wbErr = true ;
         A13506BCCError = (short)(0) ;
         n13506BCCError = false ;
      }
      else
      {
         A13506BCCError = (short)(localUtil.ctol( httpContext.cgiGet( edtBCCError_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13506BCCError = false ;
      }
      A13507BCCDescErr = httpContext.cgiGet( edtBCCDescErr_Internalname) ;
      n13507BCCDescErr = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtBCCFecErr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "BCCFECERR_" + sGXsfl_45_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCCFecErr_Internalname ;
         wbErr = true ;
         A13508BCCFecErr = GXutil.resetTime( GXutil.nullDate() );
         n13508BCCFecErr = false ;
      }
      else
      {
         A13508BCCFecErr = localUtil.ctot( httpContext.cgiGet( edtBCCFecErr_Internalname)) ;
         n13508BCCFecErr = false ;
      }
      A13509BCCPila = httpContext.cgiGet( edtBCCPila_Internalname) ;
      n13509BCCPila = false ;
      GXCCtl = "Z13502BCLinea_" + sGXsfl_45_idx ;
      Z13502BCLinea = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13503BCCantidad_" + sGXsfl_45_idx ;
      Z13503BCCantidad = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13504BCPrecioCi_" + sGXsfl_45_idx ;
      Z13504BCPrecioCi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z13505BCCProcesa_" + sGXsfl_45_idx ;
      Z13505BCCProcesa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13506BCCError_" + sGXsfl_45_idx ;
      Z13506BCCError = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13507BCCDescErr_" + sGXsfl_45_idx ;
      Z13507BCCDescErr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13508BCCFecErr_" + sGXsfl_45_idx ;
      Z13508BCCFecErr = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z13509BCCPila_" + sGXsfl_45_idx ;
      Z13509BCCPila = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13478BCProducto_" + sGXsfl_45_idx ;
      Z13478BCProducto = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1850_" + sGXsfl_45_idx ;
      nRcdDeleted_1850 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1850_" + sGXsfl_45_idx ;
      nRcdExists_1850 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1850_" + sGXsfl_45_idx ;
      nIsMod_1850 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBCLinea_Enabled = edtBCLinea_Enabled ;
   }

   public void confirmValues1OF0( )
   {
      nGXsfl_45_idx = 0 ;
      sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_451850( ) ;
      while ( nGXsfl_45_idx < nRC_GXsfl_45 )
      {
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451850( ) ;
         httpContext.changePostValue( "Z13502BCLinea_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13502BCLinea_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13502BCLinea_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13503BCCantidad_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13503BCCantidad_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13503BCCantidad_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13504BCPrecioCi_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13504BCPrecioCi_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13504BCPrecioCi_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13505BCCProcesa_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13505BCCProcesa_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13505BCCProcesa_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13506BCCError_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13506BCCError_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13506BCCError_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13507BCCDescErr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13507BCCDescErr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13507BCCDescErr_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13508BCCFecErr_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13508BCCFecErr_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13508BCCFecErr_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13509BCCPila_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13509BCCPila_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13509BCCPila_"+sGXsfl_45_idx) ;
         httpContext.changePostValue( "Z13478BCProducto_"+sGXsfl_45_idx, httpContext.cgiGet( "ZT_"+"Z13478BCProducto_"+sGXsfl_45_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13478BCProducto_"+sGXsfl_45_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.topbcch", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13465BCNumeroOP", GXutil.ltrim( localUtil.ntoc( Z13465BCNumeroOP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13500BCFecCierr", localUtil.dtoc( Z13500BCFecCierr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13501BCNumero", GXutil.ltrim( localUtil.ntoc( Z13501BCNumero, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_45", GXutil.ltrim( localUtil.ntoc( nGXsfl_45_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.topbcch", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TOPBCCH" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consumos Quimicos", "") ;
   }

   public void initializeNonKey1OF1849( )
   {
   }

   public void initAll1OF1849( )
   {
      A13465BCNumeroOP = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13465BCNumeroOP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13465BCNumeroOP), 8, 0));
      A13500BCFecCierr = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13500BCFecCierr", localUtil.format(A13500BCFecCierr, "99/99/99"));
      A13501BCNumero = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13501BCNumero", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13501BCNumero), 4, 0));
      initializeNonKey1OF1849( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1OF1850( )
   {
      A13478BCProducto = "" ;
      n13478BCProducto = false ;
      A13503BCCantidad = DecimalUtil.ZERO ;
      n13503BCCantidad = false ;
      A13504BCPrecioCi = DecimalUtil.ZERO ;
      n13504BCPrecioCi = false ;
      A13505BCCProcesa = (short)(0) ;
      n13505BCCProcesa = false ;
      A13506BCCError = (short)(0) ;
      n13506BCCError = false ;
      A13507BCCDescErr = "" ;
      n13507BCCDescErr = false ;
      A13508BCCFecErr = GXutil.resetTime( GXutil.nullDate() );
      n13508BCCFecErr = false ;
      A13509BCCPila = "" ;
      n13509BCCPila = false ;
      Z13503BCCantidad = DecimalUtil.ZERO ;
      Z13504BCPrecioCi = DecimalUtil.ZERO ;
      Z13505BCCProcesa = (short)(0) ;
      Z13506BCCError = (short)(0) ;
      Z13507BCCDescErr = "" ;
      Z13508BCCFecErr = GXutil.resetTime( GXutil.nullDate() );
      Z13509BCCPila = "" ;
      Z13478BCProducto = "" ;
   }

   public void initAll1OF1850( )
   {
      A13502BCLinea = 0 ;
      initializeNonKey1OF1850( ) ;
   }

   public void standaloneModalInsert1OF1850( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241510464", true, true);
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
      httpContext.AddJavascriptSource("topbcch.js", "?20268241510464", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1850( )
   {
      edtBCLinea_Enabled = defedtBCLinea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBCLinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBCLinea_Enabled), 5, 0), !bGXsfl_45_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1850, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1850_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13502BCLinea, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCLinea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13478BCProducto));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCProducto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13503BCCantidad, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCantidad_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13504BCPrecioCi, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCPrecioCi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13505BCCProcesa, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCProcesa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13506BCCError, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCError_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A13507BCCDescErr);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCDescErr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A13508BCCFecErr, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCFecErr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A13509BCCPila);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBCCPila_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBCNumeroOP_Internalname = "BCNUMEROOP" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBCFecCierr_Internalname = "BCFECCIERR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBCNumero_Internalname = "BCNUMERO" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtavnRcdDeleted_1850_Internalname = "vNRCDDELETED_1850" ;
      edtBCLinea_Internalname = "BCLINEA" ;
      edtBCProducto_Internalname = "BCPRODUCTO" ;
      edtBCCantidad_Internalname = "BCCANTIDAD" ;
      edtBCPrecioCi_Internalname = "BCPRECIOCI" ;
      edtBCCProcesa_Internalname = "BCCPROCESA" ;
      edtBCCError_Internalname = "BCCERROR" ;
      edtBCCDescErr_Internalname = "BCCDESCERR" ;
      edtBCCFecErr_Internalname = "BCCFECERR" ;
      edtBCCPila_Internalname = "BCCPILA" ;
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
      Form.setCaption( httpContext.getMessage( "Consumos Quimicos", "") );
      edtBCCPila_Jsonclick = "" ;
      edtBCCFecErr_Jsonclick = "" ;
      edtBCCDescErr_Jsonclick = "" ;
      edtBCCError_Jsonclick = "" ;
      edtBCCProcesa_Jsonclick = "" ;
      edtBCPrecioCi_Jsonclick = "" ;
      edtBCCantidad_Jsonclick = "" ;
      edtBCProducto_Jsonclick = "" ;
      edtBCLinea_Jsonclick = "" ;
      edtavnRcdDeleted_1850_Jsonclick = "" ;
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
      edtBCCPila_Enabled = 1 ;
      edtBCCFecErr_Enabled = 1 ;
      edtBCCDescErr_Enabled = 1 ;
      edtBCCError_Enabled = 1 ;
      edtBCCProcesa_Enabled = 1 ;
      edtBCPrecioCi_Enabled = 1 ;
      edtBCCantidad_Enabled = 1 ;
      edtBCProducto_Enabled = 1 ;
      edtBCLinea_Enabled = 1 ;
      edtavnRcdDeleted_1850_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBCNumero_Jsonclick = "" ;
      edtBCNumero_Backcolor = (int)(0xFFFFFF) ;
      edtBCNumero_Enabled = 1 ;
      edtBCFecCierr_Jsonclick = "" ;
      edtBCFecCierr_Backcolor = (int)(0xFFFFFF) ;
      edtBCFecCierr_Enabled = 1 ;
      edtBCNumeroOP_Jsonclick = "" ;
      edtBCNumeroOP_Backcolor = (int)(0xFFFFFF) ;
      edtBCNumeroOP_Enabled = 1 ;
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
      subsflControlProps_451850( ) ;
      while ( nGXsfl_45_idx <= nRC_GXsfl_45 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OF1850( ) ;
         standaloneModal1OF1850( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OF1850( ) ;
         nGXsfl_45_idx = (int)(nGXsfl_45_idx+1) ;
         sGXsfl_45_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_45_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_451850( ) ;
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
      /* Using cursor T01OF24 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OF24_A407EmprNom[0] ;
      n407EmprNom = T01OF24_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T01OF25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(21);
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

   public void valid_Bcnumeroop( )
   {
      /* Using cursor T01OF25 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A13465BCNumeroOP)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "OP_Header", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCNUMEROOP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCNumeroOP_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Bcnumero( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z13465BCNumeroOP", GXutil.ltrim( localUtil.ntoc( Z13465BCNumeroOP, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13500BCFecCierr", localUtil.format(Z13500BCFecCierr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13501BCNumero", GXutil.ltrim( localUtil.ntoc( Z13501BCNumero, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Bcproducto( )
   {
      n13478BCProducto = false ;
      /* Using cursor T01OF26 */
      pr_ekamat.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n13478BCProducto), A13478BCProducto});
      if ( (pr_ekamat.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Productos envio a EKAMAT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BCPRODUCTO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBCProducto_Internalname ;
      }
      pr_ekamat.close(2);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BCNUMEROOP","{handler:'valid_Bcnumeroop',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13465BCNumeroOP',fld:'BCNUMEROOP',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_BCNUMEROOP",",oparms:[]}");
      setEventMetadata("VALID_BCFECCIERR","{handler:'valid_Bcfeccierr',iparms:[]");
      setEventMetadata("VALID_BCFECCIERR",",oparms:[]}");
      setEventMetadata("VALID_BCNUMERO","{handler:'valid_Bcnumero',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13465BCNumeroOP',fld:'BCNUMEROOP',pic:'ZZZZZZZ9'},{av:'A13500BCFecCierr',fld:'BCFECCIERR',pic:''},{av:'A13501BCNumero',fld:'BCNUMERO',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BCNUMERO",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z13465BCNumeroOP'},{av:'Z13500BCFecCierr'},{av:'Z13501BCNumero'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BCLINEA","{handler:'valid_Bclinea',iparms:[]");
      setEventMetadata("VALID_BCLINEA",",oparms:[]}");
      setEventMetadata("VALID_BCPRODUCTO","{handler:'valid_Bcproducto',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13478BCProducto',fld:'BCPRODUCTO',pic:''}]");
      setEventMetadata("VALID_BCPRODUCTO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Bccpila',iparms:[]");
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
      pr_ekamat.close(2);
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z13500BCFecCierr = GXutil.nullDate() ;
      Z13503BCCantidad = DecimalUtil.ZERO ;
      Z13504BCPrecioCi = DecimalUtil.ZERO ;
      Z13507BCCDescErr = "" ;
      Z13508BCCFecErr = GXutil.resetTime( GXutil.nullDate() );
      Z13509BCCPila = "" ;
      Z13478BCProducto = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13478BCProducto = "" ;
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
      A13500BCFecCierr = GXutil.nullDate() ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1850 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1849 = "" ;
      GXCCtl = "" ;
      A13503BCCantidad = DecimalUtil.ZERO ;
      A13504BCPrecioCi = DecimalUtil.ZERO ;
      A13507BCCDescErr = "" ;
      A13508BCCFecErr = GXutil.resetTime( GXutil.nullDate() );
      A13509BCCPila = "" ;
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
      T01OF7_A407EmprNom = new String[] {""} ;
      T01OF7_n407EmprNom = new boolean[] {false} ;
      T01OF9_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF9_A13501BCNumero = new short[1] ;
      T01OF9_A407EmprNom = new String[] {""} ;
      T01OF9_n407EmprNom = new boolean[] {false} ;
      T01OF9_A396EmprCod = new String[] {""} ;
      T01OF9_A13465BCNumeroOP = new int[1] ;
      T01OF8_A396EmprCod = new String[] {""} ;
      T01OF10_A396EmprCod = new String[] {""} ;
      T01OF11_A396EmprCod = new String[] {""} ;
      T01OF11_A13465BCNumeroOP = new int[1] ;
      T01OF11_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF11_A13501BCNumero = new short[1] ;
      T01OF6_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF6_A13501BCNumero = new short[1] ;
      T01OF6_A396EmprCod = new String[] {""} ;
      T01OF6_A13465BCNumeroOP = new int[1] ;
      T01OF12_A396EmprCod = new String[] {""} ;
      T01OF12_A13465BCNumeroOP = new int[1] ;
      T01OF12_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF12_A13501BCNumero = new short[1] ;
      T01OF13_A396EmprCod = new String[] {""} ;
      T01OF13_A13465BCNumeroOP = new int[1] ;
      T01OF13_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF13_A13501BCNumero = new short[1] ;
      T01OF5_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF5_A13501BCNumero = new short[1] ;
      T01OF5_A396EmprCod = new String[] {""} ;
      T01OF5_A13465BCNumeroOP = new int[1] ;
      T01OF16_A396EmprCod = new String[] {""} ;
      T01OF16_A13465BCNumeroOP = new int[1] ;
      T01OF16_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF16_A13501BCNumero = new short[1] ;
      T01OF17_A13465BCNumeroOP = new int[1] ;
      T01OF17_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF17_A13501BCNumero = new short[1] ;
      T01OF17_A13502BCLinea = new int[1] ;
      T01OF17_A13503BCCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OF17_n13503BCCantidad = new boolean[] {false} ;
      T01OF17_A13504BCPrecioCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OF17_n13504BCPrecioCi = new boolean[] {false} ;
      T01OF17_A13505BCCProcesa = new short[1] ;
      T01OF17_n13505BCCProcesa = new boolean[] {false} ;
      T01OF17_A13506BCCError = new short[1] ;
      T01OF17_n13506BCCError = new boolean[] {false} ;
      T01OF17_A13507BCCDescErr = new String[] {""} ;
      T01OF17_n13507BCCDescErr = new boolean[] {false} ;
      T01OF17_A13508BCCFecErr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF17_n13508BCCFecErr = new boolean[] {false} ;
      T01OF17_A13509BCCPila = new String[] {""} ;
      T01OF17_n13509BCCPila = new boolean[] {false} ;
      T01OF17_A396EmprCod = new String[] {""} ;
      T01OF17_A13478BCProducto = new String[] {""} ;
      T01OF17_n13478BCProducto = new boolean[] {false} ;
      T01OF4_A396EmprCod = new String[] {""} ;
      T01OF18_A396EmprCod = new String[] {""} ;
      T01OF19_A396EmprCod = new String[] {""} ;
      T01OF19_A13465BCNumeroOP = new int[1] ;
      T01OF19_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF19_A13501BCNumero = new short[1] ;
      T01OF19_A13502BCLinea = new int[1] ;
      T01OF3_A13465BCNumeroOP = new int[1] ;
      T01OF3_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF3_A13501BCNumero = new short[1] ;
      T01OF3_A13502BCLinea = new int[1] ;
      T01OF3_A13503BCCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OF3_n13503BCCantidad = new boolean[] {false} ;
      T01OF3_A13504BCPrecioCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OF3_n13504BCPrecioCi = new boolean[] {false} ;
      T01OF3_A13505BCCProcesa = new short[1] ;
      T01OF3_n13505BCCProcesa = new boolean[] {false} ;
      T01OF3_A13506BCCError = new short[1] ;
      T01OF3_n13506BCCError = new boolean[] {false} ;
      T01OF3_A13507BCCDescErr = new String[] {""} ;
      T01OF3_n13507BCCDescErr = new boolean[] {false} ;
      T01OF3_A13508BCCFecErr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF3_n13508BCCFecErr = new boolean[] {false} ;
      T01OF3_A13509BCCPila = new String[] {""} ;
      T01OF3_n13509BCCPila = new boolean[] {false} ;
      T01OF3_A396EmprCod = new String[] {""} ;
      T01OF3_A13478BCProducto = new String[] {""} ;
      T01OF3_n13478BCProducto = new boolean[] {false} ;
      T01OF2_A13465BCNumeroOP = new int[1] ;
      T01OF2_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF2_A13501BCNumero = new short[1] ;
      T01OF2_A13502BCLinea = new int[1] ;
      T01OF2_A13503BCCantidad = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OF2_n13503BCCantidad = new boolean[] {false} ;
      T01OF2_A13504BCPrecioCi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OF2_n13504BCPrecioCi = new boolean[] {false} ;
      T01OF2_A13505BCCProcesa = new short[1] ;
      T01OF2_n13505BCCProcesa = new boolean[] {false} ;
      T01OF2_A13506BCCError = new short[1] ;
      T01OF2_n13506BCCError = new boolean[] {false} ;
      T01OF2_A13507BCCDescErr = new String[] {""} ;
      T01OF2_n13507BCCDescErr = new boolean[] {false} ;
      T01OF2_A13508BCCFecErr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF2_n13508BCCFecErr = new boolean[] {false} ;
      T01OF2_A13509BCCPila = new String[] {""} ;
      T01OF2_n13509BCCPila = new boolean[] {false} ;
      T01OF2_A396EmprCod = new String[] {""} ;
      T01OF2_A13478BCProducto = new String[] {""} ;
      T01OF2_n13478BCProducto = new boolean[] {false} ;
      T01OF23_A396EmprCod = new String[] {""} ;
      T01OF23_A13465BCNumeroOP = new int[1] ;
      T01OF23_A13500BCFecCierr = new java.util.Date[] {GXutil.nullDate()} ;
      T01OF23_A13501BCNumero = new short[1] ;
      T01OF23_A13502BCLinea = new int[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01OF24_A407EmprNom = new String[] {""} ;
      T01OF24_n407EmprNom = new boolean[] {false} ;
      T01OF25_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ13500BCFecCierr = GXutil.nullDate() ;
      ZZ407EmprNom = "" ;
      T01OF26_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.topbcch__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.topbcch__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.topbcch__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.topbcch__ekamat(),
         new Object[] {
             new Object[] {
            T01OF4_A396EmprCod
            }
            , new Object[] {
            T01OF18_A396EmprCod
            }
            , new Object[] {
            T01OF26_A396EmprCod
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.topbcch__default(),
         new Object[] {
             new Object[] {
            T01OF2_A13465BCNumeroOP, T01OF2_A13500BCFecCierr, T01OF2_A13501BCNumero, T01OF2_A13502BCLinea, T01OF2_A13503BCCantidad, T01OF2_n13503BCCantidad, T01OF2_A13504BCPrecioCi, T01OF2_n13504BCPrecioCi, T01OF2_A13505BCCProcesa, T01OF2_n13505BCCProcesa,
            T01OF2_A13506BCCError, T01OF2_n13506BCCError, T01OF2_A13507BCCDescErr, T01OF2_n13507BCCDescErr, T01OF2_A13508BCCFecErr, T01OF2_n13508BCCFecErr, T01OF2_A13509BCCPila, T01OF2_n13509BCCPila, T01OF2_A396EmprCod, T01OF2_A13478BCProducto,
            T01OF2_n13478BCProducto
            }
            , new Object[] {
            T01OF3_A13465BCNumeroOP, T01OF3_A13500BCFecCierr, T01OF3_A13501BCNumero, T01OF3_A13502BCLinea, T01OF3_A13503BCCantidad, T01OF3_n13503BCCantidad, T01OF3_A13504BCPrecioCi, T01OF3_n13504BCPrecioCi, T01OF3_A13505BCCProcesa, T01OF3_n13505BCCProcesa,
            T01OF3_A13506BCCError, T01OF3_n13506BCCError, T01OF3_A13507BCCDescErr, T01OF3_n13507BCCDescErr, T01OF3_A13508BCCFecErr, T01OF3_n13508BCCFecErr, T01OF3_A13509BCCPila, T01OF3_n13509BCCPila, T01OF3_A396EmprCod, T01OF3_A13478BCProducto,
            T01OF3_n13478BCProducto
            }
            , new Object[] {
            T01OF5_A13500BCFecCierr, T01OF5_A13501BCNumero, T01OF5_A396EmprCod, T01OF5_A13465BCNumeroOP
            }
            , new Object[] {
            T01OF6_A13500BCFecCierr, T01OF6_A13501BCNumero, T01OF6_A396EmprCod, T01OF6_A13465BCNumeroOP
            }
            , new Object[] {
            T01OF7_A407EmprNom, T01OF7_n407EmprNom
            }
            , new Object[] {
            T01OF8_A396EmprCod
            }
            , new Object[] {
            T01OF9_A13500BCFecCierr, T01OF9_A13501BCNumero, T01OF9_A407EmprNom, T01OF9_n407EmprNom, T01OF9_A396EmprCod, T01OF9_A13465BCNumeroOP
            }
            , new Object[] {
            T01OF10_A396EmprCod
            }
            , new Object[] {
            T01OF11_A396EmprCod, T01OF11_A13465BCNumeroOP, T01OF11_A13500BCFecCierr, T01OF11_A13501BCNumero
            }
            , new Object[] {
            T01OF12_A396EmprCod, T01OF12_A13465BCNumeroOP, T01OF12_A13500BCFecCierr, T01OF12_A13501BCNumero
            }
            , new Object[] {
            T01OF13_A396EmprCod, T01OF13_A13465BCNumeroOP, T01OF13_A13500BCFecCierr, T01OF13_A13501BCNumero
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OF16_A396EmprCod, T01OF16_A13465BCNumeroOP, T01OF16_A13500BCFecCierr, T01OF16_A13501BCNumero
            }
            , new Object[] {
            T01OF17_A13465BCNumeroOP, T01OF17_A13500BCFecCierr, T01OF17_A13501BCNumero, T01OF17_A13502BCLinea, T01OF17_A13503BCCantidad, T01OF17_n13503BCCantidad, T01OF17_A13504BCPrecioCi, T01OF17_n13504BCPrecioCi, T01OF17_A13505BCCProcesa, T01OF17_n13505BCCProcesa,
            T01OF17_A13506BCCError, T01OF17_n13506BCCError, T01OF17_A13507BCCDescErr, T01OF17_n13507BCCDescErr, T01OF17_A13508BCCFecErr, T01OF17_n13508BCCFecErr, T01OF17_A13509BCCPila, T01OF17_n13509BCCPila, T01OF17_A396EmprCod, T01OF17_A13478BCProducto,
            T01OF17_n13478BCProducto
            }
            , new Object[] {
            T01OF19_A396EmprCod, T01OF19_A13465BCNumeroOP, T01OF19_A13500BCFecCierr, T01OF19_A13501BCNumero, T01OF19_A13502BCLinea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OF23_A396EmprCod, T01OF23_A13465BCNumeroOP, T01OF23_A13500BCFecCierr, T01OF23_A13501BCNumero, T01OF23_A13502BCLinea
            }
            , new Object[] {
            T01OF24_A407EmprNom, T01OF24_n407EmprNom
            }
            , new Object[] {
            T01OF25_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TOPBCCH" ;
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
   private short Z13501BCNumero ;
   private short Z13505BCCProcesa ;
   private short Z13506BCCError ;
   private short nRcdDeleted_1850 ;
   private short nRcdExists_1850 ;
   private short nIsMod_1850 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A13501BCNumero ;
   private short nBlankRcdCount1850 ;
   private short RcdFound1850 ;
   private short nBlankRcdUsr1850 ;
   private short A13505BCCProcesa ;
   private short A13506BCCError ;
   private short RcdFound1849 ;
   private short nIsDirty_1849 ;
   private short nIsDirty_1850 ;
   private short ZZ13501BCNumero ;
   private int Z13465BCNumeroOP ;
   private int nRC_GXsfl_45 ;
   private int nGXsfl_45_idx=1 ;
   private int Z13502BCLinea ;
   private int A13465BCNumeroOP ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBCNumeroOP_Enabled ;
   private int edtBCFecCierr_Enabled ;
   private int edtBCNumero_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtavnRcdDeleted_1850_Enabled ;
   private int edtBCLinea_Enabled ;
   private int edtBCProducto_Enabled ;
   private int edtBCCantidad_Enabled ;
   private int edtBCPrecioCi_Enabled ;
   private int edtBCCProcesa_Enabled ;
   private int edtBCCError_Enabled ;
   private int edtBCCDescErr_Enabled ;
   private int edtBCCFecErr_Enabled ;
   private int edtBCCPila_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A13502BCLinea ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBCLinea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBCNumero_Backcolor ;
   private int edtBCFecCierr_Backcolor ;
   private int edtBCNumeroOP_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ13465BCNumeroOP ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z13503BCCantidad ;
   private java.math.BigDecimal Z13504BCPrecioCi ;
   private java.math.BigDecimal A13503BCCantidad ;
   private java.math.BigDecimal A13504BCPrecioCi ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z13478BCProducto ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A13478BCProducto ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBCNumeroOP_Internalname ;
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
   private String edtBCNumeroOP_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBCFecCierr_Internalname ;
   private String edtBCFecCierr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBCNumero_Internalname ;
   private String edtBCNumero_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String sMode1850 ;
   private String edtavnRcdDeleted_1850_Internalname ;
   private String edtBCLinea_Internalname ;
   private String edtBCProducto_Internalname ;
   private String edtBCCantidad_Internalname ;
   private String edtBCPrecioCi_Internalname ;
   private String edtBCCProcesa_Internalname ;
   private String edtBCCError_Internalname ;
   private String edtBCCDescErr_Internalname ;
   private String edtBCCFecErr_Internalname ;
   private String edtBCCPila_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1849 ;
   private String GXCCtl ;
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
   private String sGXsfl_45_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1850_Jsonclick ;
   private String edtBCLinea_Jsonclick ;
   private String edtBCProducto_Jsonclick ;
   private String edtBCCantidad_Jsonclick ;
   private String edtBCPrecioCi_Jsonclick ;
   private String edtBCCProcesa_Jsonclick ;
   private String edtBCCError_Jsonclick ;
   private String edtBCCDescErr_Jsonclick ;
   private String edtBCCFecErr_Jsonclick ;
   private String edtBCCPila_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private java.util.Date Z13508BCCFecErr ;
   private java.util.Date A13508BCCFecErr ;
   private java.util.Date Z13500BCFecCierr ;
   private java.util.Date A13500BCFecCierr ;
   private java.util.Date ZZ13500BCFecCierr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13478BCProducto ;
   private boolean wbErr ;
   private boolean bGXsfl_45_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n13503BCCantidad ;
   private boolean n13504BCPrecioCi ;
   private boolean n13505BCCProcesa ;
   private boolean n13506BCCError ;
   private boolean n13507BCCDescErr ;
   private boolean n13508BCCFecErr ;
   private boolean n13509BCCPila ;
   private boolean Gx_longc ;
   private String Z13507BCCDescErr ;
   private String Z13509BCCPila ;
   private String A13507BCCDescErr ;
   private String A13509BCCPila ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01OF7_A407EmprNom ;
   private boolean[] T01OF7_n407EmprNom ;
   private java.util.Date[] T01OF9_A13500BCFecCierr ;
   private short[] T01OF9_A13501BCNumero ;
   private String[] T01OF9_A407EmprNom ;
   private boolean[] T01OF9_n407EmprNom ;
   private String[] T01OF9_A396EmprCod ;
   private int[] T01OF9_A13465BCNumeroOP ;
   private String[] T01OF8_A396EmprCod ;
   private String[] T01OF10_A396EmprCod ;
   private String[] T01OF11_A396EmprCod ;
   private int[] T01OF11_A13465BCNumeroOP ;
   private java.util.Date[] T01OF11_A13500BCFecCierr ;
   private short[] T01OF11_A13501BCNumero ;
   private java.util.Date[] T01OF6_A13500BCFecCierr ;
   private short[] T01OF6_A13501BCNumero ;
   private String[] T01OF6_A396EmprCod ;
   private int[] T01OF6_A13465BCNumeroOP ;
   private String[] T01OF12_A396EmprCod ;
   private int[] T01OF12_A13465BCNumeroOP ;
   private java.util.Date[] T01OF12_A13500BCFecCierr ;
   private short[] T01OF12_A13501BCNumero ;
   private String[] T01OF13_A396EmprCod ;
   private int[] T01OF13_A13465BCNumeroOP ;
   private java.util.Date[] T01OF13_A13500BCFecCierr ;
   private short[] T01OF13_A13501BCNumero ;
   private java.util.Date[] T01OF5_A13500BCFecCierr ;
   private short[] T01OF5_A13501BCNumero ;
   private String[] T01OF5_A396EmprCod ;
   private int[] T01OF5_A13465BCNumeroOP ;
   private String[] T01OF16_A396EmprCod ;
   private int[] T01OF16_A13465BCNumeroOP ;
   private java.util.Date[] T01OF16_A13500BCFecCierr ;
   private short[] T01OF16_A13501BCNumero ;
   private int[] T01OF17_A13465BCNumeroOP ;
   private java.util.Date[] T01OF17_A13500BCFecCierr ;
   private short[] T01OF17_A13501BCNumero ;
   private int[] T01OF17_A13502BCLinea ;
   private java.math.BigDecimal[] T01OF17_A13503BCCantidad ;
   private boolean[] T01OF17_n13503BCCantidad ;
   private java.math.BigDecimal[] T01OF17_A13504BCPrecioCi ;
   private boolean[] T01OF17_n13504BCPrecioCi ;
   private short[] T01OF17_A13505BCCProcesa ;
   private boolean[] T01OF17_n13505BCCProcesa ;
   private short[] T01OF17_A13506BCCError ;
   private boolean[] T01OF17_n13506BCCError ;
   private String[] T01OF17_A13507BCCDescErr ;
   private boolean[] T01OF17_n13507BCCDescErr ;
   private java.util.Date[] T01OF17_A13508BCCFecErr ;
   private boolean[] T01OF17_n13508BCCFecErr ;
   private String[] T01OF17_A13509BCCPila ;
   private boolean[] T01OF17_n13509BCCPila ;
   private String[] T01OF17_A396EmprCod ;
   private String[] T01OF17_A13478BCProducto ;
   private boolean[] T01OF17_n13478BCProducto ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01OF4_A396EmprCod ;
   private String[] T01OF18_A396EmprCod ;
   private String[] T01OF19_A396EmprCod ;
   private int[] T01OF19_A13465BCNumeroOP ;
   private java.util.Date[] T01OF19_A13500BCFecCierr ;
   private short[] T01OF19_A13501BCNumero ;
   private int[] T01OF19_A13502BCLinea ;
   private int[] T01OF3_A13465BCNumeroOP ;
   private java.util.Date[] T01OF3_A13500BCFecCierr ;
   private short[] T01OF3_A13501BCNumero ;
   private int[] T01OF3_A13502BCLinea ;
   private java.math.BigDecimal[] T01OF3_A13503BCCantidad ;
   private boolean[] T01OF3_n13503BCCantidad ;
   private java.math.BigDecimal[] T01OF3_A13504BCPrecioCi ;
   private boolean[] T01OF3_n13504BCPrecioCi ;
   private short[] T01OF3_A13505BCCProcesa ;
   private boolean[] T01OF3_n13505BCCProcesa ;
   private short[] T01OF3_A13506BCCError ;
   private boolean[] T01OF3_n13506BCCError ;
   private String[] T01OF3_A13507BCCDescErr ;
   private boolean[] T01OF3_n13507BCCDescErr ;
   private java.util.Date[] T01OF3_A13508BCCFecErr ;
   private boolean[] T01OF3_n13508BCCFecErr ;
   private String[] T01OF3_A13509BCCPila ;
   private boolean[] T01OF3_n13509BCCPila ;
   private String[] T01OF3_A396EmprCod ;
   private String[] T01OF3_A13478BCProducto ;
   private boolean[] T01OF3_n13478BCProducto ;
   private int[] T01OF2_A13465BCNumeroOP ;
   private java.util.Date[] T01OF2_A13500BCFecCierr ;
   private short[] T01OF2_A13501BCNumero ;
   private int[] T01OF2_A13502BCLinea ;
   private java.math.BigDecimal[] T01OF2_A13503BCCantidad ;
   private boolean[] T01OF2_n13503BCCantidad ;
   private java.math.BigDecimal[] T01OF2_A13504BCPrecioCi ;
   private boolean[] T01OF2_n13504BCPrecioCi ;
   private short[] T01OF2_A13505BCCProcesa ;
   private boolean[] T01OF2_n13505BCCProcesa ;
   private short[] T01OF2_A13506BCCError ;
   private boolean[] T01OF2_n13506BCCError ;
   private String[] T01OF2_A13507BCCDescErr ;
   private boolean[] T01OF2_n13507BCCDescErr ;
   private java.util.Date[] T01OF2_A13508BCCFecErr ;
   private boolean[] T01OF2_n13508BCCFecErr ;
   private String[] T01OF2_A13509BCCPila ;
   private boolean[] T01OF2_n13509BCCPila ;
   private String[] T01OF2_A396EmprCod ;
   private String[] T01OF2_A13478BCProducto ;
   private boolean[] T01OF2_n13478BCProducto ;
   private String[] T01OF23_A396EmprCod ;
   private int[] T01OF23_A13465BCNumeroOP ;
   private java.util.Date[] T01OF23_A13500BCFecCierr ;
   private short[] T01OF23_A13501BCNumero ;
   private int[] T01OF23_A13502BCLinea ;
   private String[] T01OF24_A407EmprNom ;
   private boolean[] T01OF24_n407EmprNom ;
   private String[] T01OF25_A396EmprCod ;
   private String[] T01OF26_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class topbcch__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcch__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcch__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class topbcch__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OF4", "SELECT [Emprcod] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF18", "SELECT [Emprcod] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF26", "SELECT [Emprcod] FROM [Producto] WITH (NOLOCK) WHERE [Emprcod] = ? AND [Producto] = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 2 :
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
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class topbcch__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OF2", "SELECT BCNumeroOP, BCFecCierr, BCNumero, BCLinea, BCCantidad, BCPrecioCi, BCCProcesa, BCCError, BCCDescErr, BCCFecErr, BCCPila, EmprCod, BCProducto FROM TXPOPBCCD WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? AND BCLinea = ?  FOR UPDATE OF BCCantidad, BCPrecioCi, BCCProcesa, BCCError, BCCDescErr, BCCFecErr, BCCPila, BCProducto NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF3", "SELECT BCNumeroOP, BCFecCierr, BCNumero, BCLinea, BCCantidad, BCPrecioCi, BCCProcesa, BCCError, BCCDescErr, BCCFecErr, BCCPila, EmprCod, BCProducto FROM TXPOPBCCD WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? AND BCLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF5", "SELECT BCFecCierr, BCNumero, EmprCod, BCNumeroOP FROM TXPOPBCCH WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ?  FOR UPDATE OF BCFecCierr NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF6", "SELECT BCFecCierr, BCNumero, EmprCod, BCNumeroOP FROM TXPOPBCCH WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF8", "SELECT EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF9", "SELECT /*+ FIRST_ROWS(100) */ TM1.BCFecCierr, TM1.BCNumero, T2.EmprNom, TM1.EmprCod, TM1.BCNumeroOP FROM (TXPOPBCCH TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BCNumeroOP = ? and TM1.BCFecCierr = ? and TM1.BCNumero = ? ORDER BY TM1.EmprCod, TM1.BCNumeroOP, TM1.BCFecCierr, TM1.BCNumero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF10", "SELECT EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP, BCFecCierr, BCNumero FROM TXPOPBCCH WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP, BCFecCierr, BCNumero FROM TXPOPBCCH WHERE ( BCNumeroOP > ? or BCNumeroOP = ? and BCFecCierr > ? or BCFecCierr = ? and BCNumeroOP = ? and BCNumero > ?) and EmprCod = ? ORDER BY EmprCod, BCNumeroOP, BCFecCierr, BCNumero) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OF13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BCNumeroOP, BCFecCierr, BCNumero FROM TXPOPBCCH WHERE ( BCNumeroOP < ? or BCNumeroOP = ? and BCFecCierr < ? or BCFecCierr = ? and BCNumeroOP = ? and BCNumero < ?) and EmprCod = ? ORDER BY EmprCod DESC, BCNumeroOP DESC, BCFecCierr DESC, BCNumero DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OF14", "INSERT INTO TXPOPBCCH(BCFecCierr, BCNumero, EmprCod, BCNumeroOP) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOPBCCH")
         ,new UpdateCursor("T01OF15", "DELETE FROM TXPOPBCCH  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ?", GX_NOMASK, "TXPOPBCCH")
         ,new ForEachCursor("T01OF16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BCNumeroOP, BCFecCierr, BCNumero FROM TXPOPBCCH WHERE EmprCod = ? ORDER BY EmprCod, BCNumeroOP, BCFecCierr, BCNumero ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF17", "SELECT BCNumeroOP, BCFecCierr, BCNumero, BCLinea, BCCantidad, BCPrecioCi, BCCProcesa, BCCError, BCCDescErr, BCCFecErr, BCCPila, EmprCod, BCProducto FROM TXPOPBCCD WHERE EmprCod = ? and BCNumeroOP = ? and BCFecCierr = ? and BCNumero = ? and BCLinea = ? ORDER BY EmprCod, BCNumeroOP, BCFecCierr, BCNumero, BCLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF19", "SELECT EmprCod, BCNumeroOP, BCFecCierr, BCNumero, BCLinea FROM TXPOPBCCD WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? AND BCLinea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OF20", "INSERT INTO TXPOPBCCD(BCNumeroOP, BCFecCierr, BCNumero, BCLinea, BCCantidad, BCPrecioCi, BCCProcesa, BCCError, BCCDescErr, BCCFecErr, BCCPila, EmprCod, BCProducto) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPOPBCCD")
         ,new UpdateCursor("T01OF21", "UPDATE TXPOPBCCD SET BCCantidad=?, BCPrecioCi=?, BCCProcesa=?, BCCError=?, BCCDescErr=?, BCCFecErr=?, BCCPila=?, BCProducto=?  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? AND BCLinea = ?", GX_NOMASK, "TXPOPBCCD")
         ,new UpdateCursor("T01OF22", "DELETE FROM TXPOPBCCD  WHERE EmprCod = ? AND BCNumeroOP = ? AND BCFecCierr = ? AND BCNumero = ? AND BCLinea = ?", GX_NOMASK, "TXPOPBCCD")
         ,new ForEachCursor("T01OF23", "SELECT EmprCod, BCNumeroOP, BCFecCierr, BCNumero, BCLinea FROM TXPOPBCCD WHERE EmprCod = ? and BCNumeroOP = ? and BCFecCierr = ? and BCNumero = ? ORDER BY EmprCod, BCNumeroOP, BCFecCierr, BCNumero, BCLinea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF24", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OF25", "SELECT EmprCod FROM TXPOPBCHD WHERE EmprCod = ? AND BCNumeroOP = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               ((String[]) buf[19])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               ((String[]) buf[19])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 3);
               ((String[]) buf[19])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 11 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 200);
               }
               stmt.setString(12, (String)parms[18], 3);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 6);
               }
               return;
            case 17 :
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
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
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
                  stmt.setVarchar(5, (String)parms[9], 200);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 200);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 6);
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setDate(11, (java.util.Date)parms[18]);
               stmt.setShort(12, ((Number) parms[19]).shortValue());
               stmt.setInt(13, ((Number) parms[20]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

