package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thisrex_impl extends GXDataArea
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
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A252CliCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Hay campos DT", ""), (short)(0)) ;
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
      nRC_GXsfl_255 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_255"))) ;
      nGXsfl_255_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_255_idx"))) ;
      sGXsfl_255_idx = httpContext.GetPar( "sGXsfl_255_idx") ;
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

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_377 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_377"))) ;
      nGXsfl_377_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_377_idx"))) ;
      sGXsfl_377_idx = httpContext.GetPar( "sGXsfl_377_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public thisrex_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thisrex_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thisrex_impl.class ));
   }

   public thisrex_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISREX.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "HreDisCli", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreDisCli_Internalname, GXutil.rtrim( A4516HreDisCli), GXutil.rtrim( localUtil.format( A4516HreDisCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreDisCli_Jsonclick, 0, "", "", "", "", "", 1, edtHreDisCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Serie Hist.Receta", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarSer_Internalname, GXutil.rtrim( A4517HreBarSer), GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descrip.Serie Hist.Receta", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarDsc_Internalname, GXutil.rtrim( A4518HreBarDsc), GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tipo Articulo Hist.Receta", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4519HreTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4519HreTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4519HreTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Desc,Tipo Articu.Hist.Receta", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipArtD_Internalname, GXutil.rtrim( A4520HreTipArtD), GXutil.rtrim( localUtil.format( A4520HreTipArtD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipArtD_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipArtD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Color Hist.Receta", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNom_Internalname, GXutil.rtrim( A4521HreColNom), GXutil.rtrim( localUtil.format( A4521HreColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNom_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero Color Hist.Receta", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4522HreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNum_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nombre Color Cli. Hist.Receta", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNomC_Internalname, GXutil.rtrim( A4523HreColNomC), GXutil.rtrim( localUtil.format( A4523HreColNomC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNomC_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNomC_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Numero Color Cli. Hist.Receta", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A4524HreColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreColNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4524HreColNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4524HreColNumC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNumC_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNumC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo Colorante Hist.Receta", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A4525HreTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Descrip.Tipo Coloran.H.Receta", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipColN_Internalname, GXutil.rtrim( A4526HreTipColN), GXutil.rtrim( localUtil.format( A4526HreTipColN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipColN_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipColN_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Fecha Generacion Hist.Receta", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecGen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecGen_Internalname, localUtil.format(A4527HreFecGen, "99/99/99"), localUtil.format( A4527HreFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecGen_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecGen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecGen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecGen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Fecha Disp.Cli. Hist.Receta", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecCli_Internalname, localUtil.format(A4528HreFecCli, "99/99/99"), localUtil.format( A4528HreFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Fecha Cierre Tint. Hist.Receta", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecTin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecTin_Internalname, localUtil.format(A4529HreFecTin, "99/99/99"), localUtil.format( A4529HreFecTin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecTin_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecTin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecTin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecTin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Fecha Fin Previs.Hist.Receta", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecFpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecFpr_Internalname, localUtil.format(A4530HreFecFpr, "99/99/99"), localUtil.format( A4530HreFecFpr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecFpr_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecFpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecFpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecFpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Materia Hist.Receta", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarMat_Internalname, GXutil.rtrim( A4531HreBarMat), GXutil.rtrim( localUtil.format( A4531HreBarMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarMat_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Kilos Hdr. Hist.Receta", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A4532HreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarKgm_Enabled!=0) ? localUtil.format( A4532HreBarKgm, "ZZZZZ9.99") : localUtil.format( A4532HreBarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarKgm_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Metros Hdr. Hist.Receta", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4533HreBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarMtr_Enabled!=0) ? localUtil.format( A4533HreBarMtr, "ZZZZZ9.99") : localUtil.format( A4533HreBarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Piezas. Hist.Receta", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A4534HreBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4534HreBarPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4534HreBarPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPie_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Partido. Hist.Receta", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePartCod_Internalname, GXutil.rtrim( A4535HrePartCod), GXutil.rtrim( localUtil.format( A4535HrePartCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePartCod_Jsonclick, 0, "", "", "", "", "", 1, edtHrePartCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Numero Metrico. Hist.Receta", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarNMtr_Internalname, GXutil.rtrim( A4536HreBarNMtr), GXutil.rtrim( localUtil.format( A4536HreBarNMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarNMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Mezcla. Hist.Receta", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarNMez_Internalname, GXutil.rtrim( A4537HreBarNMez), GXutil.rtrim( localUtil.format( A4537HreBarNMez, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarNMez_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarNMez_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Tintada. Hist.Receta", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumTen_Internalname, GXutil.rtrim( A4538HreNumTen), GXutil.rtrim( localUtil.format( A4538HreNumTen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumTen_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumTen_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Intensidad. Hist.Receta", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4539HreIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4539HreIntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4539HreIntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Descrip.Intensidad.Hist.Receta", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreIntDsc_Internalname, GXutil.rtrim( A4540HreIntDsc), GXutil.rtrim( localUtil.format( A4540HreIntDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHreIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Tonalidad. Hist.Receta", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumTon_Internalname, GXutil.rtrim( A4541HreNumTon), GXutil.rtrim( localUtil.format( A4541HreNumTon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumTon_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumTon_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Maquina Hdr. Hist.Receta", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreMaqHdr_Internalname, GXutil.rtrim( A4496HreMaqHdr), GXutil.rtrim( localUtil.format( A4496HreMaqHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreMaqHdr_Jsonclick, 0, "", "", "", "", "", 1, edtHreMaqHdr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Total Kgs.Agrup.Hist.Receta", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTotKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A4542HreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTotKgm_Enabled!=0) ? localUtil.format( A4542HreTotKgm, "ZZZZZ9.99") : localUtil.format( A4542HreTotKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTotKgm_Jsonclick, 0, "", "", "", "", "", 1, edtHreTotKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Total Mts.Agrup.Hist.Receta", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTotMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4543HreTotMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTotMtr_Enabled!=0) ? localUtil.format( A4543HreTotMtr, "ZZZZZ9.99") : localUtil.format( A4543HreTotMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTotMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHreTotMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Total Piezas Agr.Hist.Receta", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTotPie_Internalname, GXutil.ltrim( localUtil.ntoc( A4544HreTotPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTotPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTotPie_Jsonclick, 0, "", "", "", "", "", 1, edtHreTotPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Lts Sobrantes", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLtsSR_Internalname, GXutil.ltrim( localUtil.ntoc( A9805HreLtsSR, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLtsSR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9805HreLtsSR), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9805HreLtsSR), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLtsSR_Jsonclick, 0, "", "", "", "", "", 1, edtHreLtsSR_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Lts Sobrantes Stock", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLtsRs_Internalname, GXutil.ltrim( localUtil.ntoc( A9806HreLtsRs, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLtsRs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9806HreLtsRs), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9806HreLtsRs), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLtsRs_Jsonclick, 0, "", "", "", "", "", 1, edtHreLtsRs_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Acabado Quimico", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAcaQm_Internalname, GXutil.rtrim( A9807HreAcaQm), GXutil.rtrim( localUtil.format( A9807HreAcaQm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAcaQm_Jsonclick, 0, "", "", "", "", "", 1, edtHreAcaQm_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "Receta Acabado", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreRacab_Internalname, GXutil.rtrim( A9808HreRacab), GXutil.rtrim( localUtil.format( A9808HreRacab, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreRacab_Jsonclick, 0, "", "", "", "", "", 1, edtHreRacab_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Fecha Cierre acabado", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecAcb_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecAcb_Internalname, localUtil.ttoc( A9809HreFecAcb, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9809HreFecAcb, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecAcb_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecAcb_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecAcb_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecAcb_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREX.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Fact Abs", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A9810HreAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreAbs_Enabled!=0) ? localUtil.format( A9810HreAbs, "ZZ9.99") : localUtil.format( A9810HreAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreAbs_Jsonclick, 0, "", "", "", "", "", 1, edtHreAbs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Litros Recuperados", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLtsRc_Internalname, GXutil.ltrim( localUtil.ntoc( A10099HreLtsRc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLtsRc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10099HreLtsRc), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10099HreLtsRc), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLtsRc_Jsonclick, 0, "", "", "", "", "", 1, edtHreLtsRc_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "HDR Lts Recuperados", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreHdrLts_Internalname, GXutil.rtrim( A10100HreHdrLts), GXutil.rtrim( localUtil.format( A10100HreHdrLts, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreHdrLts_Jsonclick, 0, "", "", "", "", "", 1, edtHreHdrLts_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Fabs Hdr Lts recuperados", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFabs_Internalname, GXutil.ltrim( localUtil.ntoc( A10101HreFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreFabs_Enabled!=0) ? localUtil.format( A10101HreFabs, "ZZ9.99") : localUtil.format( A10101HreFabs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFabs_Jsonclick, 0, "", "", "", "", "", 1, edtHreFabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREX.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol255( ) ;
      /* Save parent mode. */
      sMode678 = Gx_mode ;
      nGXsfl_255_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount678 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_678 = (short)(1) ;
            scanStartNO678( ) ;
            while ( RcdFound678 != 0 )
            {
               init_level_properties678( ) ;
               getByPrimaryKeyNO678( ) ;
               addRowNO678( ) ;
               scanNextNO678( ) ;
            }
            scanEndNO678( ) ;
            nBlankRcdCount678 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalNO678( ) ;
         standaloneModalNO678( ) ;
         sMode678 = Gx_mode ;
         while ( nGXsfl_255_idx < nRC_GXsfl_255 )
         {
            bGXsfl_255_Refreshing = true ;
            readRowNO678( ) ;
            edtHreLinMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINMAQ_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQCOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreVolPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVOLPRD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreFacAbs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFACABS_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacAbs_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreFecPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECPES_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecPes_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreMaqPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQPES_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqPes_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreULinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREULINPRO_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreULinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreULinPro_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreUsrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREUSRCOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrCod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreFecAlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECALT_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFecAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecAlt_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreUsrMod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREUSRMOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreUsrMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrMod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreFecMod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECMOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecMod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFASCOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFasCod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREORDLIN_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreOrdLin_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreNroPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENROPAR_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNroPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNroPar_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreTotKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETOTKGS_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreTotKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotKgs_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreTotMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETOTMTS_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreTotMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotMts_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreTotPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETOTPRD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreTotPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotPrd_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreProPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROPRD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProPrd_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreNumRmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMRMT_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumRmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumRmt_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreNumReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMREO_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumReo_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreNumInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMINT_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumInt_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreDti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREDTI_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreDti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDti_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            edtHreDtf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREDTF_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreDtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDtf_Enabled), 5, 0), !bGXsfl_255_Refreshing);
            if ( ( nRcdExists_678 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalNO678( ) ;
            }
            sendRowNO678( ) ;
            bGXsfl_255_Refreshing = false ;
         }
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount678 = (short)(5) ;
         nRcdExists_678 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartNO678( ) ;
            while ( RcdFound678 != 0 )
            {
               sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_255678( ) ;
               init_level_properties678( ) ;
               standaloneNotModalNO678( ) ;
               getByPrimaryKeyNO678( ) ;
               standaloneModalNO678( ) ;
               addRowNO678( ) ;
               scanNextNO678( ) ;
            }
            scanEndNO678( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode678 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_255678( ) ;
      initAllNO678( ) ;
      init_level_properties678( ) ;
      nRcdExists_678 = (short)(0) ;
      nIsMod_678 = (short)(0) ;
      nRcdDeleted_678 = (short)(0) ;
      nBlankRcdCount678 = (short)(nBlankRcdUsr678+nBlankRcdCount678) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount678 > 0 )
      {
         standaloneNotModalNO678( ) ;
         standaloneModalNO678( ) ;
         addRowNO678( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHreLinMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount678 = (short)(nBlankRcdCount678-1) ;
      }
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode678 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 391,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 392,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 393,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 394,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREX.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 395,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISREX.htm");
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
      e11NO2 ();
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
            Z4516HreDisCli = httpContext.cgiGet( "Z4516HreDisCli") ;
            Z4517HreBarSer = httpContext.cgiGet( "Z4517HreBarSer") ;
            Z4518HreBarDsc = httpContext.cgiGet( "Z4518HreBarDsc") ;
            Z4519HreTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4519HreTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4520HreTipArtD = httpContext.cgiGet( "Z4520HreTipArtD") ;
            Z4521HreColNom = httpContext.cgiGet( "Z4521HreColNom") ;
            Z4522HreColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z4522HreColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4523HreColNomC = httpContext.cgiGet( "Z4523HreColNomC") ;
            Z4524HreColNumC = (int)(localUtil.ctol( httpContext.cgiGet( "Z4524HreColNumC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4525HreTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4525HreTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4526HreTipColN = httpContext.cgiGet( "Z4526HreTipColN") ;
            Z4527HreFecGen = localUtil.ctod( httpContext.cgiGet( "Z4527HreFecGen"), 0) ;
            Z4528HreFecCli = localUtil.ctod( httpContext.cgiGet( "Z4528HreFecCli"), 0) ;
            Z4529HreFecTin = localUtil.ctod( httpContext.cgiGet( "Z4529HreFecTin"), 0) ;
            Z4530HreFecFpr = localUtil.ctod( httpContext.cgiGet( "Z4530HreFecFpr"), 0) ;
            Z4531HreBarMat = httpContext.cgiGet( "Z4531HreBarMat") ;
            Z4532HreBarKgm = localUtil.ctond( httpContext.cgiGet( "Z4532HreBarKgm")) ;
            Z4533HreBarMtr = localUtil.ctond( httpContext.cgiGet( "Z4533HreBarMtr")) ;
            Z4534HreBarPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z4534HreBarPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4535HrePartCod = httpContext.cgiGet( "Z4535HrePartCod") ;
            Z4536HreBarNMtr = httpContext.cgiGet( "Z4536HreBarNMtr") ;
            Z4537HreBarNMez = httpContext.cgiGet( "Z4537HreBarNMez") ;
            Z4538HreNumTen = httpContext.cgiGet( "Z4538HreNumTen") ;
            Z4539HreIntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4539HreIntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4540HreIntDsc = httpContext.cgiGet( "Z4540HreIntDsc") ;
            Z4541HreNumTon = httpContext.cgiGet( "Z4541HreNumTon") ;
            Z4496HreMaqHdr = httpContext.cgiGet( "Z4496HreMaqHdr") ;
            Z4542HreTotKgm = localUtil.ctond( httpContext.cgiGet( "Z4542HreTotKgm")) ;
            Z4543HreTotMtr = localUtil.ctond( httpContext.cgiGet( "Z4543HreTotMtr")) ;
            Z4544HreTotPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z4544HreTotPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9805HreLtsSR = (int)(localUtil.ctol( httpContext.cgiGet( "Z9805HreLtsSR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9806HreLtsRs = (int)(localUtil.ctol( httpContext.cgiGet( "Z9806HreLtsRs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9807HreAcaQm = httpContext.cgiGet( "Z9807HreAcaQm") ;
            Z9808HreRacab = httpContext.cgiGet( "Z9808HreRacab") ;
            Z9809HreFecAcb = localUtil.ctot( httpContext.cgiGet( "Z9809HreFecAcb"), 0) ;
            Z9810HreAbs = localUtil.ctond( httpContext.cgiGet( "Z9810HreAbs")) ;
            Z10099HreLtsRc = (int)(localUtil.ctol( httpContext.cgiGet( "Z10099HreLtsRc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10100HreHdrLts = httpContext.cgiGet( "Z10100HreHdrLts") ;
            Z10101HreFabs = localUtil.ctond( httpContext.cgiGet( "Z10101HreFabs")) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_255 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_255"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
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
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4516HreDisCli = httpContext.cgiGet( edtHreDisCli_Internalname) ;
            n4516HreDisCli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", A4516HreDisCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A4517HreBarSer = httpContext.cgiGet( edtHreBarSer_Internalname) ;
            n4517HreBarSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", A4517HreBarSer);
            A4518HreBarDsc = httpContext.cgiGet( edtHreBarDsc_Internalname) ;
            n4518HreBarDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", A4518HreBarDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRETIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4519HreTipArt = (short)(0) ;
               n4519HreTipArt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
            }
            else
            {
               A4519HreTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtHreTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4519HreTipArt = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
            }
            A4520HreTipArtD = httpContext.cgiGet( edtHreTipArtD_Internalname) ;
            n4520HreTipArtD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", A4520HreTipArtD);
            A4521HreColNom = httpContext.cgiGet( edtHreColNom_Internalname) ;
            n4521HreColNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", A4521HreColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4522HreColNum = 0 ;
               n4522HreColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
            }
            else
            {
               A4522HreColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtHreColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4522HreColNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
            }
            A4523HreColNomC = httpContext.cgiGet( edtHreColNomC_Internalname) ;
            n4523HreColNomC = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", A4523HreColNomC);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECOLNUMC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreColNumC_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4524HreColNumC = 0 ;
               n4524HreColNumC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
            }
            else
            {
               A4524HreColNumC = (int)(localUtil.ctol( httpContext.cgiGet( edtHreColNumC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4524HreColNumC = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRETIPCOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreTipCol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4525HreTipCol = (byte)(0) ;
               n4525HreTipCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
            }
            else
            {
               A4525HreTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4525HreTipCol = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
            }
            A4526HreTipColN = httpContext.cgiGet( edtHreTipColN_Internalname) ;
            n4526HreTipColN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", A4526HreTipColN);
            if ( localUtil.vcdate( httpContext.cgiGet( edtHreFecGen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HREFECGEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecGen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4527HreFecGen = GXutil.nullDate() ;
               n4527HreFecGen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
            }
            else
            {
               A4527HreFecGen = localUtil.ctod( httpContext.cgiGet( edtHreFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4527HreFecGen = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtHreFecCli_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HREFECCLI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecCli_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4528HreFecCli = GXutil.nullDate() ;
               n4528HreFecCli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
            }
            else
            {
               A4528HreFecCli = localUtil.ctod( httpContext.cgiGet( edtHreFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4528HreFecCli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtHreFecTin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HREFECTIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecTin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4529HreFecTin = GXutil.nullDate() ;
               n4529HreFecTin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
            }
            else
            {
               A4529HreFecTin = localUtil.ctod( httpContext.cgiGet( edtHreFecTin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4529HreFecTin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtHreFecFpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HREFECFPR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecFpr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4530HreFecFpr = GXutil.nullDate() ;
               n4530HreFecFpr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
            }
            else
            {
               A4530HreFecFpr = localUtil.ctod( httpContext.cgiGet( edtHreFecFpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n4530HreFecFpr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
            }
            A4531HreBarMat = httpContext.cgiGet( edtHreBarMat_Internalname) ;
            n4531HreBarMat = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", A4531HreBarMat);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreBarKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreBarKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4532HreBarKgm = DecimalUtil.ZERO ;
               n4532HreBarKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
            }
            else
            {
               A4532HreBarKgm = localUtil.ctond( httpContext.cgiGet( edtHreBarKgm_Internalname)) ;
               n4532HreBarKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreBarMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreBarMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4533HreBarMtr = DecimalUtil.ZERO ;
               n4533HreBarMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
            }
            else
            {
               A4533HreBarMtr = localUtil.ctond( httpContext.cgiGet( edtHreBarMtr_Internalname)) ;
               n4533HreBarMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREBARPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreBarPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4534HreBarPie = 0 ;
               n4534HreBarPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
            }
            else
            {
               A4534HreBarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4534HreBarPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
            }
            A4535HrePartCod = httpContext.cgiGet( edtHrePartCod_Internalname) ;
            n4535HrePartCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", A4535HrePartCod);
            A4536HreBarNMtr = httpContext.cgiGet( edtHreBarNMtr_Internalname) ;
            n4536HreBarNMtr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", A4536HreBarNMtr);
            A4537HreBarNMez = httpContext.cgiGet( edtHreBarNMez_Internalname) ;
            n4537HreBarNMez = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", A4537HreBarNMez);
            A4538HreNumTen = httpContext.cgiGet( edtHreNumTen_Internalname) ;
            n4538HreNumTen = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", A4538HreNumTen);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREINTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreIntCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4539HreIntCod = (byte)(0) ;
               n4539HreIntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
            }
            else
            {
               A4539HreIntCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreIntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4539HreIntCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
            }
            A4540HreIntDsc = httpContext.cgiGet( edtHreIntDsc_Internalname) ;
            n4540HreIntDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", A4540HreIntDsc);
            A4541HreNumTon = httpContext.cgiGet( edtHreNumTon_Internalname) ;
            n4541HreNumTon = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", A4541HreNumTon);
            A4496HreMaqHdr = httpContext.cgiGet( edtHreMaqHdr_Internalname) ;
            n4496HreMaqHdr = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreTotKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreTotKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRETOTKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreTotKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4542HreTotKgm = DecimalUtil.ZERO ;
               n4542HreTotKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
            }
            else
            {
               A4542HreTotKgm = localUtil.ctond( httpContext.cgiGet( edtHreTotKgm_Internalname)) ;
               n4542HreTotKgm = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreTotMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreTotMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRETOTMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreTotMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4543HreTotMtr = DecimalUtil.ZERO ;
               n4543HreTotMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
            }
            else
            {
               A4543HreTotMtr = localUtil.ctond( httpContext.cgiGet( edtHreTotMtr_Internalname)) ;
               n4543HreTotMtr = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRETOTPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreTotPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4544HreTotPie = 0 ;
               n4544HreTotPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
            }
            else
            {
               A4544HreTotPie = (int)(localUtil.ctol( httpContext.cgiGet( edtHreTotPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n4544HreTotPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsSR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsSR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELTSSR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreLtsSR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9805HreLtsSR = 0 ;
               n9805HreLtsSR = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9805HreLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9805HreLtsSR), 5, 0));
            }
            else
            {
               A9805HreLtsSR = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsSR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9805HreLtsSR = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9805HreLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9805HreLtsSR), 5, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELTSRS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreLtsRs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9806HreLtsRs = 0 ;
               n9806HreLtsRs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9806HreLtsRs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9806HreLtsRs), 5, 0));
            }
            else
            {
               A9806HreLtsRs = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsRs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n9806HreLtsRs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9806HreLtsRs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9806HreLtsRs), 5, 0));
            }
            A9807HreAcaQm = httpContext.cgiGet( edtHreAcaQm_Internalname) ;
            n9807HreAcaQm = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9807HreAcaQm", A9807HreAcaQm);
            A9808HreRacab = httpContext.cgiGet( edtHreRacab_Internalname) ;
            n9808HreRacab = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9808HreRacab", A9808HreRacab);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtHreFecAcb_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "HREFECACB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFecAcb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
               n9809HreFecAcb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9809HreFecAcb", localUtil.ttoc( A9809HreFecAcb, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A9809HreFecAcb = localUtil.ctot( httpContext.cgiGet( edtHreFecAcb_Internalname)) ;
               n9809HreFecAcb = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9809HreFecAcb", localUtil.ttoc( A9809HreFecAcb, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREABS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreAbs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9810HreAbs = DecimalUtil.ZERO ;
               n9810HreAbs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9810HreAbs", GXutil.ltrimstr( A9810HreAbs, 6, 2));
            }
            else
            {
               A9810HreAbs = localUtil.ctond( httpContext.cgiGet( edtHreAbs_Internalname)) ;
               n9810HreAbs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9810HreAbs", GXutil.ltrimstr( A9810HreAbs, 6, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELTSRC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreLtsRc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10099HreLtsRc = 0 ;
               n10099HreLtsRc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10099HreLtsRc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10099HreLtsRc), 5, 0));
            }
            else
            {
               A10099HreLtsRc = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsRc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10099HreLtsRc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10099HreLtsRc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10099HreLtsRc), 5, 0));
            }
            A10100HreHdrLts = httpContext.cgiGet( edtHreHdrLts_Internalname) ;
            n10100HreHdrLts = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10100HreHdrLts", A10100HreHdrLts);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreFabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreFabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFABS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtHreFabs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10101HreFabs = DecimalUtil.ZERO ;
               n10101HreFabs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10101HreFabs", GXutil.ltrimstr( A10101HreFabs, 6, 2));
            }
            else
            {
               A10101HreFabs = localUtil.ctond( httpContext.cgiGet( edtHreFabs_Internalname)) ;
               n10101HreFabs = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10101HreFabs", GXutil.ltrimstr( A10101HreFabs, 6, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "UPD" ;
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
                        e11NO2 ();
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
            initAllNO675( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1874_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1874_Enabled), 5, 0), !bGXsfl_377_Refreshing);
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
      disableAttributesNO675( ) ;
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

   public void confirm_NO0( )
   {
      beforeValidateNO675( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsNO675( ) ;
         }
         else
         {
            checkExtendedTableNO675( ) ;
            if ( AnyError == 0 )
            {
               zmNO675( 6) ;
               zmNO675( 7) ;
            }
            closeExtendedTableCursorsNO675( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode675 = Gx_mode ;
         confirm_NO678( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode675 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesNO0( ) ;
      }
   }

   public void confirm_NO1874( )
   {
      nGXsfl_377_idx = 0 ;
      while ( nGXsfl_377_idx < nRC_GXsfl_377 )
      {
         readRowNO1874( ) ;
         if ( ( nRcdExists_1874 != 0 ) || ( nIsMod_1874 != 0 ) )
         {
            getKeyNO1874( ) ;
            if ( ( nRcdExists_1874 == 0 ) && ( nRcdDeleted_1874 == 0 ) )
            {
               if ( RcdFound1874 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateNO1874( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableNO1874( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsNO1874( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHreLinMaq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1874 != 0 )
               {
                  if ( nRcdDeleted_1874 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyNO1874( ) ;
                     loadNO1874( ) ;
                     beforeValidateNO1874( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsNO1874( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1874 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateNO1874( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableNO1874( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsNO1874( ) ;
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
                  if ( nRcdDeleted_1874 == 0 )
                  {
                     GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreLinMaq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1874_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreProCod_Internalname, GXutil.rtrim( A4551HreProCod)) ;
         httpContext.changePostValue( edtHreProDsc_Internalname, GXutil.rtrim( A4552HreProDsc)) ;
         httpContext.changePostValue( edtHreProTie_Internalname, GXutil.ltrim( localUtil.ntoc( A4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreProTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreVolPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4966HreVolPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTieprg_Internalname, GXutil.ltrim( localUtil.ntoc( A5947HreTieprg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNroPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A5948HreNroPrg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4550HreLinPro_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4551HreProCod_"+sGXsfl_377_idx, GXutil.rtrim( Z4551HreProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4552HreProDsc_"+sGXsfl_377_idx, GXutil.rtrim( Z4552HreProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4553HreProTie_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4554HreProTmx_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4555HreNumPro_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4556HreNumRec_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4966HreVolPro_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4966HreVolPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5947HreTieprg_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z5947HreTieprg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5948HreNroPrg_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z5948HreNroPrg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1874_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1874_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1874_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1874 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1874_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELINPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROCOD_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPRODSC_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTIE_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTMX_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMREC_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVOLPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETIEPRG_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTieprg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENROPRG_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_NO678( )
   {
      nGXsfl_255_idx = 0 ;
      while ( nGXsfl_255_idx < nRC_GXsfl_255 )
      {
         readRowNO678( ) ;
         if ( ( nRcdExists_678 != 0 ) || ( nIsMod_678 != 0 ) )
         {
            getKeyNO678( ) ;
            if ( ( nRcdExists_678 == 0 ) && ( nRcdDeleted_678 == 0 ) )
            {
               if ( RcdFound678 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateNO678( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableNO678( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsNO678( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode678 = Gx_mode ;
                        confirm_NO1874( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode678 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode678 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtHreLinMaq_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound678 != 0 )
               {
                  if ( nRcdDeleted_678 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyNO678( ) ;
                     loadNO678( ) ;
                     beforeValidateNO678( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsNO678( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_678 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateNO678( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableNO678( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsNO678( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode678 = Gx_mode ;
                              confirm_NO1874( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode678 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode678 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_678 == 0 )
                  {
                     GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreLinMaq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtHreLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreMaqCod_Internalname, GXutil.rtrim( A4546HreMaqCod)) ;
         httpContext.changePostValue( edtHreVolPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreFacAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreFecPes_Internalname, localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreMaqPes_Internalname, GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreULinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreUsrCod_Internalname, GXutil.rtrim( A4863HreUsrCod)) ;
         httpContext.changePostValue( edtHreFecAlt_Internalname, localUtil.ttoc( A4960HreFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreUsrMod_Internalname, GXutil.rtrim( A4961HreUsrMod)) ;
         httpContext.changePostValue( edtHreFecMod_Internalname, localUtil.ttoc( A4962HreFecMod, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreFasCod_Internalname, GXutil.rtrim( A4963HreFasCod)) ;
         httpContext.changePostValue( edtHreOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNroPar_Internalname, GXutil.ltrim( localUtil.ntoc( A4965HreNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTotKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4968HreTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTotMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4969HreTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTotPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4970HreTotPrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreProPrd_Internalname, GXutil.rtrim( A5863HreProPrd)) ;
         httpContext.changePostValue( edtHreNumRmt_Internalname, GXutil.ltrim( localUtil.ntoc( A5978HreNumRmt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5979HreNumReo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumInt_Internalname, GXutil.ltrim( localUtil.ntoc( A10102HreNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreDti_Internalname, localUtil.ttoc( A10103HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreDtf_Internalname, localUtil.ttoc( A10104HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_255_idx, GXutil.rtrim( Z4546HreMaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4584HreFecPes_"+sGXsfl_255_idx, localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4549HreULinPro_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_255_idx, GXutil.rtrim( Z4863HreUsrCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4960HreFecAlt_"+sGXsfl_255_idx, localUtil.ttoc( Z4960HreFecAlt, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4961HreUsrMod_"+sGXsfl_255_idx, GXutil.rtrim( Z4961HreUsrMod)) ;
         httpContext.changePostValue( "ZT_"+"Z4962HreFecMod_"+sGXsfl_255_idx, localUtil.ttoc( Z4962HreFecMod, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4963HreFasCod_"+sGXsfl_255_idx, GXutil.rtrim( Z4963HreFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4964HreOrdLin_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4965HreNroPar_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4965HreNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4968HreTotKgs_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4968HreTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4969HreTotMts_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4969HreTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4970HreTotPrd_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4970HreTotPrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5863HreProPrd_"+sGXsfl_255_idx, GXutil.rtrim( Z5863HreProPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z5978HreNumRmt_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z5978HreNumRmt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5979HreNumReo_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z5979HreNumReo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10102HreNumInt_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z10102HreNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10103HreDti_"+sGXsfl_255_idx, localUtil.ttoc( Z10103HreDti, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10104HreDtf_"+sGXsfl_255_idx, localUtil.ttoc( Z10104HreDtf, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRC_GXsfl_377_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_377, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_678_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_678_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_678_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_678 != 0 )
         {
            httpContext.changePostValue( "HRELINMAQ_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVOLPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFACABS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECPES_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQPES_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREULINPRO_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREUSRCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECALT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecAlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREUSRMOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrMod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECMOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecMod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFASCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREORDLIN_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENROPAR_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETOTKGS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETOTMTS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETOTPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMRMT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMREO_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMINT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREDTI_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREDTF_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDtf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionNO0( )
   {
   }

   public void e11NO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN001_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Lit0", AV23Lit0);
      GXt_char1 = AV24Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1229_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Lit1", AV24Lit1);
      GXt_char1 = AV25Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN273_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Lit2", AV25Lit2);
      GXt_char1 = AV26Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN209_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit3 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Lit3", AV26Lit3);
      GXt_char1 = AV27Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN358_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit4 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Lit4", AV27Lit4);
      GXt_char1 = AV28Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit5 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Lit5", AV28Lit5);
      GXt_char1 = AV29Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit6 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Lit6", AV29Lit6);
      AV30Lit7 = httpContext.getMessage( "Numero Cierres", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Lit7", AV30Lit7);
      GXt_char1 = AV31Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1137_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Lit8", AV31Lit8);
      GXt_char1 = AV32Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1135_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit9 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Lit9", AV32Lit9);
      GXt_char1 = AV33Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1134_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit10 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Lit10", AV33Lit10);
      AV34Lit11 = httpContext.getMessage( "Fecha Tinte", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Lit11", AV34Lit11);
      GXt_char1 = AV35Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit12 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Lit12", AV35Lit12);
      GXt_char1 = AV36Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1059_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit13 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Lit13", AV36Lit13);
      GXt_char1 = AV37Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN116_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit14 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Lit14", AV37Lit14);
      GXt_char1 = AV38Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1094_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit15 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38Lit15", AV38Lit15);
      GXt_char1 = AV39Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN210_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit16 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Lit16", AV39Lit16);
      GXt_char1 = AV40Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN465_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit17 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Lit17", AV40Lit17);
      GXt_char1 = AV41Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit18 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Lit18", AV41Lit18);
      GXt_char1 = AV42Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1363_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit19 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Lit19", AV42Lit19);
      AV43Lit20 = httpContext.getMessage( "Intensidad", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Lit20", AV43Lit20);
      GXt_char1 = AV44Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1295_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit21 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Lit21", AV44Lit21);
      GXt_char1 = AV45Lit22 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1287_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Lit22 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45Lit22", AV45Lit22);
      GXt_char1 = AV46Lit23 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN557_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV46Lit23 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46Lit23", AV46Lit23);
      GXt_char1 = AV47Lit24 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1301_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47Lit24 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Lit24", AV47Lit24);
      GXt_char1 = AV48Lit25 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1273_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Lit25 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Lit25", AV48Lit25);
      GXt_char1 = AV49Lit26 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1271_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Lit26 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Lit26", AV49Lit26);
      GXt_char1 = AV50Lit27 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1150_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Lit27 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Lit27", AV50Lit27);
      GXt_char1 = AV51Lit28 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT21_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV51Lit28 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Lit28", AV51Lit28);
      GXt_char1 = AV52Lit29 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1159_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Lit29 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Lit29", AV52Lit29);
      GXt_char1 = AV53Lit30 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT39_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Lit30 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Lit30", AV53Lit30);
      GXt_char1 = AV55Lit43 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT25_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV55Lit43 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Lit43", AV55Lit43);
      GXt_char1 = AV56Lit44 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1575_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56Lit44 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Lit44", AV56Lit44);
      GXt_char1 = AV57Lit45 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1480_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Lit45 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Lit45", AV57Lit45);
      GXt_char1 = AV58Lit46 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1277_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV58Lit46 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Lit46", AV58Lit46);
      GXt_char1 = AV59Lit47 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT43_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV59Lit47 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Lit47", AV59Lit47);
      GXt_char1 = AV60Lit48 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1053_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV60Lit48 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Lit48", AV60Lit48);
      GXt_char1 = AV61Lit49 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT47_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV61Lit49 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Lit49", AV61Lit49);
      GXt_char1 = AV62Lit50 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT40_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV62Lit50 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Lit50", AV62Lit50);
      GXt_char1 = AV63Lit51 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT66_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Lit51 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Lit51", AV63Lit51);
      GXt_char1 = AV66Lit52 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT608_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV66Lit52 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Lit52", AV66Lit52);
      GXt_char1 = AV67Lit53 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1162_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Lit53 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Lit53", AV67Lit53);
      GXt_char1 = AV68Lit58 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1340_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV68Lit58 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Lit58", AV68Lit58);
      GXt_char1 = AV70Lit59 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1342_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV70Lit59 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Lit59", AV70Lit59);
      GXt_char1 = AV69Lit60 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV69Lit60 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Lit60", AV69Lit60);
      GXt_char1 = AV71Lit61 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1159_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Lit61 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Lit61", AV71Lit61);
      GXt_char1 = AV73Lit62 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT126_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV73Lit62 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Lit62", AV73Lit62);
      AV74Lit63 = httpContext.getMessage( "F?", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Lit63", AV74Lit63);
      GXt_char1 = AV65LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV65LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65LitFe", AV65LitFe);
      GXt_char1 = AV64msg0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG240_", ""), (byte)(99), GXv_char2) ;
      thisrex_impl.this.GXt_char1 = GXv_char2[0] ;
      AV64msg0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64msg0", AV64msg0);
      AV22Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      thisrex_impl.this.A396EmprCod = GXv_char2[0] ;
      thisrex_impl.this.AV16EmprNom = GXv_char3[0] ;
      thisrex_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_char4[0] = AV22Station ;
      GXv_char3[0] = AV19ImpCod ;
      new app.pbusimp(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      thisrex_impl.this.AV22Station = GXv_char4[0] ;
      thisrex_impl.this.AV19ImpCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV19ImpCod", AV19ImpCod);
   }

   public void zmNO675( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4516HreDisCli = T00NO7_A4516HreDisCli[0] ;
            Z4517HreBarSer = T00NO7_A4517HreBarSer[0] ;
            Z4518HreBarDsc = T00NO7_A4518HreBarDsc[0] ;
            Z4519HreTipArt = T00NO7_A4519HreTipArt[0] ;
            Z4520HreTipArtD = T00NO7_A4520HreTipArtD[0] ;
            Z4521HreColNom = T00NO7_A4521HreColNom[0] ;
            Z4522HreColNum = T00NO7_A4522HreColNum[0] ;
            Z4523HreColNomC = T00NO7_A4523HreColNomC[0] ;
            Z4524HreColNumC = T00NO7_A4524HreColNumC[0] ;
            Z4525HreTipCol = T00NO7_A4525HreTipCol[0] ;
            Z4526HreTipColN = T00NO7_A4526HreTipColN[0] ;
            Z4527HreFecGen = T00NO7_A4527HreFecGen[0] ;
            Z4528HreFecCli = T00NO7_A4528HreFecCli[0] ;
            Z4529HreFecTin = T00NO7_A4529HreFecTin[0] ;
            Z4530HreFecFpr = T00NO7_A4530HreFecFpr[0] ;
            Z4531HreBarMat = T00NO7_A4531HreBarMat[0] ;
            Z4532HreBarKgm = T00NO7_A4532HreBarKgm[0] ;
            Z4533HreBarMtr = T00NO7_A4533HreBarMtr[0] ;
            Z4534HreBarPie = T00NO7_A4534HreBarPie[0] ;
            Z4535HrePartCod = T00NO7_A4535HrePartCod[0] ;
            Z4536HreBarNMtr = T00NO7_A4536HreBarNMtr[0] ;
            Z4537HreBarNMez = T00NO7_A4537HreBarNMez[0] ;
            Z4538HreNumTen = T00NO7_A4538HreNumTen[0] ;
            Z4539HreIntCod = T00NO7_A4539HreIntCod[0] ;
            Z4540HreIntDsc = T00NO7_A4540HreIntDsc[0] ;
            Z4541HreNumTon = T00NO7_A4541HreNumTon[0] ;
            Z4496HreMaqHdr = T00NO7_A4496HreMaqHdr[0] ;
            Z4542HreTotKgm = T00NO7_A4542HreTotKgm[0] ;
            Z4543HreTotMtr = T00NO7_A4543HreTotMtr[0] ;
            Z4544HreTotPie = T00NO7_A4544HreTotPie[0] ;
            Z9805HreLtsSR = T00NO7_A9805HreLtsSR[0] ;
            Z9806HreLtsRs = T00NO7_A9806HreLtsRs[0] ;
            Z9807HreAcaQm = T00NO7_A9807HreAcaQm[0] ;
            Z9808HreRacab = T00NO7_A9808HreRacab[0] ;
            Z9809HreFecAcb = T00NO7_A9809HreFecAcb[0] ;
            Z9810HreAbs = T00NO7_A9810HreAbs[0] ;
            Z10099HreLtsRc = T00NO7_A10099HreLtsRc[0] ;
            Z10100HreHdrLts = T00NO7_A10100HreHdrLts[0] ;
            Z10101HreFabs = T00NO7_A10101HreFabs[0] ;
            Z252CliCod = T00NO7_A252CliCod[0] ;
         }
         else
         {
            Z4516HreDisCli = A4516HreDisCli ;
            Z4517HreBarSer = A4517HreBarSer ;
            Z4518HreBarDsc = A4518HreBarDsc ;
            Z4519HreTipArt = A4519HreTipArt ;
            Z4520HreTipArtD = A4520HreTipArtD ;
            Z4521HreColNom = A4521HreColNom ;
            Z4522HreColNum = A4522HreColNum ;
            Z4523HreColNomC = A4523HreColNomC ;
            Z4524HreColNumC = A4524HreColNumC ;
            Z4525HreTipCol = A4525HreTipCol ;
            Z4526HreTipColN = A4526HreTipColN ;
            Z4527HreFecGen = A4527HreFecGen ;
            Z4528HreFecCli = A4528HreFecCli ;
            Z4529HreFecTin = A4529HreFecTin ;
            Z4530HreFecFpr = A4530HreFecFpr ;
            Z4531HreBarMat = A4531HreBarMat ;
            Z4532HreBarKgm = A4532HreBarKgm ;
            Z4533HreBarMtr = A4533HreBarMtr ;
            Z4534HreBarPie = A4534HreBarPie ;
            Z4535HrePartCod = A4535HrePartCod ;
            Z4536HreBarNMtr = A4536HreBarNMtr ;
            Z4537HreBarNMez = A4537HreBarNMez ;
            Z4538HreNumTen = A4538HreNumTen ;
            Z4539HreIntCod = A4539HreIntCod ;
            Z4540HreIntDsc = A4540HreIntDsc ;
            Z4541HreNumTon = A4541HreNumTon ;
            Z4496HreMaqHdr = A4496HreMaqHdr ;
            Z4542HreTotKgm = A4542HreTotKgm ;
            Z4543HreTotMtr = A4543HreTotMtr ;
            Z4544HreTotPie = A4544HreTotPie ;
            Z9805HreLtsSR = A9805HreLtsSR ;
            Z9806HreLtsRs = A9806HreLtsRs ;
            Z9807HreAcaQm = A9807HreAcaQm ;
            Z9808HreRacab = A9808HreRacab ;
            Z9809HreFecAcb = A9809HreFecAcb ;
            Z9810HreAbs = A9810HreAbs ;
            Z10099HreLtsRc = A10099HreLtsRc ;
            Z10100HreHdrLts = A10100HreHdrLts ;
            Z10101HreFabs = A10101HreFabs ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4516HreDisCli = A4516HreDisCli ;
         Z4517HreBarSer = A4517HreBarSer ;
         Z4518HreBarDsc = A4518HreBarDsc ;
         Z4519HreTipArt = A4519HreTipArt ;
         Z4520HreTipArtD = A4520HreTipArtD ;
         Z4521HreColNom = A4521HreColNom ;
         Z4522HreColNum = A4522HreColNum ;
         Z4523HreColNomC = A4523HreColNomC ;
         Z4524HreColNumC = A4524HreColNumC ;
         Z4525HreTipCol = A4525HreTipCol ;
         Z4526HreTipColN = A4526HreTipColN ;
         Z4527HreFecGen = A4527HreFecGen ;
         Z4528HreFecCli = A4528HreFecCli ;
         Z4529HreFecTin = A4529HreFecTin ;
         Z4530HreFecFpr = A4530HreFecFpr ;
         Z4531HreBarMat = A4531HreBarMat ;
         Z4532HreBarKgm = A4532HreBarKgm ;
         Z4533HreBarMtr = A4533HreBarMtr ;
         Z4534HreBarPie = A4534HreBarPie ;
         Z4535HrePartCod = A4535HrePartCod ;
         Z4536HreBarNMtr = A4536HreBarNMtr ;
         Z4537HreBarNMez = A4537HreBarNMez ;
         Z4538HreNumTen = A4538HreNumTen ;
         Z4539HreIntCod = A4539HreIntCod ;
         Z4540HreIntDsc = A4540HreIntDsc ;
         Z4541HreNumTon = A4541HreNumTon ;
         Z4496HreMaqHdr = A4496HreMaqHdr ;
         Z4542HreTotKgm = A4542HreTotKgm ;
         Z4543HreTotMtr = A4543HreTotMtr ;
         Z4544HreTotPie = A4544HreTotPie ;
         Z9805HreLtsSR = A9805HreLtsSR ;
         Z9806HreLtsRs = A9806HreLtsRs ;
         Z9807HreAcaQm = A9807HreAcaQm ;
         Z9808HreRacab = A9808HreRacab ;
         Z9809HreFecAcb = A9809HreFecAcb ;
         Z9810HreAbs = A9810HreAbs ;
         Z10099HreLtsRc = A10099HreLtsRc ;
         Z10100HreHdrLts = A10100HreHdrLts ;
         Z10101HreFabs = A10101HreFabs ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00NO8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00NO8_A407EmprNom[0] ;
      n407EmprNom = T00NO8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO SE PERMITE DAR DE ALTA", ""), 1, "");
         AnyError = (short)(1) ;
      }
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
      }
   }

   public void loadNO675( )
   {
      /* Using cursor T00NO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A407EmprNom = T00NO10_A407EmprNom[0] ;
         n407EmprNom = T00NO10_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4516HreDisCli = T00NO10_A4516HreDisCli[0] ;
         n4516HreDisCli = T00NO10_n4516HreDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", A4516HreDisCli);
         A279CliNom = T00NO10_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A4517HreBarSer = T00NO10_A4517HreBarSer[0] ;
         n4517HreBarSer = T00NO10_n4517HreBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", A4517HreBarSer);
         A4518HreBarDsc = T00NO10_A4518HreBarDsc[0] ;
         n4518HreBarDsc = T00NO10_n4518HreBarDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", A4518HreBarDsc);
         A4519HreTipArt = T00NO10_A4519HreTipArt[0] ;
         n4519HreTipArt = T00NO10_n4519HreTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
         A4520HreTipArtD = T00NO10_A4520HreTipArtD[0] ;
         n4520HreTipArtD = T00NO10_n4520HreTipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", A4520HreTipArtD);
         A4521HreColNom = T00NO10_A4521HreColNom[0] ;
         n4521HreColNom = T00NO10_n4521HreColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", A4521HreColNom);
         A4522HreColNum = T00NO10_A4522HreColNum[0] ;
         n4522HreColNum = T00NO10_n4522HreColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
         A4523HreColNomC = T00NO10_A4523HreColNomC[0] ;
         n4523HreColNomC = T00NO10_n4523HreColNomC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", A4523HreColNomC);
         A4524HreColNumC = T00NO10_A4524HreColNumC[0] ;
         n4524HreColNumC = T00NO10_n4524HreColNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
         A4525HreTipCol = T00NO10_A4525HreTipCol[0] ;
         n4525HreTipCol = T00NO10_n4525HreTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
         A4526HreTipColN = T00NO10_A4526HreTipColN[0] ;
         n4526HreTipColN = T00NO10_n4526HreTipColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", A4526HreTipColN);
         A4527HreFecGen = T00NO10_A4527HreFecGen[0] ;
         n4527HreFecGen = T00NO10_n4527HreFecGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
         A4528HreFecCli = T00NO10_A4528HreFecCli[0] ;
         n4528HreFecCli = T00NO10_n4528HreFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
         A4529HreFecTin = T00NO10_A4529HreFecTin[0] ;
         n4529HreFecTin = T00NO10_n4529HreFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
         A4530HreFecFpr = T00NO10_A4530HreFecFpr[0] ;
         n4530HreFecFpr = T00NO10_n4530HreFecFpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
         A4531HreBarMat = T00NO10_A4531HreBarMat[0] ;
         n4531HreBarMat = T00NO10_n4531HreBarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", A4531HreBarMat);
         A4532HreBarKgm = T00NO10_A4532HreBarKgm[0] ;
         n4532HreBarKgm = T00NO10_n4532HreBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
         A4533HreBarMtr = T00NO10_A4533HreBarMtr[0] ;
         n4533HreBarMtr = T00NO10_n4533HreBarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
         A4534HreBarPie = T00NO10_A4534HreBarPie[0] ;
         n4534HreBarPie = T00NO10_n4534HreBarPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
         A4535HrePartCod = T00NO10_A4535HrePartCod[0] ;
         n4535HrePartCod = T00NO10_n4535HrePartCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", A4535HrePartCod);
         A4536HreBarNMtr = T00NO10_A4536HreBarNMtr[0] ;
         n4536HreBarNMtr = T00NO10_n4536HreBarNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", A4536HreBarNMtr);
         A4537HreBarNMez = T00NO10_A4537HreBarNMez[0] ;
         n4537HreBarNMez = T00NO10_n4537HreBarNMez[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", A4537HreBarNMez);
         A4538HreNumTen = T00NO10_A4538HreNumTen[0] ;
         n4538HreNumTen = T00NO10_n4538HreNumTen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", A4538HreNumTen);
         A4539HreIntCod = T00NO10_A4539HreIntCod[0] ;
         n4539HreIntCod = T00NO10_n4539HreIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
         A4540HreIntDsc = T00NO10_A4540HreIntDsc[0] ;
         n4540HreIntDsc = T00NO10_n4540HreIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", A4540HreIntDsc);
         A4541HreNumTon = T00NO10_A4541HreNumTon[0] ;
         n4541HreNumTon = T00NO10_n4541HreNumTon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", A4541HreNumTon);
         A4496HreMaqHdr = T00NO10_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = T00NO10_n4496HreMaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
         A4542HreTotKgm = T00NO10_A4542HreTotKgm[0] ;
         n4542HreTotKgm = T00NO10_n4542HreTotKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
         A4543HreTotMtr = T00NO10_A4543HreTotMtr[0] ;
         n4543HreTotMtr = T00NO10_n4543HreTotMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
         A4544HreTotPie = T00NO10_A4544HreTotPie[0] ;
         n4544HreTotPie = T00NO10_n4544HreTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
         A9805HreLtsSR = T00NO10_A9805HreLtsSR[0] ;
         n9805HreLtsSR = T00NO10_n9805HreLtsSR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9805HreLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9805HreLtsSR), 5, 0));
         A9806HreLtsRs = T00NO10_A9806HreLtsRs[0] ;
         n9806HreLtsRs = T00NO10_n9806HreLtsRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9806HreLtsRs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9806HreLtsRs), 5, 0));
         A9807HreAcaQm = T00NO10_A9807HreAcaQm[0] ;
         n9807HreAcaQm = T00NO10_n9807HreAcaQm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9807HreAcaQm", A9807HreAcaQm);
         A9808HreRacab = T00NO10_A9808HreRacab[0] ;
         n9808HreRacab = T00NO10_n9808HreRacab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9808HreRacab", A9808HreRacab);
         A9809HreFecAcb = T00NO10_A9809HreFecAcb[0] ;
         n9809HreFecAcb = T00NO10_n9809HreFecAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9809HreFecAcb", localUtil.ttoc( A9809HreFecAcb, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9810HreAbs = T00NO10_A9810HreAbs[0] ;
         n9810HreAbs = T00NO10_n9810HreAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9810HreAbs", GXutil.ltrimstr( A9810HreAbs, 6, 2));
         A10099HreLtsRc = T00NO10_A10099HreLtsRc[0] ;
         n10099HreLtsRc = T00NO10_n10099HreLtsRc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10099HreLtsRc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10099HreLtsRc), 5, 0));
         A10100HreHdrLts = T00NO10_A10100HreHdrLts[0] ;
         n10100HreHdrLts = T00NO10_n10100HreHdrLts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10100HreHdrLts", A10100HreHdrLts);
         A10101HreFabs = T00NO10_A10101HreFabs[0] ;
         n10101HreFabs = T00NO10_n10101HreFabs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10101HreFabs", GXutil.ltrimstr( A10101HreFabs, 6, 2));
         A252CliCod = T00NO10_A252CliCod[0] ;
         n252CliCod = T00NO10_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zmNO675( -5) ;
      }
      pr_default.close(8);
      onLoadActionsNO675( ) ;
   }

   public void onLoadActionsNO675( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
   }

   public void checkExtendedTableNO675( )
   {
      nIsDirty_675 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      /* Using cursor T00NO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00NO9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      if ( (IsModified == 1) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite modificar", ""), 1, "HREBARCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsNO675( )
   {
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_7( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00NO11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00NO11_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKeyNO675( )
   {
      /* Using cursor T00NO12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound675 = (short)(1) ;
      }
      else
      {
         RcdFound675 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00NO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00NO7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmNO675( 5) ;
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T00NO7_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00NO7_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00NO7_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00NO7_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4516HreDisCli = T00NO7_A4516HreDisCli[0] ;
         n4516HreDisCli = T00NO7_n4516HreDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", A4516HreDisCli);
         A4517HreBarSer = T00NO7_A4517HreBarSer[0] ;
         n4517HreBarSer = T00NO7_n4517HreBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", A4517HreBarSer);
         A4518HreBarDsc = T00NO7_A4518HreBarDsc[0] ;
         n4518HreBarDsc = T00NO7_n4518HreBarDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", A4518HreBarDsc);
         A4519HreTipArt = T00NO7_A4519HreTipArt[0] ;
         n4519HreTipArt = T00NO7_n4519HreTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
         A4520HreTipArtD = T00NO7_A4520HreTipArtD[0] ;
         n4520HreTipArtD = T00NO7_n4520HreTipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", A4520HreTipArtD);
         A4521HreColNom = T00NO7_A4521HreColNom[0] ;
         n4521HreColNom = T00NO7_n4521HreColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", A4521HreColNom);
         A4522HreColNum = T00NO7_A4522HreColNum[0] ;
         n4522HreColNum = T00NO7_n4522HreColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
         A4523HreColNomC = T00NO7_A4523HreColNomC[0] ;
         n4523HreColNomC = T00NO7_n4523HreColNomC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", A4523HreColNomC);
         A4524HreColNumC = T00NO7_A4524HreColNumC[0] ;
         n4524HreColNumC = T00NO7_n4524HreColNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
         A4525HreTipCol = T00NO7_A4525HreTipCol[0] ;
         n4525HreTipCol = T00NO7_n4525HreTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
         A4526HreTipColN = T00NO7_A4526HreTipColN[0] ;
         n4526HreTipColN = T00NO7_n4526HreTipColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", A4526HreTipColN);
         A4527HreFecGen = T00NO7_A4527HreFecGen[0] ;
         n4527HreFecGen = T00NO7_n4527HreFecGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
         A4528HreFecCli = T00NO7_A4528HreFecCli[0] ;
         n4528HreFecCli = T00NO7_n4528HreFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
         A4529HreFecTin = T00NO7_A4529HreFecTin[0] ;
         n4529HreFecTin = T00NO7_n4529HreFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
         A4530HreFecFpr = T00NO7_A4530HreFecFpr[0] ;
         n4530HreFecFpr = T00NO7_n4530HreFecFpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
         A4531HreBarMat = T00NO7_A4531HreBarMat[0] ;
         n4531HreBarMat = T00NO7_n4531HreBarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", A4531HreBarMat);
         A4532HreBarKgm = T00NO7_A4532HreBarKgm[0] ;
         n4532HreBarKgm = T00NO7_n4532HreBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
         A4533HreBarMtr = T00NO7_A4533HreBarMtr[0] ;
         n4533HreBarMtr = T00NO7_n4533HreBarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
         A4534HreBarPie = T00NO7_A4534HreBarPie[0] ;
         n4534HreBarPie = T00NO7_n4534HreBarPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
         A4535HrePartCod = T00NO7_A4535HrePartCod[0] ;
         n4535HrePartCod = T00NO7_n4535HrePartCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", A4535HrePartCod);
         A4536HreBarNMtr = T00NO7_A4536HreBarNMtr[0] ;
         n4536HreBarNMtr = T00NO7_n4536HreBarNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", A4536HreBarNMtr);
         A4537HreBarNMez = T00NO7_A4537HreBarNMez[0] ;
         n4537HreBarNMez = T00NO7_n4537HreBarNMez[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", A4537HreBarNMez);
         A4538HreNumTen = T00NO7_A4538HreNumTen[0] ;
         n4538HreNumTen = T00NO7_n4538HreNumTen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", A4538HreNumTen);
         A4539HreIntCod = T00NO7_A4539HreIntCod[0] ;
         n4539HreIntCod = T00NO7_n4539HreIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
         A4540HreIntDsc = T00NO7_A4540HreIntDsc[0] ;
         n4540HreIntDsc = T00NO7_n4540HreIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", A4540HreIntDsc);
         A4541HreNumTon = T00NO7_A4541HreNumTon[0] ;
         n4541HreNumTon = T00NO7_n4541HreNumTon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", A4541HreNumTon);
         A4496HreMaqHdr = T00NO7_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = T00NO7_n4496HreMaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
         A4542HreTotKgm = T00NO7_A4542HreTotKgm[0] ;
         n4542HreTotKgm = T00NO7_n4542HreTotKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
         A4543HreTotMtr = T00NO7_A4543HreTotMtr[0] ;
         n4543HreTotMtr = T00NO7_n4543HreTotMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
         A4544HreTotPie = T00NO7_A4544HreTotPie[0] ;
         n4544HreTotPie = T00NO7_n4544HreTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
         A9805HreLtsSR = T00NO7_A9805HreLtsSR[0] ;
         n9805HreLtsSR = T00NO7_n9805HreLtsSR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9805HreLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9805HreLtsSR), 5, 0));
         A9806HreLtsRs = T00NO7_A9806HreLtsRs[0] ;
         n9806HreLtsRs = T00NO7_n9806HreLtsRs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9806HreLtsRs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9806HreLtsRs), 5, 0));
         A9807HreAcaQm = T00NO7_A9807HreAcaQm[0] ;
         n9807HreAcaQm = T00NO7_n9807HreAcaQm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9807HreAcaQm", A9807HreAcaQm);
         A9808HreRacab = T00NO7_A9808HreRacab[0] ;
         n9808HreRacab = T00NO7_n9808HreRacab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9808HreRacab", A9808HreRacab);
         A9809HreFecAcb = T00NO7_A9809HreFecAcb[0] ;
         n9809HreFecAcb = T00NO7_n9809HreFecAcb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9809HreFecAcb", localUtil.ttoc( A9809HreFecAcb, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9810HreAbs = T00NO7_A9810HreAbs[0] ;
         n9810HreAbs = T00NO7_n9810HreAbs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9810HreAbs", GXutil.ltrimstr( A9810HreAbs, 6, 2));
         A10099HreLtsRc = T00NO7_A10099HreLtsRc[0] ;
         n10099HreLtsRc = T00NO7_n10099HreLtsRc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10099HreLtsRc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10099HreLtsRc), 5, 0));
         A10100HreHdrLts = T00NO7_A10100HreHdrLts[0] ;
         n10100HreHdrLts = T00NO7_n10100HreHdrLts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10100HreHdrLts", A10100HreHdrLts);
         A10101HreFabs = T00NO7_A10101HreFabs[0] ;
         n10101HreFabs = T00NO7_n10101HreFabs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10101HreFabs", GXutil.ltrimstr( A10101HreFabs, 6, 2));
         A252CliCod = T00NO7_A252CliCod[0] ;
         n252CliCod = T00NO7_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         sMode675 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadNO675( ) ;
         if ( AnyError == 1 )
         {
            RcdFound675 = (short)(0) ;
            initializeNonKeyNO675( ) ;
         }
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound675 = (short)(0) ;
         initializeNonKeyNO675( ) ;
         sMode675 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyNO675( ) ;
      if ( RcdFound675 == 0 )
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
      RcdFound675 = (short)(0) ;
      /* Using cursor T00NO13 */
      pr_default.execute(11, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( T00NO13_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00NO13_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO13_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00NO13_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO13_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00NO13_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00NO13_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00NO13_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO13_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO13_A4495HreNumCie[0] < A4495HreNumCie ) ) && ( GXutil.strcmp(T00NO13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( T00NO13_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00NO13_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO13_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00NO13_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO13_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00NO13_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00NO13_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00NO13_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO13_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO13_A4495HreNumCie[0] > A4495HreNumCie ) ) && ( GXutil.strcmp(T00NO13_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T00NO13_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00NO13_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00NO13_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00NO13_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            RcdFound675 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound675 = (short)(0) ;
      /* Using cursor T00NO14 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4495HreNumCie), A396EmprCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( T00NO14_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00NO14_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO14_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00NO14_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO14_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00NO14_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00NO14_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00NO14_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO14_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO14_A4495HreNumCie[0] > A4495HreNumCie ) ) && ( GXutil.strcmp(T00NO14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( T00NO14_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00NO14_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO14_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00NO14_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO14_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00NO14_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00NO14_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00NO14_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00NO14_A4492HreBarCod[0] == A4492HreBarCod ) && ( T00NO14_A4495HreNumCie[0] < A4495HreNumCie ) ) && ( GXutil.strcmp(T00NO14_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4492HreBarCod = T00NO14_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00NO14_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00NO14_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00NO14_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            RcdFound675 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyNO675( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtHreBarCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertNO675( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound675 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
            {
               A4492HreBarCod = Z4492HreBarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
               A4493HreBarReo = Z4493HreBarReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
               A4494HreBarPar = Z4494HreBarPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
               A4495HreNumCie = Z4495HreNumCie ;
               httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
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
               updateNO675( ) ;
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtHreBarCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertNO675( ) ;
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
                  insertNO675( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
      {
         A4492HreBarCod = Z4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = Z4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = Z4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = Z4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
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
      getKeyNO675( ) ;
      if ( RcdFound675 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
         {
            A4492HreBarCod = Z4492HreBarCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = Z4493HreBarReo ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = Z4494HreBarPar ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = Z4495HreNumCie ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thisrex");
      GX_FocusControl = edtHreDisCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_NO0( ) ;
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
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHreDisCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartNO675( ) ;
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreDisCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndNO675( ) ;
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
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreDisCli_Internalname ;
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
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreDisCli_Internalname ;
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
      scanStartNO675( ) ;
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound675 != 0 )
         {
            scanNextNO675( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreDisCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndNO675( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyNO675( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00NO6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z4516HreDisCli, T00NO6_A4516HreDisCli[0]) != 0 ) || ( GXutil.strcmp(Z4517HreBarSer, T00NO6_A4517HreBarSer[0]) != 0 ) || ( GXutil.strcmp(Z4518HreBarDsc, T00NO6_A4518HreBarDsc[0]) != 0 ) || ( Z4519HreTipArt != T00NO6_A4519HreTipArt[0] ) || ( GXutil.strcmp(Z4520HreTipArtD, T00NO6_A4520HreTipArtD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4521HreColNom, T00NO6_A4521HreColNom[0]) != 0 ) || ( Z4522HreColNum != T00NO6_A4522HreColNum[0] ) || ( GXutil.strcmp(Z4523HreColNomC, T00NO6_A4523HreColNomC[0]) != 0 ) || ( Z4524HreColNumC != T00NO6_A4524HreColNumC[0] ) || ( Z4525HreTipCol != T00NO6_A4525HreTipCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4526HreTipColN, T00NO6_A4526HreTipColN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4527HreFecGen), GXutil.resetTime(T00NO6_A4527HreFecGen[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4528HreFecCli), GXutil.resetTime(T00NO6_A4528HreFecCli[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4529HreFecTin), GXutil.resetTime(T00NO6_A4529HreFecTin[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4530HreFecFpr), GXutil.resetTime(T00NO6_A4530HreFecFpr[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4531HreBarMat, T00NO6_A4531HreBarMat[0]) != 0 ) || ( DecimalUtil.compareTo(Z4532HreBarKgm, T00NO6_A4532HreBarKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4533HreBarMtr, T00NO6_A4533HreBarMtr[0]) != 0 ) || ( Z4534HreBarPie != T00NO6_A4534HreBarPie[0] ) || ( GXutil.strcmp(Z4535HrePartCod, T00NO6_A4535HrePartCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4536HreBarNMtr, T00NO6_A4536HreBarNMtr[0]) != 0 ) || ( GXutil.strcmp(Z4537HreBarNMez, T00NO6_A4537HreBarNMez[0]) != 0 ) || ( GXutil.strcmp(Z4538HreNumTen, T00NO6_A4538HreNumTen[0]) != 0 ) || ( Z4539HreIntCod != T00NO6_A4539HreIntCod[0] ) || ( GXutil.strcmp(Z4540HreIntDsc, T00NO6_A4540HreIntDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4541HreNumTon, T00NO6_A4541HreNumTon[0]) != 0 ) || ( GXutil.strcmp(Z4496HreMaqHdr, T00NO6_A4496HreMaqHdr[0]) != 0 ) || ( DecimalUtil.compareTo(Z4542HreTotKgm, T00NO6_A4542HreTotKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4543HreTotMtr, T00NO6_A4543HreTotMtr[0]) != 0 ) || ( Z4544HreTotPie != T00NO6_A4544HreTotPie[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9805HreLtsSR != T00NO6_A9805HreLtsSR[0] ) || ( Z9806HreLtsRs != T00NO6_A9806HreLtsRs[0] ) || ( GXutil.strcmp(Z9807HreAcaQm, T00NO6_A9807HreAcaQm[0]) != 0 ) || ( GXutil.strcmp(Z9808HreRacab, T00NO6_A9808HreRacab[0]) != 0 ) || !( GXutil.dateCompare(Z9809HreFecAcb, T00NO6_A9809HreFecAcb[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z9810HreAbs, T00NO6_A9810HreAbs[0]) != 0 ) || ( Z10099HreLtsRc != T00NO6_A10099HreLtsRc[0] ) || ( GXutil.strcmp(Z10100HreHdrLts, T00NO6_A10100HreHdrLts[0]) != 0 ) || ( DecimalUtil.compareTo(Z10101HreFabs, T00NO6_A10101HreFabs[0]) != 0 ) || ( Z252CliCod != T00NO6_A252CliCod[0] ) )
         {
            if ( GXutil.strcmp(Z4516HreDisCli, T00NO6_A4516HreDisCli[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreDisCli");
               GXutil.writeLogRaw("Old: ",Z4516HreDisCli);
               GXutil.writeLogRaw("Current: ",T00NO6_A4516HreDisCli[0]);
            }
            if ( GXutil.strcmp(Z4517HreBarSer, T00NO6_A4517HreBarSer[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarSer");
               GXutil.writeLogRaw("Old: ",Z4517HreBarSer);
               GXutil.writeLogRaw("Current: ",T00NO6_A4517HreBarSer[0]);
            }
            if ( GXutil.strcmp(Z4518HreBarDsc, T00NO6_A4518HreBarDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarDsc");
               GXutil.writeLogRaw("Old: ",Z4518HreBarDsc);
               GXutil.writeLogRaw("Current: ",T00NO6_A4518HreBarDsc[0]);
            }
            if ( Z4519HreTipArt != T00NO6_A4519HreTipArt[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTipArt");
               GXutil.writeLogRaw("Old: ",Z4519HreTipArt);
               GXutil.writeLogRaw("Current: ",T00NO6_A4519HreTipArt[0]);
            }
            if ( GXutil.strcmp(Z4520HreTipArtD, T00NO6_A4520HreTipArtD[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTipArtD");
               GXutil.writeLogRaw("Old: ",Z4520HreTipArtD);
               GXutil.writeLogRaw("Current: ",T00NO6_A4520HreTipArtD[0]);
            }
            if ( GXutil.strcmp(Z4521HreColNom, T00NO6_A4521HreColNom[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreColNom");
               GXutil.writeLogRaw("Old: ",Z4521HreColNom);
               GXutil.writeLogRaw("Current: ",T00NO6_A4521HreColNom[0]);
            }
            if ( Z4522HreColNum != T00NO6_A4522HreColNum[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreColNum");
               GXutil.writeLogRaw("Old: ",Z4522HreColNum);
               GXutil.writeLogRaw("Current: ",T00NO6_A4522HreColNum[0]);
            }
            if ( GXutil.strcmp(Z4523HreColNomC, T00NO6_A4523HreColNomC[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreColNomC");
               GXutil.writeLogRaw("Old: ",Z4523HreColNomC);
               GXutil.writeLogRaw("Current: ",T00NO6_A4523HreColNomC[0]);
            }
            if ( Z4524HreColNumC != T00NO6_A4524HreColNumC[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreColNumC");
               GXutil.writeLogRaw("Old: ",Z4524HreColNumC);
               GXutil.writeLogRaw("Current: ",T00NO6_A4524HreColNumC[0]);
            }
            if ( Z4525HreTipCol != T00NO6_A4525HreTipCol[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTipCol");
               GXutil.writeLogRaw("Old: ",Z4525HreTipCol);
               GXutil.writeLogRaw("Current: ",T00NO6_A4525HreTipCol[0]);
            }
            if ( GXutil.strcmp(Z4526HreTipColN, T00NO6_A4526HreTipColN[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTipColN");
               GXutil.writeLogRaw("Old: ",Z4526HreTipColN);
               GXutil.writeLogRaw("Current: ",T00NO6_A4526HreTipColN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4527HreFecGen), GXutil.resetTime(T00NO6_A4527HreFecGen[0])) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecGen");
               GXutil.writeLogRaw("Old: ",Z4527HreFecGen);
               GXutil.writeLogRaw("Current: ",T00NO6_A4527HreFecGen[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4528HreFecCli), GXutil.resetTime(T00NO6_A4528HreFecCli[0])) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecCli");
               GXutil.writeLogRaw("Old: ",Z4528HreFecCli);
               GXutil.writeLogRaw("Current: ",T00NO6_A4528HreFecCli[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4529HreFecTin), GXutil.resetTime(T00NO6_A4529HreFecTin[0])) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecTin");
               GXutil.writeLogRaw("Old: ",Z4529HreFecTin);
               GXutil.writeLogRaw("Current: ",T00NO6_A4529HreFecTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4530HreFecFpr), GXutil.resetTime(T00NO6_A4530HreFecFpr[0])) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecFpr");
               GXutil.writeLogRaw("Old: ",Z4530HreFecFpr);
               GXutil.writeLogRaw("Current: ",T00NO6_A4530HreFecFpr[0]);
            }
            if ( GXutil.strcmp(Z4531HreBarMat, T00NO6_A4531HreBarMat[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarMat");
               GXutil.writeLogRaw("Old: ",Z4531HreBarMat);
               GXutil.writeLogRaw("Current: ",T00NO6_A4531HreBarMat[0]);
            }
            if ( DecimalUtil.compareTo(Z4532HreBarKgm, T00NO6_A4532HreBarKgm[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarKgm");
               GXutil.writeLogRaw("Old: ",Z4532HreBarKgm);
               GXutil.writeLogRaw("Current: ",T00NO6_A4532HreBarKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z4533HreBarMtr, T00NO6_A4533HreBarMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarMtr");
               GXutil.writeLogRaw("Old: ",Z4533HreBarMtr);
               GXutil.writeLogRaw("Current: ",T00NO6_A4533HreBarMtr[0]);
            }
            if ( Z4534HreBarPie != T00NO6_A4534HreBarPie[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarPie");
               GXutil.writeLogRaw("Old: ",Z4534HreBarPie);
               GXutil.writeLogRaw("Current: ",T00NO6_A4534HreBarPie[0]);
            }
            if ( GXutil.strcmp(Z4535HrePartCod, T00NO6_A4535HrePartCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HrePartCod");
               GXutil.writeLogRaw("Old: ",Z4535HrePartCod);
               GXutil.writeLogRaw("Current: ",T00NO6_A4535HrePartCod[0]);
            }
            if ( GXutil.strcmp(Z4536HreBarNMtr, T00NO6_A4536HreBarNMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarNMtr");
               GXutil.writeLogRaw("Old: ",Z4536HreBarNMtr);
               GXutil.writeLogRaw("Current: ",T00NO6_A4536HreBarNMtr[0]);
            }
            if ( GXutil.strcmp(Z4537HreBarNMez, T00NO6_A4537HreBarNMez[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreBarNMez");
               GXutil.writeLogRaw("Old: ",Z4537HreBarNMez);
               GXutil.writeLogRaw("Current: ",T00NO6_A4537HreBarNMez[0]);
            }
            if ( GXutil.strcmp(Z4538HreNumTen, T00NO6_A4538HreNumTen[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumTen");
               GXutil.writeLogRaw("Old: ",Z4538HreNumTen);
               GXutil.writeLogRaw("Current: ",T00NO6_A4538HreNumTen[0]);
            }
            if ( Z4539HreIntCod != T00NO6_A4539HreIntCod[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreIntCod");
               GXutil.writeLogRaw("Old: ",Z4539HreIntCod);
               GXutil.writeLogRaw("Current: ",T00NO6_A4539HreIntCod[0]);
            }
            if ( GXutil.strcmp(Z4540HreIntDsc, T00NO6_A4540HreIntDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreIntDsc");
               GXutil.writeLogRaw("Old: ",Z4540HreIntDsc);
               GXutil.writeLogRaw("Current: ",T00NO6_A4540HreIntDsc[0]);
            }
            if ( GXutil.strcmp(Z4541HreNumTon, T00NO6_A4541HreNumTon[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumTon");
               GXutil.writeLogRaw("Old: ",Z4541HreNumTon);
               GXutil.writeLogRaw("Current: ",T00NO6_A4541HreNumTon[0]);
            }
            if ( GXutil.strcmp(Z4496HreMaqHdr, T00NO6_A4496HreMaqHdr[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreMaqHdr");
               GXutil.writeLogRaw("Old: ",Z4496HreMaqHdr);
               GXutil.writeLogRaw("Current: ",T00NO6_A4496HreMaqHdr[0]);
            }
            if ( DecimalUtil.compareTo(Z4542HreTotKgm, T00NO6_A4542HreTotKgm[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTotKgm");
               GXutil.writeLogRaw("Old: ",Z4542HreTotKgm);
               GXutil.writeLogRaw("Current: ",T00NO6_A4542HreTotKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z4543HreTotMtr, T00NO6_A4543HreTotMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTotMtr");
               GXutil.writeLogRaw("Old: ",Z4543HreTotMtr);
               GXutil.writeLogRaw("Current: ",T00NO6_A4543HreTotMtr[0]);
            }
            if ( Z4544HreTotPie != T00NO6_A4544HreTotPie[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTotPie");
               GXutil.writeLogRaw("Old: ",Z4544HreTotPie);
               GXutil.writeLogRaw("Current: ",T00NO6_A4544HreTotPie[0]);
            }
            if ( Z9805HreLtsSR != T00NO6_A9805HreLtsSR[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreLtsSR");
               GXutil.writeLogRaw("Old: ",Z9805HreLtsSR);
               GXutil.writeLogRaw("Current: ",T00NO6_A9805HreLtsSR[0]);
            }
            if ( Z9806HreLtsRs != T00NO6_A9806HreLtsRs[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreLtsRs");
               GXutil.writeLogRaw("Old: ",Z9806HreLtsRs);
               GXutil.writeLogRaw("Current: ",T00NO6_A9806HreLtsRs[0]);
            }
            if ( GXutil.strcmp(Z9807HreAcaQm, T00NO6_A9807HreAcaQm[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreAcaQm");
               GXutil.writeLogRaw("Old: ",Z9807HreAcaQm);
               GXutil.writeLogRaw("Current: ",T00NO6_A9807HreAcaQm[0]);
            }
            if ( GXutil.strcmp(Z9808HreRacab, T00NO6_A9808HreRacab[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreRacab");
               GXutil.writeLogRaw("Old: ",Z9808HreRacab);
               GXutil.writeLogRaw("Current: ",T00NO6_A9808HreRacab[0]);
            }
            if ( !( GXutil.dateCompare(Z9809HreFecAcb, T00NO6_A9809HreFecAcb[0]) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecAcb");
               GXutil.writeLogRaw("Old: ",Z9809HreFecAcb);
               GXutil.writeLogRaw("Current: ",T00NO6_A9809HreFecAcb[0]);
            }
            if ( DecimalUtil.compareTo(Z9810HreAbs, T00NO6_A9810HreAbs[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreAbs");
               GXutil.writeLogRaw("Old: ",Z9810HreAbs);
               GXutil.writeLogRaw("Current: ",T00NO6_A9810HreAbs[0]);
            }
            if ( Z10099HreLtsRc != T00NO6_A10099HreLtsRc[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreLtsRc");
               GXutil.writeLogRaw("Old: ",Z10099HreLtsRc);
               GXutil.writeLogRaw("Current: ",T00NO6_A10099HreLtsRc[0]);
            }
            if ( GXutil.strcmp(Z10100HreHdrLts, T00NO6_A10100HreHdrLts[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreHdrLts");
               GXutil.writeLogRaw("Old: ",Z10100HreHdrLts);
               GXutil.writeLogRaw("Current: ",T00NO6_A10100HreHdrLts[0]);
            }
            if ( DecimalUtil.compareTo(Z10101HreFabs, T00NO6_A10101HreFabs[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFabs");
               GXutil.writeLogRaw("Old: ",Z10101HreFabs);
               GXutil.writeLogRaw("Current: ",T00NO6_A10101HreFabs[0]);
            }
            if ( Z252CliCod != T00NO6_A252CliCod[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00NO6_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertNO675( )
   {
      beforeValidateNO675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNO675( ) ;
      }
      if ( AnyError == 0 )
      {
         zmNO675( 0) ;
         checkOptimisticConcurrencyNO675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNO675( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertNO675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NO15 */
                  pr_default.execute(13, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n9805HreLtsSR), Integer.valueOf(A9805HreLtsSR), Boolean.valueOf(n9806HreLtsRs), Integer.valueOf(A9806HreLtsRs), Boolean.valueOf(n9807HreAcaQm), A9807HreAcaQm, Boolean.valueOf(n9808HreRacab), A9808HreRacab, Boolean.valueOf(n9809HreFecAcb), A9809HreFecAcb, Boolean.valueOf(n9810HreAbs), A9810HreAbs, Boolean.valueOf(n10099HreLtsRc), Integer.valueOf(A10099HreLtsRc), Boolean.valueOf(n10100HreHdrLts), A10100HreHdrLts, Boolean.valueOf(n10101HreFabs), A10101HreFabs, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevelNO675( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionNO0( ) ;
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
            loadNO675( ) ;
         }
         endLevelNO675( ) ;
      }
      closeExtendedTableCursorsNO675( ) ;
   }

   public void updateNO675( )
   {
      beforeValidateNO675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNO675( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNO675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNO675( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateNO675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NO16 */
                  pr_default.execute(14, new Object[] {Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n9805HreLtsSR), Integer.valueOf(A9805HreLtsSR), Boolean.valueOf(n9806HreLtsRs), Integer.valueOf(A9806HreLtsRs), Boolean.valueOf(n9807HreAcaQm), A9807HreAcaQm, Boolean.valueOf(n9808HreRacab), A9808HreRacab, Boolean.valueOf(n9809HreFecAcb), A9809HreFecAcb, Boolean.valueOf(n9810HreAbs), A9810HreAbs, Boolean.valueOf(n10099HreLtsRc), Integer.valueOf(A10099HreLtsRc), Boolean.valueOf(n10100HreHdrLts), A10100HreHdrLts, Boolean.valueOf(n10101HreFabs), A10101HreFabs, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
                  if ( (pr_default.getStatus(14) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateNO675( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelNO675( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionNO0( ) ;
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
         endLevelNO675( ) ;
      }
      closeExtendedTableCursorsNO675( ) ;
   }

   public void deferredUpdateNO675( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateNO675( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNO675( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsNO675( ) ;
         afterConfirmNO675( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteNO675( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00NO17 */
               pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound675 == 0 )
                     {
                        initAllNO675( ) ;
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
                     resetCaptionNO0( ) ;
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
      sMode675 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelNO675( ) ;
      Gx_mode = sMode675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsNO675( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( 1 < 0 )
         {
            AV17UsurCod = "1" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         }
         /* Using cursor T00NO18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00NO18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(16);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00NO19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISHRAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00NO20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HAGRHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00NO21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (MAQUINAS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00NO22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00NO23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (AGRUPADAS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
      }
   }

   public void processNestedLevelNO678( )
   {
      nGXsfl_255_idx = 0 ;
      while ( nGXsfl_255_idx < nRC_GXsfl_255 )
      {
         readRowNO678( ) ;
         if ( ( nRcdExists_678 != 0 ) || ( nIsMod_678 != 0 ) )
         {
            standaloneNotModalNO678( ) ;
            getKeyNO678( ) ;
            if ( ( nRcdExists_678 == 0 ) && ( nRcdDeleted_678 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertNO678( ) ;
            }
            else
            {
               if ( RcdFound678 != 0 )
               {
                  if ( ( nRcdDeleted_678 != 0 ) && ( nRcdExists_678 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteNO678( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_678 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateNO678( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_678 == 0 )
                  {
                     GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreLinMaq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtHreLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreMaqCod_Internalname, GXutil.rtrim( A4546HreMaqCod)) ;
         httpContext.changePostValue( edtHreVolPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreFacAbs_Internalname, GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreFecPes_Internalname, localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreMaqPes_Internalname, GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreULinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreUsrCod_Internalname, GXutil.rtrim( A4863HreUsrCod)) ;
         httpContext.changePostValue( edtHreFecAlt_Internalname, localUtil.ttoc( A4960HreFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreUsrMod_Internalname, GXutil.rtrim( A4961HreUsrMod)) ;
         httpContext.changePostValue( edtHreFecMod_Internalname, localUtil.ttoc( A4962HreFecMod, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreFasCod_Internalname, GXutil.rtrim( A4963HreFasCod)) ;
         httpContext.changePostValue( edtHreOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNroPar_Internalname, GXutil.ltrim( localUtil.ntoc( A4965HreNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTotKgs_Internalname, GXutil.ltrim( localUtil.ntoc( A4968HreTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTotMts_Internalname, GXutil.ltrim( localUtil.ntoc( A4969HreTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTotPrd_Internalname, GXutil.ltrim( localUtil.ntoc( A4970HreTotPrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreProPrd_Internalname, GXutil.rtrim( A5863HreProPrd)) ;
         httpContext.changePostValue( edtHreNumRmt_Internalname, GXutil.ltrim( localUtil.ntoc( A5978HreNumRmt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5979HreNumReo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumInt_Internalname, GXutil.ltrim( localUtil.ntoc( A10102HreNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreDti_Internalname, localUtil.ttoc( A10103HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtHreDtf_Internalname, localUtil.ttoc( A10104HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_255_idx, GXutil.rtrim( Z4546HreMaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4584HreFecPes_"+sGXsfl_255_idx, localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4549HreULinPro_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_255_idx, GXutil.rtrim( Z4863HreUsrCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4960HreFecAlt_"+sGXsfl_255_idx, localUtil.ttoc( Z4960HreFecAlt, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4961HreUsrMod_"+sGXsfl_255_idx, GXutil.rtrim( Z4961HreUsrMod)) ;
         httpContext.changePostValue( "ZT_"+"Z4962HreFecMod_"+sGXsfl_255_idx, localUtil.ttoc( Z4962HreFecMod, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4963HreFasCod_"+sGXsfl_255_idx, GXutil.rtrim( Z4963HreFasCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4964HreOrdLin_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4965HreNroPar_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4965HreNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4968HreTotKgs_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4968HreTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4969HreTotMts_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4969HreTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4970HreTotPrd_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z4970HreTotPrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5863HreProPrd_"+sGXsfl_255_idx, GXutil.rtrim( Z5863HreProPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z5978HreNumRmt_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z5978HreNumRmt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5979HreNumReo_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z5979HreNumReo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10102HreNumInt_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( Z10102HreNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10103HreDti_"+sGXsfl_255_idx, localUtil.ttoc( Z10103HreDti, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z10104HreDtf_"+sGXsfl_255_idx, localUtil.ttoc( Z10104HreDtf, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRC_GXsfl_377_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_377, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_678_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_678_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_678_"+sGXsfl_255_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_678 != 0 )
         {
            httpContext.changePostValue( "HRELINMAQ_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVOLPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFACABS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECPES_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQPES_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREULINPRO_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREUSRCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECALT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecAlt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREUSRMOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrMod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECMOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecMod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFASCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREORDLIN_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreOrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENROPAR_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETOTKGS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotKgs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETOTMTS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotMts_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETOTPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMRMT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMREO_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMINT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREDTI_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDti_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREDTF_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDtf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllNO678( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_678 = (short)(0) ;
      nIsMod_678 = (short)(0) ;
      nRcdDeleted_678 = (short)(0) ;
   }

   public void processLevelNO675( )
   {
      /* Save parent mode. */
      sMode675 = Gx_mode ;
      processNestedLevelNO678( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelNO675( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteNO675( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thisrex");
         if ( AnyError == 0 )
         {
            confirmValuesNO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thisrex");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartNO675( )
   {
      /* Scan By routine */
      /* Using cursor T00NO24 */
      pr_default.execute(22, new Object[] {A396EmprCod});
      RcdFound675 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T00NO24_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00NO24_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00NO24_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00NO24_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextNO675( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound675 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T00NO24_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00NO24_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00NO24_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00NO24_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      }
   }

   public void scanEndNO675( )
   {
      pr_default.close(22);
   }

   public void afterConfirmNO675( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertNO675( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateNO675( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteNO675( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteNO675( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateNO675( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesNO675( )
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
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtHreDisCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreDisCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDisCli_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtHreBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarSer_Enabled), 5, 0), true);
      edtHreBarDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarDsc_Enabled), 5, 0), true);
      edtHreTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTipArt_Enabled), 5, 0), true);
      edtHreTipArtD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTipArtD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTipArtD_Enabled), 5, 0), true);
      edtHreColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreColNom_Enabled), 5, 0), true);
      edtHreColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreColNum_Enabled), 5, 0), true);
      edtHreColNomC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreColNomC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreColNomC_Enabled), 5, 0), true);
      edtHreColNumC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreColNumC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreColNumC_Enabled), 5, 0), true);
      edtHreTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTipCol_Enabled), 5, 0), true);
      edtHreTipColN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTipColN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTipColN_Enabled), 5, 0), true);
      edtHreFecGen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecGen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecGen_Enabled), 5, 0), true);
      edtHreFecCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecCli_Enabled), 5, 0), true);
      edtHreFecTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecTin_Enabled), 5, 0), true);
      edtHreFecFpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecFpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecFpr_Enabled), 5, 0), true);
      edtHreBarMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarMat_Enabled), 5, 0), true);
      edtHreBarKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarKgm_Enabled), 5, 0), true);
      edtHreBarMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarMtr_Enabled), 5, 0), true);
      edtHreBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPie_Enabled), 5, 0), true);
      edtHrePartCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePartCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePartCod_Enabled), 5, 0), true);
      edtHreBarNMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarNMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarNMtr_Enabled), 5, 0), true);
      edtHreBarNMez_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreBarNMez_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarNMez_Enabled), 5, 0), true);
      edtHreNumTen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumTen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumTen_Enabled), 5, 0), true);
      edtHreIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreIntCod_Enabled), 5, 0), true);
      edtHreIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreIntDsc_Enabled), 5, 0), true);
      edtHreNumTon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumTon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumTon_Enabled), 5, 0), true);
      edtHreMaqHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqHdr_Enabled), 5, 0), true);
      edtHreTotKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTotKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotKgm_Enabled), 5, 0), true);
      edtHreTotMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTotMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotMtr_Enabled), 5, 0), true);
      edtHreTotPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTotPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotPie_Enabled), 5, 0), true);
      edtHreLtsSR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsSR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsSR_Enabled), 5, 0), true);
      edtHreLtsRs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsRs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsRs_Enabled), 5, 0), true);
      edtHreAcaQm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcaQm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcaQm_Enabled), 5, 0), true);
      edtHreRacab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreRacab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreRacab_Enabled), 5, 0), true);
      edtHreFecAcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecAcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecAcb_Enabled), 5, 0), true);
      edtHreAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAbs_Enabled), 5, 0), true);
      edtHreLtsRc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsRc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsRc_Enabled), 5, 0), true);
      edtHreHdrLts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreHdrLts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreHdrLts_Enabled), 5, 0), true);
      edtHreFabs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFabs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFabs_Enabled), 5, 0), true);
   }

   public void zmNO678( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4546HreMaqCod = T00NO5_A4546HreMaqCod[0] ;
            Z4547HreVolPrd = T00NO5_A4547HreVolPrd[0] ;
            Z4548HreFacAbs = T00NO5_A4548HreFacAbs[0] ;
            Z4584HreFecPes = T00NO5_A4584HreFecPes[0] ;
            Z4585HreMaqPes = T00NO5_A4585HreMaqPes[0] ;
            Z4549HreULinPro = T00NO5_A4549HreULinPro[0] ;
            Z4863HreUsrCod = T00NO5_A4863HreUsrCod[0] ;
            Z4960HreFecAlt = T00NO5_A4960HreFecAlt[0] ;
            Z4961HreUsrMod = T00NO5_A4961HreUsrMod[0] ;
            Z4962HreFecMod = T00NO5_A4962HreFecMod[0] ;
            Z4963HreFasCod = T00NO5_A4963HreFasCod[0] ;
            Z4964HreOrdLin = T00NO5_A4964HreOrdLin[0] ;
            Z4965HreNroPar = T00NO5_A4965HreNroPar[0] ;
            Z4968HreTotKgs = T00NO5_A4968HreTotKgs[0] ;
            Z4969HreTotMts = T00NO5_A4969HreTotMts[0] ;
            Z4970HreTotPrd = T00NO5_A4970HreTotPrd[0] ;
            Z5863HreProPrd = T00NO5_A5863HreProPrd[0] ;
            Z5978HreNumRmt = T00NO5_A5978HreNumRmt[0] ;
            Z5979HreNumReo = T00NO5_A5979HreNumReo[0] ;
            Z10102HreNumInt = T00NO5_A10102HreNumInt[0] ;
            Z10103HreDti = T00NO5_A10103HreDti[0] ;
            Z10104HreDtf = T00NO5_A10104HreDtf[0] ;
         }
         else
         {
            Z4546HreMaqCod = A4546HreMaqCod ;
            Z4547HreVolPrd = A4547HreVolPrd ;
            Z4548HreFacAbs = A4548HreFacAbs ;
            Z4584HreFecPes = A4584HreFecPes ;
            Z4585HreMaqPes = A4585HreMaqPes ;
            Z4549HreULinPro = A4549HreULinPro ;
            Z4863HreUsrCod = A4863HreUsrCod ;
            Z4960HreFecAlt = A4960HreFecAlt ;
            Z4961HreUsrMod = A4961HreUsrMod ;
            Z4962HreFecMod = A4962HreFecMod ;
            Z4963HreFasCod = A4963HreFasCod ;
            Z4964HreOrdLin = A4964HreOrdLin ;
            Z4965HreNroPar = A4965HreNroPar ;
            Z4968HreTotKgs = A4968HreTotKgs ;
            Z4969HreTotMts = A4969HreTotMts ;
            Z4970HreTotPrd = A4970HreTotPrd ;
            Z5863HreProPrd = A5863HreProPrd ;
            Z5978HreNumRmt = A5978HreNumRmt ;
            Z5979HreNumReo = A5979HreNumReo ;
            Z10102HreNumInt = A10102HreNumInt ;
            Z10103HreDti = A10103HreDti ;
            Z10104HreDtf = A10104HreDtf ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z4546HreMaqCod = A4546HreMaqCod ;
         Z4547HreVolPrd = A4547HreVolPrd ;
         Z4548HreFacAbs = A4548HreFacAbs ;
         Z4584HreFecPes = A4584HreFecPes ;
         Z4585HreMaqPes = A4585HreMaqPes ;
         Z4549HreULinPro = A4549HreULinPro ;
         Z4863HreUsrCod = A4863HreUsrCod ;
         Z4960HreFecAlt = A4960HreFecAlt ;
         Z4961HreUsrMod = A4961HreUsrMod ;
         Z4962HreFecMod = A4962HreFecMod ;
         Z4963HreFasCod = A4963HreFasCod ;
         Z4964HreOrdLin = A4964HreOrdLin ;
         Z4965HreNroPar = A4965HreNroPar ;
         Z4968HreTotKgs = A4968HreTotKgs ;
         Z4969HreTotMts = A4969HreTotMts ;
         Z4970HreTotPrd = A4970HreTotPrd ;
         Z5863HreProPrd = A5863HreProPrd ;
         Z5978HreNumRmt = A5978HreNumRmt ;
         Z5979HreNumReo = A5979HreNumReo ;
         Z10102HreNumInt = A10102HreNumInt ;
         Z10103HreDti = A10103HreDti ;
         Z10104HreDtf = A10104HreDtf ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalNO678( )
   {
   }

   public void standaloneModalNO678( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      }
      else
      {
         edtHreLinMaq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      }
   }

   public void loadNO678( )
   {
      /* Using cursor T00NO25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4546HreMaqCod = T00NO25_A4546HreMaqCod[0] ;
         n4546HreMaqCod = T00NO25_n4546HreMaqCod[0] ;
         A4547HreVolPrd = T00NO25_A4547HreVolPrd[0] ;
         n4547HreVolPrd = T00NO25_n4547HreVolPrd[0] ;
         A4548HreFacAbs = T00NO25_A4548HreFacAbs[0] ;
         n4548HreFacAbs = T00NO25_n4548HreFacAbs[0] ;
         A4584HreFecPes = T00NO25_A4584HreFecPes[0] ;
         n4584HreFecPes = T00NO25_n4584HreFecPes[0] ;
         A4585HreMaqPes = T00NO25_A4585HreMaqPes[0] ;
         n4585HreMaqPes = T00NO25_n4585HreMaqPes[0] ;
         A4549HreULinPro = T00NO25_A4549HreULinPro[0] ;
         n4549HreULinPro = T00NO25_n4549HreULinPro[0] ;
         A4863HreUsrCod = T00NO25_A4863HreUsrCod[0] ;
         n4863HreUsrCod = T00NO25_n4863HreUsrCod[0] ;
         A4960HreFecAlt = T00NO25_A4960HreFecAlt[0] ;
         n4960HreFecAlt = T00NO25_n4960HreFecAlt[0] ;
         A4961HreUsrMod = T00NO25_A4961HreUsrMod[0] ;
         n4961HreUsrMod = T00NO25_n4961HreUsrMod[0] ;
         A4962HreFecMod = T00NO25_A4962HreFecMod[0] ;
         n4962HreFecMod = T00NO25_n4962HreFecMod[0] ;
         A4963HreFasCod = T00NO25_A4963HreFasCod[0] ;
         n4963HreFasCod = T00NO25_n4963HreFasCod[0] ;
         A4964HreOrdLin = T00NO25_A4964HreOrdLin[0] ;
         n4964HreOrdLin = T00NO25_n4964HreOrdLin[0] ;
         A4965HreNroPar = T00NO25_A4965HreNroPar[0] ;
         n4965HreNroPar = T00NO25_n4965HreNroPar[0] ;
         A4968HreTotKgs = T00NO25_A4968HreTotKgs[0] ;
         n4968HreTotKgs = T00NO25_n4968HreTotKgs[0] ;
         A4969HreTotMts = T00NO25_A4969HreTotMts[0] ;
         n4969HreTotMts = T00NO25_n4969HreTotMts[0] ;
         A4970HreTotPrd = T00NO25_A4970HreTotPrd[0] ;
         n4970HreTotPrd = T00NO25_n4970HreTotPrd[0] ;
         A5863HreProPrd = T00NO25_A5863HreProPrd[0] ;
         n5863HreProPrd = T00NO25_n5863HreProPrd[0] ;
         A5978HreNumRmt = T00NO25_A5978HreNumRmt[0] ;
         n5978HreNumRmt = T00NO25_n5978HreNumRmt[0] ;
         A5979HreNumReo = T00NO25_A5979HreNumReo[0] ;
         n5979HreNumReo = T00NO25_n5979HreNumReo[0] ;
         A10102HreNumInt = T00NO25_A10102HreNumInt[0] ;
         n10102HreNumInt = T00NO25_n10102HreNumInt[0] ;
         A10103HreDti = T00NO25_A10103HreDti[0] ;
         n10103HreDti = T00NO25_n10103HreDti[0] ;
         A10104HreDtf = T00NO25_A10104HreDtf[0] ;
         n10104HreDtf = T00NO25_n10104HreDtf[0] ;
         zmNO678( -8) ;
      }
      pr_default.close(23);
      onLoadActionsNO678( ) ;
   }

   public void onLoadActionsNO678( )
   {
   }

   public void checkExtendedTableNO678( )
   {
      nIsDirty_678 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalNO678( ) ;
      if ( ! ( ( ( A4585HreMaqPes >= 0 ) && ( A4585HreMaqPes <= 2 ) ) ) )
      {
         GXCCtl = "HREMAQPES_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Maquina Pesada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreMaqPes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsNO678( )
   {
   }

   public void enableDisableNO678( )
   {
   }

   public void getKeyNO678( )
   {
      /* Using cursor T00NO26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
      else
      {
         RcdFound678 = (short)(0) ;
      }
      pr_default.close(24);
   }

   public void getByPrimaryKeyNO678( )
   {
      /* Using cursor T00NO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00NO5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmNO678( 8) ;
         RcdFound678 = (short)(1) ;
         initializeNonKeyNO678( ) ;
         A4545HreLinMaq = T00NO5_A4545HreLinMaq[0] ;
         A4546HreMaqCod = T00NO5_A4546HreMaqCod[0] ;
         n4546HreMaqCod = T00NO5_n4546HreMaqCod[0] ;
         A4547HreVolPrd = T00NO5_A4547HreVolPrd[0] ;
         n4547HreVolPrd = T00NO5_n4547HreVolPrd[0] ;
         A4548HreFacAbs = T00NO5_A4548HreFacAbs[0] ;
         n4548HreFacAbs = T00NO5_n4548HreFacAbs[0] ;
         A4584HreFecPes = T00NO5_A4584HreFecPes[0] ;
         n4584HreFecPes = T00NO5_n4584HreFecPes[0] ;
         A4585HreMaqPes = T00NO5_A4585HreMaqPes[0] ;
         n4585HreMaqPes = T00NO5_n4585HreMaqPes[0] ;
         A4549HreULinPro = T00NO5_A4549HreULinPro[0] ;
         n4549HreULinPro = T00NO5_n4549HreULinPro[0] ;
         A4863HreUsrCod = T00NO5_A4863HreUsrCod[0] ;
         n4863HreUsrCod = T00NO5_n4863HreUsrCod[0] ;
         A4960HreFecAlt = T00NO5_A4960HreFecAlt[0] ;
         n4960HreFecAlt = T00NO5_n4960HreFecAlt[0] ;
         A4961HreUsrMod = T00NO5_A4961HreUsrMod[0] ;
         n4961HreUsrMod = T00NO5_n4961HreUsrMod[0] ;
         A4962HreFecMod = T00NO5_A4962HreFecMod[0] ;
         n4962HreFecMod = T00NO5_n4962HreFecMod[0] ;
         A4963HreFasCod = T00NO5_A4963HreFasCod[0] ;
         n4963HreFasCod = T00NO5_n4963HreFasCod[0] ;
         A4964HreOrdLin = T00NO5_A4964HreOrdLin[0] ;
         n4964HreOrdLin = T00NO5_n4964HreOrdLin[0] ;
         A4965HreNroPar = T00NO5_A4965HreNroPar[0] ;
         n4965HreNroPar = T00NO5_n4965HreNroPar[0] ;
         A4968HreTotKgs = T00NO5_A4968HreTotKgs[0] ;
         n4968HreTotKgs = T00NO5_n4968HreTotKgs[0] ;
         A4969HreTotMts = T00NO5_A4969HreTotMts[0] ;
         n4969HreTotMts = T00NO5_n4969HreTotMts[0] ;
         A4970HreTotPrd = T00NO5_A4970HreTotPrd[0] ;
         n4970HreTotPrd = T00NO5_n4970HreTotPrd[0] ;
         A5863HreProPrd = T00NO5_A5863HreProPrd[0] ;
         n5863HreProPrd = T00NO5_n5863HreProPrd[0] ;
         A5978HreNumRmt = T00NO5_A5978HreNumRmt[0] ;
         n5978HreNumRmt = T00NO5_n5978HreNumRmt[0] ;
         A5979HreNumReo = T00NO5_A5979HreNumReo[0] ;
         n5979HreNumReo = T00NO5_n5979HreNumReo[0] ;
         A10102HreNumInt = T00NO5_A10102HreNumInt[0] ;
         n10102HreNumInt = T00NO5_n10102HreNumInt[0] ;
         A10103HreDti = T00NO5_A10103HreDti[0] ;
         n10103HreDti = T00NO5_n10103HreDti[0] ;
         A10104HreDtf = T00NO5_A10104HreDtf[0] ;
         n10104HreDtf = T00NO5_n10104HreDtf[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalNO678( ) ;
         loadNO678( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound678 = (short)(0) ;
         initializeNonKeyNO678( ) ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalNO678( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesNO678( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrencyNO678( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00NO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4546HreMaqCod, T00NO4_A4546HreMaqCod[0]) != 0 ) || ( Z4547HreVolPrd != T00NO4_A4547HreVolPrd[0] ) || ( DecimalUtil.compareTo(Z4548HreFacAbs, T00NO4_A4548HreFacAbs[0]) != 0 ) || !( GXutil.dateCompare(Z4584HreFecPes, T00NO4_A4584HreFecPes[0]) ) || ( Z4585HreMaqPes != T00NO4_A4585HreMaqPes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4549HreULinPro != T00NO4_A4549HreULinPro[0] ) || ( GXutil.strcmp(Z4863HreUsrCod, T00NO4_A4863HreUsrCod[0]) != 0 ) || !( GXutil.dateCompare(Z4960HreFecAlt, T00NO4_A4960HreFecAlt[0]) ) || ( GXutil.strcmp(Z4961HreUsrMod, T00NO4_A4961HreUsrMod[0]) != 0 ) || !( GXutil.dateCompare(Z4962HreFecMod, T00NO4_A4962HreFecMod[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4963HreFasCod, T00NO4_A4963HreFasCod[0]) != 0 ) || ( Z4964HreOrdLin != T00NO4_A4964HreOrdLin[0] ) || ( Z4965HreNroPar != T00NO4_A4965HreNroPar[0] ) || ( DecimalUtil.compareTo(Z4968HreTotKgs, T00NO4_A4968HreTotKgs[0]) != 0 ) || ( DecimalUtil.compareTo(Z4969HreTotMts, T00NO4_A4969HreTotMts[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4970HreTotPrd != T00NO4_A4970HreTotPrd[0] ) || ( GXutil.strcmp(Z5863HreProPrd, T00NO4_A5863HreProPrd[0]) != 0 ) || ( Z5978HreNumRmt != T00NO4_A5978HreNumRmt[0] ) || ( Z5979HreNumReo != T00NO4_A5979HreNumReo[0] ) || ( Z10102HreNumInt != T00NO4_A10102HreNumInt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10103HreDti, T00NO4_A10103HreDti[0]) ) || !( GXutil.dateCompare(Z10104HreDtf, T00NO4_A10104HreDtf[0]) ) )
         {
            if ( GXutil.strcmp(Z4546HreMaqCod, T00NO4_A4546HreMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreMaqCod");
               GXutil.writeLogRaw("Old: ",Z4546HreMaqCod);
               GXutil.writeLogRaw("Current: ",T00NO4_A4546HreMaqCod[0]);
            }
            if ( Z4547HreVolPrd != T00NO4_A4547HreVolPrd[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreVolPrd");
               GXutil.writeLogRaw("Old: ",Z4547HreVolPrd);
               GXutil.writeLogRaw("Current: ",T00NO4_A4547HreVolPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z4548HreFacAbs, T00NO4_A4548HreFacAbs[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFacAbs");
               GXutil.writeLogRaw("Old: ",Z4548HreFacAbs);
               GXutil.writeLogRaw("Current: ",T00NO4_A4548HreFacAbs[0]);
            }
            if ( !( GXutil.dateCompare(Z4584HreFecPes, T00NO4_A4584HreFecPes[0]) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecPes");
               GXutil.writeLogRaw("Old: ",Z4584HreFecPes);
               GXutil.writeLogRaw("Current: ",T00NO4_A4584HreFecPes[0]);
            }
            if ( Z4585HreMaqPes != T00NO4_A4585HreMaqPes[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreMaqPes");
               GXutil.writeLogRaw("Old: ",Z4585HreMaqPes);
               GXutil.writeLogRaw("Current: ",T00NO4_A4585HreMaqPes[0]);
            }
            if ( Z4549HreULinPro != T00NO4_A4549HreULinPro[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreULinPro");
               GXutil.writeLogRaw("Old: ",Z4549HreULinPro);
               GXutil.writeLogRaw("Current: ",T00NO4_A4549HreULinPro[0]);
            }
            if ( GXutil.strcmp(Z4863HreUsrCod, T00NO4_A4863HreUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreUsrCod");
               GXutil.writeLogRaw("Old: ",Z4863HreUsrCod);
               GXutil.writeLogRaw("Current: ",T00NO4_A4863HreUsrCod[0]);
            }
            if ( !( GXutil.dateCompare(Z4960HreFecAlt, T00NO4_A4960HreFecAlt[0]) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecAlt");
               GXutil.writeLogRaw("Old: ",Z4960HreFecAlt);
               GXutil.writeLogRaw("Current: ",T00NO4_A4960HreFecAlt[0]);
            }
            if ( GXutil.strcmp(Z4961HreUsrMod, T00NO4_A4961HreUsrMod[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreUsrMod");
               GXutil.writeLogRaw("Old: ",Z4961HreUsrMod);
               GXutil.writeLogRaw("Current: ",T00NO4_A4961HreUsrMod[0]);
            }
            if ( !( GXutil.dateCompare(Z4962HreFecMod, T00NO4_A4962HreFecMod[0]) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFecMod");
               GXutil.writeLogRaw("Old: ",Z4962HreFecMod);
               GXutil.writeLogRaw("Current: ",T00NO4_A4962HreFecMod[0]);
            }
            if ( GXutil.strcmp(Z4963HreFasCod, T00NO4_A4963HreFasCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreFasCod");
               GXutil.writeLogRaw("Old: ",Z4963HreFasCod);
               GXutil.writeLogRaw("Current: ",T00NO4_A4963HreFasCod[0]);
            }
            if ( Z4964HreOrdLin != T00NO4_A4964HreOrdLin[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreOrdLin");
               GXutil.writeLogRaw("Old: ",Z4964HreOrdLin);
               GXutil.writeLogRaw("Current: ",T00NO4_A4964HreOrdLin[0]);
            }
            if ( Z4965HreNroPar != T00NO4_A4965HreNroPar[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNroPar");
               GXutil.writeLogRaw("Old: ",Z4965HreNroPar);
               GXutil.writeLogRaw("Current: ",T00NO4_A4965HreNroPar[0]);
            }
            if ( DecimalUtil.compareTo(Z4968HreTotKgs, T00NO4_A4968HreTotKgs[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTotKgs");
               GXutil.writeLogRaw("Old: ",Z4968HreTotKgs);
               GXutil.writeLogRaw("Current: ",T00NO4_A4968HreTotKgs[0]);
            }
            if ( DecimalUtil.compareTo(Z4969HreTotMts, T00NO4_A4969HreTotMts[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTotMts");
               GXutil.writeLogRaw("Old: ",Z4969HreTotMts);
               GXutil.writeLogRaw("Current: ",T00NO4_A4969HreTotMts[0]);
            }
            if ( Z4970HreTotPrd != T00NO4_A4970HreTotPrd[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTotPrd");
               GXutil.writeLogRaw("Old: ",Z4970HreTotPrd);
               GXutil.writeLogRaw("Current: ",T00NO4_A4970HreTotPrd[0]);
            }
            if ( GXutil.strcmp(Z5863HreProPrd, T00NO4_A5863HreProPrd[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreProPrd");
               GXutil.writeLogRaw("Old: ",Z5863HreProPrd);
               GXutil.writeLogRaw("Current: ",T00NO4_A5863HreProPrd[0]);
            }
            if ( Z5978HreNumRmt != T00NO4_A5978HreNumRmt[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumRmt");
               GXutil.writeLogRaw("Old: ",Z5978HreNumRmt);
               GXutil.writeLogRaw("Current: ",T00NO4_A5978HreNumRmt[0]);
            }
            if ( Z5979HreNumReo != T00NO4_A5979HreNumReo[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumReo");
               GXutil.writeLogRaw("Old: ",Z5979HreNumReo);
               GXutil.writeLogRaw("Current: ",T00NO4_A5979HreNumReo[0]);
            }
            if ( Z10102HreNumInt != T00NO4_A10102HreNumInt[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumInt");
               GXutil.writeLogRaw("Old: ",Z10102HreNumInt);
               GXutil.writeLogRaw("Current: ",T00NO4_A10102HreNumInt[0]);
            }
            if ( !( GXutil.dateCompare(Z10103HreDti, T00NO4_A10103HreDti[0]) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreDti");
               GXutil.writeLogRaw("Old: ",Z10103HreDti);
               GXutil.writeLogRaw("Current: ",T00NO4_A10103HreDti[0]);
            }
            if ( !( GXutil.dateCompare(Z10104HreDtf, T00NO4_A10104HreDtf[0]) ) )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreDtf");
               GXutil.writeLogRaw("Old: ",Z10104HreDtf);
               GXutil.writeLogRaw("Current: ",T00NO4_A10104HreDtf[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertNO678( )
   {
      beforeValidateNO678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNO678( ) ;
      }
      if ( AnyError == 0 )
      {
         zmNO678( 0) ;
         checkOptimisticConcurrencyNO678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNO678( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertNO678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NO27 */
                  pr_default.execute(25, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n4960HreFecAlt), A4960HreFecAlt, Boolean.valueOf(n4961HreUsrMod), A4961HreUsrMod, Boolean.valueOf(n4962HreFecMod), A4962HreFecMod, Boolean.valueOf(n4963HreFasCod), A4963HreFasCod, Boolean.valueOf(n4964HreOrdLin), Short.valueOf(A4964HreOrdLin), Boolean.valueOf(n4965HreNroPar), Integer.valueOf(A4965HreNroPar), Boolean.valueOf(n4968HreTotKgs), A4968HreTotKgs, Boolean.valueOf(n4969HreTotMts), A4969HreTotMts, Boolean.valueOf(n4970HreTotPrd), Integer.valueOf(A4970HreTotPrd), Boolean.valueOf(n5863HreProPrd), A5863HreProPrd, Boolean.valueOf(n5978HreNumRmt), Integer.valueOf(A5978HreNumRmt), Boolean.valueOf(n5979HreNumReo), Integer.valueOf(A5979HreNumReo), Boolean.valueOf(n10102HreNumInt), Integer.valueOf(A10102HreNumInt), Boolean.valueOf(n10103HreDti), A10103HreDti, Boolean.valueOf(n10104HreDtf), A10104HreDtf, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        processLevelNO678( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            loadNO678( ) ;
         }
         endLevelNO678( ) ;
      }
      closeExtendedTableCursorsNO678( ) ;
   }

   public void updateNO678( )
   {
      beforeValidateNO678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNO678( ) ;
      }
      if ( ( nIsMod_678 != 0 ) || ( nIsDirty_678 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyNO678( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmNO678( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateNO678( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00NO28 */
                     pr_default.execute(26, new Object[] {Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n4960HreFecAlt), A4960HreFecAlt, Boolean.valueOf(n4961HreUsrMod), A4961HreUsrMod, Boolean.valueOf(n4962HreFecMod), A4962HreFecMod, Boolean.valueOf(n4963HreFasCod), A4963HreFasCod, Boolean.valueOf(n4964HreOrdLin), Short.valueOf(A4964HreOrdLin), Boolean.valueOf(n4965HreNroPar), Integer.valueOf(A4965HreNroPar), Boolean.valueOf(n4968HreTotKgs), A4968HreTotKgs, Boolean.valueOf(n4969HreTotMts), A4969HreTotMts, Boolean.valueOf(n4970HreTotPrd), Integer.valueOf(A4970HreTotPrd), Boolean.valueOf(n5863HreProPrd), A5863HreProPrd, Boolean.valueOf(n5978HreNumRmt), Integer.valueOf(A5978HreNumRmt), Boolean.valueOf(n5979HreNumReo), Integer.valueOf(A5979HreNumReo), Boolean.valueOf(n10102HreNumInt), Integer.valueOf(A10102HreNumInt), Boolean.valueOf(n10103HreDti), A10103HreDti, Boolean.valueOf(n10104HreDtf), A10104HreDtf, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                     if ( (pr_default.getStatus(26) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateNO678( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelNO678( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyNO678( ) ;
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
            endLevelNO678( ) ;
         }
      }
      closeExtendedTableCursorsNO678( ) ;
   }

   public void deferredUpdateNO678( )
   {
   }

   public void deleteNO678( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateNO678( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNO678( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsNO678( ) ;
         afterConfirmNO678( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteNO678( ) ;
            if ( AnyError == 0 )
            {
               scanStartNO1874( ) ;
               while ( RcdFound1874 != 0 )
               {
                  getByPrimaryKeyNO1874( ) ;
                  deleteNO1874( ) ;
                  scanNextNO1874( ) ;
               }
               scanEndNO1874( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NO29 */
                  pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
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
      }
      sMode678 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelNO678( ) ;
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsNO678( )
   {
      standaloneModalNO678( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00NO30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00NO31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00NO32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00NO33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
      }
   }

   public void processNestedLevelNO1874( )
   {
      nGXsfl_377_idx = 0 ;
      while ( nGXsfl_377_idx < nRC_GXsfl_377 )
      {
         readRowNO1874( ) ;
         if ( ( nRcdExists_1874 != 0 ) || ( nIsMod_1874 != 0 ) )
         {
            standaloneNotModalNO1874( ) ;
            getKeyNO1874( ) ;
            if ( ( nRcdExists_1874 == 0 ) && ( nRcdDeleted_1874 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertNO1874( ) ;
            }
            else
            {
               if ( RcdFound1874 != 0 )
               {
                  if ( ( nRcdDeleted_1874 != 0 ) && ( nRcdExists_1874 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteNO1874( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1874 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateNO1874( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1874 == 0 )
                  {
                     GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtHreLinMaq_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_1874_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreProCod_Internalname, GXutil.rtrim( A4551HreProCod)) ;
         httpContext.changePostValue( edtHreProDsc_Internalname, GXutil.rtrim( A4552HreProDsc)) ;
         httpContext.changePostValue( edtHreProTie_Internalname, GXutil.ltrim( localUtil.ntoc( A4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreProTmx_Internalname, GXutil.ltrim( localUtil.ntoc( A4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNumRec_Internalname, GXutil.ltrim( localUtil.ntoc( A4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreVolPro_Internalname, GXutil.ltrim( localUtil.ntoc( A4966HreVolPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreTieprg_Internalname, GXutil.ltrim( localUtil.ntoc( A5947HreTieprg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreNroPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A5948HreNroPrg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4550HreLinPro_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4551HreProCod_"+sGXsfl_377_idx, GXutil.rtrim( Z4551HreProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4552HreProDsc_"+sGXsfl_377_idx, GXutil.rtrim( Z4552HreProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4553HreProTie_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4554HreProTmx_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4555HreNumPro_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4556HreNumRec_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4966HreVolPro_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z4966HreVolPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5947HreTieprg_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z5947HreTieprg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5948HreNroPrg_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( Z5948HreNroPrg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1874_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1874_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1874_"+sGXsfl_377_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1874 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1874_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELINPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROCOD_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPRODSC_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTIE_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTMX_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMREC_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVOLPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRETIEPRG_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTieprg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENROPRG_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllNO1874( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1874 = (short)(0) ;
      nIsMod_1874 = (short)(0) ;
      nRcdDeleted_1874 = (short)(0) ;
   }

   public void processLevelNO678( )
   {
      /* Save parent mode. */
      sMode678 = Gx_mode ;
      processNestedLevelNO1874( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelNO678( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartNO678( )
   {
      /* Scan By routine */
      /* Using cursor T00NO34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4545HreLinMaq = T00NO34_A4545HreLinMaq[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextNO678( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4545HreLinMaq = T00NO34_A4545HreLinMaq[0] ;
      }
   }

   public void scanEndNO678( )
   {
      pr_default.close(32);
   }

   public void afterConfirmNO678( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertNO678( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateNO678( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteNO678( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteNO678( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateNO678( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesNO678( )
   {
      edtHreLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreVolPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreFacAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacAbs_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreFecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecPes_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreMaqPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqPes_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreULinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreULinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreULinPro_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrCod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreFecAlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecAlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecAlt_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreUsrMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUsrMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrMod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreFecMod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecMod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecMod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFasCod_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreOrdLin_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreNroPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNroPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNroPar_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreTotKgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTotKgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotKgs_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreTotMts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTotMts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotMts_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreTotPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTotPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTotPrd_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreProPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProPrd_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreNumRmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumRmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumRmt_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreNumReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumReo_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreNumInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumInt_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreDti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreDti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDti_Enabled), 5, 0), !bGXsfl_255_Refreshing);
      edtHreDtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreDtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDtf_Enabled), 5, 0), !bGXsfl_255_Refreshing);
   }

   public void zmNO1874( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4551HreProCod = T00NO3_A4551HreProCod[0] ;
            Z4552HreProDsc = T00NO3_A4552HreProDsc[0] ;
            Z4553HreProTie = T00NO3_A4553HreProTie[0] ;
            Z4554HreProTmx = T00NO3_A4554HreProTmx[0] ;
            Z4555HreNumPro = T00NO3_A4555HreNumPro[0] ;
            Z4556HreNumRec = T00NO3_A4556HreNumRec[0] ;
            Z4966HreVolPro = T00NO3_A4966HreVolPro[0] ;
            Z5947HreTieprg = T00NO3_A5947HreTieprg[0] ;
            Z5948HreNroPrg = T00NO3_A5948HreNroPrg[0] ;
         }
         else
         {
            Z4551HreProCod = A4551HreProCod ;
            Z4552HreProDsc = A4552HreProDsc ;
            Z4553HreProTie = A4553HreProTie ;
            Z4554HreProTmx = A4554HreProTmx ;
            Z4555HreNumPro = A4555HreNumPro ;
            Z4556HreNumRec = A4556HreNumRec ;
            Z4966HreVolPro = A4966HreVolPro ;
            Z5947HreTieprg = A5947HreTieprg ;
            Z5948HreNroPrg = A5948HreNroPrg ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z4550HreLinPro = A4550HreLinPro ;
         Z4551HreProCod = A4551HreProCod ;
         Z4552HreProDsc = A4552HreProDsc ;
         Z4553HreProTie = A4553HreProTie ;
         Z4554HreProTmx = A4554HreProTmx ;
         Z4555HreNumPro = A4555HreNumPro ;
         Z4556HreNumRec = A4556HreNumRec ;
         Z4966HreVolPro = A4966HreVolPro ;
         Z5947HreTieprg = A5947HreTieprg ;
         Z5948HreNroPrg = A5948HreNroPrg ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalNO1874( )
   {
   }

   public void standaloneModalNO1874( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      }
      else
      {
         edtHreLinPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      }
   }

   public void loadNO1874( )
   {
      /* Using cursor T00NO35 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound1874 = (short)(1) ;
         A4551HreProCod = T00NO35_A4551HreProCod[0] ;
         A4552HreProDsc = T00NO35_A4552HreProDsc[0] ;
         A4553HreProTie = T00NO35_A4553HreProTie[0] ;
         A4554HreProTmx = T00NO35_A4554HreProTmx[0] ;
         A4555HreNumPro = T00NO35_A4555HreNumPro[0] ;
         A4556HreNumRec = T00NO35_A4556HreNumRec[0] ;
         A4966HreVolPro = T00NO35_A4966HreVolPro[0] ;
         A5947HreTieprg = T00NO35_A5947HreTieprg[0] ;
         A5948HreNroPrg = T00NO35_A5948HreNroPrg[0] ;
         zmNO1874( -9) ;
      }
      pr_default.close(33);
      onLoadActionsNO1874( ) ;
   }

   public void onLoadActionsNO1874( )
   {
   }

   public void checkExtendedTableNO1874( )
   {
      nIsDirty_1874 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalNO1874( ) ;
   }

   public void closeExtendedTableCursorsNO1874( )
   {
   }

   public void enableDisableNO1874( )
   {
   }

   public void getKeyNO1874( )
   {
      /* Using cursor T00NO36 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound1874 = (short)(1) ;
      }
      else
      {
         RcdFound1874 = (short)(0) ;
      }
      pr_default.close(34);
   }

   public void getByPrimaryKeyNO1874( )
   {
      /* Using cursor T00NO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00NO3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmNO1874( 9) ;
         RcdFound1874 = (short)(1) ;
         initializeNonKeyNO1874( ) ;
         A4550HreLinPro = T00NO3_A4550HreLinPro[0] ;
         A4551HreProCod = T00NO3_A4551HreProCod[0] ;
         A4552HreProDsc = T00NO3_A4552HreProDsc[0] ;
         A4553HreProTie = T00NO3_A4553HreProTie[0] ;
         A4554HreProTmx = T00NO3_A4554HreProTmx[0] ;
         A4555HreNumPro = T00NO3_A4555HreNumPro[0] ;
         A4556HreNumRec = T00NO3_A4556HreNumRec[0] ;
         A4966HreVolPro = T00NO3_A4966HreVolPro[0] ;
         A5947HreTieprg = T00NO3_A5947HreTieprg[0] ;
         A5948HreNroPrg = T00NO3_A5948HreNroPrg[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         Z4550HreLinPro = A4550HreLinPro ;
         sMode1874 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalNO1874( ) ;
         loadNO1874( ) ;
         Gx_mode = sMode1874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1874 = (short)(0) ;
         initializeNonKeyNO1874( ) ;
         sMode1874 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalNO1874( ) ;
         Gx_mode = sMode1874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesNO1874( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyNO1874( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00NO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4551HreProCod, T00NO2_A4551HreProCod[0]) != 0 ) || ( GXutil.strcmp(Z4552HreProDsc, T00NO2_A4552HreProDsc[0]) != 0 ) || ( Z4553HreProTie != T00NO2_A4553HreProTie[0] ) || ( Z4554HreProTmx != T00NO2_A4554HreProTmx[0] ) || ( Z4555HreNumPro != T00NO2_A4555HreNumPro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4556HreNumRec != T00NO2_A4556HreNumRec[0] ) || ( Z4966HreVolPro != T00NO2_A4966HreVolPro[0] ) || ( Z5947HreTieprg != T00NO2_A5947HreTieprg[0] ) || ( Z5948HreNroPrg != T00NO2_A5948HreNroPrg[0] ) )
         {
            if ( GXutil.strcmp(Z4551HreProCod, T00NO2_A4551HreProCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreProCod");
               GXutil.writeLogRaw("Old: ",Z4551HreProCod);
               GXutil.writeLogRaw("Current: ",T00NO2_A4551HreProCod[0]);
            }
            if ( GXutil.strcmp(Z4552HreProDsc, T00NO2_A4552HreProDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreProDsc");
               GXutil.writeLogRaw("Old: ",Z4552HreProDsc);
               GXutil.writeLogRaw("Current: ",T00NO2_A4552HreProDsc[0]);
            }
            if ( Z4553HreProTie != T00NO2_A4553HreProTie[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreProTie");
               GXutil.writeLogRaw("Old: ",Z4553HreProTie);
               GXutil.writeLogRaw("Current: ",T00NO2_A4553HreProTie[0]);
            }
            if ( Z4554HreProTmx != T00NO2_A4554HreProTmx[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreProTmx");
               GXutil.writeLogRaw("Old: ",Z4554HreProTmx);
               GXutil.writeLogRaw("Current: ",T00NO2_A4554HreProTmx[0]);
            }
            if ( Z4555HreNumPro != T00NO2_A4555HreNumPro[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumPro");
               GXutil.writeLogRaw("Old: ",Z4555HreNumPro);
               GXutil.writeLogRaw("Current: ",T00NO2_A4555HreNumPro[0]);
            }
            if ( Z4556HreNumRec != T00NO2_A4556HreNumRec[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNumRec");
               GXutil.writeLogRaw("Old: ",Z4556HreNumRec);
               GXutil.writeLogRaw("Current: ",T00NO2_A4556HreNumRec[0]);
            }
            if ( Z4966HreVolPro != T00NO2_A4966HreVolPro[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreVolPro");
               GXutil.writeLogRaw("Old: ",Z4966HreVolPro);
               GXutil.writeLogRaw("Current: ",T00NO2_A4966HreVolPro[0]);
            }
            if ( Z5947HreTieprg != T00NO2_A5947HreTieprg[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreTieprg");
               GXutil.writeLogRaw("Old: ",Z5947HreTieprg);
               GXutil.writeLogRaw("Current: ",T00NO2_A5947HreTieprg[0]);
            }
            if ( Z5948HreNroPrg != T00NO2_A5948HreNroPrg[0] )
            {
               GXutil.writeLogln("thisrex:[seudo value changed for attri]"+"HreNroPrg");
               GXutil.writeLogRaw("Old: ",Z5948HreNroPrg);
               GXutil.writeLogRaw("Current: ",T00NO2_A5948HreNroPrg[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertNO1874( )
   {
      beforeValidateNO1874( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNO1874( ) ;
      }
      if ( AnyError == 0 )
      {
         zmNO1874( 0) ;
         checkOptimisticConcurrencyNO1874( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNO1874( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertNO1874( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NO37 */
                  pr_default.execute(35, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), A4551HreProCod, A4552HreProDsc, Short.valueOf(A4553HreProTie), Short.valueOf(A4554HreProTmx), Integer.valueOf(A4555HreNumPro), Integer.valueOf(A4556HreNumRec), Integer.valueOf(A4966HreVolPro), Short.valueOf(A5947HreTieprg), Short.valueOf(A5948HreNroPrg), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
                  if ( (pr_default.getStatus(35) == 1) )
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
            loadNO1874( ) ;
         }
         endLevelNO1874( ) ;
      }
      closeExtendedTableCursorsNO1874( ) ;
   }

   public void updateNO1874( )
   {
      beforeValidateNO1874( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNO1874( ) ;
      }
      if ( ( nIsMod_1874 != 0 ) || ( nIsDirty_1874 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyNO1874( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmNO1874( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateNO1874( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00NO38 */
                     pr_default.execute(36, new Object[] {A4551HreProCod, A4552HreProDsc, Short.valueOf(A4553HreProTie), Short.valueOf(A4554HreProTmx), Integer.valueOf(A4555HreNumPro), Integer.valueOf(A4556HreNumRec), Integer.valueOf(A4966HreVolPro), Short.valueOf(A5947HreTieprg), Short.valueOf(A5948HreNroPrg), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
                     if ( (pr_default.getStatus(36) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateNO1874( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyNO1874( ) ;
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
            endLevelNO1874( ) ;
         }
      }
      closeExtendedTableCursorsNO1874( ) ;
   }

   public void deferredUpdateNO1874( )
   {
   }

   public void deleteNO1874( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateNO1874( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNO1874( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsNO1874( ) ;
         afterConfirmNO1874( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteNO1874( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00NO39 */
               pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
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
      sMode1874 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelNO1874( ) ;
      Gx_mode = sMode1874 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsNO1874( )
   {
      standaloneModalNO1874( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00NO40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void endLevelNO1874( )
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

   public void scanStartNO1874( )
   {
      /* Scan By routine */
      /* Using cursor T00NO41 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      RcdFound1874 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1874 = (short)(1) ;
         A4550HreLinPro = T00NO41_A4550HreLinPro[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextNO1874( )
   {
      /* Scan next routine */
      pr_default.readNext(39);
      RcdFound1874 = (short)(0) ;
      if ( (pr_default.getStatus(39) != 101) )
      {
         RcdFound1874 = (short)(1) ;
         A4550HreLinPro = T00NO41_A4550HreLinPro[0] ;
      }
   }

   public void scanEndNO1874( )
   {
      pr_default.close(39);
   }

   public void afterConfirmNO1874( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertNO1874( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateNO1874( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteNO1874( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteNO1874( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateNO1874( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesNO1874( )
   {
      edtHreLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProCod_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProDsc_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreProTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTie_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreProTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTmx_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreNumPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreNumRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumRec_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreVolPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreVolPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreTieprg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreTieprg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTieprg_Enabled), 5, 0), !bGXsfl_377_Refreshing);
      edtHreNroPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNroPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNroPrg_Enabled), 5, 0), !bGXsfl_377_Refreshing);
   }

   public void send_integrity_lvl_hashesNO1874( )
   {
   }

   public void send_integrity_lvl_hashesNO678( )
   {
   }

   public void send_integrity_lvl_hashesNO675( )
   {
   }

   public void subsflControlProps_255678( )
   {
      lblTextblock48_Internalname = "TEXTBLOCK48_"+sGXsfl_255_idx ;
      edtHreLinMaq_Internalname = "HRELINMAQ_"+sGXsfl_255_idx ;
      lblTextblock49_Internalname = "TEXTBLOCK49_"+sGXsfl_255_idx ;
      edtHreMaqCod_Internalname = "HREMAQCOD_"+sGXsfl_255_idx ;
      lblTextblock50_Internalname = "TEXTBLOCK50_"+sGXsfl_255_idx ;
      edtHreVolPrd_Internalname = "HREVOLPRD_"+sGXsfl_255_idx ;
      lblTextblock51_Internalname = "TEXTBLOCK51_"+sGXsfl_255_idx ;
      edtHreFacAbs_Internalname = "HREFACABS_"+sGXsfl_255_idx ;
      lblTextblock52_Internalname = "TEXTBLOCK52_"+sGXsfl_255_idx ;
      edtHreFecPes_Internalname = "HREFECPES_"+sGXsfl_255_idx ;
      lblTextblock53_Internalname = "TEXTBLOCK53_"+sGXsfl_255_idx ;
      edtHreMaqPes_Internalname = "HREMAQPES_"+sGXsfl_255_idx ;
      lblTextblock54_Internalname = "TEXTBLOCK54_"+sGXsfl_255_idx ;
      edtHreULinPro_Internalname = "HREULINPRO_"+sGXsfl_255_idx ;
      lblTextblock55_Internalname = "TEXTBLOCK55_"+sGXsfl_255_idx ;
      edtHreUsrCod_Internalname = "HREUSRCOD_"+sGXsfl_255_idx ;
      lblTextblock56_Internalname = "TEXTBLOCK56_"+sGXsfl_255_idx ;
      edtHreFecAlt_Internalname = "HREFECALT_"+sGXsfl_255_idx ;
      lblTextblock57_Internalname = "TEXTBLOCK57_"+sGXsfl_255_idx ;
      edtHreUsrMod_Internalname = "HREUSRMOD_"+sGXsfl_255_idx ;
      lblTextblock58_Internalname = "TEXTBLOCK58_"+sGXsfl_255_idx ;
      edtHreFecMod_Internalname = "HREFECMOD_"+sGXsfl_255_idx ;
      lblTextblock59_Internalname = "TEXTBLOCK59_"+sGXsfl_255_idx ;
      edtHreFasCod_Internalname = "HREFASCOD_"+sGXsfl_255_idx ;
      lblTextblock60_Internalname = "TEXTBLOCK60_"+sGXsfl_255_idx ;
      edtHreOrdLin_Internalname = "HREORDLIN_"+sGXsfl_255_idx ;
      lblTextblock61_Internalname = "TEXTBLOCK61_"+sGXsfl_255_idx ;
      edtHreNroPar_Internalname = "HRENROPAR_"+sGXsfl_255_idx ;
      lblTextblock62_Internalname = "TEXTBLOCK62_"+sGXsfl_255_idx ;
      edtHreTotKgs_Internalname = "HRETOTKGS_"+sGXsfl_255_idx ;
      lblTextblock63_Internalname = "TEXTBLOCK63_"+sGXsfl_255_idx ;
      edtHreTotMts_Internalname = "HRETOTMTS_"+sGXsfl_255_idx ;
      lblTextblock64_Internalname = "TEXTBLOCK64_"+sGXsfl_255_idx ;
      edtHreTotPrd_Internalname = "HRETOTPRD_"+sGXsfl_255_idx ;
      lblTextblock65_Internalname = "TEXTBLOCK65_"+sGXsfl_255_idx ;
      edtHreProPrd_Internalname = "HREPROPRD_"+sGXsfl_255_idx ;
      lblTextblock66_Internalname = "TEXTBLOCK66_"+sGXsfl_255_idx ;
      edtHreNumRmt_Internalname = "HRENUMRMT_"+sGXsfl_255_idx ;
      lblTextblock67_Internalname = "TEXTBLOCK67_"+sGXsfl_255_idx ;
      edtHreNumReo_Internalname = "HRENUMREO_"+sGXsfl_255_idx ;
      lblTextblock68_Internalname = "TEXTBLOCK68_"+sGXsfl_255_idx ;
      edtHreNumInt_Internalname = "HRENUMINT_"+sGXsfl_255_idx ;
      lblTextblock69_Internalname = "TEXTBLOCK69_"+sGXsfl_255_idx ;
      edtHreDti_Internalname = "HREDTI_"+sGXsfl_255_idx ;
      lblTextblock70_Internalname = "TEXTBLOCK70_"+sGXsfl_255_idx ;
      edtHreDtf_Internalname = "HREDTF_"+sGXsfl_255_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_255_idx ;
   }

   public void subsflControlProps_fel_255678( )
   {
      lblTextblock48_Internalname = "TEXTBLOCK48_"+sGXsfl_255_fel_idx ;
      edtHreLinMaq_Internalname = "HRELINMAQ_"+sGXsfl_255_fel_idx ;
      lblTextblock49_Internalname = "TEXTBLOCK49_"+sGXsfl_255_fel_idx ;
      edtHreMaqCod_Internalname = "HREMAQCOD_"+sGXsfl_255_fel_idx ;
      lblTextblock50_Internalname = "TEXTBLOCK50_"+sGXsfl_255_fel_idx ;
      edtHreVolPrd_Internalname = "HREVOLPRD_"+sGXsfl_255_fel_idx ;
      lblTextblock51_Internalname = "TEXTBLOCK51_"+sGXsfl_255_fel_idx ;
      edtHreFacAbs_Internalname = "HREFACABS_"+sGXsfl_255_fel_idx ;
      lblTextblock52_Internalname = "TEXTBLOCK52_"+sGXsfl_255_fel_idx ;
      edtHreFecPes_Internalname = "HREFECPES_"+sGXsfl_255_fel_idx ;
      lblTextblock53_Internalname = "TEXTBLOCK53_"+sGXsfl_255_fel_idx ;
      edtHreMaqPes_Internalname = "HREMAQPES_"+sGXsfl_255_fel_idx ;
      lblTextblock54_Internalname = "TEXTBLOCK54_"+sGXsfl_255_fel_idx ;
      edtHreULinPro_Internalname = "HREULINPRO_"+sGXsfl_255_fel_idx ;
      lblTextblock55_Internalname = "TEXTBLOCK55_"+sGXsfl_255_fel_idx ;
      edtHreUsrCod_Internalname = "HREUSRCOD_"+sGXsfl_255_fel_idx ;
      lblTextblock56_Internalname = "TEXTBLOCK56_"+sGXsfl_255_fel_idx ;
      edtHreFecAlt_Internalname = "HREFECALT_"+sGXsfl_255_fel_idx ;
      lblTextblock57_Internalname = "TEXTBLOCK57_"+sGXsfl_255_fel_idx ;
      edtHreUsrMod_Internalname = "HREUSRMOD_"+sGXsfl_255_fel_idx ;
      lblTextblock58_Internalname = "TEXTBLOCK58_"+sGXsfl_255_fel_idx ;
      edtHreFecMod_Internalname = "HREFECMOD_"+sGXsfl_255_fel_idx ;
      lblTextblock59_Internalname = "TEXTBLOCK59_"+sGXsfl_255_fel_idx ;
      edtHreFasCod_Internalname = "HREFASCOD_"+sGXsfl_255_fel_idx ;
      lblTextblock60_Internalname = "TEXTBLOCK60_"+sGXsfl_255_fel_idx ;
      edtHreOrdLin_Internalname = "HREORDLIN_"+sGXsfl_255_fel_idx ;
      lblTextblock61_Internalname = "TEXTBLOCK61_"+sGXsfl_255_fel_idx ;
      edtHreNroPar_Internalname = "HRENROPAR_"+sGXsfl_255_fel_idx ;
      lblTextblock62_Internalname = "TEXTBLOCK62_"+sGXsfl_255_fel_idx ;
      edtHreTotKgs_Internalname = "HRETOTKGS_"+sGXsfl_255_fel_idx ;
      lblTextblock63_Internalname = "TEXTBLOCK63_"+sGXsfl_255_fel_idx ;
      edtHreTotMts_Internalname = "HRETOTMTS_"+sGXsfl_255_fel_idx ;
      lblTextblock64_Internalname = "TEXTBLOCK64_"+sGXsfl_255_fel_idx ;
      edtHreTotPrd_Internalname = "HRETOTPRD_"+sGXsfl_255_fel_idx ;
      lblTextblock65_Internalname = "TEXTBLOCK65_"+sGXsfl_255_fel_idx ;
      edtHreProPrd_Internalname = "HREPROPRD_"+sGXsfl_255_fel_idx ;
      lblTextblock66_Internalname = "TEXTBLOCK66_"+sGXsfl_255_fel_idx ;
      edtHreNumRmt_Internalname = "HRENUMRMT_"+sGXsfl_255_fel_idx ;
      lblTextblock67_Internalname = "TEXTBLOCK67_"+sGXsfl_255_fel_idx ;
      edtHreNumReo_Internalname = "HRENUMREO_"+sGXsfl_255_fel_idx ;
      lblTextblock68_Internalname = "TEXTBLOCK68_"+sGXsfl_255_fel_idx ;
      edtHreNumInt_Internalname = "HRENUMINT_"+sGXsfl_255_fel_idx ;
      lblTextblock69_Internalname = "TEXTBLOCK69_"+sGXsfl_255_fel_idx ;
      edtHreDti_Internalname = "HREDTI_"+sGXsfl_255_fel_idx ;
      lblTextblock70_Internalname = "TEXTBLOCK70_"+sGXsfl_255_fel_idx ;
      edtHreDtf_Internalname = "HREDTF_"+sGXsfl_255_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_255_fel_idx ;
   }

   public void addRowNO678( )
   {
      nRC_GXsfl_377 = 0 ;
      nGXsfl_255_idx = (int)(nGXsfl_255_idx+1) ;
      sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_255678( ) ;
      sendRowNO678( ) ;
   }

   public void sendRowNO678( )
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
         if ( ((int)((nGXsfl_255_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_255_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_255_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_255_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock48_Internalname,httpContext.getMessage( "Linea Maquina. Hist.Receta", ""),"","",lblTextblock48_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 263,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,263);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLinMaq_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreLinMaq_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock49_Internalname,httpContext.getMessage( "Maquina Hdr. Hist.Receta", ""),"","",lblTextblock49_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 268,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqCod_Internalname,GXutil.rtrim( A4546HreMaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,268);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock50_Internalname,httpContext.getMessage( "Volumen Maq. Hist.Receta", ""),"","",lblTextblock50_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 273,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreVolPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,273);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPrd_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreVolPrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock51_Internalname,httpContext.getMessage( "Factor Abs.Hist.Receta", ""),"","",lblTextblock51_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 278,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFacAbs_Internalname,GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreFacAbs_Enabled!=0) ? localUtil.format( A4548HreFacAbs, "ZZ9.99") : localUtil.format( A4548HreFacAbs, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,278);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFacAbs_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFacAbs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock52_Internalname,httpContext.getMessage( "Fecha Hora Pesaje", ""),"","",lblTextblock52_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 283,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFecPes_Internalname,localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4584HreFecPes, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,283);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFecPes_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFecPes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(17),"chr",Integer.valueOf(1),"row",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock53_Internalname,httpContext.getMessage( "Maquina Pesada", ""),"","",lblTextblock53_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 288,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqPes_Internalname,GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreMaqPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4585HreMaqPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A4585HreMaqPes), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,288);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqPes_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreMaqPes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock54_Internalname,httpContext.getMessage( "Ul.Lin.Proceso Rec.Hist.Receta", ""),"","",lblTextblock54_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 293,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreULinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreULinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4549HreULinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4549HreULinPro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,293);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreULinPro_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreULinPro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock55_Internalname,httpContext.getMessage( "Usuario creo receta", ""),"","",lblTextblock55_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 298,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreUsrCod_Internalname,GXutil.rtrim( A4863HreUsrCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,298);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreUsrCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreUsrCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock56_Internalname,httpContext.getMessage( "Fecha Alta Receta", ""),"","",lblTextblock56_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 303,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFecAlt_Internalname,localUtil.ttoc( A4960HreFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4960HreFecAlt, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,303);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFecAlt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFecAlt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(17),"chr",Integer.valueOf(1),"row",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock57_Internalname,httpContext.getMessage( "Usuario Modifico Receta", ""),"","",lblTextblock57_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 308,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreUsrMod_Internalname,GXutil.rtrim( A4961HreUsrMod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,308);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreUsrMod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreUsrMod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock58_Internalname,httpContext.getMessage( "HreFecMod", ""),"","",lblTextblock58_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFecMod_Internalname,localUtil.ttoc( A4962HreFecMod, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4962HreFecMod, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,313);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFecMod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFecMod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(17),"chr",Integer.valueOf(1),"row",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock59_Internalname,httpContext.getMessage( "Fase, Lavanderias", ""),"","",lblTextblock59_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 318,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFasCod_Internalname,GXutil.rtrim( A4963HreFasCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,318);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFasCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFasCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock60_Internalname,httpContext.getMessage( "Orden Fase", ""),"","",lblTextblock60_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 323,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4964HreOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4964HreOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,323);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreOrdLin_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreOrdLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock61_Internalname,httpContext.getMessage( "Nº Partida, Lavanderias", ""),"","",lblTextblock61_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 328,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNroPar_Internalname,GXutil.ltrim( localUtil.ntoc( A4965HreNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNroPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4965HreNroPar), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4965HreNroPar), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,328);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNroPar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreNroPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock62_Internalname,httpContext.getMessage( "Total Kgs, Lav", ""),"","",lblTextblock62_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 333,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTotKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A4968HreTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreTotKgs_Enabled!=0) ? localUtil.format( A4968HreTotKgs, "ZZZZZZ9.99") : localUtil.format( A4968HreTotKgs, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,333);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreTotKgs_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreTotKgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock63_Internalname,httpContext.getMessage( "Total Mts, Lav?", ""),"","",lblTextblock63_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 338,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTotMts_Internalname,GXutil.ltrim( localUtil.ntoc( A4969HreTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreTotMts_Enabled!=0) ? localUtil.format( A4969HreTotMts, "ZZZZZZ9.99") : localUtil.format( A4969HreTotMts, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,338);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreTotMts_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreTotMts_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock64_Internalname,httpContext.getMessage( "Total Piezas,Lav", ""),"","",lblTextblock64_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 343,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTotPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4970HreTotPrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreTotPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4970HreTotPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4970HreTotPrd), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,343);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreTotPrd_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreTotPrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock65_Internalname,httpContext.getMessage( "Proceso Produccion", ""),"","",lblTextblock65_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 348,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProPrd_Internalname,GXutil.rtrim( A5863HreProPrd),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,348);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProPrd_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreProPrd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock66_Internalname,httpContext.getMessage( "Nº de Remontadas", ""),"","",lblTextblock66_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 353,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumRmt_Internalname,GXutil.ltrim( localUtil.ntoc( A5978HreNumRmt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumRmt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5978HreNumRmt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5978HreNumRmt), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,353);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumRmt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreNumRmt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock67_Internalname,httpContext.getMessage( "Nº de reoperados", ""),"","",lblTextblock67_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 358,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5979HreNumReo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5979HreNumReo), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5979HreNumReo), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,358);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumReo_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreNumReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock68_Internalname,httpContext.getMessage( "N Interno Receta", ""),"","",lblTextblock68_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 363,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumInt_Internalname,GXutil.ltrim( localUtil.ntoc( A10102HreNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10102HreNumInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10102HreNumInt), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,363);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumInt_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreNumInt_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock69_Internalname,httpContext.getMessage( "Fecha Inicio Tin", ""),"","",lblTextblock69_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 368,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreDti_Internalname,localUtil.ttoc( A10103HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10103HreDti, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,368);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreDti_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreDti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(17),"chr",Integer.valueOf(1),"row",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock70_Internalname,httpContext.getMessage( "Fin Tinte", ""),"","",lblTextblock70_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 373,'',false,'" + sGXsfl_255_idx + "',255)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreDtf_Internalname,localUtil.ttoc( A10104HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10104HreDtf, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,373);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreDtf_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreDtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(17),"chr",Integer.valueOf(1),"row",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol377( ) ;
      nGXsfl_377_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1874 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1874 = (short)(1) ;
            scanStartNO1874( ) ;
            while ( RcdFound1874 != 0 )
            {
               init_level_properties1874( ) ;
               getByPrimaryKeyNO1874( ) ;
               addRowNO1874( ) ;
               scanNextNO1874( ) ;
            }
            scanEndNO1874( ) ;
            nBlankRcdCount1874 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalNO1874( ) ;
         standaloneModalNO1874( ) ;
         sMode1874 = Gx_mode ;
         while ( nGXsfl_377_idx < nRC_GXsfl_377 )
         {
            bGXsfl_377_Refreshing = true ;
            readRowNO1874( ) ;
            edtavnRcdDeleted_1874_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1874_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1874_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1874_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreLinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINPRO_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROCOD_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProCod_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPRODSC_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProDsc_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreProTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTIE_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTie_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreProTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTMX_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTmx_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreNumPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMPRO_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreNumRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMREC_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumRec_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreVolPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVOLPRO_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreVolPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreTieprg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETIEPRG_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreTieprg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreTieprg_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            edtHreNroPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENROPRG_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNroPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNroPrg_Enabled), 5, 0), !bGXsfl_377_Refreshing);
            if ( ( nRcdExists_1874 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalNO1874( ) ;
            }
            sendRowNO1874( ) ;
            bGXsfl_377_Refreshing = false ;
         }
         Gx_mode = sMode1874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1874 = (short)(5) ;
         nRcdExists_1874 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartNO1874( ) ;
            while ( RcdFound1874 != 0 )
            {
               sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx+1), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
               subsflControlProps_3771874( ) ;
               init_level_properties1874( ) ;
               standaloneNotModalNO1874( ) ;
               getByPrimaryKeyNO1874( ) ;
               standaloneModalNO1874( ) ;
               addRowNO1874( ) ;
               scanNextNO1874( ) ;
            }
            scanEndNO1874( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1874 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx+1), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
      subsflControlProps_3771874( ) ;
      initAllNO1874( ) ;
      init_level_properties1874( ) ;
      nRcdExists_1874 = (short)(0) ;
      nIsMod_1874 = (short)(0) ;
      nRcdDeleted_1874 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 255 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_255_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1874 = (short)(nBlankRcdUsr1874+nBlankRcdCount1874) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1874 > 0 )
      {
         standaloneNotModalNO1874( ) ;
         standaloneModalNO1874( ) ;
         addRowNO1874( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtHreLinPro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1874 = (short)(nBlankRcdCount1874-1) ;
      }
      Gx_mode = sMode1874 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_255_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_255_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_255_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesNO678( ) ;
      GXCCtl = "Z4545HreLinMaq_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4546HreMaqCod_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4546HreMaqCod));
      GXCCtl = "Z4547HreVolPrd_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4548HreFacAbs_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4584HreFecPes_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4585HreMaqPes_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4549HreULinPro_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4863HreUsrCod_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4863HreUsrCod));
      GXCCtl = "Z4960HreFecAlt_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4960HreFecAlt, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4961HreUsrMod_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4961HreUsrMod));
      GXCCtl = "Z4962HreFecMod_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4962HreFecMod, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4963HreFasCod_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4963HreFasCod));
      GXCCtl = "Z4964HreOrdLin_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4964HreOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4965HreNroPar_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4965HreNroPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4968HreTotKgs_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4968HreTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4969HreTotMts_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4969HreTotMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4970HreTotPrd_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4970HreTotPrd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5863HreProPrd_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5863HreProPrd));
      GXCCtl = "Z5978HreNumRmt_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5978HreNumRmt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5979HreNumReo_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5979HreNumReo, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10102HreNumInt_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10102HreNumInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10103HreDti_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10103HreDti, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z10104HreDtf_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z10104HreDtf, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "nRC_GXsfl_377_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_377_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_678_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_678_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_678_" + sGXsfl_255_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELINMAQ_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREVOLPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFACABS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFECPES_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQPES_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREULINPRO_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREUSRCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFECALT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecAlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREUSRMOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrMod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFECMOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecMod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFASCOD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREORDLIN_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENROPAR_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRETOTKGS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRETOTMTS_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRETOTPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROPRD_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMRMT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMREO_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMINT_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREDTI_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDti_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREDTF_"+sGXsfl_255_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDtf_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_255_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowNO678( )
   {
      nGXsfl_255_idx = (int)(nGXsfl_255_idx+1) ;
      sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_255678( ) ;
      edtHreLinMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINMAQ_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQCOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreVolPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVOLPRD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFacAbs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFACABS_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFecPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECPES_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreMaqPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQPES_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreULinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREULINPRO_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreUsrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREUSRCOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFecAlt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECALT_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreUsrMod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREUSRMOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFecMod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECMOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFASCOD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreOrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREORDLIN_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNroPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENROPAR_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreTotKgs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETOTKGS_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreTotMts_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETOTMTS_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreTotPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETOTPRD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROPRD_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumRmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMRMT_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMREO_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMINT_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreDti_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREDTI_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreDtf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREDTF_"+sGXsfl_255_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRELINMAQ_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreLinMaq_Internalname ;
         wbErr = true ;
         A4545HreLinMaq = (short)(0) ;
      }
      else
      {
         A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
      n4546HreMaqCod = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "HREVOLPRD_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreVolPrd_Internalname ;
         wbErr = true ;
         A4547HreVolPrd = 0 ;
         n4547HreVolPrd = false ;
      }
      else
      {
         A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4547HreVolPrd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreFacAbs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreFacAbs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "HREFACABS_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreFacAbs_Internalname ;
         wbErr = true ;
         A4548HreFacAbs = DecimalUtil.ZERO ;
         n4548HreFacAbs = false ;
      }
      else
      {
         A4548HreFacAbs = localUtil.ctond( httpContext.cgiGet( edtHreFacAbs_Internalname)) ;
         n4548HreFacAbs = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHreFecPes_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HREFECPES_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreFecPes_Internalname ;
         wbErr = true ;
         A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
         n4584HreFecPes = false ;
      }
      else
      {
         A4584HreFecPes = localUtil.ctot( httpContext.cgiGet( edtHreFecPes_Internalname)) ;
         n4584HreFecPes = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HREMAQPES_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreMaqPes_Internalname ;
         wbErr = true ;
         A4585HreMaqPes = (byte)(0) ;
         n4585HreMaqPes = false ;
      }
      else
      {
         A4585HreMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreMaqPes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4585HreMaqPes = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreULinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreULinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HREULINPRO_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreULinPro_Internalname ;
         wbErr = true ;
         A4549HreULinPro = (byte)(0) ;
         n4549HreULinPro = false ;
      }
      else
      {
         A4549HreULinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreULinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4549HreULinPro = false ;
      }
      A4863HreUsrCod = httpContext.cgiGet( edtHreUsrCod_Internalname) ;
      n4863HreUsrCod = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHreFecAlt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HREFECALT_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreFecAlt_Internalname ;
         wbErr = true ;
         A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
         n4960HreFecAlt = false ;
      }
      else
      {
         A4960HreFecAlt = localUtil.ctot( httpContext.cgiGet( edtHreFecAlt_Internalname)) ;
         n4960HreFecAlt = false ;
      }
      A4961HreUsrMod = httpContext.cgiGet( edtHreUsrMod_Internalname) ;
      n4961HreUsrMod = false ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHreFecMod_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HREFECMOD_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreFecMod_Internalname ;
         wbErr = true ;
         A4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
         n4962HreFecMod = false ;
      }
      else
      {
         A4962HreFecMod = localUtil.ctot( httpContext.cgiGet( edtHreFecMod_Internalname)) ;
         n4962HreFecMod = false ;
      }
      A4963HreFasCod = httpContext.cgiGet( edtHreFasCod_Internalname) ;
      n4963HreFasCod = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HREORDLIN_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreOrdLin_Internalname ;
         wbErr = true ;
         A4964HreOrdLin = (short)(0) ;
         n4964HreOrdLin = false ;
      }
      else
      {
         A4964HreOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtHreOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4964HreOrdLin = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNroPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNroPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HRENROPAR_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNroPar_Internalname ;
         wbErr = true ;
         A4965HreNroPar = 0 ;
         n4965HreNroPar = false ;
      }
      else
      {
         A4965HreNroPar = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNroPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4965HreNroPar = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreTotKgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreTotKgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRETOTKGS_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreTotKgs_Internalname ;
         wbErr = true ;
         A4968HreTotKgs = DecimalUtil.ZERO ;
         n4968HreTotKgs = false ;
      }
      else
      {
         A4968HreTotKgs = localUtil.ctond( httpContext.cgiGet( edtHreTotKgs_Internalname)) ;
         n4968HreTotKgs = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreTotMts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreTotMts_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRETOTMTS_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreTotMts_Internalname ;
         wbErr = true ;
         A4969HreTotMts = DecimalUtil.ZERO ;
         n4969HreTotMts = false ;
      }
      else
      {
         A4969HreTotMts = localUtil.ctond( httpContext.cgiGet( edtHreTotMts_Internalname)) ;
         n4969HreTotMts = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreTotPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreTotPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HRETOTPRD_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreTotPrd_Internalname ;
         wbErr = true ;
         A4970HreTotPrd = 0 ;
         n4970HreTotPrd = false ;
      }
      else
      {
         A4970HreTotPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreTotPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4970HreTotPrd = false ;
      }
      A5863HreProPrd = httpContext.cgiGet( edtHreProPrd_Internalname) ;
      n5863HreProPrd = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumRmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumRmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HRENUMRMT_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNumRmt_Internalname ;
         wbErr = true ;
         A5978HreNumRmt = 0 ;
         n5978HreNumRmt = false ;
      }
      else
      {
         A5978HreNumRmt = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumRmt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5978HreNumRmt = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "HRENUMREO_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNumReo_Internalname ;
         wbErr = true ;
         A5979HreNumReo = 0 ;
         n5979HreNumReo = false ;
      }
      else
      {
         A5979HreNumReo = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5979HreNumReo = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "HRENUMINT_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNumInt_Internalname ;
         wbErr = true ;
         A10102HreNumInt = 0 ;
         n10102HreNumInt = false ;
      }
      else
      {
         A10102HreNumInt = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10102HreNumInt = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHreDti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HREDTI_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreDti_Internalname ;
         wbErr = true ;
         A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
         n10103HreDti = false ;
      }
      else
      {
         A10103HreDti = localUtil.ctot( httpContext.cgiGet( edtHreDti_Internalname)) ;
         n10103HreDti = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtHreDtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "HREDTF_" + sGXsfl_255_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreDtf_Internalname ;
         wbErr = true ;
         A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
         n10104HreDtf = false ;
      }
      else
      {
         A10104HreDtf = localUtil.ctot( httpContext.cgiGet( edtHreDtf_Internalname)) ;
         n10104HreDtf = false ;
      }
      GXCCtl = "Z4545HreLinMaq_" + sGXsfl_255_idx ;
      Z4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4546HreMaqCod_" + sGXsfl_255_idx ;
      Z4546HreMaqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4547HreVolPrd_" + sGXsfl_255_idx ;
      Z4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4548HreFacAbs_" + sGXsfl_255_idx ;
      Z4548HreFacAbs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4584HreFecPes_" + sGXsfl_255_idx ;
      Z4584HreFecPes = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4585HreMaqPes_" + sGXsfl_255_idx ;
      Z4585HreMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4549HreULinPro_" + sGXsfl_255_idx ;
      Z4549HreULinPro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4863HreUsrCod_" + sGXsfl_255_idx ;
      Z4863HreUsrCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4960HreFecAlt_" + sGXsfl_255_idx ;
      Z4960HreFecAlt = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4961HreUsrMod_" + sGXsfl_255_idx ;
      Z4961HreUsrMod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4962HreFecMod_" + sGXsfl_255_idx ;
      Z4962HreFecMod = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4963HreFasCod_" + sGXsfl_255_idx ;
      Z4963HreFasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4964HreOrdLin_" + sGXsfl_255_idx ;
      Z4964HreOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4965HreNroPar_" + sGXsfl_255_idx ;
      Z4965HreNroPar = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4968HreTotKgs_" + sGXsfl_255_idx ;
      Z4968HreTotKgs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4969HreTotMts_" + sGXsfl_255_idx ;
      Z4969HreTotMts = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4970HreTotPrd_" + sGXsfl_255_idx ;
      Z4970HreTotPrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5863HreProPrd_" + sGXsfl_255_idx ;
      Z5863HreProPrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5978HreNumRmt_" + sGXsfl_255_idx ;
      Z5978HreNumRmt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5979HreNumReo_" + sGXsfl_255_idx ;
      Z5979HreNumReo = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10102HreNumInt_" + sGXsfl_255_idx ;
      Z10102HreNumInt = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10103HreDti_" + sGXsfl_255_idx ;
      Z10103HreDti = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z10104HreDtf_" + sGXsfl_255_idx ;
      Z10104HreDtf = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRC_GXsfl_377_" + sGXsfl_255_idx ;
      nRC_GXsfl_377 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_678_" + sGXsfl_255_idx ;
      nRcdDeleted_678 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_678_" + sGXsfl_255_idx ;
      nRcdExists_678 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_678_" + sGXsfl_255_idx ;
      nIsMod_678 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_377_" + sGXsfl_255_idx ;
      nRC_GXsfl_377 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_3771874( )
   {
      edtavnRcdDeleted_1874_Internalname = "vNRCDDELETED_1874_"+sGXsfl_377_idx ;
      edtHreLinPro_Internalname = "HRELINPRO_"+sGXsfl_377_idx ;
      edtHreProCod_Internalname = "HREPROCOD_"+sGXsfl_377_idx ;
      edtHreProDsc_Internalname = "HREPRODSC_"+sGXsfl_377_idx ;
      edtHreProTie_Internalname = "HREPROTIE_"+sGXsfl_377_idx ;
      edtHreProTmx_Internalname = "HREPROTMX_"+sGXsfl_377_idx ;
      edtHreNumPro_Internalname = "HRENUMPRO_"+sGXsfl_377_idx ;
      edtHreNumRec_Internalname = "HRENUMREC_"+sGXsfl_377_idx ;
      edtHreVolPro_Internalname = "HREVOLPRO_"+sGXsfl_377_idx ;
      edtHreTieprg_Internalname = "HRETIEPRG_"+sGXsfl_377_idx ;
      edtHreNroPrg_Internalname = "HRENROPRG_"+sGXsfl_377_idx ;
   }

   public void subsflControlProps_fel_3771874( )
   {
      edtavnRcdDeleted_1874_Internalname = "vNRCDDELETED_1874_"+sGXsfl_377_fel_idx ;
      edtHreLinPro_Internalname = "HRELINPRO_"+sGXsfl_377_fel_idx ;
      edtHreProCod_Internalname = "HREPROCOD_"+sGXsfl_377_fel_idx ;
      edtHreProDsc_Internalname = "HREPRODSC_"+sGXsfl_377_fel_idx ;
      edtHreProTie_Internalname = "HREPROTIE_"+sGXsfl_377_fel_idx ;
      edtHreProTmx_Internalname = "HREPROTMX_"+sGXsfl_377_fel_idx ;
      edtHreNumPro_Internalname = "HRENUMPRO_"+sGXsfl_377_fel_idx ;
      edtHreNumRec_Internalname = "HRENUMREC_"+sGXsfl_377_fel_idx ;
      edtHreVolPro_Internalname = "HREVOLPRO_"+sGXsfl_377_fel_idx ;
      edtHreTieprg_Internalname = "HRETIEPRG_"+sGXsfl_377_fel_idx ;
      edtHreNroPrg_Internalname = "HRENROPRG_"+sGXsfl_377_fel_idx ;
   }

   public void addRowNO1874( )
   {
      nGXsfl_377_idx = (int)(nGXsfl_377_idx+1) ;
      sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
      subsflControlProps_3771874( ) ;
      sendRowNO1874( ) ;
   }

   public void sendRowNO1874( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_377_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 378,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1874_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1874_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1874), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1874), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,378);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1874_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1874_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 379,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4550HreLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,379);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreLinPro_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 380,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProCod_Internalname,GXutil.rtrim( A4551HreProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,380);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 381,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProDsc_Internalname,GXutil.rtrim( A4552HreProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,381);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 382,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProTie_Internalname,GXutil.ltrim( localUtil.ntoc( A4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreProTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4553HreProTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4553HreProTie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,382);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProTie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 383,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreProTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4554HreProTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4554HreProTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,383);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProTmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 384,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4555HreNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4555HreNumPro), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,384);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNumPro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 385,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumRec_Internalname,GXutil.ltrim( localUtil.ntoc( A4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4556HreNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4556HreNumRec), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,385);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNumRec_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 386,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4966HreVolPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreVolPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4966HreVolPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4966HreVolPro), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,386);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreVolPro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 387,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreTieprg_Internalname,GXutil.ltrim( localUtil.ntoc( A5947HreTieprg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreTieprg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5947HreTieprg), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5947HreTieprg), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,387);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreTieprg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreTieprg_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_377_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_255_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 388,'',false,'" + sGXsfl_377_idx + "',377)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNroPrg_Internalname,GXutil.ltrim( localUtil.ntoc( A5948HreNroPrg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNroPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5948HreNroPrg), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5948HreNroPrg), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,388);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNroPrg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNroPrg_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(377),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesNO1874( ) ;
      GXCCtl = "Z4550HreLinPro_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4551HreProCod_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4551HreProCod));
      GXCCtl = "Z4552HreProDsc_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4552HreProDsc));
      GXCCtl = "Z4553HreProTie_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4554HreProTmx_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4555HreNumPro_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4556HreNumRec_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4966HreVolPro_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4966HreVolPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5947HreTieprg_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5947HreTieprg, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5948HreNroPrg_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5948HreNroPrg, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1874_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1874_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1874_" + sGXsfl_377_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1874_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELINPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROCOD_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPRODSC_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROTIE_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROTMX_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMREC_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREVOLPRO_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRETIEPRG_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTieprg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENROPRG_"+sGXsfl_377_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowNO1874( )
   {
      nGXsfl_377_idx = (int)(nGXsfl_377_idx+1) ;
      sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
      subsflControlProps_3771874( ) ;
      edtavnRcdDeleted_1874_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1874_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreLinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINPRO_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROCOD_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPRODSC_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTIE_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTMX_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMPRO_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMREC_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreVolPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVOLPRO_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreTieprg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRETIEPRG_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNroPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENROPRG_"+sGXsfl_377_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1874_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1874_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_1874");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_1874_Internalname ;
         wbErr = true ;
         nRcdDeleted_1874 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_1874 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_1874_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HRELINPRO_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreLinPro_Internalname ;
         wbErr = true ;
         A4550HreLinPro = (byte)(0) ;
      }
      else
      {
         A4550HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A4551HreProCod = httpContext.cgiGet( edtHreProCod_Internalname) ;
      A4552HreProDsc = httpContext.cgiGet( edtHreProDsc_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreProTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreProTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HREPROTIE_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreProTie_Internalname ;
         wbErr = true ;
         A4553HreProTie = (short)(0) ;
      }
      else
      {
         A4553HreProTie = (short)(localUtil.ctol( httpContext.cgiGet( edtHreProTie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreProTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreProTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HREPROTMX_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreProTmx_Internalname ;
         wbErr = true ;
         A4554HreProTmx = (short)(0) ;
      }
      else
      {
         A4554HreProTmx = (short)(localUtil.ctol( httpContext.cgiGet( edtHreProTmx_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "HRENUMPRO_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNumPro_Internalname ;
         wbErr = true ;
         A4555HreNumPro = 0 ;
      }
      else
      {
         A4555HreNumPro = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "HRENUMREC_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNumRec_Internalname ;
         wbErr = true ;
         A4556HreNumRec = 0 ;
      }
      else
      {
         A4556HreNumRec = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumRec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreVolPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreVolPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "HREVOLPRO_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreVolPro_Internalname ;
         wbErr = true ;
         A4966HreVolPro = 0 ;
      }
      else
      {
         A4966HreVolPro = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreTieprg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreTieprg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRETIEPRG_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreTieprg_Internalname ;
         wbErr = true ;
         A5947HreTieprg = (short)(0) ;
      }
      else
      {
         A5947HreTieprg = (short)(localUtil.ctol( httpContext.cgiGet( edtHreTieprg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNroPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNroPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "HRENROPRG_" + sGXsfl_377_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNroPrg_Internalname ;
         wbErr = true ;
         A5948HreNroPrg = (short)(0) ;
      }
      else
      {
         A5948HreNroPrg = (short)(localUtil.ctol( httpContext.cgiGet( edtHreNroPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z4550HreLinPro_" + sGXsfl_377_idx ;
      Z4550HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4551HreProCod_" + sGXsfl_377_idx ;
      Z4551HreProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4552HreProDsc_" + sGXsfl_377_idx ;
      Z4552HreProDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4553HreProTie_" + sGXsfl_377_idx ;
      Z4553HreProTie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4554HreProTmx_" + sGXsfl_377_idx ;
      Z4554HreProTmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4555HreNumPro_" + sGXsfl_377_idx ;
      Z4555HreNumPro = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4556HreNumRec_" + sGXsfl_377_idx ;
      Z4556HreNumRec = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4966HreVolPro_" + sGXsfl_377_idx ;
      Z4966HreVolPro = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5947HreTieprg_" + sGXsfl_377_idx ;
      Z5947HreTieprg = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5948HreNroPrg_" + sGXsfl_377_idx ;
      Z5948HreNroPrg = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1874_" + sGXsfl_377_idx ;
      nRcdDeleted_1874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1874_" + sGXsfl_377_idx ;
      nRcdExists_1874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1874_" + sGXsfl_377_idx ;
      nIsMod_1874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHreLinPro_Enabled = edtHreLinPro_Enabled ;
      defedtHreLinMaq_Enabled = edtHreLinMaq_Enabled ;
   }

   public void confirmValuesNO0( )
   {
      nGXsfl_255_idx = 0 ;
      sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_255678( ) ;
      while ( nGXsfl_255_idx < nRC_GXsfl_255 )
      {
         nGXsfl_255_idx = (int)(nGXsfl_255_idx+1) ;
         sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_255678( ) ;
         httpContext.changePostValue( "Z4545HreLinMaq_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4546HreMaqCod_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4547HreVolPrd_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4548HreFacAbs_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4584HreFecPes_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4584HreFecPes_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4584HreFecPes_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4585HreMaqPes_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4549HreULinPro_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4549HreULinPro_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4549HreULinPro_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4863HreUsrCod_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4960HreFecAlt_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4960HreFecAlt_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4960HreFecAlt_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4961HreUsrMod_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4961HreUsrMod_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4961HreUsrMod_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4962HreFecMod_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4962HreFecMod_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4962HreFecMod_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4963HreFasCod_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4963HreFasCod_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4963HreFasCod_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4964HreOrdLin_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4964HreOrdLin_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4964HreOrdLin_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4965HreNroPar_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4965HreNroPar_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4965HreNroPar_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4968HreTotKgs_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4968HreTotKgs_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4968HreTotKgs_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4969HreTotMts_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4969HreTotMts_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4969HreTotMts_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z4970HreTotPrd_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z4970HreTotPrd_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4970HreTotPrd_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z5863HreProPrd_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z5863HreProPrd_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5863HreProPrd_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z5978HreNumRmt_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z5978HreNumRmt_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5978HreNumRmt_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z5979HreNumReo_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z5979HreNumReo_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5979HreNumReo_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z10102HreNumInt_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z10102HreNumInt_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10102HreNumInt_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z10103HreDti_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z10103HreDti_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10103HreDti_"+sGXsfl_255_idx) ;
         httpContext.changePostValue( "Z10104HreDtf_"+sGXsfl_255_idx, httpContext.cgiGet( "ZT_"+"Z10104HreDtf_"+sGXsfl_255_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10104HreDtf_"+sGXsfl_255_idx) ;
      }
      nGXsfl_377_idx = 0 ;
      sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
      subsflControlProps_3771874( ) ;
      while ( nGXsfl_377_idx < nRC_GXsfl_377 )
      {
         nGXsfl_377_idx = (int)(nGXsfl_377_idx+1) ;
         sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
         subsflControlProps_3771874( ) ;
         httpContext.changePostValue( "Z4550HreLinPro_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4550HreLinPro_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4550HreLinPro_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4551HreProCod_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4551HreProCod_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4551HreProCod_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4552HreProDsc_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4552HreProDsc_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4552HreProDsc_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4553HreProTie_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4553HreProTie_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4553HreProTie_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4554HreProTmx_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4554HreProTmx_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4554HreProTmx_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4555HreNumPro_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4555HreNumPro_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4555HreNumPro_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4556HreNumRec_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4556HreNumRec_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4556HreNumRec_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z4966HreVolPro_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z4966HreVolPro_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4966HreVolPro_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z5947HreTieprg_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z5947HreTieprg_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5947HreTieprg_"+sGXsfl_377_idx) ;
         httpContext.changePostValue( "Z5948HreNroPrg_"+sGXsfl_377_idx, httpContext.cgiGet( "ZT_"+"Z5948HreNroPrg_"+sGXsfl_377_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5948HreNroPrg_"+sGXsfl_377_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thisrex", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4516HreDisCli", GXutil.rtrim( Z4516HreDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4517HreBarSer", GXutil.rtrim( Z4517HreBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4518HreBarDsc", GXutil.rtrim( Z4518HreBarDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4519HreTipArt", GXutil.ltrim( localUtil.ntoc( Z4519HreTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4520HreTipArtD", GXutil.rtrim( Z4520HreTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4521HreColNom", GXutil.rtrim( Z4521HreColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4522HreColNum", GXutil.ltrim( localUtil.ntoc( Z4522HreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4523HreColNomC", GXutil.rtrim( Z4523HreColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4524HreColNumC", GXutil.ltrim( localUtil.ntoc( Z4524HreColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4525HreTipCol", GXutil.ltrim( localUtil.ntoc( Z4525HreTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4526HreTipColN", GXutil.rtrim( Z4526HreTipColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4527HreFecGen", localUtil.dtoc( Z4527HreFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4528HreFecCli", localUtil.dtoc( Z4528HreFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4529HreFecTin", localUtil.dtoc( Z4529HreFecTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4530HreFecFpr", localUtil.dtoc( Z4530HreFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4531HreBarMat", GXutil.rtrim( Z4531HreBarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4532HreBarKgm", GXutil.ltrim( localUtil.ntoc( Z4532HreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4533HreBarMtr", GXutil.ltrim( localUtil.ntoc( Z4533HreBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4534HreBarPie", GXutil.ltrim( localUtil.ntoc( Z4534HreBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4535HrePartCod", GXutil.rtrim( Z4535HrePartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4536HreBarNMtr", GXutil.rtrim( Z4536HreBarNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4537HreBarNMez", GXutil.rtrim( Z4537HreBarNMez));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4538HreNumTen", GXutil.rtrim( Z4538HreNumTen));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4539HreIntCod", GXutil.ltrim( localUtil.ntoc( Z4539HreIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4540HreIntDsc", GXutil.rtrim( Z4540HreIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4541HreNumTon", GXutil.rtrim( Z4541HreNumTon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4496HreMaqHdr", GXutil.rtrim( Z4496HreMaqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4542HreTotKgm", GXutil.ltrim( localUtil.ntoc( Z4542HreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4543HreTotMtr", GXutil.ltrim( localUtil.ntoc( Z4543HreTotMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4544HreTotPie", GXutil.ltrim( localUtil.ntoc( Z4544HreTotPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9805HreLtsSR", GXutil.ltrim( localUtil.ntoc( Z9805HreLtsSR, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9806HreLtsRs", GXutil.ltrim( localUtil.ntoc( Z9806HreLtsRs, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9807HreAcaQm", GXutil.rtrim( Z9807HreAcaQm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9808HreRacab", GXutil.rtrim( Z9808HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9809HreFecAcb", localUtil.ttoc( Z9809HreFecAcb, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9810HreAbs", GXutil.ltrim( localUtil.ntoc( Z9810HreAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10099HreLtsRc", GXutil.ltrim( localUtil.ntoc( Z10099HreLtsRc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10100HreHdrLts", GXutil.rtrim( Z10100HreHdrLts));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10101HreFabs", GXutil.ltrim( localUtil.ntoc( Z10101HreFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_255", GXutil.ltrim( localUtil.ntoc( nGXsfl_255_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
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
      return formatLink("app.thisrex", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISREX" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Hay campos DT", "") ;
   }

   public void initializeNonKeyNO675( )
   {
      A4516HreDisCli = "" ;
      n4516HreDisCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", A4516HreDisCli);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A4517HreBarSer = "" ;
      n4517HreBarSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", A4517HreBarSer);
      A4518HreBarDsc = "" ;
      n4518HreBarDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", A4518HreBarDsc);
      A4519HreTipArt = (short)(0) ;
      n4519HreTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
      A4520HreTipArtD = "" ;
      n4520HreTipArtD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", A4520HreTipArtD);
      A4521HreColNom = "" ;
      n4521HreColNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", A4521HreColNom);
      A4522HreColNum = 0 ;
      n4522HreColNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
      A4523HreColNomC = "" ;
      n4523HreColNomC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", A4523HreColNomC);
      A4524HreColNumC = 0 ;
      n4524HreColNumC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
      A4525HreTipCol = (byte)(0) ;
      n4525HreTipCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
      A4526HreTipColN = "" ;
      n4526HreTipColN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", A4526HreTipColN);
      A4527HreFecGen = GXutil.nullDate() ;
      n4527HreFecGen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
      A4528HreFecCli = GXutil.nullDate() ;
      n4528HreFecCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
      A4529HreFecTin = GXutil.nullDate() ;
      n4529HreFecTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
      A4530HreFecFpr = GXutil.nullDate() ;
      n4530HreFecFpr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
      A4531HreBarMat = "" ;
      n4531HreBarMat = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", A4531HreBarMat);
      A4532HreBarKgm = DecimalUtil.ZERO ;
      n4532HreBarKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
      A4533HreBarMtr = DecimalUtil.ZERO ;
      n4533HreBarMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
      A4534HreBarPie = 0 ;
      n4534HreBarPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
      A4535HrePartCod = "" ;
      n4535HrePartCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", A4535HrePartCod);
      A4536HreBarNMtr = "" ;
      n4536HreBarNMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", A4536HreBarNMtr);
      A4537HreBarNMez = "" ;
      n4537HreBarNMez = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", A4537HreBarNMez);
      A4538HreNumTen = "" ;
      n4538HreNumTen = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", A4538HreNumTen);
      A4539HreIntCod = (byte)(0) ;
      n4539HreIntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
      A4540HreIntDsc = "" ;
      n4540HreIntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", A4540HreIntDsc);
      A4541HreNumTon = "" ;
      n4541HreNumTon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", A4541HreNumTon);
      A4496HreMaqHdr = "" ;
      n4496HreMaqHdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
      A4542HreTotKgm = DecimalUtil.ZERO ;
      n4542HreTotKgm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
      A4543HreTotMtr = DecimalUtil.ZERO ;
      n4543HreTotMtr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
      A4544HreTotPie = 0 ;
      n4544HreTotPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
      A9805HreLtsSR = 0 ;
      n9805HreLtsSR = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9805HreLtsSR", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9805HreLtsSR), 5, 0));
      A9806HreLtsRs = 0 ;
      n9806HreLtsRs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9806HreLtsRs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9806HreLtsRs), 5, 0));
      A9807HreAcaQm = "" ;
      n9807HreAcaQm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9807HreAcaQm", A9807HreAcaQm);
      A9808HreRacab = "" ;
      n9808HreRacab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9808HreRacab", A9808HreRacab);
      A9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
      n9809HreFecAcb = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9809HreFecAcb", localUtil.ttoc( A9809HreFecAcb, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9810HreAbs = DecimalUtil.ZERO ;
      n9810HreAbs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9810HreAbs", GXutil.ltrimstr( A9810HreAbs, 6, 2));
      A10099HreLtsRc = 0 ;
      n10099HreLtsRc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10099HreLtsRc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10099HreLtsRc), 5, 0));
      A10100HreHdrLts = "" ;
      n10100HreHdrLts = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10100HreHdrLts", A10100HreHdrLts);
      A10101HreFabs = DecimalUtil.ZERO ;
      n10101HreFabs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10101HreFabs", GXutil.ltrimstr( A10101HreFabs, 6, 2));
      Z4516HreDisCli = "" ;
      Z4517HreBarSer = "" ;
      Z4518HreBarDsc = "" ;
      Z4519HreTipArt = (short)(0) ;
      Z4520HreTipArtD = "" ;
      Z4521HreColNom = "" ;
      Z4522HreColNum = 0 ;
      Z4523HreColNomC = "" ;
      Z4524HreColNumC = 0 ;
      Z4525HreTipCol = (byte)(0) ;
      Z4526HreTipColN = "" ;
      Z4527HreFecGen = GXutil.nullDate() ;
      Z4528HreFecCli = GXutil.nullDate() ;
      Z4529HreFecTin = GXutil.nullDate() ;
      Z4530HreFecFpr = GXutil.nullDate() ;
      Z4531HreBarMat = "" ;
      Z4532HreBarKgm = DecimalUtil.ZERO ;
      Z4533HreBarMtr = DecimalUtil.ZERO ;
      Z4534HreBarPie = 0 ;
      Z4535HrePartCod = "" ;
      Z4536HreBarNMtr = "" ;
      Z4537HreBarNMez = "" ;
      Z4538HreNumTen = "" ;
      Z4539HreIntCod = (byte)(0) ;
      Z4540HreIntDsc = "" ;
      Z4541HreNumTon = "" ;
      Z4496HreMaqHdr = "" ;
      Z4542HreTotKgm = DecimalUtil.ZERO ;
      Z4543HreTotMtr = DecimalUtil.ZERO ;
      Z4544HreTotPie = 0 ;
      Z9805HreLtsSR = 0 ;
      Z9806HreLtsRs = 0 ;
      Z9807HreAcaQm = "" ;
      Z9808HreRacab = "" ;
      Z9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
      Z9810HreAbs = DecimalUtil.ZERO ;
      Z10099HreLtsRc = 0 ;
      Z10100HreHdrLts = "" ;
      Z10101HreFabs = DecimalUtil.ZERO ;
      Z252CliCod = 0 ;
   }

   public void initAllNO675( )
   {
      A4492HreBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      A4493HreBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      A4494HreBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      A4495HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      initializeNonKeyNO675( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyNO678( )
   {
      A4546HreMaqCod = "" ;
      n4546HreMaqCod = false ;
      A4547HreVolPrd = 0 ;
      n4547HreVolPrd = false ;
      A4548HreFacAbs = DecimalUtil.ZERO ;
      n4548HreFacAbs = false ;
      A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      n4584HreFecPes = false ;
      A4585HreMaqPes = (byte)(0) ;
      n4585HreMaqPes = false ;
      A4549HreULinPro = (byte)(0) ;
      n4549HreULinPro = false ;
      A4863HreUsrCod = "" ;
      n4863HreUsrCod = false ;
      A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      n4960HreFecAlt = false ;
      A4961HreUsrMod = "" ;
      n4961HreUsrMod = false ;
      A4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      n4962HreFecMod = false ;
      A4963HreFasCod = "" ;
      n4963HreFasCod = false ;
      A4964HreOrdLin = (short)(0) ;
      n4964HreOrdLin = false ;
      A4965HreNroPar = 0 ;
      n4965HreNroPar = false ;
      A4968HreTotKgs = DecimalUtil.ZERO ;
      n4968HreTotKgs = false ;
      A4969HreTotMts = DecimalUtil.ZERO ;
      n4969HreTotMts = false ;
      A4970HreTotPrd = 0 ;
      n4970HreTotPrd = false ;
      A5863HreProPrd = "" ;
      n5863HreProPrd = false ;
      A5978HreNumRmt = 0 ;
      n5978HreNumRmt = false ;
      A5979HreNumReo = 0 ;
      n5979HreNumReo = false ;
      A10102HreNumInt = 0 ;
      n10102HreNumInt = false ;
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      n10103HreDti = false ;
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      n10104HreDtf = false ;
      Z4546HreMaqCod = "" ;
      Z4547HreVolPrd = 0 ;
      Z4548HreFacAbs = DecimalUtil.ZERO ;
      Z4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4585HreMaqPes = (byte)(0) ;
      Z4549HreULinPro = (byte)(0) ;
      Z4863HreUsrCod = "" ;
      Z4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      Z4961HreUsrMod = "" ;
      Z4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      Z4963HreFasCod = "" ;
      Z4964HreOrdLin = (short)(0) ;
      Z4965HreNroPar = 0 ;
      Z4968HreTotKgs = DecimalUtil.ZERO ;
      Z4969HreTotMts = DecimalUtil.ZERO ;
      Z4970HreTotPrd = 0 ;
      Z5863HreProPrd = "" ;
      Z5978HreNumRmt = 0 ;
      Z5979HreNumReo = 0 ;
      Z10102HreNumInt = 0 ;
      Z10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      Z10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAllNO678( )
   {
      A4545HreLinMaq = (short)(0) ;
      initializeNonKeyNO678( ) ;
   }

   public void standaloneModalInsertNO678( )
   {
   }

   public void initializeNonKeyNO1874( )
   {
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      A4553HreProTie = (short)(0) ;
      A4554HreProTmx = (short)(0) ;
      A4555HreNumPro = 0 ;
      A4556HreNumRec = 0 ;
      A4966HreVolPro = 0 ;
      A5947HreTieprg = (short)(0) ;
      A5948HreNroPrg = (short)(0) ;
      Z4551HreProCod = "" ;
      Z4552HreProDsc = "" ;
      Z4553HreProTie = (short)(0) ;
      Z4554HreProTmx = (short)(0) ;
      Z4555HreNumPro = 0 ;
      Z4556HreNumRec = 0 ;
      Z4966HreVolPro = 0 ;
      Z5947HreTieprg = (short)(0) ;
      Z5948HreNroPrg = (short)(0) ;
   }

   public void initAllNO1874( )
   {
      A4550HreLinPro = (byte)(0) ;
      initializeNonKeyNO1874( ) ;
   }

   public void standaloneModalInsertNO1874( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241523975", true, true);
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
      httpContext.AddJavascriptSource("thisrex.js", "?20268241523975", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties678( )
   {
      edtHreLinMaq_Enabled = defedtHreLinMaq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_255_Refreshing);
   }

   public void init_level_properties1874( )
   {
      edtHreLinPro_Enabled = defedtHreLinPro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_377_Refreshing);
   }

   public void startgridcontrol255( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock48_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock35_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4546HreMaqCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock50_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock51_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock52_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock53_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock54_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock55_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4863HreUsrCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock56_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A4960HreFecAlt, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecAlt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock57_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4961HreUsrMod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrMod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock58_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A4962HreFecMod, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecMod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock59_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4963HreFasCod));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock60_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4964HreOrdLin, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreOrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock61_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4965HreNroPar, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock62_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4968HreTotKgs, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotKgs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock63_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4969HreTotMts, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotMts_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock64_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4970HreTotPrd, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTotPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock65_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A5863HreProPrd));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock66_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5978HreNumRmt, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock67_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5979HreNumReo, (byte)(6), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock68_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10102HreNumInt, (byte)(8), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock69_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10103HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDti_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock70_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", localUtil.ttoc( A10104HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreDtf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol377( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A4551HreProCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A4552HreProDsc));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4553HreProTie, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4554HreProTmx, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4555HreNumPro, (byte)(5), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4556HreNumRec, (byte)(5), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4966HreVolPro, (byte)(5), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5947HreTieprg, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreTieprg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5948HreNroPrg, (byte)(3), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNroPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHreDisCli_Internalname = "HREDISCLI" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHreBarSer_Internalname = "HREBARSER" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtHreBarDsc_Internalname = "HREBARDSC" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtHreTipArt_Internalname = "HRETIPART" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtHreTipArtD_Internalname = "HRETIPARTD" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtHreColNom_Internalname = "HRECOLNOM" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtHreColNum_Internalname = "HRECOLNUM" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtHreColNomC_Internalname = "HRECOLNOMC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtHreColNumC_Internalname = "HRECOLNUMC" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtHreTipCol_Internalname = "HRETIPCOL" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtHreTipColN_Internalname = "HRETIPCOLN" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtHreFecGen_Internalname = "HREFECGEN" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtHreFecCli_Internalname = "HREFECCLI" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtHreFecTin_Internalname = "HREFECTIN" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtHreFecFpr_Internalname = "HREFECFPR" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtHreBarMat_Internalname = "HREBARMAT" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtHreBarKgm_Internalname = "HREBARKGM" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtHreBarMtr_Internalname = "HREBARMTR" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtHreBarPie_Internalname = "HREBARPIE" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtHrePartCod_Internalname = "HREPARTCOD" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtHreBarNMtr_Internalname = "HREBARNMTR" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtHreBarNMez_Internalname = "HREBARNMEZ" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtHreNumTen_Internalname = "HRENUMTEN" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtHreIntCod_Internalname = "HREINTCOD" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtHreIntDsc_Internalname = "HREINTDSC" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtHreNumTon_Internalname = "HRENUMTON" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtHreMaqHdr_Internalname = "HREMAQHDR" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtHreTotKgm_Internalname = "HRETOTKGM" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtHreTotMtr_Internalname = "HRETOTMTR" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtHreTotPie_Internalname = "HRETOTPIE" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtHreLtsSR_Internalname = "HRELTSSR" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtHreLtsRs_Internalname = "HRELTSRS" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtHreAcaQm_Internalname = "HREACAQM" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtHreRacab_Internalname = "HRERACAB" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtHreFecAcb_Internalname = "HREFECACB" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtHreAbs_Internalname = "HREABS" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtHreLtsRc_Internalname = "HRELTSRC" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtHreHdrLts_Internalname = "HREHDRLTS" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtHreFabs_Internalname = "HREFABS" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtHreLinMaq_Internalname = "HRELINMAQ" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtHreMaqCod_Internalname = "HREMAQCOD" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtHreVolPrd_Internalname = "HREVOLPRD" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtHreFacAbs_Internalname = "HREFACABS" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtHreFecPes_Internalname = "HREFECPES" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtHreMaqPes_Internalname = "HREMAQPES" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtHreULinPro_Internalname = "HREULINPRO" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtHreUsrCod_Internalname = "HREUSRCOD" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtHreFecAlt_Internalname = "HREFECALT" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtHreUsrMod_Internalname = "HREUSRMOD" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtHreFecMod_Internalname = "HREFECMOD" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtHreFasCod_Internalname = "HREFASCOD" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtHreOrdLin_Internalname = "HREORDLIN" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtHreNroPar_Internalname = "HRENROPAR" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtHreTotKgs_Internalname = "HRETOTKGS" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtHreTotMts_Internalname = "HRETOTMTS" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtHreTotPrd_Internalname = "HRETOTPRD" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtHreProPrd_Internalname = "HREPROPRD" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtHreNumRmt_Internalname = "HRENUMRMT" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtHreNumReo_Internalname = "HRENUMREO" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtHreNumInt_Internalname = "HRENUMINT" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtHreDti_Internalname = "HREDTI" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtHreDtf_Internalname = "HREDTF" ;
      edtavnRcdDeleted_1874_Internalname = "vNRCDDELETED_1874" ;
      edtHreLinPro_Internalname = "HRELINPRO" ;
      edtHreProCod_Internalname = "HREPROCOD" ;
      edtHreProDsc_Internalname = "HREPRODSC" ;
      edtHreProTie_Internalname = "HREPROTIE" ;
      edtHreProTmx_Internalname = "HREPROTMX" ;
      edtHreNumPro_Internalname = "HRENUMPRO" ;
      edtHreNumRec_Internalname = "HRENUMREC" ;
      edtHreVolPro_Internalname = "HREVOLPRO" ;
      edtHreTieprg_Internalname = "HRETIEPRG" ;
      edtHreNroPrg_Internalname = "HRENROPRG" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock70_Caption = httpContext.getMessage( "Fin Tinte", "") ;
      lblTextblock69_Caption = httpContext.getMessage( "Fecha Inicio Tin", "") ;
      lblTextblock68_Caption = httpContext.getMessage( "N Interno Receta", "") ;
      lblTextblock67_Caption = httpContext.getMessage( "Nº de reoperados", "") ;
      lblTextblock66_Caption = httpContext.getMessage( "Nº de Remontadas", "") ;
      lblTextblock65_Caption = httpContext.getMessage( "Proceso Produccion", "") ;
      lblTextblock64_Caption = httpContext.getMessage( "Total Piezas,Lav", "") ;
      lblTextblock63_Caption = httpContext.getMessage( "Total Mts, Lav?", "") ;
      lblTextblock62_Caption = httpContext.getMessage( "Total Kgs, Lav", "") ;
      lblTextblock61_Caption = httpContext.getMessage( "Nº Partida, Lavanderias", "") ;
      lblTextblock60_Caption = httpContext.getMessage( "Orden Fase", "") ;
      lblTextblock59_Caption = httpContext.getMessage( "Fase, Lavanderias", "") ;
      lblTextblock58_Caption = httpContext.getMessage( "HreFecMod", "") ;
      lblTextblock57_Caption = httpContext.getMessage( "Usuario Modifico Receta", "") ;
      lblTextblock56_Caption = httpContext.getMessage( "Fecha Alta Receta", "") ;
      lblTextblock55_Caption = httpContext.getMessage( "Usuario creo receta", "") ;
      lblTextblock54_Caption = httpContext.getMessage( "Ul.Lin.Proceso Rec.Hist.Receta", "") ;
      lblTextblock53_Caption = httpContext.getMessage( "Maquina Pesada", "") ;
      lblTextblock52_Caption = httpContext.getMessage( "Fecha Hora Pesaje", "") ;
      lblTextblock51_Caption = httpContext.getMessage( "Factor Abs.Hist.Receta", "") ;
      lblTextblock50_Caption = httpContext.getMessage( "Volumen Maq. Hist.Receta", "") ;
      lblTextblock35_Caption = httpContext.getMessage( "Maquina Hdr. Hist.Receta", "") ;
      lblTextblock48_Caption = httpContext.getMessage( "Linea Maquina. Hist.Receta", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Hay campos DT", "") );
      edtHreNroPrg_Jsonclick = "" ;
      edtHreTieprg_Jsonclick = "" ;
      edtHreVolPro_Jsonclick = "" ;
      edtHreNumRec_Jsonclick = "" ;
      edtHreNumPro_Jsonclick = "" ;
      edtHreProTmx_Jsonclick = "" ;
      edtHreProTie_Jsonclick = "" ;
      edtHreProDsc_Jsonclick = "" ;
      edtHreProCod_Jsonclick = "" ;
      edtHreLinPro_Jsonclick = "" ;
      edtavnRcdDeleted_1874_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtHreDtf_Jsonclick = "" ;
      edtHreDti_Jsonclick = "" ;
      edtHreNumInt_Jsonclick = "" ;
      edtHreNumReo_Jsonclick = "" ;
      edtHreNumRmt_Jsonclick = "" ;
      edtHreProPrd_Jsonclick = "" ;
      edtHreTotPrd_Jsonclick = "" ;
      edtHreTotMts_Jsonclick = "" ;
      edtHreTotKgs_Jsonclick = "" ;
      edtHreNroPar_Jsonclick = "" ;
      edtHreOrdLin_Jsonclick = "" ;
      edtHreFasCod_Jsonclick = "" ;
      edtHreFecMod_Jsonclick = "" ;
      edtHreUsrMod_Jsonclick = "" ;
      edtHreFecAlt_Jsonclick = "" ;
      edtHreUsrCod_Jsonclick = "" ;
      edtHreULinPro_Jsonclick = "" ;
      edtHreMaqPes_Jsonclick = "" ;
      edtHreFecPes_Jsonclick = "" ;
      edtHreFacAbs_Jsonclick = "" ;
      edtHreVolPrd_Jsonclick = "" ;
      edtHreMaqCod_Jsonclick = "" ;
      edtHreLinMaq_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtHreNroPrg_Enabled = 1 ;
      edtHreTieprg_Enabled = 1 ;
      edtHreVolPro_Enabled = 1 ;
      edtHreNumRec_Enabled = 1 ;
      edtHreNumPro_Enabled = 1 ;
      edtHreProTmx_Enabled = 1 ;
      edtHreProTie_Enabled = 1 ;
      edtHreProDsc_Enabled = 1 ;
      edtHreProCod_Enabled = 1 ;
      edtHreLinPro_Enabled = 1 ;
      edtavnRcdDeleted_1874_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHreDtf_Enabled = 1 ;
      edtHreDti_Enabled = 1 ;
      edtHreNumInt_Enabled = 1 ;
      edtHreNumReo_Enabled = 1 ;
      edtHreNumRmt_Enabled = 1 ;
      edtHreProPrd_Enabled = 1 ;
      edtHreTotPrd_Enabled = 1 ;
      edtHreTotMts_Enabled = 1 ;
      edtHreTotKgs_Enabled = 1 ;
      edtHreNroPar_Enabled = 1 ;
      edtHreOrdLin_Enabled = 1 ;
      edtHreFasCod_Enabled = 1 ;
      edtHreFecMod_Enabled = 1 ;
      edtHreUsrMod_Enabled = 1 ;
      edtHreFecAlt_Enabled = 1 ;
      edtHreUsrCod_Enabled = 1 ;
      edtHreULinPro_Enabled = 1 ;
      edtHreMaqPes_Enabled = 1 ;
      edtHreFecPes_Enabled = 1 ;
      edtHreFacAbs_Enabled = 1 ;
      edtHreVolPrd_Enabled = 1 ;
      edtHreMaqCod_Enabled = 1 ;
      edtHreLinMaq_Enabled = 1 ;
      edtHreFabs_Jsonclick = "" ;
      edtHreFabs_Backcolor = (int)(0xFFFFFF) ;
      edtHreFabs_Enabled = 1 ;
      edtHreHdrLts_Jsonclick = "" ;
      edtHreHdrLts_Backcolor = (int)(0xFFFFFF) ;
      edtHreHdrLts_Enabled = 1 ;
      edtHreLtsRc_Jsonclick = "" ;
      edtHreLtsRc_Backcolor = (int)(0xFFFFFF) ;
      edtHreLtsRc_Enabled = 1 ;
      edtHreAbs_Jsonclick = "" ;
      edtHreAbs_Backcolor = (int)(0xFFFFFF) ;
      edtHreAbs_Enabled = 1 ;
      edtHreFecAcb_Jsonclick = "" ;
      edtHreFecAcb_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecAcb_Enabled = 1 ;
      edtHreRacab_Jsonclick = "" ;
      edtHreRacab_Backcolor = (int)(0xFFFFFF) ;
      edtHreRacab_Enabled = 1 ;
      edtHreAcaQm_Jsonclick = "" ;
      edtHreAcaQm_Backcolor = (int)(0xFFFFFF) ;
      edtHreAcaQm_Enabled = 1 ;
      edtHreLtsRs_Jsonclick = "" ;
      edtHreLtsRs_Backcolor = (int)(0xFFFFFF) ;
      edtHreLtsRs_Enabled = 1 ;
      edtHreLtsSR_Jsonclick = "" ;
      edtHreLtsSR_Backcolor = (int)(0xFFFFFF) ;
      edtHreLtsSR_Enabled = 1 ;
      edtHreTotPie_Jsonclick = "" ;
      edtHreTotPie_Backcolor = (int)(0xFFFFFF) ;
      edtHreTotPie_Enabled = 1 ;
      edtHreTotMtr_Jsonclick = "" ;
      edtHreTotMtr_Backcolor = (int)(0xFFFFFF) ;
      edtHreTotMtr_Enabled = 1 ;
      edtHreTotKgm_Jsonclick = "" ;
      edtHreTotKgm_Backcolor = (int)(0xFFFFFF) ;
      edtHreTotKgm_Enabled = 1 ;
      edtHreMaqHdr_Jsonclick = "" ;
      edtHreMaqHdr_Backcolor = (int)(0xFFFFFF) ;
      edtHreMaqHdr_Enabled = 1 ;
      edtHreNumTon_Jsonclick = "" ;
      edtHreNumTon_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumTon_Enabled = 1 ;
      edtHreIntDsc_Jsonclick = "" ;
      edtHreIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHreIntDsc_Enabled = 1 ;
      edtHreIntCod_Jsonclick = "" ;
      edtHreIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtHreIntCod_Enabled = 1 ;
      edtHreNumTen_Jsonclick = "" ;
      edtHreNumTen_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumTen_Enabled = 1 ;
      edtHreBarNMez_Jsonclick = "" ;
      edtHreBarNMez_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarNMez_Enabled = 1 ;
      edtHreBarNMtr_Jsonclick = "" ;
      edtHreBarNMtr_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarNMtr_Enabled = 1 ;
      edtHrePartCod_Jsonclick = "" ;
      edtHrePartCod_Backcolor = (int)(0xFFFFFF) ;
      edtHrePartCod_Enabled = 1 ;
      edtHreBarPie_Jsonclick = "" ;
      edtHreBarPie_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarPie_Enabled = 1 ;
      edtHreBarMtr_Jsonclick = "" ;
      edtHreBarMtr_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarMtr_Enabled = 1 ;
      edtHreBarKgm_Jsonclick = "" ;
      edtHreBarKgm_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarKgm_Enabled = 1 ;
      edtHreBarMat_Jsonclick = "" ;
      edtHreBarMat_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarMat_Enabled = 1 ;
      edtHreFecFpr_Jsonclick = "" ;
      edtHreFecFpr_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecFpr_Enabled = 1 ;
      edtHreFecTin_Jsonclick = "" ;
      edtHreFecTin_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecTin_Enabled = 1 ;
      edtHreFecCli_Jsonclick = "" ;
      edtHreFecCli_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecCli_Enabled = 1 ;
      edtHreFecGen_Jsonclick = "" ;
      edtHreFecGen_Backcolor = (int)(0xFFFFFF) ;
      edtHreFecGen_Enabled = 1 ;
      edtHreTipColN_Jsonclick = "" ;
      edtHreTipColN_Backcolor = (int)(0xFFFFFF) ;
      edtHreTipColN_Enabled = 1 ;
      edtHreTipCol_Jsonclick = "" ;
      edtHreTipCol_Backcolor = (int)(0xFFFFFF) ;
      edtHreTipCol_Enabled = 1 ;
      edtHreColNumC_Jsonclick = "" ;
      edtHreColNumC_Backcolor = (int)(0xFFFFFF) ;
      edtHreColNumC_Enabled = 1 ;
      edtHreColNomC_Jsonclick = "" ;
      edtHreColNomC_Backcolor = (int)(0xFFFFFF) ;
      edtHreColNomC_Enabled = 1 ;
      edtHreColNum_Jsonclick = "" ;
      edtHreColNum_Backcolor = (int)(0xFFFFFF) ;
      edtHreColNum_Enabled = 1 ;
      edtHreColNom_Jsonclick = "" ;
      edtHreColNom_Backcolor = (int)(0xFFFFFF) ;
      edtHreColNom_Enabled = 1 ;
      edtHreTipArtD_Jsonclick = "" ;
      edtHreTipArtD_Backcolor = (int)(0xFFFFFF) ;
      edtHreTipArtD_Enabled = 1 ;
      edtHreTipArt_Jsonclick = "" ;
      edtHreTipArt_Backcolor = (int)(0xFFFFFF) ;
      edtHreTipArt_Enabled = 1 ;
      edtHreBarDsc_Jsonclick = "" ;
      edtHreBarDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarDsc_Enabled = 1 ;
      edtHreBarSer_Jsonclick = "" ;
      edtHreBarSer_Backcolor = (int)(0xFFFFFF) ;
      edtHreBarSer_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
      edtHreDisCli_Jsonclick = "" ;
      edtHreDisCli_Backcolor = (int)(0xFFFFFF) ;
      edtHreDisCli_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
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
      subsflControlProps_255678( ) ;
      while ( nGXsfl_255_idx <= nRC_GXsfl_255 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalNO678( ) ;
         standaloneModalNO678( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowNO678( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_255_idx = (int)(nGXsfl_255_idx+1) ;
         sGXsfl_255_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_255_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_255678( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_3771874( ) ;
      while ( nGXsfl_377_idx <= nRC_GXsfl_377 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalNO678( ) ;
         standaloneModalNO678( ) ;
         standaloneNotModalNO1874( ) ;
         standaloneModalNO1874( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowNO1874( ) ;
         nGXsfl_377_idx = (int)(nGXsfl_377_idx+1) ;
         sGXsfl_377_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_377_idx), 4, 0), (short)(4), "0") + sGXsfl_255_idx ;
         subsflControlProps_3771874( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
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
      /* Using cursor T00NO42 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(40) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00NO42_A407EmprNom[0] ;
      n407EmprNom = T00NO42_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(40);
      GX_FocusControl = edtHreDisCli_Internalname ;
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

   public void valid_Hrenumcie( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", GXutil.rtrim( A4516HreDisCli));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", GXutil.rtrim( A4517HreBarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", GXutil.rtrim( A4518HreBarDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrim( localUtil.ntoc( A4519HreTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", GXutil.rtrim( A4520HreTipArtD));
      httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", GXutil.rtrim( A4521HreColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrim( localUtil.ntoc( A4522HreColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", GXutil.rtrim( A4523HreColNomC));
      httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrim( localUtil.ntoc( A4524HreColNumC, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrim( localUtil.ntoc( A4525HreTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", GXutil.rtrim( A4526HreTipColN));
      httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", GXutil.rtrim( A4531HreBarMat));
      httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrim( localUtil.ntoc( A4532HreBarKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrim( localUtil.ntoc( A4533HreBarMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrim( localUtil.ntoc( A4534HreBarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", GXutil.rtrim( A4535HrePartCod));
      httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", GXutil.rtrim( A4536HreBarNMtr));
      httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", GXutil.rtrim( A4537HreBarNMez));
      httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", GXutil.rtrim( A4538HreNumTen));
      httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrim( localUtil.ntoc( A4539HreIntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", GXutil.rtrim( A4540HreIntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", GXutil.rtrim( A4541HreNumTon));
      httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", GXutil.rtrim( A4496HreMaqHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrim( localUtil.ntoc( A4542HreTotKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrim( localUtil.ntoc( A4543HreTotMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrim( localUtil.ntoc( A4544HreTotPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9805HreLtsSR", GXutil.ltrim( localUtil.ntoc( A9805HreLtsSR, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9806HreLtsRs", GXutil.ltrim( localUtil.ntoc( A9806HreLtsRs, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9807HreAcaQm", GXutil.rtrim( A9807HreAcaQm));
      httpContext.ajax_rsp_assign_attri("", false, "A9808HreRacab", GXutil.rtrim( A9808HreRacab));
      httpContext.ajax_rsp_assign_attri("", false, "A9809HreFecAcb", localUtil.ttoc( A9809HreFecAcb, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A9810HreAbs", GXutil.ltrim( localUtil.ntoc( A9810HreAbs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10099HreLtsRc", GXutil.ltrim( localUtil.ntoc( A10099HreLtsRc, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10100HreHdrLts", GXutil.rtrim( A10100HreHdrLts));
      httpContext.ajax_rsp_assign_attri("", false, "A10101HreFabs", GXutil.ltrim( localUtil.ntoc( A10101HreFabs, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", GXutil.rtrim( AV17UsurCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4516HreDisCli", GXutil.rtrim( Z4516HreDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4517HreBarSer", GXutil.rtrim( Z4517HreBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4518HreBarDsc", GXutil.rtrim( Z4518HreBarDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4519HreTipArt", GXutil.ltrim( localUtil.ntoc( Z4519HreTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4520HreTipArtD", GXutil.rtrim( Z4520HreTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4521HreColNom", GXutil.rtrim( Z4521HreColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4522HreColNum", GXutil.ltrim( localUtil.ntoc( Z4522HreColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4523HreColNomC", GXutil.rtrim( Z4523HreColNomC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4524HreColNumC", GXutil.ltrim( localUtil.ntoc( Z4524HreColNumC, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4525HreTipCol", GXutil.ltrim( localUtil.ntoc( Z4525HreTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4526HreTipColN", GXutil.rtrim( Z4526HreTipColN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4527HreFecGen", localUtil.format(Z4527HreFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4528HreFecCli", localUtil.format(Z4528HreFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4529HreFecTin", localUtil.format(Z4529HreFecTin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4530HreFecFpr", localUtil.format(Z4530HreFecFpr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4531HreBarMat", GXutil.rtrim( Z4531HreBarMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4532HreBarKgm", GXutil.ltrim( localUtil.ntoc( Z4532HreBarKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4533HreBarMtr", GXutil.ltrim( localUtil.ntoc( Z4533HreBarMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4534HreBarPie", GXutil.ltrim( localUtil.ntoc( Z4534HreBarPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4535HrePartCod", GXutil.rtrim( Z4535HrePartCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4536HreBarNMtr", GXutil.rtrim( Z4536HreBarNMtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4537HreBarNMez", GXutil.rtrim( Z4537HreBarNMez));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4538HreNumTen", GXutil.rtrim( Z4538HreNumTen));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4539HreIntCod", GXutil.ltrim( localUtil.ntoc( Z4539HreIntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4540HreIntDsc", GXutil.rtrim( Z4540HreIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4541HreNumTon", GXutil.rtrim( Z4541HreNumTon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4496HreMaqHdr", GXutil.rtrim( Z4496HreMaqHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4542HreTotKgm", GXutil.ltrim( localUtil.ntoc( Z4542HreTotKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4543HreTotMtr", GXutil.ltrim( localUtil.ntoc( Z4543HreTotMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4544HreTotPie", GXutil.ltrim( localUtil.ntoc( Z4544HreTotPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9805HreLtsSR", GXutil.ltrim( localUtil.ntoc( Z9805HreLtsSR, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9806HreLtsRs", GXutil.ltrim( localUtil.ntoc( Z9806HreLtsRs, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9807HreAcaQm", GXutil.rtrim( Z9807HreAcaQm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9808HreRacab", GXutil.rtrim( Z9808HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9809HreFecAcb", localUtil.ttoc( Z9809HreFecAcb, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9810HreAbs", GXutil.ltrim( localUtil.ntoc( Z9810HreAbs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10099HreLtsRc", GXutil.ltrim( localUtil.ntoc( Z10099HreLtsRc, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10100HreHdrLts", GXutil.rtrim( Z10100HreHdrLts));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10101HreFabs", GXutil.ltrim( localUtil.ntoc( Z10101HreFabs, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV17UsurCod", GXutil.rtrim( ZV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T00NO18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T00NO18_A279CliNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Hrefabs( )
   {
      n4516HreDisCli = false ;
      n252CliCod = false ;
      n4517HreBarSer = false ;
      n4518HreBarDsc = false ;
      n4519HreTipArt = false ;
      n4520HreTipArtD = false ;
      n4521HreColNom = false ;
      n4522HreColNum = false ;
      n4523HreColNomC = false ;
      n4524HreColNumC = false ;
      n4525HreTipCol = false ;
      n4526HreTipColN = false ;
      n4527HreFecGen = false ;
      n4528HreFecCli = false ;
      n4529HreFecTin = false ;
      n4530HreFecFpr = false ;
      n4531HreBarMat = false ;
      n4532HreBarKgm = false ;
      n4533HreBarMtr = false ;
      n4534HreBarPie = false ;
      n4535HrePartCod = false ;
      n4536HreBarNMtr = false ;
      n4537HreBarNMez = false ;
      n4538HreNumTen = false ;
      n4539HreIntCod = false ;
      n4540HreIntDsc = false ;
      n4541HreNumTon = false ;
      n4496HreMaqHdr = false ;
      n4542HreTotKgm = false ;
      n4543HreTotMtr = false ;
      n4544HreTotPie = false ;
      n9805HreLtsSR = false ;
      n9806HreLtsRs = false ;
      n9807HreAcaQm = false ;
      n9808HreRacab = false ;
      n9809HreFecAcb = false ;
      n9810HreAbs = false ;
      n10099HreLtsRc = false ;
      n10100HreHdrLts = false ;
      n10101HreFabs = false ;
      if ( (IsModified == 1) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se permite modificar", ""), 1, "HREFABS");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreFabs_Internalname ;
      }
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
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4523HreColNomC',fld:'HRECOLNOMC',pic:''},{av:'A4524HreColNumC',fld:'HRECOLNUMC',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4527HreFecGen',fld:'HREFECGEN',pic:''},{av:'A4528HreFecCli',fld:'HREFECCLI',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4530HreFecFpr',fld:'HREFECFPR',pic:''},{av:'A4531HreBarMat',fld:'HREBARMAT',pic:''},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4533HreBarMtr',fld:'HREBARMTR',pic:'ZZZZZ9.99'},{av:'A4534HreBarPie',fld:'HREBARPIE',pic:'ZZZ9'},{av:'A4535HrePartCod',fld:'HREPARTCOD',pic:''},{av:'A4536HreBarNMtr',fld:'HREBARNMTR',pic:''},{av:'A4537HreBarNMez',fld:'HREBARNMEZ',pic:''},{av:'A4538HreNumTen',fld:'HRENUMTEN',pic:''},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A4541HreNumTon',fld:'HRENUMTON',pic:''},{av:'A4496HreMaqHdr',fld:'HREMAQHDR',pic:''},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A4543HreTotMtr',fld:'HRETOTMTR',pic:'ZZZZZ9.99'},{av:'A4544HreTotPie',fld:'HRETOTPIE',pic:'ZZZ9'},{av:'A9805HreLtsSR',fld:'HRELTSSR',pic:'ZZZZ9'},{av:'A9806HreLtsRs',fld:'HRELTSRS',pic:'ZZZZ9'},{av:'A9807HreAcaQm',fld:'HREACAQM',pic:''},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A9809HreFecAcb',fld:'HREFECACB',pic:'99/99/99 99:99:99'},{av:'A9810HreAbs',fld:'HREABS',pic:'ZZ9.99'},{av:'A10099HreLtsRc',fld:'HRELTSRC',pic:'ZZZZ9'},{av:'A10100HreHdrLts',fld:'HREHDRLTS',pic:''},{av:'A10101HreFabs',fld:'HREFABS',pic:'ZZ9.99'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z407EmprNom'},{av:'Z4516HreDisCli'},{av:'Z252CliCod'},{av:'Z4517HreBarSer'},{av:'Z4518HreBarDsc'},{av:'Z4519HreTipArt'},{av:'Z4520HreTipArtD'},{av:'Z4521HreColNom'},{av:'Z4522HreColNum'},{av:'Z4523HreColNomC'},{av:'Z4524HreColNumC'},{av:'Z4525HreTipCol'},{av:'Z4526HreTipColN'},{av:'Z4527HreFecGen'},{av:'Z4528HreFecCli'},{av:'Z4529HreFecTin'},{av:'Z4530HreFecFpr'},{av:'Z4531HreBarMat'},{av:'Z4532HreBarKgm'},{av:'Z4533HreBarMtr'},{av:'Z4534HreBarPie'},{av:'Z4535HrePartCod'},{av:'Z4536HreBarNMtr'},{av:'Z4537HreBarNMez'},{av:'Z4538HreNumTen'},{av:'Z4539HreIntCod'},{av:'Z4540HreIntDsc'},{av:'Z4541HreNumTon'},{av:'Z4496HreMaqHdr'},{av:'Z4542HreTotKgm'},{av:'Z4543HreTotMtr'},{av:'Z4544HreTotPie'},{av:'Z9805HreLtsSR'},{av:'Z9806HreLtsRs'},{av:'Z9807HreAcaQm'},{av:'Z9808HreRacab'},{av:'Z9809HreFecAcb'},{av:'Z9810HreAbs'},{av:'Z10099HreLtsRc'},{av:'Z10100HreHdrLts'},{av:'Z10101HreFabs'},{av:'ZV17UsurCod'},{av:'Z279CliNom'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HREDISCLI","{handler:'valid_Hrediscli',iparms:[]");
      setEventMetadata("VALID_HREDISCLI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_HREBARSER","{handler:'valid_Hrebarser',iparms:[]");
      setEventMetadata("VALID_HREBARSER",",oparms:[]}");
      setEventMetadata("VALID_HREBARDSC","{handler:'valid_Hrebardsc',iparms:[]");
      setEventMetadata("VALID_HREBARDSC",",oparms:[]}");
      setEventMetadata("VALID_HRETIPART","{handler:'valid_Hretipart',iparms:[]");
      setEventMetadata("VALID_HRETIPART",",oparms:[]}");
      setEventMetadata("VALID_HRETIPARTD","{handler:'valid_Hretipartd',iparms:[]");
      setEventMetadata("VALID_HRETIPARTD",",oparms:[]}");
      setEventMetadata("VALID_HRECOLNOM","{handler:'valid_Hrecolnom',iparms:[]");
      setEventMetadata("VALID_HRECOLNOM",",oparms:[]}");
      setEventMetadata("VALID_HRECOLNUM","{handler:'valid_Hrecolnum',iparms:[]");
      setEventMetadata("VALID_HRECOLNUM",",oparms:[]}");
      setEventMetadata("VALID_HRECOLNOMC","{handler:'valid_Hrecolnomc',iparms:[]");
      setEventMetadata("VALID_HRECOLNOMC",",oparms:[]}");
      setEventMetadata("VALID_HRECOLNUMC","{handler:'valid_Hrecolnumc',iparms:[]");
      setEventMetadata("VALID_HRECOLNUMC",",oparms:[]}");
      setEventMetadata("VALID_HRETIPCOL","{handler:'valid_Hretipcol',iparms:[]");
      setEventMetadata("VALID_HRETIPCOL",",oparms:[]}");
      setEventMetadata("VALID_HRETIPCOLN","{handler:'valid_Hretipcoln',iparms:[]");
      setEventMetadata("VALID_HRETIPCOLN",",oparms:[]}");
      setEventMetadata("VALID_HREFECGEN","{handler:'valid_Hrefecgen',iparms:[]");
      setEventMetadata("VALID_HREFECGEN",",oparms:[]}");
      setEventMetadata("VALID_HREFECCLI","{handler:'valid_Hrefeccli',iparms:[]");
      setEventMetadata("VALID_HREFECCLI",",oparms:[]}");
      setEventMetadata("VALID_HREFECTIN","{handler:'valid_Hrefectin',iparms:[]");
      setEventMetadata("VALID_HREFECTIN",",oparms:[]}");
      setEventMetadata("VALID_HREFECFPR","{handler:'valid_Hrefecfpr',iparms:[]");
      setEventMetadata("VALID_HREFECFPR",",oparms:[]}");
      setEventMetadata("VALID_HREBARMAT","{handler:'valid_Hrebarmat',iparms:[]");
      setEventMetadata("VALID_HREBARMAT",",oparms:[]}");
      setEventMetadata("VALID_HREBARKGM","{handler:'valid_Hrebarkgm',iparms:[]");
      setEventMetadata("VALID_HREBARKGM",",oparms:[]}");
      setEventMetadata("VALID_HREBARMTR","{handler:'valid_Hrebarmtr',iparms:[]");
      setEventMetadata("VALID_HREBARMTR",",oparms:[]}");
      setEventMetadata("VALID_HREBARPIE","{handler:'valid_Hrebarpie',iparms:[]");
      setEventMetadata("VALID_HREBARPIE",",oparms:[]}");
      setEventMetadata("VALID_HREPARTCOD","{handler:'valid_Hrepartcod',iparms:[]");
      setEventMetadata("VALID_HREPARTCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARNMTR","{handler:'valid_Hrebarnmtr',iparms:[]");
      setEventMetadata("VALID_HREBARNMTR",",oparms:[]}");
      setEventMetadata("VALID_HREBARNMEZ","{handler:'valid_Hrebarnmez',iparms:[]");
      setEventMetadata("VALID_HREBARNMEZ",",oparms:[]}");
      setEventMetadata("VALID_HRENUMTEN","{handler:'valid_Hrenumten',iparms:[]");
      setEventMetadata("VALID_HRENUMTEN",",oparms:[]}");
      setEventMetadata("VALID_HREINTCOD","{handler:'valid_Hreintcod',iparms:[]");
      setEventMetadata("VALID_HREINTCOD",",oparms:[]}");
      setEventMetadata("VALID_HREINTDSC","{handler:'valid_Hreintdsc',iparms:[]");
      setEventMetadata("VALID_HREINTDSC",",oparms:[]}");
      setEventMetadata("VALID_HRENUMTON","{handler:'valid_Hrenumton',iparms:[]");
      setEventMetadata("VALID_HRENUMTON",",oparms:[]}");
      setEventMetadata("VALID_HREMAQHDR","{handler:'valid_Hremaqhdr',iparms:[]");
      setEventMetadata("VALID_HREMAQHDR",",oparms:[]}");
      setEventMetadata("VALID_HRETOTKGM","{handler:'valid_Hretotkgm',iparms:[]");
      setEventMetadata("VALID_HRETOTKGM",",oparms:[]}");
      setEventMetadata("VALID_HRETOTMTR","{handler:'valid_Hretotmtr',iparms:[]");
      setEventMetadata("VALID_HRETOTMTR",",oparms:[]}");
      setEventMetadata("VALID_HRETOTPIE","{handler:'valid_Hretotpie',iparms:[]");
      setEventMetadata("VALID_HRETOTPIE",",oparms:[]}");
      setEventMetadata("VALID_HRELTSSR","{handler:'valid_Hreltssr',iparms:[]");
      setEventMetadata("VALID_HRELTSSR",",oparms:[]}");
      setEventMetadata("VALID_HRELTSRS","{handler:'valid_Hreltsrs',iparms:[]");
      setEventMetadata("VALID_HRELTSRS",",oparms:[]}");
      setEventMetadata("VALID_HREACAQM","{handler:'valid_Hreacaqm',iparms:[]");
      setEventMetadata("VALID_HREACAQM",",oparms:[]}");
      setEventMetadata("VALID_HRERACAB","{handler:'valid_Hreracab',iparms:[]");
      setEventMetadata("VALID_HRERACAB",",oparms:[]}");
      setEventMetadata("VALID_HREFECACB","{handler:'valid_Hrefecacb',iparms:[]");
      setEventMetadata("VALID_HREFECACB",",oparms:[]}");
      setEventMetadata("VALID_HREABS","{handler:'valid_Hreabs',iparms:[]");
      setEventMetadata("VALID_HREABS",",oparms:[]}");
      setEventMetadata("VALID_HRELTSRC","{handler:'valid_Hreltsrc',iparms:[]");
      setEventMetadata("VALID_HRELTSRC",",oparms:[]}");
      setEventMetadata("VALID_HREHDRLTS","{handler:'valid_Hrehdrlts',iparms:[]");
      setEventMetadata("VALID_HREHDRLTS",",oparms:[]}");
      setEventMetadata("VALID_HREFABS","{handler:'valid_Hrefabs',iparms:[{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4523HreColNomC',fld:'HRECOLNOMC',pic:''},{av:'A4524HreColNumC',fld:'HRECOLNUMC',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4527HreFecGen',fld:'HREFECGEN',pic:''},{av:'A4528HreFecCli',fld:'HREFECCLI',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4530HreFecFpr',fld:'HREFECFPR',pic:''},{av:'A4531HreBarMat',fld:'HREBARMAT',pic:''},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4533HreBarMtr',fld:'HREBARMTR',pic:'ZZZZZ9.99'},{av:'A4534HreBarPie',fld:'HREBARPIE',pic:'ZZZ9'},{av:'A4535HrePartCod',fld:'HREPARTCOD',pic:''},{av:'A4536HreBarNMtr',fld:'HREBARNMTR',pic:''},{av:'A4537HreBarNMez',fld:'HREBARNMEZ',pic:''},{av:'A4538HreNumTen',fld:'HRENUMTEN',pic:''},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A4541HreNumTon',fld:'HRENUMTON',pic:''},{av:'A4496HreMaqHdr',fld:'HREMAQHDR',pic:''},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A4543HreTotMtr',fld:'HRETOTMTR',pic:'ZZZZZ9.99'},{av:'A4544HreTotPie',fld:'HRETOTPIE',pic:'ZZZ9'},{av:'A9805HreLtsSR',fld:'HRELTSSR',pic:'ZZZZ9'},{av:'A9806HreLtsRs',fld:'HRELTSRS',pic:'ZZZZ9'},{av:'A9807HreAcaQm',fld:'HREACAQM',pic:''},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A9809HreFecAcb',fld:'HREFECACB',pic:'99/99/99 99:99:99'},{av:'A9810HreAbs',fld:'HREABS',pic:'ZZ9.99'},{av:'A10099HreLtsRc',fld:'HRELTSRC',pic:'ZZZZ9'},{av:'A10100HreHdrLts',fld:'HREHDRLTS',pic:''},{av:'A10101HreFabs',fld:'HREFABS',pic:'ZZ9.99'}]");
      setEventMetadata("VALID_HREFABS",",oparms:[]}");
      setEventMetadata("VALID_HRELINMAQ","{handler:'valid_Hrelinmaq',iparms:[]");
      setEventMetadata("VALID_HRELINMAQ",",oparms:[]}");
      setEventMetadata("VALID_HREMAQPES","{handler:'valid_Hremaqpes',iparms:[]");
      setEventMetadata("VALID_HREMAQPES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hredtf',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_HRELINPRO","{handler:'valid_Hrelinpro',iparms:[]");
      setEventMetadata("VALID_HRELINPRO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hrenroprg',iparms:[]");
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
      pr_default.close(16);
      pr_default.close(40);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z4516HreDisCli = "" ;
      Z4517HreBarSer = "" ;
      Z4518HreBarDsc = "" ;
      Z4520HreTipArtD = "" ;
      Z4521HreColNom = "" ;
      Z4523HreColNomC = "" ;
      Z4526HreTipColN = "" ;
      Z4527HreFecGen = GXutil.nullDate() ;
      Z4528HreFecCli = GXutil.nullDate() ;
      Z4529HreFecTin = GXutil.nullDate() ;
      Z4530HreFecFpr = GXutil.nullDate() ;
      Z4531HreBarMat = "" ;
      Z4532HreBarKgm = DecimalUtil.ZERO ;
      Z4533HreBarMtr = DecimalUtil.ZERO ;
      Z4535HrePartCod = "" ;
      Z4536HreBarNMtr = "" ;
      Z4537HreBarNMez = "" ;
      Z4538HreNumTen = "" ;
      Z4540HreIntDsc = "" ;
      Z4541HreNumTon = "" ;
      Z4496HreMaqHdr = "" ;
      Z4542HreTotKgm = DecimalUtil.ZERO ;
      Z4543HreTotMtr = DecimalUtil.ZERO ;
      Z9807HreAcaQm = "" ;
      Z9808HreRacab = "" ;
      Z9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
      Z9810HreAbs = DecimalUtil.ZERO ;
      Z10100HreHdrLts = "" ;
      Z10101HreFabs = DecimalUtil.ZERO ;
      Z4546HreMaqCod = "" ;
      Z4548HreFacAbs = DecimalUtil.ZERO ;
      Z4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4863HreUsrCod = "" ;
      Z4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      Z4961HreUsrMod = "" ;
      Z4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      Z4963HreFasCod = "" ;
      Z4968HreTotKgs = DecimalUtil.ZERO ;
      Z4969HreTotMts = DecimalUtil.ZERO ;
      Z5863HreProPrd = "" ;
      Z10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      Z10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      Z4551HreProCod = "" ;
      Z4552HreProDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
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
      A4494HreBarPar = "" ;
      lblTextblock5_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock6_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock7_Jsonclick = "" ;
      A4516HreDisCli = "" ;
      lblTextblock8_Jsonclick = "" ;
      lblTextblock9_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4517HreBarSer = "" ;
      lblTextblock11_Jsonclick = "" ;
      A4518HreBarDsc = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      A4520HreTipArtD = "" ;
      lblTextblock14_Jsonclick = "" ;
      A4521HreColNom = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4523HreColNomC = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      lblTextblock19_Jsonclick = "" ;
      A4526HreTipColN = "" ;
      lblTextblock20_Jsonclick = "" ;
      A4527HreFecGen = GXutil.nullDate() ;
      lblTextblock21_Jsonclick = "" ;
      A4528HreFecCli = GXutil.nullDate() ;
      lblTextblock22_Jsonclick = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      lblTextblock23_Jsonclick = "" ;
      A4530HreFecFpr = GXutil.nullDate() ;
      lblTextblock24_Jsonclick = "" ;
      A4531HreBarMat = "" ;
      lblTextblock25_Jsonclick = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      lblTextblock26_Jsonclick = "" ;
      A4533HreBarMtr = DecimalUtil.ZERO ;
      lblTextblock27_Jsonclick = "" ;
      lblTextblock28_Jsonclick = "" ;
      A4535HrePartCod = "" ;
      lblTextblock29_Jsonclick = "" ;
      A4536HreBarNMtr = "" ;
      lblTextblock30_Jsonclick = "" ;
      A4537HreBarNMez = "" ;
      lblTextblock31_Jsonclick = "" ;
      A4538HreNumTen = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      A4540HreIntDsc = "" ;
      lblTextblock34_Jsonclick = "" ;
      A4541HreNumTon = "" ;
      lblTextblock35_Jsonclick = "" ;
      A4496HreMaqHdr = "" ;
      lblTextblock36_Jsonclick = "" ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      lblTextblock37_Jsonclick = "" ;
      A4543HreTotMtr = DecimalUtil.ZERO ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      A9807HreAcaQm = "" ;
      lblTextblock42_Jsonclick = "" ;
      A9808HreRacab = "" ;
      lblTextblock43_Jsonclick = "" ;
      A9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock44_Jsonclick = "" ;
      A9810HreAbs = DecimalUtil.ZERO ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      A10100HreHdrLts = "" ;
      lblTextblock47_Jsonclick = "" ;
      A10101HreFabs = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode678 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV17UsurCod = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode675 = "" ;
      GXCCtl = "" ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      A4546HreMaqCod = "" ;
      A4548HreFacAbs = DecimalUtil.ZERO ;
      A4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      A4863HreUsrCod = "" ;
      A4960HreFecAlt = GXutil.resetTime( GXutil.nullDate() );
      A4961HreUsrMod = "" ;
      A4962HreFecMod = GXutil.resetTime( GXutil.nullDate() );
      A4963HreFasCod = "" ;
      A4968HreTotKgs = DecimalUtil.ZERO ;
      A4969HreTotMts = DecimalUtil.ZERO ;
      A5863HreProPrd = "" ;
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV23Lit0 = "" ;
      AV24Lit1 = "" ;
      AV25Lit2 = "" ;
      AV26Lit3 = "" ;
      AV27Lit4 = "" ;
      AV28Lit5 = "" ;
      AV29Lit6 = "" ;
      AV30Lit7 = "" ;
      AV31Lit8 = "" ;
      AV32Lit9 = "" ;
      AV33Lit10 = "" ;
      AV34Lit11 = "" ;
      AV35Lit12 = "" ;
      AV36Lit13 = "" ;
      AV37Lit14 = "" ;
      AV38Lit15 = "" ;
      AV39Lit16 = "" ;
      AV40Lit17 = "" ;
      AV41Lit18 = "" ;
      AV42Lit19 = "" ;
      AV43Lit20 = "" ;
      AV44Lit21 = "" ;
      AV45Lit22 = "" ;
      AV46Lit23 = "" ;
      AV47Lit24 = "" ;
      AV48Lit25 = "" ;
      AV49Lit26 = "" ;
      AV50Lit27 = "" ;
      AV51Lit28 = "" ;
      AV52Lit29 = "" ;
      AV53Lit30 = "" ;
      AV55Lit43 = "" ;
      AV56Lit44 = "" ;
      AV57Lit45 = "" ;
      AV58Lit46 = "" ;
      AV59Lit47 = "" ;
      AV60Lit48 = "" ;
      AV61Lit49 = "" ;
      AV62Lit50 = "" ;
      AV63Lit51 = "" ;
      AV66Lit52 = "" ;
      AV67Lit53 = "" ;
      AV68Lit58 = "" ;
      AV70Lit59 = "" ;
      AV69Lit60 = "" ;
      AV71Lit61 = "" ;
      AV73Lit62 = "" ;
      AV74Lit63 = "" ;
      AV65LitFe = "" ;
      AV64msg0 = "" ;
      GXt_char1 = "" ;
      AV22Station = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV19ImpCod = "" ;
      GXv_char3 = new String[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T00NO8_A407EmprNom = new String[] {""} ;
      T00NO8_n407EmprNom = new boolean[] {false} ;
      T00NO10_A4492HreBarCod = new int[1] ;
      T00NO10_A4493HreBarReo = new byte[1] ;
      T00NO10_A4494HreBarPar = new String[] {""} ;
      T00NO10_A4495HreNumCie = new byte[1] ;
      T00NO10_A407EmprNom = new String[] {""} ;
      T00NO10_n407EmprNom = new boolean[] {false} ;
      T00NO10_A4516HreDisCli = new String[] {""} ;
      T00NO10_n4516HreDisCli = new boolean[] {false} ;
      T00NO10_A279CliNom = new String[] {""} ;
      T00NO10_A4517HreBarSer = new String[] {""} ;
      T00NO10_n4517HreBarSer = new boolean[] {false} ;
      T00NO10_A4518HreBarDsc = new String[] {""} ;
      T00NO10_n4518HreBarDsc = new boolean[] {false} ;
      T00NO10_A4519HreTipArt = new short[1] ;
      T00NO10_n4519HreTipArt = new boolean[] {false} ;
      T00NO10_A4520HreTipArtD = new String[] {""} ;
      T00NO10_n4520HreTipArtD = new boolean[] {false} ;
      T00NO10_A4521HreColNom = new String[] {""} ;
      T00NO10_n4521HreColNom = new boolean[] {false} ;
      T00NO10_A4522HreColNum = new int[1] ;
      T00NO10_n4522HreColNum = new boolean[] {false} ;
      T00NO10_A4523HreColNomC = new String[] {""} ;
      T00NO10_n4523HreColNomC = new boolean[] {false} ;
      T00NO10_A4524HreColNumC = new int[1] ;
      T00NO10_n4524HreColNumC = new boolean[] {false} ;
      T00NO10_A4525HreTipCol = new byte[1] ;
      T00NO10_n4525HreTipCol = new boolean[] {false} ;
      T00NO10_A4526HreTipColN = new String[] {""} ;
      T00NO10_n4526HreTipColN = new boolean[] {false} ;
      T00NO10_A4527HreFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO10_n4527HreFecGen = new boolean[] {false} ;
      T00NO10_A4528HreFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO10_n4528HreFecCli = new boolean[] {false} ;
      T00NO10_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO10_n4529HreFecTin = new boolean[] {false} ;
      T00NO10_A4530HreFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO10_n4530HreFecFpr = new boolean[] {false} ;
      T00NO10_A4531HreBarMat = new String[] {""} ;
      T00NO10_n4531HreBarMat = new boolean[] {false} ;
      T00NO10_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO10_n4532HreBarKgm = new boolean[] {false} ;
      T00NO10_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO10_n4533HreBarMtr = new boolean[] {false} ;
      T00NO10_A4534HreBarPie = new int[1] ;
      T00NO10_n4534HreBarPie = new boolean[] {false} ;
      T00NO10_A4535HrePartCod = new String[] {""} ;
      T00NO10_n4535HrePartCod = new boolean[] {false} ;
      T00NO10_A4536HreBarNMtr = new String[] {""} ;
      T00NO10_n4536HreBarNMtr = new boolean[] {false} ;
      T00NO10_A4537HreBarNMez = new String[] {""} ;
      T00NO10_n4537HreBarNMez = new boolean[] {false} ;
      T00NO10_A4538HreNumTen = new String[] {""} ;
      T00NO10_n4538HreNumTen = new boolean[] {false} ;
      T00NO10_A4539HreIntCod = new byte[1] ;
      T00NO10_n4539HreIntCod = new boolean[] {false} ;
      T00NO10_A4540HreIntDsc = new String[] {""} ;
      T00NO10_n4540HreIntDsc = new boolean[] {false} ;
      T00NO10_A4541HreNumTon = new String[] {""} ;
      T00NO10_n4541HreNumTon = new boolean[] {false} ;
      T00NO10_A4496HreMaqHdr = new String[] {""} ;
      T00NO10_n4496HreMaqHdr = new boolean[] {false} ;
      T00NO10_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO10_n4542HreTotKgm = new boolean[] {false} ;
      T00NO10_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO10_n4543HreTotMtr = new boolean[] {false} ;
      T00NO10_A4544HreTotPie = new int[1] ;
      T00NO10_n4544HreTotPie = new boolean[] {false} ;
      T00NO10_A9805HreLtsSR = new int[1] ;
      T00NO10_n9805HreLtsSR = new boolean[] {false} ;
      T00NO10_A9806HreLtsRs = new int[1] ;
      T00NO10_n9806HreLtsRs = new boolean[] {false} ;
      T00NO10_A9807HreAcaQm = new String[] {""} ;
      T00NO10_n9807HreAcaQm = new boolean[] {false} ;
      T00NO10_A9808HreRacab = new String[] {""} ;
      T00NO10_n9808HreRacab = new boolean[] {false} ;
      T00NO10_A9809HreFecAcb = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO10_n9809HreFecAcb = new boolean[] {false} ;
      T00NO10_A9810HreAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO10_n9810HreAbs = new boolean[] {false} ;
      T00NO10_A10099HreLtsRc = new int[1] ;
      T00NO10_n10099HreLtsRc = new boolean[] {false} ;
      T00NO10_A10100HreHdrLts = new String[] {""} ;
      T00NO10_n10100HreHdrLts = new boolean[] {false} ;
      T00NO10_A10101HreFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO10_n10101HreFabs = new boolean[] {false} ;
      T00NO10_A396EmprCod = new String[] {""} ;
      T00NO10_A252CliCod = new int[1] ;
      T00NO10_n252CliCod = new boolean[] {false} ;
      T00NO9_A279CliNom = new String[] {""} ;
      T00NO11_A279CliNom = new String[] {""} ;
      T00NO12_A396EmprCod = new String[] {""} ;
      T00NO12_A4492HreBarCod = new int[1] ;
      T00NO12_A4493HreBarReo = new byte[1] ;
      T00NO12_A4494HreBarPar = new String[] {""} ;
      T00NO12_A4495HreNumCie = new byte[1] ;
      T00NO7_A4492HreBarCod = new int[1] ;
      T00NO7_A4493HreBarReo = new byte[1] ;
      T00NO7_A4494HreBarPar = new String[] {""} ;
      T00NO7_A4495HreNumCie = new byte[1] ;
      T00NO7_A4516HreDisCli = new String[] {""} ;
      T00NO7_n4516HreDisCli = new boolean[] {false} ;
      T00NO7_A4517HreBarSer = new String[] {""} ;
      T00NO7_n4517HreBarSer = new boolean[] {false} ;
      T00NO7_A4518HreBarDsc = new String[] {""} ;
      T00NO7_n4518HreBarDsc = new boolean[] {false} ;
      T00NO7_A4519HreTipArt = new short[1] ;
      T00NO7_n4519HreTipArt = new boolean[] {false} ;
      T00NO7_A4520HreTipArtD = new String[] {""} ;
      T00NO7_n4520HreTipArtD = new boolean[] {false} ;
      T00NO7_A4521HreColNom = new String[] {""} ;
      T00NO7_n4521HreColNom = new boolean[] {false} ;
      T00NO7_A4522HreColNum = new int[1] ;
      T00NO7_n4522HreColNum = new boolean[] {false} ;
      T00NO7_A4523HreColNomC = new String[] {""} ;
      T00NO7_n4523HreColNomC = new boolean[] {false} ;
      T00NO7_A4524HreColNumC = new int[1] ;
      T00NO7_n4524HreColNumC = new boolean[] {false} ;
      T00NO7_A4525HreTipCol = new byte[1] ;
      T00NO7_n4525HreTipCol = new boolean[] {false} ;
      T00NO7_A4526HreTipColN = new String[] {""} ;
      T00NO7_n4526HreTipColN = new boolean[] {false} ;
      T00NO7_A4527HreFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO7_n4527HreFecGen = new boolean[] {false} ;
      T00NO7_A4528HreFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO7_n4528HreFecCli = new boolean[] {false} ;
      T00NO7_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO7_n4529HreFecTin = new boolean[] {false} ;
      T00NO7_A4530HreFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO7_n4530HreFecFpr = new boolean[] {false} ;
      T00NO7_A4531HreBarMat = new String[] {""} ;
      T00NO7_n4531HreBarMat = new boolean[] {false} ;
      T00NO7_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO7_n4532HreBarKgm = new boolean[] {false} ;
      T00NO7_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO7_n4533HreBarMtr = new boolean[] {false} ;
      T00NO7_A4534HreBarPie = new int[1] ;
      T00NO7_n4534HreBarPie = new boolean[] {false} ;
      T00NO7_A4535HrePartCod = new String[] {""} ;
      T00NO7_n4535HrePartCod = new boolean[] {false} ;
      T00NO7_A4536HreBarNMtr = new String[] {""} ;
      T00NO7_n4536HreBarNMtr = new boolean[] {false} ;
      T00NO7_A4537HreBarNMez = new String[] {""} ;
      T00NO7_n4537HreBarNMez = new boolean[] {false} ;
      T00NO7_A4538HreNumTen = new String[] {""} ;
      T00NO7_n4538HreNumTen = new boolean[] {false} ;
      T00NO7_A4539HreIntCod = new byte[1] ;
      T00NO7_n4539HreIntCod = new boolean[] {false} ;
      T00NO7_A4540HreIntDsc = new String[] {""} ;
      T00NO7_n4540HreIntDsc = new boolean[] {false} ;
      T00NO7_A4541HreNumTon = new String[] {""} ;
      T00NO7_n4541HreNumTon = new boolean[] {false} ;
      T00NO7_A4496HreMaqHdr = new String[] {""} ;
      T00NO7_n4496HreMaqHdr = new boolean[] {false} ;
      T00NO7_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO7_n4542HreTotKgm = new boolean[] {false} ;
      T00NO7_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO7_n4543HreTotMtr = new boolean[] {false} ;
      T00NO7_A4544HreTotPie = new int[1] ;
      T00NO7_n4544HreTotPie = new boolean[] {false} ;
      T00NO7_A9805HreLtsSR = new int[1] ;
      T00NO7_n9805HreLtsSR = new boolean[] {false} ;
      T00NO7_A9806HreLtsRs = new int[1] ;
      T00NO7_n9806HreLtsRs = new boolean[] {false} ;
      T00NO7_A9807HreAcaQm = new String[] {""} ;
      T00NO7_n9807HreAcaQm = new boolean[] {false} ;
      T00NO7_A9808HreRacab = new String[] {""} ;
      T00NO7_n9808HreRacab = new boolean[] {false} ;
      T00NO7_A9809HreFecAcb = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO7_n9809HreFecAcb = new boolean[] {false} ;
      T00NO7_A9810HreAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO7_n9810HreAbs = new boolean[] {false} ;
      T00NO7_A10099HreLtsRc = new int[1] ;
      T00NO7_n10099HreLtsRc = new boolean[] {false} ;
      T00NO7_A10100HreHdrLts = new String[] {""} ;
      T00NO7_n10100HreHdrLts = new boolean[] {false} ;
      T00NO7_A10101HreFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO7_n10101HreFabs = new boolean[] {false} ;
      T00NO7_A396EmprCod = new String[] {""} ;
      T00NO7_A252CliCod = new int[1] ;
      T00NO7_n252CliCod = new boolean[] {false} ;
      T00NO13_A396EmprCod = new String[] {""} ;
      T00NO13_A4492HreBarCod = new int[1] ;
      T00NO13_A4493HreBarReo = new byte[1] ;
      T00NO13_A4494HreBarPar = new String[] {""} ;
      T00NO13_A4495HreNumCie = new byte[1] ;
      T00NO14_A396EmprCod = new String[] {""} ;
      T00NO14_A4492HreBarCod = new int[1] ;
      T00NO14_A4493HreBarReo = new byte[1] ;
      T00NO14_A4494HreBarPar = new String[] {""} ;
      T00NO14_A4495HreNumCie = new byte[1] ;
      T00NO6_A4492HreBarCod = new int[1] ;
      T00NO6_A4493HreBarReo = new byte[1] ;
      T00NO6_A4494HreBarPar = new String[] {""} ;
      T00NO6_A4495HreNumCie = new byte[1] ;
      T00NO6_A4516HreDisCli = new String[] {""} ;
      T00NO6_n4516HreDisCli = new boolean[] {false} ;
      T00NO6_A4517HreBarSer = new String[] {""} ;
      T00NO6_n4517HreBarSer = new boolean[] {false} ;
      T00NO6_A4518HreBarDsc = new String[] {""} ;
      T00NO6_n4518HreBarDsc = new boolean[] {false} ;
      T00NO6_A4519HreTipArt = new short[1] ;
      T00NO6_n4519HreTipArt = new boolean[] {false} ;
      T00NO6_A4520HreTipArtD = new String[] {""} ;
      T00NO6_n4520HreTipArtD = new boolean[] {false} ;
      T00NO6_A4521HreColNom = new String[] {""} ;
      T00NO6_n4521HreColNom = new boolean[] {false} ;
      T00NO6_A4522HreColNum = new int[1] ;
      T00NO6_n4522HreColNum = new boolean[] {false} ;
      T00NO6_A4523HreColNomC = new String[] {""} ;
      T00NO6_n4523HreColNomC = new boolean[] {false} ;
      T00NO6_A4524HreColNumC = new int[1] ;
      T00NO6_n4524HreColNumC = new boolean[] {false} ;
      T00NO6_A4525HreTipCol = new byte[1] ;
      T00NO6_n4525HreTipCol = new boolean[] {false} ;
      T00NO6_A4526HreTipColN = new String[] {""} ;
      T00NO6_n4526HreTipColN = new boolean[] {false} ;
      T00NO6_A4527HreFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO6_n4527HreFecGen = new boolean[] {false} ;
      T00NO6_A4528HreFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO6_n4528HreFecCli = new boolean[] {false} ;
      T00NO6_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO6_n4529HreFecTin = new boolean[] {false} ;
      T00NO6_A4530HreFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO6_n4530HreFecFpr = new boolean[] {false} ;
      T00NO6_A4531HreBarMat = new String[] {""} ;
      T00NO6_n4531HreBarMat = new boolean[] {false} ;
      T00NO6_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO6_n4532HreBarKgm = new boolean[] {false} ;
      T00NO6_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO6_n4533HreBarMtr = new boolean[] {false} ;
      T00NO6_A4534HreBarPie = new int[1] ;
      T00NO6_n4534HreBarPie = new boolean[] {false} ;
      T00NO6_A4535HrePartCod = new String[] {""} ;
      T00NO6_n4535HrePartCod = new boolean[] {false} ;
      T00NO6_A4536HreBarNMtr = new String[] {""} ;
      T00NO6_n4536HreBarNMtr = new boolean[] {false} ;
      T00NO6_A4537HreBarNMez = new String[] {""} ;
      T00NO6_n4537HreBarNMez = new boolean[] {false} ;
      T00NO6_A4538HreNumTen = new String[] {""} ;
      T00NO6_n4538HreNumTen = new boolean[] {false} ;
      T00NO6_A4539HreIntCod = new byte[1] ;
      T00NO6_n4539HreIntCod = new boolean[] {false} ;
      T00NO6_A4540HreIntDsc = new String[] {""} ;
      T00NO6_n4540HreIntDsc = new boolean[] {false} ;
      T00NO6_A4541HreNumTon = new String[] {""} ;
      T00NO6_n4541HreNumTon = new boolean[] {false} ;
      T00NO6_A4496HreMaqHdr = new String[] {""} ;
      T00NO6_n4496HreMaqHdr = new boolean[] {false} ;
      T00NO6_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO6_n4542HreTotKgm = new boolean[] {false} ;
      T00NO6_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO6_n4543HreTotMtr = new boolean[] {false} ;
      T00NO6_A4544HreTotPie = new int[1] ;
      T00NO6_n4544HreTotPie = new boolean[] {false} ;
      T00NO6_A9805HreLtsSR = new int[1] ;
      T00NO6_n9805HreLtsSR = new boolean[] {false} ;
      T00NO6_A9806HreLtsRs = new int[1] ;
      T00NO6_n9806HreLtsRs = new boolean[] {false} ;
      T00NO6_A9807HreAcaQm = new String[] {""} ;
      T00NO6_n9807HreAcaQm = new boolean[] {false} ;
      T00NO6_A9808HreRacab = new String[] {""} ;
      T00NO6_n9808HreRacab = new boolean[] {false} ;
      T00NO6_A9809HreFecAcb = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO6_n9809HreFecAcb = new boolean[] {false} ;
      T00NO6_A9810HreAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO6_n9810HreAbs = new boolean[] {false} ;
      T00NO6_A10099HreLtsRc = new int[1] ;
      T00NO6_n10099HreLtsRc = new boolean[] {false} ;
      T00NO6_A10100HreHdrLts = new String[] {""} ;
      T00NO6_n10100HreHdrLts = new boolean[] {false} ;
      T00NO6_A10101HreFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO6_n10101HreFabs = new boolean[] {false} ;
      T00NO6_A396EmprCod = new String[] {""} ;
      T00NO6_A252CliCod = new int[1] ;
      T00NO6_n252CliCod = new boolean[] {false} ;
      T00NO18_A279CliNom = new String[] {""} ;
      T00NO19_A396EmprCod = new String[] {""} ;
      T00NO19_A4492HreBarCod = new int[1] ;
      T00NO19_A4493HreBarReo = new byte[1] ;
      T00NO19_A4494HreBarPar = new String[] {""} ;
      T00NO19_A4495HreNumCie = new byte[1] ;
      T00NO19_A9985HreAcCod = new int[1] ;
      T00NO19_A9986HreAcReo = new byte[1] ;
      T00NO19_A9987HreAcPar = new String[] {""} ;
      T00NO20_A396EmprCod = new String[] {""} ;
      T00NO20_A4492HreBarCod = new int[1] ;
      T00NO20_A4493HreBarReo = new byte[1] ;
      T00NO20_A4494HreBarPar = new String[] {""} ;
      T00NO20_A4495HreNumCie = new byte[1] ;
      T00NO20_A5864HreProCodP = new String[] {""} ;
      T00NO20_A5865HreOrdLinF = new short[1] ;
      T00NO21_A396EmprCod = new String[] {""} ;
      T00NO21_A4492HreBarCod = new int[1] ;
      T00NO21_A4493HreBarReo = new byte[1] ;
      T00NO21_A4494HreBarPar = new String[] {""} ;
      T00NO21_A4495HreNumCie = new byte[1] ;
      T00NO21_A4545HreLinMaq = new short[1] ;
      T00NO22_A396EmprCod = new String[] {""} ;
      T00NO22_A4492HreBarCod = new int[1] ;
      T00NO22_A4493HreBarReo = new byte[1] ;
      T00NO22_A4494HreBarPar = new String[] {""} ;
      T00NO22_A4495HreNumCie = new byte[1] ;
      T00NO22_A4508HreLinMAL = new short[1] ;
      T00NO22_A4509HreNumAny = new byte[1] ;
      T00NO22_A719PrdNum = new String[] {""} ;
      T00NO23_A396EmprCod = new String[] {""} ;
      T00NO23_A4492HreBarCod = new int[1] ;
      T00NO23_A4493HreBarReo = new byte[1] ;
      T00NO23_A4494HreBarPar = new String[] {""} ;
      T00NO23_A4495HreNumCie = new byte[1] ;
      T00NO23_A4497HreAgrCod = new int[1] ;
      T00NO23_A4498HreAgrReo = new byte[1] ;
      T00NO23_A4499HreAgrPar = new String[] {""} ;
      T00NO24_A396EmprCod = new String[] {""} ;
      T00NO24_A4492HreBarCod = new int[1] ;
      T00NO24_A4493HreBarReo = new byte[1] ;
      T00NO24_A4494HreBarPar = new String[] {""} ;
      T00NO24_A4495HreNumCie = new byte[1] ;
      T00NO25_A4492HreBarCod = new int[1] ;
      T00NO25_A4493HreBarReo = new byte[1] ;
      T00NO25_A4494HreBarPar = new String[] {""} ;
      T00NO25_A4495HreNumCie = new byte[1] ;
      T00NO25_A4545HreLinMaq = new short[1] ;
      T00NO25_A4546HreMaqCod = new String[] {""} ;
      T00NO25_n4546HreMaqCod = new boolean[] {false} ;
      T00NO25_A4547HreVolPrd = new int[1] ;
      T00NO25_n4547HreVolPrd = new boolean[] {false} ;
      T00NO25_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO25_n4548HreFacAbs = new boolean[] {false} ;
      T00NO25_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO25_n4584HreFecPes = new boolean[] {false} ;
      T00NO25_A4585HreMaqPes = new byte[1] ;
      T00NO25_n4585HreMaqPes = new boolean[] {false} ;
      T00NO25_A4549HreULinPro = new byte[1] ;
      T00NO25_n4549HreULinPro = new boolean[] {false} ;
      T00NO25_A4863HreUsrCod = new String[] {""} ;
      T00NO25_n4863HreUsrCod = new boolean[] {false} ;
      T00NO25_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO25_n4960HreFecAlt = new boolean[] {false} ;
      T00NO25_A4961HreUsrMod = new String[] {""} ;
      T00NO25_n4961HreUsrMod = new boolean[] {false} ;
      T00NO25_A4962HreFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO25_n4962HreFecMod = new boolean[] {false} ;
      T00NO25_A4963HreFasCod = new String[] {""} ;
      T00NO25_n4963HreFasCod = new boolean[] {false} ;
      T00NO25_A4964HreOrdLin = new short[1] ;
      T00NO25_n4964HreOrdLin = new boolean[] {false} ;
      T00NO25_A4965HreNroPar = new int[1] ;
      T00NO25_n4965HreNroPar = new boolean[] {false} ;
      T00NO25_A4968HreTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO25_n4968HreTotKgs = new boolean[] {false} ;
      T00NO25_A4969HreTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO25_n4969HreTotMts = new boolean[] {false} ;
      T00NO25_A4970HreTotPrd = new int[1] ;
      T00NO25_n4970HreTotPrd = new boolean[] {false} ;
      T00NO25_A5863HreProPrd = new String[] {""} ;
      T00NO25_n5863HreProPrd = new boolean[] {false} ;
      T00NO25_A5978HreNumRmt = new int[1] ;
      T00NO25_n5978HreNumRmt = new boolean[] {false} ;
      T00NO25_A5979HreNumReo = new int[1] ;
      T00NO25_n5979HreNumReo = new boolean[] {false} ;
      T00NO25_A10102HreNumInt = new int[1] ;
      T00NO25_n10102HreNumInt = new boolean[] {false} ;
      T00NO25_A10103HreDti = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO25_n10103HreDti = new boolean[] {false} ;
      T00NO25_A10104HreDtf = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO25_n10104HreDtf = new boolean[] {false} ;
      T00NO25_A396EmprCod = new String[] {""} ;
      T00NO26_A396EmprCod = new String[] {""} ;
      T00NO26_A4492HreBarCod = new int[1] ;
      T00NO26_A4493HreBarReo = new byte[1] ;
      T00NO26_A4494HreBarPar = new String[] {""} ;
      T00NO26_A4495HreNumCie = new byte[1] ;
      T00NO26_A4545HreLinMaq = new short[1] ;
      T00NO5_A4492HreBarCod = new int[1] ;
      T00NO5_A4493HreBarReo = new byte[1] ;
      T00NO5_A4494HreBarPar = new String[] {""} ;
      T00NO5_A4495HreNumCie = new byte[1] ;
      T00NO5_A4545HreLinMaq = new short[1] ;
      T00NO5_A4546HreMaqCod = new String[] {""} ;
      T00NO5_n4546HreMaqCod = new boolean[] {false} ;
      T00NO5_A4547HreVolPrd = new int[1] ;
      T00NO5_n4547HreVolPrd = new boolean[] {false} ;
      T00NO5_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO5_n4548HreFacAbs = new boolean[] {false} ;
      T00NO5_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO5_n4584HreFecPes = new boolean[] {false} ;
      T00NO5_A4585HreMaqPes = new byte[1] ;
      T00NO5_n4585HreMaqPes = new boolean[] {false} ;
      T00NO5_A4549HreULinPro = new byte[1] ;
      T00NO5_n4549HreULinPro = new boolean[] {false} ;
      T00NO5_A4863HreUsrCod = new String[] {""} ;
      T00NO5_n4863HreUsrCod = new boolean[] {false} ;
      T00NO5_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO5_n4960HreFecAlt = new boolean[] {false} ;
      T00NO5_A4961HreUsrMod = new String[] {""} ;
      T00NO5_n4961HreUsrMod = new boolean[] {false} ;
      T00NO5_A4962HreFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO5_n4962HreFecMod = new boolean[] {false} ;
      T00NO5_A4963HreFasCod = new String[] {""} ;
      T00NO5_n4963HreFasCod = new boolean[] {false} ;
      T00NO5_A4964HreOrdLin = new short[1] ;
      T00NO5_n4964HreOrdLin = new boolean[] {false} ;
      T00NO5_A4965HreNroPar = new int[1] ;
      T00NO5_n4965HreNroPar = new boolean[] {false} ;
      T00NO5_A4968HreTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO5_n4968HreTotKgs = new boolean[] {false} ;
      T00NO5_A4969HreTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO5_n4969HreTotMts = new boolean[] {false} ;
      T00NO5_A4970HreTotPrd = new int[1] ;
      T00NO5_n4970HreTotPrd = new boolean[] {false} ;
      T00NO5_A5863HreProPrd = new String[] {""} ;
      T00NO5_n5863HreProPrd = new boolean[] {false} ;
      T00NO5_A5978HreNumRmt = new int[1] ;
      T00NO5_n5978HreNumRmt = new boolean[] {false} ;
      T00NO5_A5979HreNumReo = new int[1] ;
      T00NO5_n5979HreNumReo = new boolean[] {false} ;
      T00NO5_A10102HreNumInt = new int[1] ;
      T00NO5_n10102HreNumInt = new boolean[] {false} ;
      T00NO5_A10103HreDti = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO5_n10103HreDti = new boolean[] {false} ;
      T00NO5_A10104HreDtf = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO5_n10104HreDtf = new boolean[] {false} ;
      T00NO5_A396EmprCod = new String[] {""} ;
      T00NO4_A4492HreBarCod = new int[1] ;
      T00NO4_A4493HreBarReo = new byte[1] ;
      T00NO4_A4494HreBarPar = new String[] {""} ;
      T00NO4_A4495HreNumCie = new byte[1] ;
      T00NO4_A4545HreLinMaq = new short[1] ;
      T00NO4_A4546HreMaqCod = new String[] {""} ;
      T00NO4_n4546HreMaqCod = new boolean[] {false} ;
      T00NO4_A4547HreVolPrd = new int[1] ;
      T00NO4_n4547HreVolPrd = new boolean[] {false} ;
      T00NO4_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO4_n4548HreFacAbs = new boolean[] {false} ;
      T00NO4_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO4_n4584HreFecPes = new boolean[] {false} ;
      T00NO4_A4585HreMaqPes = new byte[1] ;
      T00NO4_n4585HreMaqPes = new boolean[] {false} ;
      T00NO4_A4549HreULinPro = new byte[1] ;
      T00NO4_n4549HreULinPro = new boolean[] {false} ;
      T00NO4_A4863HreUsrCod = new String[] {""} ;
      T00NO4_n4863HreUsrCod = new boolean[] {false} ;
      T00NO4_A4960HreFecAlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO4_n4960HreFecAlt = new boolean[] {false} ;
      T00NO4_A4961HreUsrMod = new String[] {""} ;
      T00NO4_n4961HreUsrMod = new boolean[] {false} ;
      T00NO4_A4962HreFecMod = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO4_n4962HreFecMod = new boolean[] {false} ;
      T00NO4_A4963HreFasCod = new String[] {""} ;
      T00NO4_n4963HreFasCod = new boolean[] {false} ;
      T00NO4_A4964HreOrdLin = new short[1] ;
      T00NO4_n4964HreOrdLin = new boolean[] {false} ;
      T00NO4_A4965HreNroPar = new int[1] ;
      T00NO4_n4965HreNroPar = new boolean[] {false} ;
      T00NO4_A4968HreTotKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO4_n4968HreTotKgs = new boolean[] {false} ;
      T00NO4_A4969HreTotMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00NO4_n4969HreTotMts = new boolean[] {false} ;
      T00NO4_A4970HreTotPrd = new int[1] ;
      T00NO4_n4970HreTotPrd = new boolean[] {false} ;
      T00NO4_A5863HreProPrd = new String[] {""} ;
      T00NO4_n5863HreProPrd = new boolean[] {false} ;
      T00NO4_A5978HreNumRmt = new int[1] ;
      T00NO4_n5978HreNumRmt = new boolean[] {false} ;
      T00NO4_A5979HreNumReo = new int[1] ;
      T00NO4_n5979HreNumReo = new boolean[] {false} ;
      T00NO4_A10102HreNumInt = new int[1] ;
      T00NO4_n10102HreNumInt = new boolean[] {false} ;
      T00NO4_A10103HreDti = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO4_n10103HreDti = new boolean[] {false} ;
      T00NO4_A10104HreDtf = new java.util.Date[] {GXutil.nullDate()} ;
      T00NO4_n10104HreDtf = new boolean[] {false} ;
      T00NO4_A396EmprCod = new String[] {""} ;
      T00NO30_A396EmprCod = new String[] {""} ;
      T00NO30_A4492HreBarCod = new int[1] ;
      T00NO30_A4493HreBarReo = new byte[1] ;
      T00NO30_A4494HreBarPar = new String[] {""} ;
      T00NO30_A4495HreNumCie = new byte[1] ;
      T00NO30_A4545HreLinMaq = new short[1] ;
      T00NO30_A14278HreNormId = new String[] {""} ;
      T00NO31_A396EmprCod = new String[] {""} ;
      T00NO31_A4492HreBarCod = new int[1] ;
      T00NO31_A4493HreBarReo = new byte[1] ;
      T00NO31_A4494HreBarPar = new String[] {""} ;
      T00NO31_A4495HreNumCie = new byte[1] ;
      T00NO31_A4545HreLinMaq = new short[1] ;
      T00NO31_A14282HreTraID = new String[] {""} ;
      T00NO32_A396EmprCod = new String[] {""} ;
      T00NO32_A4492HreBarCod = new int[1] ;
      T00NO32_A4493HreBarReo = new byte[1] ;
      T00NO32_A4494HreBarPar = new String[] {""} ;
      T00NO32_A4495HreNumCie = new byte[1] ;
      T00NO32_A4545HreLinMaq = new short[1] ;
      T00NO32_A4550HreLinPro = new byte[1] ;
      T00NO32_A4557HreRecLin = new short[1] ;
      T00NO33_A396EmprCod = new String[] {""} ;
      T00NO33_A4492HreBarCod = new int[1] ;
      T00NO33_A4493HreBarReo = new byte[1] ;
      T00NO33_A4494HreBarPar = new String[] {""} ;
      T00NO33_A4495HreNumCie = new byte[1] ;
      T00NO33_A4545HreLinMaq = new short[1] ;
      T00NO33_A11322HreLinObs = new short[1] ;
      T00NO34_A396EmprCod = new String[] {""} ;
      T00NO34_A4492HreBarCod = new int[1] ;
      T00NO34_A4493HreBarReo = new byte[1] ;
      T00NO34_A4494HreBarPar = new String[] {""} ;
      T00NO34_A4495HreNumCie = new byte[1] ;
      T00NO34_A4545HreLinMaq = new short[1] ;
      T00NO35_A4492HreBarCod = new int[1] ;
      T00NO35_A4493HreBarReo = new byte[1] ;
      T00NO35_A4494HreBarPar = new String[] {""} ;
      T00NO35_A4495HreNumCie = new byte[1] ;
      T00NO35_A4545HreLinMaq = new short[1] ;
      T00NO35_A4550HreLinPro = new byte[1] ;
      T00NO35_A4551HreProCod = new String[] {""} ;
      T00NO35_A4552HreProDsc = new String[] {""} ;
      T00NO35_A4553HreProTie = new short[1] ;
      T00NO35_A4554HreProTmx = new short[1] ;
      T00NO35_A4555HreNumPro = new int[1] ;
      T00NO35_A4556HreNumRec = new int[1] ;
      T00NO35_A4966HreVolPro = new int[1] ;
      T00NO35_A5947HreTieprg = new short[1] ;
      T00NO35_A5948HreNroPrg = new short[1] ;
      T00NO35_A396EmprCod = new String[] {""} ;
      T00NO36_A396EmprCod = new String[] {""} ;
      T00NO36_A4492HreBarCod = new int[1] ;
      T00NO36_A4493HreBarReo = new byte[1] ;
      T00NO36_A4494HreBarPar = new String[] {""} ;
      T00NO36_A4495HreNumCie = new byte[1] ;
      T00NO36_A4545HreLinMaq = new short[1] ;
      T00NO36_A4550HreLinPro = new byte[1] ;
      T00NO3_A4492HreBarCod = new int[1] ;
      T00NO3_A4493HreBarReo = new byte[1] ;
      T00NO3_A4494HreBarPar = new String[] {""} ;
      T00NO3_A4495HreNumCie = new byte[1] ;
      T00NO3_A4545HreLinMaq = new short[1] ;
      T00NO3_A4550HreLinPro = new byte[1] ;
      T00NO3_A4551HreProCod = new String[] {""} ;
      T00NO3_A4552HreProDsc = new String[] {""} ;
      T00NO3_A4553HreProTie = new short[1] ;
      T00NO3_A4554HreProTmx = new short[1] ;
      T00NO3_A4555HreNumPro = new int[1] ;
      T00NO3_A4556HreNumRec = new int[1] ;
      T00NO3_A4966HreVolPro = new int[1] ;
      T00NO3_A5947HreTieprg = new short[1] ;
      T00NO3_A5948HreNroPrg = new short[1] ;
      T00NO3_A396EmprCod = new String[] {""} ;
      sMode1874 = "" ;
      T00NO2_A4492HreBarCod = new int[1] ;
      T00NO2_A4493HreBarReo = new byte[1] ;
      T00NO2_A4494HreBarPar = new String[] {""} ;
      T00NO2_A4495HreNumCie = new byte[1] ;
      T00NO2_A4545HreLinMaq = new short[1] ;
      T00NO2_A4550HreLinPro = new byte[1] ;
      T00NO2_A4551HreProCod = new String[] {""} ;
      T00NO2_A4552HreProDsc = new String[] {""} ;
      T00NO2_A4553HreProTie = new short[1] ;
      T00NO2_A4554HreProTmx = new short[1] ;
      T00NO2_A4555HreNumPro = new int[1] ;
      T00NO2_A4556HreNumRec = new int[1] ;
      T00NO2_A4966HreVolPro = new int[1] ;
      T00NO2_A5947HreTieprg = new short[1] ;
      T00NO2_A5948HreNroPrg = new short[1] ;
      T00NO2_A396EmprCod = new String[] {""} ;
      T00NO40_A396EmprCod = new String[] {""} ;
      T00NO40_A4492HreBarCod = new int[1] ;
      T00NO40_A4493HreBarReo = new byte[1] ;
      T00NO40_A4494HreBarPar = new String[] {""} ;
      T00NO40_A4495HreNumCie = new byte[1] ;
      T00NO40_A4545HreLinMaq = new short[1] ;
      T00NO40_A4550HreLinPro = new byte[1] ;
      T00NO40_A4557HreRecLin = new short[1] ;
      T00NO41_A396EmprCod = new String[] {""} ;
      T00NO41_A4492HreBarCod = new int[1] ;
      T00NO41_A4493HreBarReo = new byte[1] ;
      T00NO41_A4494HreBarPar = new String[] {""} ;
      T00NO41_A4495HreNumCie = new byte[1] ;
      T00NO41_A4545HreLinMaq = new short[1] ;
      T00NO41_A4550HreLinPro = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock48_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock49_Jsonclick = "" ;
      lblTextblock50_Jsonclick = "" ;
      lblTextblock51_Jsonclick = "" ;
      lblTextblock52_Jsonclick = "" ;
      lblTextblock53_Jsonclick = "" ;
      lblTextblock54_Jsonclick = "" ;
      lblTextblock55_Jsonclick = "" ;
      lblTextblock56_Jsonclick = "" ;
      lblTextblock57_Jsonclick = "" ;
      lblTextblock58_Jsonclick = "" ;
      lblTextblock59_Jsonclick = "" ;
      lblTextblock60_Jsonclick = "" ;
      lblTextblock61_Jsonclick = "" ;
      lblTextblock62_Jsonclick = "" ;
      lblTextblock63_Jsonclick = "" ;
      lblTextblock64_Jsonclick = "" ;
      lblTextblock65_Jsonclick = "" ;
      lblTextblock66_Jsonclick = "" ;
      lblTextblock67_Jsonclick = "" ;
      lblTextblock68_Jsonclick = "" ;
      lblTextblock69_Jsonclick = "" ;
      lblTextblock70_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T00NO42_A407EmprNom = new String[] {""} ;
      T00NO42_n407EmprNom = new boolean[] {false} ;
      ZV17UsurCod = "" ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ407EmprNom = "" ;
      ZZ4516HreDisCli = "" ;
      ZZ4517HreBarSer = "" ;
      ZZ4518HreBarDsc = "" ;
      ZZ4520HreTipArtD = "" ;
      ZZ4521HreColNom = "" ;
      ZZ4523HreColNomC = "" ;
      ZZ4526HreTipColN = "" ;
      ZZ4527HreFecGen = GXutil.nullDate() ;
      ZZ4528HreFecCli = GXutil.nullDate() ;
      ZZ4529HreFecTin = GXutil.nullDate() ;
      ZZ4530HreFecFpr = GXutil.nullDate() ;
      ZZ4531HreBarMat = "" ;
      ZZ4532HreBarKgm = DecimalUtil.ZERO ;
      ZZ4533HreBarMtr = DecimalUtil.ZERO ;
      ZZ4535HrePartCod = "" ;
      ZZ4536HreBarNMtr = "" ;
      ZZ4537HreBarNMez = "" ;
      ZZ4538HreNumTen = "" ;
      ZZ4540HreIntDsc = "" ;
      ZZ4541HreNumTon = "" ;
      ZZ4496HreMaqHdr = "" ;
      ZZ4542HreTotKgm = DecimalUtil.ZERO ;
      ZZ4543HreTotMtr = DecimalUtil.ZERO ;
      ZZ9807HreAcaQm = "" ;
      ZZ9808HreRacab = "" ;
      ZZ9809HreFecAcb = GXutil.resetTime( GXutil.nullDate() );
      ZZ9810HreAbs = DecimalUtil.ZERO ;
      ZZ10100HreHdrLts = "" ;
      ZZ10101HreFabs = DecimalUtil.ZERO ;
      ZZV17UsurCod = "" ;
      ZZ279CliNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thisrex__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thisrex__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thisrex__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thisrex__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thisrex__default(),
         new Object[] {
             new Object[] {
            T00NO2_A4492HreBarCod, T00NO2_A4493HreBarReo, T00NO2_A4494HreBarPar, T00NO2_A4495HreNumCie, T00NO2_A4545HreLinMaq, T00NO2_A4550HreLinPro, T00NO2_A4551HreProCod, T00NO2_A4552HreProDsc, T00NO2_A4553HreProTie, T00NO2_A4554HreProTmx,
            T00NO2_A4555HreNumPro, T00NO2_A4556HreNumRec, T00NO2_A4966HreVolPro, T00NO2_A5947HreTieprg, T00NO2_A5948HreNroPrg, T00NO2_A396EmprCod
            }
            , new Object[] {
            T00NO3_A4492HreBarCod, T00NO3_A4493HreBarReo, T00NO3_A4494HreBarPar, T00NO3_A4495HreNumCie, T00NO3_A4545HreLinMaq, T00NO3_A4550HreLinPro, T00NO3_A4551HreProCod, T00NO3_A4552HreProDsc, T00NO3_A4553HreProTie, T00NO3_A4554HreProTmx,
            T00NO3_A4555HreNumPro, T00NO3_A4556HreNumRec, T00NO3_A4966HreVolPro, T00NO3_A5947HreTieprg, T00NO3_A5948HreNroPrg, T00NO3_A396EmprCod
            }
            , new Object[] {
            T00NO4_A4492HreBarCod, T00NO4_A4493HreBarReo, T00NO4_A4494HreBarPar, T00NO4_A4495HreNumCie, T00NO4_A4545HreLinMaq, T00NO4_A4546HreMaqCod, T00NO4_n4546HreMaqCod, T00NO4_A4547HreVolPrd, T00NO4_n4547HreVolPrd, T00NO4_A4548HreFacAbs,
            T00NO4_n4548HreFacAbs, T00NO4_A4584HreFecPes, T00NO4_n4584HreFecPes, T00NO4_A4585HreMaqPes, T00NO4_n4585HreMaqPes, T00NO4_A4549HreULinPro, T00NO4_n4549HreULinPro, T00NO4_A4863HreUsrCod, T00NO4_n4863HreUsrCod, T00NO4_A4960HreFecAlt,
            T00NO4_n4960HreFecAlt, T00NO4_A4961HreUsrMod, T00NO4_n4961HreUsrMod, T00NO4_A4962HreFecMod, T00NO4_n4962HreFecMod, T00NO4_A4963HreFasCod, T00NO4_n4963HreFasCod, T00NO4_A4964HreOrdLin, T00NO4_n4964HreOrdLin, T00NO4_A4965HreNroPar,
            T00NO4_n4965HreNroPar, T00NO4_A4968HreTotKgs, T00NO4_n4968HreTotKgs, T00NO4_A4969HreTotMts, T00NO4_n4969HreTotMts, T00NO4_A4970HreTotPrd, T00NO4_n4970HreTotPrd, T00NO4_A5863HreProPrd, T00NO4_n5863HreProPrd, T00NO4_A5978HreNumRmt,
            T00NO4_n5978HreNumRmt, T00NO4_A5979HreNumReo, T00NO4_n5979HreNumReo, T00NO4_A10102HreNumInt, T00NO4_n10102HreNumInt, T00NO4_A10103HreDti, T00NO4_n10103HreDti, T00NO4_A10104HreDtf, T00NO4_n10104HreDtf, T00NO4_A396EmprCod
            }
            , new Object[] {
            T00NO5_A4492HreBarCod, T00NO5_A4493HreBarReo, T00NO5_A4494HreBarPar, T00NO5_A4495HreNumCie, T00NO5_A4545HreLinMaq, T00NO5_A4546HreMaqCod, T00NO5_n4546HreMaqCod, T00NO5_A4547HreVolPrd, T00NO5_n4547HreVolPrd, T00NO5_A4548HreFacAbs,
            T00NO5_n4548HreFacAbs, T00NO5_A4584HreFecPes, T00NO5_n4584HreFecPes, T00NO5_A4585HreMaqPes, T00NO5_n4585HreMaqPes, T00NO5_A4549HreULinPro, T00NO5_n4549HreULinPro, T00NO5_A4863HreUsrCod, T00NO5_n4863HreUsrCod, T00NO5_A4960HreFecAlt,
            T00NO5_n4960HreFecAlt, T00NO5_A4961HreUsrMod, T00NO5_n4961HreUsrMod, T00NO5_A4962HreFecMod, T00NO5_n4962HreFecMod, T00NO5_A4963HreFasCod, T00NO5_n4963HreFasCod, T00NO5_A4964HreOrdLin, T00NO5_n4964HreOrdLin, T00NO5_A4965HreNroPar,
            T00NO5_n4965HreNroPar, T00NO5_A4968HreTotKgs, T00NO5_n4968HreTotKgs, T00NO5_A4969HreTotMts, T00NO5_n4969HreTotMts, T00NO5_A4970HreTotPrd, T00NO5_n4970HreTotPrd, T00NO5_A5863HreProPrd, T00NO5_n5863HreProPrd, T00NO5_A5978HreNumRmt,
            T00NO5_n5978HreNumRmt, T00NO5_A5979HreNumReo, T00NO5_n5979HreNumReo, T00NO5_A10102HreNumInt, T00NO5_n10102HreNumInt, T00NO5_A10103HreDti, T00NO5_n10103HreDti, T00NO5_A10104HreDtf, T00NO5_n10104HreDtf, T00NO5_A396EmprCod
            }
            , new Object[] {
            T00NO6_A4492HreBarCod, T00NO6_A4493HreBarReo, T00NO6_A4494HreBarPar, T00NO6_A4495HreNumCie, T00NO6_A4516HreDisCli, T00NO6_n4516HreDisCli, T00NO6_A4517HreBarSer, T00NO6_n4517HreBarSer, T00NO6_A4518HreBarDsc, T00NO6_n4518HreBarDsc,
            T00NO6_A4519HreTipArt, T00NO6_n4519HreTipArt, T00NO6_A4520HreTipArtD, T00NO6_n4520HreTipArtD, T00NO6_A4521HreColNom, T00NO6_n4521HreColNom, T00NO6_A4522HreColNum, T00NO6_n4522HreColNum, T00NO6_A4523HreColNomC, T00NO6_n4523HreColNomC,
            T00NO6_A4524HreColNumC, T00NO6_n4524HreColNumC, T00NO6_A4525HreTipCol, T00NO6_n4525HreTipCol, T00NO6_A4526HreTipColN, T00NO6_n4526HreTipColN, T00NO6_A4527HreFecGen, T00NO6_n4527HreFecGen, T00NO6_A4528HreFecCli, T00NO6_n4528HreFecCli,
            T00NO6_A4529HreFecTin, T00NO6_n4529HreFecTin, T00NO6_A4530HreFecFpr, T00NO6_n4530HreFecFpr, T00NO6_A4531HreBarMat, T00NO6_n4531HreBarMat, T00NO6_A4532HreBarKgm, T00NO6_n4532HreBarKgm, T00NO6_A4533HreBarMtr, T00NO6_n4533HreBarMtr,
            T00NO6_A4534HreBarPie, T00NO6_n4534HreBarPie, T00NO6_A4535HrePartCod, T00NO6_n4535HrePartCod, T00NO6_A4536HreBarNMtr, T00NO6_n4536HreBarNMtr, T00NO6_A4537HreBarNMez, T00NO6_n4537HreBarNMez, T00NO6_A4538HreNumTen, T00NO6_n4538HreNumTen,
            T00NO6_A4539HreIntCod, T00NO6_n4539HreIntCod, T00NO6_A4540HreIntDsc, T00NO6_n4540HreIntDsc, T00NO6_A4541HreNumTon, T00NO6_n4541HreNumTon, T00NO6_A4496HreMaqHdr, T00NO6_n4496HreMaqHdr, T00NO6_A4542HreTotKgm, T00NO6_n4542HreTotKgm,
            T00NO6_A4543HreTotMtr, T00NO6_n4543HreTotMtr, T00NO6_A4544HreTotPie, T00NO6_n4544HreTotPie, T00NO6_A9805HreLtsSR, T00NO6_n9805HreLtsSR, T00NO6_A9806HreLtsRs, T00NO6_n9806HreLtsRs, T00NO6_A9807HreAcaQm, T00NO6_n9807HreAcaQm,
            T00NO6_A9808HreRacab, T00NO6_n9808HreRacab, T00NO6_A9809HreFecAcb, T00NO6_n9809HreFecAcb, T00NO6_A9810HreAbs, T00NO6_n9810HreAbs, T00NO6_A10099HreLtsRc, T00NO6_n10099HreLtsRc, T00NO6_A10100HreHdrLts, T00NO6_n10100HreHdrLts,
            T00NO6_A10101HreFabs, T00NO6_n10101HreFabs, T00NO6_A396EmprCod, T00NO6_A252CliCod, T00NO6_n252CliCod
            }
            , new Object[] {
            T00NO7_A4492HreBarCod, T00NO7_A4493HreBarReo, T00NO7_A4494HreBarPar, T00NO7_A4495HreNumCie, T00NO7_A4516HreDisCli, T00NO7_n4516HreDisCli, T00NO7_A4517HreBarSer, T00NO7_n4517HreBarSer, T00NO7_A4518HreBarDsc, T00NO7_n4518HreBarDsc,
            T00NO7_A4519HreTipArt, T00NO7_n4519HreTipArt, T00NO7_A4520HreTipArtD, T00NO7_n4520HreTipArtD, T00NO7_A4521HreColNom, T00NO7_n4521HreColNom, T00NO7_A4522HreColNum, T00NO7_n4522HreColNum, T00NO7_A4523HreColNomC, T00NO7_n4523HreColNomC,
            T00NO7_A4524HreColNumC, T00NO7_n4524HreColNumC, T00NO7_A4525HreTipCol, T00NO7_n4525HreTipCol, T00NO7_A4526HreTipColN, T00NO7_n4526HreTipColN, T00NO7_A4527HreFecGen, T00NO7_n4527HreFecGen, T00NO7_A4528HreFecCli, T00NO7_n4528HreFecCli,
            T00NO7_A4529HreFecTin, T00NO7_n4529HreFecTin, T00NO7_A4530HreFecFpr, T00NO7_n4530HreFecFpr, T00NO7_A4531HreBarMat, T00NO7_n4531HreBarMat, T00NO7_A4532HreBarKgm, T00NO7_n4532HreBarKgm, T00NO7_A4533HreBarMtr, T00NO7_n4533HreBarMtr,
            T00NO7_A4534HreBarPie, T00NO7_n4534HreBarPie, T00NO7_A4535HrePartCod, T00NO7_n4535HrePartCod, T00NO7_A4536HreBarNMtr, T00NO7_n4536HreBarNMtr, T00NO7_A4537HreBarNMez, T00NO7_n4537HreBarNMez, T00NO7_A4538HreNumTen, T00NO7_n4538HreNumTen,
            T00NO7_A4539HreIntCod, T00NO7_n4539HreIntCod, T00NO7_A4540HreIntDsc, T00NO7_n4540HreIntDsc, T00NO7_A4541HreNumTon, T00NO7_n4541HreNumTon, T00NO7_A4496HreMaqHdr, T00NO7_n4496HreMaqHdr, T00NO7_A4542HreTotKgm, T00NO7_n4542HreTotKgm,
            T00NO7_A4543HreTotMtr, T00NO7_n4543HreTotMtr, T00NO7_A4544HreTotPie, T00NO7_n4544HreTotPie, T00NO7_A9805HreLtsSR, T00NO7_n9805HreLtsSR, T00NO7_A9806HreLtsRs, T00NO7_n9806HreLtsRs, T00NO7_A9807HreAcaQm, T00NO7_n9807HreAcaQm,
            T00NO7_A9808HreRacab, T00NO7_n9808HreRacab, T00NO7_A9809HreFecAcb, T00NO7_n9809HreFecAcb, T00NO7_A9810HreAbs, T00NO7_n9810HreAbs, T00NO7_A10099HreLtsRc, T00NO7_n10099HreLtsRc, T00NO7_A10100HreHdrLts, T00NO7_n10100HreHdrLts,
            T00NO7_A10101HreFabs, T00NO7_n10101HreFabs, T00NO7_A396EmprCod, T00NO7_A252CliCod, T00NO7_n252CliCod
            }
            , new Object[] {
            T00NO8_A407EmprNom, T00NO8_n407EmprNom
            }
            , new Object[] {
            T00NO9_A279CliNom
            }
            , new Object[] {
            T00NO10_A4492HreBarCod, T00NO10_A4493HreBarReo, T00NO10_A4494HreBarPar, T00NO10_A4495HreNumCie, T00NO10_A407EmprNom, T00NO10_n407EmprNom, T00NO10_A4516HreDisCli, T00NO10_n4516HreDisCli, T00NO10_A279CliNom, T00NO10_A4517HreBarSer,
            T00NO10_n4517HreBarSer, T00NO10_A4518HreBarDsc, T00NO10_n4518HreBarDsc, T00NO10_A4519HreTipArt, T00NO10_n4519HreTipArt, T00NO10_A4520HreTipArtD, T00NO10_n4520HreTipArtD, T00NO10_A4521HreColNom, T00NO10_n4521HreColNom, T00NO10_A4522HreColNum,
            T00NO10_n4522HreColNum, T00NO10_A4523HreColNomC, T00NO10_n4523HreColNomC, T00NO10_A4524HreColNumC, T00NO10_n4524HreColNumC, T00NO10_A4525HreTipCol, T00NO10_n4525HreTipCol, T00NO10_A4526HreTipColN, T00NO10_n4526HreTipColN, T00NO10_A4527HreFecGen,
            T00NO10_n4527HreFecGen, T00NO10_A4528HreFecCli, T00NO10_n4528HreFecCli, T00NO10_A4529HreFecTin, T00NO10_n4529HreFecTin, T00NO10_A4530HreFecFpr, T00NO10_n4530HreFecFpr, T00NO10_A4531HreBarMat, T00NO10_n4531HreBarMat, T00NO10_A4532HreBarKgm,
            T00NO10_n4532HreBarKgm, T00NO10_A4533HreBarMtr, T00NO10_n4533HreBarMtr, T00NO10_A4534HreBarPie, T00NO10_n4534HreBarPie, T00NO10_A4535HrePartCod, T00NO10_n4535HrePartCod, T00NO10_A4536HreBarNMtr, T00NO10_n4536HreBarNMtr, T00NO10_A4537HreBarNMez,
            T00NO10_n4537HreBarNMez, T00NO10_A4538HreNumTen, T00NO10_n4538HreNumTen, T00NO10_A4539HreIntCod, T00NO10_n4539HreIntCod, T00NO10_A4540HreIntDsc, T00NO10_n4540HreIntDsc, T00NO10_A4541HreNumTon, T00NO10_n4541HreNumTon, T00NO10_A4496HreMaqHdr,
            T00NO10_n4496HreMaqHdr, T00NO10_A4542HreTotKgm, T00NO10_n4542HreTotKgm, T00NO10_A4543HreTotMtr, T00NO10_n4543HreTotMtr, T00NO10_A4544HreTotPie, T00NO10_n4544HreTotPie, T00NO10_A9805HreLtsSR, T00NO10_n9805HreLtsSR, T00NO10_A9806HreLtsRs,
            T00NO10_n9806HreLtsRs, T00NO10_A9807HreAcaQm, T00NO10_n9807HreAcaQm, T00NO10_A9808HreRacab, T00NO10_n9808HreRacab, T00NO10_A9809HreFecAcb, T00NO10_n9809HreFecAcb, T00NO10_A9810HreAbs, T00NO10_n9810HreAbs, T00NO10_A10099HreLtsRc,
            T00NO10_n10099HreLtsRc, T00NO10_A10100HreHdrLts, T00NO10_n10100HreHdrLts, T00NO10_A10101HreFabs, T00NO10_n10101HreFabs, T00NO10_A396EmprCod, T00NO10_A252CliCod, T00NO10_n252CliCod
            }
            , new Object[] {
            T00NO11_A279CliNom
            }
            , new Object[] {
            T00NO12_A396EmprCod, T00NO12_A4492HreBarCod, T00NO12_A4493HreBarReo, T00NO12_A4494HreBarPar, T00NO12_A4495HreNumCie
            }
            , new Object[] {
            T00NO13_A396EmprCod, T00NO13_A4492HreBarCod, T00NO13_A4493HreBarReo, T00NO13_A4494HreBarPar, T00NO13_A4495HreNumCie
            }
            , new Object[] {
            T00NO14_A396EmprCod, T00NO14_A4492HreBarCod, T00NO14_A4493HreBarReo, T00NO14_A4494HreBarPar, T00NO14_A4495HreNumCie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00NO18_A279CliNom
            }
            , new Object[] {
            T00NO19_A396EmprCod, T00NO19_A4492HreBarCod, T00NO19_A4493HreBarReo, T00NO19_A4494HreBarPar, T00NO19_A4495HreNumCie, T00NO19_A9985HreAcCod, T00NO19_A9986HreAcReo, T00NO19_A9987HreAcPar
            }
            , new Object[] {
            T00NO20_A396EmprCod, T00NO20_A4492HreBarCod, T00NO20_A4493HreBarReo, T00NO20_A4494HreBarPar, T00NO20_A4495HreNumCie, T00NO20_A5864HreProCodP, T00NO20_A5865HreOrdLinF
            }
            , new Object[] {
            T00NO21_A396EmprCod, T00NO21_A4492HreBarCod, T00NO21_A4493HreBarReo, T00NO21_A4494HreBarPar, T00NO21_A4495HreNumCie, T00NO21_A4545HreLinMaq
            }
            , new Object[] {
            T00NO22_A396EmprCod, T00NO22_A4492HreBarCod, T00NO22_A4493HreBarReo, T00NO22_A4494HreBarPar, T00NO22_A4495HreNumCie, T00NO22_A4508HreLinMAL, T00NO22_A4509HreNumAny, T00NO22_A719PrdNum
            }
            , new Object[] {
            T00NO23_A396EmprCod, T00NO23_A4492HreBarCod, T00NO23_A4493HreBarReo, T00NO23_A4494HreBarPar, T00NO23_A4495HreNumCie, T00NO23_A4497HreAgrCod, T00NO23_A4498HreAgrReo, T00NO23_A4499HreAgrPar
            }
            , new Object[] {
            T00NO24_A396EmprCod, T00NO24_A4492HreBarCod, T00NO24_A4493HreBarReo, T00NO24_A4494HreBarPar, T00NO24_A4495HreNumCie
            }
            , new Object[] {
            T00NO25_A4492HreBarCod, T00NO25_A4493HreBarReo, T00NO25_A4494HreBarPar, T00NO25_A4495HreNumCie, T00NO25_A4545HreLinMaq, T00NO25_A4546HreMaqCod, T00NO25_n4546HreMaqCod, T00NO25_A4547HreVolPrd, T00NO25_n4547HreVolPrd, T00NO25_A4548HreFacAbs,
            T00NO25_n4548HreFacAbs, T00NO25_A4584HreFecPes, T00NO25_n4584HreFecPes, T00NO25_A4585HreMaqPes, T00NO25_n4585HreMaqPes, T00NO25_A4549HreULinPro, T00NO25_n4549HreULinPro, T00NO25_A4863HreUsrCod, T00NO25_n4863HreUsrCod, T00NO25_A4960HreFecAlt,
            T00NO25_n4960HreFecAlt, T00NO25_A4961HreUsrMod, T00NO25_n4961HreUsrMod, T00NO25_A4962HreFecMod, T00NO25_n4962HreFecMod, T00NO25_A4963HreFasCod, T00NO25_n4963HreFasCod, T00NO25_A4964HreOrdLin, T00NO25_n4964HreOrdLin, T00NO25_A4965HreNroPar,
            T00NO25_n4965HreNroPar, T00NO25_A4968HreTotKgs, T00NO25_n4968HreTotKgs, T00NO25_A4969HreTotMts, T00NO25_n4969HreTotMts, T00NO25_A4970HreTotPrd, T00NO25_n4970HreTotPrd, T00NO25_A5863HreProPrd, T00NO25_n5863HreProPrd, T00NO25_A5978HreNumRmt,
            T00NO25_n5978HreNumRmt, T00NO25_A5979HreNumReo, T00NO25_n5979HreNumReo, T00NO25_A10102HreNumInt, T00NO25_n10102HreNumInt, T00NO25_A10103HreDti, T00NO25_n10103HreDti, T00NO25_A10104HreDtf, T00NO25_n10104HreDtf, T00NO25_A396EmprCod
            }
            , new Object[] {
            T00NO26_A396EmprCod, T00NO26_A4492HreBarCod, T00NO26_A4493HreBarReo, T00NO26_A4494HreBarPar, T00NO26_A4495HreNumCie, T00NO26_A4545HreLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00NO30_A396EmprCod, T00NO30_A4492HreBarCod, T00NO30_A4493HreBarReo, T00NO30_A4494HreBarPar, T00NO30_A4495HreNumCie, T00NO30_A4545HreLinMaq, T00NO30_A14278HreNormId
            }
            , new Object[] {
            T00NO31_A396EmprCod, T00NO31_A4492HreBarCod, T00NO31_A4493HreBarReo, T00NO31_A4494HreBarPar, T00NO31_A4495HreNumCie, T00NO31_A4545HreLinMaq, T00NO31_A14282HreTraID
            }
            , new Object[] {
            T00NO32_A396EmprCod, T00NO32_A4492HreBarCod, T00NO32_A4493HreBarReo, T00NO32_A4494HreBarPar, T00NO32_A4495HreNumCie, T00NO32_A4545HreLinMaq, T00NO32_A4550HreLinPro, T00NO32_A4557HreRecLin
            }
            , new Object[] {
            T00NO33_A396EmprCod, T00NO33_A4492HreBarCod, T00NO33_A4493HreBarReo, T00NO33_A4494HreBarPar, T00NO33_A4495HreNumCie, T00NO33_A4545HreLinMaq, T00NO33_A11322HreLinObs
            }
            , new Object[] {
            T00NO34_A396EmprCod, T00NO34_A4492HreBarCod, T00NO34_A4493HreBarReo, T00NO34_A4494HreBarPar, T00NO34_A4495HreNumCie, T00NO34_A4545HreLinMaq
            }
            , new Object[] {
            T00NO35_A4492HreBarCod, T00NO35_A4493HreBarReo, T00NO35_A4494HreBarPar, T00NO35_A4495HreNumCie, T00NO35_A4545HreLinMaq, T00NO35_A4550HreLinPro, T00NO35_A4551HreProCod, T00NO35_A4552HreProDsc, T00NO35_A4553HreProTie, T00NO35_A4554HreProTmx,
            T00NO35_A4555HreNumPro, T00NO35_A4556HreNumRec, T00NO35_A4966HreVolPro, T00NO35_A5947HreTieprg, T00NO35_A5948HreNroPrg, T00NO35_A396EmprCod
            }
            , new Object[] {
            T00NO36_A396EmprCod, T00NO36_A4492HreBarCod, T00NO36_A4493HreBarReo, T00NO36_A4494HreBarPar, T00NO36_A4495HreNumCie, T00NO36_A4545HreLinMaq, T00NO36_A4550HreLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00NO40_A396EmprCod, T00NO40_A4492HreBarCod, T00NO40_A4493HreBarReo, T00NO40_A4494HreBarPar, T00NO40_A4495HreNumCie, T00NO40_A4545HreLinMaq, T00NO40_A4550HreLinPro, T00NO40_A4557HreRecLin
            }
            , new Object[] {
            T00NO41_A396EmprCod, T00NO41_A4492HreBarCod, T00NO41_A4493HreBarReo, T00NO41_A4494HreBarPar, T00NO41_A4495HreNumCie, T00NO41_A4545HreLinMaq, T00NO41_A4550HreLinPro
            }
            , new Object[] {
            T00NO42_A407EmprNom, T00NO42_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z4525HreTipCol ;
   private byte Z4539HreIntCod ;
   private byte Z4585HreMaqPes ;
   private byte Z4549HreULinPro ;
   private byte Z4550HreLinPro ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A4550HreLinPro ;
   private byte A4585HreMaqPes ;
   private byte A4549HreULinPro ;
   private byte Gx_BScreen ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private byte ZZ4525HreTipCol ;
   private byte ZZ4539HreIntCod ;
   private short Z4519HreTipArt ;
   private short Z4545HreLinMaq ;
   private short Z4964HreOrdLin ;
   private short nRcdDeleted_678 ;
   private short nRcdExists_678 ;
   private short nIsMod_678 ;
   private short Z4553HreProTie ;
   private short Z4554HreProTmx ;
   private short Z5947HreTieprg ;
   private short Z5948HreNroPrg ;
   private short nRcdDeleted_1874 ;
   private short nRcdExists_1874 ;
   private short nIsMod_1874 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4519HreTipArt ;
   private short nBlankRcdCount678 ;
   private short RcdFound678 ;
   private short nBlankRcdUsr678 ;
   private short RcdFound1874 ;
   private short A4553HreProTie ;
   private short A4554HreProTmx ;
   private short A5947HreTieprg ;
   private short A5948HreNroPrg ;
   private short A4545HreLinMaq ;
   private short A4964HreOrdLin ;
   private short RcdFound675 ;
   private short nIsDirty_675 ;
   private short nIsDirty_678 ;
   private short nIsDirty_1874 ;
   private short nBlankRcdCount1874 ;
   private short nBlankRcdUsr1874 ;
   private short subGrid1_Borderwidth ;
   private short ZZ4519HreTipArt ;
   private int Z4492HreBarCod ;
   private int Z4522HreColNum ;
   private int Z4524HreColNumC ;
   private int Z4534HreBarPie ;
   private int Z4544HreTotPie ;
   private int Z9805HreLtsSR ;
   private int Z9806HreLtsRs ;
   private int Z10099HreLtsRc ;
   private int Z252CliCod ;
   private int nRC_GXsfl_255 ;
   private int nGXsfl_255_idx=1 ;
   private int Z4547HreVolPrd ;
   private int Z4965HreNroPar ;
   private int Z4970HreTotPrd ;
   private int Z5978HreNumRmt ;
   private int Z5979HreNumReo ;
   private int Z10102HreNumInt ;
   private int nRC_GXsfl_377 ;
   private int nGXsfl_377_idx=1 ;
   private int Z4555HreNumPro ;
   private int Z4556HreNumRec ;
   private int Z4966HreVolPro ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int A4492HreBarCod ;
   private int edtHreBarCod_Enabled ;
   private int edtHreBarReo_Enabled ;
   private int edtHreBarPar_Enabled ;
   private int edtHreNumCie_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtHreDisCli_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtHreBarSer_Enabled ;
   private int edtHreBarDsc_Enabled ;
   private int edtHreTipArt_Enabled ;
   private int edtHreTipArtD_Enabled ;
   private int edtHreColNom_Enabled ;
   private int A4522HreColNum ;
   private int edtHreColNum_Enabled ;
   private int edtHreColNomC_Enabled ;
   private int A4524HreColNumC ;
   private int edtHreColNumC_Enabled ;
   private int edtHreTipCol_Enabled ;
   private int edtHreTipColN_Enabled ;
   private int edtHreFecGen_Enabled ;
   private int edtHreFecCli_Enabled ;
   private int edtHreFecTin_Enabled ;
   private int edtHreFecFpr_Enabled ;
   private int edtHreBarMat_Enabled ;
   private int edtHreBarKgm_Enabled ;
   private int edtHreBarMtr_Enabled ;
   private int A4534HreBarPie ;
   private int edtHreBarPie_Enabled ;
   private int edtHrePartCod_Enabled ;
   private int edtHreBarNMtr_Enabled ;
   private int edtHreBarNMez_Enabled ;
   private int edtHreNumTen_Enabled ;
   private int edtHreIntCod_Enabled ;
   private int edtHreIntDsc_Enabled ;
   private int edtHreNumTon_Enabled ;
   private int edtHreMaqHdr_Enabled ;
   private int edtHreTotKgm_Enabled ;
   private int edtHreTotMtr_Enabled ;
   private int A4544HreTotPie ;
   private int edtHreTotPie_Enabled ;
   private int A9805HreLtsSR ;
   private int edtHreLtsSR_Enabled ;
   private int A9806HreLtsRs ;
   private int edtHreLtsRs_Enabled ;
   private int edtHreAcaQm_Enabled ;
   private int edtHreRacab_Enabled ;
   private int edtHreFecAcb_Enabled ;
   private int edtHreAbs_Enabled ;
   private int A10099HreLtsRc ;
   private int edtHreLtsRc_Enabled ;
   private int edtHreHdrLts_Enabled ;
   private int edtHreFabs_Enabled ;
   private int edtHreLinMaq_Enabled ;
   private int edtHreMaqCod_Enabled ;
   private int edtHreVolPrd_Enabled ;
   private int edtHreFacAbs_Enabled ;
   private int edtHreFecPes_Enabled ;
   private int edtHreMaqPes_Enabled ;
   private int edtHreULinPro_Enabled ;
   private int edtHreUsrCod_Enabled ;
   private int edtHreFecAlt_Enabled ;
   private int edtHreUsrMod_Enabled ;
   private int edtHreFecMod_Enabled ;
   private int edtHreFasCod_Enabled ;
   private int edtHreOrdLin_Enabled ;
   private int edtHreNroPar_Enabled ;
   private int edtHreTotKgs_Enabled ;
   private int edtHreTotMts_Enabled ;
   private int edtHreTotPrd_Enabled ;
   private int edtHreProPrd_Enabled ;
   private int edtHreNumRmt_Enabled ;
   private int edtHreNumReo_Enabled ;
   private int edtHreNumInt_Enabled ;
   private int edtHreDti_Enabled ;
   private int edtHreDtf_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_1874_Enabled ;
   private int A4555HreNumPro ;
   private int A4556HreNumRec ;
   private int A4966HreVolPro ;
   private int edtHreLinPro_Enabled ;
   private int edtHreProCod_Enabled ;
   private int edtHreProDsc_Enabled ;
   private int edtHreProTie_Enabled ;
   private int edtHreProTmx_Enabled ;
   private int edtHreNumPro_Enabled ;
   private int edtHreNumRec_Enabled ;
   private int edtHreVolPro_Enabled ;
   private int edtHreTieprg_Enabled ;
   private int edtHreNroPrg_Enabled ;
   private int A4547HreVolPrd ;
   private int A4965HreNroPar ;
   private int A4970HreTotPrd ;
   private int A5978HreNumRmt ;
   private int A5979HreNumReo ;
   private int A10102HreNumInt ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtHreLinPro_Enabled ;
   private int defedtHreLinMaq_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtHreFabs_Backcolor ;
   private int edtHreHdrLts_Backcolor ;
   private int edtHreLtsRc_Backcolor ;
   private int edtHreAbs_Backcolor ;
   private int edtHreFecAcb_Backcolor ;
   private int edtHreRacab_Backcolor ;
   private int edtHreAcaQm_Backcolor ;
   private int edtHreLtsRs_Backcolor ;
   private int edtHreLtsSR_Backcolor ;
   private int edtHreTotPie_Backcolor ;
   private int edtHreTotMtr_Backcolor ;
   private int edtHreTotKgm_Backcolor ;
   private int edtHreMaqHdr_Backcolor ;
   private int edtHreNumTon_Backcolor ;
   private int edtHreIntDsc_Backcolor ;
   private int edtHreIntCod_Backcolor ;
   private int edtHreNumTen_Backcolor ;
   private int edtHreBarNMez_Backcolor ;
   private int edtHreBarNMtr_Backcolor ;
   private int edtHrePartCod_Backcolor ;
   private int edtHreBarPie_Backcolor ;
   private int edtHreBarMtr_Backcolor ;
   private int edtHreBarKgm_Backcolor ;
   private int edtHreBarMat_Backcolor ;
   private int edtHreFecFpr_Backcolor ;
   private int edtHreFecTin_Backcolor ;
   private int edtHreFecCli_Backcolor ;
   private int edtHreFecGen_Backcolor ;
   private int edtHreTipColN_Backcolor ;
   private int edtHreTipCol_Backcolor ;
   private int edtHreColNumC_Backcolor ;
   private int edtHreColNomC_Backcolor ;
   private int edtHreColNum_Backcolor ;
   private int edtHreColNom_Backcolor ;
   private int edtHreTipArtD_Backcolor ;
   private int edtHreTipArt_Backcolor ;
   private int edtHreBarDsc_Backcolor ;
   private int edtHreBarSer_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtHreDisCli_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ4492HreBarCod ;
   private int ZZ252CliCod ;
   private int ZZ4522HreColNum ;
   private int ZZ4524HreColNumC ;
   private int ZZ4534HreBarPie ;
   private int ZZ4544HreTotPie ;
   private int ZZ9805HreLtsSR ;
   private int ZZ9806HreLtsRs ;
   private int ZZ10099HreLtsRc ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z4532HreBarKgm ;
   private java.math.BigDecimal Z4533HreBarMtr ;
   private java.math.BigDecimal Z4542HreTotKgm ;
   private java.math.BigDecimal Z4543HreTotMtr ;
   private java.math.BigDecimal Z9810HreAbs ;
   private java.math.BigDecimal Z10101HreFabs ;
   private java.math.BigDecimal Z4548HreFacAbs ;
   private java.math.BigDecimal Z4968HreTotKgs ;
   private java.math.BigDecimal Z4969HreTotMts ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4533HreBarMtr ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4543HreTotMtr ;
   private java.math.BigDecimal A9810HreAbs ;
   private java.math.BigDecimal A10101HreFabs ;
   private java.math.BigDecimal A4548HreFacAbs ;
   private java.math.BigDecimal A4968HreTotKgs ;
   private java.math.BigDecimal A4969HreTotMts ;
   private java.math.BigDecimal ZZ4532HreBarKgm ;
   private java.math.BigDecimal ZZ4533HreBarMtr ;
   private java.math.BigDecimal ZZ4542HreTotKgm ;
   private java.math.BigDecimal ZZ4543HreTotMtr ;
   private java.math.BigDecimal ZZ9810HreAbs ;
   private java.math.BigDecimal ZZ10101HreFabs ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z4516HreDisCli ;
   private String Z4517HreBarSer ;
   private String Z4518HreBarDsc ;
   private String Z4520HreTipArtD ;
   private String Z4521HreColNom ;
   private String Z4523HreColNomC ;
   private String Z4526HreTipColN ;
   private String Z4531HreBarMat ;
   private String Z4535HrePartCod ;
   private String Z4536HreBarNMtr ;
   private String Z4537HreBarNMez ;
   private String Z4538HreNumTen ;
   private String Z4540HreIntDsc ;
   private String Z4541HreNumTon ;
   private String Z4496HreMaqHdr ;
   private String Z9807HreAcaQm ;
   private String Z9808HreRacab ;
   private String Z10100HreHdrLts ;
   private String Z4546HreMaqCod ;
   private String Z4863HreUsrCod ;
   private String Z4961HreUsrMod ;
   private String Z4963HreFasCod ;
   private String Z5863HreProPrd ;
   private String Z4551HreProCod ;
   private String Z4552HreProDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtHreBarCod_Internalname ;
   private String sGXsfl_255_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_377_idx="0001" ;
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
   private String A4494HreBarPar ;
   private String edtHreBarPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreDisCli_Internalname ;
   private String A4516HreDisCli ;
   private String edtHreDisCli_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHreBarSer_Internalname ;
   private String A4517HreBarSer ;
   private String edtHreBarSer_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtHreBarDsc_Internalname ;
   private String A4518HreBarDsc ;
   private String edtHreBarDsc_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtHreTipArt_Internalname ;
   private String edtHreTipArt_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtHreTipArtD_Internalname ;
   private String A4520HreTipArtD ;
   private String edtHreTipArtD_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtHreColNom_Internalname ;
   private String A4521HreColNom ;
   private String edtHreColNom_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtHreColNum_Internalname ;
   private String edtHreColNum_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtHreColNomC_Internalname ;
   private String A4523HreColNomC ;
   private String edtHreColNomC_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtHreColNumC_Internalname ;
   private String edtHreColNumC_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtHreTipCol_Internalname ;
   private String edtHreTipCol_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtHreTipColN_Internalname ;
   private String A4526HreTipColN ;
   private String edtHreTipColN_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtHreFecGen_Internalname ;
   private String edtHreFecGen_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtHreFecCli_Internalname ;
   private String edtHreFecCli_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtHreFecTin_Internalname ;
   private String edtHreFecTin_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtHreFecFpr_Internalname ;
   private String edtHreFecFpr_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtHreBarMat_Internalname ;
   private String A4531HreBarMat ;
   private String edtHreBarMat_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtHreBarKgm_Internalname ;
   private String edtHreBarKgm_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtHreBarMtr_Internalname ;
   private String edtHreBarMtr_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtHreBarPie_Internalname ;
   private String edtHreBarPie_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtHrePartCod_Internalname ;
   private String A4535HrePartCod ;
   private String edtHrePartCod_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtHreBarNMtr_Internalname ;
   private String A4536HreBarNMtr ;
   private String edtHreBarNMtr_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtHreBarNMez_Internalname ;
   private String A4537HreBarNMez ;
   private String edtHreBarNMez_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtHreNumTen_Internalname ;
   private String A4538HreNumTen ;
   private String edtHreNumTen_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtHreIntCod_Internalname ;
   private String edtHreIntCod_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtHreIntDsc_Internalname ;
   private String A4540HreIntDsc ;
   private String edtHreIntDsc_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtHreNumTon_Internalname ;
   private String A4541HreNumTon ;
   private String edtHreNumTon_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtHreMaqHdr_Internalname ;
   private String A4496HreMaqHdr ;
   private String edtHreMaqHdr_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtHreTotKgm_Internalname ;
   private String edtHreTotKgm_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtHreTotMtr_Internalname ;
   private String edtHreTotMtr_Jsonclick ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock38_Jsonclick ;
   private String edtHreTotPie_Internalname ;
   private String edtHreTotPie_Jsonclick ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock39_Jsonclick ;
   private String edtHreLtsSR_Internalname ;
   private String edtHreLtsSR_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtHreLtsRs_Internalname ;
   private String edtHreLtsRs_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtHreAcaQm_Internalname ;
   private String A9807HreAcaQm ;
   private String edtHreAcaQm_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtHreRacab_Internalname ;
   private String A9808HreRacab ;
   private String edtHreRacab_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtHreFecAcb_Internalname ;
   private String edtHreFecAcb_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtHreAbs_Internalname ;
   private String edtHreAbs_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtHreLtsRc_Internalname ;
   private String edtHreLtsRc_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtHreHdrLts_Internalname ;
   private String A10100HreHdrLts ;
   private String edtHreHdrLts_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtHreFabs_Internalname ;
   private String edtHreFabs_Jsonclick ;
   private String sMode678 ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreMaqCod_Internalname ;
   private String edtHreVolPrd_Internalname ;
   private String edtHreFacAbs_Internalname ;
   private String edtHreFecPes_Internalname ;
   private String edtHreMaqPes_Internalname ;
   private String edtHreULinPro_Internalname ;
   private String edtHreUsrCod_Internalname ;
   private String edtHreFecAlt_Internalname ;
   private String edtHreUsrMod_Internalname ;
   private String edtHreFecMod_Internalname ;
   private String edtHreFasCod_Internalname ;
   private String edtHreOrdLin_Internalname ;
   private String edtHreNroPar_Internalname ;
   private String edtHreTotKgs_Internalname ;
   private String edtHreTotMts_Internalname ;
   private String edtHreTotPrd_Internalname ;
   private String edtHreProPrd_Internalname ;
   private String edtHreNumRmt_Internalname ;
   private String edtHreNumReo_Internalname ;
   private String edtHreNumInt_Internalname ;
   private String edtHreDti_Internalname ;
   private String edtHreDtf_Internalname ;
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
   private String AV17UsurCod ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_1874_Internalname ;
   private String sMode675 ;
   private String GXCCtl ;
   private String edtHreLinPro_Internalname ;
   private String edtHreProCod_Internalname ;
   private String A4551HreProCod ;
   private String edtHreProDsc_Internalname ;
   private String A4552HreProDsc ;
   private String edtHreProTie_Internalname ;
   private String edtHreProTmx_Internalname ;
   private String edtHreNumPro_Internalname ;
   private String edtHreNumRec_Internalname ;
   private String edtHreVolPro_Internalname ;
   private String edtHreTieprg_Internalname ;
   private String edtHreNroPrg_Internalname ;
   private String A4546HreMaqCod ;
   private String A4863HreUsrCod ;
   private String A4961HreUsrMod ;
   private String A4963HreFasCod ;
   private String A5863HreProPrd ;
   private String AV23Lit0 ;
   private String AV24Lit1 ;
   private String AV25Lit2 ;
   private String AV26Lit3 ;
   private String AV27Lit4 ;
   private String AV28Lit5 ;
   private String AV29Lit6 ;
   private String AV30Lit7 ;
   private String AV31Lit8 ;
   private String AV32Lit9 ;
   private String AV33Lit10 ;
   private String AV34Lit11 ;
   private String AV35Lit12 ;
   private String AV36Lit13 ;
   private String AV37Lit14 ;
   private String AV38Lit15 ;
   private String AV39Lit16 ;
   private String AV40Lit17 ;
   private String AV41Lit18 ;
   private String AV42Lit19 ;
   private String AV43Lit20 ;
   private String AV44Lit21 ;
   private String AV45Lit22 ;
   private String AV46Lit23 ;
   private String AV47Lit24 ;
   private String AV48Lit25 ;
   private String AV49Lit26 ;
   private String AV50Lit27 ;
   private String AV51Lit28 ;
   private String AV52Lit29 ;
   private String AV53Lit30 ;
   private String AV55Lit43 ;
   private String AV56Lit44 ;
   private String AV57Lit45 ;
   private String AV58Lit46 ;
   private String AV59Lit47 ;
   private String AV60Lit48 ;
   private String AV61Lit49 ;
   private String AV62Lit50 ;
   private String AV63Lit51 ;
   private String AV66Lit52 ;
   private String AV67Lit53 ;
   private String AV68Lit58 ;
   private String AV70Lit59 ;
   private String AV69Lit60 ;
   private String AV71Lit61 ;
   private String AV73Lit62 ;
   private String AV74Lit63 ;
   private String AV65LitFe ;
   private String AV64msg0 ;
   private String GXt_char1 ;
   private String AV22Station ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char4[] ;
   private String AV19ImpCod ;
   private String GXv_char3[] ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1874 ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock52_Internalname ;
   private String lblTextblock53_Internalname ;
   private String lblTextblock54_Internalname ;
   private String lblTextblock55_Internalname ;
   private String lblTextblock56_Internalname ;
   private String lblTextblock57_Internalname ;
   private String lblTextblock58_Internalname ;
   private String lblTextblock59_Internalname ;
   private String lblTextblock60_Internalname ;
   private String lblTextblock61_Internalname ;
   private String lblTextblock62_Internalname ;
   private String lblTextblock63_Internalname ;
   private String lblTextblock64_Internalname ;
   private String lblTextblock65_Internalname ;
   private String lblTextblock66_Internalname ;
   private String lblTextblock67_Internalname ;
   private String lblTextblock68_Internalname ;
   private String lblTextblock69_Internalname ;
   private String lblTextblock70_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_255_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String ROClassString ;
   private String edtHreLinMaq_Jsonclick ;
   private String lblTextblock49_Jsonclick ;
   private String edtHreMaqCod_Jsonclick ;
   private String lblTextblock50_Jsonclick ;
   private String edtHreVolPrd_Jsonclick ;
   private String lblTextblock51_Jsonclick ;
   private String edtHreFacAbs_Jsonclick ;
   private String lblTextblock52_Jsonclick ;
   private String edtHreFecPes_Jsonclick ;
   private String lblTextblock53_Jsonclick ;
   private String edtHreMaqPes_Jsonclick ;
   private String lblTextblock54_Jsonclick ;
   private String edtHreULinPro_Jsonclick ;
   private String lblTextblock55_Jsonclick ;
   private String edtHreUsrCod_Jsonclick ;
   private String lblTextblock56_Jsonclick ;
   private String edtHreFecAlt_Jsonclick ;
   private String lblTextblock57_Jsonclick ;
   private String edtHreUsrMod_Jsonclick ;
   private String lblTextblock58_Jsonclick ;
   private String edtHreFecMod_Jsonclick ;
   private String lblTextblock59_Jsonclick ;
   private String edtHreFasCod_Jsonclick ;
   private String lblTextblock60_Jsonclick ;
   private String edtHreOrdLin_Jsonclick ;
   private String lblTextblock61_Jsonclick ;
   private String edtHreNroPar_Jsonclick ;
   private String lblTextblock62_Jsonclick ;
   private String edtHreTotKgs_Jsonclick ;
   private String lblTextblock63_Jsonclick ;
   private String edtHreTotMts_Jsonclick ;
   private String lblTextblock64_Jsonclick ;
   private String edtHreTotPrd_Jsonclick ;
   private String lblTextblock65_Jsonclick ;
   private String edtHreProPrd_Jsonclick ;
   private String lblTextblock66_Jsonclick ;
   private String edtHreNumRmt_Jsonclick ;
   private String lblTextblock67_Jsonclick ;
   private String edtHreNumReo_Jsonclick ;
   private String lblTextblock68_Jsonclick ;
   private String edtHreNumInt_Jsonclick ;
   private String lblTextblock69_Jsonclick ;
   private String edtHreDti_Jsonclick ;
   private String lblTextblock70_Jsonclick ;
   private String edtHreDtf_Jsonclick ;
   private String sGXsfl_377_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_1874_Jsonclick ;
   private String edtHreLinPro_Jsonclick ;
   private String edtHreProCod_Jsonclick ;
   private String edtHreProDsc_Jsonclick ;
   private String edtHreProTie_Jsonclick ;
   private String edtHreProTmx_Jsonclick ;
   private String edtHreNumPro_Jsonclick ;
   private String edtHreNumRec_Jsonclick ;
   private String edtHreVolPro_Jsonclick ;
   private String edtHreTieprg_Jsonclick ;
   private String edtHreNroPrg_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock48_Caption ;
   private String lblTextblock35_Caption ;
   private String lblTextblock50_Caption ;
   private String lblTextblock51_Caption ;
   private String lblTextblock52_Caption ;
   private String lblTextblock53_Caption ;
   private String lblTextblock54_Caption ;
   private String lblTextblock55_Caption ;
   private String lblTextblock56_Caption ;
   private String lblTextblock57_Caption ;
   private String lblTextblock58_Caption ;
   private String lblTextblock59_Caption ;
   private String lblTextblock60_Caption ;
   private String lblTextblock61_Caption ;
   private String lblTextblock62_Caption ;
   private String lblTextblock63_Caption ;
   private String lblTextblock64_Caption ;
   private String lblTextblock65_Caption ;
   private String lblTextblock66_Caption ;
   private String lblTextblock67_Caption ;
   private String lblTextblock68_Caption ;
   private String lblTextblock69_Caption ;
   private String lblTextblock70_Caption ;
   private String subGrid2_Header ;
   private String ZV17UsurCod ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ407EmprNom ;
   private String ZZ4516HreDisCli ;
   private String ZZ4517HreBarSer ;
   private String ZZ4518HreBarDsc ;
   private String ZZ4520HreTipArtD ;
   private String ZZ4521HreColNom ;
   private String ZZ4523HreColNomC ;
   private String ZZ4526HreTipColN ;
   private String ZZ4531HreBarMat ;
   private String ZZ4535HrePartCod ;
   private String ZZ4536HreBarNMtr ;
   private String ZZ4537HreBarNMez ;
   private String ZZ4538HreNumTen ;
   private String ZZ4540HreIntDsc ;
   private String ZZ4541HreNumTon ;
   private String ZZ4496HreMaqHdr ;
   private String ZZ9807HreAcaQm ;
   private String ZZ9808HreRacab ;
   private String ZZ10100HreHdrLts ;
   private String ZZV17UsurCod ;
   private String ZZ279CliNom ;
   private java.util.Date Z9809HreFecAcb ;
   private java.util.Date Z4584HreFecPes ;
   private java.util.Date Z4960HreFecAlt ;
   private java.util.Date Z4962HreFecMod ;
   private java.util.Date Z10103HreDti ;
   private java.util.Date Z10104HreDtf ;
   private java.util.Date A9809HreFecAcb ;
   private java.util.Date A4584HreFecPes ;
   private java.util.Date A4960HreFecAlt ;
   private java.util.Date A4962HreFecMod ;
   private java.util.Date A10103HreDti ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date ZZ9809HreFecAcb ;
   private java.util.Date Z4527HreFecGen ;
   private java.util.Date Z4528HreFecCli ;
   private java.util.Date Z4529HreFecTin ;
   private java.util.Date Z4530HreFecFpr ;
   private java.util.Date A4527HreFecGen ;
   private java.util.Date A4528HreFecCli ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date A4530HreFecFpr ;
   private java.util.Date ZZ4527HreFecGen ;
   private java.util.Date ZZ4528HreFecCli ;
   private java.util.Date ZZ4529HreFecTin ;
   private java.util.Date ZZ4530HreFecFpr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbErr ;
   private boolean bGXsfl_255_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n4516HreDisCli ;
   private boolean n4517HreBarSer ;
   private boolean n4518HreBarDsc ;
   private boolean n4519HreTipArt ;
   private boolean n4520HreTipArtD ;
   private boolean n4521HreColNom ;
   private boolean n4522HreColNum ;
   private boolean n4523HreColNomC ;
   private boolean n4524HreColNumC ;
   private boolean n4525HreTipCol ;
   private boolean n4526HreTipColN ;
   private boolean n4527HreFecGen ;
   private boolean n4528HreFecCli ;
   private boolean n4529HreFecTin ;
   private boolean n4530HreFecFpr ;
   private boolean n4531HreBarMat ;
   private boolean n4532HreBarKgm ;
   private boolean n4533HreBarMtr ;
   private boolean n4534HreBarPie ;
   private boolean n4535HrePartCod ;
   private boolean n4536HreBarNMtr ;
   private boolean n4537HreBarNMez ;
   private boolean n4538HreNumTen ;
   private boolean n4539HreIntCod ;
   private boolean n4540HreIntDsc ;
   private boolean n4541HreNumTon ;
   private boolean n4496HreMaqHdr ;
   private boolean n4542HreTotKgm ;
   private boolean n4543HreTotMtr ;
   private boolean n4544HreTotPie ;
   private boolean n9805HreLtsSR ;
   private boolean n9806HreLtsRs ;
   private boolean n9807HreAcaQm ;
   private boolean n9808HreRacab ;
   private boolean n9809HreFecAcb ;
   private boolean n9810HreAbs ;
   private boolean n10099HreLtsRc ;
   private boolean n10100HreHdrLts ;
   private boolean n10101HreFabs ;
   private boolean bGXsfl_377_Refreshing=false ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean n4548HreFacAbs ;
   private boolean n4584HreFecPes ;
   private boolean n4585HreMaqPes ;
   private boolean n4549HreULinPro ;
   private boolean n4863HreUsrCod ;
   private boolean n4960HreFecAlt ;
   private boolean n4961HreUsrMod ;
   private boolean n4962HreFecMod ;
   private boolean n4963HreFasCod ;
   private boolean n4964HreOrdLin ;
   private boolean n4965HreNroPar ;
   private boolean n4968HreTotKgs ;
   private boolean n4969HreTotMts ;
   private boolean n4970HreTotPrd ;
   private boolean n5863HreProPrd ;
   private boolean n5978HreNumRmt ;
   private boolean n5979HreNumReo ;
   private boolean n10102HreNumInt ;
   private boolean n10103HreDti ;
   private boolean n10104HreDtf ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private IDataStoreProvider pr_default ;
   private String[] T00NO8_A407EmprNom ;
   private boolean[] T00NO8_n407EmprNom ;
   private int[] T00NO10_A4492HreBarCod ;
   private byte[] T00NO10_A4493HreBarReo ;
   private String[] T00NO10_A4494HreBarPar ;
   private byte[] T00NO10_A4495HreNumCie ;
   private String[] T00NO10_A407EmprNom ;
   private boolean[] T00NO10_n407EmprNom ;
   private String[] T00NO10_A4516HreDisCli ;
   private boolean[] T00NO10_n4516HreDisCli ;
   private String[] T00NO10_A279CliNom ;
   private String[] T00NO10_A4517HreBarSer ;
   private boolean[] T00NO10_n4517HreBarSer ;
   private String[] T00NO10_A4518HreBarDsc ;
   private boolean[] T00NO10_n4518HreBarDsc ;
   private short[] T00NO10_A4519HreTipArt ;
   private boolean[] T00NO10_n4519HreTipArt ;
   private String[] T00NO10_A4520HreTipArtD ;
   private boolean[] T00NO10_n4520HreTipArtD ;
   private String[] T00NO10_A4521HreColNom ;
   private boolean[] T00NO10_n4521HreColNom ;
   private int[] T00NO10_A4522HreColNum ;
   private boolean[] T00NO10_n4522HreColNum ;
   private String[] T00NO10_A4523HreColNomC ;
   private boolean[] T00NO10_n4523HreColNomC ;
   private int[] T00NO10_A4524HreColNumC ;
   private boolean[] T00NO10_n4524HreColNumC ;
   private byte[] T00NO10_A4525HreTipCol ;
   private boolean[] T00NO10_n4525HreTipCol ;
   private String[] T00NO10_A4526HreTipColN ;
   private boolean[] T00NO10_n4526HreTipColN ;
   private java.util.Date[] T00NO10_A4527HreFecGen ;
   private boolean[] T00NO10_n4527HreFecGen ;
   private java.util.Date[] T00NO10_A4528HreFecCli ;
   private boolean[] T00NO10_n4528HreFecCli ;
   private java.util.Date[] T00NO10_A4529HreFecTin ;
   private boolean[] T00NO10_n4529HreFecTin ;
   private java.util.Date[] T00NO10_A4530HreFecFpr ;
   private boolean[] T00NO10_n4530HreFecFpr ;
   private String[] T00NO10_A4531HreBarMat ;
   private boolean[] T00NO10_n4531HreBarMat ;
   private java.math.BigDecimal[] T00NO10_A4532HreBarKgm ;
   private boolean[] T00NO10_n4532HreBarKgm ;
   private java.math.BigDecimal[] T00NO10_A4533HreBarMtr ;
   private boolean[] T00NO10_n4533HreBarMtr ;
   private int[] T00NO10_A4534HreBarPie ;
   private boolean[] T00NO10_n4534HreBarPie ;
   private String[] T00NO10_A4535HrePartCod ;
   private boolean[] T00NO10_n4535HrePartCod ;
   private String[] T00NO10_A4536HreBarNMtr ;
   private boolean[] T00NO10_n4536HreBarNMtr ;
   private String[] T00NO10_A4537HreBarNMez ;
   private boolean[] T00NO10_n4537HreBarNMez ;
   private String[] T00NO10_A4538HreNumTen ;
   private boolean[] T00NO10_n4538HreNumTen ;
   private byte[] T00NO10_A4539HreIntCod ;
   private boolean[] T00NO10_n4539HreIntCod ;
   private String[] T00NO10_A4540HreIntDsc ;
   private boolean[] T00NO10_n4540HreIntDsc ;
   private String[] T00NO10_A4541HreNumTon ;
   private boolean[] T00NO10_n4541HreNumTon ;
   private String[] T00NO10_A4496HreMaqHdr ;
   private boolean[] T00NO10_n4496HreMaqHdr ;
   private java.math.BigDecimal[] T00NO10_A4542HreTotKgm ;
   private boolean[] T00NO10_n4542HreTotKgm ;
   private java.math.BigDecimal[] T00NO10_A4543HreTotMtr ;
   private boolean[] T00NO10_n4543HreTotMtr ;
   private int[] T00NO10_A4544HreTotPie ;
   private boolean[] T00NO10_n4544HreTotPie ;
   private int[] T00NO10_A9805HreLtsSR ;
   private boolean[] T00NO10_n9805HreLtsSR ;
   private int[] T00NO10_A9806HreLtsRs ;
   private boolean[] T00NO10_n9806HreLtsRs ;
   private String[] T00NO10_A9807HreAcaQm ;
   private boolean[] T00NO10_n9807HreAcaQm ;
   private String[] T00NO10_A9808HreRacab ;
   private boolean[] T00NO10_n9808HreRacab ;
   private java.util.Date[] T00NO10_A9809HreFecAcb ;
   private boolean[] T00NO10_n9809HreFecAcb ;
   private java.math.BigDecimal[] T00NO10_A9810HreAbs ;
   private boolean[] T00NO10_n9810HreAbs ;
   private int[] T00NO10_A10099HreLtsRc ;
   private boolean[] T00NO10_n10099HreLtsRc ;
   private String[] T00NO10_A10100HreHdrLts ;
   private boolean[] T00NO10_n10100HreHdrLts ;
   private java.math.BigDecimal[] T00NO10_A10101HreFabs ;
   private boolean[] T00NO10_n10101HreFabs ;
   private String[] T00NO10_A396EmprCod ;
   private int[] T00NO10_A252CliCod ;
   private boolean[] T00NO10_n252CliCod ;
   private String[] T00NO9_A279CliNom ;
   private String[] T00NO11_A279CliNom ;
   private String[] T00NO12_A396EmprCod ;
   private int[] T00NO12_A4492HreBarCod ;
   private byte[] T00NO12_A4493HreBarReo ;
   private String[] T00NO12_A4494HreBarPar ;
   private byte[] T00NO12_A4495HreNumCie ;
   private int[] T00NO7_A4492HreBarCod ;
   private byte[] T00NO7_A4493HreBarReo ;
   private String[] T00NO7_A4494HreBarPar ;
   private byte[] T00NO7_A4495HreNumCie ;
   private String[] T00NO7_A4516HreDisCli ;
   private boolean[] T00NO7_n4516HreDisCli ;
   private String[] T00NO7_A4517HreBarSer ;
   private boolean[] T00NO7_n4517HreBarSer ;
   private String[] T00NO7_A4518HreBarDsc ;
   private boolean[] T00NO7_n4518HreBarDsc ;
   private short[] T00NO7_A4519HreTipArt ;
   private boolean[] T00NO7_n4519HreTipArt ;
   private String[] T00NO7_A4520HreTipArtD ;
   private boolean[] T00NO7_n4520HreTipArtD ;
   private String[] T00NO7_A4521HreColNom ;
   private boolean[] T00NO7_n4521HreColNom ;
   private int[] T00NO7_A4522HreColNum ;
   private boolean[] T00NO7_n4522HreColNum ;
   private String[] T00NO7_A4523HreColNomC ;
   private boolean[] T00NO7_n4523HreColNomC ;
   private int[] T00NO7_A4524HreColNumC ;
   private boolean[] T00NO7_n4524HreColNumC ;
   private byte[] T00NO7_A4525HreTipCol ;
   private boolean[] T00NO7_n4525HreTipCol ;
   private String[] T00NO7_A4526HreTipColN ;
   private boolean[] T00NO7_n4526HreTipColN ;
   private java.util.Date[] T00NO7_A4527HreFecGen ;
   private boolean[] T00NO7_n4527HreFecGen ;
   private java.util.Date[] T00NO7_A4528HreFecCli ;
   private boolean[] T00NO7_n4528HreFecCli ;
   private java.util.Date[] T00NO7_A4529HreFecTin ;
   private boolean[] T00NO7_n4529HreFecTin ;
   private java.util.Date[] T00NO7_A4530HreFecFpr ;
   private boolean[] T00NO7_n4530HreFecFpr ;
   private String[] T00NO7_A4531HreBarMat ;
   private boolean[] T00NO7_n4531HreBarMat ;
   private java.math.BigDecimal[] T00NO7_A4532HreBarKgm ;
   private boolean[] T00NO7_n4532HreBarKgm ;
   private java.math.BigDecimal[] T00NO7_A4533HreBarMtr ;
   private boolean[] T00NO7_n4533HreBarMtr ;
   private int[] T00NO7_A4534HreBarPie ;
   private boolean[] T00NO7_n4534HreBarPie ;
   private String[] T00NO7_A4535HrePartCod ;
   private boolean[] T00NO7_n4535HrePartCod ;
   private String[] T00NO7_A4536HreBarNMtr ;
   private boolean[] T00NO7_n4536HreBarNMtr ;
   private String[] T00NO7_A4537HreBarNMez ;
   private boolean[] T00NO7_n4537HreBarNMez ;
   private String[] T00NO7_A4538HreNumTen ;
   private boolean[] T00NO7_n4538HreNumTen ;
   private byte[] T00NO7_A4539HreIntCod ;
   private boolean[] T00NO7_n4539HreIntCod ;
   private String[] T00NO7_A4540HreIntDsc ;
   private boolean[] T00NO7_n4540HreIntDsc ;
   private String[] T00NO7_A4541HreNumTon ;
   private boolean[] T00NO7_n4541HreNumTon ;
   private String[] T00NO7_A4496HreMaqHdr ;
   private boolean[] T00NO7_n4496HreMaqHdr ;
   private java.math.BigDecimal[] T00NO7_A4542HreTotKgm ;
   private boolean[] T00NO7_n4542HreTotKgm ;
   private java.math.BigDecimal[] T00NO7_A4543HreTotMtr ;
   private boolean[] T00NO7_n4543HreTotMtr ;
   private int[] T00NO7_A4544HreTotPie ;
   private boolean[] T00NO7_n4544HreTotPie ;
   private int[] T00NO7_A9805HreLtsSR ;
   private boolean[] T00NO7_n9805HreLtsSR ;
   private int[] T00NO7_A9806HreLtsRs ;
   private boolean[] T00NO7_n9806HreLtsRs ;
   private String[] T00NO7_A9807HreAcaQm ;
   private boolean[] T00NO7_n9807HreAcaQm ;
   private String[] T00NO7_A9808HreRacab ;
   private boolean[] T00NO7_n9808HreRacab ;
   private java.util.Date[] T00NO7_A9809HreFecAcb ;
   private boolean[] T00NO7_n9809HreFecAcb ;
   private java.math.BigDecimal[] T00NO7_A9810HreAbs ;
   private boolean[] T00NO7_n9810HreAbs ;
   private int[] T00NO7_A10099HreLtsRc ;
   private boolean[] T00NO7_n10099HreLtsRc ;
   private String[] T00NO7_A10100HreHdrLts ;
   private boolean[] T00NO7_n10100HreHdrLts ;
   private java.math.BigDecimal[] T00NO7_A10101HreFabs ;
   private boolean[] T00NO7_n10101HreFabs ;
   private String[] T00NO7_A396EmprCod ;
   private int[] T00NO7_A252CliCod ;
   private boolean[] T00NO7_n252CliCod ;
   private String[] T00NO13_A396EmprCod ;
   private int[] T00NO13_A4492HreBarCod ;
   private byte[] T00NO13_A4493HreBarReo ;
   private String[] T00NO13_A4494HreBarPar ;
   private byte[] T00NO13_A4495HreNumCie ;
   private String[] T00NO14_A396EmprCod ;
   private int[] T00NO14_A4492HreBarCod ;
   private byte[] T00NO14_A4493HreBarReo ;
   private String[] T00NO14_A4494HreBarPar ;
   private byte[] T00NO14_A4495HreNumCie ;
   private int[] T00NO6_A4492HreBarCod ;
   private byte[] T00NO6_A4493HreBarReo ;
   private String[] T00NO6_A4494HreBarPar ;
   private byte[] T00NO6_A4495HreNumCie ;
   private String[] T00NO6_A4516HreDisCli ;
   private boolean[] T00NO6_n4516HreDisCli ;
   private String[] T00NO6_A4517HreBarSer ;
   private boolean[] T00NO6_n4517HreBarSer ;
   private String[] T00NO6_A4518HreBarDsc ;
   private boolean[] T00NO6_n4518HreBarDsc ;
   private short[] T00NO6_A4519HreTipArt ;
   private boolean[] T00NO6_n4519HreTipArt ;
   private String[] T00NO6_A4520HreTipArtD ;
   private boolean[] T00NO6_n4520HreTipArtD ;
   private String[] T00NO6_A4521HreColNom ;
   private boolean[] T00NO6_n4521HreColNom ;
   private int[] T00NO6_A4522HreColNum ;
   private boolean[] T00NO6_n4522HreColNum ;
   private String[] T00NO6_A4523HreColNomC ;
   private boolean[] T00NO6_n4523HreColNomC ;
   private int[] T00NO6_A4524HreColNumC ;
   private boolean[] T00NO6_n4524HreColNumC ;
   private byte[] T00NO6_A4525HreTipCol ;
   private boolean[] T00NO6_n4525HreTipCol ;
   private String[] T00NO6_A4526HreTipColN ;
   private boolean[] T00NO6_n4526HreTipColN ;
   private java.util.Date[] T00NO6_A4527HreFecGen ;
   private boolean[] T00NO6_n4527HreFecGen ;
   private java.util.Date[] T00NO6_A4528HreFecCli ;
   private boolean[] T00NO6_n4528HreFecCli ;
   private java.util.Date[] T00NO6_A4529HreFecTin ;
   private boolean[] T00NO6_n4529HreFecTin ;
   private java.util.Date[] T00NO6_A4530HreFecFpr ;
   private boolean[] T00NO6_n4530HreFecFpr ;
   private String[] T00NO6_A4531HreBarMat ;
   private boolean[] T00NO6_n4531HreBarMat ;
   private java.math.BigDecimal[] T00NO6_A4532HreBarKgm ;
   private boolean[] T00NO6_n4532HreBarKgm ;
   private java.math.BigDecimal[] T00NO6_A4533HreBarMtr ;
   private boolean[] T00NO6_n4533HreBarMtr ;
   private int[] T00NO6_A4534HreBarPie ;
   private boolean[] T00NO6_n4534HreBarPie ;
   private String[] T00NO6_A4535HrePartCod ;
   private boolean[] T00NO6_n4535HrePartCod ;
   private String[] T00NO6_A4536HreBarNMtr ;
   private boolean[] T00NO6_n4536HreBarNMtr ;
   private String[] T00NO6_A4537HreBarNMez ;
   private boolean[] T00NO6_n4537HreBarNMez ;
   private String[] T00NO6_A4538HreNumTen ;
   private boolean[] T00NO6_n4538HreNumTen ;
   private byte[] T00NO6_A4539HreIntCod ;
   private boolean[] T00NO6_n4539HreIntCod ;
   private String[] T00NO6_A4540HreIntDsc ;
   private boolean[] T00NO6_n4540HreIntDsc ;
   private String[] T00NO6_A4541HreNumTon ;
   private boolean[] T00NO6_n4541HreNumTon ;
   private String[] T00NO6_A4496HreMaqHdr ;
   private boolean[] T00NO6_n4496HreMaqHdr ;
   private java.math.BigDecimal[] T00NO6_A4542HreTotKgm ;
   private boolean[] T00NO6_n4542HreTotKgm ;
   private java.math.BigDecimal[] T00NO6_A4543HreTotMtr ;
   private boolean[] T00NO6_n4543HreTotMtr ;
   private int[] T00NO6_A4544HreTotPie ;
   private boolean[] T00NO6_n4544HreTotPie ;
   private int[] T00NO6_A9805HreLtsSR ;
   private boolean[] T00NO6_n9805HreLtsSR ;
   private int[] T00NO6_A9806HreLtsRs ;
   private boolean[] T00NO6_n9806HreLtsRs ;
   private String[] T00NO6_A9807HreAcaQm ;
   private boolean[] T00NO6_n9807HreAcaQm ;
   private String[] T00NO6_A9808HreRacab ;
   private boolean[] T00NO6_n9808HreRacab ;
   private java.util.Date[] T00NO6_A9809HreFecAcb ;
   private boolean[] T00NO6_n9809HreFecAcb ;
   private java.math.BigDecimal[] T00NO6_A9810HreAbs ;
   private boolean[] T00NO6_n9810HreAbs ;
   private int[] T00NO6_A10099HreLtsRc ;
   private boolean[] T00NO6_n10099HreLtsRc ;
   private String[] T00NO6_A10100HreHdrLts ;
   private boolean[] T00NO6_n10100HreHdrLts ;
   private java.math.BigDecimal[] T00NO6_A10101HreFabs ;
   private boolean[] T00NO6_n10101HreFabs ;
   private String[] T00NO6_A396EmprCod ;
   private int[] T00NO6_A252CliCod ;
   private boolean[] T00NO6_n252CliCod ;
   private String[] T00NO18_A279CliNom ;
   private String[] T00NO19_A396EmprCod ;
   private int[] T00NO19_A4492HreBarCod ;
   private byte[] T00NO19_A4493HreBarReo ;
   private String[] T00NO19_A4494HreBarPar ;
   private byte[] T00NO19_A4495HreNumCie ;
   private int[] T00NO19_A9985HreAcCod ;
   private byte[] T00NO19_A9986HreAcReo ;
   private String[] T00NO19_A9987HreAcPar ;
   private String[] T00NO20_A396EmprCod ;
   private int[] T00NO20_A4492HreBarCod ;
   private byte[] T00NO20_A4493HreBarReo ;
   private String[] T00NO20_A4494HreBarPar ;
   private byte[] T00NO20_A4495HreNumCie ;
   private String[] T00NO20_A5864HreProCodP ;
   private short[] T00NO20_A5865HreOrdLinF ;
   private String[] T00NO21_A396EmprCod ;
   private int[] T00NO21_A4492HreBarCod ;
   private byte[] T00NO21_A4493HreBarReo ;
   private String[] T00NO21_A4494HreBarPar ;
   private byte[] T00NO21_A4495HreNumCie ;
   private short[] T00NO21_A4545HreLinMaq ;
   private String[] T00NO22_A396EmprCod ;
   private int[] T00NO22_A4492HreBarCod ;
   private byte[] T00NO22_A4493HreBarReo ;
   private String[] T00NO22_A4494HreBarPar ;
   private byte[] T00NO22_A4495HreNumCie ;
   private short[] T00NO22_A4508HreLinMAL ;
   private byte[] T00NO22_A4509HreNumAny ;
   private String[] T00NO22_A719PrdNum ;
   private String[] T00NO23_A396EmprCod ;
   private int[] T00NO23_A4492HreBarCod ;
   private byte[] T00NO23_A4493HreBarReo ;
   private String[] T00NO23_A4494HreBarPar ;
   private byte[] T00NO23_A4495HreNumCie ;
   private int[] T00NO23_A4497HreAgrCod ;
   private byte[] T00NO23_A4498HreAgrReo ;
   private String[] T00NO23_A4499HreAgrPar ;
   private String[] T00NO24_A396EmprCod ;
   private int[] T00NO24_A4492HreBarCod ;
   private byte[] T00NO24_A4493HreBarReo ;
   private String[] T00NO24_A4494HreBarPar ;
   private byte[] T00NO24_A4495HreNumCie ;
   private int[] T00NO25_A4492HreBarCod ;
   private byte[] T00NO25_A4493HreBarReo ;
   private String[] T00NO25_A4494HreBarPar ;
   private byte[] T00NO25_A4495HreNumCie ;
   private short[] T00NO25_A4545HreLinMaq ;
   private String[] T00NO25_A4546HreMaqCod ;
   private boolean[] T00NO25_n4546HreMaqCod ;
   private int[] T00NO25_A4547HreVolPrd ;
   private boolean[] T00NO25_n4547HreVolPrd ;
   private java.math.BigDecimal[] T00NO25_A4548HreFacAbs ;
   private boolean[] T00NO25_n4548HreFacAbs ;
   private java.util.Date[] T00NO25_A4584HreFecPes ;
   private boolean[] T00NO25_n4584HreFecPes ;
   private byte[] T00NO25_A4585HreMaqPes ;
   private boolean[] T00NO25_n4585HreMaqPes ;
   private byte[] T00NO25_A4549HreULinPro ;
   private boolean[] T00NO25_n4549HreULinPro ;
   private String[] T00NO25_A4863HreUsrCod ;
   private boolean[] T00NO25_n4863HreUsrCod ;
   private java.util.Date[] T00NO25_A4960HreFecAlt ;
   private boolean[] T00NO25_n4960HreFecAlt ;
   private String[] T00NO25_A4961HreUsrMod ;
   private boolean[] T00NO25_n4961HreUsrMod ;
   private java.util.Date[] T00NO25_A4962HreFecMod ;
   private boolean[] T00NO25_n4962HreFecMod ;
   private String[] T00NO25_A4963HreFasCod ;
   private boolean[] T00NO25_n4963HreFasCod ;
   private short[] T00NO25_A4964HreOrdLin ;
   private boolean[] T00NO25_n4964HreOrdLin ;
   private int[] T00NO25_A4965HreNroPar ;
   private boolean[] T00NO25_n4965HreNroPar ;
   private java.math.BigDecimal[] T00NO25_A4968HreTotKgs ;
   private boolean[] T00NO25_n4968HreTotKgs ;
   private java.math.BigDecimal[] T00NO25_A4969HreTotMts ;
   private boolean[] T00NO25_n4969HreTotMts ;
   private int[] T00NO25_A4970HreTotPrd ;
   private boolean[] T00NO25_n4970HreTotPrd ;
   private String[] T00NO25_A5863HreProPrd ;
   private boolean[] T00NO25_n5863HreProPrd ;
   private int[] T00NO25_A5978HreNumRmt ;
   private boolean[] T00NO25_n5978HreNumRmt ;
   private int[] T00NO25_A5979HreNumReo ;
   private boolean[] T00NO25_n5979HreNumReo ;
   private int[] T00NO25_A10102HreNumInt ;
   private boolean[] T00NO25_n10102HreNumInt ;
   private java.util.Date[] T00NO25_A10103HreDti ;
   private boolean[] T00NO25_n10103HreDti ;
   private java.util.Date[] T00NO25_A10104HreDtf ;
   private boolean[] T00NO25_n10104HreDtf ;
   private String[] T00NO25_A396EmprCod ;
   private String[] T00NO26_A396EmprCod ;
   private int[] T00NO26_A4492HreBarCod ;
   private byte[] T00NO26_A4493HreBarReo ;
   private String[] T00NO26_A4494HreBarPar ;
   private byte[] T00NO26_A4495HreNumCie ;
   private short[] T00NO26_A4545HreLinMaq ;
   private int[] T00NO5_A4492HreBarCod ;
   private byte[] T00NO5_A4493HreBarReo ;
   private String[] T00NO5_A4494HreBarPar ;
   private byte[] T00NO5_A4495HreNumCie ;
   private short[] T00NO5_A4545HreLinMaq ;
   private String[] T00NO5_A4546HreMaqCod ;
   private boolean[] T00NO5_n4546HreMaqCod ;
   private int[] T00NO5_A4547HreVolPrd ;
   private boolean[] T00NO5_n4547HreVolPrd ;
   private java.math.BigDecimal[] T00NO5_A4548HreFacAbs ;
   private boolean[] T00NO5_n4548HreFacAbs ;
   private java.util.Date[] T00NO5_A4584HreFecPes ;
   private boolean[] T00NO5_n4584HreFecPes ;
   private byte[] T00NO5_A4585HreMaqPes ;
   private boolean[] T00NO5_n4585HreMaqPes ;
   private byte[] T00NO5_A4549HreULinPro ;
   private boolean[] T00NO5_n4549HreULinPro ;
   private String[] T00NO5_A4863HreUsrCod ;
   private boolean[] T00NO5_n4863HreUsrCod ;
   private java.util.Date[] T00NO5_A4960HreFecAlt ;
   private boolean[] T00NO5_n4960HreFecAlt ;
   private String[] T00NO5_A4961HreUsrMod ;
   private boolean[] T00NO5_n4961HreUsrMod ;
   private java.util.Date[] T00NO5_A4962HreFecMod ;
   private boolean[] T00NO5_n4962HreFecMod ;
   private String[] T00NO5_A4963HreFasCod ;
   private boolean[] T00NO5_n4963HreFasCod ;
   private short[] T00NO5_A4964HreOrdLin ;
   private boolean[] T00NO5_n4964HreOrdLin ;
   private int[] T00NO5_A4965HreNroPar ;
   private boolean[] T00NO5_n4965HreNroPar ;
   private java.math.BigDecimal[] T00NO5_A4968HreTotKgs ;
   private boolean[] T00NO5_n4968HreTotKgs ;
   private java.math.BigDecimal[] T00NO5_A4969HreTotMts ;
   private boolean[] T00NO5_n4969HreTotMts ;
   private int[] T00NO5_A4970HreTotPrd ;
   private boolean[] T00NO5_n4970HreTotPrd ;
   private String[] T00NO5_A5863HreProPrd ;
   private boolean[] T00NO5_n5863HreProPrd ;
   private int[] T00NO5_A5978HreNumRmt ;
   private boolean[] T00NO5_n5978HreNumRmt ;
   private int[] T00NO5_A5979HreNumReo ;
   private boolean[] T00NO5_n5979HreNumReo ;
   private int[] T00NO5_A10102HreNumInt ;
   private boolean[] T00NO5_n10102HreNumInt ;
   private java.util.Date[] T00NO5_A10103HreDti ;
   private boolean[] T00NO5_n10103HreDti ;
   private java.util.Date[] T00NO5_A10104HreDtf ;
   private boolean[] T00NO5_n10104HreDtf ;
   private String[] T00NO5_A396EmprCod ;
   private int[] T00NO4_A4492HreBarCod ;
   private byte[] T00NO4_A4493HreBarReo ;
   private String[] T00NO4_A4494HreBarPar ;
   private byte[] T00NO4_A4495HreNumCie ;
   private short[] T00NO4_A4545HreLinMaq ;
   private String[] T00NO4_A4546HreMaqCod ;
   private boolean[] T00NO4_n4546HreMaqCod ;
   private int[] T00NO4_A4547HreVolPrd ;
   private boolean[] T00NO4_n4547HreVolPrd ;
   private java.math.BigDecimal[] T00NO4_A4548HreFacAbs ;
   private boolean[] T00NO4_n4548HreFacAbs ;
   private java.util.Date[] T00NO4_A4584HreFecPes ;
   private boolean[] T00NO4_n4584HreFecPes ;
   private byte[] T00NO4_A4585HreMaqPes ;
   private boolean[] T00NO4_n4585HreMaqPes ;
   private byte[] T00NO4_A4549HreULinPro ;
   private boolean[] T00NO4_n4549HreULinPro ;
   private String[] T00NO4_A4863HreUsrCod ;
   private boolean[] T00NO4_n4863HreUsrCod ;
   private java.util.Date[] T00NO4_A4960HreFecAlt ;
   private boolean[] T00NO4_n4960HreFecAlt ;
   private String[] T00NO4_A4961HreUsrMod ;
   private boolean[] T00NO4_n4961HreUsrMod ;
   private java.util.Date[] T00NO4_A4962HreFecMod ;
   private boolean[] T00NO4_n4962HreFecMod ;
   private String[] T00NO4_A4963HreFasCod ;
   private boolean[] T00NO4_n4963HreFasCod ;
   private short[] T00NO4_A4964HreOrdLin ;
   private boolean[] T00NO4_n4964HreOrdLin ;
   private int[] T00NO4_A4965HreNroPar ;
   private boolean[] T00NO4_n4965HreNroPar ;
   private java.math.BigDecimal[] T00NO4_A4968HreTotKgs ;
   private boolean[] T00NO4_n4968HreTotKgs ;
   private java.math.BigDecimal[] T00NO4_A4969HreTotMts ;
   private boolean[] T00NO4_n4969HreTotMts ;
   private int[] T00NO4_A4970HreTotPrd ;
   private boolean[] T00NO4_n4970HreTotPrd ;
   private String[] T00NO4_A5863HreProPrd ;
   private boolean[] T00NO4_n5863HreProPrd ;
   private int[] T00NO4_A5978HreNumRmt ;
   private boolean[] T00NO4_n5978HreNumRmt ;
   private int[] T00NO4_A5979HreNumReo ;
   private boolean[] T00NO4_n5979HreNumReo ;
   private int[] T00NO4_A10102HreNumInt ;
   private boolean[] T00NO4_n10102HreNumInt ;
   private java.util.Date[] T00NO4_A10103HreDti ;
   private boolean[] T00NO4_n10103HreDti ;
   private java.util.Date[] T00NO4_A10104HreDtf ;
   private boolean[] T00NO4_n10104HreDtf ;
   private String[] T00NO4_A396EmprCod ;
   private String[] T00NO30_A396EmprCod ;
   private int[] T00NO30_A4492HreBarCod ;
   private byte[] T00NO30_A4493HreBarReo ;
   private String[] T00NO30_A4494HreBarPar ;
   private byte[] T00NO30_A4495HreNumCie ;
   private short[] T00NO30_A4545HreLinMaq ;
   private String[] T00NO30_A14278HreNormId ;
   private String[] T00NO31_A396EmprCod ;
   private int[] T00NO31_A4492HreBarCod ;
   private byte[] T00NO31_A4493HreBarReo ;
   private String[] T00NO31_A4494HreBarPar ;
   private byte[] T00NO31_A4495HreNumCie ;
   private short[] T00NO31_A4545HreLinMaq ;
   private String[] T00NO31_A14282HreTraID ;
   private String[] T00NO32_A396EmprCod ;
   private int[] T00NO32_A4492HreBarCod ;
   private byte[] T00NO32_A4493HreBarReo ;
   private String[] T00NO32_A4494HreBarPar ;
   private byte[] T00NO32_A4495HreNumCie ;
   private short[] T00NO32_A4545HreLinMaq ;
   private byte[] T00NO32_A4550HreLinPro ;
   private short[] T00NO32_A4557HreRecLin ;
   private String[] T00NO33_A396EmprCod ;
   private int[] T00NO33_A4492HreBarCod ;
   private byte[] T00NO33_A4493HreBarReo ;
   private String[] T00NO33_A4494HreBarPar ;
   private byte[] T00NO33_A4495HreNumCie ;
   private short[] T00NO33_A4545HreLinMaq ;
   private short[] T00NO33_A11322HreLinObs ;
   private String[] T00NO34_A396EmprCod ;
   private int[] T00NO34_A4492HreBarCod ;
   private byte[] T00NO34_A4493HreBarReo ;
   private String[] T00NO34_A4494HreBarPar ;
   private byte[] T00NO34_A4495HreNumCie ;
   private short[] T00NO34_A4545HreLinMaq ;
   private int[] T00NO35_A4492HreBarCod ;
   private byte[] T00NO35_A4493HreBarReo ;
   private String[] T00NO35_A4494HreBarPar ;
   private byte[] T00NO35_A4495HreNumCie ;
   private short[] T00NO35_A4545HreLinMaq ;
   private byte[] T00NO35_A4550HreLinPro ;
   private String[] T00NO35_A4551HreProCod ;
   private String[] T00NO35_A4552HreProDsc ;
   private short[] T00NO35_A4553HreProTie ;
   private short[] T00NO35_A4554HreProTmx ;
   private int[] T00NO35_A4555HreNumPro ;
   private int[] T00NO35_A4556HreNumRec ;
   private int[] T00NO35_A4966HreVolPro ;
   private short[] T00NO35_A5947HreTieprg ;
   private short[] T00NO35_A5948HreNroPrg ;
   private String[] T00NO35_A396EmprCod ;
   private String[] T00NO36_A396EmprCod ;
   private int[] T00NO36_A4492HreBarCod ;
   private byte[] T00NO36_A4493HreBarReo ;
   private String[] T00NO36_A4494HreBarPar ;
   private byte[] T00NO36_A4495HreNumCie ;
   private short[] T00NO36_A4545HreLinMaq ;
   private byte[] T00NO36_A4550HreLinPro ;
   private int[] T00NO3_A4492HreBarCod ;
   private byte[] T00NO3_A4493HreBarReo ;
   private String[] T00NO3_A4494HreBarPar ;
   private byte[] T00NO3_A4495HreNumCie ;
   private short[] T00NO3_A4545HreLinMaq ;
   private byte[] T00NO3_A4550HreLinPro ;
   private String[] T00NO3_A4551HreProCod ;
   private String[] T00NO3_A4552HreProDsc ;
   private short[] T00NO3_A4553HreProTie ;
   private short[] T00NO3_A4554HreProTmx ;
   private int[] T00NO3_A4555HreNumPro ;
   private int[] T00NO3_A4556HreNumRec ;
   private int[] T00NO3_A4966HreVolPro ;
   private short[] T00NO3_A5947HreTieprg ;
   private short[] T00NO3_A5948HreNroPrg ;
   private String[] T00NO3_A396EmprCod ;
   private int[] T00NO2_A4492HreBarCod ;
   private byte[] T00NO2_A4493HreBarReo ;
   private String[] T00NO2_A4494HreBarPar ;
   private byte[] T00NO2_A4495HreNumCie ;
   private short[] T00NO2_A4545HreLinMaq ;
   private byte[] T00NO2_A4550HreLinPro ;
   private String[] T00NO2_A4551HreProCod ;
   private String[] T00NO2_A4552HreProDsc ;
   private short[] T00NO2_A4553HreProTie ;
   private short[] T00NO2_A4554HreProTmx ;
   private int[] T00NO2_A4555HreNumPro ;
   private int[] T00NO2_A4556HreNumRec ;
   private int[] T00NO2_A4966HreVolPro ;
   private short[] T00NO2_A5947HreTieprg ;
   private short[] T00NO2_A5948HreNroPrg ;
   private String[] T00NO2_A396EmprCod ;
   private String[] T00NO40_A396EmprCod ;
   private int[] T00NO40_A4492HreBarCod ;
   private byte[] T00NO40_A4493HreBarReo ;
   private String[] T00NO40_A4494HreBarPar ;
   private byte[] T00NO40_A4495HreNumCie ;
   private short[] T00NO40_A4545HreLinMaq ;
   private byte[] T00NO40_A4550HreLinPro ;
   private short[] T00NO40_A4557HreRecLin ;
   private String[] T00NO41_A396EmprCod ;
   private int[] T00NO41_A4492HreBarCod ;
   private byte[] T00NO41_A4493HreBarReo ;
   private String[] T00NO41_A4494HreBarPar ;
   private byte[] T00NO41_A4495HreNumCie ;
   private short[] T00NO41_A4545HreLinMaq ;
   private byte[] T00NO41_A4550HreLinPro ;
   private String[] T00NO42_A407EmprNom ;
   private boolean[] T00NO42_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thisrex__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrex__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrex__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrex__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrex__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00NO2", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg, EmprCod FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?  FOR UPDATE OF HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO3", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg, EmprCod FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO4", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf, EmprCod FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?  FOR UPDATE OF HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO5", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf, EmprCod FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO6", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, EmprCod, CliCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?  FOR UPDATE OF HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO7", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, EmprCod, CliCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO10", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, T2.EmprNom, TM1.HreDisCli, T3.CliNom, TM1.HreBarSer, TM1.HreBarDsc, TM1.HreTipArt, TM1.HreTipArtD, TM1.HreColNom, TM1.HreColNum, TM1.HreColNomC, TM1.HreColNumC, TM1.HreTipCol, TM1.HreTipColN, TM1.HreFecGen, TM1.HreFecCli, TM1.HreFecTin, TM1.HreFecFpr, TM1.HreBarMat, TM1.HreBarKgm, TM1.HreBarMtr, TM1.HreBarPie, TM1.HrePartCod, TM1.HreBarNMtr, TM1.HreBarNMez, TM1.HreNumTen, TM1.HreIntCod, TM1.HreIntDsc, TM1.HreNumTon, TM1.HreMaqHdr, TM1.HreTotKgm, TM1.HreTotMtr, TM1.HreTotPie, TM1.HreLtsSR, TM1.HreLtsRs, TM1.HreAcaQm, TM1.HreRacab, TM1.HreFecAcb, TM1.HreAbs, TM1.HreLtsRc, TM1.HreHdrLts, TM1.HreFabs, TM1.EmprCod, TM1.CliCod FROM ((TXPHISREH TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO11", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE ( HreBarCod > ? or HreBarCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie > ?) and EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE ( HreBarCod < ? or HreBarCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and HreNumCie < ?) and EmprCod = ? ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00NO15", "INSERT INTO TXPHISREH(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs, EmprCod, CliCod, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK, "TXPHISREH")
         ,new UpdateCursor("T00NO16", "UPDATE TXPHISREH SET HreDisCli=?, HreBarSer=?, HreBarDsc=?, HreTipArt=?, HreTipArtD=?, HreColNom=?, HreColNum=?, HreColNomC=?, HreColNumC=?, HreTipCol=?, HreTipColN=?, HreFecGen=?, HreFecCli=?, HreFecTin=?, HreFecFpr=?, HreBarMat=?, HreBarKgm=?, HreBarMtr=?, HreBarPie=?, HrePartCod=?, HreBarNMtr=?, HreBarNMez=?, HreNumTen=?, HreIntCod=?, HreIntDsc=?, HreNumTon=?, HreMaqHdr=?, HreTotKgm=?, HreTotMtr=?, HreTotPie=?, HreLtsSR=?, HreLtsRs=?, HreAcaQm=?, HreRacab=?, HreFecAcb=?, HreAbs=?, HreLtsRc=?, HreHdrLts=?, HreFabs=?, CliCod=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK, "TXPHISREH")
         ,new UpdateCursor("T00NO17", "DELETE FROM TXPHISREH  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK, "TXPHISREH")
         ,new ForEachCursor("T00NO18", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO19", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO20", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO21", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO22", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO23", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO24", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO25", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf, EmprCod FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO26", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00NO27", "INSERT INTO TXPHISREM(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf, EmprCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreUltObs, HreAva, HreAs, HreAi) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T00NO28", "UPDATE TXPHISREM SET HreMaqCod=?, HreVolPrd=?, HreFacAbs=?, HreFecPes=?, HreMaqPes=?, HreULinPro=?, HreUsrCod=?, HreFecAlt=?, HreUsrMod=?, HreFecMod=?, HreFasCod=?, HreOrdLin=?, HreNroPar=?, HreTotKgs=?, HreTotMts=?, HreTotPrd=?, HreProPrd=?, HreNumRmt=?, HreNumReo=?, HreNumInt=?, HreDti=?, HreDtf=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T00NO29", "DELETE FROM TXPHISREM  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new ForEachCursor("T00NO30", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO31", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreTraID FROM TXPHISRE3 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO32", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO33", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO34", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO35", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg, EmprCod FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO36", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00NO37", "INSERT INTO TXPHISREC(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreVolPro, HreTieprg, HreNroPrg, EmprCod, HreNH2O) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPHISREC")
         ,new UpdateCursor("T00NO38", "UPDATE TXPHISREC SET HreProCod=?, HreProDsc=?, HreProTie=?, HreProTmx=?, HreNumPro=?, HreNumRec=?, HreVolPro=?, HreTieprg=?, HreNroPrg=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?", GX_NOMASK, "TXPHISREC")
         ,new UpdateCursor("T00NO39", "DELETE FROM TXPHISREC  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?", GX_NOMASK, "TXPHISREC")
         ,new ForEachCursor("T00NO40", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NO41", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NO42", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((int[]) buf[66])[0] = rslt.getInt(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 6);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[72])[0] = rslt.getGXDateTime(39);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((int[]) buf[76])[0] = rslt.getInt(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 12);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 3);
               ((int[]) buf[83])[0] = rslt.getInt(45);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 26);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(13);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 26);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDate(16);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(17);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getString(24, 16);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 10);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 10);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((byte[]) buf[50])[0] = rslt.getByte(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(29, 30);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 10);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(32,2);
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[60])[0] = rslt.getBigDecimal(33,2);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(34);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((int[]) buf[64])[0] = rslt.getInt(35);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               ((int[]) buf[66])[0] = rslt.getInt(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 6);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((String[]) buf[70])[0] = rslt.getString(38, 1);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[72])[0] = rslt.getGXDateTime(39);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[74])[0] = rslt.getBigDecimal(40,2);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((int[]) buf[76])[0] = rslt.getInt(41);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((String[]) buf[78])[0] = rslt.getString(42, 12);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(43,2);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getString(44, 3);
               ((int[]) buf[83])[0] = rslt.getInt(45);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((String[]) buf[9])[0] = rslt.getString(8, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 26);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((int[]) buf[23])[0] = rslt.getInt(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 26);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 16);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(26, 16);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(27, 10);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 10);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(29, 10);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((byte[]) buf[53])[0] = rslt.getByte(30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(31, 30);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 10);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(33, 6);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(34,2);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[63])[0] = rslt.getBigDecimal(35,2);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((int[]) buf[65])[0] = rslt.getInt(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((int[]) buf[67])[0] = rslt.getInt(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((int[]) buf[69])[0] = rslt.getInt(38);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 6);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 1);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDateTime(41);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(42,2);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((int[]) buf[79])[0] = rslt.getInt(43);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((String[]) buf[81])[0] = rslt.getString(44, 12);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[83])[0] = rslt.getBigDecimal(45,2);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getString(46, 3);
               ((int[]) buf[86])[0] = rslt.getInt(47);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(12, 8);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 8);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 8);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((int[]) buf[35])[0] = rslt.getInt(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((int[]) buf[39])[0] = rslt.getInt(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((int[]) buf[41])[0] = rslt.getInt(24);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((int[]) buf[43])[0] = rslt.getInt(25);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[45])[0] = rslt.getGXDateTime(26);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(27);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(28, 3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
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
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 33 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 40 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
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
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 11 :
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
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 12 :
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
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 16);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[9], 26);
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
                  stmt.setString(9, (String)parms[13], 30);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[15], 13);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[19], 13);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[23]).byteValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[25], 26);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.DATE );
               }
               else
               {
                  stmt.setDate(16, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DATE );
               }
               else
               {
                  stmt.setDate(17, (java.util.Date)parms[29]);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DATE );
               }
               else
               {
                  stmt.setDate(18, (java.util.Date)parms[31]);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DATE );
               }
               else
               {
                  stmt.setDate(19, (java.util.Date)parms[33]);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[35], 16);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(23, ((Number) parms[41]).intValue());
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[43], 16);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[45], 10);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[47], 10);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[49], 10);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(28, ((Number) parms[51]).byteValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[53], 30);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[55], 10);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[57], 6);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[63]).intValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(35, ((Number) parms[65]).intValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(36, ((Number) parms[67]).intValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[69], 6);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(39, (java.util.Date)parms[73], false);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(40, (java.math.BigDecimal)parms[75], 2);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(41, ((Number) parms[77]).intValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[79], 12);
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[81], 2);
               }
               stmt.setString(44, (String)parms[82], 3);
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(45, ((Number) parms[84]).intValue());
               }
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 26);
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
                  stmt.setString(5, (String)parms[9], 30);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 13);
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
                  stmt.setString(8, (String)parms[15], 13);
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
                  stmt.setString(11, (String)parms[21], 26);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DATE );
               }
               else
               {
                  stmt.setDate(12, (java.util.Date)parms[23]);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DATE );
               }
               else
               {
                  stmt.setDate(13, (java.util.Date)parms[25]);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DATE );
               }
               else
               {
                  stmt.setDate(14, (java.util.Date)parms[27]);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DATE );
               }
               else
               {
                  stmt.setDate(15, (java.util.Date)parms[29]);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 16);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(17, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[39], 16);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 10);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 10);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 10);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(25, (String)parms[49], 30);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(26, (String)parms[51], 10);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[53], 6);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[59]).intValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[61]).intValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(32, ((Number) parms[63]).intValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 6);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[67], 1);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(35, (java.util.Date)parms[69], false);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(36, (java.math.BigDecimal)parms[71], 2);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(37, ((Number) parms[73]).intValue());
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(38, (String)parms[75], 12);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(39, (java.math.BigDecimal)parms[77], 2);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(40, ((Number) parms[79]).intValue());
               }
               stmt.setString(41, (String)parms[80], 3);
               stmt.setInt(42, ((Number) parms[81]).intValue());
               stmt.setByte(43, ((Number) parms[82]).byteValue());
               stmt.setString(44, (String)parms[83], 1);
               stmt.setByte(45, ((Number) parms[84]).byteValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
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
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 8);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[20], false);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[22], 8);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 8);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(18, ((Number) parms[30]).intValue());
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
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[36]).intValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[38], 8);
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
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[42]).intValue());
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[44]).intValue());
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[46], false);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[48], false);
               }
               stmt.setString(28, (String)parms[49], 3);
               return;
            case 26 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
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
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 8);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 8);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 8);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[25]).intValue());
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
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[31]).intValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 8);
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
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(19, ((Number) parms[37]).intValue());
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[41], false);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               stmt.setString(23, (String)parms[44], 3);
               stmt.setInt(24, ((Number) parms[45]).intValue());
               stmt.setByte(25, ((Number) parms[46]).byteValue());
               stmt.setString(26, (String)parms[47], 1);
               stmt.setByte(27, ((Number) parms[48]).byteValue());
               stmt.setShort(28, ((Number) parms[49]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 35 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 30);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 3);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setString(13, (String)parms[12], 1);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

