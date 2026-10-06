package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tvts000_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "REGISTRO 79", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtVts_Nbarca_Internalname ;
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

   public tvts000_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tvts000_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tvts000_impl.class ));
   }

   public tvts000_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TVTS000.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "N Barcada (8)+Numero de Barra(1)+sinvalor", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_Nbarca_Internalname, GXutil.rtrim( A10940Vts_Nbarca), GXutil.rtrim( localUtil.format( A10940Vts_Nbarca, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_Nbarca_Jsonclick, 0, "", "", "", "", "", 1, edtVts_Nbarca_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_Clicod_Internalname, GXutil.ltrim( localUtil.ntoc( A10941Vts_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVts_Clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10941Vts_Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10941Vts_Clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_Clicod_Jsonclick, 0, "", "", "", "", "", 1, edtVts_Clicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Servicio(Articulo)", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_Serv_Internalname, GXutil.ltrim( localUtil.ntoc( A10942Vts_Serv, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVts_Serv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10942Vts_Serv), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10942Vts_Serv), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_Serv_Jsonclick, 0, "", "", "", "", "", 1, edtVts_Serv_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Formula", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TVTS000.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtVts_Form_Internalname, GXutil.ltrim( localUtil.ntoc( A10943Vts_Form, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtVts_Form_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10943Vts_Form), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10943Vts_Form), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtVts_Form_Jsonclick, 0, "", "", "", "", "", 1, edtVts_Form_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TVTS000.htm");
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
         nBlankRcdCount1461 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1461 = (short)(1) ;
            scanStart1A81461( ) ;
            while ( RcdFound1461 != 0 )
            {
               init_level_properties1461( ) ;
               getByPrimaryKey1A81461( ) ;
               addRow1A81461( ) ;
               scanNext1A81461( ) ;
            }
            scanEnd1A81461( ) ;
            nBlankRcdCount1461 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1A81461( ) ;
         standaloneModal1A81461( ) ;
         sMode1461 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1A81461( ) ;
            edtavnRcdDeleted_1461_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1461_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1461_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1461_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_LINEA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linea_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_Prod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_PROD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Prod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Prod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_Coment_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_COMENT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Coment_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Coment_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_Conc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CONC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Conc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Conc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CANT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Cant_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_UND_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Und_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtVts_maq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_MAQ_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtVts_maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_maq_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1461 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1A81461( ) ;
            }
            sendRow1A81461( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1461 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1461 = (short)(5) ;
         nRcdExists_1461 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1A81461( ) ;
            while ( RcdFound1461 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501461( ) ;
               init_level_properties1461( ) ;
               standaloneNotModal1A81461( ) ;
               getByPrimaryKey1A81461( ) ;
               standaloneModal1A81461( ) ;
               addRow1A81461( ) ;
               scanNext1A81461( ) ;
            }
            scanEnd1A81461( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1461 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501461( ) ;
      initAll1A81461( ) ;
      init_level_properties1461( ) ;
      nRcdExists_1461 = (short)(0) ;
      nIsMod_1461 = (short)(0) ;
      nRcdDeleted_1461 = (short)(0) ;
      nBlankRcdCount1461 = (short)(nBlankRcdUsr1461+nBlankRcdCount1461) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1461 > 0 )
      {
         standaloneNotModal1A81461( ) ;
         standaloneModal1A81461( ) ;
         addRow1A81461( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtVts_Linea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1461 = (short)(nBlankRcdCount1461-1) ;
      }
      Gx_mode = sMode1461 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TVTS000.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TVTS000.htm");
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
      e111A82 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z10940Vts_Nbarca = httpContext.cgiGet( "Z10940Vts_Nbarca") ;
            Z10941Vts_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "Z10941Vts_Clicod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10942Vts_Serv = (int)(localUtil.ctol( httpContext.cgiGet( "Z10942Vts_Serv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10943Vts_Form = (int)(localUtil.ctol( httpContext.cgiGet( "Z10943Vts_Form"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A10940Vts_Nbarca = httpContext.cgiGet( edtVts_Nbarca_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTS_CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_Clicod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10941Vts_Clicod = 0 ;
               n10941Vts_Clicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10941Vts_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10941Vts_Clicod), 6, 0));
            }
            else
            {
               A10941Vts_Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtVts_Clicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10941Vts_Clicod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10941Vts_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10941Vts_Clicod), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Serv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Serv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTS_SERV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_Serv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10942Vts_Serv = 0 ;
               n10942Vts_Serv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10942Vts_Serv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10942Vts_Serv), 5, 0));
            }
            else
            {
               A10942Vts_Serv = (int)(localUtil.ctol( httpContext.cgiGet( edtVts_Serv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10942Vts_Serv = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10942Vts_Serv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10942Vts_Serv), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Form_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Form_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VTS_FORM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtVts_Form_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10943Vts_Form = 0 ;
               n10943Vts_Form = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10943Vts_Form", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10943Vts_Form), 5, 0));
            }
            else
            {
               A10943Vts_Form = (int)(localUtil.ctol( httpContext.cgiGet( edtVts_Form_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10943Vts_Form = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10943Vts_Form", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10943Vts_Form), 5, 0));
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
               A10940Vts_Nbarca = httpContext.GetPar( "Vts_Nbarca") ;
               httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
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
                        e111A82 ();
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
            initAll1A81460( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1461_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1461_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1A81460( ) ;
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

   public void confirm_1A80( )
   {
      beforeValidate1A81460( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1A81460( ) ;
         }
         else
         {
            checkExtendedTable1A81460( ) ;
            if ( AnyError == 0 )
            {
               zm1A81460( 2) ;
            }
            closeExtendedTableCursors1A81460( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1460 = Gx_mode ;
         confirm_1A81461( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1460 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1460 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1A80( ) ;
      }
   }

   public void confirm_1A81461( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1A81461( ) ;
         if ( ( nRcdExists_1461 != 0 ) || ( nIsMod_1461 != 0 ) )
         {
            getKey1A81461( ) ;
            if ( ( nRcdExists_1461 == 0 ) && ( nRcdDeleted_1461 == 0 ) )
            {
               if ( RcdFound1461 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1A81461( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1A81461( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1A81461( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "VTS_LINEA_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtVts_Linea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1461 != 0 )
               {
                  if ( nRcdDeleted_1461 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1A81461( ) ;
                     load1A81461( ) ;
                     beforeValidate1A81461( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1A81461( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1461 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1A81461( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1A81461( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1A81461( ) ;
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
                  if ( nRcdDeleted_1461 == 0 )
                  {
                     GXCCtl = "VTS_LINEA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVts_Linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1461_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10944Vts_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Prod_Internalname, GXutil.rtrim( A10945Vts_Prod)) ;
         httpContext.changePostValue( edtVts_Coment_Internalname, GXutil.rtrim( A10946Vts_Coment)) ;
         httpContext.changePostValue( edtVts_Conc_Internalname, GXutil.ltrim( localUtil.ntoc( A10947Vts_Conc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10948Vts_Cant, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A10949Vts_Und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_maq_Internalname, GXutil.rtrim( A10950Vts_maq)) ;
         httpContext.changePostValue( "ZT_"+"Z10944Vts_Linea_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10944Vts_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10945Vts_Prod_"+sGXsfl_50_idx, GXutil.rtrim( Z10945Vts_Prod)) ;
         httpContext.changePostValue( "ZT_"+"Z10946Vts_Coment_"+sGXsfl_50_idx, GXutil.rtrim( Z10946Vts_Coment)) ;
         httpContext.changePostValue( "ZT_"+"Z10947Vts_Conc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10947Vts_Conc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10948Vts_Cant_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10948Vts_Cant, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10949Vts_Und_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10949Vts_Und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10950Vts_maq_"+sGXsfl_50_idx, GXutil.rtrim( Z10950Vts_maq)) ;
         httpContext.changePostValue( "nRcdDeleted_1461_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1461_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1461_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1461 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1461_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1461_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_LINEA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_PROD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_COMENT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Coment_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CONC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Conc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CANT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_UND_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_MAQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_maq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1A80( )
   {
   }

   public void e111A82( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tvts000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tvts000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tvts000_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tvts000_impl.this.A396EmprCod = GXv_char2[0] ;
      tvts000_impl.this.AV11EmprNom = GXv_char3[0] ;
      tvts000_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1A81460( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10941Vts_Clicod = T01A85_A10941Vts_Clicod[0] ;
            Z10942Vts_Serv = T01A85_A10942Vts_Serv[0] ;
            Z10943Vts_Form = T01A85_A10943Vts_Form[0] ;
         }
         else
         {
            Z10941Vts_Clicod = A10941Vts_Clicod ;
            Z10942Vts_Serv = A10942Vts_Serv ;
            Z10943Vts_Form = A10943Vts_Form ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z10941Vts_Clicod = A10941Vts_Clicod ;
         Z10942Vts_Serv = A10942Vts_Serv ;
         Z10943Vts_Form = A10943Vts_Form ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TVTS000" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01A86 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01A86_A407EmprNom[0] ;
      n407EmprNom = T01A86_n407EmprNom[0] ;
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

   public void load1A81460( )
   {
      /* Using cursor T01A87 */
      pr_default.execute(5, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1460 = (short)(1) ;
         A407EmprNom = T01A87_A407EmprNom[0] ;
         n407EmprNom = T01A87_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A10941Vts_Clicod = T01A87_A10941Vts_Clicod[0] ;
         n10941Vts_Clicod = T01A87_n10941Vts_Clicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10941Vts_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10941Vts_Clicod), 6, 0));
         A10942Vts_Serv = T01A87_A10942Vts_Serv[0] ;
         n10942Vts_Serv = T01A87_n10942Vts_Serv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10942Vts_Serv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10942Vts_Serv), 5, 0));
         A10943Vts_Form = T01A87_A10943Vts_Form[0] ;
         n10943Vts_Form = T01A87_n10943Vts_Form[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10943Vts_Form", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10943Vts_Form), 5, 0));
         zm1A81460( -1) ;
      }
      pr_default.close(5);
      onLoadActions1A81460( ) ;
   }

   public void onLoadActions1A81460( )
   {
   }

   public void checkExtendedTable1A81460( )
   {
      nIsDirty_1460 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1A81460( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1A81460( )
   {
      /* Using cursor T01A88 */
      pr_default.execute(6, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound1460 = (short)(1) ;
      }
      else
      {
         RcdFound1460 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01A85 */
      pr_default.execute(3, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01A85_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1A81460( 1) ;
         RcdFound1460 = (short)(1) ;
         A10940Vts_Nbarca = T01A85_A10940Vts_Nbarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         A10941Vts_Clicod = T01A85_A10941Vts_Clicod[0] ;
         n10941Vts_Clicod = T01A85_n10941Vts_Clicod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10941Vts_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10941Vts_Clicod), 6, 0));
         A10942Vts_Serv = T01A85_A10942Vts_Serv[0] ;
         n10942Vts_Serv = T01A85_n10942Vts_Serv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10942Vts_Serv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10942Vts_Serv), 5, 0));
         A10943Vts_Form = T01A85_A10943Vts_Form[0] ;
         n10943Vts_Form = T01A85_n10943Vts_Form[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10943Vts_Form", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10943Vts_Form), 5, 0));
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         sMode1460 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1A81460( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1460 = (short)(0) ;
            initializeNonKey1A81460( ) ;
         }
         Gx_mode = sMode1460 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1460 = (short)(0) ;
         initializeNonKey1A81460( ) ;
         sMode1460 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1460 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1A81460( ) ;
      if ( RcdFound1460 == 0 )
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
      RcdFound1460 = (short)(0) ;
      /* Using cursor T01A89 */
      pr_default.execute(7, new Object[] {A10940Vts_Nbarca, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01A89_A10940Vts_Nbarca[0], A10940Vts_Nbarca) < 0 ) ) && ( GXutil.strcmp(T01A89_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01A89_A10940Vts_Nbarca[0], A10940Vts_Nbarca) > 0 ) ) && ( GXutil.strcmp(T01A89_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10940Vts_Nbarca = T01A89_A10940Vts_Nbarca[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            RcdFound1460 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound1460 = (short)(0) ;
      /* Using cursor T01A810 */
      pr_default.execute(8, new Object[] {A10940Vts_Nbarca, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01A810_A10940Vts_Nbarca[0], A10940Vts_Nbarca) > 0 ) ) && ( GXutil.strcmp(T01A810_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01A810_A10940Vts_Nbarca[0], A10940Vts_Nbarca) < 0 ) ) && ( GXutil.strcmp(T01A810_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A10940Vts_Nbarca = T01A810_A10940Vts_Nbarca[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
            RcdFound1460 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1A81460( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtVts_Nbarca_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1A81460( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1460 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) )
            {
               A10940Vts_Nbarca = Z10940Vts_Nbarca ;
               httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtVts_Nbarca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1A81460( ) ;
               GX_FocusControl = edtVts_Nbarca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtVts_Nbarca_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1A81460( ) ;
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
                  GX_FocusControl = edtVts_Nbarca_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1A81460( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) )
      {
         A10940Vts_Nbarca = Z10940Vts_Nbarca ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtVts_Nbarca_Internalname ;
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
      getKey1A81460( ) ;
      if ( RcdFound1460 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) )
         {
            A10940Vts_Nbarca = Z10940Vts_Nbarca ;
            httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A10940Vts_Nbarca, Z10940Vts_Nbarca) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tvts000");
      GX_FocusControl = edtVts_Clicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1A80( ) ;
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
      if ( RcdFound1460 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtVts_Clicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1A81460( ) ;
      if ( RcdFound1460 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_Clicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A81460( ) ;
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
      if ( RcdFound1460 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_Clicod_Internalname ;
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
      if ( RcdFound1460 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_Clicod_Internalname ;
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
      scanStart1A81460( ) ;
      if ( RcdFound1460 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1460 != 0 )
         {
            scanNext1A81460( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtVts_Clicod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A81460( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1A81460( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01A84 */
         pr_default.execute(2, new Object[] {A396EmprCod, A10940Vts_Nbarca});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS000"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z10941Vts_Clicod != T01A84_A10941Vts_Clicod[0] ) || ( Z10942Vts_Serv != T01A84_A10942Vts_Serv[0] ) || ( Z10943Vts_Form != T01A84_A10943Vts_Form[0] ) )
         {
            if ( Z10941Vts_Clicod != T01A84_A10941Vts_Clicod[0] )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Clicod");
               GXutil.writeLogRaw("Old: ",Z10941Vts_Clicod);
               GXutil.writeLogRaw("Current: ",T01A84_A10941Vts_Clicod[0]);
            }
            if ( Z10942Vts_Serv != T01A84_A10942Vts_Serv[0] )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Serv");
               GXutil.writeLogRaw("Old: ",Z10942Vts_Serv);
               GXutil.writeLogRaw("Current: ",T01A84_A10942Vts_Serv[0]);
            }
            if ( Z10943Vts_Form != T01A84_A10943Vts_Form[0] )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Form");
               GXutil.writeLogRaw("Old: ",Z10943Vts_Form);
               GXutil.writeLogRaw("Current: ",T01A84_A10943Vts_Form[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPVTS000"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A81460( )
   {
      beforeValidate1A81460( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A81460( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A81460( 0) ;
         checkOptimisticConcurrency1A81460( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A81460( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A81460( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A811 */
                  pr_default.execute(9, new Object[] {A10940Vts_Nbarca, Boolean.valueOf(n10941Vts_Clicod), Integer.valueOf(A10941Vts_Clicod), Boolean.valueOf(n10942Vts_Serv), Integer.valueOf(A10942Vts_Serv), Boolean.valueOf(n10943Vts_Form), Integer.valueOf(A10943Vts_Form), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS000");
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
                        processLevel1A81460( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1A80( ) ;
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
            load1A81460( ) ;
         }
         endLevel1A81460( ) ;
      }
      closeExtendedTableCursors1A81460( ) ;
   }

   public void update1A81460( )
   {
      beforeValidate1A81460( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A81460( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A81460( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A81460( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A81460( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A812 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n10941Vts_Clicod), Integer.valueOf(A10941Vts_Clicod), Boolean.valueOf(n10942Vts_Serv), Integer.valueOf(A10942Vts_Serv), Boolean.valueOf(n10943Vts_Form), Integer.valueOf(A10943Vts_Form), A396EmprCod, A10940Vts_Nbarca});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS000");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS000"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A81460( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1A81460( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1A80( ) ;
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
         endLevel1A81460( ) ;
      }
      closeExtendedTableCursors1A81460( ) ;
   }

   public void deferredUpdate1A81460( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A81460( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A81460( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A81460( ) ;
         afterConfirm1A81460( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A81460( ) ;
            if ( AnyError == 0 )
            {
               scanStart1A81461( ) ;
               while ( RcdFound1461 != 0 )
               {
                  getByPrimaryKey1A81461( ) ;
                  delete1A81461( ) ;
                  scanNext1A81461( ) ;
               }
               scanEnd1A81461( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A813 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A10940Vts_Nbarca});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS000");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1460 == 0 )
                        {
                           initAll1A81460( ) ;
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
                        resetCaption1A80( ) ;
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
      sMode1460 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A81460( ) ;
      Gx_mode = sMode1460 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A81460( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01A814 */
         pr_default.execute(12, new Object[] {A396EmprCod, A10940Vts_Nbarca});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGISTRO 80y81", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void processNestedLevel1A81461( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1A81461( ) ;
         if ( ( nRcdExists_1461 != 0 ) || ( nIsMod_1461 != 0 ) )
         {
            standaloneNotModal1A81461( ) ;
            getKey1A81461( ) ;
            if ( ( nRcdExists_1461 == 0 ) && ( nRcdDeleted_1461 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1A81461( ) ;
            }
            else
            {
               if ( RcdFound1461 != 0 )
               {
                  if ( ( nRcdDeleted_1461 != 0 ) && ( nRcdExists_1461 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1A81461( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1461 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1A81461( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1461 == 0 )
                  {
                     GXCCtl = "VTS_LINEA_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtVts_Linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1461_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A10944Vts_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Prod_Internalname, GXutil.rtrim( A10945Vts_Prod)) ;
         httpContext.changePostValue( edtVts_Coment_Internalname, GXutil.rtrim( A10946Vts_Coment)) ;
         httpContext.changePostValue( edtVts_Conc_Internalname, GXutil.ltrim( localUtil.ntoc( A10947Vts_Conc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A10948Vts_Cant, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_Und_Internalname, GXutil.ltrim( localUtil.ntoc( A10949Vts_Und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtVts_maq_Internalname, GXutil.rtrim( A10950Vts_maq)) ;
         httpContext.changePostValue( "ZT_"+"Z10944Vts_Linea_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10944Vts_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10945Vts_Prod_"+sGXsfl_50_idx, GXutil.rtrim( Z10945Vts_Prod)) ;
         httpContext.changePostValue( "ZT_"+"Z10946Vts_Coment_"+sGXsfl_50_idx, GXutil.rtrim( Z10946Vts_Coment)) ;
         httpContext.changePostValue( "ZT_"+"Z10947Vts_Conc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10947Vts_Conc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10948Vts_Cant_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10948Vts_Cant, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10949Vts_Und_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z10949Vts_Und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10950Vts_maq_"+sGXsfl_50_idx, GXutil.rtrim( Z10950Vts_maq)) ;
         httpContext.changePostValue( "nRcdDeleted_1461_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1461_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1461_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1461 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1461_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1461_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_LINEA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_PROD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_COMENT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Coment_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CONC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Conc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_CANT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_UND_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Und_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "VTS_MAQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_maq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1A81461( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1461 = (short)(0) ;
      nIsMod_1461 = (short)(0) ;
      nRcdDeleted_1461 = (short)(0) ;
   }

   public void processLevel1A81460( )
   {
      /* Save parent mode. */
      sMode1460 = Gx_mode ;
      processNestedLevel1A81461( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1460 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1A81460( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A81460( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tvts000");
         if ( AnyError == 0 )
         {
            confirmValues1A80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tvts000");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1A81460( )
   {
      /* Scan By routine */
      /* Using cursor T01A815 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound1460 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1460 = (short)(1) ;
         A10940Vts_Nbarca = T01A815_A10940Vts_Nbarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A81460( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound1460 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound1460 = (short)(1) ;
         A10940Vts_Nbarca = T01A815_A10940Vts_Nbarca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
      }
   }

   public void scanEnd1A81460( )
   {
      pr_default.close(13);
   }

   public void afterConfirm1A81460( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A81460( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A81460( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A81460( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A81460( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A81460( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A81460( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtVts_Nbarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Nbarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Nbarca_Enabled), 5, 0), true);
      edtVts_Clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Clicod_Enabled), 5, 0), true);
      edtVts_Serv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Serv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Serv_Enabled), 5, 0), true);
      edtVts_Form_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Form_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Form_Enabled), 5, 0), true);
   }

   public void zm1A81461( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z10945Vts_Prod = T01A83_A10945Vts_Prod[0] ;
            Z10946Vts_Coment = T01A83_A10946Vts_Coment[0] ;
            Z10947Vts_Conc = T01A83_A10947Vts_Conc[0] ;
            Z10948Vts_Cant = T01A83_A10948Vts_Cant[0] ;
            Z10949Vts_Und = T01A83_A10949Vts_Und[0] ;
            Z10950Vts_maq = T01A83_A10950Vts_maq[0] ;
         }
         else
         {
            Z10945Vts_Prod = A10945Vts_Prod ;
            Z10946Vts_Coment = A10946Vts_Coment ;
            Z10947Vts_Conc = A10947Vts_Conc ;
            Z10948Vts_Cant = A10948Vts_Cant ;
            Z10949Vts_Und = A10949Vts_Und ;
            Z10950Vts_maq = A10950Vts_maq ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z10944Vts_Linea = A10944Vts_Linea ;
         Z10945Vts_Prod = A10945Vts_Prod ;
         Z10946Vts_Coment = A10946Vts_Coment ;
         Z10947Vts_Conc = A10947Vts_Conc ;
         Z10948Vts_Cant = A10948Vts_Cant ;
         Z10949Vts_Und = A10949Vts_Und ;
         Z10950Vts_maq = A10950Vts_maq ;
      }
   }

   public void standaloneNotModal1A81461( )
   {
   }

   public void standaloneModal1A81461( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtVts_Linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVts_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linea_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtVts_Linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtVts_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linea_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1A81461( )
   {
      /* Using cursor T01A816 */
      pr_default.execute(14, new Object[] {A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound1461 = (short)(1) ;
         A10945Vts_Prod = T01A816_A10945Vts_Prod[0] ;
         n10945Vts_Prod = T01A816_n10945Vts_Prod[0] ;
         A10946Vts_Coment = T01A816_A10946Vts_Coment[0] ;
         n10946Vts_Coment = T01A816_n10946Vts_Coment[0] ;
         A10947Vts_Conc = T01A816_A10947Vts_Conc[0] ;
         n10947Vts_Conc = T01A816_n10947Vts_Conc[0] ;
         A10948Vts_Cant = T01A816_A10948Vts_Cant[0] ;
         n10948Vts_Cant = T01A816_n10948Vts_Cant[0] ;
         A10949Vts_Und = T01A816_A10949Vts_Und[0] ;
         n10949Vts_Und = T01A816_n10949Vts_Und[0] ;
         A10950Vts_maq = T01A816_A10950Vts_maq[0] ;
         n10950Vts_maq = T01A816_n10950Vts_maq[0] ;
         zm1A81461( -3) ;
      }
      pr_default.close(14);
      onLoadActions1A81461( ) ;
   }

   public void onLoadActions1A81461( )
   {
   }

   public void checkExtendedTable1A81461( )
   {
      nIsDirty_1461 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1A81461( ) ;
   }

   public void closeExtendedTableCursors1A81461( )
   {
   }

   public void enableDisable1A81461( )
   {
   }

   public void getKey1A81461( )
   {
      /* Using cursor T01A817 */
      pr_default.execute(15, new Object[] {A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1461 = (short)(1) ;
      }
      else
      {
         RcdFound1461 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey1A81461( )
   {
      /* Using cursor T01A83 */
      pr_default.execute(1, new Object[] {A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01A83_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1A81461( 3) ;
         RcdFound1461 = (short)(1) ;
         initializeNonKey1A81461( ) ;
         A10944Vts_Linea = T01A83_A10944Vts_Linea[0] ;
         A10945Vts_Prod = T01A83_A10945Vts_Prod[0] ;
         n10945Vts_Prod = T01A83_n10945Vts_Prod[0] ;
         A10946Vts_Coment = T01A83_A10946Vts_Coment[0] ;
         n10946Vts_Coment = T01A83_n10946Vts_Coment[0] ;
         A10947Vts_Conc = T01A83_A10947Vts_Conc[0] ;
         n10947Vts_Conc = T01A83_n10947Vts_Conc[0] ;
         A10948Vts_Cant = T01A83_A10948Vts_Cant[0] ;
         n10948Vts_Cant = T01A83_n10948Vts_Cant[0] ;
         A10949Vts_Und = T01A83_A10949Vts_Und[0] ;
         n10949Vts_Und = T01A83_n10949Vts_Und[0] ;
         A10950Vts_maq = T01A83_A10950Vts_maq[0] ;
         n10950Vts_maq = T01A83_n10950Vts_maq[0] ;
         Z396EmprCod = A396EmprCod ;
         Z10940Vts_Nbarca = A10940Vts_Nbarca ;
         Z10944Vts_Linea = A10944Vts_Linea ;
         sMode1461 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1A81461( ) ;
         load1A81461( ) ;
         Gx_mode = sMode1461 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1461 = (short)(0) ;
         initializeNonKey1A81461( ) ;
         sMode1461 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1A81461( ) ;
         Gx_mode = sMode1461 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1A81461( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1A81461( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01A82 */
         pr_default.execute(0, new Object[] {A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS001"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z10945Vts_Prod, T01A82_A10945Vts_Prod[0]) != 0 ) || ( GXutil.strcmp(Z10946Vts_Coment, T01A82_A10946Vts_Coment[0]) != 0 ) || ( DecimalUtil.compareTo(Z10947Vts_Conc, T01A82_A10947Vts_Conc[0]) != 0 ) || ( DecimalUtil.compareTo(Z10948Vts_Cant, T01A82_A10948Vts_Cant[0]) != 0 ) || ( Z10949Vts_Und != T01A82_A10949Vts_Und[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10950Vts_maq, T01A82_A10950Vts_maq[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z10945Vts_Prod, T01A82_A10945Vts_Prod[0]) != 0 )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Prod");
               GXutil.writeLogRaw("Old: ",Z10945Vts_Prod);
               GXutil.writeLogRaw("Current: ",T01A82_A10945Vts_Prod[0]);
            }
            if ( GXutil.strcmp(Z10946Vts_Coment, T01A82_A10946Vts_Coment[0]) != 0 )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Coment");
               GXutil.writeLogRaw("Old: ",Z10946Vts_Coment);
               GXutil.writeLogRaw("Current: ",T01A82_A10946Vts_Coment[0]);
            }
            if ( DecimalUtil.compareTo(Z10947Vts_Conc, T01A82_A10947Vts_Conc[0]) != 0 )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Conc");
               GXutil.writeLogRaw("Old: ",Z10947Vts_Conc);
               GXutil.writeLogRaw("Current: ",T01A82_A10947Vts_Conc[0]);
            }
            if ( DecimalUtil.compareTo(Z10948Vts_Cant, T01A82_A10948Vts_Cant[0]) != 0 )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Cant");
               GXutil.writeLogRaw("Old: ",Z10948Vts_Cant);
               GXutil.writeLogRaw("Current: ",T01A82_A10948Vts_Cant[0]);
            }
            if ( Z10949Vts_Und != T01A82_A10949Vts_Und[0] )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_Und");
               GXutil.writeLogRaw("Old: ",Z10949Vts_Und);
               GXutil.writeLogRaw("Current: ",T01A82_A10949Vts_Und[0]);
            }
            if ( GXutil.strcmp(Z10950Vts_maq, T01A82_A10950Vts_maq[0]) != 0 )
            {
               GXutil.writeLogln("tvts000:[seudo value changed for attri]"+"Vts_maq");
               GXutil.writeLogRaw("Old: ",Z10950Vts_maq);
               GXutil.writeLogRaw("Current: ",T01A82_A10950Vts_maq[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPVTS001"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A81461( )
   {
      beforeValidate1A81461( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A81461( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A81461( 0) ;
         checkOptimisticConcurrency1A81461( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A81461( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A81461( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01A818 */
                  pr_default.execute(16, new Object[] {A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea), Boolean.valueOf(n10945Vts_Prod), A10945Vts_Prod, Boolean.valueOf(n10946Vts_Coment), A10946Vts_Coment, Boolean.valueOf(n10947Vts_Conc), A10947Vts_Conc, Boolean.valueOf(n10948Vts_Cant), A10948Vts_Cant, Boolean.valueOf(n10949Vts_Und), Byte.valueOf(A10949Vts_Und), Boolean.valueOf(n10950Vts_maq), A10950Vts_maq});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS001");
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
            load1A81461( ) ;
         }
         endLevel1A81461( ) ;
      }
      closeExtendedTableCursors1A81461( ) ;
   }

   public void update1A81461( )
   {
      beforeValidate1A81461( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A81461( ) ;
      }
      if ( ( nIsMod_1461 != 0 ) || ( nIsDirty_1461 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1A81461( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1A81461( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1A81461( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01A819 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n10945Vts_Prod), A10945Vts_Prod, Boolean.valueOf(n10946Vts_Coment), A10946Vts_Coment, Boolean.valueOf(n10947Vts_Conc), A10947Vts_Conc, Boolean.valueOf(n10948Vts_Cant), A10948Vts_Cant, Boolean.valueOf(n10949Vts_Und), Byte.valueOf(A10949Vts_Und), Boolean.valueOf(n10950Vts_maq), A10950Vts_maq, A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS001");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPVTS001"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1A81461( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1A81461( ) ;
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
            endLevel1A81461( ) ;
         }
      }
      closeExtendedTableCursors1A81461( ) ;
   }

   public void deferredUpdate1A81461( )
   {
   }

   public void delete1A81461( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A81461( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A81461( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A81461( ) ;
         afterConfirm1A81461( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A81461( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01A820 */
               pr_default.execute(18, new Object[] {A396EmprCod, A10940Vts_Nbarca, Short.valueOf(A10944Vts_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPVTS001");
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
      sMode1461 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A81461( ) ;
      Gx_mode = sMode1461 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A81461( )
   {
      standaloneModal1A81461( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1A81461( )
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

   public void scanStart1A81461( )
   {
      /* Scan By routine */
      /* Using cursor T01A821 */
      pr_default.execute(19, new Object[] {A396EmprCod, A10940Vts_Nbarca});
      RcdFound1461 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1461 = (short)(1) ;
         A10944Vts_Linea = T01A821_A10944Vts_Linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A81461( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound1461 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1461 = (short)(1) ;
         A10944Vts_Linea = T01A821_A10944Vts_Linea[0] ;
      }
   }

   public void scanEnd1A81461( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1A81461( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A81461( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A81461( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A81461( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A81461( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A81461( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A81461( )
   {
      edtVts_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linea_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtVts_Prod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Prod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Prod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtVts_Coment_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Coment_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Coment_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtVts_Conc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Conc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Conc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtVts_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Cant_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtVts_Und_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Und_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Und_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtVts_maq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_maq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_maq_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1A81461( )
   {
   }

   public void send_integrity_lvl_hashes1A81460( )
   {
   }

   public void subsflControlProps_501461( )
   {
      edtavnRcdDeleted_1461_Internalname = "vNRCDDELETED_1461_"+sGXsfl_50_idx ;
      edtVts_Linea_Internalname = "VTS_LINEA_"+sGXsfl_50_idx ;
      edtVts_Prod_Internalname = "VTS_PROD_"+sGXsfl_50_idx ;
      edtVts_Coment_Internalname = "VTS_COMENT_"+sGXsfl_50_idx ;
      edtVts_Conc_Internalname = "VTS_CONC_"+sGXsfl_50_idx ;
      edtVts_Cant_Internalname = "VTS_CANT_"+sGXsfl_50_idx ;
      edtVts_Und_Internalname = "VTS_UND_"+sGXsfl_50_idx ;
      edtVts_maq_Internalname = "VTS_MAQ_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501461( )
   {
      edtavnRcdDeleted_1461_Internalname = "vNRCDDELETED_1461_"+sGXsfl_50_fel_idx ;
      edtVts_Linea_Internalname = "VTS_LINEA_"+sGXsfl_50_fel_idx ;
      edtVts_Prod_Internalname = "VTS_PROD_"+sGXsfl_50_fel_idx ;
      edtVts_Coment_Internalname = "VTS_COMENT_"+sGXsfl_50_fel_idx ;
      edtVts_Conc_Internalname = "VTS_CONC_"+sGXsfl_50_fel_idx ;
      edtVts_Cant_Internalname = "VTS_CANT_"+sGXsfl_50_fel_idx ;
      edtVts_Und_Internalname = "VTS_UND_"+sGXsfl_50_fel_idx ;
      edtVts_maq_Internalname = "VTS_MAQ_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1A81461( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501461( ) ;
      sendRow1A81461( ) ;
   }

   public void sendRow1A81461( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1461_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1461_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1461), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1461), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1461_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1461_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A10944Vts_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10944Vts_Linea), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Linea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Prod_Internalname,GXutil.rtrim( A10945Vts_Prod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Prod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Prod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Coment_Internalname,GXutil.rtrim( A10946Vts_Coment),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Coment_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Coment_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(45),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Conc_Internalname,GXutil.ltrim( localUtil.ntoc( A10947Vts_Conc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Conc_Enabled!=0) ? localUtil.format( A10947Vts_Conc, "ZZZZ9.99999") : localUtil.format( A10947Vts_Conc, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Conc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Conc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A10948Vts_Cant, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Cant_Enabled!=0) ? localUtil.format( A10948Vts_Cant, "ZZZZZZ9.99999") : localUtil.format( A10948Vts_Cant, "ZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Cant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Cant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_Und_Internalname,GXutil.ltrim( localUtil.ntoc( A10949Vts_Und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtVts_Und_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10949Vts_Und), "9") : localUtil.format( DecimalUtil.doubleToDec(A10949Vts_Und), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_Und_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_Und_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1461_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtVts_maq_Internalname,GXutil.rtrim( A10950Vts_maq),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtVts_maq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtVts_maq_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1A81461( ) ;
      GXCCtl = "Z10944Vts_Linea_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10944Vts_Linea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10945Vts_Prod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10945Vts_Prod));
      GXCCtl = "Z10946Vts_Coment_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10946Vts_Coment));
      GXCCtl = "Z10947Vts_Conc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10947Vts_Conc, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10948Vts_Cant_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10948Vts_Cant, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10949Vts_Und_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10949Vts_Und, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10950Vts_maq_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10950Vts_maq));
      GXCCtl = "nRcdDeleted_1461_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1461_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1461_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1461, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1461_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1461_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_LINEA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_PROD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_COMENT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Coment_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_CONC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Conc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_CANT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_UND_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VTS_MAQ_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_maq_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1A81461( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501461( ) ;
      edtavnRcdDeleted_1461_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1461_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_LINEA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Prod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_PROD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Coment_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_COMENT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Conc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CONC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_CANT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_Und_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_UND_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtVts_maq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "VTS_MAQ_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1461_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1461_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1461");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1461_Internalname ;
         wbErr = true ;
         nRcdDeleted_1461 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1461 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1461_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "VTS_LINEA_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Linea_Internalname ;
         wbErr = true ;
         A10944Vts_Linea = (short)(0) ;
      }
      else
      {
         A10944Vts_Linea = (short)(localUtil.ctol( httpContext.cgiGet( edtVts_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A10945Vts_Prod = httpContext.cgiGet( edtVts_Prod_Internalname) ;
      n10945Vts_Prod = false ;
      A10946Vts_Coment = httpContext.cgiGet( edtVts_Coment_Internalname) ;
      n10946Vts_Coment = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVts_Conc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVts_Conc_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "VTS_CONC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Conc_Internalname ;
         wbErr = true ;
         A10947Vts_Conc = DecimalUtil.ZERO ;
         n10947Vts_Conc = false ;
      }
      else
      {
         A10947Vts_Conc = localUtil.ctond( httpContext.cgiGet( edtVts_Conc_Internalname)) ;
         n10947Vts_Conc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtVts_Cant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtVts_Cant_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
      {
         GXCCtl = "VTS_CANT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Cant_Internalname ;
         wbErr = true ;
         A10948Vts_Cant = DecimalUtil.ZERO ;
         n10948Vts_Cant = false ;
      }
      else
      {
         A10948Vts_Cant = localUtil.ctond( httpContext.cgiGet( edtVts_Cant_Internalname)) ;
         n10948Vts_Cant = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtVts_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "VTS_UND_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtVts_Und_Internalname ;
         wbErr = true ;
         A10949Vts_Und = (byte)(0) ;
         n10949Vts_Und = false ;
      }
      else
      {
         A10949Vts_Und = (byte)(localUtil.ctol( httpContext.cgiGet( edtVts_Und_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10949Vts_Und = false ;
      }
      A10950Vts_maq = httpContext.cgiGet( edtVts_maq_Internalname) ;
      n10950Vts_maq = false ;
      GXCCtl = "Z10944Vts_Linea_" + sGXsfl_50_idx ;
      Z10944Vts_Linea = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10945Vts_Prod_" + sGXsfl_50_idx ;
      Z10945Vts_Prod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10946Vts_Coment_" + sGXsfl_50_idx ;
      Z10946Vts_Coment = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10947Vts_Conc_" + sGXsfl_50_idx ;
      Z10947Vts_Conc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10948Vts_Cant_" + sGXsfl_50_idx ;
      Z10948Vts_Cant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10949Vts_Und_" + sGXsfl_50_idx ;
      Z10949Vts_Und = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10950Vts_maq_" + sGXsfl_50_idx ;
      Z10950Vts_maq = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1461_" + sGXsfl_50_idx ;
      nRcdDeleted_1461 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1461_" + sGXsfl_50_idx ;
      nRcdExists_1461 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1461_" + sGXsfl_50_idx ;
      nIsMod_1461 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtVts_Linea_Enabled = edtVts_Linea_Enabled ;
   }

   public void confirmValues1A80( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501461( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501461( ) ;
         httpContext.changePostValue( "Z10944Vts_Linea_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10944Vts_Linea_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10944Vts_Linea_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10945Vts_Prod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10945Vts_Prod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10945Vts_Prod_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10946Vts_Coment_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10946Vts_Coment_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10946Vts_Coment_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10947Vts_Conc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10947Vts_Conc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10947Vts_Conc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10948Vts_Cant_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10948Vts_Cant_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10948Vts_Cant_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10949Vts_Und_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10949Vts_Und_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10949Vts_Und_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z10950Vts_maq_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z10950Vts_maq_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10950Vts_maq_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tvts000", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z10940Vts_Nbarca", GXutil.rtrim( Z10940Vts_Nbarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10941Vts_Clicod", GXutil.ltrim( localUtil.ntoc( Z10941Vts_Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10942Vts_Serv", GXutil.ltrim( localUtil.ntoc( Z10942Vts_Serv, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10943Vts_Form", GXutil.ltrim( localUtil.ntoc( Z10943Vts_Form, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tvts000", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TVTS000" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "REGISTRO 79", "") ;
   }

   public void initializeNonKey1A81460( )
   {
      A10941Vts_Clicod = 0 ;
      n10941Vts_Clicod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10941Vts_Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10941Vts_Clicod), 6, 0));
      A10942Vts_Serv = 0 ;
      n10942Vts_Serv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10942Vts_Serv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10942Vts_Serv), 5, 0));
      A10943Vts_Form = 0 ;
      n10943Vts_Form = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10943Vts_Form", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10943Vts_Form), 5, 0));
      Z10941Vts_Clicod = 0 ;
      Z10942Vts_Serv = 0 ;
      Z10943Vts_Form = 0 ;
   }

   public void initAll1A81460( )
   {
      A10940Vts_Nbarca = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10940Vts_Nbarca", A10940Vts_Nbarca);
      initializeNonKey1A81460( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1A81461( )
   {
      A10945Vts_Prod = "" ;
      n10945Vts_Prod = false ;
      A10946Vts_Coment = "" ;
      n10946Vts_Coment = false ;
      A10947Vts_Conc = DecimalUtil.ZERO ;
      n10947Vts_Conc = false ;
      A10948Vts_Cant = DecimalUtil.ZERO ;
      n10948Vts_Cant = false ;
      A10949Vts_Und = (byte)(0) ;
      n10949Vts_Und = false ;
      A10950Vts_maq = "" ;
      n10950Vts_maq = false ;
      Z10945Vts_Prod = "" ;
      Z10946Vts_Coment = "" ;
      Z10947Vts_Conc = DecimalUtil.ZERO ;
      Z10948Vts_Cant = DecimalUtil.ZERO ;
      Z10949Vts_Und = (byte)(0) ;
      Z10950Vts_maq = "" ;
   }

   public void initAll1A81461( )
   {
      A10944Vts_Linea = (short)(0) ;
      initializeNonKey1A81461( ) ;
   }

   public void standaloneModalInsert1A81461( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241561167", true, true);
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
      httpContext.AddJavascriptSource("tvts000.js", "?20268241561167", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1461( )
   {
      edtVts_Linea_Enabled = defedtVts_Linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtVts_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtVts_Linea_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1461, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1461_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10944Vts_Linea, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10945Vts_Prod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Prod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10946Vts_Coment));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Coment_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10947Vts_Conc, (byte)(11), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Conc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10948Vts_Cant, (byte)(13), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10949Vts_Und, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_Und_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A10950Vts_maq));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtVts_maq_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtVts_Nbarca_Internalname = "VTS_NBARCA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtVts_Clicod_Internalname = "VTS_CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtVts_Serv_Internalname = "VTS_SERV" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtVts_Form_Internalname = "VTS_FORM" ;
      edtavnRcdDeleted_1461_Internalname = "vNRCDDELETED_1461" ;
      edtVts_Linea_Internalname = "VTS_LINEA" ;
      edtVts_Prod_Internalname = "VTS_PROD" ;
      edtVts_Coment_Internalname = "VTS_COMENT" ;
      edtVts_Conc_Internalname = "VTS_CONC" ;
      edtVts_Cant_Internalname = "VTS_CANT" ;
      edtVts_Und_Internalname = "VTS_UND" ;
      edtVts_maq_Internalname = "VTS_MAQ" ;
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
      Form.setCaption( httpContext.getMessage( "REGISTRO 79", "") );
      edtVts_maq_Jsonclick = "" ;
      edtVts_Und_Jsonclick = "" ;
      edtVts_Cant_Jsonclick = "" ;
      edtVts_Conc_Jsonclick = "" ;
      edtVts_Coment_Jsonclick = "" ;
      edtVts_Prod_Jsonclick = "" ;
      edtVts_Linea_Jsonclick = "" ;
      edtavnRcdDeleted_1461_Jsonclick = "" ;
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
      edtVts_maq_Enabled = 1 ;
      edtVts_Und_Enabled = 1 ;
      edtVts_Cant_Enabled = 1 ;
      edtVts_Conc_Enabled = 1 ;
      edtVts_Coment_Enabled = 1 ;
      edtVts_Prod_Enabled = 1 ;
      edtVts_Linea_Enabled = 1 ;
      edtavnRcdDeleted_1461_Enabled = 1 ;
      edtVts_Form_Jsonclick = "" ;
      edtVts_Form_Backcolor = (int)(0xFFFFFF) ;
      edtVts_Form_Enabled = 1 ;
      edtVts_Serv_Jsonclick = "" ;
      edtVts_Serv_Backcolor = (int)(0xFFFFFF) ;
      edtVts_Serv_Enabled = 1 ;
      edtVts_Clicod_Jsonclick = "" ;
      edtVts_Clicod_Backcolor = (int)(0xFFFFFF) ;
      edtVts_Clicod_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtVts_Nbarca_Jsonclick = "" ;
      edtVts_Nbarca_Backcolor = (int)(0xFFFFFF) ;
      edtVts_Nbarca_Enabled = 1 ;
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
      subsflControlProps_501461( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1A81461( ) ;
         standaloneModal1A81461( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1A81461( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501461( ) ;
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
      /* Using cursor T01A822 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01A822_A407EmprNom[0] ;
      n407EmprNom = T01A822_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      GX_FocusControl = edtVts_Clicod_Internalname ;
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

   public void valid_Vts_nbarca( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10941Vts_Clicod", GXutil.ltrim( localUtil.ntoc( A10941Vts_Clicod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10942Vts_Serv", GXutil.ltrim( localUtil.ntoc( A10942Vts_Serv, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10943Vts_Form", GXutil.ltrim( localUtil.ntoc( A10943Vts_Form, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10940Vts_Nbarca", GXutil.rtrim( Z10940Vts_Nbarca));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10941Vts_Clicod", GXutil.ltrim( localUtil.ntoc( Z10941Vts_Clicod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10942Vts_Serv", GXutil.ltrim( localUtil.ntoc( Z10942Vts_Serv, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10943Vts_Form", GXutil.ltrim( localUtil.ntoc( Z10943Vts_Form, (byte)(5), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_VTS_NBARCA","{handler:'valid_Vts_nbarca',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A10940Vts_Nbarca',fld:'VTS_NBARCA',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_VTS_NBARCA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A10941Vts_Clicod',fld:'VTS_CLICOD',pic:'ZZZZZ9'},{av:'A10942Vts_Serv',fld:'VTS_SERV',pic:'ZZZZ9'},{av:'A10943Vts_Form',fld:'VTS_FORM',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z10940Vts_Nbarca'},{av:'Z407EmprNom'},{av:'Z10941Vts_Clicod'},{av:'Z10942Vts_Serv'},{av:'Z10943Vts_Form'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_VTS_LINEA","{handler:'valid_Vts_linea',iparms:[]");
      setEventMetadata("VALID_VTS_LINEA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Vts_maq',iparms:[]");
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
      pr_default.close(20);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z10940Vts_Nbarca = "" ;
      Z10945Vts_Prod = "" ;
      Z10946Vts_Coment = "" ;
      Z10947Vts_Conc = DecimalUtil.ZERO ;
      Z10948Vts_Cant = DecimalUtil.ZERO ;
      Z10950Vts_maq = "" ;
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
      A407EmprNom = "" ;
      lblTextblock3_Jsonclick = "" ;
      A10940Vts_Nbarca = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1461 = "" ;
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
      sMode1460 = "" ;
      GXCCtl = "" ;
      A10945Vts_Prod = "" ;
      A10946Vts_Coment = "" ;
      A10947Vts_Conc = DecimalUtil.ZERO ;
      A10948Vts_Cant = DecimalUtil.ZERO ;
      A10950Vts_maq = "" ;
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
      T01A86_A407EmprNom = new String[] {""} ;
      T01A86_n407EmprNom = new boolean[] {false} ;
      T01A87_A10940Vts_Nbarca = new String[] {""} ;
      T01A87_A407EmprNom = new String[] {""} ;
      T01A87_n407EmprNom = new boolean[] {false} ;
      T01A87_A10941Vts_Clicod = new int[1] ;
      T01A87_n10941Vts_Clicod = new boolean[] {false} ;
      T01A87_A10942Vts_Serv = new int[1] ;
      T01A87_n10942Vts_Serv = new boolean[] {false} ;
      T01A87_A10943Vts_Form = new int[1] ;
      T01A87_n10943Vts_Form = new boolean[] {false} ;
      T01A87_A396EmprCod = new String[] {""} ;
      T01A88_A396EmprCod = new String[] {""} ;
      T01A88_A10940Vts_Nbarca = new String[] {""} ;
      T01A85_A10940Vts_Nbarca = new String[] {""} ;
      T01A85_A10941Vts_Clicod = new int[1] ;
      T01A85_n10941Vts_Clicod = new boolean[] {false} ;
      T01A85_A10942Vts_Serv = new int[1] ;
      T01A85_n10942Vts_Serv = new boolean[] {false} ;
      T01A85_A10943Vts_Form = new int[1] ;
      T01A85_n10943Vts_Form = new boolean[] {false} ;
      T01A85_A396EmprCod = new String[] {""} ;
      T01A89_A396EmprCod = new String[] {""} ;
      T01A89_A10940Vts_Nbarca = new String[] {""} ;
      T01A810_A396EmprCod = new String[] {""} ;
      T01A810_A10940Vts_Nbarca = new String[] {""} ;
      T01A84_A10940Vts_Nbarca = new String[] {""} ;
      T01A84_A10941Vts_Clicod = new int[1] ;
      T01A84_n10941Vts_Clicod = new boolean[] {false} ;
      T01A84_A10942Vts_Serv = new int[1] ;
      T01A84_n10942Vts_Serv = new boolean[] {false} ;
      T01A84_A10943Vts_Form = new int[1] ;
      T01A84_n10943Vts_Form = new boolean[] {false} ;
      T01A84_A396EmprCod = new String[] {""} ;
      T01A814_A396EmprCod = new String[] {""} ;
      T01A814_A10940Vts_Nbarca = new String[] {""} ;
      T01A814_A10951Vts_Rgto = new String[] {""} ;
      T01A815_A396EmprCod = new String[] {""} ;
      T01A815_A10940Vts_Nbarca = new String[] {""} ;
      T01A816_A396EmprCod = new String[] {""} ;
      T01A816_A10940Vts_Nbarca = new String[] {""} ;
      T01A816_A10944Vts_Linea = new short[1] ;
      T01A816_A10945Vts_Prod = new String[] {""} ;
      T01A816_n10945Vts_Prod = new boolean[] {false} ;
      T01A816_A10946Vts_Coment = new String[] {""} ;
      T01A816_n10946Vts_Coment = new boolean[] {false} ;
      T01A816_A10947Vts_Conc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A816_n10947Vts_Conc = new boolean[] {false} ;
      T01A816_A10948Vts_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A816_n10948Vts_Cant = new boolean[] {false} ;
      T01A816_A10949Vts_Und = new byte[1] ;
      T01A816_n10949Vts_Und = new boolean[] {false} ;
      T01A816_A10950Vts_maq = new String[] {""} ;
      T01A816_n10950Vts_maq = new boolean[] {false} ;
      T01A817_A396EmprCod = new String[] {""} ;
      T01A817_A10940Vts_Nbarca = new String[] {""} ;
      T01A817_A10944Vts_Linea = new short[1] ;
      T01A83_A396EmprCod = new String[] {""} ;
      T01A83_A10940Vts_Nbarca = new String[] {""} ;
      T01A83_A10944Vts_Linea = new short[1] ;
      T01A83_A10945Vts_Prod = new String[] {""} ;
      T01A83_n10945Vts_Prod = new boolean[] {false} ;
      T01A83_A10946Vts_Coment = new String[] {""} ;
      T01A83_n10946Vts_Coment = new boolean[] {false} ;
      T01A83_A10947Vts_Conc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A83_n10947Vts_Conc = new boolean[] {false} ;
      T01A83_A10948Vts_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A83_n10948Vts_Cant = new boolean[] {false} ;
      T01A83_A10949Vts_Und = new byte[1] ;
      T01A83_n10949Vts_Und = new boolean[] {false} ;
      T01A83_A10950Vts_maq = new String[] {""} ;
      T01A83_n10950Vts_maq = new boolean[] {false} ;
      T01A82_A396EmprCod = new String[] {""} ;
      T01A82_A10940Vts_Nbarca = new String[] {""} ;
      T01A82_A10944Vts_Linea = new short[1] ;
      T01A82_A10945Vts_Prod = new String[] {""} ;
      T01A82_n10945Vts_Prod = new boolean[] {false} ;
      T01A82_A10946Vts_Coment = new String[] {""} ;
      T01A82_n10946Vts_Coment = new boolean[] {false} ;
      T01A82_A10947Vts_Conc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A82_n10947Vts_Conc = new boolean[] {false} ;
      T01A82_A10948Vts_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01A82_n10948Vts_Cant = new boolean[] {false} ;
      T01A82_A10949Vts_Und = new byte[1] ;
      T01A82_n10949Vts_Und = new boolean[] {false} ;
      T01A82_A10950Vts_maq = new String[] {""} ;
      T01A82_n10950Vts_maq = new boolean[] {false} ;
      T01A821_A396EmprCod = new String[] {""} ;
      T01A821_A10940Vts_Nbarca = new String[] {""} ;
      T01A821_A10944Vts_Linea = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01A822_A407EmprNom = new String[] {""} ;
      T01A822_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ10940Vts_Nbarca = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tvts000__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tvts000__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tvts000__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tvts000__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tvts000__default(),
         new Object[] {
             new Object[] {
            T01A82_A396EmprCod, T01A82_A10940Vts_Nbarca, T01A82_A10944Vts_Linea, T01A82_A10945Vts_Prod, T01A82_n10945Vts_Prod, T01A82_A10946Vts_Coment, T01A82_n10946Vts_Coment, T01A82_A10947Vts_Conc, T01A82_n10947Vts_Conc, T01A82_A10948Vts_Cant,
            T01A82_n10948Vts_Cant, T01A82_A10949Vts_Und, T01A82_n10949Vts_Und, T01A82_A10950Vts_maq, T01A82_n10950Vts_maq
            }
            , new Object[] {
            T01A83_A396EmprCod, T01A83_A10940Vts_Nbarca, T01A83_A10944Vts_Linea, T01A83_A10945Vts_Prod, T01A83_n10945Vts_Prod, T01A83_A10946Vts_Coment, T01A83_n10946Vts_Coment, T01A83_A10947Vts_Conc, T01A83_n10947Vts_Conc, T01A83_A10948Vts_Cant,
            T01A83_n10948Vts_Cant, T01A83_A10949Vts_Und, T01A83_n10949Vts_Und, T01A83_A10950Vts_maq, T01A83_n10950Vts_maq
            }
            , new Object[] {
            T01A84_A10940Vts_Nbarca, T01A84_A10941Vts_Clicod, T01A84_n10941Vts_Clicod, T01A84_A10942Vts_Serv, T01A84_n10942Vts_Serv, T01A84_A10943Vts_Form, T01A84_n10943Vts_Form, T01A84_A396EmprCod
            }
            , new Object[] {
            T01A85_A10940Vts_Nbarca, T01A85_A10941Vts_Clicod, T01A85_n10941Vts_Clicod, T01A85_A10942Vts_Serv, T01A85_n10942Vts_Serv, T01A85_A10943Vts_Form, T01A85_n10943Vts_Form, T01A85_A396EmprCod
            }
            , new Object[] {
            T01A86_A407EmprNom, T01A86_n407EmprNom
            }
            , new Object[] {
            T01A87_A10940Vts_Nbarca, T01A87_A407EmprNom, T01A87_n407EmprNom, T01A87_A10941Vts_Clicod, T01A87_n10941Vts_Clicod, T01A87_A10942Vts_Serv, T01A87_n10942Vts_Serv, T01A87_A10943Vts_Form, T01A87_n10943Vts_Form, T01A87_A396EmprCod
            }
            , new Object[] {
            T01A88_A396EmprCod, T01A88_A10940Vts_Nbarca
            }
            , new Object[] {
            T01A89_A396EmprCod, T01A89_A10940Vts_Nbarca
            }
            , new Object[] {
            T01A810_A396EmprCod, T01A810_A10940Vts_Nbarca
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01A814_A396EmprCod, T01A814_A10940Vts_Nbarca, T01A814_A10951Vts_Rgto
            }
            , new Object[] {
            T01A815_A396EmprCod, T01A815_A10940Vts_Nbarca
            }
            , new Object[] {
            T01A816_A396EmprCod, T01A816_A10940Vts_Nbarca, T01A816_A10944Vts_Linea, T01A816_A10945Vts_Prod, T01A816_n10945Vts_Prod, T01A816_A10946Vts_Coment, T01A816_n10946Vts_Coment, T01A816_A10947Vts_Conc, T01A816_n10947Vts_Conc, T01A816_A10948Vts_Cant,
            T01A816_n10948Vts_Cant, T01A816_A10949Vts_Und, T01A816_n10949Vts_Und, T01A816_A10950Vts_maq, T01A816_n10950Vts_maq
            }
            , new Object[] {
            T01A817_A396EmprCod, T01A817_A10940Vts_Nbarca, T01A817_A10944Vts_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01A821_A396EmprCod, T01A821_A10940Vts_Nbarca, T01A821_A10944Vts_Linea
            }
            , new Object[] {
            T01A822_A407EmprNom, T01A822_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TVTS000" ;
   }

   private byte Z10949Vts_Und ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10949Vts_Und ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short Z10944Vts_Linea ;
   private short nRcdDeleted_1461 ;
   private short nRcdExists_1461 ;
   private short nIsMod_1461 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1461 ;
   private short RcdFound1461 ;
   private short nBlankRcdUsr1461 ;
   private short A10944Vts_Linea ;
   private short RcdFound1460 ;
   private short nIsDirty_1460 ;
   private short nIsDirty_1461 ;
   private int Z10941Vts_Clicod ;
   private int Z10942Vts_Serv ;
   private int Z10943Vts_Form ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtVts_Nbarca_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int A10941Vts_Clicod ;
   private int edtVts_Clicod_Enabled ;
   private int A10942Vts_Serv ;
   private int edtVts_Serv_Enabled ;
   private int A10943Vts_Form ;
   private int edtVts_Form_Enabled ;
   private int edtavnRcdDeleted_1461_Enabled ;
   private int edtVts_Linea_Enabled ;
   private int edtVts_Prod_Enabled ;
   private int edtVts_Coment_Enabled ;
   private int edtVts_Conc_Enabled ;
   private int edtVts_Cant_Enabled ;
   private int edtVts_Und_Enabled ;
   private int edtVts_maq_Enabled ;
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
   private int defedtVts_Linea_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtVts_Form_Backcolor ;
   private int edtVts_Serv_Backcolor ;
   private int edtVts_Clicod_Backcolor ;
   private int edtVts_Nbarca_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ10941Vts_Clicod ;
   private int ZZ10942Vts_Serv ;
   private int ZZ10943Vts_Form ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z10947Vts_Conc ;
   private java.math.BigDecimal Z10948Vts_Cant ;
   private java.math.BigDecimal A10947Vts_Conc ;
   private java.math.BigDecimal A10948Vts_Cant ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z10940Vts_Nbarca ;
   private String Z10945Vts_Prod ;
   private String Z10946Vts_Coment ;
   private String Z10950Vts_maq ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtVts_Nbarca_Internalname ;
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
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String A10940Vts_Nbarca ;
   private String edtVts_Nbarca_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtVts_Clicod_Internalname ;
   private String edtVts_Clicod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtVts_Serv_Internalname ;
   private String edtVts_Serv_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtVts_Form_Internalname ;
   private String edtVts_Form_Jsonclick ;
   private String sMode1461 ;
   private String edtavnRcdDeleted_1461_Internalname ;
   private String edtVts_Linea_Internalname ;
   private String edtVts_Prod_Internalname ;
   private String edtVts_Coment_Internalname ;
   private String edtVts_Conc_Internalname ;
   private String edtVts_Cant_Internalname ;
   private String edtVts_Und_Internalname ;
   private String edtVts_maq_Internalname ;
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
   private String sMode1460 ;
   private String GXCCtl ;
   private String A10945Vts_Prod ;
   private String A10946Vts_Coment ;
   private String A10950Vts_maq ;
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
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1461_Jsonclick ;
   private String edtVts_Linea_Jsonclick ;
   private String edtVts_Prod_Jsonclick ;
   private String edtVts_Coment_Jsonclick ;
   private String edtVts_Conc_Jsonclick ;
   private String edtVts_Cant_Jsonclick ;
   private String edtVts_Und_Jsonclick ;
   private String edtVts_maq_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ10940Vts_Nbarca ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n10941Vts_Clicod ;
   private boolean n10942Vts_Serv ;
   private boolean n10943Vts_Form ;
   private boolean returnInSub ;
   private boolean n10945Vts_Prod ;
   private boolean n10946Vts_Coment ;
   private boolean n10947Vts_Conc ;
   private boolean n10948Vts_Cant ;
   private boolean n10949Vts_Und ;
   private boolean n10950Vts_maq ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01A86_A407EmprNom ;
   private boolean[] T01A86_n407EmprNom ;
   private String[] T01A87_A10940Vts_Nbarca ;
   private String[] T01A87_A407EmprNom ;
   private boolean[] T01A87_n407EmprNom ;
   private int[] T01A87_A10941Vts_Clicod ;
   private boolean[] T01A87_n10941Vts_Clicod ;
   private int[] T01A87_A10942Vts_Serv ;
   private boolean[] T01A87_n10942Vts_Serv ;
   private int[] T01A87_A10943Vts_Form ;
   private boolean[] T01A87_n10943Vts_Form ;
   private String[] T01A87_A396EmprCod ;
   private String[] T01A88_A396EmprCod ;
   private String[] T01A88_A10940Vts_Nbarca ;
   private String[] T01A85_A10940Vts_Nbarca ;
   private int[] T01A85_A10941Vts_Clicod ;
   private boolean[] T01A85_n10941Vts_Clicod ;
   private int[] T01A85_A10942Vts_Serv ;
   private boolean[] T01A85_n10942Vts_Serv ;
   private int[] T01A85_A10943Vts_Form ;
   private boolean[] T01A85_n10943Vts_Form ;
   private String[] T01A85_A396EmprCod ;
   private String[] T01A89_A396EmprCod ;
   private String[] T01A89_A10940Vts_Nbarca ;
   private String[] T01A810_A396EmprCod ;
   private String[] T01A810_A10940Vts_Nbarca ;
   private String[] T01A84_A10940Vts_Nbarca ;
   private int[] T01A84_A10941Vts_Clicod ;
   private boolean[] T01A84_n10941Vts_Clicod ;
   private int[] T01A84_A10942Vts_Serv ;
   private boolean[] T01A84_n10942Vts_Serv ;
   private int[] T01A84_A10943Vts_Form ;
   private boolean[] T01A84_n10943Vts_Form ;
   private String[] T01A84_A396EmprCod ;
   private String[] T01A814_A396EmprCod ;
   private String[] T01A814_A10940Vts_Nbarca ;
   private String[] T01A814_A10951Vts_Rgto ;
   private String[] T01A815_A396EmprCod ;
   private String[] T01A815_A10940Vts_Nbarca ;
   private String[] T01A816_A396EmprCod ;
   private String[] T01A816_A10940Vts_Nbarca ;
   private short[] T01A816_A10944Vts_Linea ;
   private String[] T01A816_A10945Vts_Prod ;
   private boolean[] T01A816_n10945Vts_Prod ;
   private String[] T01A816_A10946Vts_Coment ;
   private boolean[] T01A816_n10946Vts_Coment ;
   private java.math.BigDecimal[] T01A816_A10947Vts_Conc ;
   private boolean[] T01A816_n10947Vts_Conc ;
   private java.math.BigDecimal[] T01A816_A10948Vts_Cant ;
   private boolean[] T01A816_n10948Vts_Cant ;
   private byte[] T01A816_A10949Vts_Und ;
   private boolean[] T01A816_n10949Vts_Und ;
   private String[] T01A816_A10950Vts_maq ;
   private boolean[] T01A816_n10950Vts_maq ;
   private String[] T01A817_A396EmprCod ;
   private String[] T01A817_A10940Vts_Nbarca ;
   private short[] T01A817_A10944Vts_Linea ;
   private String[] T01A83_A396EmprCod ;
   private String[] T01A83_A10940Vts_Nbarca ;
   private short[] T01A83_A10944Vts_Linea ;
   private String[] T01A83_A10945Vts_Prod ;
   private boolean[] T01A83_n10945Vts_Prod ;
   private String[] T01A83_A10946Vts_Coment ;
   private boolean[] T01A83_n10946Vts_Coment ;
   private java.math.BigDecimal[] T01A83_A10947Vts_Conc ;
   private boolean[] T01A83_n10947Vts_Conc ;
   private java.math.BigDecimal[] T01A83_A10948Vts_Cant ;
   private boolean[] T01A83_n10948Vts_Cant ;
   private byte[] T01A83_A10949Vts_Und ;
   private boolean[] T01A83_n10949Vts_Und ;
   private String[] T01A83_A10950Vts_maq ;
   private boolean[] T01A83_n10950Vts_maq ;
   private String[] T01A82_A396EmprCod ;
   private String[] T01A82_A10940Vts_Nbarca ;
   private short[] T01A82_A10944Vts_Linea ;
   private String[] T01A82_A10945Vts_Prod ;
   private boolean[] T01A82_n10945Vts_Prod ;
   private String[] T01A82_A10946Vts_Coment ;
   private boolean[] T01A82_n10946Vts_Coment ;
   private java.math.BigDecimal[] T01A82_A10947Vts_Conc ;
   private boolean[] T01A82_n10947Vts_Conc ;
   private java.math.BigDecimal[] T01A82_A10948Vts_Cant ;
   private boolean[] T01A82_n10948Vts_Cant ;
   private byte[] T01A82_A10949Vts_Und ;
   private boolean[] T01A82_n10949Vts_Und ;
   private String[] T01A82_A10950Vts_maq ;
   private boolean[] T01A82_n10950Vts_maq ;
   private String[] T01A821_A396EmprCod ;
   private String[] T01A821_A10940Vts_Nbarca ;
   private short[] T01A821_A10944Vts_Linea ;
   private String[] T01A822_A407EmprNom ;
   private boolean[] T01A822_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tvts000__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts000__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts000__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts000__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tvts000__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01A82", "SELECT EmprCod, Vts_Nbarca, Vts_Linea, Vts_Prod, Vts_Coment, Vts_Conc, Vts_Cant, Vts_Und, Vts_maq FROM TXPVTS001 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Linea = ?  FOR UPDATE OF Vts_Prod, Vts_Coment, Vts_Conc, Vts_Cant, Vts_Und, Vts_maq NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A83", "SELECT EmprCod, Vts_Nbarca, Vts_Linea, Vts_Prod, Vts_Coment, Vts_Conc, Vts_Cant, Vts_Und, Vts_maq FROM TXPVTS001 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A84", "SELECT Vts_Nbarca, Vts_Clicod, Vts_Serv, Vts_Form, EmprCod FROM TXPVTS000 WHERE EmprCod = ? AND Vts_Nbarca = ?  FOR UPDATE OF Vts_Clicod, Vts_Serv, Vts_Form NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A85", "SELECT Vts_Nbarca, Vts_Clicod, Vts_Serv, Vts_Form, EmprCod FROM TXPVTS000 WHERE EmprCod = ? AND Vts_Nbarca = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A86", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A87", "SELECT /*+ FIRST_ROWS(100) */ TM1.Vts_Nbarca, T2.EmprNom, TM1.Vts_Clicod, TM1.Vts_Serv, TM1.Vts_Form, TM1.EmprCod FROM (TXPVTS000 TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Vts_Nbarca = ? ORDER BY TM1.EmprCod, TM1.Vts_Nbarca ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A88", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Vts_Nbarca FROM TXPVTS000 WHERE EmprCod = ? AND Vts_Nbarca = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A89", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Vts_Nbarca FROM TXPVTS000 WHERE ( Vts_Nbarca > ?) and EmprCod = ? ORDER BY EmprCod, Vts_Nbarca) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01A810", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Vts_Nbarca FROM TXPVTS000 WHERE ( Vts_Nbarca < ?) and EmprCod = ? ORDER BY EmprCod DESC, Vts_Nbarca DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01A811", "INSERT INTO TXPVTS000(Vts_Nbarca, Vts_Clicod, Vts_Serv, Vts_Form, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPVTS000")
         ,new UpdateCursor("T01A812", "UPDATE TXPVTS000 SET Vts_Clicod=?, Vts_Serv=?, Vts_Form=?  WHERE EmprCod = ? AND Vts_Nbarca = ?", GX_NOMASK, "TXPVTS000")
         ,new UpdateCursor("T01A813", "DELETE FROM TXPVTS000  WHERE EmprCod = ? AND Vts_Nbarca = ?", GX_NOMASK, "TXPVTS000")
         ,new ForEachCursor("T01A814", "SELECT * FROM (SELECT EmprCod, Vts_Nbarca, Vts_Rgto FROM TXPVTS002 WHERE EmprCod = ? AND Vts_Nbarca = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01A815", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Vts_Nbarca FROM TXPVTS000 WHERE EmprCod = ? ORDER BY EmprCod, Vts_Nbarca ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A816", "SELECT EmprCod, Vts_Nbarca, Vts_Linea, Vts_Prod, Vts_Coment, Vts_Conc, Vts_Cant, Vts_Und, Vts_maq FROM TXPVTS001 WHERE EmprCod = ? and Vts_Nbarca = ? and Vts_Linea = ? ORDER BY EmprCod, Vts_Nbarca, Vts_Linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A817", "SELECT EmprCod, Vts_Nbarca, Vts_Linea FROM TXPVTS001 WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01A818", "INSERT INTO TXPVTS001(EmprCod, Vts_Nbarca, Vts_Linea, Vts_Prod, Vts_Coment, Vts_Conc, Vts_Cant, Vts_Und, Vts_maq) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPVTS001")
         ,new UpdateCursor("T01A819", "UPDATE TXPVTS001 SET Vts_Prod=?, Vts_Coment=?, Vts_Conc=?, Vts_Cant=?, Vts_Und=?, Vts_maq=?  WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Linea = ?", GX_NOMASK, "TXPVTS001")
         ,new UpdateCursor("T01A820", "DELETE FROM TXPVTS001  WHERE EmprCod = ? AND Vts_Nbarca = ? AND Vts_Linea = ?", GX_NOMASK, "TXPVTS001")
         ,new ForEachCursor("T01A821", "SELECT EmprCod, Vts_Nbarca, Vts_Linea FROM TXPVTS001 WHERE EmprCod = ? and Vts_Nbarca = ? ORDER BY EmprCod, Vts_Nbarca, Vts_Linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01A822", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 45);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 45);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 45);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
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
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 10);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 10);
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
               stmt.setString(5, (String)parms[7], 3);
               return;
            case 10 :
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
                  stmt.setInt(3, ((Number) parms[5]).intValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setString(5, (String)parms[7], 10);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 15);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 45);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 5);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 5);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 4);
               }
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 15);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 45);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 5);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 5);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 4);
               }
               stmt.setString(7, (String)parms[12], 3);
               stmt.setString(8, (String)parms[13], 10);
               stmt.setShort(9, ((Number) parms[14]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 10);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

