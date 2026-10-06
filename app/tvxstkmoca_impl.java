package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvxstkmoca_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla Movs a Rollos VERTEX", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVxStMTip_Internalname ;
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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

   public tvxstkmoca_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvxstkmoca_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvxstkmoca_impl.class ));
   }

   public tvxstkmoca_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVxStkMoCa.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Tipo de Movimiento", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStMTip_Internalname, GXutil.rtrim( A12254VxStMTip), GXutil.rtrim( localUtil.format( A12254VxStMTip, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStMTip_Jsonclick, 0, "", "", "", "", "", 1, edtVxStMTip_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nro de Movimientno", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A12255VxStMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxStMCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12255VxStMCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12255VxStMCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStMCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxStMCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Código Cliente", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStMCliDe_Internalname, GXutil.ltrim( localUtil.ntoc( A12256VxStMCliDe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxStMCliDe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12256VxStMCliDe), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12256VxStMCliDe), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStMCliDe_Jsonclick, 0, "", "", "", "", "", 1, edtVxStMCliDe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Documento del Prov o Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStMDPr_Internalname, GXutil.rtrim( A12668VxStMDPr), GXutil.rtrim( localUtil.format( A12668VxStMDPr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStMDPr_Jsonclick, 0, "", "", "", "", "", 1, edtVxStMDPr_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nº Oficial de Remito", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStMNOf_Internalname, GXutil.ltrim( localUtil.ntoc( A13134VxStMNOf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVxStMNOf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13134VxStMNOf), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13134VxStMNOf), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStMNOf_Jsonclick, 0, "", "", "", "", "", 1, edtVxStMNOf_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Código Almacén", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVxStAlmCod_Internalname, GXutil.rtrim( A13135VxStAlmCod), GXutil.rtrim( localUtil.format( A13135VxStAlmCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVxStAlmCod_Jsonclick, 0, "", "", "", "", "", 1, edtVxStAlmCod_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVxStkMoCa.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1798 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1798 = (short)(1) ;
            scanStart1JJ1798( ) ;
            while ( RcdFound1798 != 0 )
            {
               init_level_properties1798( ) ;
               getByPrimaryKey1JJ1798( ) ;
               addRow1JJ1798( ) ;
               scanNext1JJ1798( ) ;
            }
            scanEnd1JJ1798( ) ;
            nBlankRcdCount1798 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1JJ1798( ) ;
         standaloneModal1JJ1798( ) ;
         sMode1798 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1JJ1798( ) ;
            edtavnRcdDeleted_1798_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1798_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1798_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1798_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVxTXPDefCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXTXPDEFCO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVxTXPDefCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxTXPDefCo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1798 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1JJ1798( ) ;
            }
            sendRow1JJ1798( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1798 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1798 = (short)(5) ;
         nRcdExists_1798 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1JJ1798( ) ;
            while ( RcdFound1798 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501798( ) ;
               init_level_properties1798( ) ;
               standaloneNotModal1JJ1798( ) ;
               getByPrimaryKey1JJ1798( ) ;
               standaloneModal1JJ1798( ) ;
               addRow1JJ1798( ) ;
               scanNext1JJ1798( ) ;
            }
            scanEnd1JJ1798( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1798 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501798( ) ;
      initAll1JJ1798( ) ;
      init_level_properties1798( ) ;
      nRcdExists_1798 = (short)(0) ;
      nIsMod_1798 = (short)(0) ;
      nRcdDeleted_1798 = (short)(0) ;
      nBlankRcdCount1798 = (short)(nBlankRcdUsr1798+nBlankRcdCount1798) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1798 > 0 )
      {
         standaloneNotModal1JJ1798( ) ;
         standaloneModal1JJ1798( ) ;
         addRow1JJ1798( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVxTXPDefCo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1798 = (short)(nBlankRcdCount1798-1) ;
      }
      Gx_mode = sMode1798 ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVxStkMoCa.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVxStkMoCa.htm");
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
         Z12254VxStMTip = httpContext.cgiGet( "Z12254VxStMTip") ;
         Z12255VxStMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z12255VxStMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12256VxStMCliDe = (int)(localUtil.ctol( httpContext.cgiGet( "Z12256VxStMCliDe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12668VxStMDPr = httpContext.cgiGet( "Z12668VxStMDPr") ;
         Z13134VxStMNOf = (int)(localUtil.ctol( httpContext.cgiGet( "Z13134VxStMNOf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13135VxStAlmCod = httpContext.cgiGet( "Z13135VxStAlmCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A12254VxStMTip = httpContext.cgiGet( edtVxStMTip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxStMCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12255VxStMCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
         }
         else
         {
            A12255VxStMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtVxStMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTMCLIDE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxStMCliDe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12256VxStMCliDe = 0 ;
            n12256VxStMCliDe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12256VxStMCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12256VxStMCliDe), 6, 0));
         }
         else
         {
            A12256VxStMCliDe = (int)(localUtil.ctol( httpContext.cgiGet( edtVxStMCliDe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12256VxStMCliDe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12256VxStMCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12256VxStMCliDe), 6, 0));
         }
         A12668VxStMDPr = httpContext.cgiGet( edtVxStMDPr_Internalname) ;
         n12668VxStMDPr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12668VxStMDPr", A12668VxStMDPr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMNOf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxStMNOf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VXSTMNOF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxStMNOf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13134VxStMNOf = 0 ;
            n13134VxStMNOf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13134VxStMNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13134VxStMNOf), 8, 0));
         }
         else
         {
            A13134VxStMNOf = (int)(localUtil.ctol( httpContext.cgiGet( edtVxStMNOf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13134VxStMNOf = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13134VxStMNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13134VxStMNOf), 8, 0));
         }
         A13135VxStAlmCod = httpContext.cgiGet( edtVxStAlmCod_Internalname) ;
         n13135VxStAlmCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13135VxStAlmCod", A13135VxStAlmCod);
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
            A12254VxStMTip = httpContext.GetPar( "VxStMTip") ;
            httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
            A12255VxStMCod = (int)(GXutil.lval( httpContext.GetPar( "VxStMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
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
            initAll1JJ1702( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1798_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1798_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1JJ1702( ) ;
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

   public void confirm_1JJ0( )
   {
      beforeValidate1JJ1702( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JJ1702( ) ;
         }
         else
         {
            checkExtendedTable1JJ1702( ) ;
            if ( AnyError == 0 )
            {
            }
            closeExtendedTableCursors1JJ1702( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1702 = Gx_mode ;
         confirm_1JJ1798( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1702 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1702 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1JJ0( ) ;
      }
   }

   public void confirm_1JJ1798( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1JJ1798( ) ;
         if ( ( nRcdExists_1798 != 0 ) || ( nIsMod_1798 != 0 ) )
         {
            getKey1JJ1798( ) ;
            if ( ( nRcdExists_1798 == 0 ) && ( nRcdDeleted_1798 == 0 ) )
            {
               if ( RcdFound1798 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1JJ1798( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1JJ1798( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1JJ1798( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VXTXPDEFCO_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxTXPDefCo_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1798 != 0 )
               {
                  if ( nRcdDeleted_1798 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1JJ1798( ) ;
                     load1JJ1798( ) ;
                     beforeValidate1JJ1798( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1JJ1798( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1798 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1JJ1798( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1JJ1798( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1JJ1798( ) ;
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
                  if ( nRcdDeleted_1798 == 0 )
                  {
                     GXCCtl = "VXTXPDEFCO_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxTXPDefCo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1798_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxTXPDefCo_Internalname, GXutil.ltrim( localUtil.ntoc( A13136VxTXPDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13136VxTXPDefCo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13136VxTXPDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1798_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1798_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1798_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1798 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1798_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1798_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXTXPDEFCO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxTXPDefCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1JJ0( )
   {
   }

   public void zm1JJ1702( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12256VxStMCliDe = T01JJ5_A12256VxStMCliDe[0] ;
            Z12668VxStMDPr = T01JJ5_A12668VxStMDPr[0] ;
            Z13134VxStMNOf = T01JJ5_A13134VxStMNOf[0] ;
            Z13135VxStAlmCod = T01JJ5_A13135VxStAlmCod[0] ;
         }
         else
         {
            Z12256VxStMCliDe = A12256VxStMCliDe ;
            Z12668VxStMDPr = A12668VxStMDPr ;
            Z13134VxStMNOf = A13134VxStMNOf ;
            Z13135VxStAlmCod = A13135VxStAlmCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z12254VxStMTip = A12254VxStMTip ;
         Z12255VxStMCod = A12255VxStMCod ;
         Z12256VxStMCliDe = A12256VxStMCliDe ;
         Z12668VxStMDPr = A12668VxStMDPr ;
         Z13134VxStMNOf = A13134VxStMNOf ;
         Z13135VxStAlmCod = A13135VxStAlmCod ;
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

   public void load1JJ1702( )
   {
      /* Using cursor T01JJ6 */
      pr_default.execute(4, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1702 = (short)(1) ;
         A12256VxStMCliDe = T01JJ6_A12256VxStMCliDe[0] ;
         n12256VxStMCliDe = T01JJ6_n12256VxStMCliDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12256VxStMCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12256VxStMCliDe), 6, 0));
         A12668VxStMDPr = T01JJ6_A12668VxStMDPr[0] ;
         n12668VxStMDPr = T01JJ6_n12668VxStMDPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12668VxStMDPr", A12668VxStMDPr);
         A13134VxStMNOf = T01JJ6_A13134VxStMNOf[0] ;
         n13134VxStMNOf = T01JJ6_n13134VxStMNOf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13134VxStMNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13134VxStMNOf), 8, 0));
         A13135VxStAlmCod = T01JJ6_A13135VxStAlmCod[0] ;
         n13135VxStAlmCod = T01JJ6_n13135VxStAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13135VxStAlmCod", A13135VxStAlmCod);
         zm1JJ1702( -1) ;
      }
      pr_default.close(4);
      onLoadActions1JJ1702( ) ;
   }

   public void onLoadActions1JJ1702( )
   {
   }

   public void checkExtendedTable1JJ1702( )
   {
      nIsDirty_1702 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1JJ1702( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1JJ1702( )
   {
      /* Using cursor T01JJ7 */
      pr_default.execute(5, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1702 = (short)(1) ;
      }
      else
      {
         RcdFound1702 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JJ5 */
      pr_default.execute(3, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1JJ1702( 1) ;
         RcdFound1702 = (short)(1) ;
         A12254VxStMTip = T01JJ5_A12254VxStMTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
         A12255VxStMCod = T01JJ5_A12255VxStMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
         A12256VxStMCliDe = T01JJ5_A12256VxStMCliDe[0] ;
         n12256VxStMCliDe = T01JJ5_n12256VxStMCliDe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12256VxStMCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12256VxStMCliDe), 6, 0));
         A12668VxStMDPr = T01JJ5_A12668VxStMDPr[0] ;
         n12668VxStMDPr = T01JJ5_n12668VxStMDPr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12668VxStMDPr", A12668VxStMDPr);
         A13134VxStMNOf = T01JJ5_A13134VxStMNOf[0] ;
         n13134VxStMNOf = T01JJ5_n13134VxStMNOf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13134VxStMNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13134VxStMNOf), 8, 0));
         A13135VxStAlmCod = T01JJ5_A13135VxStAlmCod[0] ;
         n13135VxStAlmCod = T01JJ5_n13135VxStAlmCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13135VxStAlmCod", A13135VxStAlmCod);
         Z12254VxStMTip = A12254VxStMTip ;
         Z12255VxStMCod = A12255VxStMCod ;
         sMode1702 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JJ1702( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1702 = (short)(0) ;
            initializeNonKey1JJ1702( ) ;
         }
         Gx_mode = sMode1702 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1702 = (short)(0) ;
         initializeNonKey1JJ1702( ) ;
         sMode1702 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1702 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1JJ1702( ) ;
      if ( RcdFound1702 == 0 )
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
      RcdFound1702 = (short)(0) ;
      /* Using cursor T01JJ8 */
      pr_default.execute(6, new Object[] {A12254VxStMTip, A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01JJ8_A12254VxStMTip[0], A12254VxStMTip) < 0 ) || ( GXutil.strcmp(T01JJ8_A12254VxStMTip[0], A12254VxStMTip) == 0 ) && ( T01JJ8_A12255VxStMCod[0] < A12255VxStMCod ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01JJ8_A12254VxStMTip[0], A12254VxStMTip) > 0 ) || ( GXutil.strcmp(T01JJ8_A12254VxStMTip[0], A12254VxStMTip) == 0 ) && ( T01JJ8_A12255VxStMCod[0] > A12255VxStMCod ) ) )
         {
            A12254VxStMTip = T01JJ8_A12254VxStMTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
            A12255VxStMCod = T01JJ8_A12255VxStMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
            RcdFound1702 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound1702 = (short)(0) ;
      /* Using cursor T01JJ9 */
      pr_default.execute(7, new Object[] {A12254VxStMTip, A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01JJ9_A12254VxStMTip[0], A12254VxStMTip) > 0 ) || ( GXutil.strcmp(T01JJ9_A12254VxStMTip[0], A12254VxStMTip) == 0 ) && ( T01JJ9_A12255VxStMCod[0] > A12255VxStMCod ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01JJ9_A12254VxStMTip[0], A12254VxStMTip) < 0 ) || ( GXutil.strcmp(T01JJ9_A12254VxStMTip[0], A12254VxStMTip) == 0 ) && ( T01JJ9_A12255VxStMCod[0] < A12255VxStMCod ) ) )
         {
            A12254VxStMTip = T01JJ9_A12254VxStMTip[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
            A12255VxStMCod = T01JJ9_A12255VxStMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
            RcdFound1702 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JJ1702( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVxStMTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JJ1702( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1702 == 1 )
         {
            if ( ( GXutil.strcmp(A12254VxStMTip, Z12254VxStMTip) != 0 ) || ( A12255VxStMCod != Z12255VxStMCod ) )
            {
               A12254VxStMTip = Z12254VxStMTip ;
               httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
               A12255VxStMCod = Z12255VxStMCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "VXSTMTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxStMTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVxStMTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1JJ1702( ) ;
               GX_FocusControl = edtVxStMTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A12254VxStMTip, Z12254VxStMTip) != 0 ) || ( A12255VxStMCod != Z12255VxStMCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVxStMTip_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JJ1702( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXSTMTIP");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVxStMTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtVxStMTip_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JJ1702( ) ;
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
      if ( ( GXutil.strcmp(A12254VxStMTip, Z12254VxStMTip) != 0 ) || ( A12255VxStMCod != Z12255VxStMCod ) )
      {
         A12254VxStMTip = Z12254VxStMTip ;
         httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
         A12255VxStMCod = Z12255VxStMCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "VXSTMTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVxStMTip_Internalname ;
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
      getKey1JJ1702( ) ;
      if ( RcdFound1702 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "VXSTMTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxStMTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A12254VxStMTip, Z12254VxStMTip) != 0 ) || ( A12255VxStMCod != Z12255VxStMCod ) )
         {
            A12254VxStMTip = Z12254VxStMTip ;
            httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
            A12255VxStMCod = Z12255VxStMCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "VXSTMTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtVxStMTip_Internalname ;
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
         if ( ( GXutil.strcmp(A12254VxStMTip, Z12254VxStMTip) != 0 ) || ( A12255VxStMCod != Z12255VxStMCod ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            insert_check( ) ;
         }
         else
         {
            if ( isUpd( ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "VXSTMTIP");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVxStMTip_Internalname ;
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxstkmoca");
      GX_FocusControl = edtVxStMCliDe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1JJ0( ) ;
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
      if ( RcdFound1702 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "VXSTMTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxStMTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVxStMCliDe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JJ1702( ) ;
      if ( RcdFound1702 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxStMCliDe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JJ1702( ) ;
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
      if ( RcdFound1702 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxStMCliDe_Internalname ;
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
      if ( RcdFound1702 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxStMCliDe_Internalname ;
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
      scanStart1JJ1702( ) ;
      if ( RcdFound1702 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1702 != 0 )
         {
            scanNext1JJ1702( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVxStMCliDe_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JJ1702( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JJ1702( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JJ4 */
         pr_default.execute(2, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKMOCA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z12256VxStMCliDe != T01JJ4_A12256VxStMCliDe[0] ) || ( GXutil.strcmp(Z12668VxStMDPr, T01JJ4_A12668VxStMDPr[0]) != 0 ) || ( Z13134VxStMNOf != T01JJ4_A13134VxStMNOf[0] ) || ( GXutil.strcmp(Z13135VxStAlmCod, T01JJ4_A13135VxStAlmCod[0]) != 0 ) )
         {
            if ( Z12256VxStMCliDe != T01JJ4_A12256VxStMCliDe[0] )
            {
               GXutil.writeLogln("tvxstkmoca:[seudo value changed for attri]"+"VxStMCliDe");
               GXutil.writeLogRaw("Old: ",Z12256VxStMCliDe);
               GXutil.writeLogRaw("Current: ",T01JJ4_A12256VxStMCliDe[0]);
            }
            if ( GXutil.strcmp(Z12668VxStMDPr, T01JJ4_A12668VxStMDPr[0]) != 0 )
            {
               GXutil.writeLogln("tvxstkmoca:[seudo value changed for attri]"+"VxStMDPr");
               GXutil.writeLogRaw("Old: ",Z12668VxStMDPr);
               GXutil.writeLogRaw("Current: ",T01JJ4_A12668VxStMDPr[0]);
            }
            if ( Z13134VxStMNOf != T01JJ4_A13134VxStMNOf[0] )
            {
               GXutil.writeLogln("tvxstkmoca:[seudo value changed for attri]"+"VxStMNOf");
               GXutil.writeLogRaw("Old: ",Z13134VxStMNOf);
               GXutil.writeLogRaw("Current: ",T01JJ4_A13134VxStMNOf[0]);
            }
            if ( GXutil.strcmp(Z13135VxStAlmCod, T01JJ4_A13135VxStAlmCod[0]) != 0 )
            {
               GXutil.writeLogln("tvxstkmoca:[seudo value changed for attri]"+"VxStAlmCod");
               GXutil.writeLogRaw("Old: ",Z13135VxStAlmCod);
               GXutil.writeLogRaw("Current: ",T01JJ4_A13135VxStAlmCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXSTKMOCA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JJ1702( )
   {
      beforeValidate1JJ1702( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JJ1702( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JJ1702( 0) ;
         checkOptimisticConcurrency1JJ1702( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JJ1702( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JJ1702( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JJ10 */
                  pr_default.execute(8, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Boolean.valueOf(n12256VxStMCliDe), Integer.valueOf(A12256VxStMCliDe), Boolean.valueOf(n12668VxStMDPr), A12668VxStMDPr, Boolean.valueOf(n13134VxStMNOf), Integer.valueOf(A13134VxStMNOf), Boolean.valueOf(n13135VxStAlmCod), A13135VxStAlmCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKMOCA");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevel1JJ1702( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1JJ0( ) ;
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
            load1JJ1702( ) ;
         }
         endLevel1JJ1702( ) ;
      }
      closeExtendedTableCursors1JJ1702( ) ;
   }

   public void update1JJ1702( )
   {
      beforeValidate1JJ1702( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JJ1702( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JJ1702( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JJ1702( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JJ1702( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JJ11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n12256VxStMCliDe), Integer.valueOf(A12256VxStMCliDe), Boolean.valueOf(n12668VxStMDPr), A12668VxStMDPr, Boolean.valueOf(n13134VxStMNOf), Integer.valueOf(A13134VxStMNOf), Boolean.valueOf(n13135VxStAlmCod), A13135VxStAlmCod, A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKMOCA");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKMOCA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JJ1702( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1JJ1702( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1JJ0( ) ;
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
         endLevel1JJ1702( ) ;
      }
      closeExtendedTableCursors1JJ1702( ) ;
   }

   public void deferredUpdate1JJ1702( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JJ1702( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JJ1702( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JJ1702( ) ;
         afterConfirm1JJ1702( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JJ1702( ) ;
            if ( AnyError == 0 )
            {
               scanStart1JJ1798( ) ;
               while ( RcdFound1798 != 0 )
               {
                  getByPrimaryKey1JJ1798( ) ;
                  delete1JJ1798( ) ;
                  scanNext1JJ1798( ) ;
               }
               scanEnd1JJ1798( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JJ12 */
                  pr_default.execute(10, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKMOCA");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1702 == 0 )
                        {
                           initAll1JJ1702( ) ;
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
                        resetCaption1JJ0( ) ;
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
      sMode1702 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JJ1702( ) ;
      Gx_mode = sMode1702 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JJ1702( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1JJ1798( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1JJ1798( ) ;
         if ( ( nRcdExists_1798 != 0 ) || ( nIsMod_1798 != 0 ) )
         {
            standaloneNotModal1JJ1798( ) ;
            getKey1JJ1798( ) ;
            if ( ( nRcdExists_1798 == 0 ) && ( nRcdDeleted_1798 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1JJ1798( ) ;
            }
            else
            {
               if ( RcdFound1798 != 0 )
               {
                  if ( ( nRcdDeleted_1798 != 0 ) && ( nRcdExists_1798 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1JJ1798( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1798 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1JJ1798( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1798 == 0 )
                  {
                     GXCCtl = "VXTXPDEFCO_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVxTXPDefCo_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1798_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVxTXPDefCo_Internalname, GXutil.ltrim( localUtil.ntoc( A13136VxTXPDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13136VxTXPDefCo_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z13136VxTXPDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1798_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1798_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1798_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1798 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1798_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1798_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VXTXPDEFCO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxTXPDefCo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1JJ1798( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1798 = (short)(0) ;
      nIsMod_1798 = (short)(0) ;
      nRcdDeleted_1798 = (short)(0) ;
   }

   public void processLevel1JJ1702( )
   {
      /* Save parent mode. */
      sMode1702 = Gx_mode ;
      processNestedLevel1JJ1798( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1702 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1JJ1702( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1JJ1702( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvxstkmoca");
         if ( AnyError == 0 )
         {
            confirmValues1JJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvxstkmoca");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JJ1702( )
   {
      /* Using cursor T01JJ13 */
      pr_default.execute(11);
      RcdFound1702 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1702 = (short)(1) ;
         A12254VxStMTip = T01JJ13_A12254VxStMTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
         A12255VxStMCod = T01JJ13_A12255VxStMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JJ1702( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound1702 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1702 = (short)(1) ;
         A12254VxStMTip = T01JJ13_A12254VxStMTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
         A12255VxStMCod = T01JJ13_A12255VxStMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
      }
   }

   public void scanEnd1JJ1702( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1JJ1702( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JJ1702( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JJ1702( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JJ1702( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JJ1702( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JJ1702( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JJ1702( )
   {
      edtVxStMTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMTip_Enabled), 5, 0), true);
      edtVxStMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMCod_Enabled), 5, 0), true);
      edtVxStMCliDe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMCliDe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMCliDe_Enabled), 5, 0), true);
      edtVxStMDPr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMDPr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMDPr_Enabled), 5, 0), true);
      edtVxStMNOf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStMNOf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStMNOf_Enabled), 5, 0), true);
      edtVxStAlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxStAlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxStAlmCod_Enabled), 5, 0), true);
   }

   public void zm1JJ1798( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z12254VxStMTip = A12254VxStMTip ;
         Z12255VxStMCod = A12255VxStMCod ;
         Z13136VxTXPDefCo = A13136VxTXPDefCo ;
      }
   }

   public void standaloneNotModal1JJ1798( )
   {
   }

   public void standaloneModal1JJ1798( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVxTXPDefCo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxTXPDefCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxTXPDefCo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtVxTXPDefCo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVxTXPDefCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxTXPDefCo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1JJ1798( )
   {
      /* Using cursor T01JJ14 */
      pr_default.execute(12, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Short.valueOf(A13136VxTXPDefCo)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound1798 = (short)(1) ;
         zm1JJ1798( -2) ;
      }
      pr_default.close(12);
      onLoadActions1JJ1798( ) ;
   }

   public void onLoadActions1JJ1798( )
   {
   }

   public void checkExtendedTable1JJ1798( )
   {
      nIsDirty_1798 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1JJ1798( ) ;
   }

   public void closeExtendedTableCursors1JJ1798( )
   {
   }

   public void enableDisable1JJ1798( )
   {
   }

   public void getKey1JJ1798( )
   {
      /* Using cursor T01JJ15 */
      pr_default.execute(13, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Short.valueOf(A13136VxTXPDefCo)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1798 = (short)(1) ;
      }
      else
      {
         RcdFound1798 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey1JJ1798( )
   {
      /* Using cursor T01JJ3 */
      pr_default.execute(1, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Short.valueOf(A13136VxTXPDefCo)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1JJ1798( 2) ;
         RcdFound1798 = (short)(1) ;
         initializeNonKey1JJ1798( ) ;
         A13136VxTXPDefCo = T01JJ3_A13136VxTXPDefCo[0] ;
         Z12254VxStMTip = A12254VxStMTip ;
         Z12255VxStMCod = A12255VxStMCod ;
         Z13136VxTXPDefCo = A13136VxTXPDefCo ;
         sMode1798 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JJ1798( ) ;
         load1JJ1798( ) ;
         Gx_mode = sMode1798 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1798 = (short)(0) ;
         initializeNonKey1JJ1798( ) ;
         sMode1798 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JJ1798( ) ;
         Gx_mode = sMode1798 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1JJ1798( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1JJ1798( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JJ2 */
         pr_default.execute(0, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Short.valueOf(A13136VxTXPDefCo)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"VTXSTKMODF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"VTXSTKMODF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JJ1798( )
   {
      beforeValidate1JJ1798( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JJ1798( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JJ1798( 0) ;
         checkOptimisticConcurrency1JJ1798( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JJ1798( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JJ1798( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JJ16 */
                  pr_default.execute(14, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Short.valueOf(A13136VxTXPDefCo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKMODF");
                  if ( (pr_default.getStatus(14) == 1) )
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
            load1JJ1798( ) ;
         }
         endLevel1JJ1798( ) ;
      }
      closeExtendedTableCursors1JJ1798( ) ;
   }

   public void update1JJ1798( )
   {
      beforeValidate1JJ1798( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JJ1798( ) ;
      }
      if ( ( nIsMod_1798 != 0 ) || ( nIsDirty_1798 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1JJ1798( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1JJ1798( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1JJ1798( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table VTXSTKMODF */
                     deferredUpdate1JJ1798( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1JJ1798( ) ;
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
            endLevel1JJ1798( ) ;
         }
      }
      closeExtendedTableCursors1JJ1798( ) ;
   }

   public void deferredUpdate1JJ1798( )
   {
   }

   public void delete1JJ1798( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JJ1798( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JJ1798( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JJ1798( ) ;
         afterConfirm1JJ1798( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JJ1798( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JJ17 */
               pr_default.execute(15, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod), Short.valueOf(A13136VxTXPDefCo)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("VTXSTKMODF");
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
      sMode1798 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JJ1798( ) ;
      Gx_mode = sMode1798 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JJ1798( )
   {
      standaloneModal1JJ1798( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1JJ1798( )
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

   public void scanStart1JJ1798( )
   {
      /* Scan By routine */
      /* Using cursor T01JJ18 */
      pr_default.execute(16, new Object[] {A12254VxStMTip, Integer.valueOf(A12255VxStMCod)});
      RcdFound1798 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1798 = (short)(1) ;
         A13136VxTXPDefCo = T01JJ18_A13136VxTXPDefCo[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JJ1798( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1798 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1798 = (short)(1) ;
         A13136VxTXPDefCo = T01JJ18_A13136VxTXPDefCo[0] ;
      }
   }

   public void scanEnd1JJ1798( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1JJ1798( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1JJ1798( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JJ1798( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JJ1798( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JJ1798( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JJ1798( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JJ1798( )
   {
      edtVxTXPDefCo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxTXPDefCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxTXPDefCo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1JJ1798( )
   {
   }

   public void send_integrity_lvl_hashes1JJ1702( )
   {
   }

   public void subsflControlProps_501798( )
   {
      edtavnRcdDeleted_1798_Internalname = "vNRCDDELETED_1798_"+sGXsfl_50_idx ;
      edtVxTXPDefCo_Internalname = "VXTXPDEFCO_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501798( )
   {
      edtavnRcdDeleted_1798_Internalname = "vNRCDDELETED_1798_"+sGXsfl_50_fel_idx ;
      edtVxTXPDefCo_Internalname = "VXTXPDEFCO_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1JJ1798( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501798( ) ;
      sendRow1JJ1798( ) ;
   }

   public void sendRow1JJ1798( )
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
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1798_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1798_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1798_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1798), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1798), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1798_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1798_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1798_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVxTXPDefCo_Internalname,GXutil.ltrim( localUtil.ntoc( A13136VxTXPDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13136VxTXPDefCo), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVxTXPDefCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVxTXPDefCo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1JJ1798( ) ;
      GXCCtl = "Z13136VxTXPDefCo_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13136VxTXPDefCo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1798_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1798_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1798_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1798, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1798_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1798_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VXTXPDEFCO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVxTXPDefCo_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1JJ1798( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501798( ) ;
      edtavnRcdDeleted_1798_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1798_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVxTXPDefCo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VXTXPDEFCO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1798_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1798_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1798");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1798_Internalname ;
         wbErr = true ;
         nRcdDeleted_1798 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1798 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1798_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVxTXPDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVxTXPDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VXTXPDEFCO_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVxTXPDefCo_Internalname ;
         wbErr = true ;
         A13136VxTXPDefCo = (short)(0) ;
      }
      else
      {
         A13136VxTXPDefCo = (short)(localUtil.ctol( httpContext.cgiGet( edtVxTXPDefCo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z13136VxTXPDefCo_" + sGXsfl_50_idx ;
      Z13136VxTXPDefCo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1798_" + sGXsfl_50_idx ;
      nRcdDeleted_1798 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1798_" + sGXsfl_50_idx ;
      nRcdExists_1798 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1798_" + sGXsfl_50_idx ;
      nIsMod_1798 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVxTXPDefCo_Enabled = edtVxTXPDefCo_Enabled ;
   }

   public void confirmValues1JJ0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501798( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501798( ) ;
         httpContext.changePostValue( "Z13136VxTXPDefCo_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z13136VxTXPDefCo_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13136VxTXPDefCo_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvxstkmoca", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12254VxStMTip", GXutil.rtrim( Z12254VxStMTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12255VxStMCod", GXutil.ltrim( localUtil.ntoc( Z12255VxStMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12256VxStMCliDe", GXutil.ltrim( localUtil.ntoc( Z12256VxStMCliDe, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12668VxStMDPr", GXutil.rtrim( Z12668VxStMDPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13134VxStMNOf", GXutil.ltrim( localUtil.ntoc( Z13134VxStMNOf, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13135VxStAlmCod", GXutil.rtrim( Z13135VxStAlmCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvxstkmoca", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVxStkMoCa" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla Movs a Rollos VERTEX", "") ;
   }

   public void initializeNonKey1JJ1702( )
   {
      A12256VxStMCliDe = 0 ;
      n12256VxStMCliDe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12256VxStMCliDe", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12256VxStMCliDe), 6, 0));
      A12668VxStMDPr = "" ;
      n12668VxStMDPr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12668VxStMDPr", A12668VxStMDPr);
      A13134VxStMNOf = 0 ;
      n13134VxStMNOf = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13134VxStMNOf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13134VxStMNOf), 8, 0));
      A13135VxStAlmCod = "" ;
      n13135VxStAlmCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13135VxStAlmCod", A13135VxStAlmCod);
      Z12256VxStMCliDe = 0 ;
      Z12668VxStMDPr = "" ;
      Z13134VxStMNOf = 0 ;
      Z13135VxStAlmCod = "" ;
   }

   public void initAll1JJ1702( )
   {
      A12254VxStMTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12254VxStMTip", A12254VxStMTip);
      A12255VxStMCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12255VxStMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12255VxStMCod), 8, 0));
      initializeNonKey1JJ1702( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1JJ1798( )
   {
   }

   public void initAll1JJ1798( )
   {
      A13136VxTXPDefCo = (short)(0) ;
      initializeNonKey1JJ1798( ) ;
   }

   public void standaloneModalInsert1JJ1798( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20261251951091", true, true);
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
      httpContext.AddJavascriptSource("tvxstkmoca.js", "?20261251951091", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1798( )
   {
      edtVxTXPDefCo_Enabled = defedtVxTXPDefCo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVxTXPDefCo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVxTXPDefCo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1798, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1798_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13136VxTXPDefCo, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVxTXPDefCo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVxStMTip_Internalname = "VXSTMTIP" ;
      lblTextblock2_Internalname = "TEXTBLOCK2" ;
      edtVxStMCod_Internalname = "VXSTMCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtVxStMCliDe_Internalname = "VXSTMCLIDE" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVxStMDPr_Internalname = "VXSTMDPR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVxStMNOf_Internalname = "VXSTMNOF" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVxStAlmCod_Internalname = "VXSTALMCOD" ;
      edtavnRcdDeleted_1798_Internalname = "vNRCDDELETED_1798" ;
      edtVxTXPDefCo_Internalname = "VXTXPDEFCO" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla Movs a Rollos VERTEX", "") );
      edtVxTXPDefCo_Jsonclick = "" ;
      edtavnRcdDeleted_1798_Jsonclick = "" ;
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
      edtVxTXPDefCo_Enabled = 1 ;
      edtavnRcdDeleted_1798_Enabled = 1 ;
      edtVxStAlmCod_Jsonclick = "" ;
      edtVxStAlmCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxStAlmCod_Enabled = 1 ;
      edtVxStMNOf_Jsonclick = "" ;
      edtVxStMNOf_Backcolor = (int)(0xFFFFFF) ;
      edtVxStMNOf_Enabled = 1 ;
      edtVxStMDPr_Jsonclick = "" ;
      edtVxStMDPr_Backcolor = (int)(0xFFFFFF) ;
      edtVxStMDPr_Enabled = 1 ;
      edtVxStMCliDe_Jsonclick = "" ;
      edtVxStMCliDe_Backcolor = (int)(0xFFFFFF) ;
      edtVxStMCliDe_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVxStMCod_Jsonclick = "" ;
      edtVxStMCod_Backcolor = (int)(0xFFFFFF) ;
      edtVxStMCod_Enabled = 1 ;
      edtVxStMTip_Jsonclick = "" ;
      edtVxStMTip_Backcolor = (int)(0xFFFFFF) ;
      edtVxStMTip_Enabled = 1 ;
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
      subsflControlProps_501798( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1JJ1798( ) ;
         standaloneModal1JJ1798( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1JJ1798( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501798( ) ;
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
      GX_FocusControl = edtVxStMCliDe_Internalname ;
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

   public void valid_Vxstmcod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12256VxStMCliDe", GXutil.ltrim( localUtil.ntoc( A12256VxStMCliDe, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12668VxStMDPr", GXutil.rtrim( A12668VxStMDPr));
      httpContext.ajax_rsp_assign_attri("", false, "A13134VxStMNOf", GXutil.ltrim( localUtil.ntoc( A13134VxStMNOf, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13135VxStAlmCod", GXutil.rtrim( A13135VxStAlmCod));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12254VxStMTip", GXutil.rtrim( Z12254VxStMTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12255VxStMCod", GXutil.ltrim( localUtil.ntoc( Z12255VxStMCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12256VxStMCliDe", GXutil.ltrim( localUtil.ntoc( Z12256VxStMCliDe, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12668VxStMDPr", GXutil.rtrim( Z12668VxStMDPr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13134VxStMNOf", GXutil.ltrim( localUtil.ntoc( Z13134VxStMNOf, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13135VxStAlmCod", GXutil.rtrim( Z13135VxStAlmCod));
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
      setEventMetadata("VALID_VXSTMTIP","{handler:'valid_Vxstmtip',iparms:[]");
      setEventMetadata("VALID_VXSTMTIP",",oparms:[]}");
      setEventMetadata("VALID_VXSTMCOD","{handler:'valid_Vxstmcod',iparms:[{av:'A12254VxStMTip',fld:'VXSTMTIP',pic:''},{av:'A12255VxStMCod',fld:'VXSTMCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VXSTMCOD",",oparms:[{av:'A12256VxStMCliDe',fld:'VXSTMCLIDE',pic:'ZZZZZ9'},{av:'A12668VxStMDPr',fld:'VXSTMDPR',pic:''},{av:'A13134VxStMNOf',fld:'VXSTMNOF',pic:'ZZZZZZZ9'},{av:'A13135VxStAlmCod',fld:'VXSTALMCOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z12254VxStMTip'},{av:'Z12255VxStMCod'},{av:'Z12256VxStMCliDe'},{av:'Z12668VxStMDPr'},{av:'Z13134VxStMNOf'},{av:'Z13135VxStAlmCod'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VXTXPDEFCO","{handler:'valid_Vxtxpdefco',iparms:[]");
      setEventMetadata("VALID_VXTXPDEFCO",",oparms:[]}");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z12254VxStMTip = "" ;
      Z12668VxStMDPr = "" ;
      Z13135VxStAlmCod = "" ;
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
      A12254VxStMTip = "" ;
      lblTextblock2_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12668VxStMDPr = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A13135VxStAlmCod = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1798 = "" ;
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
      sMode1702 = "" ;
      GXCCtl = "" ;
      T01JJ6_A12254VxStMTip = new String[] {""} ;
      T01JJ6_A12255VxStMCod = new int[1] ;
      T01JJ6_A12256VxStMCliDe = new int[1] ;
      T01JJ6_n12256VxStMCliDe = new boolean[] {false} ;
      T01JJ6_A12668VxStMDPr = new String[] {""} ;
      T01JJ6_n12668VxStMDPr = new boolean[] {false} ;
      T01JJ6_A13134VxStMNOf = new int[1] ;
      T01JJ6_n13134VxStMNOf = new boolean[] {false} ;
      T01JJ6_A13135VxStAlmCod = new String[] {""} ;
      T01JJ6_n13135VxStAlmCod = new boolean[] {false} ;
      T01JJ7_A12254VxStMTip = new String[] {""} ;
      T01JJ7_A12255VxStMCod = new int[1] ;
      T01JJ5_A12254VxStMTip = new String[] {""} ;
      T01JJ5_A12255VxStMCod = new int[1] ;
      T01JJ5_A12256VxStMCliDe = new int[1] ;
      T01JJ5_n12256VxStMCliDe = new boolean[] {false} ;
      T01JJ5_A12668VxStMDPr = new String[] {""} ;
      T01JJ5_n12668VxStMDPr = new boolean[] {false} ;
      T01JJ5_A13134VxStMNOf = new int[1] ;
      T01JJ5_n13134VxStMNOf = new boolean[] {false} ;
      T01JJ5_A13135VxStAlmCod = new String[] {""} ;
      T01JJ5_n13135VxStAlmCod = new boolean[] {false} ;
      T01JJ8_A12254VxStMTip = new String[] {""} ;
      T01JJ8_A12255VxStMCod = new int[1] ;
      T01JJ9_A12254VxStMTip = new String[] {""} ;
      T01JJ9_A12255VxStMCod = new int[1] ;
      T01JJ4_A12254VxStMTip = new String[] {""} ;
      T01JJ4_A12255VxStMCod = new int[1] ;
      T01JJ4_A12256VxStMCliDe = new int[1] ;
      T01JJ4_n12256VxStMCliDe = new boolean[] {false} ;
      T01JJ4_A12668VxStMDPr = new String[] {""} ;
      T01JJ4_n12668VxStMDPr = new boolean[] {false} ;
      T01JJ4_A13134VxStMNOf = new int[1] ;
      T01JJ4_n13134VxStMNOf = new boolean[] {false} ;
      T01JJ4_A13135VxStAlmCod = new String[] {""} ;
      T01JJ4_n13135VxStAlmCod = new boolean[] {false} ;
      T01JJ13_A12254VxStMTip = new String[] {""} ;
      T01JJ13_A12255VxStMCod = new int[1] ;
      T01JJ14_A12254VxStMTip = new String[] {""} ;
      T01JJ14_A12255VxStMCod = new int[1] ;
      T01JJ14_A13136VxTXPDefCo = new short[1] ;
      T01JJ15_A12254VxStMTip = new String[] {""} ;
      T01JJ15_A12255VxStMCod = new int[1] ;
      T01JJ15_A13136VxTXPDefCo = new short[1] ;
      T01JJ3_A12254VxStMTip = new String[] {""} ;
      T01JJ3_A12255VxStMCod = new int[1] ;
      T01JJ3_A13136VxTXPDefCo = new short[1] ;
      T01JJ2_A12254VxStMTip = new String[] {""} ;
      T01JJ2_A12255VxStMCod = new int[1] ;
      T01JJ2_A13136VxTXPDefCo = new short[1] ;
      T01JJ18_A12254VxStMTip = new String[] {""} ;
      T01JJ18_A12255VxStMCod = new int[1] ;
      T01JJ18_A13136VxTXPDefCo = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      ZZ12254VxStMTip = "" ;
      ZZ12668VxStMDPr = "" ;
      ZZ13135VxStAlmCod = "" ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvxstkmoca__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvxstkmoca__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvxstkmoca__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvxstkmoca__default(),
         new Object[] {
             new Object[] {
            T01JJ2_A12254VxStMTip, T01JJ2_A12255VxStMCod, T01JJ2_A13136VxTXPDefCo
            }
            , new Object[] {
            T01JJ3_A12254VxStMTip, T01JJ3_A12255VxStMCod, T01JJ3_A13136VxTXPDefCo
            }
            , new Object[] {
            T01JJ4_A12254VxStMTip, T01JJ4_A12255VxStMCod, T01JJ4_A12256VxStMCliDe, T01JJ4_n12256VxStMCliDe, T01JJ4_A12668VxStMDPr, T01JJ4_n12668VxStMDPr, T01JJ4_A13134VxStMNOf, T01JJ4_n13134VxStMNOf, T01JJ4_A13135VxStAlmCod, T01JJ4_n13135VxStAlmCod
            }
            , new Object[] {
            T01JJ5_A12254VxStMTip, T01JJ5_A12255VxStMCod, T01JJ5_A12256VxStMCliDe, T01JJ5_n12256VxStMCliDe, T01JJ5_A12668VxStMDPr, T01JJ5_n12668VxStMDPr, T01JJ5_A13134VxStMNOf, T01JJ5_n13134VxStMNOf, T01JJ5_A13135VxStAlmCod, T01JJ5_n13135VxStAlmCod
            }
            , new Object[] {
            T01JJ6_A12254VxStMTip, T01JJ6_A12255VxStMCod, T01JJ6_A12256VxStMCliDe, T01JJ6_n12256VxStMCliDe, T01JJ6_A12668VxStMDPr, T01JJ6_n12668VxStMDPr, T01JJ6_A13134VxStMNOf, T01JJ6_n13134VxStMNOf, T01JJ6_A13135VxStAlmCod, T01JJ6_n13135VxStAlmCod
            }
            , new Object[] {
            T01JJ7_A12254VxStMTip, T01JJ7_A12255VxStMCod
            }
            , new Object[] {
            T01JJ8_A12254VxStMTip, T01JJ8_A12255VxStMCod
            }
            , new Object[] {
            T01JJ9_A12254VxStMTip, T01JJ9_A12255VxStMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JJ13_A12254VxStMTip, T01JJ13_A12255VxStMCod
            }
            , new Object[] {
            T01JJ14_A12254VxStMTip, T01JJ14_A12255VxStMCod, T01JJ14_A13136VxTXPDefCo
            }
            , new Object[] {
            T01JJ15_A12254VxStMTip, T01JJ15_A12255VxStMCod, T01JJ15_A13136VxTXPDefCo
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JJ18_A12254VxStMTip, T01JJ18_A12255VxStMCod, T01JJ18_A13136VxTXPDefCo
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
   private short Z13136VxTXPDefCo ;
   private short nRcdDeleted_1798 ;
   private short nRcdExists_1798 ;
   private short nIsMod_1798 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1798 ;
   private short RcdFound1798 ;
   private short nBlankRcdUsr1798 ;
   private short A13136VxTXPDefCo ;
   private short RcdFound1702 ;
   private short nIsDirty_1702 ;
   private short nIsDirty_1798 ;
   private int Z12255VxStMCod ;
   private int Z12256VxStMCliDe ;
   private int Z13134VxStMNOf ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtVxStMTip_Enabled ;
   private int A12255VxStMCod ;
   private int edtVxStMCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A12256VxStMCliDe ;
   private int edtVxStMCliDe_Enabled ;
   private int edtVxStMDPr_Enabled ;
   private int A13134VxStMNOf ;
   private int edtVxStMNOf_Enabled ;
   private int edtVxStAlmCod_Enabled ;
   private int edtavnRcdDeleted_1798_Enabled ;
   private int edtVxTXPDefCo_Enabled ;
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
   private int defedtVxTXPDefCo_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVxStAlmCod_Backcolor ;
   private int edtVxStMNOf_Backcolor ;
   private int edtVxStMDPr_Backcolor ;
   private int edtVxStMCliDe_Backcolor ;
   private int edtVxStMCod_Backcolor ;
   private int edtVxStMTip_Backcolor ;
   private int ZZ12255VxStMCod ;
   private int ZZ12256VxStMCliDe ;
   private int ZZ13134VxStMNOf ;
   private long GRID1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String Z12254VxStMTip ;
   private String Z12668VxStMDPr ;
   private String Z13135VxStAlmCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVxStMTip_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String A12254VxStMTip ;
   private String edtVxStMTip_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtVxStMCod_Internalname ;
   private String edtVxStMCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtVxStMCliDe_Internalname ;
   private String edtVxStMCliDe_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVxStMDPr_Internalname ;
   private String A12668VxStMDPr ;
   private String edtVxStMDPr_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVxStMNOf_Internalname ;
   private String edtVxStMNOf_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVxStAlmCod_Internalname ;
   private String A13135VxStAlmCod ;
   private String edtVxStAlmCod_Jsonclick ;
   private String sMode1798 ;
   private String edtavnRcdDeleted_1798_Internalname ;
   private String edtVxTXPDefCo_Internalname ;
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
   private String sMode1702 ;
   private String GXCCtl ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1798_Jsonclick ;
   private String edtVxTXPDefCo_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ12254VxStMTip ;
   private String ZZ12668VxStMDPr ;
   private String ZZ13135VxStAlmCod ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n12256VxStMCliDe ;
   private boolean n12668VxStMDPr ;
   private boolean n13134VxStMNOf ;
   private boolean n13135VxStAlmCod ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01JJ6_A12254VxStMTip ;
   private int[] T01JJ6_A12255VxStMCod ;
   private int[] T01JJ6_A12256VxStMCliDe ;
   private boolean[] T01JJ6_n12256VxStMCliDe ;
   private String[] T01JJ6_A12668VxStMDPr ;
   private boolean[] T01JJ6_n12668VxStMDPr ;
   private int[] T01JJ6_A13134VxStMNOf ;
   private boolean[] T01JJ6_n13134VxStMNOf ;
   private String[] T01JJ6_A13135VxStAlmCod ;
   private boolean[] T01JJ6_n13135VxStAlmCod ;
   private String[] T01JJ7_A12254VxStMTip ;
   private int[] T01JJ7_A12255VxStMCod ;
   private String[] T01JJ5_A12254VxStMTip ;
   private int[] T01JJ5_A12255VxStMCod ;
   private int[] T01JJ5_A12256VxStMCliDe ;
   private boolean[] T01JJ5_n12256VxStMCliDe ;
   private String[] T01JJ5_A12668VxStMDPr ;
   private boolean[] T01JJ5_n12668VxStMDPr ;
   private int[] T01JJ5_A13134VxStMNOf ;
   private boolean[] T01JJ5_n13134VxStMNOf ;
   private String[] T01JJ5_A13135VxStAlmCod ;
   private boolean[] T01JJ5_n13135VxStAlmCod ;
   private String[] T01JJ8_A12254VxStMTip ;
   private int[] T01JJ8_A12255VxStMCod ;
   private String[] T01JJ9_A12254VxStMTip ;
   private int[] T01JJ9_A12255VxStMCod ;
   private String[] T01JJ4_A12254VxStMTip ;
   private int[] T01JJ4_A12255VxStMCod ;
   private int[] T01JJ4_A12256VxStMCliDe ;
   private boolean[] T01JJ4_n12256VxStMCliDe ;
   private String[] T01JJ4_A12668VxStMDPr ;
   private boolean[] T01JJ4_n12668VxStMDPr ;
   private int[] T01JJ4_A13134VxStMNOf ;
   private boolean[] T01JJ4_n13134VxStMNOf ;
   private String[] T01JJ4_A13135VxStAlmCod ;
   private boolean[] T01JJ4_n13135VxStAlmCod ;
   private String[] T01JJ13_A12254VxStMTip ;
   private int[] T01JJ13_A12255VxStMCod ;
   private String[] T01JJ14_A12254VxStMTip ;
   private int[] T01JJ14_A12255VxStMCod ;
   private short[] T01JJ14_A13136VxTXPDefCo ;
   private String[] T01JJ15_A12254VxStMTip ;
   private int[] T01JJ15_A12255VxStMCod ;
   private short[] T01JJ15_A13136VxTXPDefCo ;
   private String[] T01JJ3_A12254VxStMTip ;
   private int[] T01JJ3_A12255VxStMCod ;
   private short[] T01JJ3_A13136VxTXPDefCo ;
   private String[] T01JJ2_A12254VxStMTip ;
   private int[] T01JJ2_A12255VxStMCod ;
   private short[] T01JJ2_A13136VxTXPDefCo ;
   private String[] T01JJ18_A12254VxStMTip ;
   private int[] T01JJ18_A12255VxStMCod ;
   private short[] T01JJ18_A13136VxTXPDefCo ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvxstkmoca__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxstkmoca__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxstkmoca__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvxstkmoca__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JJ2", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, TXPTipDefC FROM VTXSTKMODF WHERE StMTip = ? AND StMCod = ? AND TXPTipDefC = ?  FOR UPDATE OF StMTip NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ3", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, TXPTipDefC FROM VTXSTKMODF WHERE StMTip = ? AND StMCod = ? AND TXPTipDefC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ4", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, StMCliDes, StMDocPrv, StMNOf, StMAlmCod FROM VTXSTKMOCA WHERE StMTip = ? AND StMCod = ?  FOR UPDATE OF StMCliDes, StMDocPrv, StMNOf, StMAlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ5", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, StMCliDes, StMDocPrv, StMNOf, StMAlmCod FROM VTXSTKMOCA WHERE StMTip = ? AND StMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.StMTip AS VxStMTip, TM1.StMCod AS VxStMCod, TM1.StMCliDes, TM1.StMDocPrv, TM1.StMNOf, TM1.StMAlmCod FROM VTXSTKMOCA TM1 WHERE TM1.StMTip = ? and TM1.StMCod = ? ORDER BY TM1.StMTip, TM1.StMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ7", "SELECT /*+ FIRST_ROWS(1) */ StMTip AS VxStMTip, StMCod AS VxStMCod FROM VTXSTKMOCA WHERE StMTip = ? AND StMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ StMTip AS VxStMTip, StMCod AS VxStMCod FROM VTXSTKMOCA WHERE ( StMTip > ? or StMTip = ? and StMCod > ?) ORDER BY StMTip, StMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JJ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ StMTip AS VxStMTip, StMCod AS VxStMCod FROM VTXSTKMOCA WHERE ( StMTip < ? or StMTip = ? and StMCod < ?) ORDER BY StMTip DESC, StMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JJ10", "INSERT INTO VTXSTKMOCA(StMTip, StMCod, StMCliDes, StMDocPrv, StMNOf, StMAlmCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "VTXSTKMOCA")
         ,new UpdateCursor("T01JJ11", "UPDATE VTXSTKMOCA SET StMCliDes=?, StMDocPrv=?, StMNOf=?, StMAlmCod=?  WHERE StMTip = ? AND StMCod = ?", GX_NOMASK, "VTXSTKMOCA")
         ,new UpdateCursor("T01JJ12", "DELETE FROM VTXSTKMOCA  WHERE StMTip = ? AND StMCod = ?", GX_NOMASK, "VTXSTKMOCA")
         ,new ForEachCursor("T01JJ13", "SELECT /*+ FIRST_ROWS(100) */ StMTip AS VxStMTip, StMCod AS VxStMCod FROM VTXSTKMOCA ORDER BY StMTip, StMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ14", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, TXPTipDefC FROM VTXSTKMODF WHERE StMTip = ? and StMCod = ? and TXPTipDefC = ? ORDER BY StMTip, StMCod, TXPTipDefC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JJ15", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, TXPTipDefC FROM VTXSTKMODF WHERE StMTip = ? AND StMCod = ? AND TXPTipDefC = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01JJ16", "INSERT INTO VTXSTKMODF(StMTip, StMCod, TXPTipDefC) VALUES(?, ?, ?)", GX_NOMASK, "VTXSTKMODF")
         ,new UpdateCursor("T01JJ17", "DELETE FROM VTXSTKMODF  WHERE StMTip = ? AND StMCod = ? AND TXPTipDefC = ?", GX_NOMASK, "VTXSTKMODF")
         ,new ForEachCursor("T01JJ18", "SELECT StMTip AS VxStMTip, StMCod AS VxStMCod, TXPTipDefC FROM VTXSTKMODF WHERE StMTip = ? and StMCod = ? ORDER BY StMTip, StMCod, TXPTipDefC ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 15);
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[9], 4);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 15);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 4);
               }
               stmt.setString(5, (String)parms[8], 4);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

