package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thaghdp_impl extends GXDataArea
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
         A5864HreProCodP = httpContext.GetPar( "HreProCodP") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = (short)(GXutil.lval( httpContext.GetPar( "HreOrdLinF"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A5864HreProCodP, A5865HreOrdLinF) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO AGRUPACIONES P/PDA", ""), (short)(0)) ;
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
      nRC_GXsfl_65 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_65"))) ;
      nGXsfl_65_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_65_idx"))) ;
      sGXsfl_65_idx = httpContext.GetPar( "sGXsfl_65_idx") ;
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

   public thaghdp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thaghdp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thaghdp_impl.class ));
   }

   public thaghdp_impl( int remoteHandle ,
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
      /* Execute user event: Exit */
      e11T02 ();
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THAGHDP.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreProCodP_Internalname, GXutil.rtrim( A5864HreProCodP), GXutil.rtrim( localUtil.format( A5864HreProCodP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreProCodP_Jsonclick, 0, "", "", "", "", "", 1, edtHreProCodP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Orden Fase", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreOrdLinF_Internalname, GXutil.ltrim( localUtil.ntoc( A5865HreOrdLinF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreOrdLinF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5865HreOrdLinF), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5865HreOrdLinF), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreOrdLinF_Jsonclick, 0, "", "", "", "", "", 1, edtHreOrdLinF_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Numero partida", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumPda_Internalname, GXutil.ltrim( localUtil.ntoc( A5980HreNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumPda_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5980HreNumPda), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5980HreNumPda), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumPda_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumPda_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THAGHDP.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol65( ) ;
      nGXsfl_65_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount874 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_874 = (short)(1) ;
            scanStartT0874( ) ;
            while ( RcdFound874 != 0 )
            {
               init_level_properties874( ) ;
               getByPrimaryKeyT0874( ) ;
               addRowT0874( ) ;
               scanNextT0874( ) ;
            }
            scanEndT0874( ) ;
            nBlankRcdCount874 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalT0874( ) ;
         standaloneModalT0874( ) ;
         sMode874 = Gx_mode ;
         while ( nGXsfl_65_idx < nRC_GXsfl_65 )
         {
            bGXsfl_65_Refreshing = true ;
            readRowT0874( ) ;
            edtavnRcdDeleted_874_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_874_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_874_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_874_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPREO_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpReo_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPPAR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPPRO_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPro_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPORD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpOrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPKGM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpKgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            edtHre_AgpPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPPIE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPie_Enabled), 5, 0), !bGXsfl_65_Refreshing);
            if ( ( nRcdExists_874 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalT0874( ) ;
            }
            sendRowT0874( ) ;
            bGXsfl_65_Refreshing = false ;
         }
         Gx_mode = sMode874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount874 = (short)(5) ;
         nRcdExists_874 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartT0874( ) ;
            while ( RcdFound874 != 0 )
            {
               sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_65874( ) ;
               init_level_properties874( ) ;
               standaloneNotModalT0874( ) ;
               getByPrimaryKeyT0874( ) ;
               standaloneModalT0874( ) ;
               addRowT0874( ) ;
               scanNextT0874( ) ;
            }
            scanEndT0874( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode874 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_65874( ) ;
      initAllT0874( ) ;
      init_level_properties874( ) ;
      nRcdExists_874 = (short)(0) ;
      nIsMod_874 = (short)(0) ;
      nRcdDeleted_874 = (short)(0) ;
      nBlankRcdCount874 = (short)(nBlankRcdUsr874+nBlankRcdCount874) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount874 > 0 )
      {
         standaloneNotModalT0874( ) ;
         standaloneModalT0874( ) ;
         addRowT0874( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHre_AgpCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount874 = (short)(nBlankRcdCount874-1) ;
      }
      Gx_mode = sMode874 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THAGHDP.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THAGHDP.htm");
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
      e12T02 ();
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
            Z5980HreNumPda = (int)(localUtil.ctol( httpContext.cgiGet( "Z5980HreNumPda"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_65 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_65"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENUMPDA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreNumPda_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5980HreNumPda = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
            }
            else
            {
               A5980HreNumPda = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumPda_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
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
               A5980HreNumPda = (int)(GXutil.lval( httpContext.GetPar( "HreNumPda"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
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
                        e12T02 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "EXIT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Exit */
                        e11T02 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e13T02 ();
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
         /* Execute user event: After Trn */
         e13T02 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllT0873( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_874_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_874_Enabled), 5, 0), !bGXsfl_65_Refreshing);
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
      disableAttributesT0873( ) ;
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

   public void confirm_T00( )
   {
      beforeValidateT0873( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsT0873( ) ;
         }
         else
         {
            checkExtendedTableT0873( ) ;
            if ( AnyError == 0 )
            {
               zmT0873( 2) ;
               zmT0873( 3) ;
            }
            closeExtendedTableCursorsT0873( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode873 = Gx_mode ;
         confirm_T0874( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode873 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode873 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesT00( ) ;
      }
   }

   public void confirm_T0874( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRowT0874( ) ;
         if ( ( nRcdExists_874 != 0 ) || ( nIsMod_874 != 0 ) )
         {
            getKeyT0874( ) ;
            if ( ( nRcdExists_874 == 0 ) && ( nRcdDeleted_874 == 0 ) )
            {
               if ( RcdFound874 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateT0874( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableT0874( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsT0874( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HRE_AGPCOD_" + sGXsfl_65_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHre_AgpCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound874 != 0 )
               {
                  if ( nRcdDeleted_874 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyT0874( ) ;
                     loadT0874( ) ;
                     beforeValidateT0874( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsT0874( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_874 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateT0874( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableT0874( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsT0874( ) ;
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
                  if ( nRcdDeleted_874 == 0 )
                  {
                     GXCCtl = "HRE_AGPCOD_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHre_AgpCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_874_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5981Hre_AgpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5982Hre_AgpReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpPar_Internalname, GXutil.rtrim( A5983Hre_AgpPar)) ;
         httpContext.changePostValue( edtHre_AgpPro_Internalname, GXutil.rtrim( A5984Hre_AgpPro)) ;
         httpContext.changePostValue( edtHre_AgpOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A5985Hre_AgpOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A5986Hre_AgpKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpPie_Internalname, GXutil.ltrim( localUtil.ntoc( A5987Hre_AgpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5981Hre_AgpCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5981Hre_AgpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5982Hre_AgpReo_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5982Hre_AgpReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5983Hre_AgpPar_"+sGXsfl_65_idx, GXutil.rtrim( Z5983Hre_AgpPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5984Hre_AgpPro_"+sGXsfl_65_idx, GXutil.rtrim( Z5984Hre_AgpPro)) ;
         httpContext.changePostValue( "ZT_"+"Z5985Hre_AgpOrd_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5985Hre_AgpOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5986Hre_AgpKgm_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5986Hre_AgpKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5987Hre_AgpPie_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5987Hre_AgpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_874_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_874_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_874_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_874 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_874_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_874_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPREO_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPPAR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPPRO_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPORD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPKGM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPPIE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionT00( )
   {
   }

   public void e12T02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV32Pgmname, (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV14Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Lit2", AV14Lit2);
      GXt_char1 = AV15Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Lit3", AV15Lit3);
      GXt_char1 = AV16Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Lit4", AV16Lit4);
      GXt_char1 = AV17Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Lit5", AV17Lit5);
      GXt_char1 = AV18Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Lit6", AV18Lit6);
      GXt_char1 = AV19Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Lit7", AV19Lit7);
      GXt_char1 = AV20Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2034_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit8", AV20Lit8);
      GXt_char1 = AV13Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1326_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Lit9", AV13Lit9);
      GXt_char1 = AV21Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1294_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit10", AV21Lit10);
      GXt_char1 = AV22Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit11 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Lit11", AV22Lit11);
      GXt_char1 = AV23Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit12", AV23Lit12);
      GXt_char1 = AV24Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLAV053_", ""), (byte)(99), GXv_char2) ;
      thaghdp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit13", AV24Lit13);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      thaghdp_impl.this.A396EmprCod = GXv_char2[0] ;
      thaghdp_impl.this.AV11EmprNom = GXv_char3[0] ;
      thaghdp_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   protected void GXExit( )
   {
      /* Execute user event: Exit */
      e11T02 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e11T02( )
   {
      /* Exit Routine */
      returnInSub = false ;
   }

   public void e13T02( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zmT0873( int GX_JID )
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
         Z5980HreNumPda = A5980HreNumPda ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "THAGHDP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      /* Using cursor T00T06 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00T06_A407EmprNom[0] ;
      n407EmprNom = T00T06_n407EmprNom[0] ;
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

   public void loadT0873( )
   {
      /* Using cursor T00T08 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound873 = (short)(1) ;
         A407EmprNom = T00T08_A407EmprNom[0] ;
         n407EmprNom = T00T08_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zmT0873( -1) ;
      }
      pr_default.close(6);
      onLoadActionsT0873( ) ;
   }

   public void onLoadActionsT0873( )
   {
   }

   public void checkExtendedTableT0873( )
   {
      nIsDirty_873 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00T07 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HAGRHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HREORDLINF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
   }

   public void closeExtendedTableCursorsT0873( )
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
                         byte A4495HreNumCie ,
                         String A5864HreProCodP ,
                         short A5865HreOrdLinF )
   {
      /* Using cursor T00T09 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HAGRHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HREORDLINF");
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

   public void getKeyT0873( )
   {
      /* Using cursor T00T010 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound873 = (short)(1) ;
      }
      else
      {
         RcdFound873 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00T05 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00T05_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmT0873( 1) ;
         RcdFound873 = (short)(1) ;
         A5980HreNumPda = T00T05_A5980HreNumPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
         A4492HreBarCod = T00T05_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00T05_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00T05_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00T05_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A5864HreProCodP = T00T05_A5864HreProCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = T00T05_A5865HreOrdLinF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         Z5980HreNumPda = A5980HreNumPda ;
         sMode873 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadT0873( ) ;
         if ( AnyError == 1 )
         {
            RcdFound873 = (short)(0) ;
            initializeNonKeyT0873( ) ;
         }
         Gx_mode = sMode873 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound873 = (short)(0) ;
         initializeNonKeyT0873( ) ;
         sMode873 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode873 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyT0873( ) ;
      if ( RcdFound873 == 0 )
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
      RcdFound873 = (short)(0) ;
      /* Using cursor T00T011 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A5864HreProCodP, A5864HreProCodP, Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Short.valueOf(A5865HreOrdLinF), Short.valueOf(A5865HreOrdLinF), A5864HreProCodP, Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Integer.valueOf(A5980HreNumPda), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T00T011_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A4495HreNumCie[0] < A4495HreNumCie ) || ( T00T011_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T011_A5864HreProCodP[0], A5864HreProCodP) < 0 ) || ( GXutil.strcmp(T00T011_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T011_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A5865HreOrdLinF[0] < A5865HreOrdLinF ) || ( T00T011_A5865HreOrdLinF[0] == A5865HreOrdLinF ) && ( GXutil.strcmp(T00T011_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T011_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A5980HreNumPda[0] < A5980HreNumPda ) ) && ( GXutil.strcmp(T00T011_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T00T011_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A4495HreNumCie[0] > A4495HreNumCie ) || ( T00T011_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T011_A5864HreProCodP[0], A5864HreProCodP) > 0 ) || ( GXutil.strcmp(T00T011_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T011_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A5865HreOrdLinF[0] > A5865HreOrdLinF ) || ( T00T011_A5865HreOrdLinF[0] == A5865HreOrdLinF ) && ( GXutil.strcmp(T00T011_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T011_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T011_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T011_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T011_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T011_A5980HreNumPda[0] > A5980HreNumPda ) ) && ( GXutil.strcmp(T00T011_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T00T011_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00T011_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00T011_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00T011_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A5864HreProCodP = T00T011_A5864HreProCodP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
            A5865HreOrdLinF = T00T011_A5865HreOrdLinF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
            A5980HreNumPda = T00T011_A5980HreNumPda[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
            RcdFound873 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound873 = (short)(0) ;
      /* Using cursor T00T012 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A5864HreProCodP, A5864HreProCodP, Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Short.valueOf(A5865HreOrdLinF), Short.valueOf(A5865HreOrdLinF), A5864HreProCodP, Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Integer.valueOf(A5980HreNumPda), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T00T012_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A4495HreNumCie[0] > A4495HreNumCie ) || ( T00T012_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T012_A5864HreProCodP[0], A5864HreProCodP) > 0 ) || ( GXutil.strcmp(T00T012_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T012_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A5865HreOrdLinF[0] > A5865HreOrdLinF ) || ( T00T012_A5865HreOrdLinF[0] == A5865HreOrdLinF ) && ( GXutil.strcmp(T00T012_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T012_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A5980HreNumPda[0] > A5980HreNumPda ) ) && ( GXutil.strcmp(T00T012_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T00T012_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A4495HreNumCie[0] < A4495HreNumCie ) || ( T00T012_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00T012_A5864HreProCodP[0], A5864HreProCodP) < 0 ) || ( GXutil.strcmp(T00T012_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T012_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A5865HreOrdLinF[0] < A5865HreOrdLinF ) || ( T00T012_A5865HreOrdLinF[0] == A5865HreOrdLinF ) && ( GXutil.strcmp(T00T012_A5864HreProCodP[0], A5864HreProCodP) == 0 ) && ( T00T012_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00T012_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00T012_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00T012_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00T012_A5980HreNumPda[0] < A5980HreNumPda ) ) && ( GXutil.strcmp(T00T012_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T00T012_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00T012_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00T012_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00T012_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A5864HreProCodP = T00T012_A5864HreProCodP[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
            A5865HreOrdLinF = T00T012_A5865HreOrdLinF[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
            A5980HreNumPda = T00T012_A5980HreNumPda[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
            RcdFound873 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyT0873( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertT0873( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound873 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) || ( A5980HreNumPda != Z5980HreNumPda ) )
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
               A5980HreNumPda = Z5980HreNumPda ;
               httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
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
               updateT0873( ) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) || ( A5980HreNumPda != Z5980HreNumPda ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertT0873( ) ;
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
                  insertT0873( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) || ( A5980HreNumPda != Z5980HreNumPda ) )
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
         A5980HreNumPda = Z5980HreNumPda ;
         httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
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
      getKeyT0873( ) ;
      if ( RcdFound873 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) || ( A5980HreNumPda != Z5980HreNumPda ) )
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
            A5980HreNumPda = Z5980HreNumPda ;
            httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( GXutil.strcmp(A5864HreProCodP, Z5864HreProCodP) != 0 ) || ( A5865HreOrdLinF != Z5865HreOrdLinF ) || ( A5980HreNumPda != Z5980HreNumPda ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thaghdp");
   }

   public void insert_check( )
   {
      confirm_T00( ) ;
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
      if ( RcdFound873 == 0 )
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
      scanStartT0873( ) ;
      if ( RcdFound873 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndT0873( ) ;
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
      if ( RcdFound873 == 0 )
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
      if ( RcdFound873 == 0 )
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
      scanStartT0873( ) ;
      if ( RcdFound873 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound873 != 0 )
         {
            scanNextT0873( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEndT0873( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyT0873( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00T04 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHAGHDP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHAGHDP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertT0873( )
   {
      beforeValidateT0873( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT0873( ) ;
      }
      if ( AnyError == 0 )
      {
         zmT0873( 0) ;
         checkOptimisticConcurrencyT0873( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT0873( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertT0873( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T013 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A5980HreNumPda), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGHDP");
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
                        processLevelT0873( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionT00( ) ;
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
            loadT0873( ) ;
         }
         endLevelT0873( ) ;
      }
      closeExtendedTableCursorsT0873( ) ;
   }

   public void updateT0873( )
   {
      beforeValidateT0873( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT0873( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT0873( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT0873( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateT0873( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPHAGHDP */
                  deferredUpdateT0873( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelT0873( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionT00( ) ;
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
         endLevelT0873( ) ;
      }
      closeExtendedTableCursorsT0873( ) ;
   }

   public void deferredUpdateT0873( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateT0873( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT0873( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsT0873( ) ;
         afterConfirmT0873( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteT0873( ) ;
            if ( AnyError == 0 )
            {
               scanStartT0874( ) ;
               while ( RcdFound874 != 0 )
               {
                  getByPrimaryKeyT0874( ) ;
                  deleteT0874( ) ;
                  scanNextT0874( ) ;
               }
               scanEndT0874( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T014 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGHDP");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound873 == 0 )
                        {
                           initAllT0873( ) ;
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
                        resetCaptionT00( ) ;
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
      sMode873 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelT0873( ) ;
      Gx_mode = sMode873 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsT0873( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelT0874( )
   {
      nGXsfl_65_idx = 0 ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         readRowT0874( ) ;
         if ( ( nRcdExists_874 != 0 ) || ( nIsMod_874 != 0 ) )
         {
            standaloneNotModalT0874( ) ;
            getKeyT0874( ) ;
            if ( ( nRcdExists_874 == 0 ) && ( nRcdDeleted_874 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertT0874( ) ;
            }
            else
            {
               if ( RcdFound874 != 0 )
               {
                  if ( ( nRcdDeleted_874 != 0 ) && ( nRcdExists_874 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteT0874( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_874 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateT0874( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_874 == 0 )
                  {
                     GXCCtl = "HRE_AGPCOD_" + sGXsfl_65_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHre_AgpCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_874_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5981Hre_AgpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5982Hre_AgpReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpPar_Internalname, GXutil.rtrim( A5983Hre_AgpPar)) ;
         httpContext.changePostValue( edtHre_AgpPro_Internalname, GXutil.rtrim( A5984Hre_AgpPro)) ;
         httpContext.changePostValue( edtHre_AgpOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A5985Hre_AgpOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A5986Hre_AgpKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHre_AgpPie_Internalname, GXutil.ltrim( localUtil.ntoc( A5987Hre_AgpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5981Hre_AgpCod_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5981Hre_AgpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5982Hre_AgpReo_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5982Hre_AgpReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5983Hre_AgpPar_"+sGXsfl_65_idx, GXutil.rtrim( Z5983Hre_AgpPar)) ;
         httpContext.changePostValue( "ZT_"+"Z5984Hre_AgpPro_"+sGXsfl_65_idx, GXutil.rtrim( Z5984Hre_AgpPro)) ;
         httpContext.changePostValue( "ZT_"+"Z5985Hre_AgpOrd_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5985Hre_AgpOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5986Hre_AgpKgm_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5986Hre_AgpKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5987Hre_AgpPie_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( Z5987Hre_AgpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_874_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_874_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_874_"+sGXsfl_65_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_874 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_874_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_874_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPREO_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPPAR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPPRO_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPORD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPKGM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRE_AGPPIE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllT0874( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_874 = (short)(0) ;
      nIsMod_874 = (short)(0) ;
      nRcdDeleted_874 = (short)(0) ;
   }

   public void processLevelT0873( )
   {
      /* Save parent mode. */
      sMode873 = Gx_mode ;
      processNestedLevelT0874( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode873 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelT0873( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteT0873( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thaghdp");
         if ( AnyError == 0 )
         {
            confirmValuesT00( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thaghdp");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartT0873( )
   {
      /* Scan By routine */
      /* Using cursor T00T015 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      RcdFound873 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound873 = (short)(1) ;
         A4492HreBarCod = T00T015_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00T015_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00T015_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00T015_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A5864HreProCodP = T00T015_A5864HreProCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = T00T015_A5865HreOrdLinF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
         A5980HreNumPda = T00T015_A5980HreNumPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextT0873( )
   {
      /* Scan next routine */
      pr_default.readNext(13);
      RcdFound873 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound873 = (short)(1) ;
         A4492HreBarCod = T00T015_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00T015_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00T015_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00T015_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A5864HreProCodP = T00T015_A5864HreProCodP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5864HreProCodP", A5864HreProCodP);
         A5865HreOrdLinF = T00T015_A5865HreOrdLinF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5865HreOrdLinF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5865HreOrdLinF), 4, 0));
         A5980HreNumPda = T00T015_A5980HreNumPda[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
      }
   }

   public void scanEndT0873( )
   {
      pr_default.close(13);
   }

   public void afterConfirmT0873( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertT0873( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateT0873( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteT0873( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteT0873( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateT0873( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesT0873( )
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
      edtHreNumPda_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumPda_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumPda_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zmT0874( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5986Hre_AgpKgm = T00T03_A5986Hre_AgpKgm[0] ;
            Z5987Hre_AgpPie = T00T03_A5987Hre_AgpPie[0] ;
         }
         else
         {
            Z5986Hre_AgpKgm = A5986Hre_AgpKgm ;
            Z5987Hre_AgpPie = A5987Hre_AgpPie ;
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
         Z5980HreNumPda = A5980HreNumPda ;
         Z5981Hre_AgpCod = A5981Hre_AgpCod ;
         Z5982Hre_AgpReo = A5982Hre_AgpReo ;
         Z5983Hre_AgpPar = A5983Hre_AgpPar ;
         Z5984Hre_AgpPro = A5984Hre_AgpPro ;
         Z5985Hre_AgpOrd = A5985Hre_AgpOrd ;
         Z5986Hre_AgpKgm = A5986Hre_AgpKgm ;
         Z5987Hre_AgpPie = A5987Hre_AgpPie ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalT0874( )
   {
   }

   public void standaloneModalT0874( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgpCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtHre_AgpCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgpReo_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpReo_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtHre_AgpReo_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpReo_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgpPar_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtHre_AgpPar_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgpPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPro_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtHre_AgpPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPro_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHre_AgpOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpOrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
      else
      {
         edtHre_AgpOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpOrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      }
   }

   public void loadT0874( )
   {
      /* Using cursor T00T016 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound874 = (short)(1) ;
         A5986Hre_AgpKgm = T00T016_A5986Hre_AgpKgm[0] ;
         n5986Hre_AgpKgm = T00T016_n5986Hre_AgpKgm[0] ;
         A5987Hre_AgpPie = T00T016_A5987Hre_AgpPie[0] ;
         n5987Hre_AgpPie = T00T016_n5987Hre_AgpPie[0] ;
         zmT0874( -4) ;
      }
      pr_default.close(14);
      onLoadActionsT0874( ) ;
   }

   public void onLoadActionsT0874( )
   {
   }

   public void checkExtendedTableT0874( )
   {
      nIsDirty_874 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalT0874( ) ;
   }

   public void closeExtendedTableCursorsT0874( )
   {
   }

   public void enableDisableT0874( )
   {
   }

   public void getKeyT0874( )
   {
      /* Using cursor T00T017 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound874 = (short)(1) ;
      }
      else
      {
         RcdFound874 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKeyT0874( )
   {
      /* Using cursor T00T03 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00T03_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmT0874( 4) ;
         RcdFound874 = (short)(1) ;
         initializeNonKeyT0874( ) ;
         A5981Hre_AgpCod = T00T03_A5981Hre_AgpCod[0] ;
         A5982Hre_AgpReo = T00T03_A5982Hre_AgpReo[0] ;
         A5983Hre_AgpPar = T00T03_A5983Hre_AgpPar[0] ;
         A5984Hre_AgpPro = T00T03_A5984Hre_AgpPro[0] ;
         A5985Hre_AgpOrd = T00T03_A5985Hre_AgpOrd[0] ;
         A5986Hre_AgpKgm = T00T03_A5986Hre_AgpKgm[0] ;
         n5986Hre_AgpKgm = T00T03_n5986Hre_AgpKgm[0] ;
         A5987Hre_AgpPie = T00T03_A5987Hre_AgpPie[0] ;
         n5987Hre_AgpPie = T00T03_n5987Hre_AgpPie[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z5864HreProCodP = A5864HreProCodP ;
         Z5865HreOrdLinF = A5865HreOrdLinF ;
         Z5980HreNumPda = A5980HreNumPda ;
         Z5981Hre_AgpCod = A5981Hre_AgpCod ;
         Z5982Hre_AgpReo = A5982Hre_AgpReo ;
         Z5983Hre_AgpPar = A5983Hre_AgpPar ;
         Z5984Hre_AgpPro = A5984Hre_AgpPro ;
         Z5985Hre_AgpOrd = A5985Hre_AgpOrd ;
         sMode874 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalT0874( ) ;
         loadT0874( ) ;
         Gx_mode = sMode874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound874 = (short)(0) ;
         initializeNonKeyT0874( ) ;
         sMode874 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalT0874( ) ;
         Gx_mode = sMode874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesT0874( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyT0874( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00T02 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHAGHD1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5986Hre_AgpKgm, T00T02_A5986Hre_AgpKgm[0]) != 0 ) || ( Z5987Hre_AgpPie != T00T02_A5987Hre_AgpPie[0] ) )
         {
            if ( DecimalUtil.compareTo(Z5986Hre_AgpKgm, T00T02_A5986Hre_AgpKgm[0]) != 0 )
            {
               GXutil.writeLogln("thaghdp:[seudo value changed for attri]"+"Hre_AgpKgm");
               GXutil.writeLogRaw("Old: ",Z5986Hre_AgpKgm);
               GXutil.writeLogRaw("Current: ",T00T02_A5986Hre_AgpKgm[0]);
            }
            if ( Z5987Hre_AgpPie != T00T02_A5987Hre_AgpPie[0] )
            {
               GXutil.writeLogln("thaghdp:[seudo value changed for attri]"+"Hre_AgpPie");
               GXutil.writeLogRaw("Old: ",Z5987Hre_AgpPie);
               GXutil.writeLogRaw("Current: ",T00T02_A5987Hre_AgpPie[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHAGHD1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertT0874( )
   {
      beforeValidateT0874( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT0874( ) ;
      }
      if ( AnyError == 0 )
      {
         zmT0874( 0) ;
         checkOptimisticConcurrencyT0874( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT0874( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertT0874( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T018 */
                  pr_default.execute(16, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd), Boolean.valueOf(n5986Hre_AgpKgm), A5986Hre_AgpKgm, Boolean.valueOf(n5987Hre_AgpPie), Short.valueOf(A5987Hre_AgpPie), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGHD1");
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
            loadT0874( ) ;
         }
         endLevelT0874( ) ;
      }
      closeExtendedTableCursorsT0874( ) ;
   }

   public void updateT0874( )
   {
      beforeValidateT0874( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT0874( ) ;
      }
      if ( ( nIsMod_874 != 0 ) || ( nIsDirty_874 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyT0874( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmT0874( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateT0874( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00T019 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n5986Hre_AgpKgm), A5986Hre_AgpKgm, Boolean.valueOf(n5987Hre_AgpPie), Short.valueOf(A5987Hre_AgpPie), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGHD1");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHAGHD1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateT0874( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyT0874( ) ;
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
            endLevelT0874( ) ;
         }
      }
      closeExtendedTableCursorsT0874( ) ;
   }

   public void deferredUpdateT0874( )
   {
   }

   public void deleteT0874( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateT0874( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT0874( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsT0874( ) ;
         afterConfirmT0874( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteT0874( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00T020 */
               pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda), Integer.valueOf(A5981Hre_AgpCod), Byte.valueOf(A5982Hre_AgpReo), A5983Hre_AgpPar, A5984Hre_AgpPro, Short.valueOf(A5985Hre_AgpOrd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHAGHD1");
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
      sMode874 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelT0874( ) ;
      Gx_mode = sMode874 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsT0874( )
   {
      standaloneModalT0874( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelT0874( )
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

   public void scanStartT0874( )
   {
      /* Scan By routine */
      /* Using cursor T00T021 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF), Integer.valueOf(A5980HreNumPda)});
      RcdFound874 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound874 = (short)(1) ;
         A5981Hre_AgpCod = T00T021_A5981Hre_AgpCod[0] ;
         A5982Hre_AgpReo = T00T021_A5982Hre_AgpReo[0] ;
         A5983Hre_AgpPar = T00T021_A5983Hre_AgpPar[0] ;
         A5984Hre_AgpPro = T00T021_A5984Hre_AgpPro[0] ;
         A5985Hre_AgpOrd = T00T021_A5985Hre_AgpOrd[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextT0874( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound874 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound874 = (short)(1) ;
         A5981Hre_AgpCod = T00T021_A5981Hre_AgpCod[0] ;
         A5982Hre_AgpReo = T00T021_A5982Hre_AgpReo[0] ;
         A5983Hre_AgpPar = T00T021_A5983Hre_AgpPar[0] ;
         A5984Hre_AgpPro = T00T021_A5984Hre_AgpPro[0] ;
         A5985Hre_AgpOrd = T00T021_A5985Hre_AgpOrd[0] ;
      }
   }

   public void scanEndT0874( )
   {
      pr_default.close(19);
   }

   public void afterConfirmT0874( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertT0874( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateT0874( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteT0874( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteT0874( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateT0874( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesT0874( )
   {
      edtHre_AgpCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpReo_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPro_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpOrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpKgm_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPie_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void send_integrity_lvl_hashesT0874( )
   {
   }

   public void send_integrity_lvl_hashesT0873( )
   {
   }

   public void subsflControlProps_65874( )
   {
      edtavnRcdDeleted_874_Internalname = "vNRCDDELETED_874_"+sGXsfl_65_idx ;
      edtHre_AgpCod_Internalname = "HRE_AGPCOD_"+sGXsfl_65_idx ;
      edtHre_AgpReo_Internalname = "HRE_AGPREO_"+sGXsfl_65_idx ;
      edtHre_AgpPar_Internalname = "HRE_AGPPAR_"+sGXsfl_65_idx ;
      edtHre_AgpPro_Internalname = "HRE_AGPPRO_"+sGXsfl_65_idx ;
      edtHre_AgpOrd_Internalname = "HRE_AGPORD_"+sGXsfl_65_idx ;
      edtHre_AgpKgm_Internalname = "HRE_AGPKGM_"+sGXsfl_65_idx ;
      edtHre_AgpPie_Internalname = "HRE_AGPPIE_"+sGXsfl_65_idx ;
   }

   public void subsflControlProps_fel_65874( )
   {
      edtavnRcdDeleted_874_Internalname = "vNRCDDELETED_874_"+sGXsfl_65_fel_idx ;
      edtHre_AgpCod_Internalname = "HRE_AGPCOD_"+sGXsfl_65_fel_idx ;
      edtHre_AgpReo_Internalname = "HRE_AGPREO_"+sGXsfl_65_fel_idx ;
      edtHre_AgpPar_Internalname = "HRE_AGPPAR_"+sGXsfl_65_fel_idx ;
      edtHre_AgpPro_Internalname = "HRE_AGPPRO_"+sGXsfl_65_fel_idx ;
      edtHre_AgpOrd_Internalname = "HRE_AGPORD_"+sGXsfl_65_fel_idx ;
      edtHre_AgpKgm_Internalname = "HRE_AGPKGM_"+sGXsfl_65_fel_idx ;
      edtHre_AgpPie_Internalname = "HRE_AGPPIE_"+sGXsfl_65_fel_idx ;
   }

   public void addRowT0874( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65874( ) ;
      sendRowT0874( ) ;
   }

   public void sendRowT0874( )
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
         if ( ((int)((nGXsfl_65_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_874_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_874_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_874), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_874), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_874_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_874_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpCod_Internalname,GXutil.ltrim( localUtil.ntoc( A5981Hre_AgpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5981Hre_AgpCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5982Hre_AgpReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5982Hre_AgpReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpReo_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpPar_Internalname,GXutil.rtrim( A5983Hre_AgpPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpPar_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpPro_Internalname,GXutil.rtrim( A5984Hre_AgpPro),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpPro_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A5985Hre_AgpOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5985Hre_AgpOrd), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A5986Hre_AgpKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHre_AgpKgm_Enabled!=0) ? localUtil.format( A5986Hre_AgpKgm, "ZZZZZ9.99") : localUtil.format( A5986Hre_AgpKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,72);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_874_" + sGXsfl_65_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_65_idx + "',65)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHre_AgpPie_Internalname,GXutil.ltrim( localUtil.ntoc( A5987Hre_AgpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHre_AgpPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5987Hre_AgpPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5987Hre_AgpPie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHre_AgpPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHre_AgpPie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(65),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesT0874( ) ;
      GXCCtl = "Z5981Hre_AgpCod_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5981Hre_AgpCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5982Hre_AgpReo_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5982Hre_AgpReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5983Hre_AgpPar_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5983Hre_AgpPar));
      GXCCtl = "Z5984Hre_AgpPro_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5984Hre_AgpPro));
      GXCCtl = "Z5985Hre_AgpOrd_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5985Hre_AgpOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5986Hre_AgpKgm_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5986Hre_AgpKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5987Hre_AgpPie_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5987Hre_AgpPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_874_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_874_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_874_" + sGXsfl_65_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_874_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_874_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPCOD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPREO_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPPAR_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPPRO_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPORD_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPKGM_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRE_AGPPIE_"+sGXsfl_65_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowT0874( )
   {
      nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65874( ) ;
      edtavnRcdDeleted_874_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_874_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPCOD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPREO_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPPAR_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPPRO_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPORD_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPKGM_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHre_AgpPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRE_AGPPIE_"+sGXsfl_65_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_874_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_874_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_874");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_874_Internalname ;
         wbErr = true ;
         nRcdDeleted_874 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_874 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_874_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "HRE_AGPCOD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgpCod_Internalname ;
         wbErr = true ;
         A5981Hre_AgpCod = 0 ;
      }
      else
      {
         A5981Hre_AgpCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHre_AgpCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HRE_AGPREO_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgpReo_Internalname ;
         wbErr = true ;
         A5982Hre_AgpReo = (byte)(0) ;
      }
      else
      {
         A5982Hre_AgpReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHre_AgpReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5983Hre_AgpPar = httpContext.cgiGet( edtHre_AgpPar_Internalname) ;
      A5984Hre_AgpPro = httpContext.cgiGet( edtHre_AgpPro_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRE_AGPORD_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgpOrd_Internalname ;
         wbErr = true ;
         A5985Hre_AgpOrd = (short)(0) ;
      }
      else
      {
         A5985Hre_AgpOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtHre_AgpOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHre_AgpKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHre_AgpKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRE_AGPKGM_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgpKgm_Internalname ;
         wbErr = true ;
         A5986Hre_AgpKgm = DecimalUtil.ZERO ;
         n5986Hre_AgpKgm = false ;
      }
      else
      {
         A5986Hre_AgpKgm = localUtil.ctond( httpContext.cgiGet( edtHre_AgpKgm_Internalname)) ;
         n5986Hre_AgpKgm = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHre_AgpPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRE_AGPPIE_" + sGXsfl_65_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHre_AgpPie_Internalname ;
         wbErr = true ;
         A5987Hre_AgpPie = (short)(0) ;
         n5987Hre_AgpPie = false ;
      }
      else
      {
         A5987Hre_AgpPie = (short)(localUtil.ctol( httpContext.cgiGet( edtHre_AgpPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5987Hre_AgpPie = false ;
      }
      GXCCtl = "Z5981Hre_AgpCod_" + sGXsfl_65_idx ;
      Z5981Hre_AgpCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5982Hre_AgpReo_" + sGXsfl_65_idx ;
      Z5982Hre_AgpReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5983Hre_AgpPar_" + sGXsfl_65_idx ;
      Z5983Hre_AgpPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5984Hre_AgpPro_" + sGXsfl_65_idx ;
      Z5984Hre_AgpPro = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5985Hre_AgpOrd_" + sGXsfl_65_idx ;
      Z5985Hre_AgpOrd = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5986Hre_AgpKgm_" + sGXsfl_65_idx ;
      Z5986Hre_AgpKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5987Hre_AgpPie_" + sGXsfl_65_idx ;
      Z5987Hre_AgpPie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_874_" + sGXsfl_65_idx ;
      nRcdDeleted_874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_874_" + sGXsfl_65_idx ;
      nRcdExists_874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_874_" + sGXsfl_65_idx ;
      nIsMod_874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHre_AgpOrd_Enabled = edtHre_AgpOrd_Enabled ;
      defedtHre_AgpPro_Enabled = edtHre_AgpPro_Enabled ;
      defedtHre_AgpPar_Enabled = edtHre_AgpPar_Enabled ;
      defedtHre_AgpReo_Enabled = edtHre_AgpReo_Enabled ;
      defedtHre_AgpCod_Enabled = edtHre_AgpCod_Enabled ;
   }

   public void confirmValuesT00( )
   {
      nGXsfl_65_idx = 0 ;
      sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_65874( ) ;
      while ( nGXsfl_65_idx < nRC_GXsfl_65 )
      {
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65874( ) ;
         httpContext.changePostValue( "Z5981Hre_AgpCod_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5981Hre_AgpCod_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5981Hre_AgpCod_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5982Hre_AgpReo_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5982Hre_AgpReo_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5982Hre_AgpReo_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5983Hre_AgpPar_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5983Hre_AgpPar_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5983Hre_AgpPar_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5984Hre_AgpPro_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5984Hre_AgpPro_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5984Hre_AgpPro_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5985Hre_AgpOrd_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5985Hre_AgpOrd_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5985Hre_AgpOrd_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5986Hre_AgpKgm_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5986Hre_AgpKgm_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5986Hre_AgpKgm_"+sGXsfl_65_idx) ;
         httpContext.changePostValue( "Z5987Hre_AgpPie_"+sGXsfl_65_idx, httpContext.cgiGet( "ZT_"+"Z5987Hre_AgpPie_"+sGXsfl_65_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5987Hre_AgpPie_"+sGXsfl_65_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thaghdp", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5980HreNumPda", GXutil.ltrim( localUtil.ntoc( Z5980HreNumPda, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_65", GXutil.ltrim( localUtil.ntoc( nGXsfl_65_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.thaghdp", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THAGHDP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO AGRUPACIONES P/PDA", "") ;
   }

   public void initializeNonKeyT0873( )
   {
   }

   public void initAllT0873( )
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
      A5980HreNumPda = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5980HreNumPda", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5980HreNumPda), 6, 0));
      initializeNonKeyT0873( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyT0874( )
   {
      A5986Hre_AgpKgm = DecimalUtil.ZERO ;
      n5986Hre_AgpKgm = false ;
      A5987Hre_AgpPie = (short)(0) ;
      n5987Hre_AgpPie = false ;
      Z5986Hre_AgpKgm = DecimalUtil.ZERO ;
      Z5987Hre_AgpPie = (short)(0) ;
   }

   public void initAllT0874( )
   {
      A5981Hre_AgpCod = 0 ;
      A5982Hre_AgpReo = (byte)(0) ;
      A5983Hre_AgpPar = "" ;
      A5984Hre_AgpPro = "" ;
      A5985Hre_AgpOrd = (short)(0) ;
      initializeNonKeyT0874( ) ;
   }

   public void standaloneModalInsertT0874( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241525270", true, true);
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
      httpContext.AddJavascriptSource("thaghdp.js", "?20268241525270", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties874( )
   {
      edtHre_AgpOrd_Enabled = defedtHre_AgpOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpOrd_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpPro_Enabled = defedtHre_AgpPro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPro_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpPar_Enabled = defedtHre_AgpPar_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpPar_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpReo_Enabled = defedtHre_AgpReo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpReo_Enabled), 5, 0), !bGXsfl_65_Refreshing);
      edtHre_AgpCod_Enabled = defedtHre_AgpCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHre_AgpCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHre_AgpCod_Enabled), 5, 0), !bGXsfl_65_Refreshing);
   }

   public void startgridcontrol65( )
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_874, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_874_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5981Hre_AgpCod, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5982Hre_AgpReo, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5983Hre_AgpPar));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5984Hre_AgpPro));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5985Hre_AgpOrd, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5986Hre_AgpKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5987Hre_AgpPie, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHre_AgpPie_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtHreNumPda_Internalname = "HRENUMPDA" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtavnRcdDeleted_874_Internalname = "vNRCDDELETED_874" ;
      edtHre_AgpCod_Internalname = "HRE_AGPCOD" ;
      edtHre_AgpReo_Internalname = "HRE_AGPREO" ;
      edtHre_AgpPar_Internalname = "HRE_AGPPAR" ;
      edtHre_AgpPro_Internalname = "HRE_AGPPRO" ;
      edtHre_AgpOrd_Internalname = "HRE_AGPORD" ;
      edtHre_AgpKgm_Internalname = "HRE_AGPKGM" ;
      edtHre_AgpPie_Internalname = "HRE_AGPPIE" ;
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
      Form.setCaption( httpContext.getMessage( "HISTORICO AGRUPACIONES P/PDA", "") );
      edtHre_AgpPie_Jsonclick = "" ;
      edtHre_AgpKgm_Jsonclick = "" ;
      edtHre_AgpOrd_Jsonclick = "" ;
      edtHre_AgpPro_Jsonclick = "" ;
      edtHre_AgpPar_Jsonclick = "" ;
      edtHre_AgpReo_Jsonclick = "" ;
      edtHre_AgpCod_Jsonclick = "" ;
      edtavnRcdDeleted_874_Jsonclick = "" ;
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
      edtHre_AgpPie_Enabled = 1 ;
      edtHre_AgpKgm_Enabled = 1 ;
      edtHre_AgpOrd_Enabled = 1 ;
      edtHre_AgpPro_Enabled = 1 ;
      edtHre_AgpPar_Enabled = 1 ;
      edtHre_AgpReo_Enabled = 1 ;
      edtHre_AgpCod_Enabled = 1 ;
      edtavnRcdDeleted_874_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtHreNumPda_Jsonclick = "" ;
      edtHreNumPda_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumPda_Enabled = 1 ;
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
      subsflControlProps_65874( ) ;
      while ( nGXsfl_65_idx <= nRC_GXsfl_65 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalT0874( ) ;
         standaloneModalT0874( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowT0874( ) ;
         nGXsfl_65_idx = (int)(nGXsfl_65_idx+1) ;
         sGXsfl_65_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_65_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_65874( ) ;
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
      /* Using cursor T00T022 */
      pr_default.execute(20, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00T022_A407EmprNom[0] ;
      n407EmprNom = T00T022_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(20);
      /* Using cursor T00T023 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HAGRHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HREORDLINF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
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

   public void valid_Hreordlinf( )
   {
      /* Using cursor T00T023 */
      pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), A5864HreProCodP, Short.valueOf(A5865HreOrdLinF)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HAGRHD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HREORDLINF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
      }
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hrenumpda( )
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5980HreNumPda", GXutil.ltrim( localUtil.ntoc( Z5980HreNumPda, (byte)(6), (byte)(0), ".", "")));
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
      setEventMetadata("EXIT","{handler:'e11T02',iparms:[]");
      setEventMetadata("EXIT",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e13T02',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[]}");
      setEventMetadata("VALID_HREPROCODP","{handler:'valid_Hreprocodp',iparms:[]");
      setEventMetadata("VALID_HREPROCODP",",oparms:[]}");
      setEventMetadata("VALID_HREORDLINF","{handler:'valid_Hreordlinf',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A5864HreProCodP',fld:'HREPROCODP',pic:''},{av:'A5865HreOrdLinF',fld:'HREORDLINF',pic:'ZZZ9'}]");
      setEventMetadata("VALID_HREORDLINF",",oparms:[]}");
      setEventMetadata("VALID_HRENUMPDA","{handler:'valid_Hrenumpda',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A5864HreProCodP',fld:'HREPROCODP',pic:''},{av:'A5865HreOrdLinF',fld:'HREORDLINF',pic:'ZZZ9'},{av:'A5980HreNumPda',fld:'HRENUMPDA',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HRENUMPDA",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z5864HreProCodP'},{av:'Z5865HreOrdLinF'},{av:'Z5980HreNumPda'},{av:'Z407EmprNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HRE_AGPCOD","{handler:'valid_Hre_agpcod',iparms:[]");
      setEventMetadata("VALID_HRE_AGPCOD",",oparms:[]}");
      setEventMetadata("VALID_HRE_AGPREO","{handler:'valid_Hre_agpreo',iparms:[]");
      setEventMetadata("VALID_HRE_AGPREO",",oparms:[]}");
      setEventMetadata("VALID_HRE_AGPPAR","{handler:'valid_Hre_agppar',iparms:[]");
      setEventMetadata("VALID_HRE_AGPPAR",",oparms:[]}");
      setEventMetadata("VALID_HRE_AGPPRO","{handler:'valid_Hre_agppro',iparms:[]");
      setEventMetadata("VALID_HRE_AGPPRO",",oparms:[]}");
      setEventMetadata("VALID_HRE_AGPORD","{handler:'valid_Hre_agpord',iparms:[]");
      setEventMetadata("VALID_HRE_AGPORD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hre_agppie',iparms:[]");
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
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z5864HreProCodP = "" ;
      Z5983Hre_AgpPar = "" ;
      Z5984Hre_AgpPro = "" ;
      Z5986Hre_AgpKgm = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A5864HreProCodP = "" ;
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
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A407EmprNom = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode874 = "" ;
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
      sMode873 = "" ;
      GXCCtl = "" ;
      A5983Hre_AgpPar = "" ;
      A5984Hre_AgpPro = "" ;
      A5986Hre_AgpKgm = DecimalUtil.ZERO ;
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
      T00T06_A407EmprNom = new String[] {""} ;
      T00T06_n407EmprNom = new boolean[] {false} ;
      T00T08_A5980HreNumPda = new int[1] ;
      T00T08_A407EmprNom = new String[] {""} ;
      T00T08_n407EmprNom = new boolean[] {false} ;
      T00T08_A396EmprCod = new String[] {""} ;
      T00T08_A4492HreBarCod = new int[1] ;
      T00T08_A4493HreBarReo = new byte[1] ;
      T00T08_A4494HreBarPar = new String[] {""} ;
      T00T08_A4495HreNumCie = new byte[1] ;
      T00T08_A5864HreProCodP = new String[] {""} ;
      T00T08_A5865HreOrdLinF = new short[1] ;
      T00T07_A396EmprCod = new String[] {""} ;
      T00T09_A396EmprCod = new String[] {""} ;
      T00T010_A396EmprCod = new String[] {""} ;
      T00T010_A4492HreBarCod = new int[1] ;
      T00T010_A4493HreBarReo = new byte[1] ;
      T00T010_A4494HreBarPar = new String[] {""} ;
      T00T010_A4495HreNumCie = new byte[1] ;
      T00T010_A5864HreProCodP = new String[] {""} ;
      T00T010_A5865HreOrdLinF = new short[1] ;
      T00T010_A5980HreNumPda = new int[1] ;
      T00T05_A5980HreNumPda = new int[1] ;
      T00T05_A396EmprCod = new String[] {""} ;
      T00T05_A4492HreBarCod = new int[1] ;
      T00T05_A4493HreBarReo = new byte[1] ;
      T00T05_A4494HreBarPar = new String[] {""} ;
      T00T05_A4495HreNumCie = new byte[1] ;
      T00T05_A5864HreProCodP = new String[] {""} ;
      T00T05_A5865HreOrdLinF = new short[1] ;
      T00T011_A396EmprCod = new String[] {""} ;
      T00T011_A4492HreBarCod = new int[1] ;
      T00T011_A4493HreBarReo = new byte[1] ;
      T00T011_A4494HreBarPar = new String[] {""} ;
      T00T011_A4495HreNumCie = new byte[1] ;
      T00T011_A5864HreProCodP = new String[] {""} ;
      T00T011_A5865HreOrdLinF = new short[1] ;
      T00T011_A5980HreNumPda = new int[1] ;
      T00T012_A396EmprCod = new String[] {""} ;
      T00T012_A4492HreBarCod = new int[1] ;
      T00T012_A4493HreBarReo = new byte[1] ;
      T00T012_A4494HreBarPar = new String[] {""} ;
      T00T012_A4495HreNumCie = new byte[1] ;
      T00T012_A5864HreProCodP = new String[] {""} ;
      T00T012_A5865HreOrdLinF = new short[1] ;
      T00T012_A5980HreNumPda = new int[1] ;
      T00T04_A5980HreNumPda = new int[1] ;
      T00T04_A396EmprCod = new String[] {""} ;
      T00T04_A4492HreBarCod = new int[1] ;
      T00T04_A4493HreBarReo = new byte[1] ;
      T00T04_A4494HreBarPar = new String[] {""} ;
      T00T04_A4495HreNumCie = new byte[1] ;
      T00T04_A5864HreProCodP = new String[] {""} ;
      T00T04_A5865HreOrdLinF = new short[1] ;
      T00T015_A396EmprCod = new String[] {""} ;
      T00T015_A4492HreBarCod = new int[1] ;
      T00T015_A4493HreBarReo = new byte[1] ;
      T00T015_A4494HreBarPar = new String[] {""} ;
      T00T015_A4495HreNumCie = new byte[1] ;
      T00T015_A5864HreProCodP = new String[] {""} ;
      T00T015_A5865HreOrdLinF = new short[1] ;
      T00T015_A5980HreNumPda = new int[1] ;
      T00T016_A4492HreBarCod = new int[1] ;
      T00T016_A4493HreBarReo = new byte[1] ;
      T00T016_A4494HreBarPar = new String[] {""} ;
      T00T016_A4495HreNumCie = new byte[1] ;
      T00T016_A5864HreProCodP = new String[] {""} ;
      T00T016_A5865HreOrdLinF = new short[1] ;
      T00T016_A5980HreNumPda = new int[1] ;
      T00T016_A5981Hre_AgpCod = new int[1] ;
      T00T016_A5982Hre_AgpReo = new byte[1] ;
      T00T016_A5983Hre_AgpPar = new String[] {""} ;
      T00T016_A5984Hre_AgpPro = new String[] {""} ;
      T00T016_A5985Hre_AgpOrd = new short[1] ;
      T00T016_A5986Hre_AgpKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T016_n5986Hre_AgpKgm = new boolean[] {false} ;
      T00T016_A5987Hre_AgpPie = new short[1] ;
      T00T016_n5987Hre_AgpPie = new boolean[] {false} ;
      T00T016_A396EmprCod = new String[] {""} ;
      T00T017_A396EmprCod = new String[] {""} ;
      T00T017_A4492HreBarCod = new int[1] ;
      T00T017_A4493HreBarReo = new byte[1] ;
      T00T017_A4494HreBarPar = new String[] {""} ;
      T00T017_A4495HreNumCie = new byte[1] ;
      T00T017_A5864HreProCodP = new String[] {""} ;
      T00T017_A5865HreOrdLinF = new short[1] ;
      T00T017_A5980HreNumPda = new int[1] ;
      T00T017_A5981Hre_AgpCod = new int[1] ;
      T00T017_A5982Hre_AgpReo = new byte[1] ;
      T00T017_A5983Hre_AgpPar = new String[] {""} ;
      T00T017_A5984Hre_AgpPro = new String[] {""} ;
      T00T017_A5985Hre_AgpOrd = new short[1] ;
      T00T03_A4492HreBarCod = new int[1] ;
      T00T03_A4493HreBarReo = new byte[1] ;
      T00T03_A4494HreBarPar = new String[] {""} ;
      T00T03_A4495HreNumCie = new byte[1] ;
      T00T03_A5864HreProCodP = new String[] {""} ;
      T00T03_A5865HreOrdLinF = new short[1] ;
      T00T03_A5980HreNumPda = new int[1] ;
      T00T03_A5981Hre_AgpCod = new int[1] ;
      T00T03_A5982Hre_AgpReo = new byte[1] ;
      T00T03_A5983Hre_AgpPar = new String[] {""} ;
      T00T03_A5984Hre_AgpPro = new String[] {""} ;
      T00T03_A5985Hre_AgpOrd = new short[1] ;
      T00T03_A5986Hre_AgpKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T03_n5986Hre_AgpKgm = new boolean[] {false} ;
      T00T03_A5987Hre_AgpPie = new short[1] ;
      T00T03_n5987Hre_AgpPie = new boolean[] {false} ;
      T00T03_A396EmprCod = new String[] {""} ;
      T00T02_A4492HreBarCod = new int[1] ;
      T00T02_A4493HreBarReo = new byte[1] ;
      T00T02_A4494HreBarPar = new String[] {""} ;
      T00T02_A4495HreNumCie = new byte[1] ;
      T00T02_A5864HreProCodP = new String[] {""} ;
      T00T02_A5865HreOrdLinF = new short[1] ;
      T00T02_A5980HreNumPda = new int[1] ;
      T00T02_A5981Hre_AgpCod = new int[1] ;
      T00T02_A5982Hre_AgpReo = new byte[1] ;
      T00T02_A5983Hre_AgpPar = new String[] {""} ;
      T00T02_A5984Hre_AgpPro = new String[] {""} ;
      T00T02_A5985Hre_AgpOrd = new short[1] ;
      T00T02_A5986Hre_AgpKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T02_n5986Hre_AgpKgm = new boolean[] {false} ;
      T00T02_A5987Hre_AgpPie = new short[1] ;
      T00T02_n5987Hre_AgpPie = new boolean[] {false} ;
      T00T02_A396EmprCod = new String[] {""} ;
      T00T021_A396EmprCod = new String[] {""} ;
      T00T021_A4492HreBarCod = new int[1] ;
      T00T021_A4493HreBarReo = new byte[1] ;
      T00T021_A4494HreBarPar = new String[] {""} ;
      T00T021_A4495HreNumCie = new byte[1] ;
      T00T021_A5864HreProCodP = new String[] {""} ;
      T00T021_A5865HreOrdLinF = new short[1] ;
      T00T021_A5980HreNumPda = new int[1] ;
      T00T021_A5981Hre_AgpCod = new int[1] ;
      T00T021_A5982Hre_AgpReo = new byte[1] ;
      T00T021_A5983Hre_AgpPar = new String[] {""} ;
      T00T021_A5984Hre_AgpPro = new String[] {""} ;
      T00T021_A5985Hre_AgpOrd = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00T022_A407EmprNom = new String[] {""} ;
      T00T022_n407EmprNom = new boolean[] {false} ;
      T00T023_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ5864HreProCodP = "" ;
      ZZ407EmprNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thaghdp__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thaghdp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thaghdp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thaghdp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thaghdp__default(),
         new Object[] {
             new Object[] {
            T00T02_A4492HreBarCod, T00T02_A4493HreBarReo, T00T02_A4494HreBarPar, T00T02_A4495HreNumCie, T00T02_A5864HreProCodP, T00T02_A5865HreOrdLinF, T00T02_A5980HreNumPda, T00T02_A5981Hre_AgpCod, T00T02_A5982Hre_AgpReo, T00T02_A5983Hre_AgpPar,
            T00T02_A5984Hre_AgpPro, T00T02_A5985Hre_AgpOrd, T00T02_A5986Hre_AgpKgm, T00T02_n5986Hre_AgpKgm, T00T02_A5987Hre_AgpPie, T00T02_n5987Hre_AgpPie, T00T02_A396EmprCod
            }
            , new Object[] {
            T00T03_A4492HreBarCod, T00T03_A4493HreBarReo, T00T03_A4494HreBarPar, T00T03_A4495HreNumCie, T00T03_A5864HreProCodP, T00T03_A5865HreOrdLinF, T00T03_A5980HreNumPda, T00T03_A5981Hre_AgpCod, T00T03_A5982Hre_AgpReo, T00T03_A5983Hre_AgpPar,
            T00T03_A5984Hre_AgpPro, T00T03_A5985Hre_AgpOrd, T00T03_A5986Hre_AgpKgm, T00T03_n5986Hre_AgpKgm, T00T03_A5987Hre_AgpPie, T00T03_n5987Hre_AgpPie, T00T03_A396EmprCod
            }
            , new Object[] {
            T00T04_A5980HreNumPda, T00T04_A396EmprCod, T00T04_A4492HreBarCod, T00T04_A4493HreBarReo, T00T04_A4494HreBarPar, T00T04_A4495HreNumCie, T00T04_A5864HreProCodP, T00T04_A5865HreOrdLinF
            }
            , new Object[] {
            T00T05_A5980HreNumPda, T00T05_A396EmprCod, T00T05_A4492HreBarCod, T00T05_A4493HreBarReo, T00T05_A4494HreBarPar, T00T05_A4495HreNumCie, T00T05_A5864HreProCodP, T00T05_A5865HreOrdLinF
            }
            , new Object[] {
            T00T06_A407EmprNom, T00T06_n407EmprNom
            }
            , new Object[] {
            T00T07_A396EmprCod
            }
            , new Object[] {
            T00T08_A5980HreNumPda, T00T08_A407EmprNom, T00T08_n407EmprNom, T00T08_A396EmprCod, T00T08_A4492HreBarCod, T00T08_A4493HreBarReo, T00T08_A4494HreBarPar, T00T08_A4495HreNumCie, T00T08_A5864HreProCodP, T00T08_A5865HreOrdLinF
            }
            , new Object[] {
            T00T09_A396EmprCod
            }
            , new Object[] {
            T00T010_A396EmprCod, T00T010_A4492HreBarCod, T00T010_A4493HreBarReo, T00T010_A4494HreBarPar, T00T010_A4495HreNumCie, T00T010_A5864HreProCodP, T00T010_A5865HreOrdLinF, T00T010_A5980HreNumPda
            }
            , new Object[] {
            T00T011_A396EmprCod, T00T011_A4492HreBarCod, T00T011_A4493HreBarReo, T00T011_A4494HreBarPar, T00T011_A4495HreNumCie, T00T011_A5864HreProCodP, T00T011_A5865HreOrdLinF, T00T011_A5980HreNumPda
            }
            , new Object[] {
            T00T012_A396EmprCod, T00T012_A4492HreBarCod, T00T012_A4493HreBarReo, T00T012_A4494HreBarPar, T00T012_A4495HreNumCie, T00T012_A5864HreProCodP, T00T012_A5865HreOrdLinF, T00T012_A5980HreNumPda
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00T015_A396EmprCod, T00T015_A4492HreBarCod, T00T015_A4493HreBarReo, T00T015_A4494HreBarPar, T00T015_A4495HreNumCie, T00T015_A5864HreProCodP, T00T015_A5865HreOrdLinF, T00T015_A5980HreNumPda
            }
            , new Object[] {
            T00T016_A4492HreBarCod, T00T016_A4493HreBarReo, T00T016_A4494HreBarPar, T00T016_A4495HreNumCie, T00T016_A5864HreProCodP, T00T016_A5865HreOrdLinF, T00T016_A5980HreNumPda, T00T016_A5981Hre_AgpCod, T00T016_A5982Hre_AgpReo, T00T016_A5983Hre_AgpPar,
            T00T016_A5984Hre_AgpPro, T00T016_A5985Hre_AgpOrd, T00T016_A5986Hre_AgpKgm, T00T016_n5986Hre_AgpKgm, T00T016_A5987Hre_AgpPie, T00T016_n5987Hre_AgpPie, T00T016_A396EmprCod
            }
            , new Object[] {
            T00T017_A396EmprCod, T00T017_A4492HreBarCod, T00T017_A4493HreBarReo, T00T017_A4494HreBarPar, T00T017_A4495HreNumCie, T00T017_A5864HreProCodP, T00T017_A5865HreOrdLinF, T00T017_A5980HreNumPda, T00T017_A5981Hre_AgpCod, T00T017_A5982Hre_AgpReo,
            T00T017_A5983Hre_AgpPar, T00T017_A5984Hre_AgpPro, T00T017_A5985Hre_AgpOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00T021_A396EmprCod, T00T021_A4492HreBarCod, T00T021_A4493HreBarReo, T00T021_A4494HreBarPar, T00T021_A4495HreNumCie, T00T021_A5864HreProCodP, T00T021_A5865HreOrdLinF, T00T021_A5980HreNumPda, T00T021_A5981Hre_AgpCod, T00T021_A5982Hre_AgpReo,
            T00T021_A5983Hre_AgpPar, T00T021_A5984Hre_AgpPro, T00T021_A5985Hre_AgpOrd
            }
            , new Object[] {
            T00T022_A407EmprNom, T00T022_n407EmprNom
            }
            , new Object[] {
            T00T023_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV32Pgmname = "THAGHDP" ;
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z5982Hre_AgpReo ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte A5982Hre_AgpReo ;
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
   private short Z5985Hre_AgpOrd ;
   private short Z5987Hre_AgpPie ;
   private short nRcdDeleted_874 ;
   private short nRcdExists_874 ;
   private short nIsMod_874 ;
   private short A5865HreOrdLinF ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount874 ;
   private short RcdFound874 ;
   private short nBlankRcdUsr874 ;
   private short A5985Hre_AgpOrd ;
   private short A5987Hre_AgpPie ;
   private short RcdFound873 ;
   private short nIsDirty_873 ;
   private short nIsDirty_874 ;
   private short ZZ5865HreOrdLinF ;
   private int Z4492HreBarCod ;
   private int Z5980HreNumPda ;
   private int nRC_GXsfl_65 ;
   private int nGXsfl_65_idx=1 ;
   private int Z5981Hre_AgpCod ;
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
   private int A5980HreNumPda ;
   private int edtHreNumPda_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtavnRcdDeleted_874_Enabled ;
   private int edtHre_AgpCod_Enabled ;
   private int edtHre_AgpReo_Enabled ;
   private int edtHre_AgpPar_Enabled ;
   private int edtHre_AgpPro_Enabled ;
   private int edtHre_AgpOrd_Enabled ;
   private int edtHre_AgpKgm_Enabled ;
   private int edtHre_AgpPie_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int A5981Hre_AgpCod ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtHre_AgpOrd_Enabled ;
   private int defedtHre_AgpPro_Enabled ;
   private int defedtHre_AgpPar_Enabled ;
   private int defedtHre_AgpReo_Enabled ;
   private int defedtHre_AgpCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHreNumPda_Backcolor ;
   private int edtHreOrdLinF_Backcolor ;
   private int edtHreProCodP_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4492HreBarCod ;
   private int ZZ5980HreNumPda ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5986Hre_AgpKgm ;
   private java.math.BigDecimal A5986Hre_AgpKgm ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z5864HreProCodP ;
   private String Z5983Hre_AgpPar ;
   private String Z5984Hre_AgpPro ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A5864HreProCodP ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHreBarCod_Internalname ;
   private String sGXsfl_65_idx="0001" ;
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
   private String edtHreProCodP_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreOrdLinF_Internalname ;
   private String edtHreOrdLinF_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtHreNumPda_Internalname ;
   private String edtHreNumPda_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode874 ;
   private String edtavnRcdDeleted_874_Internalname ;
   private String edtHre_AgpCod_Internalname ;
   private String edtHre_AgpReo_Internalname ;
   private String edtHre_AgpPar_Internalname ;
   private String edtHre_AgpPro_Internalname ;
   private String edtHre_AgpOrd_Internalname ;
   private String edtHre_AgpKgm_Internalname ;
   private String edtHre_AgpPie_Internalname ;
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
   private String sMode873 ;
   private String GXCCtl ;
   private String A5983Hre_AgpPar ;
   private String A5984Hre_AgpPro ;
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
   private String sGXsfl_65_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_874_Jsonclick ;
   private String edtHre_AgpCod_Jsonclick ;
   private String edtHre_AgpReo_Jsonclick ;
   private String edtHre_AgpPar_Jsonclick ;
   private String edtHre_AgpPro_Jsonclick ;
   private String edtHre_AgpOrd_Jsonclick ;
   private String edtHre_AgpKgm_Jsonclick ;
   private String edtHre_AgpPie_Jsonclick ;
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
   private boolean bGXsfl_65_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n5986Hre_AgpKgm ;
   private boolean n5987Hre_AgpPie ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00T06_A407EmprNom ;
   private boolean[] T00T06_n407EmprNom ;
   private int[] T00T08_A5980HreNumPda ;
   private String[] T00T08_A407EmprNom ;
   private boolean[] T00T08_n407EmprNom ;
   private String[] T00T08_A396EmprCod ;
   private int[] T00T08_A4492HreBarCod ;
   private byte[] T00T08_A4493HreBarReo ;
   private String[] T00T08_A4494HreBarPar ;
   private byte[] T00T08_A4495HreNumCie ;
   private String[] T00T08_A5864HreProCodP ;
   private short[] T00T08_A5865HreOrdLinF ;
   private String[] T00T07_A396EmprCod ;
   private String[] T00T09_A396EmprCod ;
   private String[] T00T010_A396EmprCod ;
   private int[] T00T010_A4492HreBarCod ;
   private byte[] T00T010_A4493HreBarReo ;
   private String[] T00T010_A4494HreBarPar ;
   private byte[] T00T010_A4495HreNumCie ;
   private String[] T00T010_A5864HreProCodP ;
   private short[] T00T010_A5865HreOrdLinF ;
   private int[] T00T010_A5980HreNumPda ;
   private int[] T00T05_A5980HreNumPda ;
   private String[] T00T05_A396EmprCod ;
   private int[] T00T05_A4492HreBarCod ;
   private byte[] T00T05_A4493HreBarReo ;
   private String[] T00T05_A4494HreBarPar ;
   private byte[] T00T05_A4495HreNumCie ;
   private String[] T00T05_A5864HreProCodP ;
   private short[] T00T05_A5865HreOrdLinF ;
   private String[] T00T011_A396EmprCod ;
   private int[] T00T011_A4492HreBarCod ;
   private byte[] T00T011_A4493HreBarReo ;
   private String[] T00T011_A4494HreBarPar ;
   private byte[] T00T011_A4495HreNumCie ;
   private String[] T00T011_A5864HreProCodP ;
   private short[] T00T011_A5865HreOrdLinF ;
   private int[] T00T011_A5980HreNumPda ;
   private String[] T00T012_A396EmprCod ;
   private int[] T00T012_A4492HreBarCod ;
   private byte[] T00T012_A4493HreBarReo ;
   private String[] T00T012_A4494HreBarPar ;
   private byte[] T00T012_A4495HreNumCie ;
   private String[] T00T012_A5864HreProCodP ;
   private short[] T00T012_A5865HreOrdLinF ;
   private int[] T00T012_A5980HreNumPda ;
   private int[] T00T04_A5980HreNumPda ;
   private String[] T00T04_A396EmprCod ;
   private int[] T00T04_A4492HreBarCod ;
   private byte[] T00T04_A4493HreBarReo ;
   private String[] T00T04_A4494HreBarPar ;
   private byte[] T00T04_A4495HreNumCie ;
   private String[] T00T04_A5864HreProCodP ;
   private short[] T00T04_A5865HreOrdLinF ;
   private String[] T00T015_A396EmprCod ;
   private int[] T00T015_A4492HreBarCod ;
   private byte[] T00T015_A4493HreBarReo ;
   private String[] T00T015_A4494HreBarPar ;
   private byte[] T00T015_A4495HreNumCie ;
   private String[] T00T015_A5864HreProCodP ;
   private short[] T00T015_A5865HreOrdLinF ;
   private int[] T00T015_A5980HreNumPda ;
   private int[] T00T016_A4492HreBarCod ;
   private byte[] T00T016_A4493HreBarReo ;
   private String[] T00T016_A4494HreBarPar ;
   private byte[] T00T016_A4495HreNumCie ;
   private String[] T00T016_A5864HreProCodP ;
   private short[] T00T016_A5865HreOrdLinF ;
   private int[] T00T016_A5980HreNumPda ;
   private int[] T00T016_A5981Hre_AgpCod ;
   private byte[] T00T016_A5982Hre_AgpReo ;
   private String[] T00T016_A5983Hre_AgpPar ;
   private String[] T00T016_A5984Hre_AgpPro ;
   private short[] T00T016_A5985Hre_AgpOrd ;
   private java.math.BigDecimal[] T00T016_A5986Hre_AgpKgm ;
   private boolean[] T00T016_n5986Hre_AgpKgm ;
   private short[] T00T016_A5987Hre_AgpPie ;
   private boolean[] T00T016_n5987Hre_AgpPie ;
   private String[] T00T016_A396EmprCod ;
   private String[] T00T017_A396EmprCod ;
   private int[] T00T017_A4492HreBarCod ;
   private byte[] T00T017_A4493HreBarReo ;
   private String[] T00T017_A4494HreBarPar ;
   private byte[] T00T017_A4495HreNumCie ;
   private String[] T00T017_A5864HreProCodP ;
   private short[] T00T017_A5865HreOrdLinF ;
   private int[] T00T017_A5980HreNumPda ;
   private int[] T00T017_A5981Hre_AgpCod ;
   private byte[] T00T017_A5982Hre_AgpReo ;
   private String[] T00T017_A5983Hre_AgpPar ;
   private String[] T00T017_A5984Hre_AgpPro ;
   private short[] T00T017_A5985Hre_AgpOrd ;
   private int[] T00T03_A4492HreBarCod ;
   private byte[] T00T03_A4493HreBarReo ;
   private String[] T00T03_A4494HreBarPar ;
   private byte[] T00T03_A4495HreNumCie ;
   private String[] T00T03_A5864HreProCodP ;
   private short[] T00T03_A5865HreOrdLinF ;
   private int[] T00T03_A5980HreNumPda ;
   private int[] T00T03_A5981Hre_AgpCod ;
   private byte[] T00T03_A5982Hre_AgpReo ;
   private String[] T00T03_A5983Hre_AgpPar ;
   private String[] T00T03_A5984Hre_AgpPro ;
   private short[] T00T03_A5985Hre_AgpOrd ;
   private java.math.BigDecimal[] T00T03_A5986Hre_AgpKgm ;
   private boolean[] T00T03_n5986Hre_AgpKgm ;
   private short[] T00T03_A5987Hre_AgpPie ;
   private boolean[] T00T03_n5987Hre_AgpPie ;
   private String[] T00T03_A396EmprCod ;
   private int[] T00T02_A4492HreBarCod ;
   private byte[] T00T02_A4493HreBarReo ;
   private String[] T00T02_A4494HreBarPar ;
   private byte[] T00T02_A4495HreNumCie ;
   private String[] T00T02_A5864HreProCodP ;
   private short[] T00T02_A5865HreOrdLinF ;
   private int[] T00T02_A5980HreNumPda ;
   private int[] T00T02_A5981Hre_AgpCod ;
   private byte[] T00T02_A5982Hre_AgpReo ;
   private String[] T00T02_A5983Hre_AgpPar ;
   private String[] T00T02_A5984Hre_AgpPro ;
   private short[] T00T02_A5985Hre_AgpOrd ;
   private java.math.BigDecimal[] T00T02_A5986Hre_AgpKgm ;
   private boolean[] T00T02_n5986Hre_AgpKgm ;
   private short[] T00T02_A5987Hre_AgpPie ;
   private boolean[] T00T02_n5987Hre_AgpPie ;
   private String[] T00T02_A396EmprCod ;
   private String[] T00T021_A396EmprCod ;
   private int[] T00T021_A4492HreBarCod ;
   private byte[] T00T021_A4493HreBarReo ;
   private String[] T00T021_A4494HreBarPar ;
   private byte[] T00T021_A4495HreNumCie ;
   private String[] T00T021_A5864HreProCodP ;
   private short[] T00T021_A5865HreOrdLinF ;
   private int[] T00T021_A5980HreNumPda ;
   private int[] T00T021_A5981Hre_AgpCod ;
   private byte[] T00T021_A5982Hre_AgpReo ;
   private String[] T00T021_A5983Hre_AgpPar ;
   private String[] T00T021_A5984Hre_AgpPro ;
   private short[] T00T021_A5985Hre_AgpOrd ;
   private String[] T00T022_A407EmprNom ;
   private boolean[] T00T022_n407EmprNom ;
   private String[] T00T023_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thaghdp__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thaghdp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thaghdp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thaghdp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thaghdp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00T02", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd, Hre_AgpKgm, Hre_AgpPie, EmprCod FROM TXPHAGHD1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? AND Hre_AgpCod = ? AND Hre_AgpReo = ? AND Hre_AgpPar = ? AND Hre_AgpPro = ? AND Hre_AgpOrd = ?  FOR UPDATE OF Hre_AgpKgm, Hre_AgpPie NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T03", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd, Hre_AgpKgm, Hre_AgpPie, EmprCod FROM TXPHAGHD1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? AND Hre_AgpCod = ? AND Hre_AgpReo = ? AND Hre_AgpPar = ? AND Hre_AgpPro = ? AND Hre_AgpOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T04", "SELECT HreNumPda, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGHDP WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ?  FOR UPDATE OF HreNumPda NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T05", "SELECT HreNumPda, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGHDP WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T06", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T07", "SELECT EmprCod FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T08", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreNumPda, T2.EmprNom, TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreProCodP, TM1.HreOrdLinF FROM (TXPHAGHDP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreProCodP = ? and TM1.HreOrdLinF = ? and TM1.HreNumPda = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreProCodP, TM1.HreOrdLinF, TM1.HreNumPda ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T09", "SELECT EmprCod FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T010", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda FROM TXPHAGHDP WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T011", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda FROM TXPHAGHDP WHERE ( HreBarCod > ? or HreBarCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreProCodP > ? or HreProCodP = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreOrdLinF > ? or HreOrdLinF = ? and HreProCodP = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumPda > ?) and EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T012", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda FROM TXPHAGHDP WHERE ( HreBarCod < ? or HreBarCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreProCodP < ? or HreProCodP = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreOrdLinF < ? or HreOrdLinF = ? and HreProCodP = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumPda < ?) and EmprCod = ? ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreProCodP DESC, HreOrdLinF DESC, HreNumPda DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00T013", "INSERT INTO TXPHAGHDP(HreNumPda, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHAGHDP")
         ,new UpdateCursor("T00T014", "DELETE FROM TXPHAGHDP  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ?", GX_NOMASK, "TXPHAGHDP")
         ,new ForEachCursor("T00T015", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda FROM TXPHAGHDP WHERE EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T016", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd, Hre_AgpKgm, Hre_AgpPie, EmprCod FROM TXPHAGHD1 WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreProCodP = ? and HreOrdLinF = ? and HreNumPda = ? and Hre_AgpCod = ? and Hre_AgpReo = ? and Hre_AgpPar = ? and Hre_AgpPro = ? and Hre_AgpOrd = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T017", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd FROM TXPHAGHD1 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? AND Hre_AgpCod = ? AND Hre_AgpReo = ? AND Hre_AgpPar = ? AND Hre_AgpPro = ? AND Hre_AgpOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00T018", "INSERT INTO TXPHAGHD1(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd, Hre_AgpKgm, Hre_AgpPie, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHAGHD1")
         ,new UpdateCursor("T00T019", "UPDATE TXPHAGHD1 SET Hre_AgpKgm=?, Hre_AgpPie=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? AND Hre_AgpCod = ? AND Hre_AgpReo = ? AND Hre_AgpPar = ? AND Hre_AgpPro = ? AND Hre_AgpOrd = ?", GX_NOMASK, "TXPHAGHD1")
         ,new UpdateCursor("T00T020", "DELETE FROM TXPHAGHD1  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? AND HreNumPda = ? AND Hre_AgpCod = ? AND Hre_AgpReo = ? AND Hre_AgpPar = ? AND Hre_AgpPro = ? AND Hre_AgpOrd = ?", GX_NOMASK, "TXPHAGHD1")
         ,new ForEachCursor("T00T021", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd FROM TXPHAGHD1 WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreProCodP = ? and HreOrdLinF = ? and HreNumPda = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF, HreNumPda, Hre_AgpCod, Hre_AgpReo, Hre_AgpPar, Hre_AgpPro, Hre_AgpOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T022", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T023", "SELECT EmprCod FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreProCodP = ? AND HreOrdLinF = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
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
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((short[]) buf[12])[0] = rslt.getShort(13);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
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
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
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
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
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
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setString(25, (String)parms[24], 1);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setString(29, (String)parms[28], 3);
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
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 8);
               stmt.setByte(24, ((Number) parms[23]).byteValue());
               stmt.setString(25, (String)parms[24], 1);
               stmt.setByte(26, ((Number) parms[25]).byteValue());
               stmt.setInt(27, ((Number) parms[26]).intValue());
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setString(29, (String)parms[28], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 8);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
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
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 8);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[15]).shortValue());
               }
               stmt.setString(15, (String)parms[16], 3);
               return;
            case 17 :
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
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setByte(5, ((Number) parms[6]).byteValue());
               stmt.setString(6, (String)parms[7], 1);
               stmt.setByte(7, ((Number) parms[8]).byteValue());
               stmt.setString(8, (String)parms[9], 8);
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               stmt.setInt(10, ((Number) parms[11]).intValue());
               stmt.setInt(11, ((Number) parms[12]).intValue());
               stmt.setByte(12, ((Number) parms[13]).byteValue());
               stmt.setString(13, (String)parms[14], 1);
               stmt.setString(14, (String)parms[15], 8);
               stmt.setShort(15, ((Number) parms[16]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 8);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
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
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 8);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
      }
   }

}

