package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttr1000_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TABLA COSTES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCos_Any_Internalname ;
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
      nRC_GXsfl_49 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_49"))) ;
      nGXsfl_49_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_49_idx"))) ;
      sGXsfl_49_idx = httpContext.GetPar( "sGXsfl_49_idx") ;
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

   public ttr1000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttr1000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttr1000_impl.class ));
   }

   public ttr1000_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTR1000.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Anyo", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCos_Any_Internalname, GXutil.ltrim( localUtil.ntoc( A10514Cos_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCos_Any_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10514Cos_Any), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10514Cos_Any), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCos_Any_Jsonclick, 0, "", "", "", "", "", 1, edtCos_Any_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Mes", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCos_Mes_Internalname, GXutil.ltrim( localUtil.ntoc( A10515Cos_Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCos_Mes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10515Cos_Mes), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10515Cos_Mes), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCos_Mes_Jsonclick, 0, "", "", "", "", "", 1, edtCos_Mes_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dia", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCos_dia_Internalname, GXutil.ltrim( localUtil.ntoc( A10516Cos_dia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCos_dia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10516Cos_dia), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A10516Cos_dia), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCos_dia_Jsonclick, 0, "", "", "", "", "", 1, edtCos_dia_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCos_Ultl_Internalname, GXutil.ltrim( localUtil.ntoc( A10517Cos_Ultl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCos_Ultl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10517Cos_Ultl), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10517Cos_Ultl), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCos_Ultl_Jsonclick, 0, "", "", "", "", "", 1, edtCos_Ultl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTR1000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol49( ) ;
      nGXsfl_49_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1421 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1421 = (short)(1) ;
            scanStart18M1421( ) ;
            while ( RcdFound1421 != 0 )
            {
               init_level_properties1421( ) ;
               getByPrimaryKey18M1421( ) ;
               addRow18M1421( ) ;
               scanNext18M1421( ) ;
            }
            scanEnd18M1421( ) ;
            nBlankRcdCount1421 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal18M1421( ) ;
         standaloneModal18M1421( ) ;
         sMode1421 = Gx_mode ;
         while ( nGXsfl_49_idx < nRC_GXsfl_49 )
         {
            bGXsfl_49_Refreshing = true ;
            readRow18M1421( ) ;
            edtavnRcdDeleted_1421_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1421_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1421_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1421_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_LINEA_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_linea_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_ColNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_COLNM_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_ColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_ColNm_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_hdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_HDR_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_hdr_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_hdrr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_HDRR_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_hdrr_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_hdrp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_HDRP_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_hdrp_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Fab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_FAB_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Fab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Fab_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Pq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_PQ_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Pq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Pq_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_H2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_H2O_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_H2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_H2o_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_ART_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Art_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_ColNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_COLNN_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_ColNn_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_tc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_TC_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_tc_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Vol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_VOL_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Vol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Vol_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Mq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_MQ_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Mq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Mq_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_KGS_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Kgs_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_KgsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_KGST_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_KgsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_KgsT_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Numt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_NUMT_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Numt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Numt_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_lot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_LOT_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_lot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_lot_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_tot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_TOT_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_tot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_tot_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Clicod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_CLICOD_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Clicod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Acs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_ACS_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Acs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Acs_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_Nprog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_NPROG_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_Nprog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Nprog_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            edtCos_TipoR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_TIPOR_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCos_TipoR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_TipoR_Enabled), 5, 0), !bGXsfl_49_Refreshing);
            if ( ( nRcdExists_1421 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal18M1421( ) ;
            }
            sendRow18M1421( ) ;
            bGXsfl_49_Refreshing = false ;
         }
         Gx_mode = sMode1421 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1421 = (short)(5) ;
         nRcdExists_1421 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart18M1421( ) ;
            while ( RcdFound1421 != 0 )
            {
               sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_491421( ) ;
               init_level_properties1421( ) ;
               standaloneNotModal18M1421( ) ;
               getByPrimaryKey18M1421( ) ;
               standaloneModal18M1421( ) ;
               addRow18M1421( ) ;
               scanNext18M1421( ) ;
            }
            scanEnd18M1421( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1421 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_491421( ) ;
      initAll18M1421( ) ;
      init_level_properties1421( ) ;
      nRcdExists_1421 = (short)(0) ;
      nIsMod_1421 = (short)(0) ;
      nRcdDeleted_1421 = (short)(0) ;
      nBlankRcdCount1421 = (short)(nBlankRcdUsr1421+nBlankRcdCount1421) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1421 > 0 )
      {
         standaloneNotModal18M1421( ) ;
         standaloneModal18M1421( ) ;
         addRow18M1421( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCos_linea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1421 = (short)(nBlankRcdCount1421-1) ;
      }
      Gx_mode = sMode1421 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTR1000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTR1000.htm");
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
      e1118M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10514Cos_Any = (short)(localUtil.ctol( httpContext.cgiGet( "Z10514Cos_Any"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10515Cos_Mes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10515Cos_Mes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10516Cos_dia = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10516Cos_dia"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10517Cos_Ultl = (short)(localUtil.ctol( httpContext.cgiGet( "Z10517Cos_Ultl"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Any_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Any_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COS_ANY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCos_Any_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10514Cos_Any = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
            }
            else
            {
               A10514Cos_Any = (short)(localUtil.ctol( httpContext.cgiGet( edtCos_Any_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Mes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Mes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COS_MES");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCos_Mes_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10515Cos_Mes = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
            }
            else
            {
               A10515Cos_Mes = (byte)(localUtil.ctol( httpContext.cgiGet( edtCos_Mes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_dia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_dia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COS_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCos_dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10516Cos_dia = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
            }
            else
            {
               A10516Cos_dia = (byte)(localUtil.ctol( httpContext.cgiGet( edtCos_dia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COS_ULTL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCos_Ultl_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10517Cos_Ultl = (short)(0) ;
               n10517Cos_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10517Cos_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10517Cos_Ultl), 4, 0));
            }
            else
            {
               A10517Cos_Ultl = (short)(localUtil.ctol( httpContext.cgiGet( edtCos_Ultl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10517Cos_Ultl = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10517Cos_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10517Cos_Ultl), 4, 0));
            }
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
               A10514Cos_Any = (short)(GXutil.lval( httpContext.GetPar( "Cos_Any"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
               A10515Cos_Mes = (byte)(GXutil.lval( httpContext.GetPar( "Cos_Mes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
               A10516Cos_dia = (byte)(GXutil.lval( httpContext.GetPar( "Cos_dia"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
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
                        e1118M2 ();
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
            initAll18M1420( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1421_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1421_Enabled), 5, 0), !bGXsfl_49_Refreshing);
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
      disableAttributes18M1420( ) ;
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

   public void confirm_18M0( )
   {
      beforeValidate18M1420( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls18M1420( ) ;
         }
         else
         {
            checkExtendedTable18M1420( ) ;
            if ( AnyError == 0 )
            {
               zm18M1420( 2) ;
            }
            closeExtendedTableCursors18M1420( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1420 = Gx_mode ;
         confirm_18M1421( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1420 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1420 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues18M0( ) ;
      }
   }

   public void confirm_18M1421( )
   {
      nGXsfl_49_idx = 0 ;
      while ( nGXsfl_49_idx < nRC_GXsfl_49 )
      {
         readRow18M1421( ) ;
         if ( ( nRcdExists_1421 != 0 ) || ( nIsMod_1421 != 0 ) )
         {
            getKey18M1421( ) ;
            if ( ( nRcdExists_1421 == 0 ) && ( nRcdDeleted_1421 == 0 ) )
            {
               if ( RcdFound1421 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate18M1421( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable18M1421( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors18M1421( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "COS_LINEA_" + sGXsfl_49_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCos_linea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1421 != 0 )
               {
                  if ( nRcdDeleted_1421 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey18M1421( ) ;
                     load18M1421( ) ;
                     beforeValidate18M1421( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls18M1421( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1421 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate18M1421( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable18M1421( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors18M1421( ) ;
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
                  if ( nRcdDeleted_1421 == 0 )
                  {
                     GXCCtl = "COS_LINEA_" + sGXsfl_49_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCos_linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1421_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10518Cos_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_ColNm_Internalname, GXutil.rtrim( A10526Cos_ColNm)) ;
         httpContext.changePostValue( edtCos_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10519Cos_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A10520Cos_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_hdrp_Internalname, GXutil.rtrim( A10521Cos_hdrp)) ;
         httpContext.changePostValue( edtCos_Fab_Internalname, GXutil.ltrim( localUtil.ntoc( A10522Cos_Fab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Pq_Internalname, GXutil.ltrim( localUtil.ntoc( A10523Cos_Pq, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_H2o_Internalname, GXutil.ltrim( localUtil.ntoc( A10524Cos_H2o, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Art_Internalname, GXutil.rtrim( A10525Cos_Art)) ;
         httpContext.changePostValue( edtCos_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A10527Cos_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_tc_Internalname, GXutil.ltrim( localUtil.ntoc( A10528Cos_tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Vol_Internalname, GXutil.ltrim( localUtil.ntoc( A10529Cos_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Mq_Internalname, GXutil.rtrim( A10530Cos_Mq)) ;
         httpContext.changePostValue( edtCos_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10531Cos_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_KgsT_Internalname, GXutil.ltrim( localUtil.ntoc( A10532Cos_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Numt_Internalname, GXutil.ltrim( localUtil.ntoc( A10533Cos_Numt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_lot_Internalname, GXutil.rtrim( A10534Cos_lot)) ;
         httpContext.changePostValue( edtCos_tot_Internalname, GXutil.ltrim( localUtil.ntoc( A10535Cos_tot, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Clicod_Internalname, GXutil.ltrim( localUtil.ntoc( A10536Cos_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Acs_Internalname, GXutil.rtrim( A10537Cos_Acs)) ;
         httpContext.changePostValue( edtCos_Nprog_Internalname, GXutil.rtrim( A10538Cos_Nprog)) ;
         httpContext.changePostValue( edtCos_TipoR_Internalname, GXutil.rtrim( A10548Cos_TipoR)) ;
         httpContext.changePostValue( "ZT_"+"Z10518Cos_linea_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10518Cos_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10526Cos_ColNm_"+sGXsfl_49_idx, GXutil.rtrim( Z10526Cos_ColNm)) ;
         httpContext.changePostValue( "ZT_"+"Z10519Cos_hdr_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10519Cos_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10520Cos_hdrr_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10520Cos_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10521Cos_hdrp_"+sGXsfl_49_idx, GXutil.rtrim( Z10521Cos_hdrp)) ;
         httpContext.changePostValue( "ZT_"+"Z10522Cos_Fab_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10522Cos_Fab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10523Cos_Pq_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10523Cos_Pq, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10524Cos_H2o_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10524Cos_H2o, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10525Cos_Art_"+sGXsfl_49_idx, GXutil.rtrim( Z10525Cos_Art)) ;
         httpContext.changePostValue( "ZT_"+"Z10527Cos_ColNn_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10527Cos_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10528Cos_tc_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10528Cos_tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10529Cos_Vol_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10529Cos_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10530Cos_Mq_"+sGXsfl_49_idx, GXutil.rtrim( Z10530Cos_Mq)) ;
         httpContext.changePostValue( "ZT_"+"Z10531Cos_Kgs_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10531Cos_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10532Cos_KgsT_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10532Cos_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10533Cos_Numt_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10533Cos_Numt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10534Cos_lot_"+sGXsfl_49_idx, GXutil.rtrim( Z10534Cos_lot)) ;
         httpContext.changePostValue( "ZT_"+"Z10535Cos_tot_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10535Cos_tot, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10536Cos_Clicod_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10536Cos_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10537Cos_Acs_"+sGXsfl_49_idx, GXutil.rtrim( Z10537Cos_Acs)) ;
         httpContext.changePostValue( "ZT_"+"Z10538Cos_Nprog_"+sGXsfl_49_idx, GXutil.rtrim( Z10538Cos_Nprog)) ;
         httpContext.changePostValue( "ZT_"+"Z10548Cos_TipoR_"+sGXsfl_49_idx, GXutil.rtrim( Z10548Cos_TipoR)) ;
         httpContext.changePostValue( "nRcdDeleted_1421_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1421_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1421_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1421 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1421_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1421_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_LINEA_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_COLNM_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_HDR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_HDRR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_HDRP_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_FAB_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Fab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_PQ_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Pq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_H2O_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_H2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_ART_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_COLNN_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_TC_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_VOL_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Vol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_MQ_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Mq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_KGS_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_KGST_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_KgsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_NUMT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Numt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_LOT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_lot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_TOT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_CLICOD_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Clicod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_ACS_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Acs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_NPROG_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Nprog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_TIPOR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_TipoR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption18M0( )
   {
   }

   public void e1118M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttr1000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      ttr1000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttr1000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttr1000_impl.this.A396EmprCod = GXv_char2[0] ;
      ttr1000_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttr1000_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm18M1420( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10517Cos_Ultl = T018M5_A10517Cos_Ultl[0] ;
         }
         else
         {
            Z10517Cos_Ultl = A10517Cos_Ultl ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10514Cos_Any = A10514Cos_Any ;
         Z10515Cos_Mes = A10515Cos_Mes ;
         Z10516Cos_dia = A10516Cos_dia ;
         Z10517Cos_Ultl = A10517Cos_Ultl ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TTR1000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T018M6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018M6_A407EmprNom[0] ;
      n407EmprNom = T018M6_n407EmprNom[0] ;
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

   public void load18M1420( )
   {
      /* Using cursor T018M7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1420 = (short)(1) ;
         A10517Cos_Ultl = T018M7_A10517Cos_Ultl[0] ;
         n10517Cos_Ultl = T018M7_n10517Cos_Ultl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10517Cos_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10517Cos_Ultl), 4, 0));
         A407EmprNom = T018M7_A407EmprNom[0] ;
         n407EmprNom = T018M7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm18M1420( -1) ;
      }
      pr_default.close(5);
      onLoadActions18M1420( ) ;
   }

   public void onLoadActions18M1420( )
   {
   }

   public void checkExtendedTable18M1420( )
   {
      nIsDirty_1420 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors18M1420( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey18M1420( )
   {
      /* Using cursor T018M8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1420 = (short)(1) ;
      }
      else
      {
         RcdFound1420 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T018M5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T018M5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18M1420( 1) ;
         RcdFound1420 = (short)(1) ;
         A10514Cos_Any = T018M5_A10514Cos_Any[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
         A10515Cos_Mes = T018M5_A10515Cos_Mes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
         A10516Cos_dia = T018M5_A10516Cos_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
         A10517Cos_Ultl = T018M5_A10517Cos_Ultl[0] ;
         n10517Cos_Ultl = T018M5_n10517Cos_Ultl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10517Cos_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10517Cos_Ultl), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z10514Cos_Any = A10514Cos_Any ;
         Z10515Cos_Mes = A10515Cos_Mes ;
         Z10516Cos_dia = A10516Cos_dia ;
         sMode1420 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load18M1420( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1420 = (short)(0) ;
            initializeNonKey18M1420( ) ;
         }
         Gx_mode = sMode1420 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1420 = (short)(0) ;
         initializeNonKey18M1420( ) ;
         sMode1420 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1420 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey18M1420( ) ;
      if ( RcdFound1420 == 0 )
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
      RcdFound1420 = (short)(0) ;
      /* Using cursor T018M9 */
      pr_default.execute(7, new Object[] {Short.valueOf(A10514Cos_Any), Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10515Cos_Mes), Short.valueOf(A10514Cos_Any), Byte.valueOf(A10516Cos_dia), A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T018M9_A10514Cos_Any[0] < A10514Cos_Any ) || ( T018M9_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M9_A10515Cos_Mes[0] < A10515Cos_Mes ) || ( T018M9_A10515Cos_Mes[0] == A10515Cos_Mes ) && ( T018M9_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M9_A10516Cos_dia[0] < A10516Cos_dia ) ) && ( GXutil.strcmp(T018M9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T018M9_A10514Cos_Any[0] > A10514Cos_Any ) || ( T018M9_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M9_A10515Cos_Mes[0] > A10515Cos_Mes ) || ( T018M9_A10515Cos_Mes[0] == A10515Cos_Mes ) && ( T018M9_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M9_A10516Cos_dia[0] > A10516Cos_dia ) ) && ( GXutil.strcmp(T018M9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10514Cos_Any = T018M9_A10514Cos_Any[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
            A10515Cos_Mes = T018M9_A10515Cos_Mes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
            A10516Cos_dia = T018M9_A10516Cos_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
            RcdFound1420 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1420 = (short)(0) ;
      /* Using cursor T018M10 */
      pr_default.execute(8, new Object[] {Short.valueOf(A10514Cos_Any), Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10515Cos_Mes), Short.valueOf(A10514Cos_Any), Byte.valueOf(A10516Cos_dia), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T018M10_A10514Cos_Any[0] > A10514Cos_Any ) || ( T018M10_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M10_A10515Cos_Mes[0] > A10515Cos_Mes ) || ( T018M10_A10515Cos_Mes[0] == A10515Cos_Mes ) && ( T018M10_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M10_A10516Cos_dia[0] > A10516Cos_dia ) ) && ( GXutil.strcmp(T018M10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T018M10_A10514Cos_Any[0] < A10514Cos_Any ) || ( T018M10_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M10_A10515Cos_Mes[0] < A10515Cos_Mes ) || ( T018M10_A10515Cos_Mes[0] == A10515Cos_Mes ) && ( T018M10_A10514Cos_Any[0] == A10514Cos_Any ) && ( T018M10_A10516Cos_dia[0] < A10516Cos_dia ) ) && ( GXutil.strcmp(T018M10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10514Cos_Any = T018M10_A10514Cos_Any[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
            A10515Cos_Mes = T018M10_A10515Cos_Mes[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
            A10516Cos_dia = T018M10_A10516Cos_dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
            RcdFound1420 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey18M1420( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCos_Any_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert18M1420( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1420 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10514Cos_Any != Z10514Cos_Any ) || ( A10515Cos_Mes != Z10515Cos_Mes ) || ( A10516Cos_dia != Z10516Cos_dia ) )
            {
               A10514Cos_Any = Z10514Cos_Any ;
               httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
               A10515Cos_Mes = Z10515Cos_Mes ;
               httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
               A10516Cos_dia = Z10516Cos_dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCos_Any_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update18M1420( ) ;
               GX_FocusControl = edtCos_Any_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10514Cos_Any != Z10514Cos_Any ) || ( A10515Cos_Mes != Z10515Cos_Mes ) || ( A10516Cos_dia != Z10516Cos_dia ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCos_Any_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert18M1420( ) ;
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
                  GX_FocusControl = edtCos_Any_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert18M1420( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10514Cos_Any != Z10514Cos_Any ) || ( A10515Cos_Mes != Z10515Cos_Mes ) || ( A10516Cos_dia != Z10516Cos_dia ) )
      {
         A10514Cos_Any = Z10514Cos_Any ;
         httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
         A10515Cos_Mes = Z10515Cos_Mes ;
         httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
         A10516Cos_dia = Z10516Cos_dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCos_Any_Internalname ;
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
      getKey18M1420( ) ;
      if ( RcdFound1420 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10514Cos_Any != Z10514Cos_Any ) || ( A10515Cos_Mes != Z10515Cos_Mes ) || ( A10516Cos_dia != Z10516Cos_dia ) )
         {
            A10514Cos_Any = Z10514Cos_Any ;
            httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
            A10515Cos_Mes = Z10515Cos_Mes ;
            httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
            A10516Cos_dia = Z10516Cos_dia ;
            httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A10514Cos_Any != Z10514Cos_Any ) || ( A10515Cos_Mes != Z10515Cos_Mes ) || ( A10516Cos_dia != Z10516Cos_dia ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr1000");
      GX_FocusControl = edtCos_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_18M0( ) ;
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
      if ( RcdFound1420 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtCos_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart18M1420( ) ;
      if ( RcdFound1420 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCos_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18M1420( ) ;
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
      if ( RcdFound1420 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCos_Ultl_Internalname ;
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
      if ( RcdFound1420 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCos_Ultl_Internalname ;
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
      scanStart18M1420( ) ;
      if ( RcdFound1420 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1420 != 0 )
         {
            scanNext18M1420( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtCos_Ultl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd18M1420( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency18M1420( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018M4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR1000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10517Cos_Ultl != T018M4_A10517Cos_Ultl[0] ) )
         {
            if ( Z10517Cos_Ultl != T018M4_A10517Cos_Ultl[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Ultl");
               GXutil.writeLogRaw("Old: ",Z10517Cos_Ultl);
               GXutil.writeLogRaw("Current: ",T018M4_A10517Cos_Ultl[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR1000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18M1420( )
   {
      beforeValidate18M1420( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18M1420( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18M1420( 0) ;
         checkOptimisticConcurrency18M1420( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18M1420( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18M1420( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018M11 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Boolean.valueOf(n10517Cos_Ultl), Short.valueOf(A10517Cos_Ultl), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR1000");
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
                        processLevel18M1420( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption18M0( ) ;
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
            load18M1420( ) ;
         }
         endLevel18M1420( ) ;
      }
      closeExtendedTableCursors18M1420( ) ;
   }

   public void update18M1420( )
   {
      beforeValidate18M1420( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18M1420( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18M1420( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18M1420( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate18M1420( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018M12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n10517Cos_Ultl), Short.valueOf(A10517Cos_Ultl), A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR1000");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR1000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate18M1420( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel18M1420( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption18M0( ) ;
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
         endLevel18M1420( ) ;
      }
      closeExtendedTableCursors18M1420( ) ;
   }

   public void deferredUpdate18M1420( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18M1420( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18M1420( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18M1420( ) ;
         afterConfirm18M1420( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18M1420( ) ;
            if ( AnyError == 0 )
            {
               scanStart18M1421( ) ;
               while ( RcdFound1421 != 0 )
               {
                  getByPrimaryKey18M1421( ) ;
                  delete18M1421( ) ;
                  scanNext18M1421( ) ;
               }
               scanEnd18M1421( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018M13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR1000");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1420 == 0 )
                        {
                           initAll18M1420( ) ;
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
                        resetCaption18M0( ) ;
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
      sMode1420 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18M1420( ) ;
      Gx_mode = sMode1420 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18M1420( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel18M1421( )
   {
      nGXsfl_49_idx = 0 ;
      while ( nGXsfl_49_idx < nRC_GXsfl_49 )
      {
         readRow18M1421( ) ;
         if ( ( nRcdExists_1421 != 0 ) || ( nIsMod_1421 != 0 ) )
         {
            standaloneNotModal18M1421( ) ;
            getKey18M1421( ) ;
            if ( ( nRcdExists_1421 == 0 ) && ( nRcdDeleted_1421 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert18M1421( ) ;
            }
            else
            {
               if ( RcdFound1421 != 0 )
               {
                  if ( ( nRcdDeleted_1421 != 0 ) && ( nRcdExists_1421 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete18M1421( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1421 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update18M1421( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1421 == 0 )
                  {
                     GXCCtl = "COS_LINEA_" + sGXsfl_49_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCos_linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1421_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10518Cos_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_ColNm_Internalname, GXutil.rtrim( A10526Cos_ColNm)) ;
         httpContext.changePostValue( edtCos_hdr_Internalname, GXutil.ltrim( localUtil.ntoc( A10519Cos_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_hdrr_Internalname, GXutil.ltrim( localUtil.ntoc( A10520Cos_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_hdrp_Internalname, GXutil.rtrim( A10521Cos_hdrp)) ;
         httpContext.changePostValue( edtCos_Fab_Internalname, GXutil.ltrim( localUtil.ntoc( A10522Cos_Fab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Pq_Internalname, GXutil.ltrim( localUtil.ntoc( A10523Cos_Pq, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_H2o_Internalname, GXutil.ltrim( localUtil.ntoc( A10524Cos_H2o, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Art_Internalname, GXutil.rtrim( A10525Cos_Art)) ;
         httpContext.changePostValue( edtCos_ColNn_Internalname, GXutil.ltrim( localUtil.ntoc( A10527Cos_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_tc_Internalname, GXutil.ltrim( localUtil.ntoc( A10528Cos_tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Vol_Internalname, GXutil.ltrim( localUtil.ntoc( A10529Cos_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Mq_Internalname, GXutil.rtrim( A10530Cos_Mq)) ;
         httpContext.changePostValue( edtCos_Kgs_Internalname, GXutil.ltrim( localUtil.ntoc( A10531Cos_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_KgsT_Internalname, GXutil.ltrim( localUtil.ntoc( A10532Cos_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Numt_Internalname, GXutil.ltrim( localUtil.ntoc( A10533Cos_Numt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_lot_Internalname, GXutil.rtrim( A10534Cos_lot)) ;
         httpContext.changePostValue( edtCos_tot_Internalname, GXutil.ltrim( localUtil.ntoc( A10535Cos_tot, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Clicod_Internalname, GXutil.ltrim( localUtil.ntoc( A10536Cos_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCos_Acs_Internalname, GXutil.rtrim( A10537Cos_Acs)) ;
         httpContext.changePostValue( edtCos_Nprog_Internalname, GXutil.rtrim( A10538Cos_Nprog)) ;
         httpContext.changePostValue( edtCos_TipoR_Internalname, GXutil.rtrim( A10548Cos_TipoR)) ;
         httpContext.changePostValue( "ZT_"+"Z10518Cos_linea_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10518Cos_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10526Cos_ColNm_"+sGXsfl_49_idx, GXutil.rtrim( Z10526Cos_ColNm)) ;
         httpContext.changePostValue( "ZT_"+"Z10519Cos_hdr_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10519Cos_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10520Cos_hdrr_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10520Cos_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10521Cos_hdrp_"+sGXsfl_49_idx, GXutil.rtrim( Z10521Cos_hdrp)) ;
         httpContext.changePostValue( "ZT_"+"Z10522Cos_Fab_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10522Cos_Fab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10523Cos_Pq_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10523Cos_Pq, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10524Cos_H2o_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10524Cos_H2o, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10525Cos_Art_"+sGXsfl_49_idx, GXutil.rtrim( Z10525Cos_Art)) ;
         httpContext.changePostValue( "ZT_"+"Z10527Cos_ColNn_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10527Cos_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10528Cos_tc_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10528Cos_tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10529Cos_Vol_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10529Cos_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10530Cos_Mq_"+sGXsfl_49_idx, GXutil.rtrim( Z10530Cos_Mq)) ;
         httpContext.changePostValue( "ZT_"+"Z10531Cos_Kgs_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10531Cos_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10532Cos_KgsT_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10532Cos_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10533Cos_Numt_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10533Cos_Numt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10534Cos_lot_"+sGXsfl_49_idx, GXutil.rtrim( Z10534Cos_lot)) ;
         httpContext.changePostValue( "ZT_"+"Z10535Cos_tot_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10535Cos_tot, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10536Cos_Clicod_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( Z10536Cos_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10537Cos_Acs_"+sGXsfl_49_idx, GXutil.rtrim( Z10537Cos_Acs)) ;
         httpContext.changePostValue( "ZT_"+"Z10538Cos_Nprog_"+sGXsfl_49_idx, GXutil.rtrim( Z10538Cos_Nprog)) ;
         httpContext.changePostValue( "ZT_"+"Z10548Cos_TipoR_"+sGXsfl_49_idx, GXutil.rtrim( Z10548Cos_TipoR)) ;
         httpContext.changePostValue( "nRcdDeleted_1421_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1421_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1421_"+sGXsfl_49_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1421 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1421_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1421_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_LINEA_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_COLNM_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_HDR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_HDRR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_HDRP_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_FAB_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Fab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_PQ_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Pq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_H2O_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_H2o_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_ART_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Art_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_COLNN_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_TC_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_VOL_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Vol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_MQ_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Mq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_KGS_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Kgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_KGST_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_KgsT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_NUMT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Numt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_LOT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_lot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_TOT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tot_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_CLICOD_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Clicod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_ACS_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Acs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_NPROG_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Nprog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "COS_TIPOR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_TipoR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll18M1421( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1421 = (short)(0) ;
      nIsMod_1421 = (short)(0) ;
      nRcdDeleted_1421 = (short)(0) ;
   }

   public void processLevel18M1420( )
   {
      /* Save parent mode. */
      sMode1420 = Gx_mode ;
      processNestedLevel18M1421( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1420 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel18M1420( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete18M1420( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttr1000");
         if ( AnyError == 0 )
         {
            confirmValues18M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttr1000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart18M1420( )
   {
      /* Scan By routine */
      /* Using cursor T018M14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound1420 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1420 = (short)(1) ;
         A10514Cos_Any = T018M14_A10514Cos_Any[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
         A10515Cos_Mes = T018M14_A10515Cos_Mes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
         A10516Cos_dia = T018M14_A10516Cos_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18M1420( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound1420 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1420 = (short)(1) ;
         A10514Cos_Any = T018M14_A10514Cos_Any[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
         A10515Cos_Mes = T018M14_A10515Cos_Mes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
         A10516Cos_dia = T018M14_A10516Cos_dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
      }
   }

   public void scanEnd18M1420( )
   {
      pr_default.close(12);
   }

   public void afterConfirm18M1420( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18M1420( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18M1420( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18M1420( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18M1420( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18M1420( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18M1420( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCos_Any_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Any_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Any_Enabled), 5, 0), true);
      edtCos_Mes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Mes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Mes_Enabled), 5, 0), true);
      edtCos_dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_dia_Enabled), 5, 0), true);
      edtCos_Ultl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Ultl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Ultl_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm18M1421( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10526Cos_ColNm = T018M3_A10526Cos_ColNm[0] ;
            Z10519Cos_hdr = T018M3_A10519Cos_hdr[0] ;
            Z10520Cos_hdrr = T018M3_A10520Cos_hdrr[0] ;
            Z10521Cos_hdrp = T018M3_A10521Cos_hdrp[0] ;
            Z10522Cos_Fab = T018M3_A10522Cos_Fab[0] ;
            Z10523Cos_Pq = T018M3_A10523Cos_Pq[0] ;
            Z10524Cos_H2o = T018M3_A10524Cos_H2o[0] ;
            Z10525Cos_Art = T018M3_A10525Cos_Art[0] ;
            Z10527Cos_ColNn = T018M3_A10527Cos_ColNn[0] ;
            Z10528Cos_tc = T018M3_A10528Cos_tc[0] ;
            Z10529Cos_Vol = T018M3_A10529Cos_Vol[0] ;
            Z10530Cos_Mq = T018M3_A10530Cos_Mq[0] ;
            Z10531Cos_Kgs = T018M3_A10531Cos_Kgs[0] ;
            Z10532Cos_KgsT = T018M3_A10532Cos_KgsT[0] ;
            Z10533Cos_Numt = T018M3_A10533Cos_Numt[0] ;
            Z10534Cos_lot = T018M3_A10534Cos_lot[0] ;
            Z10535Cos_tot = T018M3_A10535Cos_tot[0] ;
            Z10536Cos_Clicod = T018M3_A10536Cos_Clicod[0] ;
            Z10537Cos_Acs = T018M3_A10537Cos_Acs[0] ;
            Z10538Cos_Nprog = T018M3_A10538Cos_Nprog[0] ;
            Z10548Cos_TipoR = T018M3_A10548Cos_TipoR[0] ;
         }
         else
         {
            Z10526Cos_ColNm = A10526Cos_ColNm ;
            Z10519Cos_hdr = A10519Cos_hdr ;
            Z10520Cos_hdrr = A10520Cos_hdrr ;
            Z10521Cos_hdrp = A10521Cos_hdrp ;
            Z10522Cos_Fab = A10522Cos_Fab ;
            Z10523Cos_Pq = A10523Cos_Pq ;
            Z10524Cos_H2o = A10524Cos_H2o ;
            Z10525Cos_Art = A10525Cos_Art ;
            Z10527Cos_ColNn = A10527Cos_ColNn ;
            Z10528Cos_tc = A10528Cos_tc ;
            Z10529Cos_Vol = A10529Cos_Vol ;
            Z10530Cos_Mq = A10530Cos_Mq ;
            Z10531Cos_Kgs = A10531Cos_Kgs ;
            Z10532Cos_KgsT = A10532Cos_KgsT ;
            Z10533Cos_Numt = A10533Cos_Numt ;
            Z10534Cos_lot = A10534Cos_lot ;
            Z10535Cos_tot = A10535Cos_tot ;
            Z10536Cos_Clicod = A10536Cos_Clicod ;
            Z10537Cos_Acs = A10537Cos_Acs ;
            Z10538Cos_Nprog = A10538Cos_Nprog ;
            Z10548Cos_TipoR = A10548Cos_TipoR ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10514Cos_Any = A10514Cos_Any ;
         Z10515Cos_Mes = A10515Cos_Mes ;
         Z10516Cos_dia = A10516Cos_dia ;
         Z10518Cos_linea = A10518Cos_linea ;
         Z10526Cos_ColNm = A10526Cos_ColNm ;
         Z10519Cos_hdr = A10519Cos_hdr ;
         Z10520Cos_hdrr = A10520Cos_hdrr ;
         Z10521Cos_hdrp = A10521Cos_hdrp ;
         Z10522Cos_Fab = A10522Cos_Fab ;
         Z10523Cos_Pq = A10523Cos_Pq ;
         Z10524Cos_H2o = A10524Cos_H2o ;
         Z10525Cos_Art = A10525Cos_Art ;
         Z10527Cos_ColNn = A10527Cos_ColNn ;
         Z10528Cos_tc = A10528Cos_tc ;
         Z10529Cos_Vol = A10529Cos_Vol ;
         Z10530Cos_Mq = A10530Cos_Mq ;
         Z10531Cos_Kgs = A10531Cos_Kgs ;
         Z10532Cos_KgsT = A10532Cos_KgsT ;
         Z10533Cos_Numt = A10533Cos_Numt ;
         Z10534Cos_lot = A10534Cos_lot ;
         Z10535Cos_tot = A10535Cos_tot ;
         Z10536Cos_Clicod = A10536Cos_Clicod ;
         Z10537Cos_Acs = A10537Cos_Acs ;
         Z10538Cos_Nprog = A10538Cos_Nprog ;
         Z10548Cos_TipoR = A10548Cos_TipoR ;
      }
   }

   public void standaloneNotModal18M1421( )
   {
   }

   public void standaloneModal18M1421( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCos_linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCos_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_linea_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      }
      else
      {
         edtCos_linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCos_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_linea_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      }
   }

   public void load18M1421( )
   {
      /* Using cursor T018M15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1421 = (short)(1) ;
         A10526Cos_ColNm = T018M15_A10526Cos_ColNm[0] ;
         n10526Cos_ColNm = T018M15_n10526Cos_ColNm[0] ;
         A10519Cos_hdr = T018M15_A10519Cos_hdr[0] ;
         n10519Cos_hdr = T018M15_n10519Cos_hdr[0] ;
         A10520Cos_hdrr = T018M15_A10520Cos_hdrr[0] ;
         n10520Cos_hdrr = T018M15_n10520Cos_hdrr[0] ;
         A10521Cos_hdrp = T018M15_A10521Cos_hdrp[0] ;
         n10521Cos_hdrp = T018M15_n10521Cos_hdrp[0] ;
         A10522Cos_Fab = T018M15_A10522Cos_Fab[0] ;
         n10522Cos_Fab = T018M15_n10522Cos_Fab[0] ;
         A10523Cos_Pq = T018M15_A10523Cos_Pq[0] ;
         n10523Cos_Pq = T018M15_n10523Cos_Pq[0] ;
         A10524Cos_H2o = T018M15_A10524Cos_H2o[0] ;
         n10524Cos_H2o = T018M15_n10524Cos_H2o[0] ;
         A10525Cos_Art = T018M15_A10525Cos_Art[0] ;
         n10525Cos_Art = T018M15_n10525Cos_Art[0] ;
         A10527Cos_ColNn = T018M15_A10527Cos_ColNn[0] ;
         n10527Cos_ColNn = T018M15_n10527Cos_ColNn[0] ;
         A10528Cos_tc = T018M15_A10528Cos_tc[0] ;
         n10528Cos_tc = T018M15_n10528Cos_tc[0] ;
         A10529Cos_Vol = T018M15_A10529Cos_Vol[0] ;
         n10529Cos_Vol = T018M15_n10529Cos_Vol[0] ;
         A10530Cos_Mq = T018M15_A10530Cos_Mq[0] ;
         n10530Cos_Mq = T018M15_n10530Cos_Mq[0] ;
         A10531Cos_Kgs = T018M15_A10531Cos_Kgs[0] ;
         n10531Cos_Kgs = T018M15_n10531Cos_Kgs[0] ;
         A10532Cos_KgsT = T018M15_A10532Cos_KgsT[0] ;
         n10532Cos_KgsT = T018M15_n10532Cos_KgsT[0] ;
         A10533Cos_Numt = T018M15_A10533Cos_Numt[0] ;
         n10533Cos_Numt = T018M15_n10533Cos_Numt[0] ;
         A10534Cos_lot = T018M15_A10534Cos_lot[0] ;
         n10534Cos_lot = T018M15_n10534Cos_lot[0] ;
         A10535Cos_tot = T018M15_A10535Cos_tot[0] ;
         n10535Cos_tot = T018M15_n10535Cos_tot[0] ;
         A10536Cos_Clicod = T018M15_A10536Cos_Clicod[0] ;
         n10536Cos_Clicod = T018M15_n10536Cos_Clicod[0] ;
         A10537Cos_Acs = T018M15_A10537Cos_Acs[0] ;
         n10537Cos_Acs = T018M15_n10537Cos_Acs[0] ;
         A10538Cos_Nprog = T018M15_A10538Cos_Nprog[0] ;
         n10538Cos_Nprog = T018M15_n10538Cos_Nprog[0] ;
         A10548Cos_TipoR = T018M15_A10548Cos_TipoR[0] ;
         n10548Cos_TipoR = T018M15_n10548Cos_TipoR[0] ;
         zm18M1421( -3) ;
      }
      pr_default.close(13);
      onLoadActions18M1421( ) ;
   }

   public void onLoadActions18M1421( )
   {
   }

   public void checkExtendedTable18M1421( )
   {
      nIsDirty_1421 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal18M1421( ) ;
   }

   public void closeExtendedTableCursors18M1421( )
   {
   }

   public void enableDisable18M1421( )
   {
   }

   public void getKey18M1421( )
   {
      /* Using cursor T018M16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1421 = (short)(1) ;
      }
      else
      {
         RcdFound1421 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey18M1421( )
   {
      /* Using cursor T018M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T018M3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm18M1421( 3) ;
         RcdFound1421 = (short)(1) ;
         initializeNonKey18M1421( ) ;
         A10518Cos_linea = T018M3_A10518Cos_linea[0] ;
         A10526Cos_ColNm = T018M3_A10526Cos_ColNm[0] ;
         n10526Cos_ColNm = T018M3_n10526Cos_ColNm[0] ;
         A10519Cos_hdr = T018M3_A10519Cos_hdr[0] ;
         n10519Cos_hdr = T018M3_n10519Cos_hdr[0] ;
         A10520Cos_hdrr = T018M3_A10520Cos_hdrr[0] ;
         n10520Cos_hdrr = T018M3_n10520Cos_hdrr[0] ;
         A10521Cos_hdrp = T018M3_A10521Cos_hdrp[0] ;
         n10521Cos_hdrp = T018M3_n10521Cos_hdrp[0] ;
         A10522Cos_Fab = T018M3_A10522Cos_Fab[0] ;
         n10522Cos_Fab = T018M3_n10522Cos_Fab[0] ;
         A10523Cos_Pq = T018M3_A10523Cos_Pq[0] ;
         n10523Cos_Pq = T018M3_n10523Cos_Pq[0] ;
         A10524Cos_H2o = T018M3_A10524Cos_H2o[0] ;
         n10524Cos_H2o = T018M3_n10524Cos_H2o[0] ;
         A10525Cos_Art = T018M3_A10525Cos_Art[0] ;
         n10525Cos_Art = T018M3_n10525Cos_Art[0] ;
         A10527Cos_ColNn = T018M3_A10527Cos_ColNn[0] ;
         n10527Cos_ColNn = T018M3_n10527Cos_ColNn[0] ;
         A10528Cos_tc = T018M3_A10528Cos_tc[0] ;
         n10528Cos_tc = T018M3_n10528Cos_tc[0] ;
         A10529Cos_Vol = T018M3_A10529Cos_Vol[0] ;
         n10529Cos_Vol = T018M3_n10529Cos_Vol[0] ;
         A10530Cos_Mq = T018M3_A10530Cos_Mq[0] ;
         n10530Cos_Mq = T018M3_n10530Cos_Mq[0] ;
         A10531Cos_Kgs = T018M3_A10531Cos_Kgs[0] ;
         n10531Cos_Kgs = T018M3_n10531Cos_Kgs[0] ;
         A10532Cos_KgsT = T018M3_A10532Cos_KgsT[0] ;
         n10532Cos_KgsT = T018M3_n10532Cos_KgsT[0] ;
         A10533Cos_Numt = T018M3_A10533Cos_Numt[0] ;
         n10533Cos_Numt = T018M3_n10533Cos_Numt[0] ;
         A10534Cos_lot = T018M3_A10534Cos_lot[0] ;
         n10534Cos_lot = T018M3_n10534Cos_lot[0] ;
         A10535Cos_tot = T018M3_A10535Cos_tot[0] ;
         n10535Cos_tot = T018M3_n10535Cos_tot[0] ;
         A10536Cos_Clicod = T018M3_A10536Cos_Clicod[0] ;
         n10536Cos_Clicod = T018M3_n10536Cos_Clicod[0] ;
         A10537Cos_Acs = T018M3_A10537Cos_Acs[0] ;
         n10537Cos_Acs = T018M3_n10537Cos_Acs[0] ;
         A10538Cos_Nprog = T018M3_A10538Cos_Nprog[0] ;
         n10538Cos_Nprog = T018M3_n10538Cos_Nprog[0] ;
         A10548Cos_TipoR = T018M3_A10548Cos_TipoR[0] ;
         n10548Cos_TipoR = T018M3_n10548Cos_TipoR[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10514Cos_Any = A10514Cos_Any ;
         Z10515Cos_Mes = A10515Cos_Mes ;
         Z10516Cos_dia = A10516Cos_dia ;
         Z10518Cos_linea = A10518Cos_linea ;
         sMode1421 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18M1421( ) ;
         load18M1421( ) ;
         Gx_mode = sMode1421 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1421 = (short)(0) ;
         initializeNonKey18M1421( ) ;
         sMode1421 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal18M1421( ) ;
         Gx_mode = sMode1421 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes18M1421( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency18M1421( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T018M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR1001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10526Cos_ColNm, T018M2_A10526Cos_ColNm[0]) != 0 ) || ( Z10519Cos_hdr != T018M2_A10519Cos_hdr[0] ) || ( Z10520Cos_hdrr != T018M2_A10520Cos_hdrr[0] ) || ( GXutil.strcmp(Z10521Cos_hdrp, T018M2_A10521Cos_hdrp[0]) != 0 ) || ( DecimalUtil.compareTo(Z10522Cos_Fab, T018M2_A10522Cos_Fab[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10523Cos_Pq, T018M2_A10523Cos_Pq[0]) != 0 ) || ( DecimalUtil.compareTo(Z10524Cos_H2o, T018M2_A10524Cos_H2o[0]) != 0 ) || ( GXutil.strcmp(Z10525Cos_Art, T018M2_A10525Cos_Art[0]) != 0 ) || ( Z10527Cos_ColNn != T018M2_A10527Cos_ColNn[0] ) || ( Z10528Cos_tc != T018M2_A10528Cos_tc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10529Cos_Vol != T018M2_A10529Cos_Vol[0] ) || ( GXutil.strcmp(Z10530Cos_Mq, T018M2_A10530Cos_Mq[0]) != 0 ) || ( DecimalUtil.compareTo(Z10531Cos_Kgs, T018M2_A10531Cos_Kgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z10532Cos_KgsT, T018M2_A10532Cos_KgsT[0]) != 0 ) || ( Z10533Cos_Numt != T018M2_A10533Cos_Numt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10534Cos_lot, T018M2_A10534Cos_lot[0]) != 0 ) || ( Z10535Cos_tot != T018M2_A10535Cos_tot[0] ) || ( Z10536Cos_Clicod != T018M2_A10536Cos_Clicod[0] ) || ( GXutil.strcmp(Z10537Cos_Acs, T018M2_A10537Cos_Acs[0]) != 0 ) || ( GXutil.strcmp(Z10538Cos_Nprog, T018M2_A10538Cos_Nprog[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10548Cos_TipoR, T018M2_A10548Cos_TipoR[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10526Cos_ColNm, T018M2_A10526Cos_ColNm[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_ColNm");
               GXutil.writeLogRaw("Old: ",Z10526Cos_ColNm);
               GXutil.writeLogRaw("Current: ",T018M2_A10526Cos_ColNm[0]);
            }
            if ( Z10519Cos_hdr != T018M2_A10519Cos_hdr[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_hdr");
               GXutil.writeLogRaw("Old: ",Z10519Cos_hdr);
               GXutil.writeLogRaw("Current: ",T018M2_A10519Cos_hdr[0]);
            }
            if ( Z10520Cos_hdrr != T018M2_A10520Cos_hdrr[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_hdrr");
               GXutil.writeLogRaw("Old: ",Z10520Cos_hdrr);
               GXutil.writeLogRaw("Current: ",T018M2_A10520Cos_hdrr[0]);
            }
            if ( GXutil.strcmp(Z10521Cos_hdrp, T018M2_A10521Cos_hdrp[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_hdrp");
               GXutil.writeLogRaw("Old: ",Z10521Cos_hdrp);
               GXutil.writeLogRaw("Current: ",T018M2_A10521Cos_hdrp[0]);
            }
            if ( DecimalUtil.compareTo(Z10522Cos_Fab, T018M2_A10522Cos_Fab[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Fab");
               GXutil.writeLogRaw("Old: ",Z10522Cos_Fab);
               GXutil.writeLogRaw("Current: ",T018M2_A10522Cos_Fab[0]);
            }
            if ( DecimalUtil.compareTo(Z10523Cos_Pq, T018M2_A10523Cos_Pq[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Pq");
               GXutil.writeLogRaw("Old: ",Z10523Cos_Pq);
               GXutil.writeLogRaw("Current: ",T018M2_A10523Cos_Pq[0]);
            }
            if ( DecimalUtil.compareTo(Z10524Cos_H2o, T018M2_A10524Cos_H2o[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_H2o");
               GXutil.writeLogRaw("Old: ",Z10524Cos_H2o);
               GXutil.writeLogRaw("Current: ",T018M2_A10524Cos_H2o[0]);
            }
            if ( GXutil.strcmp(Z10525Cos_Art, T018M2_A10525Cos_Art[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Art");
               GXutil.writeLogRaw("Old: ",Z10525Cos_Art);
               GXutil.writeLogRaw("Current: ",T018M2_A10525Cos_Art[0]);
            }
            if ( Z10527Cos_ColNn != T018M2_A10527Cos_ColNn[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_ColNn");
               GXutil.writeLogRaw("Old: ",Z10527Cos_ColNn);
               GXutil.writeLogRaw("Current: ",T018M2_A10527Cos_ColNn[0]);
            }
            if ( Z10528Cos_tc != T018M2_A10528Cos_tc[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_tc");
               GXutil.writeLogRaw("Old: ",Z10528Cos_tc);
               GXutil.writeLogRaw("Current: ",T018M2_A10528Cos_tc[0]);
            }
            if ( Z10529Cos_Vol != T018M2_A10529Cos_Vol[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Vol");
               GXutil.writeLogRaw("Old: ",Z10529Cos_Vol);
               GXutil.writeLogRaw("Current: ",T018M2_A10529Cos_Vol[0]);
            }
            if ( GXutil.strcmp(Z10530Cos_Mq, T018M2_A10530Cos_Mq[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Mq");
               GXutil.writeLogRaw("Old: ",Z10530Cos_Mq);
               GXutil.writeLogRaw("Current: ",T018M2_A10530Cos_Mq[0]);
            }
            if ( DecimalUtil.compareTo(Z10531Cos_Kgs, T018M2_A10531Cos_Kgs[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Kgs");
               GXutil.writeLogRaw("Old: ",Z10531Cos_Kgs);
               GXutil.writeLogRaw("Current: ",T018M2_A10531Cos_Kgs[0]);
            }
            if ( DecimalUtil.compareTo(Z10532Cos_KgsT, T018M2_A10532Cos_KgsT[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_KgsT");
               GXutil.writeLogRaw("Old: ",Z10532Cos_KgsT);
               GXutil.writeLogRaw("Current: ",T018M2_A10532Cos_KgsT[0]);
            }
            if ( Z10533Cos_Numt != T018M2_A10533Cos_Numt[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Numt");
               GXutil.writeLogRaw("Old: ",Z10533Cos_Numt);
               GXutil.writeLogRaw("Current: ",T018M2_A10533Cos_Numt[0]);
            }
            if ( GXutil.strcmp(Z10534Cos_lot, T018M2_A10534Cos_lot[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_lot");
               GXutil.writeLogRaw("Old: ",Z10534Cos_lot);
               GXutil.writeLogRaw("Current: ",T018M2_A10534Cos_lot[0]);
            }
            if ( Z10535Cos_tot != T018M2_A10535Cos_tot[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_tot");
               GXutil.writeLogRaw("Old: ",Z10535Cos_tot);
               GXutil.writeLogRaw("Current: ",T018M2_A10535Cos_tot[0]);
            }
            if ( Z10536Cos_Clicod != T018M2_A10536Cos_Clicod[0] )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Clicod");
               GXutil.writeLogRaw("Old: ",Z10536Cos_Clicod);
               GXutil.writeLogRaw("Current: ",T018M2_A10536Cos_Clicod[0]);
            }
            if ( GXutil.strcmp(Z10537Cos_Acs, T018M2_A10537Cos_Acs[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Acs");
               GXutil.writeLogRaw("Old: ",Z10537Cos_Acs);
               GXutil.writeLogRaw("Current: ",T018M2_A10537Cos_Acs[0]);
            }
            if ( GXutil.strcmp(Z10538Cos_Nprog, T018M2_A10538Cos_Nprog[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_Nprog");
               GXutil.writeLogRaw("Old: ",Z10538Cos_Nprog);
               GXutil.writeLogRaw("Current: ",T018M2_A10538Cos_Nprog[0]);
            }
            if ( GXutil.strcmp(Z10548Cos_TipoR, T018M2_A10548Cos_TipoR[0]) != 0 )
            {
               GXutil.writeLogln("ttr1000:[seudo value changed for attri]"+"Cos_TipoR");
               GXutil.writeLogRaw("Old: ",Z10548Cos_TipoR);
               GXutil.writeLogRaw("Current: ",T018M2_A10548Cos_TipoR[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTR1001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert18M1421( )
   {
      beforeValidate18M1421( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18M1421( ) ;
      }
      if ( AnyError == 0 )
      {
         zm18M1421( 0) ;
         checkOptimisticConcurrency18M1421( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm18M1421( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert18M1421( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T018M17 */
                  pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea), Boolean.valueOf(n10526Cos_ColNm), A10526Cos_ColNm, Boolean.valueOf(n10519Cos_hdr), Integer.valueOf(A10519Cos_hdr), Boolean.valueOf(n10520Cos_hdrr), Byte.valueOf(A10520Cos_hdrr), Boolean.valueOf(n10521Cos_hdrp), A10521Cos_hdrp, Boolean.valueOf(n10522Cos_Fab), A10522Cos_Fab, Boolean.valueOf(n10523Cos_Pq), A10523Cos_Pq, Boolean.valueOf(n10524Cos_H2o), A10524Cos_H2o, Boolean.valueOf(n10525Cos_Art), A10525Cos_Art, Boolean.valueOf(n10527Cos_ColNn), Integer.valueOf(A10527Cos_ColNn), Boolean.valueOf(n10528Cos_tc), Short.valueOf(A10528Cos_tc), Boolean.valueOf(n10529Cos_Vol), Integer.valueOf(A10529Cos_Vol), Boolean.valueOf(n10530Cos_Mq), A10530Cos_Mq, Boolean.valueOf(n10531Cos_Kgs), A10531Cos_Kgs, Boolean.valueOf(n10532Cos_KgsT), A10532Cos_KgsT, Boolean.valueOf(n10533Cos_Numt), Short.valueOf(A10533Cos_Numt), Boolean.valueOf(n10534Cos_lot), A10534Cos_lot, Boolean.valueOf(n10535Cos_tot), Integer.valueOf(A10535Cos_tot), Boolean.valueOf(n10536Cos_Clicod), Integer.valueOf(A10536Cos_Clicod), Boolean.valueOf(n10537Cos_Acs), A10537Cos_Acs, Boolean.valueOf(n10538Cos_Nprog), A10538Cos_Nprog, Boolean.valueOf(n10548Cos_TipoR), A10548Cos_TipoR});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR1001");
                  if ( (pr_default.getStatus(15) == 1) )
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
            load18M1421( ) ;
         }
         endLevel18M1421( ) ;
      }
      closeExtendedTableCursors18M1421( ) ;
   }

   public void update18M1421( )
   {
      beforeValidate18M1421( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable18M1421( ) ;
      }
      if ( ( nIsMod_1421 != 0 ) || ( nIsDirty_1421 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency18M1421( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm18M1421( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate18M1421( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T018M18 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n10526Cos_ColNm), A10526Cos_ColNm, Boolean.valueOf(n10519Cos_hdr), Integer.valueOf(A10519Cos_hdr), Boolean.valueOf(n10520Cos_hdrr), Byte.valueOf(A10520Cos_hdrr), Boolean.valueOf(n10521Cos_hdrp), A10521Cos_hdrp, Boolean.valueOf(n10522Cos_Fab), A10522Cos_Fab, Boolean.valueOf(n10523Cos_Pq), A10523Cos_Pq, Boolean.valueOf(n10524Cos_H2o), A10524Cos_H2o, Boolean.valueOf(n10525Cos_Art), A10525Cos_Art, Boolean.valueOf(n10527Cos_ColNn), Integer.valueOf(A10527Cos_ColNn), Boolean.valueOf(n10528Cos_tc), Short.valueOf(A10528Cos_tc), Boolean.valueOf(n10529Cos_Vol), Integer.valueOf(A10529Cos_Vol), Boolean.valueOf(n10530Cos_Mq), A10530Cos_Mq, Boolean.valueOf(n10531Cos_Kgs), A10531Cos_Kgs, Boolean.valueOf(n10532Cos_KgsT), A10532Cos_KgsT, Boolean.valueOf(n10533Cos_Numt), Short.valueOf(A10533Cos_Numt), Boolean.valueOf(n10534Cos_lot), A10534Cos_lot, Boolean.valueOf(n10535Cos_tot), Integer.valueOf(A10535Cos_tot), Boolean.valueOf(n10536Cos_Clicod), Integer.valueOf(A10536Cos_Clicod), Boolean.valueOf(n10537Cos_Acs), A10537Cos_Acs, Boolean.valueOf(n10538Cos_Nprog), A10538Cos_Nprog, Boolean.valueOf(n10548Cos_TipoR), A10548Cos_TipoR, A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR1001");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTR1001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate18M1421( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey18M1421( ) ;
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
            endLevel18M1421( ) ;
         }
      }
      closeExtendedTableCursors18M1421( ) ;
   }

   public void deferredUpdate18M1421( )
   {
   }

   public void delete18M1421( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate18M1421( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency18M1421( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls18M1421( ) ;
         afterConfirm18M1421( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete18M1421( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T018M19 */
               pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia), Short.valueOf(A10518Cos_linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTR1001");
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
      sMode1421 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel18M1421( ) ;
      Gx_mode = sMode1421 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls18M1421( )
   {
      standaloneModal18M1421( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel18M1421( )
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

   public void scanStart18M1421( )
   {
      /* Scan By routine */
      /* Using cursor T018M20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A10514Cos_Any), Byte.valueOf(A10515Cos_Mes), Byte.valueOf(A10516Cos_dia)});
      RcdFound1421 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1421 = (short)(1) ;
         A10518Cos_linea = T018M20_A10518Cos_linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext18M1421( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound1421 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1421 = (short)(1) ;
         A10518Cos_linea = T018M20_A10518Cos_linea[0] ;
      }
   }

   public void scanEnd18M1421( )
   {
      pr_default.close(18);
   }

   public void afterConfirm18M1421( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert18M1421( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate18M1421( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete18M1421( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete18M1421( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate18M1421( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes18M1421( )
   {
      edtCos_linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_linea_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_ColNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_ColNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_ColNm_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_hdr_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_hdrr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_hdrr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_hdrr_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_hdrp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_hdrp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_hdrp_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Fab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Fab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Fab_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Pq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Pq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Pq_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_H2o_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_H2o_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_H2o_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Art_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Art_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Art_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_ColNn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_ColNn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_ColNn_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_tc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_tc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_tc_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Vol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Vol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Vol_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Mq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Mq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Mq_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Kgs_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_KgsT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_KgsT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_KgsT_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Numt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Numt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Numt_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_lot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_lot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_lot_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_tot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_tot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_tot_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Clicod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Acs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Acs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Acs_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_Nprog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_Nprog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_Nprog_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtCos_TipoR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_TipoR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_TipoR_Enabled), 5, 0), !bGXsfl_49_Refreshing);
   }

   public void send_integrity_lvl_hashes18M1421( )
   {
   }

   public void send_integrity_lvl_hashes18M1420( )
   {
   }

   public void subsflControlProps_491421( )
   {
      edtavnRcdDeleted_1421_Internalname = "vNRCDDELETED_1421_"+sGXsfl_49_idx ;
      edtCos_linea_Internalname = "COS_LINEA_"+sGXsfl_49_idx ;
      edtCos_ColNm_Internalname = "COS_COLNM_"+sGXsfl_49_idx ;
      edtCos_hdr_Internalname = "COS_HDR_"+sGXsfl_49_idx ;
      edtCos_hdrr_Internalname = "COS_HDRR_"+sGXsfl_49_idx ;
      edtCos_hdrp_Internalname = "COS_HDRP_"+sGXsfl_49_idx ;
      edtCos_Fab_Internalname = "COS_FAB_"+sGXsfl_49_idx ;
      edtCos_Pq_Internalname = "COS_PQ_"+sGXsfl_49_idx ;
      edtCos_H2o_Internalname = "COS_H2O_"+sGXsfl_49_idx ;
      edtCos_Art_Internalname = "COS_ART_"+sGXsfl_49_idx ;
      edtCos_ColNn_Internalname = "COS_COLNN_"+sGXsfl_49_idx ;
      edtCos_tc_Internalname = "COS_TC_"+sGXsfl_49_idx ;
      edtCos_Vol_Internalname = "COS_VOL_"+sGXsfl_49_idx ;
      edtCos_Mq_Internalname = "COS_MQ_"+sGXsfl_49_idx ;
      edtCos_Kgs_Internalname = "COS_KGS_"+sGXsfl_49_idx ;
      edtCos_KgsT_Internalname = "COS_KGST_"+sGXsfl_49_idx ;
      edtCos_Numt_Internalname = "COS_NUMT_"+sGXsfl_49_idx ;
      edtCos_lot_Internalname = "COS_LOT_"+sGXsfl_49_idx ;
      edtCos_tot_Internalname = "COS_TOT_"+sGXsfl_49_idx ;
      edtCos_Clicod_Internalname = "COS_CLICOD_"+sGXsfl_49_idx ;
      edtCos_Acs_Internalname = "COS_ACS_"+sGXsfl_49_idx ;
      edtCos_Nprog_Internalname = "COS_NPROG_"+sGXsfl_49_idx ;
      edtCos_TipoR_Internalname = "COS_TIPOR_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_491421( )
   {
      edtavnRcdDeleted_1421_Internalname = "vNRCDDELETED_1421_"+sGXsfl_49_fel_idx ;
      edtCos_linea_Internalname = "COS_LINEA_"+sGXsfl_49_fel_idx ;
      edtCos_ColNm_Internalname = "COS_COLNM_"+sGXsfl_49_fel_idx ;
      edtCos_hdr_Internalname = "COS_HDR_"+sGXsfl_49_fel_idx ;
      edtCos_hdrr_Internalname = "COS_HDRR_"+sGXsfl_49_fel_idx ;
      edtCos_hdrp_Internalname = "COS_HDRP_"+sGXsfl_49_fel_idx ;
      edtCos_Fab_Internalname = "COS_FAB_"+sGXsfl_49_fel_idx ;
      edtCos_Pq_Internalname = "COS_PQ_"+sGXsfl_49_fel_idx ;
      edtCos_H2o_Internalname = "COS_H2O_"+sGXsfl_49_fel_idx ;
      edtCos_Art_Internalname = "COS_ART_"+sGXsfl_49_fel_idx ;
      edtCos_ColNn_Internalname = "COS_COLNN_"+sGXsfl_49_fel_idx ;
      edtCos_tc_Internalname = "COS_TC_"+sGXsfl_49_fel_idx ;
      edtCos_Vol_Internalname = "COS_VOL_"+sGXsfl_49_fel_idx ;
      edtCos_Mq_Internalname = "COS_MQ_"+sGXsfl_49_fel_idx ;
      edtCos_Kgs_Internalname = "COS_KGS_"+sGXsfl_49_fel_idx ;
      edtCos_KgsT_Internalname = "COS_KGST_"+sGXsfl_49_fel_idx ;
      edtCos_Numt_Internalname = "COS_NUMT_"+sGXsfl_49_fel_idx ;
      edtCos_lot_Internalname = "COS_LOT_"+sGXsfl_49_fel_idx ;
      edtCos_tot_Internalname = "COS_TOT_"+sGXsfl_49_fel_idx ;
      edtCos_Clicod_Internalname = "COS_CLICOD_"+sGXsfl_49_fel_idx ;
      edtCos_Acs_Internalname = "COS_ACS_"+sGXsfl_49_fel_idx ;
      edtCos_Nprog_Internalname = "COS_NPROG_"+sGXsfl_49_fel_idx ;
      edtCos_TipoR_Internalname = "COS_TIPOR_"+sGXsfl_49_fel_idx ;
   }

   public void addRow18M1421( )
   {
      nGXsfl_49_idx = (int)(nGXsfl_49_idx+1) ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_491421( ) ;
      sendRow18M1421( ) ;
   }

   public void sendRow18M1421( )
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
         if ( ((int)((nGXsfl_49_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1421_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1421_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1421), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1421), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1421_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1421_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_linea_Internalname,GXutil.ltrim( localUtil.ntoc( A10518Cos_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10518Cos_linea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_linea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_ColNm_Internalname,GXutil.rtrim( A10526Cos_ColNm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_ColNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_ColNm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_hdr_Internalname,GXutil.ltrim( localUtil.ntoc( A10519Cos_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_hdr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10519Cos_hdr), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10519Cos_hdr), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_hdr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_hdrr_Internalname,GXutil.ltrim( localUtil.ntoc( A10520Cos_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_hdrr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10520Cos_hdrr), "9") : localUtil.format( DecimalUtil.doubleToDec(A10520Cos_hdrr), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_hdrr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_hdrr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_hdrp_Internalname,GXutil.rtrim( A10521Cos_hdrp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_hdrp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_hdrp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Fab_Internalname,GXutil.ltrim( localUtil.ntoc( A10522Cos_Fab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_Fab_Enabled!=0) ? localUtil.format( A10522Cos_Fab, "ZZZZZ9.99") : localUtil.format( A10522Cos_Fab, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Fab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Fab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Pq_Internalname,GXutil.ltrim( localUtil.ntoc( A10523Cos_Pq, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_Pq_Enabled!=0) ? localUtil.format( A10523Cos_Pq, "ZZZZZ9.99") : localUtil.format( A10523Cos_Pq, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Pq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Pq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_H2o_Internalname,GXutil.ltrim( localUtil.ntoc( A10524Cos_H2o, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_H2o_Enabled!=0) ? localUtil.format( A10524Cos_H2o, "ZZZZZ9.99") : localUtil.format( A10524Cos_H2o, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_H2o_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_H2o_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Art_Internalname,GXutil.rtrim( A10525Cos_Art),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Art_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Art_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_ColNn_Internalname,GXutil.ltrim( localUtil.ntoc( A10527Cos_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_ColNn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10527Cos_ColNn), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10527Cos_ColNn), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_ColNn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_ColNn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_tc_Internalname,GXutil.ltrim( localUtil.ntoc( A10528Cos_tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_tc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10528Cos_tc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10528Cos_tc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_tc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_tc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Vol_Internalname,GXutil.ltrim( localUtil.ntoc( A10529Cos_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_Vol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10529Cos_Vol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10529Cos_Vol), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Vol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Vol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Mq_Internalname,GXutil.rtrim( A10530Cos_Mq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Mq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Mq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Kgs_Internalname,GXutil.ltrim( localUtil.ntoc( A10531Cos_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_Kgs_Enabled!=0) ? localUtil.format( A10531Cos_Kgs, "ZZZZZ9.99") : localUtil.format( A10531Cos_Kgs, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Kgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Kgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_KgsT_Internalname,GXutil.ltrim( localUtil.ntoc( A10532Cos_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_KgsT_Enabled!=0) ? localUtil.format( A10532Cos_KgsT, "ZZZZZ9.99") : localUtil.format( A10532Cos_KgsT, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_KgsT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_KgsT_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Numt_Internalname,GXutil.ltrim( localUtil.ntoc( A10533Cos_Numt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_Numt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10533Cos_Numt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10533Cos_Numt), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Numt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Numt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_lot_Internalname,GXutil.rtrim( A10534Cos_lot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_lot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_lot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_tot_Internalname,GXutil.ltrim( localUtil.ntoc( A10535Cos_tot, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_tot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10535Cos_tot), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10535Cos_tot), "ZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_tot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_tot_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Clicod_Internalname,GXutil.ltrim( localUtil.ntoc( A10536Cos_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCos_Clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10536Cos_Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10536Cos_Clicod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Acs_Internalname,GXutil.rtrim( A10537Cos_Acs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Acs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Acs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_Nprog_Internalname,GXutil.rtrim( A10538Cos_Nprog),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_Nprog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_Nprog_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1421_" + sGXsfl_49_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_49_idx + "',49)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCos_TipoR_Internalname,GXutil.rtrim( A10548Cos_TipoR),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCos_TipoR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCos_TipoR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes18M1421( ) ;
      GXCCtl = "Z10518Cos_linea_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10518Cos_linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10526Cos_ColNm_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10526Cos_ColNm));
      GXCCtl = "Z10519Cos_hdr_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10519Cos_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10520Cos_hdrr_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10520Cos_hdrr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10521Cos_hdrp_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10521Cos_hdrp));
      GXCCtl = "Z10522Cos_Fab_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10522Cos_Fab, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10523Cos_Pq_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10523Cos_Pq, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10524Cos_H2o_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10524Cos_H2o, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10525Cos_Art_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10525Cos_Art));
      GXCCtl = "Z10527Cos_ColNn_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10527Cos_ColNn, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10528Cos_tc_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10528Cos_tc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10529Cos_Vol_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10529Cos_Vol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10530Cos_Mq_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10530Cos_Mq));
      GXCCtl = "Z10531Cos_Kgs_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10531Cos_Kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10532Cos_KgsT_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10532Cos_KgsT, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10533Cos_Numt_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10533Cos_Numt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10534Cos_lot_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10534Cos_lot));
      GXCCtl = "Z10535Cos_tot_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10535Cos_tot, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10536Cos_Clicod_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10536Cos_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10537Cos_Acs_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10537Cos_Acs));
      GXCCtl = "Z10538Cos_Nprog_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10538Cos_Nprog));
      GXCCtl = "Z10548Cos_TipoR_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10548Cos_TipoR));
      GXCCtl = "nRcdDeleted_1421_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1421_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1421_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1421, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1421_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1421_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_LINEA_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_COLNM_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_HDR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_HDRR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_HDRP_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_FAB_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Fab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_PQ_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Pq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_H2O_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_H2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_ART_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_COLNN_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_TC_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_VOL_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Vol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_MQ_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Mq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_KGS_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_KGST_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_KgsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_NUMT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Numt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_LOT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_lot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_TOT_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tot_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_CLICOD_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_ACS_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Acs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_NPROG_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Nprog_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COS_TIPOR_"+sGXsfl_49_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_TipoR_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow18M1421( )
   {
      nGXsfl_49_idx = (int)(nGXsfl_49_idx+1) ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_491421( ) ;
      edtavnRcdDeleted_1421_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1421_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_LINEA_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_ColNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_COLNM_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_hdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_HDR_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_hdrr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_HDRR_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_hdrp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_HDRP_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Fab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_FAB_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Pq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_PQ_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_H2o_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_H2O_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Art_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_ART_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_ColNn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_COLNN_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_tc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_TC_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Vol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_VOL_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Mq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_MQ_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Kgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_KGS_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_KgsT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_KGST_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Numt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_NUMT_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_lot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_LOT_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_tot_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_TOT_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Clicod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_CLICOD_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Acs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_ACS_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_Nprog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_NPROG_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCos_TipoR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "COS_TIPOR_"+sGXsfl_49_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1421_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1421_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1421");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1421_Internalname ;
         wbErr = true ;
         nRcdDeleted_1421 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1421 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1421_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COS_LINEA_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_linea_Internalname ;
         wbErr = true ;
         A10518Cos_linea = (short)(0) ;
      }
      else
      {
         A10518Cos_linea = (short)(localUtil.ctol( httpContext.cgiGet( edtCos_linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10526Cos_ColNm = httpContext.cgiGet( edtCos_ColNm_Internalname) ;
      n10526Cos_ColNm = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "COS_HDR_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_hdr_Internalname ;
         wbErr = true ;
         A10519Cos_hdr = 0 ;
         n10519Cos_hdr = false ;
      }
      else
      {
         A10519Cos_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtCos_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10519Cos_hdr = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "COS_HDRR_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_hdrr_Internalname ;
         wbErr = true ;
         A10520Cos_hdrr = (byte)(0) ;
         n10520Cos_hdrr = false ;
      }
      else
      {
         A10520Cos_hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( edtCos_hdrr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10520Cos_hdrr = false ;
      }
      A10521Cos_hdrp = httpContext.cgiGet( edtCos_hdrp_Internalname) ;
      n10521Cos_hdrp = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCos_Fab_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCos_Fab_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COS_FAB_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_Fab_Internalname ;
         wbErr = true ;
         A10522Cos_Fab = DecimalUtil.ZERO ;
         n10522Cos_Fab = false ;
      }
      else
      {
         A10522Cos_Fab = localUtil.ctond( httpContext.cgiGet( edtCos_Fab_Internalname)) ;
         n10522Cos_Fab = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCos_Pq_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCos_Pq_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COS_PQ_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_Pq_Internalname ;
         wbErr = true ;
         A10523Cos_Pq = DecimalUtil.ZERO ;
         n10523Cos_Pq = false ;
      }
      else
      {
         A10523Cos_Pq = localUtil.ctond( httpContext.cgiGet( edtCos_Pq_Internalname)) ;
         n10523Cos_Pq = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCos_H2o_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCos_H2o_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COS_H2O_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_H2o_Internalname ;
         wbErr = true ;
         A10524Cos_H2o = DecimalUtil.ZERO ;
         n10524Cos_H2o = false ;
      }
      else
      {
         A10524Cos_H2o = localUtil.ctond( httpContext.cgiGet( edtCos_H2o_Internalname)) ;
         n10524Cos_H2o = false ;
      }
      A10525Cos_Art = httpContext.cgiGet( edtCos_Art_Internalname) ;
      n10525Cos_Art = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "COS_COLNN_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_ColNn_Internalname ;
         wbErr = true ;
         A10527Cos_ColNn = 0 ;
         n10527Cos_ColNn = false ;
      }
      else
      {
         A10527Cos_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( edtCos_ColNn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10527Cos_ColNn = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COS_TC_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_tc_Internalname ;
         wbErr = true ;
         A10528Cos_tc = (short)(0) ;
         n10528Cos_tc = false ;
      }
      else
      {
         A10528Cos_tc = (short)(localUtil.ctol( httpContext.cgiGet( edtCos_tc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10528Cos_tc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "COS_VOL_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_Vol_Internalname ;
         wbErr = true ;
         A10529Cos_Vol = 0 ;
         n10529Cos_Vol = false ;
      }
      else
      {
         A10529Cos_Vol = (int)(localUtil.ctol( httpContext.cgiGet( edtCos_Vol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10529Cos_Vol = false ;
      }
      A10530Cos_Mq = httpContext.cgiGet( edtCos_Mq_Internalname) ;
      n10530Cos_Mq = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCos_Kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCos_Kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COS_KGS_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_Kgs_Internalname ;
         wbErr = true ;
         A10531Cos_Kgs = DecimalUtil.ZERO ;
         n10531Cos_Kgs = false ;
      }
      else
      {
         A10531Cos_Kgs = localUtil.ctond( httpContext.cgiGet( edtCos_Kgs_Internalname)) ;
         n10531Cos_Kgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCos_KgsT_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCos_KgsT_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "COS_KGST_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_KgsT_Internalname ;
         wbErr = true ;
         A10532Cos_KgsT = DecimalUtil.ZERO ;
         n10532Cos_KgsT = false ;
      }
      else
      {
         A10532Cos_KgsT = localUtil.ctond( httpContext.cgiGet( edtCos_KgsT_Internalname)) ;
         n10532Cos_KgsT = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Numt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Numt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "COS_NUMT_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_Numt_Internalname ;
         wbErr = true ;
         A10533Cos_Numt = (short)(0) ;
         n10533Cos_Numt = false ;
      }
      else
      {
         A10533Cos_Numt = (short)(localUtil.ctol( httpContext.cgiGet( edtCos_Numt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10533Cos_Numt = false ;
      }
      A10534Cos_lot = httpContext.cgiGet( edtCos_lot_Internalname) ;
      n10534Cos_lot = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_tot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_tot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999 ) ) )
      {
         GXCCtl = "COS_TOT_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_tot_Internalname ;
         wbErr = true ;
         A10535Cos_tot = 0 ;
         n10535Cos_tot = false ;
      }
      else
      {
         A10535Cos_tot = (int)(localUtil.ctol( httpContext.cgiGet( edtCos_tot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10535Cos_tot = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCos_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "COS_CLICOD_" + sGXsfl_49_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCos_Clicod_Internalname ;
         wbErr = true ;
         A10536Cos_Clicod = 0 ;
         n10536Cos_Clicod = false ;
      }
      else
      {
         A10536Cos_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtCos_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10536Cos_Clicod = false ;
      }
      A10537Cos_Acs = httpContext.cgiGet( edtCos_Acs_Internalname) ;
      n10537Cos_Acs = false ;
      A10538Cos_Nprog = httpContext.cgiGet( edtCos_Nprog_Internalname) ;
      n10538Cos_Nprog = false ;
      A10548Cos_TipoR = httpContext.cgiGet( edtCos_TipoR_Internalname) ;
      n10548Cos_TipoR = false ;
      GXCCtl = "Z10518Cos_linea_" + sGXsfl_49_idx ;
      Z10518Cos_linea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10526Cos_ColNm_" + sGXsfl_49_idx ;
      Z10526Cos_ColNm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10519Cos_hdr_" + sGXsfl_49_idx ;
      Z10519Cos_hdr = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10520Cos_hdrr_" + sGXsfl_49_idx ;
      Z10520Cos_hdrr = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10521Cos_hdrp_" + sGXsfl_49_idx ;
      Z10521Cos_hdrp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10522Cos_Fab_" + sGXsfl_49_idx ;
      Z10522Cos_Fab = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10523Cos_Pq_" + sGXsfl_49_idx ;
      Z10523Cos_Pq = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10524Cos_H2o_" + sGXsfl_49_idx ;
      Z10524Cos_H2o = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10525Cos_Art_" + sGXsfl_49_idx ;
      Z10525Cos_Art = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10527Cos_ColNn_" + sGXsfl_49_idx ;
      Z10527Cos_ColNn = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10528Cos_tc_" + sGXsfl_49_idx ;
      Z10528Cos_tc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10529Cos_Vol_" + sGXsfl_49_idx ;
      Z10529Cos_Vol = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10530Cos_Mq_" + sGXsfl_49_idx ;
      Z10530Cos_Mq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10531Cos_Kgs_" + sGXsfl_49_idx ;
      Z10531Cos_Kgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10532Cos_KgsT_" + sGXsfl_49_idx ;
      Z10532Cos_KgsT = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10533Cos_Numt_" + sGXsfl_49_idx ;
      Z10533Cos_Numt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10534Cos_lot_" + sGXsfl_49_idx ;
      Z10534Cos_lot = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10535Cos_tot_" + sGXsfl_49_idx ;
      Z10535Cos_tot = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10536Cos_Clicod_" + sGXsfl_49_idx ;
      Z10536Cos_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10537Cos_Acs_" + sGXsfl_49_idx ;
      Z10537Cos_Acs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10538Cos_Nprog_" + sGXsfl_49_idx ;
      Z10538Cos_Nprog = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10548Cos_TipoR_" + sGXsfl_49_idx ;
      Z10548Cos_TipoR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1421_" + sGXsfl_49_idx ;
      nRcdDeleted_1421 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1421_" + sGXsfl_49_idx ;
      nRcdExists_1421 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1421_" + sGXsfl_49_idx ;
      nIsMod_1421 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCos_linea_Enabled = edtCos_linea_Enabled ;
   }

   public void confirmValues18M0( )
   {
      nGXsfl_49_idx = 0 ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_491421( ) ;
      while ( nGXsfl_49_idx < nRC_GXsfl_49 )
      {
         nGXsfl_49_idx = (int)(nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_491421( ) ;
         httpContext.changePostValue( "Z10518Cos_linea_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10518Cos_linea_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10518Cos_linea_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10526Cos_ColNm_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10526Cos_ColNm_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10526Cos_ColNm_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10519Cos_hdr_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10519Cos_hdr_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10519Cos_hdr_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10520Cos_hdrr_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10520Cos_hdrr_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10520Cos_hdrr_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10521Cos_hdrp_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10521Cos_hdrp_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10521Cos_hdrp_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10522Cos_Fab_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10522Cos_Fab_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10522Cos_Fab_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10523Cos_Pq_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10523Cos_Pq_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10523Cos_Pq_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10524Cos_H2o_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10524Cos_H2o_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10524Cos_H2o_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10525Cos_Art_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10525Cos_Art_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10525Cos_Art_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10527Cos_ColNn_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10527Cos_ColNn_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10527Cos_ColNn_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10528Cos_tc_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10528Cos_tc_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10528Cos_tc_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10529Cos_Vol_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10529Cos_Vol_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10529Cos_Vol_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10530Cos_Mq_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10530Cos_Mq_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10530Cos_Mq_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10531Cos_Kgs_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10531Cos_Kgs_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10531Cos_Kgs_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10532Cos_KgsT_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10532Cos_KgsT_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10532Cos_KgsT_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10533Cos_Numt_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10533Cos_Numt_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10533Cos_Numt_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10534Cos_lot_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10534Cos_lot_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10534Cos_lot_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10535Cos_tot_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10535Cos_tot_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10535Cos_tot_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10536Cos_Clicod_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10536Cos_Clicod_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10536Cos_Clicod_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10537Cos_Acs_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10537Cos_Acs_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10537Cos_Acs_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10538Cos_Nprog_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10538Cos_Nprog_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10538Cos_Nprog_"+sGXsfl_49_idx) ;
         httpContext.changePostValue( "Z10548Cos_TipoR_"+sGXsfl_49_idx, httpContext.cgiGet( "ZT_"+"Z10548Cos_TipoR_"+sGXsfl_49_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10548Cos_TipoR_"+sGXsfl_49_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttr1000", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10514Cos_Any", GXutil.ltrim( localUtil.ntoc( Z10514Cos_Any, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10515Cos_Mes", GXutil.ltrim( localUtil.ntoc( Z10515Cos_Mes, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10516Cos_dia", GXutil.ltrim( localUtil.ntoc( Z10516Cos_dia, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10517Cos_Ultl", GXutil.ltrim( localUtil.ntoc( Z10517Cos_Ultl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nGXsfl_49_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ttr1000", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTR1000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TABLA COSTES", "") ;
   }

   public void initializeNonKey18M1420( )
   {
      A10517Cos_Ultl = (short)(0) ;
      n10517Cos_Ultl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10517Cos_Ultl", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10517Cos_Ultl), 4, 0));
      Z10517Cos_Ultl = (short)(0) ;
   }

   public void initAll18M1420( )
   {
      A10514Cos_Any = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10514Cos_Any", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10514Cos_Any), 4, 0));
      A10515Cos_Mes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10515Cos_Mes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10515Cos_Mes), 2, 0));
      A10516Cos_dia = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10516Cos_dia", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10516Cos_dia), 2, 0));
      initializeNonKey18M1420( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey18M1421( )
   {
      A10526Cos_ColNm = "" ;
      n10526Cos_ColNm = false ;
      A10519Cos_hdr = 0 ;
      n10519Cos_hdr = false ;
      A10520Cos_hdrr = (byte)(0) ;
      n10520Cos_hdrr = false ;
      A10521Cos_hdrp = "" ;
      n10521Cos_hdrp = false ;
      A10522Cos_Fab = DecimalUtil.ZERO ;
      n10522Cos_Fab = false ;
      A10523Cos_Pq = DecimalUtil.ZERO ;
      n10523Cos_Pq = false ;
      A10524Cos_H2o = DecimalUtil.ZERO ;
      n10524Cos_H2o = false ;
      A10525Cos_Art = "" ;
      n10525Cos_Art = false ;
      A10527Cos_ColNn = 0 ;
      n10527Cos_ColNn = false ;
      A10528Cos_tc = (short)(0) ;
      n10528Cos_tc = false ;
      A10529Cos_Vol = 0 ;
      n10529Cos_Vol = false ;
      A10530Cos_Mq = "" ;
      n10530Cos_Mq = false ;
      A10531Cos_Kgs = DecimalUtil.ZERO ;
      n10531Cos_Kgs = false ;
      A10532Cos_KgsT = DecimalUtil.ZERO ;
      n10532Cos_KgsT = false ;
      A10533Cos_Numt = (short)(0) ;
      n10533Cos_Numt = false ;
      A10534Cos_lot = "" ;
      n10534Cos_lot = false ;
      A10535Cos_tot = 0 ;
      n10535Cos_tot = false ;
      A10536Cos_Clicod = 0 ;
      n10536Cos_Clicod = false ;
      A10537Cos_Acs = "" ;
      n10537Cos_Acs = false ;
      A10538Cos_Nprog = "" ;
      n10538Cos_Nprog = false ;
      A10548Cos_TipoR = "" ;
      n10548Cos_TipoR = false ;
      Z10526Cos_ColNm = "" ;
      Z10519Cos_hdr = 0 ;
      Z10520Cos_hdrr = (byte)(0) ;
      Z10521Cos_hdrp = "" ;
      Z10522Cos_Fab = DecimalUtil.ZERO ;
      Z10523Cos_Pq = DecimalUtil.ZERO ;
      Z10524Cos_H2o = DecimalUtil.ZERO ;
      Z10525Cos_Art = "" ;
      Z10527Cos_ColNn = 0 ;
      Z10528Cos_tc = (short)(0) ;
      Z10529Cos_Vol = 0 ;
      Z10530Cos_Mq = "" ;
      Z10531Cos_Kgs = DecimalUtil.ZERO ;
      Z10532Cos_KgsT = DecimalUtil.ZERO ;
      Z10533Cos_Numt = (short)(0) ;
      Z10534Cos_lot = "" ;
      Z10535Cos_tot = 0 ;
      Z10536Cos_Clicod = 0 ;
      Z10537Cos_Acs = "" ;
      Z10538Cos_Nprog = "" ;
      Z10548Cos_TipoR = "" ;
   }

   public void initAll18M1421( )
   {
      A10518Cos_linea = (short)(0) ;
      initializeNonKey18M1421( ) ;
   }

   public void standaloneModalInsert18M1421( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241555179", true, true);
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
      httpContext.AddJavascriptSource("ttr1000.js", "?20268241555179", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1421( )
   {
      edtCos_linea_Enabled = defedtCos_linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCos_linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCos_linea_Enabled), 5, 0), !bGXsfl_49_Refreshing);
   }

   public void startgridcontrol49( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1421, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1421_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10518Cos_linea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10526Cos_ColNm));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10519Cos_hdr, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10520Cos_hdrr, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10521Cos_hdrp));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_hdrp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10522Cos_Fab, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Fab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10523Cos_Pq, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Pq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10524Cos_H2o, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_H2o_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10525Cos_Art));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Art_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10527Cos_ColNn, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_ColNn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10528Cos_tc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10529Cos_Vol, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Vol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10530Cos_Mq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Mq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10531Cos_Kgs, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Kgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10532Cos_KgsT, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_KgsT_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10533Cos_Numt, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Numt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10534Cos_lot));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_lot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10535Cos_tot, (byte)(9), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_tot_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10536Cos_Clicod, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10537Cos_Acs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Acs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10538Cos_Nprog));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_Nprog_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10548Cos_TipoR));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCos_TipoR_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCos_Any_Internalname = "COS_ANY" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtCos_Mes_Internalname = "COS_MES" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCos_dia_Internalname = "COS_DIA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      edtCos_Ultl_Internalname = "COS_ULTL" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_1421_Internalname = "vNRCDDELETED_1421" ;
      edtCos_linea_Internalname = "COS_LINEA" ;
      edtCos_ColNm_Internalname = "COS_COLNM" ;
      edtCos_hdr_Internalname = "COS_HDR" ;
      edtCos_hdrr_Internalname = "COS_HDRR" ;
      edtCos_hdrp_Internalname = "COS_HDRP" ;
      edtCos_Fab_Internalname = "COS_FAB" ;
      edtCos_Pq_Internalname = "COS_PQ" ;
      edtCos_H2o_Internalname = "COS_H2O" ;
      edtCos_Art_Internalname = "COS_ART" ;
      edtCos_ColNn_Internalname = "COS_COLNN" ;
      edtCos_tc_Internalname = "COS_TC" ;
      edtCos_Vol_Internalname = "COS_VOL" ;
      edtCos_Mq_Internalname = "COS_MQ" ;
      edtCos_Kgs_Internalname = "COS_KGS" ;
      edtCos_KgsT_Internalname = "COS_KGST" ;
      edtCos_Numt_Internalname = "COS_NUMT" ;
      edtCos_lot_Internalname = "COS_LOT" ;
      edtCos_tot_Internalname = "COS_TOT" ;
      edtCos_Clicod_Internalname = "COS_CLICOD" ;
      edtCos_Acs_Internalname = "COS_ACS" ;
      edtCos_Nprog_Internalname = "COS_NPROG" ;
      edtCos_TipoR_Internalname = "COS_TIPOR" ;
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
      Form.setCaption( httpContext.getMessage( "TABLA COSTES", "") );
      edtCos_TipoR_Jsonclick = "" ;
      edtCos_Nprog_Jsonclick = "" ;
      edtCos_Acs_Jsonclick = "" ;
      edtCos_Clicod_Jsonclick = "" ;
      edtCos_tot_Jsonclick = "" ;
      edtCos_lot_Jsonclick = "" ;
      edtCos_Numt_Jsonclick = "" ;
      edtCos_KgsT_Jsonclick = "" ;
      edtCos_Kgs_Jsonclick = "" ;
      edtCos_Mq_Jsonclick = "" ;
      edtCos_Vol_Jsonclick = "" ;
      edtCos_tc_Jsonclick = "" ;
      edtCos_ColNn_Jsonclick = "" ;
      edtCos_Art_Jsonclick = "" ;
      edtCos_H2o_Jsonclick = "" ;
      edtCos_Pq_Jsonclick = "" ;
      edtCos_Fab_Jsonclick = "" ;
      edtCos_hdrp_Jsonclick = "" ;
      edtCos_hdrr_Jsonclick = "" ;
      edtCos_hdr_Jsonclick = "" ;
      edtCos_ColNm_Jsonclick = "" ;
      edtCos_linea_Jsonclick = "" ;
      edtavnRcdDeleted_1421_Jsonclick = "" ;
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
      edtCos_TipoR_Enabled = 1 ;
      edtCos_Nprog_Enabled = 1 ;
      edtCos_Acs_Enabled = 1 ;
      edtCos_Clicod_Enabled = 1 ;
      edtCos_tot_Enabled = 1 ;
      edtCos_lot_Enabled = 1 ;
      edtCos_Numt_Enabled = 1 ;
      edtCos_KgsT_Enabled = 1 ;
      edtCos_Kgs_Enabled = 1 ;
      edtCos_Mq_Enabled = 1 ;
      edtCos_Vol_Enabled = 1 ;
      edtCos_tc_Enabled = 1 ;
      edtCos_ColNn_Enabled = 1 ;
      edtCos_Art_Enabled = 1 ;
      edtCos_H2o_Enabled = 1 ;
      edtCos_Pq_Enabled = 1 ;
      edtCos_Fab_Enabled = 1 ;
      edtCos_hdrp_Enabled = 1 ;
      edtCos_hdrr_Enabled = 1 ;
      edtCos_hdr_Enabled = 1 ;
      edtCos_ColNm_Enabled = 1 ;
      edtCos_linea_Enabled = 1 ;
      edtavnRcdDeleted_1421_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      edtCos_Ultl_Jsonclick = "" ;
      edtCos_Ultl_Backcolor = (int)(0xFFFFFF) ;
      edtCos_Ultl_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtCos_dia_Jsonclick = "" ;
      edtCos_dia_Backcolor = (int)(0xFFFFFF) ;
      edtCos_dia_Enabled = 1 ;
      edtCos_Mes_Jsonclick = "" ;
      edtCos_Mes_Backcolor = (int)(0xFFFFFF) ;
      edtCos_Mes_Enabled = 1 ;
      edtCos_Any_Jsonclick = "" ;
      edtCos_Any_Backcolor = (int)(0xFFFFFF) ;
      edtCos_Any_Enabled = 1 ;
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
      subsflControlProps_491421( ) ;
      while ( nGXsfl_49_idx <= nRC_GXsfl_49 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal18M1421( ) ;
         standaloneModal18M1421( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow18M1421( ) ;
         nGXsfl_49_idx = (int)(nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_491421( ) ;
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
      /* Using cursor T018M21 */
      pr_default.execute(19, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T018M21_A407EmprNom[0] ;
      n407EmprNom = T018M21_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(19);
      GX_FocusControl = edtCos_Ultl_Internalname ;
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

   public void valid_Cos_dia( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A10517Cos_Ultl", GXutil.ltrim( localUtil.ntoc( A10517Cos_Ultl, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10514Cos_Any", GXutil.ltrim( localUtil.ntoc( Z10514Cos_Any, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10515Cos_Mes", GXutil.ltrim( localUtil.ntoc( Z10515Cos_Mes, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10516Cos_dia", GXutil.ltrim( localUtil.ntoc( Z10516Cos_dia, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10517Cos_Ultl", GXutil.ltrim( localUtil.ntoc( Z10517Cos_Ultl, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_COS_ANY","{handler:'valid_Cos_any',iparms:[]");
      setEventMetadata("VALID_COS_ANY",",oparms:[]}");
      setEventMetadata("VALID_COS_MES","{handler:'valid_Cos_mes',iparms:[]");
      setEventMetadata("VALID_COS_MES",",oparms:[]}");
      setEventMetadata("VALID_COS_DIA","{handler:'valid_Cos_dia',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10514Cos_Any',fld:'COS_ANY',pic:'ZZZ9'},{av:'A10515Cos_Mes',fld:'COS_MES',pic:'Z9'},{av:'A10516Cos_dia',fld:'COS_DIA',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_COS_DIA",",oparms:[{av:'A10517Cos_Ultl',fld:'COS_ULTL',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10514Cos_Any'},{av:'Z10515Cos_Mes'},{av:'Z10516Cos_dia'},{av:'Z10517Cos_Ultl'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_COS_LINEA","{handler:'valid_Cos_linea',iparms:[]");
      setEventMetadata("VALID_COS_LINEA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Cos_tipor',iparms:[]");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10526Cos_ColNm = "" ;
      Z10521Cos_hdrp = "" ;
      Z10522Cos_Fab = DecimalUtil.ZERO ;
      Z10523Cos_Pq = DecimalUtil.ZERO ;
      Z10524Cos_H2o = DecimalUtil.ZERO ;
      Z10525Cos_Art = "" ;
      Z10530Cos_Mq = "" ;
      Z10531Cos_Kgs = DecimalUtil.ZERO ;
      Z10532Cos_KgsT = DecimalUtil.ZERO ;
      Z10534Cos_lot = "" ;
      Z10537Cos_Acs = "" ;
      Z10538Cos_Nprog = "" ;
      Z10548Cos_TipoR = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      A396EmprCod = "" ;
      lblTextblock2_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1421 = "" ;
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
      sMode1420 = "" ;
      GXCCtl = "" ;
      A10526Cos_ColNm = "" ;
      A10521Cos_hdrp = "" ;
      A10522Cos_Fab = DecimalUtil.ZERO ;
      A10523Cos_Pq = DecimalUtil.ZERO ;
      A10524Cos_H2o = DecimalUtil.ZERO ;
      A10525Cos_Art = "" ;
      A10530Cos_Mq = "" ;
      A10531Cos_Kgs = DecimalUtil.ZERO ;
      A10532Cos_KgsT = DecimalUtil.ZERO ;
      A10534Cos_lot = "" ;
      A10537Cos_Acs = "" ;
      A10538Cos_Nprog = "" ;
      A10548Cos_TipoR = "" ;
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
      T018M6_A407EmprNom = new String[] {""} ;
      T018M6_n407EmprNom = new boolean[] {false} ;
      T018M7_A10514Cos_Any = new short[1] ;
      T018M7_A10515Cos_Mes = new byte[1] ;
      T018M7_A10516Cos_dia = new byte[1] ;
      T018M7_A10517Cos_Ultl = new short[1] ;
      T018M7_n10517Cos_Ultl = new boolean[] {false} ;
      T018M7_A407EmprNom = new String[] {""} ;
      T018M7_n407EmprNom = new boolean[] {false} ;
      T018M7_A396EmprCod = new String[] {""} ;
      T018M8_A396EmprCod = new String[] {""} ;
      T018M8_A10514Cos_Any = new short[1] ;
      T018M8_A10515Cos_Mes = new byte[1] ;
      T018M8_A10516Cos_dia = new byte[1] ;
      T018M5_A10514Cos_Any = new short[1] ;
      T018M5_A10515Cos_Mes = new byte[1] ;
      T018M5_A10516Cos_dia = new byte[1] ;
      T018M5_A10517Cos_Ultl = new short[1] ;
      T018M5_n10517Cos_Ultl = new boolean[] {false} ;
      T018M5_A396EmprCod = new String[] {""} ;
      T018M9_A396EmprCod = new String[] {""} ;
      T018M9_A10514Cos_Any = new short[1] ;
      T018M9_A10515Cos_Mes = new byte[1] ;
      T018M9_A10516Cos_dia = new byte[1] ;
      T018M10_A396EmprCod = new String[] {""} ;
      T018M10_A10514Cos_Any = new short[1] ;
      T018M10_A10515Cos_Mes = new byte[1] ;
      T018M10_A10516Cos_dia = new byte[1] ;
      T018M4_A10514Cos_Any = new short[1] ;
      T018M4_A10515Cos_Mes = new byte[1] ;
      T018M4_A10516Cos_dia = new byte[1] ;
      T018M4_A10517Cos_Ultl = new short[1] ;
      T018M4_n10517Cos_Ultl = new boolean[] {false} ;
      T018M4_A396EmprCod = new String[] {""} ;
      T018M14_A396EmprCod = new String[] {""} ;
      T018M14_A10514Cos_Any = new short[1] ;
      T018M14_A10515Cos_Mes = new byte[1] ;
      T018M14_A10516Cos_dia = new byte[1] ;
      T018M15_A396EmprCod = new String[] {""} ;
      T018M15_A10514Cos_Any = new short[1] ;
      T018M15_A10515Cos_Mes = new byte[1] ;
      T018M15_A10516Cos_dia = new byte[1] ;
      T018M15_A10518Cos_linea = new short[1] ;
      T018M15_A10526Cos_ColNm = new String[] {""} ;
      T018M15_n10526Cos_ColNm = new boolean[] {false} ;
      T018M15_A10519Cos_hdr = new int[1] ;
      T018M15_n10519Cos_hdr = new boolean[] {false} ;
      T018M15_A10520Cos_hdrr = new byte[1] ;
      T018M15_n10520Cos_hdrr = new boolean[] {false} ;
      T018M15_A10521Cos_hdrp = new String[] {""} ;
      T018M15_n10521Cos_hdrp = new boolean[] {false} ;
      T018M15_A10522Cos_Fab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M15_n10522Cos_Fab = new boolean[] {false} ;
      T018M15_A10523Cos_Pq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M15_n10523Cos_Pq = new boolean[] {false} ;
      T018M15_A10524Cos_H2o = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M15_n10524Cos_H2o = new boolean[] {false} ;
      T018M15_A10525Cos_Art = new String[] {""} ;
      T018M15_n10525Cos_Art = new boolean[] {false} ;
      T018M15_A10527Cos_ColNn = new int[1] ;
      T018M15_n10527Cos_ColNn = new boolean[] {false} ;
      T018M15_A10528Cos_tc = new short[1] ;
      T018M15_n10528Cos_tc = new boolean[] {false} ;
      T018M15_A10529Cos_Vol = new int[1] ;
      T018M15_n10529Cos_Vol = new boolean[] {false} ;
      T018M15_A10530Cos_Mq = new String[] {""} ;
      T018M15_n10530Cos_Mq = new boolean[] {false} ;
      T018M15_A10531Cos_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M15_n10531Cos_Kgs = new boolean[] {false} ;
      T018M15_A10532Cos_KgsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M15_n10532Cos_KgsT = new boolean[] {false} ;
      T018M15_A10533Cos_Numt = new short[1] ;
      T018M15_n10533Cos_Numt = new boolean[] {false} ;
      T018M15_A10534Cos_lot = new String[] {""} ;
      T018M15_n10534Cos_lot = new boolean[] {false} ;
      T018M15_A10535Cos_tot = new int[1] ;
      T018M15_n10535Cos_tot = new boolean[] {false} ;
      T018M15_A10536Cos_Clicod = new int[1] ;
      T018M15_n10536Cos_Clicod = new boolean[] {false} ;
      T018M15_A10537Cos_Acs = new String[] {""} ;
      T018M15_n10537Cos_Acs = new boolean[] {false} ;
      T018M15_A10538Cos_Nprog = new String[] {""} ;
      T018M15_n10538Cos_Nprog = new boolean[] {false} ;
      T018M15_A10548Cos_TipoR = new String[] {""} ;
      T018M15_n10548Cos_TipoR = new boolean[] {false} ;
      T018M16_A396EmprCod = new String[] {""} ;
      T018M16_A10514Cos_Any = new short[1] ;
      T018M16_A10515Cos_Mes = new byte[1] ;
      T018M16_A10516Cos_dia = new byte[1] ;
      T018M16_A10518Cos_linea = new short[1] ;
      T018M3_A396EmprCod = new String[] {""} ;
      T018M3_A10514Cos_Any = new short[1] ;
      T018M3_A10515Cos_Mes = new byte[1] ;
      T018M3_A10516Cos_dia = new byte[1] ;
      T018M3_A10518Cos_linea = new short[1] ;
      T018M3_A10526Cos_ColNm = new String[] {""} ;
      T018M3_n10526Cos_ColNm = new boolean[] {false} ;
      T018M3_A10519Cos_hdr = new int[1] ;
      T018M3_n10519Cos_hdr = new boolean[] {false} ;
      T018M3_A10520Cos_hdrr = new byte[1] ;
      T018M3_n10520Cos_hdrr = new boolean[] {false} ;
      T018M3_A10521Cos_hdrp = new String[] {""} ;
      T018M3_n10521Cos_hdrp = new boolean[] {false} ;
      T018M3_A10522Cos_Fab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M3_n10522Cos_Fab = new boolean[] {false} ;
      T018M3_A10523Cos_Pq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M3_n10523Cos_Pq = new boolean[] {false} ;
      T018M3_A10524Cos_H2o = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M3_n10524Cos_H2o = new boolean[] {false} ;
      T018M3_A10525Cos_Art = new String[] {""} ;
      T018M3_n10525Cos_Art = new boolean[] {false} ;
      T018M3_A10527Cos_ColNn = new int[1] ;
      T018M3_n10527Cos_ColNn = new boolean[] {false} ;
      T018M3_A10528Cos_tc = new short[1] ;
      T018M3_n10528Cos_tc = new boolean[] {false} ;
      T018M3_A10529Cos_Vol = new int[1] ;
      T018M3_n10529Cos_Vol = new boolean[] {false} ;
      T018M3_A10530Cos_Mq = new String[] {""} ;
      T018M3_n10530Cos_Mq = new boolean[] {false} ;
      T018M3_A10531Cos_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M3_n10531Cos_Kgs = new boolean[] {false} ;
      T018M3_A10532Cos_KgsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M3_n10532Cos_KgsT = new boolean[] {false} ;
      T018M3_A10533Cos_Numt = new short[1] ;
      T018M3_n10533Cos_Numt = new boolean[] {false} ;
      T018M3_A10534Cos_lot = new String[] {""} ;
      T018M3_n10534Cos_lot = new boolean[] {false} ;
      T018M3_A10535Cos_tot = new int[1] ;
      T018M3_n10535Cos_tot = new boolean[] {false} ;
      T018M3_A10536Cos_Clicod = new int[1] ;
      T018M3_n10536Cos_Clicod = new boolean[] {false} ;
      T018M3_A10537Cos_Acs = new String[] {""} ;
      T018M3_n10537Cos_Acs = new boolean[] {false} ;
      T018M3_A10538Cos_Nprog = new String[] {""} ;
      T018M3_n10538Cos_Nprog = new boolean[] {false} ;
      T018M3_A10548Cos_TipoR = new String[] {""} ;
      T018M3_n10548Cos_TipoR = new boolean[] {false} ;
      T018M2_A396EmprCod = new String[] {""} ;
      T018M2_A10514Cos_Any = new short[1] ;
      T018M2_A10515Cos_Mes = new byte[1] ;
      T018M2_A10516Cos_dia = new byte[1] ;
      T018M2_A10518Cos_linea = new short[1] ;
      T018M2_A10526Cos_ColNm = new String[] {""} ;
      T018M2_n10526Cos_ColNm = new boolean[] {false} ;
      T018M2_A10519Cos_hdr = new int[1] ;
      T018M2_n10519Cos_hdr = new boolean[] {false} ;
      T018M2_A10520Cos_hdrr = new byte[1] ;
      T018M2_n10520Cos_hdrr = new boolean[] {false} ;
      T018M2_A10521Cos_hdrp = new String[] {""} ;
      T018M2_n10521Cos_hdrp = new boolean[] {false} ;
      T018M2_A10522Cos_Fab = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M2_n10522Cos_Fab = new boolean[] {false} ;
      T018M2_A10523Cos_Pq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M2_n10523Cos_Pq = new boolean[] {false} ;
      T018M2_A10524Cos_H2o = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M2_n10524Cos_H2o = new boolean[] {false} ;
      T018M2_A10525Cos_Art = new String[] {""} ;
      T018M2_n10525Cos_Art = new boolean[] {false} ;
      T018M2_A10527Cos_ColNn = new int[1] ;
      T018M2_n10527Cos_ColNn = new boolean[] {false} ;
      T018M2_A10528Cos_tc = new short[1] ;
      T018M2_n10528Cos_tc = new boolean[] {false} ;
      T018M2_A10529Cos_Vol = new int[1] ;
      T018M2_n10529Cos_Vol = new boolean[] {false} ;
      T018M2_A10530Cos_Mq = new String[] {""} ;
      T018M2_n10530Cos_Mq = new boolean[] {false} ;
      T018M2_A10531Cos_Kgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M2_n10531Cos_Kgs = new boolean[] {false} ;
      T018M2_A10532Cos_KgsT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T018M2_n10532Cos_KgsT = new boolean[] {false} ;
      T018M2_A10533Cos_Numt = new short[1] ;
      T018M2_n10533Cos_Numt = new boolean[] {false} ;
      T018M2_A10534Cos_lot = new String[] {""} ;
      T018M2_n10534Cos_lot = new boolean[] {false} ;
      T018M2_A10535Cos_tot = new int[1] ;
      T018M2_n10535Cos_tot = new boolean[] {false} ;
      T018M2_A10536Cos_Clicod = new int[1] ;
      T018M2_n10536Cos_Clicod = new boolean[] {false} ;
      T018M2_A10537Cos_Acs = new String[] {""} ;
      T018M2_n10537Cos_Acs = new boolean[] {false} ;
      T018M2_A10538Cos_Nprog = new String[] {""} ;
      T018M2_n10538Cos_Nprog = new boolean[] {false} ;
      T018M2_A10548Cos_TipoR = new String[] {""} ;
      T018M2_n10548Cos_TipoR = new boolean[] {false} ;
      T018M20_A396EmprCod = new String[] {""} ;
      T018M20_A10514Cos_Any = new short[1] ;
      T018M20_A10515Cos_Mes = new byte[1] ;
      T018M20_A10516Cos_dia = new byte[1] ;
      T018M20_A10518Cos_linea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T018M21_A407EmprNom = new String[] {""} ;
      T018M21_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttr1000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttr1000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttr1000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttr1000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttr1000__default(),
         new Object[] {
             new Object[] {
            T018M2_A396EmprCod, T018M2_A10514Cos_Any, T018M2_A10515Cos_Mes, T018M2_A10516Cos_dia, T018M2_A10518Cos_linea, T018M2_A10526Cos_ColNm, T018M2_n10526Cos_ColNm, T018M2_A10519Cos_hdr, T018M2_n10519Cos_hdr, T018M2_A10520Cos_hdrr,
            T018M2_n10520Cos_hdrr, T018M2_A10521Cos_hdrp, T018M2_n10521Cos_hdrp, T018M2_A10522Cos_Fab, T018M2_n10522Cos_Fab, T018M2_A10523Cos_Pq, T018M2_n10523Cos_Pq, T018M2_A10524Cos_H2o, T018M2_n10524Cos_H2o, T018M2_A10525Cos_Art,
            T018M2_n10525Cos_Art, T018M2_A10527Cos_ColNn, T018M2_n10527Cos_ColNn, T018M2_A10528Cos_tc, T018M2_n10528Cos_tc, T018M2_A10529Cos_Vol, T018M2_n10529Cos_Vol, T018M2_A10530Cos_Mq, T018M2_n10530Cos_Mq, T018M2_A10531Cos_Kgs,
            T018M2_n10531Cos_Kgs, T018M2_A10532Cos_KgsT, T018M2_n10532Cos_KgsT, T018M2_A10533Cos_Numt, T018M2_n10533Cos_Numt, T018M2_A10534Cos_lot, T018M2_n10534Cos_lot, T018M2_A10535Cos_tot, T018M2_n10535Cos_tot, T018M2_A10536Cos_Clicod,
            T018M2_n10536Cos_Clicod, T018M2_A10537Cos_Acs, T018M2_n10537Cos_Acs, T018M2_A10538Cos_Nprog, T018M2_n10538Cos_Nprog, T018M2_A10548Cos_TipoR, T018M2_n10548Cos_TipoR
            }
            , new Object[] {
            T018M3_A396EmprCod, T018M3_A10514Cos_Any, T018M3_A10515Cos_Mes, T018M3_A10516Cos_dia, T018M3_A10518Cos_linea, T018M3_A10526Cos_ColNm, T018M3_n10526Cos_ColNm, T018M3_A10519Cos_hdr, T018M3_n10519Cos_hdr, T018M3_A10520Cos_hdrr,
            T018M3_n10520Cos_hdrr, T018M3_A10521Cos_hdrp, T018M3_n10521Cos_hdrp, T018M3_A10522Cos_Fab, T018M3_n10522Cos_Fab, T018M3_A10523Cos_Pq, T018M3_n10523Cos_Pq, T018M3_A10524Cos_H2o, T018M3_n10524Cos_H2o, T018M3_A10525Cos_Art,
            T018M3_n10525Cos_Art, T018M3_A10527Cos_ColNn, T018M3_n10527Cos_ColNn, T018M3_A10528Cos_tc, T018M3_n10528Cos_tc, T018M3_A10529Cos_Vol, T018M3_n10529Cos_Vol, T018M3_A10530Cos_Mq, T018M3_n10530Cos_Mq, T018M3_A10531Cos_Kgs,
            T018M3_n10531Cos_Kgs, T018M3_A10532Cos_KgsT, T018M3_n10532Cos_KgsT, T018M3_A10533Cos_Numt, T018M3_n10533Cos_Numt, T018M3_A10534Cos_lot, T018M3_n10534Cos_lot, T018M3_A10535Cos_tot, T018M3_n10535Cos_tot, T018M3_A10536Cos_Clicod,
            T018M3_n10536Cos_Clicod, T018M3_A10537Cos_Acs, T018M3_n10537Cos_Acs, T018M3_A10538Cos_Nprog, T018M3_n10538Cos_Nprog, T018M3_A10548Cos_TipoR, T018M3_n10548Cos_TipoR
            }
            , new Object[] {
            T018M4_A10514Cos_Any, T018M4_A10515Cos_Mes, T018M4_A10516Cos_dia, T018M4_A10517Cos_Ultl, T018M4_n10517Cos_Ultl, T018M4_A396EmprCod
            }
            , new Object[] {
            T018M5_A10514Cos_Any, T018M5_A10515Cos_Mes, T018M5_A10516Cos_dia, T018M5_A10517Cos_Ultl, T018M5_n10517Cos_Ultl, T018M5_A396EmprCod
            }
            , new Object[] {
            T018M6_A407EmprNom, T018M6_n407EmprNom
            }
            , new Object[] {
            T018M7_A10514Cos_Any, T018M7_A10515Cos_Mes, T018M7_A10516Cos_dia, T018M7_A10517Cos_Ultl, T018M7_n10517Cos_Ultl, T018M7_A407EmprNom, T018M7_n407EmprNom, T018M7_A396EmprCod
            }
            , new Object[] {
            T018M8_A396EmprCod, T018M8_A10514Cos_Any, T018M8_A10515Cos_Mes, T018M8_A10516Cos_dia
            }
            , new Object[] {
            T018M9_A396EmprCod, T018M9_A10514Cos_Any, T018M9_A10515Cos_Mes, T018M9_A10516Cos_dia
            }
            , new Object[] {
            T018M10_A396EmprCod, T018M10_A10514Cos_Any, T018M10_A10515Cos_Mes, T018M10_A10516Cos_dia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018M14_A396EmprCod, T018M14_A10514Cos_Any, T018M14_A10515Cos_Mes, T018M14_A10516Cos_dia
            }
            , new Object[] {
            T018M15_A396EmprCod, T018M15_A10514Cos_Any, T018M15_A10515Cos_Mes, T018M15_A10516Cos_dia, T018M15_A10518Cos_linea, T018M15_A10526Cos_ColNm, T018M15_n10526Cos_ColNm, T018M15_A10519Cos_hdr, T018M15_n10519Cos_hdr, T018M15_A10520Cos_hdrr,
            T018M15_n10520Cos_hdrr, T018M15_A10521Cos_hdrp, T018M15_n10521Cos_hdrp, T018M15_A10522Cos_Fab, T018M15_n10522Cos_Fab, T018M15_A10523Cos_Pq, T018M15_n10523Cos_Pq, T018M15_A10524Cos_H2o, T018M15_n10524Cos_H2o, T018M15_A10525Cos_Art,
            T018M15_n10525Cos_Art, T018M15_A10527Cos_ColNn, T018M15_n10527Cos_ColNn, T018M15_A10528Cos_tc, T018M15_n10528Cos_tc, T018M15_A10529Cos_Vol, T018M15_n10529Cos_Vol, T018M15_A10530Cos_Mq, T018M15_n10530Cos_Mq, T018M15_A10531Cos_Kgs,
            T018M15_n10531Cos_Kgs, T018M15_A10532Cos_KgsT, T018M15_n10532Cos_KgsT, T018M15_A10533Cos_Numt, T018M15_n10533Cos_Numt, T018M15_A10534Cos_lot, T018M15_n10534Cos_lot, T018M15_A10535Cos_tot, T018M15_n10535Cos_tot, T018M15_A10536Cos_Clicod,
            T018M15_n10536Cos_Clicod, T018M15_A10537Cos_Acs, T018M15_n10537Cos_Acs, T018M15_A10538Cos_Nprog, T018M15_n10538Cos_Nprog, T018M15_A10548Cos_TipoR, T018M15_n10548Cos_TipoR
            }
            , new Object[] {
            T018M16_A396EmprCod, T018M16_A10514Cos_Any, T018M16_A10515Cos_Mes, T018M16_A10516Cos_dia, T018M16_A10518Cos_linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T018M20_A396EmprCod, T018M20_A10514Cos_Any, T018M20_A10515Cos_Mes, T018M20_A10516Cos_dia, T018M20_A10518Cos_linea
            }
            , new Object[] {
            T018M21_A407EmprNom, T018M21_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TTR1000" ;
   }

   private byte Z10515Cos_Mes ;
   private byte Z10516Cos_dia ;
   private byte Z10520Cos_hdrr ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10515Cos_Mes ;
   private byte A10516Cos_dia ;
   private byte A10520Cos_hdrr ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ10515Cos_Mes ;
   private byte ZZ10516Cos_dia ;
   private short Z10514Cos_Any ;
   private short Z10517Cos_Ultl ;
   private short Z10518Cos_linea ;
   private short Z10528Cos_tc ;
   private short Z10533Cos_Numt ;
   private short nRcdDeleted_1421 ;
   private short nRcdExists_1421 ;
   private short nIsMod_1421 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10514Cos_Any ;
   private short A10517Cos_Ultl ;
   private short nBlankRcdCount1421 ;
   private short RcdFound1421 ;
   private short nBlankRcdUsr1421 ;
   private short A10518Cos_linea ;
   private short A10528Cos_tc ;
   private short A10533Cos_Numt ;
   private short RcdFound1420 ;
   private short nIsDirty_1420 ;
   private short nIsDirty_1421 ;
   private short ZZ10514Cos_Any ;
   private short ZZ10517Cos_Ultl ;
   private int nRC_GXsfl_49 ;
   private int nGXsfl_49_idx=1 ;
   private int Z10519Cos_hdr ;
   private int Z10527Cos_ColNn ;
   private int Z10529Cos_Vol ;
   private int Z10535Cos_tot ;
   private int Z10536Cos_Clicod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCos_Any_Enabled ;
   private int edtCos_Mes_Enabled ;
   private int edtCos_dia_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtCos_Ultl_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_1421_Enabled ;
   private int edtCos_linea_Enabled ;
   private int edtCos_ColNm_Enabled ;
   private int edtCos_hdr_Enabled ;
   private int edtCos_hdrr_Enabled ;
   private int edtCos_hdrp_Enabled ;
   private int edtCos_Fab_Enabled ;
   private int edtCos_Pq_Enabled ;
   private int edtCos_H2o_Enabled ;
   private int edtCos_Art_Enabled ;
   private int edtCos_ColNn_Enabled ;
   private int edtCos_tc_Enabled ;
   private int edtCos_Vol_Enabled ;
   private int edtCos_Mq_Enabled ;
   private int edtCos_Kgs_Enabled ;
   private int edtCos_KgsT_Enabled ;
   private int edtCos_Numt_Enabled ;
   private int edtCos_lot_Enabled ;
   private int edtCos_tot_Enabled ;
   private int edtCos_Clicod_Enabled ;
   private int edtCos_Acs_Enabled ;
   private int edtCos_Nprog_Enabled ;
   private int edtCos_TipoR_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A10519Cos_hdr ;
   private int A10527Cos_ColNn ;
   private int A10529Cos_Vol ;
   private int A10535Cos_tot ;
   private int A10536Cos_Clicod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCos_linea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtCos_Ultl_Backcolor ;
   private int edtCos_dia_Backcolor ;
   private int edtCos_Mes_Backcolor ;
   private int edtCos_Any_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10522Cos_Fab ;
   private java.math.BigDecimal Z10523Cos_Pq ;
   private java.math.BigDecimal Z10524Cos_H2o ;
   private java.math.BigDecimal Z10531Cos_Kgs ;
   private java.math.BigDecimal Z10532Cos_KgsT ;
   private java.math.BigDecimal A10522Cos_Fab ;
   private java.math.BigDecimal A10523Cos_Pq ;
   private java.math.BigDecimal A10524Cos_H2o ;
   private java.math.BigDecimal A10531Cos_Kgs ;
   private java.math.BigDecimal A10532Cos_KgsT ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10526Cos_ColNm ;
   private String Z10521Cos_hdrp ;
   private String Z10525Cos_Art ;
   private String Z10530Cos_Mq ;
   private String Z10534Cos_lot ;
   private String Z10537Cos_Acs ;
   private String Z10538Cos_Nprog ;
   private String Z10548Cos_TipoR ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCos_Any_Internalname ;
   private String sGXsfl_49_idx="0001" ;
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
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtCos_Any_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtCos_Mes_Internalname ;
   private String edtCos_Mes_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCos_dia_Internalname ;
   private String edtCos_dia_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String edtCos_Ultl_Internalname ;
   private String edtCos_Ultl_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1421 ;
   private String edtavnRcdDeleted_1421_Internalname ;
   private String edtCos_linea_Internalname ;
   private String edtCos_ColNm_Internalname ;
   private String edtCos_hdr_Internalname ;
   private String edtCos_hdrr_Internalname ;
   private String edtCos_hdrp_Internalname ;
   private String edtCos_Fab_Internalname ;
   private String edtCos_Pq_Internalname ;
   private String edtCos_H2o_Internalname ;
   private String edtCos_Art_Internalname ;
   private String edtCos_ColNn_Internalname ;
   private String edtCos_tc_Internalname ;
   private String edtCos_Vol_Internalname ;
   private String edtCos_Mq_Internalname ;
   private String edtCos_Kgs_Internalname ;
   private String edtCos_KgsT_Internalname ;
   private String edtCos_Numt_Internalname ;
   private String edtCos_lot_Internalname ;
   private String edtCos_tot_Internalname ;
   private String edtCos_Clicod_Internalname ;
   private String edtCos_Acs_Internalname ;
   private String edtCos_Nprog_Internalname ;
   private String edtCos_TipoR_Internalname ;
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
   private String sMode1420 ;
   private String GXCCtl ;
   private String A10526Cos_ColNm ;
   private String A10521Cos_hdrp ;
   private String A10525Cos_Art ;
   private String A10530Cos_Mq ;
   private String A10534Cos_lot ;
   private String A10537Cos_Acs ;
   private String A10538Cos_Nprog ;
   private String A10548Cos_TipoR ;
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
   private String sGXsfl_49_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1421_Jsonclick ;
   private String edtCos_linea_Jsonclick ;
   private String edtCos_ColNm_Jsonclick ;
   private String edtCos_hdr_Jsonclick ;
   private String edtCos_hdrr_Jsonclick ;
   private String edtCos_hdrp_Jsonclick ;
   private String edtCos_Fab_Jsonclick ;
   private String edtCos_Pq_Jsonclick ;
   private String edtCos_H2o_Jsonclick ;
   private String edtCos_Art_Jsonclick ;
   private String edtCos_ColNn_Jsonclick ;
   private String edtCos_tc_Jsonclick ;
   private String edtCos_Vol_Jsonclick ;
   private String edtCos_Mq_Jsonclick ;
   private String edtCos_Kgs_Jsonclick ;
   private String edtCos_KgsT_Jsonclick ;
   private String edtCos_Numt_Jsonclick ;
   private String edtCos_lot_Jsonclick ;
   private String edtCos_tot_Jsonclick ;
   private String edtCos_Clicod_Jsonclick ;
   private String edtCos_Acs_Jsonclick ;
   private String edtCos_Nprog_Jsonclick ;
   private String edtCos_TipoR_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean n10517Cos_Ultl ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n10526Cos_ColNm ;
   private boolean n10519Cos_hdr ;
   private boolean n10520Cos_hdrr ;
   private boolean n10521Cos_hdrp ;
   private boolean n10522Cos_Fab ;
   private boolean n10523Cos_Pq ;
   private boolean n10524Cos_H2o ;
   private boolean n10525Cos_Art ;
   private boolean n10527Cos_ColNn ;
   private boolean n10528Cos_tc ;
   private boolean n10529Cos_Vol ;
   private boolean n10530Cos_Mq ;
   private boolean n10531Cos_Kgs ;
   private boolean n10532Cos_KgsT ;
   private boolean n10533Cos_Numt ;
   private boolean n10534Cos_lot ;
   private boolean n10535Cos_tot ;
   private boolean n10536Cos_Clicod ;
   private boolean n10537Cos_Acs ;
   private boolean n10538Cos_Nprog ;
   private boolean n10548Cos_TipoR ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T018M6_A407EmprNom ;
   private boolean[] T018M6_n407EmprNom ;
   private short[] T018M7_A10514Cos_Any ;
   private byte[] T018M7_A10515Cos_Mes ;
   private byte[] T018M7_A10516Cos_dia ;
   private short[] T018M7_A10517Cos_Ultl ;
   private boolean[] T018M7_n10517Cos_Ultl ;
   private String[] T018M7_A407EmprNom ;
   private boolean[] T018M7_n407EmprNom ;
   private String[] T018M7_A396EmprCod ;
   private String[] T018M8_A396EmprCod ;
   private short[] T018M8_A10514Cos_Any ;
   private byte[] T018M8_A10515Cos_Mes ;
   private byte[] T018M8_A10516Cos_dia ;
   private short[] T018M5_A10514Cos_Any ;
   private byte[] T018M5_A10515Cos_Mes ;
   private byte[] T018M5_A10516Cos_dia ;
   private short[] T018M5_A10517Cos_Ultl ;
   private boolean[] T018M5_n10517Cos_Ultl ;
   private String[] T018M5_A396EmprCod ;
   private String[] T018M9_A396EmprCod ;
   private short[] T018M9_A10514Cos_Any ;
   private byte[] T018M9_A10515Cos_Mes ;
   private byte[] T018M9_A10516Cos_dia ;
   private String[] T018M10_A396EmprCod ;
   private short[] T018M10_A10514Cos_Any ;
   private byte[] T018M10_A10515Cos_Mes ;
   private byte[] T018M10_A10516Cos_dia ;
   private short[] T018M4_A10514Cos_Any ;
   private byte[] T018M4_A10515Cos_Mes ;
   private byte[] T018M4_A10516Cos_dia ;
   private short[] T018M4_A10517Cos_Ultl ;
   private boolean[] T018M4_n10517Cos_Ultl ;
   private String[] T018M4_A396EmprCod ;
   private String[] T018M14_A396EmprCod ;
   private short[] T018M14_A10514Cos_Any ;
   private byte[] T018M14_A10515Cos_Mes ;
   private byte[] T018M14_A10516Cos_dia ;
   private String[] T018M15_A396EmprCod ;
   private short[] T018M15_A10514Cos_Any ;
   private byte[] T018M15_A10515Cos_Mes ;
   private byte[] T018M15_A10516Cos_dia ;
   private short[] T018M15_A10518Cos_linea ;
   private String[] T018M15_A10526Cos_ColNm ;
   private boolean[] T018M15_n10526Cos_ColNm ;
   private int[] T018M15_A10519Cos_hdr ;
   private boolean[] T018M15_n10519Cos_hdr ;
   private byte[] T018M15_A10520Cos_hdrr ;
   private boolean[] T018M15_n10520Cos_hdrr ;
   private String[] T018M15_A10521Cos_hdrp ;
   private boolean[] T018M15_n10521Cos_hdrp ;
   private java.math.BigDecimal[] T018M15_A10522Cos_Fab ;
   private boolean[] T018M15_n10522Cos_Fab ;
   private java.math.BigDecimal[] T018M15_A10523Cos_Pq ;
   private boolean[] T018M15_n10523Cos_Pq ;
   private java.math.BigDecimal[] T018M15_A10524Cos_H2o ;
   private boolean[] T018M15_n10524Cos_H2o ;
   private String[] T018M15_A10525Cos_Art ;
   private boolean[] T018M15_n10525Cos_Art ;
   private int[] T018M15_A10527Cos_ColNn ;
   private boolean[] T018M15_n10527Cos_ColNn ;
   private short[] T018M15_A10528Cos_tc ;
   private boolean[] T018M15_n10528Cos_tc ;
   private int[] T018M15_A10529Cos_Vol ;
   private boolean[] T018M15_n10529Cos_Vol ;
   private String[] T018M15_A10530Cos_Mq ;
   private boolean[] T018M15_n10530Cos_Mq ;
   private java.math.BigDecimal[] T018M15_A10531Cos_Kgs ;
   private boolean[] T018M15_n10531Cos_Kgs ;
   private java.math.BigDecimal[] T018M15_A10532Cos_KgsT ;
   private boolean[] T018M15_n10532Cos_KgsT ;
   private short[] T018M15_A10533Cos_Numt ;
   private boolean[] T018M15_n10533Cos_Numt ;
   private String[] T018M15_A10534Cos_lot ;
   private boolean[] T018M15_n10534Cos_lot ;
   private int[] T018M15_A10535Cos_tot ;
   private boolean[] T018M15_n10535Cos_tot ;
   private int[] T018M15_A10536Cos_Clicod ;
   private boolean[] T018M15_n10536Cos_Clicod ;
   private String[] T018M15_A10537Cos_Acs ;
   private boolean[] T018M15_n10537Cos_Acs ;
   private String[] T018M15_A10538Cos_Nprog ;
   private boolean[] T018M15_n10538Cos_Nprog ;
   private String[] T018M15_A10548Cos_TipoR ;
   private boolean[] T018M15_n10548Cos_TipoR ;
   private String[] T018M16_A396EmprCod ;
   private short[] T018M16_A10514Cos_Any ;
   private byte[] T018M16_A10515Cos_Mes ;
   private byte[] T018M16_A10516Cos_dia ;
   private short[] T018M16_A10518Cos_linea ;
   private String[] T018M3_A396EmprCod ;
   private short[] T018M3_A10514Cos_Any ;
   private byte[] T018M3_A10515Cos_Mes ;
   private byte[] T018M3_A10516Cos_dia ;
   private short[] T018M3_A10518Cos_linea ;
   private String[] T018M3_A10526Cos_ColNm ;
   private boolean[] T018M3_n10526Cos_ColNm ;
   private int[] T018M3_A10519Cos_hdr ;
   private boolean[] T018M3_n10519Cos_hdr ;
   private byte[] T018M3_A10520Cos_hdrr ;
   private boolean[] T018M3_n10520Cos_hdrr ;
   private String[] T018M3_A10521Cos_hdrp ;
   private boolean[] T018M3_n10521Cos_hdrp ;
   private java.math.BigDecimal[] T018M3_A10522Cos_Fab ;
   private boolean[] T018M3_n10522Cos_Fab ;
   private java.math.BigDecimal[] T018M3_A10523Cos_Pq ;
   private boolean[] T018M3_n10523Cos_Pq ;
   private java.math.BigDecimal[] T018M3_A10524Cos_H2o ;
   private boolean[] T018M3_n10524Cos_H2o ;
   private String[] T018M3_A10525Cos_Art ;
   private boolean[] T018M3_n10525Cos_Art ;
   private int[] T018M3_A10527Cos_ColNn ;
   private boolean[] T018M3_n10527Cos_ColNn ;
   private short[] T018M3_A10528Cos_tc ;
   private boolean[] T018M3_n10528Cos_tc ;
   private int[] T018M3_A10529Cos_Vol ;
   private boolean[] T018M3_n10529Cos_Vol ;
   private String[] T018M3_A10530Cos_Mq ;
   private boolean[] T018M3_n10530Cos_Mq ;
   private java.math.BigDecimal[] T018M3_A10531Cos_Kgs ;
   private boolean[] T018M3_n10531Cos_Kgs ;
   private java.math.BigDecimal[] T018M3_A10532Cos_KgsT ;
   private boolean[] T018M3_n10532Cos_KgsT ;
   private short[] T018M3_A10533Cos_Numt ;
   private boolean[] T018M3_n10533Cos_Numt ;
   private String[] T018M3_A10534Cos_lot ;
   private boolean[] T018M3_n10534Cos_lot ;
   private int[] T018M3_A10535Cos_tot ;
   private boolean[] T018M3_n10535Cos_tot ;
   private int[] T018M3_A10536Cos_Clicod ;
   private boolean[] T018M3_n10536Cos_Clicod ;
   private String[] T018M3_A10537Cos_Acs ;
   private boolean[] T018M3_n10537Cos_Acs ;
   private String[] T018M3_A10538Cos_Nprog ;
   private boolean[] T018M3_n10538Cos_Nprog ;
   private String[] T018M3_A10548Cos_TipoR ;
   private boolean[] T018M3_n10548Cos_TipoR ;
   private String[] T018M2_A396EmprCod ;
   private short[] T018M2_A10514Cos_Any ;
   private byte[] T018M2_A10515Cos_Mes ;
   private byte[] T018M2_A10516Cos_dia ;
   private short[] T018M2_A10518Cos_linea ;
   private String[] T018M2_A10526Cos_ColNm ;
   private boolean[] T018M2_n10526Cos_ColNm ;
   private int[] T018M2_A10519Cos_hdr ;
   private boolean[] T018M2_n10519Cos_hdr ;
   private byte[] T018M2_A10520Cos_hdrr ;
   private boolean[] T018M2_n10520Cos_hdrr ;
   private String[] T018M2_A10521Cos_hdrp ;
   private boolean[] T018M2_n10521Cos_hdrp ;
   private java.math.BigDecimal[] T018M2_A10522Cos_Fab ;
   private boolean[] T018M2_n10522Cos_Fab ;
   private java.math.BigDecimal[] T018M2_A10523Cos_Pq ;
   private boolean[] T018M2_n10523Cos_Pq ;
   private java.math.BigDecimal[] T018M2_A10524Cos_H2o ;
   private boolean[] T018M2_n10524Cos_H2o ;
   private String[] T018M2_A10525Cos_Art ;
   private boolean[] T018M2_n10525Cos_Art ;
   private int[] T018M2_A10527Cos_ColNn ;
   private boolean[] T018M2_n10527Cos_ColNn ;
   private short[] T018M2_A10528Cos_tc ;
   private boolean[] T018M2_n10528Cos_tc ;
   private int[] T018M2_A10529Cos_Vol ;
   private boolean[] T018M2_n10529Cos_Vol ;
   private String[] T018M2_A10530Cos_Mq ;
   private boolean[] T018M2_n10530Cos_Mq ;
   private java.math.BigDecimal[] T018M2_A10531Cos_Kgs ;
   private boolean[] T018M2_n10531Cos_Kgs ;
   private java.math.BigDecimal[] T018M2_A10532Cos_KgsT ;
   private boolean[] T018M2_n10532Cos_KgsT ;
   private short[] T018M2_A10533Cos_Numt ;
   private boolean[] T018M2_n10533Cos_Numt ;
   private String[] T018M2_A10534Cos_lot ;
   private boolean[] T018M2_n10534Cos_lot ;
   private int[] T018M2_A10535Cos_tot ;
   private boolean[] T018M2_n10535Cos_tot ;
   private int[] T018M2_A10536Cos_Clicod ;
   private boolean[] T018M2_n10536Cos_Clicod ;
   private String[] T018M2_A10537Cos_Acs ;
   private boolean[] T018M2_n10537Cos_Acs ;
   private String[] T018M2_A10538Cos_Nprog ;
   private boolean[] T018M2_n10538Cos_Nprog ;
   private String[] T018M2_A10548Cos_TipoR ;
   private boolean[] T018M2_n10548Cos_TipoR ;
   private String[] T018M20_A396EmprCod ;
   private short[] T018M20_A10514Cos_Any ;
   private byte[] T018M20_A10515Cos_Mes ;
   private byte[] T018M20_A10516Cos_dia ;
   private short[] T018M20_A10518Cos_linea ;
   private String[] T018M21_A407EmprNom ;
   private boolean[] T018M21_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttr1000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr1000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr1000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr1000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttr1000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T018M2", "SELECT EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea, Cos_ColNm, Cos_hdr, Cos_hdrr, Cos_hdrp, Cos_Fab, Cos_Pq, Cos_H2o, Cos_Art, Cos_ColNn, Cos_tc, Cos_Vol, Cos_Mq, Cos_Kgs, Cos_KgsT, Cos_Numt, Cos_lot, Cos_tot, Cos_Clicod, Cos_Acs, Cos_Nprog, Cos_TipoR FROM TXPTR1001 WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? AND Cos_linea = ?  FOR UPDATE OF Cos_ColNm, Cos_hdr, Cos_hdrr, Cos_hdrp, Cos_Fab, Cos_Pq, Cos_H2o, Cos_Art, Cos_ColNn, Cos_tc, Cos_Vol, Cos_Mq, Cos_Kgs, Cos_KgsT, Cos_Numt, Cos_lot, Cos_tot, Cos_Clicod, Cos_Acs, Cos_Nprog, Cos_TipoR NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M3", "SELECT EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea, Cos_ColNm, Cos_hdr, Cos_hdrr, Cos_hdrp, Cos_Fab, Cos_Pq, Cos_H2o, Cos_Art, Cos_ColNn, Cos_tc, Cos_Vol, Cos_Mq, Cos_Kgs, Cos_KgsT, Cos_Numt, Cos_lot, Cos_tot, Cos_Clicod, Cos_Acs, Cos_Nprog, Cos_TipoR FROM TXPTR1001 WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? AND Cos_linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M4", "SELECT Cos_Any, Cos_Mes, Cos_dia, Cos_Ultl, EmprCod FROM TXPTR1000 WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ?  FOR UPDATE OF Cos_Ultl NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M5", "SELECT Cos_Any, Cos_Mes, Cos_dia, Cos_Ultl, EmprCod FROM TXPTR1000 WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M7", "SELECT /*+ FIRST_ROWS(100) */ TM1.Cos_Any, TM1.Cos_Mes, TM1.Cos_dia, TM1.Cos_Ultl, T2.EmprNom, TM1.EmprCod FROM (TXPTR1000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Cos_Any = ? and TM1.Cos_Mes = ? and TM1.Cos_dia = ? ORDER BY TM1.EmprCod, TM1.Cos_Any, TM1.Cos_Mes, TM1.Cos_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Cos_Any, Cos_Mes, Cos_dia FROM TXPTR1000 WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Cos_Any, Cos_Mes, Cos_dia FROM TXPTR1000 WHERE ( Cos_Any > ? or Cos_Any = ? and Cos_Mes > ? or Cos_Mes = ? and Cos_Any = ? and Cos_dia > ?) and EmprCod = ? ORDER BY EmprCod, Cos_Any, Cos_Mes, Cos_dia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T018M10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Cos_Any, Cos_Mes, Cos_dia FROM TXPTR1000 WHERE ( Cos_Any < ? or Cos_Any = ? and Cos_Mes < ? or Cos_Mes = ? and Cos_Any = ? and Cos_dia < ?) and EmprCod = ? ORDER BY EmprCod DESC, Cos_Any DESC, Cos_Mes DESC, Cos_dia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T018M11", "INSERT INTO TXPTR1000(Cos_Any, Cos_Mes, Cos_dia, Cos_Ultl, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR1000")
         ,new UpdateCursor("T018M12", "UPDATE TXPTR1000 SET Cos_Ultl=?  WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ?", GX_NOMASK, "TXPTR1000")
         ,new UpdateCursor("T018M13", "DELETE FROM TXPTR1000  WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ?", GX_NOMASK, "TXPTR1000")
         ,new ForEachCursor("T018M14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Cos_Any, Cos_Mes, Cos_dia FROM TXPTR1000 WHERE EmprCod = ? ORDER BY EmprCod, Cos_Any, Cos_Mes, Cos_dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M15", "SELECT EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea, Cos_ColNm, Cos_hdr, Cos_hdrr, Cos_hdrp, Cos_Fab, Cos_Pq, Cos_H2o, Cos_Art, Cos_ColNn, Cos_tc, Cos_Vol, Cos_Mq, Cos_Kgs, Cos_KgsT, Cos_Numt, Cos_lot, Cos_tot, Cos_Clicod, Cos_Acs, Cos_Nprog, Cos_TipoR FROM TXPTR1001 WHERE EmprCod = ? and Cos_Any = ? and Cos_Mes = ? and Cos_dia = ? and Cos_linea = ? ORDER BY EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M16", "SELECT EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea FROM TXPTR1001 WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? AND Cos_linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T018M17", "INSERT INTO TXPTR1001(EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea, Cos_ColNm, Cos_hdr, Cos_hdrr, Cos_hdrp, Cos_Fab, Cos_Pq, Cos_H2o, Cos_Art, Cos_ColNn, Cos_tc, Cos_Vol, Cos_Mq, Cos_Kgs, Cos_KgsT, Cos_Numt, Cos_lot, Cos_tot, Cos_Clicod, Cos_Acs, Cos_Nprog, Cos_TipoR) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTR1001")
         ,new UpdateCursor("T018M18", "UPDATE TXPTR1001 SET Cos_ColNm=?, Cos_hdr=?, Cos_hdrr=?, Cos_hdrp=?, Cos_Fab=?, Cos_Pq=?, Cos_H2o=?, Cos_Art=?, Cos_ColNn=?, Cos_tc=?, Cos_Vol=?, Cos_Mq=?, Cos_Kgs=?, Cos_KgsT=?, Cos_Numt=?, Cos_lot=?, Cos_tot=?, Cos_Clicod=?, Cos_Acs=?, Cos_Nprog=?, Cos_TipoR=?  WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? AND Cos_linea = ?", GX_NOMASK, "TXPTR1001")
         ,new UpdateCursor("T018M19", "DELETE FROM TXPTR1001  WHERE EmprCod = ? AND Cos_Any = ? AND Cos_Mes = ? AND Cos_dia = ? AND Cos_linea = ?", GX_NOMASK, "TXPTR1001")
         ,new ForEachCursor("T018M20", "SELECT EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea FROM TXPTR1001 WHERE EmprCod = ? and Cos_Any = ? and Cos_Mes = ? and Cos_dia = ? ORDER BY EmprCod, Cos_Any, Cos_Mes, Cos_dia, Cos_linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T018M21", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(24, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(24, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(24, 6);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(25, 6);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 8 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 3);
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 13);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 16);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[26]).intValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[28], 6);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[36], 10);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[38]).intValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[42], 6);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[44], 6);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[46], 1);
               }
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 13);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
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
                  stmt.setString(4, (String)parms[7], 1);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 16);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[21]).intValue());
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
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[29]).shortValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 10);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[33]).intValue());
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
                  stmt.setString(19, (String)parms[37], 6);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 6);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 1);
               }
               stmt.setString(22, (String)parms[42], 3);
               stmt.setShort(23, ((Number) parms[43]).shortValue());
               stmt.setByte(24, ((Number) parms[44]).byteValue());
               stmt.setByte(25, ((Number) parms[45]).byteValue());
               stmt.setShort(26, ((Number) parms[46]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

