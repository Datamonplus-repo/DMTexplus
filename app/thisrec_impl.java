package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thisrec_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
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
         gxload_5( A396EmprCod, A252CliCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO RECETAS (HDR)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
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
      nRC_GXsfl_275 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_275"))) ;
      nGXsfl_275_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_275_idx"))) ;
      sGXsfl_275_idx = httpContext.GetPar( "sGXsfl_275_idx") ;
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
      nRC_GXsfl_472 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_472"))) ;
      nGXsfl_472_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_472_idx"))) ;
      sGXsfl_472_idx = httpContext.GetPar( "sGXsfl_472_idx") ;
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

   public thisrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thisrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thisrec_impl.class ));
   }

   public thisrec_impl( int remoteHandle ,
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISREC.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "HreDisCli", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreDisCli_Internalname, GXutil.rtrim( A4516HreDisCli), GXutil.rtrim( localUtil.format( A4516HreDisCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreDisCli_Jsonclick, 0, "", "", "", "", "", 1, edtHreDisCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Serie Hist.Receta", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarSer_Internalname, GXutil.rtrim( A4517HreBarSer), GXutil.rtrim( localUtil.format( A4517HreBarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarSer_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Descrip.Serie Hist.Receta", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarDsc_Internalname, GXutil.rtrim( A4518HreBarDsc), GXutil.rtrim( localUtil.format( A4518HreBarDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Tipo Articulo Hist.Receta", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4519HreTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4519HreTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4519HreTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipArt_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Desc,Tipo Articu.Hist.Receta", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipArtD_Internalname, GXutil.rtrim( A4520HreTipArtD), GXutil.rtrim( localUtil.format( A4520HreTipArtD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipArtD_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipArtD_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Nombre Color Hist.Receta", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNom_Internalname, GXutil.rtrim( A4521HreColNom), GXutil.rtrim( localUtil.format( A4521HreColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNom_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Numero Color Hist.Receta", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A4522HreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4522HreColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNum_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Nombre Color Cli. Hist.Receta", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNomC_Internalname, GXutil.rtrim( A4523HreColNomC), GXutil.rtrim( localUtil.format( A4523HreColNomC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNomC_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNomC_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Numero Color Cli. Hist.Receta", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreColNumC_Internalname, GXutil.ltrim( localUtil.ntoc( A4524HreColNumC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreColNumC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4524HreColNumC), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4524HreColNumC), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreColNumC_Jsonclick, 0, "", "", "", "", "", 1, edtHreColNumC_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Tipo Colorante Hist.Receta", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A4525HreTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4525HreTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipCol_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Descrip.Tipo Coloran.H.Receta", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTipColN_Internalname, GXutil.rtrim( A4526HreTipColN), GXutil.rtrim( localUtil.format( A4526HreTipColN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTipColN_Jsonclick, 0, "", "", "", "", "", 1, edtHreTipColN_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Fecha Generacion Hist.Receta", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecGen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecGen_Internalname, localUtil.format(A4527HreFecGen, "99/99/99"), localUtil.format( A4527HreFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecGen_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecGen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecGen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecGen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Fecha Disp.Cli. Hist.Receta", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecCli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecCli_Internalname, localUtil.format(A4528HreFecCli, "99/99/99"), localUtil.format( A4528HreFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecCli_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecCli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecCli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecCli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Fecha Cierre Tint. Hist.Receta", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecTin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecTin_Internalname, localUtil.format(A4529HreFecTin, "99/99/99"), localUtil.format( A4529HreFecTin, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,126);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecTin_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecTin_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecTin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecTin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Fecha Fin Previs.Hist.Receta", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreFecFpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFecFpr_Internalname, localUtil.format(A4530HreFecFpr, "99/99/99"), localUtil.format( A4530HreFecFpr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFecFpr_Jsonclick, 0, "", "", "", "", "", 1, edtHreFecFpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreFecFpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreFecFpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREC.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Materia Hist.Receta", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarMat_Internalname, GXutil.rtrim( A4531HreBarMat), GXutil.rtrim( localUtil.format( A4531HreBarMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarMat_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarMat_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Kilos Hdr. Hist.Receta", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A4532HreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarKgm_Enabled!=0) ? localUtil.format( A4532HreBarKgm, "ZZZZZ9.99") : localUtil.format( A4532HreBarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarKgm_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Metros Hdr. Hist.Receta", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4533HreBarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarMtr_Enabled!=0) ? localUtil.format( A4533HreBarMtr, "ZZZZZ9.99") : localUtil.format( A4533HreBarMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Piezas. Hist.Receta", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A4534HreBarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4534HreBarPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4534HreBarPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPie_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Partido. Hist.Receta", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePartCod_Internalname, GXutil.rtrim( A4535HrePartCod), GXutil.rtrim( localUtil.format( A4535HrePartCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePartCod_Jsonclick, 0, "", "", "", "", "", 1, edtHrePartCod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Numero Metrico. Hist.Receta", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarNMtr_Internalname, GXutil.rtrim( A4536HreBarNMtr), GXutil.rtrim( localUtil.format( A4536HreBarNMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarNMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarNMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Mezcla. Hist.Receta", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 166,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarNMez_Internalname, GXutil.rtrim( A4537HreBarNMez), GXutil.rtrim( localUtil.format( A4537HreBarNMez, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,166);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarNMez_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarNMez_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Tintada. Hist.Receta", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumTen_Internalname, GXutil.rtrim( A4538HreNumTen), GXutil.rtrim( localUtil.format( A4538HreNumTen, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumTen_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumTen_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Intensidad. Hist.Receta", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4539HreIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4539HreIntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4539HreIntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,176);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Descrip.Intensidad.Hist.Receta", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreIntDsc_Internalname, GXutil.rtrim( A4540HreIntDsc), GXutil.rtrim( localUtil.format( A4540HreIntDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,181);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHreIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Tonalidad. Hist.Receta", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumTon_Internalname, GXutil.rtrim( A4541HreNumTon), GXutil.rtrim( localUtil.format( A4541HreNumTon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumTon_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumTon_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Maquina Hdr. Hist.Receta", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreMaqHdr_Internalname, GXutil.rtrim( A4496HreMaqHdr), GXutil.rtrim( localUtil.format( A4496HreMaqHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreMaqHdr_Jsonclick, 0, "", "", "", "", "", 1, edtHreMaqHdr_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Total Kgs.Agrup.Hist.Receta", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 196,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTotKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A4542HreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTotKgm_Enabled!=0) ? localUtil.format( A4542HreTotKgm, "ZZZZZ9.99") : localUtil.format( A4542HreTotKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,196);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTotKgm_Jsonclick, 0, "", "", "", "", "", 1, edtHreTotKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Total Mts.Agrup.Hist.Receta", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTotMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A4543HreTotMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTotMtr_Enabled!=0) ? localUtil.format( A4543HreTotMtr, "ZZZZZ9.99") : localUtil.format( A4543HreTotMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTotMtr_Jsonclick, 0, "", "", "", "", "", 1, edtHreTotMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock38_Internalname, httpContext.getMessage( "Total Piezas Agr.Hist.Receta", ""), "", "", lblTextblock38_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 206,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreTotPie_Internalname, GXutil.ltrim( localUtil.ntoc( A4544HreTotPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreTotPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4544HreTotPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreTotPie_Jsonclick, 0, "", "", "", "", "", 1, edtHreTotPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock39_Internalname, httpContext.getMessage( "Nº Formula Interno", ""), "", "", lblTextblock39_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumColF_Internalname, GXutil.ltrim( localUtil.ntoc( A8608HreNumColF, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumColF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8608HreNumColF), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8608HreNumColF), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumColF_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumColF_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock40_Internalname, httpContext.getMessage( "Familia", ""), "", "", lblTextblock40_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreFamCodT_Internalname, GXutil.ltrim( localUtil.ntoc( A8610HreFamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreFamCodT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8610HreFamCodT), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8610HreFamCodT), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreFamCodT_Jsonclick, 0, "", "", "", "", "", 1, edtHreFamCodT_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock41_Internalname, httpContext.getMessage( "Hilasa", ""), "", "", lblTextblock41_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreHilasa_Internalname, GXutil.rtrim( A8623HreHilasa), GXutil.rtrim( localUtil.format( A8623HreHilasa, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreHilasa_Jsonclick, 0, "", "", "", "", "", 1, edtHreHilasa_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock42_Internalname, httpContext.getMessage( "NEnsayo", ""), "", "", lblTextblock42_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 226,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreEnsayo_Internalname, GXutil.ltrim( localUtil.ntoc( A8624HreEnsayo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreEnsayo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8624HreEnsayo), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8624HreEnsayo), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,226);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreEnsayo_Jsonclick, 0, "", "", "", "", "", 1, edtHreEnsayo_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock43_Internalname, httpContext.getMessage( "Opcion Alfanumerica", ""), "", "", lblTextblock43_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 231,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreOpa_Internalname, GXutil.rtrim( A8625HreOpa), GXutil.rtrim( localUtil.format( A8625HreOpa, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,231);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreOpa_Jsonclick, 0, "", "", "", "", "", 1, edtHreOpa_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock44_Internalname, httpContext.getMessage( "Opcion Nº", ""), "", "", lblTextblock44_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 236,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreOpn_Internalname, GXutil.ltrim( localUtil.ntoc( A8626HreOpn, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreOpn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8626HreOpn), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A8626HreOpn), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,236);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreOpn_Jsonclick, 0, "", "", "", "", "", 1, edtHreOpn_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock45_Internalname, httpContext.getMessage( "Disp Cliente mayor", ""), "", "", lblTextblock45_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreDispCli_Internalname, GXutil.rtrim( A11318HreDispCli), GXutil.rtrim( localUtil.format( A11318HreDispCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreDispCli_Jsonclick, 0, "", "", "", "", "", 1, edtHreDispCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock46_Internalname, httpContext.getMessage( "Numero Macro o N Barcada", ""), "", "", lblTextblock46_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 246,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreMacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A11320HreMacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreMacCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11320HreMacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11320HreMacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,246);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreMacCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreMacCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock47_Internalname, httpContext.getMessage( "Numero Interno Receta", ""), "", "", lblTextblock47_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 251,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNInter_Internalname, GXutil.ltrim( localUtil.ntoc( A12264HreNInter, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNInter_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12264HreNInter), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12264HreNInter), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,251);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNInter_Jsonclick, 0, "", "", "", "", "", 1, edtHreNInter_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock48_Internalname, httpContext.getMessage( "Cuardeno Encargos", ""), "", "", lblTextblock48_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 256,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCencId_Internalname, GXutil.ltrim( localUtil.ntoc( A12535HreCencId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreCencId_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12535HreCencId), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12535HreCencId), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,256);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCencId_Jsonclick, 0, "", "", "", "", "", 1, edtHreCencId_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock49_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblock49_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 261,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreCenDsc_Internalname, GXutil.rtrim( A12536HreCenDsc), GXutil.rtrim( localUtil.format( A12536HreCenDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,261);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreCenDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHreCenDsc_Enabled, 0, "text", "", 80, "chr", 1, "row", 80, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock50_Internalname, httpContext.getMessage( "Composicion 1", ""), "", "", lblTextblock50_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 266,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreComp1_Internalname, GXutil.rtrim( A13450HreComp1), GXutil.rtrim( localUtil.format( A13450HreComp1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,266);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreComp1_Jsonclick, 0, "", "", "", "", "", 1, edtHreComp1_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock51_Internalname, httpContext.getMessage( "Composicion 2", ""), "", "", lblTextblock51_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreComp2_Internalname, GXutil.rtrim( A13451HreComp2), GXutil.rtrim( localUtil.format( A13451HreComp2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,271);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreComp2_Jsonclick, 0, "", "", "", "", "", 1, edtHreComp2_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREC.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol275( ) ;
      /* Save parent mode. */
      sMode678 = Gx_mode ;
      nGXsfl_275_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount678 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_678 = (short)(1) ;
            scanStartL7678( ) ;
            while ( RcdFound678 != 0 )
            {
               init_level_properties678( ) ;
               getByPrimaryKeyL7678( ) ;
               addRowL7678( ) ;
               scanNextL7678( ) ;
            }
            scanEndL7678( ) ;
            nBlankRcdCount678 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalL7678( ) ;
         standaloneModalL7678( ) ;
         sMode678 = Gx_mode ;
         while ( nGXsfl_275_idx < nRC_GXsfl_275 )
         {
            bGXsfl_275_Refreshing = true ;
            readRowL7678( ) ;
            edtHreLinMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINMAQ_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQCOD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreVolPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVOLPRD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreFacAbs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFACABS_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacAbs_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreFecPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECPES_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecPes_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreMaqPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQPES_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqPes_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreULinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREULINPRO_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreULinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreULinPro_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreUsrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREUSRCOD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrCod_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqNh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQNH_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqNh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqNh_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqVX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQVX_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqVX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqVX_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqBL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQBL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqBL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqBL_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqFlow_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQFLOW_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqFlow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqFlow_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqRPM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQRPM_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqRPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqRPM_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqMol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQMOL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqMol_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqTor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQTOR_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqTor_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQCLA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqCla_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqTej_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQTEJ_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqTej_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqDel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQDEL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqDel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqDel_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHReMaqPML_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQPML_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHReMaqPML_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqPML_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreCosAA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSAA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreCosAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosAA_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHrecosAd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSAD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHrecosAd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrecosAd_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreCosAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSANC_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreCosAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosAnc_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreCosCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSCOL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreCosCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosCol_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreCosPA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSPA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreCosPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosPA_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreCosPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSPD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreCosPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosPD_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreLtsSb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELTSSB_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLtsSb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsSb_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreLtsRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELTSRM_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLtsRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsRm_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreAcaQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACAQ_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcaQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcaQ_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACAB_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcab_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreNPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENPRG_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNPrg_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreLotF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELOTF_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLotF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLotF_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREANC_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAnc_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreGrm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREGRM_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreGrm_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreVel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVEL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreVel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVel_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREOBS_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreObs_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreAva_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREAVA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAva_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAva_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreAs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREAS_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAs_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            edtHreAi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREAI_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreAi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAi_Enabled), 5, 0), !bGXsfl_275_Refreshing);
            if ( ( nRcdExists_678 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalL7678( ) ;
            }
            sendRowL7678( ) ;
            bGXsfl_275_Refreshing = false ;
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
            scanStartL7678( ) ;
            while ( RcdFound678 != 0 )
            {
               sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_275678( ) ;
               init_level_properties678( ) ;
               standaloneNotModalL7678( ) ;
               getByPrimaryKeyL7678( ) ;
               standaloneModalL7678( ) ;
               addRowL7678( ) ;
               scanNextL7678( ) ;
            }
            scanEndL7678( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode678 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_275678( ) ;
      initAllL7678( ) ;
      init_level_properties678( ) ;
      nRcdExists_678 = (short)(0) ;
      nIsMod_678 = (short)(0) ;
      nRcdDeleted_678 = (short)(0) ;
      nBlankRcdCount678 = (short)(nBlankRcdUsr678+nBlankRcdCount678) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount678 > 0 )
      {
         standaloneNotModalL7678( ) ;
         standaloneModalL7678( ) ;
         addRowL7678( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 484,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 485,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 486,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 487,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREC.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 488,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISREC.htm");
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
         Z8608HreNumColF = (int)(localUtil.ctol( httpContext.cgiGet( "Z8608HreNumColF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8610HreFamCodT = (short)(localUtil.ctol( httpContext.cgiGet( "Z8610HreFamCodT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8623HreHilasa = httpContext.cgiGet( "Z8623HreHilasa") ;
         Z8624HreEnsayo = (int)(localUtil.ctol( httpContext.cgiGet( "Z8624HreEnsayo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8625HreOpa = httpContext.cgiGet( "Z8625HreOpa") ;
         Z8626HreOpn = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8626HreOpn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11318HreDispCli = httpContext.cgiGet( "Z11318HreDispCli") ;
         Z11320HreMacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z11320HreMacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12264HreNInter = (int)(localUtil.ctol( httpContext.cgiGet( "Z12264HreNInter"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12535HreCencId = (short)(localUtil.ctol( httpContext.cgiGet( "Z12535HreCencId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12536HreCenDsc = httpContext.cgiGet( "Z12536HreCenDsc") ;
         Z13450HreComp1 = httpContext.cgiGet( "Z13450HreComp1") ;
         Z13451HreComp2 = httpContext.cgiGet( "Z13451HreComp2") ;
         Z13763HreUser = httpContext.cgiGet( "Z13763HreUser") ;
         Z13764HreDiaHora = localUtil.ctot( httpContext.cgiGet( "Z13764HreDiaHora"), 0) ;
         Z13765HreCdn2 = httpContext.cgiGet( "Z13765HreCdn2") ;
         Z13766HreCtw = httpContext.cgiGet( "Z13766HreCtw") ;
         Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13763HreUser = httpContext.cgiGet( "Z13763HreUser") ;
         A13764HreDiaHora = localUtil.ctot( httpContext.cgiGet( "Z13764HreDiaHora"), 0) ;
         A13765HreCdn2 = httpContext.cgiGet( "Z13765HreCdn2") ;
         A13766HreCtw = httpContext.cgiGet( "Z13766HreCtw") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_275 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_275"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13842BarNhdr_Hi = httpContext.cgiGet( "BARNHDR_HI") ;
         A13763HreUser = httpContext.cgiGet( "HREUSER") ;
         A13764HreDiaHora = localUtil.ctot( httpContext.cgiGet( "HREDIAHORA"), 0) ;
         A13765HreCdn2 = httpContext.cgiGet( "HRECDN2") ;
         A13766HreCtw = httpContext.cgiGet( "HRECTW") ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumColF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumColF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENUMCOLF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreNumColF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8608HreNumColF = 0 ;
            n8608HreNumColF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8608HreNumColF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8608HreNumColF), 8, 0));
         }
         else
         {
            A8608HreNumColF = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNumColF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8608HreNumColF = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8608HreNumColF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8608HreNumColF), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREFAMCODT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreFamCodT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8610HreFamCodT = (short)(0) ;
            n8610HreFamCodT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8610HreFamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8610HreFamCodT), 4, 0));
         }
         else
         {
            A8610HreFamCodT = (short)(localUtil.ctol( httpContext.cgiGet( edtHreFamCodT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8610HreFamCodT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8610HreFamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8610HreFamCodT), 4, 0));
         }
         A8623HreHilasa = httpContext.cgiGet( edtHreHilasa_Internalname) ;
         n8623HreHilasa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8623HreHilasa", A8623HreHilasa);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreEnsayo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreEnsayo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREENSAYO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreEnsayo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8624HreEnsayo = 0 ;
            n8624HreEnsayo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8624HreEnsayo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8624HreEnsayo), 8, 0));
         }
         else
         {
            A8624HreEnsayo = (int)(localUtil.ctol( httpContext.cgiGet( edtHreEnsayo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8624HreEnsayo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8624HreEnsayo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8624HreEnsayo), 8, 0));
         }
         A8625HreOpa = GXutil.upper( httpContext.cgiGet( edtHreOpa_Internalname)) ;
         n8625HreOpa = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A8625HreOpa", A8625HreOpa);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreOpn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreOpn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREOPN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreOpn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8626HreOpn = (byte)(0) ;
            n8626HreOpn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8626HreOpn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8626HreOpn), 2, 0));
         }
         else
         {
            A8626HreOpn = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreOpn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n8626HreOpn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8626HreOpn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8626HreOpn), 2, 0));
         }
         A11318HreDispCli = httpContext.cgiGet( edtHreDispCli_Internalname) ;
         n11318HreDispCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A11318HreDispCli", A11318HreDispCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREMACCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreMacCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11320HreMacCod = 0 ;
            n11320HreMacCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11320HreMacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11320HreMacCod), 8, 0));
         }
         else
         {
            A11320HreMacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreMacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n11320HreMacCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A11320HreMacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11320HreMacCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNInter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNInter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENINTER");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreNInter_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12264HreNInter = 0 ;
            n12264HreNInter = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12264HreNInter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12264HreNInter), 8, 0));
         }
         else
         {
            A12264HreNInter = (int)(localUtil.ctol( httpContext.cgiGet( edtHreNInter_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12264HreNInter = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12264HreNInter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12264HreNInter), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreCencId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreCencId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRECENCID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreCencId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12535HreCencId = (short)(0) ;
            n12535HreCencId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12535HreCencId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12535HreCencId), 4, 0));
         }
         else
         {
            A12535HreCencId = (short)(localUtil.ctol( httpContext.cgiGet( edtHreCencId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12535HreCencId = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12535HreCencId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12535HreCencId), 4, 0));
         }
         A12536HreCenDsc = httpContext.cgiGet( edtHreCenDsc_Internalname) ;
         n12536HreCenDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12536HreCenDsc", A12536HreCenDsc);
         A13450HreComp1 = httpContext.cgiGet( edtHreComp1_Internalname) ;
         n13450HreComp1 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13450HreComp1", A13450HreComp1);
         A13451HreComp2 = httpContext.cgiGet( edtHreComp2_Internalname) ;
         n13451HreComp2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13451HreComp2", A13451HreComp2);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"THISREC");
         forbiddenHiddens.add("HreUser", GXutil.rtrim( localUtil.format( A13763HreUser, "")));
         forbiddenHiddens.add("HreDiaHora", localUtil.format( A13764HreDiaHora, "99/99/99 99:99"));
         forbiddenHiddens.add("HreCdn2", GXutil.rtrim( localUtil.format( A13765HreCdn2, "")));
         forbiddenHiddens.add("HreCtw", GXutil.rtrim( localUtil.format( A13766HreCtw, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("thisrec:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            initAllL7675( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1874_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1874_Enabled), 5, 0), !bGXsfl_472_Refreshing);
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
      disableAttributesL7675( ) ;
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

   public void confirm_L70( )
   {
      beforeValidateL7675( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsL7675( ) ;
         }
         else
         {
            checkExtendedTableL7675( ) ;
            if ( AnyError == 0 )
            {
               zmL7675( 4) ;
               zmL7675( 5) ;
            }
            closeExtendedTableCursorsL7675( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode675 = Gx_mode ;
         confirm_L7678( ) ;
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
         confirmValuesL70( ) ;
      }
   }

   public void confirm_L71874( )
   {
      nGXsfl_472_idx = 0 ;
      while ( nGXsfl_472_idx < nRC_GXsfl_472 )
      {
         readRowL71874( ) ;
         if ( ( nRcdExists_1874 != 0 ) || ( nIsMod_1874 != 0 ) )
         {
            getKeyL71874( ) ;
            if ( ( nRcdExists_1874 == 0 ) && ( nRcdDeleted_1874 == 0 ) )
            {
               if ( RcdFound1874 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateL71874( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableL71874( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsL71874( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
                     getByPrimaryKeyL71874( ) ;
                     loadL71874( ) ;
                     beforeValidateL71874( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsL71874( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1874 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateL71874( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableL71874( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsL71874( ) ;
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
                     GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
         httpContext.changePostValue( edtHreNH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10545HreNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4550HreLinPro_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4551HreProCod_"+sGXsfl_472_idx, GXutil.rtrim( Z4551HreProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4552HreProDsc_"+sGXsfl_472_idx, GXutil.rtrim( Z4552HreProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4553HreProTie_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4554HreProTmx_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4555HreNumPro_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4556HreNumRec_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10545HreNH2O_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z10545HreNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1874_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1874_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1874_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1874 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1874_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELINPRO_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROCOD_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPRODSC_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTIE_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTMX_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMPRO_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMREC_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENH2O_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNH2O_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_L7678( )
   {
      nGXsfl_275_idx = 0 ;
      while ( nGXsfl_275_idx < nRC_GXsfl_275 )
      {
         readRowL7678( ) ;
         if ( ( nRcdExists_678 != 0 ) || ( nIsMod_678 != 0 ) )
         {
            getKeyL7678( ) ;
            if ( ( nRcdExists_678 == 0 ) && ( nRcdDeleted_678 == 0 ) )
            {
               if ( RcdFound678 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateL7678( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableL7678( ) ;
                     if ( AnyError == 0 )
                     {
                     }
                     closeExtendedTableCursorsL7678( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode678 = Gx_mode ;
                        confirm_L71874( ) ;
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
                  GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
                     getByPrimaryKeyL7678( ) ;
                     loadL7678( ) ;
                     beforeValidateL7678( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsL7678( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_678 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateL7678( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableL7678( ) ;
                           if ( AnyError == 0 )
                           {
                           }
                           closeExtendedTableCursorsL7678( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode678 = Gx_mode ;
                              confirm_L71874( ) ;
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
                     GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
         httpContext.changePostValue( edtHReMaqNh_Internalname, GXutil.ltrim( localUtil.ntoc( A7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqVX_Internalname, GXutil.ltrim( localUtil.ntoc( A7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqBL_Internalname, GXutil.ltrim( localUtil.ntoc( A7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqFlow_Internalname, GXutil.ltrim( localUtil.ntoc( A7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqRPM_Internalname, GXutil.ltrim( localUtil.ntoc( A7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqMol_Internalname, GXutil.ltrim( localUtil.ntoc( A7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqTor_Internalname, GXutil.ltrim( localUtil.ntoc( A7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqCla_Internalname, GXutil.rtrim( A7821HReMaqCla)) ;
         httpContext.changePostValue( edtHReMaqTej_Internalname, GXutil.ltrim( localUtil.ntoc( A7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqDel_Internalname, GXutil.ltrim( localUtil.ntoc( A7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqPML_Internalname, GXutil.ltrim( localUtil.ntoc( A7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosAA_Internalname, GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHrecosAd_Internalname, GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosCol_Internalname, GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosPA_Internalname, GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosPD_Internalname, GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLtsSb_Internalname, GXutil.ltrim( localUtil.ntoc( A9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLtsRm_Internalname, GXutil.ltrim( localUtil.ntoc( A9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcaQ_Internalname, GXutil.rtrim( A9803HreAcaQ)) ;
         httpContext.changePostValue( edtHreAcab_Internalname, GXutil.rtrim( A9804HreAcab)) ;
         httpContext.changePostValue( edtHreNPrg_Internalname, GXutil.rtrim( A1094HreNPrg)) ;
         httpContext.changePostValue( edtHreLotF_Internalname, GXutil.rtrim( A697HreLotF)) ;
         httpContext.changePostValue( edtHreAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreVel_Internalname, GXutil.ltrim( localUtil.ntoc( A10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreObs_Internalname, A10384HreObs) ;
         httpContext.changePostValue( edtHreAva_Internalname, GXutil.rtrim( A11508HreAva)) ;
         httpContext.changePostValue( edtHreAs_Internalname, GXutil.rtrim( A12126HreAs)) ;
         httpContext.changePostValue( edtHreAi_Internalname, GXutil.rtrim( A12127HreAi)) ;
         httpContext.changePostValue( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_275_idx, GXutil.rtrim( Z4546HreMaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4584HreFecPes_"+sGXsfl_275_idx, localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4549HreULinPro_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_275_idx, GXutil.rtrim( Z4863HreUsrCod)) ;
         httpContext.changePostValue( "ZT_"+"Z7814HReMaqNh_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7815HReMaqVX_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7816HReMaqBL_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7817HReMaqFlow_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7818HReMaqRPM_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7819HReMaqMol_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7820HReMaqTor_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7821HReMaqCla_"+sGXsfl_275_idx, GXutil.rtrim( Z7821HReMaqCla)) ;
         httpContext.changePostValue( "ZT_"+"Z7822HReMaqTej_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7823HReMaqDel_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7824HReMaqPML_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8602HreCosAA_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8603HrecosAd_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8604HreCosAnc_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8605HreCosCol_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8606HreCosPA_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8607HreCosPD_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9780HreLtsSb_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9781HreLtsRm_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9803HreAcaQ_"+sGXsfl_275_idx, GXutil.rtrim( Z9803HreAcaQ)) ;
         httpContext.changePostValue( "ZT_"+"Z9804HreAcab_"+sGXsfl_275_idx, GXutil.rtrim( Z9804HreAcab)) ;
         httpContext.changePostValue( "ZT_"+"Z1094HreNPrg_"+sGXsfl_275_idx, GXutil.rtrim( Z1094HreNPrg)) ;
         httpContext.changePostValue( "ZT_"+"Z697HreLotF_"+sGXsfl_275_idx, GXutil.rtrim( Z697HreLotF)) ;
         httpContext.changePostValue( "ZT_"+"Z10381HreAnc_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10382HreGrm_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10383HreVel_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10384HreObs_"+sGXsfl_275_idx, Z10384HreObs) ;
         httpContext.changePostValue( "ZT_"+"Z11508HreAva_"+sGXsfl_275_idx, GXutil.rtrim( Z11508HreAva)) ;
         httpContext.changePostValue( "ZT_"+"Z12126HreAs_"+sGXsfl_275_idx, GXutil.rtrim( Z12126HreAs)) ;
         httpContext.changePostValue( "ZT_"+"Z12127HreAi_"+sGXsfl_275_idx, GXutil.rtrim( Z12127HreAi)) ;
         httpContext.changePostValue( "nRC_GXsfl_472_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_472, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_678_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_678_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_678_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_678 != 0 )
         {
            httpContext.changePostValue( "HRELINMAQ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQCOD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVOLPRD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFACABS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECPES_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQPES_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREULINPRO_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREUSRCOD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQNH_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqNh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQVX_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqVX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQBL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqBL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQFLOW_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqFlow_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQRPM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqRPM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQMOL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqMol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQTOR_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQCLA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQTEJ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTej_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQDEL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqDel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQPML_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqPML_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSAA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSAD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHrecosAd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSANC_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSCOL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSPA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSPD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELTSSB_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsSb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELTSRM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACAQ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcaQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACAB_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENPRG_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELOTF_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLotF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREANC_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREGRM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreGrm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVEL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREOBS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREAVA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAva_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREAS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREAI_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionL70( )
   {
   }

   public void zmL7675( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4516HreDisCli = T00L77_A4516HreDisCli[0] ;
            Z4517HreBarSer = T00L77_A4517HreBarSer[0] ;
            Z4518HreBarDsc = T00L77_A4518HreBarDsc[0] ;
            Z4519HreTipArt = T00L77_A4519HreTipArt[0] ;
            Z4520HreTipArtD = T00L77_A4520HreTipArtD[0] ;
            Z4521HreColNom = T00L77_A4521HreColNom[0] ;
            Z4522HreColNum = T00L77_A4522HreColNum[0] ;
            Z4523HreColNomC = T00L77_A4523HreColNomC[0] ;
            Z4524HreColNumC = T00L77_A4524HreColNumC[0] ;
            Z4525HreTipCol = T00L77_A4525HreTipCol[0] ;
            Z4526HreTipColN = T00L77_A4526HreTipColN[0] ;
            Z4527HreFecGen = T00L77_A4527HreFecGen[0] ;
            Z4528HreFecCli = T00L77_A4528HreFecCli[0] ;
            Z4529HreFecTin = T00L77_A4529HreFecTin[0] ;
            Z4530HreFecFpr = T00L77_A4530HreFecFpr[0] ;
            Z4531HreBarMat = T00L77_A4531HreBarMat[0] ;
            Z4532HreBarKgm = T00L77_A4532HreBarKgm[0] ;
            Z4533HreBarMtr = T00L77_A4533HreBarMtr[0] ;
            Z4534HreBarPie = T00L77_A4534HreBarPie[0] ;
            Z4535HrePartCod = T00L77_A4535HrePartCod[0] ;
            Z4536HreBarNMtr = T00L77_A4536HreBarNMtr[0] ;
            Z4537HreBarNMez = T00L77_A4537HreBarNMez[0] ;
            Z4538HreNumTen = T00L77_A4538HreNumTen[0] ;
            Z4539HreIntCod = T00L77_A4539HreIntCod[0] ;
            Z4540HreIntDsc = T00L77_A4540HreIntDsc[0] ;
            Z4541HreNumTon = T00L77_A4541HreNumTon[0] ;
            Z4496HreMaqHdr = T00L77_A4496HreMaqHdr[0] ;
            Z4542HreTotKgm = T00L77_A4542HreTotKgm[0] ;
            Z4543HreTotMtr = T00L77_A4543HreTotMtr[0] ;
            Z4544HreTotPie = T00L77_A4544HreTotPie[0] ;
            Z8608HreNumColF = T00L77_A8608HreNumColF[0] ;
            Z8610HreFamCodT = T00L77_A8610HreFamCodT[0] ;
            Z8623HreHilasa = T00L77_A8623HreHilasa[0] ;
            Z8624HreEnsayo = T00L77_A8624HreEnsayo[0] ;
            Z8625HreOpa = T00L77_A8625HreOpa[0] ;
            Z8626HreOpn = T00L77_A8626HreOpn[0] ;
            Z11318HreDispCli = T00L77_A11318HreDispCli[0] ;
            Z11320HreMacCod = T00L77_A11320HreMacCod[0] ;
            Z12264HreNInter = T00L77_A12264HreNInter[0] ;
            Z12535HreCencId = T00L77_A12535HreCencId[0] ;
            Z12536HreCenDsc = T00L77_A12536HreCenDsc[0] ;
            Z13450HreComp1 = T00L77_A13450HreComp1[0] ;
            Z13451HreComp2 = T00L77_A13451HreComp2[0] ;
            Z13763HreUser = T00L77_A13763HreUser[0] ;
            Z13764HreDiaHora = T00L77_A13764HreDiaHora[0] ;
            Z13765HreCdn2 = T00L77_A13765HreCdn2[0] ;
            Z13766HreCtw = T00L77_A13766HreCtw[0] ;
            Z252CliCod = T00L77_A252CliCod[0] ;
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
            Z8608HreNumColF = A8608HreNumColF ;
            Z8610HreFamCodT = A8610HreFamCodT ;
            Z8623HreHilasa = A8623HreHilasa ;
            Z8624HreEnsayo = A8624HreEnsayo ;
            Z8625HreOpa = A8625HreOpa ;
            Z8626HreOpn = A8626HreOpn ;
            Z11318HreDispCli = A11318HreDispCli ;
            Z11320HreMacCod = A11320HreMacCod ;
            Z12264HreNInter = A12264HreNInter ;
            Z12535HreCencId = A12535HreCencId ;
            Z12536HreCenDsc = A12536HreCenDsc ;
            Z13450HreComp1 = A13450HreComp1 ;
            Z13451HreComp2 = A13451HreComp2 ;
            Z13763HreUser = A13763HreUser ;
            Z13764HreDiaHora = A13764HreDiaHora ;
            Z13765HreCdn2 = A13765HreCdn2 ;
            Z13766HreCtw = A13766HreCtw ;
            Z252CliCod = A252CliCod ;
         }
      }
      if ( GX_JID == -3 )
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
         Z8608HreNumColF = A8608HreNumColF ;
         Z8610HreFamCodT = A8610HreFamCodT ;
         Z8623HreHilasa = A8623HreHilasa ;
         Z8624HreEnsayo = A8624HreEnsayo ;
         Z8625HreOpa = A8625HreOpa ;
         Z8626HreOpn = A8626HreOpn ;
         Z11318HreDispCli = A11318HreDispCli ;
         Z11320HreMacCod = A11320HreMacCod ;
         Z12264HreNInter = A12264HreNInter ;
         Z12535HreCencId = A12535HreCencId ;
         Z12536HreCenDsc = A12536HreCenDsc ;
         Z13450HreComp1 = A13450HreComp1 ;
         Z13451HreComp2 = A13451HreComp2 ;
         Z13763HreUser = A13763HreUser ;
         Z13764HreDiaHora = A13764HreDiaHora ;
         Z13765HreCdn2 = A13765HreCdn2 ;
         Z13766HreCtw = A13766HreCtw ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
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

   public void loadL7675( )
   {
      /* Using cursor T00L710 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A407EmprNom = T00L710_A407EmprNom[0] ;
         n407EmprNom = T00L710_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4516HreDisCli = T00L710_A4516HreDisCli[0] ;
         n4516HreDisCli = T00L710_n4516HreDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", A4516HreDisCli);
         A279CliNom = T00L710_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A4517HreBarSer = T00L710_A4517HreBarSer[0] ;
         n4517HreBarSer = T00L710_n4517HreBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", A4517HreBarSer);
         A4518HreBarDsc = T00L710_A4518HreBarDsc[0] ;
         n4518HreBarDsc = T00L710_n4518HreBarDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", A4518HreBarDsc);
         A4519HreTipArt = T00L710_A4519HreTipArt[0] ;
         n4519HreTipArt = T00L710_n4519HreTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
         A4520HreTipArtD = T00L710_A4520HreTipArtD[0] ;
         n4520HreTipArtD = T00L710_n4520HreTipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", A4520HreTipArtD);
         A4521HreColNom = T00L710_A4521HreColNom[0] ;
         n4521HreColNom = T00L710_n4521HreColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", A4521HreColNom);
         A4522HreColNum = T00L710_A4522HreColNum[0] ;
         n4522HreColNum = T00L710_n4522HreColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
         A4523HreColNomC = T00L710_A4523HreColNomC[0] ;
         n4523HreColNomC = T00L710_n4523HreColNomC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", A4523HreColNomC);
         A4524HreColNumC = T00L710_A4524HreColNumC[0] ;
         n4524HreColNumC = T00L710_n4524HreColNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
         A4525HreTipCol = T00L710_A4525HreTipCol[0] ;
         n4525HreTipCol = T00L710_n4525HreTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
         A4526HreTipColN = T00L710_A4526HreTipColN[0] ;
         n4526HreTipColN = T00L710_n4526HreTipColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", A4526HreTipColN);
         A4527HreFecGen = T00L710_A4527HreFecGen[0] ;
         n4527HreFecGen = T00L710_n4527HreFecGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
         A4528HreFecCli = T00L710_A4528HreFecCli[0] ;
         n4528HreFecCli = T00L710_n4528HreFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
         A4529HreFecTin = T00L710_A4529HreFecTin[0] ;
         n4529HreFecTin = T00L710_n4529HreFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
         A4530HreFecFpr = T00L710_A4530HreFecFpr[0] ;
         n4530HreFecFpr = T00L710_n4530HreFecFpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
         A4531HreBarMat = T00L710_A4531HreBarMat[0] ;
         n4531HreBarMat = T00L710_n4531HreBarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", A4531HreBarMat);
         A4532HreBarKgm = T00L710_A4532HreBarKgm[0] ;
         n4532HreBarKgm = T00L710_n4532HreBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
         A4533HreBarMtr = T00L710_A4533HreBarMtr[0] ;
         n4533HreBarMtr = T00L710_n4533HreBarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
         A4534HreBarPie = T00L710_A4534HreBarPie[0] ;
         n4534HreBarPie = T00L710_n4534HreBarPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
         A4535HrePartCod = T00L710_A4535HrePartCod[0] ;
         n4535HrePartCod = T00L710_n4535HrePartCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", A4535HrePartCod);
         A4536HreBarNMtr = T00L710_A4536HreBarNMtr[0] ;
         n4536HreBarNMtr = T00L710_n4536HreBarNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", A4536HreBarNMtr);
         A4537HreBarNMez = T00L710_A4537HreBarNMez[0] ;
         n4537HreBarNMez = T00L710_n4537HreBarNMez[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", A4537HreBarNMez);
         A4538HreNumTen = T00L710_A4538HreNumTen[0] ;
         n4538HreNumTen = T00L710_n4538HreNumTen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", A4538HreNumTen);
         A4539HreIntCod = T00L710_A4539HreIntCod[0] ;
         n4539HreIntCod = T00L710_n4539HreIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
         A4540HreIntDsc = T00L710_A4540HreIntDsc[0] ;
         n4540HreIntDsc = T00L710_n4540HreIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", A4540HreIntDsc);
         A4541HreNumTon = T00L710_A4541HreNumTon[0] ;
         n4541HreNumTon = T00L710_n4541HreNumTon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", A4541HreNumTon);
         A4496HreMaqHdr = T00L710_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = T00L710_n4496HreMaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
         A4542HreTotKgm = T00L710_A4542HreTotKgm[0] ;
         n4542HreTotKgm = T00L710_n4542HreTotKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
         A4543HreTotMtr = T00L710_A4543HreTotMtr[0] ;
         n4543HreTotMtr = T00L710_n4543HreTotMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
         A4544HreTotPie = T00L710_A4544HreTotPie[0] ;
         n4544HreTotPie = T00L710_n4544HreTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
         A8608HreNumColF = T00L710_A8608HreNumColF[0] ;
         n8608HreNumColF = T00L710_n8608HreNumColF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8608HreNumColF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8608HreNumColF), 8, 0));
         A8610HreFamCodT = T00L710_A8610HreFamCodT[0] ;
         n8610HreFamCodT = T00L710_n8610HreFamCodT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8610HreFamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8610HreFamCodT), 4, 0));
         A8623HreHilasa = T00L710_A8623HreHilasa[0] ;
         n8623HreHilasa = T00L710_n8623HreHilasa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8623HreHilasa", A8623HreHilasa);
         A8624HreEnsayo = T00L710_A8624HreEnsayo[0] ;
         n8624HreEnsayo = T00L710_n8624HreEnsayo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8624HreEnsayo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8624HreEnsayo), 8, 0));
         A8625HreOpa = T00L710_A8625HreOpa[0] ;
         n8625HreOpa = T00L710_n8625HreOpa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8625HreOpa", A8625HreOpa);
         A8626HreOpn = T00L710_A8626HreOpn[0] ;
         n8626HreOpn = T00L710_n8626HreOpn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8626HreOpn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8626HreOpn), 2, 0));
         A11318HreDispCli = T00L710_A11318HreDispCli[0] ;
         n11318HreDispCli = T00L710_n11318HreDispCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11318HreDispCli", A11318HreDispCli);
         A11320HreMacCod = T00L710_A11320HreMacCod[0] ;
         n11320HreMacCod = T00L710_n11320HreMacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11320HreMacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11320HreMacCod), 8, 0));
         A12264HreNInter = T00L710_A12264HreNInter[0] ;
         n12264HreNInter = T00L710_n12264HreNInter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12264HreNInter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12264HreNInter), 8, 0));
         A12535HreCencId = T00L710_A12535HreCencId[0] ;
         n12535HreCencId = T00L710_n12535HreCencId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12535HreCencId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12535HreCencId), 4, 0));
         A12536HreCenDsc = T00L710_A12536HreCenDsc[0] ;
         n12536HreCenDsc = T00L710_n12536HreCenDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12536HreCenDsc", A12536HreCenDsc);
         A13450HreComp1 = T00L710_A13450HreComp1[0] ;
         n13450HreComp1 = T00L710_n13450HreComp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13450HreComp1", A13450HreComp1);
         A13451HreComp2 = T00L710_A13451HreComp2[0] ;
         n13451HreComp2 = T00L710_n13451HreComp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13451HreComp2", A13451HreComp2);
         A13763HreUser = T00L710_A13763HreUser[0] ;
         A13764HreDiaHora = T00L710_A13764HreDiaHora[0] ;
         A13765HreCdn2 = T00L710_A13765HreCdn2[0] ;
         A13766HreCtw = T00L710_A13766HreCtw[0] ;
         A252CliCod = T00L710_A252CliCod[0] ;
         n252CliCod = T00L710_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         zmL7675( -3) ;
      }
      pr_default.close(8);
      onLoadActionsL7675( ) ;
   }

   public void onLoadActionsL7675( )
   {
      A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13842BarNhdr_Hi", A13842BarNhdr_Hi);
   }

   public void checkExtendedTableL7675( )
   {
      nIsDirty_675 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00L78 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00L78_A407EmprNom[0] ;
      n407EmprNom = T00L78_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(6);
      /* Using cursor T00L79 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00L79_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      nIsDirty_675 = (short)(1) ;
      A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A13842BarNhdr_Hi", A13842BarNhdr_Hi);
   }

   public void closeExtendedTableCursorsL7675( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod )
   {
      /* Using cursor T00L711 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00L711_A407EmprNom[0] ;
      n407EmprNom = T00L711_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_5( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00L712 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T00L712_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKeyL7675( )
   {
      /* Using cursor T00L713 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound675 = (short)(1) ;
      }
      else
      {
         RcdFound675 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00L77 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zmL7675( 3) ;
         RcdFound675 = (short)(1) ;
         A4492HreBarCod = T00L77_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00L77_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00L77_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00L77_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4516HreDisCli = T00L77_A4516HreDisCli[0] ;
         n4516HreDisCli = T00L77_n4516HreDisCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4516HreDisCli", A4516HreDisCli);
         A4517HreBarSer = T00L77_A4517HreBarSer[0] ;
         n4517HreBarSer = T00L77_n4517HreBarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4517HreBarSer", A4517HreBarSer);
         A4518HreBarDsc = T00L77_A4518HreBarDsc[0] ;
         n4518HreBarDsc = T00L77_n4518HreBarDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4518HreBarDsc", A4518HreBarDsc);
         A4519HreTipArt = T00L77_A4519HreTipArt[0] ;
         n4519HreTipArt = T00L77_n4519HreTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4519HreTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4519HreTipArt), 4, 0));
         A4520HreTipArtD = T00L77_A4520HreTipArtD[0] ;
         n4520HreTipArtD = T00L77_n4520HreTipArtD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4520HreTipArtD", A4520HreTipArtD);
         A4521HreColNom = T00L77_A4521HreColNom[0] ;
         n4521HreColNom = T00L77_n4521HreColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4521HreColNom", A4521HreColNom);
         A4522HreColNum = T00L77_A4522HreColNum[0] ;
         n4522HreColNum = T00L77_n4522HreColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4522HreColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4522HreColNum), 6, 0));
         A4523HreColNomC = T00L77_A4523HreColNomC[0] ;
         n4523HreColNomC = T00L77_n4523HreColNomC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4523HreColNomC", A4523HreColNomC);
         A4524HreColNumC = T00L77_A4524HreColNumC[0] ;
         n4524HreColNumC = T00L77_n4524HreColNumC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4524HreColNumC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4524HreColNumC), 6, 0));
         A4525HreTipCol = T00L77_A4525HreTipCol[0] ;
         n4525HreTipCol = T00L77_n4525HreTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4525HreTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4525HreTipCol), 2, 0));
         A4526HreTipColN = T00L77_A4526HreTipColN[0] ;
         n4526HreTipColN = T00L77_n4526HreTipColN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4526HreTipColN", A4526HreTipColN);
         A4527HreFecGen = T00L77_A4527HreFecGen[0] ;
         n4527HreFecGen = T00L77_n4527HreFecGen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4527HreFecGen", localUtil.format(A4527HreFecGen, "99/99/99"));
         A4528HreFecCli = T00L77_A4528HreFecCli[0] ;
         n4528HreFecCli = T00L77_n4528HreFecCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4528HreFecCli", localUtil.format(A4528HreFecCli, "99/99/99"));
         A4529HreFecTin = T00L77_A4529HreFecTin[0] ;
         n4529HreFecTin = T00L77_n4529HreFecTin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4529HreFecTin", localUtil.format(A4529HreFecTin, "99/99/99"));
         A4530HreFecFpr = T00L77_A4530HreFecFpr[0] ;
         n4530HreFecFpr = T00L77_n4530HreFecFpr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4530HreFecFpr", localUtil.format(A4530HreFecFpr, "99/99/99"));
         A4531HreBarMat = T00L77_A4531HreBarMat[0] ;
         n4531HreBarMat = T00L77_n4531HreBarMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4531HreBarMat", A4531HreBarMat);
         A4532HreBarKgm = T00L77_A4532HreBarKgm[0] ;
         n4532HreBarKgm = T00L77_n4532HreBarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4532HreBarKgm", GXutil.ltrimstr( A4532HreBarKgm, 9, 2));
         A4533HreBarMtr = T00L77_A4533HreBarMtr[0] ;
         n4533HreBarMtr = T00L77_n4533HreBarMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4533HreBarMtr", GXutil.ltrimstr( A4533HreBarMtr, 9, 2));
         A4534HreBarPie = T00L77_A4534HreBarPie[0] ;
         n4534HreBarPie = T00L77_n4534HreBarPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4534HreBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4534HreBarPie), 6, 0));
         A4535HrePartCod = T00L77_A4535HrePartCod[0] ;
         n4535HrePartCod = T00L77_n4535HrePartCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4535HrePartCod", A4535HrePartCod);
         A4536HreBarNMtr = T00L77_A4536HreBarNMtr[0] ;
         n4536HreBarNMtr = T00L77_n4536HreBarNMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4536HreBarNMtr", A4536HreBarNMtr);
         A4537HreBarNMez = T00L77_A4537HreBarNMez[0] ;
         n4537HreBarNMez = T00L77_n4537HreBarNMez[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4537HreBarNMez", A4537HreBarNMez);
         A4538HreNumTen = T00L77_A4538HreNumTen[0] ;
         n4538HreNumTen = T00L77_n4538HreNumTen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4538HreNumTen", A4538HreNumTen);
         A4539HreIntCod = T00L77_A4539HreIntCod[0] ;
         n4539HreIntCod = T00L77_n4539HreIntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4539HreIntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4539HreIntCod), 2, 0));
         A4540HreIntDsc = T00L77_A4540HreIntDsc[0] ;
         n4540HreIntDsc = T00L77_n4540HreIntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4540HreIntDsc", A4540HreIntDsc);
         A4541HreNumTon = T00L77_A4541HreNumTon[0] ;
         n4541HreNumTon = T00L77_n4541HreNumTon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4541HreNumTon", A4541HreNumTon);
         A4496HreMaqHdr = T00L77_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = T00L77_n4496HreMaqHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4496HreMaqHdr", A4496HreMaqHdr);
         A4542HreTotKgm = T00L77_A4542HreTotKgm[0] ;
         n4542HreTotKgm = T00L77_n4542HreTotKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4542HreTotKgm", GXutil.ltrimstr( A4542HreTotKgm, 9, 2));
         A4543HreTotMtr = T00L77_A4543HreTotMtr[0] ;
         n4543HreTotMtr = T00L77_n4543HreTotMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4543HreTotMtr", GXutil.ltrimstr( A4543HreTotMtr, 9, 2));
         A4544HreTotPie = T00L77_A4544HreTotPie[0] ;
         n4544HreTotPie = T00L77_n4544HreTotPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4544HreTotPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4544HreTotPie), 6, 0));
         A8608HreNumColF = T00L77_A8608HreNumColF[0] ;
         n8608HreNumColF = T00L77_n8608HreNumColF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8608HreNumColF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8608HreNumColF), 8, 0));
         A8610HreFamCodT = T00L77_A8610HreFamCodT[0] ;
         n8610HreFamCodT = T00L77_n8610HreFamCodT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8610HreFamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8610HreFamCodT), 4, 0));
         A8623HreHilasa = T00L77_A8623HreHilasa[0] ;
         n8623HreHilasa = T00L77_n8623HreHilasa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8623HreHilasa", A8623HreHilasa);
         A8624HreEnsayo = T00L77_A8624HreEnsayo[0] ;
         n8624HreEnsayo = T00L77_n8624HreEnsayo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8624HreEnsayo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8624HreEnsayo), 8, 0));
         A8625HreOpa = T00L77_A8625HreOpa[0] ;
         n8625HreOpa = T00L77_n8625HreOpa[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8625HreOpa", A8625HreOpa);
         A8626HreOpn = T00L77_A8626HreOpn[0] ;
         n8626HreOpn = T00L77_n8626HreOpn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8626HreOpn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8626HreOpn), 2, 0));
         A11318HreDispCli = T00L77_A11318HreDispCli[0] ;
         n11318HreDispCli = T00L77_n11318HreDispCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11318HreDispCli", A11318HreDispCli);
         A11320HreMacCod = T00L77_A11320HreMacCod[0] ;
         n11320HreMacCod = T00L77_n11320HreMacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11320HreMacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11320HreMacCod), 8, 0));
         A12264HreNInter = T00L77_A12264HreNInter[0] ;
         n12264HreNInter = T00L77_n12264HreNInter[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12264HreNInter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12264HreNInter), 8, 0));
         A12535HreCencId = T00L77_A12535HreCencId[0] ;
         n12535HreCencId = T00L77_n12535HreCencId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12535HreCencId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12535HreCencId), 4, 0));
         A12536HreCenDsc = T00L77_A12536HreCenDsc[0] ;
         n12536HreCenDsc = T00L77_n12536HreCenDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12536HreCenDsc", A12536HreCenDsc);
         A13450HreComp1 = T00L77_A13450HreComp1[0] ;
         n13450HreComp1 = T00L77_n13450HreComp1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13450HreComp1", A13450HreComp1);
         A13451HreComp2 = T00L77_A13451HreComp2[0] ;
         n13451HreComp2 = T00L77_n13451HreComp2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13451HreComp2", A13451HreComp2);
         A13763HreUser = T00L77_A13763HreUser[0] ;
         A13764HreDiaHora = T00L77_A13764HreDiaHora[0] ;
         A13765HreCdn2 = T00L77_A13765HreCdn2[0] ;
         A13766HreCtw = T00L77_A13766HreCtw[0] ;
         A396EmprCod = T00L77_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T00L77_A252CliCod[0] ;
         n252CliCod = T00L77_n252CliCod[0] ;
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
         loadL7675( ) ;
         if ( AnyError == 1 )
         {
            RcdFound675 = (short)(0) ;
            initializeNonKeyL7675( ) ;
         }
         Gx_mode = sMode675 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound675 = (short)(0) ;
         initializeNonKeyL7675( ) ;
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
      getKeyL7675( ) ;
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
      /* Using cursor T00L714 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L714_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00L714_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L714_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00L714_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L714_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L714_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00L714_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L714_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L714_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L714_A4495HreNumCie[0] < A4495HreNumCie ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L714_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00L714_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L714_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00L714_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L714_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L714_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00L714_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L714_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L714_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L714_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L714_A4495HreNumCie[0] > A4495HreNumCie ) ) )
         {
            A396EmprCod = T00L714_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T00L714_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00L714_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00L714_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00L714_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            RcdFound675 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound675 = (short)(0) ;
      /* Using cursor T00L715 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L715_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00L715_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L715_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00L715_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L715_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L715_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00L715_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L715_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L715_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L715_A4495HreNumCie[0] > A4495HreNumCie ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L715_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00L715_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L715_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00L715_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L715_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L715_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00L715_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L715_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L715_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L715_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L715_A4495HreNumCie[0] < A4495HreNumCie ) ) )
         {
            A396EmprCod = T00L715_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T00L715_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00L715_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00L715_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00L715_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            RcdFound675 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyL7675( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertL7675( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateL7675( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertL7675( ) ;
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
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertL7675( ) ;
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
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         GX_FocusControl = edtEmprCod_Internalname ;
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
      getKeyL7675( ) ;
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
            A396EmprCod = Z396EmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thisrec");
      GX_FocusControl = edtHreDisCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_L70( ) ;
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
      scanStartL7675( ) ;
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
      scanEndL7675( ) ;
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
      scanStartL7675( ) ;
      if ( RcdFound675 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound675 != 0 )
         {
            scanNextL7675( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHreDisCli_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL7675( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyL7675( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L76 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z4516HreDisCli, T00L76_A4516HreDisCli[0]) != 0 ) || ( GXutil.strcmp(Z4517HreBarSer, T00L76_A4517HreBarSer[0]) != 0 ) || ( GXutil.strcmp(Z4518HreBarDsc, T00L76_A4518HreBarDsc[0]) != 0 ) || ( Z4519HreTipArt != T00L76_A4519HreTipArt[0] ) || ( GXutil.strcmp(Z4520HreTipArtD, T00L76_A4520HreTipArtD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4521HreColNom, T00L76_A4521HreColNom[0]) != 0 ) || ( Z4522HreColNum != T00L76_A4522HreColNum[0] ) || ( GXutil.strcmp(Z4523HreColNomC, T00L76_A4523HreColNomC[0]) != 0 ) || ( Z4524HreColNumC != T00L76_A4524HreColNumC[0] ) || ( Z4525HreTipCol != T00L76_A4525HreTipCol[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4526HreTipColN, T00L76_A4526HreTipColN[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z4527HreFecGen), GXutil.resetTime(T00L76_A4527HreFecGen[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4528HreFecCli), GXutil.resetTime(T00L76_A4528HreFecCli[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4529HreFecTin), GXutil.resetTime(T00L76_A4529HreFecTin[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z4530HreFecFpr), GXutil.resetTime(T00L76_A4530HreFecFpr[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4531HreBarMat, T00L76_A4531HreBarMat[0]) != 0 ) || ( DecimalUtil.compareTo(Z4532HreBarKgm, T00L76_A4532HreBarKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4533HreBarMtr, T00L76_A4533HreBarMtr[0]) != 0 ) || ( Z4534HreBarPie != T00L76_A4534HreBarPie[0] ) || ( GXutil.strcmp(Z4535HrePartCod, T00L76_A4535HrePartCod[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4536HreBarNMtr, T00L76_A4536HreBarNMtr[0]) != 0 ) || ( GXutil.strcmp(Z4537HreBarNMez, T00L76_A4537HreBarNMez[0]) != 0 ) || ( GXutil.strcmp(Z4538HreNumTen, T00L76_A4538HreNumTen[0]) != 0 ) || ( Z4539HreIntCod != T00L76_A4539HreIntCod[0] ) || ( GXutil.strcmp(Z4540HreIntDsc, T00L76_A4540HreIntDsc[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4541HreNumTon, T00L76_A4541HreNumTon[0]) != 0 ) || ( GXutil.strcmp(Z4496HreMaqHdr, T00L76_A4496HreMaqHdr[0]) != 0 ) || ( DecimalUtil.compareTo(Z4542HreTotKgm, T00L76_A4542HreTotKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z4543HreTotMtr, T00L76_A4543HreTotMtr[0]) != 0 ) || ( Z4544HreTotPie != T00L76_A4544HreTotPie[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8608HreNumColF != T00L76_A8608HreNumColF[0] ) || ( Z8610HreFamCodT != T00L76_A8610HreFamCodT[0] ) || ( GXutil.strcmp(Z8623HreHilasa, T00L76_A8623HreHilasa[0]) != 0 ) || ( Z8624HreEnsayo != T00L76_A8624HreEnsayo[0] ) || ( GXutil.strcmp(Z8625HreOpa, T00L76_A8625HreOpa[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z8626HreOpn != T00L76_A8626HreOpn[0] ) || ( GXutil.strcmp(Z11318HreDispCli, T00L76_A11318HreDispCli[0]) != 0 ) || ( Z11320HreMacCod != T00L76_A11320HreMacCod[0] ) || ( Z12264HreNInter != T00L76_A12264HreNInter[0] ) || ( Z12535HreCencId != T00L76_A12535HreCencId[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12536HreCenDsc, T00L76_A12536HreCenDsc[0]) != 0 ) || ( GXutil.strcmp(Z13450HreComp1, T00L76_A13450HreComp1[0]) != 0 ) || ( GXutil.strcmp(Z13451HreComp2, T00L76_A13451HreComp2[0]) != 0 ) || ( GXutil.strcmp(Z13763HreUser, T00L76_A13763HreUser[0]) != 0 ) || !( GXutil.dateCompare(Z13764HreDiaHora, T00L76_A13764HreDiaHora[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13765HreCdn2, T00L76_A13765HreCdn2[0]) != 0 ) || ( GXutil.strcmp(Z13766HreCtw, T00L76_A13766HreCtw[0]) != 0 ) || ( Z252CliCod != T00L76_A252CliCod[0] ) )
         {
            if ( GXutil.strcmp(Z4516HreDisCli, T00L76_A4516HreDisCli[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreDisCli");
               GXutil.writeLogRaw("Old: ",Z4516HreDisCli);
               GXutil.writeLogRaw("Current: ",T00L76_A4516HreDisCli[0]);
            }
            if ( GXutil.strcmp(Z4517HreBarSer, T00L76_A4517HreBarSer[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarSer");
               GXutil.writeLogRaw("Old: ",Z4517HreBarSer);
               GXutil.writeLogRaw("Current: ",T00L76_A4517HreBarSer[0]);
            }
            if ( GXutil.strcmp(Z4518HreBarDsc, T00L76_A4518HreBarDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarDsc");
               GXutil.writeLogRaw("Old: ",Z4518HreBarDsc);
               GXutil.writeLogRaw("Current: ",T00L76_A4518HreBarDsc[0]);
            }
            if ( Z4519HreTipArt != T00L76_A4519HreTipArt[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTipArt");
               GXutil.writeLogRaw("Old: ",Z4519HreTipArt);
               GXutil.writeLogRaw("Current: ",T00L76_A4519HreTipArt[0]);
            }
            if ( GXutil.strcmp(Z4520HreTipArtD, T00L76_A4520HreTipArtD[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTipArtD");
               GXutil.writeLogRaw("Old: ",Z4520HreTipArtD);
               GXutil.writeLogRaw("Current: ",T00L76_A4520HreTipArtD[0]);
            }
            if ( GXutil.strcmp(Z4521HreColNom, T00L76_A4521HreColNom[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreColNom");
               GXutil.writeLogRaw("Old: ",Z4521HreColNom);
               GXutil.writeLogRaw("Current: ",T00L76_A4521HreColNom[0]);
            }
            if ( Z4522HreColNum != T00L76_A4522HreColNum[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreColNum");
               GXutil.writeLogRaw("Old: ",Z4522HreColNum);
               GXutil.writeLogRaw("Current: ",T00L76_A4522HreColNum[0]);
            }
            if ( GXutil.strcmp(Z4523HreColNomC, T00L76_A4523HreColNomC[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreColNomC");
               GXutil.writeLogRaw("Old: ",Z4523HreColNomC);
               GXutil.writeLogRaw("Current: ",T00L76_A4523HreColNomC[0]);
            }
            if ( Z4524HreColNumC != T00L76_A4524HreColNumC[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreColNumC");
               GXutil.writeLogRaw("Old: ",Z4524HreColNumC);
               GXutil.writeLogRaw("Current: ",T00L76_A4524HreColNumC[0]);
            }
            if ( Z4525HreTipCol != T00L76_A4525HreTipCol[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTipCol");
               GXutil.writeLogRaw("Old: ",Z4525HreTipCol);
               GXutil.writeLogRaw("Current: ",T00L76_A4525HreTipCol[0]);
            }
            if ( GXutil.strcmp(Z4526HreTipColN, T00L76_A4526HreTipColN[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTipColN");
               GXutil.writeLogRaw("Old: ",Z4526HreTipColN);
               GXutil.writeLogRaw("Current: ",T00L76_A4526HreTipColN[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4527HreFecGen), GXutil.resetTime(T00L76_A4527HreFecGen[0])) ) )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFecGen");
               GXutil.writeLogRaw("Old: ",Z4527HreFecGen);
               GXutil.writeLogRaw("Current: ",T00L76_A4527HreFecGen[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4528HreFecCli), GXutil.resetTime(T00L76_A4528HreFecCli[0])) ) )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFecCli");
               GXutil.writeLogRaw("Old: ",Z4528HreFecCli);
               GXutil.writeLogRaw("Current: ",T00L76_A4528HreFecCli[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4529HreFecTin), GXutil.resetTime(T00L76_A4529HreFecTin[0])) ) )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFecTin");
               GXutil.writeLogRaw("Old: ",Z4529HreFecTin);
               GXutil.writeLogRaw("Current: ",T00L76_A4529HreFecTin[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z4530HreFecFpr), GXutil.resetTime(T00L76_A4530HreFecFpr[0])) ) )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFecFpr");
               GXutil.writeLogRaw("Old: ",Z4530HreFecFpr);
               GXutil.writeLogRaw("Current: ",T00L76_A4530HreFecFpr[0]);
            }
            if ( GXutil.strcmp(Z4531HreBarMat, T00L76_A4531HreBarMat[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarMat");
               GXutil.writeLogRaw("Old: ",Z4531HreBarMat);
               GXutil.writeLogRaw("Current: ",T00L76_A4531HreBarMat[0]);
            }
            if ( DecimalUtil.compareTo(Z4532HreBarKgm, T00L76_A4532HreBarKgm[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarKgm");
               GXutil.writeLogRaw("Old: ",Z4532HreBarKgm);
               GXutil.writeLogRaw("Current: ",T00L76_A4532HreBarKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z4533HreBarMtr, T00L76_A4533HreBarMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarMtr");
               GXutil.writeLogRaw("Old: ",Z4533HreBarMtr);
               GXutil.writeLogRaw("Current: ",T00L76_A4533HreBarMtr[0]);
            }
            if ( Z4534HreBarPie != T00L76_A4534HreBarPie[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarPie");
               GXutil.writeLogRaw("Old: ",Z4534HreBarPie);
               GXutil.writeLogRaw("Current: ",T00L76_A4534HreBarPie[0]);
            }
            if ( GXutil.strcmp(Z4535HrePartCod, T00L76_A4535HrePartCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HrePartCod");
               GXutil.writeLogRaw("Old: ",Z4535HrePartCod);
               GXutil.writeLogRaw("Current: ",T00L76_A4535HrePartCod[0]);
            }
            if ( GXutil.strcmp(Z4536HreBarNMtr, T00L76_A4536HreBarNMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarNMtr");
               GXutil.writeLogRaw("Old: ",Z4536HreBarNMtr);
               GXutil.writeLogRaw("Current: ",T00L76_A4536HreBarNMtr[0]);
            }
            if ( GXutil.strcmp(Z4537HreBarNMez, T00L76_A4537HreBarNMez[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreBarNMez");
               GXutil.writeLogRaw("Old: ",Z4537HreBarNMez);
               GXutil.writeLogRaw("Current: ",T00L76_A4537HreBarNMez[0]);
            }
            if ( GXutil.strcmp(Z4538HreNumTen, T00L76_A4538HreNumTen[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNumTen");
               GXutil.writeLogRaw("Old: ",Z4538HreNumTen);
               GXutil.writeLogRaw("Current: ",T00L76_A4538HreNumTen[0]);
            }
            if ( Z4539HreIntCod != T00L76_A4539HreIntCod[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreIntCod");
               GXutil.writeLogRaw("Old: ",Z4539HreIntCod);
               GXutil.writeLogRaw("Current: ",T00L76_A4539HreIntCod[0]);
            }
            if ( GXutil.strcmp(Z4540HreIntDsc, T00L76_A4540HreIntDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreIntDsc");
               GXutil.writeLogRaw("Old: ",Z4540HreIntDsc);
               GXutil.writeLogRaw("Current: ",T00L76_A4540HreIntDsc[0]);
            }
            if ( GXutil.strcmp(Z4541HreNumTon, T00L76_A4541HreNumTon[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNumTon");
               GXutil.writeLogRaw("Old: ",Z4541HreNumTon);
               GXutil.writeLogRaw("Current: ",T00L76_A4541HreNumTon[0]);
            }
            if ( GXutil.strcmp(Z4496HreMaqHdr, T00L76_A4496HreMaqHdr[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreMaqHdr");
               GXutil.writeLogRaw("Old: ",Z4496HreMaqHdr);
               GXutil.writeLogRaw("Current: ",T00L76_A4496HreMaqHdr[0]);
            }
            if ( DecimalUtil.compareTo(Z4542HreTotKgm, T00L76_A4542HreTotKgm[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTotKgm");
               GXutil.writeLogRaw("Old: ",Z4542HreTotKgm);
               GXutil.writeLogRaw("Current: ",T00L76_A4542HreTotKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z4543HreTotMtr, T00L76_A4543HreTotMtr[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTotMtr");
               GXutil.writeLogRaw("Old: ",Z4543HreTotMtr);
               GXutil.writeLogRaw("Current: ",T00L76_A4543HreTotMtr[0]);
            }
            if ( Z4544HreTotPie != T00L76_A4544HreTotPie[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreTotPie");
               GXutil.writeLogRaw("Old: ",Z4544HreTotPie);
               GXutil.writeLogRaw("Current: ",T00L76_A4544HreTotPie[0]);
            }
            if ( Z8608HreNumColF != T00L76_A8608HreNumColF[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNumColF");
               GXutil.writeLogRaw("Old: ",Z8608HreNumColF);
               GXutil.writeLogRaw("Current: ",T00L76_A8608HreNumColF[0]);
            }
            if ( Z8610HreFamCodT != T00L76_A8610HreFamCodT[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFamCodT");
               GXutil.writeLogRaw("Old: ",Z8610HreFamCodT);
               GXutil.writeLogRaw("Current: ",T00L76_A8610HreFamCodT[0]);
            }
            if ( GXutil.strcmp(Z8623HreHilasa, T00L76_A8623HreHilasa[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreHilasa");
               GXutil.writeLogRaw("Old: ",Z8623HreHilasa);
               GXutil.writeLogRaw("Current: ",T00L76_A8623HreHilasa[0]);
            }
            if ( Z8624HreEnsayo != T00L76_A8624HreEnsayo[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreEnsayo");
               GXutil.writeLogRaw("Old: ",Z8624HreEnsayo);
               GXutil.writeLogRaw("Current: ",T00L76_A8624HreEnsayo[0]);
            }
            if ( GXutil.strcmp(Z8625HreOpa, T00L76_A8625HreOpa[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreOpa");
               GXutil.writeLogRaw("Old: ",Z8625HreOpa);
               GXutil.writeLogRaw("Current: ",T00L76_A8625HreOpa[0]);
            }
            if ( Z8626HreOpn != T00L76_A8626HreOpn[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreOpn");
               GXutil.writeLogRaw("Old: ",Z8626HreOpn);
               GXutil.writeLogRaw("Current: ",T00L76_A8626HreOpn[0]);
            }
            if ( GXutil.strcmp(Z11318HreDispCli, T00L76_A11318HreDispCli[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreDispCli");
               GXutil.writeLogRaw("Old: ",Z11318HreDispCli);
               GXutil.writeLogRaw("Current: ",T00L76_A11318HreDispCli[0]);
            }
            if ( Z11320HreMacCod != T00L76_A11320HreMacCod[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreMacCod");
               GXutil.writeLogRaw("Old: ",Z11320HreMacCod);
               GXutil.writeLogRaw("Current: ",T00L76_A11320HreMacCod[0]);
            }
            if ( Z12264HreNInter != T00L76_A12264HreNInter[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNInter");
               GXutil.writeLogRaw("Old: ",Z12264HreNInter);
               GXutil.writeLogRaw("Current: ",T00L76_A12264HreNInter[0]);
            }
            if ( Z12535HreCencId != T00L76_A12535HreCencId[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCencId");
               GXutil.writeLogRaw("Old: ",Z12535HreCencId);
               GXutil.writeLogRaw("Current: ",T00L76_A12535HreCencId[0]);
            }
            if ( GXutil.strcmp(Z12536HreCenDsc, T00L76_A12536HreCenDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCenDsc");
               GXutil.writeLogRaw("Old: ",Z12536HreCenDsc);
               GXutil.writeLogRaw("Current: ",T00L76_A12536HreCenDsc[0]);
            }
            if ( GXutil.strcmp(Z13450HreComp1, T00L76_A13450HreComp1[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreComp1");
               GXutil.writeLogRaw("Old: ",Z13450HreComp1);
               GXutil.writeLogRaw("Current: ",T00L76_A13450HreComp1[0]);
            }
            if ( GXutil.strcmp(Z13451HreComp2, T00L76_A13451HreComp2[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreComp2");
               GXutil.writeLogRaw("Old: ",Z13451HreComp2);
               GXutil.writeLogRaw("Current: ",T00L76_A13451HreComp2[0]);
            }
            if ( GXutil.strcmp(Z13763HreUser, T00L76_A13763HreUser[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreUser");
               GXutil.writeLogRaw("Old: ",Z13763HreUser);
               GXutil.writeLogRaw("Current: ",T00L76_A13763HreUser[0]);
            }
            if ( !( GXutil.dateCompare(Z13764HreDiaHora, T00L76_A13764HreDiaHora[0]) ) )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreDiaHora");
               GXutil.writeLogRaw("Old: ",Z13764HreDiaHora);
               GXutil.writeLogRaw("Current: ",T00L76_A13764HreDiaHora[0]);
            }
            if ( GXutil.strcmp(Z13765HreCdn2, T00L76_A13765HreCdn2[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCdn2");
               GXutil.writeLogRaw("Old: ",Z13765HreCdn2);
               GXutil.writeLogRaw("Current: ",T00L76_A13765HreCdn2[0]);
            }
            if ( GXutil.strcmp(Z13766HreCtw, T00L76_A13766HreCtw[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCtw");
               GXutil.writeLogRaw("Old: ",Z13766HreCtw);
               GXutil.writeLogRaw("Current: ",T00L76_A13766HreCtw[0]);
            }
            if ( Z252CliCod != T00L76_A252CliCod[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T00L76_A252CliCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL7675( )
   {
      beforeValidateL7675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL7675( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL7675( 0) ;
         checkOptimisticConcurrencyL7675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL7675( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL7675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L716 */
                  pr_default.execute(14, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n8608HreNumColF), Integer.valueOf(A8608HreNumColF), Boolean.valueOf(n8610HreFamCodT), Short.valueOf(A8610HreFamCodT), Boolean.valueOf(n8623HreHilasa), A8623HreHilasa, Boolean.valueOf(n8624HreEnsayo), Integer.valueOf(A8624HreEnsayo), Boolean.valueOf(n8625HreOpa), A8625HreOpa, Boolean.valueOf(n8626HreOpn), Byte.valueOf(A8626HreOpn), Boolean.valueOf(n11318HreDispCli), A11318HreDispCli, Boolean.valueOf(n11320HreMacCod), Integer.valueOf(A11320HreMacCod), Boolean.valueOf(n12264HreNInter), Integer.valueOf(A12264HreNInter), Boolean.valueOf(n12535HreCencId), Short.valueOf(A12535HreCencId), Boolean.valueOf(n12536HreCenDsc), A12536HreCenDsc, Boolean.valueOf(n13450HreComp1), A13450HreComp1, Boolean.valueOf(n13451HreComp2), A13451HreComp2, A13763HreUser, A13764HreDiaHora, A13765HreCdn2, A13766HreCtw, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
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
                        processLevelL7675( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionL70( ) ;
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
            loadL7675( ) ;
         }
         endLevelL7675( ) ;
      }
      closeExtendedTableCursorsL7675( ) ;
   }

   public void updateL7675( )
   {
      beforeValidateL7675( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL7675( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL7675( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL7675( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateL7675( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L717 */
                  pr_default.execute(15, new Object[] {Boolean.valueOf(n4516HreDisCli), A4516HreDisCli, Boolean.valueOf(n4517HreBarSer), A4517HreBarSer, Boolean.valueOf(n4518HreBarDsc), A4518HreBarDsc, Boolean.valueOf(n4519HreTipArt), Short.valueOf(A4519HreTipArt), Boolean.valueOf(n4520HreTipArtD), A4520HreTipArtD, Boolean.valueOf(n4521HreColNom), A4521HreColNom, Boolean.valueOf(n4522HreColNum), Integer.valueOf(A4522HreColNum), Boolean.valueOf(n4523HreColNomC), A4523HreColNomC, Boolean.valueOf(n4524HreColNumC), Integer.valueOf(A4524HreColNumC), Boolean.valueOf(n4525HreTipCol), Byte.valueOf(A4525HreTipCol), Boolean.valueOf(n4526HreTipColN), A4526HreTipColN, Boolean.valueOf(n4527HreFecGen), A4527HreFecGen, Boolean.valueOf(n4528HreFecCli), A4528HreFecCli, Boolean.valueOf(n4529HreFecTin), A4529HreFecTin, Boolean.valueOf(n4530HreFecFpr), A4530HreFecFpr, Boolean.valueOf(n4531HreBarMat), A4531HreBarMat, Boolean.valueOf(n4532HreBarKgm), A4532HreBarKgm, Boolean.valueOf(n4533HreBarMtr), A4533HreBarMtr, Boolean.valueOf(n4534HreBarPie), Integer.valueOf(A4534HreBarPie), Boolean.valueOf(n4535HrePartCod), A4535HrePartCod, Boolean.valueOf(n4536HreBarNMtr), A4536HreBarNMtr, Boolean.valueOf(n4537HreBarNMez), A4537HreBarNMez, Boolean.valueOf(n4538HreNumTen), A4538HreNumTen, Boolean.valueOf(n4539HreIntCod), Byte.valueOf(A4539HreIntCod), Boolean.valueOf(n4540HreIntDsc), A4540HreIntDsc, Boolean.valueOf(n4541HreNumTon), A4541HreNumTon, Boolean.valueOf(n4496HreMaqHdr), A4496HreMaqHdr, Boolean.valueOf(n4542HreTotKgm), A4542HreTotKgm, Boolean.valueOf(n4543HreTotMtr), A4543HreTotMtr, Boolean.valueOf(n4544HreTotPie), Integer.valueOf(A4544HreTotPie), Boolean.valueOf(n8608HreNumColF), Integer.valueOf(A8608HreNumColF), Boolean.valueOf(n8610HreFamCodT), Short.valueOf(A8610HreFamCodT), Boolean.valueOf(n8623HreHilasa), A8623HreHilasa, Boolean.valueOf(n8624HreEnsayo), Integer.valueOf(A8624HreEnsayo), Boolean.valueOf(n8625HreOpa), A8625HreOpa, Boolean.valueOf(n8626HreOpn), Byte.valueOf(A8626HreOpn), Boolean.valueOf(n11318HreDispCli), A11318HreDispCli, Boolean.valueOf(n11320HreMacCod), Integer.valueOf(A11320HreMacCod), Boolean.valueOf(n12264HreNInter), Integer.valueOf(A12264HreNInter), Boolean.valueOf(n12535HreCencId), Short.valueOf(A12535HreCencId), Boolean.valueOf(n12536HreCenDsc), A12536HreCenDsc, Boolean.valueOf(n13450HreComp1), A13450HreComp1, Boolean.valueOf(n13451HreComp2), A13451HreComp2, A13763HreUser, A13764HreDiaHora, A13765HreCdn2, A13766HreCtw, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREH");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateL7675( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelL7675( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionL70( ) ;
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
         endLevelL7675( ) ;
      }
      closeExtendedTableCursorsL7675( ) ;
   }

   public void deferredUpdateL7675( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL7675( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL7675( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL7675( ) ;
         afterConfirmL7675( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL7675( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00L718 */
               pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
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
                        initAllL7675( ) ;
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
                     resetCaptionL70( ) ;
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
      endLevelL7675( ) ;
      Gx_mode = sMode675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL7675( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00L719 */
         pr_default.execute(17, new Object[] {A396EmprCod});
         A407EmprNom = T00L719_A407EmprNom[0] ;
         n407EmprNom = T00L719_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(17);
         A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A13842BarNhdr_Hi", A13842BarNhdr_Hi);
         /* Using cursor T00L720 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00L720_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(18);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00L721 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISHRAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00L722 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HAGRHD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00L723 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (MAQUINAS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00L724 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00L725 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (AGRUPADAS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void processNestedLevelL7678( )
   {
      nGXsfl_275_idx = 0 ;
      while ( nGXsfl_275_idx < nRC_GXsfl_275 )
      {
         readRowL7678( ) ;
         if ( ( nRcdExists_678 != 0 ) || ( nIsMod_678 != 0 ) )
         {
            standaloneNotModalL7678( ) ;
            getKeyL7678( ) ;
            if ( ( nRcdExists_678 == 0 ) && ( nRcdDeleted_678 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertL7678( ) ;
            }
            else
            {
               if ( RcdFound678 != 0 )
               {
                  if ( ( nRcdDeleted_678 != 0 ) && ( nRcdExists_678 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteL7678( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_678 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateL7678( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_678 == 0 )
                  {
                     GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
         httpContext.changePostValue( edtHReMaqNh_Internalname, GXutil.ltrim( localUtil.ntoc( A7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqVX_Internalname, GXutil.ltrim( localUtil.ntoc( A7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqBL_Internalname, GXutil.ltrim( localUtil.ntoc( A7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqFlow_Internalname, GXutil.ltrim( localUtil.ntoc( A7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqRPM_Internalname, GXutil.ltrim( localUtil.ntoc( A7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqMol_Internalname, GXutil.ltrim( localUtil.ntoc( A7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqTor_Internalname, GXutil.ltrim( localUtil.ntoc( A7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqCla_Internalname, GXutil.rtrim( A7821HReMaqCla)) ;
         httpContext.changePostValue( edtHReMaqTej_Internalname, GXutil.ltrim( localUtil.ntoc( A7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqDel_Internalname, GXutil.ltrim( localUtil.ntoc( A7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHReMaqPML_Internalname, GXutil.ltrim( localUtil.ntoc( A7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosAA_Internalname, GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHrecosAd_Internalname, GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosCol_Internalname, GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosPA_Internalname, GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreCosPD_Internalname, GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLtsSb_Internalname, GXutil.ltrim( localUtil.ntoc( A9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreLtsRm_Internalname, GXutil.ltrim( localUtil.ntoc( A9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreAcaQ_Internalname, GXutil.rtrim( A9803HreAcaQ)) ;
         httpContext.changePostValue( edtHreAcab_Internalname, GXutil.rtrim( A9804HreAcab)) ;
         httpContext.changePostValue( edtHreNPrg_Internalname, GXutil.rtrim( A1094HreNPrg)) ;
         httpContext.changePostValue( edtHreLotF_Internalname, GXutil.rtrim( A697HreLotF)) ;
         httpContext.changePostValue( edtHreAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreGrm_Internalname, GXutil.ltrim( localUtil.ntoc( A10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreVel_Internalname, GXutil.ltrim( localUtil.ntoc( A10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtHreObs_Internalname, A10384HreObs) ;
         httpContext.changePostValue( edtHreAva_Internalname, GXutil.rtrim( A11508HreAva)) ;
         httpContext.changePostValue( edtHreAs_Internalname, GXutil.rtrim( A12126HreAs)) ;
         httpContext.changePostValue( edtHreAi_Internalname, GXutil.rtrim( A12127HreAi)) ;
         httpContext.changePostValue( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_275_idx, GXutil.rtrim( Z4546HreMaqCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4584HreFecPes_"+sGXsfl_275_idx, localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4549HreULinPro_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_275_idx, GXutil.rtrim( Z4863HreUsrCod)) ;
         httpContext.changePostValue( "ZT_"+"Z7814HReMaqNh_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7815HReMaqVX_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7816HReMaqBL_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7817HReMaqFlow_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7818HReMaqRPM_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7819HReMaqMol_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7820HReMaqTor_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7821HReMaqCla_"+sGXsfl_275_idx, GXutil.rtrim( Z7821HReMaqCla)) ;
         httpContext.changePostValue( "ZT_"+"Z7822HReMaqTej_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7823HReMaqDel_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7824HReMaqPML_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8602HreCosAA_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8603HrecosAd_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8604HreCosAnc_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8605HreCosCol_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8606HreCosPA_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8607HreCosPD_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9780HreLtsSb_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9781HreLtsRm_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z9803HreAcaQ_"+sGXsfl_275_idx, GXutil.rtrim( Z9803HreAcaQ)) ;
         httpContext.changePostValue( "ZT_"+"Z9804HreAcab_"+sGXsfl_275_idx, GXutil.rtrim( Z9804HreAcab)) ;
         httpContext.changePostValue( "ZT_"+"Z1094HreNPrg_"+sGXsfl_275_idx, GXutil.rtrim( Z1094HreNPrg)) ;
         httpContext.changePostValue( "ZT_"+"Z697HreLotF_"+sGXsfl_275_idx, GXutil.rtrim( Z697HreLotF)) ;
         httpContext.changePostValue( "ZT_"+"Z10381HreAnc_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10382HreGrm_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10383HreVel_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( Z10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10384HreObs_"+sGXsfl_275_idx, Z10384HreObs) ;
         httpContext.changePostValue( "ZT_"+"Z11508HreAva_"+sGXsfl_275_idx, GXutil.rtrim( Z11508HreAva)) ;
         httpContext.changePostValue( "ZT_"+"Z12126HreAs_"+sGXsfl_275_idx, GXutil.rtrim( Z12126HreAs)) ;
         httpContext.changePostValue( "ZT_"+"Z12127HreAi_"+sGXsfl_275_idx, GXutil.rtrim( Z12127HreAi)) ;
         httpContext.changePostValue( "nRC_GXsfl_472_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_472, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_678_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_678_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_678_"+sGXsfl_275_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_678 != 0 )
         {
            httpContext.changePostValue( "HRELINMAQ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQCOD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVOLPRD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFACABS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREFECPES_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQPES_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREULINPRO_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREUSRCOD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQNH_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqNh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQVX_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqVX_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQBL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqBL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQFLOW_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqFlow_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQRPM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqRPM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQMOL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqMol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQTOR_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQCLA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqCla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQTEJ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTej_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQDEL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqDel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREMAQPML_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqPML_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSAA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSAD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHrecosAd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSANC_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSCOL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSPA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPA_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRECOSPD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPD_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELTSSB_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsSb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELTSRM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsRm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACAQ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcaQ_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREACAB_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENPRG_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNPrg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELOTF_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLotF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREANC_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAnc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREGRM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreGrm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREVEL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVel_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREOBS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREAVA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAva_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREAS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREAI_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllL7678( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_678 = (short)(0) ;
      nIsMod_678 = (short)(0) ;
      nRcdDeleted_678 = (short)(0) ;
   }

   public void processLevelL7675( )
   {
      /* Save parent mode. */
      sMode675 = Gx_mode ;
      processNestedLevelL7678( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode675 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelL7675( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteL7675( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thisrec");
         if ( AnyError == 0 )
         {
            confirmValuesL70( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thisrec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartL7675( )
   {
      /* Using cursor T00L726 */
      pr_default.execute(24);
      RcdFound675 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A396EmprCod = T00L726_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T00L726_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00L726_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00L726_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00L726_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL7675( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound675 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound675 = (short)(1) ;
         A396EmprCod = T00L726_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T00L726_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00L726_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00L726_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00L726_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      }
   }

   public void scanEndL7675( )
   {
      pr_default.close(24);
   }

   public void afterConfirmL7675( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL7675( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL7675( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL7675( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL7675( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL7675( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL7675( )
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
      edtHreNumColF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumColF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumColF_Enabled), 5, 0), true);
      edtHreFamCodT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFamCodT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFamCodT_Enabled), 5, 0), true);
      edtHreHilasa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreHilasa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreHilasa_Enabled), 5, 0), true);
      edtHreEnsayo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreEnsayo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreEnsayo_Enabled), 5, 0), true);
      edtHreOpa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreOpa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreOpa_Enabled), 5, 0), true);
      edtHreOpn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreOpn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreOpn_Enabled), 5, 0), true);
      edtHreDispCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreDispCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreDispCli_Enabled), 5, 0), true);
      edtHreMacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMacCod_Enabled), 5, 0), true);
      edtHreNInter_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNInter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNInter_Enabled), 5, 0), true);
      edtHreCencId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCencId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCencId_Enabled), 5, 0), true);
      edtHreCenDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCenDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCenDsc_Enabled), 5, 0), true);
      edtHreComp1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreComp1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreComp1_Enabled), 5, 0), true);
      edtHreComp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreComp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreComp2_Enabled), 5, 0), true);
   }

   public void zmL7678( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4546HreMaqCod = T00L75_A4546HreMaqCod[0] ;
            Z4547HreVolPrd = T00L75_A4547HreVolPrd[0] ;
            Z4548HreFacAbs = T00L75_A4548HreFacAbs[0] ;
            Z4584HreFecPes = T00L75_A4584HreFecPes[0] ;
            Z4585HreMaqPes = T00L75_A4585HreMaqPes[0] ;
            Z4549HreULinPro = T00L75_A4549HreULinPro[0] ;
            Z4863HreUsrCod = T00L75_A4863HreUsrCod[0] ;
            Z7814HReMaqNh = T00L75_A7814HReMaqNh[0] ;
            Z7815HReMaqVX = T00L75_A7815HReMaqVX[0] ;
            Z7816HReMaqBL = T00L75_A7816HReMaqBL[0] ;
            Z7817HReMaqFlow = T00L75_A7817HReMaqFlow[0] ;
            Z7818HReMaqRPM = T00L75_A7818HReMaqRPM[0] ;
            Z7819HReMaqMol = T00L75_A7819HReMaqMol[0] ;
            Z7820HReMaqTor = T00L75_A7820HReMaqTor[0] ;
            Z7821HReMaqCla = T00L75_A7821HReMaqCla[0] ;
            Z7822HReMaqTej = T00L75_A7822HReMaqTej[0] ;
            Z7823HReMaqDel = T00L75_A7823HReMaqDel[0] ;
            Z7824HReMaqPML = T00L75_A7824HReMaqPML[0] ;
            Z8602HreCosAA = T00L75_A8602HreCosAA[0] ;
            Z8603HrecosAd = T00L75_A8603HrecosAd[0] ;
            Z8604HreCosAnc = T00L75_A8604HreCosAnc[0] ;
            Z8605HreCosCol = T00L75_A8605HreCosCol[0] ;
            Z8606HreCosPA = T00L75_A8606HreCosPA[0] ;
            Z8607HreCosPD = T00L75_A8607HreCosPD[0] ;
            Z9780HreLtsSb = T00L75_A9780HreLtsSb[0] ;
            Z9781HreLtsRm = T00L75_A9781HreLtsRm[0] ;
            Z9803HreAcaQ = T00L75_A9803HreAcaQ[0] ;
            Z9804HreAcab = T00L75_A9804HreAcab[0] ;
            Z1094HreNPrg = T00L75_A1094HreNPrg[0] ;
            Z697HreLotF = T00L75_A697HreLotF[0] ;
            Z10381HreAnc = T00L75_A10381HreAnc[0] ;
            Z10382HreGrm = T00L75_A10382HreGrm[0] ;
            Z10383HreVel = T00L75_A10383HreVel[0] ;
            Z10384HreObs = T00L75_A10384HreObs[0] ;
            Z11508HreAva = T00L75_A11508HreAva[0] ;
            Z12126HreAs = T00L75_A12126HreAs[0] ;
            Z12127HreAi = T00L75_A12127HreAi[0] ;
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
            Z7814HReMaqNh = A7814HReMaqNh ;
            Z7815HReMaqVX = A7815HReMaqVX ;
            Z7816HReMaqBL = A7816HReMaqBL ;
            Z7817HReMaqFlow = A7817HReMaqFlow ;
            Z7818HReMaqRPM = A7818HReMaqRPM ;
            Z7819HReMaqMol = A7819HReMaqMol ;
            Z7820HReMaqTor = A7820HReMaqTor ;
            Z7821HReMaqCla = A7821HReMaqCla ;
            Z7822HReMaqTej = A7822HReMaqTej ;
            Z7823HReMaqDel = A7823HReMaqDel ;
            Z7824HReMaqPML = A7824HReMaqPML ;
            Z8602HreCosAA = A8602HreCosAA ;
            Z8603HrecosAd = A8603HrecosAd ;
            Z8604HreCosAnc = A8604HreCosAnc ;
            Z8605HreCosCol = A8605HreCosCol ;
            Z8606HreCosPA = A8606HreCosPA ;
            Z8607HreCosPD = A8607HreCosPD ;
            Z9780HreLtsSb = A9780HreLtsSb ;
            Z9781HreLtsRm = A9781HreLtsRm ;
            Z9803HreAcaQ = A9803HreAcaQ ;
            Z9804HreAcab = A9804HreAcab ;
            Z1094HreNPrg = A1094HreNPrg ;
            Z697HreLotF = A697HreLotF ;
            Z10381HreAnc = A10381HreAnc ;
            Z10382HreGrm = A10382HreGrm ;
            Z10383HreVel = A10383HreVel ;
            Z10384HreObs = A10384HreObs ;
            Z11508HreAva = A11508HreAva ;
            Z12126HreAs = A12126HreAs ;
            Z12127HreAi = A12127HreAi ;
         }
      }
      if ( GX_JID == -6 )
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
         Z7814HReMaqNh = A7814HReMaqNh ;
         Z7815HReMaqVX = A7815HReMaqVX ;
         Z7816HReMaqBL = A7816HReMaqBL ;
         Z7817HReMaqFlow = A7817HReMaqFlow ;
         Z7818HReMaqRPM = A7818HReMaqRPM ;
         Z7819HReMaqMol = A7819HReMaqMol ;
         Z7820HReMaqTor = A7820HReMaqTor ;
         Z7821HReMaqCla = A7821HReMaqCla ;
         Z7822HReMaqTej = A7822HReMaqTej ;
         Z7823HReMaqDel = A7823HReMaqDel ;
         Z7824HReMaqPML = A7824HReMaqPML ;
         Z8602HreCosAA = A8602HreCosAA ;
         Z8603HrecosAd = A8603HrecosAd ;
         Z8604HreCosAnc = A8604HreCosAnc ;
         Z8605HreCosCol = A8605HreCosCol ;
         Z8606HreCosPA = A8606HreCosPA ;
         Z8607HreCosPD = A8607HreCosPD ;
         Z9780HreLtsSb = A9780HreLtsSb ;
         Z9781HreLtsRm = A9781HreLtsRm ;
         Z9803HreAcaQ = A9803HreAcaQ ;
         Z9804HreAcab = A9804HreAcab ;
         Z1094HreNPrg = A1094HreNPrg ;
         Z697HreLotF = A697HreLotF ;
         Z10381HreAnc = A10381HreAnc ;
         Z10382HreGrm = A10382HreGrm ;
         Z10383HreVel = A10383HreVel ;
         Z10384HreObs = A10384HreObs ;
         Z11508HreAva = A11508HreAva ;
         Z12126HreAs = A12126HreAs ;
         Z12127HreAi = A12127HreAi ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalL7678( )
   {
   }

   public void standaloneModalL7678( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreLinMaq_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      }
      else
      {
         edtHreLinMaq_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      }
   }

   public void loadL7678( )
   {
      /* Using cursor T00L727 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4546HreMaqCod = T00L727_A4546HreMaqCod[0] ;
         n4546HreMaqCod = T00L727_n4546HreMaqCod[0] ;
         A4547HreVolPrd = T00L727_A4547HreVolPrd[0] ;
         n4547HreVolPrd = T00L727_n4547HreVolPrd[0] ;
         A4548HreFacAbs = T00L727_A4548HreFacAbs[0] ;
         n4548HreFacAbs = T00L727_n4548HreFacAbs[0] ;
         A4584HreFecPes = T00L727_A4584HreFecPes[0] ;
         n4584HreFecPes = T00L727_n4584HreFecPes[0] ;
         A4585HreMaqPes = T00L727_A4585HreMaqPes[0] ;
         n4585HreMaqPes = T00L727_n4585HreMaqPes[0] ;
         A4549HreULinPro = T00L727_A4549HreULinPro[0] ;
         n4549HreULinPro = T00L727_n4549HreULinPro[0] ;
         A4863HreUsrCod = T00L727_A4863HreUsrCod[0] ;
         n4863HreUsrCod = T00L727_n4863HreUsrCod[0] ;
         A7814HReMaqNh = T00L727_A7814HReMaqNh[0] ;
         n7814HReMaqNh = T00L727_n7814HReMaqNh[0] ;
         A7815HReMaqVX = T00L727_A7815HReMaqVX[0] ;
         n7815HReMaqVX = T00L727_n7815HReMaqVX[0] ;
         A7816HReMaqBL = T00L727_A7816HReMaqBL[0] ;
         n7816HReMaqBL = T00L727_n7816HReMaqBL[0] ;
         A7817HReMaqFlow = T00L727_A7817HReMaqFlow[0] ;
         n7817HReMaqFlow = T00L727_n7817HReMaqFlow[0] ;
         A7818HReMaqRPM = T00L727_A7818HReMaqRPM[0] ;
         n7818HReMaqRPM = T00L727_n7818HReMaqRPM[0] ;
         A7819HReMaqMol = T00L727_A7819HReMaqMol[0] ;
         n7819HReMaqMol = T00L727_n7819HReMaqMol[0] ;
         A7820HReMaqTor = T00L727_A7820HReMaqTor[0] ;
         n7820HReMaqTor = T00L727_n7820HReMaqTor[0] ;
         A7821HReMaqCla = T00L727_A7821HReMaqCla[0] ;
         n7821HReMaqCla = T00L727_n7821HReMaqCla[0] ;
         A7822HReMaqTej = T00L727_A7822HReMaqTej[0] ;
         n7822HReMaqTej = T00L727_n7822HReMaqTej[0] ;
         A7823HReMaqDel = T00L727_A7823HReMaqDel[0] ;
         n7823HReMaqDel = T00L727_n7823HReMaqDel[0] ;
         A7824HReMaqPML = T00L727_A7824HReMaqPML[0] ;
         n7824HReMaqPML = T00L727_n7824HReMaqPML[0] ;
         A8602HreCosAA = T00L727_A8602HreCosAA[0] ;
         n8602HreCosAA = T00L727_n8602HreCosAA[0] ;
         A8603HrecosAd = T00L727_A8603HrecosAd[0] ;
         n8603HrecosAd = T00L727_n8603HrecosAd[0] ;
         A8604HreCosAnc = T00L727_A8604HreCosAnc[0] ;
         n8604HreCosAnc = T00L727_n8604HreCosAnc[0] ;
         A8605HreCosCol = T00L727_A8605HreCosCol[0] ;
         n8605HreCosCol = T00L727_n8605HreCosCol[0] ;
         A8606HreCosPA = T00L727_A8606HreCosPA[0] ;
         n8606HreCosPA = T00L727_n8606HreCosPA[0] ;
         A8607HreCosPD = T00L727_A8607HreCosPD[0] ;
         n8607HreCosPD = T00L727_n8607HreCosPD[0] ;
         A9780HreLtsSb = T00L727_A9780HreLtsSb[0] ;
         n9780HreLtsSb = T00L727_n9780HreLtsSb[0] ;
         A9781HreLtsRm = T00L727_A9781HreLtsRm[0] ;
         n9781HreLtsRm = T00L727_n9781HreLtsRm[0] ;
         A9803HreAcaQ = T00L727_A9803HreAcaQ[0] ;
         n9803HreAcaQ = T00L727_n9803HreAcaQ[0] ;
         A9804HreAcab = T00L727_A9804HreAcab[0] ;
         n9804HreAcab = T00L727_n9804HreAcab[0] ;
         A1094HreNPrg = T00L727_A1094HreNPrg[0] ;
         n1094HreNPrg = T00L727_n1094HreNPrg[0] ;
         A697HreLotF = T00L727_A697HreLotF[0] ;
         n697HreLotF = T00L727_n697HreLotF[0] ;
         A10381HreAnc = T00L727_A10381HreAnc[0] ;
         n10381HreAnc = T00L727_n10381HreAnc[0] ;
         A10382HreGrm = T00L727_A10382HreGrm[0] ;
         n10382HreGrm = T00L727_n10382HreGrm[0] ;
         A10383HreVel = T00L727_A10383HreVel[0] ;
         n10383HreVel = T00L727_n10383HreVel[0] ;
         A10384HreObs = T00L727_A10384HreObs[0] ;
         n10384HreObs = T00L727_n10384HreObs[0] ;
         A11508HreAva = T00L727_A11508HreAva[0] ;
         n11508HreAva = T00L727_n11508HreAva[0] ;
         A12126HreAs = T00L727_A12126HreAs[0] ;
         n12126HreAs = T00L727_n12126HreAs[0] ;
         A12127HreAi = T00L727_A12127HreAi[0] ;
         n12127HreAi = T00L727_n12127HreAi[0] ;
         zmL7678( -6) ;
      }
      pr_default.close(25);
      onLoadActionsL7678( ) ;
   }

   public void onLoadActionsL7678( )
   {
   }

   public void checkExtendedTableL7678( )
   {
      nIsDirty_678 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalL7678( ) ;
      if ( ! ( ( ( A4585HreMaqPes >= 0 ) && ( A4585HreMaqPes <= 2 ) ) ) )
      {
         GXCCtl = "HREMAQPES_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Maquina Pesada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreMaqPes_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsL7678( )
   {
   }

   public void enableDisableL7678( )
   {
   }

   public void getKeyL7678( )
   {
      /* Using cursor T00L728 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound678 = (short)(1) ;
      }
      else
      {
         RcdFound678 = (short)(0) ;
      }
      pr_default.close(26);
   }

   public void getByPrimaryKeyL7678( )
   {
      /* Using cursor T00L75 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmL7678( 6) ;
         RcdFound678 = (short)(1) ;
         initializeNonKeyL7678( ) ;
         A4545HreLinMaq = T00L75_A4545HreLinMaq[0] ;
         A4546HreMaqCod = T00L75_A4546HreMaqCod[0] ;
         n4546HreMaqCod = T00L75_n4546HreMaqCod[0] ;
         A4547HreVolPrd = T00L75_A4547HreVolPrd[0] ;
         n4547HreVolPrd = T00L75_n4547HreVolPrd[0] ;
         A4548HreFacAbs = T00L75_A4548HreFacAbs[0] ;
         n4548HreFacAbs = T00L75_n4548HreFacAbs[0] ;
         A4584HreFecPes = T00L75_A4584HreFecPes[0] ;
         n4584HreFecPes = T00L75_n4584HreFecPes[0] ;
         A4585HreMaqPes = T00L75_A4585HreMaqPes[0] ;
         n4585HreMaqPes = T00L75_n4585HreMaqPes[0] ;
         A4549HreULinPro = T00L75_A4549HreULinPro[0] ;
         n4549HreULinPro = T00L75_n4549HreULinPro[0] ;
         A4863HreUsrCod = T00L75_A4863HreUsrCod[0] ;
         n4863HreUsrCod = T00L75_n4863HreUsrCod[0] ;
         A7814HReMaqNh = T00L75_A7814HReMaqNh[0] ;
         n7814HReMaqNh = T00L75_n7814HReMaqNh[0] ;
         A7815HReMaqVX = T00L75_A7815HReMaqVX[0] ;
         n7815HReMaqVX = T00L75_n7815HReMaqVX[0] ;
         A7816HReMaqBL = T00L75_A7816HReMaqBL[0] ;
         n7816HReMaqBL = T00L75_n7816HReMaqBL[0] ;
         A7817HReMaqFlow = T00L75_A7817HReMaqFlow[0] ;
         n7817HReMaqFlow = T00L75_n7817HReMaqFlow[0] ;
         A7818HReMaqRPM = T00L75_A7818HReMaqRPM[0] ;
         n7818HReMaqRPM = T00L75_n7818HReMaqRPM[0] ;
         A7819HReMaqMol = T00L75_A7819HReMaqMol[0] ;
         n7819HReMaqMol = T00L75_n7819HReMaqMol[0] ;
         A7820HReMaqTor = T00L75_A7820HReMaqTor[0] ;
         n7820HReMaqTor = T00L75_n7820HReMaqTor[0] ;
         A7821HReMaqCla = T00L75_A7821HReMaqCla[0] ;
         n7821HReMaqCla = T00L75_n7821HReMaqCla[0] ;
         A7822HReMaqTej = T00L75_A7822HReMaqTej[0] ;
         n7822HReMaqTej = T00L75_n7822HReMaqTej[0] ;
         A7823HReMaqDel = T00L75_A7823HReMaqDel[0] ;
         n7823HReMaqDel = T00L75_n7823HReMaqDel[0] ;
         A7824HReMaqPML = T00L75_A7824HReMaqPML[0] ;
         n7824HReMaqPML = T00L75_n7824HReMaqPML[0] ;
         A8602HreCosAA = T00L75_A8602HreCosAA[0] ;
         n8602HreCosAA = T00L75_n8602HreCosAA[0] ;
         A8603HrecosAd = T00L75_A8603HrecosAd[0] ;
         n8603HrecosAd = T00L75_n8603HrecosAd[0] ;
         A8604HreCosAnc = T00L75_A8604HreCosAnc[0] ;
         n8604HreCosAnc = T00L75_n8604HreCosAnc[0] ;
         A8605HreCosCol = T00L75_A8605HreCosCol[0] ;
         n8605HreCosCol = T00L75_n8605HreCosCol[0] ;
         A8606HreCosPA = T00L75_A8606HreCosPA[0] ;
         n8606HreCosPA = T00L75_n8606HreCosPA[0] ;
         A8607HreCosPD = T00L75_A8607HreCosPD[0] ;
         n8607HreCosPD = T00L75_n8607HreCosPD[0] ;
         A9780HreLtsSb = T00L75_A9780HreLtsSb[0] ;
         n9780HreLtsSb = T00L75_n9780HreLtsSb[0] ;
         A9781HreLtsRm = T00L75_A9781HreLtsRm[0] ;
         n9781HreLtsRm = T00L75_n9781HreLtsRm[0] ;
         A9803HreAcaQ = T00L75_A9803HreAcaQ[0] ;
         n9803HreAcaQ = T00L75_n9803HreAcaQ[0] ;
         A9804HreAcab = T00L75_A9804HreAcab[0] ;
         n9804HreAcab = T00L75_n9804HreAcab[0] ;
         A1094HreNPrg = T00L75_A1094HreNPrg[0] ;
         n1094HreNPrg = T00L75_n1094HreNPrg[0] ;
         A697HreLotF = T00L75_A697HreLotF[0] ;
         n697HreLotF = T00L75_n697HreLotF[0] ;
         A10381HreAnc = T00L75_A10381HreAnc[0] ;
         n10381HreAnc = T00L75_n10381HreAnc[0] ;
         A10382HreGrm = T00L75_A10382HreGrm[0] ;
         n10382HreGrm = T00L75_n10382HreGrm[0] ;
         A10383HreVel = T00L75_A10383HreVel[0] ;
         n10383HreVel = T00L75_n10383HreVel[0] ;
         A10384HreObs = T00L75_A10384HreObs[0] ;
         n10384HreObs = T00L75_n10384HreObs[0] ;
         A11508HreAva = T00L75_A11508HreAva[0] ;
         n11508HreAva = T00L75_n11508HreAva[0] ;
         A12126HreAs = T00L75_A12126HreAs[0] ;
         n12126HreAs = T00L75_n12126HreAs[0] ;
         A12127HreAi = T00L75_A12127HreAi[0] ;
         n12127HreAi = T00L75_n12127HreAi[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4545HreLinMaq = A4545HreLinMaq ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalL7678( ) ;
         loadL7678( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound678 = (short)(0) ;
         initializeNonKeyL7678( ) ;
         sMode678 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalL7678( ) ;
         Gx_mode = sMode678 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesL7678( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrencyL7678( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L74 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4546HreMaqCod, T00L74_A4546HreMaqCod[0]) != 0 ) || ( Z4547HreVolPrd != T00L74_A4547HreVolPrd[0] ) || ( DecimalUtil.compareTo(Z4548HreFacAbs, T00L74_A4548HreFacAbs[0]) != 0 ) || !( GXutil.dateCompare(Z4584HreFecPes, T00L74_A4584HreFecPes[0]) ) || ( Z4585HreMaqPes != T00L74_A4585HreMaqPes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4549HreULinPro != T00L74_A4549HreULinPro[0] ) || ( GXutil.strcmp(Z4863HreUsrCod, T00L74_A4863HreUsrCod[0]) != 0 ) || ( Z7814HReMaqNh != T00L74_A7814HReMaqNh[0] ) || ( Z7815HReMaqVX != T00L74_A7815HReMaqVX[0] ) || ( Z7816HReMaqBL != T00L74_A7816HReMaqBL[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7817HReMaqFlow != T00L74_A7817HReMaqFlow[0] ) || ( Z7818HReMaqRPM != T00L74_A7818HReMaqRPM[0] ) || ( Z7819HReMaqMol != T00L74_A7819HReMaqMol[0] ) || ( Z7820HReMaqTor != T00L74_A7820HReMaqTor[0] ) || ( GXutil.strcmp(Z7821HReMaqCla, T00L74_A7821HReMaqCla[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7822HReMaqTej != T00L74_A7822HReMaqTej[0] ) || ( Z7823HReMaqDel != T00L74_A7823HReMaqDel[0] ) || ( Z7824HReMaqPML != T00L74_A7824HReMaqPML[0] ) || ( DecimalUtil.compareTo(Z8602HreCosAA, T00L74_A8602HreCosAA[0]) != 0 ) || ( DecimalUtil.compareTo(Z8603HrecosAd, T00L74_A8603HrecosAd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z8604HreCosAnc, T00L74_A8604HreCosAnc[0]) != 0 ) || ( DecimalUtil.compareTo(Z8605HreCosCol, T00L74_A8605HreCosCol[0]) != 0 ) || ( DecimalUtil.compareTo(Z8606HreCosPA, T00L74_A8606HreCosPA[0]) != 0 ) || ( DecimalUtil.compareTo(Z8607HreCosPD, T00L74_A8607HreCosPD[0]) != 0 ) || ( Z9780HreLtsSb != T00L74_A9780HreLtsSb[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9781HreLtsRm != T00L74_A9781HreLtsRm[0] ) || ( GXutil.strcmp(Z9803HreAcaQ, T00L74_A9803HreAcaQ[0]) != 0 ) || ( GXutil.strcmp(Z9804HreAcab, T00L74_A9804HreAcab[0]) != 0 ) || ( GXutil.strcmp(Z1094HreNPrg, T00L74_A1094HreNPrg[0]) != 0 ) || ( GXutil.strcmp(Z697HreLotF, T00L74_A697HreLotF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10381HreAnc != T00L74_A10381HreAnc[0] ) || ( Z10382HreGrm != T00L74_A10382HreGrm[0] ) || ( DecimalUtil.compareTo(Z10383HreVel, T00L74_A10383HreVel[0]) != 0 ) || ( GXutil.strcmp(Z10384HreObs, T00L74_A10384HreObs[0]) != 0 ) || ( GXutil.strcmp(Z11508HreAva, T00L74_A11508HreAva[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12126HreAs, T00L74_A12126HreAs[0]) != 0 ) || ( GXutil.strcmp(Z12127HreAi, T00L74_A12127HreAi[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4546HreMaqCod, T00L74_A4546HreMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreMaqCod");
               GXutil.writeLogRaw("Old: ",Z4546HreMaqCod);
               GXutil.writeLogRaw("Current: ",T00L74_A4546HreMaqCod[0]);
            }
            if ( Z4547HreVolPrd != T00L74_A4547HreVolPrd[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreVolPrd");
               GXutil.writeLogRaw("Old: ",Z4547HreVolPrd);
               GXutil.writeLogRaw("Current: ",T00L74_A4547HreVolPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z4548HreFacAbs, T00L74_A4548HreFacAbs[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFacAbs");
               GXutil.writeLogRaw("Old: ",Z4548HreFacAbs);
               GXutil.writeLogRaw("Current: ",T00L74_A4548HreFacAbs[0]);
            }
            if ( !( GXutil.dateCompare(Z4584HreFecPes, T00L74_A4584HreFecPes[0]) ) )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreFecPes");
               GXutil.writeLogRaw("Old: ",Z4584HreFecPes);
               GXutil.writeLogRaw("Current: ",T00L74_A4584HreFecPes[0]);
            }
            if ( Z4585HreMaqPes != T00L74_A4585HreMaqPes[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreMaqPes");
               GXutil.writeLogRaw("Old: ",Z4585HreMaqPes);
               GXutil.writeLogRaw("Current: ",T00L74_A4585HreMaqPes[0]);
            }
            if ( Z4549HreULinPro != T00L74_A4549HreULinPro[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreULinPro");
               GXutil.writeLogRaw("Old: ",Z4549HreULinPro);
               GXutil.writeLogRaw("Current: ",T00L74_A4549HreULinPro[0]);
            }
            if ( GXutil.strcmp(Z4863HreUsrCod, T00L74_A4863HreUsrCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreUsrCod");
               GXutil.writeLogRaw("Old: ",Z4863HreUsrCod);
               GXutil.writeLogRaw("Current: ",T00L74_A4863HreUsrCod[0]);
            }
            if ( Z7814HReMaqNh != T00L74_A7814HReMaqNh[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqNh");
               GXutil.writeLogRaw("Old: ",Z7814HReMaqNh);
               GXutil.writeLogRaw("Current: ",T00L74_A7814HReMaqNh[0]);
            }
            if ( Z7815HReMaqVX != T00L74_A7815HReMaqVX[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqVX");
               GXutil.writeLogRaw("Old: ",Z7815HReMaqVX);
               GXutil.writeLogRaw("Current: ",T00L74_A7815HReMaqVX[0]);
            }
            if ( Z7816HReMaqBL != T00L74_A7816HReMaqBL[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqBL");
               GXutil.writeLogRaw("Old: ",Z7816HReMaqBL);
               GXutil.writeLogRaw("Current: ",T00L74_A7816HReMaqBL[0]);
            }
            if ( Z7817HReMaqFlow != T00L74_A7817HReMaqFlow[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqFlow");
               GXutil.writeLogRaw("Old: ",Z7817HReMaqFlow);
               GXutil.writeLogRaw("Current: ",T00L74_A7817HReMaqFlow[0]);
            }
            if ( Z7818HReMaqRPM != T00L74_A7818HReMaqRPM[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqRPM");
               GXutil.writeLogRaw("Old: ",Z7818HReMaqRPM);
               GXutil.writeLogRaw("Current: ",T00L74_A7818HReMaqRPM[0]);
            }
            if ( Z7819HReMaqMol != T00L74_A7819HReMaqMol[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqMol");
               GXutil.writeLogRaw("Old: ",Z7819HReMaqMol);
               GXutil.writeLogRaw("Current: ",T00L74_A7819HReMaqMol[0]);
            }
            if ( Z7820HReMaqTor != T00L74_A7820HReMaqTor[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqTor");
               GXutil.writeLogRaw("Old: ",Z7820HReMaqTor);
               GXutil.writeLogRaw("Current: ",T00L74_A7820HReMaqTor[0]);
            }
            if ( GXutil.strcmp(Z7821HReMaqCla, T00L74_A7821HReMaqCla[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqCla");
               GXutil.writeLogRaw("Old: ",Z7821HReMaqCla);
               GXutil.writeLogRaw("Current: ",T00L74_A7821HReMaqCla[0]);
            }
            if ( Z7822HReMaqTej != T00L74_A7822HReMaqTej[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqTej");
               GXutil.writeLogRaw("Old: ",Z7822HReMaqTej);
               GXutil.writeLogRaw("Current: ",T00L74_A7822HReMaqTej[0]);
            }
            if ( Z7823HReMaqDel != T00L74_A7823HReMaqDel[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqDel");
               GXutil.writeLogRaw("Old: ",Z7823HReMaqDel);
               GXutil.writeLogRaw("Current: ",T00L74_A7823HReMaqDel[0]);
            }
            if ( Z7824HReMaqPML != T00L74_A7824HReMaqPML[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HReMaqPML");
               GXutil.writeLogRaw("Old: ",Z7824HReMaqPML);
               GXutil.writeLogRaw("Current: ",T00L74_A7824HReMaqPML[0]);
            }
            if ( DecimalUtil.compareTo(Z8602HreCosAA, T00L74_A8602HreCosAA[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCosAA");
               GXutil.writeLogRaw("Old: ",Z8602HreCosAA);
               GXutil.writeLogRaw("Current: ",T00L74_A8602HreCosAA[0]);
            }
            if ( DecimalUtil.compareTo(Z8603HrecosAd, T00L74_A8603HrecosAd[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HrecosAd");
               GXutil.writeLogRaw("Old: ",Z8603HrecosAd);
               GXutil.writeLogRaw("Current: ",T00L74_A8603HrecosAd[0]);
            }
            if ( DecimalUtil.compareTo(Z8604HreCosAnc, T00L74_A8604HreCosAnc[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCosAnc");
               GXutil.writeLogRaw("Old: ",Z8604HreCosAnc);
               GXutil.writeLogRaw("Current: ",T00L74_A8604HreCosAnc[0]);
            }
            if ( DecimalUtil.compareTo(Z8605HreCosCol, T00L74_A8605HreCosCol[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCosCol");
               GXutil.writeLogRaw("Old: ",Z8605HreCosCol);
               GXutil.writeLogRaw("Current: ",T00L74_A8605HreCosCol[0]);
            }
            if ( DecimalUtil.compareTo(Z8606HreCosPA, T00L74_A8606HreCosPA[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCosPA");
               GXutil.writeLogRaw("Old: ",Z8606HreCosPA);
               GXutil.writeLogRaw("Current: ",T00L74_A8606HreCosPA[0]);
            }
            if ( DecimalUtil.compareTo(Z8607HreCosPD, T00L74_A8607HreCosPD[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreCosPD");
               GXutil.writeLogRaw("Old: ",Z8607HreCosPD);
               GXutil.writeLogRaw("Current: ",T00L74_A8607HreCosPD[0]);
            }
            if ( Z9780HreLtsSb != T00L74_A9780HreLtsSb[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreLtsSb");
               GXutil.writeLogRaw("Old: ",Z9780HreLtsSb);
               GXutil.writeLogRaw("Current: ",T00L74_A9780HreLtsSb[0]);
            }
            if ( Z9781HreLtsRm != T00L74_A9781HreLtsRm[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreLtsRm");
               GXutil.writeLogRaw("Old: ",Z9781HreLtsRm);
               GXutil.writeLogRaw("Current: ",T00L74_A9781HreLtsRm[0]);
            }
            if ( GXutil.strcmp(Z9803HreAcaQ, T00L74_A9803HreAcaQ[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreAcaQ");
               GXutil.writeLogRaw("Old: ",Z9803HreAcaQ);
               GXutil.writeLogRaw("Current: ",T00L74_A9803HreAcaQ[0]);
            }
            if ( GXutil.strcmp(Z9804HreAcab, T00L74_A9804HreAcab[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreAcab");
               GXutil.writeLogRaw("Old: ",Z9804HreAcab);
               GXutil.writeLogRaw("Current: ",T00L74_A9804HreAcab[0]);
            }
            if ( GXutil.strcmp(Z1094HreNPrg, T00L74_A1094HreNPrg[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNPrg");
               GXutil.writeLogRaw("Old: ",Z1094HreNPrg);
               GXutil.writeLogRaw("Current: ",T00L74_A1094HreNPrg[0]);
            }
            if ( GXutil.strcmp(Z697HreLotF, T00L74_A697HreLotF[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreLotF");
               GXutil.writeLogRaw("Old: ",Z697HreLotF);
               GXutil.writeLogRaw("Current: ",T00L74_A697HreLotF[0]);
            }
            if ( Z10381HreAnc != T00L74_A10381HreAnc[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreAnc");
               GXutil.writeLogRaw("Old: ",Z10381HreAnc);
               GXutil.writeLogRaw("Current: ",T00L74_A10381HreAnc[0]);
            }
            if ( Z10382HreGrm != T00L74_A10382HreGrm[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreGrm");
               GXutil.writeLogRaw("Old: ",Z10382HreGrm);
               GXutil.writeLogRaw("Current: ",T00L74_A10382HreGrm[0]);
            }
            if ( DecimalUtil.compareTo(Z10383HreVel, T00L74_A10383HreVel[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreVel");
               GXutil.writeLogRaw("Old: ",Z10383HreVel);
               GXutil.writeLogRaw("Current: ",T00L74_A10383HreVel[0]);
            }
            if ( GXutil.strcmp(Z10384HreObs, T00L74_A10384HreObs[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreObs");
               GXutil.writeLogRaw("Old: ",Z10384HreObs);
               GXutil.writeLogRaw("Current: ",T00L74_A10384HreObs[0]);
            }
            if ( GXutil.strcmp(Z11508HreAva, T00L74_A11508HreAva[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreAva");
               GXutil.writeLogRaw("Old: ",Z11508HreAva);
               GXutil.writeLogRaw("Current: ",T00L74_A11508HreAva[0]);
            }
            if ( GXutil.strcmp(Z12126HreAs, T00L74_A12126HreAs[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreAs");
               GXutil.writeLogRaw("Old: ",Z12126HreAs);
               GXutil.writeLogRaw("Current: ",T00L74_A12126HreAs[0]);
            }
            if ( GXutil.strcmp(Z12127HreAi, T00L74_A12127HreAi[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreAi");
               GXutil.writeLogRaw("Old: ",Z12127HreAi);
               GXutil.writeLogRaw("Current: ",T00L74_A12127HreAi[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL7678( )
   {
      beforeValidateL7678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL7678( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL7678( 0) ;
         checkOptimisticConcurrencyL7678( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL7678( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL7678( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L729 */
                  pr_default.execute(27, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n9780HreLtsSb), Integer.valueOf(A9780HreLtsSb), Boolean.valueOf(n9781HreLtsRm), Integer.valueOf(A9781HreLtsRm), Boolean.valueOf(n9803HreAcaQ), A9803HreAcaQ, Boolean.valueOf(n9804HreAcab), A9804HreAcab, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10381HreAnc), Short.valueOf(A10381HreAnc), Boolean.valueOf(n10382HreGrm), Short.valueOf(A10382HreGrm), Boolean.valueOf(n10383HreVel), A10383HreVel, Boolean.valueOf(n10384HreObs), A10384HreObs, Boolean.valueOf(n11508HreAva), A11508HreAva, Boolean.valueOf(n12126HreAs), A12126HreAs, Boolean.valueOf(n12127HreAi), A12127HreAi, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                  if ( (pr_default.getStatus(27) == 1) )
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
                        processLevelL7678( ) ;
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
            loadL7678( ) ;
         }
         endLevelL7678( ) ;
      }
      closeExtendedTableCursorsL7678( ) ;
   }

   public void updateL7678( )
   {
      beforeValidateL7678( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL7678( ) ;
      }
      if ( ( nIsMod_678 != 0 ) || ( nIsDirty_678 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyL7678( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmL7678( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateL7678( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00L730 */
                     pr_default.execute(28, new Object[] {Boolean.valueOf(n4546HreMaqCod), A4546HreMaqCod, Boolean.valueOf(n4547HreVolPrd), Integer.valueOf(A4547HreVolPrd), Boolean.valueOf(n4548HreFacAbs), A4548HreFacAbs, Boolean.valueOf(n4584HreFecPes), A4584HreFecPes, Boolean.valueOf(n4585HreMaqPes), Byte.valueOf(A4585HreMaqPes), Boolean.valueOf(n4549HreULinPro), Byte.valueOf(A4549HreULinPro), Boolean.valueOf(n4863HreUsrCod), A4863HreUsrCod, Boolean.valueOf(n7814HReMaqNh), Short.valueOf(A7814HReMaqNh), Boolean.valueOf(n7815HReMaqVX), Byte.valueOf(A7815HReMaqVX), Boolean.valueOf(n7816HReMaqBL), Byte.valueOf(A7816HReMaqBL), Boolean.valueOf(n7817HReMaqFlow), Byte.valueOf(A7817HReMaqFlow), Boolean.valueOf(n7818HReMaqRPM), Short.valueOf(A7818HReMaqRPM), Boolean.valueOf(n7819HReMaqMol), Short.valueOf(A7819HReMaqMol), Boolean.valueOf(n7820HReMaqTor), Short.valueOf(A7820HReMaqTor), Boolean.valueOf(n7821HReMaqCla), A7821HReMaqCla, Boolean.valueOf(n7822HReMaqTej), Byte.valueOf(A7822HReMaqTej), Boolean.valueOf(n7823HReMaqDel), Byte.valueOf(A7823HReMaqDel), Boolean.valueOf(n7824HReMaqPML), Short.valueOf(A7824HReMaqPML), Boolean.valueOf(n8602HreCosAA), A8602HreCosAA, Boolean.valueOf(n8603HrecosAd), A8603HrecosAd, Boolean.valueOf(n8604HreCosAnc), A8604HreCosAnc, Boolean.valueOf(n8605HreCosCol), A8605HreCosCol, Boolean.valueOf(n8606HreCosPA), A8606HreCosPA, Boolean.valueOf(n8607HreCosPD), A8607HreCosPD, Boolean.valueOf(n9780HreLtsSb), Integer.valueOf(A9780HreLtsSb), Boolean.valueOf(n9781HreLtsRm), Integer.valueOf(A9781HreLtsRm), Boolean.valueOf(n9803HreAcaQ), A9803HreAcaQ, Boolean.valueOf(n9804HreAcab), A9804HreAcab, Boolean.valueOf(n1094HreNPrg), A1094HreNPrg, Boolean.valueOf(n697HreLotF), A697HreLotF, Boolean.valueOf(n10381HreAnc), Short.valueOf(A10381HreAnc), Boolean.valueOf(n10382HreGrm), Short.valueOf(A10382HreGrm), Boolean.valueOf(n10383HreVel), A10383HreVel, Boolean.valueOf(n10384HreObs), A10384HreObs, Boolean.valueOf(n11508HreAva), A11508HreAva, Boolean.valueOf(n12126HreAs), A12126HreAs, Boolean.valueOf(n12127HreAi), A12127HreAi, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREM");
                     if ( (pr_default.getStatus(28) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREM"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateL7678( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevelL7678( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKeyL7678( ) ;
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
            endLevelL7678( ) ;
         }
      }
      closeExtendedTableCursorsL7678( ) ;
   }

   public void deferredUpdateL7678( )
   {
   }

   public void deleteL7678( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL7678( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL7678( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL7678( ) ;
         afterConfirmL7678( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL7678( ) ;
            if ( AnyError == 0 )
            {
               scanStartL71874( ) ;
               while ( RcdFound1874 != 0 )
               {
                  getByPrimaryKeyL71874( ) ;
                  deleteL71874( ) ;
                  scanNextL71874( ) ;
               }
               scanEndL71874( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L731 */
                  pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
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
      endLevelL7678( ) ;
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL7678( )
   {
      standaloneModalL7678( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00L732 */
         pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00L733 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tratamientos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00L734 */
         pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00L735 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
      }
   }

   public void processNestedLevelL71874( )
   {
      nGXsfl_472_idx = 0 ;
      while ( nGXsfl_472_idx < nRC_GXsfl_472 )
      {
         readRowL71874( ) ;
         if ( ( nRcdExists_1874 != 0 ) || ( nIsMod_1874 != 0 ) )
         {
            standaloneNotModalL71874( ) ;
            getKeyL71874( ) ;
            if ( ( nRcdExists_1874 == 0 ) && ( nRcdDeleted_1874 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertL71874( ) ;
            }
            else
            {
               if ( RcdFound1874 != 0 )
               {
                  if ( ( nRcdDeleted_1874 != 0 ) && ( nRcdExists_1874 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteL71874( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1874 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateL71874( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1874 == 0 )
                  {
                     GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
         httpContext.changePostValue( edtHreNH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10545HreNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4550HreLinPro_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4551HreProCod_"+sGXsfl_472_idx, GXutil.rtrim( Z4551HreProCod)) ;
         httpContext.changePostValue( "ZT_"+"Z4552HreProDsc_"+sGXsfl_472_idx, GXutil.rtrim( Z4552HreProDsc)) ;
         httpContext.changePostValue( "ZT_"+"Z4553HreProTie_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4554HreProTmx_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4555HreNumPro_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4556HreNumRec_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10545HreNH2O_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( Z10545HreNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1874_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1874_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1874_"+sGXsfl_472_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1874 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_1874_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRELINPRO_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROCOD_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPRODSC_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTIE_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HREPROTMX_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMPRO_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENUMREC_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "HRENH2O_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNH2O_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllL71874( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1874 = (short)(0) ;
      nIsMod_1874 = (short)(0) ;
      nRcdDeleted_1874 = (short)(0) ;
   }

   public void processLevelL7678( )
   {
      /* Save parent mode. */
      sMode678 = Gx_mode ;
      processNestedLevelL71874( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode678 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelL7678( )
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

   public void scanStartL7678( )
   {
      /* Scan By routine */
      /* Using cursor T00L736 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4545HreLinMaq = T00L736_A4545HreLinMaq[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL7678( )
   {
      /* Scan next routine */
      pr_default.readNext(34);
      RcdFound678 = (short)(0) ;
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound678 = (short)(1) ;
         A4545HreLinMaq = T00L736_A4545HreLinMaq[0] ;
      }
   }

   public void scanEndL7678( )
   {
      pr_default.close(34);
   }

   public void afterConfirmL7678( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL7678( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL7678( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL7678( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL7678( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL7678( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL7678( )
   {
      edtHreLinMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreVolPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreVolPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreFacAbs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFacAbs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFacAbs_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreFecPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreFecPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreFecPes_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreMaqPes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreMaqPes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqPes_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreULinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreULinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreULinPro_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreUsrCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreUsrCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreUsrCod_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqNh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqNh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqNh_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqVX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqVX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqVX_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqBL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqBL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqBL_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqFlow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqFlow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqFlow_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqRPM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqRPM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqRPM_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqMol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqMol_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqTor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqTor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqTor_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqCla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqCla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqCla_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqTej_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqTej_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqTej_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqDel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqDel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqDel_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHReMaqPML_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHReMaqPML_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHReMaqPML_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreCosAA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosAA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosAA_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHrecosAd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrecosAd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrecosAd_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreCosAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosAnc_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreCosCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosCol_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreCosPA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosPA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosPA_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreCosPD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreCosPD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreCosPD_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreLtsSb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsSb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsSb_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreLtsRm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLtsRm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLtsRm_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreAcaQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcaQ_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcaQ_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAcab_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreNPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNPrg_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreLotF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLotF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLotF_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAnc_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreGrm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreGrm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreGrm_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreVel_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreVel_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVel_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreObs_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreAva_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAva_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAva_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreAs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAs_Enabled), 5, 0), !bGXsfl_275_Refreshing);
      edtHreAi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreAi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreAi_Enabled), 5, 0), !bGXsfl_275_Refreshing);
   }

   public void zmL71874( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4551HreProCod = T00L73_A4551HreProCod[0] ;
            Z4552HreProDsc = T00L73_A4552HreProDsc[0] ;
            Z4553HreProTie = T00L73_A4553HreProTie[0] ;
            Z4554HreProTmx = T00L73_A4554HreProTmx[0] ;
            Z4555HreNumPro = T00L73_A4555HreNumPro[0] ;
            Z4556HreNumRec = T00L73_A4556HreNumRec[0] ;
            Z10545HreNH2O = T00L73_A10545HreNH2O[0] ;
         }
         else
         {
            Z4551HreProCod = A4551HreProCod ;
            Z4552HreProDsc = A4552HreProDsc ;
            Z4553HreProTie = A4553HreProTie ;
            Z4554HreProTmx = A4554HreProTmx ;
            Z4555HreNumPro = A4555HreNumPro ;
            Z4556HreNumRec = A4556HreNumRec ;
            Z10545HreNH2O = A10545HreNH2O ;
         }
      }
      if ( GX_JID == -7 )
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
         Z10545HreNH2O = A10545HreNH2O ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalL71874( )
   {
   }

   public void standaloneModalL71874( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtHreLinPro_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      }
      else
      {
         edtHreLinPro_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      }
   }

   public void loadL71874( )
   {
      /* Using cursor T00L737 */
      pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(35) != 101) )
      {
         RcdFound1874 = (short)(1) ;
         A4551HreProCod = T00L737_A4551HreProCod[0] ;
         A4552HreProDsc = T00L737_A4552HreProDsc[0] ;
         A4553HreProTie = T00L737_A4553HreProTie[0] ;
         A4554HreProTmx = T00L737_A4554HreProTmx[0] ;
         A4555HreNumPro = T00L737_A4555HreNumPro[0] ;
         A4556HreNumRec = T00L737_A4556HreNumRec[0] ;
         A10545HreNH2O = T00L737_A10545HreNH2O[0] ;
         zmL71874( -7) ;
      }
      pr_default.close(35);
      onLoadActionsL71874( ) ;
   }

   public void onLoadActionsL71874( )
   {
   }

   public void checkExtendedTableL71874( )
   {
      nIsDirty_1874 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalL71874( ) ;
   }

   public void closeExtendedTableCursorsL71874( )
   {
   }

   public void enableDisableL71874( )
   {
   }

   public void getKeyL71874( )
   {
      /* Using cursor T00L738 */
      pr_default.execute(36, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound1874 = (short)(1) ;
      }
      else
      {
         RcdFound1874 = (short)(0) ;
      }
      pr_default.close(36);
   }

   public void getByPrimaryKeyL71874( )
   {
      /* Using cursor T00L73 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmL71874( 7) ;
         RcdFound1874 = (short)(1) ;
         initializeNonKeyL71874( ) ;
         A4550HreLinPro = T00L73_A4550HreLinPro[0] ;
         A4551HreProCod = T00L73_A4551HreProCod[0] ;
         A4552HreProDsc = T00L73_A4552HreProDsc[0] ;
         A4553HreProTie = T00L73_A4553HreProTie[0] ;
         A4554HreProTmx = T00L73_A4554HreProTmx[0] ;
         A4555HreNumPro = T00L73_A4555HreNumPro[0] ;
         A4556HreNumRec = T00L73_A4556HreNumRec[0] ;
         A10545HreNH2O = T00L73_A10545HreNH2O[0] ;
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
         standaloneModalL71874( ) ;
         loadL71874( ) ;
         Gx_mode = sMode1874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1874 = (short)(0) ;
         initializeNonKeyL71874( ) ;
         sMode1874 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalL71874( ) ;
         Gx_mode = sMode1874 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesL71874( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyL71874( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L72 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4551HreProCod, T00L72_A4551HreProCod[0]) != 0 ) || ( GXutil.strcmp(Z4552HreProDsc, T00L72_A4552HreProDsc[0]) != 0 ) || ( Z4553HreProTie != T00L72_A4553HreProTie[0] ) || ( Z4554HreProTmx != T00L72_A4554HreProTmx[0] ) || ( Z4555HreNumPro != T00L72_A4555HreNumPro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4556HreNumRec != T00L72_A4556HreNumRec[0] ) || ( Z10545HreNH2O != T00L72_A10545HreNH2O[0] ) )
         {
            if ( GXutil.strcmp(Z4551HreProCod, T00L72_A4551HreProCod[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreProCod");
               GXutil.writeLogRaw("Old: ",Z4551HreProCod);
               GXutil.writeLogRaw("Current: ",T00L72_A4551HreProCod[0]);
            }
            if ( GXutil.strcmp(Z4552HreProDsc, T00L72_A4552HreProDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreProDsc");
               GXutil.writeLogRaw("Old: ",Z4552HreProDsc);
               GXutil.writeLogRaw("Current: ",T00L72_A4552HreProDsc[0]);
            }
            if ( Z4553HreProTie != T00L72_A4553HreProTie[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreProTie");
               GXutil.writeLogRaw("Old: ",Z4553HreProTie);
               GXutil.writeLogRaw("Current: ",T00L72_A4553HreProTie[0]);
            }
            if ( Z4554HreProTmx != T00L72_A4554HreProTmx[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreProTmx");
               GXutil.writeLogRaw("Old: ",Z4554HreProTmx);
               GXutil.writeLogRaw("Current: ",T00L72_A4554HreProTmx[0]);
            }
            if ( Z4555HreNumPro != T00L72_A4555HreNumPro[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNumPro");
               GXutil.writeLogRaw("Old: ",Z4555HreNumPro);
               GXutil.writeLogRaw("Current: ",T00L72_A4555HreNumPro[0]);
            }
            if ( Z4556HreNumRec != T00L72_A4556HreNumRec[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNumRec");
               GXutil.writeLogRaw("Old: ",Z4556HreNumRec);
               GXutil.writeLogRaw("Current: ",T00L72_A4556HreNumRec[0]);
            }
            if ( Z10545HreNH2O != T00L72_A10545HreNH2O[0] )
            {
               GXutil.writeLogln("thisrec:[seudo value changed for attri]"+"HreNH2O");
               GXutil.writeLogRaw("Old: ",Z10545HreNH2O);
               GXutil.writeLogRaw("Current: ",T00L72_A10545HreNH2O[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL71874( )
   {
      beforeValidateL71874( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL71874( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL71874( 0) ;
         checkOptimisticConcurrencyL71874( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL71874( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL71874( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L739 */
                  pr_default.execute(37, new Object[] {Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro), A4551HreProCod, A4552HreProDsc, Short.valueOf(A4553HreProTie), Short.valueOf(A4554HreProTmx), Integer.valueOf(A4555HreNumPro), Integer.valueOf(A4556HreNumRec), Short.valueOf(A10545HreNH2O), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
                  if ( (pr_default.getStatus(37) == 1) )
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
            loadL71874( ) ;
         }
         endLevelL71874( ) ;
      }
      closeExtendedTableCursorsL71874( ) ;
   }

   public void updateL71874( )
   {
      beforeValidateL71874( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL71874( ) ;
      }
      if ( ( nIsMod_1874 != 0 ) || ( nIsDirty_1874 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyL71874( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmL71874( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateL71874( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00L740 */
                     pr_default.execute(38, new Object[] {A4551HreProCod, A4552HreProDsc, Short.valueOf(A4553HreProTie), Short.valueOf(A4554HreProTmx), Integer.valueOf(A4555HreNumPro), Integer.valueOf(A4556HreNumRec), Short.valueOf(A10545HreNH2O), A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREC");
                     if ( (pr_default.getStatus(38) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREC"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateL71874( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyL71874( ) ;
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
            endLevelL71874( ) ;
         }
      }
      closeExtendedTableCursorsL71874( ) ;
   }

   public void deferredUpdateL71874( )
   {
   }

   public void deleteL71874( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL71874( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL71874( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL71874( ) ;
         afterConfirmL71874( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL71874( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00L741 */
               pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
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
      endLevelL71874( ) ;
      Gx_mode = sMode1874 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL71874( )
   {
      standaloneModalL71874( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00L742 */
         pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq), Byte.valueOf(A4550HreLinPro)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
      }
   }

   public void endLevelL71874( )
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

   public void scanStartL71874( )
   {
      /* Scan By routine */
      /* Using cursor T00L743 */
      pr_default.execute(41, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
      RcdFound1874 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound1874 = (short)(1) ;
         A4550HreLinPro = T00L743_A4550HreLinPro[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL71874( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound1874 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound1874 = (short)(1) ;
         A4550HreLinPro = T00L743_A4550HreLinPro[0] ;
      }
   }

   public void scanEndL71874( )
   {
      pr_default.close(41);
   }

   public void afterConfirmL71874( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL71874( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL71874( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL71874( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL71874( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL71874( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL71874( )
   {
      edtHreLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProCod_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProDsc_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreProTie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTie_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreProTmx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreProTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTmx_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreNumPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreNumRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumRec_Enabled), 5, 0), !bGXsfl_472_Refreshing);
      edtHreNH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNH2O_Enabled), 5, 0), !bGXsfl_472_Refreshing);
   }

   public void send_integrity_lvl_hashesL71874( )
   {
   }

   public void send_integrity_lvl_hashesL7678( )
   {
   }

   public void send_integrity_lvl_hashesL7675( )
   {
   }

   public void subsflControlProps_275678( )
   {
      lblTextblock52_Internalname = "TEXTBLOCK52_"+sGXsfl_275_idx ;
      edtHreLinMaq_Internalname = "HRELINMAQ_"+sGXsfl_275_idx ;
      lblTextblock53_Internalname = "TEXTBLOCK53_"+sGXsfl_275_idx ;
      edtHreMaqCod_Internalname = "HREMAQCOD_"+sGXsfl_275_idx ;
      lblTextblock54_Internalname = "TEXTBLOCK54_"+sGXsfl_275_idx ;
      edtHreVolPrd_Internalname = "HREVOLPRD_"+sGXsfl_275_idx ;
      lblTextblock55_Internalname = "TEXTBLOCK55_"+sGXsfl_275_idx ;
      edtHreFacAbs_Internalname = "HREFACABS_"+sGXsfl_275_idx ;
      lblTextblock56_Internalname = "TEXTBLOCK56_"+sGXsfl_275_idx ;
      edtHreFecPes_Internalname = "HREFECPES_"+sGXsfl_275_idx ;
      lblTextblock57_Internalname = "TEXTBLOCK57_"+sGXsfl_275_idx ;
      edtHreMaqPes_Internalname = "HREMAQPES_"+sGXsfl_275_idx ;
      lblTextblock58_Internalname = "TEXTBLOCK58_"+sGXsfl_275_idx ;
      edtHreULinPro_Internalname = "HREULINPRO_"+sGXsfl_275_idx ;
      lblTextblock59_Internalname = "TEXTBLOCK59_"+sGXsfl_275_idx ;
      edtHreUsrCod_Internalname = "HREUSRCOD_"+sGXsfl_275_idx ;
      lblTextblock60_Internalname = "TEXTBLOCK60_"+sGXsfl_275_idx ;
      edtHReMaqNh_Internalname = "HREMAQNH_"+sGXsfl_275_idx ;
      lblTextblock61_Internalname = "TEXTBLOCK61_"+sGXsfl_275_idx ;
      edtHReMaqVX_Internalname = "HREMAQVX_"+sGXsfl_275_idx ;
      lblTextblock62_Internalname = "TEXTBLOCK62_"+sGXsfl_275_idx ;
      edtHReMaqBL_Internalname = "HREMAQBL_"+sGXsfl_275_idx ;
      lblTextblock63_Internalname = "TEXTBLOCK63_"+sGXsfl_275_idx ;
      edtHReMaqFlow_Internalname = "HREMAQFLOW_"+sGXsfl_275_idx ;
      lblTextblock64_Internalname = "TEXTBLOCK64_"+sGXsfl_275_idx ;
      edtHReMaqRPM_Internalname = "HREMAQRPM_"+sGXsfl_275_idx ;
      lblTextblock65_Internalname = "TEXTBLOCK65_"+sGXsfl_275_idx ;
      edtHReMaqMol_Internalname = "HREMAQMOL_"+sGXsfl_275_idx ;
      lblTextblock66_Internalname = "TEXTBLOCK66_"+sGXsfl_275_idx ;
      edtHReMaqTor_Internalname = "HREMAQTOR_"+sGXsfl_275_idx ;
      lblTextblock67_Internalname = "TEXTBLOCK67_"+sGXsfl_275_idx ;
      edtHReMaqCla_Internalname = "HREMAQCLA_"+sGXsfl_275_idx ;
      lblTextblock68_Internalname = "TEXTBLOCK68_"+sGXsfl_275_idx ;
      edtHReMaqTej_Internalname = "HREMAQTEJ_"+sGXsfl_275_idx ;
      lblTextblock69_Internalname = "TEXTBLOCK69_"+sGXsfl_275_idx ;
      edtHReMaqDel_Internalname = "HREMAQDEL_"+sGXsfl_275_idx ;
      lblTextblock70_Internalname = "TEXTBLOCK70_"+sGXsfl_275_idx ;
      edtHReMaqPML_Internalname = "HREMAQPML_"+sGXsfl_275_idx ;
      lblTextblock71_Internalname = "TEXTBLOCK71_"+sGXsfl_275_idx ;
      edtHreCosAA_Internalname = "HRECOSAA_"+sGXsfl_275_idx ;
      lblTextblock72_Internalname = "TEXTBLOCK72_"+sGXsfl_275_idx ;
      edtHrecosAd_Internalname = "HRECOSAD_"+sGXsfl_275_idx ;
      lblTextblock73_Internalname = "TEXTBLOCK73_"+sGXsfl_275_idx ;
      edtHreCosAnc_Internalname = "HRECOSANC_"+sGXsfl_275_idx ;
      lblTextblock74_Internalname = "TEXTBLOCK74_"+sGXsfl_275_idx ;
      edtHreCosCol_Internalname = "HRECOSCOL_"+sGXsfl_275_idx ;
      lblTextblock75_Internalname = "TEXTBLOCK75_"+sGXsfl_275_idx ;
      edtHreCosPA_Internalname = "HRECOSPA_"+sGXsfl_275_idx ;
      lblTextblock76_Internalname = "TEXTBLOCK76_"+sGXsfl_275_idx ;
      edtHreCosPD_Internalname = "HRECOSPD_"+sGXsfl_275_idx ;
      lblTextblock77_Internalname = "TEXTBLOCK77_"+sGXsfl_275_idx ;
      edtHreLtsSb_Internalname = "HRELTSSB_"+sGXsfl_275_idx ;
      lblTextblock78_Internalname = "TEXTBLOCK78_"+sGXsfl_275_idx ;
      edtHreLtsRm_Internalname = "HRELTSRM_"+sGXsfl_275_idx ;
      lblTextblock79_Internalname = "TEXTBLOCK79_"+sGXsfl_275_idx ;
      edtHreAcaQ_Internalname = "HREACAQ_"+sGXsfl_275_idx ;
      lblTextblock80_Internalname = "TEXTBLOCK80_"+sGXsfl_275_idx ;
      edtHreAcab_Internalname = "HREACAB_"+sGXsfl_275_idx ;
      lblTextblock81_Internalname = "TEXTBLOCK81_"+sGXsfl_275_idx ;
      edtHreNPrg_Internalname = "HRENPRG_"+sGXsfl_275_idx ;
      lblTextblock82_Internalname = "TEXTBLOCK82_"+sGXsfl_275_idx ;
      edtHreLotF_Internalname = "HRELOTF_"+sGXsfl_275_idx ;
      lblTextblock83_Internalname = "TEXTBLOCK83_"+sGXsfl_275_idx ;
      edtHreAnc_Internalname = "HREANC_"+sGXsfl_275_idx ;
      lblTextblock84_Internalname = "TEXTBLOCK84_"+sGXsfl_275_idx ;
      edtHreGrm_Internalname = "HREGRM_"+sGXsfl_275_idx ;
      lblTextblock85_Internalname = "TEXTBLOCK85_"+sGXsfl_275_idx ;
      edtHreVel_Internalname = "HREVEL_"+sGXsfl_275_idx ;
      lblTextblock86_Internalname = "TEXTBLOCK86_"+sGXsfl_275_idx ;
      edtHreObs_Internalname = "HREOBS_"+sGXsfl_275_idx ;
      lblTextblock87_Internalname = "TEXTBLOCK87_"+sGXsfl_275_idx ;
      edtHreAva_Internalname = "HREAVA_"+sGXsfl_275_idx ;
      lblTextblock88_Internalname = "TEXTBLOCK88_"+sGXsfl_275_idx ;
      edtHreAs_Internalname = "HREAS_"+sGXsfl_275_idx ;
      lblTextblock89_Internalname = "TEXTBLOCK89_"+sGXsfl_275_idx ;
      edtHreAi_Internalname = "HREAI_"+sGXsfl_275_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_275_idx ;
   }

   public void subsflControlProps_fel_275678( )
   {
      lblTextblock52_Internalname = "TEXTBLOCK52_"+sGXsfl_275_fel_idx ;
      edtHreLinMaq_Internalname = "HRELINMAQ_"+sGXsfl_275_fel_idx ;
      lblTextblock53_Internalname = "TEXTBLOCK53_"+sGXsfl_275_fel_idx ;
      edtHreMaqCod_Internalname = "HREMAQCOD_"+sGXsfl_275_fel_idx ;
      lblTextblock54_Internalname = "TEXTBLOCK54_"+sGXsfl_275_fel_idx ;
      edtHreVolPrd_Internalname = "HREVOLPRD_"+sGXsfl_275_fel_idx ;
      lblTextblock55_Internalname = "TEXTBLOCK55_"+sGXsfl_275_fel_idx ;
      edtHreFacAbs_Internalname = "HREFACABS_"+sGXsfl_275_fel_idx ;
      lblTextblock56_Internalname = "TEXTBLOCK56_"+sGXsfl_275_fel_idx ;
      edtHreFecPes_Internalname = "HREFECPES_"+sGXsfl_275_fel_idx ;
      lblTextblock57_Internalname = "TEXTBLOCK57_"+sGXsfl_275_fel_idx ;
      edtHreMaqPes_Internalname = "HREMAQPES_"+sGXsfl_275_fel_idx ;
      lblTextblock58_Internalname = "TEXTBLOCK58_"+sGXsfl_275_fel_idx ;
      edtHreULinPro_Internalname = "HREULINPRO_"+sGXsfl_275_fel_idx ;
      lblTextblock59_Internalname = "TEXTBLOCK59_"+sGXsfl_275_fel_idx ;
      edtHreUsrCod_Internalname = "HREUSRCOD_"+sGXsfl_275_fel_idx ;
      lblTextblock60_Internalname = "TEXTBLOCK60_"+sGXsfl_275_fel_idx ;
      edtHReMaqNh_Internalname = "HREMAQNH_"+sGXsfl_275_fel_idx ;
      lblTextblock61_Internalname = "TEXTBLOCK61_"+sGXsfl_275_fel_idx ;
      edtHReMaqVX_Internalname = "HREMAQVX_"+sGXsfl_275_fel_idx ;
      lblTextblock62_Internalname = "TEXTBLOCK62_"+sGXsfl_275_fel_idx ;
      edtHReMaqBL_Internalname = "HREMAQBL_"+sGXsfl_275_fel_idx ;
      lblTextblock63_Internalname = "TEXTBLOCK63_"+sGXsfl_275_fel_idx ;
      edtHReMaqFlow_Internalname = "HREMAQFLOW_"+sGXsfl_275_fel_idx ;
      lblTextblock64_Internalname = "TEXTBLOCK64_"+sGXsfl_275_fel_idx ;
      edtHReMaqRPM_Internalname = "HREMAQRPM_"+sGXsfl_275_fel_idx ;
      lblTextblock65_Internalname = "TEXTBLOCK65_"+sGXsfl_275_fel_idx ;
      edtHReMaqMol_Internalname = "HREMAQMOL_"+sGXsfl_275_fel_idx ;
      lblTextblock66_Internalname = "TEXTBLOCK66_"+sGXsfl_275_fel_idx ;
      edtHReMaqTor_Internalname = "HREMAQTOR_"+sGXsfl_275_fel_idx ;
      lblTextblock67_Internalname = "TEXTBLOCK67_"+sGXsfl_275_fel_idx ;
      edtHReMaqCla_Internalname = "HREMAQCLA_"+sGXsfl_275_fel_idx ;
      lblTextblock68_Internalname = "TEXTBLOCK68_"+sGXsfl_275_fel_idx ;
      edtHReMaqTej_Internalname = "HREMAQTEJ_"+sGXsfl_275_fel_idx ;
      lblTextblock69_Internalname = "TEXTBLOCK69_"+sGXsfl_275_fel_idx ;
      edtHReMaqDel_Internalname = "HREMAQDEL_"+sGXsfl_275_fel_idx ;
      lblTextblock70_Internalname = "TEXTBLOCK70_"+sGXsfl_275_fel_idx ;
      edtHReMaqPML_Internalname = "HREMAQPML_"+sGXsfl_275_fel_idx ;
      lblTextblock71_Internalname = "TEXTBLOCK71_"+sGXsfl_275_fel_idx ;
      edtHreCosAA_Internalname = "HRECOSAA_"+sGXsfl_275_fel_idx ;
      lblTextblock72_Internalname = "TEXTBLOCK72_"+sGXsfl_275_fel_idx ;
      edtHrecosAd_Internalname = "HRECOSAD_"+sGXsfl_275_fel_idx ;
      lblTextblock73_Internalname = "TEXTBLOCK73_"+sGXsfl_275_fel_idx ;
      edtHreCosAnc_Internalname = "HRECOSANC_"+sGXsfl_275_fel_idx ;
      lblTextblock74_Internalname = "TEXTBLOCK74_"+sGXsfl_275_fel_idx ;
      edtHreCosCol_Internalname = "HRECOSCOL_"+sGXsfl_275_fel_idx ;
      lblTextblock75_Internalname = "TEXTBLOCK75_"+sGXsfl_275_fel_idx ;
      edtHreCosPA_Internalname = "HRECOSPA_"+sGXsfl_275_fel_idx ;
      lblTextblock76_Internalname = "TEXTBLOCK76_"+sGXsfl_275_fel_idx ;
      edtHreCosPD_Internalname = "HRECOSPD_"+sGXsfl_275_fel_idx ;
      lblTextblock77_Internalname = "TEXTBLOCK77_"+sGXsfl_275_fel_idx ;
      edtHreLtsSb_Internalname = "HRELTSSB_"+sGXsfl_275_fel_idx ;
      lblTextblock78_Internalname = "TEXTBLOCK78_"+sGXsfl_275_fel_idx ;
      edtHreLtsRm_Internalname = "HRELTSRM_"+sGXsfl_275_fel_idx ;
      lblTextblock79_Internalname = "TEXTBLOCK79_"+sGXsfl_275_fel_idx ;
      edtHreAcaQ_Internalname = "HREACAQ_"+sGXsfl_275_fel_idx ;
      lblTextblock80_Internalname = "TEXTBLOCK80_"+sGXsfl_275_fel_idx ;
      edtHreAcab_Internalname = "HREACAB_"+sGXsfl_275_fel_idx ;
      lblTextblock81_Internalname = "TEXTBLOCK81_"+sGXsfl_275_fel_idx ;
      edtHreNPrg_Internalname = "HRENPRG_"+sGXsfl_275_fel_idx ;
      lblTextblock82_Internalname = "TEXTBLOCK82_"+sGXsfl_275_fel_idx ;
      edtHreLotF_Internalname = "HRELOTF_"+sGXsfl_275_fel_idx ;
      lblTextblock83_Internalname = "TEXTBLOCK83_"+sGXsfl_275_fel_idx ;
      edtHreAnc_Internalname = "HREANC_"+sGXsfl_275_fel_idx ;
      lblTextblock84_Internalname = "TEXTBLOCK84_"+sGXsfl_275_fel_idx ;
      edtHreGrm_Internalname = "HREGRM_"+sGXsfl_275_fel_idx ;
      lblTextblock85_Internalname = "TEXTBLOCK85_"+sGXsfl_275_fel_idx ;
      edtHreVel_Internalname = "HREVEL_"+sGXsfl_275_fel_idx ;
      lblTextblock86_Internalname = "TEXTBLOCK86_"+sGXsfl_275_fel_idx ;
      edtHreObs_Internalname = "HREOBS_"+sGXsfl_275_fel_idx ;
      lblTextblock87_Internalname = "TEXTBLOCK87_"+sGXsfl_275_fel_idx ;
      edtHreAva_Internalname = "HREAVA_"+sGXsfl_275_fel_idx ;
      lblTextblock88_Internalname = "TEXTBLOCK88_"+sGXsfl_275_fel_idx ;
      edtHreAs_Internalname = "HREAS_"+sGXsfl_275_fel_idx ;
      lblTextblock89_Internalname = "TEXTBLOCK89_"+sGXsfl_275_fel_idx ;
      edtHreAi_Internalname = "HREAI_"+sGXsfl_275_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_275_fel_idx ;
   }

   public void addRowL7678( )
   {
      nRC_GXsfl_472 = 0 ;
      nGXsfl_275_idx = (int)(nGXsfl_275_idx+1) ;
      sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_275678( ) ;
      sendRowL7678( ) ;
   }

   public void sendRowL7678( )
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
         if ( ((int)((nGXsfl_275_idx) % (2))) == 0 )
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
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_275_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_275_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_275_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock52_Internalname,httpContext.getMessage( "Linea Maquina. Hist.Receta", ""),"","",lblTextblock52_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 283,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,283);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLinMaq_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreLinMaq_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock53_Internalname,httpContext.getMessage( "Maquina Hdr. Hist.Receta", ""),"","",lblTextblock53_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 288,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqCod_Internalname,GXutil.rtrim( A4546HreMaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,288);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock54_Internalname,httpContext.getMessage( "Volumen Maq. Hist.Receta", ""),"","",lblTextblock54_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 293,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreVolPrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,293);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPrd_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreVolPrd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock55_Internalname,httpContext.getMessage( "Factor Abs.Hist.Receta", ""),"","",lblTextblock55_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 298,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFacAbs_Internalname,GXutil.ltrim( localUtil.ntoc( A4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreFacAbs_Enabled!=0) ? localUtil.format( A4548HreFacAbs, "ZZ9.99") : localUtil.format( A4548HreFacAbs, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,298);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFacAbs_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFacAbs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock56_Internalname,httpContext.getMessage( "Fecha Hora Pesaje", ""),"","",lblTextblock56_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 303,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreFecPes_Internalname,localUtil.ttoc( A4584HreFecPes, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4584HreFecPes, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,303);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreFecPes_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreFecPes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(17),"chr",Integer.valueOf(1),"row",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock57_Internalname,httpContext.getMessage( "Maquina Pesada", ""),"","",lblTextblock57_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 308,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqPes_Internalname,GXutil.ltrim( localUtil.ntoc( A4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreMaqPes_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4585HreMaqPes), "9") : localUtil.format( DecimalUtil.doubleToDec(A4585HreMaqPes), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,308);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqPes_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreMaqPes_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock58_Internalname,httpContext.getMessage( "Ul.Lin.Proceso Rec.Hist.Receta", ""),"","",lblTextblock58_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreULinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreULinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4549HreULinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4549HreULinPro), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,313);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreULinPro_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreULinPro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock59_Internalname,httpContext.getMessage( "Usuario creo receta", ""),"","",lblTextblock59_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 318,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreUsrCod_Internalname,GXutil.rtrim( A4863HreUsrCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,318);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreUsrCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreUsrCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock60_Internalname,httpContext.getMessage( "HReMaqNh", ""),"","",lblTextblock60_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 323,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqNh_Internalname,GXutil.ltrim( localUtil.ntoc( A7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqNh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7814HReMaqNh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7814HReMaqNh), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,323);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqNh_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqNh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock61_Internalname,httpContext.getMessage( "HReMaqVX", ""),"","",lblTextblock61_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 328,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqVX_Internalname,GXutil.ltrim( localUtil.ntoc( A7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqVX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7815HReMaqVX), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7815HReMaqVX), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,328);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqVX_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqVX_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock62_Internalname,httpContext.getMessage( "HReMaqBL", ""),"","",lblTextblock62_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 333,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqBL_Internalname,GXutil.ltrim( localUtil.ntoc( A7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqBL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7816HReMaqBL), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7816HReMaqBL), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,333);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqBL_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqBL_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock63_Internalname,httpContext.getMessage( "HReMaqFlow", ""),"","",lblTextblock63_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 338,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqFlow_Internalname,GXutil.ltrim( localUtil.ntoc( A7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqFlow_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7817HReMaqFlow), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7817HReMaqFlow), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,338);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqFlow_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqFlow_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock64_Internalname,httpContext.getMessage( "HReMaqRPM", ""),"","",lblTextblock64_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 343,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqRPM_Internalname,GXutil.ltrim( localUtil.ntoc( A7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqRPM_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7818HReMaqRPM), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7818HReMaqRPM), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,343);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqRPM_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqRPM_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock65_Internalname,httpContext.getMessage( "HReMaqMol", ""),"","",lblTextblock65_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 348,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqMol_Internalname,GXutil.ltrim( localUtil.ntoc( A7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqMol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7819HReMaqMol), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7819HReMaqMol), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,348);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqMol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqMol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock66_Internalname,httpContext.getMessage( "HReMaqTor", ""),"","",lblTextblock66_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 353,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqTor_Internalname,GXutil.ltrim( localUtil.ntoc( A7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqTor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7820HReMaqTor), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7820HReMaqTor), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,353);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqTor_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqTor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock67_Internalname,httpContext.getMessage( "HReMaqCla", ""),"","",lblTextblock67_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 358,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqCla_Internalname,GXutil.rtrim( A7821HReMaqCla),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,358);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqCla_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqCla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock68_Internalname,httpContext.getMessage( "HReMaqTej", ""),"","",lblTextblock68_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 363,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqTej_Internalname,GXutil.ltrim( localUtil.ntoc( A7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqTej_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7822HReMaqTej), "9") : localUtil.format( DecimalUtil.doubleToDec(A7822HReMaqTej), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,363);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqTej_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqTej_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock69_Internalname,httpContext.getMessage( "HReMaqDel", ""),"","",lblTextblock69_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 368,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqDel_Internalname,GXutil.ltrim( localUtil.ntoc( A7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqDel_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7823HReMaqDel), "9") : localUtil.format( DecimalUtil.doubleToDec(A7823HReMaqDel), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,368);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqDel_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqDel_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock70_Internalname,httpContext.getMessage( "HReMaqPML", ""),"","",lblTextblock70_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 373,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHReMaqPML_Internalname,GXutil.ltrim( localUtil.ntoc( A7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHReMaqPML_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7824HReMaqPML), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7824HReMaqPML), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,373);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHReMaqPML_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHReMaqPML_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock71_Internalname,httpContext.getMessage( "HreCosAA", ""),"","",lblTextblock71_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 378,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreCosAA_Internalname,GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreCosAA_Enabled!=0) ? localUtil.format( A8602HreCosAA, "ZZZZZZ9.99") : localUtil.format( A8602HreCosAA, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,378);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreCosAA_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreCosAA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock72_Internalname,httpContext.getMessage( "HrecosAd", ""),"","",lblTextblock72_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 383,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHrecosAd_Internalname,GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHrecosAd_Enabled!=0) ? localUtil.format( A8603HrecosAd, "ZZZZZZ9.99") : localUtil.format( A8603HrecosAd, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,383);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHrecosAd_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHrecosAd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock73_Internalname,httpContext.getMessage( "HreCosAnc", ""),"","",lblTextblock73_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 388,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreCosAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreCosAnc_Enabled!=0) ? localUtil.format( A8604HreCosAnc, "ZZZZZZ9.99") : localUtil.format( A8604HreCosAnc, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,388);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreCosAnc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreCosAnc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock74_Internalname,httpContext.getMessage( "HreCosCol", ""),"","",lblTextblock74_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 393,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreCosCol_Internalname,GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreCosCol_Enabled!=0) ? localUtil.format( A8605HreCosCol, "ZZZZZZ9.99") : localUtil.format( A8605HreCosCol, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,393);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreCosCol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreCosCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock75_Internalname,httpContext.getMessage( "HreCosPA", ""),"","",lblTextblock75_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 398,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreCosPA_Internalname,GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreCosPA_Enabled!=0) ? localUtil.format( A8606HreCosPA, "ZZZZZZ9.99") : localUtil.format( A8606HreCosPA, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,398);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreCosPA_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreCosPA_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock76_Internalname,httpContext.getMessage( "HreCosPD", ""),"","",lblTextblock76_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 403,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreCosPD_Internalname,GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreCosPD_Enabled!=0) ? localUtil.format( A8607HreCosPD, "ZZZZZZ9.99") : localUtil.format( A8607HreCosPD, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,403);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreCosPD_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreCosPD_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock77_Internalname,httpContext.getMessage( "Lts Sobrantes", ""),"","",lblTextblock77_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 408,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLtsSb_Internalname,GXutil.ltrim( localUtil.ntoc( A9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreLtsSb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9780HreLtsSb), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9780HreLtsSb), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,408);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLtsSb_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreLtsSb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock78_Internalname,httpContext.getMessage( "Lts Remante", ""),"","",lblTextblock78_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 413,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLtsRm_Internalname,GXutil.ltrim( localUtil.ntoc( A9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreLtsRm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9781HreLtsRm), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9781HreLtsRm), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,413);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLtsRm_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreLtsRm_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock79_Internalname,httpContext.getMessage( "Proceso Acab Quimico", ""),"","",lblTextblock79_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 418,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcaQ_Internalname,GXutil.rtrim( A9803HreAcaQ),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,418);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcaQ_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreAcaQ_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock80_Internalname,httpContext.getMessage( "Receta Acabado?", ""),"","",lblTextblock80_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 423,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAcab_Internalname,GXutil.rtrim( A9804HreAcab),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,423);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAcab_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreAcab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock81_Internalname,httpContext.getMessage( "N Programa", ""),"","",lblTextblock81_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 428,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNPrg_Internalname,GXutil.rtrim( A1094HreNPrg),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,428);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNPrg_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreNPrg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock82_Internalname,httpContext.getMessage( "Lote de Hilado", ""),"","",lblTextblock82_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 433,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLotF_Internalname,GXutil.rtrim( A697HreLotF),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,433);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLotF_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreLotF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock83_Internalname,httpContext.getMessage( "Ancho Carvema", ""),"","",lblTextblock83_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 438,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10381HreAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10381HreAnc), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,438);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAnc_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreAnc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock84_Internalname,httpContext.getMessage( "Grrm Carvema", ""),"","",lblTextblock84_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 443,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreGrm_Internalname,GXutil.ltrim( localUtil.ntoc( A10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreGrm_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10382HreGrm), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10382HreGrm), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,443);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreGrm_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreGrm_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock85_Internalname,httpContext.getMessage( "Vel Carvema", ""),"","",lblTextblock85_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 448,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVel_Internalname,GXutil.ltrim( localUtil.ntoc( A10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreVel_Enabled!=0) ? localUtil.format( A10383HreVel, "ZZ9.99") : localUtil.format( A10383HreVel, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,448);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreVel_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreVel_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock86_Internalname,httpContext.getMessage( "Obs Carvema", ""),"","",lblTextblock86_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Multiple line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 453,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      ClassString = "" ;
      StyleString = "" ;
      Grid1Row.AddColumnProperties("html_textarea", 1, isAjaxCallMode( ), new Object[] {edtHreObs_Internalname,A10384HreObs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,453);\"",Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(edtHreObs_Enabled),Integer.valueOf(0),Integer.valueOf(80),"chr",Integer.valueOf(10),"row",Integer.valueOf(0),StyleString,ClassString,"","","800",Integer.valueOf(-1),Integer.valueOf(0),"","",Integer.valueOf(-1),Boolean.valueOf(true),"","'"+""+"'"+",false,"+"'"+""+"'",Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock87_Internalname,httpContext.getMessage( "Avanza", ""),"","",lblTextblock87_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 458,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAva_Internalname,GXutil.rtrim( A11508HreAva),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,458);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAva_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreAva_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock88_Internalname,httpContext.getMessage( "AS", ""),"","",lblTextblock88_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 463,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAs_Internalname,GXutil.rtrim( A12126HreAs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,463);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAs_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreAs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock89_Internalname,httpContext.getMessage( "AI", ""),"","",lblTextblock89_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 468,'',false,'" + sGXsfl_275_idx + "',275)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreAi_Internalname,GXutil.rtrim( A12127HreAi),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,468);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreAi_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtHreAi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(275),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
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
      startgridcontrol472( ) ;
      nGXsfl_472_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1874 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1874 = (short)(1) ;
            scanStartL71874( ) ;
            while ( RcdFound1874 != 0 )
            {
               init_level_properties1874( ) ;
               getByPrimaryKeyL71874( ) ;
               addRowL71874( ) ;
               scanNextL71874( ) ;
            }
            scanEndL71874( ) ;
            nBlankRcdCount1874 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalL71874( ) ;
         standaloneModalL71874( ) ;
         sMode1874 = Gx_mode ;
         while ( nGXsfl_472_idx < nRC_GXsfl_472 )
         {
            bGXsfl_472_Refreshing = true ;
            readRowL71874( ) ;
            edtavnRcdDeleted_1874_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1874_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_1874_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_1874_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreLinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINPRO_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROCOD_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProCod_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPRODSC_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProDsc_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreProTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTIE_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProTie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTie_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreProTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTMX_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreProTmx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreProTmx_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreNumPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMPRO_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreNumRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMREC_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNumRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumRec_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            edtHreNH2O_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENH2O_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtHreNH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNH2O_Enabled), 5, 0), !bGXsfl_472_Refreshing);
            if ( ( nRcdExists_1874 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalL71874( ) ;
            }
            sendRowL71874( ) ;
            bGXsfl_472_Refreshing = false ;
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
            scanStartL71874( ) ;
            while ( RcdFound1874 != 0 )
            {
               sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx+1), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
               subsflControlProps_4721874( ) ;
               init_level_properties1874( ) ;
               standaloneNotModalL71874( ) ;
               getByPrimaryKeyL71874( ) ;
               standaloneModalL71874( ) ;
               addRowL71874( ) ;
               scanNextL71874( ) ;
            }
            scanEndL71874( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1874 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx+1), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
      subsflControlProps_4721874( ) ;
      initAllL71874( ) ;
      init_level_properties1874( ) ;
      nRcdExists_1874 = (short)(0) ;
      nIsMod_1874 = (short)(0) ;
      nRcdDeleted_1874 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 275 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_275_idx, ".")) == 0 ) )
      {
         nBlankRcdCount1874 = (short)(nBlankRcdUsr1874+nBlankRcdCount1874) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount1874 > 0 )
      {
         standaloneNotModalL71874( ) ;
         standaloneModalL71874( ) ;
         addRowL71874( ) ;
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
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_275_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_275_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_275_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesL7678( ) ;
      GXCCtl = "Z4545HreLinMaq_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4546HreMaqCod_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4546HreMaqCod));
      GXCCtl = "Z4547HreVolPrd_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4548HreFacAbs_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4548HreFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4584HreFecPes_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4584HreFecPes, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4585HreMaqPes_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4585HreMaqPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4549HreULinPro_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4549HreULinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4863HreUsrCod_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4863HreUsrCod));
      GXCCtl = "Z7814HReMaqNh_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7814HReMaqNh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7815HReMaqVX_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7815HReMaqVX, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7816HReMaqBL_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7816HReMaqBL, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7817HReMaqFlow_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7817HReMaqFlow, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7818HReMaqRPM_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7818HReMaqRPM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7819HReMaqMol_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7819HReMaqMol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7820HReMaqTor_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7820HReMaqTor, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7821HReMaqCla_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7821HReMaqCla));
      GXCCtl = "Z7822HReMaqTej_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7822HReMaqTej, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7823HReMaqDel_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7823HReMaqDel, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7824HReMaqPML_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7824HReMaqPML, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8602HreCosAA_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8603HrecosAd_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8604HreCosAnc_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8605HreCosCol_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8606HreCosPA_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8607HreCosPD_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9780HreLtsSb_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9780HreLtsSb, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9781HreLtsRm_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9781HreLtsRm, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9803HreAcaQ_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9803HreAcaQ));
      GXCCtl = "Z9804HreAcab_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z9804HreAcab));
      GXCCtl = "Z1094HreNPrg_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1094HreNPrg));
      GXCCtl = "Z697HreLotF_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z697HreLotF));
      GXCCtl = "Z10381HreAnc_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10381HreAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10382HreGrm_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10382HreGrm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10383HreVel_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10383HreVel, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10384HreObs_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z10384HreObs);
      GXCCtl = "Z11508HreAva_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11508HreAva));
      GXCCtl = "Z12126HreAs_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12126HreAs));
      GXCCtl = "Z12127HreAi_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12127HreAi));
      GXCCtl = "nRC_GXsfl_472_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_472_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_678_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_678_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_678_" + sGXsfl_275_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_678, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELINMAQ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQCOD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREVOLPRD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFACABS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFacAbs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREFECPES_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreFecPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQPES_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreMaqPes_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREULINPRO_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreULinPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREUSRCOD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreUsrCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQNH_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqNh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQVX_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqVX_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQBL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqBL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQFLOW_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqFlow_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQRPM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqRPM_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQMOL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqMol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQTOR_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQCLA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqCla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQTEJ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTej_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQDEL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqDel_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREMAQPML_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqPML_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECOSAA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECOSAD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHrecosAd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECOSANC_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECOSCOL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECOSPA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPA_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECOSPD_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELTSSB_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsSb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELTSRM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACAQ_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcaQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREACAB_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENPRG_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELOTF_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLotF_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREANC_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREGRM_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreGrm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREVEL_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVel_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREOBS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREAVA_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAva_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREAS_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREAI_"+sGXsfl_275_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAi_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_275_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowL7678( )
   {
      nGXsfl_275_idx = (int)(nGXsfl_275_idx+1) ;
      sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_275678( ) ;
      edtHreLinMaq_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINMAQ_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQCOD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreVolPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVOLPRD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFacAbs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFACABS_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreFecPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREFECPES_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreMaqPes_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQPES_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreULinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREULINPRO_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreUsrCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREUSRCOD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqNh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQNH_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqVX_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQVX_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqBL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQBL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqFlow_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQFLOW_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqRPM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQRPM_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqMol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQMOL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqTor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQTOR_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqCla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQCLA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqTej_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQTEJ_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqDel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQDEL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHReMaqPML_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREMAQPML_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreCosAA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSAA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHrecosAd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSAD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreCosAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSANC_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreCosCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSCOL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreCosPA_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSPA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreCosPD_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRECOSPD_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreLtsSb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELTSSB_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreLtsRm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELTSRM_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcaQ_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACAQ_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREACAB_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNPrg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENPRG_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreLotF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELOTF_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAnc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREANC_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreGrm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREGRM_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreVel_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREVEL_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREOBS_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAva_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREAVA_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREAS_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreAi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREAI_"+sGXsfl_275_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRELINMAQ_" + sGXsfl_275_idx ;
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
         GXCCtl = "HREVOLPRD_" + sGXsfl_275_idx ;
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
         GXCCtl = "HREFACABS_" + sGXsfl_275_idx ;
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
         GXCCtl = "HREFECPES_" + sGXsfl_275_idx ;
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
         GXCCtl = "HREMAQPES_" + sGXsfl_275_idx ;
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
         GXCCtl = "HREULINPRO_" + sGXsfl_275_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "HREMAQNH_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqNh_Internalname ;
         wbErr = true ;
         A7814HReMaqNh = (short)(0) ;
         n7814HReMaqNh = false ;
      }
      else
      {
         A7814HReMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqNh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7814HReMaqNh = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HREMAQVX_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqVX_Internalname ;
         wbErr = true ;
         A7815HReMaqVX = (byte)(0) ;
         n7815HReMaqVX = false ;
      }
      else
      {
         A7815HReMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqVX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7815HReMaqVX = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HREMAQBL_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqBL_Internalname ;
         wbErr = true ;
         A7816HReMaqBL = (byte)(0) ;
         n7816HReMaqBL = false ;
      }
      else
      {
         A7816HReMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqBL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7816HReMaqBL = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "HREMAQFLOW_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqFlow_Internalname ;
         wbErr = true ;
         A7817HReMaqFlow = (byte)(0) ;
         n7817HReMaqFlow = false ;
      }
      else
      {
         A7817HReMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqFlow_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7817HReMaqFlow = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HREMAQRPM_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqRPM_Internalname ;
         wbErr = true ;
         A7818HReMaqRPM = (short)(0) ;
         n7818HReMaqRPM = false ;
      }
      else
      {
         A7818HReMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqRPM_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7818HReMaqRPM = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "HREMAQMOL_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqMol_Internalname ;
         wbErr = true ;
         A7819HReMaqMol = (short)(0) ;
         n7819HReMaqMol = false ;
      }
      else
      {
         A7819HReMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqMol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7819HReMaqMol = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "HREMAQTOR_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqTor_Internalname ;
         wbErr = true ;
         A7820HReMaqTor = (short)(0) ;
         n7820HReMaqTor = false ;
      }
      else
      {
         A7820HReMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqTor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7820HReMaqTor = false ;
      }
      A7821HReMaqCla = httpContext.cgiGet( edtHReMaqCla_Internalname) ;
      n7821HReMaqCla = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HREMAQTEJ_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqTej_Internalname ;
         wbErr = true ;
         A7822HReMaqTej = (byte)(0) ;
         n7822HReMaqTej = false ;
      }
      else
      {
         A7822HReMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqTej_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7822HReMaqTej = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "HREMAQDEL_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqDel_Internalname ;
         wbErr = true ;
         A7823HReMaqDel = (byte)(0) ;
         n7823HReMaqDel = false ;
      }
      else
      {
         A7823HReMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( edtHReMaqDel_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7823HReMaqDel = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHReMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "HREMAQPML_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHReMaqPML_Internalname ;
         wbErr = true ;
         A7824HReMaqPML = (short)(0) ;
         n7824HReMaqPML = false ;
      }
      else
      {
         A7824HReMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( edtHReMaqPML_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n7824HReMaqPML = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosAA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosAA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRECOSAA_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreCosAA_Internalname ;
         wbErr = true ;
         A8602HreCosAA = DecimalUtil.ZERO ;
         n8602HreCosAA = false ;
      }
      else
      {
         A8602HreCosAA = localUtil.ctond( httpContext.cgiGet( edtHreCosAA_Internalname)) ;
         n8602HreCosAA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHrecosAd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHrecosAd_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRECOSAD_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHrecosAd_Internalname ;
         wbErr = true ;
         A8603HrecosAd = DecimalUtil.ZERO ;
         n8603HrecosAd = false ;
      }
      else
      {
         A8603HrecosAd = localUtil.ctond( httpContext.cgiGet( edtHrecosAd_Internalname)) ;
         n8603HrecosAd = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosAnc_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRECOSANC_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreCosAnc_Internalname ;
         wbErr = true ;
         A8604HreCosAnc = DecimalUtil.ZERO ;
         n8604HreCosAnc = false ;
      }
      else
      {
         A8604HreCosAnc = localUtil.ctond( httpContext.cgiGet( edtHreCosAnc_Internalname)) ;
         n8604HreCosAnc = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosCol_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosCol_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRECOSCOL_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreCosCol_Internalname ;
         wbErr = true ;
         A8605HreCosCol = DecimalUtil.ZERO ;
         n8605HreCosCol = false ;
      }
      else
      {
         A8605HreCosCol = localUtil.ctond( httpContext.cgiGet( edtHreCosCol_Internalname)) ;
         n8605HreCosCol = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosPA_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosPA_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRECOSPA_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreCosPA_Internalname ;
         wbErr = true ;
         A8606HreCosPA = DecimalUtil.ZERO ;
         n8606HreCosPA = false ;
      }
      else
      {
         A8606HreCosPA = localUtil.ctond( httpContext.cgiGet( edtHreCosPA_Internalname)) ;
         n8606HreCosPA = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreCosPD_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreCosPD_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
      {
         GXCCtl = "HRECOSPD_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreCosPD_Internalname ;
         wbErr = true ;
         A8607HreCosPD = DecimalUtil.ZERO ;
         n8607HreCosPD = false ;
      }
      else
      {
         A8607HreCosPD = localUtil.ctond( httpContext.cgiGet( edtHreCosPD_Internalname)) ;
         n8607HreCosPD = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsSb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsSb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "HRELTSSB_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreLtsSb_Internalname ;
         wbErr = true ;
         A9780HreLtsSb = 0 ;
         n9780HreLtsSb = false ;
      }
      else
      {
         A9780HreLtsSb = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsSb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9780HreLtsSb = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLtsRm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
      {
         GXCCtl = "HRELTSRM_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreLtsRm_Internalname ;
         wbErr = true ;
         A9781HreLtsRm = 0 ;
         n9781HreLtsRm = false ;
      }
      else
      {
         A9781HreLtsRm = (int)(localUtil.ctol( httpContext.cgiGet( edtHreLtsRm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9781HreLtsRm = false ;
      }
      A9803HreAcaQ = httpContext.cgiGet( edtHreAcaQ_Internalname) ;
      n9803HreAcaQ = false ;
      A9804HreAcab = httpContext.cgiGet( edtHreAcab_Internalname) ;
      n9804HreAcab = false ;
      A1094HreNPrg = httpContext.cgiGet( edtHreNPrg_Internalname) ;
      n1094HreNPrg = false ;
      A697HreLotF = httpContext.cgiGet( edtHreLotF_Internalname) ;
      n697HreLotF = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "HREANC_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreAnc_Internalname ;
         wbErr = true ;
         A10381HreAnc = (short)(0) ;
         n10381HreAnc = false ;
      }
      else
      {
         A10381HreAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtHreAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10381HreAnc = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HREGRM_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreGrm_Internalname ;
         wbErr = true ;
         A10382HreGrm = (short)(0) ;
         n10382HreGrm = false ;
      }
      else
      {
         A10382HreGrm = (short)(localUtil.ctol( httpContext.cgiGet( edtHreGrm_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10382HreGrm = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreVel_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreVel_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "HREVEL_" + sGXsfl_275_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreVel_Internalname ;
         wbErr = true ;
         A10383HreVel = DecimalUtil.ZERO ;
         n10383HreVel = false ;
      }
      else
      {
         A10383HreVel = localUtil.ctond( httpContext.cgiGet( edtHreVel_Internalname)) ;
         n10383HreVel = false ;
      }
      A10384HreObs = httpContext.cgiGet( edtHreObs_Internalname) ;
      n10384HreObs = false ;
      A11508HreAva = httpContext.cgiGet( edtHreAva_Internalname) ;
      n11508HreAva = false ;
      A12126HreAs = httpContext.cgiGet( edtHreAs_Internalname) ;
      n12126HreAs = false ;
      A12127HreAi = httpContext.cgiGet( edtHreAi_Internalname) ;
      n12127HreAi = false ;
      GXCCtl = "Z4545HreLinMaq_" + sGXsfl_275_idx ;
      Z4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4546HreMaqCod_" + sGXsfl_275_idx ;
      Z4546HreMaqCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4547HreVolPrd_" + sGXsfl_275_idx ;
      Z4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4548HreFacAbs_" + sGXsfl_275_idx ;
      Z4548HreFacAbs = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4584HreFecPes_" + sGXsfl_275_idx ;
      Z4584HreFecPes = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z4585HreMaqPes_" + sGXsfl_275_idx ;
      Z4585HreMaqPes = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4549HreULinPro_" + sGXsfl_275_idx ;
      Z4549HreULinPro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4863HreUsrCod_" + sGXsfl_275_idx ;
      Z4863HreUsrCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7814HReMaqNh_" + sGXsfl_275_idx ;
      Z7814HReMaqNh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7815HReMaqVX_" + sGXsfl_275_idx ;
      Z7815HReMaqVX = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7816HReMaqBL_" + sGXsfl_275_idx ;
      Z7816HReMaqBL = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7817HReMaqFlow_" + sGXsfl_275_idx ;
      Z7817HReMaqFlow = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7818HReMaqRPM_" + sGXsfl_275_idx ;
      Z7818HReMaqRPM = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7819HReMaqMol_" + sGXsfl_275_idx ;
      Z7819HReMaqMol = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7820HReMaqTor_" + sGXsfl_275_idx ;
      Z7820HReMaqTor = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7821HReMaqCla_" + sGXsfl_275_idx ;
      Z7821HReMaqCla = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7822HReMaqTej_" + sGXsfl_275_idx ;
      Z7822HReMaqTej = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7823HReMaqDel_" + sGXsfl_275_idx ;
      Z7823HReMaqDel = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7824HReMaqPML_" + sGXsfl_275_idx ;
      Z7824HReMaqPML = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8602HreCosAA_" + sGXsfl_275_idx ;
      Z8602HreCosAA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8603HrecosAd_" + sGXsfl_275_idx ;
      Z8603HrecosAd = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8604HreCosAnc_" + sGXsfl_275_idx ;
      Z8604HreCosAnc = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8605HreCosCol_" + sGXsfl_275_idx ;
      Z8605HreCosCol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8606HreCosPA_" + sGXsfl_275_idx ;
      Z8606HreCosPA = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z8607HreCosPD_" + sGXsfl_275_idx ;
      Z8607HreCosPD = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z9780HreLtsSb_" + sGXsfl_275_idx ;
      Z9780HreLtsSb = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9781HreLtsRm_" + sGXsfl_275_idx ;
      Z9781HreLtsRm = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9803HreAcaQ_" + sGXsfl_275_idx ;
      Z9803HreAcaQ = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9804HreAcab_" + sGXsfl_275_idx ;
      Z9804HreAcab = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1094HreNPrg_" + sGXsfl_275_idx ;
      Z1094HreNPrg = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z697HreLotF_" + sGXsfl_275_idx ;
      Z697HreLotF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10381HreAnc_" + sGXsfl_275_idx ;
      Z10381HreAnc = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10382HreGrm_" + sGXsfl_275_idx ;
      Z10382HreGrm = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10383HreVel_" + sGXsfl_275_idx ;
      Z10383HreVel = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10384HreObs_" + sGXsfl_275_idx ;
      Z10384HreObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11508HreAva_" + sGXsfl_275_idx ;
      Z11508HreAva = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12126HreAs_" + sGXsfl_275_idx ;
      Z12126HreAs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12127HreAi_" + sGXsfl_275_idx ;
      Z12127HreAi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRC_GXsfl_472_" + sGXsfl_275_idx ;
      nRC_GXsfl_472 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_678_" + sGXsfl_275_idx ;
      nRcdDeleted_678 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_678_" + sGXsfl_275_idx ;
      nRcdExists_678 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_678_" + sGXsfl_275_idx ;
      nIsMod_678 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_472_" + sGXsfl_275_idx ;
      nRC_GXsfl_472 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_4721874( )
   {
      edtavnRcdDeleted_1874_Internalname = "vNRCDDELETED_1874_"+sGXsfl_472_idx ;
      edtHreLinPro_Internalname = "HRELINPRO_"+sGXsfl_472_idx ;
      edtHreProCod_Internalname = "HREPROCOD_"+sGXsfl_472_idx ;
      edtHreProDsc_Internalname = "HREPRODSC_"+sGXsfl_472_idx ;
      edtHreProTie_Internalname = "HREPROTIE_"+sGXsfl_472_idx ;
      edtHreProTmx_Internalname = "HREPROTMX_"+sGXsfl_472_idx ;
      edtHreNumPro_Internalname = "HRENUMPRO_"+sGXsfl_472_idx ;
      edtHreNumRec_Internalname = "HRENUMREC_"+sGXsfl_472_idx ;
      edtHreNH2O_Internalname = "HRENH2O_"+sGXsfl_472_idx ;
   }

   public void subsflControlProps_fel_4721874( )
   {
      edtavnRcdDeleted_1874_Internalname = "vNRCDDELETED_1874_"+sGXsfl_472_fel_idx ;
      edtHreLinPro_Internalname = "HRELINPRO_"+sGXsfl_472_fel_idx ;
      edtHreProCod_Internalname = "HREPROCOD_"+sGXsfl_472_fel_idx ;
      edtHreProDsc_Internalname = "HREPRODSC_"+sGXsfl_472_fel_idx ;
      edtHreProTie_Internalname = "HREPROTIE_"+sGXsfl_472_fel_idx ;
      edtHreProTmx_Internalname = "HREPROTMX_"+sGXsfl_472_fel_idx ;
      edtHreNumPro_Internalname = "HRENUMPRO_"+sGXsfl_472_fel_idx ;
      edtHreNumRec_Internalname = "HRENUMREC_"+sGXsfl_472_fel_idx ;
      edtHreNH2O_Internalname = "HRENH2O_"+sGXsfl_472_fel_idx ;
   }

   public void addRowL71874( )
   {
      nGXsfl_472_idx = (int)(nGXsfl_472_idx+1) ;
      sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
      subsflControlProps_4721874( ) ;
      sendRowL71874( ) ;
   }

   public void sendRowL71874( )
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
         if ( ((int)((nGXsfl_472_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 473,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_1874_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_1874_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1874), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_1874), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,473);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_1874_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_1874_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 474,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4550HreLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,474);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreLinPro_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 475,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProCod_Internalname,GXutil.rtrim( A4551HreProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,475);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 476,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProDsc_Internalname,GXutil.rtrim( A4552HreProDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,476);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 477,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProTie_Internalname,GXutil.ltrim( localUtil.ntoc( A4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreProTie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4553HreProTie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4553HreProTie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,477);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProTie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProTie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 478,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreProTmx_Internalname,GXutil.ltrim( localUtil.ntoc( A4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreProTmx_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4554HreProTmx), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4554HreProTmx), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,478);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreProTmx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreProTmx_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 479,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumPro_Internalname,GXutil.ltrim( localUtil.ntoc( A4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4555HreNumPro), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4555HreNumPro), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,479);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNumPro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 480,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumRec_Internalname,GXutil.ltrim( localUtil.ntoc( A4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNumRec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4556HreNumRec), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4556HreNumRec), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,480);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNumRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNumRec_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1874_" + sGXsfl_472_idx + "',1);gx.fn.setControlValue('nIsMod_678_" + sGXsfl_275_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 481,'',false,'" + sGXsfl_472_idx + "',472)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNH2O_Internalname,GXutil.ltrim( localUtil.ntoc( A10545HreNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtHreNH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10545HreNH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10545HreNH2O), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,481);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHreNH2O_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtHreNH2O_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(472),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashesL71874( ) ;
      GXCCtl = "Z4550HreLinPro_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4550HreLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4551HreProCod_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4551HreProCod));
      GXCCtl = "Z4552HreProDsc_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4552HreProDsc));
      GXCCtl = "Z4553HreProTie_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4553HreProTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4554HreProTmx_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4554HreProTmx, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4555HreNumPro_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4555HreNumPro, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4556HreNumRec_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4556HreNumRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10545HreNH2O_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z10545HreNH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1874_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1874_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1874_" + sGXsfl_472_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1874, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_1874_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_1874_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELINPRO_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLinPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROCOD_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPRODSC_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROTIE_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HREPROTMX_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreProTmx_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMPRO_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENUMREC_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNumRec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRENH2O_"+sGXsfl_472_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNH2O_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRowL71874( )
   {
      nGXsfl_472_idx = (int)(nGXsfl_472_idx+1) ;
      sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
      subsflControlProps_4721874( ) ;
      edtavnRcdDeleted_1874_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_1874_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreLinPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRELINPRO_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROCOD_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPRODSC_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProTie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTIE_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreProTmx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HREPROTMX_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMPRO_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNumRec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENUMREC_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtHreNH2O_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "HRENH2O_"+sGXsfl_472_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         GXCCtl = "HRELINPRO_" + sGXsfl_472_idx ;
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
         GXCCtl = "HREPROTIE_" + sGXsfl_472_idx ;
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
         GXCCtl = "HREPROTMX_" + sGXsfl_472_idx ;
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
         GXCCtl = "HRENUMPRO_" + sGXsfl_472_idx ;
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
         GXCCtl = "HRENUMREC_" + sGXsfl_472_idx ;
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
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "HRENH2O_" + sGXsfl_472_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtHreNH2O_Internalname ;
         wbErr = true ;
         A10545HreNH2O = (short)(0) ;
      }
      else
      {
         A10545HreNH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtHreNH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z4550HreLinPro_" + sGXsfl_472_idx ;
      Z4550HreLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4551HreProCod_" + sGXsfl_472_idx ;
      Z4551HreProCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4552HreProDsc_" + sGXsfl_472_idx ;
      Z4552HreProDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4553HreProTie_" + sGXsfl_472_idx ;
      Z4553HreProTie = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4554HreProTmx_" + sGXsfl_472_idx ;
      Z4554HreProTmx = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4555HreNumPro_" + sGXsfl_472_idx ;
      Z4555HreNumPro = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4556HreNumRec_" + sGXsfl_472_idx ;
      Z4556HreNumRec = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10545HreNH2O_" + sGXsfl_472_idx ;
      Z10545HreNH2O = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1874_" + sGXsfl_472_idx ;
      nRcdDeleted_1874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1874_" + sGXsfl_472_idx ;
      nRcdExists_1874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1874_" + sGXsfl_472_idx ;
      nIsMod_1874 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtHreLinPro_Enabled = edtHreLinPro_Enabled ;
      defedtHreLinMaq_Enabled = edtHreLinMaq_Enabled ;
   }

   public void confirmValuesL70( )
   {
      nGXsfl_275_idx = 0 ;
      sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_275678( ) ;
      while ( nGXsfl_275_idx < nRC_GXsfl_275 )
      {
         nGXsfl_275_idx = (int)(nGXsfl_275_idx+1) ;
         sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_275678( ) ;
         httpContext.changePostValue( "Z4545HreLinMaq_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4545HreLinMaq_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4546HreMaqCod_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4546HreMaqCod_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4547HreVolPrd_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4547HreVolPrd_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4548HreFacAbs_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4548HreFacAbs_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4584HreFecPes_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4584HreFecPes_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4584HreFecPes_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4585HreMaqPes_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4585HreMaqPes_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4549HreULinPro_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4549HreULinPro_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4549HreULinPro_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z4863HreUsrCod_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4863HreUsrCod_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7814HReMaqNh_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7814HReMaqNh_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7814HReMaqNh_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7815HReMaqVX_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7815HReMaqVX_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7815HReMaqVX_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7816HReMaqBL_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7816HReMaqBL_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7816HReMaqBL_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7817HReMaqFlow_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7817HReMaqFlow_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7817HReMaqFlow_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7818HReMaqRPM_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7818HReMaqRPM_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7818HReMaqRPM_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7819HReMaqMol_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7819HReMaqMol_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7819HReMaqMol_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7820HReMaqTor_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7820HReMaqTor_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7820HReMaqTor_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7821HReMaqCla_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7821HReMaqCla_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7821HReMaqCla_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7822HReMaqTej_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7822HReMaqTej_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7822HReMaqTej_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7823HReMaqDel_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7823HReMaqDel_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7823HReMaqDel_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z7824HReMaqPML_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z7824HReMaqPML_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7824HReMaqPML_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z8602HreCosAA_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z8602HreCosAA_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8602HreCosAA_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z8603HrecosAd_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z8603HrecosAd_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8603HrecosAd_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z8604HreCosAnc_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z8604HreCosAnc_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8604HreCosAnc_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z8605HreCosCol_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z8605HreCosCol_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8605HreCosCol_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z8606HreCosPA_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z8606HreCosPA_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8606HreCosPA_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z8607HreCosPD_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z8607HreCosPD_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8607HreCosPD_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z9780HreLtsSb_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z9780HreLtsSb_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9780HreLtsSb_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z9781HreLtsRm_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z9781HreLtsRm_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9781HreLtsRm_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z9803HreAcaQ_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z9803HreAcaQ_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9803HreAcaQ_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z9804HreAcab_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z9804HreAcab_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9804HreAcab_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z1094HreNPrg_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z1094HreNPrg_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1094HreNPrg_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z697HreLotF_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z697HreLotF_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z697HreLotF_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z10381HreAnc_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z10381HreAnc_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10381HreAnc_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z10382HreGrm_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z10382HreGrm_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10382HreGrm_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z10383HreVel_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z10383HreVel_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10383HreVel_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z10384HreObs_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z10384HreObs_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10384HreObs_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z11508HreAva_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z11508HreAva_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11508HreAva_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z12126HreAs_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z12126HreAs_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12126HreAs_"+sGXsfl_275_idx) ;
         httpContext.changePostValue( "Z12127HreAi_"+sGXsfl_275_idx, httpContext.cgiGet( "ZT_"+"Z12127HreAi_"+sGXsfl_275_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12127HreAi_"+sGXsfl_275_idx) ;
      }
      nGXsfl_472_idx = 0 ;
      sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
      subsflControlProps_4721874( ) ;
      while ( nGXsfl_472_idx < nRC_GXsfl_472 )
      {
         nGXsfl_472_idx = (int)(nGXsfl_472_idx+1) ;
         sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
         subsflControlProps_4721874( ) ;
         httpContext.changePostValue( "Z4550HreLinPro_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4550HreLinPro_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4550HreLinPro_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z4551HreProCod_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4551HreProCod_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4551HreProCod_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z4552HreProDsc_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4552HreProDsc_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4552HreProDsc_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z4553HreProTie_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4553HreProTie_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4553HreProTie_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z4554HreProTmx_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4554HreProTmx_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4554HreProTmx_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z4555HreNumPro_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4555HreNumPro_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4555HreNumPro_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z4556HreNumRec_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z4556HreNumRec_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4556HreNumRec_"+sGXsfl_472_idx) ;
         httpContext.changePostValue( "Z10545HreNH2O_"+sGXsfl_472_idx, httpContext.cgiGet( "ZT_"+"Z10545HreNH2O_"+sGXsfl_472_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10545HreNH2O_"+sGXsfl_472_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thisrec", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THISREC");
      forbiddenHiddens.add("HreUser", GXutil.rtrim( localUtil.format( A13763HreUser, "")));
      forbiddenHiddens.add("HreDiaHora", localUtil.format( A13764HreDiaHora, "99/99/99 99:99"));
      forbiddenHiddens.add("HreCdn2", GXutil.rtrim( localUtil.format( A13765HreCdn2, "")));
      forbiddenHiddens.add("HreCtw", GXutil.rtrim( localUtil.format( A13766HreCtw, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thisrec:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8608HreNumColF", GXutil.ltrim( localUtil.ntoc( Z8608HreNumColF, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8610HreFamCodT", GXutil.ltrim( localUtil.ntoc( Z8610HreFamCodT, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8623HreHilasa", GXutil.rtrim( Z8623HreHilasa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8624HreEnsayo", GXutil.ltrim( localUtil.ntoc( Z8624HreEnsayo, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8625HreOpa", GXutil.rtrim( Z8625HreOpa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8626HreOpn", GXutil.ltrim( localUtil.ntoc( Z8626HreOpn, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11318HreDispCli", GXutil.rtrim( Z11318HreDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11320HreMacCod", GXutil.ltrim( localUtil.ntoc( Z11320HreMacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12264HreNInter", GXutil.ltrim( localUtil.ntoc( Z12264HreNInter, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12535HreCencId", GXutil.ltrim( localUtil.ntoc( Z12535HreCencId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12536HreCenDsc", GXutil.rtrim( Z12536HreCenDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13450HreComp1", GXutil.rtrim( Z13450HreComp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13451HreComp2", GXutil.rtrim( Z13451HreComp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13763HreUser", GXutil.rtrim( Z13763HreUser));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13764HreDiaHora", localUtil.ttoc( Z13764HreDiaHora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13765HreCdn2", GXutil.rtrim( Z13765HreCdn2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13766HreCtw", GXutil.rtrim( Z13766HreCtw));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_275", GXutil.ltrim( localUtil.ntoc( nGXsfl_275_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR_HI", GXutil.rtrim( A13842BarNhdr_Hi));
      app.GxWebStd.gx_hidden_field( httpContext, "HREUSER", GXutil.rtrim( A13763HreUser));
      app.GxWebStd.gx_hidden_field( httpContext, "HREDIAHORA", localUtil.ttoc( A13764HreDiaHora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECDN2", GXutil.rtrim( A13765HreCdn2));
      app.GxWebStd.gx_hidden_field( httpContext, "HRECTW", GXutil.rtrim( A13766HreCtw));
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
      return formatLink("app.thisrec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISREC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO RECETAS (HDR)", "") ;
   }

   public void initializeNonKeyL7675( )
   {
      A13842BarNhdr_Hi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13842BarNhdr_Hi", A13842BarNhdr_Hi);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
      A8608HreNumColF = 0 ;
      n8608HreNumColF = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8608HreNumColF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8608HreNumColF), 8, 0));
      A8610HreFamCodT = (short)(0) ;
      n8610HreFamCodT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8610HreFamCodT", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8610HreFamCodT), 4, 0));
      A8623HreHilasa = "" ;
      n8623HreHilasa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8623HreHilasa", A8623HreHilasa);
      A8624HreEnsayo = 0 ;
      n8624HreEnsayo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8624HreEnsayo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8624HreEnsayo), 8, 0));
      A8625HreOpa = "" ;
      n8625HreOpa = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8625HreOpa", A8625HreOpa);
      A8626HreOpn = (byte)(0) ;
      n8626HreOpn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8626HreOpn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8626HreOpn), 2, 0));
      A11318HreDispCli = "" ;
      n11318HreDispCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11318HreDispCli", A11318HreDispCli);
      A11320HreMacCod = 0 ;
      n11320HreMacCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A11320HreMacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11320HreMacCod), 8, 0));
      A12264HreNInter = 0 ;
      n12264HreNInter = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12264HreNInter", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12264HreNInter), 8, 0));
      A12535HreCencId = (short)(0) ;
      n12535HreCencId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12535HreCencId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12535HreCencId), 4, 0));
      A12536HreCenDsc = "" ;
      n12536HreCenDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12536HreCenDsc", A12536HreCenDsc);
      A13450HreComp1 = "" ;
      n13450HreComp1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13450HreComp1", A13450HreComp1);
      A13451HreComp2 = "" ;
      n13451HreComp2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13451HreComp2", A13451HreComp2);
      A13763HreUser = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13763HreUser", A13763HreUser);
      A13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A13764HreDiaHora", localUtil.ttoc( A13764HreDiaHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A13765HreCdn2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13765HreCdn2", A13765HreCdn2);
      A13766HreCtw = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13766HreCtw", A13766HreCtw);
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
      Z8608HreNumColF = 0 ;
      Z8610HreFamCodT = (short)(0) ;
      Z8623HreHilasa = "" ;
      Z8624HreEnsayo = 0 ;
      Z8625HreOpa = "" ;
      Z8626HreOpn = (byte)(0) ;
      Z11318HreDispCli = "" ;
      Z11320HreMacCod = 0 ;
      Z12264HreNInter = 0 ;
      Z12535HreCencId = (short)(0) ;
      Z12536HreCenDsc = "" ;
      Z13450HreComp1 = "" ;
      Z13451HreComp2 = "" ;
      Z13763HreUser = "" ;
      Z13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      Z13765HreCdn2 = "" ;
      Z13766HreCtw = "" ;
      Z252CliCod = 0 ;
   }

   public void initAllL7675( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4492HreBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      A4493HreBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      A4494HreBarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      A4495HreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      initializeNonKeyL7675( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyL7678( )
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
      A7814HReMaqNh = (short)(0) ;
      n7814HReMaqNh = false ;
      A7815HReMaqVX = (byte)(0) ;
      n7815HReMaqVX = false ;
      A7816HReMaqBL = (byte)(0) ;
      n7816HReMaqBL = false ;
      A7817HReMaqFlow = (byte)(0) ;
      n7817HReMaqFlow = false ;
      A7818HReMaqRPM = (short)(0) ;
      n7818HReMaqRPM = false ;
      A7819HReMaqMol = (short)(0) ;
      n7819HReMaqMol = false ;
      A7820HReMaqTor = (short)(0) ;
      n7820HReMaqTor = false ;
      A7821HReMaqCla = "" ;
      n7821HReMaqCla = false ;
      A7822HReMaqTej = (byte)(0) ;
      n7822HReMaqTej = false ;
      A7823HReMaqDel = (byte)(0) ;
      n7823HReMaqDel = false ;
      A7824HReMaqPML = (short)(0) ;
      n7824HReMaqPML = false ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      n8602HreCosAA = false ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      n8603HrecosAd = false ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      n8604HreCosAnc = false ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      n8605HreCosCol = false ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      n8606HreCosPA = false ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      n8607HreCosPD = false ;
      A9780HreLtsSb = 0 ;
      n9780HreLtsSb = false ;
      A9781HreLtsRm = 0 ;
      n9781HreLtsRm = false ;
      A9803HreAcaQ = "" ;
      n9803HreAcaQ = false ;
      A9804HreAcab = "" ;
      n9804HreAcab = false ;
      A1094HreNPrg = "" ;
      n1094HreNPrg = false ;
      A697HreLotF = "" ;
      n697HreLotF = false ;
      A10381HreAnc = (short)(0) ;
      n10381HreAnc = false ;
      A10382HreGrm = (short)(0) ;
      n10382HreGrm = false ;
      A10383HreVel = DecimalUtil.ZERO ;
      n10383HreVel = false ;
      A10384HreObs = "" ;
      n10384HreObs = false ;
      A11508HreAva = "" ;
      n11508HreAva = false ;
      A12126HreAs = "" ;
      n12126HreAs = false ;
      A12127HreAi = "" ;
      n12127HreAi = false ;
      Z4546HreMaqCod = "" ;
      Z4547HreVolPrd = 0 ;
      Z4548HreFacAbs = DecimalUtil.ZERO ;
      Z4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4585HreMaqPes = (byte)(0) ;
      Z4549HreULinPro = (byte)(0) ;
      Z4863HreUsrCod = "" ;
      Z7814HReMaqNh = (short)(0) ;
      Z7815HReMaqVX = (byte)(0) ;
      Z7816HReMaqBL = (byte)(0) ;
      Z7817HReMaqFlow = (byte)(0) ;
      Z7818HReMaqRPM = (short)(0) ;
      Z7819HReMaqMol = (short)(0) ;
      Z7820HReMaqTor = (short)(0) ;
      Z7821HReMaqCla = "" ;
      Z7822HReMaqTej = (byte)(0) ;
      Z7823HReMaqDel = (byte)(0) ;
      Z7824HReMaqPML = (short)(0) ;
      Z8602HreCosAA = DecimalUtil.ZERO ;
      Z8603HrecosAd = DecimalUtil.ZERO ;
      Z8604HreCosAnc = DecimalUtil.ZERO ;
      Z8605HreCosCol = DecimalUtil.ZERO ;
      Z8606HreCosPA = DecimalUtil.ZERO ;
      Z8607HreCosPD = DecimalUtil.ZERO ;
      Z9780HreLtsSb = 0 ;
      Z9781HreLtsRm = 0 ;
      Z9803HreAcaQ = "" ;
      Z9804HreAcab = "" ;
      Z1094HreNPrg = "" ;
      Z697HreLotF = "" ;
      Z10381HreAnc = (short)(0) ;
      Z10382HreGrm = (short)(0) ;
      Z10383HreVel = DecimalUtil.ZERO ;
      Z10384HreObs = "" ;
      Z11508HreAva = "" ;
      Z12126HreAs = "" ;
      Z12127HreAi = "" ;
   }

   public void initAllL7678( )
   {
      A4545HreLinMaq = (short)(0) ;
      initializeNonKeyL7678( ) ;
   }

   public void standaloneModalInsertL7678( )
   {
   }

   public void initializeNonKeyL71874( )
   {
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      A4553HreProTie = (short)(0) ;
      A4554HreProTmx = (short)(0) ;
      A4555HreNumPro = 0 ;
      A4556HreNumRec = 0 ;
      A10545HreNH2O = (short)(0) ;
      Z4551HreProCod = "" ;
      Z4552HreProDsc = "" ;
      Z4553HreProTie = (short)(0) ;
      Z4554HreProTmx = (short)(0) ;
      Z4555HreNumPro = 0 ;
      Z4556HreNumRec = 0 ;
      Z10545HreNH2O = (short)(0) ;
   }

   public void initAllL71874( )
   {
      A4550HreLinPro = (byte)(0) ;
      initializeNonKeyL71874( ) ;
   }

   public void standaloneModalInsertL71874( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241522558", true, true);
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
      httpContext.AddJavascriptSource("thisrec.js", "?20268241522558", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties678( )
   {
      edtHreLinMaq_Enabled = defedtHreLinMaq_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Enabled), 5, 0), !bGXsfl_275_Refreshing);
   }

   public void init_level_properties1874( )
   {
      edtHreLinPro_Enabled = defedtHreLinPro_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinPro_Enabled), 5, 0), !bGXsfl_472_Refreshing);
   }

   public void startgridcontrol275( )
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
      Grid1Column.AddObjectProperty("Value", lblTextblock52_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock54_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock55_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock56_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock57_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock58_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock59_Caption);
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
      Grid1Column.AddObjectProperty("Value", lblTextblock60_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7814HReMaqNh, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqNh_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7815HReMaqVX, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqVX_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7816HReMaqBL, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqBL_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7817HReMaqFlow, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqFlow_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7818HReMaqRPM, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqRPM_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7819HReMaqMol, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqMol_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7820HReMaqTor, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A7821HReMaqCla));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqCla_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7822HReMaqTej, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqTej_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7823HReMaqDel, (byte)(1), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqDel_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7824HReMaqPML, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHReMaqPML_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock71_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock72_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHrecosAd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock73_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock74_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock75_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPA_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock76_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreCosPD_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock77_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9780HreLtsSb, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsSb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock78_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9781HreLtsRm, (byte)(5), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLtsRm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock79_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9803HreAcaQ));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcaQ_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock80_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A9804HreAcab));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock81_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A1094HreNPrg));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNPrg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock82_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A697HreLotF));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreLotF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock83_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10381HreAnc, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAnc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock84_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10382HreGrm, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreGrm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock85_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10383HreVel, (byte)(6), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreVel_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock86_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", A10384HreObs);
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock87_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11508HreAva));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAva_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock88_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12126HreAs));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock89_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A12127HreAi));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreAi_Enabled, (byte)(5), (byte)(0), ".", "")));
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

   public void startgridcontrol472( )
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
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10545HreNH2O, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtHreNH2O_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtHreNumColF_Internalname = "HRENUMCOLF" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtHreFamCodT_Internalname = "HREFAMCODT" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtHreHilasa_Internalname = "HREHILASA" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtHreEnsayo_Internalname = "HREENSAYO" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtHreOpa_Internalname = "HREOPA" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtHreOpn_Internalname = "HREOPN" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtHreDispCli_Internalname = "HREDISPCLI" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtHreMacCod_Internalname = "HREMACCOD" ;
      lblTextblock47_Internalname = "TEXTBLOCK47" ;
      edtHreNInter_Internalname = "HRENINTER" ;
      lblTextblock48_Internalname = "TEXTBLOCK48" ;
      edtHreCencId_Internalname = "HRECENCID" ;
      lblTextblock49_Internalname = "TEXTBLOCK49" ;
      edtHreCenDsc_Internalname = "HRECENDSC" ;
      lblTextblock50_Internalname = "TEXTBLOCK50" ;
      edtHreComp1_Internalname = "HRECOMP1" ;
      lblTextblock51_Internalname = "TEXTBLOCK51" ;
      edtHreComp2_Internalname = "HRECOMP2" ;
      lblTextblock52_Internalname = "TEXTBLOCK52" ;
      edtHreLinMaq_Internalname = "HRELINMAQ" ;
      lblTextblock53_Internalname = "TEXTBLOCK53" ;
      edtHreMaqCod_Internalname = "HREMAQCOD" ;
      lblTextblock54_Internalname = "TEXTBLOCK54" ;
      edtHreVolPrd_Internalname = "HREVOLPRD" ;
      lblTextblock55_Internalname = "TEXTBLOCK55" ;
      edtHreFacAbs_Internalname = "HREFACABS" ;
      lblTextblock56_Internalname = "TEXTBLOCK56" ;
      edtHreFecPes_Internalname = "HREFECPES" ;
      lblTextblock57_Internalname = "TEXTBLOCK57" ;
      edtHreMaqPes_Internalname = "HREMAQPES" ;
      lblTextblock58_Internalname = "TEXTBLOCK58" ;
      edtHreULinPro_Internalname = "HREULINPRO" ;
      lblTextblock59_Internalname = "TEXTBLOCK59" ;
      edtHreUsrCod_Internalname = "HREUSRCOD" ;
      lblTextblock60_Internalname = "TEXTBLOCK60" ;
      edtHReMaqNh_Internalname = "HREMAQNH" ;
      lblTextblock61_Internalname = "TEXTBLOCK61" ;
      edtHReMaqVX_Internalname = "HREMAQVX" ;
      lblTextblock62_Internalname = "TEXTBLOCK62" ;
      edtHReMaqBL_Internalname = "HREMAQBL" ;
      lblTextblock63_Internalname = "TEXTBLOCK63" ;
      edtHReMaqFlow_Internalname = "HREMAQFLOW" ;
      lblTextblock64_Internalname = "TEXTBLOCK64" ;
      edtHReMaqRPM_Internalname = "HREMAQRPM" ;
      lblTextblock65_Internalname = "TEXTBLOCK65" ;
      edtHReMaqMol_Internalname = "HREMAQMOL" ;
      lblTextblock66_Internalname = "TEXTBLOCK66" ;
      edtHReMaqTor_Internalname = "HREMAQTOR" ;
      lblTextblock67_Internalname = "TEXTBLOCK67" ;
      edtHReMaqCla_Internalname = "HREMAQCLA" ;
      lblTextblock68_Internalname = "TEXTBLOCK68" ;
      edtHReMaqTej_Internalname = "HREMAQTEJ" ;
      lblTextblock69_Internalname = "TEXTBLOCK69" ;
      edtHReMaqDel_Internalname = "HREMAQDEL" ;
      lblTextblock70_Internalname = "TEXTBLOCK70" ;
      edtHReMaqPML_Internalname = "HREMAQPML" ;
      lblTextblock71_Internalname = "TEXTBLOCK71" ;
      edtHreCosAA_Internalname = "HRECOSAA" ;
      lblTextblock72_Internalname = "TEXTBLOCK72" ;
      edtHrecosAd_Internalname = "HRECOSAD" ;
      lblTextblock73_Internalname = "TEXTBLOCK73" ;
      edtHreCosAnc_Internalname = "HRECOSANC" ;
      lblTextblock74_Internalname = "TEXTBLOCK74" ;
      edtHreCosCol_Internalname = "HRECOSCOL" ;
      lblTextblock75_Internalname = "TEXTBLOCK75" ;
      edtHreCosPA_Internalname = "HRECOSPA" ;
      lblTextblock76_Internalname = "TEXTBLOCK76" ;
      edtHreCosPD_Internalname = "HRECOSPD" ;
      lblTextblock77_Internalname = "TEXTBLOCK77" ;
      edtHreLtsSb_Internalname = "HRELTSSB" ;
      lblTextblock78_Internalname = "TEXTBLOCK78" ;
      edtHreLtsRm_Internalname = "HRELTSRM" ;
      lblTextblock79_Internalname = "TEXTBLOCK79" ;
      edtHreAcaQ_Internalname = "HREACAQ" ;
      lblTextblock80_Internalname = "TEXTBLOCK80" ;
      edtHreAcab_Internalname = "HREACAB" ;
      lblTextblock81_Internalname = "TEXTBLOCK81" ;
      edtHreNPrg_Internalname = "HRENPRG" ;
      lblTextblock82_Internalname = "TEXTBLOCK82" ;
      edtHreLotF_Internalname = "HRELOTF" ;
      lblTextblock83_Internalname = "TEXTBLOCK83" ;
      edtHreAnc_Internalname = "HREANC" ;
      lblTextblock84_Internalname = "TEXTBLOCK84" ;
      edtHreGrm_Internalname = "HREGRM" ;
      lblTextblock85_Internalname = "TEXTBLOCK85" ;
      edtHreVel_Internalname = "HREVEL" ;
      lblTextblock86_Internalname = "TEXTBLOCK86" ;
      edtHreObs_Internalname = "HREOBS" ;
      lblTextblock87_Internalname = "TEXTBLOCK87" ;
      edtHreAva_Internalname = "HREAVA" ;
      lblTextblock88_Internalname = "TEXTBLOCK88" ;
      edtHreAs_Internalname = "HREAS" ;
      lblTextblock89_Internalname = "TEXTBLOCK89" ;
      edtHreAi_Internalname = "HREAI" ;
      edtavnRcdDeleted_1874_Internalname = "vNRCDDELETED_1874" ;
      edtHreLinPro_Internalname = "HRELINPRO" ;
      edtHreProCod_Internalname = "HREPROCOD" ;
      edtHreProDsc_Internalname = "HREPRODSC" ;
      edtHreProTie_Internalname = "HREPROTIE" ;
      edtHreProTmx_Internalname = "HREPROTMX" ;
      edtHreNumPro_Internalname = "HRENUMPRO" ;
      edtHreNumRec_Internalname = "HRENUMREC" ;
      edtHreNH2O_Internalname = "HRENH2O" ;
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
      lblTextblock89_Caption = httpContext.getMessage( "AI", "") ;
      lblTextblock88_Caption = httpContext.getMessage( "AS", "") ;
      lblTextblock87_Caption = httpContext.getMessage( "Avanza", "") ;
      lblTextblock86_Caption = httpContext.getMessage( "Obs Carvema", "") ;
      lblTextblock85_Caption = httpContext.getMessage( "Vel Carvema", "") ;
      lblTextblock84_Caption = httpContext.getMessage( "Grrm Carvema", "") ;
      lblTextblock83_Caption = httpContext.getMessage( "Ancho Carvema", "") ;
      lblTextblock82_Caption = httpContext.getMessage( "Lote de Hilado", "") ;
      lblTextblock81_Caption = httpContext.getMessage( "N Programa", "") ;
      lblTextblock80_Caption = httpContext.getMessage( "Receta Acabado?", "") ;
      lblTextblock79_Caption = httpContext.getMessage( "Proceso Acab Quimico", "") ;
      lblTextblock78_Caption = httpContext.getMessage( "Lts Remante", "") ;
      lblTextblock77_Caption = httpContext.getMessage( "Lts Sobrantes", "") ;
      lblTextblock76_Caption = httpContext.getMessage( "HreCosPD", "") ;
      lblTextblock75_Caption = httpContext.getMessage( "HreCosPA", "") ;
      lblTextblock74_Caption = httpContext.getMessage( "HreCosCol", "") ;
      lblTextblock73_Caption = httpContext.getMessage( "HreCosAnc", "") ;
      lblTextblock72_Caption = httpContext.getMessage( "HrecosAd", "") ;
      lblTextblock71_Caption = httpContext.getMessage( "HreCosAA", "") ;
      lblTextblock70_Caption = httpContext.getMessage( "HReMaqPML", "") ;
      lblTextblock69_Caption = httpContext.getMessage( "HReMaqDel", "") ;
      lblTextblock68_Caption = httpContext.getMessage( "HReMaqTej", "") ;
      lblTextblock67_Caption = httpContext.getMessage( "HReMaqCla", "") ;
      lblTextblock66_Caption = httpContext.getMessage( "HReMaqTor", "") ;
      lblTextblock65_Caption = httpContext.getMessage( "HReMaqMol", "") ;
      lblTextblock64_Caption = httpContext.getMessage( "HReMaqRPM", "") ;
      lblTextblock63_Caption = httpContext.getMessage( "HReMaqFlow", "") ;
      lblTextblock62_Caption = httpContext.getMessage( "HReMaqBL", "") ;
      lblTextblock61_Caption = httpContext.getMessage( "HReMaqVX", "") ;
      lblTextblock60_Caption = httpContext.getMessage( "HReMaqNh", "") ;
      lblTextblock59_Caption = httpContext.getMessage( "Usuario creo receta", "") ;
      lblTextblock58_Caption = httpContext.getMessage( "Ul.Lin.Proceso Rec.Hist.Receta", "") ;
      lblTextblock57_Caption = httpContext.getMessage( "Maquina Pesada", "") ;
      lblTextblock56_Caption = httpContext.getMessage( "Fecha Hora Pesaje", "") ;
      lblTextblock55_Caption = httpContext.getMessage( "Factor Abs.Hist.Receta", "") ;
      lblTextblock54_Caption = httpContext.getMessage( "Volumen Maq. Hist.Receta", "") ;
      lblTextblock35_Caption = httpContext.getMessage( "Maquina Hdr. Hist.Receta", "") ;
      lblTextblock52_Caption = httpContext.getMessage( "Linea Maquina. Hist.Receta", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "HISTORICO RECETAS (HDR)", "") );
      edtHreNH2O_Jsonclick = "" ;
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
      edtHreAi_Jsonclick = "" ;
      edtHreAs_Jsonclick = "" ;
      edtHreAva_Jsonclick = "" ;
      edtHreVel_Jsonclick = "" ;
      edtHreGrm_Jsonclick = "" ;
      edtHreAnc_Jsonclick = "" ;
      edtHreLotF_Jsonclick = "" ;
      edtHreNPrg_Jsonclick = "" ;
      edtHreAcab_Jsonclick = "" ;
      edtHreAcaQ_Jsonclick = "" ;
      edtHreLtsRm_Jsonclick = "" ;
      edtHreLtsSb_Jsonclick = "" ;
      edtHreCosPD_Jsonclick = "" ;
      edtHreCosPA_Jsonclick = "" ;
      edtHreCosCol_Jsonclick = "" ;
      edtHreCosAnc_Jsonclick = "" ;
      edtHrecosAd_Jsonclick = "" ;
      edtHreCosAA_Jsonclick = "" ;
      edtHReMaqPML_Jsonclick = "" ;
      edtHReMaqDel_Jsonclick = "" ;
      edtHReMaqTej_Jsonclick = "" ;
      edtHReMaqCla_Jsonclick = "" ;
      edtHReMaqTor_Jsonclick = "" ;
      edtHReMaqMol_Jsonclick = "" ;
      edtHReMaqRPM_Jsonclick = "" ;
      edtHReMaqFlow_Jsonclick = "" ;
      edtHReMaqBL_Jsonclick = "" ;
      edtHReMaqVX_Jsonclick = "" ;
      edtHReMaqNh_Jsonclick = "" ;
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
      edtHreNH2O_Enabled = 1 ;
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
      edtHreAi_Enabled = 1 ;
      edtHreAs_Enabled = 1 ;
      edtHreAva_Enabled = 1 ;
      edtHreObs_Enabled = 1 ;
      edtHreVel_Enabled = 1 ;
      edtHreGrm_Enabled = 1 ;
      edtHreAnc_Enabled = 1 ;
      edtHreLotF_Enabled = 1 ;
      edtHreNPrg_Enabled = 1 ;
      edtHreAcab_Enabled = 1 ;
      edtHreAcaQ_Enabled = 1 ;
      edtHreLtsRm_Enabled = 1 ;
      edtHreLtsSb_Enabled = 1 ;
      edtHreCosPD_Enabled = 1 ;
      edtHreCosPA_Enabled = 1 ;
      edtHreCosCol_Enabled = 1 ;
      edtHreCosAnc_Enabled = 1 ;
      edtHrecosAd_Enabled = 1 ;
      edtHreCosAA_Enabled = 1 ;
      edtHReMaqPML_Enabled = 1 ;
      edtHReMaqDel_Enabled = 1 ;
      edtHReMaqTej_Enabled = 1 ;
      edtHReMaqCla_Enabled = 1 ;
      edtHReMaqTor_Enabled = 1 ;
      edtHReMaqMol_Enabled = 1 ;
      edtHReMaqRPM_Enabled = 1 ;
      edtHReMaqFlow_Enabled = 1 ;
      edtHReMaqBL_Enabled = 1 ;
      edtHReMaqVX_Enabled = 1 ;
      edtHReMaqNh_Enabled = 1 ;
      edtHreUsrCod_Enabled = 1 ;
      edtHreULinPro_Enabled = 1 ;
      edtHreMaqPes_Enabled = 1 ;
      edtHreFecPes_Enabled = 1 ;
      edtHreFacAbs_Enabled = 1 ;
      edtHreVolPrd_Enabled = 1 ;
      edtHreMaqCod_Enabled = 1 ;
      edtHreLinMaq_Enabled = 1 ;
      edtHreComp2_Jsonclick = "" ;
      edtHreComp2_Backcolor = (int)(0xFFFFFF) ;
      edtHreComp2_Enabled = 1 ;
      edtHreComp1_Jsonclick = "" ;
      edtHreComp1_Backcolor = (int)(0xFFFFFF) ;
      edtHreComp1_Enabled = 1 ;
      edtHreCenDsc_Jsonclick = "" ;
      edtHreCenDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHreCenDsc_Enabled = 1 ;
      edtHreCencId_Jsonclick = "" ;
      edtHreCencId_Backcolor = (int)(0xFFFFFF) ;
      edtHreCencId_Enabled = 1 ;
      edtHreNInter_Jsonclick = "" ;
      edtHreNInter_Backcolor = (int)(0xFFFFFF) ;
      edtHreNInter_Enabled = 1 ;
      edtHreMacCod_Jsonclick = "" ;
      edtHreMacCod_Backcolor = (int)(0xFFFFFF) ;
      edtHreMacCod_Enabled = 1 ;
      edtHreDispCli_Jsonclick = "" ;
      edtHreDispCli_Backcolor = (int)(0xFFFFFF) ;
      edtHreDispCli_Enabled = 1 ;
      edtHreOpn_Jsonclick = "" ;
      edtHreOpn_Backcolor = (int)(0xFFFFFF) ;
      edtHreOpn_Enabled = 1 ;
      edtHreOpa_Jsonclick = "" ;
      edtHreOpa_Backcolor = (int)(0xFFFFFF) ;
      edtHreOpa_Enabled = 1 ;
      edtHreEnsayo_Jsonclick = "" ;
      edtHreEnsayo_Backcolor = (int)(0xFFFFFF) ;
      edtHreEnsayo_Enabled = 1 ;
      edtHreHilasa_Jsonclick = "" ;
      edtHreHilasa_Backcolor = (int)(0xFFFFFF) ;
      edtHreHilasa_Enabled = 1 ;
      edtHreFamCodT_Jsonclick = "" ;
      edtHreFamCodT_Backcolor = (int)(0xFFFFFF) ;
      edtHreFamCodT_Enabled = 1 ;
      edtHreNumColF_Jsonclick = "" ;
      edtHreNumColF_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumColF_Enabled = 1 ;
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
      edtEmprCod_Enabled = 1 ;
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
      subsflControlProps_275678( ) ;
      while ( nGXsfl_275_idx <= nRC_GXsfl_275 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalL7678( ) ;
         standaloneModalL7678( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowL7678( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_275_idx = (int)(nGXsfl_275_idx+1) ;
         sGXsfl_275_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_275_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_275678( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_4721874( ) ;
      while ( nGXsfl_472_idx <= nRC_GXsfl_472 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalL7678( ) ;
         standaloneModalL7678( ) ;
         standaloneNotModalL71874( ) ;
         standaloneModalL71874( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowL71874( ) ;
         nGXsfl_472_idx = (int)(nGXsfl_472_idx+1) ;
         sGXsfl_472_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_472_idx), 4, 0), (short)(4), "0") + sGXsfl_275_idx ;
         subsflControlProps_4721874( ) ;
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
      /* Using cursor T00L719 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00L719_A407EmprNom[0] ;
      n407EmprNom = T00L719_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(17);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T00L719 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00L719_A407EmprNom[0] ;
      n407EmprNom = T00L719_n407EmprNom[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Hrenumcie( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      httpContext.ajax_rsp_assign_attri("", false, "A8608HreNumColF", GXutil.ltrim( localUtil.ntoc( A8608HreNumColF, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8610HreFamCodT", GXutil.ltrim( localUtil.ntoc( A8610HreFamCodT, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8623HreHilasa", GXutil.rtrim( A8623HreHilasa));
      httpContext.ajax_rsp_assign_attri("", false, "A8624HreEnsayo", GXutil.ltrim( localUtil.ntoc( A8624HreEnsayo, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8625HreOpa", GXutil.rtrim( A8625HreOpa));
      httpContext.ajax_rsp_assign_attri("", false, "A8626HreOpn", GXutil.ltrim( localUtil.ntoc( A8626HreOpn, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11318HreDispCli", GXutil.rtrim( A11318HreDispCli));
      httpContext.ajax_rsp_assign_attri("", false, "A11320HreMacCod", GXutil.ltrim( localUtil.ntoc( A11320HreMacCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12264HreNInter", GXutil.ltrim( localUtil.ntoc( A12264HreNInter, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12535HreCencId", GXutil.ltrim( localUtil.ntoc( A12535HreCencId, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12536HreCenDsc", GXutil.rtrim( A12536HreCenDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13450HreComp1", GXutil.rtrim( A13450HreComp1));
      httpContext.ajax_rsp_assign_attri("", false, "A13451HreComp2", GXutil.rtrim( A13451HreComp2));
      httpContext.ajax_rsp_assign_attri("", false, "A13763HreUser", GXutil.rtrim( A13763HreUser));
      httpContext.ajax_rsp_assign_attri("", false, "A13764HreDiaHora", localUtil.ttoc( A13764HreDiaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A13765HreCdn2", GXutil.rtrim( A13765HreCdn2));
      httpContext.ajax_rsp_assign_attri("", false, "A13766HreCtw", GXutil.rtrim( A13766HreCtw));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13842BarNhdr_Hi", GXutil.rtrim( A13842BarNhdr_Hi));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z8608HreNumColF", GXutil.ltrim( localUtil.ntoc( Z8608HreNumColF, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8610HreFamCodT", GXutil.ltrim( localUtil.ntoc( Z8610HreFamCodT, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8623HreHilasa", GXutil.rtrim( Z8623HreHilasa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8624HreEnsayo", GXutil.ltrim( localUtil.ntoc( Z8624HreEnsayo, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8625HreOpa", GXutil.rtrim( Z8625HreOpa));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8626HreOpn", GXutil.ltrim( localUtil.ntoc( Z8626HreOpn, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11318HreDispCli", GXutil.rtrim( Z11318HreDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11320HreMacCod", GXutil.ltrim( localUtil.ntoc( Z11320HreMacCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12264HreNInter", GXutil.ltrim( localUtil.ntoc( Z12264HreNInter, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12535HreCencId", GXutil.ltrim( localUtil.ntoc( Z12535HreCencId, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12536HreCenDsc", GXutil.rtrim( Z12536HreCenDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13450HreComp1", GXutil.rtrim( Z13450HreComp1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13451HreComp2", GXutil.rtrim( Z13451HreComp2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13763HreUser", GXutil.rtrim( Z13763HreUser));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13764HreDiaHora", localUtil.ttoc( Z13764HreDiaHora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13765HreCdn2", GXutil.rtrim( Z13765HreCdn2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13766HreCtw", GXutil.rtrim( Z13766HreCtw));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13842BarNhdr_Hi", GXutil.rtrim( Z13842BarNhdr_Hi));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Clicod( )
   {
      n252CliCod = false ;
      /* Using cursor T00L720 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A279CliNom = T00L720_A279CliNom[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A13763HreUser',fld:'HREUSER',pic:''},{av:'A13764HreDiaHora',fld:'HREDIAHORA',pic:'99/99/99 99:99'},{av:'A13765HreCdn2',fld:'HRECDN2',pic:''},{av:'A13766HreCtw',fld:'HRECTW',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_HREBARCOD","{handler:'valid_Hrebarcod',iparms:[]");
      setEventMetadata("VALID_HREBARCOD",",oparms:[]}");
      setEventMetadata("VALID_HREBARREO","{handler:'valid_Hrebarreo',iparms:[]");
      setEventMetadata("VALID_HREBARREO",",oparms:[]}");
      setEventMetadata("VALID_HREBARPAR","{handler:'valid_Hrebarpar',iparms:[]");
      setEventMetadata("VALID_HREBARPAR",",oparms:[]}");
      setEventMetadata("VALID_HRENUMCIE","{handler:'valid_Hrenumcie',iparms:[{av:'A13766HreCtw',fld:'HRECTW',pic:''},{av:'A13765HreCdn2',fld:'HRECDN2',pic:''},{av:'A13764HreDiaHora',fld:'HREDIAHORA',pic:'99/99/99 99:99'},{av:'A13763HreUser',fld:'HREUSER',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HRENUMCIE",",oparms:[{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4523HreColNomC',fld:'HRECOLNOMC',pic:''},{av:'A4524HreColNumC',fld:'HRECOLNUMC',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4527HreFecGen',fld:'HREFECGEN',pic:''},{av:'A4528HreFecCli',fld:'HREFECCLI',pic:''},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4530HreFecFpr',fld:'HREFECFPR',pic:''},{av:'A4531HreBarMat',fld:'HREBARMAT',pic:''},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4533HreBarMtr',fld:'HREBARMTR',pic:'ZZZZZ9.99'},{av:'A4534HreBarPie',fld:'HREBARPIE',pic:'ZZZ9'},{av:'A4535HrePartCod',fld:'HREPARTCOD',pic:''},{av:'A4536HreBarNMtr',fld:'HREBARNMTR',pic:''},{av:'A4537HreBarNMez',fld:'HREBARNMEZ',pic:''},{av:'A4538HreNumTen',fld:'HRENUMTEN',pic:''},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A4541HreNumTon',fld:'HRENUMTON',pic:''},{av:'A4496HreMaqHdr',fld:'HREMAQHDR',pic:''},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A4543HreTotMtr',fld:'HRETOTMTR',pic:'ZZZZZ9.99'},{av:'A4544HreTotPie',fld:'HRETOTPIE',pic:'ZZZ9'},{av:'A8608HreNumColF',fld:'HRENUMCOLF',pic:'ZZZZZZZ9'},{av:'A8610HreFamCodT',fld:'HREFAMCODT',pic:'ZZZ9'},{av:'A8623HreHilasa',fld:'HREHILASA',pic:''},{av:'A8624HreEnsayo',fld:'HREENSAYO',pic:'ZZZZZZZ9'},{av:'A8625HreOpa',fld:'HREOPA',pic:'@!'},{av:'A8626HreOpn',fld:'HREOPN',pic:'Z9'},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A11320HreMacCod',fld:'HREMACCOD',pic:'ZZZZZZZ9'},{av:'A12264HreNInter',fld:'HRENINTER',pic:'ZZZZZZZ9'},{av:'A12535HreCencId',fld:'HRECENCID',pic:'ZZZ9'},{av:'A12536HreCenDsc',fld:'HRECENDSC',pic:''},{av:'A13450HreComp1',fld:'HRECOMP1',pic:''},{av:'A13451HreComp2',fld:'HRECOMP2',pic:''},{av:'A13763HreUser',fld:'HREUSER',pic:''},{av:'A13764HreDiaHora',fld:'HREDIAHORA',pic:'99/99/99 99:99'},{av:'A13765HreCdn2',fld:'HRECDN2',pic:''},{av:'A13766HreCtw',fld:'HRECTW',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4516HreDisCli'},{av:'Z252CliCod'},{av:'Z4517HreBarSer'},{av:'Z4518HreBarDsc'},{av:'Z4519HreTipArt'},{av:'Z4520HreTipArtD'},{av:'Z4521HreColNom'},{av:'Z4522HreColNum'},{av:'Z4523HreColNomC'},{av:'Z4524HreColNumC'},{av:'Z4525HreTipCol'},{av:'Z4526HreTipColN'},{av:'Z4527HreFecGen'},{av:'Z4528HreFecCli'},{av:'Z4529HreFecTin'},{av:'Z4530HreFecFpr'},{av:'Z4531HreBarMat'},{av:'Z4532HreBarKgm'},{av:'Z4533HreBarMtr'},{av:'Z4534HreBarPie'},{av:'Z4535HrePartCod'},{av:'Z4536HreBarNMtr'},{av:'Z4537HreBarNMez'},{av:'Z4538HreNumTen'},{av:'Z4539HreIntCod'},{av:'Z4540HreIntDsc'},{av:'Z4541HreNumTon'},{av:'Z4496HreMaqHdr'},{av:'Z4542HreTotKgm'},{av:'Z4543HreTotMtr'},{av:'Z4544HreTotPie'},{av:'Z8608HreNumColF'},{av:'Z8610HreFamCodT'},{av:'Z8623HreHilasa'},{av:'Z8624HreEnsayo'},{av:'Z8625HreOpa'},{av:'Z8626HreOpn'},{av:'Z11318HreDispCli'},{av:'Z11320HreMacCod'},{av:'Z12264HreNInter'},{av:'Z12535HreCencId'},{av:'Z12536HreCenDsc'},{av:'Z13450HreComp1'},{av:'Z13451HreComp2'},{av:'Z13763HreUser'},{av:'Z13764HreDiaHora'},{av:'Z13765HreCdn2'},{av:'Z13766HreCtw'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z13842BarNhdr_Hi'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_HRELINMAQ","{handler:'valid_Hrelinmaq',iparms:[]");
      setEventMetadata("VALID_HRELINMAQ",",oparms:[]}");
      setEventMetadata("VALID_HREMAQPES","{handler:'valid_Hremaqpes',iparms:[]");
      setEventMetadata("VALID_HREMAQPES",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hreai',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_HRELINPRO","{handler:'valid_Hrelinpro',iparms:[]");
      setEventMetadata("VALID_HRELINPRO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Hrenh2o',iparms:[]");
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
      pr_default.close(17);
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
      Z8623HreHilasa = "" ;
      Z8625HreOpa = "" ;
      Z11318HreDispCli = "" ;
      Z12536HreCenDsc = "" ;
      Z13450HreComp1 = "" ;
      Z13451HreComp2 = "" ;
      Z13763HreUser = "" ;
      Z13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      Z13765HreCdn2 = "" ;
      Z13766HreCtw = "" ;
      Z4546HreMaqCod = "" ;
      Z4548HreFacAbs = DecimalUtil.ZERO ;
      Z4584HreFecPes = GXutil.resetTime( GXutil.nullDate() );
      Z4863HreUsrCod = "" ;
      Z7821HReMaqCla = "" ;
      Z8602HreCosAA = DecimalUtil.ZERO ;
      Z8603HrecosAd = DecimalUtil.ZERO ;
      Z8604HreCosAnc = DecimalUtil.ZERO ;
      Z8605HreCosCol = DecimalUtil.ZERO ;
      Z8606HreCosPA = DecimalUtil.ZERO ;
      Z8607HreCosPD = DecimalUtil.ZERO ;
      Z9803HreAcaQ = "" ;
      Z9804HreAcab = "" ;
      Z1094HreNPrg = "" ;
      Z697HreLotF = "" ;
      Z10383HreVel = DecimalUtil.ZERO ;
      Z10384HreObs = "" ;
      Z11508HreAva = "" ;
      Z12126HreAs = "" ;
      Z12127HreAi = "" ;
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
      A8623HreHilasa = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      A8625HreOpa = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      A11318HreDispCli = "" ;
      lblTextblock46_Jsonclick = "" ;
      lblTextblock47_Jsonclick = "" ;
      lblTextblock48_Jsonclick = "" ;
      lblTextblock49_Jsonclick = "" ;
      A12536HreCenDsc = "" ;
      lblTextblock50_Jsonclick = "" ;
      A13450HreComp1 = "" ;
      lblTextblock51_Jsonclick = "" ;
      A13451HreComp2 = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode678 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13763HreUser = "" ;
      A13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      A13765HreCdn2 = "" ;
      A13766HreCtw = "" ;
      A13842BarNhdr_Hi = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
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
      A7821HReMaqCla = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A9803HreAcaQ = "" ;
      A9804HreAcab = "" ;
      A1094HreNPrg = "" ;
      A697HreLotF = "" ;
      A10383HreVel = DecimalUtil.ZERO ;
      A10384HreObs = "" ;
      A11508HreAva = "" ;
      A12126HreAs = "" ;
      A12127HreAi = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      T00L710_A4492HreBarCod = new int[1] ;
      T00L710_A4493HreBarReo = new byte[1] ;
      T00L710_A4494HreBarPar = new String[] {""} ;
      T00L710_A4495HreNumCie = new byte[1] ;
      T00L710_A407EmprNom = new String[] {""} ;
      T00L710_n407EmprNom = new boolean[] {false} ;
      T00L710_A4516HreDisCli = new String[] {""} ;
      T00L710_n4516HreDisCli = new boolean[] {false} ;
      T00L710_A279CliNom = new String[] {""} ;
      T00L710_A4517HreBarSer = new String[] {""} ;
      T00L710_n4517HreBarSer = new boolean[] {false} ;
      T00L710_A4518HreBarDsc = new String[] {""} ;
      T00L710_n4518HreBarDsc = new boolean[] {false} ;
      T00L710_A4519HreTipArt = new short[1] ;
      T00L710_n4519HreTipArt = new boolean[] {false} ;
      T00L710_A4520HreTipArtD = new String[] {""} ;
      T00L710_n4520HreTipArtD = new boolean[] {false} ;
      T00L710_A4521HreColNom = new String[] {""} ;
      T00L710_n4521HreColNom = new boolean[] {false} ;
      T00L710_A4522HreColNum = new int[1] ;
      T00L710_n4522HreColNum = new boolean[] {false} ;
      T00L710_A4523HreColNomC = new String[] {""} ;
      T00L710_n4523HreColNomC = new boolean[] {false} ;
      T00L710_A4524HreColNumC = new int[1] ;
      T00L710_n4524HreColNumC = new boolean[] {false} ;
      T00L710_A4525HreTipCol = new byte[1] ;
      T00L710_n4525HreTipCol = new boolean[] {false} ;
      T00L710_A4526HreTipColN = new String[] {""} ;
      T00L710_n4526HreTipColN = new boolean[] {false} ;
      T00L710_A4527HreFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T00L710_n4527HreFecGen = new boolean[] {false} ;
      T00L710_A4528HreFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00L710_n4528HreFecCli = new boolean[] {false} ;
      T00L710_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00L710_n4529HreFecTin = new boolean[] {false} ;
      T00L710_A4530HreFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      T00L710_n4530HreFecFpr = new boolean[] {false} ;
      T00L710_A4531HreBarMat = new String[] {""} ;
      T00L710_n4531HreBarMat = new boolean[] {false} ;
      T00L710_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L710_n4532HreBarKgm = new boolean[] {false} ;
      T00L710_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L710_n4533HreBarMtr = new boolean[] {false} ;
      T00L710_A4534HreBarPie = new int[1] ;
      T00L710_n4534HreBarPie = new boolean[] {false} ;
      T00L710_A4535HrePartCod = new String[] {""} ;
      T00L710_n4535HrePartCod = new boolean[] {false} ;
      T00L710_A4536HreBarNMtr = new String[] {""} ;
      T00L710_n4536HreBarNMtr = new boolean[] {false} ;
      T00L710_A4537HreBarNMez = new String[] {""} ;
      T00L710_n4537HreBarNMez = new boolean[] {false} ;
      T00L710_A4538HreNumTen = new String[] {""} ;
      T00L710_n4538HreNumTen = new boolean[] {false} ;
      T00L710_A4539HreIntCod = new byte[1] ;
      T00L710_n4539HreIntCod = new boolean[] {false} ;
      T00L710_A4540HreIntDsc = new String[] {""} ;
      T00L710_n4540HreIntDsc = new boolean[] {false} ;
      T00L710_A4541HreNumTon = new String[] {""} ;
      T00L710_n4541HreNumTon = new boolean[] {false} ;
      T00L710_A4496HreMaqHdr = new String[] {""} ;
      T00L710_n4496HreMaqHdr = new boolean[] {false} ;
      T00L710_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L710_n4542HreTotKgm = new boolean[] {false} ;
      T00L710_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L710_n4543HreTotMtr = new boolean[] {false} ;
      T00L710_A4544HreTotPie = new int[1] ;
      T00L710_n4544HreTotPie = new boolean[] {false} ;
      T00L710_A8608HreNumColF = new int[1] ;
      T00L710_n8608HreNumColF = new boolean[] {false} ;
      T00L710_A8610HreFamCodT = new short[1] ;
      T00L710_n8610HreFamCodT = new boolean[] {false} ;
      T00L710_A8623HreHilasa = new String[] {""} ;
      T00L710_n8623HreHilasa = new boolean[] {false} ;
      T00L710_A8624HreEnsayo = new int[1] ;
      T00L710_n8624HreEnsayo = new boolean[] {false} ;
      T00L710_A8625HreOpa = new String[] {""} ;
      T00L710_n8625HreOpa = new boolean[] {false} ;
      T00L710_A8626HreOpn = new byte[1] ;
      T00L710_n8626HreOpn = new boolean[] {false} ;
      T00L710_A11318HreDispCli = new String[] {""} ;
      T00L710_n11318HreDispCli = new boolean[] {false} ;
      T00L710_A11320HreMacCod = new int[1] ;
      T00L710_n11320HreMacCod = new boolean[] {false} ;
      T00L710_A12264HreNInter = new int[1] ;
      T00L710_n12264HreNInter = new boolean[] {false} ;
      T00L710_A12535HreCencId = new short[1] ;
      T00L710_n12535HreCencId = new boolean[] {false} ;
      T00L710_A12536HreCenDsc = new String[] {""} ;
      T00L710_n12536HreCenDsc = new boolean[] {false} ;
      T00L710_A13450HreComp1 = new String[] {""} ;
      T00L710_n13450HreComp1 = new boolean[] {false} ;
      T00L710_A13451HreComp2 = new String[] {""} ;
      T00L710_n13451HreComp2 = new boolean[] {false} ;
      T00L710_A13763HreUser = new String[] {""} ;
      T00L710_A13764HreDiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      T00L710_A13765HreCdn2 = new String[] {""} ;
      T00L710_A13766HreCtw = new String[] {""} ;
      T00L710_A396EmprCod = new String[] {""} ;
      T00L710_A252CliCod = new int[1] ;
      T00L710_n252CliCod = new boolean[] {false} ;
      T00L78_A407EmprNom = new String[] {""} ;
      T00L78_n407EmprNom = new boolean[] {false} ;
      T00L79_A279CliNom = new String[] {""} ;
      T00L711_A407EmprNom = new String[] {""} ;
      T00L711_n407EmprNom = new boolean[] {false} ;
      T00L712_A279CliNom = new String[] {""} ;
      T00L713_A396EmprCod = new String[] {""} ;
      T00L713_A4492HreBarCod = new int[1] ;
      T00L713_A4493HreBarReo = new byte[1] ;
      T00L713_A4494HreBarPar = new String[] {""} ;
      T00L713_A4495HreNumCie = new byte[1] ;
      T00L77_A4492HreBarCod = new int[1] ;
      T00L77_A4493HreBarReo = new byte[1] ;
      T00L77_A4494HreBarPar = new String[] {""} ;
      T00L77_A4495HreNumCie = new byte[1] ;
      T00L77_A4516HreDisCli = new String[] {""} ;
      T00L77_n4516HreDisCli = new boolean[] {false} ;
      T00L77_A4517HreBarSer = new String[] {""} ;
      T00L77_n4517HreBarSer = new boolean[] {false} ;
      T00L77_A4518HreBarDsc = new String[] {""} ;
      T00L77_n4518HreBarDsc = new boolean[] {false} ;
      T00L77_A4519HreTipArt = new short[1] ;
      T00L77_n4519HreTipArt = new boolean[] {false} ;
      T00L77_A4520HreTipArtD = new String[] {""} ;
      T00L77_n4520HreTipArtD = new boolean[] {false} ;
      T00L77_A4521HreColNom = new String[] {""} ;
      T00L77_n4521HreColNom = new boolean[] {false} ;
      T00L77_A4522HreColNum = new int[1] ;
      T00L77_n4522HreColNum = new boolean[] {false} ;
      T00L77_A4523HreColNomC = new String[] {""} ;
      T00L77_n4523HreColNomC = new boolean[] {false} ;
      T00L77_A4524HreColNumC = new int[1] ;
      T00L77_n4524HreColNumC = new boolean[] {false} ;
      T00L77_A4525HreTipCol = new byte[1] ;
      T00L77_n4525HreTipCol = new boolean[] {false} ;
      T00L77_A4526HreTipColN = new String[] {""} ;
      T00L77_n4526HreTipColN = new boolean[] {false} ;
      T00L77_A4527HreFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T00L77_n4527HreFecGen = new boolean[] {false} ;
      T00L77_A4528HreFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00L77_n4528HreFecCli = new boolean[] {false} ;
      T00L77_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00L77_n4529HreFecTin = new boolean[] {false} ;
      T00L77_A4530HreFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      T00L77_n4530HreFecFpr = new boolean[] {false} ;
      T00L77_A4531HreBarMat = new String[] {""} ;
      T00L77_n4531HreBarMat = new boolean[] {false} ;
      T00L77_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L77_n4532HreBarKgm = new boolean[] {false} ;
      T00L77_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L77_n4533HreBarMtr = new boolean[] {false} ;
      T00L77_A4534HreBarPie = new int[1] ;
      T00L77_n4534HreBarPie = new boolean[] {false} ;
      T00L77_A4535HrePartCod = new String[] {""} ;
      T00L77_n4535HrePartCod = new boolean[] {false} ;
      T00L77_A4536HreBarNMtr = new String[] {""} ;
      T00L77_n4536HreBarNMtr = new boolean[] {false} ;
      T00L77_A4537HreBarNMez = new String[] {""} ;
      T00L77_n4537HreBarNMez = new boolean[] {false} ;
      T00L77_A4538HreNumTen = new String[] {""} ;
      T00L77_n4538HreNumTen = new boolean[] {false} ;
      T00L77_A4539HreIntCod = new byte[1] ;
      T00L77_n4539HreIntCod = new boolean[] {false} ;
      T00L77_A4540HreIntDsc = new String[] {""} ;
      T00L77_n4540HreIntDsc = new boolean[] {false} ;
      T00L77_A4541HreNumTon = new String[] {""} ;
      T00L77_n4541HreNumTon = new boolean[] {false} ;
      T00L77_A4496HreMaqHdr = new String[] {""} ;
      T00L77_n4496HreMaqHdr = new boolean[] {false} ;
      T00L77_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L77_n4542HreTotKgm = new boolean[] {false} ;
      T00L77_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L77_n4543HreTotMtr = new boolean[] {false} ;
      T00L77_A4544HreTotPie = new int[1] ;
      T00L77_n4544HreTotPie = new boolean[] {false} ;
      T00L77_A8608HreNumColF = new int[1] ;
      T00L77_n8608HreNumColF = new boolean[] {false} ;
      T00L77_A8610HreFamCodT = new short[1] ;
      T00L77_n8610HreFamCodT = new boolean[] {false} ;
      T00L77_A8623HreHilasa = new String[] {""} ;
      T00L77_n8623HreHilasa = new boolean[] {false} ;
      T00L77_A8624HreEnsayo = new int[1] ;
      T00L77_n8624HreEnsayo = new boolean[] {false} ;
      T00L77_A8625HreOpa = new String[] {""} ;
      T00L77_n8625HreOpa = new boolean[] {false} ;
      T00L77_A8626HreOpn = new byte[1] ;
      T00L77_n8626HreOpn = new boolean[] {false} ;
      T00L77_A11318HreDispCli = new String[] {""} ;
      T00L77_n11318HreDispCli = new boolean[] {false} ;
      T00L77_A11320HreMacCod = new int[1] ;
      T00L77_n11320HreMacCod = new boolean[] {false} ;
      T00L77_A12264HreNInter = new int[1] ;
      T00L77_n12264HreNInter = new boolean[] {false} ;
      T00L77_A12535HreCencId = new short[1] ;
      T00L77_n12535HreCencId = new boolean[] {false} ;
      T00L77_A12536HreCenDsc = new String[] {""} ;
      T00L77_n12536HreCenDsc = new boolean[] {false} ;
      T00L77_A13450HreComp1 = new String[] {""} ;
      T00L77_n13450HreComp1 = new boolean[] {false} ;
      T00L77_A13451HreComp2 = new String[] {""} ;
      T00L77_n13451HreComp2 = new boolean[] {false} ;
      T00L77_A13763HreUser = new String[] {""} ;
      T00L77_A13764HreDiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      T00L77_A13765HreCdn2 = new String[] {""} ;
      T00L77_A13766HreCtw = new String[] {""} ;
      T00L77_A396EmprCod = new String[] {""} ;
      T00L77_A252CliCod = new int[1] ;
      T00L77_n252CliCod = new boolean[] {false} ;
      T00L714_A396EmprCod = new String[] {""} ;
      T00L714_A4492HreBarCod = new int[1] ;
      T00L714_A4493HreBarReo = new byte[1] ;
      T00L714_A4494HreBarPar = new String[] {""} ;
      T00L714_A4495HreNumCie = new byte[1] ;
      T00L715_A396EmprCod = new String[] {""} ;
      T00L715_A4492HreBarCod = new int[1] ;
      T00L715_A4493HreBarReo = new byte[1] ;
      T00L715_A4494HreBarPar = new String[] {""} ;
      T00L715_A4495HreNumCie = new byte[1] ;
      T00L76_A4492HreBarCod = new int[1] ;
      T00L76_A4493HreBarReo = new byte[1] ;
      T00L76_A4494HreBarPar = new String[] {""} ;
      T00L76_A4495HreNumCie = new byte[1] ;
      T00L76_A4516HreDisCli = new String[] {""} ;
      T00L76_n4516HreDisCli = new boolean[] {false} ;
      T00L76_A4517HreBarSer = new String[] {""} ;
      T00L76_n4517HreBarSer = new boolean[] {false} ;
      T00L76_A4518HreBarDsc = new String[] {""} ;
      T00L76_n4518HreBarDsc = new boolean[] {false} ;
      T00L76_A4519HreTipArt = new short[1] ;
      T00L76_n4519HreTipArt = new boolean[] {false} ;
      T00L76_A4520HreTipArtD = new String[] {""} ;
      T00L76_n4520HreTipArtD = new boolean[] {false} ;
      T00L76_A4521HreColNom = new String[] {""} ;
      T00L76_n4521HreColNom = new boolean[] {false} ;
      T00L76_A4522HreColNum = new int[1] ;
      T00L76_n4522HreColNum = new boolean[] {false} ;
      T00L76_A4523HreColNomC = new String[] {""} ;
      T00L76_n4523HreColNomC = new boolean[] {false} ;
      T00L76_A4524HreColNumC = new int[1] ;
      T00L76_n4524HreColNumC = new boolean[] {false} ;
      T00L76_A4525HreTipCol = new byte[1] ;
      T00L76_n4525HreTipCol = new boolean[] {false} ;
      T00L76_A4526HreTipColN = new String[] {""} ;
      T00L76_n4526HreTipColN = new boolean[] {false} ;
      T00L76_A4527HreFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      T00L76_n4527HreFecGen = new boolean[] {false} ;
      T00L76_A4528HreFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      T00L76_n4528HreFecCli = new boolean[] {false} ;
      T00L76_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T00L76_n4529HreFecTin = new boolean[] {false} ;
      T00L76_A4530HreFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      T00L76_n4530HreFecFpr = new boolean[] {false} ;
      T00L76_A4531HreBarMat = new String[] {""} ;
      T00L76_n4531HreBarMat = new boolean[] {false} ;
      T00L76_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L76_n4532HreBarKgm = new boolean[] {false} ;
      T00L76_A4533HreBarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L76_n4533HreBarMtr = new boolean[] {false} ;
      T00L76_A4534HreBarPie = new int[1] ;
      T00L76_n4534HreBarPie = new boolean[] {false} ;
      T00L76_A4535HrePartCod = new String[] {""} ;
      T00L76_n4535HrePartCod = new boolean[] {false} ;
      T00L76_A4536HreBarNMtr = new String[] {""} ;
      T00L76_n4536HreBarNMtr = new boolean[] {false} ;
      T00L76_A4537HreBarNMez = new String[] {""} ;
      T00L76_n4537HreBarNMez = new boolean[] {false} ;
      T00L76_A4538HreNumTen = new String[] {""} ;
      T00L76_n4538HreNumTen = new boolean[] {false} ;
      T00L76_A4539HreIntCod = new byte[1] ;
      T00L76_n4539HreIntCod = new boolean[] {false} ;
      T00L76_A4540HreIntDsc = new String[] {""} ;
      T00L76_n4540HreIntDsc = new boolean[] {false} ;
      T00L76_A4541HreNumTon = new String[] {""} ;
      T00L76_n4541HreNumTon = new boolean[] {false} ;
      T00L76_A4496HreMaqHdr = new String[] {""} ;
      T00L76_n4496HreMaqHdr = new boolean[] {false} ;
      T00L76_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L76_n4542HreTotKgm = new boolean[] {false} ;
      T00L76_A4543HreTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L76_n4543HreTotMtr = new boolean[] {false} ;
      T00L76_A4544HreTotPie = new int[1] ;
      T00L76_n4544HreTotPie = new boolean[] {false} ;
      T00L76_A8608HreNumColF = new int[1] ;
      T00L76_n8608HreNumColF = new boolean[] {false} ;
      T00L76_A8610HreFamCodT = new short[1] ;
      T00L76_n8610HreFamCodT = new boolean[] {false} ;
      T00L76_A8623HreHilasa = new String[] {""} ;
      T00L76_n8623HreHilasa = new boolean[] {false} ;
      T00L76_A8624HreEnsayo = new int[1] ;
      T00L76_n8624HreEnsayo = new boolean[] {false} ;
      T00L76_A8625HreOpa = new String[] {""} ;
      T00L76_n8625HreOpa = new boolean[] {false} ;
      T00L76_A8626HreOpn = new byte[1] ;
      T00L76_n8626HreOpn = new boolean[] {false} ;
      T00L76_A11318HreDispCli = new String[] {""} ;
      T00L76_n11318HreDispCli = new boolean[] {false} ;
      T00L76_A11320HreMacCod = new int[1] ;
      T00L76_n11320HreMacCod = new boolean[] {false} ;
      T00L76_A12264HreNInter = new int[1] ;
      T00L76_n12264HreNInter = new boolean[] {false} ;
      T00L76_A12535HreCencId = new short[1] ;
      T00L76_n12535HreCencId = new boolean[] {false} ;
      T00L76_A12536HreCenDsc = new String[] {""} ;
      T00L76_n12536HreCenDsc = new boolean[] {false} ;
      T00L76_A13450HreComp1 = new String[] {""} ;
      T00L76_n13450HreComp1 = new boolean[] {false} ;
      T00L76_A13451HreComp2 = new String[] {""} ;
      T00L76_n13451HreComp2 = new boolean[] {false} ;
      T00L76_A13763HreUser = new String[] {""} ;
      T00L76_A13764HreDiaHora = new java.util.Date[] {GXutil.nullDate()} ;
      T00L76_A13765HreCdn2 = new String[] {""} ;
      T00L76_A13766HreCtw = new String[] {""} ;
      T00L76_A396EmprCod = new String[] {""} ;
      T00L76_A252CliCod = new int[1] ;
      T00L76_n252CliCod = new boolean[] {false} ;
      T00L719_A407EmprNom = new String[] {""} ;
      T00L719_n407EmprNom = new boolean[] {false} ;
      T00L720_A279CliNom = new String[] {""} ;
      T00L721_A396EmprCod = new String[] {""} ;
      T00L721_A4492HreBarCod = new int[1] ;
      T00L721_A4493HreBarReo = new byte[1] ;
      T00L721_A4494HreBarPar = new String[] {""} ;
      T00L721_A4495HreNumCie = new byte[1] ;
      T00L721_A9985HreAcCod = new int[1] ;
      T00L721_A9986HreAcReo = new byte[1] ;
      T00L721_A9987HreAcPar = new String[] {""} ;
      T00L722_A396EmprCod = new String[] {""} ;
      T00L722_A4492HreBarCod = new int[1] ;
      T00L722_A4493HreBarReo = new byte[1] ;
      T00L722_A4494HreBarPar = new String[] {""} ;
      T00L722_A4495HreNumCie = new byte[1] ;
      T00L722_A5864HreProCodP = new String[] {""} ;
      T00L722_A5865HreOrdLinF = new short[1] ;
      T00L723_A396EmprCod = new String[] {""} ;
      T00L723_A4492HreBarCod = new int[1] ;
      T00L723_A4493HreBarReo = new byte[1] ;
      T00L723_A4494HreBarPar = new String[] {""} ;
      T00L723_A4495HreNumCie = new byte[1] ;
      T00L723_A4545HreLinMaq = new short[1] ;
      T00L724_A396EmprCod = new String[] {""} ;
      T00L724_A4492HreBarCod = new int[1] ;
      T00L724_A4493HreBarReo = new byte[1] ;
      T00L724_A4494HreBarPar = new String[] {""} ;
      T00L724_A4495HreNumCie = new byte[1] ;
      T00L724_A4508HreLinMAL = new short[1] ;
      T00L724_A4509HreNumAny = new byte[1] ;
      T00L724_A719PrdNum = new String[] {""} ;
      T00L725_A396EmprCod = new String[] {""} ;
      T00L725_A4492HreBarCod = new int[1] ;
      T00L725_A4493HreBarReo = new byte[1] ;
      T00L725_A4494HreBarPar = new String[] {""} ;
      T00L725_A4495HreNumCie = new byte[1] ;
      T00L725_A4497HreAgrCod = new int[1] ;
      T00L725_A4498HreAgrReo = new byte[1] ;
      T00L725_A4499HreAgrPar = new String[] {""} ;
      T00L726_A396EmprCod = new String[] {""} ;
      T00L726_A4492HreBarCod = new int[1] ;
      T00L726_A4493HreBarReo = new byte[1] ;
      T00L726_A4494HreBarPar = new String[] {""} ;
      T00L726_A4495HreNumCie = new byte[1] ;
      T00L727_A4492HreBarCod = new int[1] ;
      T00L727_A4493HreBarReo = new byte[1] ;
      T00L727_A4494HreBarPar = new String[] {""} ;
      T00L727_A4495HreNumCie = new byte[1] ;
      T00L727_A4545HreLinMaq = new short[1] ;
      T00L727_A4546HreMaqCod = new String[] {""} ;
      T00L727_n4546HreMaqCod = new boolean[] {false} ;
      T00L727_A4547HreVolPrd = new int[1] ;
      T00L727_n4547HreVolPrd = new boolean[] {false} ;
      T00L727_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n4548HreFacAbs = new boolean[] {false} ;
      T00L727_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T00L727_n4584HreFecPes = new boolean[] {false} ;
      T00L727_A4585HreMaqPes = new byte[1] ;
      T00L727_n4585HreMaqPes = new boolean[] {false} ;
      T00L727_A4549HreULinPro = new byte[1] ;
      T00L727_n4549HreULinPro = new boolean[] {false} ;
      T00L727_A4863HreUsrCod = new String[] {""} ;
      T00L727_n4863HreUsrCod = new boolean[] {false} ;
      T00L727_A7814HReMaqNh = new short[1] ;
      T00L727_n7814HReMaqNh = new boolean[] {false} ;
      T00L727_A7815HReMaqVX = new byte[1] ;
      T00L727_n7815HReMaqVX = new boolean[] {false} ;
      T00L727_A7816HReMaqBL = new byte[1] ;
      T00L727_n7816HReMaqBL = new boolean[] {false} ;
      T00L727_A7817HReMaqFlow = new byte[1] ;
      T00L727_n7817HReMaqFlow = new boolean[] {false} ;
      T00L727_A7818HReMaqRPM = new short[1] ;
      T00L727_n7818HReMaqRPM = new boolean[] {false} ;
      T00L727_A7819HReMaqMol = new short[1] ;
      T00L727_n7819HReMaqMol = new boolean[] {false} ;
      T00L727_A7820HReMaqTor = new short[1] ;
      T00L727_n7820HReMaqTor = new boolean[] {false} ;
      T00L727_A7821HReMaqCla = new String[] {""} ;
      T00L727_n7821HReMaqCla = new boolean[] {false} ;
      T00L727_A7822HReMaqTej = new byte[1] ;
      T00L727_n7822HReMaqTej = new boolean[] {false} ;
      T00L727_A7823HReMaqDel = new byte[1] ;
      T00L727_n7823HReMaqDel = new boolean[] {false} ;
      T00L727_A7824HReMaqPML = new short[1] ;
      T00L727_n7824HReMaqPML = new boolean[] {false} ;
      T00L727_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n8602HreCosAA = new boolean[] {false} ;
      T00L727_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n8603HrecosAd = new boolean[] {false} ;
      T00L727_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n8604HreCosAnc = new boolean[] {false} ;
      T00L727_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n8605HreCosCol = new boolean[] {false} ;
      T00L727_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n8606HreCosPA = new boolean[] {false} ;
      T00L727_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n8607HreCosPD = new boolean[] {false} ;
      T00L727_A9780HreLtsSb = new int[1] ;
      T00L727_n9780HreLtsSb = new boolean[] {false} ;
      T00L727_A9781HreLtsRm = new int[1] ;
      T00L727_n9781HreLtsRm = new boolean[] {false} ;
      T00L727_A9803HreAcaQ = new String[] {""} ;
      T00L727_n9803HreAcaQ = new boolean[] {false} ;
      T00L727_A9804HreAcab = new String[] {""} ;
      T00L727_n9804HreAcab = new boolean[] {false} ;
      T00L727_A1094HreNPrg = new String[] {""} ;
      T00L727_n1094HreNPrg = new boolean[] {false} ;
      T00L727_A697HreLotF = new String[] {""} ;
      T00L727_n697HreLotF = new boolean[] {false} ;
      T00L727_A10381HreAnc = new short[1] ;
      T00L727_n10381HreAnc = new boolean[] {false} ;
      T00L727_A10382HreGrm = new short[1] ;
      T00L727_n10382HreGrm = new boolean[] {false} ;
      T00L727_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L727_n10383HreVel = new boolean[] {false} ;
      T00L727_A10384HreObs = new String[] {""} ;
      T00L727_n10384HreObs = new boolean[] {false} ;
      T00L727_A11508HreAva = new String[] {""} ;
      T00L727_n11508HreAva = new boolean[] {false} ;
      T00L727_A12126HreAs = new String[] {""} ;
      T00L727_n12126HreAs = new boolean[] {false} ;
      T00L727_A12127HreAi = new String[] {""} ;
      T00L727_n12127HreAi = new boolean[] {false} ;
      T00L727_A396EmprCod = new String[] {""} ;
      T00L728_A396EmprCod = new String[] {""} ;
      T00L728_A4492HreBarCod = new int[1] ;
      T00L728_A4493HreBarReo = new byte[1] ;
      T00L728_A4494HreBarPar = new String[] {""} ;
      T00L728_A4495HreNumCie = new byte[1] ;
      T00L728_A4545HreLinMaq = new short[1] ;
      T00L75_A4492HreBarCod = new int[1] ;
      T00L75_A4493HreBarReo = new byte[1] ;
      T00L75_A4494HreBarPar = new String[] {""} ;
      T00L75_A4495HreNumCie = new byte[1] ;
      T00L75_A4545HreLinMaq = new short[1] ;
      T00L75_A4546HreMaqCod = new String[] {""} ;
      T00L75_n4546HreMaqCod = new boolean[] {false} ;
      T00L75_A4547HreVolPrd = new int[1] ;
      T00L75_n4547HreVolPrd = new boolean[] {false} ;
      T00L75_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n4548HreFacAbs = new boolean[] {false} ;
      T00L75_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T00L75_n4584HreFecPes = new boolean[] {false} ;
      T00L75_A4585HreMaqPes = new byte[1] ;
      T00L75_n4585HreMaqPes = new boolean[] {false} ;
      T00L75_A4549HreULinPro = new byte[1] ;
      T00L75_n4549HreULinPro = new boolean[] {false} ;
      T00L75_A4863HreUsrCod = new String[] {""} ;
      T00L75_n4863HreUsrCod = new boolean[] {false} ;
      T00L75_A7814HReMaqNh = new short[1] ;
      T00L75_n7814HReMaqNh = new boolean[] {false} ;
      T00L75_A7815HReMaqVX = new byte[1] ;
      T00L75_n7815HReMaqVX = new boolean[] {false} ;
      T00L75_A7816HReMaqBL = new byte[1] ;
      T00L75_n7816HReMaqBL = new boolean[] {false} ;
      T00L75_A7817HReMaqFlow = new byte[1] ;
      T00L75_n7817HReMaqFlow = new boolean[] {false} ;
      T00L75_A7818HReMaqRPM = new short[1] ;
      T00L75_n7818HReMaqRPM = new boolean[] {false} ;
      T00L75_A7819HReMaqMol = new short[1] ;
      T00L75_n7819HReMaqMol = new boolean[] {false} ;
      T00L75_A7820HReMaqTor = new short[1] ;
      T00L75_n7820HReMaqTor = new boolean[] {false} ;
      T00L75_A7821HReMaqCla = new String[] {""} ;
      T00L75_n7821HReMaqCla = new boolean[] {false} ;
      T00L75_A7822HReMaqTej = new byte[1] ;
      T00L75_n7822HReMaqTej = new boolean[] {false} ;
      T00L75_A7823HReMaqDel = new byte[1] ;
      T00L75_n7823HReMaqDel = new boolean[] {false} ;
      T00L75_A7824HReMaqPML = new short[1] ;
      T00L75_n7824HReMaqPML = new boolean[] {false} ;
      T00L75_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n8602HreCosAA = new boolean[] {false} ;
      T00L75_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n8603HrecosAd = new boolean[] {false} ;
      T00L75_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n8604HreCosAnc = new boolean[] {false} ;
      T00L75_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n8605HreCosCol = new boolean[] {false} ;
      T00L75_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n8606HreCosPA = new boolean[] {false} ;
      T00L75_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n8607HreCosPD = new boolean[] {false} ;
      T00L75_A9780HreLtsSb = new int[1] ;
      T00L75_n9780HreLtsSb = new boolean[] {false} ;
      T00L75_A9781HreLtsRm = new int[1] ;
      T00L75_n9781HreLtsRm = new boolean[] {false} ;
      T00L75_A9803HreAcaQ = new String[] {""} ;
      T00L75_n9803HreAcaQ = new boolean[] {false} ;
      T00L75_A9804HreAcab = new String[] {""} ;
      T00L75_n9804HreAcab = new boolean[] {false} ;
      T00L75_A1094HreNPrg = new String[] {""} ;
      T00L75_n1094HreNPrg = new boolean[] {false} ;
      T00L75_A697HreLotF = new String[] {""} ;
      T00L75_n697HreLotF = new boolean[] {false} ;
      T00L75_A10381HreAnc = new short[1] ;
      T00L75_n10381HreAnc = new boolean[] {false} ;
      T00L75_A10382HreGrm = new short[1] ;
      T00L75_n10382HreGrm = new boolean[] {false} ;
      T00L75_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L75_n10383HreVel = new boolean[] {false} ;
      T00L75_A10384HreObs = new String[] {""} ;
      T00L75_n10384HreObs = new boolean[] {false} ;
      T00L75_A11508HreAva = new String[] {""} ;
      T00L75_n11508HreAva = new boolean[] {false} ;
      T00L75_A12126HreAs = new String[] {""} ;
      T00L75_n12126HreAs = new boolean[] {false} ;
      T00L75_A12127HreAi = new String[] {""} ;
      T00L75_n12127HreAi = new boolean[] {false} ;
      T00L75_A396EmprCod = new String[] {""} ;
      T00L74_A4492HreBarCod = new int[1] ;
      T00L74_A4493HreBarReo = new byte[1] ;
      T00L74_A4494HreBarPar = new String[] {""} ;
      T00L74_A4495HreNumCie = new byte[1] ;
      T00L74_A4545HreLinMaq = new short[1] ;
      T00L74_A4546HreMaqCod = new String[] {""} ;
      T00L74_n4546HreMaqCod = new boolean[] {false} ;
      T00L74_A4547HreVolPrd = new int[1] ;
      T00L74_n4547HreVolPrd = new boolean[] {false} ;
      T00L74_A4548HreFacAbs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n4548HreFacAbs = new boolean[] {false} ;
      T00L74_A4584HreFecPes = new java.util.Date[] {GXutil.nullDate()} ;
      T00L74_n4584HreFecPes = new boolean[] {false} ;
      T00L74_A4585HreMaqPes = new byte[1] ;
      T00L74_n4585HreMaqPes = new boolean[] {false} ;
      T00L74_A4549HreULinPro = new byte[1] ;
      T00L74_n4549HreULinPro = new boolean[] {false} ;
      T00L74_A4863HreUsrCod = new String[] {""} ;
      T00L74_n4863HreUsrCod = new boolean[] {false} ;
      T00L74_A7814HReMaqNh = new short[1] ;
      T00L74_n7814HReMaqNh = new boolean[] {false} ;
      T00L74_A7815HReMaqVX = new byte[1] ;
      T00L74_n7815HReMaqVX = new boolean[] {false} ;
      T00L74_A7816HReMaqBL = new byte[1] ;
      T00L74_n7816HReMaqBL = new boolean[] {false} ;
      T00L74_A7817HReMaqFlow = new byte[1] ;
      T00L74_n7817HReMaqFlow = new boolean[] {false} ;
      T00L74_A7818HReMaqRPM = new short[1] ;
      T00L74_n7818HReMaqRPM = new boolean[] {false} ;
      T00L74_A7819HReMaqMol = new short[1] ;
      T00L74_n7819HReMaqMol = new boolean[] {false} ;
      T00L74_A7820HReMaqTor = new short[1] ;
      T00L74_n7820HReMaqTor = new boolean[] {false} ;
      T00L74_A7821HReMaqCla = new String[] {""} ;
      T00L74_n7821HReMaqCla = new boolean[] {false} ;
      T00L74_A7822HReMaqTej = new byte[1] ;
      T00L74_n7822HReMaqTej = new boolean[] {false} ;
      T00L74_A7823HReMaqDel = new byte[1] ;
      T00L74_n7823HReMaqDel = new boolean[] {false} ;
      T00L74_A7824HReMaqPML = new short[1] ;
      T00L74_n7824HReMaqPML = new boolean[] {false} ;
      T00L74_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n8602HreCosAA = new boolean[] {false} ;
      T00L74_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n8603HrecosAd = new boolean[] {false} ;
      T00L74_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n8604HreCosAnc = new boolean[] {false} ;
      T00L74_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n8605HreCosCol = new boolean[] {false} ;
      T00L74_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n8606HreCosPA = new boolean[] {false} ;
      T00L74_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n8607HreCosPD = new boolean[] {false} ;
      T00L74_A9780HreLtsSb = new int[1] ;
      T00L74_n9780HreLtsSb = new boolean[] {false} ;
      T00L74_A9781HreLtsRm = new int[1] ;
      T00L74_n9781HreLtsRm = new boolean[] {false} ;
      T00L74_A9803HreAcaQ = new String[] {""} ;
      T00L74_n9803HreAcaQ = new boolean[] {false} ;
      T00L74_A9804HreAcab = new String[] {""} ;
      T00L74_n9804HreAcab = new boolean[] {false} ;
      T00L74_A1094HreNPrg = new String[] {""} ;
      T00L74_n1094HreNPrg = new boolean[] {false} ;
      T00L74_A697HreLotF = new String[] {""} ;
      T00L74_n697HreLotF = new boolean[] {false} ;
      T00L74_A10381HreAnc = new short[1] ;
      T00L74_n10381HreAnc = new boolean[] {false} ;
      T00L74_A10382HreGrm = new short[1] ;
      T00L74_n10382HreGrm = new boolean[] {false} ;
      T00L74_A10383HreVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L74_n10383HreVel = new boolean[] {false} ;
      T00L74_A10384HreObs = new String[] {""} ;
      T00L74_n10384HreObs = new boolean[] {false} ;
      T00L74_A11508HreAva = new String[] {""} ;
      T00L74_n11508HreAva = new boolean[] {false} ;
      T00L74_A12126HreAs = new String[] {""} ;
      T00L74_n12126HreAs = new boolean[] {false} ;
      T00L74_A12127HreAi = new String[] {""} ;
      T00L74_n12127HreAi = new boolean[] {false} ;
      T00L74_A396EmprCod = new String[] {""} ;
      T00L732_A396EmprCod = new String[] {""} ;
      T00L732_A4492HreBarCod = new int[1] ;
      T00L732_A4493HreBarReo = new byte[1] ;
      T00L732_A4494HreBarPar = new String[] {""} ;
      T00L732_A4495HreNumCie = new byte[1] ;
      T00L732_A4545HreLinMaq = new short[1] ;
      T00L732_A14278HreNormId = new String[] {""} ;
      T00L733_A396EmprCod = new String[] {""} ;
      T00L733_A4492HreBarCod = new int[1] ;
      T00L733_A4493HreBarReo = new byte[1] ;
      T00L733_A4494HreBarPar = new String[] {""} ;
      T00L733_A4495HreNumCie = new byte[1] ;
      T00L733_A4545HreLinMaq = new short[1] ;
      T00L733_A14282HreTraID = new String[] {""} ;
      T00L734_A396EmprCod = new String[] {""} ;
      T00L734_A4492HreBarCod = new int[1] ;
      T00L734_A4493HreBarReo = new byte[1] ;
      T00L734_A4494HreBarPar = new String[] {""} ;
      T00L734_A4495HreNumCie = new byte[1] ;
      T00L734_A4545HreLinMaq = new short[1] ;
      T00L734_A4550HreLinPro = new byte[1] ;
      T00L734_A4557HreRecLin = new short[1] ;
      T00L735_A396EmprCod = new String[] {""} ;
      T00L735_A4492HreBarCod = new int[1] ;
      T00L735_A4493HreBarReo = new byte[1] ;
      T00L735_A4494HreBarPar = new String[] {""} ;
      T00L735_A4495HreNumCie = new byte[1] ;
      T00L735_A4545HreLinMaq = new short[1] ;
      T00L735_A11322HreLinObs = new short[1] ;
      T00L736_A396EmprCod = new String[] {""} ;
      T00L736_A4492HreBarCod = new int[1] ;
      T00L736_A4493HreBarReo = new byte[1] ;
      T00L736_A4494HreBarPar = new String[] {""} ;
      T00L736_A4495HreNumCie = new byte[1] ;
      T00L736_A4545HreLinMaq = new short[1] ;
      T00L737_A4492HreBarCod = new int[1] ;
      T00L737_A4493HreBarReo = new byte[1] ;
      T00L737_A4494HreBarPar = new String[] {""} ;
      T00L737_A4495HreNumCie = new byte[1] ;
      T00L737_A4545HreLinMaq = new short[1] ;
      T00L737_A4550HreLinPro = new byte[1] ;
      T00L737_A4551HreProCod = new String[] {""} ;
      T00L737_A4552HreProDsc = new String[] {""} ;
      T00L737_A4553HreProTie = new short[1] ;
      T00L737_A4554HreProTmx = new short[1] ;
      T00L737_A4555HreNumPro = new int[1] ;
      T00L737_A4556HreNumRec = new int[1] ;
      T00L737_A10545HreNH2O = new short[1] ;
      T00L737_A396EmprCod = new String[] {""} ;
      T00L738_A396EmprCod = new String[] {""} ;
      T00L738_A4492HreBarCod = new int[1] ;
      T00L738_A4493HreBarReo = new byte[1] ;
      T00L738_A4494HreBarPar = new String[] {""} ;
      T00L738_A4495HreNumCie = new byte[1] ;
      T00L738_A4545HreLinMaq = new short[1] ;
      T00L738_A4550HreLinPro = new byte[1] ;
      T00L73_A4492HreBarCod = new int[1] ;
      T00L73_A4493HreBarReo = new byte[1] ;
      T00L73_A4494HreBarPar = new String[] {""} ;
      T00L73_A4495HreNumCie = new byte[1] ;
      T00L73_A4545HreLinMaq = new short[1] ;
      T00L73_A4550HreLinPro = new byte[1] ;
      T00L73_A4551HreProCod = new String[] {""} ;
      T00L73_A4552HreProDsc = new String[] {""} ;
      T00L73_A4553HreProTie = new short[1] ;
      T00L73_A4554HreProTmx = new short[1] ;
      T00L73_A4555HreNumPro = new int[1] ;
      T00L73_A4556HreNumRec = new int[1] ;
      T00L73_A10545HreNH2O = new short[1] ;
      T00L73_A396EmprCod = new String[] {""} ;
      sMode1874 = "" ;
      T00L72_A4492HreBarCod = new int[1] ;
      T00L72_A4493HreBarReo = new byte[1] ;
      T00L72_A4494HreBarPar = new String[] {""} ;
      T00L72_A4495HreNumCie = new byte[1] ;
      T00L72_A4545HreLinMaq = new short[1] ;
      T00L72_A4550HreLinPro = new byte[1] ;
      T00L72_A4551HreProCod = new String[] {""} ;
      T00L72_A4552HreProDsc = new String[] {""} ;
      T00L72_A4553HreProTie = new short[1] ;
      T00L72_A4554HreProTmx = new short[1] ;
      T00L72_A4555HreNumPro = new int[1] ;
      T00L72_A4556HreNumRec = new int[1] ;
      T00L72_A10545HreNH2O = new short[1] ;
      T00L72_A396EmprCod = new String[] {""} ;
      T00L742_A396EmprCod = new String[] {""} ;
      T00L742_A4492HreBarCod = new int[1] ;
      T00L742_A4493HreBarReo = new byte[1] ;
      T00L742_A4494HreBarPar = new String[] {""} ;
      T00L742_A4495HreNumCie = new byte[1] ;
      T00L742_A4545HreLinMaq = new short[1] ;
      T00L742_A4550HreLinPro = new byte[1] ;
      T00L742_A4557HreRecLin = new short[1] ;
      T00L743_A396EmprCod = new String[] {""} ;
      T00L743_A4492HreBarCod = new int[1] ;
      T00L743_A4493HreBarReo = new byte[1] ;
      T00L743_A4494HreBarPar = new String[] {""} ;
      T00L743_A4495HreNumCie = new byte[1] ;
      T00L743_A4545HreLinMaq = new short[1] ;
      T00L743_A4550HreLinPro = new byte[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock52_Jsonclick = "" ;
      ROClassString = "" ;
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
      lblTextblock71_Jsonclick = "" ;
      lblTextblock72_Jsonclick = "" ;
      lblTextblock73_Jsonclick = "" ;
      lblTextblock74_Jsonclick = "" ;
      lblTextblock75_Jsonclick = "" ;
      lblTextblock76_Jsonclick = "" ;
      lblTextblock77_Jsonclick = "" ;
      lblTextblock78_Jsonclick = "" ;
      lblTextblock79_Jsonclick = "" ;
      lblTextblock80_Jsonclick = "" ;
      lblTextblock81_Jsonclick = "" ;
      lblTextblock82_Jsonclick = "" ;
      lblTextblock83_Jsonclick = "" ;
      lblTextblock84_Jsonclick = "" ;
      lblTextblock85_Jsonclick = "" ;
      lblTextblock86_Jsonclick = "" ;
      lblTextblock87_Jsonclick = "" ;
      lblTextblock88_Jsonclick = "" ;
      lblTextblock89_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      Z13842BarNhdr_Hi = "" ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
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
      ZZ8623HreHilasa = "" ;
      ZZ8625HreOpa = "" ;
      ZZ11318HreDispCli = "" ;
      ZZ12536HreCenDsc = "" ;
      ZZ13450HreComp1 = "" ;
      ZZ13451HreComp2 = "" ;
      ZZ13763HreUser = "" ;
      ZZ13764HreDiaHora = GXutil.resetTime( GXutil.nullDate() );
      ZZ13765HreCdn2 = "" ;
      ZZ13766HreCtw = "" ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ13842BarNhdr_Hi = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.thisrec__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thisrec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thisrec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thisrec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thisrec__default(),
         new Object[] {
             new Object[] {
            T00L72_A4492HreBarCod, T00L72_A4493HreBarReo, T00L72_A4494HreBarPar, T00L72_A4495HreNumCie, T00L72_A4545HreLinMaq, T00L72_A4550HreLinPro, T00L72_A4551HreProCod, T00L72_A4552HreProDsc, T00L72_A4553HreProTie, T00L72_A4554HreProTmx,
            T00L72_A4555HreNumPro, T00L72_A4556HreNumRec, T00L72_A10545HreNH2O, T00L72_A396EmprCod
            }
            , new Object[] {
            T00L73_A4492HreBarCod, T00L73_A4493HreBarReo, T00L73_A4494HreBarPar, T00L73_A4495HreNumCie, T00L73_A4545HreLinMaq, T00L73_A4550HreLinPro, T00L73_A4551HreProCod, T00L73_A4552HreProDsc, T00L73_A4553HreProTie, T00L73_A4554HreProTmx,
            T00L73_A4555HreNumPro, T00L73_A4556HreNumRec, T00L73_A10545HreNH2O, T00L73_A396EmprCod
            }
            , new Object[] {
            T00L74_A4492HreBarCod, T00L74_A4493HreBarReo, T00L74_A4494HreBarPar, T00L74_A4495HreNumCie, T00L74_A4545HreLinMaq, T00L74_A4546HreMaqCod, T00L74_n4546HreMaqCod, T00L74_A4547HreVolPrd, T00L74_n4547HreVolPrd, T00L74_A4548HreFacAbs,
            T00L74_n4548HreFacAbs, T00L74_A4584HreFecPes, T00L74_n4584HreFecPes, T00L74_A4585HreMaqPes, T00L74_n4585HreMaqPes, T00L74_A4549HreULinPro, T00L74_n4549HreULinPro, T00L74_A4863HreUsrCod, T00L74_n4863HreUsrCod, T00L74_A7814HReMaqNh,
            T00L74_n7814HReMaqNh, T00L74_A7815HReMaqVX, T00L74_n7815HReMaqVX, T00L74_A7816HReMaqBL, T00L74_n7816HReMaqBL, T00L74_A7817HReMaqFlow, T00L74_n7817HReMaqFlow, T00L74_A7818HReMaqRPM, T00L74_n7818HReMaqRPM, T00L74_A7819HReMaqMol,
            T00L74_n7819HReMaqMol, T00L74_A7820HReMaqTor, T00L74_n7820HReMaqTor, T00L74_A7821HReMaqCla, T00L74_n7821HReMaqCla, T00L74_A7822HReMaqTej, T00L74_n7822HReMaqTej, T00L74_A7823HReMaqDel, T00L74_n7823HReMaqDel, T00L74_A7824HReMaqPML,
            T00L74_n7824HReMaqPML, T00L74_A8602HreCosAA, T00L74_n8602HreCosAA, T00L74_A8603HrecosAd, T00L74_n8603HrecosAd, T00L74_A8604HreCosAnc, T00L74_n8604HreCosAnc, T00L74_A8605HreCosCol, T00L74_n8605HreCosCol, T00L74_A8606HreCosPA,
            T00L74_n8606HreCosPA, T00L74_A8607HreCosPD, T00L74_n8607HreCosPD, T00L74_A9780HreLtsSb, T00L74_n9780HreLtsSb, T00L74_A9781HreLtsRm, T00L74_n9781HreLtsRm, T00L74_A9803HreAcaQ, T00L74_n9803HreAcaQ, T00L74_A9804HreAcab,
            T00L74_n9804HreAcab, T00L74_A1094HreNPrg, T00L74_n1094HreNPrg, T00L74_A697HreLotF, T00L74_n697HreLotF, T00L74_A10381HreAnc, T00L74_n10381HreAnc, T00L74_A10382HreGrm, T00L74_n10382HreGrm, T00L74_A10383HreVel,
            T00L74_n10383HreVel, T00L74_A10384HreObs, T00L74_n10384HreObs, T00L74_A11508HreAva, T00L74_n11508HreAva, T00L74_A12126HreAs, T00L74_n12126HreAs, T00L74_A12127HreAi, T00L74_n12127HreAi, T00L74_A396EmprCod
            }
            , new Object[] {
            T00L75_A4492HreBarCod, T00L75_A4493HreBarReo, T00L75_A4494HreBarPar, T00L75_A4495HreNumCie, T00L75_A4545HreLinMaq, T00L75_A4546HreMaqCod, T00L75_n4546HreMaqCod, T00L75_A4547HreVolPrd, T00L75_n4547HreVolPrd, T00L75_A4548HreFacAbs,
            T00L75_n4548HreFacAbs, T00L75_A4584HreFecPes, T00L75_n4584HreFecPes, T00L75_A4585HreMaqPes, T00L75_n4585HreMaqPes, T00L75_A4549HreULinPro, T00L75_n4549HreULinPro, T00L75_A4863HreUsrCod, T00L75_n4863HreUsrCod, T00L75_A7814HReMaqNh,
            T00L75_n7814HReMaqNh, T00L75_A7815HReMaqVX, T00L75_n7815HReMaqVX, T00L75_A7816HReMaqBL, T00L75_n7816HReMaqBL, T00L75_A7817HReMaqFlow, T00L75_n7817HReMaqFlow, T00L75_A7818HReMaqRPM, T00L75_n7818HReMaqRPM, T00L75_A7819HReMaqMol,
            T00L75_n7819HReMaqMol, T00L75_A7820HReMaqTor, T00L75_n7820HReMaqTor, T00L75_A7821HReMaqCla, T00L75_n7821HReMaqCla, T00L75_A7822HReMaqTej, T00L75_n7822HReMaqTej, T00L75_A7823HReMaqDel, T00L75_n7823HReMaqDel, T00L75_A7824HReMaqPML,
            T00L75_n7824HReMaqPML, T00L75_A8602HreCosAA, T00L75_n8602HreCosAA, T00L75_A8603HrecosAd, T00L75_n8603HrecosAd, T00L75_A8604HreCosAnc, T00L75_n8604HreCosAnc, T00L75_A8605HreCosCol, T00L75_n8605HreCosCol, T00L75_A8606HreCosPA,
            T00L75_n8606HreCosPA, T00L75_A8607HreCosPD, T00L75_n8607HreCosPD, T00L75_A9780HreLtsSb, T00L75_n9780HreLtsSb, T00L75_A9781HreLtsRm, T00L75_n9781HreLtsRm, T00L75_A9803HreAcaQ, T00L75_n9803HreAcaQ, T00L75_A9804HreAcab,
            T00L75_n9804HreAcab, T00L75_A1094HreNPrg, T00L75_n1094HreNPrg, T00L75_A697HreLotF, T00L75_n697HreLotF, T00L75_A10381HreAnc, T00L75_n10381HreAnc, T00L75_A10382HreGrm, T00L75_n10382HreGrm, T00L75_A10383HreVel,
            T00L75_n10383HreVel, T00L75_A10384HreObs, T00L75_n10384HreObs, T00L75_A11508HreAva, T00L75_n11508HreAva, T00L75_A12126HreAs, T00L75_n12126HreAs, T00L75_A12127HreAi, T00L75_n12127HreAi, T00L75_A396EmprCod
            }
            , new Object[] {
            T00L76_A4492HreBarCod, T00L76_A4493HreBarReo, T00L76_A4494HreBarPar, T00L76_A4495HreNumCie, T00L76_A4516HreDisCli, T00L76_n4516HreDisCli, T00L76_A4517HreBarSer, T00L76_n4517HreBarSer, T00L76_A4518HreBarDsc, T00L76_n4518HreBarDsc,
            T00L76_A4519HreTipArt, T00L76_n4519HreTipArt, T00L76_A4520HreTipArtD, T00L76_n4520HreTipArtD, T00L76_A4521HreColNom, T00L76_n4521HreColNom, T00L76_A4522HreColNum, T00L76_n4522HreColNum, T00L76_A4523HreColNomC, T00L76_n4523HreColNomC,
            T00L76_A4524HreColNumC, T00L76_n4524HreColNumC, T00L76_A4525HreTipCol, T00L76_n4525HreTipCol, T00L76_A4526HreTipColN, T00L76_n4526HreTipColN, T00L76_A4527HreFecGen, T00L76_n4527HreFecGen, T00L76_A4528HreFecCli, T00L76_n4528HreFecCli,
            T00L76_A4529HreFecTin, T00L76_n4529HreFecTin, T00L76_A4530HreFecFpr, T00L76_n4530HreFecFpr, T00L76_A4531HreBarMat, T00L76_n4531HreBarMat, T00L76_A4532HreBarKgm, T00L76_n4532HreBarKgm, T00L76_A4533HreBarMtr, T00L76_n4533HreBarMtr,
            T00L76_A4534HreBarPie, T00L76_n4534HreBarPie, T00L76_A4535HrePartCod, T00L76_n4535HrePartCod, T00L76_A4536HreBarNMtr, T00L76_n4536HreBarNMtr, T00L76_A4537HreBarNMez, T00L76_n4537HreBarNMez, T00L76_A4538HreNumTen, T00L76_n4538HreNumTen,
            T00L76_A4539HreIntCod, T00L76_n4539HreIntCod, T00L76_A4540HreIntDsc, T00L76_n4540HreIntDsc, T00L76_A4541HreNumTon, T00L76_n4541HreNumTon, T00L76_A4496HreMaqHdr, T00L76_n4496HreMaqHdr, T00L76_A4542HreTotKgm, T00L76_n4542HreTotKgm,
            T00L76_A4543HreTotMtr, T00L76_n4543HreTotMtr, T00L76_A4544HreTotPie, T00L76_n4544HreTotPie, T00L76_A8608HreNumColF, T00L76_n8608HreNumColF, T00L76_A8610HreFamCodT, T00L76_n8610HreFamCodT, T00L76_A8623HreHilasa, T00L76_n8623HreHilasa,
            T00L76_A8624HreEnsayo, T00L76_n8624HreEnsayo, T00L76_A8625HreOpa, T00L76_n8625HreOpa, T00L76_A8626HreOpn, T00L76_n8626HreOpn, T00L76_A11318HreDispCli, T00L76_n11318HreDispCli, T00L76_A11320HreMacCod, T00L76_n11320HreMacCod,
            T00L76_A12264HreNInter, T00L76_n12264HreNInter, T00L76_A12535HreCencId, T00L76_n12535HreCencId, T00L76_A12536HreCenDsc, T00L76_n12536HreCenDsc, T00L76_A13450HreComp1, T00L76_n13450HreComp1, T00L76_A13451HreComp2, T00L76_n13451HreComp2,
            T00L76_A13763HreUser, T00L76_A13764HreDiaHora, T00L76_A13765HreCdn2, T00L76_A13766HreCtw, T00L76_A396EmprCod, T00L76_A252CliCod, T00L76_n252CliCod
            }
            , new Object[] {
            T00L77_A4492HreBarCod, T00L77_A4493HreBarReo, T00L77_A4494HreBarPar, T00L77_A4495HreNumCie, T00L77_A4516HreDisCli, T00L77_n4516HreDisCli, T00L77_A4517HreBarSer, T00L77_n4517HreBarSer, T00L77_A4518HreBarDsc, T00L77_n4518HreBarDsc,
            T00L77_A4519HreTipArt, T00L77_n4519HreTipArt, T00L77_A4520HreTipArtD, T00L77_n4520HreTipArtD, T00L77_A4521HreColNom, T00L77_n4521HreColNom, T00L77_A4522HreColNum, T00L77_n4522HreColNum, T00L77_A4523HreColNomC, T00L77_n4523HreColNomC,
            T00L77_A4524HreColNumC, T00L77_n4524HreColNumC, T00L77_A4525HreTipCol, T00L77_n4525HreTipCol, T00L77_A4526HreTipColN, T00L77_n4526HreTipColN, T00L77_A4527HreFecGen, T00L77_n4527HreFecGen, T00L77_A4528HreFecCli, T00L77_n4528HreFecCli,
            T00L77_A4529HreFecTin, T00L77_n4529HreFecTin, T00L77_A4530HreFecFpr, T00L77_n4530HreFecFpr, T00L77_A4531HreBarMat, T00L77_n4531HreBarMat, T00L77_A4532HreBarKgm, T00L77_n4532HreBarKgm, T00L77_A4533HreBarMtr, T00L77_n4533HreBarMtr,
            T00L77_A4534HreBarPie, T00L77_n4534HreBarPie, T00L77_A4535HrePartCod, T00L77_n4535HrePartCod, T00L77_A4536HreBarNMtr, T00L77_n4536HreBarNMtr, T00L77_A4537HreBarNMez, T00L77_n4537HreBarNMez, T00L77_A4538HreNumTen, T00L77_n4538HreNumTen,
            T00L77_A4539HreIntCod, T00L77_n4539HreIntCod, T00L77_A4540HreIntDsc, T00L77_n4540HreIntDsc, T00L77_A4541HreNumTon, T00L77_n4541HreNumTon, T00L77_A4496HreMaqHdr, T00L77_n4496HreMaqHdr, T00L77_A4542HreTotKgm, T00L77_n4542HreTotKgm,
            T00L77_A4543HreTotMtr, T00L77_n4543HreTotMtr, T00L77_A4544HreTotPie, T00L77_n4544HreTotPie, T00L77_A8608HreNumColF, T00L77_n8608HreNumColF, T00L77_A8610HreFamCodT, T00L77_n8610HreFamCodT, T00L77_A8623HreHilasa, T00L77_n8623HreHilasa,
            T00L77_A8624HreEnsayo, T00L77_n8624HreEnsayo, T00L77_A8625HreOpa, T00L77_n8625HreOpa, T00L77_A8626HreOpn, T00L77_n8626HreOpn, T00L77_A11318HreDispCli, T00L77_n11318HreDispCli, T00L77_A11320HreMacCod, T00L77_n11320HreMacCod,
            T00L77_A12264HreNInter, T00L77_n12264HreNInter, T00L77_A12535HreCencId, T00L77_n12535HreCencId, T00L77_A12536HreCenDsc, T00L77_n12536HreCenDsc, T00L77_A13450HreComp1, T00L77_n13450HreComp1, T00L77_A13451HreComp2, T00L77_n13451HreComp2,
            T00L77_A13763HreUser, T00L77_A13764HreDiaHora, T00L77_A13765HreCdn2, T00L77_A13766HreCtw, T00L77_A396EmprCod, T00L77_A252CliCod, T00L77_n252CliCod
            }
            , new Object[] {
            T00L78_A407EmprNom, T00L78_n407EmprNom
            }
            , new Object[] {
            T00L79_A279CliNom
            }
            , new Object[] {
            T00L710_A4492HreBarCod, T00L710_A4493HreBarReo, T00L710_A4494HreBarPar, T00L710_A4495HreNumCie, T00L710_A407EmprNom, T00L710_n407EmprNom, T00L710_A4516HreDisCli, T00L710_n4516HreDisCli, T00L710_A279CliNom, T00L710_A4517HreBarSer,
            T00L710_n4517HreBarSer, T00L710_A4518HreBarDsc, T00L710_n4518HreBarDsc, T00L710_A4519HreTipArt, T00L710_n4519HreTipArt, T00L710_A4520HreTipArtD, T00L710_n4520HreTipArtD, T00L710_A4521HreColNom, T00L710_n4521HreColNom, T00L710_A4522HreColNum,
            T00L710_n4522HreColNum, T00L710_A4523HreColNomC, T00L710_n4523HreColNomC, T00L710_A4524HreColNumC, T00L710_n4524HreColNumC, T00L710_A4525HreTipCol, T00L710_n4525HreTipCol, T00L710_A4526HreTipColN, T00L710_n4526HreTipColN, T00L710_A4527HreFecGen,
            T00L710_n4527HreFecGen, T00L710_A4528HreFecCli, T00L710_n4528HreFecCli, T00L710_A4529HreFecTin, T00L710_n4529HreFecTin, T00L710_A4530HreFecFpr, T00L710_n4530HreFecFpr, T00L710_A4531HreBarMat, T00L710_n4531HreBarMat, T00L710_A4532HreBarKgm,
            T00L710_n4532HreBarKgm, T00L710_A4533HreBarMtr, T00L710_n4533HreBarMtr, T00L710_A4534HreBarPie, T00L710_n4534HreBarPie, T00L710_A4535HrePartCod, T00L710_n4535HrePartCod, T00L710_A4536HreBarNMtr, T00L710_n4536HreBarNMtr, T00L710_A4537HreBarNMez,
            T00L710_n4537HreBarNMez, T00L710_A4538HreNumTen, T00L710_n4538HreNumTen, T00L710_A4539HreIntCod, T00L710_n4539HreIntCod, T00L710_A4540HreIntDsc, T00L710_n4540HreIntDsc, T00L710_A4541HreNumTon, T00L710_n4541HreNumTon, T00L710_A4496HreMaqHdr,
            T00L710_n4496HreMaqHdr, T00L710_A4542HreTotKgm, T00L710_n4542HreTotKgm, T00L710_A4543HreTotMtr, T00L710_n4543HreTotMtr, T00L710_A4544HreTotPie, T00L710_n4544HreTotPie, T00L710_A8608HreNumColF, T00L710_n8608HreNumColF, T00L710_A8610HreFamCodT,
            T00L710_n8610HreFamCodT, T00L710_A8623HreHilasa, T00L710_n8623HreHilasa, T00L710_A8624HreEnsayo, T00L710_n8624HreEnsayo, T00L710_A8625HreOpa, T00L710_n8625HreOpa, T00L710_A8626HreOpn, T00L710_n8626HreOpn, T00L710_A11318HreDispCli,
            T00L710_n11318HreDispCli, T00L710_A11320HreMacCod, T00L710_n11320HreMacCod, T00L710_A12264HreNInter, T00L710_n12264HreNInter, T00L710_A12535HreCencId, T00L710_n12535HreCencId, T00L710_A12536HreCenDsc, T00L710_n12536HreCenDsc, T00L710_A13450HreComp1,
            T00L710_n13450HreComp1, T00L710_A13451HreComp2, T00L710_n13451HreComp2, T00L710_A13763HreUser, T00L710_A13764HreDiaHora, T00L710_A13765HreCdn2, T00L710_A13766HreCtw, T00L710_A396EmprCod, T00L710_A252CliCod, T00L710_n252CliCod
            }
            , new Object[] {
            T00L711_A407EmprNom, T00L711_n407EmprNom
            }
            , new Object[] {
            T00L712_A279CliNom
            }
            , new Object[] {
            T00L713_A396EmprCod, T00L713_A4492HreBarCod, T00L713_A4493HreBarReo, T00L713_A4494HreBarPar, T00L713_A4495HreNumCie
            }
            , new Object[] {
            T00L714_A396EmprCod, T00L714_A4492HreBarCod, T00L714_A4493HreBarReo, T00L714_A4494HreBarPar, T00L714_A4495HreNumCie
            }
            , new Object[] {
            T00L715_A396EmprCod, T00L715_A4492HreBarCod, T00L715_A4493HreBarReo, T00L715_A4494HreBarPar, T00L715_A4495HreNumCie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L719_A407EmprNom, T00L719_n407EmprNom
            }
            , new Object[] {
            T00L720_A279CliNom
            }
            , new Object[] {
            T00L721_A396EmprCod, T00L721_A4492HreBarCod, T00L721_A4493HreBarReo, T00L721_A4494HreBarPar, T00L721_A4495HreNumCie, T00L721_A9985HreAcCod, T00L721_A9986HreAcReo, T00L721_A9987HreAcPar
            }
            , new Object[] {
            T00L722_A396EmprCod, T00L722_A4492HreBarCod, T00L722_A4493HreBarReo, T00L722_A4494HreBarPar, T00L722_A4495HreNumCie, T00L722_A5864HreProCodP, T00L722_A5865HreOrdLinF
            }
            , new Object[] {
            T00L723_A396EmprCod, T00L723_A4492HreBarCod, T00L723_A4493HreBarReo, T00L723_A4494HreBarPar, T00L723_A4495HreNumCie, T00L723_A4545HreLinMaq
            }
            , new Object[] {
            T00L724_A396EmprCod, T00L724_A4492HreBarCod, T00L724_A4493HreBarReo, T00L724_A4494HreBarPar, T00L724_A4495HreNumCie, T00L724_A4508HreLinMAL, T00L724_A4509HreNumAny, T00L724_A719PrdNum
            }
            , new Object[] {
            T00L725_A396EmprCod, T00L725_A4492HreBarCod, T00L725_A4493HreBarReo, T00L725_A4494HreBarPar, T00L725_A4495HreNumCie, T00L725_A4497HreAgrCod, T00L725_A4498HreAgrReo, T00L725_A4499HreAgrPar
            }
            , new Object[] {
            T00L726_A396EmprCod, T00L726_A4492HreBarCod, T00L726_A4493HreBarReo, T00L726_A4494HreBarPar, T00L726_A4495HreNumCie
            }
            , new Object[] {
            T00L727_A4492HreBarCod, T00L727_A4493HreBarReo, T00L727_A4494HreBarPar, T00L727_A4495HreNumCie, T00L727_A4545HreLinMaq, T00L727_A4546HreMaqCod, T00L727_n4546HreMaqCod, T00L727_A4547HreVolPrd, T00L727_n4547HreVolPrd, T00L727_A4548HreFacAbs,
            T00L727_n4548HreFacAbs, T00L727_A4584HreFecPes, T00L727_n4584HreFecPes, T00L727_A4585HreMaqPes, T00L727_n4585HreMaqPes, T00L727_A4549HreULinPro, T00L727_n4549HreULinPro, T00L727_A4863HreUsrCod, T00L727_n4863HreUsrCod, T00L727_A7814HReMaqNh,
            T00L727_n7814HReMaqNh, T00L727_A7815HReMaqVX, T00L727_n7815HReMaqVX, T00L727_A7816HReMaqBL, T00L727_n7816HReMaqBL, T00L727_A7817HReMaqFlow, T00L727_n7817HReMaqFlow, T00L727_A7818HReMaqRPM, T00L727_n7818HReMaqRPM, T00L727_A7819HReMaqMol,
            T00L727_n7819HReMaqMol, T00L727_A7820HReMaqTor, T00L727_n7820HReMaqTor, T00L727_A7821HReMaqCla, T00L727_n7821HReMaqCla, T00L727_A7822HReMaqTej, T00L727_n7822HReMaqTej, T00L727_A7823HReMaqDel, T00L727_n7823HReMaqDel, T00L727_A7824HReMaqPML,
            T00L727_n7824HReMaqPML, T00L727_A8602HreCosAA, T00L727_n8602HreCosAA, T00L727_A8603HrecosAd, T00L727_n8603HrecosAd, T00L727_A8604HreCosAnc, T00L727_n8604HreCosAnc, T00L727_A8605HreCosCol, T00L727_n8605HreCosCol, T00L727_A8606HreCosPA,
            T00L727_n8606HreCosPA, T00L727_A8607HreCosPD, T00L727_n8607HreCosPD, T00L727_A9780HreLtsSb, T00L727_n9780HreLtsSb, T00L727_A9781HreLtsRm, T00L727_n9781HreLtsRm, T00L727_A9803HreAcaQ, T00L727_n9803HreAcaQ, T00L727_A9804HreAcab,
            T00L727_n9804HreAcab, T00L727_A1094HreNPrg, T00L727_n1094HreNPrg, T00L727_A697HreLotF, T00L727_n697HreLotF, T00L727_A10381HreAnc, T00L727_n10381HreAnc, T00L727_A10382HreGrm, T00L727_n10382HreGrm, T00L727_A10383HreVel,
            T00L727_n10383HreVel, T00L727_A10384HreObs, T00L727_n10384HreObs, T00L727_A11508HreAva, T00L727_n11508HreAva, T00L727_A12126HreAs, T00L727_n12126HreAs, T00L727_A12127HreAi, T00L727_n12127HreAi, T00L727_A396EmprCod
            }
            , new Object[] {
            T00L728_A396EmprCod, T00L728_A4492HreBarCod, T00L728_A4493HreBarReo, T00L728_A4494HreBarPar, T00L728_A4495HreNumCie, T00L728_A4545HreLinMaq
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L732_A396EmprCod, T00L732_A4492HreBarCod, T00L732_A4493HreBarReo, T00L732_A4494HreBarPar, T00L732_A4495HreNumCie, T00L732_A4545HreLinMaq, T00L732_A14278HreNormId
            }
            , new Object[] {
            T00L733_A396EmprCod, T00L733_A4492HreBarCod, T00L733_A4493HreBarReo, T00L733_A4494HreBarPar, T00L733_A4495HreNumCie, T00L733_A4545HreLinMaq, T00L733_A14282HreTraID
            }
            , new Object[] {
            T00L734_A396EmprCod, T00L734_A4492HreBarCod, T00L734_A4493HreBarReo, T00L734_A4494HreBarPar, T00L734_A4495HreNumCie, T00L734_A4545HreLinMaq, T00L734_A4550HreLinPro, T00L734_A4557HreRecLin
            }
            , new Object[] {
            T00L735_A396EmprCod, T00L735_A4492HreBarCod, T00L735_A4493HreBarReo, T00L735_A4494HreBarPar, T00L735_A4495HreNumCie, T00L735_A4545HreLinMaq, T00L735_A11322HreLinObs
            }
            , new Object[] {
            T00L736_A396EmprCod, T00L736_A4492HreBarCod, T00L736_A4493HreBarReo, T00L736_A4494HreBarPar, T00L736_A4495HreNumCie, T00L736_A4545HreLinMaq
            }
            , new Object[] {
            T00L737_A4492HreBarCod, T00L737_A4493HreBarReo, T00L737_A4494HreBarPar, T00L737_A4495HreNumCie, T00L737_A4545HreLinMaq, T00L737_A4550HreLinPro, T00L737_A4551HreProCod, T00L737_A4552HreProDsc, T00L737_A4553HreProTie, T00L737_A4554HreProTmx,
            T00L737_A4555HreNumPro, T00L737_A4556HreNumRec, T00L737_A10545HreNH2O, T00L737_A396EmprCod
            }
            , new Object[] {
            T00L738_A396EmprCod, T00L738_A4492HreBarCod, T00L738_A4493HreBarReo, T00L738_A4494HreBarPar, T00L738_A4495HreNumCie, T00L738_A4545HreLinMaq, T00L738_A4550HreLinPro
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L742_A396EmprCod, T00L742_A4492HreBarCod, T00L742_A4493HreBarReo, T00L742_A4494HreBarPar, T00L742_A4495HreNumCie, T00L742_A4545HreLinMaq, T00L742_A4550HreLinPro, T00L742_A4557HreRecLin
            }
            , new Object[] {
            T00L743_A396EmprCod, T00L743_A4492HreBarCod, T00L743_A4493HreBarReo, T00L743_A4494HreBarPar, T00L743_A4495HreNumCie, T00L743_A4545HreLinMaq, T00L743_A4550HreLinPro
            }
         }
      );
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z4525HreTipCol ;
   private byte Z4539HreIntCod ;
   private byte Z8626HreOpn ;
   private byte Z4585HreMaqPes ;
   private byte Z4549HreULinPro ;
   private byte Z7815HReMaqVX ;
   private byte Z7816HReMaqBL ;
   private byte Z7817HReMaqFlow ;
   private byte Z7822HReMaqTej ;
   private byte Z7823HReMaqDel ;
   private byte Z4550HreLinPro ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A8626HreOpn ;
   private byte A4550HreLinPro ;
   private byte A4585HreMaqPes ;
   private byte A4549HreULinPro ;
   private byte A7815HReMaqVX ;
   private byte A7816HReMaqBL ;
   private byte A7817HReMaqFlow ;
   private byte A7822HReMaqTej ;
   private byte A7823HReMaqDel ;
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
   private byte ZZ8626HreOpn ;
   private short Z4519HreTipArt ;
   private short Z8610HreFamCodT ;
   private short Z12535HreCencId ;
   private short Z4545HreLinMaq ;
   private short Z7814HReMaqNh ;
   private short Z7818HReMaqRPM ;
   private short Z7819HReMaqMol ;
   private short Z7820HReMaqTor ;
   private short Z7824HReMaqPML ;
   private short Z10381HreAnc ;
   private short Z10382HreGrm ;
   private short nRcdDeleted_678 ;
   private short nRcdExists_678 ;
   private short nIsMod_678 ;
   private short Z4553HreProTie ;
   private short Z4554HreProTmx ;
   private short Z10545HreNH2O ;
   private short nRcdDeleted_1874 ;
   private short nRcdExists_1874 ;
   private short nIsMod_1874 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4519HreTipArt ;
   private short A8610HreFamCodT ;
   private short A12535HreCencId ;
   private short nBlankRcdCount678 ;
   private short RcdFound678 ;
   private short nBlankRcdUsr678 ;
   private short RcdFound1874 ;
   private short A4553HreProTie ;
   private short A4554HreProTmx ;
   private short A10545HreNH2O ;
   private short A4545HreLinMaq ;
   private short A7814HReMaqNh ;
   private short A7818HReMaqRPM ;
   private short A7819HReMaqMol ;
   private short A7820HReMaqTor ;
   private short A7824HReMaqPML ;
   private short A10381HreAnc ;
   private short A10382HreGrm ;
   private short RcdFound675 ;
   private short nIsDirty_675 ;
   private short nIsDirty_678 ;
   private short nIsDirty_1874 ;
   private short nBlankRcdCount1874 ;
   private short nBlankRcdUsr1874 ;
   private short subGrid1_Borderwidth ;
   private short ZZ4519HreTipArt ;
   private short ZZ8610HreFamCodT ;
   private short ZZ12535HreCencId ;
   private int Z4492HreBarCod ;
   private int Z4522HreColNum ;
   private int Z4524HreColNumC ;
   private int Z4534HreBarPie ;
   private int Z4544HreTotPie ;
   private int Z8608HreNumColF ;
   private int Z8624HreEnsayo ;
   private int Z11320HreMacCod ;
   private int Z12264HreNInter ;
   private int Z252CliCod ;
   private int nRC_GXsfl_275 ;
   private int nGXsfl_275_idx=1 ;
   private int Z4547HreVolPrd ;
   private int Z9780HreLtsSb ;
   private int Z9781HreLtsRm ;
   private int nRC_GXsfl_472 ;
   private int nGXsfl_472_idx=1 ;
   private int Z4555HreNumPro ;
   private int Z4556HreNumRec ;
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
   private int A8608HreNumColF ;
   private int edtHreNumColF_Enabled ;
   private int edtHreFamCodT_Enabled ;
   private int edtHreHilasa_Enabled ;
   private int A8624HreEnsayo ;
   private int edtHreEnsayo_Enabled ;
   private int edtHreOpa_Enabled ;
   private int edtHreOpn_Enabled ;
   private int edtHreDispCli_Enabled ;
   private int A11320HreMacCod ;
   private int edtHreMacCod_Enabled ;
   private int A12264HreNInter ;
   private int edtHreNInter_Enabled ;
   private int edtHreCencId_Enabled ;
   private int edtHreCenDsc_Enabled ;
   private int edtHreComp1_Enabled ;
   private int edtHreComp2_Enabled ;
   private int edtHreLinMaq_Enabled ;
   private int edtHreMaqCod_Enabled ;
   private int edtHreVolPrd_Enabled ;
   private int edtHreFacAbs_Enabled ;
   private int edtHreFecPes_Enabled ;
   private int edtHreMaqPes_Enabled ;
   private int edtHreULinPro_Enabled ;
   private int edtHreUsrCod_Enabled ;
   private int edtHReMaqNh_Enabled ;
   private int edtHReMaqVX_Enabled ;
   private int edtHReMaqBL_Enabled ;
   private int edtHReMaqFlow_Enabled ;
   private int edtHReMaqRPM_Enabled ;
   private int edtHReMaqMol_Enabled ;
   private int edtHReMaqTor_Enabled ;
   private int edtHReMaqCla_Enabled ;
   private int edtHReMaqTej_Enabled ;
   private int edtHReMaqDel_Enabled ;
   private int edtHReMaqPML_Enabled ;
   private int edtHreCosAA_Enabled ;
   private int edtHrecosAd_Enabled ;
   private int edtHreCosAnc_Enabled ;
   private int edtHreCosCol_Enabled ;
   private int edtHreCosPA_Enabled ;
   private int edtHreCosPD_Enabled ;
   private int edtHreLtsSb_Enabled ;
   private int edtHreLtsRm_Enabled ;
   private int edtHreAcaQ_Enabled ;
   private int edtHreAcab_Enabled ;
   private int edtHreNPrg_Enabled ;
   private int edtHreLotF_Enabled ;
   private int edtHreAnc_Enabled ;
   private int edtHreGrm_Enabled ;
   private int edtHreVel_Enabled ;
   private int edtHreObs_Enabled ;
   private int edtHreAva_Enabled ;
   private int edtHreAs_Enabled ;
   private int edtHreAi_Enabled ;
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
   private int edtHreLinPro_Enabled ;
   private int edtHreProCod_Enabled ;
   private int edtHreProDsc_Enabled ;
   private int edtHreProTie_Enabled ;
   private int edtHreProTmx_Enabled ;
   private int edtHreNumPro_Enabled ;
   private int edtHreNumRec_Enabled ;
   private int edtHreNH2O_Enabled ;
   private int A4547HreVolPrd ;
   private int A9780HreLtsSb ;
   private int A9781HreLtsRm ;
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
   private int edtHreComp2_Backcolor ;
   private int edtHreComp1_Backcolor ;
   private int edtHreCenDsc_Backcolor ;
   private int edtHreCencId_Backcolor ;
   private int edtHreNInter_Backcolor ;
   private int edtHreMacCod_Backcolor ;
   private int edtHreDispCli_Backcolor ;
   private int edtHreOpn_Backcolor ;
   private int edtHreOpa_Backcolor ;
   private int edtHreEnsayo_Backcolor ;
   private int edtHreHilasa_Backcolor ;
   private int edtHreFamCodT_Backcolor ;
   private int edtHreNumColF_Backcolor ;
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
   private int ZZ8608HreNumColF ;
   private int ZZ8624HreEnsayo ;
   private int ZZ11320HreMacCod ;
   private int ZZ12264HreNInter ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z4532HreBarKgm ;
   private java.math.BigDecimal Z4533HreBarMtr ;
   private java.math.BigDecimal Z4542HreTotKgm ;
   private java.math.BigDecimal Z4543HreTotMtr ;
   private java.math.BigDecimal Z4548HreFacAbs ;
   private java.math.BigDecimal Z8602HreCosAA ;
   private java.math.BigDecimal Z8603HrecosAd ;
   private java.math.BigDecimal Z8604HreCosAnc ;
   private java.math.BigDecimal Z8605HreCosCol ;
   private java.math.BigDecimal Z8606HreCosPA ;
   private java.math.BigDecimal Z8607HreCosPD ;
   private java.math.BigDecimal Z10383HreVel ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4533HreBarMtr ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A4543HreTotMtr ;
   private java.math.BigDecimal A4548HreFacAbs ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A10383HreVel ;
   private java.math.BigDecimal ZZ4532HreBarKgm ;
   private java.math.BigDecimal ZZ4533HreBarMtr ;
   private java.math.BigDecimal ZZ4542HreTotKgm ;
   private java.math.BigDecimal ZZ4543HreTotMtr ;
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
   private String Z8623HreHilasa ;
   private String Z8625HreOpa ;
   private String Z11318HreDispCli ;
   private String Z12536HreCenDsc ;
   private String Z13450HreComp1 ;
   private String Z13451HreComp2 ;
   private String Z13763HreUser ;
   private String Z13765HreCdn2 ;
   private String Z13766HreCtw ;
   private String Z4546HreMaqCod ;
   private String Z4863HreUsrCod ;
   private String Z7821HReMaqCla ;
   private String Z9803HreAcaQ ;
   private String Z9804HreAcab ;
   private String Z1094HreNPrg ;
   private String Z697HreLotF ;
   private String Z11508HreAva ;
   private String Z12126HreAs ;
   private String Z12127HreAi ;
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
   private String edtEmprCod_Internalname ;
   private String sGXsfl_275_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_472_idx="0001" ;
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
   private String edtEmprCod_Jsonclick ;
   private String lblTextblock2_Internalname ;
   private String lblTextblock2_Jsonclick ;
   private String edtHreBarCod_Internalname ;
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
   private String edtHreNumColF_Internalname ;
   private String edtHreNumColF_Jsonclick ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock40_Jsonclick ;
   private String edtHreFamCodT_Internalname ;
   private String edtHreFamCodT_Jsonclick ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock41_Jsonclick ;
   private String edtHreHilasa_Internalname ;
   private String A8623HreHilasa ;
   private String edtHreHilasa_Jsonclick ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock42_Jsonclick ;
   private String edtHreEnsayo_Internalname ;
   private String edtHreEnsayo_Jsonclick ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock43_Jsonclick ;
   private String edtHreOpa_Internalname ;
   private String A8625HreOpa ;
   private String edtHreOpa_Jsonclick ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock44_Jsonclick ;
   private String edtHreOpn_Internalname ;
   private String edtHreOpn_Jsonclick ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock45_Jsonclick ;
   private String edtHreDispCli_Internalname ;
   private String A11318HreDispCli ;
   private String edtHreDispCli_Jsonclick ;
   private String lblTextblock46_Internalname ;
   private String lblTextblock46_Jsonclick ;
   private String edtHreMacCod_Internalname ;
   private String edtHreMacCod_Jsonclick ;
   private String lblTextblock47_Internalname ;
   private String lblTextblock47_Jsonclick ;
   private String edtHreNInter_Internalname ;
   private String edtHreNInter_Jsonclick ;
   private String lblTextblock48_Internalname ;
   private String lblTextblock48_Jsonclick ;
   private String edtHreCencId_Internalname ;
   private String edtHreCencId_Jsonclick ;
   private String lblTextblock49_Internalname ;
   private String lblTextblock49_Jsonclick ;
   private String edtHreCenDsc_Internalname ;
   private String A12536HreCenDsc ;
   private String edtHreCenDsc_Jsonclick ;
   private String lblTextblock50_Internalname ;
   private String lblTextblock50_Jsonclick ;
   private String edtHreComp1_Internalname ;
   private String A13450HreComp1 ;
   private String edtHreComp1_Jsonclick ;
   private String lblTextblock51_Internalname ;
   private String lblTextblock51_Jsonclick ;
   private String edtHreComp2_Internalname ;
   private String A13451HreComp2 ;
   private String edtHreComp2_Jsonclick ;
   private String sMode678 ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreMaqCod_Internalname ;
   private String edtHreVolPrd_Internalname ;
   private String edtHreFacAbs_Internalname ;
   private String edtHreFecPes_Internalname ;
   private String edtHreMaqPes_Internalname ;
   private String edtHreULinPro_Internalname ;
   private String edtHreUsrCod_Internalname ;
   private String edtHReMaqNh_Internalname ;
   private String edtHReMaqVX_Internalname ;
   private String edtHReMaqBL_Internalname ;
   private String edtHReMaqFlow_Internalname ;
   private String edtHReMaqRPM_Internalname ;
   private String edtHReMaqMol_Internalname ;
   private String edtHReMaqTor_Internalname ;
   private String edtHReMaqCla_Internalname ;
   private String edtHReMaqTej_Internalname ;
   private String edtHReMaqDel_Internalname ;
   private String edtHReMaqPML_Internalname ;
   private String edtHreCosAA_Internalname ;
   private String edtHrecosAd_Internalname ;
   private String edtHreCosAnc_Internalname ;
   private String edtHreCosCol_Internalname ;
   private String edtHreCosPA_Internalname ;
   private String edtHreCosPD_Internalname ;
   private String edtHreLtsSb_Internalname ;
   private String edtHreLtsRm_Internalname ;
   private String edtHreAcaQ_Internalname ;
   private String edtHreAcab_Internalname ;
   private String edtHreNPrg_Internalname ;
   private String edtHreLotF_Internalname ;
   private String edtHreAnc_Internalname ;
   private String edtHreGrm_Internalname ;
   private String edtHreVel_Internalname ;
   private String edtHreObs_Internalname ;
   private String edtHreAva_Internalname ;
   private String edtHreAs_Internalname ;
   private String edtHreAi_Internalname ;
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
   private String A13763HreUser ;
   private String A13765HreCdn2 ;
   private String A13766HreCtw ;
   private String A13842BarNhdr_Hi ;
   private String hsh ;
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
   private String edtHreNH2O_Internalname ;
   private String A4546HreMaqCod ;
   private String A4863HreUsrCod ;
   private String A7821HReMaqCla ;
   private String A9803HreAcaQ ;
   private String A9804HreAcab ;
   private String A1094HreNPrg ;
   private String A697HreLotF ;
   private String A11508HreAva ;
   private String A12126HreAs ;
   private String A12127HreAi ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String sMode1874 ;
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
   private String lblTextblock71_Internalname ;
   private String lblTextblock72_Internalname ;
   private String lblTextblock73_Internalname ;
   private String lblTextblock74_Internalname ;
   private String lblTextblock75_Internalname ;
   private String lblTextblock76_Internalname ;
   private String lblTextblock77_Internalname ;
   private String lblTextblock78_Internalname ;
   private String lblTextblock79_Internalname ;
   private String lblTextblock80_Internalname ;
   private String lblTextblock81_Internalname ;
   private String lblTextblock82_Internalname ;
   private String lblTextblock83_Internalname ;
   private String lblTextblock84_Internalname ;
   private String lblTextblock85_Internalname ;
   private String lblTextblock86_Internalname ;
   private String lblTextblock87_Internalname ;
   private String lblTextblock88_Internalname ;
   private String lblTextblock89_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_275_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock52_Jsonclick ;
   private String ROClassString ;
   private String edtHreLinMaq_Jsonclick ;
   private String lblTextblock53_Jsonclick ;
   private String edtHreMaqCod_Jsonclick ;
   private String lblTextblock54_Jsonclick ;
   private String edtHreVolPrd_Jsonclick ;
   private String lblTextblock55_Jsonclick ;
   private String edtHreFacAbs_Jsonclick ;
   private String lblTextblock56_Jsonclick ;
   private String edtHreFecPes_Jsonclick ;
   private String lblTextblock57_Jsonclick ;
   private String edtHreMaqPes_Jsonclick ;
   private String lblTextblock58_Jsonclick ;
   private String edtHreULinPro_Jsonclick ;
   private String lblTextblock59_Jsonclick ;
   private String edtHreUsrCod_Jsonclick ;
   private String lblTextblock60_Jsonclick ;
   private String edtHReMaqNh_Jsonclick ;
   private String lblTextblock61_Jsonclick ;
   private String edtHReMaqVX_Jsonclick ;
   private String lblTextblock62_Jsonclick ;
   private String edtHReMaqBL_Jsonclick ;
   private String lblTextblock63_Jsonclick ;
   private String edtHReMaqFlow_Jsonclick ;
   private String lblTextblock64_Jsonclick ;
   private String edtHReMaqRPM_Jsonclick ;
   private String lblTextblock65_Jsonclick ;
   private String edtHReMaqMol_Jsonclick ;
   private String lblTextblock66_Jsonclick ;
   private String edtHReMaqTor_Jsonclick ;
   private String lblTextblock67_Jsonclick ;
   private String edtHReMaqCla_Jsonclick ;
   private String lblTextblock68_Jsonclick ;
   private String edtHReMaqTej_Jsonclick ;
   private String lblTextblock69_Jsonclick ;
   private String edtHReMaqDel_Jsonclick ;
   private String lblTextblock70_Jsonclick ;
   private String edtHReMaqPML_Jsonclick ;
   private String lblTextblock71_Jsonclick ;
   private String edtHreCosAA_Jsonclick ;
   private String lblTextblock72_Jsonclick ;
   private String edtHrecosAd_Jsonclick ;
   private String lblTextblock73_Jsonclick ;
   private String edtHreCosAnc_Jsonclick ;
   private String lblTextblock74_Jsonclick ;
   private String edtHreCosCol_Jsonclick ;
   private String lblTextblock75_Jsonclick ;
   private String edtHreCosPA_Jsonclick ;
   private String lblTextblock76_Jsonclick ;
   private String edtHreCosPD_Jsonclick ;
   private String lblTextblock77_Jsonclick ;
   private String edtHreLtsSb_Jsonclick ;
   private String lblTextblock78_Jsonclick ;
   private String edtHreLtsRm_Jsonclick ;
   private String lblTextblock79_Jsonclick ;
   private String edtHreAcaQ_Jsonclick ;
   private String lblTextblock80_Jsonclick ;
   private String edtHreAcab_Jsonclick ;
   private String lblTextblock81_Jsonclick ;
   private String edtHreNPrg_Jsonclick ;
   private String lblTextblock82_Jsonclick ;
   private String edtHreLotF_Jsonclick ;
   private String lblTextblock83_Jsonclick ;
   private String edtHreAnc_Jsonclick ;
   private String lblTextblock84_Jsonclick ;
   private String edtHreGrm_Jsonclick ;
   private String lblTextblock85_Jsonclick ;
   private String edtHreVel_Jsonclick ;
   private String lblTextblock86_Jsonclick ;
   private String lblTextblock87_Jsonclick ;
   private String edtHreAva_Jsonclick ;
   private String lblTextblock88_Jsonclick ;
   private String edtHreAs_Jsonclick ;
   private String lblTextblock89_Jsonclick ;
   private String edtHreAi_Jsonclick ;
   private String sGXsfl_472_fel_idx="0001" ;
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
   private String edtHreNH2O_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock52_Caption ;
   private String lblTextblock35_Caption ;
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
   private String lblTextblock71_Caption ;
   private String lblTextblock72_Caption ;
   private String lblTextblock73_Caption ;
   private String lblTextblock74_Caption ;
   private String lblTextblock75_Caption ;
   private String lblTextblock76_Caption ;
   private String lblTextblock77_Caption ;
   private String lblTextblock78_Caption ;
   private String lblTextblock79_Caption ;
   private String lblTextblock80_Caption ;
   private String lblTextblock81_Caption ;
   private String lblTextblock82_Caption ;
   private String lblTextblock83_Caption ;
   private String lblTextblock84_Caption ;
   private String lblTextblock85_Caption ;
   private String lblTextblock86_Caption ;
   private String lblTextblock87_Caption ;
   private String lblTextblock88_Caption ;
   private String lblTextblock89_Caption ;
   private String subGrid2_Header ;
   private String Z13842BarNhdr_Hi ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
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
   private String ZZ8623HreHilasa ;
   private String ZZ8625HreOpa ;
   private String ZZ11318HreDispCli ;
   private String ZZ12536HreCenDsc ;
   private String ZZ13450HreComp1 ;
   private String ZZ13451HreComp2 ;
   private String ZZ13763HreUser ;
   private String ZZ13765HreCdn2 ;
   private String ZZ13766HreCtw ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ13842BarNhdr_Hi ;
   private java.util.Date Z13764HreDiaHora ;
   private java.util.Date Z4584HreFecPes ;
   private java.util.Date A13764HreDiaHora ;
   private java.util.Date A4584HreFecPes ;
   private java.util.Date ZZ13764HreDiaHora ;
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
   private boolean bGXsfl_275_Refreshing=false ;
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
   private boolean n8608HreNumColF ;
   private boolean n8610HreFamCodT ;
   private boolean n8623HreHilasa ;
   private boolean n8624HreEnsayo ;
   private boolean n8625HreOpa ;
   private boolean n8626HreOpn ;
   private boolean n11318HreDispCli ;
   private boolean n11320HreMacCod ;
   private boolean n12264HreNInter ;
   private boolean n12535HreCencId ;
   private boolean n12536HreCenDsc ;
   private boolean n13450HreComp1 ;
   private boolean n13451HreComp2 ;
   private boolean bGXsfl_472_Refreshing=false ;
   private boolean Gx_longc ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean n4548HreFacAbs ;
   private boolean n4584HreFecPes ;
   private boolean n4585HreMaqPes ;
   private boolean n4549HreULinPro ;
   private boolean n4863HreUsrCod ;
   private boolean n7814HReMaqNh ;
   private boolean n7815HReMaqVX ;
   private boolean n7816HReMaqBL ;
   private boolean n7817HReMaqFlow ;
   private boolean n7818HReMaqRPM ;
   private boolean n7819HReMaqMol ;
   private boolean n7820HReMaqTor ;
   private boolean n7821HReMaqCla ;
   private boolean n7822HReMaqTej ;
   private boolean n7823HReMaqDel ;
   private boolean n7824HReMaqPML ;
   private boolean n8602HreCosAA ;
   private boolean n8603HrecosAd ;
   private boolean n8604HreCosAnc ;
   private boolean n8605HreCosCol ;
   private boolean n8606HreCosPA ;
   private boolean n8607HreCosPD ;
   private boolean n9780HreLtsSb ;
   private boolean n9781HreLtsRm ;
   private boolean n9803HreAcaQ ;
   private boolean n9804HreAcab ;
   private boolean n1094HreNPrg ;
   private boolean n697HreLotF ;
   private boolean n10381HreAnc ;
   private boolean n10382HreGrm ;
   private boolean n10383HreVel ;
   private boolean n10384HreObs ;
   private boolean n11508HreAva ;
   private boolean n12126HreAs ;
   private boolean n12127HreAi ;
   private String Z10384HreObs ;
   private String A10384HreObs ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T00L710_A4492HreBarCod ;
   private byte[] T00L710_A4493HreBarReo ;
   private String[] T00L710_A4494HreBarPar ;
   private byte[] T00L710_A4495HreNumCie ;
   private String[] T00L710_A407EmprNom ;
   private boolean[] T00L710_n407EmprNom ;
   private String[] T00L710_A4516HreDisCli ;
   private boolean[] T00L710_n4516HreDisCli ;
   private String[] T00L710_A279CliNom ;
   private String[] T00L710_A4517HreBarSer ;
   private boolean[] T00L710_n4517HreBarSer ;
   private String[] T00L710_A4518HreBarDsc ;
   private boolean[] T00L710_n4518HreBarDsc ;
   private short[] T00L710_A4519HreTipArt ;
   private boolean[] T00L710_n4519HreTipArt ;
   private String[] T00L710_A4520HreTipArtD ;
   private boolean[] T00L710_n4520HreTipArtD ;
   private String[] T00L710_A4521HreColNom ;
   private boolean[] T00L710_n4521HreColNom ;
   private int[] T00L710_A4522HreColNum ;
   private boolean[] T00L710_n4522HreColNum ;
   private String[] T00L710_A4523HreColNomC ;
   private boolean[] T00L710_n4523HreColNomC ;
   private int[] T00L710_A4524HreColNumC ;
   private boolean[] T00L710_n4524HreColNumC ;
   private byte[] T00L710_A4525HreTipCol ;
   private boolean[] T00L710_n4525HreTipCol ;
   private String[] T00L710_A4526HreTipColN ;
   private boolean[] T00L710_n4526HreTipColN ;
   private java.util.Date[] T00L710_A4527HreFecGen ;
   private boolean[] T00L710_n4527HreFecGen ;
   private java.util.Date[] T00L710_A4528HreFecCli ;
   private boolean[] T00L710_n4528HreFecCli ;
   private java.util.Date[] T00L710_A4529HreFecTin ;
   private boolean[] T00L710_n4529HreFecTin ;
   private java.util.Date[] T00L710_A4530HreFecFpr ;
   private boolean[] T00L710_n4530HreFecFpr ;
   private String[] T00L710_A4531HreBarMat ;
   private boolean[] T00L710_n4531HreBarMat ;
   private java.math.BigDecimal[] T00L710_A4532HreBarKgm ;
   private boolean[] T00L710_n4532HreBarKgm ;
   private java.math.BigDecimal[] T00L710_A4533HreBarMtr ;
   private boolean[] T00L710_n4533HreBarMtr ;
   private int[] T00L710_A4534HreBarPie ;
   private boolean[] T00L710_n4534HreBarPie ;
   private String[] T00L710_A4535HrePartCod ;
   private boolean[] T00L710_n4535HrePartCod ;
   private String[] T00L710_A4536HreBarNMtr ;
   private boolean[] T00L710_n4536HreBarNMtr ;
   private String[] T00L710_A4537HreBarNMez ;
   private boolean[] T00L710_n4537HreBarNMez ;
   private String[] T00L710_A4538HreNumTen ;
   private boolean[] T00L710_n4538HreNumTen ;
   private byte[] T00L710_A4539HreIntCod ;
   private boolean[] T00L710_n4539HreIntCod ;
   private String[] T00L710_A4540HreIntDsc ;
   private boolean[] T00L710_n4540HreIntDsc ;
   private String[] T00L710_A4541HreNumTon ;
   private boolean[] T00L710_n4541HreNumTon ;
   private String[] T00L710_A4496HreMaqHdr ;
   private boolean[] T00L710_n4496HreMaqHdr ;
   private java.math.BigDecimal[] T00L710_A4542HreTotKgm ;
   private boolean[] T00L710_n4542HreTotKgm ;
   private java.math.BigDecimal[] T00L710_A4543HreTotMtr ;
   private boolean[] T00L710_n4543HreTotMtr ;
   private int[] T00L710_A4544HreTotPie ;
   private boolean[] T00L710_n4544HreTotPie ;
   private int[] T00L710_A8608HreNumColF ;
   private boolean[] T00L710_n8608HreNumColF ;
   private short[] T00L710_A8610HreFamCodT ;
   private boolean[] T00L710_n8610HreFamCodT ;
   private String[] T00L710_A8623HreHilasa ;
   private boolean[] T00L710_n8623HreHilasa ;
   private int[] T00L710_A8624HreEnsayo ;
   private boolean[] T00L710_n8624HreEnsayo ;
   private String[] T00L710_A8625HreOpa ;
   private boolean[] T00L710_n8625HreOpa ;
   private byte[] T00L710_A8626HreOpn ;
   private boolean[] T00L710_n8626HreOpn ;
   private String[] T00L710_A11318HreDispCli ;
   private boolean[] T00L710_n11318HreDispCli ;
   private int[] T00L710_A11320HreMacCod ;
   private boolean[] T00L710_n11320HreMacCod ;
   private int[] T00L710_A12264HreNInter ;
   private boolean[] T00L710_n12264HreNInter ;
   private short[] T00L710_A12535HreCencId ;
   private boolean[] T00L710_n12535HreCencId ;
   private String[] T00L710_A12536HreCenDsc ;
   private boolean[] T00L710_n12536HreCenDsc ;
   private String[] T00L710_A13450HreComp1 ;
   private boolean[] T00L710_n13450HreComp1 ;
   private String[] T00L710_A13451HreComp2 ;
   private boolean[] T00L710_n13451HreComp2 ;
   private String[] T00L710_A13763HreUser ;
   private java.util.Date[] T00L710_A13764HreDiaHora ;
   private String[] T00L710_A13765HreCdn2 ;
   private String[] T00L710_A13766HreCtw ;
   private String[] T00L710_A396EmprCod ;
   private int[] T00L710_A252CliCod ;
   private boolean[] T00L710_n252CliCod ;
   private String[] T00L78_A407EmprNom ;
   private boolean[] T00L78_n407EmprNom ;
   private String[] T00L79_A279CliNom ;
   private String[] T00L711_A407EmprNom ;
   private boolean[] T00L711_n407EmprNom ;
   private String[] T00L712_A279CliNom ;
   private String[] T00L713_A396EmprCod ;
   private int[] T00L713_A4492HreBarCod ;
   private byte[] T00L713_A4493HreBarReo ;
   private String[] T00L713_A4494HreBarPar ;
   private byte[] T00L713_A4495HreNumCie ;
   private int[] T00L77_A4492HreBarCod ;
   private byte[] T00L77_A4493HreBarReo ;
   private String[] T00L77_A4494HreBarPar ;
   private byte[] T00L77_A4495HreNumCie ;
   private String[] T00L77_A4516HreDisCli ;
   private boolean[] T00L77_n4516HreDisCli ;
   private String[] T00L77_A4517HreBarSer ;
   private boolean[] T00L77_n4517HreBarSer ;
   private String[] T00L77_A4518HreBarDsc ;
   private boolean[] T00L77_n4518HreBarDsc ;
   private short[] T00L77_A4519HreTipArt ;
   private boolean[] T00L77_n4519HreTipArt ;
   private String[] T00L77_A4520HreTipArtD ;
   private boolean[] T00L77_n4520HreTipArtD ;
   private String[] T00L77_A4521HreColNom ;
   private boolean[] T00L77_n4521HreColNom ;
   private int[] T00L77_A4522HreColNum ;
   private boolean[] T00L77_n4522HreColNum ;
   private String[] T00L77_A4523HreColNomC ;
   private boolean[] T00L77_n4523HreColNomC ;
   private int[] T00L77_A4524HreColNumC ;
   private boolean[] T00L77_n4524HreColNumC ;
   private byte[] T00L77_A4525HreTipCol ;
   private boolean[] T00L77_n4525HreTipCol ;
   private String[] T00L77_A4526HreTipColN ;
   private boolean[] T00L77_n4526HreTipColN ;
   private java.util.Date[] T00L77_A4527HreFecGen ;
   private boolean[] T00L77_n4527HreFecGen ;
   private java.util.Date[] T00L77_A4528HreFecCli ;
   private boolean[] T00L77_n4528HreFecCli ;
   private java.util.Date[] T00L77_A4529HreFecTin ;
   private boolean[] T00L77_n4529HreFecTin ;
   private java.util.Date[] T00L77_A4530HreFecFpr ;
   private boolean[] T00L77_n4530HreFecFpr ;
   private String[] T00L77_A4531HreBarMat ;
   private boolean[] T00L77_n4531HreBarMat ;
   private java.math.BigDecimal[] T00L77_A4532HreBarKgm ;
   private boolean[] T00L77_n4532HreBarKgm ;
   private java.math.BigDecimal[] T00L77_A4533HreBarMtr ;
   private boolean[] T00L77_n4533HreBarMtr ;
   private int[] T00L77_A4534HreBarPie ;
   private boolean[] T00L77_n4534HreBarPie ;
   private String[] T00L77_A4535HrePartCod ;
   private boolean[] T00L77_n4535HrePartCod ;
   private String[] T00L77_A4536HreBarNMtr ;
   private boolean[] T00L77_n4536HreBarNMtr ;
   private String[] T00L77_A4537HreBarNMez ;
   private boolean[] T00L77_n4537HreBarNMez ;
   private String[] T00L77_A4538HreNumTen ;
   private boolean[] T00L77_n4538HreNumTen ;
   private byte[] T00L77_A4539HreIntCod ;
   private boolean[] T00L77_n4539HreIntCod ;
   private String[] T00L77_A4540HreIntDsc ;
   private boolean[] T00L77_n4540HreIntDsc ;
   private String[] T00L77_A4541HreNumTon ;
   private boolean[] T00L77_n4541HreNumTon ;
   private String[] T00L77_A4496HreMaqHdr ;
   private boolean[] T00L77_n4496HreMaqHdr ;
   private java.math.BigDecimal[] T00L77_A4542HreTotKgm ;
   private boolean[] T00L77_n4542HreTotKgm ;
   private java.math.BigDecimal[] T00L77_A4543HreTotMtr ;
   private boolean[] T00L77_n4543HreTotMtr ;
   private int[] T00L77_A4544HreTotPie ;
   private boolean[] T00L77_n4544HreTotPie ;
   private int[] T00L77_A8608HreNumColF ;
   private boolean[] T00L77_n8608HreNumColF ;
   private short[] T00L77_A8610HreFamCodT ;
   private boolean[] T00L77_n8610HreFamCodT ;
   private String[] T00L77_A8623HreHilasa ;
   private boolean[] T00L77_n8623HreHilasa ;
   private int[] T00L77_A8624HreEnsayo ;
   private boolean[] T00L77_n8624HreEnsayo ;
   private String[] T00L77_A8625HreOpa ;
   private boolean[] T00L77_n8625HreOpa ;
   private byte[] T00L77_A8626HreOpn ;
   private boolean[] T00L77_n8626HreOpn ;
   private String[] T00L77_A11318HreDispCli ;
   private boolean[] T00L77_n11318HreDispCli ;
   private int[] T00L77_A11320HreMacCod ;
   private boolean[] T00L77_n11320HreMacCod ;
   private int[] T00L77_A12264HreNInter ;
   private boolean[] T00L77_n12264HreNInter ;
   private short[] T00L77_A12535HreCencId ;
   private boolean[] T00L77_n12535HreCencId ;
   private String[] T00L77_A12536HreCenDsc ;
   private boolean[] T00L77_n12536HreCenDsc ;
   private String[] T00L77_A13450HreComp1 ;
   private boolean[] T00L77_n13450HreComp1 ;
   private String[] T00L77_A13451HreComp2 ;
   private boolean[] T00L77_n13451HreComp2 ;
   private String[] T00L77_A13763HreUser ;
   private java.util.Date[] T00L77_A13764HreDiaHora ;
   private String[] T00L77_A13765HreCdn2 ;
   private String[] T00L77_A13766HreCtw ;
   private String[] T00L77_A396EmprCod ;
   private int[] T00L77_A252CliCod ;
   private boolean[] T00L77_n252CliCod ;
   private String[] T00L714_A396EmprCod ;
   private int[] T00L714_A4492HreBarCod ;
   private byte[] T00L714_A4493HreBarReo ;
   private String[] T00L714_A4494HreBarPar ;
   private byte[] T00L714_A4495HreNumCie ;
   private String[] T00L715_A396EmprCod ;
   private int[] T00L715_A4492HreBarCod ;
   private byte[] T00L715_A4493HreBarReo ;
   private String[] T00L715_A4494HreBarPar ;
   private byte[] T00L715_A4495HreNumCie ;
   private int[] T00L76_A4492HreBarCod ;
   private byte[] T00L76_A4493HreBarReo ;
   private String[] T00L76_A4494HreBarPar ;
   private byte[] T00L76_A4495HreNumCie ;
   private String[] T00L76_A4516HreDisCli ;
   private boolean[] T00L76_n4516HreDisCli ;
   private String[] T00L76_A4517HreBarSer ;
   private boolean[] T00L76_n4517HreBarSer ;
   private String[] T00L76_A4518HreBarDsc ;
   private boolean[] T00L76_n4518HreBarDsc ;
   private short[] T00L76_A4519HreTipArt ;
   private boolean[] T00L76_n4519HreTipArt ;
   private String[] T00L76_A4520HreTipArtD ;
   private boolean[] T00L76_n4520HreTipArtD ;
   private String[] T00L76_A4521HreColNom ;
   private boolean[] T00L76_n4521HreColNom ;
   private int[] T00L76_A4522HreColNum ;
   private boolean[] T00L76_n4522HreColNum ;
   private String[] T00L76_A4523HreColNomC ;
   private boolean[] T00L76_n4523HreColNomC ;
   private int[] T00L76_A4524HreColNumC ;
   private boolean[] T00L76_n4524HreColNumC ;
   private byte[] T00L76_A4525HreTipCol ;
   private boolean[] T00L76_n4525HreTipCol ;
   private String[] T00L76_A4526HreTipColN ;
   private boolean[] T00L76_n4526HreTipColN ;
   private java.util.Date[] T00L76_A4527HreFecGen ;
   private boolean[] T00L76_n4527HreFecGen ;
   private java.util.Date[] T00L76_A4528HreFecCli ;
   private boolean[] T00L76_n4528HreFecCli ;
   private java.util.Date[] T00L76_A4529HreFecTin ;
   private boolean[] T00L76_n4529HreFecTin ;
   private java.util.Date[] T00L76_A4530HreFecFpr ;
   private boolean[] T00L76_n4530HreFecFpr ;
   private String[] T00L76_A4531HreBarMat ;
   private boolean[] T00L76_n4531HreBarMat ;
   private java.math.BigDecimal[] T00L76_A4532HreBarKgm ;
   private boolean[] T00L76_n4532HreBarKgm ;
   private java.math.BigDecimal[] T00L76_A4533HreBarMtr ;
   private boolean[] T00L76_n4533HreBarMtr ;
   private int[] T00L76_A4534HreBarPie ;
   private boolean[] T00L76_n4534HreBarPie ;
   private String[] T00L76_A4535HrePartCod ;
   private boolean[] T00L76_n4535HrePartCod ;
   private String[] T00L76_A4536HreBarNMtr ;
   private boolean[] T00L76_n4536HreBarNMtr ;
   private String[] T00L76_A4537HreBarNMez ;
   private boolean[] T00L76_n4537HreBarNMez ;
   private String[] T00L76_A4538HreNumTen ;
   private boolean[] T00L76_n4538HreNumTen ;
   private byte[] T00L76_A4539HreIntCod ;
   private boolean[] T00L76_n4539HreIntCod ;
   private String[] T00L76_A4540HreIntDsc ;
   private boolean[] T00L76_n4540HreIntDsc ;
   private String[] T00L76_A4541HreNumTon ;
   private boolean[] T00L76_n4541HreNumTon ;
   private String[] T00L76_A4496HreMaqHdr ;
   private boolean[] T00L76_n4496HreMaqHdr ;
   private java.math.BigDecimal[] T00L76_A4542HreTotKgm ;
   private boolean[] T00L76_n4542HreTotKgm ;
   private java.math.BigDecimal[] T00L76_A4543HreTotMtr ;
   private boolean[] T00L76_n4543HreTotMtr ;
   private int[] T00L76_A4544HreTotPie ;
   private boolean[] T00L76_n4544HreTotPie ;
   private int[] T00L76_A8608HreNumColF ;
   private boolean[] T00L76_n8608HreNumColF ;
   private short[] T00L76_A8610HreFamCodT ;
   private boolean[] T00L76_n8610HreFamCodT ;
   private String[] T00L76_A8623HreHilasa ;
   private boolean[] T00L76_n8623HreHilasa ;
   private int[] T00L76_A8624HreEnsayo ;
   private boolean[] T00L76_n8624HreEnsayo ;
   private String[] T00L76_A8625HreOpa ;
   private boolean[] T00L76_n8625HreOpa ;
   private byte[] T00L76_A8626HreOpn ;
   private boolean[] T00L76_n8626HreOpn ;
   private String[] T00L76_A11318HreDispCli ;
   private boolean[] T00L76_n11318HreDispCli ;
   private int[] T00L76_A11320HreMacCod ;
   private boolean[] T00L76_n11320HreMacCod ;
   private int[] T00L76_A12264HreNInter ;
   private boolean[] T00L76_n12264HreNInter ;
   private short[] T00L76_A12535HreCencId ;
   private boolean[] T00L76_n12535HreCencId ;
   private String[] T00L76_A12536HreCenDsc ;
   private boolean[] T00L76_n12536HreCenDsc ;
   private String[] T00L76_A13450HreComp1 ;
   private boolean[] T00L76_n13450HreComp1 ;
   private String[] T00L76_A13451HreComp2 ;
   private boolean[] T00L76_n13451HreComp2 ;
   private String[] T00L76_A13763HreUser ;
   private java.util.Date[] T00L76_A13764HreDiaHora ;
   private String[] T00L76_A13765HreCdn2 ;
   private String[] T00L76_A13766HreCtw ;
   private String[] T00L76_A396EmprCod ;
   private int[] T00L76_A252CliCod ;
   private boolean[] T00L76_n252CliCod ;
   private String[] T00L719_A407EmprNom ;
   private boolean[] T00L719_n407EmprNom ;
   private String[] T00L720_A279CliNom ;
   private String[] T00L721_A396EmprCod ;
   private int[] T00L721_A4492HreBarCod ;
   private byte[] T00L721_A4493HreBarReo ;
   private String[] T00L721_A4494HreBarPar ;
   private byte[] T00L721_A4495HreNumCie ;
   private int[] T00L721_A9985HreAcCod ;
   private byte[] T00L721_A9986HreAcReo ;
   private String[] T00L721_A9987HreAcPar ;
   private String[] T00L722_A396EmprCod ;
   private int[] T00L722_A4492HreBarCod ;
   private byte[] T00L722_A4493HreBarReo ;
   private String[] T00L722_A4494HreBarPar ;
   private byte[] T00L722_A4495HreNumCie ;
   private String[] T00L722_A5864HreProCodP ;
   private short[] T00L722_A5865HreOrdLinF ;
   private String[] T00L723_A396EmprCod ;
   private int[] T00L723_A4492HreBarCod ;
   private byte[] T00L723_A4493HreBarReo ;
   private String[] T00L723_A4494HreBarPar ;
   private byte[] T00L723_A4495HreNumCie ;
   private short[] T00L723_A4545HreLinMaq ;
   private String[] T00L724_A396EmprCod ;
   private int[] T00L724_A4492HreBarCod ;
   private byte[] T00L724_A4493HreBarReo ;
   private String[] T00L724_A4494HreBarPar ;
   private byte[] T00L724_A4495HreNumCie ;
   private short[] T00L724_A4508HreLinMAL ;
   private byte[] T00L724_A4509HreNumAny ;
   private String[] T00L724_A719PrdNum ;
   private String[] T00L725_A396EmprCod ;
   private int[] T00L725_A4492HreBarCod ;
   private byte[] T00L725_A4493HreBarReo ;
   private String[] T00L725_A4494HreBarPar ;
   private byte[] T00L725_A4495HreNumCie ;
   private int[] T00L725_A4497HreAgrCod ;
   private byte[] T00L725_A4498HreAgrReo ;
   private String[] T00L725_A4499HreAgrPar ;
   private String[] T00L726_A396EmprCod ;
   private int[] T00L726_A4492HreBarCod ;
   private byte[] T00L726_A4493HreBarReo ;
   private String[] T00L726_A4494HreBarPar ;
   private byte[] T00L726_A4495HreNumCie ;
   private int[] T00L727_A4492HreBarCod ;
   private byte[] T00L727_A4493HreBarReo ;
   private String[] T00L727_A4494HreBarPar ;
   private byte[] T00L727_A4495HreNumCie ;
   private short[] T00L727_A4545HreLinMaq ;
   private String[] T00L727_A4546HreMaqCod ;
   private boolean[] T00L727_n4546HreMaqCod ;
   private int[] T00L727_A4547HreVolPrd ;
   private boolean[] T00L727_n4547HreVolPrd ;
   private java.math.BigDecimal[] T00L727_A4548HreFacAbs ;
   private boolean[] T00L727_n4548HreFacAbs ;
   private java.util.Date[] T00L727_A4584HreFecPes ;
   private boolean[] T00L727_n4584HreFecPes ;
   private byte[] T00L727_A4585HreMaqPes ;
   private boolean[] T00L727_n4585HreMaqPes ;
   private byte[] T00L727_A4549HreULinPro ;
   private boolean[] T00L727_n4549HreULinPro ;
   private String[] T00L727_A4863HreUsrCod ;
   private boolean[] T00L727_n4863HreUsrCod ;
   private short[] T00L727_A7814HReMaqNh ;
   private boolean[] T00L727_n7814HReMaqNh ;
   private byte[] T00L727_A7815HReMaqVX ;
   private boolean[] T00L727_n7815HReMaqVX ;
   private byte[] T00L727_A7816HReMaqBL ;
   private boolean[] T00L727_n7816HReMaqBL ;
   private byte[] T00L727_A7817HReMaqFlow ;
   private boolean[] T00L727_n7817HReMaqFlow ;
   private short[] T00L727_A7818HReMaqRPM ;
   private boolean[] T00L727_n7818HReMaqRPM ;
   private short[] T00L727_A7819HReMaqMol ;
   private boolean[] T00L727_n7819HReMaqMol ;
   private short[] T00L727_A7820HReMaqTor ;
   private boolean[] T00L727_n7820HReMaqTor ;
   private String[] T00L727_A7821HReMaqCla ;
   private boolean[] T00L727_n7821HReMaqCla ;
   private byte[] T00L727_A7822HReMaqTej ;
   private boolean[] T00L727_n7822HReMaqTej ;
   private byte[] T00L727_A7823HReMaqDel ;
   private boolean[] T00L727_n7823HReMaqDel ;
   private short[] T00L727_A7824HReMaqPML ;
   private boolean[] T00L727_n7824HReMaqPML ;
   private java.math.BigDecimal[] T00L727_A8602HreCosAA ;
   private boolean[] T00L727_n8602HreCosAA ;
   private java.math.BigDecimal[] T00L727_A8603HrecosAd ;
   private boolean[] T00L727_n8603HrecosAd ;
   private java.math.BigDecimal[] T00L727_A8604HreCosAnc ;
   private boolean[] T00L727_n8604HreCosAnc ;
   private java.math.BigDecimal[] T00L727_A8605HreCosCol ;
   private boolean[] T00L727_n8605HreCosCol ;
   private java.math.BigDecimal[] T00L727_A8606HreCosPA ;
   private boolean[] T00L727_n8606HreCosPA ;
   private java.math.BigDecimal[] T00L727_A8607HreCosPD ;
   private boolean[] T00L727_n8607HreCosPD ;
   private int[] T00L727_A9780HreLtsSb ;
   private boolean[] T00L727_n9780HreLtsSb ;
   private int[] T00L727_A9781HreLtsRm ;
   private boolean[] T00L727_n9781HreLtsRm ;
   private String[] T00L727_A9803HreAcaQ ;
   private boolean[] T00L727_n9803HreAcaQ ;
   private String[] T00L727_A9804HreAcab ;
   private boolean[] T00L727_n9804HreAcab ;
   private String[] T00L727_A1094HreNPrg ;
   private boolean[] T00L727_n1094HreNPrg ;
   private String[] T00L727_A697HreLotF ;
   private boolean[] T00L727_n697HreLotF ;
   private short[] T00L727_A10381HreAnc ;
   private boolean[] T00L727_n10381HreAnc ;
   private short[] T00L727_A10382HreGrm ;
   private boolean[] T00L727_n10382HreGrm ;
   private java.math.BigDecimal[] T00L727_A10383HreVel ;
   private boolean[] T00L727_n10383HreVel ;
   private String[] T00L727_A10384HreObs ;
   private boolean[] T00L727_n10384HreObs ;
   private String[] T00L727_A11508HreAva ;
   private boolean[] T00L727_n11508HreAva ;
   private String[] T00L727_A12126HreAs ;
   private boolean[] T00L727_n12126HreAs ;
   private String[] T00L727_A12127HreAi ;
   private boolean[] T00L727_n12127HreAi ;
   private String[] T00L727_A396EmprCod ;
   private String[] T00L728_A396EmprCod ;
   private int[] T00L728_A4492HreBarCod ;
   private byte[] T00L728_A4493HreBarReo ;
   private String[] T00L728_A4494HreBarPar ;
   private byte[] T00L728_A4495HreNumCie ;
   private short[] T00L728_A4545HreLinMaq ;
   private int[] T00L75_A4492HreBarCod ;
   private byte[] T00L75_A4493HreBarReo ;
   private String[] T00L75_A4494HreBarPar ;
   private byte[] T00L75_A4495HreNumCie ;
   private short[] T00L75_A4545HreLinMaq ;
   private String[] T00L75_A4546HreMaqCod ;
   private boolean[] T00L75_n4546HreMaqCod ;
   private int[] T00L75_A4547HreVolPrd ;
   private boolean[] T00L75_n4547HreVolPrd ;
   private java.math.BigDecimal[] T00L75_A4548HreFacAbs ;
   private boolean[] T00L75_n4548HreFacAbs ;
   private java.util.Date[] T00L75_A4584HreFecPes ;
   private boolean[] T00L75_n4584HreFecPes ;
   private byte[] T00L75_A4585HreMaqPes ;
   private boolean[] T00L75_n4585HreMaqPes ;
   private byte[] T00L75_A4549HreULinPro ;
   private boolean[] T00L75_n4549HreULinPro ;
   private String[] T00L75_A4863HreUsrCod ;
   private boolean[] T00L75_n4863HreUsrCod ;
   private short[] T00L75_A7814HReMaqNh ;
   private boolean[] T00L75_n7814HReMaqNh ;
   private byte[] T00L75_A7815HReMaqVX ;
   private boolean[] T00L75_n7815HReMaqVX ;
   private byte[] T00L75_A7816HReMaqBL ;
   private boolean[] T00L75_n7816HReMaqBL ;
   private byte[] T00L75_A7817HReMaqFlow ;
   private boolean[] T00L75_n7817HReMaqFlow ;
   private short[] T00L75_A7818HReMaqRPM ;
   private boolean[] T00L75_n7818HReMaqRPM ;
   private short[] T00L75_A7819HReMaqMol ;
   private boolean[] T00L75_n7819HReMaqMol ;
   private short[] T00L75_A7820HReMaqTor ;
   private boolean[] T00L75_n7820HReMaqTor ;
   private String[] T00L75_A7821HReMaqCla ;
   private boolean[] T00L75_n7821HReMaqCla ;
   private byte[] T00L75_A7822HReMaqTej ;
   private boolean[] T00L75_n7822HReMaqTej ;
   private byte[] T00L75_A7823HReMaqDel ;
   private boolean[] T00L75_n7823HReMaqDel ;
   private short[] T00L75_A7824HReMaqPML ;
   private boolean[] T00L75_n7824HReMaqPML ;
   private java.math.BigDecimal[] T00L75_A8602HreCosAA ;
   private boolean[] T00L75_n8602HreCosAA ;
   private java.math.BigDecimal[] T00L75_A8603HrecosAd ;
   private boolean[] T00L75_n8603HrecosAd ;
   private java.math.BigDecimal[] T00L75_A8604HreCosAnc ;
   private boolean[] T00L75_n8604HreCosAnc ;
   private java.math.BigDecimal[] T00L75_A8605HreCosCol ;
   private boolean[] T00L75_n8605HreCosCol ;
   private java.math.BigDecimal[] T00L75_A8606HreCosPA ;
   private boolean[] T00L75_n8606HreCosPA ;
   private java.math.BigDecimal[] T00L75_A8607HreCosPD ;
   private boolean[] T00L75_n8607HreCosPD ;
   private int[] T00L75_A9780HreLtsSb ;
   private boolean[] T00L75_n9780HreLtsSb ;
   private int[] T00L75_A9781HreLtsRm ;
   private boolean[] T00L75_n9781HreLtsRm ;
   private String[] T00L75_A9803HreAcaQ ;
   private boolean[] T00L75_n9803HreAcaQ ;
   private String[] T00L75_A9804HreAcab ;
   private boolean[] T00L75_n9804HreAcab ;
   private String[] T00L75_A1094HreNPrg ;
   private boolean[] T00L75_n1094HreNPrg ;
   private String[] T00L75_A697HreLotF ;
   private boolean[] T00L75_n697HreLotF ;
   private short[] T00L75_A10381HreAnc ;
   private boolean[] T00L75_n10381HreAnc ;
   private short[] T00L75_A10382HreGrm ;
   private boolean[] T00L75_n10382HreGrm ;
   private java.math.BigDecimal[] T00L75_A10383HreVel ;
   private boolean[] T00L75_n10383HreVel ;
   private String[] T00L75_A10384HreObs ;
   private boolean[] T00L75_n10384HreObs ;
   private String[] T00L75_A11508HreAva ;
   private boolean[] T00L75_n11508HreAva ;
   private String[] T00L75_A12126HreAs ;
   private boolean[] T00L75_n12126HreAs ;
   private String[] T00L75_A12127HreAi ;
   private boolean[] T00L75_n12127HreAi ;
   private String[] T00L75_A396EmprCod ;
   private int[] T00L74_A4492HreBarCod ;
   private byte[] T00L74_A4493HreBarReo ;
   private String[] T00L74_A4494HreBarPar ;
   private byte[] T00L74_A4495HreNumCie ;
   private short[] T00L74_A4545HreLinMaq ;
   private String[] T00L74_A4546HreMaqCod ;
   private boolean[] T00L74_n4546HreMaqCod ;
   private int[] T00L74_A4547HreVolPrd ;
   private boolean[] T00L74_n4547HreVolPrd ;
   private java.math.BigDecimal[] T00L74_A4548HreFacAbs ;
   private boolean[] T00L74_n4548HreFacAbs ;
   private java.util.Date[] T00L74_A4584HreFecPes ;
   private boolean[] T00L74_n4584HreFecPes ;
   private byte[] T00L74_A4585HreMaqPes ;
   private boolean[] T00L74_n4585HreMaqPes ;
   private byte[] T00L74_A4549HreULinPro ;
   private boolean[] T00L74_n4549HreULinPro ;
   private String[] T00L74_A4863HreUsrCod ;
   private boolean[] T00L74_n4863HreUsrCod ;
   private short[] T00L74_A7814HReMaqNh ;
   private boolean[] T00L74_n7814HReMaqNh ;
   private byte[] T00L74_A7815HReMaqVX ;
   private boolean[] T00L74_n7815HReMaqVX ;
   private byte[] T00L74_A7816HReMaqBL ;
   private boolean[] T00L74_n7816HReMaqBL ;
   private byte[] T00L74_A7817HReMaqFlow ;
   private boolean[] T00L74_n7817HReMaqFlow ;
   private short[] T00L74_A7818HReMaqRPM ;
   private boolean[] T00L74_n7818HReMaqRPM ;
   private short[] T00L74_A7819HReMaqMol ;
   private boolean[] T00L74_n7819HReMaqMol ;
   private short[] T00L74_A7820HReMaqTor ;
   private boolean[] T00L74_n7820HReMaqTor ;
   private String[] T00L74_A7821HReMaqCla ;
   private boolean[] T00L74_n7821HReMaqCla ;
   private byte[] T00L74_A7822HReMaqTej ;
   private boolean[] T00L74_n7822HReMaqTej ;
   private byte[] T00L74_A7823HReMaqDel ;
   private boolean[] T00L74_n7823HReMaqDel ;
   private short[] T00L74_A7824HReMaqPML ;
   private boolean[] T00L74_n7824HReMaqPML ;
   private java.math.BigDecimal[] T00L74_A8602HreCosAA ;
   private boolean[] T00L74_n8602HreCosAA ;
   private java.math.BigDecimal[] T00L74_A8603HrecosAd ;
   private boolean[] T00L74_n8603HrecosAd ;
   private java.math.BigDecimal[] T00L74_A8604HreCosAnc ;
   private boolean[] T00L74_n8604HreCosAnc ;
   private java.math.BigDecimal[] T00L74_A8605HreCosCol ;
   private boolean[] T00L74_n8605HreCosCol ;
   private java.math.BigDecimal[] T00L74_A8606HreCosPA ;
   private boolean[] T00L74_n8606HreCosPA ;
   private java.math.BigDecimal[] T00L74_A8607HreCosPD ;
   private boolean[] T00L74_n8607HreCosPD ;
   private int[] T00L74_A9780HreLtsSb ;
   private boolean[] T00L74_n9780HreLtsSb ;
   private int[] T00L74_A9781HreLtsRm ;
   private boolean[] T00L74_n9781HreLtsRm ;
   private String[] T00L74_A9803HreAcaQ ;
   private boolean[] T00L74_n9803HreAcaQ ;
   private String[] T00L74_A9804HreAcab ;
   private boolean[] T00L74_n9804HreAcab ;
   private String[] T00L74_A1094HreNPrg ;
   private boolean[] T00L74_n1094HreNPrg ;
   private String[] T00L74_A697HreLotF ;
   private boolean[] T00L74_n697HreLotF ;
   private short[] T00L74_A10381HreAnc ;
   private boolean[] T00L74_n10381HreAnc ;
   private short[] T00L74_A10382HreGrm ;
   private boolean[] T00L74_n10382HreGrm ;
   private java.math.BigDecimal[] T00L74_A10383HreVel ;
   private boolean[] T00L74_n10383HreVel ;
   private String[] T00L74_A10384HreObs ;
   private boolean[] T00L74_n10384HreObs ;
   private String[] T00L74_A11508HreAva ;
   private boolean[] T00L74_n11508HreAva ;
   private String[] T00L74_A12126HreAs ;
   private boolean[] T00L74_n12126HreAs ;
   private String[] T00L74_A12127HreAi ;
   private boolean[] T00L74_n12127HreAi ;
   private String[] T00L74_A396EmprCod ;
   private String[] T00L732_A396EmprCod ;
   private int[] T00L732_A4492HreBarCod ;
   private byte[] T00L732_A4493HreBarReo ;
   private String[] T00L732_A4494HreBarPar ;
   private byte[] T00L732_A4495HreNumCie ;
   private short[] T00L732_A4545HreLinMaq ;
   private String[] T00L732_A14278HreNormId ;
   private String[] T00L733_A396EmprCod ;
   private int[] T00L733_A4492HreBarCod ;
   private byte[] T00L733_A4493HreBarReo ;
   private String[] T00L733_A4494HreBarPar ;
   private byte[] T00L733_A4495HreNumCie ;
   private short[] T00L733_A4545HreLinMaq ;
   private String[] T00L733_A14282HreTraID ;
   private String[] T00L734_A396EmprCod ;
   private int[] T00L734_A4492HreBarCod ;
   private byte[] T00L734_A4493HreBarReo ;
   private String[] T00L734_A4494HreBarPar ;
   private byte[] T00L734_A4495HreNumCie ;
   private short[] T00L734_A4545HreLinMaq ;
   private byte[] T00L734_A4550HreLinPro ;
   private short[] T00L734_A4557HreRecLin ;
   private String[] T00L735_A396EmprCod ;
   private int[] T00L735_A4492HreBarCod ;
   private byte[] T00L735_A4493HreBarReo ;
   private String[] T00L735_A4494HreBarPar ;
   private byte[] T00L735_A4495HreNumCie ;
   private short[] T00L735_A4545HreLinMaq ;
   private short[] T00L735_A11322HreLinObs ;
   private String[] T00L736_A396EmprCod ;
   private int[] T00L736_A4492HreBarCod ;
   private byte[] T00L736_A4493HreBarReo ;
   private String[] T00L736_A4494HreBarPar ;
   private byte[] T00L736_A4495HreNumCie ;
   private short[] T00L736_A4545HreLinMaq ;
   private int[] T00L737_A4492HreBarCod ;
   private byte[] T00L737_A4493HreBarReo ;
   private String[] T00L737_A4494HreBarPar ;
   private byte[] T00L737_A4495HreNumCie ;
   private short[] T00L737_A4545HreLinMaq ;
   private byte[] T00L737_A4550HreLinPro ;
   private String[] T00L737_A4551HreProCod ;
   private String[] T00L737_A4552HreProDsc ;
   private short[] T00L737_A4553HreProTie ;
   private short[] T00L737_A4554HreProTmx ;
   private int[] T00L737_A4555HreNumPro ;
   private int[] T00L737_A4556HreNumRec ;
   private short[] T00L737_A10545HreNH2O ;
   private String[] T00L737_A396EmprCod ;
   private String[] T00L738_A396EmprCod ;
   private int[] T00L738_A4492HreBarCod ;
   private byte[] T00L738_A4493HreBarReo ;
   private String[] T00L738_A4494HreBarPar ;
   private byte[] T00L738_A4495HreNumCie ;
   private short[] T00L738_A4545HreLinMaq ;
   private byte[] T00L738_A4550HreLinPro ;
   private int[] T00L73_A4492HreBarCod ;
   private byte[] T00L73_A4493HreBarReo ;
   private String[] T00L73_A4494HreBarPar ;
   private byte[] T00L73_A4495HreNumCie ;
   private short[] T00L73_A4545HreLinMaq ;
   private byte[] T00L73_A4550HreLinPro ;
   private String[] T00L73_A4551HreProCod ;
   private String[] T00L73_A4552HreProDsc ;
   private short[] T00L73_A4553HreProTie ;
   private short[] T00L73_A4554HreProTmx ;
   private int[] T00L73_A4555HreNumPro ;
   private int[] T00L73_A4556HreNumRec ;
   private short[] T00L73_A10545HreNH2O ;
   private String[] T00L73_A396EmprCod ;
   private int[] T00L72_A4492HreBarCod ;
   private byte[] T00L72_A4493HreBarReo ;
   private String[] T00L72_A4494HreBarPar ;
   private byte[] T00L72_A4495HreNumCie ;
   private short[] T00L72_A4545HreLinMaq ;
   private byte[] T00L72_A4550HreLinPro ;
   private String[] T00L72_A4551HreProCod ;
   private String[] T00L72_A4552HreProDsc ;
   private short[] T00L72_A4553HreProTie ;
   private short[] T00L72_A4554HreProTmx ;
   private int[] T00L72_A4555HreNumPro ;
   private int[] T00L72_A4556HreNumRec ;
   private short[] T00L72_A10545HreNH2O ;
   private String[] T00L72_A396EmprCod ;
   private String[] T00L742_A396EmprCod ;
   private int[] T00L742_A4492HreBarCod ;
   private byte[] T00L742_A4493HreBarReo ;
   private String[] T00L742_A4494HreBarPar ;
   private byte[] T00L742_A4495HreNumCie ;
   private short[] T00L742_A4545HreLinMaq ;
   private byte[] T00L742_A4550HreLinPro ;
   private short[] T00L742_A4557HreRecLin ;
   private String[] T00L743_A396EmprCod ;
   private int[] T00L743_A4492HreBarCod ;
   private byte[] T00L743_A4493HreBarReo ;
   private String[] T00L743_A4494HreBarPar ;
   private byte[] T00L743_A4495HreNumCie ;
   private short[] T00L743_A4545HreLinMaq ;
   private byte[] T00L743_A4550HreLinPro ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thisrec__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00L72", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreNH2O, EmprCod FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?  FOR UPDATE OF HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreNH2O NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L73", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreNH2O, EmprCod FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L74", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?  FOR UPDATE OF HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L75", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L76", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw, EmprCod, CliCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?  FOR UPDATE OF HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L77", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw, EmprCod, CliCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L78", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L79", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L710", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, T2.EmprNom, TM1.HreDisCli, T3.CliNom, TM1.HreBarSer, TM1.HreBarDsc, TM1.HreTipArt, TM1.HreTipArtD, TM1.HreColNom, TM1.HreColNum, TM1.HreColNomC, TM1.HreColNumC, TM1.HreTipCol, TM1.HreTipColN, TM1.HreFecGen, TM1.HreFecCli, TM1.HreFecTin, TM1.HreFecFpr, TM1.HreBarMat, TM1.HreBarKgm, TM1.HreBarMtr, TM1.HreBarPie, TM1.HrePartCod, TM1.HreBarNMtr, TM1.HreBarNMez, TM1.HreNumTen, TM1.HreIntCod, TM1.HreIntDsc, TM1.HreNumTon, TM1.HreMaqHdr, TM1.HreTotKgm, TM1.HreTotMtr, TM1.HreTotPie, TM1.HreNumColF, TM1.HreFamCodT, TM1.HreHilasa, TM1.HreEnsayo, TM1.HreOpa, TM1.HreOpn, TM1.HreDispCli, TM1.HreMacCod, TM1.HreNInter, TM1.HreCencId, TM1.HreCenDsc, TM1.HreComp1, TM1.HreComp2, TM1.HreUser, TM1.HreDiaHora, TM1.HreCdn2, TM1.HreCtw, TM1.EmprCod, TM1.CliCod FROM ((TXPHISREH TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L711", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L712", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L713", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L714", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE ( EmprCod > ? or EmprCod = ? and HreBarCod > ? or HreBarCod = ? and EmprCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie > ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L715", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE ( EmprCod < ? or EmprCod = ? and HreBarCod < ? or HreBarCod = ? and EmprCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie < ?) ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00L716", "INSERT INTO TXPHISREH(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreDisCli, HreBarSer, HreBarDsc, HreTipArt, HreTipArtD, HreColNom, HreColNum, HreColNomC, HreColNumC, HreTipCol, HreTipColN, HreFecGen, HreFecCli, HreFecTin, HreFecFpr, HreBarMat, HreBarKgm, HreBarMtr, HreBarPie, HrePartCod, HreBarNMtr, HreBarNMez, HreNumTen, HreIntCod, HreIntDsc, HreNumTon, HreMaqHdr, HreTotKgm, HreTotMtr, HreTotPie, HreNumColF, HreFamCodT, HreHilasa, HreEnsayo, HreOpa, HreOpn, HreDispCli, HreMacCod, HreNInter, HreCencId, HreCenDsc, HreComp1, HreComp2, HreUser, HreDiaHora, HreCdn2, HreCtw, EmprCod, CliCod, HreLtsSR, HreLtsRs, HreAcaQm, HreRacab, HreFecAcb, HreAbs, HreLtsRc, HreHdrLts, HreFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0)", GX_NOMASK, "TXPHISREH")
         ,new UpdateCursor("T00L717", "UPDATE TXPHISREH SET HreDisCli=?, HreBarSer=?, HreBarDsc=?, HreTipArt=?, HreTipArtD=?, HreColNom=?, HreColNum=?, HreColNomC=?, HreColNumC=?, HreTipCol=?, HreTipColN=?, HreFecGen=?, HreFecCli=?, HreFecTin=?, HreFecFpr=?, HreBarMat=?, HreBarKgm=?, HreBarMtr=?, HreBarPie=?, HrePartCod=?, HreBarNMtr=?, HreBarNMez=?, HreNumTen=?, HreIntCod=?, HreIntDsc=?, HreNumTon=?, HreMaqHdr=?, HreTotKgm=?, HreTotMtr=?, HreTotPie=?, HreNumColF=?, HreFamCodT=?, HreHilasa=?, HreEnsayo=?, HreOpa=?, HreOpn=?, HreDispCli=?, HreMacCod=?, HreNInter=?, HreCencId=?, HreCenDsc=?, HreComp1=?, HreComp2=?, HreUser=?, HreDiaHora=?, HreCdn2=?, HreCtw=?, CliCod=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK, "TXPHISREH")
         ,new UpdateCursor("T00L718", "DELETE FROM TXPHISREH  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?", GX_NOMASK, "TXPHISREH")
         ,new ForEachCursor("T00L719", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L720", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L721", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L722", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreProCodP, HreOrdLinF FROM TXPHAGRHD WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L723", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L724", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L725", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L726", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L727", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L728", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00L729", "INSERT INTO TXPHISREM(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreMaqCod, HreVolPrd, HreFacAbs, HreFecPes, HreMaqPes, HreULinPro, HreUsrCod, HReMaqNh, HReMaqVX, HReMaqBL, HReMaqFlow, HReMaqRPM, HReMaqMol, HReMaqTor, HReMaqCla, HReMaqTej, HReMaqDel, HReMaqPML, HreCosAA, HrecosAd, HreCosAnc, HreCosCol, HreCosPA, HreCosPD, HreLtsSb, HreLtsRm, HreAcaQ, HreAcab, HreNPrg, HreLotF, HreAnc, HreGrm, HreVel, HreObs, HreAva, HreAs, HreAi, EmprCod, HreFecAlt, HreUsrMod, HreFecMod, HreFasCod, HreOrdLin, HreNroPar, HreTotKgs, HreTotMts, HreTotPrd, HreProPrd, HreNumRmt, HreNumReo, HreNumInt, HreDti, HreDtf, HreUltObs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0)", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T00L730", "UPDATE TXPHISREM SET HreMaqCod=?, HreVolPrd=?, HreFacAbs=?, HreFecPes=?, HreMaqPes=?, HreULinPro=?, HreUsrCod=?, HReMaqNh=?, HReMaqVX=?, HReMaqBL=?, HReMaqFlow=?, HReMaqRPM=?, HReMaqMol=?, HReMaqTor=?, HReMaqCla=?, HReMaqTej=?, HReMaqDel=?, HReMaqPML=?, HreCosAA=?, HrecosAd=?, HreCosAnc=?, HreCosCol=?, HreCosPA=?, HreCosPD=?, HreLtsSb=?, HreLtsRm=?, HreAcaQ=?, HreAcab=?, HreNPrg=?, HreLotF=?, HreAnc=?, HreGrm=?, HreVel=?, HreObs=?, HreAva=?, HreAs=?, HreAi=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new UpdateCursor("T00L731", "DELETE FROM TXPHISREM  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?", GX_NOMASK, "TXPHISREM")
         ,new ForEachCursor("T00L732", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreNormId FROM TXPHISRE2 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L733", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreTraID FROM TXPHISRE3 WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L734", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L735", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinObs FROM TXPHISOBS WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L736", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L737", "SELECT HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreNH2O, EmprCod FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? and HreLinPro = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L738", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00L739", "INSERT INTO TXPHISREC(HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreProCod, HreProDsc, HreProTie, HreProTmx, HreNumPro, HreNumRec, HreNH2O, EmprCod, HreVolPro, HreTieprg, HreNroPrg) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK, "TXPHISREC")
         ,new UpdateCursor("T00L740", "UPDATE TXPHISREC SET HreProCod=?, HreProDsc=?, HreProTie=?, HreProTmx=?, HreNumPro=?, HreNumRec=?, HreNH2O=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?", GX_NOMASK, "TXPHISREC")
         ,new UpdateCursor("T00L741", "DELETE FROM TXPHISREC  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?", GX_NOMASK, "TXPHISREC")
         ,new ForEachCursor("T00L742", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMaq = ? AND HreLinPro = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L743", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(35, 20);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 3);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(43, 3);
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
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(35, 20);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 3);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(43, 3);
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
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 20);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(38);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((byte[]) buf[74])[0] = rslt.getByte(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 20);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((int[]) buf[78])[0] = rslt.getInt(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 80);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 21);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 21);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 10);
               ((java.util.Date[]) buf[91])[0] = rslt.getGXDateTime(49);
               ((String[]) buf[92])[0] = rslt.getString(50, 4);
               ((String[]) buf[93])[0] = rslt.getString(51, 4);
               ((String[]) buf[94])[0] = rslt.getString(52, 3);
               ((int[]) buf[95])[0] = rslt.getInt(53);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
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
               ((short[]) buf[66])[0] = rslt.getShort(36);
               ((boolean[]) buf[67])[0] = rslt.wasNull();
               ((String[]) buf[68])[0] = rslt.getString(37, 20);
               ((boolean[]) buf[69])[0] = rslt.wasNull();
               ((int[]) buf[70])[0] = rslt.getInt(38);
               ((boolean[]) buf[71])[0] = rslt.wasNull();
               ((String[]) buf[72])[0] = rslt.getString(39, 1);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((byte[]) buf[74])[0] = rslt.getByte(40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(41, 20);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((int[]) buf[78])[0] = rslt.getInt(42);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((int[]) buf[80])[0] = rslt.getInt(43);
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((short[]) buf[82])[0] = rslt.getShort(44);
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((String[]) buf[84])[0] = rslt.getString(45, 80);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(46, 21);
               ((boolean[]) buf[87])[0] = rslt.wasNull();
               ((String[]) buf[88])[0] = rslt.getString(47, 21);
               ((boolean[]) buf[89])[0] = rslt.wasNull();
               ((String[]) buf[90])[0] = rslt.getString(48, 10);
               ((java.util.Date[]) buf[91])[0] = rslt.getGXDateTime(49);
               ((String[]) buf[92])[0] = rslt.getString(50, 4);
               ((String[]) buf[93])[0] = rslt.getString(51, 4);
               ((String[]) buf[94])[0] = rslt.getString(52, 3);
               ((int[]) buf[95])[0] = rslt.getInt(53);
               ((boolean[]) buf[96])[0] = rslt.wasNull();
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
               ((short[]) buf[69])[0] = rslt.getShort(38);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(39, 20);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((int[]) buf[73])[0] = rslt.getInt(40);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 1);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((byte[]) buf[77])[0] = rslt.getByte(42);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(43, 20);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(44);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((int[]) buf[83])[0] = rslt.getInt(45);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((short[]) buf[85])[0] = rslt.getShort(46);
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getString(47, 80);
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getString(48, 21);
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               ((String[]) buf[91])[0] = rslt.getString(49, 21);
               ((boolean[]) buf[92])[0] = rslt.wasNull();
               ((String[]) buf[93])[0] = rslt.getString(50, 10);
               ((java.util.Date[]) buf[94])[0] = rslt.getGXDateTime(51);
               ((String[]) buf[95])[0] = rslt.getString(52, 4);
               ((String[]) buf[96])[0] = rslt.getString(53, 4);
               ((String[]) buf[97])[0] = rslt.getString(54, 3);
               ((int[]) buf[98])[0] = rslt.getInt(55);
               ((boolean[]) buf[99])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 25 :
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
               ((short[]) buf[19])[0] = rslt.getShort(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(14);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(16);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(17);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((short[]) buf[29])[0] = rslt.getShort(18);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((short[]) buf[31])[0] = rslt.getShort(19);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(21);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(22);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(23);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[49])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((int[]) buf[53])[0] = rslt.getInt(30);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((int[]) buf[55])[0] = rslt.getInt(31);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(32, 6);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(35, 20);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((short[]) buf[65])[0] = rslt.getShort(36);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(37);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(38,2);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(39);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getString(40, 4);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getString(41, 3);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getString(42, 3);
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getString(43, 3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
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
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
               return;
            case 10 :
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
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               return;
            case 14 :
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
                  stmt.setShort(36, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[69], 20);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(38, ((Number) parms[71]).intValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(39, (String)parms[73], 1);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(40, ((Number) parms[75]).byteValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[77], 20);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(42, ((Number) parms[79]).intValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(43, ((Number) parms[81]).intValue());
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(44, ((Number) parms[83]).shortValue());
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(45, (String)parms[85], 80);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(46, (String)parms[87], 21);
               }
               if ( ((Boolean) parms[88]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(47, (String)parms[89], 21);
               }
               stmt.setString(48, (String)parms[90], 10);
               stmt.setDateTime(49, (java.util.Date)parms[91], false);
               stmt.setString(50, (String)parms[92], 4);
               stmt.setString(51, (String)parms[93], 4);
               stmt.setString(52, (String)parms[94], 3);
               if ( ((Boolean) parms[95]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(53, ((Number) parms[96]).intValue());
               }
               return;
            case 15 :
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
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[65], 20);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(34, ((Number) parms[67]).intValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 1);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(36, ((Number) parms[71]).byteValue());
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 20);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(38, ((Number) parms[75]).intValue());
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(39, ((Number) parms[77]).intValue());
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[81], 80);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[83], 21);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(43, (String)parms[85], 21);
               }
               stmt.setString(44, (String)parms[86], 10);
               stmt.setDateTime(45, (java.util.Date)parms[87], false);
               stmt.setString(46, (String)parms[88], 4);
               stmt.setString(47, (String)parms[89], 4);
               if ( ((Boolean) parms[90]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(48, ((Number) parms[91]).intValue());
               }
               stmt.setString(49, (String)parms[92], 3);
               stmt.setInt(50, ((Number) parms[93]).intValue());
               stmt.setByte(51, ((Number) parms[94]).byteValue());
               stmt.setString(52, (String)parms[95], 1);
               stmt.setByte(53, ((Number) parms[96]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 18 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 27 :
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
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[20]).shortValue());
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
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[26]).byteValue());
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
                  stmt.setShort(18, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[34], 10);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(21, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(22, ((Number) parms[38]).byteValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(23, ((Number) parms[40]).shortValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(26, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(27, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(28, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(29, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(30, ((Number) parms[54]).intValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(31, ((Number) parms[56]).intValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[58], 6);
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(33, (String)parms[60], 1);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[62], 6);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[64], 20);
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[66]).shortValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(38, (java.math.BigDecimal)parms[70], 2);
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[72], 800);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(40, (String)parms[74], 4);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(41, (String)parms[76], 3);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(42, (String)parms[78], 3);
               }
               stmt.setString(43, (String)parms[79], 3);
               return;
            case 28 :
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(11, ((Number) parms[21]).byteValue());
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
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[27]).shortValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[29], 10);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[35]).shortValue());
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[51]).intValue());
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
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(28, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(29, (String)parms[57], 6);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[59], 20);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[67], 800);
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[69], 4);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[71], 3);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[73], 3);
               }
               stmt.setString(38, (String)parms[74], 3);
               stmt.setInt(39, ((Number) parms[75]).intValue());
               stmt.setByte(40, ((Number) parms[76]).byteValue());
               stmt.setString(41, (String)parms[77], 1);
               stmt.setByte(42, ((Number) parms[78]).byteValue());
               stmt.setShort(43, ((Number) parms[79]).shortValue());
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 37 :
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
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 3);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

