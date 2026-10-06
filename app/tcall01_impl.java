package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcall01_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         gxload_7( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A30AlbProCod, A129BarCod, A132BarCodReo, A130BarCodPar, A200BarPieCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Albaran de Produccion, TROZOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbProCod_Internalname ;
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
      nRC_GXsfl_105 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_105"))) ;
      nGXsfl_105_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_105_idx"))) ;
      sGXsfl_105_idx = httpContext.GetPar( "sGXsfl_105_idx") ;
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

   public tcall01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcall01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcall01_impl.class ));
   }

   public tcall01_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TCALL01.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Codigo Pieza", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieCod_Internalname, GXutil.rtrim( A200BarPieCod), GXutil.rtrim( localUtil.format( A200BarPieCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieCod_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieCod_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Metros Entregados", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPMtrEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPMtrEnt_Enabled!=0) ? localUtil.format( A1270AlbPMtrEnt, "ZZZZZ9.99") : localUtil.format( A1270AlbPMtrEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPMtrEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPMtrEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "AlbPMetEnt", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPMetEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A912AlbPMetEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPMetEnt_Enabled!=0) ? localUtil.format( A912AlbPMetEnt, "ZZZZZ9.99") : localUtil.format( A912AlbPMetEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPMetEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPMetEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Metros Lanzados", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMetLan_Internalname, GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMetLan_Enabled!=0) ? localUtil.format( A183BarMetLan, "ZZZZZ9.99") : localUtil.format( A183BarMetLan, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMetLan_Jsonclick, 0, "", "", "", "", "", 1, edtBarMetLan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "AlbPKilEnt", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPKilEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPKilEnt_Enabled!=0) ? localUtil.format( A27AlbPKilEnt, "ZZZZZ9.99") : localUtil.format( A27AlbPKilEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPKilEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPKilEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "AlbPKgmEnt", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPKgmEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A5302AlbPKgmEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPKgmEnt_Enabled!=0) ? localUtil.format( A5302AlbPKgmEnt, "ZZZZZ9.99") : localUtil.format( A5302AlbPKgmEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPKgmEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPKgmEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "BarKilLan", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKilLan_Internalname, GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKilLan_Enabled!=0) ? localUtil.format( A170BarKilLan, "ZZZZZ9.99") : localUtil.format( A170BarKilLan, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKilLan_Jsonclick, 0, "", "", "", "", "", 1, edtBarKilLan_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Trozos Pieza", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPConTro_Internalname, GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPConTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A197BarPConTro), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPConTro_Jsonclick, 0, "", "", "", "", "", 1, edtBarPConTro_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "BarPTotTro", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPTotTro_Internalname, GXutil.ltrim( localUtil.ntoc( A3469BarPTotTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPTotTro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3469BarPTotTro), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3469BarPTotTro), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPTotTro_Jsonclick, 0, "", "", "", "", "", 1, edtBarPTotTro_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPreAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3117AlbPreAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPreAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3117AlbPreAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3117AlbPreAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPreAnc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbPreAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Localizacion Pieza", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPieLoc_Internalname, GXutil.rtrim( A2186BarPieLoc), GXutil.rtrim( localUtil.format( A2186BarPieLoc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPieLoc_Jsonclick, 0, "", "", "", "", "", 1, edtBarPieLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCALL01.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol105( ) ;
      nGXsfl_105_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount198 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_198 = (short)(1) ;
            scanStart1O7198( ) ;
            while ( RcdFound198 != 0 )
            {
               init_level_properties198( ) ;
               getByPrimaryKey1O7198( ) ;
               addRow1O7198( ) ;
               scanNext1O7198( ) ;
            }
            scanEnd1O7198( ) ;
            nBlankRcdCount198 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B3469BarPTotTro = A3469BarPTotTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         B5302AlbPKgmEnt = A5302AlbPKgmEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         B912AlbPMetEnt = A912AlbPMetEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         standaloneNotModal1O7198( ) ;
         standaloneModal1O7198( ) ;
         sMode198 = Gx_mode ;
         while ( nGXsfl_105_idx < nRC_GXsfl_105 )
         {
            bGXsfl_105_Refreshing = true ;
            readRow1O7198( ) ;
            edtavnRcdDeleted_198_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_198_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_198_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_198_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROCOD_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROMET_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroMet_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROKIL_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroKil_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROANC_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroAnc_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbTar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTAR_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTar_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroTrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROTRN_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroTrn_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroFEn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROFEN_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroFEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroFEn_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroCar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROCAR_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCar_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            edtAlbPTroEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROEST_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroEst_Enabled), 5, 0), !bGXsfl_105_Refreshing);
            if ( ( nRcdExists_198 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1O7198( ) ;
            }
            sendRow1O7198( ) ;
            bGXsfl_105_Refreshing = false ;
         }
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A3469BarPTotTro = B3469BarPTotTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         A5302AlbPKgmEnt = B5302AlbPKgmEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A912AlbPMetEnt = B912AlbPMetEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount198 = (short)(5) ;
         nRcdExists_198 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1O7198( ) ;
            while ( RcdFound198 != 0 )
            {
               sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_105198( ) ;
               init_level_properties198( ) ;
               standaloneNotModal1O7198( ) ;
               getByPrimaryKey1O7198( ) ;
               standaloneModal1O7198( ) ;
               addRow1O7198( ) ;
               scanNext1O7198( ) ;
            }
            scanEnd1O7198( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode198 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_105198( ) ;
      initAll1O7198( ) ;
      init_level_properties198( ) ;
      B3469BarPTotTro = A3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      B5302AlbPKgmEnt = A5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      B912AlbPMetEnt = A912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      nRcdExists_198 = (short)(0) ;
      nIsMod_198 = (short)(0) ;
      nRcdDeleted_198 = (short)(0) ;
      nBlankRcdCount198 = (short)(nBlankRcdUsr198+nBlankRcdCount198) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount198 > 0 )
      {
         standaloneNotModal1O7198( ) ;
         standaloneModal1O7198( ) ;
         addRow1O7198( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbPTroCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount198 = (short)(nBlankRcdCount198-1) ;
      }
      Gx_mode = sMode198 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A3469BarPTotTro = B3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      A5302AlbPKgmEnt = B5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      A912AlbPMetEnt = B912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCALL01.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TCALL01.htm");
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
      e111O72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
            Z200BarPieCod = httpContext.cgiGet( "Z200BarPieCod") ;
            Z1270AlbPMtrEnt = localUtil.ctond( httpContext.cgiGet( "Z1270AlbPMtrEnt")) ;
            Z27AlbPKilEnt = localUtil.ctond( httpContext.cgiGet( "Z27AlbPKilEnt")) ;
            Z3117AlbPreAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3117AlbPreAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O3469BarPTotTro = (short)(localUtil.ctol( httpContext.cgiGet( "O3469BarPTotTro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5302AlbPKgmEnt = localUtil.ctond( httpContext.cgiGet( "O5302AlbPKgmEnt")) ;
            O912AlbPMetEnt = localUtil.ctond( httpContext.cgiGet( "O912AlbPMetEnt")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_105 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_105"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A30AlbProCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
            else
            {
               A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            }
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
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPMtrEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPMtrEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPMTRENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPMtrEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1270AlbPMtrEnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A1270AlbPMtrEnt", GXutil.ltrimstr( A1270AlbPMtrEnt, 9, 2));
            }
            else
            {
               A1270AlbPMtrEnt = localUtil.ctond( httpContext.cgiGet( edtAlbPMtrEnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1270AlbPMtrEnt", GXutil.ltrimstr( A1270AlbPMtrEnt, 9, 2));
            }
            A912AlbPMetEnt = localUtil.ctond( httpContext.cgiGet( edtAlbPMetEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
            A183BarMetLan = localUtil.ctond( httpContext.cgiGet( edtBarMetLan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPKilEnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPKilEnt_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPKILENT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPKilEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A27AlbPKilEnt = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A27AlbPKilEnt", GXutil.ltrimstr( A27AlbPKilEnt, 9, 2));
            }
            else
            {
               A27AlbPKilEnt = localUtil.ctond( httpContext.cgiGet( edtAlbPKilEnt_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A27AlbPKilEnt", GXutil.ltrimstr( A27AlbPKilEnt, 9, 2));
            }
            A5302AlbPKgmEnt = localUtil.ctond( httpContext.cgiGet( edtAlbPKgmEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            A170BarKilLan = localUtil.ctond( httpContext.cgiGet( edtBarKilLan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
            A197BarPConTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPConTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
            A3469BarPTotTro = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPTotTro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPREANC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbPreAnc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A3117AlbPreAnc = (short)(0) ;
               n3117AlbPreAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3117AlbPreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3117AlbPreAnc), 4, 0));
            }
            else
            {
               A3117AlbPreAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n3117AlbPreAnc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3117AlbPreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3117AlbPreAnc), 4, 0));
            }
            A2186BarPieLoc = httpContext.cgiGet( edtBarPieLoc_Internalname) ;
            n2186BarPieLoc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                        e111O72 ();
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
            initAll1O7197( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_198_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_198_Enabled), 5, 0), !bGXsfl_105_Refreshing);
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
      disableAttributes1O7197( ) ;
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

   public void confirm_1O70( )
   {
      beforeValidate1O7197( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1O7197( ) ;
         }
         else
         {
            checkExtendedTable1O7197( ) ;
            if ( AnyError == 0 )
            {
               zm1O7197( 5) ;
               zm1O7197( 6) ;
               zm1O7197( 7) ;
               zm1O7197( 8) ;
            }
            closeExtendedTableCursors1O7197( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode197 = Gx_mode ;
         confirm_1O7198( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode197 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1O70( ) ;
      }
   }

   public void confirm_1O7198( )
   {
      s3469BarPTotTro = O3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      s5302AlbPKgmEnt = O5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      s912AlbPMetEnt = O912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      nGXsfl_105_idx = 0 ;
      while ( nGXsfl_105_idx < nRC_GXsfl_105 )
      {
         readRow1O7198( ) ;
         if ( ( nRcdExists_198 != 0 ) || ( nIsMod_198 != 0 ) )
         {
            getKey1O7198( ) ;
            if ( ( nRcdExists_198 == 0 ) && ( nRcdDeleted_198 == 0 ) )
            {
               if ( RcdFound198 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1O7198( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1O7198( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursors1O7198( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O3469BarPTotTro = A3469BarPTotTro ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
                     O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
                     O912AlbPMetEnt = A912AlbPMetEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
                  }
               }
               else
               {
                  GXCCtl = "ALBPTROCOD_" + sGXsfl_105_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbPTroCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound198 != 0 )
               {
                  if ( nRcdDeleted_198 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1O7198( ) ;
                     load1O7198( ) ;
                     beforeValidate1O7198( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1O7198( ) ;
                        O3469BarPTotTro = A3469BarPTotTro ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
                        O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
                        O912AlbPMetEnt = A912AlbPMetEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
                     }
                  }
                  else
                  {
                     if ( nIsMod_198 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1O7198( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1O7198( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursors1O7198( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O3469BarPTotTro = A3469BarPTotTro ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
                           O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
                           O912AlbPMetEnt = A912AlbPMetEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_198 == 0 )
                  {
                     GXCCtl = "ALBPTROCOD_" + sGXsfl_105_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPTroCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_198_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbTar_Internalname, GXutil.rtrim( A3733AlbTar)) ;
         httpContext.changePostValue( edtAlbPTroTrn_Internalname, GXutil.ltrim( localUtil.ntoc( A3969AlbPTroTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroFEn_Internalname, localUtil.format(A3970AlbPTroFEn, "99/99/99")) ;
         httpContext.changePostValue( edtAlbPTroCar_Internalname, GXutil.ltrim( localUtil.ntoc( A12841AlbPTroCar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroEst_Internalname, GXutil.ltrim( localUtil.ntoc( A12842AlbPTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3733AlbTar_"+sGXsfl_105_idx, GXutil.rtrim( Z3733AlbTar)) ;
         httpContext.changePostValue( "ZT_"+"Z3969AlbPTroTrn_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z3969AlbPTroTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3970AlbPTroFEn_"+sGXsfl_105_idx, localUtil.dtoc( Z3970AlbPTroFEn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12841AlbPTroCar_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z12841AlbPTroCar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12842AlbPTroEst_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z12842AlbPTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5303AlbPTroKil_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( O5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T43AlbPTroMet_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( O43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_198_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_198_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_198_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_198 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_198_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_198_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROCOD_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROMET_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROKIL_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROANC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTAR_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROTRN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroTrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROFEN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroFEn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROCAR_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROEST_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O3469BarPTotTro = s3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      O5302AlbPKgmEnt = s5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      O912AlbPMetEnt = s912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1O70( )
   {
   }

   public void e111O72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tcall01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      tcall01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tcall01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcall01_impl.this.A396EmprCod = GXv_char2[0] ;
      tcall01_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcall01_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1O7197( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1270AlbPMtrEnt = T01O75_A1270AlbPMtrEnt[0] ;
            Z27AlbPKilEnt = T01O75_A27AlbPKilEnt[0] ;
            Z3117AlbPreAnc = T01O75_A3117AlbPreAnc[0] ;
         }
         else
         {
            Z1270AlbPMtrEnt = A1270AlbPMtrEnt ;
            Z27AlbPKilEnt = A27AlbPKilEnt ;
            Z3117AlbPreAnc = A3117AlbPreAnc ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z1270AlbPMtrEnt = A1270AlbPMtrEnt ;
         Z27AlbPKilEnt = A27AlbPKilEnt ;
         Z3117AlbPreAnc = A3117AlbPreAnc ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z407EmprNom = A407EmprNom ;
         Z183BarMetLan = A183BarMetLan ;
         Z170BarKilLan = A170BarKilLan ;
         Z197BarPConTro = A197BarPConTro ;
         Z2186BarPieLoc = A2186BarPieLoc ;
         Z912AlbPMetEnt = A912AlbPMetEnt ;
         Z5302AlbPKgmEnt = A5302AlbPKgmEnt ;
         Z3469BarPTotTro = A3469BarPTotTro ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TCALL01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01O76 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O76_A407EmprNom[0] ;
      n407EmprNom = T01O76_n407EmprNom[0] ;
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

   public void load1O7197( )
   {
      /* Using cursor T01O712 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound197 = (short)(1) ;
         A407EmprNom = T01O712_A407EmprNom[0] ;
         n407EmprNom = T01O712_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1270AlbPMtrEnt = T01O712_A1270AlbPMtrEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1270AlbPMtrEnt", GXutil.ltrimstr( A1270AlbPMtrEnt, 9, 2));
         A183BarMetLan = T01O712_A183BarMetLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         A27AlbPKilEnt = T01O712_A27AlbPKilEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27AlbPKilEnt", GXutil.ltrimstr( A27AlbPKilEnt, 9, 2));
         A170BarKilLan = T01O712_A170BarKilLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         A197BarPConTro = T01O712_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A3117AlbPreAnc = T01O712_A3117AlbPreAnc[0] ;
         n3117AlbPreAnc = T01O712_n3117AlbPreAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3117AlbPreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3117AlbPreAnc), 4, 0));
         A2186BarPieLoc = T01O712_A2186BarPieLoc[0] ;
         n2186BarPieLoc = T01O712_n2186BarPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         A912AlbPMetEnt = T01O712_A912AlbPMetEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         A5302AlbPKgmEnt = T01O712_A5302AlbPKgmEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A3469BarPTotTro = T01O712_A3469BarPTotTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         zm1O7197( -4) ;
      }
      pr_default.close(8);
      onLoadActions1O7197( ) ;
   }

   public void onLoadActions1O7197( )
   {
      O3469BarPTotTro = A3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      O912AlbPMetEnt = A912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
   }

   public void checkExtendedTable1O7197( )
   {
      nIsDirty_197 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01O78 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T01O77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A183BarMetLan = T01O77_A183BarMetLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A170BarKilLan = T01O77_A170BarKilLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A197BarPConTro = T01O77_A197BarPConTro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A2186BarPieLoc = T01O77_A2186BarPieLoc[0] ;
      n2186BarPieLoc = T01O77_n2186BarPieLoc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
      pr_default.close(5);
      /* Using cursor T01O710 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A912AlbPMetEnt = T01O710_A912AlbPMetEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         A5302AlbPKgmEnt = T01O710_A5302AlbPKgmEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A3469BarPTotTro = T01O710_A3469BarPTotTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      else
      {
         nIsDirty_197 = (short)(1) ;
         A912AlbPMetEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         nIsDirty_197 = (short)(1) ;
         A5302AlbPKgmEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         nIsDirty_197 = (short)(1) ;
         A3469BarPTotTro = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      pr_default.close(7);
   }

   public void closeExtendedTableCursors1O7197( )
   {
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         long A30AlbProCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01O713 */
      pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_6( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A200BarPieCod )
   {
      /* Using cursor T01O714 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A183BarMetLan = T01O714_A183BarMetLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A170BarKilLan = T01O714_A170BarKilLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A197BarPConTro = T01O714_A197BarPConTro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A2186BarPieLoc = T01O714_A2186BarPieLoc[0] ;
      n2186BarPieLoc = T01O714_n2186BarPieLoc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2186BarPieLoc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_8( String A396EmprCod ,
                         long A30AlbProCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         String A200BarPieCod )
   {
      /* Using cursor T01O716 */
      pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A912AlbPMetEnt = T01O716_A912AlbPMetEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         A5302AlbPKgmEnt = T01O716_A5302AlbPKgmEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A3469BarPTotTro = T01O716_A3469BarPTotTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      else
      {
         A912AlbPMetEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         A5302AlbPKgmEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A3469BarPTotTro = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A912AlbPMetEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5302AlbPKgmEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3469BarPTotTro, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey1O7197( )
   {
      /* Using cursor T01O717 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound197 = (short)(1) ;
      }
      else
      {
         RcdFound197 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01O75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01O75_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O7197( 4) ;
         RcdFound197 = (short)(1) ;
         A1270AlbPMtrEnt = T01O75_A1270AlbPMtrEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1270AlbPMtrEnt", GXutil.ltrimstr( A1270AlbPMtrEnt, 9, 2));
         A27AlbPKilEnt = T01O75_A27AlbPKilEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A27AlbPKilEnt", GXutil.ltrimstr( A27AlbPKilEnt, 9, 2));
         A3117AlbPreAnc = T01O75_A3117AlbPreAnc[0] ;
         n3117AlbPreAnc = T01O75_n3117AlbPreAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3117AlbPreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3117AlbPreAnc), 4, 0));
         A129BarCod = T01O75_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01O75_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01O75_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01O75_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
         A30AlbProCod = T01O75_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         sMode197 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1O7197( ) ;
         if ( AnyError == 1 )
         {
            RcdFound197 = (short)(0) ;
            initializeNonKey1O7197( ) ;
         }
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound197 = (short)(0) ;
         initializeNonKey1O7197( ) ;
         sMode197 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode197 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1O7197( ) ;
      if ( RcdFound197 == 0 )
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
      RcdFound197 = (short)(0) ;
      /* Using cursor T01O718 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A200BarPieCod, A200BarPieCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T01O718_A129BarCod[0] < A129BarCod ) || ( T01O718_A129BarCod[0] == A129BarCod ) && ( T01O718_A132BarCodReo[0] < A132BarCodReo ) || ( T01O718_A132BarCodReo[0] == A132BarCodReo ) && ( T01O718_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O718_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01O718_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O718_A132BarCodReo[0] == A132BarCodReo ) && ( T01O718_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O718_A200BarPieCod[0], A200BarPieCod) < 0 ) || ( GXutil.strcmp(T01O718_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( GXutil.strcmp(T01O718_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O718_A132BarCodReo[0] == A132BarCodReo ) && ( T01O718_A129BarCod[0] == A129BarCod ) && ( T01O718_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01O718_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T01O718_A129BarCod[0] > A129BarCod ) || ( T01O718_A129BarCod[0] == A129BarCod ) && ( T01O718_A132BarCodReo[0] > A132BarCodReo ) || ( T01O718_A132BarCodReo[0] == A132BarCodReo ) && ( T01O718_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O718_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01O718_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O718_A132BarCodReo[0] == A132BarCodReo ) && ( T01O718_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O718_A200BarPieCod[0], A200BarPieCod) > 0 ) || ( GXutil.strcmp(T01O718_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( GXutil.strcmp(T01O718_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O718_A132BarCodReo[0] == A132BarCodReo ) && ( T01O718_A129BarCod[0] == A129BarCod ) && ( T01O718_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01O718_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01O718_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01O718_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01O718_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01O718_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A30AlbProCod = T01O718_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound197 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound197 = (short)(0) ;
      /* Using cursor T01O719 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A200BarPieCod, A200BarPieCod, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), Long.valueOf(A30AlbProCod), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T01O719_A129BarCod[0] > A129BarCod ) || ( T01O719_A129BarCod[0] == A129BarCod ) && ( T01O719_A132BarCodReo[0] > A132BarCodReo ) || ( T01O719_A132BarCodReo[0] == A132BarCodReo ) && ( T01O719_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O719_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01O719_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O719_A132BarCodReo[0] == A132BarCodReo ) && ( T01O719_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O719_A200BarPieCod[0], A200BarPieCod) > 0 ) || ( GXutil.strcmp(T01O719_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( GXutil.strcmp(T01O719_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O719_A132BarCodReo[0] == A132BarCodReo ) && ( T01O719_A129BarCod[0] == A129BarCod ) && ( T01O719_A30AlbProCod[0] > A30AlbProCod ) ) && ( GXutil.strcmp(T01O719_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T01O719_A129BarCod[0] < A129BarCod ) || ( T01O719_A129BarCod[0] == A129BarCod ) && ( T01O719_A132BarCodReo[0] < A132BarCodReo ) || ( T01O719_A132BarCodReo[0] == A132BarCodReo ) && ( T01O719_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O719_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01O719_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O719_A132BarCodReo[0] == A132BarCodReo ) && ( T01O719_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01O719_A200BarPieCod[0], A200BarPieCod) < 0 ) || ( GXutil.strcmp(T01O719_A200BarPieCod[0], A200BarPieCod) == 0 ) && ( GXutil.strcmp(T01O719_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01O719_A132BarCodReo[0] == A132BarCodReo ) && ( T01O719_A129BarCod[0] == A129BarCod ) && ( T01O719_A30AlbProCod[0] < A30AlbProCod ) ) && ( GXutil.strcmp(T01O719_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A129BarCod = T01O719_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01O719_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01O719_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A200BarPieCod = T01O719_A200BarPieCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
            A30AlbProCod = T01O719_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound197 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1O7197( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A3469BarPTotTro = O3469BarPTotTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A912AlbPMetEnt = O912AlbPMetEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1O7197( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound197 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
               A3469BarPTotTro = O3469BarPTotTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
               A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
               A912AlbPMetEnt = O912AlbPMetEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A3469BarPTotTro = O3469BarPTotTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
               A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
               A912AlbPMetEnt = O912AlbPMetEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
               update1O7197( ) ;
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A3469BarPTotTro = O3469BarPTotTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
               A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
               A912AlbPMetEnt = O912AlbPMetEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
               GX_FocusControl = edtAlbProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1O7197( ) ;
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
                  A3469BarPTotTro = O3469BarPTotTro ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
                  A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
                  A912AlbPMetEnt = O912AlbPMetEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
                  GX_FocusControl = edtAlbProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1O7197( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
      {
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         A3469BarPTotTro = O3469BarPTotTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A912AlbPMetEnt = O912AlbPMetEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
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
      getKey1O7197( ) ;
      if ( RcdFound197 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
         {
            A30AlbProCod = Z30AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( GXutil.strcmp(A200BarPieCod, Z200BarPieCod) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "tcall01");
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1O70( ) ;
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
      if ( RcdFound197 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1O7197( ) ;
      if ( RcdFound197 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1O7197( ) ;
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
      if ( RcdFound197 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
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
      if ( RcdFound197 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
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
      scanStart1O7197( ) ;
      if ( RcdFound197 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound197 != 0 )
         {
            scanNext1O7197( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1O7197( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1O7197( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z1270AlbPMtrEnt, T01O74_A1270AlbPMtrEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z27AlbPKilEnt, T01O74_A27AlbPKilEnt[0]) != 0 ) || ( Z3117AlbPreAnc != T01O74_A3117AlbPreAnc[0] ) )
         {
            if ( DecimalUtil.compareTo(Z1270AlbPMtrEnt, T01O74_A1270AlbPMtrEnt[0]) != 0 )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPMtrEnt");
               GXutil.writeLogRaw("Old: ",Z1270AlbPMtrEnt);
               GXutil.writeLogRaw("Current: ",T01O74_A1270AlbPMtrEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z27AlbPKilEnt, T01O74_A27AlbPKilEnt[0]) != 0 )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPKilEnt");
               GXutil.writeLogRaw("Old: ",Z27AlbPKilEnt);
               GXutil.writeLogRaw("Current: ",T01O74_A27AlbPKilEnt[0]);
            }
            if ( Z3117AlbPreAnc != T01O74_A3117AlbPreAnc[0] )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPreAnc");
               GXutil.writeLogRaw("Old: ",Z3117AlbPreAnc);
               GXutil.writeLogRaw("Current: ",T01O74_A3117AlbPreAnc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O7197( )
   {
      beforeValidate1O7197( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O7197( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O7197( 0) ;
         checkOptimisticConcurrency1O7197( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O7197( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O7197( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O720 */
                  pr_default.execute(15, new Object[] {A1270AlbPMtrEnt, A27AlbPKilEnt, Boolean.valueOf(n3117AlbPreAnc), Short.valueOf(A3117AlbPreAnc), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
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
                        processLevel1O7197( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1O70( ) ;
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
            load1O7197( ) ;
         }
         endLevel1O7197( ) ;
      }
      closeExtendedTableCursors1O7197( ) ;
   }

   public void update1O7197( )
   {
      beforeValidate1O7197( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O7197( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O7197( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O7197( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1O7197( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O721 */
                  pr_default.execute(16, new Object[] {A1270AlbPMtrEnt, A27AlbPKilEnt, Boolean.valueOf(n3117AlbPreAnc), Short.valueOf(A3117AlbPreAnc), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
                  if ( (pr_default.getStatus(16) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1O7197( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O7197( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1O70( ) ;
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
         endLevel1O7197( ) ;
      }
      closeExtendedTableCursors1O7197( ) ;
   }

   public void deferredUpdate1O7197( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O7197( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O7197( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O7197( ) ;
         afterConfirm1O7197( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O7197( ) ;
            if ( AnyError == 0 )
            {
               A3469BarPTotTro = O3469BarPTotTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
               A5302AlbPKgmEnt = O5302AlbPKgmEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
               A912AlbPMetEnt = O912AlbPMetEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
               scanStart1O7198( ) ;
               while ( RcdFound198 != 0 )
               {
                  getByPrimaryKey1O7198( ) ;
                  delete1O7198( ) ;
                  scanNext1O7198( ) ;
                  O3469BarPTotTro = A3469BarPTotTro ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
                  O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
                  O912AlbPMetEnt = A912AlbPMetEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
               }
               scanEnd1O7198( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O722 */
                  pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALPRD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound197 == 0 )
                        {
                           initAll1O7197( ) ;
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
                        resetCaption1O70( ) ;
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
      sMode197 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O7197( ) ;
      Gx_mode = sMode197 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O7197( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01O723 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         A183BarMetLan = T01O723_A183BarMetLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
         A170BarKilLan = T01O723_A170BarKilLan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
         A197BarPConTro = T01O723_A197BarPConTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
         A2186BarPieLoc = T01O723_A2186BarPieLoc[0] ;
         n2186BarPieLoc = T01O723_n2186BarPieLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
         pr_default.close(18);
         /* Using cursor T01O725 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            A912AlbPMetEnt = T01O725_A912AlbPMetEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
            A5302AlbPKgmEnt = T01O725_A5302AlbPKgmEnt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            A3469BarPTotTro = T01O725_A3469BarPTotTro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         }
         else
         {
            A912AlbPMetEnt = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
            A5302AlbPKgmEnt = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            A3469BarPTotTro = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         }
         pr_default.close(19);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01O726 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void processNestedLevel1O7198( )
   {
      s3469BarPTotTro = O3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      s5302AlbPKgmEnt = O5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      s912AlbPMetEnt = O912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      nGXsfl_105_idx = 0 ;
      while ( nGXsfl_105_idx < nRC_GXsfl_105 )
      {
         readRow1O7198( ) ;
         if ( ( nRcdExists_198 != 0 ) || ( nIsMod_198 != 0 ) )
         {
            standaloneNotModal1O7198( ) ;
            getKey1O7198( ) ;
            if ( ( nRcdExists_198 == 0 ) && ( nRcdDeleted_198 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1O7198( ) ;
            }
            else
            {
               if ( RcdFound198 != 0 )
               {
                  if ( ( nRcdDeleted_198 != 0 ) && ( nRcdExists_198 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1O7198( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_198 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1O7198( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_198 == 0 )
                  {
                     GXCCtl = "ALBPTROCOD_" + sGXsfl_105_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPTroCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O3469BarPTotTro = A3469BarPTotTro ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
            O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            O912AlbPMetEnt = A912AlbPMetEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         }
         httpContext.changePostValue( edtavnRcdDeleted_198_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroCod_Internalname, GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroMet_Internalname, GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroKil_Internalname, GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbTar_Internalname, GXutil.rtrim( A3733AlbTar)) ;
         httpContext.changePostValue( edtAlbPTroTrn_Internalname, GXutil.ltrim( localUtil.ntoc( A3969AlbPTroTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroFEn_Internalname, localUtil.format(A3970AlbPTroFEn, "99/99/99")) ;
         httpContext.changePostValue( edtAlbPTroCar_Internalname, GXutil.ltrim( localUtil.ntoc( A12841AlbPTroCar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPTroEst_Internalname, GXutil.ltrim( localUtil.ntoc( A12842AlbPTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3733AlbTar_"+sGXsfl_105_idx, GXutil.rtrim( Z3733AlbTar)) ;
         httpContext.changePostValue( "ZT_"+"Z3969AlbPTroTrn_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z3969AlbPTroTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z3970AlbPTroFEn_"+sGXsfl_105_idx, localUtil.dtoc( Z3970AlbPTroFEn, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z12841AlbPTroCar_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z12841AlbPTroCar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12842AlbPTroEst_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( Z12842AlbPTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T5303AlbPTroKil_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( O5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T43AlbPTroMet_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( O43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_198_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_198_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_198_"+sGXsfl_105_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_198 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_198_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_198_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROCOD_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROMET_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROKIL_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROANC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBTAR_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROTRN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroTrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROFEN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroFEn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROCAR_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPTROEST_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1O7198( ) ;
      if ( AnyError != 0 )
      {
         O3469BarPTotTro = s3469BarPTotTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         O5302AlbPKgmEnt = s5302AlbPKgmEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         O912AlbPMetEnt = s912AlbPMetEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      }
      nRcdExists_198 = (short)(0) ;
      nIsMod_198 = (short)(0) ;
      nRcdDeleted_198 = (short)(0) ;
   }

   public void processLevel1O7197( )
   {
      /* Save parent mode. */
      sMode197 = Gx_mode ;
      processNestedLevel1O7198( ) ;
      if ( AnyError != 0 )
      {
         O3469BarPTotTro = s3469BarPTotTro ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         O5302AlbPKgmEnt = s5302AlbPKgmEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         O912AlbPMetEnt = s912AlbPMetEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      }
      /* Restore parent mode. */
      Gx_mode = sMode197 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1O7197( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1O7197( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcall01");
         if ( AnyError == 0 )
         {
            confirmValues1O70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcall01");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1O7197( )
   {
      /* Scan By routine */
      /* Using cursor T01O727 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      RcdFound197 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound197 = (short)(1) ;
         A30AlbProCod = T01O727_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01O727_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01O727_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01O727_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01O727_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O7197( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound197 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound197 = (short)(1) ;
         A30AlbProCod = T01O727_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01O727_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01O727_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01O727_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A200BarPieCod = T01O727_A200BarPieCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      }
   }

   public void scanEnd1O7197( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1O7197( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O7197( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O7197( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O7197( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O7197( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O7197( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O7197( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarPieCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbPMtrEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPMtrEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPMtrEnt_Enabled), 5, 0), true);
      edtAlbPMetEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPMetEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPMetEnt_Enabled), 5, 0), true);
      edtBarMetLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMetLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMetLan_Enabled), 5, 0), true);
      edtAlbPKilEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPKilEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPKilEnt_Enabled), 5, 0), true);
      edtAlbPKgmEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPKgmEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPKgmEnt_Enabled), 5, 0), true);
      edtBarKilLan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKilLan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKilLan_Enabled), 5, 0), true);
      edtBarPConTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPConTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPConTro_Enabled), 5, 0), true);
      edtBarPTotTro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPTotTro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPTotTro_Enabled), 5, 0), true);
      edtAlbPreAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPreAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPreAnc_Enabled), 5, 0), true);
      edtBarPieLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieLoc_Enabled), 5, 0), true);
   }

   public void zm1O7198( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z43AlbPTroMet = T01O73_A43AlbPTroMet[0] ;
            Z5303AlbPTroKil = T01O73_A5303AlbPTroKil[0] ;
            Z3118AlbPTroAnc = T01O73_A3118AlbPTroAnc[0] ;
            Z3733AlbTar = T01O73_A3733AlbTar[0] ;
            Z3969AlbPTroTrn = T01O73_A3969AlbPTroTrn[0] ;
            Z3970AlbPTroFEn = T01O73_A3970AlbPTroFEn[0] ;
            Z12841AlbPTroCar = T01O73_A12841AlbPTroCar[0] ;
            Z12842AlbPTroEst = T01O73_A12842AlbPTroEst[0] ;
         }
         else
         {
            Z43AlbPTroMet = A43AlbPTroMet ;
            Z5303AlbPTroKil = A5303AlbPTroKil ;
            Z3118AlbPTroAnc = A3118AlbPTroAnc ;
            Z3733AlbTar = A3733AlbTar ;
            Z3969AlbPTroTrn = A3969AlbPTroTrn ;
            Z3970AlbPTroFEn = A3970AlbPTroFEn ;
            Z12841AlbPTroCar = A12841AlbPTroCar ;
            Z12842AlbPTroEst = A12842AlbPTroEst ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z42AlbPTroCod = A42AlbPTroCod ;
         Z43AlbPTroMet = A43AlbPTroMet ;
         Z5303AlbPTroKil = A5303AlbPTroKil ;
         Z3118AlbPTroAnc = A3118AlbPTroAnc ;
         Z3733AlbTar = A3733AlbTar ;
         Z3969AlbPTroTrn = A3969AlbPTroTrn ;
         Z3970AlbPTroFEn = A3970AlbPTroFEn ;
         Z12841AlbPTroCar = A12841AlbPTroCar ;
         Z12842AlbPTroEst = A12842AlbPTroEst ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
      }
   }

   public void standaloneNotModal1O7198( )
   {
   }

   public void standaloneModal1O7198( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPTroCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      }
      else
      {
         edtAlbPTroCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      }
   }

   public void load1O7198( )
   {
      /* Using cursor T01O728 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound198 = (short)(1) ;
         A43AlbPTroMet = T01O728_A43AlbPTroMet[0] ;
         A5303AlbPTroKil = T01O728_A5303AlbPTroKil[0] ;
         A3118AlbPTroAnc = T01O728_A3118AlbPTroAnc[0] ;
         A3733AlbTar = T01O728_A3733AlbTar[0] ;
         n3733AlbTar = T01O728_n3733AlbTar[0] ;
         A3969AlbPTroTrn = T01O728_A3969AlbPTroTrn[0] ;
         A3970AlbPTroFEn = T01O728_A3970AlbPTroFEn[0] ;
         A12841AlbPTroCar = T01O728_A12841AlbPTroCar[0] ;
         n12841AlbPTroCar = T01O728_n12841AlbPTroCar[0] ;
         A12842AlbPTroEst = T01O728_A12842AlbPTroEst[0] ;
         n12842AlbPTroEst = T01O728_n12842AlbPTroEst[0] ;
         zm1O7198( -9) ;
      }
      pr_default.close(22);
      onLoadActions1O7198( ) ;
   }

   public void onLoadActions1O7198( )
   {
      if ( isIns( )  )
      {
         A912AlbPMetEnt = O912AlbPMetEnt.add(A43AlbPTroMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A912AlbPMetEnt = O912AlbPMetEnt.add(A43AlbPTroMet).subtract(O43AlbPTroMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A912AlbPMetEnt = O912AlbPMetEnt.subtract(O43AlbPTroMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A5302AlbPKgmEnt = O5302AlbPKgmEnt.add(A5303AlbPTroKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5302AlbPKgmEnt = O5302AlbPKgmEnt.add(A5303AlbPTroKil).subtract(O5303AlbPTroKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5302AlbPKgmEnt = O5302AlbPKgmEnt.subtract(O5303AlbPTroKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         A3469BarPTotTro = (short)(O3469BarPTotTro+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3469BarPTotTro = O3469BarPTotTro ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3469BarPTotTro = (short)(O3469BarPTotTro-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
            }
         }
      }
   }

   public void checkExtendedTable1O7198( )
   {
      nIsDirty_198 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1O7198( ) ;
      if ( isIns( )  )
      {
         nIsDirty_198 = (short)(1) ;
         A912AlbPMetEnt = O912AlbPMetEnt.add(A43AlbPTroMet) ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_198 = (short)(1) ;
            A912AlbPMetEnt = O912AlbPMetEnt.add(A43AlbPTroMet).subtract(O43AlbPTroMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_198 = (short)(1) ;
               A912AlbPMetEnt = O912AlbPMetEnt.subtract(O43AlbPTroMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_198 = (short)(1) ;
         A5302AlbPKgmEnt = O5302AlbPKgmEnt.add(A5303AlbPTroKil) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_198 = (short)(1) ;
            A5302AlbPKgmEnt = O5302AlbPKgmEnt.add(A5303AlbPTroKil).subtract(O5303AlbPTroKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_198 = (short)(1) ;
               A5302AlbPKgmEnt = O5302AlbPKgmEnt.subtract(O5303AlbPTroKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_198 = (short)(1) ;
         A3469BarPTotTro = (short)(O3469BarPTotTro+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_198 = (short)(1) ;
            A3469BarPTotTro = O3469BarPTotTro ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_198 = (short)(1) ;
               A3469BarPTotTro = (short)(O3469BarPTotTro-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
            }
         }
      }
   }

   public void closeExtendedTableCursors1O7198( )
   {
   }

   public void enableDisable1O7198( )
   {
   }

   public void getKey1O7198( )
   {
      /* Using cursor T01O729 */
      pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound198 = (short)(1) ;
      }
      else
      {
         RcdFound198 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey1O7198( )
   {
      /* Using cursor T01O73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01O73_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O7198( 9) ;
         RcdFound198 = (short)(1) ;
         initializeNonKey1O7198( ) ;
         A42AlbPTroCod = T01O73_A42AlbPTroCod[0] ;
         A43AlbPTroMet = T01O73_A43AlbPTroMet[0] ;
         A5303AlbPTroKil = T01O73_A5303AlbPTroKil[0] ;
         A3118AlbPTroAnc = T01O73_A3118AlbPTroAnc[0] ;
         A3733AlbTar = T01O73_A3733AlbTar[0] ;
         n3733AlbTar = T01O73_n3733AlbTar[0] ;
         A3969AlbPTroTrn = T01O73_A3969AlbPTroTrn[0] ;
         A3970AlbPTroFEn = T01O73_A3970AlbPTroFEn[0] ;
         A12841AlbPTroCar = T01O73_A12841AlbPTroCar[0] ;
         n12841AlbPTroCar = T01O73_n12841AlbPTroCar[0] ;
         A12842AlbPTroEst = T01O73_A12842AlbPTroEst[0] ;
         n12842AlbPTroEst = T01O73_n12842AlbPTroEst[0] ;
         O5303AlbPTroKil = A5303AlbPTroKil ;
         O43AlbPTroMet = A43AlbPTroMet ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z200BarPieCod = A200BarPieCod ;
         Z42AlbPTroCod = A42AlbPTroCod ;
         sMode198 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O7198( ) ;
         load1O7198( ) ;
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound198 = (short)(0) ;
         initializeNonKey1O7198( ) ;
         sMode198 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O7198( ) ;
         Gx_mode = sMode198 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1O7198( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1O7198( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALTRZ"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z43AlbPTroMet, T01O72_A43AlbPTroMet[0]) != 0 ) || ( DecimalUtil.compareTo(Z5303AlbPTroKil, T01O72_A5303AlbPTroKil[0]) != 0 ) || ( Z3118AlbPTroAnc != T01O72_A3118AlbPTroAnc[0] ) || ( GXutil.strcmp(Z3733AlbTar, T01O72_A3733AlbTar[0]) != 0 ) || ( Z3969AlbPTroTrn != T01O72_A3969AlbPTroTrn[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z3970AlbPTroFEn), GXutil.resetTime(T01O72_A3970AlbPTroFEn[0])) ) || ( Z12841AlbPTroCar != T01O72_A12841AlbPTroCar[0] ) || ( Z12842AlbPTroEst != T01O72_A12842AlbPTroEst[0] ) )
         {
            if ( DecimalUtil.compareTo(Z43AlbPTroMet, T01O72_A43AlbPTroMet[0]) != 0 )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroMet");
               GXutil.writeLogRaw("Old: ",Z43AlbPTroMet);
               GXutil.writeLogRaw("Current: ",T01O72_A43AlbPTroMet[0]);
            }
            if ( DecimalUtil.compareTo(Z5303AlbPTroKil, T01O72_A5303AlbPTroKil[0]) != 0 )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroKil");
               GXutil.writeLogRaw("Old: ",Z5303AlbPTroKil);
               GXutil.writeLogRaw("Current: ",T01O72_A5303AlbPTroKil[0]);
            }
            if ( Z3118AlbPTroAnc != T01O72_A3118AlbPTroAnc[0] )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroAnc");
               GXutil.writeLogRaw("Old: ",Z3118AlbPTroAnc);
               GXutil.writeLogRaw("Current: ",T01O72_A3118AlbPTroAnc[0]);
            }
            if ( GXutil.strcmp(Z3733AlbTar, T01O72_A3733AlbTar[0]) != 0 )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbTar");
               GXutil.writeLogRaw("Old: ",Z3733AlbTar);
               GXutil.writeLogRaw("Current: ",T01O72_A3733AlbTar[0]);
            }
            if ( Z3969AlbPTroTrn != T01O72_A3969AlbPTroTrn[0] )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroTrn");
               GXutil.writeLogRaw("Old: ",Z3969AlbPTroTrn);
               GXutil.writeLogRaw("Current: ",T01O72_A3969AlbPTroTrn[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3970AlbPTroFEn), GXutil.resetTime(T01O72_A3970AlbPTroFEn[0])) ) )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroFEn");
               GXutil.writeLogRaw("Old: ",Z3970AlbPTroFEn);
               GXutil.writeLogRaw("Current: ",T01O72_A3970AlbPTroFEn[0]);
            }
            if ( Z12841AlbPTroCar != T01O72_A12841AlbPTroCar[0] )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroCar");
               GXutil.writeLogRaw("Old: ",Z12841AlbPTroCar);
               GXutil.writeLogRaw("Current: ",T01O72_A12841AlbPTroCar[0]);
            }
            if ( Z12842AlbPTroEst != T01O72_A12842AlbPTroEst[0] )
            {
               GXutil.writeLogln("tcall01:[seudo value changed for attri]"+"AlbPTroEst");
               GXutil.writeLogRaw("Old: ",Z12842AlbPTroEst);
               GXutil.writeLogRaw("Current: ",T01O72_A12842AlbPTroEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLALTRZ"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O7198( )
   {
      beforeValidate1O7198( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O7198( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O7198( 0) ;
         checkOptimisticConcurrency1O7198( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O7198( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O7198( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O730 */
                  pr_default.execute(24, new Object[] {Long.valueOf(A30AlbProCod), Short.valueOf(A42AlbPTroCod), A43AlbPTroMet, A5303AlbPTroKil, Short.valueOf(A3118AlbPTroAnc), Boolean.valueOf(n3733AlbTar), A3733AlbTar, Short.valueOf(A3969AlbPTroTrn), A3970AlbPTroFEn, Boolean.valueOf(n12841AlbPTroCar), Short.valueOf(A12841AlbPTroCar), Boolean.valueOf(n12842AlbPTroEst), Byte.valueOf(A12842AlbPTroEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1O7198( ) ;
         }
         endLevel1O7198( ) ;
      }
      closeExtendedTableCursors1O7198( ) ;
   }

   public void update1O7198( )
   {
      beforeValidate1O7198( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O7198( ) ;
      }
      if ( ( nIsMod_198 != 0 ) || ( nIsDirty_198 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1O7198( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1O7198( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1O7198( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01O731 */
                     pr_default.execute(25, new Object[] {A43AlbPTroMet, A5303AlbPTroKil, Short.valueOf(A3118AlbPTroAnc), Boolean.valueOf(n3733AlbTar), A3733AlbTar, Short.valueOf(A3969AlbPTroTrn), A3970AlbPTroFEn, Boolean.valueOf(n12841AlbPTroCar), Short.valueOf(A12841AlbPTroCar), Boolean.valueOf(n12842AlbPTroEst), Byte.valueOf(A12842AlbPTroEst), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLALTRZ"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1O7198( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1O7198( ) ;
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
            endLevel1O7198( ) ;
         }
      }
      closeExtendedTableCursors1O7198( ) ;
   }

   public void deferredUpdate1O7198( )
   {
   }

   public void delete1O7198( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O7198( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O7198( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O7198( ) ;
         afterConfirm1O7198( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O7198( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01O732 */
               pr_default.execute(26, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod, Short.valueOf(A42AlbPTroCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLALTRZ");
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
      sMode198 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O7198( ) ;
      Gx_mode = sMode198 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O7198( )
   {
      standaloneModal1O7198( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( isIns( )  )
         {
            A912AlbPMetEnt = O912AlbPMetEnt.add(A43AlbPTroMet) ;
            httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A912AlbPMetEnt = O912AlbPMetEnt.add(A43AlbPTroMet).subtract(O43AlbPTroMet) ;
               httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A912AlbPMetEnt = O912AlbPMetEnt.subtract(O43AlbPTroMet) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A5302AlbPKgmEnt = O5302AlbPKgmEnt.add(A5303AlbPTroKil) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5302AlbPKgmEnt = O5302AlbPKgmEnt.add(A5303AlbPTroKil).subtract(O5303AlbPTroKil) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5302AlbPKgmEnt = O5302AlbPKgmEnt.subtract(O5303AlbPTroKil) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
               }
            }
         }
         if ( isIns( )  )
         {
            A3469BarPTotTro = (short)(O3469BarPTotTro+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3469BarPTotTro = O3469BarPTotTro ;
               httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3469BarPTotTro = (short)(O3469BarPTotTro-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
               }
            }
         }
      }
   }

   public void endLevel1O7198( )
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

   public void scanStart1O7198( )
   {
      /* Scan By routine */
      /* Using cursor T01O733 */
      pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      RcdFound198 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound198 = (short)(1) ;
         A42AlbPTroCod = T01O733_A42AlbPTroCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O7198( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound198 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound198 = (short)(1) ;
         A42AlbPTroCod = T01O733_A42AlbPTroCod[0] ;
      }
   }

   public void scanEnd1O7198( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1O7198( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O7198( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O7198( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O7198( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O7198( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O7198( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O7198( )
   {
      edtAlbPTroCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroMet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroMet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroMet_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroKil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroKil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroKil_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroAnc_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbTar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTar_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroTrn_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroFEn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroFEn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroFEn_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroCar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCar_Enabled), 5, 0), !bGXsfl_105_Refreshing);
      edtAlbPTroEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroEst_Enabled), 5, 0), !bGXsfl_105_Refreshing);
   }

   public void send_integrity_lvl_hashes1O7198( )
   {
   }

   public void send_integrity_lvl_hashes1O7197( )
   {
   }

   public void subsflControlProps_105198( )
   {
      edtavnRcdDeleted_198_Internalname = "vNRCDDELETED_198_"+sGXsfl_105_idx ;
      edtAlbPTroCod_Internalname = "ALBPTROCOD_"+sGXsfl_105_idx ;
      edtAlbPTroMet_Internalname = "ALBPTROMET_"+sGXsfl_105_idx ;
      edtAlbPTroKil_Internalname = "ALBPTROKIL_"+sGXsfl_105_idx ;
      edtAlbPTroAnc_Internalname = "ALBPTROANC_"+sGXsfl_105_idx ;
      edtAlbTar_Internalname = "ALBTAR_"+sGXsfl_105_idx ;
      edtAlbPTroTrn_Internalname = "ALBPTROTRN_"+sGXsfl_105_idx ;
      edtAlbPTroFEn_Internalname = "ALBPTROFEN_"+sGXsfl_105_idx ;
      edtAlbPTroCar_Internalname = "ALBPTROCAR_"+sGXsfl_105_idx ;
      edtAlbPTroEst_Internalname = "ALBPTROEST_"+sGXsfl_105_idx ;
   }

   public void subsflControlProps_fel_105198( )
   {
      edtavnRcdDeleted_198_Internalname = "vNRCDDELETED_198_"+sGXsfl_105_fel_idx ;
      edtAlbPTroCod_Internalname = "ALBPTROCOD_"+sGXsfl_105_fel_idx ;
      edtAlbPTroMet_Internalname = "ALBPTROMET_"+sGXsfl_105_fel_idx ;
      edtAlbPTroKil_Internalname = "ALBPTROKIL_"+sGXsfl_105_fel_idx ;
      edtAlbPTroAnc_Internalname = "ALBPTROANC_"+sGXsfl_105_fel_idx ;
      edtAlbTar_Internalname = "ALBTAR_"+sGXsfl_105_fel_idx ;
      edtAlbPTroTrn_Internalname = "ALBPTROTRN_"+sGXsfl_105_fel_idx ;
      edtAlbPTroFEn_Internalname = "ALBPTROFEN_"+sGXsfl_105_fel_idx ;
      edtAlbPTroCar_Internalname = "ALBPTROCAR_"+sGXsfl_105_fel_idx ;
      edtAlbPTroEst_Internalname = "ALBPTROEST_"+sGXsfl_105_fel_idx ;
   }

   public void addRow1O7198( )
   {
      nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_105198( ) ;
      sendRow1O7198( ) ;
   }

   public void sendRow1O7198( )
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
         if ( ((int)((nGXsfl_105_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_198_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_198_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_198), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_198), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_198_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_198_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroCod_Internalname,GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42AlbPTroCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,107);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroMet_Internalname,GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroMet_Enabled!=0) ? localUtil.format( A43AlbPTroMet, "ZZZZZ9.99") : localUtil.format( A43AlbPTroMet, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,108);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroMet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroKil_Internalname,GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroKil_Enabled!=0) ? localUtil.format( A5303AlbPTroKil, "ZZZZZ9.99") : localUtil.format( A5303AlbPTroKil, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroKil_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3118AlbPTroAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3118AlbPTroAnc), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTar_Internalname,GXutil.rtrim( A3733AlbTar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbTar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroTrn_Internalname,GXutil.ltrim( localUtil.ntoc( A3969AlbPTroTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroTrn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3969AlbPTroTrn), "ZZZZ") : localUtil.format( DecimalUtil.doubleToDec(A3969AlbPTroTrn), "ZZZZ")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroTrn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroTrn_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroFEn_Internalname,localUtil.format(A3970AlbPTroFEn, "99/99/99"),localUtil.format( A3970AlbPTroFEn, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroFEn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroFEn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroCar_Internalname,GXutil.ltrim( localUtil.ntoc( A12841AlbPTroCar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroCar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12841AlbPTroCar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12841AlbPTroCar), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroCar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroCar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_198_" + sGXsfl_105_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_105_idx + "',105)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPTroEst_Internalname,GXutil.ltrim( localUtil.ntoc( A12842AlbPTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbPTroEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12842AlbPTroEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A12842AlbPTroEst), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,115);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPTroEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbPTroEst_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(105),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1O7198( ) ;
      GXCCtl = "Z42AlbPTroCod_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z42AlbPTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z43AlbPTroMet_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5303AlbPTroKil_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3118AlbPTroAnc_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3118AlbPTroAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3733AlbTar_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z3733AlbTar));
      GXCCtl = "Z3969AlbPTroTrn_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3969AlbPTroTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z3970AlbPTroFEn_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z3970AlbPTroFEn, 0, "/"));
      GXCCtl = "Z12841AlbPTroCar_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12841AlbPTroCar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z12842AlbPTroEst_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z12842AlbPTroEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O5303AlbPTroKil_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O5303AlbPTroKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O43AlbPTroMet_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O43AlbPTroMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_198_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_198_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_198_" + sGXsfl_105_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_198, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_198_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_198_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROCOD_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROMET_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROKIL_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROANC_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBTAR_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROTRN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroTrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROFEN_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroFEn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROCAR_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPTROEST_"+sGXsfl_105_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1O7198( )
   {
      nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_105198( ) ;
      edtavnRcdDeleted_198_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_198_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROCOD_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroMet_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROMET_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroKil_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROKIL_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROANC_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbTar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBTAR_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroTrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROTRN_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroFEn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROFEN_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroCar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROCAR_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPTroEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPTROEST_"+sGXsfl_105_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_198_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_198_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_198");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_198_Internalname ;
         wbErr = true ;
         nRcdDeleted_198 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_198 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_198_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPTROCOD_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroCod_Internalname ;
         wbErr = true ;
         A42AlbPTroCod = (short)(0) ;
      }
      else
      {
         A42AlbPTroCod = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPTroMet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPTroMet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPTROMET_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroMet_Internalname ;
         wbErr = true ;
         A43AlbPTroMet = DecimalUtil.ZERO ;
      }
      else
      {
         A43AlbPTroMet = localUtil.ctond( httpContext.cgiGet( edtAlbPTroMet_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbPTroKil_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbPTroKil_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBPTROKIL_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroKil_Internalname ;
         wbErr = true ;
         A5303AlbPTroKil = DecimalUtil.ZERO ;
      }
      else
      {
         A5303AlbPTroKil = localUtil.ctond( httpContext.cgiGet( edtAlbPTroKil_Internalname)) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPTROANC_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroAnc_Internalname ;
         wbErr = true ;
         A3118AlbPTroAnc = (short)(0) ;
      }
      else
      {
         A3118AlbPTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A3733AlbTar = httpContext.cgiGet( edtAlbTar_Internalname) ;
      n3733AlbTar = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPTROTRN_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroTrn_Internalname ;
         wbErr = true ;
         A3969AlbPTroTrn = (short)(0) ;
      }
      else
      {
         A3969AlbPTroTrn = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtAlbPTroFEn_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "ALBPTROFEN_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroFEn_Internalname ;
         wbErr = true ;
         A3970AlbPTroFEn = GXutil.nullDate() ;
      }
      else
      {
         A3970AlbPTroFEn = localUtil.ctod( httpContext.cgiGet( edtAlbPTroFEn_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "ALBPTROCAR_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroCar_Internalname ;
         wbErr = true ;
         A12841AlbPTroCar = (short)(0) ;
         n12841AlbPTroCar = false ;
      }
      else
      {
         A12841AlbPTroCar = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12841AlbPTroCar = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "ALBPTROEST_" + sGXsfl_105_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPTroEst_Internalname ;
         wbErr = true ;
         A12842AlbPTroEst = (byte)(0) ;
         n12842AlbPTroEst = false ;
      }
      else
      {
         A12842AlbPTroEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPTroEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n12842AlbPTroEst = false ;
      }
      GXCCtl = "Z42AlbPTroCod_" + sGXsfl_105_idx ;
      Z42AlbPTroCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z43AlbPTroMet_" + sGXsfl_105_idx ;
      Z43AlbPTroMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5303AlbPTroKil_" + sGXsfl_105_idx ;
      Z5303AlbPTroKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z3118AlbPTroAnc_" + sGXsfl_105_idx ;
      Z3118AlbPTroAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3733AlbTar_" + sGXsfl_105_idx ;
      Z3733AlbTar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3969AlbPTroTrn_" + sGXsfl_105_idx ;
      Z3969AlbPTroTrn = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z3970AlbPTroFEn_" + sGXsfl_105_idx ;
      Z3970AlbPTroFEn = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z12841AlbPTroCar_" + sGXsfl_105_idx ;
      Z12841AlbPTroCar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z12842AlbPTroEst_" + sGXsfl_105_idx ;
      Z12842AlbPTroEst = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O5303AlbPTroKil_" + sGXsfl_105_idx ;
      O5303AlbPTroKil = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O43AlbPTroMet_" + sGXsfl_105_idx ;
      O43AlbPTroMet = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_198_" + sGXsfl_105_idx ;
      nRcdDeleted_198 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_198_" + sGXsfl_105_idx ;
      nRcdExists_198 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_198_" + sGXsfl_105_idx ;
      nIsMod_198 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPTroCod_Enabled = edtAlbPTroCod_Enabled ;
   }

   public void confirmValues1O70( )
   {
      nGXsfl_105_idx = 0 ;
      sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_105198( ) ;
      while ( nGXsfl_105_idx < nRC_GXsfl_105 )
      {
         nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_105198( ) ;
         httpContext.changePostValue( "Z42AlbPTroCod_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z42AlbPTroCod_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z43AlbPTroMet_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z43AlbPTroMet_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z5303AlbPTroKil_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5303AlbPTroKil_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z3118AlbPTroAnc_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3118AlbPTroAnc_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z3733AlbTar_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z3733AlbTar_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3733AlbTar_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z3969AlbPTroTrn_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z3969AlbPTroTrn_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3969AlbPTroTrn_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z3970AlbPTroFEn_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z3970AlbPTroFEn_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3970AlbPTroFEn_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z12841AlbPTroCar_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z12841AlbPTroCar_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12841AlbPTroCar_"+sGXsfl_105_idx) ;
         httpContext.changePostValue( "Z12842AlbPTroEst_"+sGXsfl_105_idx, httpContext.cgiGet( "ZT_"+"Z12842AlbPTroEst_"+sGXsfl_105_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12842AlbPTroEst_"+sGXsfl_105_idx) ;
      }
      httpContext.changePostValue( "O5303AlbPTroKil", httpContext.cgiGet( "T5303AlbPTroKil")) ;
      httpContext.deletePostValue( "T5303AlbPTroKil") ;
      httpContext.changePostValue( "O43AlbPTroMet", httpContext.cgiGet( "T43AlbPTroMet")) ;
      httpContext.deletePostValue( "T43AlbPTroMet") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.tcall01", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1270AlbPMtrEnt", GXutil.ltrim( localUtil.ntoc( Z1270AlbPMtrEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z27AlbPKilEnt", GXutil.ltrim( localUtil.ntoc( Z27AlbPKilEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3117AlbPreAnc", GXutil.ltrim( localUtil.ntoc( Z3117AlbPreAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3469BarPTotTro", GXutil.ltrim( localUtil.ntoc( O3469BarPTotTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5302AlbPKgmEnt", GXutil.ltrim( localUtil.ntoc( O5302AlbPKgmEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O912AlbPMetEnt", GXutil.ltrim( localUtil.ntoc( O912AlbPMetEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_105", GXutil.ltrim( localUtil.ntoc( nGXsfl_105_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcall01", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TCALL01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Albaran de Produccion, TROZOS", "") ;
   }

   public void initializeNonKey1O7197( )
   {
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1270AlbPMtrEnt", GXutil.ltrimstr( A1270AlbPMtrEnt, 9, 2));
      A912AlbPMetEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      A183BarMetLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A27AlbPKilEnt", GXutil.ltrimstr( A27AlbPKilEnt, 9, 2));
      A5302AlbPKgmEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      A170BarKilLan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A197BarPConTro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A3469BarPTotTro = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      A3117AlbPreAnc = (short)(0) ;
      n3117AlbPreAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3117AlbPreAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3117AlbPreAnc), 4, 0));
      A2186BarPieLoc = "" ;
      n2186BarPieLoc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
      O3469BarPTotTro = A3469BarPTotTro ;
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      O5302AlbPKgmEnt = A5302AlbPKgmEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
      O912AlbPMetEnt = A912AlbPMetEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
      Z1270AlbPMtrEnt = DecimalUtil.ZERO ;
      Z27AlbPKilEnt = DecimalUtil.ZERO ;
      Z3117AlbPreAnc = (short)(0) ;
   }

   public void initAll1O7197( )
   {
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A200BarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A200BarPieCod", A200BarPieCod);
      initializeNonKey1O7197( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1O7198( )
   {
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      A3118AlbPTroAnc = (short)(0) ;
      A3733AlbTar = "" ;
      n3733AlbTar = false ;
      A3969AlbPTroTrn = (short)(0) ;
      A3970AlbPTroFEn = GXutil.nullDate() ;
      A12841AlbPTroCar = (short)(0) ;
      n12841AlbPTroCar = false ;
      A12842AlbPTroEst = (byte)(0) ;
      n12842AlbPTroEst = false ;
      O5303AlbPTroKil = A5303AlbPTroKil ;
      O43AlbPTroMet = A43AlbPTroMet ;
      Z43AlbPTroMet = DecimalUtil.ZERO ;
      Z5303AlbPTroKil = DecimalUtil.ZERO ;
      Z3118AlbPTroAnc = (short)(0) ;
      Z3733AlbTar = "" ;
      Z3969AlbPTroTrn = (short)(0) ;
      Z3970AlbPTroFEn = GXutil.nullDate() ;
      Z12841AlbPTroCar = (short)(0) ;
      Z12842AlbPTroEst = (byte)(0) ;
   }

   public void initAll1O7198( )
   {
      A42AlbPTroCod = (short)(0) ;
      initializeNonKey1O7198( ) ;
   }

   public void standaloneModalInsert1O7198( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415104782", true, true);
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
      httpContext.AddJavascriptSource("tcall01.js", "?202682415104782", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties198( )
   {
      edtAlbPTroCod_Enabled = defedtAlbPTroCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPTroCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPTroCod_Enabled), 5, 0), !bGXsfl_105_Refreshing);
   }

   public void startgridcontrol105( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_198, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_198_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A42AlbPTroCod, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A43AlbPTroMet, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroMet_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5303AlbPTroKil, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroKil_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3118AlbPTroAnc, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A3733AlbTar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbTar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3969AlbPTroTrn, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroTrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.format(A3970AlbPTroFEn, "99/99/99"));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroFEn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12841AlbPTroCar, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroCar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A12842AlbPTroEst, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPTroEst_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
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
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtAlbPMtrEnt_Internalname = "ALBPMTRENT" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbPMetEnt_Internalname = "ALBPMETENT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtBarMetLan_Internalname = "BARMETLAN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtAlbPKilEnt_Internalname = "ALBPKILENT" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAlbPKgmEnt_Internalname = "ALBPKGMENT" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtBarKilLan_Internalname = "BARKILLAN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtBarPConTro_Internalname = "BARPCONTRO" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtBarPTotTro_Internalname = "BARPTOTTRO" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAlbPreAnc_Internalname = "ALBPREANC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtBarPieLoc_Internalname = "BARPIELOC" ;
      edtavnRcdDeleted_198_Internalname = "vNRCDDELETED_198" ;
      edtAlbPTroCod_Internalname = "ALBPTROCOD" ;
      edtAlbPTroMet_Internalname = "ALBPTROMET" ;
      edtAlbPTroKil_Internalname = "ALBPTROKIL" ;
      edtAlbPTroAnc_Internalname = "ALBPTROANC" ;
      edtAlbTar_Internalname = "ALBTAR" ;
      edtAlbPTroTrn_Internalname = "ALBPTROTRN" ;
      edtAlbPTroFEn_Internalname = "ALBPTROFEN" ;
      edtAlbPTroCar_Internalname = "ALBPTROCAR" ;
      edtAlbPTroEst_Internalname = "ALBPTROEST" ;
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
      Form.setCaption( httpContext.getMessage( "Albaran de Produccion, TROZOS", "") );
      edtAlbPTroEst_Jsonclick = "" ;
      edtAlbPTroCar_Jsonclick = "" ;
      edtAlbPTroFEn_Jsonclick = "" ;
      edtAlbPTroTrn_Jsonclick = "" ;
      edtAlbTar_Jsonclick = "" ;
      edtAlbPTroAnc_Jsonclick = "" ;
      edtAlbPTroKil_Jsonclick = "" ;
      edtAlbPTroMet_Jsonclick = "" ;
      edtAlbPTroCod_Jsonclick = "" ;
      edtavnRcdDeleted_198_Jsonclick = "" ;
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
      edtAlbPTroEst_Enabled = 1 ;
      edtAlbPTroCar_Enabled = 1 ;
      edtAlbPTroFEn_Enabled = 1 ;
      edtAlbPTroTrn_Enabled = 1 ;
      edtAlbTar_Enabled = 1 ;
      edtAlbPTroAnc_Enabled = 1 ;
      edtAlbPTroKil_Enabled = 1 ;
      edtAlbPTroMet_Enabled = 1 ;
      edtAlbPTroCod_Enabled = 1 ;
      edtavnRcdDeleted_198_Enabled = 1 ;
      edtBarPieLoc_Jsonclick = "" ;
      edtBarPieLoc_Backcolor = (int)(0xFFFFFF) ;
      edtBarPieLoc_Enabled = 0 ;
      edtAlbPreAnc_Jsonclick = "" ;
      edtAlbPreAnc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPreAnc_Enabled = 1 ;
      edtBarPTotTro_Jsonclick = "" ;
      edtBarPTotTro_Backcolor = (int)(0xFFFFFF) ;
      edtBarPTotTro_Enabled = 0 ;
      edtBarPConTro_Jsonclick = "" ;
      edtBarPConTro_Backcolor = (int)(0xFFFFFF) ;
      edtBarPConTro_Enabled = 0 ;
      edtBarKilLan_Jsonclick = "" ;
      edtBarKilLan_Backcolor = (int)(0xFFFFFF) ;
      edtBarKilLan_Enabled = 0 ;
      edtAlbPKgmEnt_Jsonclick = "" ;
      edtAlbPKgmEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPKgmEnt_Enabled = 0 ;
      edtAlbPKilEnt_Jsonclick = "" ;
      edtAlbPKilEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPKilEnt_Enabled = 1 ;
      edtBarMetLan_Jsonclick = "" ;
      edtBarMetLan_Backcolor = (int)(0xFFFFFF) ;
      edtBarMetLan_Enabled = 0 ;
      edtAlbPMetEnt_Jsonclick = "" ;
      edtAlbPMetEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPMetEnt_Enabled = 0 ;
      edtAlbPMtrEnt_Jsonclick = "" ;
      edtAlbPMtrEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbPMtrEnt_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
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
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbProCod_Enabled = 1 ;
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
      subsflControlProps_105198( ) ;
      while ( nGXsfl_105_idx <= nRC_GXsfl_105 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1O7198( ) ;
         standaloneModal1O7198( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1O7198( ) ;
         nGXsfl_105_idx = (int)(nGXsfl_105_idx+1) ;
         sGXsfl_105_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_105_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_105198( ) ;
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
      /* Using cursor T01O734 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O734_A407EmprNom[0] ;
      n407EmprNom = T01O734_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(28);
      /* Using cursor T01O735 */
      pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(29);
      /* Using cursor T01O723 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A183BarMetLan = T01O723_A183BarMetLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrimstr( A183BarMetLan, 9, 2));
      A170BarKilLan = T01O723_A170BarKilLan[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrimstr( A170BarKilLan, 9, 2));
      A197BarPConTro = T01O723_A197BarPConTro[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A197BarPConTro), 3, 0));
      A2186BarPieLoc = T01O723_A2186BarPieLoc[0] ;
      n2186BarPieLoc = T01O723_n2186BarPieLoc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", A2186BarPieLoc);
      pr_default.close(18);
      /* Using cursor T01O725 */
      pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A912AlbPMetEnt = T01O725_A912AlbPMetEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         A5302AlbPKgmEnt = T01O725_A5302AlbPKgmEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A3469BarPTotTro = T01O725_A3469BarPTotTro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      else
      {
         A912AlbPMetEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrimstr( A912AlbPMetEnt, 9, 2));
         A5302AlbPKgmEnt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrimstr( A5302AlbPKgmEnt, 9, 2));
         A3469BarPTotTro = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3469BarPTotTro), 4, 0));
      }
      pr_default.close(19);
      GX_FocusControl = edtAlbPMtrEnt_Internalname ;
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
      /* Using cursor T01O735 */
      pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBBAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProCod_Internalname ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barpiecod( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01O723 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "BARPIE", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARPIECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtBarCod_Internalname ;
      }
      A183BarMetLan = T01O723_A183BarMetLan[0] ;
      A170BarKilLan = T01O723_A170BarKilLan[0] ;
      A197BarPConTro = T01O723_A197BarPConTro[0] ;
      A2186BarPieLoc = T01O723_A2186BarPieLoc[0] ;
      n2186BarPieLoc = T01O723_n2186BarPieLoc[0] ;
      pr_default.close(18);
      /* Using cursor T01O725 */
      pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         A912AlbPMetEnt = T01O725_A912AlbPMetEnt[0] ;
         A5302AlbPKgmEnt = T01O725_A5302AlbPKgmEnt[0] ;
         A3469BarPTotTro = T01O725_A3469BarPTotTro[0] ;
      }
      else
      {
         A912AlbPMetEnt = DecimalUtil.doubleToDec(0) ;
         A5302AlbPKgmEnt = DecimalUtil.doubleToDec(0) ;
         A3469BarPTotTro = (short)(0) ;
      }
      pr_default.close(19);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1270AlbPMtrEnt", GXutil.ltrim( localUtil.ntoc( A1270AlbPMtrEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A27AlbPKilEnt", GXutil.ltrim( localUtil.ntoc( A27AlbPKilEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3117AlbPreAnc", GXutil.ltrim( localUtil.ntoc( A3117AlbPreAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A183BarMetLan", GXutil.ltrim( localUtil.ntoc( A183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A170BarKilLan", GXutil.ltrim( localUtil.ntoc( A170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A197BarPConTro", GXutil.ltrim( localUtil.ntoc( A197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2186BarPieLoc", GXutil.rtrim( A2186BarPieLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A912AlbPMetEnt", GXutil.ltrim( localUtil.ntoc( A912AlbPMetEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5302AlbPKgmEnt", GXutil.ltrim( localUtil.ntoc( A5302AlbPKgmEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3469BarPTotTro", GXutil.ltrim( localUtil.ntoc( A3469BarPTotTro, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z200BarPieCod", GXutil.rtrim( Z200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1270AlbPMtrEnt", GXutil.ltrim( localUtil.ntoc( Z1270AlbPMtrEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z27AlbPKilEnt", GXutil.ltrim( localUtil.ntoc( Z27AlbPKilEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3117AlbPreAnc", GXutil.ltrim( localUtil.ntoc( Z3117AlbPreAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z183BarMetLan", GXutil.ltrim( localUtil.ntoc( Z183BarMetLan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z170BarKilLan", GXutil.ltrim( localUtil.ntoc( Z170BarKilLan, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z197BarPConTro", GXutil.ltrim( localUtil.ntoc( Z197BarPConTro, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2186BarPieLoc", GXutil.rtrim( Z2186BarPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z912AlbPMetEnt", GXutil.ltrim( localUtil.ntoc( Z912AlbPMetEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5302AlbPKgmEnt", GXutil.ltrim( localUtil.ntoc( Z5302AlbPKgmEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3469BarPTotTro", GXutil.ltrim( localUtil.ntoc( Z3469BarPTotTro, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3469BarPTotTro", GXutil.ltrim( localUtil.ntoc( O3469BarPTotTro, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5302AlbPKgmEnt", GXutil.ltrim( localUtil.ntoc( O5302AlbPKgmEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O912AlbPMetEnt", GXutil.ltrim( localUtil.ntoc( O912AlbPMetEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1270AlbPMtrEnt',fld:'ALBPMTRENT',pic:'ZZZZZ9.99'},{av:'A27AlbPKilEnt',fld:'ALBPKILENT',pic:'ZZZZZ9.99'},{av:'A3117AlbPreAnc',fld:'ALBPREANC',pic:'ZZZ9'},{av:'A183BarMetLan',fld:'BARMETLAN',pic:'ZZZZZ9.99'},{av:'A170BarKilLan',fld:'BARKILLAN',pic:'ZZZZZ9.99'},{av:'A197BarPConTro',fld:'BARPCONTRO',pic:'ZZ9'},{av:'A2186BarPieLoc',fld:'BARPIELOC',pic:''},{av:'A912AlbPMetEnt',fld:'ALBPMETENT',pic:'ZZZZZ9.99'},{av:'A5302AlbPKgmEnt',fld:'ALBPKGMENT',pic:'ZZZZZ9.99'},{av:'A3469BarPTotTro',fld:'BARPTOTTRO',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z200BarPieCod'},{av:'Z407EmprNom'},{av:'Z1270AlbPMtrEnt'},{av:'Z27AlbPKilEnt'},{av:'Z3117AlbPreAnc'},{av:'Z183BarMetLan'},{av:'Z170BarKilLan'},{av:'Z197BarPConTro'},{av:'Z2186BarPieLoc'},{av:'Z912AlbPMetEnt'},{av:'Z5302AlbPKgmEnt'},{av:'Z3469BarPTotTro'},{av:'O3469BarPTotTro'},{av:'O5302AlbPKgmEnt'},{av:'O912AlbPMetEnt'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBPTROCOD","{handler:'valid_Albptrocod',iparms:[]");
      setEventMetadata("VALID_ALBPTROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPTROMET","{handler:'valid_Albptromet',iparms:[]");
      setEventMetadata("VALID_ALBPTROMET",",oparms:[]}");
      setEventMetadata("VALID_ALBPTROKIL","{handler:'valid_Albptrokil',iparms:[]");
      setEventMetadata("VALID_ALBPTROKIL",",oparms:[]}");
      setEventMetadata("VALID_ALBPTROANC","{handler:'valid_Albptroanc',iparms:[]");
      setEventMetadata("VALID_ALBPTROANC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albptroest',iparms:[]");
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
      pr_default.close(18);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z200BarPieCod = "" ;
      Z1270AlbPMtrEnt = DecimalUtil.ZERO ;
      Z27AlbPKilEnt = DecimalUtil.ZERO ;
      O5302AlbPKgmEnt = DecimalUtil.ZERO ;
      O912AlbPMetEnt = DecimalUtil.ZERO ;
      Z43AlbPTroMet = DecimalUtil.ZERO ;
      Z5303AlbPTroKil = DecimalUtil.ZERO ;
      Z3733AlbTar = "" ;
      Z3970AlbPTroFEn = GXutil.nullDate() ;
      O5303AlbPTroKil = DecimalUtil.ZERO ;
      O43AlbPTroMet = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
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
      lblTextblock3_Jsonclick = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock8_Jsonclick = "" ;
      A1270AlbPMtrEnt = DecimalUtil.ZERO ;
      lblTextblock9_Jsonclick = "" ;
      A912AlbPMetEnt = DecimalUtil.ZERO ;
      lblTextblock10_Jsonclick = "" ;
      A183BarMetLan = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      lblTextblock12_Jsonclick = "" ;
      A5302AlbPKgmEnt = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      A170BarKilLan = DecimalUtil.ZERO ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      A2186BarPieLoc = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      B5302AlbPKgmEnt = DecimalUtil.ZERO ;
      B912AlbPMetEnt = DecimalUtil.ZERO ;
      sMode198 = "" ;
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
      sMode197 = "" ;
      s5302AlbPKgmEnt = DecimalUtil.ZERO ;
      s912AlbPMetEnt = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A43AlbPTroMet = DecimalUtil.ZERO ;
      A5303AlbPTroKil = DecimalUtil.ZERO ;
      A3733AlbTar = "" ;
      A3970AlbPTroFEn = GXutil.nullDate() ;
      T5303AlbPTroKil = DecimalUtil.ZERO ;
      T43AlbPTroMet = DecimalUtil.ZERO ;
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
      Z183BarMetLan = DecimalUtil.ZERO ;
      Z170BarKilLan = DecimalUtil.ZERO ;
      Z2186BarPieLoc = "" ;
      Z912AlbPMetEnt = DecimalUtil.ZERO ;
      Z5302AlbPKgmEnt = DecimalUtil.ZERO ;
      T01O76_A407EmprNom = new String[] {""} ;
      T01O76_n407EmprNom = new boolean[] {false} ;
      T01O712_A407EmprNom = new String[] {""} ;
      T01O712_n407EmprNom = new boolean[] {false} ;
      T01O712_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O712_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O712_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O712_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O712_A197BarPConTro = new short[1] ;
      T01O712_A3117AlbPreAnc = new short[1] ;
      T01O712_n3117AlbPreAnc = new boolean[] {false} ;
      T01O712_A2186BarPieLoc = new String[] {""} ;
      T01O712_n2186BarPieLoc = new boolean[] {false} ;
      T01O712_A396EmprCod = new String[] {""} ;
      T01O712_A129BarCod = new int[1] ;
      T01O712_A132BarCodReo = new byte[1] ;
      T01O712_A130BarCodPar = new String[] {""} ;
      T01O712_A200BarPieCod = new String[] {""} ;
      T01O712_A30AlbProCod = new long[1] ;
      T01O712_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O712_A5302AlbPKgmEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O712_A3469BarPTotTro = new short[1] ;
      T01O78_A396EmprCod = new String[] {""} ;
      T01O77_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O77_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O77_A197BarPConTro = new short[1] ;
      T01O77_A2186BarPieLoc = new String[] {""} ;
      T01O77_n2186BarPieLoc = new boolean[] {false} ;
      T01O710_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O710_A5302AlbPKgmEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O710_A3469BarPTotTro = new short[1] ;
      T01O713_A396EmprCod = new String[] {""} ;
      T01O714_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O714_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O714_A197BarPConTro = new short[1] ;
      T01O714_A2186BarPieLoc = new String[] {""} ;
      T01O714_n2186BarPieLoc = new boolean[] {false} ;
      T01O716_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O716_A5302AlbPKgmEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O716_A3469BarPTotTro = new short[1] ;
      T01O717_A396EmprCod = new String[] {""} ;
      T01O717_A30AlbProCod = new long[1] ;
      T01O717_A129BarCod = new int[1] ;
      T01O717_A132BarCodReo = new byte[1] ;
      T01O717_A130BarCodPar = new String[] {""} ;
      T01O717_A200BarPieCod = new String[] {""} ;
      T01O75_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O75_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O75_A3117AlbPreAnc = new short[1] ;
      T01O75_n3117AlbPreAnc = new boolean[] {false} ;
      T01O75_A396EmprCod = new String[] {""} ;
      T01O75_A129BarCod = new int[1] ;
      T01O75_A132BarCodReo = new byte[1] ;
      T01O75_A130BarCodPar = new String[] {""} ;
      T01O75_A200BarPieCod = new String[] {""} ;
      T01O75_A30AlbProCod = new long[1] ;
      T01O718_A396EmprCod = new String[] {""} ;
      T01O718_A129BarCod = new int[1] ;
      T01O718_A132BarCodReo = new byte[1] ;
      T01O718_A130BarCodPar = new String[] {""} ;
      T01O718_A200BarPieCod = new String[] {""} ;
      T01O718_A30AlbProCod = new long[1] ;
      T01O719_A396EmprCod = new String[] {""} ;
      T01O719_A129BarCod = new int[1] ;
      T01O719_A132BarCodReo = new byte[1] ;
      T01O719_A130BarCodPar = new String[] {""} ;
      T01O719_A200BarPieCod = new String[] {""} ;
      T01O719_A30AlbProCod = new long[1] ;
      T01O74_A1270AlbPMtrEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O74_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O74_A3117AlbPreAnc = new short[1] ;
      T01O74_n3117AlbPreAnc = new boolean[] {false} ;
      T01O74_A396EmprCod = new String[] {""} ;
      T01O74_A129BarCod = new int[1] ;
      T01O74_A132BarCodReo = new byte[1] ;
      T01O74_A130BarCodPar = new String[] {""} ;
      T01O74_A200BarPieCod = new String[] {""} ;
      T01O74_A30AlbProCod = new long[1] ;
      T01O723_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O723_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O723_A197BarPConTro = new short[1] ;
      T01O723_A2186BarPieLoc = new String[] {""} ;
      T01O723_n2186BarPieLoc = new boolean[] {false} ;
      T01O725_A912AlbPMetEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O725_A5302AlbPKgmEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O725_A3469BarPTotTro = new short[1] ;
      T01O726_A396EmprCod = new String[] {""} ;
      T01O726_A30AlbProCod = new long[1] ;
      T01O726_A129BarCod = new int[1] ;
      T01O726_A132BarCodReo = new byte[1] ;
      T01O726_A130BarCodPar = new String[] {""} ;
      T01O726_A2524DisComLin = new byte[1] ;
      T01O726_A1056DisComCod = new String[] {""} ;
      T01O726_A1032FonCod = new String[] {""} ;
      T01O726_A200BarPieCod = new String[] {""} ;
      T01O727_A396EmprCod = new String[] {""} ;
      T01O727_A30AlbProCod = new long[1] ;
      T01O727_A129BarCod = new int[1] ;
      T01O727_A132BarCodReo = new byte[1] ;
      T01O727_A130BarCodPar = new String[] {""} ;
      T01O727_A200BarPieCod = new String[] {""} ;
      T01O728_A30AlbProCod = new long[1] ;
      T01O728_A42AlbPTroCod = new short[1] ;
      T01O728_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O728_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O728_A3118AlbPTroAnc = new short[1] ;
      T01O728_A3733AlbTar = new String[] {""} ;
      T01O728_n3733AlbTar = new boolean[] {false} ;
      T01O728_A3969AlbPTroTrn = new short[1] ;
      T01O728_A3970AlbPTroFEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01O728_A12841AlbPTroCar = new short[1] ;
      T01O728_n12841AlbPTroCar = new boolean[] {false} ;
      T01O728_A12842AlbPTroEst = new byte[1] ;
      T01O728_n12842AlbPTroEst = new boolean[] {false} ;
      T01O728_A396EmprCod = new String[] {""} ;
      T01O728_A129BarCod = new int[1] ;
      T01O728_A132BarCodReo = new byte[1] ;
      T01O728_A130BarCodPar = new String[] {""} ;
      T01O728_A200BarPieCod = new String[] {""} ;
      T01O729_A396EmprCod = new String[] {""} ;
      T01O729_A30AlbProCod = new long[1] ;
      T01O729_A129BarCod = new int[1] ;
      T01O729_A132BarCodReo = new byte[1] ;
      T01O729_A130BarCodPar = new String[] {""} ;
      T01O729_A200BarPieCod = new String[] {""} ;
      T01O729_A42AlbPTroCod = new short[1] ;
      T01O73_A30AlbProCod = new long[1] ;
      T01O73_A42AlbPTroCod = new short[1] ;
      T01O73_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O73_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O73_A3118AlbPTroAnc = new short[1] ;
      T01O73_A3733AlbTar = new String[] {""} ;
      T01O73_n3733AlbTar = new boolean[] {false} ;
      T01O73_A3969AlbPTroTrn = new short[1] ;
      T01O73_A3970AlbPTroFEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01O73_A12841AlbPTroCar = new short[1] ;
      T01O73_n12841AlbPTroCar = new boolean[] {false} ;
      T01O73_A12842AlbPTroEst = new byte[1] ;
      T01O73_n12842AlbPTroEst = new boolean[] {false} ;
      T01O73_A396EmprCod = new String[] {""} ;
      T01O73_A129BarCod = new int[1] ;
      T01O73_A132BarCodReo = new byte[1] ;
      T01O73_A130BarCodPar = new String[] {""} ;
      T01O73_A200BarPieCod = new String[] {""} ;
      T01O72_A30AlbProCod = new long[1] ;
      T01O72_A42AlbPTroCod = new short[1] ;
      T01O72_A43AlbPTroMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O72_A5303AlbPTroKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O72_A3118AlbPTroAnc = new short[1] ;
      T01O72_A3733AlbTar = new String[] {""} ;
      T01O72_n3733AlbTar = new boolean[] {false} ;
      T01O72_A3969AlbPTroTrn = new short[1] ;
      T01O72_A3970AlbPTroFEn = new java.util.Date[] {GXutil.nullDate()} ;
      T01O72_A12841AlbPTroCar = new short[1] ;
      T01O72_n12841AlbPTroCar = new boolean[] {false} ;
      T01O72_A12842AlbPTroEst = new byte[1] ;
      T01O72_n12842AlbPTroEst = new boolean[] {false} ;
      T01O72_A396EmprCod = new String[] {""} ;
      T01O72_A129BarCod = new int[1] ;
      T01O72_A132BarCodReo = new byte[1] ;
      T01O72_A130BarCodPar = new String[] {""} ;
      T01O72_A200BarPieCod = new String[] {""} ;
      T01O733_A396EmprCod = new String[] {""} ;
      T01O733_A30AlbProCod = new long[1] ;
      T01O733_A129BarCod = new int[1] ;
      T01O733_A132BarCodReo = new byte[1] ;
      T01O733_A130BarCodPar = new String[] {""} ;
      T01O733_A200BarPieCod = new String[] {""} ;
      T01O733_A42AlbPTroCod = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T01O734_A407EmprNom = new String[] {""} ;
      T01O734_n407EmprNom = new boolean[] {false} ;
      T01O735_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ200BarPieCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ1270AlbPMtrEnt = DecimalUtil.ZERO ;
      ZZ27AlbPKilEnt = DecimalUtil.ZERO ;
      ZZ183BarMetLan = DecimalUtil.ZERO ;
      ZZ170BarKilLan = DecimalUtil.ZERO ;
      ZZ2186BarPieLoc = "" ;
      ZZ912AlbPMetEnt = DecimalUtil.ZERO ;
      ZZ5302AlbPKgmEnt = DecimalUtil.ZERO ;
      ZO5302AlbPKgmEnt = DecimalUtil.ZERO ;
      ZO912AlbPMetEnt = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcall01__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcall01__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcall01__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcall01__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcall01__default(),
         new Object[] {
             new Object[] {
            T01O72_A30AlbProCod, T01O72_A42AlbPTroCod, T01O72_A43AlbPTroMet, T01O72_A5303AlbPTroKil, T01O72_A3118AlbPTroAnc, T01O72_A3733AlbTar, T01O72_n3733AlbTar, T01O72_A3969AlbPTroTrn, T01O72_A3970AlbPTroFEn, T01O72_A12841AlbPTroCar,
            T01O72_n12841AlbPTroCar, T01O72_A12842AlbPTroEst, T01O72_n12842AlbPTroEst, T01O72_A396EmprCod, T01O72_A129BarCod, T01O72_A132BarCodReo, T01O72_A130BarCodPar, T01O72_A200BarPieCod
            }
            , new Object[] {
            T01O73_A30AlbProCod, T01O73_A42AlbPTroCod, T01O73_A43AlbPTroMet, T01O73_A5303AlbPTroKil, T01O73_A3118AlbPTroAnc, T01O73_A3733AlbTar, T01O73_n3733AlbTar, T01O73_A3969AlbPTroTrn, T01O73_A3970AlbPTroFEn, T01O73_A12841AlbPTroCar,
            T01O73_n12841AlbPTroCar, T01O73_A12842AlbPTroEst, T01O73_n12842AlbPTroEst, T01O73_A396EmprCod, T01O73_A129BarCod, T01O73_A132BarCodReo, T01O73_A130BarCodPar, T01O73_A200BarPieCod
            }
            , new Object[] {
            T01O74_A1270AlbPMtrEnt, T01O74_A27AlbPKilEnt, T01O74_A3117AlbPreAnc, T01O74_n3117AlbPreAnc, T01O74_A396EmprCod, T01O74_A129BarCod, T01O74_A132BarCodReo, T01O74_A130BarCodPar, T01O74_A200BarPieCod, T01O74_A30AlbProCod
            }
            , new Object[] {
            T01O75_A1270AlbPMtrEnt, T01O75_A27AlbPKilEnt, T01O75_A3117AlbPreAnc, T01O75_n3117AlbPreAnc, T01O75_A396EmprCod, T01O75_A129BarCod, T01O75_A132BarCodReo, T01O75_A130BarCodPar, T01O75_A200BarPieCod, T01O75_A30AlbProCod
            }
            , new Object[] {
            T01O76_A407EmprNom, T01O76_n407EmprNom
            }
            , new Object[] {
            T01O77_A183BarMetLan, T01O77_A170BarKilLan, T01O77_A197BarPConTro, T01O77_A2186BarPieLoc, T01O77_n2186BarPieLoc
            }
            , new Object[] {
            T01O78_A396EmprCod
            }
            , new Object[] {
            T01O710_A912AlbPMetEnt, T01O710_A5302AlbPKgmEnt, T01O710_A3469BarPTotTro
            }
            , new Object[] {
            T01O712_A407EmprNom, T01O712_n407EmprNom, T01O712_A1270AlbPMtrEnt, T01O712_A183BarMetLan, T01O712_A27AlbPKilEnt, T01O712_A170BarKilLan, T01O712_A197BarPConTro, T01O712_A3117AlbPreAnc, T01O712_n3117AlbPreAnc, T01O712_A2186BarPieLoc,
            T01O712_n2186BarPieLoc, T01O712_A396EmprCod, T01O712_A129BarCod, T01O712_A132BarCodReo, T01O712_A130BarCodPar, T01O712_A200BarPieCod, T01O712_A30AlbProCod, T01O712_A912AlbPMetEnt, T01O712_A5302AlbPKgmEnt, T01O712_A3469BarPTotTro
            }
            , new Object[] {
            T01O713_A396EmprCod
            }
            , new Object[] {
            T01O714_A183BarMetLan, T01O714_A170BarKilLan, T01O714_A197BarPConTro, T01O714_A2186BarPieLoc, T01O714_n2186BarPieLoc
            }
            , new Object[] {
            T01O716_A912AlbPMetEnt, T01O716_A5302AlbPKgmEnt, T01O716_A3469BarPTotTro
            }
            , new Object[] {
            T01O717_A396EmprCod, T01O717_A30AlbProCod, T01O717_A129BarCod, T01O717_A132BarCodReo, T01O717_A130BarCodPar, T01O717_A200BarPieCod
            }
            , new Object[] {
            T01O718_A396EmprCod, T01O718_A129BarCod, T01O718_A132BarCodReo, T01O718_A130BarCodPar, T01O718_A200BarPieCod, T01O718_A30AlbProCod
            }
            , new Object[] {
            T01O719_A396EmprCod, T01O719_A129BarCod, T01O719_A132BarCodReo, T01O719_A130BarCodPar, T01O719_A200BarPieCod, T01O719_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O723_A183BarMetLan, T01O723_A170BarKilLan, T01O723_A197BarPConTro, T01O723_A2186BarPieLoc, T01O723_n2186BarPieLoc
            }
            , new Object[] {
            T01O725_A912AlbPMetEnt, T01O725_A5302AlbPKgmEnt, T01O725_A3469BarPTotTro
            }
            , new Object[] {
            T01O726_A396EmprCod, T01O726_A30AlbProCod, T01O726_A129BarCod, T01O726_A132BarCodReo, T01O726_A130BarCodPar, T01O726_A2524DisComLin, T01O726_A1056DisComCod, T01O726_A1032FonCod, T01O726_A200BarPieCod
            }
            , new Object[] {
            T01O727_A396EmprCod, T01O727_A30AlbProCod, T01O727_A129BarCod, T01O727_A132BarCodReo, T01O727_A130BarCodPar, T01O727_A200BarPieCod
            }
            , new Object[] {
            T01O728_A30AlbProCod, T01O728_A42AlbPTroCod, T01O728_A43AlbPTroMet, T01O728_A5303AlbPTroKil, T01O728_A3118AlbPTroAnc, T01O728_A3733AlbTar, T01O728_n3733AlbTar, T01O728_A3969AlbPTroTrn, T01O728_A3970AlbPTroFEn, T01O728_A12841AlbPTroCar,
            T01O728_n12841AlbPTroCar, T01O728_A12842AlbPTroEst, T01O728_n12842AlbPTroEst, T01O728_A396EmprCod, T01O728_A129BarCod, T01O728_A132BarCodReo, T01O728_A130BarCodPar, T01O728_A200BarPieCod
            }
            , new Object[] {
            T01O729_A396EmprCod, T01O729_A30AlbProCod, T01O729_A129BarCod, T01O729_A132BarCodReo, T01O729_A130BarCodPar, T01O729_A200BarPieCod, T01O729_A42AlbPTroCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O733_A396EmprCod, T01O733_A30AlbProCod, T01O733_A129BarCod, T01O733_A132BarCodReo, T01O733_A130BarCodPar, T01O733_A200BarPieCod, T01O733_A42AlbPTroCod
            }
            , new Object[] {
            T01O734_A407EmprNom, T01O734_n407EmprNom
            }
            , new Object[] {
            T01O735_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TCALL01" ;
   }

   private byte Z132BarCodReo ;
   private byte Z12842AlbPTroEst ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A12842AlbPTroEst ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short Z3117AlbPreAnc ;
   private short O3469BarPTotTro ;
   private short Z42AlbPTroCod ;
   private short Z3118AlbPTroAnc ;
   private short Z3969AlbPTroTrn ;
   private short Z12841AlbPTroCar ;
   private short nRcdDeleted_198 ;
   private short nRcdExists_198 ;
   private short nIsMod_198 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A197BarPConTro ;
   private short A3469BarPTotTro ;
   private short A3117AlbPreAnc ;
   private short nBlankRcdCount198 ;
   private short RcdFound198 ;
   private short B3469BarPTotTro ;
   private short nBlankRcdUsr198 ;
   private short s3469BarPTotTro ;
   private short A42AlbPTroCod ;
   private short A3118AlbPTroAnc ;
   private short A3969AlbPTroTrn ;
   private short A12841AlbPTroCar ;
   private short Z197BarPConTro ;
   private short Z3469BarPTotTro ;
   private short RcdFound197 ;
   private short nIsDirty_197 ;
   private short nIsDirty_198 ;
   private short ZZ3117AlbPreAnc ;
   private short ZZ197BarPConTro ;
   private short ZZ3469BarPTotTro ;
   private short ZO3469BarPTotTro ;
   private int Z129BarCod ;
   private int nRC_GXsfl_105 ;
   private int nGXsfl_105_idx=1 ;
   private int A129BarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarPieCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtAlbPMtrEnt_Enabled ;
   private int edtAlbPMetEnt_Enabled ;
   private int edtBarMetLan_Enabled ;
   private int edtAlbPKilEnt_Enabled ;
   private int edtAlbPKgmEnt_Enabled ;
   private int edtBarKilLan_Enabled ;
   private int edtBarPConTro_Enabled ;
   private int edtBarPTotTro_Enabled ;
   private int edtAlbPreAnc_Enabled ;
   private int edtBarPieLoc_Enabled ;
   private int edtavnRcdDeleted_198_Enabled ;
   private int edtAlbPTroCod_Enabled ;
   private int edtAlbPTroMet_Enabled ;
   private int edtAlbPTroKil_Enabled ;
   private int edtAlbPTroAnc_Enabled ;
   private int edtAlbTar_Enabled ;
   private int edtAlbPTroTrn_Enabled ;
   private int edtAlbPTroFEn_Enabled ;
   private int edtAlbPTroCar_Enabled ;
   private int edtAlbPTroEst_Enabled ;
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
   private int defedtAlbPTroCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtBarPieLoc_Backcolor ;
   private int edtAlbPreAnc_Backcolor ;
   private int edtBarPTotTro_Backcolor ;
   private int edtBarPConTro_Backcolor ;
   private int edtBarKilLan_Backcolor ;
   private int edtAlbPKgmEnt_Backcolor ;
   private int edtAlbPKilEnt_Backcolor ;
   private int edtBarMetLan_Backcolor ;
   private int edtAlbPMetEnt_Backcolor ;
   private int edtAlbPMtrEnt_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtBarPieCod_Backcolor ;
   private int edtBarCodPar_Backcolor ;
   private int edtBarCodReo_Backcolor ;
   private int edtBarCod_Backcolor ;
   private int edtAlbProCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ129BarCod ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long GRID1_nFirstRecordOnPage ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z1270AlbPMtrEnt ;
   private java.math.BigDecimal Z27AlbPKilEnt ;
   private java.math.BigDecimal O5302AlbPKgmEnt ;
   private java.math.BigDecimal O912AlbPMetEnt ;
   private java.math.BigDecimal Z43AlbPTroMet ;
   private java.math.BigDecimal Z5303AlbPTroKil ;
   private java.math.BigDecimal O5303AlbPTroKil ;
   private java.math.BigDecimal O43AlbPTroMet ;
   private java.math.BigDecimal A1270AlbPMtrEnt ;
   private java.math.BigDecimal A912AlbPMetEnt ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A5302AlbPKgmEnt ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal B5302AlbPKgmEnt ;
   private java.math.BigDecimal B912AlbPMetEnt ;
   private java.math.BigDecimal s5302AlbPKgmEnt ;
   private java.math.BigDecimal s912AlbPMetEnt ;
   private java.math.BigDecimal A43AlbPTroMet ;
   private java.math.BigDecimal A5303AlbPTroKil ;
   private java.math.BigDecimal T5303AlbPTroKil ;
   private java.math.BigDecimal T43AlbPTroMet ;
   private java.math.BigDecimal Z183BarMetLan ;
   private java.math.BigDecimal Z170BarKilLan ;
   private java.math.BigDecimal Z912AlbPMetEnt ;
   private java.math.BigDecimal Z5302AlbPKgmEnt ;
   private java.math.BigDecimal ZZ1270AlbPMtrEnt ;
   private java.math.BigDecimal ZZ27AlbPKilEnt ;
   private java.math.BigDecimal ZZ183BarMetLan ;
   private java.math.BigDecimal ZZ170BarKilLan ;
   private java.math.BigDecimal ZZ912AlbPMetEnt ;
   private java.math.BigDecimal ZZ5302AlbPKgmEnt ;
   private java.math.BigDecimal ZO5302AlbPKgmEnt ;
   private java.math.BigDecimal ZO912AlbPMetEnt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z200BarPieCod ;
   private String Z3733AlbTar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A200BarPieCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbProCod_Internalname ;
   private String sGXsfl_105_idx="0001" ;
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
   private String edtAlbProCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtBarCod_Internalname ;
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
   private String edtBarPieCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtAlbPMtrEnt_Internalname ;
   private String edtAlbPMtrEnt_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbPMetEnt_Internalname ;
   private String edtAlbPMetEnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtBarMetLan_Internalname ;
   private String edtBarMetLan_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtAlbPKilEnt_Internalname ;
   private String edtAlbPKilEnt_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAlbPKgmEnt_Internalname ;
   private String edtAlbPKgmEnt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtBarKilLan_Internalname ;
   private String edtBarKilLan_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtBarPConTro_Internalname ;
   private String edtBarPConTro_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtBarPTotTro_Internalname ;
   private String edtBarPTotTro_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAlbPreAnc_Internalname ;
   private String edtAlbPreAnc_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtBarPieLoc_Internalname ;
   private String A2186BarPieLoc ;
   private String edtBarPieLoc_Jsonclick ;
   private String sMode198 ;
   private String edtavnRcdDeleted_198_Internalname ;
   private String edtAlbPTroCod_Internalname ;
   private String edtAlbPTroMet_Internalname ;
   private String edtAlbPTroKil_Internalname ;
   private String edtAlbPTroAnc_Internalname ;
   private String edtAlbTar_Internalname ;
   private String edtAlbPTroTrn_Internalname ;
   private String edtAlbPTroFEn_Internalname ;
   private String edtAlbPTroCar_Internalname ;
   private String edtAlbPTroEst_Internalname ;
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
   private String sMode197 ;
   private String GXCCtl ;
   private String A3733AlbTar ;
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
   private String Z2186BarPieLoc ;
   private String sGXsfl_105_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_198_Jsonclick ;
   private String edtAlbPTroCod_Jsonclick ;
   private String edtAlbPTroMet_Jsonclick ;
   private String edtAlbPTroKil_Jsonclick ;
   private String edtAlbPTroAnc_Jsonclick ;
   private String edtAlbTar_Jsonclick ;
   private String edtAlbPTroTrn_Jsonclick ;
   private String edtAlbPTroFEn_Jsonclick ;
   private String edtAlbPTroCar_Jsonclick ;
   private String edtAlbPTroEst_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ200BarPieCod ;
   private String ZZ407EmprNom ;
   private String ZZ2186BarPieLoc ;
   private java.util.Date Z3970AlbPTroFEn ;
   private java.util.Date A3970AlbPTroFEn ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_105_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n3117AlbPreAnc ;
   private boolean n2186BarPieLoc ;
   private boolean returnInSub ;
   private boolean n3733AlbTar ;
   private boolean n12841AlbPTroCar ;
   private boolean n12842AlbPTroEst ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T01O76_A407EmprNom ;
   private boolean[] T01O76_n407EmprNom ;
   private String[] T01O712_A407EmprNom ;
   private boolean[] T01O712_n407EmprNom ;
   private java.math.BigDecimal[] T01O712_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] T01O712_A183BarMetLan ;
   private java.math.BigDecimal[] T01O712_A27AlbPKilEnt ;
   private java.math.BigDecimal[] T01O712_A170BarKilLan ;
   private short[] T01O712_A197BarPConTro ;
   private short[] T01O712_A3117AlbPreAnc ;
   private boolean[] T01O712_n3117AlbPreAnc ;
   private String[] T01O712_A2186BarPieLoc ;
   private boolean[] T01O712_n2186BarPieLoc ;
   private String[] T01O712_A396EmprCod ;
   private int[] T01O712_A129BarCod ;
   private byte[] T01O712_A132BarCodReo ;
   private String[] T01O712_A130BarCodPar ;
   private String[] T01O712_A200BarPieCod ;
   private long[] T01O712_A30AlbProCod ;
   private java.math.BigDecimal[] T01O712_A912AlbPMetEnt ;
   private java.math.BigDecimal[] T01O712_A5302AlbPKgmEnt ;
   private short[] T01O712_A3469BarPTotTro ;
   private String[] T01O78_A396EmprCod ;
   private java.math.BigDecimal[] T01O77_A183BarMetLan ;
   private java.math.BigDecimal[] T01O77_A170BarKilLan ;
   private short[] T01O77_A197BarPConTro ;
   private String[] T01O77_A2186BarPieLoc ;
   private boolean[] T01O77_n2186BarPieLoc ;
   private java.math.BigDecimal[] T01O710_A912AlbPMetEnt ;
   private java.math.BigDecimal[] T01O710_A5302AlbPKgmEnt ;
   private short[] T01O710_A3469BarPTotTro ;
   private String[] T01O713_A396EmprCod ;
   private java.math.BigDecimal[] T01O714_A183BarMetLan ;
   private java.math.BigDecimal[] T01O714_A170BarKilLan ;
   private short[] T01O714_A197BarPConTro ;
   private String[] T01O714_A2186BarPieLoc ;
   private boolean[] T01O714_n2186BarPieLoc ;
   private java.math.BigDecimal[] T01O716_A912AlbPMetEnt ;
   private java.math.BigDecimal[] T01O716_A5302AlbPKgmEnt ;
   private short[] T01O716_A3469BarPTotTro ;
   private String[] T01O717_A396EmprCod ;
   private long[] T01O717_A30AlbProCod ;
   private int[] T01O717_A129BarCod ;
   private byte[] T01O717_A132BarCodReo ;
   private String[] T01O717_A130BarCodPar ;
   private String[] T01O717_A200BarPieCod ;
   private java.math.BigDecimal[] T01O75_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] T01O75_A27AlbPKilEnt ;
   private short[] T01O75_A3117AlbPreAnc ;
   private boolean[] T01O75_n3117AlbPreAnc ;
   private String[] T01O75_A396EmprCod ;
   private int[] T01O75_A129BarCod ;
   private byte[] T01O75_A132BarCodReo ;
   private String[] T01O75_A130BarCodPar ;
   private String[] T01O75_A200BarPieCod ;
   private long[] T01O75_A30AlbProCod ;
   private String[] T01O718_A396EmprCod ;
   private int[] T01O718_A129BarCod ;
   private byte[] T01O718_A132BarCodReo ;
   private String[] T01O718_A130BarCodPar ;
   private String[] T01O718_A200BarPieCod ;
   private long[] T01O718_A30AlbProCod ;
   private String[] T01O719_A396EmprCod ;
   private int[] T01O719_A129BarCod ;
   private byte[] T01O719_A132BarCodReo ;
   private String[] T01O719_A130BarCodPar ;
   private String[] T01O719_A200BarPieCod ;
   private long[] T01O719_A30AlbProCod ;
   private java.math.BigDecimal[] T01O74_A1270AlbPMtrEnt ;
   private java.math.BigDecimal[] T01O74_A27AlbPKilEnt ;
   private short[] T01O74_A3117AlbPreAnc ;
   private boolean[] T01O74_n3117AlbPreAnc ;
   private String[] T01O74_A396EmprCod ;
   private int[] T01O74_A129BarCod ;
   private byte[] T01O74_A132BarCodReo ;
   private String[] T01O74_A130BarCodPar ;
   private String[] T01O74_A200BarPieCod ;
   private long[] T01O74_A30AlbProCod ;
   private java.math.BigDecimal[] T01O723_A183BarMetLan ;
   private java.math.BigDecimal[] T01O723_A170BarKilLan ;
   private short[] T01O723_A197BarPConTro ;
   private String[] T01O723_A2186BarPieLoc ;
   private boolean[] T01O723_n2186BarPieLoc ;
   private java.math.BigDecimal[] T01O725_A912AlbPMetEnt ;
   private java.math.BigDecimal[] T01O725_A5302AlbPKgmEnt ;
   private short[] T01O725_A3469BarPTotTro ;
   private String[] T01O726_A396EmprCod ;
   private long[] T01O726_A30AlbProCod ;
   private int[] T01O726_A129BarCod ;
   private byte[] T01O726_A132BarCodReo ;
   private String[] T01O726_A130BarCodPar ;
   private byte[] T01O726_A2524DisComLin ;
   private String[] T01O726_A1056DisComCod ;
   private String[] T01O726_A1032FonCod ;
   private String[] T01O726_A200BarPieCod ;
   private String[] T01O727_A396EmprCod ;
   private long[] T01O727_A30AlbProCod ;
   private int[] T01O727_A129BarCod ;
   private byte[] T01O727_A132BarCodReo ;
   private String[] T01O727_A130BarCodPar ;
   private String[] T01O727_A200BarPieCod ;
   private long[] T01O728_A30AlbProCod ;
   private short[] T01O728_A42AlbPTroCod ;
   private java.math.BigDecimal[] T01O728_A43AlbPTroMet ;
   private java.math.BigDecimal[] T01O728_A5303AlbPTroKil ;
   private short[] T01O728_A3118AlbPTroAnc ;
   private String[] T01O728_A3733AlbTar ;
   private boolean[] T01O728_n3733AlbTar ;
   private short[] T01O728_A3969AlbPTroTrn ;
   private java.util.Date[] T01O728_A3970AlbPTroFEn ;
   private short[] T01O728_A12841AlbPTroCar ;
   private boolean[] T01O728_n12841AlbPTroCar ;
   private byte[] T01O728_A12842AlbPTroEst ;
   private boolean[] T01O728_n12842AlbPTroEst ;
   private String[] T01O728_A396EmprCod ;
   private int[] T01O728_A129BarCod ;
   private byte[] T01O728_A132BarCodReo ;
   private String[] T01O728_A130BarCodPar ;
   private String[] T01O728_A200BarPieCod ;
   private String[] T01O729_A396EmprCod ;
   private long[] T01O729_A30AlbProCod ;
   private int[] T01O729_A129BarCod ;
   private byte[] T01O729_A132BarCodReo ;
   private String[] T01O729_A130BarCodPar ;
   private String[] T01O729_A200BarPieCod ;
   private short[] T01O729_A42AlbPTroCod ;
   private long[] T01O73_A30AlbProCod ;
   private short[] T01O73_A42AlbPTroCod ;
   private java.math.BigDecimal[] T01O73_A43AlbPTroMet ;
   private java.math.BigDecimal[] T01O73_A5303AlbPTroKil ;
   private short[] T01O73_A3118AlbPTroAnc ;
   private String[] T01O73_A3733AlbTar ;
   private boolean[] T01O73_n3733AlbTar ;
   private short[] T01O73_A3969AlbPTroTrn ;
   private java.util.Date[] T01O73_A3970AlbPTroFEn ;
   private short[] T01O73_A12841AlbPTroCar ;
   private boolean[] T01O73_n12841AlbPTroCar ;
   private byte[] T01O73_A12842AlbPTroEst ;
   private boolean[] T01O73_n12842AlbPTroEst ;
   private String[] T01O73_A396EmprCod ;
   private int[] T01O73_A129BarCod ;
   private byte[] T01O73_A132BarCodReo ;
   private String[] T01O73_A130BarCodPar ;
   private String[] T01O73_A200BarPieCod ;
   private long[] T01O72_A30AlbProCod ;
   private short[] T01O72_A42AlbPTroCod ;
   private java.math.BigDecimal[] T01O72_A43AlbPTroMet ;
   private java.math.BigDecimal[] T01O72_A5303AlbPTroKil ;
   private short[] T01O72_A3118AlbPTroAnc ;
   private String[] T01O72_A3733AlbTar ;
   private boolean[] T01O72_n3733AlbTar ;
   private short[] T01O72_A3969AlbPTroTrn ;
   private java.util.Date[] T01O72_A3970AlbPTroFEn ;
   private short[] T01O72_A12841AlbPTroCar ;
   private boolean[] T01O72_n12841AlbPTroCar ;
   private byte[] T01O72_A12842AlbPTroEst ;
   private boolean[] T01O72_n12842AlbPTroEst ;
   private String[] T01O72_A396EmprCod ;
   private int[] T01O72_A129BarCod ;
   private byte[] T01O72_A132BarCodReo ;
   private String[] T01O72_A130BarCodPar ;
   private String[] T01O72_A200BarPieCod ;
   private String[] T01O733_A396EmprCod ;
   private long[] T01O733_A30AlbProCod ;
   private int[] T01O733_A129BarCod ;
   private byte[] T01O733_A132BarCodReo ;
   private String[] T01O733_A130BarCodPar ;
   private String[] T01O733_A200BarPieCod ;
   private short[] T01O733_A42AlbPTroCod ;
   private String[] T01O734_A407EmprNom ;
   private boolean[] T01O734_n407EmprNom ;
   private String[] T01O735_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tcall01__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcall01__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcall01__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcall01__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcall01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01O72", "SELECT AlbProCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?  FOR UPDATE OF AlbPTroMet, AlbPTroKil, AlbPTroAnc, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O73", "SELECT AlbProCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O74", "SELECT AlbPMtrEnt, AlbPKilEnt, AlbPreAnc, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?  FOR UPDATE OF AlbPMtrEnt, AlbPKilEnt, AlbPreAnc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O75", "SELECT AlbPMtrEnt, AlbPKilEnt, AlbPreAnc, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O76", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O77", "SELECT BarMetLan, BarKilLan, BarPConTro, BarPieLoc FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O78", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O710", "SELECT COALESCE( T1.AlbPMetEnt, 0) AS AlbPMetEnt, COALESCE( T1.AlbPKgmEnt, 0) AS AlbPKgmEnt, COALESCE( T1.BarPTotTro, 0) AS BarPTotTro FROM (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, SUM(AlbPTroKil) AS AlbPKgmEnt, COUNT(*) AS BarPTotTro FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O712", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, TM1.AlbPMtrEnt, T3.BarMetLan, TM1.AlbPKilEnt, T3.BarKilLan, T3.BarPConTro, TM1.AlbPreAnc, T3.BarPieLoc, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod, TM1.AlbProCod, COALESCE( T4.AlbPMetEnt, 0) AS AlbPMetEnt, COALESCE( T4.AlbPKgmEnt, 0) AS AlbPKgmEnt, COALESCE( T4.BarPTotTro, 0) AS BarPTotTro FROM (((TXPLALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARPIE T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar AND T3.BarPieCod = TM1.BarPieCod) LEFT JOIN (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, SUM(AlbPTroKil) AS AlbPKgmEnt, COUNT(*) AS BarPTotTro FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbProCod = TM1.AlbProCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar AND T4.BarPieCod = TM1.BarPieCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.BarPieCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O713", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O714", "SELECT BarMetLan, BarKilLan, BarPConTro, BarPieLoc FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O716", "SELECT COALESCE( T1.AlbPMetEnt, 0) AS AlbPMetEnt, COALESCE( T1.AlbPKgmEnt, 0) AS AlbPKgmEnt, COALESCE( T1.BarPTotTro, 0) AS BarPTotTro FROM (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, SUM(AlbPTroKil) AS AlbPKgmEnt, COUNT(*) AS BarPTotTro FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O717", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O718", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod FROM TXPLALPRD WHERE ( BarCod > ? or BarCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarPieCod > ? or BarPieCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and AlbProCod > ?) and EmprCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O719", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod FROM TXPLALPRD WHERE ( BarCod < ? or BarCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and BarPieCod < ? or BarPieCod = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and AlbProCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, BarPieCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01O720", "INSERT INTO TXPLALPRD(AlbPMtrEnt, AlbPKilEnt, AlbPreAnc, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbProCod, AlbPieDsc, AlbPKilNet, AlbPMtrNet, AlbPreAncc, AlbPrePgd, AlbTarAlb, AlbPTrnCod, AlbPTrnFec) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPLALPRD")
         ,new UpdateCursor("T01O721", "UPDATE TXPLALPRD SET AlbPMtrEnt=?, AlbPKilEnt=?, AlbPreAnc=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPLALPRD")
         ,new UpdateCursor("T01O722", "DELETE FROM TXPLALPRD  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK, "TXPLALPRD")
         ,new ForEachCursor("T01O723", "SELECT BarMetLan, BarKilLan, BarPConTro, BarPieLoc FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O725", "SELECT COALESCE( T1.AlbPMetEnt, 0) AS AlbPMetEnt, COALESCE( T1.AlbPKgmEnt, 0) AS AlbPKgmEnt, COALESCE( T1.BarPTotTro, 0) AS BarPTotTro FROM (SELECT SUM(AlbPTroMet) AS AlbPMetEnt, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, SUM(AlbPTroKil) AS AlbPKgmEnt, COUNT(*) AS BarPTotTro FROM TXPLALTRZ GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? AND T1.BarPieCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O726", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, BarPieCod FROM TXPALBTEP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O727", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O728", "SELECT AlbProCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and AlbPTroCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O729", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod FROM TXPLALTRZ WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O730", "INSERT INTO TXPLALTRZ(AlbProCod, AlbPTroCod, AlbPTroMet, AlbPTroKil, AlbPTroAnc, AlbTar, AlbPTroTrn, AlbPTroFEn, AlbPTroCar, AlbPTroEst, EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLALTRZ")
         ,new UpdateCursor("T01O731", "UPDATE TXPLALTRZ SET AlbPTroMet=?, AlbPTroKil=?, AlbPTroAnc=?, AlbTar=?, AlbPTroTrn=?, AlbPTroFEn=?, AlbPTroCar=?, AlbPTroEst=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK, "TXPLALTRZ")
         ,new UpdateCursor("T01O732", "DELETE FROM TXPLALTRZ  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? AND AlbPTroCod = ?", GX_NOMASK, "TXPLALTRZ")
         ,new ForEachCursor("T01O733", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod FROM TXPLALTRZ WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod, AlbPTroCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O734", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O735", "SELECT EmprCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 9);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 9);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 9);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 3);
               ((int[]) buf[12])[0] = rslt.getInt(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((String[]) buf[15])[0] = rslt.getString(13, 9);
               ((long[]) buf[16])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[19])[0] = rslt.getShort(17);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 19 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 22 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 3);
               ((int[]) buf[14])[0] = rslt.getInt(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 9);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 13 :
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
               stmt.setString(11, (String)parms[10], 9);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 14 :
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
               stmt.setString(11, (String)parms[10], 9);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setLong(15, ((Number) parms[14]).longValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 15 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 9);
               stmt.setLong(9, ((Number) parms[9]).longValue());
               return;
            case 16 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setLong(5, ((Number) parms[5]).longValue());
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 9);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 24 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 2);
               }
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setDate(8, (java.util.Date)parms[8]);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[12]).byteValue());
               }
               stmt.setString(11, (String)parms[13], 3);
               stmt.setInt(12, ((Number) parms[14]).intValue());
               stmt.setByte(13, ((Number) parms[15]).byteValue());
               stmt.setString(14, (String)parms[16], 1);
               stmt.setString(15, (String)parms[17], 9);
               return;
            case 25 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 2);
               }
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[6]);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[10]).byteValue());
               }
               stmt.setString(9, (String)parms[11], 3);
               stmt.setLong(10, ((Number) parms[12]).longValue());
               stmt.setInt(11, ((Number) parms[13]).intValue());
               stmt.setByte(12, ((Number) parms[14]).byteValue());
               stmt.setString(13, (String)parms[15], 1);
               stmt.setString(14, (String)parms[16], 9);
               stmt.setShort(15, ((Number) parms[17]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 9);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

