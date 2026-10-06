package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tccalm_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
         n3345TipMovCc = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A3345TipMovCc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8908CC_AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCod"))) ;
         n8908CC_AlmCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A8908CC_AlmCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A8908CC_AlmCod = (byte)(GXutil.lval( httpContext.GetPar( "CC_AlmCod"))) ;
         n8908CC_AlmCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A719PrdNum, A8908CC_AlmCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CUENTA CORRIENTE ALMACENES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtPrdNum_Internalname ;
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

   public tccalm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tccalm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tccalm_impl.class ));
   }

   public tccalm_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCCALM.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Ultima Linea", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCC_Ultln_Internalname, GXutil.ltrim( localUtil.ntoc( A8910CC_Ultln, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCC_Ultln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8910CC_Ultln), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8910CC_Ultln), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCC_Ultln_Jsonclick, 0, "", "", "", "", "", 1, edtCC_Ultln_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCCALM.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCCALM.htm");
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
         nBlankRcdCount1212 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1212 = (short)(1) ;
            scanStart1371212( ) ;
            while ( RcdFound1212 != 0 )
            {
               init_level_properties1212( ) ;
               getByPrimaryKey1371212( ) ;
               addRow1371212( ) ;
               scanNext1371212( ) ;
            }
            scanEnd1371212( ) ;
            nBlankRcdCount1212 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1371212( ) ;
         standaloneModal1371212( ) ;
         sMode1212 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow1371212( ) ;
            edtavnRcdDeleted_1212_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1212_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1212_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1212_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_LIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Fech_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_FECH_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Fech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Fech_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_USU_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Usu_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Term_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_TERM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Term_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_CANT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Cant_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_AlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_AlmDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMDSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTipMovCc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPMOVCC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtTipMovCn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPMOVCN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipMovCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_DESC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Desc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Prec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_PREC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Prec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Prec_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_NumAlb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_NUMALB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_NumAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_NumAlb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_HDR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_HDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_HDR_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Hdr1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Hdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Hdr1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Hdr2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Hdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Hdr2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtCC_Hdr3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCC_Hdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Hdr3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_1212 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1371212( ) ;
            }
            sendRow1371212( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode1212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1212 = (short)(5) ;
         nRcdExists_1212 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1371212( ) ;
            while ( RcdFound1212 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_501212( ) ;
               init_level_properties1212( ) ;
               standaloneNotModal1371212( ) ;
               getByPrimaryKey1371212( ) ;
               standaloneModal1371212( ) ;
               addRow1371212( ) ;
               scanNext1371212( ) ;
            }
            scanEnd1371212( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1212 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_501212( ) ;
      initAll1371212( ) ;
      init_level_properties1212( ) ;
      nRcdExists_1212 = (short)(0) ;
      nIsMod_1212 = (short)(0) ;
      nRcdDeleted_1212 = (short)(0) ;
      nBlankRcdCount1212 = (short)(nBlankRcdUsr1212+nBlankRcdCount1212) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1212 > 0 )
      {
         standaloneNotModal1371212( ) ;
         standaloneModal1371212( ) ;
         addRow1371212( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtCC_Lin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1212 = (short)(nBlankRcdCount1212-1) ;
      }
      Gx_mode = sMode1212 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCCALM.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCCALM.htm");
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
      e111372 ();
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
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            Z8910CC_Ultln = localUtil.ctol( httpContext.cgiGet( "Z8910CC_Ultln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
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
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Ultln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Ultln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CC_ULTLN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCC_Ultln_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8910CC_Ultln = 0 ;
               n8910CC_Ultln = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8910CC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8910CC_Ultln), 12, 0));
            }
            else
            {
               A8910CC_Ultln = localUtil.ctol( httpContext.cgiGet( edtCC_Ultln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               n8910CC_Ultln = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A8910CC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8910CC_Ultln), 12, 0));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdExiCC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A705PrdExiCC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
            }
            else
            {
               A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
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
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
                        e111372 ();
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
            initAll13729( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1212_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1212_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      disableAttributes13729( ) ;
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

   public void confirm_1370( )
   {
      beforeValidate13729( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13729( ) ;
         }
         else
         {
            checkExtendedTable13729( ) ;
            if ( AnyError == 0 )
            {
               zm13729( 2) ;
            }
            closeExtendedTableCursors13729( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1371212( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode29 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1370( ) ;
      }
   }

   public void confirm_1371212( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1371212( ) ;
         if ( ( nRcdExists_1212 != 0 ) || ( nIsMod_1212 != 0 ) )
         {
            getKey1371212( ) ;
            if ( ( nRcdExists_1212 == 0 ) && ( nRcdDeleted_1212 == 0 ) )
            {
               if ( RcdFound1212 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1371212( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1371212( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1371212( 4) ;
                        zm1371212( 5) ;
                        zm1371212( 6) ;
                     }
                     closeExtendedTableCursors1371212( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CC_LIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCC_Lin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1212 != 0 )
               {
                  if ( nRcdDeleted_1212 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1371212( ) ;
                     load1371212( ) ;
                     beforeValidate1371212( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1371212( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1212 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1371212( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1371212( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1371212( 4) ;
                              zm1371212( 5) ;
                              zm1371212( 6) ;
                           }
                           closeExtendedTableCursors1371212( ) ;
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
                  if ( nRcdDeleted_1212 == 0 )
                  {
                     GXCCtl = "CC_LIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCC_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1212_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A8911CC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Fech_Internalname, localUtil.ttoc( A8912CC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtCC_Usu_Internalname, GXutil.rtrim( A8913CC_Usu)) ;
         httpContext.changePostValue( edtCC_Term_Internalname, GXutil.rtrim( A8914CC_Term)) ;
         httpContext.changePostValue( edtCC_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A8915CC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmDsc_Internalname, GXutil.rtrim( A8909CC_AlmDsc)) ;
         httpContext.changePostValue( edtTipMovCc_Internalname, GXutil.rtrim( A3345TipMovCc)) ;
         httpContext.changePostValue( edtTipMovCn_Internalname, GXutil.rtrim( A3346TipMovCn)) ;
         httpContext.changePostValue( edtCC_Desc_Internalname, GXutil.rtrim( A8916CC_Desc)) ;
         httpContext.changePostValue( edtCC_Prec_Internalname, GXutil.ltrim( localUtil.ntoc( A8917CC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_NumAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A8927CC_NumAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_HDR_Internalname, GXutil.rtrim( A8930CC_HDR)) ;
         httpContext.changePostValue( edtCC_Hdr1_Internalname, GXutil.ltrim( localUtil.ntoc( A8931CC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Hdr2_Internalname, GXutil.ltrim( localUtil.ntoc( A8932CC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Hdr3_Internalname, GXutil.rtrim( A8933CC_Hdr3)) ;
         httpContext.changePostValue( "ZT_"+"Z8911CC_Lin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8911CC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8912CC_Fech_"+sGXsfl_50_idx, localUtil.ttoc( Z8912CC_Fech, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8913CC_Usu_"+sGXsfl_50_idx, GXutil.rtrim( Z8913CC_Usu)) ;
         httpContext.changePostValue( "ZT_"+"Z8914CC_Term_"+sGXsfl_50_idx, GXutil.rtrim( Z8914CC_Term)) ;
         httpContext.changePostValue( "ZT_"+"Z8915CC_Cant_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8915CC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8916CC_Desc_"+sGXsfl_50_idx, GXutil.rtrim( Z8916CC_Desc)) ;
         httpContext.changePostValue( "ZT_"+"Z8917CC_Prec_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8917CC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8927CC_NumAlb_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8927CC_NumAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8930CC_HDR_"+sGXsfl_50_idx, GXutil.rtrim( Z8930CC_HDR)) ;
         httpContext.changePostValue( "ZT_"+"Z8931CC_Hdr1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8931CC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8932CC_Hdr2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8932CC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8933CC_Hdr3_"+sGXsfl_50_idx, GXutil.rtrim( Z8933CC_Hdr3)) ;
         httpContext.changePostValue( "ZT_"+"Z3345TipMovCc_"+sGXsfl_50_idx, GXutil.rtrim( Z3345TipMovCc)) ;
         httpContext.changePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1212_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1212_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1212_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1212 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1212_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1212_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_FECH_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Fech_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_USU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_TERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Term_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_CANT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPMOVCC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPMOVCN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_DESC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_PREC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Prec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_NUMALB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_NumAlb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_HDR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1370( )
   {
   }

   public void e111372( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tccalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      tccalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tccalm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV15Lit3 = httpContext.getMessage( "Producto", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      AV16Lit4 = httpContext.getMessage( "Exis CC", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tccalm_impl.this.A396EmprCod = GXv_char2[0] ;
      tccalm_impl.this.AV11EmprNom = GXv_char3[0] ;
      tccalm_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm13729( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T01378_A718PrdNom[0] ;
            Z8910CC_Ultln = T01378_A8910CC_Ultln[0] ;
            Z705PrdExiCC = T01378_A705PrdExiCC[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
            Z8910CC_Ultln = A8910CC_Ultln ;
            Z705PrdExiCC = A705PrdExiCC ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z8910CC_Ultln = A8910CC_Ultln ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "TCCALM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T01379 */
      pr_default.execute(7, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01379_A407EmprNom[0] ;
      n407EmprNom = T01379_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void load13729( )
   {
      /* Using cursor T013710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T013710_A407EmprNom[0] ;
         n407EmprNom = T013710_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T013710_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A8910CC_Ultln = T013710_A8910CC_Ultln[0] ;
         n8910CC_Ultln = T013710_n8910CC_Ultln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8910CC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8910CC_Ultln), 12, 0));
         A705PrdExiCC = T013710_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         zm13729( -1) ;
      }
      pr_default.close(8);
      onLoadActions13729( ) ;
   }

   public void onLoadActions13729( )
   {
   }

   public void checkExtendedTable13729( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors13729( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey13729( )
   {
      /* Using cursor T013711 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01378 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) && ( GXutil.strcmp(T01378_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm13729( 1) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01378_A719PrdNum[0] ;
         n719PrdNum = T01378_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T01378_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A8910CC_Ultln = T01378_A8910CC_Ultln[0] ;
         n8910CC_Ultln = T01378_n8910CC_Ultln[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8910CC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8910CC_Ultln), 12, 0));
         A705PrdExiCC = T01378_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load13729( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey13729( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey13729( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(6);
   }

   public void getEqualNoModal( )
   {
      getKey13729( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T013712 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T013712_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T013712_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T013712_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T013712_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T013712_A719PrdNum[0] ;
            n719PrdNum = T013712_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T013713 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T013713_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T013713_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T013713_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T013713_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T013713_A719PrdNum[0] ;
            n719PrdNum = T013713_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13729( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13729( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update13729( ) ;
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtPrdNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13729( ) ;
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
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13729( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtPrdNum_Internalname ;
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
      getKey13729( ) ;
      if ( RcdFound29 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
         {
            A719PrdNum = Z719PrdNum ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tccalm");
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1370( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart13729( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13729( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      scanStart13729( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext13729( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd13729( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency13729( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01377 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(5) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(5) == 101) || ( GXutil.strcmp(Z718PrdNom, T01377_A718PrdNom[0]) != 0 ) || ( Z8910CC_Ultln != T01377_A8910CC_Ultln[0] ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T01377_A705PrdExiCC[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01377_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01377_A718PrdNom[0]);
            }
            if ( Z8910CC_Ultln != T01377_A8910CC_Ultln[0] )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Ultln");
               GXutil.writeLogRaw("Old: ",Z8910CC_Ultln);
               GXutil.writeLogRaw("Current: ",T01377_A8910CC_Ultln[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T01377_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T01377_A705PrdExiCC[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13729( )
   {
      beforeValidate13729( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13729( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13729( 0) ;
         checkOptimisticConcurrency13729( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13729( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13729( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013714 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, Boolean.valueOf(n8910CC_Ultln), Long.valueOf(A8910CC_Ultln), A705PrdExiCC, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel13729( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1370( ) ;
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
            load13729( ) ;
         }
         endLevel13729( ) ;
      }
      closeExtendedTableCursors13729( ) ;
   }

   public void update13729( )
   {
      beforeValidate13729( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13729( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13729( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13729( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13729( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013715 */
                  pr_default.execute(13, new Object[] {A718PrdNom, Boolean.valueOf(n8910CC_Ultln), Long.valueOf(A8910CC_Ultln), A705PrdExiCC, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13729( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel13729( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1370( ) ;
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
         endLevel13729( ) ;
      }
      closeExtendedTableCursors13729( ) ;
   }

   public void deferredUpdate13729( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate13729( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13729( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13729( ) ;
         afterConfirm13729( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13729( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013716 */
               pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound29 == 0 )
                     {
                        initAll13729( ) ;
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
                     resetCaption1370( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13729( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13729( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T013717 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T013718 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T013719 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T013720 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T013721 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T013722 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T013723 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T013724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T013725 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T013726 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T013727 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T013728 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T013729 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T013730 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T013731 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T013732 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T013733 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T013734 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T013735 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T013736 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T013737 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T013738 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T013739 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T013740 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T013741 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T013742 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T013743 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T013744 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T013745 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T013746 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T013747 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T013748 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T013749 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T013750 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T013751 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T013752 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T013753 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T013754 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T013755 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T013756 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T013757 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T013758 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T013759 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T013760 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T013761 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T013762 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T013763 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T013764 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T013765 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T013766 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T013767 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T013768 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T013769 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T013770 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T013771 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T013772 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T013773 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T013774 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T013775 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T013776 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T013777 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T013778 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T013779 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T013780 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T013781 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T013782 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T013783 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T013784 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T013785 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T013786 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T013787 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T013788 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T013789 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
      }
   }

   public void processNestedLevel1371212( )
   {
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow1371212( ) ;
         if ( ( nRcdExists_1212 != 0 ) || ( nIsMod_1212 != 0 ) )
         {
            standaloneNotModal1371212( ) ;
            getKey1371212( ) ;
            if ( ( nRcdExists_1212 == 0 ) && ( nRcdDeleted_1212 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1371212( ) ;
            }
            else
            {
               if ( RcdFound1212 != 0 )
               {
                  if ( ( nRcdDeleted_1212 != 0 ) && ( nRcdExists_1212 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1371212( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1212 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1371212( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1212 == 0 )
                  {
                     GXCCtl = "CC_LIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCC_Lin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1212_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Lin_Internalname, GXutil.ltrim( localUtil.ntoc( A8911CC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Fech_Internalname, localUtil.ttoc( A8912CC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtCC_Usu_Internalname, GXutil.rtrim( A8913CC_Usu)) ;
         httpContext.changePostValue( edtCC_Term_Internalname, GXutil.rtrim( A8914CC_Term)) ;
         httpContext.changePostValue( edtCC_Cant_Internalname, GXutil.ltrim( localUtil.ntoc( A8915CC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmCod_Internalname, GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_AlmDsc_Internalname, GXutil.rtrim( A8909CC_AlmDsc)) ;
         httpContext.changePostValue( edtTipMovCc_Internalname, GXutil.rtrim( A3345TipMovCc)) ;
         httpContext.changePostValue( edtTipMovCn_Internalname, GXutil.rtrim( A3346TipMovCn)) ;
         httpContext.changePostValue( edtCC_Desc_Internalname, GXutil.rtrim( A8916CC_Desc)) ;
         httpContext.changePostValue( edtCC_Prec_Internalname, GXutil.ltrim( localUtil.ntoc( A8917CC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_NumAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A8927CC_NumAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_HDR_Internalname, GXutil.rtrim( A8930CC_HDR)) ;
         httpContext.changePostValue( edtCC_Hdr1_Internalname, GXutil.ltrim( localUtil.ntoc( A8931CC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Hdr2_Internalname, GXutil.ltrim( localUtil.ntoc( A8932CC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCC_Hdr3_Internalname, GXutil.rtrim( A8933CC_Hdr3)) ;
         httpContext.changePostValue( "ZT_"+"Z8911CC_Lin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8911CC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8912CC_Fech_"+sGXsfl_50_idx, localUtil.ttoc( Z8912CC_Fech, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z8913CC_Usu_"+sGXsfl_50_idx, GXutil.rtrim( Z8913CC_Usu)) ;
         httpContext.changePostValue( "ZT_"+"Z8914CC_Term_"+sGXsfl_50_idx, GXutil.rtrim( Z8914CC_Term)) ;
         httpContext.changePostValue( "ZT_"+"Z8915CC_Cant_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8915CC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8916CC_Desc_"+sGXsfl_50_idx, GXutil.rtrim( Z8916CC_Desc)) ;
         httpContext.changePostValue( "ZT_"+"Z8917CC_Prec_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8917CC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8927CC_NumAlb_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8927CC_NumAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8930CC_HDR_"+sGXsfl_50_idx, GXutil.rtrim( Z8930CC_HDR)) ;
         httpContext.changePostValue( "ZT_"+"Z8931CC_Hdr1_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8931CC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8932CC_Hdr2_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8932CC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8933CC_Hdr3_"+sGXsfl_50_idx, GXutil.rtrim( Z8933CC_Hdr3)) ;
         httpContext.changePostValue( "ZT_"+"Z3345TipMovCc_"+sGXsfl_50_idx, GXutil.rtrim( Z3345TipMovCc)) ;
         httpContext.changePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1212_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1212_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1212_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1212 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1212_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1212_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Lin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_FECH_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Fech_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_USU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Usu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_TERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Term_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_CANT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Cant_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_ALMDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPMOVCC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPMOVCN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_DESC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Desc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_PREC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Prec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_NUMALB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_NumAlb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_HDR_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr1_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CC_HDR3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr3_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1371212( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1212 = (short)(0) ;
      nIsMod_1212 = (short)(0) ;
      nRcdDeleted_1212 = (short)(0) ;
   }

   public void processLevel13729( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1371212( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel13729( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(5);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13729( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tccalm");
         if ( AnyError == 0 )
         {
            confirmValues1370( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tccalm");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13729( )
   {
      /* Scan By routine */
      /* Using cursor T013790 */
      pr_default.execute(88, new Object[] {A396EmprCod});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A719PrdNum = T013790_A719PrdNum[0] ;
         n719PrdNum = T013790_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13729( )
   {
      /* Scan next routine */
      pr_default.readNext(88);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(88) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A719PrdNum = T013790_A719PrdNum[0] ;
         n719PrdNum = T013790_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd13729( )
   {
      pr_default.close(88);
   }

   public void afterConfirm13729( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert13729( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13729( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13729( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13729( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13729( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13729( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtCC_Ultln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Ultln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Ultln_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
   }

   public void zm1371212( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z8912CC_Fech = T01373_A8912CC_Fech[0] ;
            Z8913CC_Usu = T01373_A8913CC_Usu[0] ;
            Z8914CC_Term = T01373_A8914CC_Term[0] ;
            Z8915CC_Cant = T01373_A8915CC_Cant[0] ;
            Z8916CC_Desc = T01373_A8916CC_Desc[0] ;
            Z8917CC_Prec = T01373_A8917CC_Prec[0] ;
            Z8927CC_NumAlb = T01373_A8927CC_NumAlb[0] ;
            Z8930CC_HDR = T01373_A8930CC_HDR[0] ;
            Z8931CC_Hdr1 = T01373_A8931CC_Hdr1[0] ;
            Z8932CC_Hdr2 = T01373_A8932CC_Hdr2[0] ;
            Z8933CC_Hdr3 = T01373_A8933CC_Hdr3[0] ;
            Z3345TipMovCc = T01373_A3345TipMovCc[0] ;
            Z8908CC_AlmCod = T01373_A8908CC_AlmCod[0] ;
         }
         else
         {
            Z8912CC_Fech = A8912CC_Fech ;
            Z8913CC_Usu = A8913CC_Usu ;
            Z8914CC_Term = A8914CC_Term ;
            Z8915CC_Cant = A8915CC_Cant ;
            Z8916CC_Desc = A8916CC_Desc ;
            Z8917CC_Prec = A8917CC_Prec ;
            Z8927CC_NumAlb = A8927CC_NumAlb ;
            Z8930CC_HDR = A8930CC_HDR ;
            Z8931CC_Hdr1 = A8931CC_Hdr1 ;
            Z8932CC_Hdr2 = A8932CC_Hdr2 ;
            Z8933CC_Hdr3 = A8933CC_Hdr3 ;
            Z3345TipMovCc = A3345TipMovCc ;
            Z8908CC_AlmCod = A8908CC_AlmCod ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z8911CC_Lin = A8911CC_Lin ;
         Z8912CC_Fech = A8912CC_Fech ;
         Z8913CC_Usu = A8913CC_Usu ;
         Z8914CC_Term = A8914CC_Term ;
         Z8915CC_Cant = A8915CC_Cant ;
         Z8916CC_Desc = A8916CC_Desc ;
         Z8917CC_Prec = A8917CC_Prec ;
         Z8927CC_NumAlb = A8927CC_NumAlb ;
         Z8930CC_HDR = A8930CC_HDR ;
         Z8931CC_Hdr1 = A8931CC_Hdr1 ;
         Z8932CC_Hdr2 = A8932CC_Hdr2 ;
         Z8933CC_Hdr3 = A8933CC_Hdr3 ;
         Z396EmprCod = A396EmprCod ;
         Z3345TipMovCc = A3345TipMovCc ;
         Z8908CC_AlmCod = A8908CC_AlmCod ;
         Z719PrdNum = A719PrdNum ;
         Z8909CC_AlmDsc = A8909CC_AlmDsc ;
         Z3346TipMovCn = A3346TipMovCn ;
      }
   }

   public void standaloneNotModal1371212( )
   {
   }

   public void standaloneModal1371212( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtCC_Lin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtCC_Lin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load1371212( )
   {
      /* Using cursor T013791 */
      pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Long.valueOf(A8911CC_Lin)});
      if ( (pr_default.getStatus(89) != 101) )
      {
         RcdFound1212 = (short)(1) ;
         A8912CC_Fech = T013791_A8912CC_Fech[0] ;
         n8912CC_Fech = T013791_n8912CC_Fech[0] ;
         A8913CC_Usu = T013791_A8913CC_Usu[0] ;
         n8913CC_Usu = T013791_n8913CC_Usu[0] ;
         A8914CC_Term = T013791_A8914CC_Term[0] ;
         n8914CC_Term = T013791_n8914CC_Term[0] ;
         A8915CC_Cant = T013791_A8915CC_Cant[0] ;
         n8915CC_Cant = T013791_n8915CC_Cant[0] ;
         A8909CC_AlmDsc = T013791_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = T013791_n8909CC_AlmDsc[0] ;
         A3346TipMovCn = T013791_A3346TipMovCn[0] ;
         n3346TipMovCn = T013791_n3346TipMovCn[0] ;
         A8916CC_Desc = T013791_A8916CC_Desc[0] ;
         n8916CC_Desc = T013791_n8916CC_Desc[0] ;
         A8917CC_Prec = T013791_A8917CC_Prec[0] ;
         n8917CC_Prec = T013791_n8917CC_Prec[0] ;
         A8927CC_NumAlb = T013791_A8927CC_NumAlb[0] ;
         n8927CC_NumAlb = T013791_n8927CC_NumAlb[0] ;
         A8930CC_HDR = T013791_A8930CC_HDR[0] ;
         n8930CC_HDR = T013791_n8930CC_HDR[0] ;
         A8931CC_Hdr1 = T013791_A8931CC_Hdr1[0] ;
         n8931CC_Hdr1 = T013791_n8931CC_Hdr1[0] ;
         A8932CC_Hdr2 = T013791_A8932CC_Hdr2[0] ;
         n8932CC_Hdr2 = T013791_n8932CC_Hdr2[0] ;
         A8933CC_Hdr3 = T013791_A8933CC_Hdr3[0] ;
         n8933CC_Hdr3 = T013791_n8933CC_Hdr3[0] ;
         A3345TipMovCc = T013791_A3345TipMovCc[0] ;
         n3345TipMovCc = T013791_n3345TipMovCc[0] ;
         A8908CC_AlmCod = T013791_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = T013791_n8908CC_AlmCod[0] ;
         zm1371212( -3) ;
      }
      pr_default.close(89);
      onLoadActions1371212( ) ;
   }

   public void onLoadActions1371212( )
   {
   }

   public void checkExtendedTable1371212( )
   {
      nIsDirty_1212 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1371212( ) ;
      /* Using cursor T01374 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPMOVCC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3346TipMovCn = T01374_A3346TipMovCn[0] ;
      n3346TipMovCn = T01374_n3346TipMovCn[0] ;
      pr_default.close(2);
      /* Using cursor T01375 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8909CC_AlmDsc = T01375_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T01375_n8909CC_AlmDsc[0] ;
      pr_default.close(3);
      /* Using cursor T01376 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRDALMC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1371212( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable1371212( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         String A3345TipMovCc )
   {
      /* Using cursor T013792 */
      pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(90) == 101) )
      {
         GXCCtl = "TIPMOVCC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A3346TipMovCn = T013792_A3346TipMovCn[0] ;
      n3346TipMovCn = T013792_n3346TipMovCn[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3346TipMovCn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(90) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(90);
   }

   public void gxload_5( String A396EmprCod ,
                         byte A8908CC_AlmCod )
   {
      /* Using cursor T013793 */
      pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(91) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8909CC_AlmDsc = T013793_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T013793_n8909CC_AlmDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8909CC_AlmDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(91) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(91);
   }

   public void gxload_6( String A396EmprCod ,
                         String A719PrdNum ,
                         byte A8908CC_AlmCod )
   {
      /* Using cursor T013794 */
      pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(92) == 101) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRDALMC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(92) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(92);
   }

   public void getKey1371212( )
   {
      /* Using cursor T013795 */
      pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Long.valueOf(A8911CC_Lin)});
      if ( (pr_default.getStatus(93) != 101) )
      {
         RcdFound1212 = (short)(1) ;
      }
      else
      {
         RcdFound1212 = (short)(0) ;
      }
      pr_default.close(93);
   }

   public void getByPrimaryKey1371212( )
   {
      /* Using cursor T01373 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Long.valueOf(A8911CC_Lin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01373_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1371212( 3) ;
         RcdFound1212 = (short)(1) ;
         initializeNonKey1371212( ) ;
         A8911CC_Lin = T01373_A8911CC_Lin[0] ;
         A8912CC_Fech = T01373_A8912CC_Fech[0] ;
         n8912CC_Fech = T01373_n8912CC_Fech[0] ;
         A8913CC_Usu = T01373_A8913CC_Usu[0] ;
         n8913CC_Usu = T01373_n8913CC_Usu[0] ;
         A8914CC_Term = T01373_A8914CC_Term[0] ;
         n8914CC_Term = T01373_n8914CC_Term[0] ;
         A8915CC_Cant = T01373_A8915CC_Cant[0] ;
         n8915CC_Cant = T01373_n8915CC_Cant[0] ;
         A8916CC_Desc = T01373_A8916CC_Desc[0] ;
         n8916CC_Desc = T01373_n8916CC_Desc[0] ;
         A8917CC_Prec = T01373_A8917CC_Prec[0] ;
         n8917CC_Prec = T01373_n8917CC_Prec[0] ;
         A8927CC_NumAlb = T01373_A8927CC_NumAlb[0] ;
         n8927CC_NumAlb = T01373_n8927CC_NumAlb[0] ;
         A8930CC_HDR = T01373_A8930CC_HDR[0] ;
         n8930CC_HDR = T01373_n8930CC_HDR[0] ;
         A8931CC_Hdr1 = T01373_A8931CC_Hdr1[0] ;
         n8931CC_Hdr1 = T01373_n8931CC_Hdr1[0] ;
         A8932CC_Hdr2 = T01373_A8932CC_Hdr2[0] ;
         n8932CC_Hdr2 = T01373_n8932CC_Hdr2[0] ;
         A8933CC_Hdr3 = T01373_A8933CC_Hdr3[0] ;
         n8933CC_Hdr3 = T01373_n8933CC_Hdr3[0] ;
         A3345TipMovCc = T01373_A3345TipMovCc[0] ;
         n3345TipMovCc = T01373_n3345TipMovCc[0] ;
         A8908CC_AlmCod = T01373_A8908CC_AlmCod[0] ;
         n8908CC_AlmCod = T01373_n8908CC_AlmCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z8911CC_Lin = A8911CC_Lin ;
         sMode1212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1371212( ) ;
         load1371212( ) ;
         Gx_mode = sMode1212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1212 = (short)(0) ;
         initializeNonKey1371212( ) ;
         sMode1212 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1371212( ) ;
         Gx_mode = sMode1212 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1371212( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1371212( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01372 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Long.valueOf(A8911CC_Lin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCALM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z8912CC_Fech, T01372_A8912CC_Fech[0]) ) || ( GXutil.strcmp(Z8913CC_Usu, T01372_A8913CC_Usu[0]) != 0 ) || ( GXutil.strcmp(Z8914CC_Term, T01372_A8914CC_Term[0]) != 0 ) || ( DecimalUtil.compareTo(Z8915CC_Cant, T01372_A8915CC_Cant[0]) != 0 ) || ( GXutil.strcmp(Z8916CC_Desc, T01372_A8916CC_Desc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8917CC_Prec, T01372_A8917CC_Prec[0]) != 0 ) || ( Z8927CC_NumAlb != T01372_A8927CC_NumAlb[0] ) || ( GXutil.strcmp(Z8930CC_HDR, T01372_A8930CC_HDR[0]) != 0 ) || ( Z8931CC_Hdr1 != T01372_A8931CC_Hdr1[0] ) || ( Z8932CC_Hdr2 != T01372_A8932CC_Hdr2[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8933CC_Hdr3, T01372_A8933CC_Hdr3[0]) != 0 ) || ( GXutil.strcmp(Z3345TipMovCc, T01372_A3345TipMovCc[0]) != 0 ) || ( Z8908CC_AlmCod != T01372_A8908CC_AlmCod[0] ) )
         {
            if ( !( GXutil.dateCompare(Z8912CC_Fech, T01372_A8912CC_Fech[0]) ) )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Fech");
               GXutil.writeLogRaw("Old: ",Z8912CC_Fech);
               GXutil.writeLogRaw("Current: ",T01372_A8912CC_Fech[0]);
            }
            if ( GXutil.strcmp(Z8913CC_Usu, T01372_A8913CC_Usu[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Usu");
               GXutil.writeLogRaw("Old: ",Z8913CC_Usu);
               GXutil.writeLogRaw("Current: ",T01372_A8913CC_Usu[0]);
            }
            if ( GXutil.strcmp(Z8914CC_Term, T01372_A8914CC_Term[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Term");
               GXutil.writeLogRaw("Old: ",Z8914CC_Term);
               GXutil.writeLogRaw("Current: ",T01372_A8914CC_Term[0]);
            }
            if ( DecimalUtil.compareTo(Z8915CC_Cant, T01372_A8915CC_Cant[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Cant");
               GXutil.writeLogRaw("Old: ",Z8915CC_Cant);
               GXutil.writeLogRaw("Current: ",T01372_A8915CC_Cant[0]);
            }
            if ( GXutil.strcmp(Z8916CC_Desc, T01372_A8916CC_Desc[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Desc");
               GXutil.writeLogRaw("Old: ",Z8916CC_Desc);
               GXutil.writeLogRaw("Current: ",T01372_A8916CC_Desc[0]);
            }
            if ( DecimalUtil.compareTo(Z8917CC_Prec, T01372_A8917CC_Prec[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Prec");
               GXutil.writeLogRaw("Old: ",Z8917CC_Prec);
               GXutil.writeLogRaw("Current: ",T01372_A8917CC_Prec[0]);
            }
            if ( Z8927CC_NumAlb != T01372_A8927CC_NumAlb[0] )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_NumAlb");
               GXutil.writeLogRaw("Old: ",Z8927CC_NumAlb);
               GXutil.writeLogRaw("Current: ",T01372_A8927CC_NumAlb[0]);
            }
            if ( GXutil.strcmp(Z8930CC_HDR, T01372_A8930CC_HDR[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_HDR");
               GXutil.writeLogRaw("Old: ",Z8930CC_HDR);
               GXutil.writeLogRaw("Current: ",T01372_A8930CC_HDR[0]);
            }
            if ( Z8931CC_Hdr1 != T01372_A8931CC_Hdr1[0] )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Hdr1");
               GXutil.writeLogRaw("Old: ",Z8931CC_Hdr1);
               GXutil.writeLogRaw("Current: ",T01372_A8931CC_Hdr1[0]);
            }
            if ( Z8932CC_Hdr2 != T01372_A8932CC_Hdr2[0] )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Hdr2");
               GXutil.writeLogRaw("Old: ",Z8932CC_Hdr2);
               GXutil.writeLogRaw("Current: ",T01372_A8932CC_Hdr2[0]);
            }
            if ( GXutil.strcmp(Z8933CC_Hdr3, T01372_A8933CC_Hdr3[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_Hdr3");
               GXutil.writeLogRaw("Old: ",Z8933CC_Hdr3);
               GXutil.writeLogRaw("Current: ",T01372_A8933CC_Hdr3[0]);
            }
            if ( GXutil.strcmp(Z3345TipMovCc, T01372_A3345TipMovCc[0]) != 0 )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"TipMovCc");
               GXutil.writeLogRaw("Old: ",Z3345TipMovCc);
               GXutil.writeLogRaw("Current: ",T01372_A3345TipMovCc[0]);
            }
            if ( Z8908CC_AlmCod != T01372_A8908CC_AlmCod[0] )
            {
               GXutil.writeLogln("tccalm:[seudo value changed for attri]"+"CC_AlmCod");
               GXutil.writeLogRaw("Old: ",Z8908CC_AlmCod);
               GXutil.writeLogRaw("Current: ",T01372_A8908CC_AlmCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCALM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1371212( )
   {
      beforeValidate1371212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1371212( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1371212( 0) ;
         checkOptimisticConcurrency1371212( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1371212( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1371212( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013796 */
                  pr_default.execute(94, new Object[] {Long.valueOf(A8911CC_Lin), Boolean.valueOf(n8912CC_Fech), A8912CC_Fech, Boolean.valueOf(n8913CC_Usu), A8913CC_Usu, Boolean.valueOf(n8914CC_Term), A8914CC_Term, Boolean.valueOf(n8915CC_Cant), A8915CC_Cant, Boolean.valueOf(n8916CC_Desc), A8916CC_Desc, Boolean.valueOf(n8917CC_Prec), A8917CC_Prec, Boolean.valueOf(n8927CC_NumAlb), Integer.valueOf(A8927CC_NumAlb), Boolean.valueOf(n8930CC_HDR), A8930CC_HDR, Boolean.valueOf(n8931CC_Hdr1), Integer.valueOf(A8931CC_Hdr1), Boolean.valueOf(n8932CC_Hdr2), Byte.valueOf(A8932CC_Hdr2), Boolean.valueOf(n8933CC_Hdr3), A8933CC_Hdr3, A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod), Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCALM");
                  if ( (pr_default.getStatus(94) == 1) )
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
            load1371212( ) ;
         }
         endLevel1371212( ) ;
      }
      closeExtendedTableCursors1371212( ) ;
   }

   public void update1371212( )
   {
      beforeValidate1371212( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1371212( ) ;
      }
      if ( ( nIsMod_1212 != 0 ) || ( nIsDirty_1212 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1371212( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1371212( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1371212( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T013797 */
                     pr_default.execute(95, new Object[] {Boolean.valueOf(n8912CC_Fech), A8912CC_Fech, Boolean.valueOf(n8913CC_Usu), A8913CC_Usu, Boolean.valueOf(n8914CC_Term), A8914CC_Term, Boolean.valueOf(n8915CC_Cant), A8915CC_Cant, Boolean.valueOf(n8916CC_Desc), A8916CC_Desc, Boolean.valueOf(n8917CC_Prec), A8917CC_Prec, Boolean.valueOf(n8927CC_NumAlb), Integer.valueOf(A8927CC_NumAlb), Boolean.valueOf(n8930CC_HDR), A8930CC_HDR, Boolean.valueOf(n8931CC_Hdr1), Integer.valueOf(A8931CC_Hdr1), Boolean.valueOf(n8932CC_Hdr2), Byte.valueOf(A8932CC_Hdr2), Boolean.valueOf(n8933CC_Hdr3), A8933CC_Hdr3, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Long.valueOf(A8911CC_Lin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCALM");
                     if ( (pr_default.getStatus(95) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCALM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1371212( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1371212( ) ;
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
            endLevel1371212( ) ;
         }
      }
      closeExtendedTableCursors1371212( ) ;
   }

   public void deferredUpdate1371212( )
   {
   }

   public void delete1371212( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1371212( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1371212( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1371212( ) ;
         afterConfirm1371212( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1371212( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013798 */
               pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Long.valueOf(A8911CC_Lin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCALM");
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
      sMode1212 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1371212( ) ;
      Gx_mode = sMode1212 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1371212( )
   {
      standaloneModal1371212( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013799 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
         A8909CC_AlmDsc = T013799_A8909CC_AlmDsc[0] ;
         n8909CC_AlmDsc = T013799_n8909CC_AlmDsc[0] ;
         pr_default.close(97);
         /* Using cursor T0137100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         A3346TipMovCn = T0137100_A3346TipMovCn[0] ;
         n3346TipMovCn = T0137100_n3346TipMovCn[0] ;
         pr_default.close(98);
      }
   }

   public void endLevel1371212( )
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

   public void scanStart1371212( )
   {
      /* Scan By routine */
      /* Using cursor T0137101 */
      pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1212 = (short)(0) ;
      if ( (pr_default.getStatus(99) != 101) )
      {
         RcdFound1212 = (short)(1) ;
         A8911CC_Lin = T0137101_A8911CC_Lin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1371212( )
   {
      /* Scan next routine */
      pr_default.readNext(99);
      RcdFound1212 = (short)(0) ;
      if ( (pr_default.getStatus(99) != 101) )
      {
         RcdFound1212 = (short)(1) ;
         A8911CC_Lin = T0137101_A8911CC_Lin[0] ;
      }
   }

   public void scanEnd1371212( )
   {
      pr_default.close(99);
   }

   public void afterConfirm1371212( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1371212( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1371212( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1371212( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1371212( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1371212( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1371212( )
   {
      edtCC_Lin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Fech_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Fech_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Fech_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Usu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Usu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Usu_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Term_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Term_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Term_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Cant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Cant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Cant_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_AlmCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_AlmDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_AlmDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_AlmDsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTipMovCc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtTipMovCn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCn_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Desc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Desc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Desc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Prec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Prec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Prec_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_NumAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_NumAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_NumAlb_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_HDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_HDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_HDR_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Hdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Hdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Hdr1_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Hdr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Hdr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Hdr2_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtCC_Hdr3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Hdr3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Hdr3_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes1371212( )
   {
   }

   public void send_integrity_lvl_hashes13729( )
   {
   }

   public void subsflControlProps_501212( )
   {
      edtavnRcdDeleted_1212_Internalname = "vNRCDDELETED_1212_"+sGXsfl_50_idx ;
      edtCC_Lin_Internalname = "CC_LIN_"+sGXsfl_50_idx ;
      edtCC_Fech_Internalname = "CC_FECH_"+sGXsfl_50_idx ;
      edtCC_Usu_Internalname = "CC_USU_"+sGXsfl_50_idx ;
      edtCC_Term_Internalname = "CC_TERM_"+sGXsfl_50_idx ;
      edtCC_Cant_Internalname = "CC_CANT_"+sGXsfl_50_idx ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD_"+sGXsfl_50_idx ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC_"+sGXsfl_50_idx ;
      edtTipMovCc_Internalname = "TIPMOVCC_"+sGXsfl_50_idx ;
      edtTipMovCn_Internalname = "TIPMOVCN_"+sGXsfl_50_idx ;
      edtCC_Desc_Internalname = "CC_DESC_"+sGXsfl_50_idx ;
      edtCC_Prec_Internalname = "CC_PREC_"+sGXsfl_50_idx ;
      edtCC_NumAlb_Internalname = "CC_NUMALB_"+sGXsfl_50_idx ;
      edtCC_HDR_Internalname = "CC_HDR_"+sGXsfl_50_idx ;
      edtCC_Hdr1_Internalname = "CC_HDR1_"+sGXsfl_50_idx ;
      edtCC_Hdr2_Internalname = "CC_HDR2_"+sGXsfl_50_idx ;
      edtCC_Hdr3_Internalname = "CC_HDR3_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_501212( )
   {
      edtavnRcdDeleted_1212_Internalname = "vNRCDDELETED_1212_"+sGXsfl_50_fel_idx ;
      edtCC_Lin_Internalname = "CC_LIN_"+sGXsfl_50_fel_idx ;
      edtCC_Fech_Internalname = "CC_FECH_"+sGXsfl_50_fel_idx ;
      edtCC_Usu_Internalname = "CC_USU_"+sGXsfl_50_fel_idx ;
      edtCC_Term_Internalname = "CC_TERM_"+sGXsfl_50_fel_idx ;
      edtCC_Cant_Internalname = "CC_CANT_"+sGXsfl_50_fel_idx ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD_"+sGXsfl_50_fel_idx ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC_"+sGXsfl_50_fel_idx ;
      edtTipMovCc_Internalname = "TIPMOVCC_"+sGXsfl_50_fel_idx ;
      edtTipMovCn_Internalname = "TIPMOVCN_"+sGXsfl_50_fel_idx ;
      edtCC_Desc_Internalname = "CC_DESC_"+sGXsfl_50_fel_idx ;
      edtCC_Prec_Internalname = "CC_PREC_"+sGXsfl_50_fel_idx ;
      edtCC_NumAlb_Internalname = "CC_NUMALB_"+sGXsfl_50_fel_idx ;
      edtCC_HDR_Internalname = "CC_HDR_"+sGXsfl_50_fel_idx ;
      edtCC_Hdr1_Internalname = "CC_HDR1_"+sGXsfl_50_fel_idx ;
      edtCC_Hdr2_Internalname = "CC_HDR2_"+sGXsfl_50_fel_idx ;
      edtCC_Hdr3_Internalname = "CC_HDR3_"+sGXsfl_50_fel_idx ;
   }

   public void addRow1371212( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501212( ) ;
      sendRow1371212( ) ;
   }

   public void sendRow1371212( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1212_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1212_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1212), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1212), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1212_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1212_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A8911CC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8911CC_Lin), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Lin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Fech_Internalname,localUtil.ttoc( A8912CC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A8912CC_Fech, "99/99/99 99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Fech_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Fech_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Usu_Internalname,GXutil.rtrim( A8913CC_Usu),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Usu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Usu_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Term_Internalname,GXutil.rtrim( A8914CC_Term),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Term_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Term_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Cant_Internalname,GXutil.ltrim( localUtil.ntoc( A8915CC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_Cant_Enabled!=0) ? localUtil.format( A8915CC_Cant, "ZZZZZZ9.9999") : localUtil.format( A8915CC_Cant, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Cant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Cant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_AlmCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_AlmCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8908CC_AlmCod), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_AlmCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_AlmCod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_AlmDsc_Internalname,GXutil.rtrim( A8909CC_AlmDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_AlmDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_AlmDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMovCc_Internalname,GXutil.rtrim( A3345TipMovCc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMovCc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipMovCc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMovCn_Internalname,GXutil.rtrim( A3346TipMovCn),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMovCn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtTipMovCn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Desc_Internalname,GXutil.rtrim( A8916CC_Desc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Desc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Desc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Prec_Internalname,GXutil.ltrim( localUtil.ntoc( A8917CC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_Prec_Enabled!=0) ? localUtil.format( A8917CC_Prec, "ZZZZZZZ9.99999") : localUtil.format( A8917CC_Prec, "ZZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Prec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Prec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_NumAlb_Internalname,GXutil.ltrim( localUtil.ntoc( A8927CC_NumAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_NumAlb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8927CC_NumAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8927CC_NumAlb), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_NumAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_NumAlb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_HDR_Internalname,GXutil.rtrim( A8930CC_HDR),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_HDR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_HDR_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Hdr1_Internalname,GXutil.ltrim( localUtil.ntoc( A8931CC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_Hdr1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8931CC_Hdr1), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8931CC_Hdr1), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Hdr1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Hdr1_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Hdr2_Internalname,GXutil.ltrim( localUtil.ntoc( A8932CC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCC_Hdr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8932CC_Hdr2), "9") : localUtil.format( DecimalUtil.doubleToDec(A8932CC_Hdr2), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Hdr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Hdr2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1212_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCC_Hdr3_Internalname,GXutil.rtrim( A8933CC_Hdr3),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCC_Hdr3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtCC_Hdr3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1371212( ) ;
      GXCCtl = "Z8911CC_Lin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8911CC_Lin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8912CC_Fech_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z8912CC_Fech, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z8913CC_Usu_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8913CC_Usu));
      GXCCtl = "Z8914CC_Term_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8914CC_Term));
      GXCCtl = "Z8915CC_Cant_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8915CC_Cant, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8916CC_Desc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8916CC_Desc));
      GXCCtl = "Z8917CC_Prec_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8917CC_Prec, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8927CC_NumAlb_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8927CC_NumAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8930CC_HDR_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8930CC_HDR));
      GXCCtl = "Z8931CC_Hdr1_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8931CC_Hdr1, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8932CC_Hdr2_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8932CC_Hdr2, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8933CC_Hdr3_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8933CC_Hdr3));
      GXCCtl = "Z3345TipMovCc_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3345TipMovCc));
      GXCCtl = "Z8908CC_AlmCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8908CC_AlmCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1212_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1212_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1212_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1212, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1212_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1212_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_LIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_FECH_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Fech_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_USU_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_TERM_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Term_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_CANT_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_ALMDSC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_AlmDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPMOVCC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPMOVCN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_DESC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_PREC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Prec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_NUMALB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_NumAlb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_HDR_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_HDR_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_HDR1_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr1_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_HDR2_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CC_HDR3_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr3_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1371212( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501212( ) ;
      edtavnRcdDeleted_1212_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1212_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Lin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_LIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Fech_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_FECH_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Usu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_USU_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Term_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_TERM_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Cant_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_CANT_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_AlmCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_AlmDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_ALMDSC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipMovCc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPMOVCC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipMovCn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPMOVCN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Desc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_DESC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Prec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_PREC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_NumAlb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_NUMALB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_HDR_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Hdr1_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR1_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Hdr2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR2_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCC_Hdr3_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CC_HDR3_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1212_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1212_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1212");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1212_Internalname ;
         wbErr = true ;
         nRcdDeleted_1212 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1212 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1212_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
      {
         GXCCtl = "CC_LIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Lin_Internalname ;
         wbErr = true ;
         A8911CC_Lin = 0 ;
      }
      else
      {
         A8911CC_Lin = localUtil.ctol( httpContext.cgiGet( edtCC_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtCC_Fech_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "CC_FECH_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Fech_Internalname ;
         wbErr = true ;
         A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
         n8912CC_Fech = false ;
      }
      else
      {
         A8912CC_Fech = localUtil.ctot( httpContext.cgiGet( edtCC_Fech_Internalname)) ;
         n8912CC_Fech = false ;
      }
      A8913CC_Usu = httpContext.cgiGet( edtCC_Usu_Internalname) ;
      n8913CC_Usu = false ;
      A8914CC_Term = httpContext.cgiGet( edtCC_Term_Internalname) ;
      n8914CC_Term = false ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCC_Cant_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCC_Cant_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
      {
         GXCCtl = "CC_CANT_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Cant_Internalname ;
         wbErr = true ;
         A8915CC_Cant = DecimalUtil.ZERO ;
         n8915CC_Cant = false ;
      }
      else
      {
         A8915CC_Cant = localUtil.ctond( httpContext.cgiGet( edtCC_Cant_Internalname)) ;
         n8915CC_Cant = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "CC_ALMCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
         wbErr = true ;
         A8908CC_AlmCod = (byte)(0) ;
         n8908CC_AlmCod = false ;
      }
      else
      {
         A8908CC_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_AlmCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8908CC_AlmCod = false ;
      }
      A8909CC_AlmDsc = httpContext.cgiGet( edtCC_AlmDsc_Internalname) ;
      n8909CC_AlmDsc = false ;
      A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
      n3345TipMovCc = false ;
      A3346TipMovCn = httpContext.cgiGet( edtTipMovCn_Internalname) ;
      n3346TipMovCn = false ;
      A8916CC_Desc = httpContext.cgiGet( edtCC_Desc_Internalname) ;
      n8916CC_Desc = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtCC_Prec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCC_Prec_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "CC_PREC_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Prec_Internalname ;
         wbErr = true ;
         A8917CC_Prec = DecimalUtil.ZERO ;
         n8917CC_Prec = false ;
      }
      else
      {
         A8917CC_Prec = localUtil.ctond( httpContext.cgiGet( edtCC_Prec_Internalname)) ;
         n8917CC_Prec = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_NumAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_NumAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "CC_NUMALB_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_NumAlb_Internalname ;
         wbErr = true ;
         A8927CC_NumAlb = 0 ;
         n8927CC_NumAlb = false ;
      }
      else
      {
         A8927CC_NumAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtCC_NumAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8927CC_NumAlb = false ;
      }
      A8930CC_HDR = httpContext.cgiGet( edtCC_HDR_Internalname) ;
      n8930CC_HDR = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Hdr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Hdr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "CC_HDR1_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Hdr1_Internalname ;
         wbErr = true ;
         A8931CC_Hdr1 = 0 ;
         n8931CC_Hdr1 = false ;
      }
      else
      {
         A8931CC_Hdr1 = (int)(localUtil.ctol( httpContext.cgiGet( edtCC_Hdr1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8931CC_Hdr1 = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Hdr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCC_Hdr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "CC_HDR2_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_Hdr2_Internalname ;
         wbErr = true ;
         A8932CC_Hdr2 = (byte)(0) ;
         n8932CC_Hdr2 = false ;
      }
      else
      {
         A8932CC_Hdr2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtCC_Hdr2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8932CC_Hdr2 = false ;
      }
      A8933CC_Hdr3 = httpContext.cgiGet( edtCC_Hdr3_Internalname) ;
      n8933CC_Hdr3 = false ;
      GXCCtl = "Z8911CC_Lin_" + sGXsfl_50_idx ;
      Z8911CC_Lin = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z8912CC_Fech_" + sGXsfl_50_idx ;
      Z8912CC_Fech = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z8913CC_Usu_" + sGXsfl_50_idx ;
      Z8913CC_Usu = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8914CC_Term_" + sGXsfl_50_idx ;
      Z8914CC_Term = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8915CC_Cant_" + sGXsfl_50_idx ;
      Z8915CC_Cant = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8916CC_Desc_" + sGXsfl_50_idx ;
      Z8916CC_Desc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8917CC_Prec_" + sGXsfl_50_idx ;
      Z8917CC_Prec = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8927CC_NumAlb_" + sGXsfl_50_idx ;
      Z8927CC_NumAlb = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8930CC_HDR_" + sGXsfl_50_idx ;
      Z8930CC_HDR = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8931CC_Hdr1_" + sGXsfl_50_idx ;
      Z8931CC_Hdr1 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8932CC_Hdr2_" + sGXsfl_50_idx ;
      Z8932CC_Hdr2 = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8933CC_Hdr3_" + sGXsfl_50_idx ;
      Z8933CC_Hdr3 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3345TipMovCc_" + sGXsfl_50_idx ;
      Z3345TipMovCc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8908CC_AlmCod_" + sGXsfl_50_idx ;
      Z8908CC_AlmCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1212_" + sGXsfl_50_idx ;
      nRcdDeleted_1212 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1212_" + sGXsfl_50_idx ;
      nRcdExists_1212 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1212_" + sGXsfl_50_idx ;
      nIsMod_1212 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCC_Lin_Enabled = edtCC_Lin_Enabled ;
   }

   public void confirmValues1370( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_501212( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501212( ) ;
         httpContext.changePostValue( "Z8911CC_Lin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8911CC_Lin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8911CC_Lin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8912CC_Fech_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8912CC_Fech_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8912CC_Fech_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8913CC_Usu_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8913CC_Usu_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8913CC_Usu_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8914CC_Term_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8914CC_Term_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8914CC_Term_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8915CC_Cant_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8915CC_Cant_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8915CC_Cant_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8916CC_Desc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8916CC_Desc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8916CC_Desc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8917CC_Prec_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8917CC_Prec_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8917CC_Prec_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8927CC_NumAlb_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8927CC_NumAlb_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8927CC_NumAlb_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8930CC_HDR_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8930CC_HDR_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8930CC_HDR_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8931CC_Hdr1_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8931CC_Hdr1_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8931CC_Hdr1_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8932CC_Hdr2_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8932CC_Hdr2_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8932CC_Hdr2_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8933CC_Hdr3_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8933CC_Hdr3_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8933CC_Hdr3_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z3345TipMovCc_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z3345TipMovCc_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3345TipMovCc_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z8908CC_AlmCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8908CC_AlmCod_"+sGXsfl_50_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tccalm", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8910CC_Ultln", GXutil.ltrim( localUtil.ntoc( Z8910CC_Ultln, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tccalm", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCCALM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CUENTA CORRIENTE ALMACENES", "") ;
   }

   public void initializeNonKey13729( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A8910CC_Ultln = 0 ;
      n8910CC_Ultln = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8910CC_Ultln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8910CC_Ultln), 12, 0));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      Z718PrdNom = "" ;
      Z8910CC_Ultln = 0 ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
   }

   public void initAll13729( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey13729( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1371212( )
   {
      A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      n8912CC_Fech = false ;
      A8913CC_Usu = "" ;
      n8913CC_Usu = false ;
      A8914CC_Term = "" ;
      n8914CC_Term = false ;
      A8915CC_Cant = DecimalUtil.ZERO ;
      n8915CC_Cant = false ;
      A8908CC_AlmCod = (byte)(0) ;
      n8908CC_AlmCod = false ;
      A8909CC_AlmDsc = "" ;
      n8909CC_AlmDsc = false ;
      A3345TipMovCc = "" ;
      n3345TipMovCc = false ;
      A3346TipMovCn = "" ;
      n3346TipMovCn = false ;
      A8916CC_Desc = "" ;
      n8916CC_Desc = false ;
      A8917CC_Prec = DecimalUtil.ZERO ;
      n8917CC_Prec = false ;
      A8927CC_NumAlb = 0 ;
      n8927CC_NumAlb = false ;
      A8930CC_HDR = "" ;
      n8930CC_HDR = false ;
      A8931CC_Hdr1 = 0 ;
      n8931CC_Hdr1 = false ;
      A8932CC_Hdr2 = (byte)(0) ;
      n8932CC_Hdr2 = false ;
      A8933CC_Hdr3 = "" ;
      n8933CC_Hdr3 = false ;
      Z8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      Z8913CC_Usu = "" ;
      Z8914CC_Term = "" ;
      Z8915CC_Cant = DecimalUtil.ZERO ;
      Z8916CC_Desc = "" ;
      Z8917CC_Prec = DecimalUtil.ZERO ;
      Z8927CC_NumAlb = 0 ;
      Z8930CC_HDR = "" ;
      Z8931CC_Hdr1 = 0 ;
      Z8932CC_Hdr2 = (byte)(0) ;
      Z8933CC_Hdr3 = "" ;
      Z3345TipMovCc = "" ;
      Z8908CC_AlmCod = (byte)(0) ;
   }

   public void initAll1371212( )
   {
      A8911CC_Lin = 0 ;
      initializeNonKey1371212( ) ;
   }

   public void standaloneModalInsert1371212( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241541989", true, true);
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
      httpContext.AddJavascriptSource("tccalm.js", "?20268241541989", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1212( )
   {
      edtCC_Lin_Enabled = defedtCC_Lin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCC_Lin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCC_Lin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1212, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1212_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8911CC_Lin, (byte)(12), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Lin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A8912CC_Fech, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Fech_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8913CC_Usu));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Usu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8914CC_Term));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Term_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8915CC_Cant, (byte)(12), (byte)(4), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Cant_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3345TipMovCc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3346TipMovCn));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipMovCn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8916CC_Desc));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Desc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8917CC_Prec, (byte)(14), (byte)(5), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Prec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8927CC_NumAlb, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_NumAlb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8930CC_HDR));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_HDR_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8931CC_Hdr1, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr1_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8932CC_Hdr2, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8933CC_Hdr3));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCC_Hdr3_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCC_Ultln_Internalname = "CC_ULTLN" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtavnRcdDeleted_1212_Internalname = "vNRCDDELETED_1212" ;
      edtCC_Lin_Internalname = "CC_LIN" ;
      edtCC_Fech_Internalname = "CC_FECH" ;
      edtCC_Usu_Internalname = "CC_USU" ;
      edtCC_Term_Internalname = "CC_TERM" ;
      edtCC_Cant_Internalname = "CC_CANT" ;
      edtCC_AlmCod_Internalname = "CC_ALMCOD" ;
      edtCC_AlmDsc_Internalname = "CC_ALMDSC" ;
      edtTipMovCc_Internalname = "TIPMOVCC" ;
      edtTipMovCn_Internalname = "TIPMOVCN" ;
      edtCC_Desc_Internalname = "CC_DESC" ;
      edtCC_Prec_Internalname = "CC_PREC" ;
      edtCC_NumAlb_Internalname = "CC_NUMALB" ;
      edtCC_HDR_Internalname = "CC_HDR" ;
      edtCC_Hdr1_Internalname = "CC_HDR1" ;
      edtCC_Hdr2_Internalname = "CC_HDR2" ;
      edtCC_Hdr3_Internalname = "CC_HDR3" ;
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
      Form.setCaption( httpContext.getMessage( "CUENTA CORRIENTE ALMACENES", "") );
      edtCC_Hdr3_Jsonclick = "" ;
      edtCC_Hdr2_Jsonclick = "" ;
      edtCC_Hdr1_Jsonclick = "" ;
      edtCC_HDR_Jsonclick = "" ;
      edtCC_NumAlb_Jsonclick = "" ;
      edtCC_Prec_Jsonclick = "" ;
      edtCC_Desc_Jsonclick = "" ;
      edtTipMovCn_Jsonclick = "" ;
      edtTipMovCc_Jsonclick = "" ;
      edtCC_AlmDsc_Jsonclick = "" ;
      edtCC_AlmCod_Jsonclick = "" ;
      edtCC_Cant_Jsonclick = "" ;
      edtCC_Term_Jsonclick = "" ;
      edtCC_Usu_Jsonclick = "" ;
      edtCC_Fech_Jsonclick = "" ;
      edtCC_Lin_Jsonclick = "" ;
      edtavnRcdDeleted_1212_Jsonclick = "" ;
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
      edtCC_Hdr3_Enabled = 1 ;
      edtCC_Hdr2_Enabled = 1 ;
      edtCC_Hdr1_Enabled = 1 ;
      edtCC_HDR_Enabled = 1 ;
      edtCC_NumAlb_Enabled = 1 ;
      edtCC_Prec_Enabled = 1 ;
      edtCC_Desc_Enabled = 1 ;
      edtTipMovCn_Enabled = 0 ;
      edtTipMovCc_Enabled = 1 ;
      edtCC_AlmDsc_Enabled = 0 ;
      edtCC_AlmCod_Enabled = 1 ;
      edtCC_Cant_Enabled = 1 ;
      edtCC_Term_Enabled = 1 ;
      edtCC_Usu_Enabled = 1 ;
      edtCC_Fech_Enabled = 1 ;
      edtCC_Lin_Enabled = 1 ;
      edtavnRcdDeleted_1212_Enabled = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Backcolor = (int)(0xFFFFFF) ;
      edtPrdExiCC_Enabled = 1 ;
      edtCC_Ultln_Jsonclick = "" ;
      edtCC_Ultln_Backcolor = (int)(0xFFFFFF) ;
      edtCC_Ultln_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNom_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
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
      subsflControlProps_501212( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1371212( ) ;
         standaloneModal1371212( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1371212( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_501212( ) ;
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
      /* Using cursor T0137102 */
      pr_default.execute(100, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(100) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T0137102_A407EmprNom[0] ;
      n407EmprNom = T0137102_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(100);
      GX_FocusControl = edtPrdNom_Internalname ;
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

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A8910CC_Ultln", GXutil.ltrim( localUtil.ntoc( A8910CC_Ultln, (byte)(12), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8910CC_Ultln", GXutil.ltrim( localUtil.ntoc( Z8910CC_Ultln, (byte)(12), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Cc_almcod( )
   {
      n8908CC_AlmCod = false ;
      n719PrdNum = false ;
      n8909CC_AlmDsc = false ;
      /* Using cursor T013799 */
      pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(97) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALMCCS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CC_ALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
      }
      A8909CC_AlmDsc = T013799_A8909CC_AlmDsc[0] ;
      n8909CC_AlmDsc = T013799_n8909CC_AlmDsc[0] ;
      pr_default.close(97);
      /* Using cursor T0137103 */
      pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n8908CC_AlmCod), Byte.valueOf(A8908CC_AlmCod)});
      if ( (pr_default.getStatus(101) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRDALMC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CC_ALMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCC_AlmCod_Internalname ;
      }
      pr_default.close(101);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8909CC_AlmDsc", GXutil.rtrim( A8909CC_AlmDsc));
   }

   public void valid_Tipmovcc( )
   {
      n3345TipMovCc = false ;
      n3346TipMovCn = false ;
      /* Using cursor T0137100 */
      pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(98) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPMOV", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
      }
      A3346TipMovCn = T0137100_A3346TipMovCn[0] ;
      n3346TipMovCn = T0137100_n3346TipMovCn[0] ;
      pr_default.close(98);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", GXutil.rtrim( A3346TipMovCn));
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
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A8910CC_Ultln',fld:'CC_ULTLN',pic:'ZZZZZZZZZZZ9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z407EmprNom'},{av:'Z718PrdNom'},{av:'Z8910CC_Ultln'},{av:'Z705PrdExiCC'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CC_LIN","{handler:'valid_Cc_lin',iparms:[]");
      setEventMetadata("VALID_CC_LIN",",oparms:[]}");
      setEventMetadata("VALID_CC_ALMCOD","{handler:'valid_Cc_almcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8908CC_AlmCod',fld:'CC_ALMCOD',pic:'Z9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A8909CC_AlmDsc',fld:'CC_ALMDSC',pic:''}]");
      setEventMetadata("VALID_CC_ALMCOD",",oparms:[{av:'A8909CC_AlmDsc',fld:'CC_ALMDSC',pic:''}]}");
      setEventMetadata("VALID_TIPMOVCC","{handler:'valid_Tipmovcc',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3345TipMovCc',fld:'TIPMOVCC',pic:''},{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''}]");
      setEventMetadata("VALID_TIPMOVCC",",oparms:[{av:'A3346TipMovCn',fld:'TIPMOVCN',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Cc_hdr3',iparms:[]");
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
      pr_default.close(98);
      pr_default.close(97);
      pr_default.close(101);
      pr_default.close(100);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      Z8913CC_Usu = "" ;
      Z8914CC_Term = "" ;
      Z8915CC_Cant = DecimalUtil.ZERO ;
      Z8916CC_Desc = "" ;
      Z8917CC_Prec = DecimalUtil.ZERO ;
      Z8930CC_HDR = "" ;
      Z8933CC_Hdr3 = "" ;
      Z3345TipMovCc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3345TipMovCc = "" ;
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
      A718PrdNom = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1212 = "" ;
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
      sMode29 = "" ;
      GXCCtl = "" ;
      A8912CC_Fech = GXutil.resetTime( GXutil.nullDate() );
      A8913CC_Usu = "" ;
      A8914CC_Term = "" ;
      A8915CC_Cant = DecimalUtil.ZERO ;
      A8909CC_AlmDsc = "" ;
      A3346TipMovCn = "" ;
      A8916CC_Desc = "" ;
      A8917CC_Prec = DecimalUtil.ZERO ;
      A8930CC_HDR = "" ;
      A8933CC_Hdr3 = "" ;
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
      T01379_A407EmprNom = new String[] {""} ;
      T01379_n407EmprNom = new boolean[] {false} ;
      T013710_A719PrdNum = new String[] {""} ;
      T013710_n719PrdNum = new boolean[] {false} ;
      T013710_A407EmprNom = new String[] {""} ;
      T013710_n407EmprNom = new boolean[] {false} ;
      T013710_A718PrdNom = new String[] {""} ;
      T013710_A8910CC_Ultln = new long[1] ;
      T013710_n8910CC_Ultln = new boolean[] {false} ;
      T013710_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013710_A396EmprCod = new String[] {""} ;
      T013711_A396EmprCod = new String[] {""} ;
      T013711_A719PrdNum = new String[] {""} ;
      T013711_n719PrdNum = new boolean[] {false} ;
      T01378_A719PrdNum = new String[] {""} ;
      T01378_n719PrdNum = new boolean[] {false} ;
      T01378_A718PrdNom = new String[] {""} ;
      T01378_A8910CC_Ultln = new long[1] ;
      T01378_n8910CC_Ultln = new boolean[] {false} ;
      T01378_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01378_A396EmprCod = new String[] {""} ;
      T013712_A396EmprCod = new String[] {""} ;
      T013712_A719PrdNum = new String[] {""} ;
      T013712_n719PrdNum = new boolean[] {false} ;
      T013713_A396EmprCod = new String[] {""} ;
      T013713_A719PrdNum = new String[] {""} ;
      T013713_n719PrdNum = new boolean[] {false} ;
      T01377_A719PrdNum = new String[] {""} ;
      T01377_n719PrdNum = new boolean[] {false} ;
      T01377_A718PrdNom = new String[] {""} ;
      T01377_A8910CC_Ultln = new long[1] ;
      T01377_n8910CC_Ultln = new boolean[] {false} ;
      T01377_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01377_A396EmprCod = new String[] {""} ;
      T013717_A396EmprCod = new String[] {""} ;
      T013717_A719PrdNum = new String[] {""} ;
      T013717_n719PrdNum = new boolean[] {false} ;
      T013717_A13217NormaID = new String[] {""} ;
      T013718_A396EmprCod = new String[] {""} ;
      T013718_A719PrdNum = new String[] {""} ;
      T013718_n719PrdNum = new boolean[] {false} ;
      T013718_A13586TheList = new String[] {""} ;
      T013719_A396EmprCod = new String[] {""} ;
      T013719_A5532Lb_numero = new int[1] ;
      T013719_A5555Lb_opcion = new String[] {""} ;
      T013719_A13460Lb_linCP = new short[1] ;
      T013719_A13458Lb_TipCP = new String[] {""} ;
      T013720_A396EmprCod = new String[] {""} ;
      T013720_A13418AlbProID = new int[1] ;
      T013720_A13442AlbProLine = new short[1] ;
      T013721_A396EmprCod = new String[] {""} ;
      T013721_A13324LDESID = new int[1] ;
      T013721_A13333LDESNPeque = new String[] {""} ;
      T013721_A13337LDESComb = new String[] {""} ;
      T013721_A13339LDESFondo = new String[] {""} ;
      T013721_A13342LDESLinea = new short[1] ;
      T013722_A396EmprCod = new String[] {""} ;
      T013722_A13312Lb_NLab = new int[1] ;
      T013722_A13305Lb_IDVeces = new short[1] ;
      T013722_A13306Lb_LinID = new short[1] ;
      T013723_A396EmprCod = new String[] {""} ;
      T013723_A12673LavMqId = new int[1] ;
      T013723_A12692LavMqLnPq = new short[1] ;
      T013723_A12681LavMqLn = new short[1] ;
      T013724_A396EmprCod = new String[] {""} ;
      T013724_A719PrdNum = new String[] {""} ;
      T013724_n719PrdNum = new boolean[] {false} ;
      T013724_A9713Tb1_Cod = new short[1] ;
      T013725_A396EmprCod = new String[] {""} ;
      T013725_A12236PrdNumD = new String[] {""} ;
      T013725_A719PrdNum = new String[] {""} ;
      T013725_n719PrdNum = new boolean[] {false} ;
      T013726_A396EmprCod = new String[] {""} ;
      T013726_A12225DocDisID = new long[1] ;
      T013726_A12226LinDisID = new short[1] ;
      T013727_A396EmprCod = new String[] {""} ;
      T013727_A12225DocDisID = new long[1] ;
      T013728_A396EmprCod = new String[] {""} ;
      T013728_A12205OrdenCID = new long[1] ;
      T013728_A12206OrdenCLnId = new short[1] ;
      T013729_A396EmprCod = new String[] {""} ;
      T013729_A719PrdNum = new String[] {""} ;
      T013729_n719PrdNum = new boolean[] {false} ;
      T013729_A11664LoteID = new String[] {""} ;
      T013729_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013730_A396EmprCod = new String[] {""} ;
      T013730_A4850DevComCod = new int[1] ;
      T013730_A719PrdNum = new String[] {""} ;
      T013730_n719PrdNum = new boolean[] {false} ;
      T013731_A396EmprCod = new String[] {""} ;
      T013731_A252CliCod = new int[1] ;
      T013731_A494ForSer = new String[] {""} ;
      T013731_A482ForColNom = new String[] {""} ;
      T013731_A483ForColNum = new int[1] ;
      T013731_A831TipColCod = new byte[1] ;
      T013731_A3571EnsCod = new String[] {""} ;
      T013731_A3582EnsLin = new short[1] ;
      T013732_A396EmprCod = new String[] {""} ;
      T013732_A129BarCod = new int[1] ;
      T013732_A132BarCodReo = new byte[1] ;
      T013732_A130BarCodPar = new String[] {""} ;
      T013732_A4075recestncol = new byte[1] ;
      T013732_A4076recestnpro = new byte[1] ;
      T013732_A4108recestlin = new short[1] ;
      T013733_A396EmprCod = new String[] {""} ;
      T013733_A4052EstNumFor = new int[1] ;
      T013733_A4053EstNumCol = new byte[1] ;
      T013733_A4090EstEspLin = new byte[1] ;
      T013734_A396EmprCod = new String[] {""} ;
      T013734_A4052EstNumFor = new int[1] ;
      T013734_A4053EstNumCol = new byte[1] ;
      T013734_A4084EstProLin = new byte[1] ;
      T013735_A396EmprCod = new String[] {""} ;
      T013735_A11644TransferId = new long[1] ;
      T013735_A11653TransferLn = new int[1] ;
      T013736_A396EmprCod = new String[] {""} ;
      T013736_A11634TaesId = new String[] {""} ;
      T013736_A11637TaesLn = new short[1] ;
      T013736_A11641TaesLnP = new short[1] ;
      T013737_A396EmprCod = new String[] {""} ;
      T013737_A719PrdNum = new String[] {""} ;
      T013737_n719PrdNum = new boolean[] {false} ;
      T013737_A11329H_stklin = new long[1] ;
      T013738_A396EmprCod = new String[] {""} ;
      T013738_A11270Pot_num = new int[1] ;
      T013738_A11271Pot_lin = new short[1] ;
      T013739_A396EmprCod = new String[] {""} ;
      T013739_A719PrdNum = new String[] {""} ;
      T013739_n719PrdNum = new boolean[] {false} ;
      T013739_A11199PrdNcasC = new String[] {""} ;
      T013740_A396EmprCod = new String[] {""} ;
      T013740_A719PrdNum = new String[] {""} ;
      T013740_n719PrdNum = new boolean[] {false} ;
      T013740_A11197CFraseR = new String[] {""} ;
      T013741_A396EmprCod = new String[] {""} ;
      T013741_A10243Jt_codigo = new short[1] ;
      T013741_A10246Jt_ord = new short[1] ;
      T013742_A396EmprCod = new String[] {""} ;
      T013742_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T013742_A10238Bny_lin = new short[1] ;
      T013743_A396EmprCod = new String[] {""} ;
      T013743_A129BarCod = new int[1] ;
      T013743_A132BarCodReo = new byte[1] ;
      T013743_A130BarCodPar = new String[] {""} ;
      T013743_A758ProCod = new String[] {""} ;
      T013743_A194BarOrdLin = new short[1] ;
      T013743_A719PrdNum = new String[] {""} ;
      T013743_n719PrdNum = new boolean[] {false} ;
      T013744_A396EmprCod = new String[] {""} ;
      T013744_A719PrdNum = new String[] {""} ;
      T013744_n719PrdNum = new boolean[] {false} ;
      T013744_A9735Cod_Rgo = new String[] {""} ;
      T013745_A396EmprCod = new String[] {""} ;
      T013745_A719PrdNum = new String[] {""} ;
      T013745_n719PrdNum = new boolean[] {false} ;
      T013745_A9711Ct_codigo = new short[1] ;
      T013746_A396EmprCod = new String[] {""} ;
      T013746_A9652OeNum = new long[1] ;
      T013746_A9653OeHdr = new int[1] ;
      T013746_A9654OeHdrr = new byte[1] ;
      T013746_A9655OeHdrp = new String[] {""} ;
      T013746_A9656OeLinC = new byte[1] ;
      T013746_A9657OeComb = new String[] {""} ;
      T013746_A9658Oefondo = new String[] {""} ;
      T013746_A9659OeMolCil = new byte[1] ;
      T013746_A9686OePasLin = new short[1] ;
      T013746_A9694OePasPLi = new short[1] ;
      T013747_A396EmprCod = new String[] {""} ;
      T013747_A9652OeNum = new long[1] ;
      T013747_A9653OeHdr = new int[1] ;
      T013747_A9654OeHdrr = new byte[1] ;
      T013747_A9655OeHdrp = new String[] {""} ;
      T013747_A9656OeLinC = new byte[1] ;
      T013747_A9657OeComb = new String[] {""} ;
      T013747_A9658Oefondo = new String[] {""} ;
      T013747_A9659OeMolCil = new byte[1] ;
      T013747_A9677OeMolLin = new byte[1] ;
      T013748_A396EmprCod = new String[] {""} ;
      T013748_A9578Pas_Num = new int[1] ;
      T013748_A719PrdNum = new String[] {""} ;
      T013748_n719PrdNum = new boolean[] {false} ;
      T013749_A396EmprCod = new String[] {""} ;
      T013749_A719PrdNum = new String[] {""} ;
      T013749_n719PrdNum = new boolean[] {false} ;
      T013749_A8908CC_AlmCod = new byte[1] ;
      T013749_n8908CC_AlmCod = new boolean[] {false} ;
      T013750_A396EmprCod = new String[] {""} ;
      T013750_A719PrdNum = new String[] {""} ;
      T013750_n719PrdNum = new boolean[] {false} ;
      T013750_A8661Almc_Ln = new int[1] ;
      T013751_A396EmprCod = new String[] {""} ;
      T013751_A719PrdNum = new String[] {""} ;
      T013751_n719PrdNum = new boolean[] {false} ;
      T013751_A8648Mat_PrdN = new String[] {""} ;
      T013752_A396EmprCod = new String[] {""} ;
      T013752_A8585Pet_cod = new long[1] ;
      T013752_A719PrdNum = new String[] {""} ;
      T013752_n719PrdNum = new boolean[] {false} ;
      T013753_A396EmprCod = new String[] {""} ;
      T013753_A719PrdNum = new String[] {""} ;
      T013753_n719PrdNum = new boolean[] {false} ;
      T013753_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T013754_A396EmprCod = new String[] {""} ;
      T013754_A719PrdNum = new String[] {""} ;
      T013754_n719PrdNum = new boolean[] {false} ;
      T013754_A8366PrdAnyo = new short[1] ;
      T013754_A8360PrdProv = new int[1] ;
      T013755_A396EmprCod = new String[] {""} ;
      T013755_A252CliCod = new int[1] ;
      T013755_A494ForSer = new String[] {""} ;
      T013755_A482ForColNom = new String[] {""} ;
      T013755_A483ForColNum = new int[1] ;
      T013755_A831TipColCod = new byte[1] ;
      T013755_A7797Sim_lin = new short[1] ;
      T013756_A396EmprCod = new String[] {""} ;
      T013756_A7163Vir_Codigo = new int[1] ;
      T013756_A719PrdNum = new String[] {""} ;
      T013756_n719PrdNum = new boolean[] {false} ;
      T013757_A396EmprCod = new String[] {""} ;
      T013757_A6310Lb_TaAuxC = new String[] {""} ;
      T013757_A6313lb_TaAuxL = new short[1] ;
      T013757_A6378Lb_TauxLP = new short[1] ;
      T013758_A396EmprCod = new String[] {""} ;
      T013758_A6290PreCoNum = new int[1] ;
      T013758_A719PrdNum = new String[] {""} ;
      T013758_n719PrdNum = new boolean[] {false} ;
      T013759_A396EmprCod = new String[] {""} ;
      T013759_A719PrdNum = new String[] {""} ;
      T013759_n719PrdNum = new boolean[] {false} ;
      T013759_A6158PrdPrv = new int[1] ;
      T013760_A396EmprCod = new String[] {""} ;
      T013760_A719PrdNum = new String[] {""} ;
      T013760_n719PrdNum = new boolean[] {false} ;
      T013760_A5973PrdSusNum = new String[] {""} ;
      T013761_A396EmprCod = new String[] {""} ;
      T013761_A5612Lb_CodGru = new String[] {""} ;
      T013761_A5615Lb_LinGru = new short[1] ;
      T013762_A396EmprCod = new String[] {""} ;
      T013762_A5532Lb_numero = new int[1] ;
      T013762_A5555Lb_opcion = new String[] {""} ;
      T013762_A5560Lb_LineaPr = new short[1] ;
      T013763_A396EmprCod = new String[] {""} ;
      T013763_A5532Lb_numero = new int[1] ;
      T013763_A5555Lb_opcion = new String[] {""} ;
      T013763_A5557Lb_LineaC = new short[1] ;
      T013764_A396EmprCod = new String[] {""} ;
      T013764_A5145SobCod = new int[1] ;
      T013764_A719PrdNum = new String[] {""} ;
      T013764_n719PrdNum = new boolean[] {false} ;
      T013765_A396EmprCod = new String[] {""} ;
      T013765_A4744RecPreCod = new int[1] ;
      T013765_A4762RecPreLin = new short[1] ;
      T013765_A4763RecPreNli = new short[1] ;
      T013766_A396EmprCod = new String[] {""} ;
      T013766_A4492HreBarCod = new int[1] ;
      T013766_A4493HreBarReo = new byte[1] ;
      T013766_A4494HreBarPar = new String[] {""} ;
      T013766_A4495HreNumCie = new byte[1] ;
      T013766_A4545HreLinMaq = new short[1] ;
      T013766_A4550HreLinPro = new byte[1] ;
      T013766_A4557HreRecLin = new short[1] ;
      T013767_A396EmprCod = new String[] {""} ;
      T013767_A4492HreBarCod = new int[1] ;
      T013767_A4493HreBarReo = new byte[1] ;
      T013767_A4494HreBarPar = new String[] {""} ;
      T013767_A4495HreNumCie = new byte[1] ;
      T013767_A4508HreLinMAL = new short[1] ;
      T013767_A4509HreNumAny = new byte[1] ;
      T013767_A719PrdNum = new String[] {""} ;
      T013767_n719PrdNum = new boolean[] {false} ;
      T013768_A396EmprCod = new String[] {""} ;
      T013768_A252CliCod = new int[1] ;
      T013768_A4415EstCol = new String[] {""} ;
      T013768_A4416EstColLin = new short[1] ;
      T013769_A396EmprCod = new String[] {""} ;
      T013769_A129BarCod = new int[1] ;
      T013769_A132BarCodReo = new byte[1] ;
      T013769_A130BarCodPar = new String[] {""} ;
      T013769_A2524DisComLin = new byte[1] ;
      T013769_A1056DisComCod = new String[] {""} ;
      T013769_A1032FonCod = new String[] {""} ;
      T013769_A2124RecMolCod = new byte[1] ;
      T013769_A2672RecPasLin = new short[1] ;
      T013769_A2675RecPasPLi = new short[1] ;
      T013770_A396EmprCod = new String[] {""} ;
      T013770_A129BarCod = new int[1] ;
      T013770_A132BarCodReo = new byte[1] ;
      T013770_A130BarCodPar = new String[] {""} ;
      T013770_A2524DisComLin = new byte[1] ;
      T013770_A1056DisComCod = new String[] {""} ;
      T013770_A1032FonCod = new String[] {""} ;
      T013770_A2124RecMolCod = new byte[1] ;
      T013770_A2126RecMolLin = new byte[1] ;
      T013771_A396EmprCod = new String[] {""} ;
      T013771_A2107PasCod = new String[] {""} ;
      T013771_A719PrdNum = new String[] {""} ;
      T013771_n719PrdNum = new boolean[] {false} ;
      T013772_A396EmprCod = new String[] {""} ;
      T013772_A2637HisEstHRu = new int[1] ;
      T013772_A2636HisEstHRe = new byte[1] ;
      T013772_A2635HisEstHPa = new String[] {""} ;
      T013772_A2638HisEstLCo = new byte[1] ;
      T013772_A2630HisEstCom = new String[] {""} ;
      T013772_A2634HisEstFon = new String[] {""} ;
      T013772_A719PrdNum = new String[] {""} ;
      T013772_n719PrdNum = new boolean[] {false} ;
      T013773_A396EmprCod = new String[] {""} ;
      T013773_A252CliCod = new int[1] ;
      T013773_A2141SerEst = new String[] {""} ;
      T013773_A1013DibCli = new String[] {""} ;
      T013773_A1014DibInt = new int[1] ;
      T013773_A2074ColCom = new String[] {""} ;
      T013773_A2078ColFon = new String[] {""} ;
      T013773_A2098MolCod = new byte[1] ;
      T013773_A2535ForPrdLin = new short[1] ;
      T013774_A396EmprCod = new String[] {""} ;
      T013774_A719PrdNum = new String[] {""} ;
      T013774_n719PrdNum = new boolean[] {false} ;
      T013774_A3342CCStkLin = new long[1] ;
      T013775_A396EmprCod = new String[] {""} ;
      T013775_A252CliCod = new int[1] ;
      T013775_A2891HMaForSer = new String[] {""} ;
      T013775_A2892HMaForCNom = new String[] {""} ;
      T013775_A2893HMaForCNum = new int[1] ;
      T013775_A2894HMaTipCCod = new byte[1] ;
      T013775_A2895HMaForNumC = new int[1] ;
      T013775_A2897HMaColLin = new short[1] ;
      T013775_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013775_A2907HmaLin = new short[1] ;
      T013776_A396EmprCod = new String[] {""} ;
      T013776_A129BarCod = new int[1] ;
      T013776_A132BarCodReo = new byte[1] ;
      T013776_A130BarCodPar = new String[] {""} ;
      T013776_A2808RecLinMAL = new short[1] ;
      T013776_A1377RecNumAny = new byte[1] ;
      T013776_A719PrdNum = new String[] {""} ;
      T013776_n719PrdNum = new boolean[] {false} ;
      T013777_A396EmprCod = new String[] {""} ;
      T013777_A129BarCod = new int[1] ;
      T013777_A132BarCodReo = new byte[1] ;
      T013777_A130BarCodPar = new String[] {""} ;
      T013777_A2804RecLinMaq = new short[1] ;
      T013777_A1273RecLinPro = new byte[1] ;
      T013777_A811RecLin = new short[1] ;
      T013778_A396EmprCod = new String[] {""} ;
      T013778_A129BarCod = new int[1] ;
      T013778_A132BarCodReo = new byte[1] ;
      T013778_A130BarCodPar = new String[] {""} ;
      T013778_A2494BarDosPro = new String[] {""} ;
      T013778_A719PrdNum = new String[] {""} ;
      T013778_n719PrdNum = new boolean[] {false} ;
      T013779_A396EmprCod = new String[] {""} ;
      T013779_A1314EnsLabCod = new int[1] ;
      T013779_A1317EnsLabLin = new short[1] ;
      T013780_A396EmprCod = new String[] {""} ;
      T013780_A910Workstat = new String[] {""} ;
      T013780_A887EscMLin = new int[1] ;
      T013781_A396EmprCod = new String[] {""} ;
      T013781_A859CumCodCont = new int[1] ;
      T013781_A719PrdNum = new String[] {""} ;
      T013781_n719PrdNum = new boolean[] {false} ;
      T013782_A396EmprCod = new String[] {""} ;
      T013782_A719PrdNum = new String[] {""} ;
      T013782_n719PrdNum = new boolean[] {false} ;
      T013782_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T013783_A396EmprCod = new String[] {""} ;
      T013783_A486ForNumCol = new int[1] ;
      T013783_A715PrdLin = new short[1] ;
      T013784_A396EmprCod = new String[] {""} ;
      T013784_A719PrdNum = new String[] {""} ;
      T013784_n719PrdNum = new boolean[] {false} ;
      T013784_A681PrdAny = new short[1] ;
      T013785_A396EmprCod = new String[] {""} ;
      T013785_A719PrdNum = new String[] {""} ;
      T013785_n719PrdNum = new boolean[] {false} ;
      T013785_A688PrdComCod = new String[] {""} ;
      T013786_A396EmprCod = new String[] {""} ;
      T013786_A719PrdNum = new String[] {""} ;
      T013786_n719PrdNum = new boolean[] {false} ;
      T013786_A680PrdAltNum = new String[] {""} ;
      T013787_A396EmprCod = new String[] {""} ;
      T013787_A658PedCod = new int[1] ;
      T013787_A719PrdNum = new String[] {""} ;
      T013787_n719PrdNum = new boolean[] {false} ;
      T013788_A396EmprCod = new String[] {""} ;
      T013788_A486ForNumCol = new int[1] ;
      T013788_A309ColLin = new short[1] ;
      T013789_A396EmprCod = new String[] {""} ;
      T013789_A719PrdNum = new String[] {""} ;
      T013789_n719PrdNum = new boolean[] {false} ;
      T013789_A647NumCon = new int[1] ;
      T013790_A396EmprCod = new String[] {""} ;
      T013790_A719PrdNum = new String[] {""} ;
      T013790_n719PrdNum = new boolean[] {false} ;
      Z8909CC_AlmDsc = "" ;
      Z3346TipMovCn = "" ;
      T013791_A8911CC_Lin = new long[1] ;
      T013791_A8912CC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      T013791_n8912CC_Fech = new boolean[] {false} ;
      T013791_A8913CC_Usu = new String[] {""} ;
      T013791_n8913CC_Usu = new boolean[] {false} ;
      T013791_A8914CC_Term = new String[] {""} ;
      T013791_n8914CC_Term = new boolean[] {false} ;
      T013791_A8915CC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013791_n8915CC_Cant = new boolean[] {false} ;
      T013791_A8909CC_AlmDsc = new String[] {""} ;
      T013791_n8909CC_AlmDsc = new boolean[] {false} ;
      T013791_A3346TipMovCn = new String[] {""} ;
      T013791_n3346TipMovCn = new boolean[] {false} ;
      T013791_A8916CC_Desc = new String[] {""} ;
      T013791_n8916CC_Desc = new boolean[] {false} ;
      T013791_A8917CC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T013791_n8917CC_Prec = new boolean[] {false} ;
      T013791_A8927CC_NumAlb = new int[1] ;
      T013791_n8927CC_NumAlb = new boolean[] {false} ;
      T013791_A8930CC_HDR = new String[] {""} ;
      T013791_n8930CC_HDR = new boolean[] {false} ;
      T013791_A8931CC_Hdr1 = new int[1] ;
      T013791_n8931CC_Hdr1 = new boolean[] {false} ;
      T013791_A8932CC_Hdr2 = new byte[1] ;
      T013791_n8932CC_Hdr2 = new boolean[] {false} ;
      T013791_A8933CC_Hdr3 = new String[] {""} ;
      T013791_n8933CC_Hdr3 = new boolean[] {false} ;
      T013791_A396EmprCod = new String[] {""} ;
      T013791_A3345TipMovCc = new String[] {""} ;
      T013791_n3345TipMovCc = new boolean[] {false} ;
      T013791_A8908CC_AlmCod = new byte[1] ;
      T013791_n8908CC_AlmCod = new boolean[] {false} ;
      T013791_A719PrdNum = new String[] {""} ;
      T013791_n719PrdNum = new boolean[] {false} ;
      T01374_A3346TipMovCn = new String[] {""} ;
      T01374_n3346TipMovCn = new boolean[] {false} ;
      T01375_A8909CC_AlmDsc = new String[] {""} ;
      T01375_n8909CC_AlmDsc = new boolean[] {false} ;
      T01376_A396EmprCod = new String[] {""} ;
      T013792_A3346TipMovCn = new String[] {""} ;
      T013792_n3346TipMovCn = new boolean[] {false} ;
      T013793_A8909CC_AlmDsc = new String[] {""} ;
      T013793_n8909CC_AlmDsc = new boolean[] {false} ;
      T013794_A396EmprCod = new String[] {""} ;
      T013795_A396EmprCod = new String[] {""} ;
      T013795_A719PrdNum = new String[] {""} ;
      T013795_n719PrdNum = new boolean[] {false} ;
      T013795_A8911CC_Lin = new long[1] ;
      T01373_A8911CC_Lin = new long[1] ;
      T01373_A8912CC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      T01373_n8912CC_Fech = new boolean[] {false} ;
      T01373_A8913CC_Usu = new String[] {""} ;
      T01373_n8913CC_Usu = new boolean[] {false} ;
      T01373_A8914CC_Term = new String[] {""} ;
      T01373_n8914CC_Term = new boolean[] {false} ;
      T01373_A8915CC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01373_n8915CC_Cant = new boolean[] {false} ;
      T01373_A8916CC_Desc = new String[] {""} ;
      T01373_n8916CC_Desc = new boolean[] {false} ;
      T01373_A8917CC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01373_n8917CC_Prec = new boolean[] {false} ;
      T01373_A8927CC_NumAlb = new int[1] ;
      T01373_n8927CC_NumAlb = new boolean[] {false} ;
      T01373_A8930CC_HDR = new String[] {""} ;
      T01373_n8930CC_HDR = new boolean[] {false} ;
      T01373_A8931CC_Hdr1 = new int[1] ;
      T01373_n8931CC_Hdr1 = new boolean[] {false} ;
      T01373_A8932CC_Hdr2 = new byte[1] ;
      T01373_n8932CC_Hdr2 = new boolean[] {false} ;
      T01373_A8933CC_Hdr3 = new String[] {""} ;
      T01373_n8933CC_Hdr3 = new boolean[] {false} ;
      T01373_A396EmprCod = new String[] {""} ;
      T01373_A3345TipMovCc = new String[] {""} ;
      T01373_n3345TipMovCc = new boolean[] {false} ;
      T01373_A8908CC_AlmCod = new byte[1] ;
      T01373_n8908CC_AlmCod = new boolean[] {false} ;
      T01373_A719PrdNum = new String[] {""} ;
      T01373_n719PrdNum = new boolean[] {false} ;
      T01372_A8911CC_Lin = new long[1] ;
      T01372_A8912CC_Fech = new java.util.Date[] {GXutil.nullDate()} ;
      T01372_n8912CC_Fech = new boolean[] {false} ;
      T01372_A8913CC_Usu = new String[] {""} ;
      T01372_n8913CC_Usu = new boolean[] {false} ;
      T01372_A8914CC_Term = new String[] {""} ;
      T01372_n8914CC_Term = new boolean[] {false} ;
      T01372_A8915CC_Cant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01372_n8915CC_Cant = new boolean[] {false} ;
      T01372_A8916CC_Desc = new String[] {""} ;
      T01372_n8916CC_Desc = new boolean[] {false} ;
      T01372_A8917CC_Prec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01372_n8917CC_Prec = new boolean[] {false} ;
      T01372_A8927CC_NumAlb = new int[1] ;
      T01372_n8927CC_NumAlb = new boolean[] {false} ;
      T01372_A8930CC_HDR = new String[] {""} ;
      T01372_n8930CC_HDR = new boolean[] {false} ;
      T01372_A8931CC_Hdr1 = new int[1] ;
      T01372_n8931CC_Hdr1 = new boolean[] {false} ;
      T01372_A8932CC_Hdr2 = new byte[1] ;
      T01372_n8932CC_Hdr2 = new boolean[] {false} ;
      T01372_A8933CC_Hdr3 = new String[] {""} ;
      T01372_n8933CC_Hdr3 = new boolean[] {false} ;
      T01372_A396EmprCod = new String[] {""} ;
      T01372_A3345TipMovCc = new String[] {""} ;
      T01372_n3345TipMovCc = new boolean[] {false} ;
      T01372_A8908CC_AlmCod = new byte[1] ;
      T01372_n8908CC_AlmCod = new boolean[] {false} ;
      T01372_A719PrdNum = new String[] {""} ;
      T01372_n719PrdNum = new boolean[] {false} ;
      T013799_A8909CC_AlmDsc = new String[] {""} ;
      T013799_n8909CC_AlmDsc = new boolean[] {false} ;
      T0137100_A3346TipMovCn = new String[] {""} ;
      T0137100_n3346TipMovCn = new boolean[] {false} ;
      T0137101_A396EmprCod = new String[] {""} ;
      T0137101_A719PrdNum = new String[] {""} ;
      T0137101_n719PrdNum = new boolean[] {false} ;
      T0137101_A8911CC_Lin = new long[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T0137102_A407EmprNom = new String[] {""} ;
      T0137102_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ407EmprNom = "" ;
      ZZ718PrdNom = "" ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      T0137103_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tccalm__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tccalm__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tccalm__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tccalm__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tccalm__default(),
         new Object[] {
             new Object[] {
            T01372_A8911CC_Lin, T01372_A8912CC_Fech, T01372_n8912CC_Fech, T01372_A8913CC_Usu, T01372_n8913CC_Usu, T01372_A8914CC_Term, T01372_n8914CC_Term, T01372_A8915CC_Cant, T01372_n8915CC_Cant, T01372_A8916CC_Desc,
            T01372_n8916CC_Desc, T01372_A8917CC_Prec, T01372_n8917CC_Prec, T01372_A8927CC_NumAlb, T01372_n8927CC_NumAlb, T01372_A8930CC_HDR, T01372_n8930CC_HDR, T01372_A8931CC_Hdr1, T01372_n8931CC_Hdr1, T01372_A8932CC_Hdr2,
            T01372_n8932CC_Hdr2, T01372_A8933CC_Hdr3, T01372_n8933CC_Hdr3, T01372_A396EmprCod, T01372_A3345TipMovCc, T01372_n3345TipMovCc, T01372_A8908CC_AlmCod, T01372_n8908CC_AlmCod, T01372_A719PrdNum
            }
            , new Object[] {
            T01373_A8911CC_Lin, T01373_A8912CC_Fech, T01373_n8912CC_Fech, T01373_A8913CC_Usu, T01373_n8913CC_Usu, T01373_A8914CC_Term, T01373_n8914CC_Term, T01373_A8915CC_Cant, T01373_n8915CC_Cant, T01373_A8916CC_Desc,
            T01373_n8916CC_Desc, T01373_A8917CC_Prec, T01373_n8917CC_Prec, T01373_A8927CC_NumAlb, T01373_n8927CC_NumAlb, T01373_A8930CC_HDR, T01373_n8930CC_HDR, T01373_A8931CC_Hdr1, T01373_n8931CC_Hdr1, T01373_A8932CC_Hdr2,
            T01373_n8932CC_Hdr2, T01373_A8933CC_Hdr3, T01373_n8933CC_Hdr3, T01373_A396EmprCod, T01373_A3345TipMovCc, T01373_n3345TipMovCc, T01373_A8908CC_AlmCod, T01373_n8908CC_AlmCod, T01373_A719PrdNum
            }
            , new Object[] {
            T01374_A3346TipMovCn, T01374_n3346TipMovCn
            }
            , new Object[] {
            T01375_A8909CC_AlmDsc, T01375_n8909CC_AlmDsc
            }
            , new Object[] {
            T01376_A396EmprCod
            }
            , new Object[] {
            T01377_A719PrdNum, T01377_A718PrdNom, T01377_A8910CC_Ultln, T01377_n8910CC_Ultln, T01377_A705PrdExiCC, T01377_A396EmprCod
            }
            , new Object[] {
            T01378_A719PrdNum, T01378_A718PrdNom, T01378_A8910CC_Ultln, T01378_n8910CC_Ultln, T01378_A705PrdExiCC, T01378_A396EmprCod
            }
            , new Object[] {
            T01379_A407EmprNom, T01379_n407EmprNom
            }
            , new Object[] {
            T013710_A719PrdNum, T013710_A407EmprNom, T013710_n407EmprNom, T013710_A718PrdNom, T013710_A8910CC_Ultln, T013710_n8910CC_Ultln, T013710_A705PrdExiCC, T013710_A396EmprCod
            }
            , new Object[] {
            T013711_A396EmprCod, T013711_A719PrdNum
            }
            , new Object[] {
            T013712_A396EmprCod, T013712_A719PrdNum
            }
            , new Object[] {
            T013713_A396EmprCod, T013713_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013717_A396EmprCod, T013717_A719PrdNum, T013717_A13217NormaID
            }
            , new Object[] {
            T013718_A396EmprCod, T013718_A719PrdNum, T013718_A13586TheList
            }
            , new Object[] {
            T013719_A396EmprCod, T013719_A5532Lb_numero, T013719_A5555Lb_opcion, T013719_A13460Lb_linCP, T013719_A13458Lb_TipCP
            }
            , new Object[] {
            T013720_A396EmprCod, T013720_A13418AlbProID, T013720_A13442AlbProLine
            }
            , new Object[] {
            T013721_A396EmprCod, T013721_A13324LDESID, T013721_A13333LDESNPeque, T013721_A13337LDESComb, T013721_A13339LDESFondo, T013721_A13342LDESLinea
            }
            , new Object[] {
            T013722_A396EmprCod, T013722_A13312Lb_NLab, T013722_A13305Lb_IDVeces, T013722_A13306Lb_LinID
            }
            , new Object[] {
            T013723_A396EmprCod, T013723_A12673LavMqId, T013723_A12692LavMqLnPq, T013723_A12681LavMqLn
            }
            , new Object[] {
            T013724_A396EmprCod, T013724_A719PrdNum, T013724_A9713Tb1_Cod
            }
            , new Object[] {
            T013725_A396EmprCod, T013725_A12236PrdNumD, T013725_A719PrdNum
            }
            , new Object[] {
            T013726_A396EmprCod, T013726_A12225DocDisID, T013726_A12226LinDisID
            }
            , new Object[] {
            T013727_A396EmprCod, T013727_A12225DocDisID
            }
            , new Object[] {
            T013728_A396EmprCod, T013728_A12205OrdenCID, T013728_A12206OrdenCLnId
            }
            , new Object[] {
            T013729_A396EmprCod, T013729_A719PrdNum, T013729_A11664LoteID, T013729_A11665LoteFec
            }
            , new Object[] {
            T013730_A396EmprCod, T013730_A4850DevComCod, T013730_A719PrdNum
            }
            , new Object[] {
            T013731_A396EmprCod, T013731_A252CliCod, T013731_A494ForSer, T013731_A482ForColNom, T013731_A483ForColNum, T013731_A831TipColCod, T013731_A3571EnsCod, T013731_A3582EnsLin
            }
            , new Object[] {
            T013732_A396EmprCod, T013732_A129BarCod, T013732_A132BarCodReo, T013732_A130BarCodPar, T013732_A4075recestncol, T013732_A4076recestnpro, T013732_A4108recestlin
            }
            , new Object[] {
            T013733_A396EmprCod, T013733_A4052EstNumFor, T013733_A4053EstNumCol, T013733_A4090EstEspLin
            }
            , new Object[] {
            T013734_A396EmprCod, T013734_A4052EstNumFor, T013734_A4053EstNumCol, T013734_A4084EstProLin
            }
            , new Object[] {
            T013735_A396EmprCod, T013735_A11644TransferId, T013735_A11653TransferLn
            }
            , new Object[] {
            T013736_A396EmprCod, T013736_A11634TaesId, T013736_A11637TaesLn, T013736_A11641TaesLnP
            }
            , new Object[] {
            T013737_A396EmprCod, T013737_A719PrdNum, T013737_A11329H_stklin
            }
            , new Object[] {
            T013738_A396EmprCod, T013738_A11270Pot_num, T013738_A11271Pot_lin
            }
            , new Object[] {
            T013739_A396EmprCod, T013739_A719PrdNum, T013739_A11199PrdNcasC
            }
            , new Object[] {
            T013740_A396EmprCod, T013740_A719PrdNum, T013740_A11197CFraseR
            }
            , new Object[] {
            T013741_A396EmprCod, T013741_A10243Jt_codigo, T013741_A10246Jt_ord
            }
            , new Object[] {
            T013742_A396EmprCod, T013742_A10236Bny_dia, T013742_A10238Bny_lin
            }
            , new Object[] {
            T013743_A396EmprCod, T013743_A129BarCod, T013743_A132BarCodReo, T013743_A130BarCodPar, T013743_A758ProCod, T013743_A194BarOrdLin, T013743_A719PrdNum
            }
            , new Object[] {
            T013744_A396EmprCod, T013744_A719PrdNum, T013744_A9735Cod_Rgo
            }
            , new Object[] {
            T013745_A396EmprCod, T013745_A719PrdNum, T013745_A9711Ct_codigo
            }
            , new Object[] {
            T013746_A396EmprCod, T013746_A9652OeNum, T013746_A9653OeHdr, T013746_A9654OeHdrr, T013746_A9655OeHdrp, T013746_A9656OeLinC, T013746_A9657OeComb, T013746_A9658Oefondo, T013746_A9659OeMolCil, T013746_A9686OePasLin,
            T013746_A9694OePasPLi
            }
            , new Object[] {
            T013747_A396EmprCod, T013747_A9652OeNum, T013747_A9653OeHdr, T013747_A9654OeHdrr, T013747_A9655OeHdrp, T013747_A9656OeLinC, T013747_A9657OeComb, T013747_A9658Oefondo, T013747_A9659OeMolCil, T013747_A9677OeMolLin
            }
            , new Object[] {
            T013748_A396EmprCod, T013748_A9578Pas_Num, T013748_A719PrdNum
            }
            , new Object[] {
            T013749_A396EmprCod, T013749_A719PrdNum, T013749_A8908CC_AlmCod
            }
            , new Object[] {
            T013750_A396EmprCod, T013750_A719PrdNum, T013750_A8661Almc_Ln
            }
            , new Object[] {
            T013751_A396EmprCod, T013751_A719PrdNum, T013751_A8648Mat_PrdN
            }
            , new Object[] {
            T013752_A396EmprCod, T013752_A8585Pet_cod, T013752_A719PrdNum
            }
            , new Object[] {
            T013753_A396EmprCod, T013753_A719PrdNum, T013753_A8577RecFecHr
            }
            , new Object[] {
            T013754_A396EmprCod, T013754_A719PrdNum, T013754_A8366PrdAnyo, T013754_A8360PrdProv
            }
            , new Object[] {
            T013755_A396EmprCod, T013755_A252CliCod, T013755_A494ForSer, T013755_A482ForColNom, T013755_A483ForColNum, T013755_A831TipColCod, T013755_A7797Sim_lin
            }
            , new Object[] {
            T013756_A396EmprCod, T013756_A7163Vir_Codigo, T013756_A719PrdNum
            }
            , new Object[] {
            T013757_A396EmprCod, T013757_A6310Lb_TaAuxC, T013757_A6313lb_TaAuxL, T013757_A6378Lb_TauxLP
            }
            , new Object[] {
            T013758_A396EmprCod, T013758_A6290PreCoNum, T013758_A719PrdNum
            }
            , new Object[] {
            T013759_A396EmprCod, T013759_A719PrdNum, T013759_A6158PrdPrv
            }
            , new Object[] {
            T013760_A396EmprCod, T013760_A719PrdNum, T013760_A5973PrdSusNum
            }
            , new Object[] {
            T013761_A396EmprCod, T013761_A5612Lb_CodGru, T013761_A5615Lb_LinGru
            }
            , new Object[] {
            T013762_A396EmprCod, T013762_A5532Lb_numero, T013762_A5555Lb_opcion, T013762_A5560Lb_LineaPr
            }
            , new Object[] {
            T013763_A396EmprCod, T013763_A5532Lb_numero, T013763_A5555Lb_opcion, T013763_A5557Lb_LineaC
            }
            , new Object[] {
            T013764_A396EmprCod, T013764_A5145SobCod, T013764_A719PrdNum
            }
            , new Object[] {
            T013765_A396EmprCod, T013765_A4744RecPreCod, T013765_A4762RecPreLin, T013765_A4763RecPreNli
            }
            , new Object[] {
            T013766_A396EmprCod, T013766_A4492HreBarCod, T013766_A4493HreBarReo, T013766_A4494HreBarPar, T013766_A4495HreNumCie, T013766_A4545HreLinMaq, T013766_A4550HreLinPro, T013766_A4557HreRecLin
            }
            , new Object[] {
            T013767_A396EmprCod, T013767_A4492HreBarCod, T013767_A4493HreBarReo, T013767_A4494HreBarPar, T013767_A4495HreNumCie, T013767_A4508HreLinMAL, T013767_A4509HreNumAny, T013767_A719PrdNum
            }
            , new Object[] {
            T013768_A396EmprCod, T013768_A252CliCod, T013768_A4415EstCol, T013768_A4416EstColLin
            }
            , new Object[] {
            T013769_A396EmprCod, T013769_A129BarCod, T013769_A132BarCodReo, T013769_A130BarCodPar, T013769_A2524DisComLin, T013769_A1056DisComCod, T013769_A1032FonCod, T013769_A2124RecMolCod, T013769_A2672RecPasLin, T013769_A2675RecPasPLi
            }
            , new Object[] {
            T013770_A396EmprCod, T013770_A129BarCod, T013770_A132BarCodReo, T013770_A130BarCodPar, T013770_A2524DisComLin, T013770_A1056DisComCod, T013770_A1032FonCod, T013770_A2124RecMolCod, T013770_A2126RecMolLin
            }
            , new Object[] {
            T013771_A396EmprCod, T013771_A2107PasCod, T013771_A719PrdNum
            }
            , new Object[] {
            T013772_A396EmprCod, T013772_A2637HisEstHRu, T013772_A2636HisEstHRe, T013772_A2635HisEstHPa, T013772_A2638HisEstLCo, T013772_A2630HisEstCom, T013772_A2634HisEstFon, T013772_A719PrdNum
            }
            , new Object[] {
            T013773_A396EmprCod, T013773_A252CliCod, T013773_A2141SerEst, T013773_A1013DibCli, T013773_A1014DibInt, T013773_A2074ColCom, T013773_A2078ColFon, T013773_A2098MolCod, T013773_A2535ForPrdLin
            }
            , new Object[] {
            T013774_A396EmprCod, T013774_A719PrdNum, T013774_A3342CCStkLin
            }
            , new Object[] {
            T013775_A396EmprCod, T013775_A252CliCod, T013775_A2891HMaForSer, T013775_A2892HMaForCNom, T013775_A2893HMaForCNum, T013775_A2894HMaTipCCod, T013775_A2895HMaForNumC, T013775_A2897HMaColLin, T013775_A2896HMaFec, T013775_A2907HmaLin
            }
            , new Object[] {
            T013776_A396EmprCod, T013776_A129BarCod, T013776_A132BarCodReo, T013776_A130BarCodPar, T013776_A2808RecLinMAL, T013776_A1377RecNumAny, T013776_A719PrdNum
            }
            , new Object[] {
            T013777_A396EmprCod, T013777_A129BarCod, T013777_A132BarCodReo, T013777_A130BarCodPar, T013777_A2804RecLinMaq, T013777_A1273RecLinPro, T013777_A811RecLin
            }
            , new Object[] {
            T013778_A396EmprCod, T013778_A129BarCod, T013778_A132BarCodReo, T013778_A130BarCodPar, T013778_A2494BarDosPro, T013778_A719PrdNum
            }
            , new Object[] {
            T013779_A396EmprCod, T013779_A1314EnsLabCod, T013779_A1317EnsLabLin
            }
            , new Object[] {
            T013780_A396EmprCod, T013780_A910Workstat, T013780_A887EscMLin
            }
            , new Object[] {
            T013781_A396EmprCod, T013781_A859CumCodCont, T013781_A719PrdNum
            }
            , new Object[] {
            T013782_A396EmprCod, T013782_A719PrdNum, T013782_A810RecFec
            }
            , new Object[] {
            T013783_A396EmprCod, T013783_A486ForNumCol, T013783_A715PrdLin
            }
            , new Object[] {
            T013784_A396EmprCod, T013784_A719PrdNum, T013784_A681PrdAny
            }
            , new Object[] {
            T013785_A396EmprCod, T013785_A719PrdNum, T013785_A688PrdComCod
            }
            , new Object[] {
            T013786_A396EmprCod, T013786_A719PrdNum, T013786_A680PrdAltNum
            }
            , new Object[] {
            T013787_A396EmprCod, T013787_A658PedCod, T013787_A719PrdNum
            }
            , new Object[] {
            T013788_A396EmprCod, T013788_A486ForNumCol, T013788_A309ColLin
            }
            , new Object[] {
            T013789_A396EmprCod, T013789_A719PrdNum, T013789_A647NumCon
            }
            , new Object[] {
            T013790_A396EmprCod, T013790_A719PrdNum
            }
            , new Object[] {
            T013791_A8911CC_Lin, T013791_A8912CC_Fech, T013791_n8912CC_Fech, T013791_A8913CC_Usu, T013791_n8913CC_Usu, T013791_A8914CC_Term, T013791_n8914CC_Term, T013791_A8915CC_Cant, T013791_n8915CC_Cant, T013791_A8909CC_AlmDsc,
            T013791_n8909CC_AlmDsc, T013791_A3346TipMovCn, T013791_n3346TipMovCn, T013791_A8916CC_Desc, T013791_n8916CC_Desc, T013791_A8917CC_Prec, T013791_n8917CC_Prec, T013791_A8927CC_NumAlb, T013791_n8927CC_NumAlb, T013791_A8930CC_HDR,
            T013791_n8930CC_HDR, T013791_A8931CC_Hdr1, T013791_n8931CC_Hdr1, T013791_A8932CC_Hdr2, T013791_n8932CC_Hdr2, T013791_A8933CC_Hdr3, T013791_n8933CC_Hdr3, T013791_A396EmprCod, T013791_A3345TipMovCc, T013791_n3345TipMovCc,
            T013791_A8908CC_AlmCod, T013791_n8908CC_AlmCod, T013791_A719PrdNum
            }
            , new Object[] {
            T013792_A3346TipMovCn, T013792_n3346TipMovCn
            }
            , new Object[] {
            T013793_A8909CC_AlmDsc, T013793_n8909CC_AlmDsc
            }
            , new Object[] {
            T013794_A396EmprCod
            }
            , new Object[] {
            T013795_A396EmprCod, T013795_A719PrdNum, T013795_A8911CC_Lin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013799_A8909CC_AlmDsc, T013799_n8909CC_AlmDsc
            }
            , new Object[] {
            T0137100_A3346TipMovCn, T0137100_n3346TipMovCn
            }
            , new Object[] {
            T0137101_A396EmprCod, T0137101_A719PrdNum, T0137101_A8911CC_Lin
            }
            , new Object[] {
            T0137102_A407EmprNom, T0137102_n407EmprNom
            }
            , new Object[] {
            T0137103_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "TCCALM" ;
   }

   private byte Z8932CC_Hdr2 ;
   private byte Z8908CC_AlmCod ;
   private byte GxWebError ;
   private byte A8908CC_AlmCod ;
   private byte nKeyPressed ;
   private byte A8932CC_Hdr2 ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short nRcdDeleted_1212 ;
   private short nRcdExists_1212 ;
   private short nIsMod_1212 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1212 ;
   private short RcdFound1212 ;
   private short nBlankRcdUsr1212 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_1212 ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
   private int Z8927CC_NumAlb ;
   private int Z8931CC_Hdr1 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtCC_Ultln_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtavnRcdDeleted_1212_Enabled ;
   private int edtCC_Lin_Enabled ;
   private int edtCC_Fech_Enabled ;
   private int edtCC_Usu_Enabled ;
   private int edtCC_Term_Enabled ;
   private int edtCC_Cant_Enabled ;
   private int edtCC_AlmCod_Enabled ;
   private int edtCC_AlmDsc_Enabled ;
   private int edtTipMovCc_Enabled ;
   private int edtTipMovCn_Enabled ;
   private int edtCC_Desc_Enabled ;
   private int edtCC_Prec_Enabled ;
   private int edtCC_NumAlb_Enabled ;
   private int edtCC_HDR_Enabled ;
   private int edtCC_Hdr1_Enabled ;
   private int edtCC_Hdr2_Enabled ;
   private int edtCC_Hdr3_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A8927CC_NumAlb ;
   private int A8931CC_Hdr1 ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtCC_Lin_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtPrdExiCC_Backcolor ;
   private int edtCC_Ultln_Backcolor ;
   private int edtPrdNom_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private long Z8910CC_Ultln ;
   private long Z8911CC_Lin ;
   private long A8910CC_Ultln ;
   private long GRID1_nFirstRecordOnPage ;
   private long A8911CC_Lin ;
   private long ZZ8910CC_Ultln ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z8915CC_Cant ;
   private java.math.BigDecimal Z8917CC_Prec ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A8915CC_Cant ;
   private java.math.BigDecimal A8917CC_Prec ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z8913CC_Usu ;
   private String Z8914CC_Term ;
   private String Z8916CC_Desc ;
   private String Z8930CC_HDR ;
   private String Z8933CC_Hdr3 ;
   private String Z3345TipMovCc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3345TipMovCc ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtPrdNum_Internalname ;
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
   private String edtPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCC_Ultln_Internalname ;
   private String edtCC_Ultln_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String sMode1212 ;
   private String edtavnRcdDeleted_1212_Internalname ;
   private String edtCC_Lin_Internalname ;
   private String edtCC_Fech_Internalname ;
   private String edtCC_Usu_Internalname ;
   private String edtCC_Term_Internalname ;
   private String edtCC_Cant_Internalname ;
   private String edtCC_AlmCod_Internalname ;
   private String edtCC_AlmDsc_Internalname ;
   private String edtTipMovCc_Internalname ;
   private String edtTipMovCn_Internalname ;
   private String edtCC_Desc_Internalname ;
   private String edtCC_Prec_Internalname ;
   private String edtCC_NumAlb_Internalname ;
   private String edtCC_HDR_Internalname ;
   private String edtCC_Hdr1_Internalname ;
   private String edtCC_Hdr2_Internalname ;
   private String edtCC_Hdr3_Internalname ;
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
   private String sMode29 ;
   private String GXCCtl ;
   private String A8913CC_Usu ;
   private String A8914CC_Term ;
   private String A8909CC_AlmDsc ;
   private String A3346TipMovCn ;
   private String A8916CC_Desc ;
   private String A8930CC_HDR ;
   private String A8933CC_Hdr3 ;
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
   private String Z8909CC_AlmDsc ;
   private String Z3346TipMovCn ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1212_Jsonclick ;
   private String edtCC_Lin_Jsonclick ;
   private String edtCC_Fech_Jsonclick ;
   private String edtCC_Usu_Jsonclick ;
   private String edtCC_Term_Jsonclick ;
   private String edtCC_Cant_Jsonclick ;
   private String edtCC_AlmCod_Jsonclick ;
   private String edtCC_AlmDsc_Jsonclick ;
   private String edtTipMovCc_Jsonclick ;
   private String edtTipMovCn_Jsonclick ;
   private String edtCC_Desc_Jsonclick ;
   private String edtCC_Prec_Jsonclick ;
   private String edtCC_NumAlb_Jsonclick ;
   private String edtCC_HDR_Jsonclick ;
   private String edtCC_Hdr1_Jsonclick ;
   private String edtCC_Hdr2_Jsonclick ;
   private String edtCC_Hdr3_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ407EmprNom ;
   private String ZZ718PrdNom ;
   private java.util.Date Z8912CC_Fech ;
   private java.util.Date A8912CC_Fech ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n3345TipMovCc ;
   private boolean n8908CC_AlmCod ;
   private boolean n719PrdNum ;
   private boolean wbErr ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n8910CC_Ultln ;
   private boolean returnInSub ;
   private boolean n8912CC_Fech ;
   private boolean n8913CC_Usu ;
   private boolean n8914CC_Term ;
   private boolean n8915CC_Cant ;
   private boolean n8909CC_AlmDsc ;
   private boolean n3346TipMovCn ;
   private boolean n8916CC_Desc ;
   private boolean n8917CC_Prec ;
   private boolean n8927CC_NumAlb ;
   private boolean n8930CC_HDR ;
   private boolean n8931CC_Hdr1 ;
   private boolean n8932CC_Hdr2 ;
   private boolean n8933CC_Hdr3 ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01379_A407EmprNom ;
   private boolean[] T01379_n407EmprNom ;
   private String[] T013710_A719PrdNum ;
   private boolean[] T013710_n719PrdNum ;
   private String[] T013710_A407EmprNom ;
   private boolean[] T013710_n407EmprNom ;
   private String[] T013710_A718PrdNom ;
   private long[] T013710_A8910CC_Ultln ;
   private boolean[] T013710_n8910CC_Ultln ;
   private java.math.BigDecimal[] T013710_A705PrdExiCC ;
   private String[] T013710_A396EmprCod ;
   private String[] T013711_A396EmprCod ;
   private String[] T013711_A719PrdNum ;
   private boolean[] T013711_n719PrdNum ;
   private String[] T01378_A719PrdNum ;
   private boolean[] T01378_n719PrdNum ;
   private String[] T01378_A718PrdNom ;
   private long[] T01378_A8910CC_Ultln ;
   private boolean[] T01378_n8910CC_Ultln ;
   private java.math.BigDecimal[] T01378_A705PrdExiCC ;
   private String[] T01378_A396EmprCod ;
   private String[] T013712_A396EmprCod ;
   private String[] T013712_A719PrdNum ;
   private boolean[] T013712_n719PrdNum ;
   private String[] T013713_A396EmprCod ;
   private String[] T013713_A719PrdNum ;
   private boolean[] T013713_n719PrdNum ;
   private String[] T01377_A719PrdNum ;
   private boolean[] T01377_n719PrdNum ;
   private String[] T01377_A718PrdNom ;
   private long[] T01377_A8910CC_Ultln ;
   private boolean[] T01377_n8910CC_Ultln ;
   private java.math.BigDecimal[] T01377_A705PrdExiCC ;
   private String[] T01377_A396EmprCod ;
   private String[] T013717_A396EmprCod ;
   private String[] T013717_A719PrdNum ;
   private boolean[] T013717_n719PrdNum ;
   private String[] T013717_A13217NormaID ;
   private String[] T013718_A396EmprCod ;
   private String[] T013718_A719PrdNum ;
   private boolean[] T013718_n719PrdNum ;
   private String[] T013718_A13586TheList ;
   private String[] T013719_A396EmprCod ;
   private int[] T013719_A5532Lb_numero ;
   private String[] T013719_A5555Lb_opcion ;
   private short[] T013719_A13460Lb_linCP ;
   private String[] T013719_A13458Lb_TipCP ;
   private String[] T013720_A396EmprCod ;
   private int[] T013720_A13418AlbProID ;
   private short[] T013720_A13442AlbProLine ;
   private String[] T013721_A396EmprCod ;
   private int[] T013721_A13324LDESID ;
   private String[] T013721_A13333LDESNPeque ;
   private String[] T013721_A13337LDESComb ;
   private String[] T013721_A13339LDESFondo ;
   private short[] T013721_A13342LDESLinea ;
   private String[] T013722_A396EmprCod ;
   private int[] T013722_A13312Lb_NLab ;
   private short[] T013722_A13305Lb_IDVeces ;
   private short[] T013722_A13306Lb_LinID ;
   private String[] T013723_A396EmprCod ;
   private int[] T013723_A12673LavMqId ;
   private short[] T013723_A12692LavMqLnPq ;
   private short[] T013723_A12681LavMqLn ;
   private String[] T013724_A396EmprCod ;
   private String[] T013724_A719PrdNum ;
   private boolean[] T013724_n719PrdNum ;
   private short[] T013724_A9713Tb1_Cod ;
   private String[] T013725_A396EmprCod ;
   private String[] T013725_A12236PrdNumD ;
   private String[] T013725_A719PrdNum ;
   private boolean[] T013725_n719PrdNum ;
   private String[] T013726_A396EmprCod ;
   private long[] T013726_A12225DocDisID ;
   private short[] T013726_A12226LinDisID ;
   private String[] T013727_A396EmprCod ;
   private long[] T013727_A12225DocDisID ;
   private String[] T013728_A396EmprCod ;
   private long[] T013728_A12205OrdenCID ;
   private short[] T013728_A12206OrdenCLnId ;
   private String[] T013729_A396EmprCod ;
   private String[] T013729_A719PrdNum ;
   private boolean[] T013729_n719PrdNum ;
   private String[] T013729_A11664LoteID ;
   private java.util.Date[] T013729_A11665LoteFec ;
   private String[] T013730_A396EmprCod ;
   private int[] T013730_A4850DevComCod ;
   private String[] T013730_A719PrdNum ;
   private boolean[] T013730_n719PrdNum ;
   private String[] T013731_A396EmprCod ;
   private int[] T013731_A252CliCod ;
   private String[] T013731_A494ForSer ;
   private String[] T013731_A482ForColNom ;
   private int[] T013731_A483ForColNum ;
   private byte[] T013731_A831TipColCod ;
   private String[] T013731_A3571EnsCod ;
   private short[] T013731_A3582EnsLin ;
   private String[] T013732_A396EmprCod ;
   private int[] T013732_A129BarCod ;
   private byte[] T013732_A132BarCodReo ;
   private String[] T013732_A130BarCodPar ;
   private byte[] T013732_A4075recestncol ;
   private byte[] T013732_A4076recestnpro ;
   private short[] T013732_A4108recestlin ;
   private String[] T013733_A396EmprCod ;
   private int[] T013733_A4052EstNumFor ;
   private byte[] T013733_A4053EstNumCol ;
   private byte[] T013733_A4090EstEspLin ;
   private String[] T013734_A396EmprCod ;
   private int[] T013734_A4052EstNumFor ;
   private byte[] T013734_A4053EstNumCol ;
   private byte[] T013734_A4084EstProLin ;
   private String[] T013735_A396EmprCod ;
   private long[] T013735_A11644TransferId ;
   private int[] T013735_A11653TransferLn ;
   private String[] T013736_A396EmprCod ;
   private String[] T013736_A11634TaesId ;
   private short[] T013736_A11637TaesLn ;
   private short[] T013736_A11641TaesLnP ;
   private String[] T013737_A396EmprCod ;
   private String[] T013737_A719PrdNum ;
   private boolean[] T013737_n719PrdNum ;
   private long[] T013737_A11329H_stklin ;
   private String[] T013738_A396EmprCod ;
   private int[] T013738_A11270Pot_num ;
   private short[] T013738_A11271Pot_lin ;
   private String[] T013739_A396EmprCod ;
   private String[] T013739_A719PrdNum ;
   private boolean[] T013739_n719PrdNum ;
   private String[] T013739_A11199PrdNcasC ;
   private String[] T013740_A396EmprCod ;
   private String[] T013740_A719PrdNum ;
   private boolean[] T013740_n719PrdNum ;
   private String[] T013740_A11197CFraseR ;
   private String[] T013741_A396EmprCod ;
   private short[] T013741_A10243Jt_codigo ;
   private short[] T013741_A10246Jt_ord ;
   private String[] T013742_A396EmprCod ;
   private java.util.Date[] T013742_A10236Bny_dia ;
   private short[] T013742_A10238Bny_lin ;
   private String[] T013743_A396EmprCod ;
   private int[] T013743_A129BarCod ;
   private byte[] T013743_A132BarCodReo ;
   private String[] T013743_A130BarCodPar ;
   private String[] T013743_A758ProCod ;
   private short[] T013743_A194BarOrdLin ;
   private String[] T013743_A719PrdNum ;
   private boolean[] T013743_n719PrdNum ;
   private String[] T013744_A396EmprCod ;
   private String[] T013744_A719PrdNum ;
   private boolean[] T013744_n719PrdNum ;
   private String[] T013744_A9735Cod_Rgo ;
   private String[] T013745_A396EmprCod ;
   private String[] T013745_A719PrdNum ;
   private boolean[] T013745_n719PrdNum ;
   private short[] T013745_A9711Ct_codigo ;
   private String[] T013746_A396EmprCod ;
   private long[] T013746_A9652OeNum ;
   private int[] T013746_A9653OeHdr ;
   private byte[] T013746_A9654OeHdrr ;
   private String[] T013746_A9655OeHdrp ;
   private byte[] T013746_A9656OeLinC ;
   private String[] T013746_A9657OeComb ;
   private String[] T013746_A9658Oefondo ;
   private byte[] T013746_A9659OeMolCil ;
   private short[] T013746_A9686OePasLin ;
   private short[] T013746_A9694OePasPLi ;
   private String[] T013747_A396EmprCod ;
   private long[] T013747_A9652OeNum ;
   private int[] T013747_A9653OeHdr ;
   private byte[] T013747_A9654OeHdrr ;
   private String[] T013747_A9655OeHdrp ;
   private byte[] T013747_A9656OeLinC ;
   private String[] T013747_A9657OeComb ;
   private String[] T013747_A9658Oefondo ;
   private byte[] T013747_A9659OeMolCil ;
   private byte[] T013747_A9677OeMolLin ;
   private String[] T013748_A396EmprCod ;
   private int[] T013748_A9578Pas_Num ;
   private String[] T013748_A719PrdNum ;
   private boolean[] T013748_n719PrdNum ;
   private String[] T013749_A396EmprCod ;
   private String[] T013749_A719PrdNum ;
   private boolean[] T013749_n719PrdNum ;
   private byte[] T013749_A8908CC_AlmCod ;
   private boolean[] T013749_n8908CC_AlmCod ;
   private String[] T013750_A396EmprCod ;
   private String[] T013750_A719PrdNum ;
   private boolean[] T013750_n719PrdNum ;
   private int[] T013750_A8661Almc_Ln ;
   private String[] T013751_A396EmprCod ;
   private String[] T013751_A719PrdNum ;
   private boolean[] T013751_n719PrdNum ;
   private String[] T013751_A8648Mat_PrdN ;
   private String[] T013752_A396EmprCod ;
   private long[] T013752_A8585Pet_cod ;
   private String[] T013752_A719PrdNum ;
   private boolean[] T013752_n719PrdNum ;
   private String[] T013753_A396EmprCod ;
   private String[] T013753_A719PrdNum ;
   private boolean[] T013753_n719PrdNum ;
   private java.util.Date[] T013753_A8577RecFecHr ;
   private String[] T013754_A396EmprCod ;
   private String[] T013754_A719PrdNum ;
   private boolean[] T013754_n719PrdNum ;
   private short[] T013754_A8366PrdAnyo ;
   private int[] T013754_A8360PrdProv ;
   private String[] T013755_A396EmprCod ;
   private int[] T013755_A252CliCod ;
   private String[] T013755_A494ForSer ;
   private String[] T013755_A482ForColNom ;
   private int[] T013755_A483ForColNum ;
   private byte[] T013755_A831TipColCod ;
   private short[] T013755_A7797Sim_lin ;
   private String[] T013756_A396EmprCod ;
   private int[] T013756_A7163Vir_Codigo ;
   private String[] T013756_A719PrdNum ;
   private boolean[] T013756_n719PrdNum ;
   private String[] T013757_A396EmprCod ;
   private String[] T013757_A6310Lb_TaAuxC ;
   private short[] T013757_A6313lb_TaAuxL ;
   private short[] T013757_A6378Lb_TauxLP ;
   private String[] T013758_A396EmprCod ;
   private int[] T013758_A6290PreCoNum ;
   private String[] T013758_A719PrdNum ;
   private boolean[] T013758_n719PrdNum ;
   private String[] T013759_A396EmprCod ;
   private String[] T013759_A719PrdNum ;
   private boolean[] T013759_n719PrdNum ;
   private int[] T013759_A6158PrdPrv ;
   private String[] T013760_A396EmprCod ;
   private String[] T013760_A719PrdNum ;
   private boolean[] T013760_n719PrdNum ;
   private String[] T013760_A5973PrdSusNum ;
   private String[] T013761_A396EmprCod ;
   private String[] T013761_A5612Lb_CodGru ;
   private short[] T013761_A5615Lb_LinGru ;
   private String[] T013762_A396EmprCod ;
   private int[] T013762_A5532Lb_numero ;
   private String[] T013762_A5555Lb_opcion ;
   private short[] T013762_A5560Lb_LineaPr ;
   private String[] T013763_A396EmprCod ;
   private int[] T013763_A5532Lb_numero ;
   private String[] T013763_A5555Lb_opcion ;
   private short[] T013763_A5557Lb_LineaC ;
   private String[] T013764_A396EmprCod ;
   private int[] T013764_A5145SobCod ;
   private String[] T013764_A719PrdNum ;
   private boolean[] T013764_n719PrdNum ;
   private String[] T013765_A396EmprCod ;
   private int[] T013765_A4744RecPreCod ;
   private short[] T013765_A4762RecPreLin ;
   private short[] T013765_A4763RecPreNli ;
   private String[] T013766_A396EmprCod ;
   private int[] T013766_A4492HreBarCod ;
   private byte[] T013766_A4493HreBarReo ;
   private String[] T013766_A4494HreBarPar ;
   private byte[] T013766_A4495HreNumCie ;
   private short[] T013766_A4545HreLinMaq ;
   private byte[] T013766_A4550HreLinPro ;
   private short[] T013766_A4557HreRecLin ;
   private String[] T013767_A396EmprCod ;
   private int[] T013767_A4492HreBarCod ;
   private byte[] T013767_A4493HreBarReo ;
   private String[] T013767_A4494HreBarPar ;
   private byte[] T013767_A4495HreNumCie ;
   private short[] T013767_A4508HreLinMAL ;
   private byte[] T013767_A4509HreNumAny ;
   private String[] T013767_A719PrdNum ;
   private boolean[] T013767_n719PrdNum ;
   private String[] T013768_A396EmprCod ;
   private int[] T013768_A252CliCod ;
   private String[] T013768_A4415EstCol ;
   private short[] T013768_A4416EstColLin ;
   private String[] T013769_A396EmprCod ;
   private int[] T013769_A129BarCod ;
   private byte[] T013769_A132BarCodReo ;
   private String[] T013769_A130BarCodPar ;
   private byte[] T013769_A2524DisComLin ;
   private String[] T013769_A1056DisComCod ;
   private String[] T013769_A1032FonCod ;
   private byte[] T013769_A2124RecMolCod ;
   private short[] T013769_A2672RecPasLin ;
   private short[] T013769_A2675RecPasPLi ;
   private String[] T013770_A396EmprCod ;
   private int[] T013770_A129BarCod ;
   private byte[] T013770_A132BarCodReo ;
   private String[] T013770_A130BarCodPar ;
   private byte[] T013770_A2524DisComLin ;
   private String[] T013770_A1056DisComCod ;
   private String[] T013770_A1032FonCod ;
   private byte[] T013770_A2124RecMolCod ;
   private byte[] T013770_A2126RecMolLin ;
   private String[] T013771_A396EmprCod ;
   private String[] T013771_A2107PasCod ;
   private String[] T013771_A719PrdNum ;
   private boolean[] T013771_n719PrdNum ;
   private String[] T013772_A396EmprCod ;
   private int[] T013772_A2637HisEstHRu ;
   private byte[] T013772_A2636HisEstHRe ;
   private String[] T013772_A2635HisEstHPa ;
   private byte[] T013772_A2638HisEstLCo ;
   private String[] T013772_A2630HisEstCom ;
   private String[] T013772_A2634HisEstFon ;
   private String[] T013772_A719PrdNum ;
   private boolean[] T013772_n719PrdNum ;
   private String[] T013773_A396EmprCod ;
   private int[] T013773_A252CliCod ;
   private String[] T013773_A2141SerEst ;
   private String[] T013773_A1013DibCli ;
   private int[] T013773_A1014DibInt ;
   private String[] T013773_A2074ColCom ;
   private String[] T013773_A2078ColFon ;
   private byte[] T013773_A2098MolCod ;
   private short[] T013773_A2535ForPrdLin ;
   private String[] T013774_A396EmprCod ;
   private String[] T013774_A719PrdNum ;
   private boolean[] T013774_n719PrdNum ;
   private long[] T013774_A3342CCStkLin ;
   private String[] T013775_A396EmprCod ;
   private int[] T013775_A252CliCod ;
   private String[] T013775_A2891HMaForSer ;
   private String[] T013775_A2892HMaForCNom ;
   private int[] T013775_A2893HMaForCNum ;
   private byte[] T013775_A2894HMaTipCCod ;
   private int[] T013775_A2895HMaForNumC ;
   private short[] T013775_A2897HMaColLin ;
   private java.util.Date[] T013775_A2896HMaFec ;
   private short[] T013775_A2907HmaLin ;
   private String[] T013776_A396EmprCod ;
   private int[] T013776_A129BarCod ;
   private byte[] T013776_A132BarCodReo ;
   private String[] T013776_A130BarCodPar ;
   private short[] T013776_A2808RecLinMAL ;
   private byte[] T013776_A1377RecNumAny ;
   private String[] T013776_A719PrdNum ;
   private boolean[] T013776_n719PrdNum ;
   private String[] T013777_A396EmprCod ;
   private int[] T013777_A129BarCod ;
   private byte[] T013777_A132BarCodReo ;
   private String[] T013777_A130BarCodPar ;
   private short[] T013777_A2804RecLinMaq ;
   private byte[] T013777_A1273RecLinPro ;
   private short[] T013777_A811RecLin ;
   private String[] T013778_A396EmprCod ;
   private int[] T013778_A129BarCod ;
   private byte[] T013778_A132BarCodReo ;
   private String[] T013778_A130BarCodPar ;
   private String[] T013778_A2494BarDosPro ;
   private String[] T013778_A719PrdNum ;
   private boolean[] T013778_n719PrdNum ;
   private String[] T013779_A396EmprCod ;
   private int[] T013779_A1314EnsLabCod ;
   private short[] T013779_A1317EnsLabLin ;
   private String[] T013780_A396EmprCod ;
   private String[] T013780_A910Workstat ;
   private int[] T013780_A887EscMLin ;
   private String[] T013781_A396EmprCod ;
   private int[] T013781_A859CumCodCont ;
   private String[] T013781_A719PrdNum ;
   private boolean[] T013781_n719PrdNum ;
   private String[] T013782_A396EmprCod ;
   private String[] T013782_A719PrdNum ;
   private boolean[] T013782_n719PrdNum ;
   private java.util.Date[] T013782_A810RecFec ;
   private String[] T013783_A396EmprCod ;
   private int[] T013783_A486ForNumCol ;
   private short[] T013783_A715PrdLin ;
   private String[] T013784_A396EmprCod ;
   private String[] T013784_A719PrdNum ;
   private boolean[] T013784_n719PrdNum ;
   private short[] T013784_A681PrdAny ;
   private String[] T013785_A396EmprCod ;
   private String[] T013785_A719PrdNum ;
   private boolean[] T013785_n719PrdNum ;
   private String[] T013785_A688PrdComCod ;
   private String[] T013786_A396EmprCod ;
   private String[] T013786_A719PrdNum ;
   private boolean[] T013786_n719PrdNum ;
   private String[] T013786_A680PrdAltNum ;
   private String[] T013787_A396EmprCod ;
   private int[] T013787_A658PedCod ;
   private String[] T013787_A719PrdNum ;
   private boolean[] T013787_n719PrdNum ;
   private String[] T013788_A396EmprCod ;
   private int[] T013788_A486ForNumCol ;
   private short[] T013788_A309ColLin ;
   private String[] T013789_A396EmprCod ;
   private String[] T013789_A719PrdNum ;
   private boolean[] T013789_n719PrdNum ;
   private int[] T013789_A647NumCon ;
   private String[] T013790_A396EmprCod ;
   private String[] T013790_A719PrdNum ;
   private boolean[] T013790_n719PrdNum ;
   private long[] T013791_A8911CC_Lin ;
   private java.util.Date[] T013791_A8912CC_Fech ;
   private boolean[] T013791_n8912CC_Fech ;
   private String[] T013791_A8913CC_Usu ;
   private boolean[] T013791_n8913CC_Usu ;
   private String[] T013791_A8914CC_Term ;
   private boolean[] T013791_n8914CC_Term ;
   private java.math.BigDecimal[] T013791_A8915CC_Cant ;
   private boolean[] T013791_n8915CC_Cant ;
   private String[] T013791_A8909CC_AlmDsc ;
   private boolean[] T013791_n8909CC_AlmDsc ;
   private String[] T013791_A3346TipMovCn ;
   private boolean[] T013791_n3346TipMovCn ;
   private String[] T013791_A8916CC_Desc ;
   private boolean[] T013791_n8916CC_Desc ;
   private java.math.BigDecimal[] T013791_A8917CC_Prec ;
   private boolean[] T013791_n8917CC_Prec ;
   private int[] T013791_A8927CC_NumAlb ;
   private boolean[] T013791_n8927CC_NumAlb ;
   private String[] T013791_A8930CC_HDR ;
   private boolean[] T013791_n8930CC_HDR ;
   private int[] T013791_A8931CC_Hdr1 ;
   private boolean[] T013791_n8931CC_Hdr1 ;
   private byte[] T013791_A8932CC_Hdr2 ;
   private boolean[] T013791_n8932CC_Hdr2 ;
   private String[] T013791_A8933CC_Hdr3 ;
   private boolean[] T013791_n8933CC_Hdr3 ;
   private String[] T013791_A396EmprCod ;
   private String[] T013791_A3345TipMovCc ;
   private boolean[] T013791_n3345TipMovCc ;
   private byte[] T013791_A8908CC_AlmCod ;
   private boolean[] T013791_n8908CC_AlmCod ;
   private String[] T013791_A719PrdNum ;
   private boolean[] T013791_n719PrdNum ;
   private String[] T01374_A3346TipMovCn ;
   private boolean[] T01374_n3346TipMovCn ;
   private String[] T01375_A8909CC_AlmDsc ;
   private boolean[] T01375_n8909CC_AlmDsc ;
   private String[] T01376_A396EmprCod ;
   private String[] T013792_A3346TipMovCn ;
   private boolean[] T013792_n3346TipMovCn ;
   private String[] T013793_A8909CC_AlmDsc ;
   private boolean[] T013793_n8909CC_AlmDsc ;
   private String[] T013794_A396EmprCod ;
   private String[] T013795_A396EmprCod ;
   private String[] T013795_A719PrdNum ;
   private boolean[] T013795_n719PrdNum ;
   private long[] T013795_A8911CC_Lin ;
   private long[] T01373_A8911CC_Lin ;
   private java.util.Date[] T01373_A8912CC_Fech ;
   private boolean[] T01373_n8912CC_Fech ;
   private String[] T01373_A8913CC_Usu ;
   private boolean[] T01373_n8913CC_Usu ;
   private String[] T01373_A8914CC_Term ;
   private boolean[] T01373_n8914CC_Term ;
   private java.math.BigDecimal[] T01373_A8915CC_Cant ;
   private boolean[] T01373_n8915CC_Cant ;
   private String[] T01373_A8916CC_Desc ;
   private boolean[] T01373_n8916CC_Desc ;
   private java.math.BigDecimal[] T01373_A8917CC_Prec ;
   private boolean[] T01373_n8917CC_Prec ;
   private int[] T01373_A8927CC_NumAlb ;
   private boolean[] T01373_n8927CC_NumAlb ;
   private String[] T01373_A8930CC_HDR ;
   private boolean[] T01373_n8930CC_HDR ;
   private int[] T01373_A8931CC_Hdr1 ;
   private boolean[] T01373_n8931CC_Hdr1 ;
   private byte[] T01373_A8932CC_Hdr2 ;
   private boolean[] T01373_n8932CC_Hdr2 ;
   private String[] T01373_A8933CC_Hdr3 ;
   private boolean[] T01373_n8933CC_Hdr3 ;
   private String[] T01373_A396EmprCod ;
   private String[] T01373_A3345TipMovCc ;
   private boolean[] T01373_n3345TipMovCc ;
   private byte[] T01373_A8908CC_AlmCod ;
   private boolean[] T01373_n8908CC_AlmCod ;
   private String[] T01373_A719PrdNum ;
   private boolean[] T01373_n719PrdNum ;
   private long[] T01372_A8911CC_Lin ;
   private java.util.Date[] T01372_A8912CC_Fech ;
   private boolean[] T01372_n8912CC_Fech ;
   private String[] T01372_A8913CC_Usu ;
   private boolean[] T01372_n8913CC_Usu ;
   private String[] T01372_A8914CC_Term ;
   private boolean[] T01372_n8914CC_Term ;
   private java.math.BigDecimal[] T01372_A8915CC_Cant ;
   private boolean[] T01372_n8915CC_Cant ;
   private String[] T01372_A8916CC_Desc ;
   private boolean[] T01372_n8916CC_Desc ;
   private java.math.BigDecimal[] T01372_A8917CC_Prec ;
   private boolean[] T01372_n8917CC_Prec ;
   private int[] T01372_A8927CC_NumAlb ;
   private boolean[] T01372_n8927CC_NumAlb ;
   private String[] T01372_A8930CC_HDR ;
   private boolean[] T01372_n8930CC_HDR ;
   private int[] T01372_A8931CC_Hdr1 ;
   private boolean[] T01372_n8931CC_Hdr1 ;
   private byte[] T01372_A8932CC_Hdr2 ;
   private boolean[] T01372_n8932CC_Hdr2 ;
   private String[] T01372_A8933CC_Hdr3 ;
   private boolean[] T01372_n8933CC_Hdr3 ;
   private String[] T01372_A396EmprCod ;
   private String[] T01372_A3345TipMovCc ;
   private boolean[] T01372_n3345TipMovCc ;
   private byte[] T01372_A8908CC_AlmCod ;
   private boolean[] T01372_n8908CC_AlmCod ;
   private String[] T01372_A719PrdNum ;
   private boolean[] T01372_n719PrdNum ;
   private String[] T013799_A8909CC_AlmDsc ;
   private boolean[] T013799_n8909CC_AlmDsc ;
   private String[] T0137100_A3346TipMovCn ;
   private boolean[] T0137100_n3346TipMovCn ;
   private String[] T0137101_A396EmprCod ;
   private String[] T0137101_A719PrdNum ;
   private boolean[] T0137101_n719PrdNum ;
   private long[] T0137101_A8911CC_Lin ;
   private String[] T0137102_A407EmprNom ;
   private boolean[] T0137102_n407EmprNom ;
   private String[] T0137103_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tccalm__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccalm__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccalm__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccalm__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tccalm__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01372", "SELECT CC_Lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, EmprCod, TipMovCc, CC_AlmCod, PrdNum FROM TXPCCALM WHERE EmprCod = ? AND PrdNum = ? AND CC_Lin = ?  FOR UPDATE OF CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, TipMovCc, CC_AlmCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01373", "SELECT CC_Lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, EmprCod, TipMovCc, CC_AlmCod, PrdNum FROM TXPCCALM WHERE EmprCod = ? AND PrdNum = ? AND CC_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01374", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01375", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01376", "SELECT EmprCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01377", "SELECT PrdNum, PrdNom, CC_Ultln, PrdExiCC, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom, CC_Ultln, PrdExiCC NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01378", "SELECT PrdNum, PrdNom, CC_Ultln, PrdExiCC, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01379", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013710", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.CC_Ultln, TM1.PrdExiCC, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013711", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013712", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( PrdNum > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013713", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( PrdNum < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013714", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, CC_Ultln, PrdExiCC, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T013715", "UPDATE TXPPRODUC SET PrdNom=?, CC_Ultln=?, PrdExiCC=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T013716", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T013717", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013718", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013719", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013720", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013721", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013722", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013723", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013724", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013725", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013726", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013727", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013728", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013729", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013730", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013731", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013732", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013733", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013734", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013735", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013736", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013737", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013738", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013739", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013740", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013741", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013742", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013743", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013744", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013745", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013746", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013747", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013748", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013749", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013750", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013751", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013752", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013753", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013754", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013755", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013756", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013757", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013758", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013759", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013760", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013761", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013762", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013763", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013764", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013765", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013766", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013767", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013768", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013769", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013770", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013771", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013772", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013773", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013774", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013775", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013776", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013777", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013778", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013779", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013780", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013781", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013782", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013783", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013784", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013785", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013786", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013787", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013788", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013789", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013790", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013791", "SELECT T1.CC_Lin, T1.CC_Fech, T1.CC_Usu, T1.CC_Term, T1.CC_Cant, T2.CC_AlmDsc, T3.TipMovCn, T1.CC_Desc, T1.CC_Prec, T1.CC_NumAlb, T1.CC_HDR, T1.CC_Hdr1, T1.CC_Hdr2, T1.CC_Hdr3, T1.EmprCod, T1.TipMovCc, T1.CC_AlmCod, T1.PrdNum FROM ((TXPCCALM T1 LEFT JOIN TXPALMCCS T2 ON T2.EmprCod = T1.EmprCod AND T2.CC_AlmCod = T1.CC_AlmCod) LEFT JOIN TXPTIPMOV T3 ON T3.EmprCod = T1.EmprCod AND T3.TipMovCc = T1.TipMovCc) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.CC_Lin = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.CC_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013792", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013793", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013794", "SELECT EmprCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013795", "SELECT EmprCod, PrdNum, CC_Lin FROM TXPCCALM WHERE EmprCod = ? AND PrdNum = ? AND CC_Lin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T013796", "INSERT INTO TXPCCALM(CC_Lin, CC_Fech, CC_Usu, CC_Term, CC_Cant, CC_Desc, CC_Prec, CC_NumAlb, CC_HDR, CC_Hdr1, CC_Hdr2, CC_Hdr3, EmprCod, TipMovCc, CC_AlmCod, PrdNum) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCALM")
         ,new UpdateCursor("T013797", "UPDATE TXPCCALM SET CC_Fech=?, CC_Usu=?, CC_Term=?, CC_Cant=?, CC_Desc=?, CC_Prec=?, CC_NumAlb=?, CC_HDR=?, CC_Hdr1=?, CC_Hdr2=?, CC_Hdr3=?, TipMovCc=?, CC_AlmCod=?  WHERE EmprCod = ? AND PrdNum = ? AND CC_Lin = ?", GX_NOMASK, "TXPCCALM")
         ,new UpdateCursor("T013798", "DELETE FROM TXPCCALM  WHERE EmprCod = ? AND PrdNum = ? AND CC_Lin = ?", GX_NOMASK, "TXPCCALM")
         ,new ForEachCursor("T013799", "SELECT CC_AlmDsc FROM TXPALMCCS WHERE EmprCod = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0137100", "SELECT TipMovCn FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0137101", "SELECT EmprCod, PrdNum, CC_Lin FROM TXPCCALM WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, CC_Lin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0137102", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T0137103", "SELECT EmprCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ? AND CC_AlmCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((String[]) buf[24])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(11);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 3);
               ((String[]) buf[24])[0] = rslt.getString(14, 2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((byte[]) buf[26])[0] = rslt.getByte(15);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(16, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[7])[0] = rslt.getString(6, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 89 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,4);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 40);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(13);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((String[]) buf[28])[0] = rslt.getString(16, 2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 6);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 101 :
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
               stmt.setLong(3, ((Number) parms[3]).longValue());
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
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(3, ((Number) parms[4]).longValue());
               }
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 4);
               stmt.setString(5, (String)parms[6], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 26);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 4);
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
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
            case 62 :
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
               return;
            case 65 :
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
            case 66 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 85 :
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
            case 86 :
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
            case 87 :
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
            case 88 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 91 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
            case 93 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 94 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 4);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 40);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 5);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[20]).byteValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 1);
               }
               stmt.setString(13, (String)parms[23], 3);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[29], 6);
               }
               return;
            case 95 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 10);
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
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 40);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 5);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[13]).intValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
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
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[25]).byteValue());
               }
               stmt.setString(14, (String)parms[26], 3);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 6);
               }
               stmt.setLong(16, ((Number) parms[29]).longValue());
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setLong(3, ((Number) parms[3]).longValue());
               return;
            case 97 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 99 :
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
            case 100 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               return;
      }
   }

}

