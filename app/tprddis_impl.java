package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprddis_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"PRDNOMD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12236PrdNumD = httpContext.GetPar( "PrdNumD") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asaprdnomd1JG1698( A396EmprCod, A12236PrdNumD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12236PrdNumD = httpContext.GetPar( "PrdNumD") ;
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A12236PrdNumD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Ficha Producto Disolucion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNumD_Internalname ;
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

   public tprddis_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprddis_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprddis_impl.class ));
   }

   public tprddis_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRDDIS.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumD_Internalname, GXutil.rtrim( A12236PrdNumD), GXutil.rtrim( localUtil.format( A12236PrdNumD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumD_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNumD_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNomD_Internalname, GXutil.rtrim( A12239PrdNomD), GXutil.rtrim( localUtil.format( A12239PrdNomD, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNomD_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNomD_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Total Porcentaje", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTotPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A12240TotPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTotPorc_Enabled!=0) ? localUtil.format( A12240TotPorc, "ZZ9.99") : localUtil.format( A12240TotPorc, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTotPorc_Jsonclick, 0, "", "", "", "", "", 1, edtTotPorc_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Tratamiento de Aguas?", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDDIS.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTrH2O_Internalname, GXutil.rtrim( A12337PrdTrH2O), GXutil.rtrim( localUtil.format( A12337PrdTrH2O, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTrH2O_Jsonclick, 0, "", "", "", "", "", 1, edtPrdTrH2O_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDDIS.htm");
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
         nBlankRcdCount1699 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1699 = (short)(1) ;
            scanStart1JG1699( ) ;
            while ( RcdFound1699 != 0 )
            {
               init_level_properties1699( ) ;
               getByPrimaryKey1JG1699( ) ;
               addRow1JG1699( ) ;
               scanNext1JG1699( ) ;
            }
            scanEnd1JG1699( ) ;
            nBlankRcdCount1699 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B12240TotPorc = A12240TotPorc ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         standaloneNotModal1JG1699( ) ;
         standaloneModal1JG1699( ) ;
         sMode1699 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1JG1699( ) ;
            edtavnRcdDeleted_1699_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1699_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1699_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1699_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPrdPorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPORC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtPrdCal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCal_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1699 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1JG1699( ) ;
            }
            sendRow1JG1699( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1699 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A12240TotPorc = B12240TotPorc ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1699 = (short)(5) ;
         nRcdExists_1699 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1JG1699( ) ;
            while ( RcdFound1699 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501699( ) ;
               init_level_properties1699( ) ;
               standaloneNotModal1JG1699( ) ;
               getByPrimaryKey1JG1699( ) ;
               standaloneModal1JG1699( ) ;
               addRow1JG1699( ) ;
               scanNext1JG1699( ) ;
            }
            scanEnd1JG1699( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1699 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501699( ) ;
      initAll1JG1699( ) ;
      init_level_properties1699( ) ;
      B12240TotPorc = A12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      nRcdExists_1699 = (short)(0) ;
      nIsMod_1699 = (short)(0) ;
      nRcdDeleted_1699 = (short)(0) ;
      nBlankRcdCount1699 = (short)(nBlankRcdUsr1699+nBlankRcdCount1699) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1699 > 0 )
      {
         standaloneNotModal1JG1699( ) ;
         standaloneModal1JG1699( ) ;
         addRow1JG1699( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtPrdNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1699 = (short)(nBlankRcdCount1699-1) ;
      }
      Gx_mode = sMode1699 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A12240TotPorc = B12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDDIS.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TPRDDIS.htm");
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
      e111JG2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z12236PrdNumD = httpContext.cgiGet( "Z12236PrdNumD") ;
            Z12337PrdTrH2O = httpContext.cgiGet( "Z12337PrdTrH2O") ;
            O12240TotPorc = localUtil.ctond( httpContext.cgiGet( "O12240TotPorc")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV34Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A12236PrdNumD = httpContext.cgiGet( edtPrdNumD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
            A12239PrdNomD = httpContext.cgiGet( edtPrdNomD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", A12239PrdNomD);
            A12240TotPorc = localUtil.ctond( httpContext.cgiGet( edtTotPorc_Internalname)) ;
            n12240TotPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
            A12337PrdTrH2O = httpContext.cgiGet( edtPrdTrH2O_Internalname) ;
            n12337PrdTrH2O = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", A12337PrdTrH2O);
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
               A12236PrdNumD = httpContext.GetPar( "PrdNumD") ;
               httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
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
                        e111JG2 ();
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
            initAll1JG1698( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1699_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1699_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes1JG1698( ) ;
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

   public void confirm_1JG0( )
   {
      beforeValidate1JG1698( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1JG1698( ) ;
         }
         else
         {
            checkExtendedTable1JG1698( ) ;
            if ( AnyError == 0 )
            {
               zm1JG1698( 9) ;
               zm1JG1698( 10) ;
            }
            closeExtendedTableCursors1JG1698( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1698 = Gx_mode ;
         confirm_1JG1699( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1698 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1698 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1JG0( ) ;
      }
   }

   public void confirm_1JG1699( )
   {
      s12240TotPorc = O12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1JG1699( ) ;
         if ( ( nRcdExists_1699 != 0 ) || ( nIsMod_1699 != 0 ) )
         {
            getKey1JG1699( ) ;
            if ( ( nRcdExists_1699 == 0 ) && ( nRcdDeleted_1699 == 0 ) )
            {
               if ( RcdFound1699 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1JG1699( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1JG1699( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1JG1699( 12) ;
                     }
                     closeExtendedTableCursors1JG1699( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O12240TotPorc = A12240TotPorc ;
                     n12240TotPorc = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
                  }
               }
               else
               {
                  GXCCtl = "PRDNUM_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1699 != 0 )
               {
                  if ( nRcdDeleted_1699 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1JG1699( ) ;
                     load1JG1699( ) ;
                     beforeValidate1JG1699( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1JG1699( ) ;
                        O12240TotPorc = A12240TotPorc ;
                        n12240TotPorc = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_1699 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1JG1699( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1JG1699( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1JG1699( 12) ;
                           }
                           closeExtendedTableCursors1JG1699( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O12240TotPorc = A12240TotPorc ;
                           n12240TotPorc = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1699 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1699_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCal_Internalname, GXutil.ltrim( localUtil.ntoc( A12238PrdCal, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_50_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z12237PrdPorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12237PrdPorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1699_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1699_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1699_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1699 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1699_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1699_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O12240TotPorc = s12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1JG0( )
   {
   }

   public void e111JG2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV34Pgmname, (byte)(99), GXv_char2) ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tprddis_impl.this.A396EmprCod = GXv_char2[0] ;
      tprddis_impl.this.AV11EmprNom = GXv_char3[0] ;
      tprddis_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1JG1698( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12337PrdTrH2O = T01JG6_A12337PrdTrH2O[0] ;
         }
         else
         {
            Z12337PrdTrH2O = A12337PrdTrH2O ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z12236PrdNumD = A12236PrdNumD ;
         Z12337PrdTrH2O = A12337PrdTrH2O ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z12240TotPorc = A12240TotPorc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV34Pgmname = "TPRDDIS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      /* Using cursor T01JG7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JG7_A407EmprNom[0] ;
      n407EmprNom = T01JG7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
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
      if ( isIns( )  && (GXutil.strcmp("", A12337PrdTrH2O)==0) && ( Gx_BScreen == 0 ) )
      {
         A12337PrdTrH2O = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         n12337PrdTrH2O = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", A12337PrdTrH2O);
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

   public void load1JG1698( )
   {
      /* Using cursor T01JG11 */
      pr_default.execute(7, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1698 = (short)(1) ;
         A407EmprNom = T01JG11_A407EmprNom[0] ;
         n407EmprNom = T01JG11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12337PrdTrH2O = T01JG11_A12337PrdTrH2O[0] ;
         n12337PrdTrH2O = T01JG11_n12337PrdTrH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", A12337PrdTrH2O);
         A12240TotPorc = T01JG11_A12240TotPorc[0] ;
         n12240TotPorc = T01JG11_n12240TotPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         zm1JG1698( -8) ;
      }
      pr_default.close(7);
      onLoadActions1JG1698( ) ;
   }

   public void onLoadActions1JG1698( )
   {
      O12240TotPorc = A12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      GXt_char1 = A12239PrdNomD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A12236PrdNumD ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprddis_impl.this.A396EmprCod = GXv_char4[0] ;
      tprddis_impl.this.A12236PrdNumD = GXv_char3[0] ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
      A12239PrdNomD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", A12239PrdNomD);
   }

   public void checkExtendedTable1JG1698( )
   {
      nIsDirty_1698 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01JG9 */
      pr_default.execute(6, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         A12240TotPorc = T01JG9_A12240TotPorc[0] ;
         n12240TotPorc = T01JG9_n12240TotPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      else
      {
         nIsDirty_1698 = (short)(1) ;
         A12240TotPorc = DecimalUtil.doubleToDec(0) ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      pr_default.close(6);
      nIsDirty_1698 = (short)(1) ;
      GXt_char1 = A12239PrdNomD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A12236PrdNumD ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprddis_impl.this.A396EmprCod = GXv_char4[0] ;
      tprddis_impl.this.A12236PrdNumD = GXv_char3[0] ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
      A12239PrdNomD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", A12239PrdNomD);
   }

   public void closeExtendedTableCursors1JG1698( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          String A12236PrdNumD )
   {
      /* Using cursor T01JG13 */
      pr_default.execute(8, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A12240TotPorc = T01JG13_A12240TotPorc[0] ;
         n12240TotPorc = T01JG13_n12240TotPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      else
      {
         A12240TotPorc = DecimalUtil.doubleToDec(0) ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A12240TotPorc, (byte)(6), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1JG1698( )
   {
      /* Using cursor T01JG14 */
      pr_default.execute(9, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1698 = (short)(1) ;
      }
      else
      {
         RcdFound1698 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01JG6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01JG6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JG1698( 8) ;
         RcdFound1698 = (short)(1) ;
         A12236PrdNumD = T01JG6_A12236PrdNumD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
         A12337PrdTrH2O = T01JG6_A12337PrdTrH2O[0] ;
         n12337PrdTrH2O = T01JG6_n12337PrdTrH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", A12337PrdTrH2O);
         Z396EmprCod = A396EmprCod ;
         Z12236PrdNumD = A12236PrdNumD ;
         sMode1698 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1JG1698( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1698 = (short)(0) ;
            initializeNonKey1JG1698( ) ;
         }
         Gx_mode = sMode1698 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1698 = (short)(0) ;
         initializeNonKey1JG1698( ) ;
         sMode1698 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1698 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1JG1698( ) ;
      if ( RcdFound1698 == 0 )
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
      RcdFound1698 = (short)(0) ;
      /* Using cursor T01JG15 */
      pr_default.execute(10, new Object[] {A12236PrdNumD, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01JG15_A12236PrdNumD[0], A12236PrdNumD) < 0 ) ) && ( GXutil.strcmp(T01JG15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01JG15_A12236PrdNumD[0], A12236PrdNumD) > 0 ) ) && ( GXutil.strcmp(T01JG15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12236PrdNumD = T01JG15_A12236PrdNumD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
            RcdFound1698 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1698 = (short)(0) ;
      /* Using cursor T01JG16 */
      pr_default.execute(11, new Object[] {A12236PrdNumD, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01JG16_A12236PrdNumD[0], A12236PrdNumD) > 0 ) ) && ( GXutil.strcmp(T01JG16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01JG16_A12236PrdNumD[0], A12236PrdNumD) < 0 ) ) && ( GXutil.strcmp(T01JG16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A12236PrdNumD = T01JG16_A12236PrdNumD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
            RcdFound1698 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1JG1698( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A12240TotPorc = O12240TotPorc ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         GX_FocusControl = edtPrdNumD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1JG1698( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1698 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12236PrdNumD, Z12236PrdNumD) != 0 ) )
            {
               A12236PrdNumD = Z12236PrdNumD ;
               httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A12240TotPorc = O12240TotPorc ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNumD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A12240TotPorc = O12240TotPorc ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
               update1JG1698( ) ;
               GX_FocusControl = edtPrdNumD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12236PrdNumD, Z12236PrdNumD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A12240TotPorc = O12240TotPorc ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
               GX_FocusControl = edtPrdNumD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1JG1698( ) ;
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
                  A12240TotPorc = O12240TotPorc ;
                  n12240TotPorc = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
                  GX_FocusControl = edtPrdNumD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1JG1698( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12236PrdNumD, Z12236PrdNumD) != 0 ) )
      {
         A12236PrdNumD = Z12236PrdNumD ;
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A12240TotPorc = O12240TotPorc ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNumD_Internalname ;
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
      getKey1JG1698( ) ;
      if ( RcdFound1698 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12236PrdNumD, Z12236PrdNumD) != 0 ) )
         {
            A12236PrdNumD = Z12236PrdNumD ;
            httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A12236PrdNumD, Z12236PrdNumD) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tprddis");
      GX_FocusControl = edtPrdTrH2O_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1JG0( ) ;
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
      if ( RcdFound1698 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdTrH2O_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1JG1698( ) ;
      if ( RcdFound1698 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdTrH2O_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JG1698( ) ;
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
      if ( RcdFound1698 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdTrH2O_Internalname ;
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
      if ( RcdFound1698 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdTrH2O_Internalname ;
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
      scanStart1JG1698( ) ;
      if ( RcdFound1698 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1698 != 0 )
         {
            scanNext1JG1698( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdTrH2O_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1JG1698( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1JG1698( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JG5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A12236PrdNumD});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDDIS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z12337PrdTrH2O, T01JG5_A12337PrdTrH2O[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z12337PrdTrH2O, T01JG5_A12337PrdTrH2O[0]) != 0 )
            {
               GXutil.writeLogln("tprddis:[seudo value changed for attri]"+"PrdTrH2O");
               GXutil.writeLogRaw("Old: ",Z12337PrdTrH2O);
               GXutil.writeLogRaw("Current: ",T01JG5_A12337PrdTrH2O[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRDDIS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JG1698( )
   {
      beforeValidate1JG1698( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JG1698( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JG1698( 0) ;
         checkOptimisticConcurrency1JG1698( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JG1698( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JG1698( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JG17 */
                  pr_default.execute(12, new Object[] {A12236PrdNumD, Boolean.valueOf(n12337PrdTrH2O), A12337PrdTrH2O, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDDIS");
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
                        processLevel1JG1698( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1JG0( ) ;
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
            load1JG1698( ) ;
         }
         endLevel1JG1698( ) ;
      }
      closeExtendedTableCursors1JG1698( ) ;
   }

   public void update1JG1698( )
   {
      beforeValidate1JG1698( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JG1698( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JG1698( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JG1698( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1JG1698( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JG18 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n12337PrdTrH2O), A12337PrdTrH2O, A396EmprCod, A12236PrdNumD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDDIS");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDDIS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1JG1698( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1JG1698( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1JG0( ) ;
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
         endLevel1JG1698( ) ;
      }
      closeExtendedTableCursors1JG1698( ) ;
   }

   public void deferredUpdate1JG1698( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JG1698( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JG1698( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JG1698( ) ;
         afterConfirm1JG1698( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JG1698( ) ;
            if ( AnyError == 0 )
            {
               A12240TotPorc = O12240TotPorc ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
               scanStart1JG1699( ) ;
               while ( RcdFound1699 != 0 )
               {
                  getByPrimaryKey1JG1699( ) ;
                  delete1JG1699( ) ;
                  scanNext1JG1699( ) ;
                  O12240TotPorc = A12240TotPorc ;
                  n12240TotPorc = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
               }
               scanEnd1JG1699( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JG19 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A12236PrdNumD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDDIS");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1698 == 0 )
                        {
                           initAll1JG1698( ) ;
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
                        resetCaption1JG0( ) ;
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
      sMode1698 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JG1698( ) ;
      Gx_mode = sMode1698 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JG1698( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01JG21 */
         pr_default.execute(15, new Object[] {A396EmprCod, A12236PrdNumD});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A12240TotPorc = T01JG21_A12240TotPorc[0] ;
            n12240TotPorc = T01JG21_n12240TotPorc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         }
         else
         {
            A12240TotPorc = DecimalUtil.doubleToDec(0) ;
            n12240TotPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         }
         pr_default.close(15);
         GXt_char1 = A12239PrdNomD ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A12236PrdNumD ;
         GXv_char2[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
         tprddis_impl.this.A396EmprCod = GXv_char4[0] ;
         tprddis_impl.this.A12236PrdNumD = GXv_char3[0] ;
         tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
         A12239PrdNomD = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", A12239PrdNomD);
      }
   }

   public void processNestedLevel1JG1699( )
   {
      s12240TotPorc = O12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1JG1699( ) ;
         if ( ( nRcdExists_1699 != 0 ) || ( nIsMod_1699 != 0 ) )
         {
            standaloneNotModal1JG1699( ) ;
            getKey1JG1699( ) ;
            if ( ( nRcdExists_1699 == 0 ) && ( nRcdDeleted_1699 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1JG1699( ) ;
            }
            else
            {
               if ( RcdFound1699 != 0 )
               {
                  if ( ( nRcdDeleted_1699 != 0 ) && ( nRcdExists_1699 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1JG1699( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1699 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1JG1699( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1699 == 0 )
                  {
                     GXCCtl = "PRDNUM_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O12240TotPorc = A12240TotPorc ;
            n12240TotPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_1699_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPorc_Internalname, GXutil.ltrim( localUtil.ntoc( A12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdCal_Internalname, GXutil.ltrim( localUtil.ntoc( A12238PrdCal, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_50_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z12237PrdPorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T12237PrdPorc_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( O12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1699_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1699_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1699_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1699 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1699_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1699_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPREACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPorc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDCAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1JG1699( ) ;
      if ( AnyError != 0 )
      {
         O12240TotPorc = s12240TotPorc ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      nRcdExists_1699 = (short)(0) ;
      nIsMod_1699 = (short)(0) ;
      nRcdDeleted_1699 = (short)(0) ;
   }

   public void processLevel1JG1698( )
   {
      /* Save parent mode. */
      sMode1698 = Gx_mode ;
      processNestedLevel1JG1699( ) ;
      if ( AnyError != 0 )
      {
         O12240TotPorc = s12240TotPorc ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode1698 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1JG1698( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1JG1698( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprddis");
         if ( AnyError == 0 )
         {
            confirmValues1JG0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprddis");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1JG1698( )
   {
      /* Scan By routine */
      /* Using cursor T01JG22 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound1698 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1698 = (short)(1) ;
         A12236PrdNumD = T01JG22_A12236PrdNumD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JG1698( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1698 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1698 = (short)(1) ;
         A12236PrdNumD = T01JG22_A12236PrdNumD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
      }
   }

   public void scanEnd1JG1698( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1JG1698( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A12236PrdNumD)==0) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto NO valido", ""), 1, "PRDNUMD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNumD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( ( GXutil.strcmp(A12239PrdNomD, httpContext.getMessage( "Error", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Producto NO valido", ""), 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
   }

   public void beforeInsert1JG1698( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JG1698( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JG1698( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JG1698( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JG1698( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JG1698( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNumD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumD_Enabled), 5, 0), true);
      edtPrdNomD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNomD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNomD_Enabled), 5, 0), true);
      edtTotPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotPorc_Enabled), 5, 0), true);
      edtPrdTrH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTrH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTrH2O_Enabled), 5, 0), true);
   }

   public void zm1JG1699( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12237PrdPorc = T01JG3_A12237PrdPorc[0] ;
         }
         else
         {
            Z12237PrdPorc = A12237PrdPorc ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z12236PrdNumD = A12236PrdNumD ;
         Z12237PrdPorc = A12237PrdPorc ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z724PrdPreAct = A724PrdPreAct ;
      }
   }

   public void standaloneNotModal1JG1699( )
   {
   }

   public void standaloneModal1JG1699( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtPrdNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1JG1699( )
   {
      /* Using cursor T01JG23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A12236PrdNumD, A719PrdNum});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1699 = (short)(1) ;
         A718PrdNom = T01JG23_A718PrdNom[0] ;
         A724PrdPreAct = T01JG23_A724PrdPreAct[0] ;
         A12237PrdPorc = T01JG23_A12237PrdPorc[0] ;
         n12237PrdPorc = T01JG23_n12237PrdPorc[0] ;
         zm1JG1699( -11) ;
      }
      pr_default.close(17);
      onLoadActions1JG1699( ) ;
   }

   public void onLoadActions1JG1699( )
   {
      A12238PrdCal = GXutil.roundDecimal( A724PrdPreAct.multiply(A12237PrdPorc).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      if ( isIns( )  )
      {
         A12240TotPorc = O12240TotPorc.add(A12237PrdPorc) ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A12240TotPorc = O12240TotPorc.add(A12237PrdPorc).subtract(O12237PrdPorc) ;
            n12240TotPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A12240TotPorc = O12240TotPorc.subtract(O12237PrdPorc) ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
            }
         }
      }
   }

   public void checkExtendedTable1JG1699( )
   {
      nIsDirty_1699 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1JG1699( ) ;
      /* Using cursor T01JG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01JG4_A718PrdNom[0] ;
      A724PrdPreAct = T01JG4_A724PrdPreAct[0] ;
      pr_default.close(2);
      nIsDirty_1699 = (short)(1) ;
      A12238PrdCal = GXutil.roundDecimal( A724PrdPreAct.multiply(A12237PrdPorc).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
      if ( isIns( )  )
      {
         nIsDirty_1699 = (short)(1) ;
         A12240TotPorc = O12240TotPorc.add(A12237PrdPorc) ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_1699 = (short)(1) ;
            A12240TotPorc = O12240TotPorc.add(A12237PrdPorc).subtract(O12237PrdPorc) ;
            n12240TotPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_1699 = (short)(1) ;
               A12240TotPorc = O12240TotPorc.subtract(O12237PrdPorc) ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
            }
         }
      }
   }

   public void closeExtendedTableCursors1JG1699( )
   {
      pr_default.close(2);
   }

   public void enableDisable1JG1699( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01JG24 */
      pr_default.execute(18, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(18) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01JG24_A718PrdNom[0] ;
      A724PrdPreAct = T01JG24_A724PrdPreAct[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1JG1699( )
   {
      /* Using cursor T01JG25 */
      pr_default.execute(19, new Object[] {A396EmprCod, A12236PrdNumD, A719PrdNum});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound1699 = (short)(1) ;
      }
      else
      {
         RcdFound1699 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey1JG1699( )
   {
      /* Using cursor T01JG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A12236PrdNumD, A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01JG3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1JG1699( 11) ;
         RcdFound1699 = (short)(1) ;
         initializeNonKey1JG1699( ) ;
         A12237PrdPorc = T01JG3_A12237PrdPorc[0] ;
         n12237PrdPorc = T01JG3_n12237PrdPorc[0] ;
         A719PrdNum = T01JG3_A719PrdNum[0] ;
         O12237PrdPorc = A12237PrdPorc ;
         n12237PrdPorc = false ;
         Z396EmprCod = A396EmprCod ;
         Z12236PrdNumD = A12236PrdNumD ;
         Z719PrdNum = A719PrdNum ;
         sMode1699 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JG1699( ) ;
         load1JG1699( ) ;
         Gx_mode = sMode1699 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1699 = (short)(0) ;
         initializeNonKey1JG1699( ) ;
         sMode1699 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1JG1699( ) ;
         Gx_mode = sMode1699 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1JG1699( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1JG1699( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01JG2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A12236PrdNumD, A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDDI1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z12237PrdPorc, T01JG2_A12237PrdPorc[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z12237PrdPorc, T01JG2_A12237PrdPorc[0]) != 0 )
            {
               GXutil.writeLogln("tprddis:[seudo value changed for attri]"+"PrdPorc");
               GXutil.writeLogRaw("Old: ",Z12237PrdPorc);
               GXutil.writeLogRaw("Current: ",T01JG2_A12237PrdPorc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRDDI1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1JG1699( )
   {
      beforeValidate1JG1699( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JG1699( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1JG1699( 0) ;
         checkOptimisticConcurrency1JG1699( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1JG1699( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1JG1699( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01JG26 */
                  pr_default.execute(20, new Object[] {A12236PrdNumD, Boolean.valueOf(n12237PrdPorc), A12237PrdPorc, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDDI1");
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
            load1JG1699( ) ;
         }
         endLevel1JG1699( ) ;
      }
      closeExtendedTableCursors1JG1699( ) ;
   }

   public void update1JG1699( )
   {
      beforeValidate1JG1699( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1JG1699( ) ;
      }
      if ( ( nIsMod_1699 != 0 ) || ( nIsDirty_1699 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1JG1699( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1JG1699( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1JG1699( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01JG27 */
                     pr_default.execute(21, new Object[] {Boolean.valueOf(n12237PrdPorc), A12237PrdPorc, A396EmprCod, A12236PrdNumD, A719PrdNum});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDDI1");
                     if ( (pr_default.getStatus(21) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRDDI1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1JG1699( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1JG1699( ) ;
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
            endLevel1JG1699( ) ;
         }
      }
      closeExtendedTableCursors1JG1699( ) ;
   }

   public void deferredUpdate1JG1699( )
   {
   }

   public void delete1JG1699( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1JG1699( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1JG1699( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1JG1699( ) ;
         afterConfirm1JG1699( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1JG1699( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01JG28 */
               pr_default.execute(22, new Object[] {A396EmprCod, A12236PrdNumD, A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRDDI1");
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
      sMode1699 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1JG1699( ) ;
      Gx_mode = sMode1699 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1JG1699( )
   {
      standaloneModal1JG1699( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01JG29 */
         pr_default.execute(23, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01JG29_A718PrdNom[0] ;
         A724PrdPreAct = T01JG29_A724PrdPreAct[0] ;
         pr_default.close(23);
         A12238PrdCal = GXutil.roundDecimal( A724PrdPreAct.multiply(A12237PrdPorc).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN), 2) ;
         if ( isIns( )  )
         {
            A12240TotPorc = O12240TotPorc.add(A12237PrdPorc) ;
            n12240TotPorc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A12240TotPorc = O12240TotPorc.add(A12237PrdPorc).subtract(O12237PrdPorc) ;
               n12240TotPorc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A12240TotPorc = O12240TotPorc.subtract(O12237PrdPorc) ;
                  n12240TotPorc = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
               }
            }
         }
      }
   }

   public void endLevel1JG1699( )
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

   public void scanStart1JG1699( )
   {
      /* Scan By routine */
      /* Using cursor T01JG30 */
      pr_default.execute(24, new Object[] {A396EmprCod, A12236PrdNumD});
      RcdFound1699 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1699 = (short)(1) ;
         A719PrdNum = T01JG30_A719PrdNum[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1JG1699( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1699 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1699 = (short)(1) ;
         A719PrdNum = T01JG30_A719PrdNum[0] ;
      }
   }

   public void scanEnd1JG1699( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1JG1699( )
   {
      /* After Confirm Rules */
      if ( ( A12237PrdPorc.doubleValue() == 0 ) && true /* After */ )
      {
         GXCCtl = "PRDPORC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Porcentaje NO valido", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdPorc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1JG1699( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1JG1699( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1JG1699( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1JG1699( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1JG1699( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1JG1699( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPrdPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPorc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtPrdCal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCal_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1JG1699( )
   {
   }

   public void send_integrity_lvl_hashes1JG1698( )
   {
   }

   public void subsflControlProps_501699( )
   {
      edtavnRcdDeleted_1699_Internalname = "vNRCDDELETED_1699_"+sGXsfl_50_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_50_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_50_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_50_idx ;
      edtPrdPorc_Internalname = "PRDPORC_"+sGXsfl_50_idx ;
      edtPrdCal_Internalname = "PRDCAL_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501699( )
   {
      edtavnRcdDeleted_1699_Internalname = "vNRCDDELETED_1699_"+sGXsfl_50_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_50_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_50_fel_idx ;
      edtPrdPreAct_Internalname = "PRDPREACT_"+sGXsfl_50_fel_idx ;
      edtPrdPorc_Internalname = "PRDPORC_"+sGXsfl_50_fel_idx ;
      edtPrdCal_Internalname = "PRDCAL_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1JG1699( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501699( ) ;
      sendRow1JG1699( ) ;
   }

   public void sendRow1JG1699( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1699_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1699_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1699_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1699), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1699), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1699_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1699_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1699_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdPreAct_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1699_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPorc_Internalname,GXutil.ltrim( localUtil.ntoc( A12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPorc_Enabled!=0) ? localUtil.format( A12237PrdPorc, "ZZ9.99") : localUtil.format( A12237PrdPorc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdPorc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCal_Internalname,GXutil.ltrim( localUtil.ntoc( A12238PrdCal, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdCal_Enabled!=0) ? localUtil.format( A12238PrdCal, "ZZZZZZZ9.99999") : localUtil.format( A12238PrdCal, "ZZZZZZZ9.99999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdCal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1JG1699( ) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z12237PrdPorc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O12237PrdPorc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O12237PrdPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1699_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1699_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1699_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1699, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1699_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1699_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPORC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCal_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1JG1699( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501699( ) ;
      edtavnRcdDeleted_1699_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1699_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPreAct_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREACT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPorc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPORC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdCal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDCAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1699_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1699_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1699");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1699_Internalname ;
         wbErr = true ;
         nRcdDeleted_1699 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1699 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1699_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPorc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPorc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "PRDPORC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdPorc_Internalname ;
         wbErr = true ;
         A12237PrdPorc = DecimalUtil.ZERO ;
         n12237PrdPorc = false ;
      }
      else
      {
         A12237PrdPorc = localUtil.ctond( httpContext.cgiGet( edtPrdPorc_Internalname)) ;
         n12237PrdPorc = false ;
      }
      A12238PrdCal = localUtil.ctond( httpContext.cgiGet( edtPrdCal_Internalname)) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_50_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12237PrdPorc_" + sGXsfl_50_idx ;
      Z12237PrdPorc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O12237PrdPorc_" + sGXsfl_50_idx ;
      O12237PrdPorc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1699_" + sGXsfl_50_idx ;
      nRcdDeleted_1699 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1699_" + sGXsfl_50_idx ;
      nRcdExists_1699 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1699_" + sGXsfl_50_idx ;
      nIsMod_1699 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdNum_Enabled = edtPrdNum_Enabled ;
   }

   public void confirmValues1JG0( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501699( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501699( ) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z12237PrdPorc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z12237PrdPorc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12237PrdPorc_"+sGXsfl_50_idx) ;
      }
      httpContext.changePostValue( "O12237PrdPorc", httpContext.cgiGet( "T12237PrdPorc")) ;
      httpContext.deletePostValue( "T12237PrdPorc") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tprddis", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z12236PrdNumD", GXutil.rtrim( Z12236PrdNumD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12337PrdTrH2O", GXutil.rtrim( Z12337PrdTrH2O));
      app.GxWebStd.gx_hidden_field( httpContext, "O12240TotPorc", GXutil.ltrim( localUtil.ntoc( O12240TotPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV34Pgmname));
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
      return formatLink("app.tprddis", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPRDDIS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ficha Producto Disolucion", "") ;
   }

   public void initializeNonKey1JG1698( )
   {
      A12239PrdNomD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", A12239PrdNomD);
      A12240TotPorc = DecimalUtil.ZERO ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      A12337PrdTrH2O = httpContext.getMessage( "N", "") ;
      n12337PrdTrH2O = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", A12337PrdTrH2O);
      O12240TotPorc = A12240TotPorc ;
      n12240TotPorc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      Z12337PrdTrH2O = "" ;
   }

   public void initAll1JG1698( )
   {
      A12236PrdNumD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
      initializeNonKey1JG1698( ) ;
   }

   public void standaloneModalInsert( )
   {
      A12337PrdTrH2O = i12337PrdTrH2O ;
      n12337PrdTrH2O = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", A12337PrdTrH2O);
   }

   public void initializeNonKey1JG1699( )
   {
      A12238PrdCal = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A12237PrdPorc = DecimalUtil.ZERO ;
      n12237PrdPorc = false ;
      O12237PrdPorc = A12237PrdPorc ;
      n12237PrdPorc = false ;
      Z12237PrdPorc = DecimalUtil.ZERO ;
   }

   public void initAll1JG1699( )
   {
      A719PrdNum = "" ;
      initializeNonKey1JG1699( ) ;
   }

   public void standaloneModalInsert1JG1699( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241583432", true, true);
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
      httpContext.AddJavascriptSource("tprddis.js", "?20268241583432", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1699( )
   {
      edtPrdNum_Enabled = defedtPrdNum_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1699, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1699_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12237PrdPorc, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12238PrdCal, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdCal_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdNumD_Internalname = "PRDNUMD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrdNomD_Internalname = "PRDNOMD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtTotPorc_Internalname = "TOTPORC" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPrdTrH2O_Internalname = "PRDTRH2O" ;
      edtavnRcdDeleted_1699_Internalname = "vNRCDDELETED_1699" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdPorc_Internalname = "PRDPORC" ;
      edtPrdCal_Internalname = "PRDCAL" ;
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
      Form.setCaption( httpContext.getMessage( "Ficha Producto Disolucion", "") );
      edtPrdCal_Jsonclick = "" ;
      edtPrdPorc_Jsonclick = "" ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtavnRcdDeleted_1699_Jsonclick = "" ;
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
      edtPrdCal_Enabled = 0 ;
      edtPrdPorc_Enabled = 1 ;
      edtPrdPreAct_Enabled = 0 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtavnRcdDeleted_1699_Enabled = 1 ;
      edtPrdTrH2O_Jsonclick = "" ;
      edtPrdTrH2O_Backcolor = (int)(0xFFFFFF) ;
      edtPrdTrH2O_Enabled = 1 ;
      edtTotPorc_Jsonclick = "" ;
      edtTotPorc_Backcolor = (int)(0xFFFFFF) ;
      edtTotPorc_Enabled = 0 ;
      edtPrdNomD_Jsonclick = "" ;
      edtPrdNomD_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNomD_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNumD_Jsonclick = "" ;
      edtPrdNumD_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNumD_Enabled = 1 ;
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

   public void gx1asaprdnomd1JG1698( String A396EmprCod ,
                                     String A12236PrdNumD )
   {
      GXt_char1 = A12239PrdNomD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A12236PrdNumD ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprddis_impl.this.A396EmprCod = GXv_char4[0] ;
      tprddis_impl.this.A12236PrdNumD = GXv_char3[0] ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A12236PrdNumD", A12236PrdNumD);
      A12239PrdNomD = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", A12239PrdNomD);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12239PrdNomD))+"\"") ;
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
      subsflControlProps_501699( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1JG1699( ) ;
         standaloneModal1JG1699( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1JG1699( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501699( ) ;
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
      /* Using cursor T01JG31 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01JG31_A407EmprNom[0] ;
      n407EmprNom = T01JG31_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(25);
      /* Using cursor T01JG21 */
      pr_default.execute(15, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A12240TotPorc = T01JG21_A12240TotPorc[0] ;
         n12240TotPorc = T01JG21_n12240TotPorc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      else
      {
         A12240TotPorc = DecimalUtil.doubleToDec(0) ;
         n12240TotPorc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrimstr( A12240TotPorc, 6, 2));
      }
      pr_default.close(15);
      GX_FocusControl = edtPrdTrH2O_Internalname ;
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

   public void valid_Prdnumd( )
   {
      n12337PrdTrH2O = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01JG21 */
      pr_default.execute(15, new Object[] {A396EmprCod, A12236PrdNumD});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A12240TotPorc = T01JG21_A12240TotPorc[0] ;
         n12240TotPorc = T01JG21_n12240TotPorc[0] ;
      }
      else
      {
         A12240TotPorc = DecimalUtil.doubleToDec(0) ;
         n12240TotPorc = false ;
      }
      pr_default.close(15);
      GXt_char1 = A12239PrdNomD ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A12236PrdNumD ;
      GXv_char2[0] = GXt_char1 ;
      new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      tprddis_impl.this.A396EmprCod = GXv_char4[0] ;
      tprddis_impl.this.A12236PrdNumD = GXv_char3[0] ;
      tprddis_impl.this.GXt_char1 = GXv_char2[0] ;
      A12239PrdNomD = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12337PrdTrH2O", GXutil.rtrim( A12337PrdTrH2O));
      httpContext.ajax_rsp_assign_attri("", false, "A12240TotPorc", GXutil.ltrim( localUtil.ntoc( A12240TotPorc, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12239PrdNomD", GXutil.rtrim( A12239PrdNomD));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12236PrdNumD", GXutil.rtrim( Z12236PrdNumD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12337PrdTrH2O", GXutil.rtrim( Z12337PrdTrH2O));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12240TotPorc", GXutil.ltrim( localUtil.ntoc( Z12240TotPorc, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12239PrdNomD", GXutil.rtrim( Z12239PrdNomD));
      httpContext.ajax_rsp_assign_attri("", false, "O12240TotPorc", GXutil.ltrim( localUtil.ntoc( O12240TotPorc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdnum( )
   {
      /* Using cursor T01JG29 */
      pr_default.execute(23, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01JG29_A718PrdNom[0] ;
      A724PrdPreAct = T01JG29_A724PrdPreAct[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
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
      setEventMetadata("VALID_PRDNUMD","{handler:'valid_Prdnumd',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12236PrdNumD',fld:'PRDNUMD',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A12337PrdTrH2O',fld:'PRDTRH2O',pic:''}]");
      setEventMetadata("VALID_PRDNUMD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12337PrdTrH2O',fld:'PRDTRH2O',pic:''},{av:'A12240TotPorc',fld:'TOTPORC',pic:'ZZ9.99'},{av:'A12239PrdNomD',fld:'PRDNOMD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z12236PrdNumD'},{av:'Z407EmprNom'},{av:'Z12337PrdTrH2O'},{av:'Z12240TotPorc'},{av:'Z12239PrdNomD'},{av:'O12240TotPorc'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_PRDNOMD","{handler:'valid_Prdnomd',iparms:[]");
      setEventMetadata("VALID_PRDNOMD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_PRDPORC","{handler:'valid_Prdporc',iparms:[]");
      setEventMetadata("VALID_PRDPORC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prdcal',iparms:[]");
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
      pr_default.close(25);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z12236PrdNumD = "" ;
      Z12337PrdTrH2O = "" ;
      O12240TotPorc = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z12237PrdPorc = DecimalUtil.ZERO ;
      O12237PrdPorc = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A12236PrdNumD = "" ;
      A719PrdNum = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      A12239PrdNomD = "" ;
      lblTextblock5_Jsonclick = "" ;
      A12240TotPorc = DecimalUtil.ZERO ;
      lblTextblock6_Jsonclick = "" ;
      A12337PrdTrH2O = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B12240TotPorc = DecimalUtil.ZERO ;
      sMode1699 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV34Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode1698 = "" ;
      s12240TotPorc = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A12237PrdPorc = DecimalUtil.ZERO ;
      A12238PrdCal = DecimalUtil.ZERO ;
      T12237PrdPorc = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z12240TotPorc = DecimalUtil.ZERO ;
      T01JG7_A407EmprNom = new String[] {""} ;
      T01JG7_n407EmprNom = new boolean[] {false} ;
      T01JG11_A12236PrdNumD = new String[] {""} ;
      T01JG11_A407EmprNom = new String[] {""} ;
      T01JG11_n407EmprNom = new boolean[] {false} ;
      T01JG11_A12337PrdTrH2O = new String[] {""} ;
      T01JG11_n12337PrdTrH2O = new boolean[] {false} ;
      T01JG11_A396EmprCod = new String[] {""} ;
      T01JG11_A12240TotPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG11_n12240TotPorc = new boolean[] {false} ;
      T01JG9_A12240TotPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG9_n12240TotPorc = new boolean[] {false} ;
      T01JG13_A12240TotPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG13_n12240TotPorc = new boolean[] {false} ;
      T01JG14_A396EmprCod = new String[] {""} ;
      T01JG14_A12236PrdNumD = new String[] {""} ;
      T01JG6_A12236PrdNumD = new String[] {""} ;
      T01JG6_A12337PrdTrH2O = new String[] {""} ;
      T01JG6_n12337PrdTrH2O = new boolean[] {false} ;
      T01JG6_A396EmprCod = new String[] {""} ;
      T01JG15_A396EmprCod = new String[] {""} ;
      T01JG15_A12236PrdNumD = new String[] {""} ;
      T01JG16_A396EmprCod = new String[] {""} ;
      T01JG16_A12236PrdNumD = new String[] {""} ;
      T01JG5_A12236PrdNumD = new String[] {""} ;
      T01JG5_A12337PrdTrH2O = new String[] {""} ;
      T01JG5_n12337PrdTrH2O = new boolean[] {false} ;
      T01JG5_A396EmprCod = new String[] {""} ;
      T01JG21_A12240TotPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG21_n12240TotPorc = new boolean[] {false} ;
      T01JG22_A396EmprCod = new String[] {""} ;
      T01JG22_A12236PrdNumD = new String[] {""} ;
      Z718PrdNom = "" ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      T01JG23_A12236PrdNumD = new String[] {""} ;
      T01JG23_A718PrdNom = new String[] {""} ;
      T01JG23_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG23_A12237PrdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG23_n12237PrdPorc = new boolean[] {false} ;
      T01JG23_A396EmprCod = new String[] {""} ;
      T01JG23_A719PrdNum = new String[] {""} ;
      T01JG4_A718PrdNom = new String[] {""} ;
      T01JG4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG24_A718PrdNom = new String[] {""} ;
      T01JG24_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG25_A396EmprCod = new String[] {""} ;
      T01JG25_A12236PrdNumD = new String[] {""} ;
      T01JG25_A719PrdNum = new String[] {""} ;
      T01JG3_A12236PrdNumD = new String[] {""} ;
      T01JG3_A12237PrdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG3_n12237PrdPorc = new boolean[] {false} ;
      T01JG3_A396EmprCod = new String[] {""} ;
      T01JG3_A719PrdNum = new String[] {""} ;
      T01JG2_A12236PrdNumD = new String[] {""} ;
      T01JG2_A12237PrdPorc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG2_n12237PrdPorc = new boolean[] {false} ;
      T01JG2_A396EmprCod = new String[] {""} ;
      T01JG2_A719PrdNum = new String[] {""} ;
      T01JG29_A718PrdNom = new String[] {""} ;
      T01JG29_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01JG30_A396EmprCod = new String[] {""} ;
      T01JG30_A12236PrdNumD = new String[] {""} ;
      T01JG30_A719PrdNum = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i12337PrdTrH2O = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01JG31_A407EmprNom = new String[] {""} ;
      T01JG31_n407EmprNom = new boolean[] {false} ;
      Z12239PrdNomD = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZZ396EmprCod = "" ;
      ZZ12236PrdNumD = "" ;
      ZZ407EmprNom = "" ;
      ZZ12337PrdTrH2O = "" ;
      ZZ12240TotPorc = DecimalUtil.ZERO ;
      ZZ12239PrdNomD = "" ;
      ZO12240TotPorc = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprddis__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprddis__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprddis__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprddis__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprddis__default(),
         new Object[] {
             new Object[] {
            T01JG2_A12236PrdNumD, T01JG2_A12237PrdPorc, T01JG2_n12237PrdPorc, T01JG2_A396EmprCod, T01JG2_A719PrdNum
            }
            , new Object[] {
            T01JG3_A12236PrdNumD, T01JG3_A12237PrdPorc, T01JG3_n12237PrdPorc, T01JG3_A396EmprCod, T01JG3_A719PrdNum
            }
            , new Object[] {
            T01JG4_A718PrdNom, T01JG4_A724PrdPreAct
            }
            , new Object[] {
            T01JG5_A12236PrdNumD, T01JG5_A12337PrdTrH2O, T01JG5_n12337PrdTrH2O, T01JG5_A396EmprCod
            }
            , new Object[] {
            T01JG6_A12236PrdNumD, T01JG6_A12337PrdTrH2O, T01JG6_n12337PrdTrH2O, T01JG6_A396EmprCod
            }
            , new Object[] {
            T01JG7_A407EmprNom, T01JG7_n407EmprNom
            }
            , new Object[] {
            T01JG9_A12240TotPorc, T01JG9_n12240TotPorc
            }
            , new Object[] {
            T01JG11_A12236PrdNumD, T01JG11_A407EmprNom, T01JG11_n407EmprNom, T01JG11_A12337PrdTrH2O, T01JG11_n12337PrdTrH2O, T01JG11_A396EmprCod, T01JG11_A12240TotPorc, T01JG11_n12240TotPorc
            }
            , new Object[] {
            T01JG13_A12240TotPorc, T01JG13_n12240TotPorc
            }
            , new Object[] {
            T01JG14_A396EmprCod, T01JG14_A12236PrdNumD
            }
            , new Object[] {
            T01JG15_A396EmprCod, T01JG15_A12236PrdNumD
            }
            , new Object[] {
            T01JG16_A396EmprCod, T01JG16_A12236PrdNumD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JG21_A12240TotPorc, T01JG21_n12240TotPorc
            }
            , new Object[] {
            T01JG22_A396EmprCod, T01JG22_A12236PrdNumD
            }
            , new Object[] {
            T01JG23_A12236PrdNumD, T01JG23_A718PrdNom, T01JG23_A724PrdPreAct, T01JG23_A12237PrdPorc, T01JG23_n12237PrdPorc, T01JG23_A396EmprCod, T01JG23_A719PrdNum
            }
            , new Object[] {
            T01JG24_A718PrdNom, T01JG24_A724PrdPreAct
            }
            , new Object[] {
            T01JG25_A396EmprCod, T01JG25_A12236PrdNumD, T01JG25_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01JG29_A718PrdNom, T01JG29_A724PrdPreAct
            }
            , new Object[] {
            T01JG30_A396EmprCod, T01JG30_A12236PrdNumD, T01JG30_A719PrdNum
            }
            , new Object[] {
            T01JG31_A407EmprNom, T01JG31_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV34Pgmname = "TPRDDIS" ;
      Z12337PrdTrH2O = httpContext.getMessage( "N", "") ;
      n12337PrdTrH2O = false ;
      A12337PrdTrH2O = httpContext.getMessage( "N", "") ;
      n12337PrdTrH2O = false ;
      i12337PrdTrH2O = httpContext.getMessage( "N", "") ;
      n12337PrdTrH2O = false ;
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
   private short nRcdDeleted_1699 ;
   private short nRcdExists_1699 ;
   private short nIsMod_1699 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1699 ;
   private short RcdFound1699 ;
   private short nBlankRcdUsr1699 ;
   private short RcdFound1698 ;
   private short nIsDirty_1698 ;
   private short nIsDirty_1699 ;
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
   private int edtPrdNumD_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdNomD_Enabled ;
   private int edtTotPorc_Enabled ;
   private int edtPrdTrH2O_Enabled ;
   private int edtavnRcdDeleted_1699_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdPorc_Enabled ;
   private int edtPrdCal_Enabled ;
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
   private int defedtPrdNum_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPrdTrH2O_Backcolor ;
   private int edtTotPorc_Backcolor ;
   private int edtPrdNomD_Backcolor ;
   private int edtPrdNumD_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal O12240TotPorc ;
   private java.math.BigDecimal Z12237PrdPorc ;
   private java.math.BigDecimal O12237PrdPorc ;
   private java.math.BigDecimal A12240TotPorc ;
   private java.math.BigDecimal B12240TotPorc ;
   private java.math.BigDecimal s12240TotPorc ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A12237PrdPorc ;
   private java.math.BigDecimal A12238PrdCal ;
   private java.math.BigDecimal T12237PrdPorc ;
   private java.math.BigDecimal Z12240TotPorc ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal ZZ12240TotPorc ;
   private java.math.BigDecimal ZO12240TotPorc ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z12236PrdNumD ;
   private String Z12337PrdTrH2O ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A12236PrdNumD ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNumD_Internalname ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtPrdNumD_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrdNomD_Internalname ;
   private String A12239PrdNomD ;
   private String edtPrdNomD_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtTotPorc_Internalname ;
   private String edtTotPorc_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPrdTrH2O_Internalname ;
   private String A12337PrdTrH2O ;
   private String edtPrdTrH2O_Jsonclick ;
   private String sMode1699 ;
   private String edtavnRcdDeleted_1699_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPorc_Internalname ;
   private String edtPrdCal_Internalname ;
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
   private String AV34Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode1698 ;
   private String GXCCtl ;
   private String A718PrdNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1699_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdPorc_Jsonclick ;
   private String edtPrdCal_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i12337PrdTrH2O ;
   private String subGrid1_Header ;
   private String Z12239PrdNomD ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ12236PrdNumD ;
   private String ZZ407EmprNom ;
   private String ZZ12337PrdTrH2O ;
   private String ZZ12239PrdNomD ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12240TotPorc ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12337PrdTrH2O ;
   private boolean returnInSub ;
   private boolean n12237PrdPorc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01JG7_A407EmprNom ;
   private boolean[] T01JG7_n407EmprNom ;
   private String[] T01JG11_A12236PrdNumD ;
   private String[] T01JG11_A407EmprNom ;
   private boolean[] T01JG11_n407EmprNom ;
   private String[] T01JG11_A12337PrdTrH2O ;
   private boolean[] T01JG11_n12337PrdTrH2O ;
   private String[] T01JG11_A396EmprCod ;
   private java.math.BigDecimal[] T01JG11_A12240TotPorc ;
   private boolean[] T01JG11_n12240TotPorc ;
   private java.math.BigDecimal[] T01JG9_A12240TotPorc ;
   private boolean[] T01JG9_n12240TotPorc ;
   private java.math.BigDecimal[] T01JG13_A12240TotPorc ;
   private boolean[] T01JG13_n12240TotPorc ;
   private String[] T01JG14_A396EmprCod ;
   private String[] T01JG14_A12236PrdNumD ;
   private String[] T01JG6_A12236PrdNumD ;
   private String[] T01JG6_A12337PrdTrH2O ;
   private boolean[] T01JG6_n12337PrdTrH2O ;
   private String[] T01JG6_A396EmprCod ;
   private String[] T01JG15_A396EmprCod ;
   private String[] T01JG15_A12236PrdNumD ;
   private String[] T01JG16_A396EmprCod ;
   private String[] T01JG16_A12236PrdNumD ;
   private String[] T01JG5_A12236PrdNumD ;
   private String[] T01JG5_A12337PrdTrH2O ;
   private boolean[] T01JG5_n12337PrdTrH2O ;
   private String[] T01JG5_A396EmprCod ;
   private java.math.BigDecimal[] T01JG21_A12240TotPorc ;
   private boolean[] T01JG21_n12240TotPorc ;
   private String[] T01JG22_A396EmprCod ;
   private String[] T01JG22_A12236PrdNumD ;
   private String[] T01JG23_A12236PrdNumD ;
   private String[] T01JG23_A718PrdNom ;
   private java.math.BigDecimal[] T01JG23_A724PrdPreAct ;
   private java.math.BigDecimal[] T01JG23_A12237PrdPorc ;
   private boolean[] T01JG23_n12237PrdPorc ;
   private String[] T01JG23_A396EmprCod ;
   private String[] T01JG23_A719PrdNum ;
   private String[] T01JG4_A718PrdNom ;
   private java.math.BigDecimal[] T01JG4_A724PrdPreAct ;
   private String[] T01JG24_A718PrdNom ;
   private java.math.BigDecimal[] T01JG24_A724PrdPreAct ;
   private String[] T01JG25_A396EmprCod ;
   private String[] T01JG25_A12236PrdNumD ;
   private String[] T01JG25_A719PrdNum ;
   private String[] T01JG3_A12236PrdNumD ;
   private java.math.BigDecimal[] T01JG3_A12237PrdPorc ;
   private boolean[] T01JG3_n12237PrdPorc ;
   private String[] T01JG3_A396EmprCod ;
   private String[] T01JG3_A719PrdNum ;
   private String[] T01JG2_A12236PrdNumD ;
   private java.math.BigDecimal[] T01JG2_A12237PrdPorc ;
   private boolean[] T01JG2_n12237PrdPorc ;
   private String[] T01JG2_A396EmprCod ;
   private String[] T01JG2_A719PrdNum ;
   private String[] T01JG29_A718PrdNom ;
   private java.math.BigDecimal[] T01JG29_A724PrdPreAct ;
   private String[] T01JG30_A396EmprCod ;
   private String[] T01JG30_A12236PrdNumD ;
   private String[] T01JG30_A719PrdNum ;
   private String[] T01JG31_A407EmprNom ;
   private boolean[] T01JG31_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprddis__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprddis__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprddis__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprddis__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprddis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01JG2", "SELECT PrdNumD, PrdPorc, EmprCod, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNumD = ? AND PrdNum = ?  FOR UPDATE OF PrdPorc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG3", "SELECT PrdNumD, PrdPorc, EmprCod, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNumD = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG4", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG5", "SELECT PrdNumD, PrdTrH2O, EmprCod FROM TXPPRDDIS WHERE EmprCod = ? AND PrdNumD = ?  FOR UPDATE OF PrdTrH2O NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG6", "SELECT PrdNumD, PrdTrH2O, EmprCod FROM TXPPRDDIS WHERE EmprCod = ? AND PrdNumD = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG9", "SELECT COALESCE( T1.TotPorc, 0) AS TotPorc FROM (SELECT SUM(PrdPorc) AS TotPorc, EmprCod, PrdNumD FROM TXPPRDDI1 GROUP BY EmprCod, PrdNumD ) T1 WHERE T1.EmprCod = ? AND T1.PrdNumD = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG11", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNumD, T2.EmprNom, TM1.PrdTrH2O, TM1.EmprCod, COALESCE( T3.TotPorc, 0) AS TotPorc FROM ((TXPPRDDIS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(PrdPorc) AS TotPorc, EmprCod, PrdNumD FROM TXPPRDDI1 GROUP BY EmprCod, PrdNumD ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNumD = TM1.PrdNumD) WHERE TM1.EmprCod = ? and TM1.PrdNumD = ? ORDER BY TM1.EmprCod, TM1.PrdNumD ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG13", "SELECT COALESCE( T1.TotPorc, 0) AS TotPorc FROM (SELECT SUM(PrdPorc) AS TotPorc, EmprCod, PrdNumD FROM TXPPRDDI1 GROUP BY EmprCod, PrdNumD ) T1 WHERE T1.EmprCod = ? AND T1.PrdNumD = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNumD FROM TXPPRDDIS WHERE EmprCod = ? AND PrdNumD = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNumD FROM TXPPRDDIS WHERE ( PrdNumD > ?) and EmprCod = ? ORDER BY EmprCod, PrdNumD) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01JG16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNumD FROM TXPPRDDIS WHERE ( PrdNumD < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNumD DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01JG17", "INSERT INTO TXPPRDDIS(PrdNumD, PrdTrH2O, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPPRDDIS")
         ,new UpdateCursor("T01JG18", "UPDATE TXPPRDDIS SET PrdTrH2O=?  WHERE EmprCod = ? AND PrdNumD = ?", GX_NOMASK, "TXPPRDDIS")
         ,new UpdateCursor("T01JG19", "DELETE FROM TXPPRDDIS  WHERE EmprCod = ? AND PrdNumD = ?", GX_NOMASK, "TXPPRDDIS")
         ,new ForEachCursor("T01JG21", "SELECT COALESCE( T1.TotPorc, 0) AS TotPorc FROM (SELECT SUM(PrdPorc) AS TotPorc, EmprCod, PrdNumD FROM TXPPRDDI1 GROUP BY EmprCod, PrdNumD ) T1 WHERE T1.EmprCod = ? AND T1.PrdNumD = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG22", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNumD FROM TXPPRDDIS WHERE EmprCod = ? ORDER BY EmprCod, PrdNumD ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG23", "SELECT T1.PrdNumD, T2.PrdNom, T2.PrdPreAct, T1.PrdPorc, T1.EmprCod, T1.PrdNum FROM (TXPPRDDI1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.PrdNumD = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNumD, T1.PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG24", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG25", "SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNumD = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01JG26", "INSERT INTO TXPPRDDI1(PrdNumD, PrdPorc, EmprCod, PrdNum) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPPRDDI1")
         ,new UpdateCursor("T01JG27", "UPDATE TXPPRDDI1 SET PrdPorc=?  WHERE EmprCod = ? AND PrdNumD = ? AND PrdNum = ?", GX_NOMASK, "TXPPRDDI1")
         ,new UpdateCursor("T01JG28", "DELETE FROM TXPPRDDI1  WHERE EmprCod = ? AND PrdNumD = ? AND PrdNum = ?", GX_NOMASK, "TXPPRDDI1")
         ,new ForEachCursor("T01JG29", "SELECT PrdNom, PrdPreAct FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG30", "SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? and PrdNumD = ? ORDER BY EmprCod, PrdNumD, PrdNum ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01JG31", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 8 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 25 :
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 6);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 2);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 21 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

