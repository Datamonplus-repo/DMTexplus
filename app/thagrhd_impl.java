package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thagrhd_impl extends GXDataArea
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
         A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Histórico de agrupaciones", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtHreBarCod_Internalname ;
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
      nRC_GXsfl_60 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_60"))) ;
      nGXsfl_60_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_60_idx"))) ;
      sGXsfl_60_idx = httpContext.GetPar( "sGXsfl_60_idx") ;
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

   public thagrhd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thagrhd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thagrhd_impl.class ));
   }

   public thagrhd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THAGRHD.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreProCodP_Internalname, GXutil.rtrim( A5864HreProCodP), GXutil.rtrim( localUtil.format( A5864HreProCodP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreProCodP_Jsonclick, 0, "", "", "", "", "", 1, edtHreProCodP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreOrdLinF_Internalname, GXutil.ltrim( localUtil.ntoc( A5865HreOrdLinF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreOrdLinF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5865HreOrdLinF), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5865HreOrdLinF), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreOrdLinF_Jsonclick, 0, "", "", "", "", "", 1, edtHreOrdLinF_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGRHD.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol60( ) ;
      nGXsfl_60_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount860 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_860 = (short)(1) ;
            scanStartSF860( ) ;
            while ( RcdFound860 != 0 )
            {
               init_level_properties860( ) ;
               getByPrimaryKeySF860( ) ;
               addRowSF860( ) ;
               scanNextSF860( ) ;
            }
            scanEndSF860( ) ;
            nBlankRcdCount860 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalSF860( ) ;
         standaloneModalSF860( ) ;
         sMode860 = Gx_mode ;
         while ( nGXsfl_60_idx < nRC_GXsfl_60 )
         {
            bGXsfl_60_Refreshing = true ;
            readRowSF860( ) ;
            edtavnRcdDeleted_860_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_860_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_860_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_860_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_AgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_AgrReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRREO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_AgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRPAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_ProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_PROCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_ProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_OrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_ORDLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_OrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_OrdLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_AgrKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRKGM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrKgm_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_AgrPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRPIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            edtHre_Partid_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_PARTID_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_Partid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_Partid_Enabled), 5, 0), !bGXsfl_60_Refreshing);
            if ( ( nRcdExists_860 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalSF860( ) ;
            }
            sendRowSF860( ) ;
            bGXsfl_60_Refreshing = false ;
         }
         Gx_mode = sMode860 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount860 = (short)(5) ;
         nRcdExists_860 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartSF860( ) ;
            while ( RcdFound860 != 0 )
            {
               sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_60860( ) ;
               init_level_properties860( ) ;
               standaloneNotModalSF860( ) ;
               getByPrimaryKeySF860( ) ;
               standaloneModalSF860( ) ;
               addRowSF860( ) ;
               scanNextSF860( ) ;
            }
            scanEndSF860( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode860 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_60860( ) ;
      initAllSF860( ) ;
      init_level_properties860( ) ;
      nRcdExists_860 = (short)(0) ;
      nIsMod_860 = (short)(0) ;
      nRcdDeleted_860 = (short)(0) ;
      nBlankRcdCount860 = (short)(nBlankRcdUsr860+nBlankRcdCount860) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount860 > 0 )
      {
         standaloneNotModalSF860( ) ;
         standaloneModalSF860( ) ;
         addRowSF860( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHre_AgrCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount860 = (short)(nBlankRcdCount860-1) ;
      }
      Gx_mode = sMode860 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGRHD.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THAGRHD.htm");
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
      e11SF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4492HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4493HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4494HreBarPar = httpContext.cgiGet( "Z4494HreBarPar") ;
            Z4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4495HreNumCie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5864HreProCodP = httpContext.cgiGet( "Z5864HreProCodP") ;
            Z5865HreOrdLinF = (short)(localUtil.ctol( httpContext.cgiGet( "Z5865HreOrdLinF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_60 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_60"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            /* Read variables values. */
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4492HreBarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            }
            else
            {
               A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARREO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarReo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4493HreBarReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            }
            else
            {
               A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            }
            A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENUMCIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreNumCie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4495HreNumCie = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            }
            else
            {
               A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            }
            A5864HreProCodP = httpContext.cgiGet( edtHreProCodP_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreOrdLinF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreOrdLinF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREORDLINF");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreOrdLinF_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5865HreOrdLinF = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
            }
            else
            {
               A5865HreOrdLinF = (short)(localUtil.ctol( httpContext.cgiGet( edtHreOrdLinF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
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
               A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
               A5864HreProCodP = httpContext.GetPar( "HreProCodP") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
               A5865HreOrdLinF = (short)(GXutil.lval( httpContext.GetPar( "HreOrdLinF"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
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
                        e11SF2 ();
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
            initAllSF859( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_860_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_860_Enabled), 5, 0), !bGXsfl_60_Refreshing);
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
      disableAttributesSF859( ) ;
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

   public void confirm_SF0( )
   {
      beforeValidateSF859( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsSF859( ) ;
         }
         else
         {
            checkExtendedTableSF859( ) ;
            if ( AnyError == 0 )
            {
               zmSF859( 2) ;
               zmSF859( 3) ;
            }
            closeExtendedTableCursorsSF859( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode859 = Gx_mode ;
         confirm_SF860( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode859 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode859 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesSF0( ) ;
      }
   }

   public void confirm_SF860( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowSF860( ) ;
         if ( ( nRcdExists_860 != 0 ) || ( nIsMod_860 != 0 ) )
         {
            getKeySF860( ) ;
            if ( ( nRcdExists_860 == 0 ) && ( nRcdDeleted_860 == 0 ) )
            {
               if ( RcdFound860 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateSF860( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableSF860( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsSF860( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HRE_AGRCOD_" + sGXsfl_60_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHre_AgrCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound860 != 0 )
               {
                  if ( nRcdDeleted_860 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeySF860( ) ;
                     loadSF860( ) ;
                     beforeValidateSF860( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsSF860( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_860 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateSF860( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableSF860( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsSF860( ) ;
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
                  if ( nRcdDeleted_860 == 0 )
                  {
                     GXCCtl = "HRE_AGRCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHre_AgrCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_860_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5866Hre_AgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5867Hre_AgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrPar_Internalname, GXutil.rtrim( A5868Hre_AgrPar)) ;
         httpContext.changePostValue( edtHre_ProCod_Internalname, GXutil.rtrim( A5869Hre_ProCod)) ;
         httpContext.changePostValue( edtHre_OrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5870Hre_OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A5871Hre_AgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A5872Hre_AgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_Partid_Internalname, GXutil.ltrim( localUtil.ntoc( A5873Hre_Partid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5866Hre_AgrCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5866Hre_AgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5867Hre_AgrReo_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5867Hre_AgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5868Hre_AgrPar_"+sGXsfl_60_idx, GXutil.rtrim( Z5868Hre_AgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5869Hre_ProCod_"+sGXsfl_60_idx, GXutil.rtrim( Z5869Hre_ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5870Hre_OrdLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5870Hre_OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5871Hre_AgrKgm_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5871Hre_AgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5872Hre_AgrPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5872Hre_AgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5873Hre_Partid_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5873Hre_Partid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_860_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_860_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_860_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_860 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_860_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_860_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_PROCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_ProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_ORDLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_OrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_PARTID_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_Partid_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionSF0( )
   {
   }

   public void e11SF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      GXt_char1 = AV22Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit11", AV22Lit11);
      GXt_char1 = AV23Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit12", AV23Lit12);
      GXt_char1 = AV24Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV053_", ""), (byte)(99), GXv_char2) ;
      thagrhd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit13", AV24Lit13);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thagrhd_impl.this.A396EmprCod = GXv_char2[0] ;
      thagrhd_impl.this.AV11EmprNom = GXv_char3[0] ;
      thagrhd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zmSF859( int GX_JID )
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
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THAGRHD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T00SF6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00SF6_A407EmprNom[0] ;
      n407EmprNom = T00SF6_n407EmprNom[0] ;
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

   public void loadSF859( )
   {
      /* Using cursor T00SF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound859 = (short)(1) ;
         A407EmprNom = T00SF8_A407EmprNom[0] ;
         n407EmprNom = T00SF8_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmSF859( -1) ;
      }
      pr_default.close(6);
      onLoadActionsSF859( ) ;
   }

   public void onLoadActionsSF859( )
   {
   }

   public void checkExtendedTableSF859( )
   {
      nIsDirty_859 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00SF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsSF859( )
   {
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod ,
                         int A4492HreBarCod ,
                         byte A4493HreBarReo ,
                         String A4494HreBarPar ,
                         byte A4495HreNumCie )
   {
      /* Using cursor T00SF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
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

   public void getKeySF859( )
   {
      /* Using cursor T00SF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound859 = (short)(1) ;
      }
      else
      {
         RcdFound859 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00SF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00SF5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmSF859( 1) ;
         RcdFound859 = (short)(1) ;
         A5864HreProCodP = T00SF5_A5864HreProCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = T00SF5_A5865HreOrdLinF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
         A4492HreBarCod = T00SF5_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00SF5_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00SF5_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00SF5_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         sMode859 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadSF859( ) ;
         if ( AnyError == 1 )
         {
            RcdFound859 = (short)(0) ;
            initializeNonKeySF859( ) ;
         }
         Gx_mode = sMode859 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound859 = (short)(0) ;
         initializeNonKeySF859( ) ;
         sMode859 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode859 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeySF859( ) ;
      if ( RcdFound859 == 0 )
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
      RcdFound859 = (short)(0) ;
      /* Using cursor T00SF11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A5864HreProCodP, A5864HreProCodP, Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Short.valueOf(A5865HreOrdLinF), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00SF11_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF11_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF11_A4495HreNumCie[0] < A4495HreNumCie ) || ( T00SF11_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF11_A5864HreProCodP[0], A5864HreProCodP) < 0 ) || ( GXutil.strcmp(T00SF11_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00SF11_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF11_A5865HreOrdLinF[0] < A5865HreOrdLinF ) ) && ( GXutil.strcmp(T00SF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00SF11_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF11_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF11_A4495HreNumCie[0] > A4495HreNumCie ) || ( T00SF11_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF11_A5864HreProCodP[0], A5864HreProCodP) > 0 ) || ( GXutil.strcmp(T00SF11_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00SF11_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF11_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF11_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF11_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF11_A5865HreOrdLinF[0] > A5865HreOrdLinF ) ) && ( GXutil.strcmp(T00SF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T00SF11_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00SF11_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00SF11_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00SF11_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A5864HreProCodP = T00SF11_A5864HreProCodP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
            A5865HreOrdLinF = T00SF11_A5865HreOrdLinF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
            RcdFound859 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound859 = (short)(0) ;
      /* Using cursor T00SF12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A5864HreProCodP, A5864HreProCodP, Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Short.valueOf(A5865HreOrdLinF), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00SF12_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF12_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF12_A4495HreNumCie[0] > A4495HreNumCie ) || ( T00SF12_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF12_A5864HreProCodP[0], A5864HreProCodP) > 0 ) || ( GXutil.strcmp(T00SF12_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00SF12_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF12_A5865HreOrdLinF[0] > A5865HreOrdLinF ) ) && ( GXutil.strcmp(T00SF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00SF12_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF12_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF12_A4495HreNumCie[0] < A4495HreNumCie ) || ( T00SF12_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00SF12_A5864HreProCodP[0], A5864HreProCodP) < 0 ) || ( GXutil.strcmp(T00SF12_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00SF12_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00SF12_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00SF12_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00SF12_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00SF12_A5865HreOrdLinF[0] < A5865HreOrdLinF ) ) && ( GXutil.strcmp(T00SF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T00SF12_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00SF12_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00SF12_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00SF12_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A5864HreProCodP = T00SF12_A5864HreProCodP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
            A5865HreOrdLinF = T00SF12_A5865HreOrdLinF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
            RcdFound859 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeySF859( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertSF859( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound859 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) )
            {
               A4492HreBarCod = Z4492HreBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = Z4493HreBarReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = Z4494HreBarPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = Z4495HreNumCie ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
               A5864HreProCodP = Z5864HreProCodP ;
               httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
               A5865HreOrdLinF = Z5865HreOrdLinF ;
               httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateSF859( ) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertSF859( ) ;
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
                  GX_FocusControl = edtHreBarCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertSF859( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) )
      {
         A4492HreBarCod = Z4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = Z4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = Z4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = Z4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A5864HreProCodP = Z5864HreProCodP ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = Z5865HreOrdLinF ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
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
      getKeySF859( ) ;
      if ( RcdFound859 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) )
         {
            A4492HreBarCod = Z4492HreBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = Z4493HreBarReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = Z4494HreBarPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = Z4495HreNumCie ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A5864HreProCodP = Z5864HreProCodP ;
            httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
            A5865HreOrdLinF = Z5865HreOrdLinF ;
            httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thagrhd");
   }

   public void insert_check( )
   {
      confirm_SF0( ) ;
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
      if ( RcdFound859 == 0 )
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
      scanStartSF859( ) ;
      if ( RcdFound859 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndSF859( ) ;
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
      if ( RcdFound859 == 0 )
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
      if ( RcdFound859 == 0 )
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
      scanStartSF859( ) ;
      if ( RcdFound859 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound859 != 0 )
         {
            scanNextSF859( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndSF859( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencySF859( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SF4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHAGRHD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHAGRHD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSF859( )
   {
      beforeValidateSF859( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSF859( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSF859( 0) ;
         checkOptimisticConcurrencySF859( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSF859( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSF859( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SF13 */
                  pr_default.execute(11, new Object[] {A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGRHD");
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
                        processLevelSF859( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionSF0( ) ;
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
            loadSF859( ) ;
         }
         endLevelSF859( ) ;
      }
      closeExtendedTableCursorsSF859( ) ;
   }

   public void updateSF859( )
   {
      beforeValidateSF859( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSF859( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySF859( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSF859( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateSF859( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPHAGRHD */
                  deferredUpdateSF859( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelSF859( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionSF0( ) ;
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
         endLevelSF859( ) ;
      }
      closeExtendedTableCursorsSF859( ) ;
   }

   public void deferredUpdateSF859( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSF859( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySF859( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSF859( ) ;
         afterConfirmSF859( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSF859( ) ;
            if ( AnyError == 0 )
            {
               scanStartSF860( ) ;
               while ( RcdFound860 != 0 )
               {
                  getByPrimaryKeySF860( ) ;
                  deleteSF860( ) ;
                  scanNextSF860( ) ;
               }
               scanEndSF860( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SF14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGRHD");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound859 == 0 )
                        {
                           initAllSF859( ) ;
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
                        resetCaptionSF0( ) ;
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
      sMode859 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSF859( ) ;
      Gx_mode = sMode859 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSF859( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00SF15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HAGHDP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevelSF860( )
   {
      nGXsfl_60_idx = 0 ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         readRowSF860( ) ;
         if ( ( nRcdExists_860 != 0 ) || ( nIsMod_860 != 0 ) )
         {
            standaloneNotModalSF860( ) ;
            getKeySF860( ) ;
            if ( ( nRcdExists_860 == 0 ) && ( nRcdDeleted_860 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertSF860( ) ;
            }
            else
            {
               if ( RcdFound860 != 0 )
               {
                  if ( ( nRcdDeleted_860 != 0 ) && ( nRcdExists_860 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteSF860( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_860 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateSF860( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_860 == 0 )
                  {
                     GXCCtl = "HRE_AGRCOD_" + sGXsfl_60_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHre_AgrCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_860_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5866Hre_AgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5867Hre_AgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrPar_Internalname, GXutil.rtrim( A5868Hre_AgrPar)) ;
         httpContext.changePostValue( edtHre_ProCod_Internalname, GXutil.rtrim( A5869Hre_ProCod)) ;
         httpContext.changePostValue( edtHre_OrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A5870Hre_OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A5871Hre_AgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgrPie_Internalname, GXutil.ltrim( localUtil.ntoc( A5872Hre_AgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_Partid_Internalname, GXutil.ltrim( localUtil.ntoc( A5873Hre_Partid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5866Hre_AgrCod_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5866Hre_AgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5867Hre_AgrReo_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5867Hre_AgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5868Hre_AgrPar_"+sGXsfl_60_idx, GXutil.rtrim( Z5868Hre_AgrPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5869Hre_ProCod_"+sGXsfl_60_idx, GXutil.rtrim( Z5869Hre_ProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z5870Hre_OrdLin_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5870Hre_OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5871Hre_AgrKgm_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5871Hre_AgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5872Hre_AgrPie_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5872Hre_AgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5873Hre_Partid_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( Z5873Hre_Partid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_860_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_860_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_860_"+sGXsfl_60_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_860 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_860_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_860_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_PROCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_ProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_ORDLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_OrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGRPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_PARTID_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_Partid_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllSF860( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_860 = (short)(0) ;
      nIsMod_860 = (short)(0) ;
      nRcdDeleted_860 = (short)(0) ;
   }

   public void processLevelSF859( )
   {
      /* Save parent mode. */
      sMode859 = Gx_mode ;
      processNestedLevelSF860( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode859 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelSF859( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteSF859( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thagrhd");
         if ( AnyError == 0 )
         {
            confirmValuesSF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thagrhd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartSF859( )
   {
      /* Scan By routine */
      /* Using cursor T00SF16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound859 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound859 = (short)(1) ;
         A4492HreBarCod = T00SF16_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00SF16_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00SF16_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00SF16_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A5864HreProCodP = T00SF16_A5864HreProCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = T00SF16_A5865HreOrdLinF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSF859( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound859 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound859 = (short)(1) ;
         A4492HreBarCod = T00SF16_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00SF16_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00SF16_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00SF16_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A5864HreProCodP = T00SF16_A5864HreProCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = T00SF16_A5865HreOrdLinF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
      }
   }

   public void scanEndSF859( )
   {
      pr_default.close(14);
   }

   public void afterConfirmSF859( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSF859( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSF859( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSF859( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSF859( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSF859( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSF859( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtHreBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarCod_Enabled), 5, 0), true);
      edtHreBarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarReo_Enabled), 5, 0), true);
      edtHreBarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPar_Enabled), 5, 0), true);
      edtHreNumCie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumCie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Enabled), 5, 0), true);
      edtHreProCodP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProCodP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProCodP_Enabled), 5, 0), true);
      edtHreOrdLinF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreOrdLinF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreOrdLinF_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmSF860( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5871Hre_AgrKgm = T00SF3_A5871Hre_AgrKgm[0] ;
            Z5872Hre_AgrPie = T00SF3_A5872Hre_AgrPie[0] ;
            Z5873Hre_Partid = T00SF3_A5873Hre_Partid[0] ;
         }
         else
         {
            Z5871Hre_AgrKgm = A5871Hre_AgrKgm ;
            Z5872Hre_AgrPie = A5872Hre_AgrPie ;
            Z5873Hre_Partid = A5873Hre_Partid ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         Z5866Hre_AgrCod = A5866Hre_AgrCod ;
         Z5867Hre_AgrReo = A5867Hre_AgrReo ;
         Z5868Hre_AgrPar = A5868Hre_AgrPar ;
         Z5869Hre_ProCod = A5869Hre_ProCod ;
         Z5870Hre_OrdLin = A5870Hre_OrdLin ;
         Z5871Hre_AgrKgm = A5871Hre_AgrKgm ;
         Z5872Hre_AgrPie = A5872Hre_AgrPie ;
         Z5873Hre_Partid = A5873Hre_Partid ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalSF860( )
   {
   }

   public void standaloneModalSF860( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgrCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHre_AgrCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgrReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHre_AgrReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgrPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHre_AgrPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_ProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_ProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHre_ProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_ProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_OrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_OrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_OrdLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
      else
      {
         edtHre_OrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_OrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_OrdLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      }
   }

   public void loadSF860( )
   {
      /* Using cursor T00SF17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound860 = (short)(1) ;
         A5871Hre_AgrKgm = T00SF17_A5871Hre_AgrKgm[0] ;
         n5871Hre_AgrKgm = T00SF17_n5871Hre_AgrKgm[0] ;
         A5872Hre_AgrPie = T00SF17_A5872Hre_AgrPie[0] ;
         n5872Hre_AgrPie = T00SF17_n5872Hre_AgrPie[0] ;
         A5873Hre_Partid = T00SF17_A5873Hre_Partid[0] ;
         n5873Hre_Partid = T00SF17_n5873Hre_Partid[0] ;
         zmSF860( -4) ;
      }
      pr_default.close(15);
      onLoadActionsSF860( ) ;
   }

   public void onLoadActionsSF860( )
   {
   }

   public void checkExtendedTableSF860( )
   {
      nIsDirty_860 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalSF860( ) ;
   }

   public void closeExtendedTableCursorsSF860( )
   {
   }

   public void enableDisableSF860( )
   {
   }

   public void getKeySF860( )
   {
      /* Using cursor T00SF18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound860 = (short)(1) ;
      }
      else
      {
         RcdFound860 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKeySF860( )
   {
      /* Using cursor T00SF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00SF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmSF860( 4) ;
         RcdFound860 = (short)(1) ;
         initializeNonKeySF860( ) ;
         A5866Hre_AgrCod = T00SF3_A5866Hre_AgrCod[0] ;
         A5867Hre_AgrReo = T00SF3_A5867Hre_AgrReo[0] ;
         A5868Hre_AgrPar = T00SF3_A5868Hre_AgrPar[0] ;
         A5869Hre_ProCod = T00SF3_A5869Hre_ProCod[0] ;
         A5870Hre_OrdLin = T00SF3_A5870Hre_OrdLin[0] ;
         A5871Hre_AgrKgm = T00SF3_A5871Hre_AgrKgm[0] ;
         n5871Hre_AgrKgm = T00SF3_n5871Hre_AgrKgm[0] ;
         A5872Hre_AgrPie = T00SF3_A5872Hre_AgrPie[0] ;
         n5872Hre_AgrPie = T00SF3_n5872Hre_AgrPie[0] ;
         A5873Hre_Partid = T00SF3_A5873Hre_Partid[0] ;
         n5873Hre_Partid = T00SF3_n5873Hre_Partid[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         Z5866Hre_AgrCod = A5866Hre_AgrCod ;
         Z5867Hre_AgrReo = A5867Hre_AgrReo ;
         Z5868Hre_AgrPar = A5868Hre_AgrPar ;
         Z5869Hre_ProCod = A5869Hre_ProCod ;
         Z5870Hre_OrdLin = A5870Hre_OrdLin ;
         sMode860 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSF860( ) ;
         loadSF860( ) ;
         Gx_mode = sMode860 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound860 = (short)(0) ;
         initializeNonKeySF860( ) ;
         sMode860 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalSF860( ) ;
         Gx_mode = sMode860 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesSF860( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencySF860( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00SF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHAGRH1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5871Hre_AgrKgm, T00SF2_A5871Hre_AgrKgm[0]) != 0 ) || ( Z5872Hre_AgrPie != T00SF2_A5872Hre_AgrPie[0] ) || ( Z5873Hre_Partid != T00SF2_A5873Hre_Partid[0] ) )
         {
            if ( DecimalUtil.compareTo(Z5871Hre_AgrKgm, T00SF2_A5871Hre_AgrKgm[0]) != 0 )
            {
               GXutil.writeLogln("thagrhd:[seudo value changed for attri]"+"Hre_AgrKgm");
               GXutil.writeLogRaw("Old: ",Z5871Hre_AgrKgm);
               GXutil.writeLogRaw("Current: ",T00SF2_A5871Hre_AgrKgm[0]);
            }
            if ( Z5872Hre_AgrPie != T00SF2_A5872Hre_AgrPie[0] )
            {
               GXutil.writeLogln("thagrhd:[seudo value changed for attri]"+"Hre_AgrPie");
               GXutil.writeLogRaw("Old: ",Z5872Hre_AgrPie);
               GXutil.writeLogRaw("Current: ",T00SF2_A5872Hre_AgrPie[0]);
            }
            if ( Z5873Hre_Partid != T00SF2_A5873Hre_Partid[0] )
            {
               GXutil.writeLogln("thagrhd:[seudo value changed for attri]"+"Hre_Partid");
               GXutil.writeLogRaw("Old: ",Z5873Hre_Partid);
               GXutil.writeLogRaw("Current: ",T00SF2_A5873Hre_Partid[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHAGRH1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertSF860( )
   {
      beforeValidateSF860( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSF860( ) ;
      }
      if ( AnyError == 0 )
      {
         zmSF860( 0) ;
         checkOptimisticConcurrencySF860( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmSF860( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertSF860( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00SF19 */
                  pr_default.execute(17, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin), Boolean.valueOf(n5871Hre_AgrKgm), A5871Hre_AgrKgm, Boolean.valueOf(n5872Hre_AgrPie), Short.valueOf(A5872Hre_AgrPie), Boolean.valueOf(n5873Hre_Partid), Integer.valueOf(A5873Hre_Partid), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGRH1");
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
            loadSF860( ) ;
         }
         endLevelSF860( ) ;
      }
      closeExtendedTableCursorsSF860( ) ;
   }

   public void updateSF860( )
   {
      beforeValidateSF860( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableSF860( ) ;
      }
      if ( ( nIsMod_860 != 0 ) || ( nIsDirty_860 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencySF860( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmSF860( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateSF860( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00SF20 */
                     pr_default.execute(18, new Object[] {Boolean.valueOf(n5871Hre_AgrKgm), A5871Hre_AgrKgm, Boolean.valueOf(n5872Hre_AgrPie), Short.valueOf(A5872Hre_AgrPie), Boolean.valueOf(n5873Hre_Partid), Integer.valueOf(A5873Hre_Partid), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGRH1");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHAGRH1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateSF860( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeySF860( ) ;
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
            endLevelSF860( ) ;
         }
      }
      closeExtendedTableCursorsSF860( ) ;
   }

   public void deferredUpdateSF860( )
   {
   }

   public void deleteSF860( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateSF860( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencySF860( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsSF860( ) ;
         afterConfirmSF860( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteSF860( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00SF21 */
               pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5866Hre_AgrCod), Byte.valueOf(A5867Hre_AgrReo), A5868Hre_AgrPar, A5869Hre_ProCod, Short.valueOf(A5870Hre_OrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGRH1");
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
      sMode860 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelSF860( ) ;
      Gx_mode = sMode860 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsSF860( )
   {
      standaloneModalSF860( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelSF860( )
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

   public void scanStartSF860( )
   {
      /* Scan By routine */
      /* Using cursor T00SF22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      RcdFound860 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound860 = (short)(1) ;
         A5866Hre_AgrCod = T00SF22_A5866Hre_AgrCod[0] ;
         A5867Hre_AgrReo = T00SF22_A5867Hre_AgrReo[0] ;
         A5868Hre_AgrPar = T00SF22_A5868Hre_AgrPar[0] ;
         A5869Hre_ProCod = T00SF22_A5869Hre_ProCod[0] ;
         A5870Hre_OrdLin = T00SF22_A5870Hre_OrdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextSF860( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound860 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound860 = (short)(1) ;
         A5866Hre_AgrCod = T00SF22_A5866Hre_AgrCod[0] ;
         A5867Hre_AgrReo = T00SF22_A5867Hre_AgrReo[0] ;
         A5868Hre_AgrPar = T00SF22_A5868Hre_AgrPar[0] ;
         A5869Hre_ProCod = T00SF22_A5869Hre_ProCod[0] ;
         A5870Hre_OrdLin = T00SF22_A5870Hre_OrdLin[0] ;
      }
   }

   public void scanEndSF860( )
   {
      pr_default.close(20);
   }

   public void afterConfirmSF860( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertSF860( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateSF860( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteSF860( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteSF860( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateSF860( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesSF860( )
   {
      edtHre_AgrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_ProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_ProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_OrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_OrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_OrdLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrKgm_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPie_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_Partid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_Partid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_Partid_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void send_integrity_lvl_hashesSF860( )
   {
   }

   public void send_integrity_lvl_hashesSF859( )
   {
   }

   public void subsflControlProps_60860( )
   {
      edtavnRcdDeleted_860_Internalname = "vNRCDDELETED_860_"+sGXsfl_60_idx ;
      edtHre_AgrCod_Internalname = "HRE_AGRCOD_"+sGXsfl_60_idx ;
      edtHre_AgrReo_Internalname = "HRE_AGRREO_"+sGXsfl_60_idx ;
      edtHre_AgrPar_Internalname = "HRE_AGRPAR_"+sGXsfl_60_idx ;
      edtHre_ProCod_Internalname = "HRE_PROCOD_"+sGXsfl_60_idx ;
      edtHre_OrdLin_Internalname = "HRE_ORDLIN_"+sGXsfl_60_idx ;
      edtHre_AgrKgm_Internalname = "HRE_AGRKGM_"+sGXsfl_60_idx ;
      edtHre_AgrPie_Internalname = "HRE_AGRPIE_"+sGXsfl_60_idx ;
      edtHre_Partid_Internalname = "HRE_PARTID_"+sGXsfl_60_idx ;
   }

   public void subsflControlProps_fel_60860( )
   {
      edtavnRcdDeleted_860_Internalname = "vNRCDDELETED_860_"+sGXsfl_60_fel_idx ;
      edtHre_AgrCod_Internalname = "HRE_AGRCOD_"+sGXsfl_60_fel_idx ;
      edtHre_AgrReo_Internalname = "HRE_AGRREO_"+sGXsfl_60_fel_idx ;
      edtHre_AgrPar_Internalname = "HRE_AGRPAR_"+sGXsfl_60_fel_idx ;
      edtHre_ProCod_Internalname = "HRE_PROCOD_"+sGXsfl_60_fel_idx ;
      edtHre_OrdLin_Internalname = "HRE_ORDLIN_"+sGXsfl_60_fel_idx ;
      edtHre_AgrKgm_Internalname = "HRE_AGRKGM_"+sGXsfl_60_fel_idx ;
      edtHre_AgrPie_Internalname = "HRE_AGRPIE_"+sGXsfl_60_fel_idx ;
      edtHre_Partid_Internalname = "HRE_PARTID_"+sGXsfl_60_fel_idx ;
   }

   public void addRowSF860( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60860( ) ;
      sendRowSF860( ) ;
   }

   public void sendRowSF860( )
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
         if ( ((int)((nGXsfl_60_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_860_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_860_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_860), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_860), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_860_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_860_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 62,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgrCod_Internalname,GXutil.ltrim( localUtil.ntoc( A5866Hre_AgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5866Hre_AgrCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgrCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgrReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5867Hre_AgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5867Hre_AgrReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgrReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgrReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgrPar_Internalname,GXutil.rtrim( A5868Hre_AgrPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgrPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgrPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_ProCod_Internalname,GXutil.rtrim( A5869Hre_ProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_ProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_ProCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_OrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5870Hre_OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5870Hre_OrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_OrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_OrdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgrKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A5871Hre_AgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHre_AgrKgm_Enabled!=0) ? localUtil.format( A5871Hre_AgrKgm, "ZZZZZ9.99") : localUtil.format( A5871Hre_AgrKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgrKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgrKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgrPie_Internalname,GXutil.ltrim( localUtil.ntoc( A5872Hre_AgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHre_AgrPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5872Hre_AgrPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5872Hre_AgrPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgrPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgrPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_860_" + sGXsfl_60_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_60_idx + "',60)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_Partid_Internalname,GXutil.ltrim( localUtil.ntoc( A5873Hre_Partid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHre_Partid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5873Hre_Partid), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5873Hre_Partid), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_Partid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_Partid_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesSF860( ) ;
      GXCCtl = "Z5866Hre_AgrCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5866Hre_AgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5867Hre_AgrReo_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5867Hre_AgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5868Hre_AgrPar_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5868Hre_AgrPar));
      GXCCtl = "Z5869Hre_ProCod_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5869Hre_ProCod));
      GXCCtl = "Z5870Hre_OrdLin_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5870Hre_OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5871Hre_AgrKgm_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5871Hre_AgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5872Hre_AgrPie_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5872Hre_AgrPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5873Hre_Partid_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5873Hre_Partid, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_860_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_860_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_860_" + sGXsfl_60_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_860, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_860_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_860_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGRCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGRREO_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGRPAR_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_PROCOD_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_ProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_ORDLIN_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_OrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGRKGM_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGRPIE_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_PARTID_"+sGXsfl_60_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_Partid_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowSF860( )
   {
      nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60860( ) ;
      edtavnRcdDeleted_860_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_860_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgrReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRREO_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgrPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRPAR_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_ProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_PROCOD_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_OrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_ORDLIN_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgrKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRKGM_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgrPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGRPIE_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_Partid_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_PARTID_"+sGXsfl_60_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_860_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_860_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_860");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_860_Internalname ;
         wbErr = true ;
         nRcdDeleted_860 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_860 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_860_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "HRE_AGRCOD_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgrCod_Internalname ;
         wbErr = true ;
         A5866Hre_AgrCod = 0 ;
      }
      else
      {
         A5866Hre_AgrCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHre_AgrCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HRE_AGRREO_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgrReo_Internalname ;
         wbErr = true ;
         A5867Hre_AgrReo = (byte)(0) ;
      }
      else
      {
         A5867Hre_AgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHre_AgrReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5868Hre_AgrPar = httpContext.cgiGet( edtHre_AgrPar_Internalname) ;
      A5869Hre_ProCod = httpContext.cgiGet( edtHre_ProCod_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_OrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_OrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRE_ORDLIN_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_OrdLin_Internalname ;
         wbErr = true ;
         A5870Hre_OrdLin = (short)(0) ;
      }
      else
      {
         A5870Hre_OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHre_OrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHre_AgrKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHre_AgrKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRE_AGRKGM_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgrKgm_Internalname ;
         wbErr = true ;
         A5871Hre_AgrKgm = DecimalUtil.ZERO ;
         n5871Hre_AgrKgm = false ;
      }
      else
      {
         A5871Hre_AgrKgm = localUtil.ctond( httpContext.cgiGet( edtHre_AgrKgm_Internalname)) ;
         n5871Hre_AgrKgm = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRE_AGRPIE_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgrPie_Internalname ;
         wbErr = true ;
         A5872Hre_AgrPie = (short)(0) ;
         n5872Hre_AgrPie = false ;
      }
      else
      {
         A5872Hre_AgrPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHre_AgrPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5872Hre_AgrPie = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_Partid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_Partid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HRE_PARTID_" + sGXsfl_60_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_Partid_Internalname ;
         wbErr = true ;
         A5873Hre_Partid = 0 ;
         n5873Hre_Partid = false ;
      }
      else
      {
         A5873Hre_Partid = (int)(localUtil.ctol( httpContext.cgiGet( edtHre_Partid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5873Hre_Partid = false ;
      }
      GXCCtl = "Z5866Hre_AgrCod_" + sGXsfl_60_idx ;
      Z5866Hre_AgrCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5867Hre_AgrReo_" + sGXsfl_60_idx ;
      Z5867Hre_AgrReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5868Hre_AgrPar_" + sGXsfl_60_idx ;
      Z5868Hre_AgrPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5869Hre_ProCod_" + sGXsfl_60_idx ;
      Z5869Hre_ProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5870Hre_OrdLin_" + sGXsfl_60_idx ;
      Z5870Hre_OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5871Hre_AgrKgm_" + sGXsfl_60_idx ;
      Z5871Hre_AgrKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5872Hre_AgrPie_" + sGXsfl_60_idx ;
      Z5872Hre_AgrPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5873Hre_Partid_" + sGXsfl_60_idx ;
      Z5873Hre_Partid = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_860_" + sGXsfl_60_idx ;
      nRcdDeleted_860 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_860_" + sGXsfl_60_idx ;
      nRcdExists_860 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_860_" + sGXsfl_60_idx ;
      nIsMod_860 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHre_OrdLin_Enabled = edtHre_OrdLin_Enabled ;
      defedtHre_ProCod_Enabled = edtHre_ProCod_Enabled ;
      defedtHre_AgrPar_Enabled = edtHre_AgrPar_Enabled ;
      defedtHre_AgrReo_Enabled = edtHre_AgrReo_Enabled ;
      defedtHre_AgrCod_Enabled = edtHre_AgrCod_Enabled ;
   }

   public void confirmValuesSF0( )
   {
      nGXsfl_60_idx = 0 ;
      sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_60860( ) ;
      while ( nGXsfl_60_idx < nRC_GXsfl_60 )
      {
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60860( ) ;
         httpContext.changePostValue( "Z5866Hre_AgrCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5866Hre_AgrCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5866Hre_AgrCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5867Hre_AgrReo_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5867Hre_AgrReo_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5867Hre_AgrReo_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5868Hre_AgrPar_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5868Hre_AgrPar_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5868Hre_AgrPar_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5869Hre_ProCod_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5869Hre_ProCod_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5869Hre_ProCod_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5870Hre_OrdLin_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5870Hre_OrdLin_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5870Hre_OrdLin_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5871Hre_AgrKgm_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5871Hre_AgrKgm_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5871Hre_AgrKgm_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5872Hre_AgrPie_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5872Hre_AgrPie_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5872Hre_AgrPie_"+sGXsfl_60_idx) ;
         httpContext.changePostValue( "Z5873Hre_Partid_"+sGXsfl_60_idx, httpContext.cgiGet( "ZT_"+"Z5873Hre_Partid_"+sGXsfl_60_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5873Hre_Partid_"+sGXsfl_60_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thagrhd", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5864HreProCodP", GXutil.rtrim( Z5864HreProCodP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5865HreOrdLinF", GXutil.ltrim( localUtil.ntoc( Z5865HreOrdLinF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_60", GXutil.ltrim( localUtil.ntoc( nGXsfl_60_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thagrhd", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THAGRHD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Histórico de agrupaciones", "") ;
   }

   public void initializeNonKeySF859( )
   {
   }

   public void initAllSF859( )
   {
      A4492HreBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      A4493HreBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      A4494HreBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      A4495HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      A5864HreProCodP = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
      A5865HreOrdLinF = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
      initializeNonKeySF859( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeySF860( )
   {
      A5871Hre_AgrKgm = DecimalUtil.ZERO ;
      n5871Hre_AgrKgm = false ;
      A5872Hre_AgrPie = (short)(0) ;
      n5872Hre_AgrPie = false ;
      A5873Hre_Partid = 0 ;
      n5873Hre_Partid = false ;
      Z5871Hre_AgrKgm = DecimalUtil.ZERO ;
      Z5872Hre_AgrPie = (short)(0) ;
      Z5873Hre_Partid = 0 ;
   }

   public void initAllSF860( )
   {
      A5866Hre_AgrCod = 0 ;
      A5867Hre_AgrReo = (byte)(0) ;
      A5868Hre_AgrPar = "" ;
      A5869Hre_ProCod = "" ;
      A5870Hre_OrdLin = (short)(0) ;
      initializeNonKeySF860( ) ;
   }

   public void standaloneModalInsertSF860( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241524174", true, true);
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
      httpContext.AddJavascriptSource("thagrhd.js", "?20268241524174", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties860( )
   {
      edtHre_OrdLin_Enabled = defedtHre_OrdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_OrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_OrdLin_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_ProCod_Enabled = defedtHre_ProCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_ProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_ProCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrPar_Enabled = defedtHre_AgrPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrPar_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrReo_Enabled = defedtHre_AgrReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrReo_Enabled), 5, 0), !bGXsfl_60_Refreshing);
      edtHre_AgrCod_Enabled = defedtHre_AgrCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgrCod_Enabled), 5, 0), !bGXsfl_60_Refreshing);
   }

   public void startgridcontrol60( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_860, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_860_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5866Hre_AgrCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5867Hre_AgrReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5868Hre_AgrPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5869Hre_ProCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_ProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5870Hre_OrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_OrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5871Hre_AgrKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5872Hre_AgrPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgrPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5873Hre_Partid, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_Partid_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHreBarCod_Internalname = "HREBARCOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtHreBarReo_Internalname = "HREBARREO" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtHreBarPar_Internalname = "HREBARPAR" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtHreNumCie_Internalname = "HRENUMCIE" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtHreProCodP_Internalname = "HREPROCODP" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHreOrdLinF_Internalname = "HREORDLINF" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_860_Internalname = "vNRCDDELETED_860" ;
      edtHre_AgrCod_Internalname = "HRE_AGRCOD" ;
      edtHre_AgrReo_Internalname = "HRE_AGRREO" ;
      edtHre_AgrPar_Internalname = "HRE_AGRPAR" ;
      edtHre_ProCod_Internalname = "HRE_PROCOD" ;
      edtHre_OrdLin_Internalname = "HRE_ORDLIN" ;
      edtHre_AgrKgm_Internalname = "HRE_AGRKGM" ;
      edtHre_AgrPie_Internalname = "HRE_AGRPIE" ;
      edtHre_Partid_Internalname = "HRE_PARTID" ;
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
      Form.setCaption( httpContext.getMessage( "Histórico de agrupaciones", "") );
      edtHre_Partid_Jsonclick = "" ;
      edtHre_AgrPie_Jsonclick = "" ;
      edtHre_AgrKgm_Jsonclick = "" ;
      edtHre_OrdLin_Jsonclick = "" ;
      edtHre_ProCod_Jsonclick = "" ;
      edtHre_AgrPar_Jsonclick = "" ;
      edtHre_AgrReo_Jsonclick = "" ;
      edtHre_AgrCod_Jsonclick = "" ;
      edtavnRcdDeleted_860_Jsonclick = "" ;
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
      edtHre_Partid_Enabled = 1 ;
      edtHre_AgrPie_Enabled = 1 ;
      edtHre_AgrKgm_Enabled = 1 ;
      edtHre_OrdLin_Enabled = 1 ;
      edtHre_ProCod_Enabled = 1 ;
      edtHre_AgrPar_Enabled = 1 ;
      edtHre_AgrReo_Enabled = 1 ;
      edtHre_AgrCod_Enabled = 1 ;
      edtavnRcdDeleted_860_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHreOrdLinF_Jsonclick = "" ;
      edtHreOrdLinF_Backcolor = (int)(0xFFFFFF) ;
      edtHreOrdLinF_Enabled = 1 ;
      edtHreProCodP_Jsonclick = "" ;
      edtHreProCodP_Backcolor = (int)(0xFFFFFF) ;
      edtHreProCodP_Enabled = 1 ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreNumCie_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumCie_Enabled = 1 ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarPar_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarPar_Enabled = 1 ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarReo_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarReo_Enabled = 1 ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreBarCod_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarCod_Enabled = 1 ;
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
      subsflControlProps_60860( ) ;
      while ( nGXsfl_60_idx <= nRC_GXsfl_60 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalSF860( ) ;
         standaloneModalSF860( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowSF860( ) ;
         nGXsfl_60_idx = (int)(nGXsfl_60_idx+1) ;
         sGXsfl_60_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_60_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_60860( ) ;
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
      /* Using cursor T00SF23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00SF23_A407EmprNom[0] ;
      n407EmprNom = T00SF23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      /* Using cursor T00SF24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(22);
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

   public void valid_Hrenumcie( )
   {
      /* Using cursor T00SF24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
      }
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hreordlinf( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5864HreProCodP", GXutil.rtrim( Z5864HreProCodP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5865HreOrdLinF", GXutil.ltrim( localUtil.ntoc( Z5865HreOrdLinF, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HREPROCODP","{handler:'valid_Hreprocodp',iparms:[]");
      setEventMetadata("VALID_HREPROCODP",",oparms:[]}");
      setEventMetadata("VALID_HREORDLINF","{handler:'valid_Hreordlinf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A5864HreProCodP',fld:'HREPROCODP',pic:''},{av:'A5865HreOrdLinF',fld:'HREORDLINF',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HREORDLINF",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z5864HreProCodP'},{av:'Z5865HreOrdLinF'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HRE_AGRCOD","{handler:'valid_Hre_agrcod',iparms:[]");
      setEventMetadata("VALID_HRE_AGRCOD",",oparms:[]}");
      setEventMetadata("VALID_HRE_AGRREO","{handler:'valid_Hre_agrreo',iparms:[]");
      setEventMetadata("VALID_HRE_AGRREO",",oparms:[]}");
      setEventMetadata("VALID_HRE_AGRPAR","{handler:'valid_Hre_agrpar',iparms:[]");
      setEventMetadata("VALID_HRE_AGRPAR",",oparms:[]}");
      setEventMetadata("VALID_HRE_PROCOD","{handler:'valid_Hre_procod',iparms:[]");
      setEventMetadata("VALID_HRE_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_HRE_ORDLIN","{handler:'valid_Hre_ordlin',iparms:[]");
      setEventMetadata("VALID_HRE_ORDLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hre_partid',iparms:[]");
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
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z5864HreProCodP = "" ;
      Z5868Hre_AgrPar = "" ;
      Z5869Hre_ProCod = "" ;
      Z5871Hre_AgrKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
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
      A5864HreProCodP = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode860 = "" ;
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
      sMode859 = "" ;
      GXCCtl = "" ;
      A5868Hre_AgrPar = "" ;
      A5869Hre_ProCod = "" ;
      A5871Hre_AgrKgm = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV14Lit2 = "" ;
      AV15Lit3 = "" ;
      AV16Lit4 = "" ;
      AV17Lit5 = "" ;
      AV18Lit6 = "" ;
      AV19Lit7 = "" ;
      AV20Lit8 = "" ;
      AV13Lit9 = "" ;
      AV21Lit10 = "" ;
      AV22Lit11 = "" ;
      AV23Lit12 = "" ;
      AV24Lit13 = "" ;
      GXt_char1 = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      Z407EmprNom = "" ;
      T00SF6_A407EmprNom = new String[] {""} ;
      T00SF6_n407EmprNom = new boolean[] {false} ;
      T00SF8_A5864HreProCodP = new String[] {""} ;
      T00SF8_A5865HreOrdLinF = new short[1] ;
      T00SF8_A407EmprNom = new String[] {""} ;
      T00SF8_n407EmprNom = new boolean[] {false} ;
      T00SF8_A396EmprCod = new String[] {""} ;
      T00SF8_A4492HreBarCod = new int[1] ;
      T00SF8_A4493HreBarReo = new byte[1] ;
      T00SF8_A4494HreBarPar = new String[] {""} ;
      T00SF8_A4495HreNumCie = new byte[1] ;
      T00SF7_A396EmprCod = new String[] {""} ;
      T00SF9_A396EmprCod = new String[] {""} ;
      T00SF10_A396EmprCod = new String[] {""} ;
      T00SF10_A4492HreBarCod = new int[1] ;
      T00SF10_A4493HreBarReo = new byte[1] ;
      T00SF10_A4494HreBarPar = new String[] {""} ;
      T00SF10_A4495HreNumCie = new byte[1] ;
      T00SF10_A5864HreProCodP = new String[] {""} ;
      T00SF10_A5865HreOrdLinF = new short[1] ;
      T00SF5_A5864HreProCodP = new String[] {""} ;
      T00SF5_A5865HreOrdLinF = new short[1] ;
      T00SF5_A396EmprCod = new String[] {""} ;
      T00SF5_A4492HreBarCod = new int[1] ;
      T00SF5_A4493HreBarReo = new byte[1] ;
      T00SF5_A4494HreBarPar = new String[] {""} ;
      T00SF5_A4495HreNumCie = new byte[1] ;
      T00SF11_A396EmprCod = new String[] {""} ;
      T00SF11_A4492HreBarCod = new int[1] ;
      T00SF11_A4493HreBarReo = new byte[1] ;
      T00SF11_A4494HreBarPar = new String[] {""} ;
      T00SF11_A4495HreNumCie = new byte[1] ;
      T00SF11_A5864HreProCodP = new String[] {""} ;
      T00SF11_A5865HreOrdLinF = new short[1] ;
      T00SF12_A396EmprCod = new String[] {""} ;
      T00SF12_A4492HreBarCod = new int[1] ;
      T00SF12_A4493HreBarReo = new byte[1] ;
      T00SF12_A4494HreBarPar = new String[] {""} ;
      T00SF12_A4495HreNumCie = new byte[1] ;
      T00SF12_A5864HreProCodP = new String[] {""} ;
      T00SF12_A5865HreOrdLinF = new short[1] ;
      T00SF4_A5864HreProCodP = new String[] {""} ;
      T00SF4_A5865HreOrdLinF = new short[1] ;
      T00SF4_A396EmprCod = new String[] {""} ;
      T00SF4_A4492HreBarCod = new int[1] ;
      T00SF4_A4493HreBarReo = new byte[1] ;
      T00SF4_A4494HreBarPar = new String[] {""} ;
      T00SF4_A4495HreNumCie = new byte[1] ;
      T00SF15_A396EmprCod = new String[] {""} ;
      T00SF15_A4492HreBarCod = new int[1] ;
      T00SF15_A4493HreBarReo = new byte[1] ;
      T00SF15_A4494HreBarPar = new String[] {""} ;
      T00SF15_A4495HreNumCie = new byte[1] ;
      T00SF15_A5864HreProCodP = new String[] {""} ;
      T00SF15_A5865HreOrdLinF = new short[1] ;
      T00SF15_A5980HreNumPda = new int[1] ;
      T00SF16_A396EmprCod = new String[] {""} ;
      T00SF16_A4492HreBarCod = new int[1] ;
      T00SF16_A4493HreBarReo = new byte[1] ;
      T00SF16_A4494HreBarPar = new String[] {""} ;
      T00SF16_A4495HreNumCie = new byte[1] ;
      T00SF16_A5864HreProCodP = new String[] {""} ;
      T00SF16_A5865HreOrdLinF = new short[1] ;
      T00SF17_A4492HreBarCod = new int[1] ;
      T00SF17_A4493HreBarReo = new byte[1] ;
      T00SF17_A4494HreBarPar = new String[] {""} ;
      T00SF17_A4495HreNumCie = new byte[1] ;
      T00SF17_A5864HreProCodP = new String[] {""} ;
      T00SF17_A5865HreOrdLinF = new short[1] ;
      T00SF17_A5866Hre_AgrCod = new int[1] ;
      T00SF17_A5867Hre_AgrReo = new byte[1] ;
      T00SF17_A5868Hre_AgrPar = new String[] {""} ;
      T00SF17_A5869Hre_ProCod = new String[] {""} ;
      T00SF17_A5870Hre_OrdLin = new short[1] ;
      T00SF17_A5871Hre_AgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SF17_n5871Hre_AgrKgm = new boolean[] {false} ;
      T00SF17_A5872Hre_AgrPie = new short[1] ;
      T00SF17_n5872Hre_AgrPie = new boolean[] {false} ;
      T00SF17_A5873Hre_Partid = new int[1] ;
      T00SF17_n5873Hre_Partid = new boolean[] {false} ;
      T00SF17_A396EmprCod = new String[] {""} ;
      T00SF18_A396EmprCod = new String[] {""} ;
      T00SF18_A4492HreBarCod = new int[1] ;
      T00SF18_A4493HreBarReo = new byte[1] ;
      T00SF18_A4494HreBarPar = new String[] {""} ;
      T00SF18_A4495HreNumCie = new byte[1] ;
      T00SF18_A5864HreProCodP = new String[] {""} ;
      T00SF18_A5865HreOrdLinF = new short[1] ;
      T00SF18_A5866Hre_AgrCod = new int[1] ;
      T00SF18_A5867Hre_AgrReo = new byte[1] ;
      T00SF18_A5868Hre_AgrPar = new String[] {""} ;
      T00SF18_A5869Hre_ProCod = new String[] {""} ;
      T00SF18_A5870Hre_OrdLin = new short[1] ;
      T00SF3_A4492HreBarCod = new int[1] ;
      T00SF3_A4493HreBarReo = new byte[1] ;
      T00SF3_A4494HreBarPar = new String[] {""} ;
      T00SF3_A4495HreNumCie = new byte[1] ;
      T00SF3_A5864HreProCodP = new String[] {""} ;
      T00SF3_A5865HreOrdLinF = new short[1] ;
      T00SF3_A5866Hre_AgrCod = new int[1] ;
      T00SF3_A5867Hre_AgrReo = new byte[1] ;
      T00SF3_A5868Hre_AgrPar = new String[] {""} ;
      T00SF3_A5869Hre_ProCod = new String[] {""} ;
      T00SF3_A5870Hre_OrdLin = new short[1] ;
      T00SF3_A5871Hre_AgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SF3_n5871Hre_AgrKgm = new boolean[] {false} ;
      T00SF3_A5872Hre_AgrPie = new short[1] ;
      T00SF3_n5872Hre_AgrPie = new boolean[] {false} ;
      T00SF3_A5873Hre_Partid = new int[1] ;
      T00SF3_n5873Hre_Partid = new boolean[] {false} ;
      T00SF3_A396EmprCod = new String[] {""} ;
      T00SF2_A4492HreBarCod = new int[1] ;
      T00SF2_A4493HreBarReo = new byte[1] ;
      T00SF2_A4494HreBarPar = new String[] {""} ;
      T00SF2_A4495HreNumCie = new byte[1] ;
      T00SF2_A5864HreProCodP = new String[] {""} ;
      T00SF2_A5865HreOrdLinF = new short[1] ;
      T00SF2_A5866Hre_AgrCod = new int[1] ;
      T00SF2_A5867Hre_AgrReo = new byte[1] ;
      T00SF2_A5868Hre_AgrPar = new String[] {""} ;
      T00SF2_A5869Hre_ProCod = new String[] {""} ;
      T00SF2_A5870Hre_OrdLin = new short[1] ;
      T00SF2_A5871Hre_AgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00SF2_n5871Hre_AgrKgm = new boolean[] {false} ;
      T00SF2_A5872Hre_AgrPie = new short[1] ;
      T00SF2_n5872Hre_AgrPie = new boolean[] {false} ;
      T00SF2_A5873Hre_Partid = new int[1] ;
      T00SF2_n5873Hre_Partid = new boolean[] {false} ;
      T00SF2_A396EmprCod = new String[] {""} ;
      T00SF22_A396EmprCod = new String[] {""} ;
      T00SF22_A4492HreBarCod = new int[1] ;
      T00SF22_A4493HreBarReo = new byte[1] ;
      T00SF22_A4494HreBarPar = new String[] {""} ;
      T00SF22_A4495HreNumCie = new byte[1] ;
      T00SF22_A5864HreProCodP = new String[] {""} ;
      T00SF22_A5865HreOrdLinF = new short[1] ;
      T00SF22_A5866Hre_AgrCod = new int[1] ;
      T00SF22_A5867Hre_AgrReo = new byte[1] ;
      T00SF22_A5868Hre_AgrPar = new String[] {""} ;
      T00SF22_A5869Hre_ProCod = new String[] {""} ;
      T00SF22_A5870Hre_OrdLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00SF23_A407EmprNom = new String[] {""} ;
      T00SF23_n407EmprNom = new boolean[] {false} ;
      T00SF24_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ5864HreProCodP = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thagrhd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thagrhd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thagrhd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thagrhd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thagrhd__default(),
         new Object[] {
             new Object[] {
            T00SF2_A4492HreBarCod, T00SF2_A4493HreBarReo, T00SF2_A4494HreBarPar, T00SF2_A4495HreNumCie, T00SF2_A5864HreProCodP, T00SF2_A5865HreOrdLinF, T00SF2_A5866Hre_AgrCod, T00SF2_A5867Hre_AgrReo, T00SF2_A5868Hre_AgrPar, T00SF2_A5869Hre_ProCod,
            T00SF2_A5870Hre_OrdLin, T00SF2_A5871Hre_AgrKgm, T00SF2_n5871Hre_AgrKgm, T00SF2_A5872Hre_AgrPie, T00SF2_n5872Hre_AgrPie, T00SF2_A5873Hre_Partid, T00SF2_n5873Hre_Partid, T00SF2_A396EmprCod
            }
            , new Object[] {
            T00SF3_A4492HreBarCod, T00SF3_A4493HreBarReo, T00SF3_A4494HreBarPar, T00SF3_A4495HreNumCie, T00SF3_A5864HreProCodP, T00SF3_A5865HreOrdLinF, T00SF3_A5866Hre_AgrCod, T00SF3_A5867Hre_AgrReo, T00SF3_A5868Hre_AgrPar, T00SF3_A5869Hre_ProCod,
            T00SF3_A5870Hre_OrdLin, T00SF3_A5871Hre_AgrKgm, T00SF3_n5871Hre_AgrKgm, T00SF3_A5872Hre_AgrPie, T00SF3_n5872Hre_AgrPie, T00SF3_A5873Hre_Partid, T00SF3_n5873Hre_Partid, T00SF3_A396EmprCod
            }
            , new Object[] {
            T00SF4_A5864HreProCodP, T00SF4_A5865HreOrdLinF, T00SF4_A396EmprCod, T00SF4_A4492HreBarCod, T00SF4_A4493HreBarReo, T00SF4_A4494HreBarPar, T00SF4_A4495HreNumCie
            }
            , new Object[] {
            T00SF5_A5864HreProCodP, T00SF5_A5865HreOrdLinF, T00SF5_A396EmprCod, T00SF5_A4492HreBarCod, T00SF5_A4493HreBarReo, T00SF5_A4494HreBarPar, T00SF5_A4495HreNumCie
            }
            , new Object[] {
            T00SF6_A407EmprNom, T00SF6_n407EmprNom
            }
            , new Object[] {
            T00SF7_A396EmprCod
            }
            , new Object[] {
            T00SF8_A5864HreProCodP, T00SF8_A5865HreOrdLinF, T00SF8_A407EmprNom, T00SF8_n407EmprNom, T00SF8_A396EmprCod, T00SF8_A4492HreBarCod, T00SF8_A4493HreBarReo, T00SF8_A4494HreBarPar, T00SF8_A4495HreNumCie
            }
            , new Object[] {
            T00SF9_A396EmprCod
            }
            , new Object[] {
            T00SF10_A396EmprCod, T00SF10_A4492HreBarCod, T00SF10_A4493HreBarReo, T00SF10_A4494HreBarPar, T00SF10_A4495HreNumCie, T00SF10_A5864HreProCodP, T00SF10_A5865HreOrdLinF
            }
            , new Object[] {
            T00SF11_A396EmprCod, T00SF11_A4492HreBarCod, T00SF11_A4493HreBarReo, T00SF11_A4494HreBarPar, T00SF11_A4495HreNumCie, T00SF11_A5864HreProCodP, T00SF11_A5865HreOrdLinF
            }
            , new Object[] {
            T00SF12_A396EmprCod, T00SF12_A4492HreBarCod, T00SF12_A4493HreBarReo, T00SF12_A4494HreBarPar, T00SF12_A4495HreNumCie, T00SF12_A5864HreProCodP, T00SF12_A5865HreOrdLinF
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SF15_A396EmprCod, T00SF15_A4492HreBarCod, T00SF15_A4493HreBarReo, T00SF15_A4494HreBarPar, T00SF15_A4495HreNumCie, T00SF15_A5864HreProCodP, T00SF15_A5865HreOrdLinF, T00SF15_A5980HreNumPda
            }
            , new Object[] {
            T00SF16_A396EmprCod, T00SF16_A4492HreBarCod, T00SF16_A4493HreBarReo, T00SF16_A4494HreBarPar, T00SF16_A4495HreNumCie, T00SF16_A5864HreProCodP, T00SF16_A5865HreOrdLinF
            }
            , new Object[] {
            T00SF17_A4492HreBarCod, T00SF17_A4493HreBarReo, T00SF17_A4494HreBarPar, T00SF17_A4495HreNumCie, T00SF17_A5864HreProCodP, T00SF17_A5865HreOrdLinF, T00SF17_A5866Hre_AgrCod, T00SF17_A5867Hre_AgrReo, T00SF17_A5868Hre_AgrPar, T00SF17_A5869Hre_ProCod,
            T00SF17_A5870Hre_OrdLin, T00SF17_A5871Hre_AgrKgm, T00SF17_n5871Hre_AgrKgm, T00SF17_A5872Hre_AgrPie, T00SF17_n5872Hre_AgrPie, T00SF17_A5873Hre_Partid, T00SF17_n5873Hre_Partid, T00SF17_A396EmprCod
            }
            , new Object[] {
            T00SF18_A396EmprCod, T00SF18_A4492HreBarCod, T00SF18_A4493HreBarReo, T00SF18_A4494HreBarPar, T00SF18_A4495HreNumCie, T00SF18_A5864HreProCodP, T00SF18_A5865HreOrdLinF, T00SF18_A5866Hre_AgrCod, T00SF18_A5867Hre_AgrReo, T00SF18_A5868Hre_AgrPar,
            T00SF18_A5869Hre_ProCod, T00SF18_A5870Hre_OrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00SF22_A396EmprCod, T00SF22_A4492HreBarCod, T00SF22_A4493HreBarReo, T00SF22_A4494HreBarPar, T00SF22_A4495HreNumCie, T00SF22_A5864HreProCodP, T00SF22_A5865HreOrdLinF, T00SF22_A5866Hre_AgrCod, T00SF22_A5867Hre_AgrReo, T00SF22_A5868Hre_AgrPar,
            T00SF22_A5869Hre_ProCod, T00SF22_A5870Hre_OrdLin
            }
            , new Object[] {
            T00SF23_A407EmprNom, T00SF23_n407EmprNom
            }
            , new Object[] {
            T00SF24_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THAGRHD" ;
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z5867Hre_AgrReo ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte A5867Hre_AgrReo ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private short Z5865HreOrdLinF ;
   private short Z5870Hre_OrdLin ;
   private short Z5872Hre_AgrPie ;
   private short nRcdDeleted_860 ;
   private short nRcdExists_860 ;
   private short nIsMod_860 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5865HreOrdLinF ;
   private short nBlankRcdCount860 ;
   private short RcdFound860 ;
   private short nBlankRcdUsr860 ;
   private short A5870Hre_OrdLin ;
   private short A5872Hre_AgrPie ;
   private short RcdFound859 ;
   private short nIsDirty_859 ;
   private short nIsDirty_860 ;
   private short ZZ5865HreOrdLinF ;
   private int Z4492HreBarCod ;
   private int nRC_GXsfl_60 ;
   private int nGXsfl_60_idx=1 ;
   private int Z5866Hre_AgrCod ;
   private int Z5873Hre_Partid ;
   private int A4492HreBarCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtHreBarCod_Enabled ;
   private int edtHreBarReo_Enabled ;
   private int edtHreBarPar_Enabled ;
   private int edtHreNumCie_Enabled ;
   private int edtHreProCodP_Enabled ;
   private int edtHreOrdLinF_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_860_Enabled ;
   private int edtHre_AgrCod_Enabled ;
   private int edtHre_AgrReo_Enabled ;
   private int edtHre_AgrPar_Enabled ;
   private int edtHre_ProCod_Enabled ;
   private int edtHre_OrdLin_Enabled ;
   private int edtHre_AgrKgm_Enabled ;
   private int edtHre_AgrPie_Enabled ;
   private int edtHre_Partid_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A5866Hre_AgrCod ;
   private int A5873Hre_Partid ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHre_OrdLin_Enabled ;
   private int defedtHre_ProCod_Enabled ;
   private int defedtHre_AgrPar_Enabled ;
   private int defedtHre_AgrReo_Enabled ;
   private int defedtHre_AgrCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHreOrdLinF_Backcolor ;
   private int edtHreProCodP_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4492HreBarCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5871Hre_AgrKgm ;
   private java.math.BigDecimal A5871Hre_AgrKgm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z5864HreProCodP ;
   private String Z5868Hre_AgrPar ;
   private String Z5869Hre_ProCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHreBarCod_Internalname ;
   private String sGXsfl_60_idx="0001" ;
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
   private String edtHreBarCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtHreBarReo_Internalname ;
   private String edtHreBarReo_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtHreBarPar_Internalname ;
   private String edtHreBarPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtHreProCodP_Internalname ;
   private String A5864HreProCodP ;
   private String edtHreProCodP_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreOrdLinF_Internalname ;
   private String edtHreOrdLinF_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode860 ;
   private String edtavnRcdDeleted_860_Internalname ;
   private String edtHre_AgrCod_Internalname ;
   private String edtHre_AgrReo_Internalname ;
   private String edtHre_AgrPar_Internalname ;
   private String edtHre_ProCod_Internalname ;
   private String edtHre_OrdLin_Internalname ;
   private String edtHre_AgrKgm_Internalname ;
   private String edtHre_AgrPie_Internalname ;
   private String edtHre_Partid_Internalname ;
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
   private String sMode859 ;
   private String GXCCtl ;
   private String A5868Hre_AgrPar ;
   private String A5869Hre_ProCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV14Lit2 ;
   private String AV15Lit3 ;
   private String AV16Lit4 ;
   private String AV17Lit5 ;
   private String AV18Lit6 ;
   private String AV19Lit7 ;
   private String AV20Lit8 ;
   private String AV13Lit9 ;
   private String AV21Lit10 ;
   private String AV22Lit11 ;
   private String AV23Lit12 ;
   private String AV24Lit13 ;
   private String GXt_char1 ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_60_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_860_Jsonclick ;
   private String edtHre_AgrCod_Jsonclick ;
   private String edtHre_AgrReo_Jsonclick ;
   private String edtHre_AgrPar_Jsonclick ;
   private String edtHre_ProCod_Jsonclick ;
   private String edtHre_OrdLin_Jsonclick ;
   private String edtHre_AgrKgm_Jsonclick ;
   private String edtHre_AgrPie_Jsonclick ;
   private String edtHre_Partid_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ5864HreProCodP ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_60_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n5871Hre_AgrKgm ;
   private boolean n5872Hre_AgrPie ;
   private boolean n5873Hre_Partid ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00SF6_A407EmprNom ;
   private boolean[] T00SF6_n407EmprNom ;
   private String[] T00SF8_A5864HreProCodP ;
   private short[] T00SF8_A5865HreOrdLinF ;
   private String[] T00SF8_A407EmprNom ;
   private boolean[] T00SF8_n407EmprNom ;
   private String[] T00SF8_A396EmprCod ;
   private int[] T00SF8_A4492HreBarCod ;
   private byte[] T00SF8_A4493HreBarReo ;
   private String[] T00SF8_A4494HreBarPar ;
   private byte[] T00SF8_A4495HreNumCie ;
   private String[] T00SF7_A396EmprCod ;
   private String[] T00SF9_A396EmprCod ;
   private String[] T00SF10_A396EmprCod ;
   private int[] T00SF10_A4492HreBarCod ;
   private byte[] T00SF10_A4493HreBarReo ;
   private String[] T00SF10_A4494HreBarPar ;
   private byte[] T00SF10_A4495HreNumCie ;
   private String[] T00SF10_A5864HreProCodP ;
   private short[] T00SF10_A5865HreOrdLinF ;
   private String[] T00SF5_A5864HreProCodP ;
   private short[] T00SF5_A5865HreOrdLinF ;
   private String[] T00SF5_A396EmprCod ;
   private int[] T00SF5_A4492HreBarCod ;
   private byte[] T00SF5_A4493HreBarReo ;
   private String[] T00SF5_A4494HreBarPar ;
   private byte[] T00SF5_A4495HreNumCie ;
   private String[] T00SF11_A396EmprCod ;
   private int[] T00SF11_A4492HreBarCod ;
   private byte[] T00SF11_A4493HreBarReo ;
   private String[] T00SF11_A4494HreBarPar ;
   private byte[] T00SF11_A4495HreNumCie ;
   private String[] T00SF11_A5864HreProCodP ;
   private short[] T00SF11_A5865HreOrdLinF ;
   private String[] T00SF12_A396EmprCod ;
   private int[] T00SF12_A4492HreBarCod ;
   private byte[] T00SF12_A4493HreBarReo ;
   private String[] T00SF12_A4494HreBarPar ;
   private byte[] T00SF12_A4495HreNumCie ;
   private String[] T00SF12_A5864HreProCodP ;
   private short[] T00SF12_A5865HreOrdLinF ;
   private String[] T00SF4_A5864HreProCodP ;
   private short[] T00SF4_A5865HreOrdLinF ;
   private String[] T00SF4_A396EmprCod ;
   private int[] T00SF4_A4492HreBarCod ;
   private byte[] T00SF4_A4493HreBarReo ;
   private String[] T00SF4_A4494HreBarPar ;
   private byte[] T00SF4_A4495HreNumCie ;
   private String[] T00SF15_A396EmprCod ;
   private int[] T00SF15_A4492HreBarCod ;
   private byte[] T00SF15_A4493HreBarReo ;
   private String[] T00SF15_A4494HreBarPar ;
   private byte[] T00SF15_A4495HreNumCie ;
   private String[] T00SF15_A5864HreProCodP ;
   private short[] T00SF15_A5865HreOrdLinF ;
   private int[] T00SF15_A5980HreNumPda ;
   private String[] T00SF16_A396EmprCod ;
   private int[] T00SF16_A4492HreBarCod ;
   private byte[] T00SF16_A4493HreBarReo ;
   private String[] T00SF16_A4494HreBarPar ;
   private byte[] T00SF16_A4495HreNumCie ;
   private String[] T00SF16_A5864HreProCodP ;
   private short[] T00SF16_A5865HreOrdLinF ;
   private int[] T00SF17_A4492HreBarCod ;
   private byte[] T00SF17_A4493HreBarReo ;
   private String[] T00SF17_A4494HreBarPar ;
   private byte[] T00SF17_A4495HreNumCie ;
   private String[] T00SF17_A5864HreProCodP ;
   private short[] T00SF17_A5865HreOrdLinF ;
   private int[] T00SF17_A5866Hre_AgrCod ;
   private byte[] T00SF17_A5867Hre_AgrReo ;
   private String[] T00SF17_A5868Hre_AgrPar ;
   private String[] T00SF17_A5869Hre_ProCod ;
   private short[] T00SF17_A5870Hre_OrdLin ;
   private java.math.BigDecimal[] T00SF17_A5871Hre_AgrKgm ;
   private boolean[] T00SF17_n5871Hre_AgrKgm ;
   private short[] T00SF17_A5872Hre_AgrPie ;
   private boolean[] T00SF17_n5872Hre_AgrPie ;
   private int[] T00SF17_A5873Hre_Partid ;
   private boolean[] T00SF17_n5873Hre_Partid ;
   private String[] T00SF17_A396EmprCod ;
   private String[] T00SF18_A396EmprCod ;
   private int[] T00SF18_A4492HreBarCod ;
   private byte[] T00SF18_A4493HreBarReo ;
   private String[] T00SF18_A4494HreBarPar ;
   private byte[] T00SF18_A4495HreNumCie ;
   private String[] T00SF18_A5864HreProCodP ;
   private short[] T00SF18_A5865HreOrdLinF ;
   private int[] T00SF18_A5866Hre_AgrCod ;
   private byte[] T00SF18_A5867Hre_AgrReo ;
   private String[] T00SF18_A5868Hre_AgrPar ;
   private String[] T00SF18_A5869Hre_ProCod ;
   private short[] T00SF18_A5870Hre_OrdLin ;
   private int[] T00SF3_A4492HreBarCod ;
   private byte[] T00SF3_A4493HreBarReo ;
   private String[] T00SF3_A4494HreBarPar ;
   private byte[] T00SF3_A4495HreNumCie ;
   private String[] T00SF3_A5864HreProCodP ;
   private short[] T00SF3_A5865HreOrdLinF ;
   private int[] T00SF3_A5866Hre_AgrCod ;
   private byte[] T00SF3_A5867Hre_AgrReo ;
   private String[] T00SF3_A5868Hre_AgrPar ;
   private String[] T00SF3_A5869Hre_ProCod ;
   private short[] T00SF3_A5870Hre_OrdLin ;
   private java.math.BigDecimal[] T00SF3_A5871Hre_AgrKgm ;
   private boolean[] T00SF3_n5871Hre_AgrKgm ;
   private short[] T00SF3_A5872Hre_AgrPie ;
   private boolean[] T00SF3_n5872Hre_AgrPie ;
   private int[] T00SF3_A5873Hre_Partid ;
   private boolean[] T00SF3_n5873Hre_Partid ;
   private String[] T00SF3_A396EmprCod ;
   private int[] T00SF2_A4492HreBarCod ;
   private byte[] T00SF2_A4493HreBarReo ;
   private String[] T00SF2_A4494HreBarPar ;
   private byte[] T00SF2_A4495HreNumCie ;
   private String[] T00SF2_A5864HreProCodP ;
   private short[] T00SF2_A5865HreOrdLinF ;
   private int[] T00SF2_A5866Hre_AgrCod ;
   private byte[] T00SF2_A5867Hre_AgrReo ;
   private String[] T00SF2_A5868Hre_AgrPar ;
   private String[] T00SF2_A5869Hre_ProCod ;
   private short[] T00SF2_A5870Hre_OrdLin ;
   private java.math.BigDecimal[] T00SF2_A5871Hre_AgrKgm ;
   private boolean[] T00SF2_n5871Hre_AgrKgm ;
   private short[] T00SF2_A5872Hre_AgrPie ;
   private boolean[] T00SF2_n5872Hre_AgrPie ;
   private int[] T00SF2_A5873Hre_Partid ;
   private boolean[] T00SF2_n5873Hre_Partid ;
   private String[] T00SF2_A396EmprCod ;
   private String[] T00SF22_A396EmprCod ;
   private int[] T00SF22_A4492HreBarCod ;
   private byte[] T00SF22_A4493HreBarReo ;
   private String[] T00SF22_A4494HreBarPar ;
   private byte[] T00SF22_A4495HreNumCie ;
   private String[] T00SF22_A5864HreProCodP ;
   private short[] T00SF22_A5865HreOrdLinF ;
   private int[] T00SF22_A5866Hre_AgrCod ;
   private byte[] T00SF22_A5867Hre_AgrReo ;
   private String[] T00SF22_A5868Hre_AgrPar ;
   private String[] T00SF22_A5869Hre_ProCod ;
   private short[] T00SF22_A5870Hre_OrdLin ;
   private String[] T00SF23_A407EmprNom ;
   private boolean[] T00SF23_n407EmprNom ;
   private String[] T00SF24_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thagrhd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thagrhd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thagrhd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thagrhd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thagrhd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00SF2", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin, Hre_AgrKgm, Hre_AgrPie, Hre_Partid, EmprCod FROM TXPHAGRH1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND Hre_AgrCod = ? AND Hre_AgrReo = ? AND Hre_AgrPar = ? AND Hre_ProCod = ? AND Hre_OrdLin = ?  FOR UPDATE OF Hre_AgrKgm, Hre_AgrPie, Hre_Partid NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF3", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin, Hre_AgrKgm, Hre_AgrPie, Hre_Partid, EmprCod FROM TXPHAGRH1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND Hre_AgrCod = ? AND Hre_AgrReo = ? AND Hre_AgrPar = ? AND Hre_ProCod = ? AND Hre_OrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF4", "SELECT HreProCodP, HreOrdLinF, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ?  FOR UPDATE OF HreProCodP NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF5", "SELECT HreProCodP, HreOrdLinF, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF7", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF8", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreProCodP, TM1.HreOrdLinF, T2.EmprNom, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM (TXPHAGRHD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreProCodP = ? and TM1.HreOrdLinF = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreProCodP, TM1.HreOrdLinF ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF9", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGRHD WHERE ( HreBarCod > ? or HreBarCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreProCodP > ? or HreProCodP = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreOrdLinF > ?) and EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SF12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGRHD WHERE ( HreBarCod < ? or HreBarCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreProCodP < ? or HreProCodP = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreOrdLinF < ?) and EmprCod = ? ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreProCodP DESC, HreOrdLinF DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00SF13", "INSERT INTO TXPHAGRHD(HreProCodP, HreOrdLinF, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHAGRHD")
         ,new UpdateCursor("T00SF14", "DELETE FROM TXPHAGRHD  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ?", GX_NOMASK, "TXPHAGRHD")
         ,new ForEachCursor("T00SF15", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda FROM TXPHAGHDP WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00SF16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGRHD WHERE EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF17", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin, Hre_AgrKgm, Hre_AgrPie, Hre_Partid, EmprCod FROM TXPHAGRH1 WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreProCodP = ? and HreOrdLinF = ? and Hre_AgrCod = ? and Hre_AgrReo = ? and Hre_AgrPar = ? and Hre_ProCod = ? and Hre_OrdLin = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF18", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin FROM TXPHAGRH1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND Hre_AgrCod = ? AND Hre_AgrReo = ? AND Hre_AgrPar = ? AND Hre_ProCod = ? AND Hre_OrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00SF19", "INSERT INTO TXPHAGRH1(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin, Hre_AgrKgm, Hre_AgrPie, Hre_Partid, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHAGRH1")
         ,new UpdateCursor("T00SF20", "UPDATE TXPHAGRH1 SET Hre_AgrKgm=?, Hre_AgrPie=?, Hre_Partid=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND Hre_AgrCod = ? AND Hre_AgrReo = ? AND Hre_AgrPar = ? AND Hre_ProCod = ? AND Hre_OrdLin = ?", GX_NOMASK, "TXPHAGRH1")
         ,new UpdateCursor("T00SF21", "DELETE FROM TXPHAGRH1  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND Hre_AgrCod = ? AND Hre_AgrReo = ? AND Hre_AgrPar = ? AND Hre_ProCod = ? AND Hre_OrdLin = ?", GX_NOMASK, "TXPHAGRH1")
         ,new ForEachCursor("T00SF22", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin FROM TXPHAGRH1 WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreProCodP = ? and HreOrdLinF = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, Hre_AgrCod, Hre_AgrReo, Hre_AgrPar, Hre_ProCod, Hre_OrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00SF24", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(14);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(15, 3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
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
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
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
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 3);
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
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 1);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 8);
               stmt.setString(16, (String)parms[15], 8);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[16]).intValue());
               }
               stmt.setString(15, (String)parms[17], 3);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
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
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               stmt.setString(7, (String)parms[9], 1);
               stmt.setByte(8, ((Number) parms[10]).byteValue());
               stmt.setString(9, (String)parms[11], 8);
               stmt.setShort(10, ((Number) parms[12]).shortValue());
               stmt.setInt(11, ((Number) parms[13]).intValue());
               stmt.setByte(12, ((Number) parms[14]).byteValue());
               stmt.setString(13, (String)parms[15], 1);
               stmt.setString(14, (String)parms[16], 8);
               stmt.setShort(15, ((Number) parms[17]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

