package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class thisrea_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"HRELANYPVP") == 0 )
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
         A4508HreLinMAL = (short)(GXutil.lval( httpContext.GetPar( "HreLinMAL"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx1asahrelanypvpL6677( A396EmprCod, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A4508HreLinMAL, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
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
         gxload_5( A396EmprCod, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A719PrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "HISTORICO RECETAS AÑAD.BALANZ.", ""), (short)(0)) ;
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

   public thisrea_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public thisrea_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( thisrea_impl.class ));
   }

   public thisrea_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbHreLanyUnd = new HTMLChoice();
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
      if ( cmbHreLanyUnd.getItemCount() > 0 )
      {
         A12707HreLanyUnd = cmbHreLanyUnd.getValidValue(A12707HreLanyUnd) ;
         n12707HreLanyUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", A12707HreLanyUnd);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbHreLanyUnd.setValue( GXutil.rtrim( A12707HreLanyUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbHreLanyUnd.getInternalname(), "Values", cmbHreLanyUnd.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_THISREA.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "HreBarCod", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarCod_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Codigo Reoperado His.Receta", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreBarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarReo_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Codigo Particion Hist.Receta", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreBarPar_Internalname, GXutil.rtrim( A4494HreBarPar), GXutil.rtrim( localUtil.format( A4494HreBarPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreBarPar_Jsonclick, 0, "", "", "", "", "", 1, edtHreBarPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Num.Cierres receta Hist.Receta", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumCie_Internalname, GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumCie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumCie_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumCie_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Lin.Maquina Añad.Hist.Receta", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLinMAL_Internalname, GXutil.ltrim( localUtil.ntoc( A4508HreLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLinMAL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4508HreLinMAL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4508HreLinMAL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLinMAL_Jsonclick, 0, "", "", "", "", "", 1, edtHreLinMAL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Numero Añadida.Hist.Receta", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreNumAny_Internalname, GXutil.ltrim( localUtil.ntoc( A4509HreNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreNumAny_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4509HreNumAny), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4509HreNumAny), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreNumAny_Jsonclick, 0, "", "", "", "", "", 1, edtHreNumAny_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "ProductoID", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Descrip.Producto.Hist.Receta", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrdPrdDsc_Internalname, GXutil.rtrim( A4510HrdPrdDsc), GXutil.rtrim( localUtil.format( A4510HrdPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrdPrdDsc_Jsonclick, 0, "", "", "", "", "", 1, edtHrdPrdDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Cantidad Añadida.Hist.Receta", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHrePrdCFin_Internalname, GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHrePrdCFin_Enabled!=0) ? localUtil.format( A4511HrePrdCFin, "ZZZZZZ9.999") : localUtil.format( A4511HrePrdCFin, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHrePrdCFin_Jsonclick, 0, "", "", "", "", "", 1, edtHrePrdCFin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Producto.Hist.Receta", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyPrd_Internalname, GXutil.rtrim( A4512HreLanyPrd), GXutil.rtrim( localUtil.format( A4512HreLanyPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyPrd_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyPrd_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Cantidad. Hist.Receta", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyCan_Internalname, GXutil.ltrim( localUtil.ntoc( A4513HreLanyCan, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLanyCan_Enabled!=0) ? localUtil.format( A4513HreLanyCan, "ZZZZZZ9.999") : localUtil.format( A4513HreLanyCan, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyCan_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyCan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Nro.Orden. Hist.Receta", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyNro_Internalname, GXutil.ltrim( localUtil.ntoc( A4514HreLanyNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLanyNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4514HreLanyNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4514HreLanyNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyNro_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Tanque.Hist.receta", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A4515HreLanyTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLanyTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4515HreLanyTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A4515HreLanyTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyTnq_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Usuario Pesaje", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyUsr_Internalname, GXutil.rtrim( A4580HreLanyUsr), GXutil.rtrim( localUtil.format( A4580HreLanyUsr, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyUsr_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyUsr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Fecha Hora Pesaje", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHreLanyFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyFec_Internalname, localUtil.ttoc( A4581HreLanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A4581HreLanyFec, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyFec_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyFec_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHreLanyFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHreLanyFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_THISREA.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Lote", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyLot_Internalname, GXutil.rtrim( A5808HreLanyLot), GXutil.rtrim( localUtil.format( A5808HreLanyLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyLot_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyLot_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Cant Digitada", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHreLanyCtd_Internalname, GXutil.ltrim( localUtil.ntoc( A12708HreLanyCtd, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHreLanyCtd_Enabled!=0) ? localUtil.format( A12708HreLanyCtd, "ZZZZZZ9.999") : localUtil.format( A12708HreLanyCtd, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHreLanyCtd_Jsonclick, 0, "", "", "", "", "", 1, edtHreLanyCtd_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_THISREA.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbHreLanyUnd, cmbHreLanyUnd.getInternalname(), GXutil.rtrim( A12707HreLanyUnd), 1, cmbHreLanyUnd.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbHreLanyUnd.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "", true, (byte)(0), "HLP_THISREA.htm");
      cmbHreLanyUnd.setValue( GXutil.rtrim( A12707HreLanyUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbHreLanyUnd.getInternalname(), "Values", cmbHreLanyUnd.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_THISREA.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_THISREA.htm");
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
         Z4508HreLinMAL = (short)(localUtil.ctol( httpContext.cgiGet( "Z4508HreLinMAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4509HreNumAny = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4509HreNumAny"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z4510HrdPrdDsc = httpContext.cgiGet( "Z4510HrdPrdDsc") ;
         Z4511HrePrdCFin = localUtil.ctond( httpContext.cgiGet( "Z4511HrePrdCFin")) ;
         Z4512HreLanyPrd = httpContext.cgiGet( "Z4512HreLanyPrd") ;
         Z4513HreLanyCan = localUtil.ctond( httpContext.cgiGet( "Z4513HreLanyCan")) ;
         Z4514HreLanyNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4514HreLanyNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4515HreLanyTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4515HreLanyTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4580HreLanyUsr = httpContext.cgiGet( "Z4580HreLanyUsr") ;
         Z4581HreLanyFec = localUtil.ctot( httpContext.cgiGet( "Z4581HreLanyFec"), 0) ;
         Z5808HreLanyLot = httpContext.cgiGet( "Z5808HreLanyLot") ;
         Z12708HreLanyCtd = localUtil.ctond( httpContext.cgiGet( "Z12708HreLanyCtd")) ;
         Z12707HreLanyUnd = httpContext.cgiGet( "Z12707HreLanyUnd") ;
         Z13940HreLanyLtF = localUtil.ctod( httpContext.cgiGet( "Z13940HreLanyLtF"), 0) ;
         A13940HreLanyLtF = localUtil.ctod( httpContext.cgiGet( "Z13940HreLanyLtF"), 0) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A14363HreLanyPvp = localUtil.ctond( httpContext.cgiGet( "HRELANYPVP")) ;
         A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "PRDFACCON")) ;
         A14364HreLanyCos = localUtil.ctond( httpContext.cgiGet( "HRELANYCOS")) ;
         A13940HreLanyLtF = localUtil.ctod( httpContext.cgiGet( "HRELANYLTF"), 0) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELINMAL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLinMAL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4508HreLinMAL = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         }
         else
         {
            A4508HreLinMAL = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRENUMANY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreNumAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4509HreNumAny = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
         }
         else
         {
            A4509HreNumAny = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
         }
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A4510HrdPrdDsc = httpContext.cgiGet( edtHrdPrdDsc_Internalname) ;
         n4510HrdPrdDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4510HrdPrdDsc", A4510HrdPrdDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHrePrdCFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHrePrdCFin_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HREPRDCFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHrePrdCFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4511HrePrdCFin = DecimalUtil.ZERO ;
            n4511HrePrdCFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4511HrePrdCFin", GXutil.ltrimstr( A4511HrePrdCFin, 11, 3));
         }
         else
         {
            A4511HrePrdCFin = localUtil.ctond( httpContext.cgiGet( edtHrePrdCFin_Internalname)) ;
            n4511HrePrdCFin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4511HrePrdCFin", GXutil.ltrimstr( A4511HrePrdCFin, 11, 3));
         }
         A4512HreLanyPrd = httpContext.cgiGet( edtHreLanyPrd_Internalname) ;
         n4512HreLanyPrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4512HreLanyPrd", A4512HreLanyPrd);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreLanyCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreLanyCan_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELANYCAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLanyCan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4513HreLanyCan = DecimalUtil.ZERO ;
            n4513HreLanyCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4513HreLanyCan", GXutil.ltrimstr( A4513HreLanyCan, 11, 3));
         }
         else
         {
            A4513HreLanyCan = localUtil.ctond( httpContext.cgiGet( edtHreLanyCan_Internalname)) ;
            n4513HreLanyCan = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4513HreLanyCan", GXutil.ltrimstr( A4513HreLanyCan, 11, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELANYNRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLanyNro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4514HreLanyNro = (byte)(0) ;
            n4514HreLanyNro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4514HreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4514HreLanyNro), 2, 0));
         }
         else
         {
            A4514HreLanyNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLanyNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4514HreLanyNro = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4514HreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4514HreLanyNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHreLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHreLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELANYTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLanyTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4515HreLanyTnq = (byte)(0) ;
            n4515HreLanyTnq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4515HreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4515HreLanyTnq), 2, 0));
         }
         else
         {
            A4515HreLanyTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreLanyTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4515HreLanyTnq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4515HreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4515HreLanyTnq), 2, 0));
         }
         A4580HreLanyUsr = GXutil.upper( httpContext.cgiGet( edtHreLanyUsr_Internalname)) ;
         n4580HreLanyUsr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4580HreLanyUsr", A4580HreLanyUsr);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtHreLanyFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "HRELANYFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLanyFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
            n4581HreLanyFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4581HreLanyFec", localUtil.ttoc( A4581HreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A4581HreLanyFec = localUtil.ctot( httpContext.cgiGet( edtHreLanyFec_Internalname)) ;
            n4581HreLanyFec = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4581HreLanyFec", localUtil.ttoc( A4581HreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A5808HreLanyLot = httpContext.cgiGet( edtHreLanyLot_Internalname) ;
         n5808HreLanyLot = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5808HreLanyLot", A5808HreLanyLot);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHreLanyCtd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHreLanyCtd_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HRELANYCTD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHreLanyCtd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12708HreLanyCtd = DecimalUtil.ZERO ;
            n12708HreLanyCtd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12708HreLanyCtd", GXutil.ltrimstr( A12708HreLanyCtd, 11, 3));
         }
         else
         {
            A12708HreLanyCtd = localUtil.ctond( httpContext.cgiGet( edtHreLanyCtd_Internalname)) ;
            n12708HreLanyCtd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12708HreLanyCtd", GXutil.ltrimstr( A12708HreLanyCtd, 11, 3));
         }
         cmbHreLanyUnd.setValue( httpContext.cgiGet( cmbHreLanyUnd.getInternalname()) );
         A12707HreLanyUnd = httpContext.cgiGet( cmbHreLanyUnd.getInternalname()) ;
         n12707HreLanyUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", A12707HreLanyUnd);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"THISREA");
         forbiddenHiddens.add("HreLanyLtF", localUtil.format(A13940HreLanyLtF, "99/99/99"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4508HreLinMAL != Z4508HreLinMAL ) || ( A4509HreNumAny != Z4509HreNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("thisrea:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            A4508HreLinMAL = (short)(GXutil.lval( httpContext.GetPar( "HreLinMAL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
            A4509HreNumAny = (byte)(GXutil.lval( httpContext.GetPar( "HreNumAny"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
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
            initAllL6677( ) ;
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
      disableAttributesL6677( ) ;
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

   public void confirm_L60( )
   {
      beforeValidateL6677( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsL6677( ) ;
         }
         else
         {
            checkExtendedTableL6677( ) ;
            if ( AnyError == 0 )
            {
               zmL6677( 4) ;
               zmL6677( 5) ;
            }
            closeExtendedTableCursorsL6677( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
      if ( AnyError == 0 )
      {
         confirmValuesL60( ) ;
      }
   }

   public void resetCaptionL60( )
   {
   }

   public void zmL6677( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4510HrdPrdDsc = T00L63_A4510HrdPrdDsc[0] ;
            Z4511HrePrdCFin = T00L63_A4511HrePrdCFin[0] ;
            Z4512HreLanyPrd = T00L63_A4512HreLanyPrd[0] ;
            Z4513HreLanyCan = T00L63_A4513HreLanyCan[0] ;
            Z4514HreLanyNro = T00L63_A4514HreLanyNro[0] ;
            Z4515HreLanyTnq = T00L63_A4515HreLanyTnq[0] ;
            Z4580HreLanyUsr = T00L63_A4580HreLanyUsr[0] ;
            Z4581HreLanyFec = T00L63_A4581HreLanyFec[0] ;
            Z5808HreLanyLot = T00L63_A5808HreLanyLot[0] ;
            Z12708HreLanyCtd = T00L63_A12708HreLanyCtd[0] ;
            Z12707HreLanyUnd = T00L63_A12707HreLanyUnd[0] ;
            Z13940HreLanyLtF = T00L63_A13940HreLanyLtF[0] ;
         }
         else
         {
            Z4510HrdPrdDsc = A4510HrdPrdDsc ;
            Z4511HrePrdCFin = A4511HrePrdCFin ;
            Z4512HreLanyPrd = A4512HreLanyPrd ;
            Z4513HreLanyCan = A4513HreLanyCan ;
            Z4514HreLanyNro = A4514HreLanyNro ;
            Z4515HreLanyTnq = A4515HreLanyTnq ;
            Z4580HreLanyUsr = A4580HreLanyUsr ;
            Z4581HreLanyFec = A4581HreLanyFec ;
            Z5808HreLanyLot = A5808HreLanyLot ;
            Z12708HreLanyCtd = A12708HreLanyCtd ;
            Z12707HreLanyUnd = A12707HreLanyUnd ;
            Z13940HreLanyLtF = A13940HreLanyLtF ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z4508HreLinMAL = A4508HreLinMAL ;
         Z4509HreNumAny = A4509HreNumAny ;
         Z4510HrdPrdDsc = A4510HrdPrdDsc ;
         Z4511HrePrdCFin = A4511HrePrdCFin ;
         Z4512HreLanyPrd = A4512HreLanyPrd ;
         Z4513HreLanyCan = A4513HreLanyCan ;
         Z4514HreLanyNro = A4514HreLanyNro ;
         Z4515HreLanyTnq = A4515HreLanyTnq ;
         Z4580HreLanyUsr = A4580HreLanyUsr ;
         Z4581HreLanyFec = A4581HreLanyFec ;
         Z5808HreLanyLot = A5808HreLanyLot ;
         Z12708HreLanyCtd = A12708HreLanyCtd ;
         Z12707HreLanyUnd = A12707HreLanyUnd ;
         Z13940HreLanyLtF = A13940HreLanyLtF ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z707PrdFacCon = A707PrdFacCon ;
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

   public void loadL6677( )
   {
      /* Using cursor T00L66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound677 = (short)(1) ;
         A4510HrdPrdDsc = T00L66_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = T00L66_n4510HrdPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4510HrdPrdDsc", A4510HrdPrdDsc);
         A4511HrePrdCFin = T00L66_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = T00L66_n4511HrePrdCFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4511HrePrdCFin", GXutil.ltrimstr( A4511HrePrdCFin, 11, 3));
         A4512HreLanyPrd = T00L66_A4512HreLanyPrd[0] ;
         n4512HreLanyPrd = T00L66_n4512HreLanyPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4512HreLanyPrd", A4512HreLanyPrd);
         A4513HreLanyCan = T00L66_A4513HreLanyCan[0] ;
         n4513HreLanyCan = T00L66_n4513HreLanyCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4513HreLanyCan", GXutil.ltrimstr( A4513HreLanyCan, 11, 3));
         A4514HreLanyNro = T00L66_A4514HreLanyNro[0] ;
         n4514HreLanyNro = T00L66_n4514HreLanyNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4514HreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4514HreLanyNro), 2, 0));
         A4515HreLanyTnq = T00L66_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = T00L66_n4515HreLanyTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4515HreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4515HreLanyTnq), 2, 0));
         A4580HreLanyUsr = T00L66_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = T00L66_n4580HreLanyUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4580HreLanyUsr", A4580HreLanyUsr);
         A4581HreLanyFec = T00L66_A4581HreLanyFec[0] ;
         n4581HreLanyFec = T00L66_n4581HreLanyFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4581HreLanyFec", localUtil.ttoc( A4581HreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5808HreLanyLot = T00L66_A5808HreLanyLot[0] ;
         n5808HreLanyLot = T00L66_n5808HreLanyLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5808HreLanyLot", A5808HreLanyLot);
         A12708HreLanyCtd = T00L66_A12708HreLanyCtd[0] ;
         n12708HreLanyCtd = T00L66_n12708HreLanyCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12708HreLanyCtd", GXutil.ltrimstr( A12708HreLanyCtd, 11, 3));
         A12707HreLanyUnd = T00L66_A12707HreLanyUnd[0] ;
         n12707HreLanyUnd = T00L66_n12707HreLanyUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", A12707HreLanyUnd);
         A13940HreLanyLtF = T00L66_A13940HreLanyLtF[0] ;
         A707PrdFacCon = T00L66_A707PrdFacCon[0] ;
         zmL6677( -3) ;
      }
      pr_default.close(4);
      onLoadActionsL6677( ) ;
   }

   public void onLoadActionsL6677( )
   {
      GXt_decimal1 = A14363HreLanyPvp ;
      GXv_char2[0] = A396EmprCod ;
      GXv_int3[0] = A4492HreBarCod ;
      GXv_int4[0] = A4493HreBarReo ;
      GXv_char5[0] = A4494HreBarPar ;
      GXv_int6[0] = A4495HreNumCie ;
      GXv_int7[0] = A4508HreLinMAL ;
      GXv_char8[0] = A719PrdNum ;
      GXv_decimal9[0] = GXt_decimal1 ;
      new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_int7, GXv_char8, GXv_decimal9) ;
      thisrea_impl.this.A396EmprCod = GXv_char2[0] ;
      thisrea_impl.this.A4492HreBarCod = GXv_int3[0] ;
      thisrea_impl.this.A4493HreBarReo = GXv_int4[0] ;
      thisrea_impl.this.A4494HreBarPar = GXv_char5[0] ;
      thisrea_impl.this.A4495HreNumCie = GXv_int6[0] ;
      thisrea_impl.this.A4508HreLinMAL = GXv_int7[0] ;
      thisrea_impl.this.A719PrdNum = GXv_char8[0] ;
      thisrea_impl.this.GXt_decimal1 = GXv_decimal9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14363HreLanyPvp = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14363HreLanyPvp", GXutil.ltrimstr( A14363HreLanyPvp, 11, 3));
      A14364HreLanyCos = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(A14363HreLanyPvp).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14364HreLanyCos", GXutil.ltrimstr( A14364HreLanyCos, 10, 2));
   }

   public void checkExtendedTableL6677( )
   {
      nIsDirty_677 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00L65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T00L64 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A707PrdFacCon = T00L64_A707PrdFacCon[0] ;
      pr_default.close(2);
      nIsDirty_677 = (short)(1) ;
      GXt_decimal1 = A14363HreLanyPvp ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4492HreBarCod ;
      GXv_int6[0] = A4493HreBarReo ;
      GXv_char5[0] = A4494HreBarPar ;
      GXv_int4[0] = A4495HreNumCie ;
      GXv_int7[0] = A4508HreLinMAL ;
      GXv_char2[0] = A719PrdNum ;
      GXv_decimal9[0] = GXt_decimal1 ;
      new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int7, GXv_char2, GXv_decimal9) ;
      thisrea_impl.this.A396EmprCod = GXv_char8[0] ;
      thisrea_impl.this.A4492HreBarCod = GXv_int3[0] ;
      thisrea_impl.this.A4493HreBarReo = GXv_int6[0] ;
      thisrea_impl.this.A4494HreBarPar = GXv_char5[0] ;
      thisrea_impl.this.A4495HreNumCie = GXv_int4[0] ;
      thisrea_impl.this.A4508HreLinMAL = GXv_int7[0] ;
      thisrea_impl.this.A719PrdNum = GXv_char2[0] ;
      thisrea_impl.this.GXt_decimal1 = GXv_decimal9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14363HreLanyPvp = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14363HreLanyPvp", GXutil.ltrimstr( A14363HreLanyPvp, 11, 3));
      nIsDirty_677 = (short)(1) ;
      A14364HreLanyCos = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(A14363HreLanyPvp).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14364HreLanyCos", GXutil.ltrimstr( A14364HreLanyCos, 10, 2));
   }

   public void closeExtendedTableCursorsL6677( )
   {
      pr_default.close(3);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_5( String A396EmprCod ,
                         int A4492HreBarCod ,
                         byte A4493HreBarReo ,
                         String A4494HreBarPar ,
                         byte A4495HreNumCie )
   {
      /* Using cursor T00L67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_4( String A396EmprCod ,
                         String A719PrdNum )
   {
      /* Using cursor T00L68 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A707PrdFacCon = T00L68_A707PrdFacCon[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKeyL6677( )
   {
      /* Using cursor T00L69 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound677 = (short)(1) ;
      }
      else
      {
         RcdFound677 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00L63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmL6677( 3) ;
         RcdFound677 = (short)(1) ;
         A4508HreLinMAL = T00L63_A4508HreLinMAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A4509HreNumAny = T00L63_A4509HreNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
         A4510HrdPrdDsc = T00L63_A4510HrdPrdDsc[0] ;
         n4510HrdPrdDsc = T00L63_n4510HrdPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4510HrdPrdDsc", A4510HrdPrdDsc);
         A4511HrePrdCFin = T00L63_A4511HrePrdCFin[0] ;
         n4511HrePrdCFin = T00L63_n4511HrePrdCFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4511HrePrdCFin", GXutil.ltrimstr( A4511HrePrdCFin, 11, 3));
         A4512HreLanyPrd = T00L63_A4512HreLanyPrd[0] ;
         n4512HreLanyPrd = T00L63_n4512HreLanyPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4512HreLanyPrd", A4512HreLanyPrd);
         A4513HreLanyCan = T00L63_A4513HreLanyCan[0] ;
         n4513HreLanyCan = T00L63_n4513HreLanyCan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4513HreLanyCan", GXutil.ltrimstr( A4513HreLanyCan, 11, 3));
         A4514HreLanyNro = T00L63_A4514HreLanyNro[0] ;
         n4514HreLanyNro = T00L63_n4514HreLanyNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4514HreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4514HreLanyNro), 2, 0));
         A4515HreLanyTnq = T00L63_A4515HreLanyTnq[0] ;
         n4515HreLanyTnq = T00L63_n4515HreLanyTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4515HreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4515HreLanyTnq), 2, 0));
         A4580HreLanyUsr = T00L63_A4580HreLanyUsr[0] ;
         n4580HreLanyUsr = T00L63_n4580HreLanyUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4580HreLanyUsr", A4580HreLanyUsr);
         A4581HreLanyFec = T00L63_A4581HreLanyFec[0] ;
         n4581HreLanyFec = T00L63_n4581HreLanyFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4581HreLanyFec", localUtil.ttoc( A4581HreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5808HreLanyLot = T00L63_A5808HreLanyLot[0] ;
         n5808HreLanyLot = T00L63_n5808HreLanyLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5808HreLanyLot", A5808HreLanyLot);
         A12708HreLanyCtd = T00L63_A12708HreLanyCtd[0] ;
         n12708HreLanyCtd = T00L63_n12708HreLanyCtd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12708HreLanyCtd", GXutil.ltrimstr( A12708HreLanyCtd, 11, 3));
         A12707HreLanyUnd = T00L63_A12707HreLanyUnd[0] ;
         n12707HreLanyUnd = T00L63_n12707HreLanyUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", A12707HreLanyUnd);
         A13940HreLanyLtF = T00L63_A13940HreLanyLtF[0] ;
         A396EmprCod = T00L63_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T00L63_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A4492HreBarCod = T00L63_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00L63_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00L63_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00L63_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z4492HreBarCod = A4492HreBarCod ;
         Z4493HreBarReo = A4493HreBarReo ;
         Z4494HreBarPar = A4494HreBarPar ;
         Z4495HreNumCie = A4495HreNumCie ;
         Z4508HreLinMAL = A4508HreLinMAL ;
         Z4509HreNumAny = A4509HreNumAny ;
         Z719PrdNum = A719PrdNum ;
         sMode677 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadL6677( ) ;
         if ( AnyError == 1 )
         {
            RcdFound677 = (short)(0) ;
            initializeNonKeyL6677( ) ;
         }
         Gx_mode = sMode677 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound677 = (short)(0) ;
         initializeNonKeyL6677( ) ;
         sMode677 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode677 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyL6677( ) ;
      if ( RcdFound677 == 0 )
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
      RcdFound677 = (short)(0) ;
      /* Using cursor T00L610 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Short.valueOf(A4508HreLinMAL), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4509HreNumAny), Byte.valueOf(A4509HreNumAny), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4495HreNumCie[0] < A4495HreNumCie ) || ( T00L610_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4508HreLinMAL[0] < A4508HreLinMAL ) || ( T00L610_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L610_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4509HreNumAny[0] < A4509HreNumAny ) || ( T00L610_A4509HreNumAny[0] == A4509HreNumAny ) && ( T00L610_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L610_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L610_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4495HreNumCie[0] > A4495HreNumCie ) || ( T00L610_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4508HreLinMAL[0] > A4508HreLinMAL ) || ( T00L610_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L610_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L610_A4509HreNumAny[0] > A4509HreNumAny ) || ( T00L610_A4509HreNumAny[0] == A4509HreNumAny ) && ( T00L610_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L610_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L610_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L610_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L610_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L610_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L610_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T00L610_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T00L610_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00L610_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00L610_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00L610_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4508HreLinMAL = T00L610_A4508HreLinMAL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
            A4509HreNumAny = T00L610_A4509HreNumAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
            A719PrdNum = T00L610_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound677 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound677 = (short)(0) ;
      /* Using cursor T00L611 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4492HreBarCod), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4493HreBarReo), Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A4494HreBarPar, A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4495HreNumCie), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Short.valueOf(A4508HreLinMAL), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, Byte.valueOf(A4509HreNumAny), Byte.valueOf(A4509HreNumAny), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4495HreNumCie), A4494HreBarPar, Byte.valueOf(A4493HreBarReo), Integer.valueOf(A4492HreBarCod), A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4492HreBarCod[0] > A4492HreBarCod ) || ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4493HreBarReo[0] > A4493HreBarReo ) || ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) > 0 ) || ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4495HreNumCie[0] > A4495HreNumCie ) || ( T00L611_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4508HreLinMAL[0] > A4508HreLinMAL ) || ( T00L611_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L611_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4509HreNumAny[0] > A4509HreNumAny ) || ( T00L611_A4509HreNumAny[0] == A4509HreNumAny ) && ( T00L611_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L611_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L611_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4492HreBarCod[0] < A4492HreBarCod ) || ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4493HreBarReo[0] < A4493HreBarReo ) || ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) < 0 ) || ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4495HreNumCie[0] < A4495HreNumCie ) || ( T00L611_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4508HreLinMAL[0] < A4508HreLinMAL ) || ( T00L611_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L611_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00L611_A4509HreNumAny[0] < A4509HreNumAny ) || ( T00L611_A4509HreNumAny[0] == A4509HreNumAny ) && ( T00L611_A4508HreLinMAL[0] == A4508HreLinMAL ) && ( T00L611_A4495HreNumCie[0] == A4495HreNumCie ) && ( GXutil.strcmp(T00L611_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( T00L611_A4493HreBarReo[0] == A4493HreBarReo ) && ( T00L611_A4492HreBarCod[0] == A4492HreBarCod ) && ( GXutil.strcmp(T00L611_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00L611_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T00L611_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4492HreBarCod = T00L611_A4492HreBarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
            A4493HreBarReo = T00L611_A4493HreBarReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
            A4494HreBarPar = T00L611_A4494HreBarPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
            A4495HreNumCie = T00L611_A4495HreNumCie[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
            A4508HreLinMAL = T00L611_A4508HreLinMAL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
            A4509HreNumAny = T00L611_A4509HreNumAny[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
            A719PrdNum = T00L611_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound677 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyL6677( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertL6677( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound677 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4508HreLinMAL != Z4508HreLinMAL ) || ( A4509HreNumAny != Z4509HreNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
               A4508HreLinMAL = Z4508HreLinMAL ;
               httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
               A4509HreNumAny = Z4509HreNumAny ;
               httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
               A719PrdNum = Z719PrdNum ;
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
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               updateL6677( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4508HreLinMAL != Z4508HreLinMAL ) || ( A4509HreNumAny != Z4509HreNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertL6677( ) ;
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
                  insertL6677( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4508HreLinMAL != Z4508HreLinMAL ) || ( A4509HreNumAny != Z4509HreNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
         A4508HreLinMAL = Z4508HreLinMAL ;
         httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A4509HreNumAny = Z4509HreNumAny ;
         httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
         A719PrdNum = Z719PrdNum ;
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
      getKeyL6677( ) ;
      if ( RcdFound677 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4508HreLinMAL != Z4508HreLinMAL ) || ( A4509HreNumAny != Z4509HreNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
            A4508HreLinMAL = Z4508HreLinMAL ;
            httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
            A4509HreNumAny = Z4509HreNumAny ;
            httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
            A719PrdNum = Z719PrdNum ;
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4492HreBarCod != Z4492HreBarCod ) || ( A4493HreBarReo != Z4493HreBarReo ) || ( GXutil.strcmp(A4494HreBarPar, Z4494HreBarPar) != 0 ) || ( A4495HreNumCie != Z4495HreNumCie ) || ( A4508HreLinMAL != Z4508HreLinMAL ) || ( A4509HreNumAny != Z4509HreNumAny ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "thisrea");
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_L60( ) ;
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
      if ( RcdFound677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartL6677( ) ;
      if ( RcdFound677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL6677( ) ;
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
      if ( RcdFound677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
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
      if ( RcdFound677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
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
      scanStartL6677( ) ;
      if ( RcdFound677 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound677 != 0 )
         {
            scanNextL6677( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndL6677( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyL6677( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00L62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4510HrdPrdDsc, T00L62_A4510HrdPrdDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z4511HrePrdCFin, T00L62_A4511HrePrdCFin[0]) != 0 ) || ( GXutil.strcmp(Z4512HreLanyPrd, T00L62_A4512HreLanyPrd[0]) != 0 ) || ( DecimalUtil.compareTo(Z4513HreLanyCan, T00L62_A4513HreLanyCan[0]) != 0 ) || ( Z4514HreLanyNro != T00L62_A4514HreLanyNro[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4515HreLanyTnq != T00L62_A4515HreLanyTnq[0] ) || ( GXutil.strcmp(Z4580HreLanyUsr, T00L62_A4580HreLanyUsr[0]) != 0 ) || !( GXutil.dateCompare(Z4581HreLanyFec, T00L62_A4581HreLanyFec[0]) ) || ( GXutil.strcmp(Z5808HreLanyLot, T00L62_A5808HreLanyLot[0]) != 0 ) || ( DecimalUtil.compareTo(Z12708HreLanyCtd, T00L62_A12708HreLanyCtd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12707HreLanyUnd, T00L62_A12707HreLanyUnd[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z13940HreLanyLtF), GXutil.resetTime(T00L62_A13940HreLanyLtF[0])) ) )
         {
            if ( GXutil.strcmp(Z4510HrdPrdDsc, T00L62_A4510HrdPrdDsc[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HrdPrdDsc");
               GXutil.writeLogRaw("Old: ",Z4510HrdPrdDsc);
               GXutil.writeLogRaw("Current: ",T00L62_A4510HrdPrdDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z4511HrePrdCFin, T00L62_A4511HrePrdCFin[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HrePrdCFin");
               GXutil.writeLogRaw("Old: ",Z4511HrePrdCFin);
               GXutil.writeLogRaw("Current: ",T00L62_A4511HrePrdCFin[0]);
            }
            if ( GXutil.strcmp(Z4512HreLanyPrd, T00L62_A4512HreLanyPrd[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyPrd");
               GXutil.writeLogRaw("Old: ",Z4512HreLanyPrd);
               GXutil.writeLogRaw("Current: ",T00L62_A4512HreLanyPrd[0]);
            }
            if ( DecimalUtil.compareTo(Z4513HreLanyCan, T00L62_A4513HreLanyCan[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyCan");
               GXutil.writeLogRaw("Old: ",Z4513HreLanyCan);
               GXutil.writeLogRaw("Current: ",T00L62_A4513HreLanyCan[0]);
            }
            if ( Z4514HreLanyNro != T00L62_A4514HreLanyNro[0] )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyNro");
               GXutil.writeLogRaw("Old: ",Z4514HreLanyNro);
               GXutil.writeLogRaw("Current: ",T00L62_A4514HreLanyNro[0]);
            }
            if ( Z4515HreLanyTnq != T00L62_A4515HreLanyTnq[0] )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyTnq");
               GXutil.writeLogRaw("Old: ",Z4515HreLanyTnq);
               GXutil.writeLogRaw("Current: ",T00L62_A4515HreLanyTnq[0]);
            }
            if ( GXutil.strcmp(Z4580HreLanyUsr, T00L62_A4580HreLanyUsr[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyUsr");
               GXutil.writeLogRaw("Old: ",Z4580HreLanyUsr);
               GXutil.writeLogRaw("Current: ",T00L62_A4580HreLanyUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4581HreLanyFec, T00L62_A4581HreLanyFec[0]) ) )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyFec");
               GXutil.writeLogRaw("Old: ",Z4581HreLanyFec);
               GXutil.writeLogRaw("Current: ",T00L62_A4581HreLanyFec[0]);
            }
            if ( GXutil.strcmp(Z5808HreLanyLot, T00L62_A5808HreLanyLot[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyLot");
               GXutil.writeLogRaw("Old: ",Z5808HreLanyLot);
               GXutil.writeLogRaw("Current: ",T00L62_A5808HreLanyLot[0]);
            }
            if ( DecimalUtil.compareTo(Z12708HreLanyCtd, T00L62_A12708HreLanyCtd[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyCtd");
               GXutil.writeLogRaw("Old: ",Z12708HreLanyCtd);
               GXutil.writeLogRaw("Current: ",T00L62_A12708HreLanyCtd[0]);
            }
            if ( GXutil.strcmp(Z12707HreLanyUnd, T00L62_A12707HreLanyUnd[0]) != 0 )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyUnd");
               GXutil.writeLogRaw("Old: ",Z12707HreLanyUnd);
               GXutil.writeLogRaw("Current: ",T00L62_A12707HreLanyUnd[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13940HreLanyLtF), GXutil.resetTime(T00L62_A13940HreLanyLtF[0])) ) )
            {
               GXutil.writeLogln("thisrea:[seudo value changed for attri]"+"HreLanyLtF");
               GXutil.writeLogRaw("Old: ",Z13940HreLanyLtF);
               GXutil.writeLogRaw("Current: ",T00L62_A13940HreLanyLtF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPHISREA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertL6677( )
   {
      beforeValidateL6677( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL6677( ) ;
      }
      if ( AnyError == 0 )
      {
         zmL6677( 0) ;
         checkOptimisticConcurrencyL6677( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL6677( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertL6677( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L612 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), Boolean.valueOf(n4510HrdPrdDsc), A4510HrdPrdDsc, Boolean.valueOf(n4511HrePrdCFin), A4511HrePrdCFin, Boolean.valueOf(n4512HreLanyPrd), A4512HreLanyPrd, Boolean.valueOf(n4513HreLanyCan), A4513HreLanyCan, Boolean.valueOf(n4514HreLanyNro), Byte.valueOf(A4514HreLanyNro), Boolean.valueOf(n4515HreLanyTnq), Byte.valueOf(A4515HreLanyTnq), Boolean.valueOf(n4580HreLanyUsr), A4580HreLanyUsr, Boolean.valueOf(n4581HreLanyFec), A4581HreLanyFec, Boolean.valueOf(n5808HreLanyLot), A5808HreLanyLot, Boolean.valueOf(n12708HreLanyCtd), A12708HreLanyCtd, Boolean.valueOf(n12707HreLanyUnd), A12707HreLanyUnd, A13940HreLanyLtF, A396EmprCod, A719PrdNum, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREA");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionL60( ) ;
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
            loadL6677( ) ;
         }
         endLevelL6677( ) ;
      }
      closeExtendedTableCursorsL6677( ) ;
   }

   public void updateL6677( )
   {
      beforeValidateL6677( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableL6677( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL6677( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmL6677( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateL6677( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00L613 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n4510HrdPrdDsc), A4510HrdPrdDsc, Boolean.valueOf(n4511HrePrdCFin), A4511HrePrdCFin, Boolean.valueOf(n4512HreLanyPrd), A4512HreLanyPrd, Boolean.valueOf(n4513HreLanyCan), A4513HreLanyCan, Boolean.valueOf(n4514HreLanyNro), Byte.valueOf(A4514HreLanyNro), Boolean.valueOf(n4515HreLanyTnq), Byte.valueOf(A4515HreLanyTnq), Boolean.valueOf(n4580HreLanyUsr), A4580HreLanyUsr, Boolean.valueOf(n4581HreLanyFec), A4581HreLanyFec, Boolean.valueOf(n5808HreLanyLot), A5808HreLanyLot, Boolean.valueOf(n12708HreLanyCtd), A12708HreLanyCtd, Boolean.valueOf(n12707HreLanyUnd), A12707HreLanyUnd, A13940HreLanyLtF, A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREA");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPHISREA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateL6677( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionL60( ) ;
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
         endLevelL6677( ) ;
      }
      closeExtendedTableCursorsL6677( ) ;
   }

   public void deferredUpdateL6677( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateL6677( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyL6677( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsL6677( ) ;
         afterConfirmL6677( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteL6677( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00L614 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4508HreLinMAL), Byte.valueOf(A4509HreNumAny), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISREA");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound677 == 0 )
                     {
                        initAllL6677( ) ;
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
                     resetCaptionL60( ) ;
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
      sMode677 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelL6677( ) ;
      Gx_mode = sMode677 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsL6677( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00L615 */
         pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
         A707PrdFacCon = T00L615_A707PrdFacCon[0] ;
         pr_default.close(13);
         GXt_decimal1 = A14363HreLanyPvp ;
         GXv_char8[0] = A396EmprCod ;
         GXv_int3[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_int7[0] = A4508HreLinMAL ;
         GXv_char2[0] = A719PrdNum ;
         GXv_decimal9[0] = GXt_decimal1 ;
         new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int7, GXv_char2, GXv_decimal9) ;
         thisrea_impl.this.A396EmprCod = GXv_char8[0] ;
         thisrea_impl.this.A4492HreBarCod = GXv_int3[0] ;
         thisrea_impl.this.A4493HreBarReo = GXv_int6[0] ;
         thisrea_impl.this.A4494HreBarPar = GXv_char5[0] ;
         thisrea_impl.this.A4495HreNumCie = GXv_int4[0] ;
         thisrea_impl.this.A4508HreLinMAL = GXv_int7[0] ;
         thisrea_impl.this.A719PrdNum = GXv_char2[0] ;
         thisrea_impl.this.GXt_decimal1 = GXv_decimal9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A14363HreLanyPvp = GXt_decimal1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14363HreLanyPvp", GXutil.ltrimstr( A14363HreLanyPvp, 11, 3));
         A14364HreLanyCos = GXutil.roundDecimal( A4511HrePrdCFin.multiply(A707PrdFacCon).multiply(A14363HreLanyPvp).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN), 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14364HreLanyCos", GXutil.ltrimstr( A14364HreLanyCos, 10, 2));
      }
   }

   public void endLevelL6677( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteL6677( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "thisrea");
         if ( AnyError == 0 )
         {
            confirmValuesL60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "thisrea");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartL6677( )
   {
      /* Using cursor T00L616 */
      pr_default.execute(14);
      RcdFound677 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound677 = (short)(1) ;
         A396EmprCod = T00L616_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T00L616_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00L616_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00L616_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00L616_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4508HreLinMAL = T00L616_A4508HreLinMAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A4509HreNumAny = T00L616_A4509HreNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
         A719PrdNum = T00L616_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextL6677( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound677 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound677 = (short)(1) ;
         A396EmprCod = T00L616_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4492HreBarCod = T00L616_A4492HreBarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
         A4493HreBarReo = T00L616_A4493HreBarReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
         A4494HreBarPar = T00L616_A4494HreBarPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
         A4495HreNumCie = T00L616_A4495HreNumCie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
         A4508HreLinMAL = T00L616_A4508HreLinMAL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
         A4509HreNumAny = T00L616_A4509HreNumAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
         A719PrdNum = T00L616_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEndL6677( )
   {
      pr_default.close(14);
   }

   public void afterConfirmL6677( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertL6677( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateL6677( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteL6677( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteL6677( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateL6677( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesL6677( )
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
      edtHreLinMAL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLinMAL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMAL_Enabled), 5, 0), true);
      edtHreNumAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreNumAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumAny_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtHrdPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrdPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrdPrdDsc_Enabled), 5, 0), true);
      edtHrePrdCFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHrePrdCFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHrePrdCFin_Enabled), 5, 0), true);
      edtHreLanyPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyPrd_Enabled), 5, 0), true);
      edtHreLanyCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyCan_Enabled), 5, 0), true);
      edtHreLanyNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyNro_Enabled), 5, 0), true);
      edtHreLanyTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyTnq_Enabled), 5, 0), true);
      edtHreLanyUsr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyUsr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyUsr_Enabled), 5, 0), true);
      edtHreLanyFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyFec_Enabled), 5, 0), true);
      edtHreLanyLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyLot_Enabled), 5, 0), true);
      edtHreLanyCtd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHreLanyCtd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLanyCtd_Enabled), 5, 0), true);
      cmbHreLanyUnd.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbHreLanyUnd.getInternalname(), "Enabled", GXutil.ltrimstr( cmbHreLanyUnd.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashesL6677( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesL60( )
   {
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.thisrea", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"THISREA");
      forbiddenHiddens.add("HreLanyLtF", localUtil.format(A13940HreLanyLtF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("thisrea:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z4508HreLinMAL", GXutil.ltrim( localUtil.ntoc( Z4508HreLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4509HreNumAny", GXutil.ltrim( localUtil.ntoc( Z4509HreNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4510HrdPrdDsc", GXutil.rtrim( Z4510HrdPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4511HrePrdCFin", GXutil.ltrim( localUtil.ntoc( Z4511HrePrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4512HreLanyPrd", GXutil.rtrim( Z4512HreLanyPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4513HreLanyCan", GXutil.ltrim( localUtil.ntoc( Z4513HreLanyCan, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4514HreLanyNro", GXutil.ltrim( localUtil.ntoc( Z4514HreLanyNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4515HreLanyTnq", GXutil.ltrim( localUtil.ntoc( Z4515HreLanyTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4580HreLanyUsr", GXutil.rtrim( Z4580HreLanyUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4581HreLanyFec", localUtil.ttoc( Z4581HreLanyFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5808HreLanyLot", GXutil.rtrim( Z5808HreLanyLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12708HreLanyCtd", GXutil.ltrim( localUtil.ntoc( Z12708HreLanyCtd, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12707HreLanyUnd", GXutil.rtrim( Z12707HreLanyUnd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13940HreLanyLtF", localUtil.dtoc( Z13940HreLanyLtF, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELANYPVP", GXutil.ltrim( localUtil.ntoc( A14363HreLanyPvp, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFACCON", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELANYCOS", GXutil.ltrim( localUtil.ntoc( A14364HreLanyCos, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HRELANYLTF", localUtil.dtoc( A13940HreLanyLtF, 0, "/"));
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
      return formatLink("app.thisrea", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "THISREA" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "HISTORICO RECETAS AÑAD.BALANZ.", "") ;
   }

   public void initializeNonKeyL6677( )
   {
      A14364HreLanyCos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14364HreLanyCos", GXutil.ltrimstr( A14364HreLanyCos, 10, 2));
      A14363HreLanyPvp = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14363HreLanyPvp", GXutil.ltrimstr( A14363HreLanyPvp, 11, 3));
      A4510HrdPrdDsc = "" ;
      n4510HrdPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4510HrdPrdDsc", A4510HrdPrdDsc);
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      n4511HrePrdCFin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4511HrePrdCFin", GXutil.ltrimstr( A4511HrePrdCFin, 11, 3));
      A4512HreLanyPrd = "" ;
      n4512HreLanyPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4512HreLanyPrd", A4512HreLanyPrd);
      A4513HreLanyCan = DecimalUtil.ZERO ;
      n4513HreLanyCan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4513HreLanyCan", GXutil.ltrimstr( A4513HreLanyCan, 11, 3));
      A4514HreLanyNro = (byte)(0) ;
      n4514HreLanyNro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4514HreLanyNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4514HreLanyNro), 2, 0));
      A4515HreLanyTnq = (byte)(0) ;
      n4515HreLanyTnq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4515HreLanyTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4515HreLanyTnq), 2, 0));
      A4580HreLanyUsr = "" ;
      n4580HreLanyUsr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4580HreLanyUsr", A4580HreLanyUsr);
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      n4581HreLanyFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4581HreLanyFec", localUtil.ttoc( A4581HreLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5808HreLanyLot = "" ;
      n5808HreLanyLot = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5808HreLanyLot", A5808HreLanyLot);
      A12708HreLanyCtd = DecimalUtil.ZERO ;
      n12708HreLanyCtd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12708HreLanyCtd", GXutil.ltrimstr( A12708HreLanyCtd, 11, 3));
      A12707HreLanyUnd = "" ;
      n12707HreLanyUnd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", A12707HreLanyUnd);
      A13940HreLanyLtF = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13940HreLanyLtF", localUtil.format(A13940HreLanyLtF, "99/99/99"));
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      Z4510HrdPrdDsc = "" ;
      Z4511HrePrdCFin = DecimalUtil.ZERO ;
      Z4512HreLanyPrd = "" ;
      Z4513HreLanyCan = DecimalUtil.ZERO ;
      Z4514HreLanyNro = (byte)(0) ;
      Z4515HreLanyTnq = (byte)(0) ;
      Z4580HreLanyUsr = "" ;
      Z4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      Z5808HreLanyLot = "" ;
      Z12708HreLanyCtd = DecimalUtil.ZERO ;
      Z12707HreLanyUnd = "" ;
      Z13940HreLanyLtF = GXutil.nullDate() ;
   }

   public void initAllL6677( )
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
      A4508HreLinMAL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
      A4509HreNumAny = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4509HreNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4509HreNumAny), 2, 0));
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKeyL6677( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016253167", true, true);
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
      httpContext.AddJavascriptSource("thisrea.js", "?202661016253167", false, true);
      /* End function include_jscripts */
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
      edtHreLinMAL_Internalname = "HRELINMAL" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtHreNumAny_Internalname = "HRENUMANY" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtHrdPrdDsc_Internalname = "HRDPRDDSC" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtHrePrdCFin_Internalname = "HREPRDCFIN" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtHreLanyPrd_Internalname = "HRELANYPRD" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtHreLanyCan_Internalname = "HRELANYCAN" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtHreLanyNro_Internalname = "HRELANYNRO" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtHreLanyTnq_Internalname = "HRELANYTNQ" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtHreLanyUsr_Internalname = "HRELANYUSR" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtHreLanyFec_Internalname = "HRELANYFEC" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtHreLanyLot_Internalname = "HRELANYLOT" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtHreLanyCtd_Internalname = "HRELANYCTD" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      cmbHreLanyUnd.setInternalname( "HRELANYUND" );
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "HISTORICO RECETAS AÑAD.BALANZ.", "") );
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbHreLanyUnd.setJsonclick( "" );
      cmbHreLanyUnd.setEnabled( 1 );
      cmbHreLanyUnd.setIBackground( (int)(0xFFFFFF) );
      edtHreLanyCtd_Jsonclick = "" ;
      edtHreLanyCtd_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyCtd_Enabled = 1 ;
      edtHreLanyLot_Jsonclick = "" ;
      edtHreLanyLot_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyLot_Enabled = 1 ;
      edtHreLanyFec_Jsonclick = "" ;
      edtHreLanyFec_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyFec_Enabled = 1 ;
      edtHreLanyUsr_Jsonclick = "" ;
      edtHreLanyUsr_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyUsr_Enabled = 1 ;
      edtHreLanyTnq_Jsonclick = "" ;
      edtHreLanyTnq_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyTnq_Enabled = 1 ;
      edtHreLanyNro_Jsonclick = "" ;
      edtHreLanyNro_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyNro_Enabled = 1 ;
      edtHreLanyCan_Jsonclick = "" ;
      edtHreLanyCan_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyCan_Enabled = 1 ;
      edtHreLanyPrd_Jsonclick = "" ;
      edtHreLanyPrd_Backcolor = (int)(0xFFFFFF) ;
      edtHreLanyPrd_Enabled = 1 ;
      edtHrePrdCFin_Jsonclick = "" ;
      edtHrePrdCFin_Backcolor = (int)(0xFFFFFF) ;
      edtHrePrdCFin_Enabled = 1 ;
      edtHrdPrdDsc_Jsonclick = "" ;
      edtHrdPrdDsc_Backcolor = (int)(0xFFFFFF) ;
      edtHrdPrdDsc_Enabled = 1 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Backcolor = (int)(0xFFFFFF) ;
      edtPrdNum_Enabled = 1 ;
      edtHreNumAny_Jsonclick = "" ;
      edtHreNumAny_Backcolor = (int)(0xFFFFFF) ;
      edtHreNumAny_Enabled = 1 ;
      edtHreLinMAL_Jsonclick = "" ;
      edtHreLinMAL_Backcolor = (int)(0xFFFFFF) ;
      edtHreLinMAL_Enabled = 1 ;
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

   public void gx1asahrelanypvpL6677( String A396EmprCod ,
                                      int A4492HreBarCod ,
                                      byte A4493HreBarReo ,
                                      String A4494HreBarPar ,
                                      byte A4495HreNumCie ,
                                      short A4508HreLinMAL ,
                                      String A719PrdNum )
   {
      GXt_decimal1 = A14363HreLanyPvp ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4492HreBarCod ;
      GXv_int6[0] = A4493HreBarReo ;
      GXv_char5[0] = A4494HreBarPar ;
      GXv_int4[0] = A4495HreNumCie ;
      GXv_int7[0] = A4508HreLinMAL ;
      GXv_char2[0] = A719PrdNum ;
      GXv_decimal9[0] = GXt_decimal1 ;
      new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int7, GXv_char2, GXv_decimal9) ;
      thisrea_impl.this.A396EmprCod = GXv_char8[0] ;
      thisrea_impl.this.A4492HreBarCod = GXv_int3[0] ;
      thisrea_impl.this.A4493HreBarReo = GXv_int6[0] ;
      thisrea_impl.this.A4494HreBarPar = GXv_char5[0] ;
      thisrea_impl.this.A4495HreNumCie = GXv_int4[0] ;
      thisrea_impl.this.A4508HreLinMAL = GXv_int7[0] ;
      thisrea_impl.this.A719PrdNum = GXv_char2[0] ;
      thisrea_impl.this.GXt_decimal1 = GXv_decimal9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A4492HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4492HreBarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4493HreBarReo", GXutil.str( A4493HreBarReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4494HreBarPar", A4494HreBarPar);
      httpContext.ajax_rsp_assign_attri("", false, "A4495HreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4495HreNumCie), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A4508HreLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4508HreLinMAL), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A14363HreLanyPvp = GXt_decimal1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14363HreLanyPvp", GXutil.ltrimstr( A14363HreLanyPvp, 11, 3));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14363HreLanyPvp, (byte)(11), (byte)(3), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void init_web_controls( )
   {
      cmbHreLanyUnd.setName( "HRELANYUND" );
      cmbHreLanyUnd.setWebtags( "" );
      cmbHreLanyUnd.addItem("0", httpContext.getMessage( "SN", ""), (short)(0));
      cmbHreLanyUnd.addItem("1", httpContext.getMessage( "kg", ""), (short)(0));
      cmbHreLanyUnd.addItem("2", httpContext.getMessage( "g", ""), (short)(0));
      cmbHreLanyUnd.addItem("3", httpContext.getMessage( "l", ""), (short)(0));
      cmbHreLanyUnd.addItem("4", httpContext.getMessage( "ml", ""), (short)(0));
      if ( cmbHreLanyUnd.getItemCount() > 0 )
      {
         A12707HreLanyUnd = cmbHreLanyUnd.getValidValue(A12707HreLanyUnd) ;
         n12707HreLanyUnd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", A12707HreLanyUnd);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00L617 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(15);
      /* Using cursor T00L615 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A707PrdFacCon = T00L615_A707PrdFacCon[0] ;
      pr_default.close(13);
      GX_FocusControl = edtHrdPrdDsc_Internalname ;
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
      /* Using cursor T00L617 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "HISTORICO RECETAS (Hdr)", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HRENUMCIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Prdnum( )
   {
      n12707HreLanyUnd = false ;
      A12707HreLanyUnd = cmbHreLanyUnd.getValue() ;
      n12707HreLanyUnd = false ;
      cmbHreLanyUnd.setValue( A12707HreLanyUnd );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00L615 */
      pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A707PrdFacCon = T00L615_A707PrdFacCon[0] ;
      pr_default.close(13);
      GXt_decimal1 = A14363HreLanyPvp ;
      GXv_char8[0] = A396EmprCod ;
      GXv_int3[0] = A4492HreBarCod ;
      GXv_int6[0] = A4493HreBarReo ;
      GXv_char5[0] = A4494HreBarPar ;
      GXv_int4[0] = A4495HreNumCie ;
      GXv_int7[0] = A4508HreLinMAL ;
      GXv_char2[0] = A719PrdNum ;
      GXv_decimal9[0] = GXt_decimal1 ;
      new app.precioproductoadicionado(remoteHandle, context).execute( GXv_char8, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int7, GXv_char2, GXv_decimal9) ;
      thisrea_impl.this.A396EmprCod = GXv_char8[0] ;
      thisrea_impl.this.A4492HreBarCod = GXv_int3[0] ;
      thisrea_impl.this.A4493HreBarReo = GXv_int6[0] ;
      thisrea_impl.this.A4494HreBarPar = GXv_char5[0] ;
      thisrea_impl.this.A4495HreNumCie = GXv_int4[0] ;
      thisrea_impl.this.A4508HreLinMAL = GXv_int7[0] ;
      thisrea_impl.this.A719PrdNum = GXv_char2[0] ;
      thisrea_impl.this.GXt_decimal1 = GXv_decimal9[0] ;
      A14363HreLanyPvp = GXt_decimal1 ;
      dynload_actions( ) ;
      if ( cmbHreLanyUnd.getItemCount() > 0 )
      {
         A12707HreLanyUnd = cmbHreLanyUnd.getValidValue(A12707HreLanyUnd) ;
         n12707HreLanyUnd = false ;
         cmbHreLanyUnd.setValue( A12707HreLanyUnd );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbHreLanyUnd.setValue( GXutil.rtrim( A12707HreLanyUnd) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4510HrdPrdDsc", GXutil.rtrim( A4510HrdPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4511HrePrdCFin", GXutil.ltrim( localUtil.ntoc( A4511HrePrdCFin, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4512HreLanyPrd", GXutil.rtrim( A4512HreLanyPrd));
      httpContext.ajax_rsp_assign_attri("", false, "A4513HreLanyCan", GXutil.ltrim( localUtil.ntoc( A4513HreLanyCan, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4514HreLanyNro", GXutil.ltrim( localUtil.ntoc( A4514HreLanyNro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4515HreLanyTnq", GXutil.ltrim( localUtil.ntoc( A4515HreLanyTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4580HreLanyUsr", GXutil.rtrim( A4580HreLanyUsr));
      httpContext.ajax_rsp_assign_attri("", false, "A4581HreLanyFec", localUtil.ttoc( A4581HreLanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5808HreLanyLot", GXutil.rtrim( A5808HreLanyLot));
      httpContext.ajax_rsp_assign_attri("", false, "A12708HreLanyCtd", GXutil.ltrim( localUtil.ntoc( A12708HreLanyCtd, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12707HreLanyUnd", GXutil.rtrim( A12707HreLanyUnd));
      cmbHreLanyUnd.setValue( GXutil.rtrim( A12707HreLanyUnd) );
      httpContext.ajax_rsp_assign_prop("", false, cmbHreLanyUnd.getInternalname(), "Values", cmbHreLanyUnd.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A13940HreLanyLtF", localUtil.format(A13940HreLanyLtF, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14363HreLanyPvp", GXutil.ltrim( localUtil.ntoc( A14363HreLanyPvp, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14364HreLanyCos", GXutil.ltrim( localUtil.ntoc( A14364HreLanyCos, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4492HreBarCod", GXutil.ltrim( localUtil.ntoc( Z4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4493HreBarReo", GXutil.ltrim( localUtil.ntoc( Z4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4494HreBarPar", GXutil.rtrim( Z4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4495HreNumCie", GXutil.ltrim( localUtil.ntoc( Z4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4508HreLinMAL", GXutil.ltrim( localUtil.ntoc( Z4508HreLinMAL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4509HreNumAny", GXutil.ltrim( localUtil.ntoc( Z4509HreNumAny, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4510HrdPrdDsc", GXutil.rtrim( Z4510HrdPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4511HrePrdCFin", GXutil.ltrim( localUtil.ntoc( Z4511HrePrdCFin, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4512HreLanyPrd", GXutil.rtrim( Z4512HreLanyPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4513HreLanyCan", GXutil.ltrim( localUtil.ntoc( Z4513HreLanyCan, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4514HreLanyNro", GXutil.ltrim( localUtil.ntoc( Z4514HreLanyNro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4515HreLanyTnq", GXutil.ltrim( localUtil.ntoc( Z4515HreLanyTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4580HreLanyUsr", GXutil.rtrim( Z4580HreLanyUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4581HreLanyFec", localUtil.ttoc( Z4581HreLanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5808HreLanyLot", GXutil.rtrim( Z5808HreLanyLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12708HreLanyCtd", GXutil.ltrim( localUtil.ntoc( Z12708HreLanyCtd, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12707HreLanyUnd", GXutil.rtrim( Z12707HreLanyUnd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13940HreLanyLtF", localUtil.format(Z13940HreLanyLtF, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14363HreLanyPvp", GXutil.ltrim( localUtil.ntoc( Z14363HreLanyPvp, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14364HreLanyCos", GXutil.ltrim( localUtil.ntoc( Z14364HreLanyCos, (byte)(10), (byte)(2), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A13940HreLanyLtF',fld:'HRELANYLTF',pic:''}]");
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
      setEventMetadata("VALID_HRELINMAL","{handler:'valid_Hrelinmal',iparms:[]");
      setEventMetadata("VALID_HRELINMAL",",oparms:[]}");
      setEventMetadata("VALID_HRENUMANY","{handler:'valid_Hrenumany',iparms:[]");
      setEventMetadata("VALID_HRENUMANY",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A13940HreLanyLtF',fld:'HRELANYLTF',pic:''},{av:'cmbHreLanyUnd'},{av:'A12707HreLanyUnd',fld:'HRELANYUND',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4508HreLinMAL',fld:'HRELINMAL',pic:'ZZZ9'},{av:'A4509HreNumAny',fld:'HRENUMANY',pic:'Z9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A4510HrdPrdDsc',fld:'HRDPRDDSC',pic:''},{av:'A4511HrePrdCFin',fld:'HREPRDCFIN',pic:'ZZZZZZ9.999'},{av:'A4512HreLanyPrd',fld:'HRELANYPRD',pic:''},{av:'A4513HreLanyCan',fld:'HRELANYCAN',pic:'ZZZZZZ9.999'},{av:'A4514HreLanyNro',fld:'HRELANYNRO',pic:'Z9'},{av:'A4515HreLanyTnq',fld:'HRELANYTNQ',pic:'Z9'},{av:'A4580HreLanyUsr',fld:'HRELANYUSR',pic:'@!'},{av:'A4581HreLanyFec',fld:'HRELANYFEC',pic:'99/99/99 99:99:99'},{av:'A5808HreLanyLot',fld:'HRELANYLOT',pic:''},{av:'A12708HreLanyCtd',fld:'HRELANYCTD',pic:'ZZZZZZ9.999'},{av:'cmbHreLanyUnd'},{av:'A12707HreLanyUnd',fld:'HRELANYUND',pic:''},{av:'A13940HreLanyLtF',fld:'HRELANYLTF',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A14363HreLanyPvp',fld:'HRELANYPVP',pic:'ZZZZZZ9.999'},{av:'A14364HreLanyCos',fld:'HRELANYCOS',pic:'ZZZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z4492HreBarCod'},{av:'Z4493HreBarReo'},{av:'Z4494HreBarPar'},{av:'Z4495HreNumCie'},{av:'Z4508HreLinMAL'},{av:'Z4509HreNumAny'},{av:'Z719PrdNum'},{av:'Z4510HrdPrdDsc'},{av:'Z4511HrePrdCFin'},{av:'Z4512HreLanyPrd'},{av:'Z4513HreLanyCan'},{av:'Z4514HreLanyNro'},{av:'Z4515HreLanyTnq'},{av:'Z4580HreLanyUsr'},{av:'Z4581HreLanyFec'},{av:'Z5808HreLanyLot'},{av:'Z12708HreLanyCtd'},{av:'Z12707HreLanyUnd'},{av:'Z13940HreLanyLtF'},{av:'Z707PrdFacCon'},{av:'Z14363HreLanyPvp'},{av:'Z14364HreLanyCos'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_HREPRDCFIN","{handler:'valid_Hreprdcfin',iparms:[]");
      setEventMetadata("VALID_HREPRDCFIN",",oparms:[]}");
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
      pr_default.close(13);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z4494HreBarPar = "" ;
      Z719PrdNum = "" ;
      Z4510HrdPrdDsc = "" ;
      Z4511HrePrdCFin = DecimalUtil.ZERO ;
      Z4512HreLanyPrd = "" ;
      Z4513HreLanyCan = DecimalUtil.ZERO ;
      Z4580HreLanyUsr = "" ;
      Z4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      Z5808HreLanyLot = "" ;
      Z12708HreLanyCtd = DecimalUtil.ZERO ;
      Z12707HreLanyUnd = "" ;
      Z13940HreLanyLtF = GXutil.nullDate() ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A12707HreLanyUnd = "" ;
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
      A4510HrdPrdDsc = "" ;
      lblTextblock10_Jsonclick = "" ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      lblTextblock11_Jsonclick = "" ;
      A4512HreLanyPrd = "" ;
      lblTextblock12_Jsonclick = "" ;
      A4513HreLanyCan = DecimalUtil.ZERO ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      lblTextblock15_Jsonclick = "" ;
      A4580HreLanyUsr = "" ;
      lblTextblock16_Jsonclick = "" ;
      A4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      lblTextblock17_Jsonclick = "" ;
      A5808HreLanyLot = "" ;
      lblTextblock18_Jsonclick = "" ;
      A12708HreLanyCtd = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      A13940HreLanyLtF = GXutil.nullDate() ;
      Gx_mode = "" ;
      A14363HreLanyPvp = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A14364HreLanyCos = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      T00L66_A4508HreLinMAL = new short[1] ;
      T00L66_A4509HreNumAny = new byte[1] ;
      T00L66_A4510HrdPrdDsc = new String[] {""} ;
      T00L66_n4510HrdPrdDsc = new boolean[] {false} ;
      T00L66_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L66_n4511HrePrdCFin = new boolean[] {false} ;
      T00L66_A4512HreLanyPrd = new String[] {""} ;
      T00L66_n4512HreLanyPrd = new boolean[] {false} ;
      T00L66_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L66_n4513HreLanyCan = new boolean[] {false} ;
      T00L66_A4514HreLanyNro = new byte[1] ;
      T00L66_n4514HreLanyNro = new boolean[] {false} ;
      T00L66_A4515HreLanyTnq = new byte[1] ;
      T00L66_n4515HreLanyTnq = new boolean[] {false} ;
      T00L66_A4580HreLanyUsr = new String[] {""} ;
      T00L66_n4580HreLanyUsr = new boolean[] {false} ;
      T00L66_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00L66_n4581HreLanyFec = new boolean[] {false} ;
      T00L66_A5808HreLanyLot = new String[] {""} ;
      T00L66_n5808HreLanyLot = new boolean[] {false} ;
      T00L66_A12708HreLanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L66_n12708HreLanyCtd = new boolean[] {false} ;
      T00L66_A12707HreLanyUnd = new String[] {""} ;
      T00L66_n12707HreLanyUnd = new boolean[] {false} ;
      T00L66_A13940HreLanyLtF = new java.util.Date[] {GXutil.nullDate()} ;
      T00L66_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L66_A396EmprCod = new String[] {""} ;
      T00L66_A719PrdNum = new String[] {""} ;
      T00L66_A4492HreBarCod = new int[1] ;
      T00L66_A4493HreBarReo = new byte[1] ;
      T00L66_A4494HreBarPar = new String[] {""} ;
      T00L66_A4495HreNumCie = new byte[1] ;
      T00L65_A396EmprCod = new String[] {""} ;
      T00L64_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L67_A396EmprCod = new String[] {""} ;
      T00L68_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L69_A396EmprCod = new String[] {""} ;
      T00L69_A4492HreBarCod = new int[1] ;
      T00L69_A4493HreBarReo = new byte[1] ;
      T00L69_A4494HreBarPar = new String[] {""} ;
      T00L69_A4495HreNumCie = new byte[1] ;
      T00L69_A4508HreLinMAL = new short[1] ;
      T00L69_A4509HreNumAny = new byte[1] ;
      T00L69_A719PrdNum = new String[] {""} ;
      T00L63_A4508HreLinMAL = new short[1] ;
      T00L63_A4509HreNumAny = new byte[1] ;
      T00L63_A4510HrdPrdDsc = new String[] {""} ;
      T00L63_n4510HrdPrdDsc = new boolean[] {false} ;
      T00L63_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L63_n4511HrePrdCFin = new boolean[] {false} ;
      T00L63_A4512HreLanyPrd = new String[] {""} ;
      T00L63_n4512HreLanyPrd = new boolean[] {false} ;
      T00L63_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L63_n4513HreLanyCan = new boolean[] {false} ;
      T00L63_A4514HreLanyNro = new byte[1] ;
      T00L63_n4514HreLanyNro = new boolean[] {false} ;
      T00L63_A4515HreLanyTnq = new byte[1] ;
      T00L63_n4515HreLanyTnq = new boolean[] {false} ;
      T00L63_A4580HreLanyUsr = new String[] {""} ;
      T00L63_n4580HreLanyUsr = new boolean[] {false} ;
      T00L63_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00L63_n4581HreLanyFec = new boolean[] {false} ;
      T00L63_A5808HreLanyLot = new String[] {""} ;
      T00L63_n5808HreLanyLot = new boolean[] {false} ;
      T00L63_A12708HreLanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L63_n12708HreLanyCtd = new boolean[] {false} ;
      T00L63_A12707HreLanyUnd = new String[] {""} ;
      T00L63_n12707HreLanyUnd = new boolean[] {false} ;
      T00L63_A13940HreLanyLtF = new java.util.Date[] {GXutil.nullDate()} ;
      T00L63_A396EmprCod = new String[] {""} ;
      T00L63_A719PrdNum = new String[] {""} ;
      T00L63_A4492HreBarCod = new int[1] ;
      T00L63_A4493HreBarReo = new byte[1] ;
      T00L63_A4494HreBarPar = new String[] {""} ;
      T00L63_A4495HreNumCie = new byte[1] ;
      sMode677 = "" ;
      T00L610_A396EmprCod = new String[] {""} ;
      T00L610_A4492HreBarCod = new int[1] ;
      T00L610_A4493HreBarReo = new byte[1] ;
      T00L610_A4494HreBarPar = new String[] {""} ;
      T00L610_A4495HreNumCie = new byte[1] ;
      T00L610_A4508HreLinMAL = new short[1] ;
      T00L610_A4509HreNumAny = new byte[1] ;
      T00L610_A719PrdNum = new String[] {""} ;
      T00L611_A396EmprCod = new String[] {""} ;
      T00L611_A4492HreBarCod = new int[1] ;
      T00L611_A4493HreBarReo = new byte[1] ;
      T00L611_A4494HreBarPar = new String[] {""} ;
      T00L611_A4495HreNumCie = new byte[1] ;
      T00L611_A4508HreLinMAL = new short[1] ;
      T00L611_A4509HreNumAny = new byte[1] ;
      T00L611_A719PrdNum = new String[] {""} ;
      T00L62_A4508HreLinMAL = new short[1] ;
      T00L62_A4509HreNumAny = new byte[1] ;
      T00L62_A4510HrdPrdDsc = new String[] {""} ;
      T00L62_n4510HrdPrdDsc = new boolean[] {false} ;
      T00L62_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L62_n4511HrePrdCFin = new boolean[] {false} ;
      T00L62_A4512HreLanyPrd = new String[] {""} ;
      T00L62_n4512HreLanyPrd = new boolean[] {false} ;
      T00L62_A4513HreLanyCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L62_n4513HreLanyCan = new boolean[] {false} ;
      T00L62_A4514HreLanyNro = new byte[1] ;
      T00L62_n4514HreLanyNro = new boolean[] {false} ;
      T00L62_A4515HreLanyTnq = new byte[1] ;
      T00L62_n4515HreLanyTnq = new boolean[] {false} ;
      T00L62_A4580HreLanyUsr = new String[] {""} ;
      T00L62_n4580HreLanyUsr = new boolean[] {false} ;
      T00L62_A4581HreLanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00L62_n4581HreLanyFec = new boolean[] {false} ;
      T00L62_A5808HreLanyLot = new String[] {""} ;
      T00L62_n5808HreLanyLot = new boolean[] {false} ;
      T00L62_A12708HreLanyCtd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L62_n12708HreLanyCtd = new boolean[] {false} ;
      T00L62_A12707HreLanyUnd = new String[] {""} ;
      T00L62_n12707HreLanyUnd = new boolean[] {false} ;
      T00L62_A13940HreLanyLtF = new java.util.Date[] {GXutil.nullDate()} ;
      T00L62_A396EmprCod = new String[] {""} ;
      T00L62_A719PrdNum = new String[] {""} ;
      T00L62_A4492HreBarCod = new int[1] ;
      T00L62_A4493HreBarReo = new byte[1] ;
      T00L62_A4494HreBarPar = new String[] {""} ;
      T00L62_A4495HreNumCie = new byte[1] ;
      T00L615_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00L616_A396EmprCod = new String[] {""} ;
      T00L616_A4492HreBarCod = new int[1] ;
      T00L616_A4493HreBarReo = new byte[1] ;
      T00L616_A4494HreBarPar = new String[] {""} ;
      T00L616_A4495HreNumCie = new byte[1] ;
      T00L616_A4508HreLinMAL = new short[1] ;
      T00L616_A4509HreNumAny = new byte[1] ;
      T00L616_A719PrdNum = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T00L617_A396EmprCod = new String[] {""} ;
      Z14363HreLanyPvp = DecimalUtil.ZERO ;
      Z14364HreLanyCos = DecimalUtil.ZERO ;
      GXt_decimal1 = DecimalUtil.ZERO ;
      GXv_char8 = new String[1] ;
      GXv_int3 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new byte[1] ;
      GXv_int7 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      ZZ396EmprCod = "" ;
      ZZ4494HreBarPar = "" ;
      ZZ719PrdNum = "" ;
      ZZ4510HrdPrdDsc = "" ;
      ZZ4511HrePrdCFin = DecimalUtil.ZERO ;
      ZZ4512HreLanyPrd = "" ;
      ZZ4513HreLanyCan = DecimalUtil.ZERO ;
      ZZ4580HreLanyUsr = "" ;
      ZZ4581HreLanyFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ5808HreLanyLot = "" ;
      ZZ12708HreLanyCtd = DecimalUtil.ZERO ;
      ZZ12707HreLanyUnd = "" ;
      ZZ13940HreLanyLtF = GXutil.nullDate() ;
      ZZ707PrdFacCon = DecimalUtil.ZERO ;
      ZZ14363HreLanyPvp = DecimalUtil.ZERO ;
      ZZ14364HreLanyCos = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.thisrea__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.thisrea__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.thisrea__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.thisrea__default(),
         new Object[] {
             new Object[] {
            T00L62_A4508HreLinMAL, T00L62_A4509HreNumAny, T00L62_A4510HrdPrdDsc, T00L62_n4510HrdPrdDsc, T00L62_A4511HrePrdCFin, T00L62_n4511HrePrdCFin, T00L62_A4512HreLanyPrd, T00L62_n4512HreLanyPrd, T00L62_A4513HreLanyCan, T00L62_n4513HreLanyCan,
            T00L62_A4514HreLanyNro, T00L62_n4514HreLanyNro, T00L62_A4515HreLanyTnq, T00L62_n4515HreLanyTnq, T00L62_A4580HreLanyUsr, T00L62_n4580HreLanyUsr, T00L62_A4581HreLanyFec, T00L62_n4581HreLanyFec, T00L62_A5808HreLanyLot, T00L62_n5808HreLanyLot,
            T00L62_A12708HreLanyCtd, T00L62_n12708HreLanyCtd, T00L62_A12707HreLanyUnd, T00L62_n12707HreLanyUnd, T00L62_A13940HreLanyLtF, T00L62_A396EmprCod, T00L62_A719PrdNum, T00L62_A4492HreBarCod, T00L62_A4493HreBarReo, T00L62_A4494HreBarPar,
            T00L62_A4495HreNumCie
            }
            , new Object[] {
            T00L63_A4508HreLinMAL, T00L63_A4509HreNumAny, T00L63_A4510HrdPrdDsc, T00L63_n4510HrdPrdDsc, T00L63_A4511HrePrdCFin, T00L63_n4511HrePrdCFin, T00L63_A4512HreLanyPrd, T00L63_n4512HreLanyPrd, T00L63_A4513HreLanyCan, T00L63_n4513HreLanyCan,
            T00L63_A4514HreLanyNro, T00L63_n4514HreLanyNro, T00L63_A4515HreLanyTnq, T00L63_n4515HreLanyTnq, T00L63_A4580HreLanyUsr, T00L63_n4580HreLanyUsr, T00L63_A4581HreLanyFec, T00L63_n4581HreLanyFec, T00L63_A5808HreLanyLot, T00L63_n5808HreLanyLot,
            T00L63_A12708HreLanyCtd, T00L63_n12708HreLanyCtd, T00L63_A12707HreLanyUnd, T00L63_n12707HreLanyUnd, T00L63_A13940HreLanyLtF, T00L63_A396EmprCod, T00L63_A719PrdNum, T00L63_A4492HreBarCod, T00L63_A4493HreBarReo, T00L63_A4494HreBarPar,
            T00L63_A4495HreNumCie
            }
            , new Object[] {
            T00L64_A707PrdFacCon
            }
            , new Object[] {
            T00L65_A396EmprCod
            }
            , new Object[] {
            T00L66_A4508HreLinMAL, T00L66_A4509HreNumAny, T00L66_A4510HrdPrdDsc, T00L66_n4510HrdPrdDsc, T00L66_A4511HrePrdCFin, T00L66_n4511HrePrdCFin, T00L66_A4512HreLanyPrd, T00L66_n4512HreLanyPrd, T00L66_A4513HreLanyCan, T00L66_n4513HreLanyCan,
            T00L66_A4514HreLanyNro, T00L66_n4514HreLanyNro, T00L66_A4515HreLanyTnq, T00L66_n4515HreLanyTnq, T00L66_A4580HreLanyUsr, T00L66_n4580HreLanyUsr, T00L66_A4581HreLanyFec, T00L66_n4581HreLanyFec, T00L66_A5808HreLanyLot, T00L66_n5808HreLanyLot,
            T00L66_A12708HreLanyCtd, T00L66_n12708HreLanyCtd, T00L66_A12707HreLanyUnd, T00L66_n12707HreLanyUnd, T00L66_A13940HreLanyLtF, T00L66_A707PrdFacCon, T00L66_A396EmprCod, T00L66_A719PrdNum, T00L66_A4492HreBarCod, T00L66_A4493HreBarReo,
            T00L66_A4494HreBarPar, T00L66_A4495HreNumCie
            }
            , new Object[] {
            T00L67_A396EmprCod
            }
            , new Object[] {
            T00L68_A707PrdFacCon
            }
            , new Object[] {
            T00L69_A396EmprCod, T00L69_A4492HreBarCod, T00L69_A4493HreBarReo, T00L69_A4494HreBarPar, T00L69_A4495HreNumCie, T00L69_A4508HreLinMAL, T00L69_A4509HreNumAny, T00L69_A719PrdNum
            }
            , new Object[] {
            T00L610_A396EmprCod, T00L610_A4492HreBarCod, T00L610_A4493HreBarReo, T00L610_A4494HreBarPar, T00L610_A4495HreNumCie, T00L610_A4508HreLinMAL, T00L610_A4509HreNumAny, T00L610_A719PrdNum
            }
            , new Object[] {
            T00L611_A396EmprCod, T00L611_A4492HreBarCod, T00L611_A4493HreBarReo, T00L611_A4494HreBarPar, T00L611_A4495HreNumCie, T00L611_A4508HreLinMAL, T00L611_A4509HreNumAny, T00L611_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00L615_A707PrdFacCon
            }
            , new Object[] {
            T00L616_A396EmprCod, T00L616_A4492HreBarCod, T00L616_A4493HreBarReo, T00L616_A4494HreBarPar, T00L616_A4495HreNumCie, T00L616_A4508HreLinMAL, T00L616_A4509HreNumAny, T00L616_A719PrdNum
            }
            , new Object[] {
            T00L617_A396EmprCod
            }
         }
      );
   }

   private byte Z4493HreBarReo ;
   private byte Z4495HreNumCie ;
   private byte Z4509HreNumAny ;
   private byte Z4514HreLanyNro ;
   private byte Z4515HreLanyTnq ;
   private byte GxWebError ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte nKeyPressed ;
   private byte A4509HreNumAny ;
   private byte A4514HreLanyNro ;
   private byte A4515HreLanyTnq ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXv_int6[] ;
   private byte GXv_int4[] ;
   private byte ZZ4493HreBarReo ;
   private byte ZZ4495HreNumCie ;
   private byte ZZ4509HreNumAny ;
   private byte ZZ4514HreLanyNro ;
   private byte ZZ4515HreLanyTnq ;
   private short Z4508HreLinMAL ;
   private short A4508HreLinMAL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound677 ;
   private short nIsDirty_677 ;
   private short GXv_int7[] ;
   private short ZZ4508HreLinMAL ;
   private int Z4492HreBarCod ;
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
   private int edtHreLinMAL_Enabled ;
   private int edtHreNumAny_Enabled ;
   private int edtPrdNum_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtHrdPrdDsc_Enabled ;
   private int edtHrePrdCFin_Enabled ;
   private int edtHreLanyPrd_Enabled ;
   private int edtHreLanyCan_Enabled ;
   private int edtHreLanyNro_Enabled ;
   private int edtHreLanyTnq_Enabled ;
   private int edtHreLanyUsr_Enabled ;
   private int edtHreLanyFec_Enabled ;
   private int edtHreLanyLot_Enabled ;
   private int edtHreLanyCtd_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int GX_JID ;
   private int idxLst ;
   private int edtHreLanyCtd_Backcolor ;
   private int edtHreLanyLot_Backcolor ;
   private int edtHreLanyFec_Backcolor ;
   private int edtHreLanyUsr_Backcolor ;
   private int edtHreLanyTnq_Backcolor ;
   private int edtHreLanyNro_Backcolor ;
   private int edtHreLanyCan_Backcolor ;
   private int edtHreLanyPrd_Backcolor ;
   private int edtHrePrdCFin_Backcolor ;
   private int edtHrdPrdDsc_Backcolor ;
   private int edtPrdNum_Backcolor ;
   private int edtHreNumAny_Backcolor ;
   private int edtHreLinMAL_Backcolor ;
   private int edtHreNumCie_Backcolor ;
   private int edtHreBarPar_Backcolor ;
   private int edtHreBarReo_Backcolor ;
   private int edtHreBarCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int GXv_int3[] ;
   private int ZZ4492HreBarCod ;
   private java.math.BigDecimal Z4511HrePrdCFin ;
   private java.math.BigDecimal Z4513HreLanyCan ;
   private java.math.BigDecimal Z12708HreLanyCtd ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal A4513HreLanyCan ;
   private java.math.BigDecimal A12708HreLanyCtd ;
   private java.math.BigDecimal A14363HreLanyPvp ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A14364HreLanyCos ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z14363HreLanyPvp ;
   private java.math.BigDecimal Z14364HreLanyCos ;
   private java.math.BigDecimal GXt_decimal1 ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal ZZ4511HrePrdCFin ;
   private java.math.BigDecimal ZZ4513HreLanyCan ;
   private java.math.BigDecimal ZZ12708HreLanyCtd ;
   private java.math.BigDecimal ZZ707PrdFacCon ;
   private java.math.BigDecimal ZZ14363HreLanyPvp ;
   private java.math.BigDecimal ZZ14364HreLanyCos ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z4494HreBarPar ;
   private String Z719PrdNum ;
   private String Z4510HrdPrdDsc ;
   private String Z4512HreLanyPrd ;
   private String Z4580HreLanyUsr ;
   private String Z5808HreLanyLot ;
   private String Z12707HreLanyUnd ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A12707HreLanyUnd ;
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
   private String edtHreBarPar_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtHreNumCie_Internalname ;
   private String edtHreNumCie_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtHreLinMAL_Internalname ;
   private String edtHreLinMAL_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtHreNumAny_Internalname ;
   private String edtHreNumAny_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtHrdPrdDsc_Internalname ;
   private String A4510HrdPrdDsc ;
   private String edtHrdPrdDsc_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtHrePrdCFin_Internalname ;
   private String edtHrePrdCFin_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtHreLanyPrd_Internalname ;
   private String A4512HreLanyPrd ;
   private String edtHreLanyPrd_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtHreLanyCan_Internalname ;
   private String edtHreLanyCan_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtHreLanyNro_Internalname ;
   private String edtHreLanyNro_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtHreLanyTnq_Internalname ;
   private String edtHreLanyTnq_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtHreLanyUsr_Internalname ;
   private String A4580HreLanyUsr ;
   private String edtHreLanyUsr_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtHreLanyFec_Internalname ;
   private String edtHreLanyFec_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtHreLanyLot_Internalname ;
   private String A5808HreLanyLot ;
   private String edtHreLanyLot_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtHreLanyCtd_Internalname ;
   private String edtHreLanyCtd_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
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
   private String Gx_mode ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode677 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXv_char8[] ;
   private String GXv_char5[] ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ4494HreBarPar ;
   private String ZZ719PrdNum ;
   private String ZZ4510HrdPrdDsc ;
   private String ZZ4512HreLanyPrd ;
   private String ZZ4580HreLanyUsr ;
   private String ZZ5808HreLanyLot ;
   private String ZZ12707HreLanyUnd ;
   private java.util.Date Z4581HreLanyFec ;
   private java.util.Date A4581HreLanyFec ;
   private java.util.Date ZZ4581HreLanyFec ;
   private java.util.Date Z13940HreLanyLtF ;
   private java.util.Date A13940HreLanyLtF ;
   private java.util.Date ZZ13940HreLanyLtF ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n12707HreLanyUnd ;
   private boolean n4510HrdPrdDsc ;
   private boolean n4511HrePrdCFin ;
   private boolean n4512HreLanyPrd ;
   private boolean n4513HreLanyCan ;
   private boolean n4514HreLanyNro ;
   private boolean n4515HreLanyTnq ;
   private boolean n4580HreLanyUsr ;
   private boolean n4581HreLanyFec ;
   private boolean n5808HreLanyLot ;
   private boolean n12708HreLanyCtd ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbHreLanyUnd ;
   private IDataStoreProvider pr_default ;
   private short[] T00L66_A4508HreLinMAL ;
   private byte[] T00L66_A4509HreNumAny ;
   private String[] T00L66_A4510HrdPrdDsc ;
   private boolean[] T00L66_n4510HrdPrdDsc ;
   private java.math.BigDecimal[] T00L66_A4511HrePrdCFin ;
   private boolean[] T00L66_n4511HrePrdCFin ;
   private String[] T00L66_A4512HreLanyPrd ;
   private boolean[] T00L66_n4512HreLanyPrd ;
   private java.math.BigDecimal[] T00L66_A4513HreLanyCan ;
   private boolean[] T00L66_n4513HreLanyCan ;
   private byte[] T00L66_A4514HreLanyNro ;
   private boolean[] T00L66_n4514HreLanyNro ;
   private byte[] T00L66_A4515HreLanyTnq ;
   private boolean[] T00L66_n4515HreLanyTnq ;
   private String[] T00L66_A4580HreLanyUsr ;
   private boolean[] T00L66_n4580HreLanyUsr ;
   private java.util.Date[] T00L66_A4581HreLanyFec ;
   private boolean[] T00L66_n4581HreLanyFec ;
   private String[] T00L66_A5808HreLanyLot ;
   private boolean[] T00L66_n5808HreLanyLot ;
   private java.math.BigDecimal[] T00L66_A12708HreLanyCtd ;
   private boolean[] T00L66_n12708HreLanyCtd ;
   private String[] T00L66_A12707HreLanyUnd ;
   private boolean[] T00L66_n12707HreLanyUnd ;
   private java.util.Date[] T00L66_A13940HreLanyLtF ;
   private java.math.BigDecimal[] T00L66_A707PrdFacCon ;
   private String[] T00L66_A396EmprCod ;
   private String[] T00L66_A719PrdNum ;
   private int[] T00L66_A4492HreBarCod ;
   private byte[] T00L66_A4493HreBarReo ;
   private String[] T00L66_A4494HreBarPar ;
   private byte[] T00L66_A4495HreNumCie ;
   private String[] T00L65_A396EmprCod ;
   private java.math.BigDecimal[] T00L64_A707PrdFacCon ;
   private String[] T00L67_A396EmprCod ;
   private java.math.BigDecimal[] T00L68_A707PrdFacCon ;
   private String[] T00L69_A396EmprCod ;
   private int[] T00L69_A4492HreBarCod ;
   private byte[] T00L69_A4493HreBarReo ;
   private String[] T00L69_A4494HreBarPar ;
   private byte[] T00L69_A4495HreNumCie ;
   private short[] T00L69_A4508HreLinMAL ;
   private byte[] T00L69_A4509HreNumAny ;
   private String[] T00L69_A719PrdNum ;
   private short[] T00L63_A4508HreLinMAL ;
   private byte[] T00L63_A4509HreNumAny ;
   private String[] T00L63_A4510HrdPrdDsc ;
   private boolean[] T00L63_n4510HrdPrdDsc ;
   private java.math.BigDecimal[] T00L63_A4511HrePrdCFin ;
   private boolean[] T00L63_n4511HrePrdCFin ;
   private String[] T00L63_A4512HreLanyPrd ;
   private boolean[] T00L63_n4512HreLanyPrd ;
   private java.math.BigDecimal[] T00L63_A4513HreLanyCan ;
   private boolean[] T00L63_n4513HreLanyCan ;
   private byte[] T00L63_A4514HreLanyNro ;
   private boolean[] T00L63_n4514HreLanyNro ;
   private byte[] T00L63_A4515HreLanyTnq ;
   private boolean[] T00L63_n4515HreLanyTnq ;
   private String[] T00L63_A4580HreLanyUsr ;
   private boolean[] T00L63_n4580HreLanyUsr ;
   private java.util.Date[] T00L63_A4581HreLanyFec ;
   private boolean[] T00L63_n4581HreLanyFec ;
   private String[] T00L63_A5808HreLanyLot ;
   private boolean[] T00L63_n5808HreLanyLot ;
   private java.math.BigDecimal[] T00L63_A12708HreLanyCtd ;
   private boolean[] T00L63_n12708HreLanyCtd ;
   private String[] T00L63_A12707HreLanyUnd ;
   private boolean[] T00L63_n12707HreLanyUnd ;
   private java.util.Date[] T00L63_A13940HreLanyLtF ;
   private String[] T00L63_A396EmprCod ;
   private String[] T00L63_A719PrdNum ;
   private int[] T00L63_A4492HreBarCod ;
   private byte[] T00L63_A4493HreBarReo ;
   private String[] T00L63_A4494HreBarPar ;
   private byte[] T00L63_A4495HreNumCie ;
   private String[] T00L610_A396EmprCod ;
   private int[] T00L610_A4492HreBarCod ;
   private byte[] T00L610_A4493HreBarReo ;
   private String[] T00L610_A4494HreBarPar ;
   private byte[] T00L610_A4495HreNumCie ;
   private short[] T00L610_A4508HreLinMAL ;
   private byte[] T00L610_A4509HreNumAny ;
   private String[] T00L610_A719PrdNum ;
   private String[] T00L611_A396EmprCod ;
   private int[] T00L611_A4492HreBarCod ;
   private byte[] T00L611_A4493HreBarReo ;
   private String[] T00L611_A4494HreBarPar ;
   private byte[] T00L611_A4495HreNumCie ;
   private short[] T00L611_A4508HreLinMAL ;
   private byte[] T00L611_A4509HreNumAny ;
   private String[] T00L611_A719PrdNum ;
   private short[] T00L62_A4508HreLinMAL ;
   private byte[] T00L62_A4509HreNumAny ;
   private String[] T00L62_A4510HrdPrdDsc ;
   private boolean[] T00L62_n4510HrdPrdDsc ;
   private java.math.BigDecimal[] T00L62_A4511HrePrdCFin ;
   private boolean[] T00L62_n4511HrePrdCFin ;
   private String[] T00L62_A4512HreLanyPrd ;
   private boolean[] T00L62_n4512HreLanyPrd ;
   private java.math.BigDecimal[] T00L62_A4513HreLanyCan ;
   private boolean[] T00L62_n4513HreLanyCan ;
   private byte[] T00L62_A4514HreLanyNro ;
   private boolean[] T00L62_n4514HreLanyNro ;
   private byte[] T00L62_A4515HreLanyTnq ;
   private boolean[] T00L62_n4515HreLanyTnq ;
   private String[] T00L62_A4580HreLanyUsr ;
   private boolean[] T00L62_n4580HreLanyUsr ;
   private java.util.Date[] T00L62_A4581HreLanyFec ;
   private boolean[] T00L62_n4581HreLanyFec ;
   private String[] T00L62_A5808HreLanyLot ;
   private boolean[] T00L62_n5808HreLanyLot ;
   private java.math.BigDecimal[] T00L62_A12708HreLanyCtd ;
   private boolean[] T00L62_n12708HreLanyCtd ;
   private String[] T00L62_A12707HreLanyUnd ;
   private boolean[] T00L62_n12707HreLanyUnd ;
   private java.util.Date[] T00L62_A13940HreLanyLtF ;
   private String[] T00L62_A396EmprCod ;
   private String[] T00L62_A719PrdNum ;
   private int[] T00L62_A4492HreBarCod ;
   private byte[] T00L62_A4493HreBarReo ;
   private String[] T00L62_A4494HreBarPar ;
   private byte[] T00L62_A4495HreNumCie ;
   private java.math.BigDecimal[] T00L615_A707PrdFacCon ;
   private String[] T00L616_A396EmprCod ;
   private int[] T00L616_A4492HreBarCod ;
   private byte[] T00L616_A4493HreBarReo ;
   private String[] T00L616_A4494HreBarPar ;
   private byte[] T00L616_A4495HreNumCie ;
   private short[] T00L616_A4508HreLinMAL ;
   private byte[] T00L616_A4509HreNumAny ;
   private String[] T00L616_A719PrdNum ;
   private String[] T00L617_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class thisrea__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrea__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrea__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class thisrea__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00L62", "SELECT HreLinMAL, HreNumAny, HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyCtd, HreLanyUnd, HreLanyLtF, EmprCod, PrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMAL = ? AND HreNumAny = ? AND PrdNum = ?  FOR UPDATE OF HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyCtd, HreLanyUnd, HreLanyLtF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L63", "SELECT HreLinMAL, HreNumAny, HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyCtd, HreLanyUnd, HreLanyLtF, EmprCod, PrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMAL = ? AND HreNumAny = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L64", "SELECT PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L65", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L66", "SELECT /*+ FIRST_ROWS(100) */ TM1.HreLinMAL, TM1.HreNumAny, TM1.HrdPrdDsc, TM1.HrePrdCFin, TM1.HreLanyPrd, TM1.HreLanyCan, TM1.HreLanyNro, TM1.HreLanyTnq, TM1.HreLanyUsr, TM1.HreLanyFec, TM1.HreLanyLot, TM1.HreLanyCtd, TM1.HreLanyUnd, TM1.HreLanyLtF, T2.PrdFacCon, TM1.EmprCod, TM1.PrdNum, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie FROM (TXPHISREA TM1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = TM1.EmprCod AND T2.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.HreBarCod = ? and TM1.HreBarReo = ? and TM1.HreBarPar = ? and TM1.HreNumCie = ? and TM1.HreLinMAL = ? and TM1.HreNumAny = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.HreBarCod, TM1.HreBarReo, TM1.HreBarPar, TM1.HreNumCie, TM1.HreLinMAL, TM1.HreNumAny, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L67", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L68", "SELECT PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L69", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMAL = ? AND HreNumAny = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L610", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE ( EmprCod > ? or EmprCod = ? and HreBarCod > ? or HreBarCod = ? and EmprCod = ? and HreBarReo > ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar > ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie > ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreLinMAL > ? or HreLinMAL = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumAny > ? or HreNumAny = ? and HreLinMAL = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00L611", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE ( EmprCod < ? or EmprCod = ? and HreBarCod < ? or HreBarCod = ? and EmprCod = ? and HreBarReo < ? or HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreBarPar < ? or HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumCie < ? or HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreLinMAL < ? or HreLinMAL = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and HreNumAny < ? or HreNumAny = ? and HreLinMAL = ? and HreNumCie = ? and HreBarPar = ? and HreBarReo = ? and HreBarCod = ? and EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, HreBarCod DESC, HreBarReo DESC, HreBarPar DESC, HreNumCie DESC, HreLinMAL DESC, HreNumAny DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00L612", "INSERT INTO TXPHISREA(HreLinMAL, HreNumAny, HrdPrdDsc, HrePrdCFin, HreLanyPrd, HreLanyCan, HreLanyNro, HreLanyTnq, HreLanyUsr, HreLanyFec, HreLanyLot, HreLanyCtd, HreLanyUnd, HreLanyLtF, EmprCod, PrdNum, HreBarCod, HreBarReo, HreBarPar, HreNumCie) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPHISREA")
         ,new UpdateCursor("T00L613", "UPDATE TXPHISREA SET HrdPrdDsc=?, HrePrdCFin=?, HreLanyPrd=?, HreLanyCan=?, HreLanyNro=?, HreLanyTnq=?, HreLanyUsr=?, HreLanyFec=?, HreLanyLot=?, HreLanyCtd=?, HreLanyUnd=?, HreLanyLtF=?  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMAL = ? AND HreNumAny = ? AND PrdNum = ?", GX_NOMASK, "TXPHISREA")
         ,new UpdateCursor("T00L614", "DELETE FROM TXPHISREA  WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? AND HreLinMAL = ? AND HreNumAny = ? AND PrdNum = ?", GX_NOMASK, "TXPHISREA")
         ,new ForEachCursor("T00L615", "SELECT PrdFacCon FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L616", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00L617", "SELECT EmprCod FROM TXPHISREH WHERE EmprCod = ? AND HreBarCod = ? AND HreBarReo = ? AND HreBarPar = ? AND HreNumCie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 3);
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((byte[]) buf[28])[0] = rslt.getByte(18);
               ((String[]) buf[29])[0] = rslt.getString(19, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(20);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(14);
               ((String[]) buf[25])[0] = rslt.getString(15, 3);
               ((String[]) buf[26])[0] = rslt.getString(16, 6);
               ((int[]) buf[27])[0] = rslt.getInt(17);
               ((byte[]) buf[28])[0] = rslt.getByte(18);
               ((String[]) buf[29])[0] = rslt.getString(19, 1);
               ((byte[]) buf[30])[0] = rslt.getByte(20);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(12,3);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDate(14);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,4);
               ((String[]) buf[26])[0] = rslt.getString(16, 3);
               ((String[]) buf[27])[0] = rslt.getString(17, 6);
               ((int[]) buf[28])[0] = rslt.getInt(18);
               ((byte[]) buf[29])[0] = rslt.getByte(19);
               ((String[]) buf[30])[0] = rslt.getString(20, 1);
               ((byte[]) buf[31])[0] = rslt.getByte(21);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 15 :
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
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 6);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 6);
               return;
            case 8 :
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
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setByte(31, ((Number) parms[30]).byteValue());
               stmt.setString(32, (String)parms[31], 1);
               stmt.setByte(33, ((Number) parms[32]).byteValue());
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setString(35, (String)parms[34], 3);
               stmt.setString(36, (String)parms[35], 6);
               return;
            case 9 :
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
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setByte(23, ((Number) parms[22]).byteValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setByte(28, ((Number) parms[27]).byteValue());
               stmt.setByte(29, ((Number) parms[28]).byteValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setByte(31, ((Number) parms[30]).byteValue());
               stmt.setString(32, (String)parms[31], 1);
               stmt.setByte(33, ((Number) parms[32]).byteValue());
               stmt.setInt(34, ((Number) parms[33]).intValue());
               stmt.setString(35, (String)parms[34], 3);
               stmt.setString(36, (String)parms[35], 6);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 26);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 3);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 6);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[15], 8);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[19], 26);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[21], 3);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[23], 1);
               }
               stmt.setDate(14, (java.util.Date)parms[24]);
               stmt.setString(15, (String)parms[25], 3);
               stmt.setString(16, (String)parms[26], 6);
               stmt.setInt(17, ((Number) parms[27]).intValue());
               stmt.setByte(18, ((Number) parms[28]).byteValue());
               stmt.setString(19, (String)parms[29], 1);
               stmt.setByte(20, ((Number) parms[30]).byteValue());
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 26);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 3);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 3);
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
                  stmt.setString(9, (String)parms[17], 26);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 3);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 1);
               }
               stmt.setDate(12, (java.util.Date)parms[22]);
               stmt.setString(13, (String)parms[23], 3);
               stmt.setInt(14, ((Number) parms[24]).intValue());
               stmt.setByte(15, ((Number) parms[25]).byteValue());
               stmt.setString(16, (String)parms[26], 1);
               stmt.setByte(17, ((Number) parms[27]).byteValue());
               stmt.setShort(18, ((Number) parms[28]).shortValue());
               stmt.setByte(19, ((Number) parms[29]).byteValue());
               stmt.setString(20, (String)parms[30], 6);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

