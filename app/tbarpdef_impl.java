package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbarpdef_impl extends GXDataArea
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
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Defectos a nivel de BARPIE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtBarCod_Internalname ;
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

   public tbarpdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbarpdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbarpdef_impl.class ));
   }

   public tbarpdef_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TBARPDEF.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Ultimo Defecto", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TBARPDEF.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieUltD_Internalname, GXutil.ltrim( localUtil.ntoc( A12912BarPieUltD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPieUltD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12912BarPieUltD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12912BarPieUltD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieUltD_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieUltD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TBARPDEF.htm");
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
         nBlankRcdCount1772 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1772 = (short)(1) ;
            scanStart1LX1772( ) ;
            while ( RcdFound1772 != 0 )
            {
               init_level_properties1772( ) ;
               getByPrimaryKey1LX1772( ) ;
               addRow1LX1772( ) ;
               scanNext1LX1772( ) ;
            }
            scanEnd1LX1772( ) ;
            nBlankRcdCount1772 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LX1772( ) ;
         standaloneModal1LX1772( ) ;
         sMode1772 = Gx_mode ;
         while ( nGXsfl_55_idx < nRC_GXsfl_55 )
         {
            bGXsfl_55_Refreshing = true ;
            readRow1LX1772( ) ;
            edtavnRcdDeleted_1772_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1772_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1772_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1772_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieLDf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELDF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieLDf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLDf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDfID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFID_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfID_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDfMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFMI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfMi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDfMf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFMF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfMf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfMf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDfFI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFFI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfFI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfFI_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieLong_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELONG_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLong_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDPto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDPTO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDPto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDPto_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDfCr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFCR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfCr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieRepa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEREPA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieRepa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieRepa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDfTu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFTU_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfTu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfTu_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDSoC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDSOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDSoC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDSoC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            edtBarPieDHor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDHOR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtBarPieDHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDHor_Enabled), 5, 0), !bGXsfl_55_Refreshing);
            if ( ( nRcdExists_1772 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LX1772( ) ;
            }
            sendRow1LX1772( ) ;
            bGXsfl_55_Refreshing = false ;
         }
         Gx_mode = sMode1772 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1772 = (short)(5) ;
         nRcdExists_1772 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LX1772( ) ;
            while ( RcdFound1772 != 0 )
            {
               sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_551772( ) ;
               init_level_properties1772( ) ;
               standaloneNotModal1LX1772( ) ;
               getByPrimaryKey1LX1772( ) ;
               standaloneModal1LX1772( ) ;
               addRow1LX1772( ) ;
               scanNext1LX1772( ) ;
            }
            scanEnd1LX1772( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1772 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_551772( ) ;
      initAll1LX1772( ) ;
      init_level_properties1772( ) ;
      nRcdExists_1772 = (short)(0) ;
      nIsMod_1772 = (short)(0) ;
      nRcdDeleted_1772 = (short)(0) ;
      nBlankRcdCount1772 = (short)(nBlankRcdUsr1772+nBlankRcdCount1772) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1772 > 0 )
      {
         standaloneNotModal1LX1772( ) ;
         standaloneModal1LX1772( ) ;
         addRow1LX1772( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtBarPieLDf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1772 = (short)(nBlankRcdCount1772-1) ;
      }
      Gx_mode = sMode1772 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBARPDEF.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TBARPDEF.htm");
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
      e111LX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z12912BarPieUltD = (short)(localUtil.ctol( httpContext.cgiGet( "Z12912BarPieUltD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A129BarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            else
            {
               A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCODREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarCodReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A132BarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            else
            {
               A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            }
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieUltD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieUltD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPIEULTD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtBarPieUltD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12912BarPieUltD = (short)(0) ;
               n12912BarPieUltD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12912BarPieUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12912BarPieUltD), 4, 0));
            }
            else
            {
               A12912BarPieUltD = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieUltD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12912BarPieUltD = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12912BarPieUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12912BarPieUltD), 4, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TBARPDEF");
            forbiddenHiddens.add("AlbRecCod", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tbarpdef:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
                        e111LX2 ();
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
            initAll1LX18( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1772_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1772_Enabled), 5, 0), !bGXsfl_55_Refreshing);
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
      disableAttributes1LX18( ) ;
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

   public void confirm_1LX0( )
   {
      beforeValidate1LX18( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LX18( ) ;
         }
         else
         {
            checkExtendedTable1LX18( ) ;
            if ( AnyError == 0 )
            {
               zm1LX18( 2) ;
               zm1LX18( 3) ;
            }
            closeExtendedTableCursors1LX18( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode18 = Gx_mode ;
         confirm_1LX1772( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode18 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1LX0( ) ;
      }
   }

   public void confirm_1LX1772( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1LX1772( ) ;
         if ( ( nRcdExists_1772 != 0 ) || ( nIsMod_1772 != 0 ) )
         {
            getKey1LX1772( ) ;
            if ( ( nRcdExists_1772 == 0 ) && ( nRcdDeleted_1772 == 0 ) )
            {
               if ( RcdFound1772 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LX1772( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LX1772( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1LX1772( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "BARPIELDF_" + sGXsfl_55_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtBarPieLDf_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1772 != 0 )
               {
                  if ( nRcdDeleted_1772 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LX1772( ) ;
                     load1LX1772( ) ;
                     beforeValidate1LX1772( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LX1772( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1772 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LX1772( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LX1772( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1LX1772( ) ;
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
                  if ( nRcdDeleted_1772 == 0 )
                  {
                     GXCCtl = "BARPIELDF_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPieLDf_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1772_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieLDf_Internalname, GXutil.ltrim( localUtil.ntoc( A12913BarPieLDf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfID_Internalname, GXutil.ltrim( localUtil.ntoc( A12914BarPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12915BarPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfMf_Internalname, GXutil.ltrim( localUtil.ntoc( A12916BarPieDfMf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfFI_Internalname, GXutil.rtrim( A12917BarPieDfFI)) ;
         httpContext.changePostValue( edtBarPieLong_Internalname, GXutil.ltrim( localUtil.ntoc( A12934BarPieLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDPto_Internalname, GXutil.ltrim( localUtil.ntoc( A12969BarPieDPto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfCr_Internalname, GXutil.rtrim( A13110BarPieDfCr)) ;
         httpContext.changePostValue( edtBarPieRepa_Internalname, GXutil.rtrim( A13517BarPieRepa)) ;
         httpContext.changePostValue( edtBarPieDfTu_Internalname, GXutil.ltrim( localUtil.ntoc( A13521BarPieDfTu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDSoC_Internalname, GXutil.rtrim( A13572BarPieDSoC)) ;
         httpContext.changePostValue( edtBarPieDHor_Internalname, GXutil.ltrim( localUtil.ntoc( A13573BarPieDHor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12913BarPieLDf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12913BarPieLDf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12914BarPieDfID_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12914BarPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12915BarPieDfMi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12915BarPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12916BarPieDfMf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12916BarPieDfMf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12917BarPieDfFI_"+sGXsfl_55_idx, GXutil.rtrim( Z12917BarPieDfFI)) ;
         httpContext.changePostValue( "ZT_"+"Z12934BarPieLong_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12934BarPieLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12969BarPieDPto_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12969BarPieDPto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13110BarPieDfCr_"+sGXsfl_55_idx, GXutil.rtrim( Z13110BarPieDfCr)) ;
         httpContext.changePostValue( "ZT_"+"Z13517BarPieRepa_"+sGXsfl_55_idx, GXutil.rtrim( Z13517BarPieRepa)) ;
         httpContext.changePostValue( "ZT_"+"Z13521BarPieDfTu_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13521BarPieDfTu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13572BarPieDSoC_"+sGXsfl_55_idx, GXutil.rtrim( Z13572BarPieDSoC)) ;
         httpContext.changePostValue( "ZT_"+"Z13573BarPieDHor_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13573BarPieDHor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1772_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1772_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1772_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1772 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1772_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1772_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELDF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLDf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFMI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFMF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfFI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELONG_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLong_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDPTO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDPto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFCR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfCr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEREPA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieRepa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFTU_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfTu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDSOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDSoC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDHOR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDHor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LX0( )
   {
   }

   public void e111LX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tbarpdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tbarpdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tbarpdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tbarpdef_impl.this.A396EmprCod = GXv_char2[0] ;
      tbarpdef_impl.this.AV11EmprNom = GXv_char3[0] ;
      tbarpdef_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LX18( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12912BarPieUltD = T01LX5_A12912BarPieUltD[0] ;
            Z44AlbRecCod = T01LX5_A44AlbRecCod[0] ;
         }
         else
         {
            Z12912BarPieUltD = A12912BarPieUltD ;
            Z44AlbRecCod = A44AlbRecCod ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z200BarPieCod = A200BarPieCod ;
         Z12912BarPieUltD = A12912BarPieUltD ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TBARPDEF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01LX6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LX6_A407EmprNom[0] ;
      n407EmprNom = T01LX6_n407EmprNom[0] ;
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

   public void load1LX18( )
   {
      /* Using cursor T01LX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A407EmprNom = T01LX8_A407EmprNom[0] ;
         n407EmprNom = T01LX8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A12912BarPieUltD = T01LX8_A12912BarPieUltD[0] ;
         n12912BarPieUltD = T01LX8_n12912BarPieUltD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12912BarPieUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12912BarPieUltD), 4, 0));
         A44AlbRecCod = T01LX8_A44AlbRecCod[0] ;
         zm1LX18( -1) ;
      }
      pr_default.close(6);
      onLoadActions1LX18( ) ;
   }

   public void onLoadActions1LX18( )
   {
   }

   public void checkExtendedTable1LX18( )
   {
      nIsDirty_18 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01LX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursors1LX18( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01LX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
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

   public void getKey1LX18( )
   {
      /* Using cursor T01LX10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01LX5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LX18( 1) ;
         RcdFound18 = (short)(1) ;
         A200BarPieCod = T01LX5_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A12912BarPieUltD = T01LX5_A12912BarPieUltD[0] ;
         n12912BarPieUltD = T01LX5_n12912BarPieUltD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12912BarPieUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12912BarPieUltD), 4, 0));
         A44AlbRecCod = T01LX5_A44AlbRecCod[0] ;
         A129BarCod = T01LX5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01LX5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01LX5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1LX18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey1LX18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey1LX18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1LX18( ) ;
      if ( RcdFound18 == 0 )
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
      RcdFound18 = (short)(0) ;
      /* Using cursor T01LX11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A200BarPieCod, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01LX11_A129BarCod[0] < A129BarCod ) || ( T01LX11_A129BarCod[0] == A129BarCod ) && ( T01LX11_A132BarCodReo[0] < A132BarCodReo ) || ( T01LX11_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX11_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01LX11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01LX11_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX11_A200BarPieCod[0], A200BarPieCod) < 0 ) ) && ( GXutil.strcmp(T01LX11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01LX11_A129BarCod[0] > A129BarCod ) || ( T01LX11_A129BarCod[0] == A129BarCod ) && ( T01LX11_A132BarCodReo[0] > A132BarCodReo ) || ( T01LX11_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX11_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01LX11_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01LX11_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX11_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX11_A200BarPieCod[0], A200BarPieCod) > 0 ) ) && ( GXutil.strcmp(T01LX11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01LX11_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01LX11_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01LX11_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01LX11_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T01LX12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A200BarPieCod, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01LX12_A129BarCod[0] > A129BarCod ) || ( T01LX12_A129BarCod[0] == A129BarCod ) && ( T01LX12_A132BarCodReo[0] > A132BarCodReo ) || ( T01LX12_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX12_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01LX12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01LX12_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX12_A200BarPieCod[0], A200BarPieCod) > 0 ) ) && ( GXutil.strcmp(T01LX12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01LX12_A129BarCod[0] < A129BarCod ) || ( T01LX12_A129BarCod[0] == A129BarCod ) && ( T01LX12_A132BarCodReo[0] < A132BarCodReo ) || ( T01LX12_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX12_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01LX12_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01LX12_A132BarCodReo[0] == A132BarCodReo ) && ( T01LX12_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01LX12_A200BarPieCod[0], A200BarPieCod) < 0 ) ) && ( GXutil.strcmp(T01LX12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01LX12_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01LX12_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01LX12_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01LX12_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LX18( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LX18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A200BarPieCod = Z200BarPieCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1LX18( ) ;
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LX18( ) ;
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
                  GX_FocusControl = edtBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LX18( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
      {
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = Z200BarPieCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtBarCod_Internalname ;
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
      getKey1LX18( ) ;
      if ( RcdFound18 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
         {
            A129BarCod = Z129BarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = Z132BarCodReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = Z130BarCodPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = Z200BarPieCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarpdef");
      GX_FocusControl = edtBarPieUltD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LX0( ) ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarPieUltD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1LX18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarPieUltD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LX18( ) ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarPieUltD_Internalname ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarPieUltD_Internalname ;
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
      scanStart1LX18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound18 != 0 )
         {
            scanNext1LX18( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarPieUltD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LX18( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1LX18( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LX4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z12912BarPieUltD != T01LX4_A12912BarPieUltD[0] ) || ( Z44AlbRecCod != T01LX4_A44AlbRecCod[0] ) )
         {
            if ( Z12912BarPieUltD != T01LX4_A12912BarPieUltD[0] )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieUltD");
               GXutil.writeLogRaw("Old: ",Z12912BarPieUltD);
               GXutil.writeLogRaw("Current: ",T01LX4_A12912BarPieUltD[0]);
            }
            if ( Z44AlbRecCod != T01LX4_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01LX4_A44AlbRecCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPIE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LX18( )
   {
      beforeValidate1LX18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LX18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LX18( 0) ;
         checkOptimisticConcurrency1LX18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LX18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LX18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LX13 */
                  pr_default.execute(11, new Object[] {A200BarPieCod, Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), A396EmprCod, Integer.valueOf(A44AlbRecCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
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
                        processLevel1LX18( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LX0( ) ;
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
            load1LX18( ) ;
         }
         endLevel1LX18( ) ;
      }
      closeExtendedTableCursors1LX18( ) ;
   }

   public void update1LX18( )
   {
      beforeValidate1LX18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LX18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LX18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LX18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LX18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LX14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n12912BarPieUltD), Short.valueOf(A12912BarPieUltD), Integer.valueOf(A44AlbRecCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPIE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LX18( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LX18( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1LX0( ) ;
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
         endLevel1LX18( ) ;
      }
      closeExtendedTableCursors1LX18( ) ;
   }

   public void deferredUpdate1LX18( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LX18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LX18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LX18( ) ;
         afterConfirm1LX18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LX18( ) ;
            if ( AnyError == 0 )
            {
               scanStart1LX1772( ) ;
               while ( RcdFound1772 != 0 )
               {
                  getByPrimaryKey1LX1772( ) ;
                  delete1LX1772( ) ;
                  scanNext1LX1772( ) ;
               }
               scanEnd1LX1772( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LX15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound18 == 0 )
                        {
                           initAll1LX18( ) ;
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
                        resetCaption1LX0( ) ;
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LX18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LX18( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01LX16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARTRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01LX17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void processNestedLevel1LX1772( )
   {
      nGXsfl_55_idx = 0 ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         readRow1LX1772( ) ;
         if ( ( nRcdExists_1772 != 0 ) || ( nIsMod_1772 != 0 ) )
         {
            standaloneNotModal1LX1772( ) ;
            getKey1LX1772( ) ;
            if ( ( nRcdExists_1772 == 0 ) && ( nRcdDeleted_1772 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LX1772( ) ;
            }
            else
            {
               if ( RcdFound1772 != 0 )
               {
                  if ( ( nRcdDeleted_1772 != 0 ) && ( nRcdExists_1772 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LX1772( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1772 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LX1772( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1772 == 0 )
                  {
                     GXCCtl = "BARPIELDF_" + sGXsfl_55_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtBarPieLDf_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1772_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieLDf_Internalname, GXutil.ltrim( localUtil.ntoc( A12913BarPieLDf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfID_Internalname, GXutil.ltrim( localUtil.ntoc( A12914BarPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfMi_Internalname, GXutil.ltrim( localUtil.ntoc( A12915BarPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfMf_Internalname, GXutil.ltrim( localUtil.ntoc( A12916BarPieDfMf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfFI_Internalname, GXutil.rtrim( A12917BarPieDfFI)) ;
         httpContext.changePostValue( edtBarPieLong_Internalname, GXutil.ltrim( localUtil.ntoc( A12934BarPieLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDPto_Internalname, GXutil.ltrim( localUtil.ntoc( A12969BarPieDPto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDfCr_Internalname, GXutil.rtrim( A13110BarPieDfCr)) ;
         httpContext.changePostValue( edtBarPieRepa_Internalname, GXutil.rtrim( A13517BarPieRepa)) ;
         httpContext.changePostValue( edtBarPieDfTu_Internalname, GXutil.ltrim( localUtil.ntoc( A13521BarPieDfTu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtBarPieDSoC_Internalname, GXutil.rtrim( A13572BarPieDSoC)) ;
         httpContext.changePostValue( edtBarPieDHor_Internalname, GXutil.ltrim( localUtil.ntoc( A13573BarPieDHor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12913BarPieLDf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12913BarPieLDf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12914BarPieDfID_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12914BarPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12915BarPieDfMi_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12915BarPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12916BarPieDfMf_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12916BarPieDfMf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12917BarPieDfFI_"+sGXsfl_55_idx, GXutil.rtrim( Z12917BarPieDfFI)) ;
         httpContext.changePostValue( "ZT_"+"Z12934BarPieLong_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12934BarPieLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12969BarPieDPto_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z12969BarPieDPto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13110BarPieDfCr_"+sGXsfl_55_idx, GXutil.rtrim( Z13110BarPieDfCr)) ;
         httpContext.changePostValue( "ZT_"+"Z13517BarPieRepa_"+sGXsfl_55_idx, GXutil.rtrim( Z13517BarPieRepa)) ;
         httpContext.changePostValue( "ZT_"+"Z13521BarPieDfTu_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13521BarPieDfTu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13572BarPieDSoC_"+sGXsfl_55_idx, GXutil.rtrim( Z13572BarPieDSoC)) ;
         httpContext.changePostValue( "ZT_"+"Z13573BarPieDHor_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( Z13573BarPieDHor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1772_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1772_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1772_"+sGXsfl_55_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1772 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1772_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1772_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELDF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLDf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFMI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFMF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfFI_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIELONG_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLong_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDPTO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDPto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFCR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfCr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEREPA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieRepa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDFTU_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfTu_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDSOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDSoC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "BARPIEDHOR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDHor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LX1772( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1772 = (short)(0) ;
      nIsMod_1772 = (short)(0) ;
      nRcdDeleted_1772 = (short)(0) ;
   }

   public void processLevel1LX18( )
   {
      /* Save parent mode. */
      sMode18 = Gx_mode ;
      processNestedLevel1LX1772( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LX18( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LX18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tbarpdef");
         if ( AnyError == 0 )
         {
            confirmValues1LX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tbarpdef");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LX18( )
   {
      /* Scan By routine */
      /* Using cursor T01LX18 */
      pr_default.execute(16, new Object[] {A396EmprCod});
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A129BarCod = T01LX18_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01LX18_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01LX18_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01LX18_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LX18( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A129BarCod = T01LX18_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01LX18_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01LX18_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01LX18_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
   }

   public void scanEnd1LX18( )
   {
      pr_default.close(16);
   }

   public void afterConfirm1LX18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LX18( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LX18( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LX18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LX18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LX18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LX18( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtBarPieUltD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieUltD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieUltD_Enabled), 5, 0), true);
   }

   public void zm1LX1772( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z12914BarPieDfID = T01LX3_A12914BarPieDfID[0] ;
            Z12915BarPieDfMi = T01LX3_A12915BarPieDfMi[0] ;
            Z12916BarPieDfMf = T01LX3_A12916BarPieDfMf[0] ;
            Z12917BarPieDfFI = T01LX3_A12917BarPieDfFI[0] ;
            Z12934BarPieLong = T01LX3_A12934BarPieLong[0] ;
            Z12969BarPieDPto = T01LX3_A12969BarPieDPto[0] ;
            Z13110BarPieDfCr = T01LX3_A13110BarPieDfCr[0] ;
            Z13517BarPieRepa = T01LX3_A13517BarPieRepa[0] ;
            Z13521BarPieDfTu = T01LX3_A13521BarPieDfTu[0] ;
            Z13572BarPieDSoC = T01LX3_A13572BarPieDSoC[0] ;
            Z13573BarPieDHor = T01LX3_A13573BarPieDHor[0] ;
         }
         else
         {
            Z12914BarPieDfID = A12914BarPieDfID ;
            Z12915BarPieDfMi = A12915BarPieDfMi ;
            Z12916BarPieDfMf = A12916BarPieDfMf ;
            Z12917BarPieDfFI = A12917BarPieDfFI ;
            Z12934BarPieLong = A12934BarPieLong ;
            Z12969BarPieDPto = A12969BarPieDPto ;
            Z13110BarPieDfCr = A13110BarPieDfCr ;
            Z13517BarPieRepa = A13517BarPieRepa ;
            Z13521BarPieDfTu = A13521BarPieDfTu ;
            Z13572BarPieDSoC = A13572BarPieDSoC ;
            Z13573BarPieDHor = A13573BarPieDHor ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z12913BarPieLDf = A12913BarPieLDf ;
         Z12914BarPieDfID = A12914BarPieDfID ;
         Z12915BarPieDfMi = A12915BarPieDfMi ;
         Z12916BarPieDfMf = A12916BarPieDfMf ;
         Z12917BarPieDfFI = A12917BarPieDfFI ;
         Z12934BarPieLong = A12934BarPieLong ;
         Z12969BarPieDPto = A12969BarPieDPto ;
         Z13110BarPieDfCr = A13110BarPieDfCr ;
         Z13517BarPieRepa = A13517BarPieRepa ;
         Z13521BarPieDfTu = A13521BarPieDfTu ;
         Z13572BarPieDSoC = A13572BarPieDSoC ;
         Z13573BarPieDHor = A13573BarPieDHor ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1LX1772( )
   {
   }

   public void standaloneModal1LX1772( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtBarPieLDf_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieLDf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLDf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
      else
      {
         edtBarPieLDf_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarPieLDf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLDf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      }
   }

   public void load1LX1772( )
   {
      /* Using cursor T01LX19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1772 = (short)(1) ;
         A12914BarPieDfID = T01LX19_A12914BarPieDfID[0] ;
         n12914BarPieDfID = T01LX19_n12914BarPieDfID[0] ;
         A12915BarPieDfMi = T01LX19_A12915BarPieDfMi[0] ;
         n12915BarPieDfMi = T01LX19_n12915BarPieDfMi[0] ;
         A12916BarPieDfMf = T01LX19_A12916BarPieDfMf[0] ;
         n12916BarPieDfMf = T01LX19_n12916BarPieDfMf[0] ;
         A12917BarPieDfFI = T01LX19_A12917BarPieDfFI[0] ;
         n12917BarPieDfFI = T01LX19_n12917BarPieDfFI[0] ;
         A12934BarPieLong = T01LX19_A12934BarPieLong[0] ;
         n12934BarPieLong = T01LX19_n12934BarPieLong[0] ;
         A12969BarPieDPto = T01LX19_A12969BarPieDPto[0] ;
         n12969BarPieDPto = T01LX19_n12969BarPieDPto[0] ;
         A13110BarPieDfCr = T01LX19_A13110BarPieDfCr[0] ;
         n13110BarPieDfCr = T01LX19_n13110BarPieDfCr[0] ;
         A13517BarPieRepa = T01LX19_A13517BarPieRepa[0] ;
         n13517BarPieRepa = T01LX19_n13517BarPieRepa[0] ;
         A13521BarPieDfTu = T01LX19_A13521BarPieDfTu[0] ;
         n13521BarPieDfTu = T01LX19_n13521BarPieDfTu[0] ;
         A13572BarPieDSoC = T01LX19_A13572BarPieDSoC[0] ;
         n13572BarPieDSoC = T01LX19_n13572BarPieDSoC[0] ;
         A13573BarPieDHor = T01LX19_A13573BarPieDHor[0] ;
         n13573BarPieDHor = T01LX19_n13573BarPieDHor[0] ;
         zm1LX1772( -4) ;
      }
      pr_default.close(17);
      onLoadActions1LX1772( ) ;
   }

   public void onLoadActions1LX1772( )
   {
   }

   public void checkExtendedTable1LX1772( )
   {
      nIsDirty_1772 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LX1772( ) ;
   }

   public void closeExtendedTableCursors1LX1772( )
   {
   }

   public void enableDisable1LX1772( )
   {
   }

   public void getKey1LX1772( )
   {
      /* Using cursor T01LX20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1772 = (short)(1) ;
      }
      else
      {
         RcdFound1772 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey1LX1772( )
   {
      /* Using cursor T01LX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LX3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LX1772( 4) ;
         RcdFound1772 = (short)(1) ;
         initializeNonKey1LX1772( ) ;
         A12913BarPieLDf = T01LX3_A12913BarPieLDf[0] ;
         A12914BarPieDfID = T01LX3_A12914BarPieDfID[0] ;
         n12914BarPieDfID = T01LX3_n12914BarPieDfID[0] ;
         A12915BarPieDfMi = T01LX3_A12915BarPieDfMi[0] ;
         n12915BarPieDfMi = T01LX3_n12915BarPieDfMi[0] ;
         A12916BarPieDfMf = T01LX3_A12916BarPieDfMf[0] ;
         n12916BarPieDfMf = T01LX3_n12916BarPieDfMf[0] ;
         A12917BarPieDfFI = T01LX3_A12917BarPieDfFI[0] ;
         n12917BarPieDfFI = T01LX3_n12917BarPieDfFI[0] ;
         A12934BarPieLong = T01LX3_A12934BarPieLong[0] ;
         n12934BarPieLong = T01LX3_n12934BarPieLong[0] ;
         A12969BarPieDPto = T01LX3_A12969BarPieDPto[0] ;
         n12969BarPieDPto = T01LX3_n12969BarPieDPto[0] ;
         A13110BarPieDfCr = T01LX3_A13110BarPieDfCr[0] ;
         n13110BarPieDfCr = T01LX3_n13110BarPieDfCr[0] ;
         A13517BarPieRepa = T01LX3_A13517BarPieRepa[0] ;
         n13517BarPieRepa = T01LX3_n13517BarPieRepa[0] ;
         A13521BarPieDfTu = T01LX3_A13521BarPieDfTu[0] ;
         n13521BarPieDfTu = T01LX3_n13521BarPieDfTu[0] ;
         A13572BarPieDSoC = T01LX3_A13572BarPieDSoC[0] ;
         n13572BarPieDSoC = T01LX3_n13572BarPieDSoC[0] ;
         A13573BarPieDHor = T01LX3_A13573BarPieDHor[0] ;
         n13573BarPieDHor = T01LX3_n13573BarPieDHor[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z12913BarPieLDf = A12913BarPieLDf ;
         sMode1772 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LX1772( ) ;
         load1LX1772( ) ;
         Gx_mode = sMode1772 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1772 = (short)(0) ;
         initializeNonKey1LX1772( ) ;
         sMode1772 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LX1772( ) ;
         Gx_mode = sMode1772 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LX1772( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LX1772( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPDE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z12914BarPieDfID != T01LX2_A12914BarPieDfID[0] ) || ( DecimalUtil.compareTo(Z12915BarPieDfMi, T01LX2_A12915BarPieDfMi[0]) != 0 ) || ( DecimalUtil.compareTo(Z12916BarPieDfMf, T01LX2_A12916BarPieDfMf[0]) != 0 ) || ( GXutil.strcmp(Z12917BarPieDfFI, T01LX2_A12917BarPieDfFI[0]) != 0 ) || ( DecimalUtil.compareTo(Z12934BarPieLong, T01LX2_A12934BarPieLong[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12969BarPieDPto != T01LX2_A12969BarPieDPto[0] ) || ( GXutil.strcmp(Z13110BarPieDfCr, T01LX2_A13110BarPieDfCr[0]) != 0 ) || ( GXutil.strcmp(Z13517BarPieRepa, T01LX2_A13517BarPieRepa[0]) != 0 ) || ( Z13521BarPieDfTu != T01LX2_A13521BarPieDfTu[0] ) || ( GXutil.strcmp(Z13572BarPieDSoC, T01LX2_A13572BarPieDSoC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z13573BarPieDHor, T01LX2_A13573BarPieDHor[0]) != 0 ) )
         {
            if ( Z12914BarPieDfID != T01LX2_A12914BarPieDfID[0] )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDfID");
               GXutil.writeLogRaw("Old: ",Z12914BarPieDfID);
               GXutil.writeLogRaw("Current: ",T01LX2_A12914BarPieDfID[0]);
            }
            if ( DecimalUtil.compareTo(Z12915BarPieDfMi, T01LX2_A12915BarPieDfMi[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDfMi");
               GXutil.writeLogRaw("Old: ",Z12915BarPieDfMi);
               GXutil.writeLogRaw("Current: ",T01LX2_A12915BarPieDfMi[0]);
            }
            if ( DecimalUtil.compareTo(Z12916BarPieDfMf, T01LX2_A12916BarPieDfMf[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDfMf");
               GXutil.writeLogRaw("Old: ",Z12916BarPieDfMf);
               GXutil.writeLogRaw("Current: ",T01LX2_A12916BarPieDfMf[0]);
            }
            if ( GXutil.strcmp(Z12917BarPieDfFI, T01LX2_A12917BarPieDfFI[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDfFI");
               GXutil.writeLogRaw("Old: ",Z12917BarPieDfFI);
               GXutil.writeLogRaw("Current: ",T01LX2_A12917BarPieDfFI[0]);
            }
            if ( DecimalUtil.compareTo(Z12934BarPieLong, T01LX2_A12934BarPieLong[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieLong");
               GXutil.writeLogRaw("Old: ",Z12934BarPieLong);
               GXutil.writeLogRaw("Current: ",T01LX2_A12934BarPieLong[0]);
            }
            if ( Z12969BarPieDPto != T01LX2_A12969BarPieDPto[0] )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDPto");
               GXutil.writeLogRaw("Old: ",Z12969BarPieDPto);
               GXutil.writeLogRaw("Current: ",T01LX2_A12969BarPieDPto[0]);
            }
            if ( GXutil.strcmp(Z13110BarPieDfCr, T01LX2_A13110BarPieDfCr[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDfCr");
               GXutil.writeLogRaw("Old: ",Z13110BarPieDfCr);
               GXutil.writeLogRaw("Current: ",T01LX2_A13110BarPieDfCr[0]);
            }
            if ( GXutil.strcmp(Z13517BarPieRepa, T01LX2_A13517BarPieRepa[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieRepa");
               GXutil.writeLogRaw("Old: ",Z13517BarPieRepa);
               GXutil.writeLogRaw("Current: ",T01LX2_A13517BarPieRepa[0]);
            }
            if ( Z13521BarPieDfTu != T01LX2_A13521BarPieDfTu[0] )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDfTu");
               GXutil.writeLogRaw("Old: ",Z13521BarPieDfTu);
               GXutil.writeLogRaw("Current: ",T01LX2_A13521BarPieDfTu[0]);
            }
            if ( GXutil.strcmp(Z13572BarPieDSoC, T01LX2_A13572BarPieDSoC[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDSoC");
               GXutil.writeLogRaw("Old: ",Z13572BarPieDSoC);
               GXutil.writeLogRaw("Current: ",T01LX2_A13572BarPieDSoC[0]);
            }
            if ( DecimalUtil.compareTo(Z13573BarPieDHor, T01LX2_A13573BarPieDHor[0]) != 0 )
            {
               GXutil.writeLogln("tbarpdef:[seudo value changed for attri]"+"BarPieDHor");
               GXutil.writeLogRaw("Old: ",Z13573BarPieDHor);
               GXutil.writeLogRaw("Current: ",T01LX2_A13573BarPieDHor[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPBARPDE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LX1772( )
   {
      beforeValidate1LX1772( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LX1772( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LX1772( 0) ;
         checkOptimisticConcurrency1LX1772( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LX1772( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LX1772( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LX21 */
                  pr_default.execute(19, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf), Boolean.valueOf(n12914BarPieDfID), Short.valueOf(A12914BarPieDfID), Boolean.valueOf(n12915BarPieDfMi), A12915BarPieDfMi, Boolean.valueOf(n12916BarPieDfMf), A12916BarPieDfMf, Boolean.valueOf(n12917BarPieDfFI), A12917BarPieDfFI, Boolean.valueOf(n12934BarPieLong), A12934BarPieLong, Boolean.valueOf(n12969BarPieDPto), Short.valueOf(A12969BarPieDPto), Boolean.valueOf(n13110BarPieDfCr), A13110BarPieDfCr, Boolean.valueOf(n13517BarPieRepa), A13517BarPieRepa, Boolean.valueOf(n13521BarPieDfTu), Byte.valueOf(A13521BarPieDfTu), Boolean.valueOf(n13572BarPieDSoC), A13572BarPieDSoC, Boolean.valueOf(n13573BarPieDHor), A13573BarPieDHor, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPDE");
                  if ( (pr_default.getStatus(19) == 1) )
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
            load1LX1772( ) ;
         }
         endLevel1LX1772( ) ;
      }
      closeExtendedTableCursors1LX1772( ) ;
   }

   public void update1LX1772( )
   {
      beforeValidate1LX1772( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LX1772( ) ;
      }
      if ( ( nIsMod_1772 != 0 ) || ( nIsDirty_1772 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LX1772( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LX1772( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LX1772( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LX22 */
                     pr_default.execute(20, new Object[] {Boolean.valueOf(n12914BarPieDfID), Short.valueOf(A12914BarPieDfID), Boolean.valueOf(n12915BarPieDfMi), A12915BarPieDfMi, Boolean.valueOf(n12916BarPieDfMf), A12916BarPieDfMf, Boolean.valueOf(n12917BarPieDfFI), A12917BarPieDfFI, Boolean.valueOf(n12934BarPieLong), A12934BarPieLong, Boolean.valueOf(n12969BarPieDPto), Short.valueOf(A12969BarPieDPto), Boolean.valueOf(n13110BarPieDfCr), A13110BarPieDfCr, Boolean.valueOf(n13517BarPieRepa), A13517BarPieRepa, Boolean.valueOf(n13521BarPieDfTu), Byte.valueOf(A13521BarPieDfTu), Boolean.valueOf(n13572BarPieDSoC), A13572BarPieDSoC, Boolean.valueOf(n13573BarPieDHor), A13573BarPieDHor, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPDE");
                     if ( (pr_default.getStatus(20) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPBARPDE"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LX1772( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LX1772( ) ;
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
            endLevel1LX1772( ) ;
         }
      }
      closeExtendedTableCursors1LX1772( ) ;
   }

   public void deferredUpdate1LX1772( )
   {
   }

   public void delete1LX1772( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LX1772( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LX1772( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LX1772( ) ;
         afterConfirm1LX1772( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LX1772( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LX23 */
               pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A12913BarPieLDf)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPDE");
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
      sMode1772 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LX1772( ) ;
      Gx_mode = sMode1772 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LX1772( )
   {
      standaloneModal1LX1772( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LX1772( )
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

   public void scanStart1LX1772( )
   {
      /* Scan By routine */
      /* Using cursor T01LX24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      RcdFound1772 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1772 = (short)(1) ;
         A12913BarPieLDf = T01LX24_A12913BarPieLDf[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LX1772( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound1772 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1772 = (short)(1) ;
         A12913BarPieLDf = T01LX24_A12913BarPieLDf[0] ;
      }
   }

   public void scanEnd1LX1772( )
   {
      pr_default.close(22);
   }

   public void afterConfirm1LX1772( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LX1772( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LX1772( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LX1772( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LX1772( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LX1772( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LX1772( )
   {
      edtBarPieLDf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLDf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLDf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDfID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfID_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDfMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfMi_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDfMf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfMf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfMf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDfFI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfFI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfFI_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieLong_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLong_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLong_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDPto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDPto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDPto_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDfCr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfCr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfCr_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieRepa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieRepa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieRepa_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDfTu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDfTu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDfTu_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDSoC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDSoC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDSoC_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtBarPieDHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieDHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieDHor_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void send_integrity_lvl_hashes1LX1772( )
   {
   }

   public void send_integrity_lvl_hashes1LX18( )
   {
   }

   public void subsflControlProps_551772( )
   {
      edtavnRcdDeleted_1772_Internalname = "vNRCDDELETED_1772_"+sGXsfl_55_idx ;
      edtBarPieLDf_Internalname = "BARPIELDF_"+sGXsfl_55_idx ;
      edtBarPieDfID_Internalname = "BARPIEDFID_"+sGXsfl_55_idx ;
      edtBarPieDfMi_Internalname = "BARPIEDFMI_"+sGXsfl_55_idx ;
      edtBarPieDfMf_Internalname = "BARPIEDFMF_"+sGXsfl_55_idx ;
      edtBarPieDfFI_Internalname = "BARPIEDFFI_"+sGXsfl_55_idx ;
      edtBarPieLong_Internalname = "BARPIELONG_"+sGXsfl_55_idx ;
      edtBarPieDPto_Internalname = "BARPIEDPTO_"+sGXsfl_55_idx ;
      edtBarPieDfCr_Internalname = "BARPIEDFCR_"+sGXsfl_55_idx ;
      edtBarPieRepa_Internalname = "BARPIEREPA_"+sGXsfl_55_idx ;
      edtBarPieDfTu_Internalname = "BARPIEDFTU_"+sGXsfl_55_idx ;
      edtBarPieDSoC_Internalname = "BARPIEDSOC_"+sGXsfl_55_idx ;
      edtBarPieDHor_Internalname = "BARPIEDHOR_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_551772( )
   {
      edtavnRcdDeleted_1772_Internalname = "vNRCDDELETED_1772_"+sGXsfl_55_fel_idx ;
      edtBarPieLDf_Internalname = "BARPIELDF_"+sGXsfl_55_fel_idx ;
      edtBarPieDfID_Internalname = "BARPIEDFID_"+sGXsfl_55_fel_idx ;
      edtBarPieDfMi_Internalname = "BARPIEDFMI_"+sGXsfl_55_fel_idx ;
      edtBarPieDfMf_Internalname = "BARPIEDFMF_"+sGXsfl_55_fel_idx ;
      edtBarPieDfFI_Internalname = "BARPIEDFFI_"+sGXsfl_55_fel_idx ;
      edtBarPieLong_Internalname = "BARPIELONG_"+sGXsfl_55_fel_idx ;
      edtBarPieDPto_Internalname = "BARPIEDPTO_"+sGXsfl_55_fel_idx ;
      edtBarPieDfCr_Internalname = "BARPIEDFCR_"+sGXsfl_55_fel_idx ;
      edtBarPieRepa_Internalname = "BARPIEREPA_"+sGXsfl_55_fel_idx ;
      edtBarPieDfTu_Internalname = "BARPIEDFTU_"+sGXsfl_55_fel_idx ;
      edtBarPieDSoC_Internalname = "BARPIEDSOC_"+sGXsfl_55_fel_idx ;
      edtBarPieDHor_Internalname = "BARPIEDHOR_"+sGXsfl_55_fel_idx ;
   }

   public void addRow1LX1772( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551772( ) ;
      sendRow1LX1772( ) ;
   }

   public void sendRow1LX1772( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1772_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1772_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1772), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1772), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1772_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1772_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieLDf_Internalname,GXutil.ltrim( localUtil.ntoc( A12913BarPieLDf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12913BarPieLDf), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieLDf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieLDf_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDfID_Internalname,GXutil.ltrim( localUtil.ntoc( A12914BarPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieDfID_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12914BarPieDfID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12914BarPieDfID), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDfID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDfID_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDfMi_Internalname,GXutil.ltrim( localUtil.ntoc( A12915BarPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieDfMi_Enabled!=0) ? localUtil.format( A12915BarPieDfMi, "ZZZZZ9.99") : localUtil.format( A12915BarPieDfMi, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDfMi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDfMi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDfMf_Internalname,GXutil.ltrim( localUtil.ntoc( A12916BarPieDfMf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieDfMf_Enabled!=0) ? localUtil.format( A12916BarPieDfMf, "ZZZZZ9.99") : localUtil.format( A12916BarPieDfMf, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,60);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDfMf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDfMf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDfFI_Internalname,GXutil.rtrim( A12917BarPieDfFI),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDfFI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDfFI_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieLong_Internalname,GXutil.ltrim( localUtil.ntoc( A12934BarPieLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieLong_Enabled!=0) ? localUtil.format( A12934BarPieLong, "ZZZZZ9.99") : localUtil.format( A12934BarPieLong, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieLong_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieLong_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDPto_Internalname,GXutil.ltrim( localUtil.ntoc( A12969BarPieDPto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieDPto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12969BarPieDPto), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12969BarPieDPto), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDPto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDPto_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDfCr_Internalname,GXutil.rtrim( A13110BarPieDfCr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDfCr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDfCr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieRepa_Internalname,GXutil.rtrim( A13517BarPieRepa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieRepa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieRepa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDfTu_Internalname,GXutil.ltrim( localUtil.ntoc( A13521BarPieDfTu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieDfTu_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13521BarPieDfTu), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A13521BarPieDfTu), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDfTu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDfTu_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDSoC_Internalname,GXutil.rtrim( A13572BarPieDSoC),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDSoC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDSoC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1772_" + sGXsfl_55_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_55_idx + "',55)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieDHor_Internalname,GXutil.ltrim( localUtil.ntoc( A13573BarPieDHor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtBarPieDHor_Enabled!=0) ? localUtil.format( A13573BarPieDHor, "ZZZZZ9.99") : localUtil.format( A13573BarPieDHor, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieDHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtBarPieDHor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LX1772( ) ;
      GXCCtl = "Z12913BarPieLDf_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12913BarPieLDf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12914BarPieDfID_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12914BarPieDfID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12915BarPieDfMi_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12915BarPieDfMi, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12916BarPieDfMf_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12916BarPieDfMf, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12917BarPieDfFI_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12917BarPieDfFI));
      GXCCtl = "Z12934BarPieLong_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12934BarPieLong, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12969BarPieDPto_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12969BarPieDPto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13110BarPieDfCr_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13110BarPieDfCr));
      GXCCtl = "Z13517BarPieRepa_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13517BarPieRepa));
      GXCCtl = "Z13521BarPieDfTu_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13521BarPieDfTu, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13572BarPieDSoC_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13572BarPieDSoC));
      GXCCtl = "Z13573BarPieDHor_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13573BarPieDHor, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1772_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1772_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1772_" + sGXsfl_55_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1772, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1772_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1772_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIELDF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLDf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDFID_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDFMI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDFMF_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDFFI_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfFI_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIELONG_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLong_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDPTO_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDPto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDFCR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfCr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEREPA_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieRepa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDFTU_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfTu_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDSOC_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDSoC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEDHOR_"+sGXsfl_55_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDHor_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LX1772( )
   {
      nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551772( ) ;
      edtavnRcdDeleted_1772_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1772_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieLDf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELDF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDfID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFID_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDfMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFMI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDfMf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFMF_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDfFI_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFFI_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieLong_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIELONG_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDPto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDPTO_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDfCr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFCR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieRepa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEREPA_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDfTu_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDFTU_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDSoC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDSOC_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtBarPieDHor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIEDHOR_"+sGXsfl_55_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1772_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1772_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1772");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1772_Internalname ;
         wbErr = true ;
         nRcdDeleted_1772 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1772 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1772_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLDf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieLDf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARPIELDF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieLDf_Internalname ;
         wbErr = true ;
         A12913BarPieLDf = (short)(0) ;
      }
      else
      {
         A12913BarPieLDf = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieLDf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARPIEDFID_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieDfID_Internalname ;
         wbErr = true ;
         A12914BarPieDfID = (short)(0) ;
         n12914BarPieDfID = false ;
      }
      else
      {
         A12914BarPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieDfID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12914BarPieDfID = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieDfMi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieDfMi_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEDFMI_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieDfMi_Internalname ;
         wbErr = true ;
         A12915BarPieDfMi = DecimalUtil.ZERO ;
         n12915BarPieDfMi = false ;
      }
      else
      {
         A12915BarPieDfMi = localUtil.ctond( httpContext.cgiGet( edtBarPieDfMi_Internalname)) ;
         n12915BarPieDfMi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieDfMf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieDfMf_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEDFMF_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieDfMf_Internalname ;
         wbErr = true ;
         A12916BarPieDfMf = DecimalUtil.ZERO ;
         n12916BarPieDfMf = false ;
      }
      else
      {
         A12916BarPieDfMf = localUtil.ctond( httpContext.cgiGet( edtBarPieDfMf_Internalname)) ;
         n12916BarPieDfMf = false ;
      }
      A12917BarPieDfFI = httpContext.cgiGet( edtBarPieDfFI_Internalname) ;
      n12917BarPieDfFI = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieLong_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieLong_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIELONG_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieLong_Internalname ;
         wbErr = true ;
         A12934BarPieLong = DecimalUtil.ZERO ;
         n12934BarPieLong = false ;
      }
      else
      {
         A12934BarPieLong = localUtil.ctond( httpContext.cgiGet( edtBarPieLong_Internalname)) ;
         n12934BarPieLong = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDPto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDPto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "BARPIEDPTO_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieDPto_Internalname ;
         wbErr = true ;
         A12969BarPieDPto = (short)(0) ;
         n12969BarPieDPto = false ;
      }
      else
      {
         A12969BarPieDPto = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieDPto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12969BarPieDPto = false ;
      }
      A13110BarPieDfCr = httpContext.cgiGet( edtBarPieDfCr_Internalname) ;
      n13110BarPieDfCr = false ;
      A13517BarPieRepa = httpContext.cgiGet( edtBarPieRepa_Internalname) ;
      n13517BarPieRepa = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDfTu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarPieDfTu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "BARPIEDFTU_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieDfTu_Internalname ;
         wbErr = true ;
         A13521BarPieDfTu = (byte)(0) ;
         n13521BarPieDfTu = false ;
      }
      else
      {
         A13521BarPieDfTu = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieDfTu_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n13521BarPieDfTu = false ;
      }
      A13572BarPieDSoC = httpContext.cgiGet( edtBarPieDSoC_Internalname) ;
      n13572BarPieDSoC = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPieDHor_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPieDHor_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "BARPIEDHOR_" + sGXsfl_55_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarPieDHor_Internalname ;
         wbErr = true ;
         A13573BarPieDHor = DecimalUtil.ZERO ;
         n13573BarPieDHor = false ;
      }
      else
      {
         A13573BarPieDHor = localUtil.ctond( httpContext.cgiGet( edtBarPieDHor_Internalname)) ;
         n13573BarPieDHor = false ;
      }
      GXCCtl = "Z12913BarPieLDf_" + sGXsfl_55_idx ;
      Z12913BarPieLDf = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12914BarPieDfID_" + sGXsfl_55_idx ;
      Z12914BarPieDfID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12915BarPieDfMi_" + sGXsfl_55_idx ;
      Z12915BarPieDfMi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12916BarPieDfMf_" + sGXsfl_55_idx ;
      Z12916BarPieDfMf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12917BarPieDfFI_" + sGXsfl_55_idx ;
      Z12917BarPieDfFI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12934BarPieLong_" + sGXsfl_55_idx ;
      Z12934BarPieLong = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z12969BarPieDPto_" + sGXsfl_55_idx ;
      Z12969BarPieDPto = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13110BarPieDfCr_" + sGXsfl_55_idx ;
      Z13110BarPieDfCr = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13517BarPieRepa_" + sGXsfl_55_idx ;
      Z13517BarPieRepa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13521BarPieDfTu_" + sGXsfl_55_idx ;
      Z13521BarPieDfTu = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13572BarPieDSoC_" + sGXsfl_55_idx ;
      Z13572BarPieDSoC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z13573BarPieDHor_" + sGXsfl_55_idx ;
      Z13573BarPieDHor = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_1772_" + sGXsfl_55_idx ;
      nRcdDeleted_1772 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1772_" + sGXsfl_55_idx ;
      nRcdExists_1772 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1772_" + sGXsfl_55_idx ;
      nIsMod_1772 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtBarPieLDf_Enabled = edtBarPieLDf_Enabled ;
   }

   public void confirmValues1LX0( )
   {
      nGXsfl_55_idx = 0 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_551772( ) ;
      while ( nGXsfl_55_idx < nRC_GXsfl_55 )
      {
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551772( ) ;
         httpContext.changePostValue( "Z12913BarPieLDf_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12913BarPieLDf_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12913BarPieLDf_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12914BarPieDfID_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12914BarPieDfID_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12914BarPieDfID_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12915BarPieDfMi_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12915BarPieDfMi_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12915BarPieDfMi_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12916BarPieDfMf_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12916BarPieDfMf_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12916BarPieDfMf_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12917BarPieDfFI_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12917BarPieDfFI_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12917BarPieDfFI_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12934BarPieLong_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12934BarPieLong_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12934BarPieLong_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z12969BarPieDPto_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z12969BarPieDPto_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12969BarPieDPto_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13110BarPieDfCr_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13110BarPieDfCr_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13110BarPieDfCr_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13517BarPieRepa_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13517BarPieRepa_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13517BarPieRepa_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13521BarPieDfTu_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13521BarPieDfTu_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13521BarPieDfTu_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13572BarPieDSoC_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13572BarPieDSoC_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13572BarPieDSoC_"+sGXsfl_55_idx) ;
         httpContext.changePostValue( "Z13573BarPieDHor_"+sGXsfl_55_idx, httpContext.cgiGet( "ZT_"+"Z13573BarPieDHor_"+sGXsfl_55_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13573BarPieDHor_"+sGXsfl_55_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tbarpdef", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TBARPDEF");
      forbiddenHiddens.add("AlbRecCod", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tbarpdef:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12912BarPieUltD", GXutil.ltrim( localUtil.ntoc( Z12912BarPieUltD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nGXsfl_55_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tbarpdef", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TBARPDEF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Defectos a nivel de BARPIE", "") ;
   }

   public void initializeNonKey1LX18( )
   {
      A44AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A12912BarPieUltD = (short)(0) ;
      n12912BarPieUltD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12912BarPieUltD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12912BarPieUltD), 4, 0));
      Z12912BarPieUltD = (short)(0) ;
      Z44AlbRecCod = 0 ;
   }

   public void initAll1LX18( )
   {
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A200BarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      initializeNonKey1LX18( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LX1772( )
   {
      A12914BarPieDfID = (short)(0) ;
      n12914BarPieDfID = false ;
      A12915BarPieDfMi = DecimalUtil.ZERO ;
      n12915BarPieDfMi = false ;
      A12916BarPieDfMf = DecimalUtil.ZERO ;
      n12916BarPieDfMf = false ;
      A12917BarPieDfFI = "" ;
      n12917BarPieDfFI = false ;
      A12934BarPieLong = DecimalUtil.ZERO ;
      n12934BarPieLong = false ;
      A12969BarPieDPto = (short)(0) ;
      n12969BarPieDPto = false ;
      A13110BarPieDfCr = "" ;
      n13110BarPieDfCr = false ;
      A13517BarPieRepa = "" ;
      n13517BarPieRepa = false ;
      A13521BarPieDfTu = (byte)(0) ;
      n13521BarPieDfTu = false ;
      A13572BarPieDSoC = "" ;
      n13572BarPieDSoC = false ;
      A13573BarPieDHor = DecimalUtil.ZERO ;
      n13573BarPieDHor = false ;
      Z12914BarPieDfID = (short)(0) ;
      Z12915BarPieDfMi = DecimalUtil.ZERO ;
      Z12916BarPieDfMf = DecimalUtil.ZERO ;
      Z12917BarPieDfFI = "" ;
      Z12934BarPieLong = DecimalUtil.ZERO ;
      Z12969BarPieDPto = (short)(0) ;
      Z13110BarPieDfCr = "" ;
      Z13517BarPieRepa = "" ;
      Z13521BarPieDfTu = (byte)(0) ;
      Z13572BarPieDSoC = "" ;
      Z13573BarPieDHor = DecimalUtil.ZERO ;
   }

   public void initAll1LX1772( )
   {
      A12913BarPieLDf = (short)(0) ;
      initializeNonKey1LX1772( ) ;
   }

   public void standaloneModalInsert1LX1772( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241592687", true, true);
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
      httpContext.AddJavascriptSource("tbarpdef.js", "?20268241592687", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1772( )
   {
      edtBarPieLDf_Enabled = defedtBarPieLDf_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLDf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLDf_Enabled), 5, 0), !bGXsfl_55_Refreshing);
   }

   public void startgridcontrol55( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1772, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1772_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12913BarPieLDf, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLDf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12914BarPieDfID, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12915BarPieDfMi, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12916BarPieDfMf, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfMf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12917BarPieDfFI));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfFI_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12934BarPieLong, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieLong_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12969BarPieDPto, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDPto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13110BarPieDfCr));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfCr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13517BarPieRepa));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieRepa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13521BarPieDfTu, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDfTu_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A13572BarPieDSoC));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDSoC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13573BarPieDHor, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtBarPieDHor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtBarCod_Internalname = "BARCOD" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtBarPieUltD_Internalname = "BARPIEULTD" ;
      edtavnRcdDeleted_1772_Internalname = "vNRCDDELETED_1772" ;
      edtBarPieLDf_Internalname = "BARPIELDF" ;
      edtBarPieDfID_Internalname = "BARPIEDFID" ;
      edtBarPieDfMi_Internalname = "BARPIEDFMI" ;
      edtBarPieDfMf_Internalname = "BARPIEDFMF" ;
      edtBarPieDfFI_Internalname = "BARPIEDFFI" ;
      edtBarPieLong_Internalname = "BARPIELONG" ;
      edtBarPieDPto_Internalname = "BARPIEDPTO" ;
      edtBarPieDfCr_Internalname = "BARPIEDFCR" ;
      edtBarPieRepa_Internalname = "BARPIEREPA" ;
      edtBarPieDfTu_Internalname = "BARPIEDFTU" ;
      edtBarPieDSoC_Internalname = "BARPIEDSOC" ;
      edtBarPieDHor_Internalname = "BARPIEDHOR" ;
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
      Form.setCaption( httpContext.getMessage( "Defectos a nivel de BARPIE", "") );
      edtBarPieDHor_Jsonclick = "" ;
      edtBarPieDSoC_Jsonclick = "" ;
      edtBarPieDfTu_Jsonclick = "" ;
      edtBarPieRepa_Jsonclick = "" ;
      edtBarPieDfCr_Jsonclick = "" ;
      edtBarPieDPto_Jsonclick = "" ;
      edtBarPieLong_Jsonclick = "" ;
      edtBarPieDfFI_Jsonclick = "" ;
      edtBarPieDfMf_Jsonclick = "" ;
      edtBarPieDfMi_Jsonclick = "" ;
      edtBarPieDfID_Jsonclick = "" ;
      edtBarPieLDf_Jsonclick = "" ;
      edtavnRcdDeleted_1772_Jsonclick = "" ;
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
      edtBarPieDHor_Enabled = 1 ;
      edtBarPieDSoC_Enabled = 1 ;
      edtBarPieDfTu_Enabled = 1 ;
      edtBarPieRepa_Enabled = 1 ;
      edtBarPieDfCr_Enabled = 1 ;
      edtBarPieDPto_Enabled = 1 ;
      edtBarPieLong_Enabled = 1 ;
      edtBarPieDfFI_Enabled = 1 ;
      edtBarPieDfMf_Enabled = 1 ;
      edtBarPieDfMi_Enabled = 1 ;
      edtBarPieDfID_Enabled = 1 ;
      edtBarPieLDf_Enabled = 1 ;
      edtavnRcdDeleted_1772_Enabled = 1 ;
      edtBarPieUltD_Jsonclick = "" ;
      edtBarPieUltD_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieUltD_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieCod_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Backcolor = (int)(0xFFFFFF) ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtBarCod_Enabled = 1 ;
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
      subsflControlProps_551772( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LX1772( ) ;
         standaloneModal1LX1772( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LX1772( ) ;
         nGXsfl_55_idx = (int)(nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_551772( ) ;
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
      /* Using cursor T01LX25 */
      pr_default.execute(23, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LX25_A407EmprNom[0] ;
      n407EmprNom = T01LX25_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(23);
      /* Using cursor T01LX26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(24);
      GX_FocusControl = edtBarPieUltD_Internalname ;
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01LX26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12912BarPieUltD", GXutil.ltrim( localUtil.ntoc( A12912BarPieUltD, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12912BarPieUltD", GXutil.ltrim( localUtil.ntoc( Z12912BarPieUltD, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A12912BarPieUltD',fld:'BARPIEULTD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z44AlbRecCod'},{av:'Z407EmprNom'},{av:'Z12912BarPieUltD'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARPIELDF","{handler:'valid_Barpieldf',iparms:[]");
      setEventMetadata("VALID_BARPIELDF",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barpiedhor',iparms:[]");
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
      pr_default.close(24);
      pr_default.close(23);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z12915BarPieDfMi = DecimalUtil.ZERO ;
      Z12916BarPieDfMf = DecimalUtil.ZERO ;
      Z12917BarPieDfFI = "" ;
      Z12934BarPieLong = DecimalUtil.ZERO ;
      Z13110BarPieDfCr = "" ;
      Z13517BarPieRepa = "" ;
      Z13572BarPieDSoC = "" ;
      Z13573BarPieDHor = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
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
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A200BarPieCod = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1772 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode18 = "" ;
      GXCCtl = "" ;
      A12915BarPieDfMi = DecimalUtil.ZERO ;
      A12916BarPieDfMf = DecimalUtil.ZERO ;
      A12917BarPieDfFI = "" ;
      A12934BarPieLong = DecimalUtil.ZERO ;
      A13110BarPieDfCr = "" ;
      A13517BarPieRepa = "" ;
      A13572BarPieDSoC = "" ;
      A13573BarPieDHor = DecimalUtil.ZERO ;
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
      T01LX6_A407EmprNom = new String[] {""} ;
      T01LX6_n407EmprNom = new boolean[] {false} ;
      T01LX8_A200BarPieCod = new String[] {""} ;
      T01LX8_A407EmprNom = new String[] {""} ;
      T01LX8_n407EmprNom = new boolean[] {false} ;
      T01LX8_A12912BarPieUltD = new short[1] ;
      T01LX8_n12912BarPieUltD = new boolean[] {false} ;
      T01LX8_A396EmprCod = new String[] {""} ;
      T01LX8_A44AlbRecCod = new int[1] ;
      T01LX8_A129BarCod = new int[1] ;
      T01LX8_A132BarCodReo = new byte[1] ;
      T01LX8_A130BarCodPar = new String[] {""} ;
      T01LX7_A396EmprCod = new String[] {""} ;
      T01LX9_A396EmprCod = new String[] {""} ;
      T01LX10_A396EmprCod = new String[] {""} ;
      T01LX10_A129BarCod = new int[1] ;
      T01LX10_A132BarCodReo = new byte[1] ;
      T01LX10_A130BarCodPar = new String[] {""} ;
      T01LX10_A200BarPieCod = new String[] {""} ;
      T01LX5_A200BarPieCod = new String[] {""} ;
      T01LX5_A12912BarPieUltD = new short[1] ;
      T01LX5_n12912BarPieUltD = new boolean[] {false} ;
      T01LX5_A396EmprCod = new String[] {""} ;
      T01LX5_A44AlbRecCod = new int[1] ;
      T01LX5_A129BarCod = new int[1] ;
      T01LX5_A132BarCodReo = new byte[1] ;
      T01LX5_A130BarCodPar = new String[] {""} ;
      T01LX11_A396EmprCod = new String[] {""} ;
      T01LX11_A129BarCod = new int[1] ;
      T01LX11_A132BarCodReo = new byte[1] ;
      T01LX11_A130BarCodPar = new String[] {""} ;
      T01LX11_A200BarPieCod = new String[] {""} ;
      T01LX12_A396EmprCod = new String[] {""} ;
      T01LX12_A129BarCod = new int[1] ;
      T01LX12_A132BarCodReo = new byte[1] ;
      T01LX12_A130BarCodPar = new String[] {""} ;
      T01LX12_A200BarPieCod = new String[] {""} ;
      T01LX4_A200BarPieCod = new String[] {""} ;
      T01LX4_A12912BarPieUltD = new short[1] ;
      T01LX4_n12912BarPieUltD = new boolean[] {false} ;
      T01LX4_A396EmprCod = new String[] {""} ;
      T01LX4_A44AlbRecCod = new int[1] ;
      T01LX4_A129BarCod = new int[1] ;
      T01LX4_A132BarCodReo = new byte[1] ;
      T01LX4_A130BarCodPar = new String[] {""} ;
      T01LX16_A396EmprCod = new String[] {""} ;
      T01LX16_A129BarCod = new int[1] ;
      T01LX16_A132BarCodReo = new byte[1] ;
      T01LX16_A130BarCodPar = new String[] {""} ;
      T01LX16_A200BarPieCod = new String[] {""} ;
      T01LX16_A3858BarTroCod = new short[1] ;
      T01LX17_A396EmprCod = new String[] {""} ;
      T01LX17_A30AlbProCod = new long[1] ;
      T01LX17_A129BarCod = new int[1] ;
      T01LX17_A132BarCodReo = new byte[1] ;
      T01LX17_A130BarCodPar = new String[] {""} ;
      T01LX17_A200BarPieCod = new String[] {""} ;
      T01LX18_A396EmprCod = new String[] {""} ;
      T01LX18_A129BarCod = new int[1] ;
      T01LX18_A132BarCodReo = new byte[1] ;
      T01LX18_A130BarCodPar = new String[] {""} ;
      T01LX18_A200BarPieCod = new String[] {""} ;
      T01LX19_A129BarCod = new int[1] ;
      T01LX19_A132BarCodReo = new byte[1] ;
      T01LX19_A130BarCodPar = new String[] {""} ;
      T01LX19_A200BarPieCod = new String[] {""} ;
      T01LX19_A12913BarPieLDf = new short[1] ;
      T01LX19_A12914BarPieDfID = new short[1] ;
      T01LX19_n12914BarPieDfID = new boolean[] {false} ;
      T01LX19_A12915BarPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX19_n12915BarPieDfMi = new boolean[] {false} ;
      T01LX19_A12916BarPieDfMf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX19_n12916BarPieDfMf = new boolean[] {false} ;
      T01LX19_A12917BarPieDfFI = new String[] {""} ;
      T01LX19_n12917BarPieDfFI = new boolean[] {false} ;
      T01LX19_A12934BarPieLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX19_n12934BarPieLong = new boolean[] {false} ;
      T01LX19_A12969BarPieDPto = new short[1] ;
      T01LX19_n12969BarPieDPto = new boolean[] {false} ;
      T01LX19_A13110BarPieDfCr = new String[] {""} ;
      T01LX19_n13110BarPieDfCr = new boolean[] {false} ;
      T01LX19_A13517BarPieRepa = new String[] {""} ;
      T01LX19_n13517BarPieRepa = new boolean[] {false} ;
      T01LX19_A13521BarPieDfTu = new byte[1] ;
      T01LX19_n13521BarPieDfTu = new boolean[] {false} ;
      T01LX19_A13572BarPieDSoC = new String[] {""} ;
      T01LX19_n13572BarPieDSoC = new boolean[] {false} ;
      T01LX19_A13573BarPieDHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX19_n13573BarPieDHor = new boolean[] {false} ;
      T01LX19_A396EmprCod = new String[] {""} ;
      T01LX20_A396EmprCod = new String[] {""} ;
      T01LX20_A129BarCod = new int[1] ;
      T01LX20_A132BarCodReo = new byte[1] ;
      T01LX20_A130BarCodPar = new String[] {""} ;
      T01LX20_A200BarPieCod = new String[] {""} ;
      T01LX20_A12913BarPieLDf = new short[1] ;
      T01LX3_A129BarCod = new int[1] ;
      T01LX3_A132BarCodReo = new byte[1] ;
      T01LX3_A130BarCodPar = new String[] {""} ;
      T01LX3_A200BarPieCod = new String[] {""} ;
      T01LX3_A12913BarPieLDf = new short[1] ;
      T01LX3_A12914BarPieDfID = new short[1] ;
      T01LX3_n12914BarPieDfID = new boolean[] {false} ;
      T01LX3_A12915BarPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX3_n12915BarPieDfMi = new boolean[] {false} ;
      T01LX3_A12916BarPieDfMf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX3_n12916BarPieDfMf = new boolean[] {false} ;
      T01LX3_A12917BarPieDfFI = new String[] {""} ;
      T01LX3_n12917BarPieDfFI = new boolean[] {false} ;
      T01LX3_A12934BarPieLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX3_n12934BarPieLong = new boolean[] {false} ;
      T01LX3_A12969BarPieDPto = new short[1] ;
      T01LX3_n12969BarPieDPto = new boolean[] {false} ;
      T01LX3_A13110BarPieDfCr = new String[] {""} ;
      T01LX3_n13110BarPieDfCr = new boolean[] {false} ;
      T01LX3_A13517BarPieRepa = new String[] {""} ;
      T01LX3_n13517BarPieRepa = new boolean[] {false} ;
      T01LX3_A13521BarPieDfTu = new byte[1] ;
      T01LX3_n13521BarPieDfTu = new boolean[] {false} ;
      T01LX3_A13572BarPieDSoC = new String[] {""} ;
      T01LX3_n13572BarPieDSoC = new boolean[] {false} ;
      T01LX3_A13573BarPieDHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX3_n13573BarPieDHor = new boolean[] {false} ;
      T01LX3_A396EmprCod = new String[] {""} ;
      T01LX2_A129BarCod = new int[1] ;
      T01LX2_A132BarCodReo = new byte[1] ;
      T01LX2_A130BarCodPar = new String[] {""} ;
      T01LX2_A200BarPieCod = new String[] {""} ;
      T01LX2_A12913BarPieLDf = new short[1] ;
      T01LX2_A12914BarPieDfID = new short[1] ;
      T01LX2_n12914BarPieDfID = new boolean[] {false} ;
      T01LX2_A12915BarPieDfMi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX2_n12915BarPieDfMi = new boolean[] {false} ;
      T01LX2_A12916BarPieDfMf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX2_n12916BarPieDfMf = new boolean[] {false} ;
      T01LX2_A12917BarPieDfFI = new String[] {""} ;
      T01LX2_n12917BarPieDfFI = new boolean[] {false} ;
      T01LX2_A12934BarPieLong = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX2_n12934BarPieLong = new boolean[] {false} ;
      T01LX2_A12969BarPieDPto = new short[1] ;
      T01LX2_n12969BarPieDPto = new boolean[] {false} ;
      T01LX2_A13110BarPieDfCr = new String[] {""} ;
      T01LX2_n13110BarPieDfCr = new boolean[] {false} ;
      T01LX2_A13517BarPieRepa = new String[] {""} ;
      T01LX2_n13517BarPieRepa = new boolean[] {false} ;
      T01LX2_A13521BarPieDfTu = new byte[1] ;
      T01LX2_n13521BarPieDfTu = new boolean[] {false} ;
      T01LX2_A13572BarPieDSoC = new String[] {""} ;
      T01LX2_n13572BarPieDSoC = new boolean[] {false} ;
      T01LX2_A13573BarPieDHor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LX2_n13573BarPieDHor = new boolean[] {false} ;
      T01LX2_A396EmprCod = new String[] {""} ;
      T01LX24_A396EmprCod = new String[] {""} ;
      T01LX24_A129BarCod = new int[1] ;
      T01LX24_A132BarCodReo = new byte[1] ;
      T01LX24_A130BarCodPar = new String[] {""} ;
      T01LX24_A200BarPieCod = new String[] {""} ;
      T01LX24_A12913BarPieLDf = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01LX25_A407EmprNom = new String[] {""} ;
      T01LX25_n407EmprNom = new boolean[] {false} ;
      T01LX26_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tbarpdef__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tbarpdef__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tbarpdef__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tbarpdef__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tbarpdef__default(),
         new Object[] {
             new Object[] {
            T01LX2_A129BarCod, T01LX2_A132BarCodReo, T01LX2_A130BarCodPar, T01LX2_A200BarPieCod, T01LX2_A12913BarPieLDf, T01LX2_A12914BarPieDfID, T01LX2_n12914BarPieDfID, T01LX2_A12915BarPieDfMi, T01LX2_n12915BarPieDfMi, T01LX2_A12916BarPieDfMf,
            T01LX2_n12916BarPieDfMf, T01LX2_A12917BarPieDfFI, T01LX2_n12917BarPieDfFI, T01LX2_A12934BarPieLong, T01LX2_n12934BarPieLong, T01LX2_A12969BarPieDPto, T01LX2_n12969BarPieDPto, T01LX2_A13110BarPieDfCr, T01LX2_n13110BarPieDfCr, T01LX2_A13517BarPieRepa,
            T01LX2_n13517BarPieRepa, T01LX2_A13521BarPieDfTu, T01LX2_n13521BarPieDfTu, T01LX2_A13572BarPieDSoC, T01LX2_n13572BarPieDSoC, T01LX2_A13573BarPieDHor, T01LX2_n13573BarPieDHor, T01LX2_A396EmprCod
            }
            , new Object[] {
            T01LX3_A129BarCod, T01LX3_A132BarCodReo, T01LX3_A130BarCodPar, T01LX3_A200BarPieCod, T01LX3_A12913BarPieLDf, T01LX3_A12914BarPieDfID, T01LX3_n12914BarPieDfID, T01LX3_A12915BarPieDfMi, T01LX3_n12915BarPieDfMi, T01LX3_A12916BarPieDfMf,
            T01LX3_n12916BarPieDfMf, T01LX3_A12917BarPieDfFI, T01LX3_n12917BarPieDfFI, T01LX3_A12934BarPieLong, T01LX3_n12934BarPieLong, T01LX3_A12969BarPieDPto, T01LX3_n12969BarPieDPto, T01LX3_A13110BarPieDfCr, T01LX3_n13110BarPieDfCr, T01LX3_A13517BarPieRepa,
            T01LX3_n13517BarPieRepa, T01LX3_A13521BarPieDfTu, T01LX3_n13521BarPieDfTu, T01LX3_A13572BarPieDSoC, T01LX3_n13572BarPieDSoC, T01LX3_A13573BarPieDHor, T01LX3_n13573BarPieDHor, T01LX3_A396EmprCod
            }
            , new Object[] {
            T01LX4_A200BarPieCod, T01LX4_A12912BarPieUltD, T01LX4_n12912BarPieUltD, T01LX4_A396EmprCod, T01LX4_A44AlbRecCod, T01LX4_A129BarCod, T01LX4_A132BarCodReo, T01LX4_A130BarCodPar
            }
            , new Object[] {
            T01LX5_A200BarPieCod, T01LX5_A12912BarPieUltD, T01LX5_n12912BarPieUltD, T01LX5_A396EmprCod, T01LX5_A44AlbRecCod, T01LX5_A129BarCod, T01LX5_A132BarCodReo, T01LX5_A130BarCodPar
            }
            , new Object[] {
            T01LX6_A407EmprNom, T01LX6_n407EmprNom
            }
            , new Object[] {
            T01LX7_A396EmprCod
            }
            , new Object[] {
            T01LX8_A200BarPieCod, T01LX8_A407EmprNom, T01LX8_n407EmprNom, T01LX8_A12912BarPieUltD, T01LX8_n12912BarPieUltD, T01LX8_A396EmprCod, T01LX8_A44AlbRecCod, T01LX8_A129BarCod, T01LX8_A132BarCodReo, T01LX8_A130BarCodPar
            }
            , new Object[] {
            T01LX9_A396EmprCod
            }
            , new Object[] {
            T01LX10_A396EmprCod, T01LX10_A129BarCod, T01LX10_A132BarCodReo, T01LX10_A130BarCodPar, T01LX10_A200BarPieCod
            }
            , new Object[] {
            T01LX11_A396EmprCod, T01LX11_A129BarCod, T01LX11_A132BarCodReo, T01LX11_A130BarCodPar, T01LX11_A200BarPieCod
            }
            , new Object[] {
            T01LX12_A396EmprCod, T01LX12_A129BarCod, T01LX12_A132BarCodReo, T01LX12_A130BarCodPar, T01LX12_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LX16_A396EmprCod, T01LX16_A129BarCod, T01LX16_A132BarCodReo, T01LX16_A130BarCodPar, T01LX16_A200BarPieCod, T01LX16_A3858BarTroCod
            }
            , new Object[] {
            T01LX17_A396EmprCod, T01LX17_A30AlbProCod, T01LX17_A129BarCod, T01LX17_A132BarCodReo, T01LX17_A130BarCodPar, T01LX17_A200BarPieCod
            }
            , new Object[] {
            T01LX18_A396EmprCod, T01LX18_A129BarCod, T01LX18_A132BarCodReo, T01LX18_A130BarCodPar, T01LX18_A200BarPieCod
            }
            , new Object[] {
            T01LX19_A129BarCod, T01LX19_A132BarCodReo, T01LX19_A130BarCodPar, T01LX19_A200BarPieCod, T01LX19_A12913BarPieLDf, T01LX19_A12914BarPieDfID, T01LX19_n12914BarPieDfID, T01LX19_A12915BarPieDfMi, T01LX19_n12915BarPieDfMi, T01LX19_A12916BarPieDfMf,
            T01LX19_n12916BarPieDfMf, T01LX19_A12917BarPieDfFI, T01LX19_n12917BarPieDfFI, T01LX19_A12934BarPieLong, T01LX19_n12934BarPieLong, T01LX19_A12969BarPieDPto, T01LX19_n12969BarPieDPto, T01LX19_A13110BarPieDfCr, T01LX19_n13110BarPieDfCr, T01LX19_A13517BarPieRepa,
            T01LX19_n13517BarPieRepa, T01LX19_A13521BarPieDfTu, T01LX19_n13521BarPieDfTu, T01LX19_A13572BarPieDSoC, T01LX19_n13572BarPieDSoC, T01LX19_A13573BarPieDHor, T01LX19_n13573BarPieDHor, T01LX19_A396EmprCod
            }
            , new Object[] {
            T01LX20_A396EmprCod, T01LX20_A129BarCod, T01LX20_A132BarCodReo, T01LX20_A130BarCodPar, T01LX20_A200BarPieCod, T01LX20_A12913BarPieLDf
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LX24_A396EmprCod, T01LX24_A129BarCod, T01LX24_A132BarCodReo, T01LX24_A130BarCodPar, T01LX24_A200BarPieCod, T01LX24_A12913BarPieLDf
            }
            , new Object[] {
            T01LX25_A407EmprNom, T01LX25_n407EmprNom
            }
            , new Object[] {
            T01LX26_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TBARPDEF" ;
   }

   private byte Z132BarCodReo ;
   private byte Z13521BarPieDfTu ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A13521BarPieDfTu ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z12912BarPieUltD ;
   private short Z12913BarPieLDf ;
   private short Z12914BarPieDfID ;
   private short Z12969BarPieDPto ;
   private short nRcdDeleted_1772 ;
   private short nRcdExists_1772 ;
   private short nIsMod_1772 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A12912BarPieUltD ;
   private short nBlankRcdCount1772 ;
   private short RcdFound1772 ;
   private short nBlankRcdUsr1772 ;
   private short A12913BarPieLDf ;
   private short A12914BarPieDfID ;
   private short A12969BarPieDPto ;
   private short RcdFound18 ;
   private short nIsDirty_18 ;
   private short nIsDirty_1772 ;
   private short ZZ12912BarPieUltD ;
   private int Z129BarCod ;
   private int Z44AlbRecCod ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtBarPieUltD_Enabled ;
   private int edtavnRcdDeleted_1772_Enabled ;
   private int edtBarPieLDf_Enabled ;
   private int edtBarPieDfID_Enabled ;
   private int edtBarPieDfMi_Enabled ;
   private int edtBarPieDfMf_Enabled ;
   private int edtBarPieDfFI_Enabled ;
   private int edtBarPieLong_Enabled ;
   private int edtBarPieDPto_Enabled ;
   private int edtBarPieDfCr_Enabled ;
   private int edtBarPieRepa_Enabled ;
   private int edtBarPieDfTu_Enabled ;
   private int edtBarPieDSoC_Enabled ;
   private int edtBarPieDHor_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A44AlbRecCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtBarPieLDf_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarPieUltD_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private int ZZ44AlbRecCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z12915BarPieDfMi ;
   private java.math.BigDecimal Z12916BarPieDfMf ;
   private java.math.BigDecimal Z12934BarPieLong ;
   private java.math.BigDecimal Z13573BarPieDHor ;
   private java.math.BigDecimal A12915BarPieDfMi ;
   private java.math.BigDecimal A12916BarPieDfMf ;
   private java.math.BigDecimal A12934BarPieLong ;
   private java.math.BigDecimal A13573BarPieDHor ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z12917BarPieDfFI ;
   private String Z13110BarPieDfCr ;
   private String Z13517BarPieRepa ;
   private String Z13572BarPieDSoC ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtBarCod_Internalname ;
   private String sGXsfl_55_idx="0001" ;
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
   private String edtBarCod_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtBarPieCod_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtBarPieUltD_Internalname ;
   private String edtBarPieUltD_Jsonclick ;
   private String sMode1772 ;
   private String edtavnRcdDeleted_1772_Internalname ;
   private String edtBarPieLDf_Internalname ;
   private String edtBarPieDfID_Internalname ;
   private String edtBarPieDfMi_Internalname ;
   private String edtBarPieDfMf_Internalname ;
   private String edtBarPieDfFI_Internalname ;
   private String edtBarPieLong_Internalname ;
   private String edtBarPieDPto_Internalname ;
   private String edtBarPieDfCr_Internalname ;
   private String edtBarPieRepa_Internalname ;
   private String edtBarPieDfTu_Internalname ;
   private String edtBarPieDSoC_Internalname ;
   private String edtBarPieDHor_Internalname ;
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
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode18 ;
   private String GXCCtl ;
   private String A12917BarPieDfFI ;
   private String A13110BarPieDfCr ;
   private String A13517BarPieRepa ;
   private String A13572BarPieDSoC ;
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
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_1772_Jsonclick ;
   private String edtBarPieLDf_Jsonclick ;
   private String edtBarPieDfID_Jsonclick ;
   private String edtBarPieDfMi_Jsonclick ;
   private String edtBarPieDfMf_Jsonclick ;
   private String edtBarPieDfFI_Jsonclick ;
   private String edtBarPieLong_Jsonclick ;
   private String edtBarPieDPto_Jsonclick ;
   private String edtBarPieDfCr_Jsonclick ;
   private String edtBarPieRepa_Jsonclick ;
   private String edtBarPieDfTu_Jsonclick ;
   private String edtBarPieDSoC_Jsonclick ;
   private String edtBarPieDHor_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n12912BarPieUltD ;
   private boolean returnInSub ;
   private boolean n12914BarPieDfID ;
   private boolean n12915BarPieDfMi ;
   private boolean n12916BarPieDfMf ;
   private boolean n12917BarPieDfFI ;
   private boolean n12934BarPieLong ;
   private boolean n12969BarPieDPto ;
   private boolean n13110BarPieDfCr ;
   private boolean n13517BarPieRepa ;
   private boolean n13521BarPieDfTu ;
   private boolean n13572BarPieDSoC ;
   private boolean n13573BarPieDHor ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01LX6_A407EmprNom ;
   private boolean[] T01LX6_n407EmprNom ;
   private String[] T01LX8_A200BarPieCod ;
   private String[] T01LX8_A407EmprNom ;
   private boolean[] T01LX8_n407EmprNom ;
   private short[] T01LX8_A12912BarPieUltD ;
   private boolean[] T01LX8_n12912BarPieUltD ;
   private String[] T01LX8_A396EmprCod ;
   private int[] T01LX8_A44AlbRecCod ;
   private int[] T01LX8_A129BarCod ;
   private byte[] T01LX8_A132BarCodReo ;
   private String[] T01LX8_A130BarCodPar ;
   private String[] T01LX7_A396EmprCod ;
   private String[] T01LX9_A396EmprCod ;
   private String[] T01LX10_A396EmprCod ;
   private int[] T01LX10_A129BarCod ;
   private byte[] T01LX10_A132BarCodReo ;
   private String[] T01LX10_A130BarCodPar ;
   private String[] T01LX10_A200BarPieCod ;
   private String[] T01LX5_A200BarPieCod ;
   private short[] T01LX5_A12912BarPieUltD ;
   private boolean[] T01LX5_n12912BarPieUltD ;
   private String[] T01LX5_A396EmprCod ;
   private int[] T01LX5_A44AlbRecCod ;
   private int[] T01LX5_A129BarCod ;
   private byte[] T01LX5_A132BarCodReo ;
   private String[] T01LX5_A130BarCodPar ;
   private String[] T01LX11_A396EmprCod ;
   private int[] T01LX11_A129BarCod ;
   private byte[] T01LX11_A132BarCodReo ;
   private String[] T01LX11_A130BarCodPar ;
   private String[] T01LX11_A200BarPieCod ;
   private String[] T01LX12_A396EmprCod ;
   private int[] T01LX12_A129BarCod ;
   private byte[] T01LX12_A132BarCodReo ;
   private String[] T01LX12_A130BarCodPar ;
   private String[] T01LX12_A200BarPieCod ;
   private String[] T01LX4_A200BarPieCod ;
   private short[] T01LX4_A12912BarPieUltD ;
   private boolean[] T01LX4_n12912BarPieUltD ;
   private String[] T01LX4_A396EmprCod ;
   private int[] T01LX4_A44AlbRecCod ;
   private int[] T01LX4_A129BarCod ;
   private byte[] T01LX4_A132BarCodReo ;
   private String[] T01LX4_A130BarCodPar ;
   private String[] T01LX16_A396EmprCod ;
   private int[] T01LX16_A129BarCod ;
   private byte[] T01LX16_A132BarCodReo ;
   private String[] T01LX16_A130BarCodPar ;
   private String[] T01LX16_A200BarPieCod ;
   private short[] T01LX16_A3858BarTroCod ;
   private String[] T01LX17_A396EmprCod ;
   private long[] T01LX17_A30AlbProCod ;
   private int[] T01LX17_A129BarCod ;
   private byte[] T01LX17_A132BarCodReo ;
   private String[] T01LX17_A130BarCodPar ;
   private String[] T01LX17_A200BarPieCod ;
   private String[] T01LX18_A396EmprCod ;
   private int[] T01LX18_A129BarCod ;
   private byte[] T01LX18_A132BarCodReo ;
   private String[] T01LX18_A130BarCodPar ;
   private String[] T01LX18_A200BarPieCod ;
   private int[] T01LX19_A129BarCod ;
   private byte[] T01LX19_A132BarCodReo ;
   private String[] T01LX19_A130BarCodPar ;
   private String[] T01LX19_A200BarPieCod ;
   private short[] T01LX19_A12913BarPieLDf ;
   private short[] T01LX19_A12914BarPieDfID ;
   private boolean[] T01LX19_n12914BarPieDfID ;
   private java.math.BigDecimal[] T01LX19_A12915BarPieDfMi ;
   private boolean[] T01LX19_n12915BarPieDfMi ;
   private java.math.BigDecimal[] T01LX19_A12916BarPieDfMf ;
   private boolean[] T01LX19_n12916BarPieDfMf ;
   private String[] T01LX19_A12917BarPieDfFI ;
   private boolean[] T01LX19_n12917BarPieDfFI ;
   private java.math.BigDecimal[] T01LX19_A12934BarPieLong ;
   private boolean[] T01LX19_n12934BarPieLong ;
   private short[] T01LX19_A12969BarPieDPto ;
   private boolean[] T01LX19_n12969BarPieDPto ;
   private String[] T01LX19_A13110BarPieDfCr ;
   private boolean[] T01LX19_n13110BarPieDfCr ;
   private String[] T01LX19_A13517BarPieRepa ;
   private boolean[] T01LX19_n13517BarPieRepa ;
   private byte[] T01LX19_A13521BarPieDfTu ;
   private boolean[] T01LX19_n13521BarPieDfTu ;
   private String[] T01LX19_A13572BarPieDSoC ;
   private boolean[] T01LX19_n13572BarPieDSoC ;
   private java.math.BigDecimal[] T01LX19_A13573BarPieDHor ;
   private boolean[] T01LX19_n13573BarPieDHor ;
   private String[] T01LX19_A396EmprCod ;
   private String[] T01LX20_A396EmprCod ;
   private int[] T01LX20_A129BarCod ;
   private byte[] T01LX20_A132BarCodReo ;
   private String[] T01LX20_A130BarCodPar ;
   private String[] T01LX20_A200BarPieCod ;
   private short[] T01LX20_A12913BarPieLDf ;
   private int[] T01LX3_A129BarCod ;
   private byte[] T01LX3_A132BarCodReo ;
   private String[] T01LX3_A130BarCodPar ;
   private String[] T01LX3_A200BarPieCod ;
   private short[] T01LX3_A12913BarPieLDf ;
   private short[] T01LX3_A12914BarPieDfID ;
   private boolean[] T01LX3_n12914BarPieDfID ;
   private java.math.BigDecimal[] T01LX3_A12915BarPieDfMi ;
   private boolean[] T01LX3_n12915BarPieDfMi ;
   private java.math.BigDecimal[] T01LX3_A12916BarPieDfMf ;
   private boolean[] T01LX3_n12916BarPieDfMf ;
   private String[] T01LX3_A12917BarPieDfFI ;
   private boolean[] T01LX3_n12917BarPieDfFI ;
   private java.math.BigDecimal[] T01LX3_A12934BarPieLong ;
   private boolean[] T01LX3_n12934BarPieLong ;
   private short[] T01LX3_A12969BarPieDPto ;
   private boolean[] T01LX3_n12969BarPieDPto ;
   private String[] T01LX3_A13110BarPieDfCr ;
   private boolean[] T01LX3_n13110BarPieDfCr ;
   private String[] T01LX3_A13517BarPieRepa ;
   private boolean[] T01LX3_n13517BarPieRepa ;
   private byte[] T01LX3_A13521BarPieDfTu ;
   private boolean[] T01LX3_n13521BarPieDfTu ;
   private String[] T01LX3_A13572BarPieDSoC ;
   private boolean[] T01LX3_n13572BarPieDSoC ;
   private java.math.BigDecimal[] T01LX3_A13573BarPieDHor ;
   private boolean[] T01LX3_n13573BarPieDHor ;
   private String[] T01LX3_A396EmprCod ;
   private int[] T01LX2_A129BarCod ;
   private byte[] T01LX2_A132BarCodReo ;
   private String[] T01LX2_A130BarCodPar ;
   private String[] T01LX2_A200BarPieCod ;
   private short[] T01LX2_A12913BarPieLDf ;
   private short[] T01LX2_A12914BarPieDfID ;
   private boolean[] T01LX2_n12914BarPieDfID ;
   private java.math.BigDecimal[] T01LX2_A12915BarPieDfMi ;
   private boolean[] T01LX2_n12915BarPieDfMi ;
   private java.math.BigDecimal[] T01LX2_A12916BarPieDfMf ;
   private boolean[] T01LX2_n12916BarPieDfMf ;
   private String[] T01LX2_A12917BarPieDfFI ;
   private boolean[] T01LX2_n12917BarPieDfFI ;
   private java.math.BigDecimal[] T01LX2_A12934BarPieLong ;
   private boolean[] T01LX2_n12934BarPieLong ;
   private short[] T01LX2_A12969BarPieDPto ;
   private boolean[] T01LX2_n12969BarPieDPto ;
   private String[] T01LX2_A13110BarPieDfCr ;
   private boolean[] T01LX2_n13110BarPieDfCr ;
   private String[] T01LX2_A13517BarPieRepa ;
   private boolean[] T01LX2_n13517BarPieRepa ;
   private byte[] T01LX2_A13521BarPieDfTu ;
   private boolean[] T01LX2_n13521BarPieDfTu ;
   private String[] T01LX2_A13572BarPieDSoC ;
   private boolean[] T01LX2_n13572BarPieDSoC ;
   private java.math.BigDecimal[] T01LX2_A13573BarPieDHor ;
   private boolean[] T01LX2_n13573BarPieDHor ;
   private String[] T01LX2_A396EmprCod ;
   private String[] T01LX24_A396EmprCod ;
   private int[] T01LX24_A129BarCod ;
   private byte[] T01LX24_A132BarCodReo ;
   private String[] T01LX24_A130BarCodPar ;
   private String[] T01LX24_A200BarPieCod ;
   private short[] T01LX24_A12913BarPieLDf ;
   private String[] T01LX25_A407EmprNom ;
   private boolean[] T01LX25_n407EmprNom ;
   private String[] T01LX26_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tbarpdef__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpdef__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpdef__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpdef__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tbarpdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LX2", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf, BarPieDfID, BarPieDfMi, BarPieDfMf, BarPieDfFI, BarPieLong, BarPieDPto, BarPieDfCr, BarPieRepa, BarPieDfTu, BarPieDSoC, BarPieDHor, EmprCod FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarPieLDf = ?  FOR UPDATE OF BarPieDfID, BarPieDfMi, BarPieDfMf, BarPieDfFI, BarPieLong, BarPieDPto, BarPieDfCr, BarPieRepa, BarPieDfTu, BarPieDSoC, BarPieDHor NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX3", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf, BarPieDfID, BarPieDfMi, BarPieDfMf, BarPieDfFI, BarPieLong, BarPieDPto, BarPieDfCr, BarPieRepa, BarPieDfTu, BarPieDSoC, BarPieDHor, EmprCod FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarPieLDf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX4", "SELECT BarPieCod, BarPieUltD, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF BarPieUltD, AlbRecCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX5", "SELECT BarPieCod, BarPieUltD, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX8", "SELECT /*+ FIRST_ROWS(100) */ TM1.BarPieCod, T2.EmprNom, TM1.BarPieUltD, TM1.EmprCod, TM1.AlbRecCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar FROM (TXPBARPIE TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX9", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarPieCod > ?) and EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LX12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarPieCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LX13", "INSERT INTO TXPBARPIE(BarPieCod, BarPieUltD, EmprCod, AlbRecCod, BarCod, BarCodReo, BarCodPar, BarPieKil, BarPieMet, BarPieEst, BarKilLan, BarMetLan, BarPConTro, PieOriCod, BarPieLzd, BarPiePie, BarPieAnc, BarPieLoc, BarKgsAut, BarMtsAut, BarPieAut, BarPieImp, BarPieIdPz, BapieObs, CodBarPz, PzaB80, BarPieK1, BarPieK2, BarPz1, BarPz2, BarNPes, BarPieAncc, BarPiePda, BarPieObs, BarTara, BarUniB, BarPieOrd, BarPieCLd, BarPieFdv, BarPieUsu, BarPieFep, BarPieColD, BarPieColN, BarPieArtI, BarPieArtD, BarPieCliI, BarPieCliN, BarPieCoCI, BarPieCoCN, BarPieEncC, BarPieTono, BarPieSecu, BarPieOpe, BarPieDest, BarPieEmp, BarPieLote, BarPieST, BarPieTurn, BarPieMq, BarPieVtx) VALUES(?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ')", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01LX14", "UPDATE TXPBARPIE SET BarPieUltD=?, AlbRecCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new UpdateCursor("T01LX15", "DELETE FROM TXPBARPIE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPBARPIE")
         ,new ForEachCursor("T01LX16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod FROM TXPBARTRO WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LX17", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LX18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX19", "SELECT BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf, BarPieDfID, BarPieDfMi, BarPieDfMf, BarPieDfFI, BarPieLong, BarPieDPto, BarPieDfCr, BarPieRepa, BarPieDfTu, BarPieDSoC, BarPieDHor, EmprCod FROM TXPBARPDE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarPieLDf = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX20", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarPieLDf = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LX21", "INSERT INTO TXPBARPDE(BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf, BarPieDfID, BarPieDfMi, BarPieDfMf, BarPieDfFI, BarPieLong, BarPieDPto, BarPieDfCr, BarPieRepa, BarPieDfTu, BarPieDSoC, BarPieDHor, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPBARPDE")
         ,new UpdateCursor("T01LX22", "UPDATE TXPBARPDE SET BarPieDfID=?, BarPieDfMi=?, BarPieDfMf=?, BarPieDfFI=?, BarPieLong=?, BarPieDPto=?, BarPieDfCr=?, BarPieRepa=?, BarPieDfTu=?, BarPieDSoC=?, BarPieDHor=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarPieLDf = ?", GX_NOMASK, "TXPBARPDE")
         ,new UpdateCursor("T01LX23", "DELETE FROM TXPBARPDE  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND BarPieLDf = ?", GX_NOMASK, "TXPBARPDE")
         ,new ForEachCursor("T01LX24", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf FROM TXPBARPDE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarPieLDf ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX25", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LX26", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
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
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 9);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 9);
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 9);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 9);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 9);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 8);
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
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(16, (java.math.BigDecimal)parms[26], 2);
               }
               stmt.setString(17, (String)parms[27], 3);
               return;
            case 20 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               stmt.setString(12, (String)parms[22], 3);
               stmt.setInt(13, ((Number) parms[23]).intValue());
               stmt.setByte(14, ((Number) parms[24]).byteValue());
               stmt.setString(15, (String)parms[25], 1);
               stmt.setString(16, (String)parms[26], 9);
               stmt.setShort(17, ((Number) parms[27]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

